package androidx.navigation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavController$navInflater$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$navInflater$2(NavController navController) {
        super(0);
        this.this$0 = navController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NavInflater invoke() {
        NavInflater navInflater;
        navInflater = this.this$0.inflater;
        return navInflater == null ? new NavInflater(this.this$0.getContext(), this.this$0._navigatorProvider) : navInflater;
    }
}
