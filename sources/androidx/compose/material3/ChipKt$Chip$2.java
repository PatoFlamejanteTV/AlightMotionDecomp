package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$Chip$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ ChipElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ InterfaceC2072n $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$2(Modifier modifier, Function0 function0, boolean z8, InterfaceC2072n interfaceC2072n, TextStyle textStyle, long j8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f8, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$onClick = function0;
        this.$enabled = z8;
        this.$label = interfaceC2072n;
        this.$labelTextStyle = textStyle;
        this.$labelColor = j8;
        this.$leadingIcon = interfaceC2072n2;
        this.$trailingIcon = interfaceC2072n3;
        this.$shape = shape;
        this.$colors = chipColors;
        this.$elevation = chipElevation;
        this.$border = borderStroke;
        this.$minHeight = f8;
        this.$paddingValues = paddingValues;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i8;
        this.$$changed1 = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ChipKt.m1475ChipnkUnTEs(this.$modifier, this.$onClick, this.$enabled, this.$label, this.$labelTextStyle, this.$labelColor, this.$leadingIcon, this.$trailingIcon, this.$shape, this.$colors, this.$elevation, this.$border, this.$minHeight, this.$paddingValues, this.$interactionSource, composer, this.$$changed | 1, this.$$changed1);
    }
}
