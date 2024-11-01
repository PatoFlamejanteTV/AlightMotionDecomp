package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $bottomBar;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ InterfaceC2072n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ InterfaceC2072n $snackbarHost;
    final /* synthetic */ InterfaceC2072n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$1(int i8, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, WindowInsets windowInsets, InterfaceC2072n interfaceC2072n4, int i9) {
        super(2);
        this.$floatingActionButtonPosition = i8;
        this.$topBar = interfaceC2072n;
        this.$content = interfaceC2073o;
        this.$snackbarHost = interfaceC2072n2;
        this.$floatingActionButton = interfaceC2072n3;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = interfaceC2072n4;
        this.$$dirty = i9;
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
            ComposerKt.traceEventStart(-1979205334, i8, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
        }
        int i9 = this.$floatingActionButtonPosition;
        InterfaceC2072n interfaceC2072n = this.$topBar;
        InterfaceC2073o interfaceC2073o = this.$content;
        InterfaceC2072n interfaceC2072n2 = this.$snackbarHost;
        InterfaceC2072n interfaceC2072n3 = this.$floatingActionButton;
        WindowInsets windowInsets = this.$contentWindowInsets;
        InterfaceC2072n interfaceC2072n4 = this.$bottomBar;
        int i10 = this.$$dirty;
        ScaffoldKt.m1731ScaffoldLayoutFMILGgc(i9, interfaceC2072n, interfaceC2073o, interfaceC2072n2, interfaceC2072n3, windowInsets, interfaceC2072n4, composer, ((i10 >> 15) & 14) | (i10 & 112) | ((i10 >> 21) & 896) | (i10 & 7168) | (57344 & i10) | ((i10 >> 9) & 458752) | ((i10 << 12) & 3670016));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
