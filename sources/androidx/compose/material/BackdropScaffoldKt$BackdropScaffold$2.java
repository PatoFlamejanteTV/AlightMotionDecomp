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
public final class BackdropScaffoldKt$BackdropScaffold$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2072n $appBar;
    final /* synthetic */ long $backLayerBackgroundColor;
    final /* synthetic */ InterfaceC2072n $backLayerContent;
    final /* synthetic */ long $backLayerContentColor;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ InterfaceC2072n $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ Shape $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ boolean $persistentAppBar;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ InterfaceC2073o $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$2(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, Modifier modifier, BackdropScaffoldState backdropScaffoldState, boolean z8, float f8, float f9, boolean z9, boolean z10, long j8, long j9, Shape shape, float f10, long j10, long j11, long j12, InterfaceC2073o interfaceC2073o, int i8, int i9, int i10) {
        super(2);
        this.$appBar = interfaceC2072n;
        this.$backLayerContent = interfaceC2072n2;
        this.$frontLayerContent = interfaceC2072n3;
        this.$modifier = modifier;
        this.$scaffoldState = backdropScaffoldState;
        this.$gesturesEnabled = z8;
        this.$peekHeight = f8;
        this.$headerHeight = f9;
        this.$persistentAppBar = z9;
        this.$stickyFrontLayer = z10;
        this.$backLayerBackgroundColor = j8;
        this.$backLayerContentColor = j9;
        this.$frontLayerShape = shape;
        this.$frontLayerElevation = f10;
        this.$frontLayerBackgroundColor = j10;
        this.$frontLayerContentColor = j11;
        this.$frontLayerScrimColor = j12;
        this.$snackbarHost = interfaceC2073o;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        BackdropScaffoldKt.m1089BackdropScaffoldBZszfkY(this.$appBar, this.$backLayerContent, this.$frontLayerContent, this.$modifier, this.$scaffoldState, this.$gesturesEnabled, this.$peekHeight, this.$headerHeight, this.$persistentAppBar, this.$stickyFrontLayer, this.$backLayerBackgroundColor, this.$backLayerContentColor, this.$frontLayerShape, this.$frontLayerElevation, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerScrimColor, this.$snackbarHost, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
