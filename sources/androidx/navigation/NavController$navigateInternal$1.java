package androidx.navigation;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavController$navigateInternal$1 extends AbstractC3293z implements Function1 {
    public static final NavController$navigateInternal$1 INSTANCE = new NavController$navigateInternal$1();

    NavController$navigateInternal$1() {
        super(1);
    }

    public final void invoke(NavBackStackEntry it) {
        AbstractC3292y.i(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavBackStackEntry) obj);
        return I.f8786a;
    }
}
