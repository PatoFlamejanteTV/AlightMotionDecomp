package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import android.text.Layout;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;

/* loaded from: classes4.dex */
final class Cea708Cue extends Cue implements Comparable<Cea708Cue> {
    public static final int PRIORITY_UNSET = -1;
    public final int priority;

    public Cea708Cue(CharSequence charSequence, Layout.Alignment alignment, float f8, int i8, int i9, float f9, int i10, float f10, boolean z8, int i11, int i12) {
        super(charSequence, alignment, f8, i8, i9, f9, i10, f10, z8, i11);
        this.priority = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Cea708Cue cea708Cue) {
        int i8 = cea708Cue.priority;
        int i9 = this.priority;
        if (i8 < i9) {
            return -1;
        }
        return i8 > i9 ? 1 : 0;
    }
}
