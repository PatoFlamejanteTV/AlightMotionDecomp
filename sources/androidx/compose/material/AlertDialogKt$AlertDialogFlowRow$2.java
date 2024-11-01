package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogFlowRow$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ float $mainAxisSpacing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$2(float f8, float f9, InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$mainAxisSpacing = f8;
        this.$crossAxisSpacing = f9;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        AlertDialogKt.m1073AlertDialogFlowRowixp7dh8(this.$mainAxisSpacing, this.$crossAxisSpacing, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
