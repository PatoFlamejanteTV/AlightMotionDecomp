package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2073o $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ InterfaceC2073o $dismissContent;
    final /* synthetic */ Function1 $dismissThresholds;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$3(DismissState dismissState, Modifier modifier, Set<? extends DismissDirection> set, Function1 function1, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, int i8, int i9) {
        super(2);
        this.$state = dismissState;
        this.$modifier = modifier;
        this.$directions = set;
        this.$dismissThresholds = function1;
        this.$background = interfaceC2073o;
        this.$dismissContent = interfaceC2073o2;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        SwipeToDismissKt.SwipeToDismiss(this.$state, this.$modifier, this.$directions, this.$dismissThresholds, this.$background, this.$dismissContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
