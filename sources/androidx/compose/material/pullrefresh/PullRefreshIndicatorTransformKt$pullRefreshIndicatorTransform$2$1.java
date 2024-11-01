package androidx.compose.material.pullrefresh;

import Q5.I;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 extends AbstractC3293z implements Function1 {
    public static final PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 INSTANCE = new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1();

    PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(ContentDrawScope drawWithContent) {
        AbstractC3292y.i(drawWithContent, "$this$drawWithContent");
        int m2937getIntersectrtfAjoo = ClipOp.Companion.m2937getIntersectrtfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long mo3397getSizeNHjbRc = drawContext.mo3397getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3400clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m2937getIntersectrtfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo3398setSizeuvyYCjk(mo3397getSizeNHjbRc);
    }
}
