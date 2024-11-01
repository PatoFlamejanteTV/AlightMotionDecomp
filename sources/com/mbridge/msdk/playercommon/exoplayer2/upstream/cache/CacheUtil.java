package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class CacheUtil {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;

    /* loaded from: classes4.dex */
    public static class CachingCounters {
        public volatile long alreadyCachedBytes;
        public volatile long contentLength = -1;
        public volatile long newlyCachedBytes;

        public long totalCachedBytes() {
            return this.alreadyCachedBytes + this.newlyCachedBytes;
        }
    }

    private CacheUtil() {
    }

    public static void cache(DataSpec dataSpec, Cache cache, DataSource dataSource, CachingCounters cachingCounters, AtomicBoolean atomicBoolean) throws IOException, InterruptedException {
        cache(dataSpec, cache, new CacheDataSource(cache, dataSource), new byte[131072], null, 0, cachingCounters, atomicBoolean, false);
    }

    public static String generateKey(Uri uri) {
        return uri.toString();
    }

    public static void getCached(DataSpec dataSpec, Cache cache, CachingCounters cachingCounters) {
        long j8;
        String key = getKey(dataSpec);
        long j9 = dataSpec.absoluteStreamPosition;
        long j10 = dataSpec.length;
        if (j10 == -1) {
            j10 = cache.getContentLength(key);
        }
        cachingCounters.contentLength = j10;
        cachingCounters.alreadyCachedBytes = 0L;
        cachingCounters.newlyCachedBytes = 0L;
        long j11 = j9;
        long j12 = j10;
        while (j12 != 0) {
            if (j12 != -1) {
                j8 = j12;
            } else {
                j8 = Long.MAX_VALUE;
            }
            long cachedLength = cache.getCachedLength(key, j11, j8);
            if (cachedLength > 0) {
                cachingCounters.alreadyCachedBytes += cachedLength;
            } else {
                cachedLength = -cachedLength;
                if (cachedLength == Long.MAX_VALUE) {
                    return;
                }
            }
            j11 += cachedLength;
            if (j12 == -1) {
                cachedLength = 0;
            }
            j12 -= cachedLength;
        }
    }

    public static String getKey(DataSpec dataSpec) {
        String str = dataSpec.key;
        if (str == null) {
            return generateKey(dataSpec.uri);
        }
        return str;
    }

    private static long readAndDiscard(DataSpec dataSpec, long j8, long j9, DataSource dataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i8, CachingCounters cachingCounters) throws IOException, InterruptedException {
        int length;
        DataSpec dataSpec2 = dataSpec;
        while (true) {
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(i8);
            }
            try {
                try {
                    if (!Thread.interrupted()) {
                        DataSpec dataSpec3 = new DataSpec(dataSpec2.uri, dataSpec2.postBody, j8, (dataSpec2.position + j8) - dataSpec2.absoluteStreamPosition, -1L, dataSpec2.key, dataSpec2.flags | 2);
                        try {
                            long open = dataSource.open(dataSpec3);
                            if (cachingCounters.contentLength == -1 && open != -1) {
                                cachingCounters.contentLength = dataSpec3.absoluteStreamPosition + open;
                            }
                            long j10 = 0;
                            while (true) {
                                if (j10 == j9) {
                                    break;
                                }
                                if (!Thread.interrupted()) {
                                    if (j9 != -1) {
                                        length = (int) Math.min(bArr.length, j9 - j10);
                                    } else {
                                        length = bArr.length;
                                    }
                                    int read = dataSource.read(bArr, 0, length);
                                    if (read == -1) {
                                        if (cachingCounters.contentLength == -1) {
                                            cachingCounters.contentLength = dataSpec3.absoluteStreamPosition + j10;
                                        }
                                    } else {
                                        long j11 = read;
                                        j10 += j11;
                                        cachingCounters.newlyCachedBytes += j11;
                                    }
                                } else {
                                    throw new InterruptedException();
                                }
                            }
                            Util.closeQuietly(dataSource);
                            return j10;
                        } catch (PriorityTaskManager.PriorityTooLowException unused) {
                            dataSpec2 = dataSpec3;
                        }
                    } else {
                        throw new InterruptedException();
                        break;
                    }
                } catch (PriorityTaskManager.PriorityTooLowException unused2) {
                }
                Util.closeQuietly(dataSource);
            } catch (Throwable th) {
                Util.closeQuietly(dataSource);
                throw th;
            }
        }
    }

    public static void remove(Cache cache, String str) {
        Iterator<CacheSpan> it = cache.getCachedSpans(str).iterator();
        while (it.hasNext()) {
            try {
                cache.removeSpan(it.next());
            } catch (Cache.CacheException unused) {
            }
        }
    }

    public static void cache(DataSpec dataSpec, Cache cache, CacheDataSource cacheDataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i8, CachingCounters cachingCounters, AtomicBoolean atomicBoolean, boolean z8) throws IOException, InterruptedException {
        CachingCounters cachingCounters2 = cachingCounters;
        Assertions.checkNotNull(cacheDataSource);
        Assertions.checkNotNull(bArr);
        if (cachingCounters2 != null) {
            getCached(dataSpec, cache, cachingCounters2);
        } else {
            cachingCounters2 = new CachingCounters();
        }
        CachingCounters cachingCounters3 = cachingCounters2;
        String key = getKey(dataSpec);
        long j8 = dataSpec.absoluteStreamPosition;
        long j9 = dataSpec.length;
        if (j9 == -1) {
            j9 = cache.getContentLength(key);
        }
        long j10 = j8;
        long j11 = j9;
        while (true) {
            long j12 = 0;
            if (j11 == 0) {
                return;
            }
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long cachedLength = cache.getCachedLength(key, j10, j11 != -1 ? j11 : Long.MAX_VALUE);
            if (cachedLength <= 0) {
                long j13 = -cachedLength;
                if (readAndDiscard(dataSpec, j10, j13, cacheDataSource, bArr, priorityTaskManager, i8, cachingCounters3) < j13) {
                    if (z8 && j11 != -1) {
                        throw new EOFException();
                    }
                    return;
                }
                cachedLength = j13;
            }
            j10 += cachedLength;
            if (j11 != -1) {
                j12 = cachedLength;
            }
            j11 -= j12;
        }
    }
}
