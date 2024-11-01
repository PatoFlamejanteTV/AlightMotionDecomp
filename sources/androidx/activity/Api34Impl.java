package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(34)
/* loaded from: classes.dex */
public final class Api34Impl {
    public static final Api34Impl INSTANCE = new Api34Impl();

    private Api34Impl() {
    }

    @DoNotInline
    public final BackEvent createOnBackEvent(float f8, float f9, float f10, int i8) {
        return new BackEvent(f8, f9, f10, i8);
    }

    @DoNotInline
    public final float progress(BackEvent backEvent) {
        AbstractC3292y.i(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @DoNotInline
    public final int swipeEdge(BackEvent backEvent) {
        AbstractC3292y.i(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @DoNotInline
    public final float touchX(BackEvent backEvent) {
        AbstractC3292y.i(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @DoNotInline
    public final float touchY(BackEvent backEvent) {
        AbstractC3292y.i(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
