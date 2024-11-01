package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000;
    private static final long MAX_LATENCY_US = 5000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final int PLAYSTATE_PAUSED = 2;
    private static final int PLAYSTATE_PLAYING = 3;
    private static final int PLAYSTATE_STOPPED = 1;
    private AudioTimestampPoller audioTimestampPoller;
    private AudioTrack audioTrack;
    private int bufferSize;
    private long bufferSizeUs;
    private long endPlaybackHeadPosition;
    private long forceResetWorkaroundTimeMs;
    private Method getLatencyMethod;
    private boolean hasData;
    private boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastRawPlaybackHeadPosition;
    private long latencyUs;
    private final Listener listener;
    private boolean needsPassthroughWorkarounds;
    private int nextPlayheadOffsetIndex;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private long passthroughWorkaroundPauseOffset;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onInvalidLatency(long j8);

        void onPositionFramesMismatch(long j8, long j9, long j10, long j11);

        void onSystemTimeUsMismatch(long j8, long j9, long j10, long j11);

        void onUnderrun(int i8, long j8);
    }

    /* loaded from: classes4.dex */
    private @interface PlayState {
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.listener = (Listener) Assertions.checkNotNull(listener);
        if (Util.SDK_INT >= 18) {
            try {
                this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.playheadOffsets = new long[10];
    }

    private boolean forceHasPendingData() {
        if (this.needsPassthroughWorkarounds && this.audioTrack.getPlayState() == 2 && getPlaybackHeadPosition() == 0) {
            return true;
        }
        return false;
    }

    private long framesToDurationUs(long j8) {
        return (j8 * 1000000) / this.outputSampleRate;
    }

    private long getPlaybackHeadPosition() {
        if (this.stopTimestampUs != C.TIME_UNSET) {
            return Math.min(this.endPlaybackHeadPosition, this.stopPlaybackHeadPosition + ((((SystemClock.elapsedRealtime() * 1000) - this.stopTimestampUs) * this.outputSampleRate) / 1000000));
        }
        int playState = this.audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.passthroughWorkaroundPauseOffset = this.lastRawPlaybackHeadPosition;
            }
            playbackHeadPosition += this.passthroughWorkaroundPauseOffset;
        }
        if (Util.SDK_INT <= 28) {
            if (playbackHeadPosition == 0 && this.lastRawPlaybackHeadPosition > 0 && playState == 3) {
                if (this.forceResetWorkaroundTimeMs == C.TIME_UNSET) {
                    this.forceResetWorkaroundTimeMs = SystemClock.elapsedRealtime();
                }
                return this.lastRawPlaybackHeadPosition;
            }
            this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        }
        if (this.lastRawPlaybackHeadPosition > playbackHeadPosition) {
            this.rawPlaybackHeadWrapCount++;
        }
        this.lastRawPlaybackHeadPosition = playbackHeadPosition;
        return playbackHeadPosition + (this.rawPlaybackHeadWrapCount << 32);
    }

    private long getPlaybackHeadPositionUs() {
        return framesToDurationUs(getPlaybackHeadPosition());
    }

    private void maybePollAndCheckTimestamp(long j8, long j9) {
        if (!this.audioTimestampPoller.maybePollTimestamp(j8)) {
            return;
        }
        long timestampSystemTimeUs = this.audioTimestampPoller.getTimestampSystemTimeUs();
        long timestampPositionFrames = this.audioTimestampPoller.getTimestampPositionFrames();
        if (Math.abs(timestampSystemTimeUs - j8) > 5000000) {
            this.listener.onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, j8, j9);
            this.audioTimestampPoller.rejectTimestamp();
        } else if (Math.abs(framesToDurationUs(timestampPositionFrames) - j9) > 5000000) {
            this.listener.onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, j8, j9);
            this.audioTimestampPoller.rejectTimestamp();
        } else {
            this.audioTimestampPoller.acceptTimestamp();
        }
    }

    private void maybeSampleSyncParams() {
        long playbackHeadPositionUs = getPlaybackHeadPositionUs();
        if (playbackHeadPositionUs == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.lastPlayheadSampleTimeUs >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            long[] jArr = this.playheadOffsets;
            int i8 = this.nextPlayheadOffsetIndex;
            jArr[i8] = playbackHeadPositionUs - nanoTime;
            this.nextPlayheadOffsetIndex = (i8 + 1) % 10;
            int i9 = this.playheadOffsetCount;
            if (i9 < 10) {
                this.playheadOffsetCount = i9 + 1;
            }
            this.lastPlayheadSampleTimeUs = nanoTime;
            this.smoothedPlayheadOffsetUs = 0L;
            int i10 = 0;
            while (true) {
                int i11 = this.playheadOffsetCount;
                if (i10 >= i11) {
                    break;
                }
                this.smoothedPlayheadOffsetUs += this.playheadOffsets[i10] / i11;
                i10++;
            }
        }
        if (this.needsPassthroughWorkarounds) {
            return;
        }
        maybePollAndCheckTimestamp(nanoTime, playbackHeadPositionUs);
        maybeUpdateLatency(nanoTime);
    }

    private void maybeUpdateLatency(long j8) {
        Method method;
        if (this.isOutputPcm && (method = this.getLatencyMethod) != null && j8 - this.lastLatencySampleTimeUs >= 500000) {
            try {
                long intValue = (((Integer) method.invoke(this.audioTrack, null)).intValue() * 1000) - this.bufferSizeUs;
                this.latencyUs = intValue;
                long max = Math.max(intValue, 0L);
                this.latencyUs = max;
                if (max > 5000000) {
                    this.listener.onInvalidLatency(max);
                    this.latencyUs = 0L;
                }
            } catch (Exception unused) {
                this.getLatencyMethod = null;
            }
            this.lastLatencySampleTimeUs = j8;
        }
    }

    private static boolean needsPassthroughWorkarounds(int i8) {
        if (Util.SDK_INT < 23 && (i8 == 5 || i8 == 6)) {
            return true;
        }
        return false;
    }

    private void resetSyncParams() {
        this.smoothedPlayheadOffsetUs = 0L;
        this.playheadOffsetCount = 0;
        this.nextPlayheadOffsetIndex = 0;
        this.lastPlayheadSampleTimeUs = 0L;
    }

    public final int getAvailableBufferSize(long j8) {
        return this.bufferSize - ((int) (j8 - (getPlaybackHeadPosition() * this.outputPcmFrameSize)));
    }

    public final long getCurrentPositionUs(boolean z8) {
        long j8;
        if (this.audioTrack.getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long nanoTime = System.nanoTime() / 1000;
        if (this.audioTimestampPoller.hasTimestamp()) {
            long framesToDurationUs = framesToDurationUs(this.audioTimestampPoller.getTimestampPositionFrames());
            if (!this.audioTimestampPoller.isTimestampAdvancing()) {
                return framesToDurationUs;
            }
            return framesToDurationUs + (nanoTime - this.audioTimestampPoller.getTimestampSystemTimeUs());
        }
        if (this.playheadOffsetCount == 0) {
            j8 = getPlaybackHeadPositionUs();
        } else {
            j8 = nanoTime + this.smoothedPlayheadOffsetUs;
        }
        if (!z8) {
            return j8 - this.latencyUs;
        }
        return j8;
    }

    public final void handleEndOfStream(long j8) {
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        this.stopTimestampUs = SystemClock.elapsedRealtime() * 1000;
        this.endPlaybackHeadPosition = j8;
    }

    public final boolean hasPendingData(long j8) {
        if (j8 <= getPlaybackHeadPosition() && !forceHasPendingData()) {
            return false;
        }
        return true;
    }

    public final boolean isPlaying() {
        if (this.audioTrack.getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public final boolean isStalled(long j8) {
        if (this.forceResetWorkaroundTimeMs != C.TIME_UNSET && j8 > 0 && SystemClock.elapsedRealtime() - this.forceResetWorkaroundTimeMs >= FORCE_RESET_WORKAROUND_TIMEOUT_MS) {
            return true;
        }
        return false;
    }

    public final boolean mayHandleBuffer(long j8) {
        Listener listener;
        int playState = this.audioTrack.getPlayState();
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2) {
                this.hasData = false;
                return false;
            }
            if (playState == 1 && getPlaybackHeadPosition() == 0) {
                return false;
            }
        }
        boolean z8 = this.hasData;
        boolean hasPendingData = hasPendingData(j8);
        this.hasData = hasPendingData;
        if (z8 && !hasPendingData && playState != 1 && (listener = this.listener) != null) {
            listener.onUnderrun(this.bufferSize, C.usToMs(this.bufferSizeUs));
        }
        return true;
    }

    public final boolean pause() {
        resetSyncParams();
        if (this.stopTimestampUs == C.TIME_UNSET) {
            this.audioTimestampPoller.reset();
            return true;
        }
        return false;
    }

    public final void reset() {
        resetSyncParams();
        this.audioTrack = null;
        this.audioTimestampPoller = null;
    }

    public final void setAudioTrack(AudioTrack audioTrack, int i8, int i9, int i10) {
        long j8;
        this.audioTrack = audioTrack;
        this.outputPcmFrameSize = i9;
        this.bufferSize = i10;
        this.audioTimestampPoller = new AudioTimestampPoller(audioTrack);
        this.outputSampleRate = audioTrack.getSampleRate();
        this.needsPassthroughWorkarounds = needsPassthroughWorkarounds(i8);
        boolean isEncodingPcm = Util.isEncodingPcm(i8);
        this.isOutputPcm = isEncodingPcm;
        if (isEncodingPcm) {
            j8 = framesToDurationUs(i10 / i9);
        } else {
            j8 = -9223372036854775807L;
        }
        this.bufferSizeUs = j8;
        this.lastRawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.passthroughWorkaroundPauseOffset = 0L;
        this.hasData = false;
        this.stopTimestampUs = C.TIME_UNSET;
        this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        this.latencyUs = 0L;
    }

    public final void start() {
        this.audioTimestampPoller.reset();
    }
}
