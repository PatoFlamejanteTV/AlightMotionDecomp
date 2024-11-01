package androidx.compose.ui.hapticfeedback;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PlatformHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;
    private final View view;

    public PlatformHapticFeedback(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo3539performHapticFeedbackCdsT49E(int i8) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        if (HapticFeedbackType.m3543equalsimpl0(i8, companion.m3547getLongPress5zf0vsI())) {
            this.view.performHapticFeedback(0);
        } else if (HapticFeedbackType.m3543equalsimpl0(i8, companion.m3548getTextHandleMove5zf0vsI())) {
            this.view.performHapticFeedback(9);
        }
    }
}
