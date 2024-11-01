package androidx.compose.foundation.selection;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ Function0 $onClick$inlined;
    final /* synthetic */ Role $role$inlined;
    final /* synthetic */ boolean $selected$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1(boolean z8, boolean z9, Role role, Function0 function0) {
        super(1);
        this.$selected$inlined = z8;
        this.$enabled$inlined = z9;
        this.$role$inlined = role;
        this.$onClick$inlined = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("selectable");
        inspectorInfo.getProperties().set("selected", Boolean.valueOf(this.$selected$inlined));
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("role", this.$role$inlined);
        inspectorInfo.getProperties().set("onClick", this.$onClick$inlined);
    }
}
