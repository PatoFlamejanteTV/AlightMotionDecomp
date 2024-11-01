package androidx.activity;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z8, boolean z9) {
        AbstractC3292y.i(statusBarStyle, "statusBarStyle");
        AbstractC3292y.i(navigationBarStyle, "navigationBarStyle");
        AbstractC3292y.i(window, "window");
        AbstractC3292y.i(view, "view");
    }
}
