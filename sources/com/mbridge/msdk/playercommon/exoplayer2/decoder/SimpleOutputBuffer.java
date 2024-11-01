package com.mbridge.msdk.playercommon.exoplayer2.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public class SimpleOutputBuffer extends OutputBuffer {
    public ByteBuffer data;
    private final SimpleDecoder<?, SimpleOutputBuffer, ?> owner;

    public SimpleOutputBuffer(SimpleDecoder<?, SimpleOutputBuffer, ?> simpleDecoder) {
        this.owner = simpleDecoder;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j8, int i8) {
        this.timeUs = j8;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            this.data = ByteBuffer.allocateDirect(i8).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i8);
        return this.data;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer
    public void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
