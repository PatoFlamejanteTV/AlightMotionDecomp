package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
public final class ChipKt$FilterChip$4 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ InterfaceC2072n $selectedIcon;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ InterfaceC2072n $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$FilterChip$4(boolean z8, Function0 function0, Modifier modifier, boolean z9, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2073o interfaceC2073o, int i8, int i9, int i10) {
        super(2);
        this.$selected = z8;
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$interactionSource = mutableInteractionSource;
        this.$shape = shape;
        this.$border = borderStroke;
        this.$colors = selectableChipColors;
        this.$leadingIcon = interfaceC2072n;
        this.$selectedIcon = interfaceC2072n2;
        this.$trailingIcon = interfaceC2072n3;
        this.$content = interfaceC2073o;
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
        ChipKt.FilterChip(this.$selected, this.$onClick, this.$modifier, this.$enabled, this.$interactionSource, this.$shape, this.$border, this.$colors, this.$leadingIcon, this.$selectedIcon, this.$trailingIcon, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
