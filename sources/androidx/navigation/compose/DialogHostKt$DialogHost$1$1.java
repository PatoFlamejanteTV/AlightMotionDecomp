package androidx.navigation.compose;

import Q5.I;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class DialogHostKt$DialogHost$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ DialogNavigator $dialogNavigator;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$1(DialogNavigator dialogNavigator, NavBackStackEntry navBackStackEntry) {
        super(0);
        this.$dialogNavigator = dialogNavigator;
        this.$backStackEntry = navBackStackEntry;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5445invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5445invoke() {
        this.$dialogNavigator.dismiss$navigation_compose_release(this.$backStackEntry);
    }
}
