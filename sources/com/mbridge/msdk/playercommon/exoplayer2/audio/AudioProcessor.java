package com.mbridge.msdk.playercommon.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes4.dex */
    public static final class UnhandledFormatException extends Exception {
        public UnhandledFormatException(int i8, int i9, int i10) {
            super("Unhandled format: " + i8 + " Hz, " + i9 + " channels in encoding " + i10);
        }
    }

    boolean configure(int i8, int i9, int i10) throws UnhandledFormatException;

    void flush();

    ByteBuffer getOutput();

    int getOutputChannelCount();

    int getOutputEncoding();

    int getOutputSampleRateHz();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
