package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropStack$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $backLayer;
    final /* synthetic */ Function1 $calculateBackLayerConstraints;
    final /* synthetic */ InterfaceC2074p $frontLayer;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$2(Modifier modifier, InterfaceC2072n interfaceC2072n, Function1 function1, InterfaceC2074p interfaceC2074p, int i8) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = interfaceC2072n;
        this.$calculateBackLayerConstraints = function1;
        this.$frontLayer = interfaceC2074p;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        BackdropScaffoldKt.BackdropStack(this.$modifier, this.$backLayer, this.$calculateBackLayerConstraints, this.$frontLayer, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
