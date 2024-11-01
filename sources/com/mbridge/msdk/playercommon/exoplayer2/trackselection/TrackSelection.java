package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk;
import java.util.List;

/* loaded from: classes4.dex */
public interface TrackSelection {

    /* loaded from: classes4.dex */
    public interface Factory {
        TrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr);
    }

    boolean blacklist(int i8, long j8);

    void disable();

    void enable();

    int evaluateQueueSize(long j8, List<? extends MediaChunk> list);

    Format getFormat(int i8);

    int getIndexInTrackGroup(int i8);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    TrackGroup getTrackGroup();

    int indexOf(int i8);

    int indexOf(Format format);

    int length();

    void onPlaybackSpeed(float f8);

    void updateSelectedTrack(long j8, long j9, long j10);
}
