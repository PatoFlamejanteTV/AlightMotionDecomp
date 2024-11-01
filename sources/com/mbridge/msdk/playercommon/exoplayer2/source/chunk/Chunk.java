package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public abstract class Chunk implements Loader.Loadable {
    protected final DataSource dataSource;
    public final DataSpec dataSpec;
    public final long endTimeUs;
    public final long startTimeUs;
    public final Format trackFormat;
    public final Object trackSelectionData;
    public final int trackSelectionReason;
    public final int type;

    public Chunk(DataSource dataSource, DataSpec dataSpec, int i8, Format format, int i9, Object obj, long j8, long j9) {
        this.dataSource = (DataSource) Assertions.checkNotNull(dataSource);
        this.dataSpec = (DataSpec) Assertions.checkNotNull(dataSpec);
        this.type = i8;
        this.trackFormat = format;
        this.trackSelectionReason = i9;
        this.trackSelectionData = obj;
        this.startTimeUs = j8;
        this.endTimeUs = j9;
    }

    public abstract long bytesLoaded();

    public final long getDurationUs() {
        return this.endTimeUs - this.startTimeUs;
    }
}
