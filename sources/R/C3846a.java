package r;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3846a implements InterfaceC3848c {

    /* renamed from: a, reason: collision with root package name */
    private final View f37659a;

    /* renamed from: b, reason: collision with root package name */
    private final Window f37660b;

    /* renamed from: c, reason: collision with root package name */
    private final WindowInsetsControllerCompat f37661c;

    public C3846a(View view, Window window) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        AbstractC3292y.i(view, "view");
        this.f37659a = view;
        this.f37660b = window;
        if (window != null) {
            windowInsetsControllerCompat = WindowCompat.getInsetsController(window, view);
        } else {
            windowInsetsControllerCompat = null;
        }
        this.f37661c = windowInsetsControllerCompat;
    }

    @Override // r.InterfaceC3848c
    public void a(long j8, boolean z8, boolean z9, Function1 transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        AbstractC3292y.i(transformColorForLightContent, "transformColorForLightContent");
        d(z8);
        c(z9);
        Window window = this.f37660b;
        if (window != null) {
            if (z8 && ((windowInsetsControllerCompat = this.f37661c) == null || !windowInsetsControllerCompat.isAppearanceLightNavigationBars())) {
                j8 = ((Color) transformColorForLightContent.invoke(Color.m2938boximpl(j8))).m2958unboximpl();
            }
            window.setNavigationBarColor(ColorKt.m3002toArgb8_81llA(j8));
        }
    }

    @Override // r.InterfaceC3848c
    public void b(long j8, boolean z8, Function1 transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        AbstractC3292y.i(transformColorForLightContent, "transformColorForLightContent");
        e(z8);
        Window window = this.f37660b;
        if (window != null) {
            if (z8 && ((windowInsetsControllerCompat = this.f37661c) == null || !windowInsetsControllerCompat.isAppearanceLightStatusBars())) {
                j8 = ((Color) transformColorForLightContent.invoke(Color.m2938boximpl(j8))).m2958unboximpl();
            }
            window.setStatusBarColor(ColorKt.m3002toArgb8_81llA(j8));
        }
    }

    public void c(boolean z8) {
        Window window;
        if (Build.VERSION.SDK_INT >= 29 && (window = this.f37660b) != null) {
            window.setNavigationBarContrastEnforced(z8);
        }
    }

    public void d(boolean z8) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f37661c;
        if (windowInsetsControllerCompat != null) {
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(z8);
        }
    }

    public void e(boolean z8) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f37661c;
        if (windowInsetsControllerCompat != null) {
            windowInsetsControllerCompat.setAppearanceLightStatusBars(z8);
        }
    }
}
