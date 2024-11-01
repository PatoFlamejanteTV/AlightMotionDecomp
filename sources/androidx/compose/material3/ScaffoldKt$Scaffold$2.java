package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2072n $bottomBar;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ InterfaceC2072n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ InterfaceC2072n $snackbarHost;
    final /* synthetic */ InterfaceC2072n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$2(Modifier modifier, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, int i8, long j8, long j9, WindowInsets windowInsets, InterfaceC2073o interfaceC2073o, int i9, int i10) {
        super(2);
        this.$modifier = modifier;
        this.$topBar = interfaceC2072n;
        this.$bottomBar = interfaceC2072n2;
        this.$snackbarHost = interfaceC2072n3;
        this.$floatingActionButton = interfaceC2072n4;
        this.$floatingActionButtonPosition = i8;
        this.$containerColor = j8;
        this.$contentColor = j9;
        this.$contentWindowInsets = windowInsets;
        this.$content = interfaceC2073o;
        this.$$changed = i9;
        this.$$default = i10;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ScaffoldKt.m1730ScaffoldTvnljyQ(this.$modifier, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$containerColor, this.$contentColor, this.$contentWindowInsets, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
