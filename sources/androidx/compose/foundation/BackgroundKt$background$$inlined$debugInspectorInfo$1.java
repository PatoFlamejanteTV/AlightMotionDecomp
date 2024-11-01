package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class BackgroundKt$background$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $alpha$inlined;
    final /* synthetic */ Brush $brush$inlined;
    final /* synthetic */ Shape $shape$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundKt$background$$inlined$debugInspectorInfo$1(float f8, Brush brush, Shape shape) {
        super(1);
        this.$alpha$inlined = f8;
        this.$brush$inlined = brush;
        this.$shape$inlined = shape;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("background");
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.$alpha$inlined));
        inspectorInfo.getProperties().set("brush", this.$brush$inlined);
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
    }
}
