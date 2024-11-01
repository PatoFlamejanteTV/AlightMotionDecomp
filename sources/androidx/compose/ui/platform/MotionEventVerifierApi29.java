package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes.dex */
final class MotionEventVerifierApi29 {
    public static final MotionEventVerifierApi29 INSTANCE = new MotionEventVerifierApi29();

    private MotionEventVerifierApi29() {
    }

    @DoNotInline
    public final boolean isValidMotionEvent(MotionEvent motionEvent, int i8) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i8);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            rawY = motionEvent.getRawY(i8);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
