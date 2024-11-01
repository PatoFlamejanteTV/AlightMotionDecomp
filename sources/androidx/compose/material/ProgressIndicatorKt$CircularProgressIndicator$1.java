package androidx.compose.material;

import Q5.I;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $coercedProgress;
    final /* synthetic */ long $color;
    final /* synthetic */ Stroke $stroke;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$1(float f8, long j8, Stroke stroke, long j9) {
        super(1);
        this.$coercedProgress = f8;
        this.$backgroundColor = j8;
        this.$stroke = stroke;
        this.$color = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(DrawScope Canvas) {
        AbstractC3292y.i(Canvas, "$this$Canvas");
        float f8 = this.$coercedProgress * 360.0f;
        ProgressIndicatorKt.m1291drawCircularIndicatorBackgroundbw27NRU(Canvas, this.$backgroundColor, this.$stroke);
        ProgressIndicatorKt.m1292drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f8, this.$color, this.$stroke);
    }
}
