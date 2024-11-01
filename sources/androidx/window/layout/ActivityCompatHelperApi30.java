package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(30)
/* loaded from: classes3.dex */
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        android.view.WindowMetrics currentWindowMetrics;
        Rect bounds;
        AbstractC3292y.i(activity, "activity");
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        AbstractC3292y.h(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        android.view.WindowMetrics maximumWindowMetrics;
        Rect bounds;
        AbstractC3292y.i(activity, "activity");
        maximumWindowMetrics = activity.getWindowManager().getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        AbstractC3292y.h(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
