package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.List;

/* loaded from: classes4.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.75f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    public static final long DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 2000;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private final long minTimeBetweenBufferReevaluationMs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    /* loaded from: classes4.dex */
    public static final class Factory implements TrackSelection.Factory {
        private final float bandwidthFraction;
        private final BandwidthMeter bandwidthMeter;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;
        private final long minTimeBetweenBufferReevaluationMs;

        public Factory(BandwidthMeter bandwidthMeter) {
            this(bandwidthMeter, 10000, 25000, 25000, 0.75f, 0.75f, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, Clock.DEFAULT);
        }

        public Factory(BandwidthMeter bandwidthMeter, int i8, int i9, int i10, float f8) {
            this(bandwidthMeter, i8, i9, i10, f8, 0.75f, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, Clock.DEFAULT);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection.Factory
        public final AdaptiveTrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr) {
            return new AdaptiveTrackSelection(trackGroup, iArr, this.bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, this.minTimeBetweenBufferReevaluationMs, this.clock);
        }

        public Factory(BandwidthMeter bandwidthMeter, int i8, int i9, int i10, float f8, float f9, long j8, Clock clock) {
            this.bandwidthMeter = bandwidthMeter;
            this.minDurationForQualityIncreaseMs = i8;
            this.maxDurationForQualityDecreaseMs = i9;
            this.minDurationToRetainAfterDiscardMs = i10;
            this.bandwidthFraction = f8;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f9;
            this.minTimeBetweenBufferReevaluationMs = j8;
            this.clock = clock;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, bandwidthMeter, WorkRequest.MIN_BACKOFF_MILLIS, 25000L, 25000L, 0.75f, 0.75f, DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, Clock.DEFAULT);
    }

    private int determineIdealSelectedIndex(long j8) {
        long bitrateEstimate = ((float) this.bandwidthMeter.getBitrateEstimate()) * this.bandwidthFraction;
        int i8 = 0;
        for (int i9 = 0; i9 < this.length; i9++) {
            if (j8 == Long.MIN_VALUE || !isBlacklisted(i9, j8)) {
                if (Math.round(getFormat(i9).bitrate * this.playbackSpeed) <= bitrateEstimate) {
                    return i9;
                }
                i8 = i9;
            }
        }
        return i8;
    }

    private long minDurationForQualityIncreaseUs(long j8) {
        if (j8 != C.TIME_UNSET && j8 <= this.minDurationForQualityIncreaseUs) {
            return ((float) j8) * this.bufferedFractionToLiveEdgeForQualityIncrease;
        }
        return this.minDurationForQualityIncreaseUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.BaseTrackSelection, com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void enable() {
        this.lastBufferEvaluationMs = C.TIME_UNSET;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.BaseTrackSelection, com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int evaluateQueueSize(long j8, List<? extends MediaChunk> list) {
        int i8;
        int i9;
        long elapsedRealtime = this.clock.elapsedRealtime();
        long j9 = this.lastBufferEvaluationMs;
        if (j9 != C.TIME_UNSET && elapsedRealtime - j9 < this.minTimeBetweenBufferReevaluationMs) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j8, this.playbackSpeed) < this.minDurationToRetainAfterDiscardUs) {
            return size;
        }
        Format format = getFormat(determineIdealSelectedIndex(elapsedRealtime));
        for (int i10 = 0; i10 < size; i10++) {
            MediaChunk mediaChunk = list.get(i10);
            Format format2 = mediaChunk.trackFormat;
            if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j8, this.playbackSpeed) >= this.minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i8 = format2.height) != -1 && i8 < 720 && (i9 = format2.width) != -1 && i9 < 1280 && i8 < format.height) {
                return i10;
            }
        }
        return size;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public Object getSelectionData() {
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.BaseTrackSelection, com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void onPlaybackSpeed(float f8) {
        this.playbackSpeed = f8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void updateSelectedTrack(long j8, long j9, long j10) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        int i8 = this.selectedIndex;
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime);
        this.selectedIndex = determineIdealSelectedIndex;
        if (determineIdealSelectedIndex == i8) {
            return;
        }
        if (!isBlacklisted(i8, elapsedRealtime)) {
            Format format = getFormat(i8);
            Format format2 = getFormat(this.selectedIndex);
            if (format2.bitrate > format.bitrate && j9 < minDurationForQualityIncreaseUs(j10)) {
                this.selectedIndex = i8;
            } else if (format2.bitrate < format.bitrate && j9 >= this.maxDurationForQualityDecreaseUs) {
                this.selectedIndex = i8;
            }
        }
        if (this.selectedIndex != i8) {
            this.reason = 3;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, long j8, long j9, long j10, float f8, float f9, long j11, Clock clock) {
        super(trackGroup, iArr);
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j8 * 1000;
        this.maxDurationForQualityDecreaseUs = j9 * 1000;
        this.minDurationToRetainAfterDiscardUs = j10 * 1000;
        this.bandwidthFraction = f8;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f9;
        this.minTimeBetweenBufferReevaluationMs = j11;
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 1;
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.selectedIndex = determineIdealSelectedIndex(Long.MIN_VALUE);
    }
}
