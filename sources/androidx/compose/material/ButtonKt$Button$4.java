package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ButtonKt$Button$4 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ ButtonColors $colors;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ ButtonElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonKt$Button$4(Function0 function0, Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$enabled = z8;
        this.$interactionSource = mutableInteractionSource;
        this.$elevation = buttonElevation;
        this.$shape = shape;
        this.$border = borderStroke;
        this.$colors = buttonColors;
        this.$contentPadding = paddingValues;
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
        ButtonKt.Button(this.$onClick, this.$modifier, this.$enabled, this.$interactionSource, this.$elevation, this.$shape, this.$border, this.$colors, this.$contentPadding, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
