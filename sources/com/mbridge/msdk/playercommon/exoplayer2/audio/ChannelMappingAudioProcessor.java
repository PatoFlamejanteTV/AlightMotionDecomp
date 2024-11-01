package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class ChannelMappingAudioProcessor implements AudioProcessor {
    private boolean active;
    private ByteBuffer buffer;
    private int channelCount;
    private boolean inputEnded;
    private ByteBuffer outputBuffer;
    private int[] outputChannels;
    private int[] pendingOutputChannels;
    private int sampleRateHz;

    public ChannelMappingAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        this.channelCount = -1;
        this.sampleRateHz = -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean configure(int i8, int i9, int i10) throws AudioProcessor.UnhandledFormatException {
        boolean z8;
        boolean z9;
        boolean z10 = !Arrays.equals(this.pendingOutputChannels, this.outputChannels);
        int[] iArr = this.pendingOutputChannels;
        this.outputChannels = iArr;
        if (iArr == null) {
            this.active = false;
            return z10;
        }
        if (i10 == 2) {
            if (!z10 && this.sampleRateHz == i8 && this.channelCount == i9) {
                return false;
            }
            this.sampleRateHz = i8;
            this.channelCount = i9;
            if (i9 != iArr.length) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.active = z8;
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.outputChannels;
                if (i11 >= iArr2.length) {
                    return true;
                }
                int i12 = iArr2[i11];
                if (i12 < i9) {
                    boolean z11 = this.active;
                    if (i12 != i11) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.active = z9 | z11;
                    i11++;
                } else {
                    throw new AudioProcessor.UnhandledFormatException(i8, i9, i10);
                }
            }
        } else {
            throw new AudioProcessor.UnhandledFormatException(i8, i9, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputEnded = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputChannelCount() {
        int[] iArr = this.outputChannels;
        if (iArr == null) {
            return this.channelCount;
        }
        return iArr.length;
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
        return this.active;
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
        boolean z8;
        if (this.outputChannels != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.channelCount * 2)) * this.outputChannels.length * 2;
        if (this.buffer.capacity() < length) {
            this.buffer = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        while (position < limit) {
            for (int i8 : this.outputChannels) {
                this.buffer.putShort(byteBuffer.getShort((i8 * 2) + position));
            }
            position += this.channelCount * 2;
        }
        byteBuffer.position(limit);
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.buffer = AudioProcessor.EMPTY_BUFFER;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.outputChannels = null;
        this.pendingOutputChannels = null;
        this.active = false;
    }

    public final void setChannelMap(int[] iArr) {
        this.pendingOutputChannels = iArr;
    }
}
