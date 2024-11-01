package androidx.compose.ui.modifier;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ProvidableModifierLocal $key$inlined;
    final /* synthetic */ Function0 $value$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1(ProvidableModifierLocal providableModifierLocal, Function0 function0) {
        super(1);
        this.$key$inlined = providableModifierLocal;
        this.$value$inlined = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("modifierLocalProvider");
        inspectorInfo.getProperties().set(LeanbackPreferenceDialogFragment.ARG_KEY, this.$key$inlined);
        inspectorInfo.getProperties().set("value", this.$value$inlined);
    }
}
