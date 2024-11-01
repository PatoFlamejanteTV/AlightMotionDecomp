package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DefaultExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ContainerMediaChunk extends BaseMediaChunk {
    private volatile int bytesLoaded;
    private final int chunkCount;
    private final ChunkExtractorWrapper extractorWrapper;
    private volatile boolean loadCanceled;
    private volatile boolean loadCompleted;
    private final long sampleOffsetUs;

    public ContainerMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i8, Object obj, long j8, long j9, long j10, long j11, int i9, long j12, ChunkExtractorWrapper chunkExtractorWrapper) {
        super(dataSource, dataSpec, format, i8, obj, j8, j9, j10, j11);
        this.chunkCount = i9;
        this.sampleOffsetUs = j12;
        this.extractorWrapper = chunkExtractorWrapper;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.Chunk
    public final long bytesLoaded() {
        return this.bytesLoaded;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + this.chunkCount;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void load() throws IOException, InterruptedException {
        long j8;
        DataSpec subrange = this.dataSpec.subrange(this.bytesLoaded);
        try {
            DataSource dataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, subrange.absoluteStreamPosition, dataSource.open(subrange));
            if (this.bytesLoaded == 0) {
                BaseMediaChunkOutput output = getOutput();
                output.setSampleOffsetUs(this.sampleOffsetUs);
                ChunkExtractorWrapper chunkExtractorWrapper = this.extractorWrapper;
                long j9 = this.seekTimeUs;
                if (j9 == C.TIME_UNSET) {
                    j8 = 0;
                } else {
                    j8 = j9 - this.sampleOffsetUs;
                }
                chunkExtractorWrapper.init(output, j8);
            }
            try {
                Extractor extractor = this.extractorWrapper.extractor;
                boolean z8 = false;
                int i8 = 0;
                while (i8 == 0 && !this.loadCanceled) {
                    i8 = extractor.read(defaultExtractorInput, null);
                }
                if (i8 != 1) {
                    z8 = true;
                }
                Assertions.checkState(z8);
                this.bytesLoaded = (int) (defaultExtractorInput.getPosition() - this.dataSpec.absoluteStreamPosition);
                Util.closeQuietly(this.dataSource);
                this.loadCompleted = true;
            } catch (Throwable th) {
                this.bytesLoaded = (int) (defaultExtractorInput.getPosition() - this.dataSpec.absoluteStreamPosition);
                throw th;
            }
        } catch (Throwable th2) {
            Util.closeQuietly(this.dataSource);
            throw th2;
        }
    }
}
