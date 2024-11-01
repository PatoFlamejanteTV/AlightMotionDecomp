package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class CeaSubtitle implements Subtitle {
    private final List<Cue> cues;

    public CeaSubtitle(List<Cue> list) {
        this.cues = list;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final List<Cue> getCues(long j8) {
        if (j8 >= 0) {
            return this.cues;
        }
        return Collections.emptyList();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final long getEventTime(int i8) {
        boolean z8;
        if (i8 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j8) {
        return j8 < 0 ? 0 : -1;
    }
}
