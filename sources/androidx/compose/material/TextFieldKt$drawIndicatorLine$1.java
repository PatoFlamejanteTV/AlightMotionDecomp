package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldKt$drawIndicatorLine$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ BorderStroke $indicatorBorder;
    final /* synthetic */ float $strokeWidthDp;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$drawIndicatorLine$1(float f8, BorderStroke borderStroke) {
        super(1);
        this.$strokeWidthDp = f8;
        this.$indicatorBorder = borderStroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(ContentDrawScope drawWithContent) {
        AbstractC3292y.i(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        if (Dp.m5160equalsimpl0(this.$strokeWidthDp, Dp.Companion.m5173getHairlineD9Ej5fM())) {
            return;
        }
        float density = this.$strokeWidthDp * drawWithContent.getDensity();
        float m2778getHeightimpl = Size.m2778getHeightimpl(drawWithContent.mo3391getSizeNHjbRc()) - (density / 2);
        c.B(drawWithContent, this.$indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, m2778getHeightimpl), OffsetKt.Offset(Size.m2781getWidthimpl(drawWithContent.mo3391getSizeNHjbRc()), m2778getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
    }
}
