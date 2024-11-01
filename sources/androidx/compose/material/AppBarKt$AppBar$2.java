package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$AppBar$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ float $elevation;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$AppBar$2(long j8, long j9, float f8, PaddingValues paddingValues, Shape shape, Modifier modifier, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$elevation = f8;
        this.$contentPadding = paddingValues;
        this.$shape = shape;
        this.$modifier = modifier;
        this.$content = interfaceC2073o;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        AppBarKt.m1081AppBarcelAv9A(this.$backgroundColor, this.$contentColor, this.$elevation, this.$contentPadding, this.$shape, this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
