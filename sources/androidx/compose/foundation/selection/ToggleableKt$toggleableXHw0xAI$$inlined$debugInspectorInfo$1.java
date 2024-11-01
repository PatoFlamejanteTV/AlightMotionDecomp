package androidx.compose.foundation.selection;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ Function1 $onValueChange$inlined;
    final /* synthetic */ Role $role$inlined;
    final /* synthetic */ boolean $value$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(boolean z8, boolean z9, Role role, Function1 function1) {
        super(1);
        this.$value$inlined = z8;
        this.$enabled$inlined = z9;
        this.$role$inlined = role;
        this.$onValueChange$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("toggleable");
        inspectorInfo.getProperties().set("value", Boolean.valueOf(this.$value$inlined));
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("role", this.$role$inlined);
        inspectorInfo.getProperties().set("onValueChange", this.$onValueChange$inlined);
    }
}
