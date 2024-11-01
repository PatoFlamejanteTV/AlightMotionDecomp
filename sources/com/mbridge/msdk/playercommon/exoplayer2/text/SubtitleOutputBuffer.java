package com.mbridge.msdk.playercommon.exoplayer2.text;

import com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class SubtitleOutputBuffer extends OutputBuffer implements Subtitle {
    private long subsampleOffsetUs;
    private Subtitle subtitle;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j8) {
        return this.subtitle.getCues(j8 - this.subsampleOffsetUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public long getEventTime(int i8) {
        return this.subtitle.getEventTime(i8) + this.subsampleOffsetUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.subtitle.getEventTimeCount();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j8) {
        return this.subtitle.getNextEventTimeIndex(j8 - this.subsampleOffsetUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer
    public abstract void release();

    public void setContent(long j8, Subtitle subtitle, long j9) {
        this.timeUs = j8;
        this.subtitle = subtitle;
        if (j9 != Long.MAX_VALUE) {
            j8 = j9;
        }
        this.subsampleOffsetUs = j8;
    }
}
