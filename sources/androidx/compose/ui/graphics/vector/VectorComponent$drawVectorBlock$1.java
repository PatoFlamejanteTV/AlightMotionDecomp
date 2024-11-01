package androidx.compose.ui.graphics.vector;

import Q5.I;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class VectorComponent$drawVectorBlock$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ VectorComponent this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$drawVectorBlock$1(VectorComponent vectorComponent) {
        super(1);
        this.this$0 = vectorComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(DrawScope drawScope) {
        float f8;
        float f9;
        GroupComponent root = this.this$0.getRoot();
        VectorComponent vectorComponent = this.this$0;
        f8 = vectorComponent.rootScaleX;
        f9 = vectorComponent.rootScaleY;
        long m2728getZeroF1C5BW0 = Offset.Companion.m2728getZeroF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3397getSizeNHjbRc = drawContext.mo3397getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3404scale0AR0LA0(f8, f9, m2728getZeroF1C5BW0);
        root.draw(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3398setSizeuvyYCjk(mo3397getSizeNHjbRc);
    }
}
