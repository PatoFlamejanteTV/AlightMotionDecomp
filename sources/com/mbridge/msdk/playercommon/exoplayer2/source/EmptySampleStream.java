package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class EmptySampleStream implements SampleStream {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public final boolean isReady() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public final void maybeThrowError() throws IOException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8) {
        decoderInputBuffer.setFlags(4);
        return -4;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public final int skipData(long j8) {
        return 0;
    }
}
