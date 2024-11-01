package com.mbridge.msdk.playercommon.exoplayer2.text.pgs;

import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import java.util.List;

/* loaded from: classes4.dex */
final class PgsSubtitle implements Subtitle {
    private final List<Cue> cues;

    public PgsSubtitle(List<Cue> list) {
        this.cues = list;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final List<Cue> getCues(long j8) {
        return this.cues;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final long getEventTime(int i8) {
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j8) {
        return -1;
    }
}
