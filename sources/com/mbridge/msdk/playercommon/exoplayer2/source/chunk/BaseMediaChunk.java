package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;

/* loaded from: classes4.dex */
public abstract class BaseMediaChunk extends MediaChunk {
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;
    public final long seekTimeUs;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i8, Object obj, long j8, long j9, long j10, long j11) {
        super(dataSource, dataSpec, format, i8, obj, j8, j9, j11);
        this.seekTimeUs = j10;
    }

    public final int getFirstSampleIndex(int i8) {
        return this.firstSampleIndices[i8];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BaseMediaChunkOutput getOutput() {
        return this.output;
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
