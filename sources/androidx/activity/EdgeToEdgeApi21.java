package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(21)
/* loaded from: classes.dex */
final class EdgeToEdgeApi21 implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z8, boolean z9) {
        AbstractC3292y.i(statusBarStyle, "statusBarStyle");
        AbstractC3292y.i(navigationBarStyle, "navigationBarStyle");
        AbstractC3292y.i(window, "window");
        AbstractC3292y.i(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(134217728);
    }
}
