package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogBaselineLayout$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $text;
    final /* synthetic */ ColumnScope $this_AlertDialogBaselineLayout;
    final /* synthetic */ InterfaceC2072n $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$3(ColumnScope columnScope, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, int i8) {
        super(2);
        this.$this_AlertDialogBaselineLayout = columnScope;
        this.$title = interfaceC2072n;
        this.$text = interfaceC2072n2;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        AlertDialogKt.AlertDialogBaselineLayout(this.$this_AlertDialogBaselineLayout, this.$title, this.$text, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
