package androidx.compose.material3;

import Q5.I;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ MutableTransitionState<Boolean> $expandedStates;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;
    final /* synthetic */ ExposedDropdownMenuBoxScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, InterfaceC2073o interfaceC2073o, int i8) {
        super(2);
        this.$expandedStates = mutableTransitionState;
        this.$transformOriginState = mutableState;
        this.this$0 = exposedDropdownMenuBoxScope;
        this.$modifier = modifier;
        this.$content = interfaceC2073o;
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
            ComposerKt.traceEventStart(395026654, i8, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:273)");
        }
        MenuKt.DropdownMenuContent(this.$expandedStates, this.$transformOriginState, ExposedDropdownMenuBoxScope.CC.b(this.this$0, this.$modifier, false, 1, null), this.$content, composer, MutableTransitionState.$stable | 48 | (this.$$dirty & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
