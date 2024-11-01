package com.mbridge.msdk.playercommon.exoplayer2.extractor;

/* loaded from: classes4.dex */
public interface ExtractorOutput {
    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i8, int i9);
}
