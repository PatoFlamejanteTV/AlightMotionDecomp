package androidx.navigation;

import Q5.I;
import R5.C1427k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavController$executePopOperations$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ O $popped;
    final /* synthetic */ O $receivedPop;
    final /* synthetic */ boolean $saveState;
    final /* synthetic */ C1427k $savedState;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$executePopOperations$1(O o8, O o9, NavController navController, boolean z8, C1427k c1427k) {
        super(1);
        this.$receivedPop = o8;
        this.$popped = o9;
        this.this$0 = navController;
        this.$saveState = z8;
        this.$savedState = c1427k;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavBackStackEntry) obj);
        return I.f8786a;
    }

    public final void invoke(NavBackStackEntry entry) {
        AbstractC3292y.i(entry, "entry");
        this.$receivedPop.f34569a = true;
        this.$popped.f34569a = true;
        this.this$0.popEntryFromBackStack(entry, this.$saveState, this.$savedState);
    }
}
