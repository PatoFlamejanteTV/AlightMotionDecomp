package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class TransformableKt$transformable$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function0 $canPan$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ boolean $lockRotationOnZoomPan$inlined;
    final /* synthetic */ TransformableState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$$inlined$debugInspectorInfo$1(TransformableState transformableState, Function0 function0, boolean z8, boolean z9) {
        super(1);
        this.$state$inlined = transformableState;
        this.$canPan$inlined = function0;
        this.$enabled$inlined = z8;
        this.$lockRotationOnZoomPan$inlined = z9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("transformable");
        inspectorInfo.getProperties().set("state", this.$state$inlined);
        inspectorInfo.getProperties().set("canPan", this.$canPan$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("lockRotationOnZoomPan", Boolean.valueOf(this.$lockRotationOnZoomPan$inlined));
    }
}
