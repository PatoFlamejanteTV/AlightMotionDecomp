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
public final class ChipKt$ElevatedSuggestionChip$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ChipBorder $border;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ ChipElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$ElevatedSuggestionChip$2(Function0 function0, InterfaceC2072n interfaceC2072n, Modifier modifier, boolean z8, InterfaceC2072n interfaceC2072n2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i8, int i9) {
        super(2);
        this.$onClick = function0;
        this.$label = interfaceC2072n;
        this.$modifier = modifier;
        this.$enabled = z8;
        this.$icon = interfaceC2072n2;
        this.$shape = shape;
        this.$colors = chipColors;
        this.$elevation = chipElevation;
        this.$border = chipBorder;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ChipKt.ElevatedSuggestionChip(this.$onClick, this.$label, this.$modifier, this.$enabled, this.$icon, this.$shape, this.$colors, this.$elevation, this.$border, this.$interactionSource, composer, this.$$changed | 1, this.$$default);
    }
}
