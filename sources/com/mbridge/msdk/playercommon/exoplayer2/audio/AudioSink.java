package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;

    /* loaded from: classes4.dex */
    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th) {
            super(th);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    /* loaded from: classes4.dex */
    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        public InitializationException(int i8, int i9, int i10, int i11) {
            super("AudioTrack init failed: " + i8 + ", Config(" + i9 + ", " + i10 + ", " + i11 + ")");
            this.audioTrackState = i8;
        }
    }

    /* loaded from: classes4.dex */
    public interface Listener {
        void onAudioSessionId(int i8);

        void onPositionDiscontinuity();

        void onUnderrun(int i8, long j8, long j9);
    }

    /* loaded from: classes4.dex */
    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i8) {
            super("AudioTrack write failed: " + i8);
            this.errorCode = i8;
        }
    }

    void configure(int i8, int i9, int i10, int i11, int[] iArr, int i12, int i13) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21(int i8);

    long getCurrentPositionUs(boolean z8);

    PlaybackParameters getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j8) throws InitializationException, WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEncodingSupported(int i8);

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void release();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i8);

    void setListener(Listener listener);

    PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters);

    void setVolume(float f8);
}
