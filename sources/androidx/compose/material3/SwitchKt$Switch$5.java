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
public final class SwitchKt$Switch$5 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ SwitchColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onCheckedChange;
    final /* synthetic */ InterfaceC2072n $thumbContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$5(boolean z8, Function1 function1, Modifier modifier, InterfaceC2072n interfaceC2072n, boolean z9, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i8, int i9) {
        super(2);
        this.$checked = z8;
        this.$onCheckedChange = function1;
        this.$modifier = modifier;
        this.$thumbContent = interfaceC2072n;
        this.$enabled = z9;
        this.$colors = switchColors;
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
        SwitchKt.Switch(this.$checked, this.$onCheckedChange, this.$modifier, this.$thumbContent, this.$enabled, this.$colors, this.$interactionSource, composer, this.$$changed | 1, this.$$default);
    }
}
