package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.SystemBarStyle;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class EdgeToEdge {
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(230, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    public static final void enable(ComponentActivity componentActivity) {
        AbstractC3292y.i(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if ((i8 & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle statusBarStyle) {
        AbstractC3292y.i(componentActivity, "<this>");
        AbstractC3292y.i(statusBarStyle, "statusBarStyle");
        enable$default(componentActivity, statusBarStyle, null, 2, null);
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle) {
        AbstractC3292y.i(componentActivity, "<this>");
        AbstractC3292y.i(statusBarStyle, "statusBarStyle");
        AbstractC3292y.i(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        AbstractC3292y.h(decorView, "window.decorView");
        Function1 detectDarkMode$activity_release = statusBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        AbstractC3292y.h(resources, "view.resources");
        boolean booleanValue = ((Boolean) detectDarkMode$activity_release.invoke(resources)).booleanValue();
        Function1 detectDarkMode$activity_release2 = navigationBarStyle.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        AbstractC3292y.h(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) detectDarkMode$activity_release2.invoke(resources2)).booleanValue();
        EdgeToEdgeImpl edgeToEdgeImpl = Impl;
        if (edgeToEdgeImpl == null) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 29) {
                edgeToEdgeImpl = new EdgeToEdgeApi29();
            } else if (i8 >= 26) {
                edgeToEdgeImpl = new EdgeToEdgeApi26();
            } else if (i8 >= 23) {
                edgeToEdgeImpl = new EdgeToEdgeApi23();
            } else {
                edgeToEdgeImpl = new EdgeToEdgeApi21();
                Impl = edgeToEdgeImpl;
            }
        }
        EdgeToEdgeImpl edgeToEdgeImpl2 = edgeToEdgeImpl;
        Window window = componentActivity.getWindow();
        AbstractC3292y.h(window, "window");
        edgeToEdgeImpl2.setUp(statusBarStyle, navigationBarStyle, window, decorView, booleanValue, booleanValue2);
    }
}
