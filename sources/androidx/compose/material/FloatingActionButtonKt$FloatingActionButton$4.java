package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FloatingActionButtonKt$FloatingActionButton$4 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ FloatingActionButtonElevation $elevation;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$4(Function0 function0, Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j8, long j9, FloatingActionButtonElevation floatingActionButtonElevation, InterfaceC2072n interfaceC2072n, int i8, int i9) {
        super(2);
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$interactionSource = mutableInteractionSource;
        this.$shape = shape;
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$elevation = floatingActionButtonElevation;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        FloatingActionButtonKt.m1241FloatingActionButtonbogVsAg(this.$onClick, this.$modifier, this.$interactionSource, this.$shape, this.$backgroundColor, this.$contentColor, this.$elevation, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
