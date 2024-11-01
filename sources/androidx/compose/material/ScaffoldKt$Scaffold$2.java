package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ InterfaceC2072n $bottomBar;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ InterfaceC2073o $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ InterfaceC2072n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ boolean $isFloatingActionButtonDocked;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ScaffoldState $scaffoldState;
    final /* synthetic */ InterfaceC2073o $snackbarHost;
    final /* synthetic */ InterfaceC2072n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$2(Modifier modifier, ScaffoldState scaffoldState, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n3, int i8, boolean z8, InterfaceC2073o interfaceC2073o2, boolean z9, Shape shape, float f8, long j8, long j9, long j10, long j11, long j12, InterfaceC2073o interfaceC2073o3, int i9, int i10, int i11) {
        super(2);
        this.$modifier = modifier;
        this.$scaffoldState = scaffoldState;
        this.$topBar = interfaceC2072n;
        this.$bottomBar = interfaceC2072n2;
        this.$snackbarHost = interfaceC2073o;
        this.$floatingActionButton = interfaceC2072n3;
        this.$floatingActionButtonPosition = i8;
        this.$isFloatingActionButtonDocked = z8;
        this.$drawerContent = interfaceC2073o2;
        this.$drawerGesturesEnabled = z9;
        this.$drawerShape = shape;
        this.$drawerElevation = f8;
        this.$drawerBackgroundColor = j8;
        this.$drawerContentColor = j9;
        this.$drawerScrimColor = j10;
        this.$backgroundColor = j11;
        this.$contentColor = j12;
        this.$content = interfaceC2073o3;
        this.$$changed = i9;
        this.$$changed1 = i10;
        this.$$default = i11;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ScaffoldKt.m1297Scaffold27mzLpw(this.$modifier, this.$scaffoldState, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$isFloatingActionButtonDocked, this.$drawerContent, this.$drawerGesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$drawerScrimColor, this.$backgroundColor, this.$contentColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
