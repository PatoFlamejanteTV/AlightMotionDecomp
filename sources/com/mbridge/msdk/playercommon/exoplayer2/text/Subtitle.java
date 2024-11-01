package com.mbridge.msdk.playercommon.exoplayer2.text;

import java.util.List;

/* loaded from: classes4.dex */
public interface Subtitle {
    List<Cue> getCues(long j8);

    long getEventTime(int i8);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j8);
}
