package androidx.compose.ui.layout;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState$subcompose$3$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ LayoutNodeSubcompositionsState.NodeState $nodeState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeSubcompositionsState$subcompose$3$1$1(LayoutNodeSubcompositionsState.NodeState nodeState, InterfaceC2072n interfaceC2072n) {
        super(2);
        this.$nodeState = nodeState;
        this.$content = interfaceC2072n;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1750409193, i8, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:476)");
        }
        boolean active = this.$nodeState.getActive();
        InterfaceC2072n interfaceC2072n = this.$content;
        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(active));
        boolean changed = composer.changed(active);
        if (active) {
            interfaceC2072n.invoke(composer, 0);
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
