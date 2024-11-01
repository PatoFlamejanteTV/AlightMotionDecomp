package com.mbridge.msdk.playercommon.exoplayer2.text;

/* loaded from: classes4.dex */
final class SimpleSubtitleOutputBuffer extends SubtitleOutputBuffer {
    private final SimpleSubtitleDecoder owner;

    public SimpleSubtitleOutputBuffer(SimpleSubtitleDecoder simpleSubtitleDecoder) {
        this.owner = simpleSubtitleDecoder;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleOutputBuffer, com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer
    public final void release() {
        this.owner.releaseOutputBuffer((SubtitleOutputBuffer) this);
    }
}
