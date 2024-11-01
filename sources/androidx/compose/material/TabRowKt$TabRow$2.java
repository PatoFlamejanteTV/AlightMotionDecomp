package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TabRowKt$TabRow$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $divider;
    final /* synthetic */ InterfaceC2073o $indicator;
    final /* synthetic */ InterfaceC2072n $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2073o interfaceC2073o, int i8) {
        super(2);
        this.$tabs = interfaceC2072n;
        this.$divider = interfaceC2072n2;
        this.$indicator = interfaceC2073o;
        this.$$dirty = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1961746365, i8, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        InterfaceC2072n interfaceC2072n = this.$tabs;
        InterfaceC2072n interfaceC2072n2 = this.$divider;
        InterfaceC2073o interfaceC2073o = this.$indicator;
        int i9 = this.$$dirty;
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(interfaceC2072n) | composer.changed(interfaceC2072n2) | composer.changed(interfaceC2073o);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TabRowKt$TabRow$2$1$1(interfaceC2072n, interfaceC2072n2, interfaceC2073o, i9);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (InterfaceC2072n) rememberedValue, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
