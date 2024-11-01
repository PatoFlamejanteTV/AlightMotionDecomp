package androidx.compose.ui.draw;

import Q5.I;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $ambientColor$inlined;
    final /* synthetic */ boolean $clip$inlined;
    final /* synthetic */ float $elevation$inlined;
    final /* synthetic */ Shape $shape$inlined;
    final /* synthetic */ long $spotColor$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1(float f8, Shape shape, boolean z8, long j8, long j9) {
        super(1);
        this.$elevation$inlined = f8;
        this.$shape$inlined = shape;
        this.$clip$inlined = z8;
        this.$ambientColor$inlined = j8;
        this.$spotColor$inlined = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        inspectorInfo.getProperties().set("elevation", Dp.m5153boximpl(this.$elevation$inlined));
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.$clip$inlined));
        inspectorInfo.getProperties().set("ambientColor", Color.m2938boximpl(this.$ambientColor$inlined));
        inspectorInfo.getProperties().set("spotColor", Color.m2938boximpl(this.$spotColor$inlined));
    }
}
