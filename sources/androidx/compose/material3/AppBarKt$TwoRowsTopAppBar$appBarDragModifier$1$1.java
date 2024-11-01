package androidx.compose.material3;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1(TopAppBarScrollBehavior topAppBarScrollBehavior) {
        super(1);
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f8786a;
    }

    public final void invoke(float f8) {
        this.$scrollBehavior.getState().setHeightOffset(this.$scrollBehavior.getState().getHeightOffset() + f8);
    }
}
