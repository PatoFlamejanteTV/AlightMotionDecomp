package com.mbridge.msdk.playercommon.exoplayer2.decoder;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class DecoderInputBuffer extends Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final CryptoInfo cryptoInfo = new CryptoInfo();
    public ByteBuffer data;
    public long timeUs;

    /* loaded from: classes4.dex */
    public @interface BufferReplacementMode {
    }

    public DecoderInputBuffer(int i8) {
        this.bufferReplacementMode = i8;
    }

    private ByteBuffer createReplacementByteBuffer(int i8) {
        int capacity;
        int i9 = this.bufferReplacementMode;
        if (i9 == 1) {
            return ByteBuffer.allocate(i8);
        }
        if (i9 == 2) {
            return ByteBuffer.allocateDirect(i8);
        }
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i8 + ")");
    }

    public static DecoderInputBuffer newFlagsOnlyInstance() {
        return new DecoderInputBuffer(0);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public void ensureSpaceForWrite(int i8) throws IllegalStateException {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = createReplacementByteBuffer(i8);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.data.position();
        int i9 = i8 + position;
        if (capacity >= i9) {
            return;
        }
        ByteBuffer createReplacementByteBuffer = createReplacementByteBuffer(i9);
        if (position > 0) {
            this.data.position(0);
            this.data.limit(position);
            createReplacementByteBuffer.put(this.data);
        }
        this.data = createReplacementByteBuffer;
    }

    public final void flip() {
        this.data.flip();
    }

    public final boolean isEncrypted() {
        return getFlag(1073741824);
    }

    public final boolean isFlagsOnly() {
        if (this.data == null && this.bufferReplacementMode == 0) {
            return true;
        }
        return false;
    }
}
