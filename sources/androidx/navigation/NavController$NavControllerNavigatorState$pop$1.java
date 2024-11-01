package androidx.navigation;

import Q5.I;
import androidx.navigation.NavController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavController$NavControllerNavigatorState$pop$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ NavBackStackEntry $popUpTo;
    final /* synthetic */ boolean $saveState;
    final /* synthetic */ NavController.NavControllerNavigatorState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$NavControllerNavigatorState$pop$1(NavController.NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z8) {
        super(0);
        this.this$0 = navControllerNavigatorState;
        this.$popUpTo = navBackStackEntry;
        this.$saveState = z8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5442invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5442invoke() {
        super/*androidx.navigation.NavigatorState*/.pop(this.$popUpTo, this.$saveState);
    }
}
