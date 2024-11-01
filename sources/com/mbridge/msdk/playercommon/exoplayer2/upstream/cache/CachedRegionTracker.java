package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ChunkIndex;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class CachedRegionTracker implements Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final String TAG = "CachedRegionTracker";
    private final Cache cache;
    private final String cacheKey;
    private final ChunkIndex chunkIndex;
    private final TreeSet<Region> regions = new TreeSet<>();
    private final Region lookupRegion = new Region(0, 0);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class Region implements Comparable<Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long j8, long j9) {
            this.startOffset = j8;
            this.endOffset = j9;
        }

        @Override // java.lang.Comparable
        public int compareTo(Region region) {
            long j8 = this.startOffset;
            long j9 = region.startOffset;
            if (j8 < j9) {
                return -1;
            }
            return j8 == j9 ? 0 : 1;
        }
    }

    public CachedRegionTracker(Cache cache, String str, ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            try {
                Iterator<CacheSpan> descendingIterator = cache.addListener(str, this).descendingIterator();
                while (descendingIterator.hasNext()) {
                    mergeSpan(descendingIterator.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void mergeSpan(CacheSpan cacheSpan) {
        long j8 = cacheSpan.position;
        Region region = new Region(j8, cacheSpan.length + j8);
        Region floor = this.regions.floor(region);
        Region ceiling = this.regions.ceiling(region);
        boolean regionsConnect = regionsConnect(floor, region);
        if (regionsConnect(region, ceiling)) {
            if (regionsConnect) {
                floor.endOffset = ceiling.endOffset;
                floor.endOffsetIndex = ceiling.endOffsetIndex;
            } else {
                region.endOffset = ceiling.endOffset;
                region.endOffsetIndex = ceiling.endOffsetIndex;
                this.regions.add(region);
            }
            this.regions.remove(ceiling);
            return;
        }
        if (regionsConnect) {
            floor.endOffset = region.endOffset;
            int i8 = floor.endOffsetIndex;
            while (true) {
                ChunkIndex chunkIndex = this.chunkIndex;
                if (i8 >= chunkIndex.length - 1) {
                    break;
                }
                int i9 = i8 + 1;
                if (chunkIndex.offsets[i9] > floor.endOffset) {
                    break;
                } else {
                    i8 = i9;
                }
            }
            floor.endOffsetIndex = i8;
            return;
        }
        int binarySearch = Arrays.binarySearch(this.chunkIndex.offsets, region.endOffset);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        region.endOffsetIndex = binarySearch;
        this.regions.add(region);
    }

    private boolean regionsConnect(Region region, Region region2) {
        if (region != null && region2 != null && region.endOffset == region2.startOffset) {
            return true;
        }
        return false;
    }

    public final synchronized int getRegionEndTimeMs(long j8) {
        int i8;
        Region region = this.lookupRegion;
        region.startOffset = j8;
        Region floor = this.regions.floor(region);
        if (floor != null) {
            long j9 = floor.endOffset;
            if (j8 <= j9 && (i8 = floor.endOffsetIndex) != -1) {
                ChunkIndex chunkIndex = this.chunkIndex;
                if (i8 == chunkIndex.length - 1) {
                    if (j9 == chunkIndex.offsets[i8] + chunkIndex.sizes[i8]) {
                        return -2;
                    }
                }
                return (int) ((chunkIndex.timesUs[i8] + ((chunkIndex.durationsUs[i8] * (j9 - chunkIndex.offsets[i8])) / chunkIndex.sizes[i8])) / 1000);
            }
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache.Listener
    public final synchronized void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache.Listener
    public final synchronized void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        long j8 = cacheSpan.position;
        Region region = new Region(j8, cacheSpan.length + j8);
        Region floor = this.regions.floor(region);
        if (floor == null) {
            Log.e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(floor);
        long j9 = floor.startOffset;
        long j10 = region.startOffset;
        if (j9 < j10) {
            Region region2 = new Region(j9, j10);
            int binarySearch = Arrays.binarySearch(this.chunkIndex.offsets, region2.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            region2.endOffsetIndex = binarySearch;
            this.regions.add(region2);
        }
        long j11 = floor.endOffset;
        long j12 = region.endOffset;
        if (j11 > j12) {
            Region region3 = new Region(j12 + 1, j11);
            region3.endOffsetIndex = floor.endOffsetIndex;
            this.regions.add(region3);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache.Listener
    public final void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }

    public final void release() {
        this.cache.removeListener(this.cacheKey, this);
    }
}
