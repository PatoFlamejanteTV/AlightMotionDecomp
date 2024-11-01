package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public final class FixedTrackSelection extends BaseTrackSelection {
    private final Object data;
    private final int reason;

    /* loaded from: classes4.dex */
    public static final class Factory implements TrackSelection.Factory {
        private final Object data;
        private final int reason;

        public Factory() {
            this.reason = 0;
            this.data = null;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection.Factory
        public final FixedTrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr) {
            Assertions.checkArgument(iArr.length == 1);
            return new FixedTrackSelection(trackGroup, iArr[0], this.reason, this.data);
        }

        public Factory(int i8, Object obj) {
            this.reason = i8;
            this.data = obj;
        }
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i8) {
        this(trackGroup, i8, 0, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int getSelectedIndex() {
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final Object getSelectionData() {
        return this.data;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int getSelectionReason() {
        return this.reason;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final void updateSelectedTrack(long j8, long j9, long j10) {
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i8, int i9, Object obj) {
        super(trackGroup, i8);
        this.reason = i9;
        this.data = obj;
    }
}
