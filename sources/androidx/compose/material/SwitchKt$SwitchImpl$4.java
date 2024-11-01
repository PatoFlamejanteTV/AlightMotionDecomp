package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwitchKt$SwitchImpl$4 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ SwitchColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ BoxScope $this_SwitchImpl;
    final /* synthetic */ Function0 $thumbValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$4(BoxScope boxScope, boolean z8, boolean z9, SwitchColors switchColors, Function0 function0, InteractionSource interactionSource, int i8) {
        super(2);
        this.$this_SwitchImpl = boxScope;
        this.$checked = z8;
        this.$enabled = z9;
        this.$colors = switchColors;
        this.$thumbValue = function0;
        this.$interactionSource = interactionSource;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        SwitchKt.SwitchImpl(this.$this_SwitchImpl, this.$checked, this.$enabled, this.$colors, this.$thumbValue, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
