package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ TextFieldColors $colors$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ float $focusedIndicatorLineThickness$inlined;
    final /* synthetic */ InteractionSource $interactionSource$inlined;
    final /* synthetic */ boolean $isError$inlined;
    final /* synthetic */ float $unfocusedIndicatorLineThickness$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, float f8, float f9) {
        super(1);
        this.$enabled$inlined = z8;
        this.$isError$inlined = z9;
        this.$interactionSource$inlined = interactionSource;
        this.$colors$inlined = textFieldColors;
        this.$focusedIndicatorLineThickness$inlined = f8;
        this.$unfocusedIndicatorLineThickness$inlined = f9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("indicatorLine");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("isError", Boolean.valueOf(this.$isError$inlined));
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("colors", this.$colors$inlined);
        inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m5153boximpl(this.$focusedIndicatorLineThickness$inlined));
        inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m5153boximpl(this.$unfocusedIndicatorLineThickness$inlined));
    }
}
