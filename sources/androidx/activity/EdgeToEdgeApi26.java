package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(26)
/* loaded from: classes.dex */
final class EdgeToEdgeApi26 implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z8, boolean z9) {
        AbstractC3292y.i(statusBarStyle, "statusBarStyle");
        AbstractC3292y.i(navigationBarStyle, "navigationBarStyle");
        AbstractC3292y.i(window, "window");
        AbstractC3292y.i(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(statusBarStyle.getScrim$activity_release(z8));
        window.setNavigationBarColor(navigationBarStyle.getScrim$activity_release(z9));
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(!z8);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(!z9);
    }
}
