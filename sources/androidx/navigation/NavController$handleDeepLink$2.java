package androidx.navigation;

import Q5.I;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavController$handleDeepLink$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ NavDestination $node;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.NavController$handleDeepLink$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnimBuilder) obj);
            return I.f8786a;
        }

        public final void invoke(AnimBuilder anim) {
            AbstractC3292y.i(anim, "$this$anim");
            anim.setEnter(0);
            anim.setExit(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.NavController$handleDeepLink$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PopUpToBuilder) obj);
            return I.f8786a;
        }

        public final void invoke(PopUpToBuilder popUpTo) {
            AbstractC3292y.i(popUpTo, "$this$popUpTo");
            popUpTo.setSaveState(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$handleDeepLink$2(NavDestination navDestination, NavController navController) {
        super(1);
        this.$node = navDestination;
        this.this$0 = navController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavOptionsBuilder) obj);
        return I.f8786a;
    }

    public final void invoke(NavOptionsBuilder navOptions) {
        boolean z8;
        AbstractC3292y.i(navOptions, "$this$navOptions");
        navOptions.anim(AnonymousClass1.INSTANCE);
        NavDestination navDestination = this.$node;
        if (navDestination instanceof NavGraph) {
            InterfaceC3255g<NavDestination> hierarchy = NavDestination.Companion.getHierarchy(navDestination);
            NavController navController = this.this$0;
            for (NavDestination navDestination2 : hierarchy) {
                NavDestination currentDestination = navController.getCurrentDestination();
                if (AbstractC3292y.d(navDestination2, currentDestination != null ? currentDestination.getParent() : null)) {
                    return;
                }
            }
            z8 = NavController.deepLinkSaveState;
            if (z8) {
                navOptions.popUpTo(NavGraph.Companion.findStartDestination(this.this$0.getGraph()).getId(), AnonymousClass2.INSTANCE);
            }
        }
    }
}
