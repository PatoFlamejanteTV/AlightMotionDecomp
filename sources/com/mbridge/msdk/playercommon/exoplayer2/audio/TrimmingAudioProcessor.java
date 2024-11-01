package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
final class TrimmingAudioProcessor implements AudioProcessor {
    private ByteBuffer buffer;
    private int channelCount;
    private byte[] endBuffer;
    private int endBufferSize;
    private boolean inputEnded;
    private boolean isActive;
    private ByteBuffer outputBuffer;
    private int pendingTrimStartBytes;
    private int sampleRateHz;
    private int trimEndFrames;
    private int trimStartFrames;

    public TrimmingAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.endBuffer = new byte[0];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean configure(int i8, int i9, int i10) throws AudioProcessor.UnhandledFormatException {
        boolean z8;
        if (i10 == 2) {
            this.channelCount = i9;
            this.sampleRateHz = i8;
            int i11 = this.trimEndFrames;
            this.endBuffer = new byte[i11 * i9 * 2];
            this.endBufferSize = 0;
            int i12 = this.trimStartFrames;
            this.pendingTrimStartBytes = i9 * i12 * 2;
            boolean z9 = this.isActive;
            if (i12 == 0 && i11 == 0) {
                z8 = false;
            } else {
                z8 = true;
            }
            this.isActive = z8;
            if (z9 == z8) {
                return false;
            }
            return true;
        }
        throw new AudioProcessor.UnhandledFormatException(i8, i9, i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputEnded = false;
        this.pendingTrimStartBytes = 0;
        this.endBufferSize = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputChannelCount() {
        return this.channelCount;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputEncoding() {
        return 2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputSampleRateHz() {
        return this.sampleRateHz;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.isActive;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        if (this.inputEnded && this.outputBuffer == AudioProcessor.EMPTY_BUFFER) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        int min = Math.min(i8, this.pendingTrimStartBytes);
        this.pendingTrimStartBytes -= min;
        byteBuffer.position(position + min);
        if (this.pendingTrimStartBytes > 0) {
            return;
        }
        int i9 = i8 - min;
        int length = (this.endBufferSize + i9) - this.endBuffer.length;
        if (this.buffer.capacity() < length) {
            this.buffer = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        int constrainValue = Util.constrainValue(length, 0, this.endBufferSize);
        this.buffer.put(this.endBuffer, 0, constrainValue);
        int constrainValue2 = Util.constrainValue(length - constrainValue, 0, i9);
        byteBuffer.limit(byteBuffer.position() + constrainValue2);
        this.buffer.put(byteBuffer);
        byteBuffer.limit(limit);
        int i10 = i9 - constrainValue2;
        int i11 = this.endBufferSize - constrainValue;
        this.endBufferSize = i11;
        byte[] bArr = this.endBuffer;
        System.arraycopy(bArr, constrainValue, bArr, 0, i11);
        byteBuffer.get(this.endBuffer, this.endBufferSize, i10);
        this.endBufferSize += i10;
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.buffer = AudioProcessor.EMPTY_BUFFER;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.endBuffer = new byte[0];
    }

    public final void setTrimFrameCount(int i8, int i9) {
        this.trimStartFrames = i8;
        this.trimEndFrames = i9;
    }
}
