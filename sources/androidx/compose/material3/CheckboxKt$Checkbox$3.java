package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CheckboxKt$Checkbox$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ CheckboxColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onCheckedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$Checkbox$3(boolean z8, Function1 function1, Modifier modifier, boolean z9, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i8, int i9) {
        super(2);
        this.$checked = z8;
        this.$onCheckedChange = function1;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$colors = checkboxColors;
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
        CheckboxKt.Checkbox(this.$checked, this.$onCheckedChange, this.$modifier, this.$enabled, this.$colors, this.$interactionSource, composer, this.$$changed | 1, this.$$default);
    }
}
