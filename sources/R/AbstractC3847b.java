package r;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.functions.Function1;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3847b {
    public static /* synthetic */ void a(InterfaceC3848c interfaceC3848c, long j8, boolean z8, boolean z9, Function1 function1, int i8, Object obj) {
        boolean z10;
        if (obj == null) {
            if ((i8 & 2) != 0) {
                if (ColorKt.m3000luminance8_81llA(j8) > 0.5f) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            boolean z11 = z8;
            if ((i8 & 4) != 0) {
                z10 = true;
            } else {
                z10 = z9;
            }
            if ((i8 & 8) != 0) {
                function1 = AbstractC3849d.f37663b;
            }
            interfaceC3848c.a(j8, z11, z10, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
    }

    public static /* synthetic */ void b(InterfaceC3848c interfaceC3848c, long j8, boolean z8, Function1 function1, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                if (ColorKt.m3000luminance8_81llA(j8) > 0.5f) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            if ((i8 & 4) != 0) {
                function1 = AbstractC3849d.f37663b;
            }
            interfaceC3848c.b(j8, z8, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
    }
}
