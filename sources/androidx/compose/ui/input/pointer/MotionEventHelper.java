package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.OffsetKt;

@RequiresApi(29)
/* loaded from: classes.dex */
final class MotionEventHelper {
    public static final MotionEventHelper INSTANCE = new MotionEventHelper();

    private MotionEventHelper() {
    }

    @DoNotInline
    /* renamed from: toRawOffset-dBAh8RU, reason: not valid java name */
    public final long m3924toRawOffsetdBAh8RU(MotionEvent motionEvent, int i8) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i8);
        rawY = motionEvent.getRawY(i8);
        return OffsetKt.Offset(rawX, rawY);
    }
}
