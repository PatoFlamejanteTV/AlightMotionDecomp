package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface SampleStream {
    boolean isReady();

    void maybeThrowError() throws IOException;

    int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8);

    int skipData(long j8);
}
