package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseTrackSelection implements TrackSelection {
    private final long[] blacklistUntilTimes;
    private final Format[] formats;
    protected final TrackGroup group;
    private int hashCode;
    protected final int length;
    protected final int[] tracks;

    /* loaded from: classes4.dex */
    private static final class DecreasingBandwidthComparator implements Comparator<Format> {
        private DecreasingBandwidthComparator() {
        }

        @Override // java.util.Comparator
        public final int compare(Format format, Format format2) {
            return format2.bitrate - format.bitrate;
        }
    }

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        boolean z8;
        int i8 = 0;
        if (iArr.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.group = (TrackGroup) Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.length = length;
        this.formats = new Format[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.formats[i9] = trackGroup.getFormat(iArr[i9]);
        }
        Arrays.sort(this.formats, new DecreasingBandwidthComparator());
        this.tracks = new int[this.length];
        while (true) {
            int i10 = this.length;
            if (i8 < i10) {
                this.tracks[i8] = trackGroup.indexOf(this.formats[i8]);
                i8++;
            } else {
                this.blacklistUntilTimes = new long[i10];
                return;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final boolean blacklist(int i8, long j8) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isBlacklisted = isBlacklisted(i8, elapsedRealtime);
        for (int i9 = 0; i9 < this.length && !isBlacklisted; i9++) {
            if (i9 != i8 && !isBlacklisted(i9, elapsedRealtime)) {
                isBlacklisted = true;
            } else {
                isBlacklisted = false;
            }
        }
        if (!isBlacklisted) {
            return false;
        }
        long[] jArr = this.blacklistUntilTimes;
        jArr[i8] = Math.max(jArr[i8], elapsedRealtime + j8);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void disable() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        if (this.group == baseTrackSelection.group && Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int evaluateQueueSize(long j8, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int i8) {
        return this.formats[i8];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i8) {
        return this.tracks[i8];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (System.identityHashCode(this.group) * 31) + Arrays.hashCode(this.tracks);
        }
        return this.hashCode;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i8 = 0; i8 < this.length; i8++) {
            if (this.formats[i8] == format) {
                return i8;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isBlacklisted(int i8, long j8) {
        if (this.blacklistUntilTimes[i8] > j8) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void onPlaybackSpeed(float f8) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int i8) {
        for (int i9 = 0; i9 < this.length; i9++) {
            if (this.tracks[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }
}
