package androidx.window.layout;

import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(28)
/* loaded from: classes3.dex */
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetBottom(DisplayCutout displayCutout) {
        int safeInsetBottom;
        AbstractC3292y.i(displayCutout, "displayCutout");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    public final int safeInsetLeft(DisplayCutout displayCutout) {
        int safeInsetLeft;
        AbstractC3292y.i(displayCutout, "displayCutout");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int safeInsetRight(DisplayCutout displayCutout) {
        int safeInsetRight;
        AbstractC3292y.i(displayCutout, "displayCutout");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public final int safeInsetTop(DisplayCutout displayCutout) {
        int safeInsetTop;
        AbstractC3292y.i(displayCutout, "displayCutout");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}
