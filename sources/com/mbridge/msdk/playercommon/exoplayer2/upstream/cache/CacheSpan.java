package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;

/* loaded from: classes4.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastAccessTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j8, long j9) {
        this(str, j8, j9, C.TIME_UNSET, null);
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        if (this.length == -1) {
            return true;
        }
        return false;
    }

    public CacheSpan(String str, long j8, long j9, long j10, File file) {
        this.key = str;
        this.position = j8;
        this.length = j9;
        this.isCached = file != null;
        this.file = file;
        this.lastAccessTimestamp = j10;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j8 = this.position - cacheSpan.position;
        if (j8 == 0) {
            return 0;
        }
        return j8 < 0 ? -1 : 1;
    }
}
