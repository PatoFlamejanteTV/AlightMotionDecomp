package androidx.compose.foundation;

import Q5.p;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BorderModifierNode$drawWithCacheModifierNode$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ BorderModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawWithCacheModifierNode$1(BorderModifierNode borderModifierNode) {
        super(1);
        this.this$0 = borderModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope CacheDrawModifierNode) {
        DrawResult drawContentWithoutBorder;
        DrawResult m273drawRectBorderNsqcLGU;
        DrawResult m276drawRoundRectBorderJqoCqck;
        DrawResult drawGenericBorder;
        AbstractC3292y.i(CacheDrawModifierNode, "$this$CacheDrawModifierNode");
        if (CacheDrawModifierNode.mo425toPx0680j_4(this.this$0.m277getWidthD9Ej5fM()) < 0.0f || Size.m2780getMinDimensionimpl(CacheDrawModifierNode.m2616getSizeNHjbRc()) <= 0.0f) {
            drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(CacheDrawModifierNode);
            return drawContentWithoutBorder;
        }
        float f8 = 2;
        float min = Math.min(Dp.m5160equalsimpl0(this.this$0.m277getWidthD9Ej5fM(), Dp.Companion.m5173getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(CacheDrawModifierNode.mo425toPx0680j_4(this.this$0.m277getWidthD9Ej5fM())), (float) Math.ceil(Size.m2780getMinDimensionimpl(CacheDrawModifierNode.m2616getSizeNHjbRc()) / f8));
        float f9 = min / f8;
        long Offset = OffsetKt.Offset(f9, f9);
        long Size = SizeKt.Size(Size.m2781getWidthimpl(CacheDrawModifierNode.m2616getSizeNHjbRc()) - min, Size.m2778getHeightimpl(CacheDrawModifierNode.m2616getSizeNHjbRc()) - min);
        boolean z8 = f8 * min > Size.m2780getMinDimensionimpl(CacheDrawModifierNode.m2616getSizeNHjbRc());
        Outline mo308createOutlinePq9zytI = this.this$0.getShape().mo308createOutlinePq9zytI(CacheDrawModifierNode.m2616getSizeNHjbRc(), CacheDrawModifierNode.getLayoutDirection(), CacheDrawModifierNode);
        if (mo308createOutlinePq9zytI instanceof Outline.Generic) {
            BorderModifierNode borderModifierNode = this.this$0;
            drawGenericBorder = borderModifierNode.drawGenericBorder(CacheDrawModifierNode, borderModifierNode.getBrush(), (Outline.Generic) mo308createOutlinePq9zytI, z8, min);
            return drawGenericBorder;
        }
        if (mo308createOutlinePq9zytI instanceof Outline.Rounded) {
            BorderModifierNode borderModifierNode2 = this.this$0;
            m276drawRoundRectBorderJqoCqck = borderModifierNode2.m276drawRoundRectBorderJqoCqck(CacheDrawModifierNode, borderModifierNode2.getBrush(), (Outline.Rounded) mo308createOutlinePq9zytI, Offset, Size, z8, min);
            return m276drawRoundRectBorderJqoCqck;
        }
        if (!(mo308createOutlinePq9zytI instanceof Outline.Rectangle)) {
            throw new p();
        }
        m273drawRectBorderNsqcLGU = BorderKt.m273drawRectBorderNsqcLGU(CacheDrawModifierNode, this.this$0.getBrush(), Offset, Size, z8, min);
        return m273drawRectBorderNsqcLGU;
    }
}
