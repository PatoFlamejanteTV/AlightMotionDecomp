package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$FilterChip$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ SelectableChipBorder $border;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ SelectableChipElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ InterfaceC2072n $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$FilterChip$2(boolean z8, Function0 function0, InterfaceC2072n interfaceC2072n, Modifier modifier, boolean z9, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, SelectableChipBorder selectableChipBorder, MutableInteractionSource mutableInteractionSource, int i8, int i9, int i10) {
        super(2);
        this.$selected = z8;
        this.$onClick = function0;
        this.$label = interfaceC2072n;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$leadingIcon = interfaceC2072n2;
        this.$trailingIcon = interfaceC2072n3;
        this.$shape = shape;
        this.$colors = selectableChipColors;
        this.$elevation = selectableChipElevation;
        this.$border = selectableChipBorder;
        this.$interactionSource = mutableInteractionSource;
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
        ChipKt.FilterChip(this.$selected, this.$onClick, this.$label, this.$modifier, this.$enabled, this.$leadingIcon, this.$trailingIcon, this.$shape, this.$colors, this.$elevation, this.$border, this.$interactionSource, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
