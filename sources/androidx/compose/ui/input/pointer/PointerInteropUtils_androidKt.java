package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class PointerInteropUtils_androidKt {
    public static final void emptyCancelMotionEventScope(long j8, Function1 function1) {
        MotionEvent obtain = MotionEvent.obtain(j8, j8, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        function1.invoke(obtain);
        obtain.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j8, function1);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m4041toCancelMotionEventScoped4ec7I(PointerEvent pointerEvent, long j8, Function1 function1) {
        m4043toMotionEventScopeubNVwUQ(pointerEvent, j8, function1, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m4042toMotionEventScoped4ec7I(PointerEvent pointerEvent, long j8, Function1 function1) {
        m4043toMotionEventScopeubNVwUQ(pointerEvent, j8, function1, false);
    }

    /* renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m4043toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j8, Function1 function1, boolean z8) {
        MotionEvent motionEvent$ui_release = pointerEvent.getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int action = motionEvent$ui_release.getAction();
            if (z8) {
                motionEvent$ui_release.setAction(3);
            }
            motionEvent$ui_release.offsetLocation(-Offset.m2712getXimpl(j8), -Offset.m2713getYimpl(j8));
            function1.invoke(motionEvent$ui_release);
            motionEvent$ui_release.offsetLocation(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8));
            motionEvent$ui_release.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
