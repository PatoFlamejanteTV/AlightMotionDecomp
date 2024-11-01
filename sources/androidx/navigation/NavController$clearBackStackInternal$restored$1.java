package androidx.navigation;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavController$clearBackStackInternal$restored$1 extends AbstractC3293z implements Function1 {
    public static final NavController$clearBackStackInternal$restored$1 INSTANCE = new NavController$clearBackStackInternal$restored$1();

    NavController$clearBackStackInternal$restored$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavOptionsBuilder) obj);
        return I.f8786a;
    }

    public final void invoke(NavOptionsBuilder navOptions) {
        AbstractC3292y.i(navOptions, "$this$navOptions");
        navOptions.setRestoreState(true);
    }
}
