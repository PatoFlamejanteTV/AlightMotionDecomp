package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class DummyTrackOutput implements TrackOutput {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final int sampleData(ExtractorInput extractorInput, int i8, boolean z8) throws IOException, InterruptedException {
        int skip = extractorInput.skip(i8);
        if (skip != -1) {
            return skip;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final void sampleMetadata(long j8, int i8, int i9, int i10, TrackOutput.CryptoData cryptoData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i8) {
        parsableByteArray.skipBytes(i8);
    }
}
