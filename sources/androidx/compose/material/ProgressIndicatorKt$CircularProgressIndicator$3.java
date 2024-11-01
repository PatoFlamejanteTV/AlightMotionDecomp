package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ State<Float> $baseRotation$delegate;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Integer> $currentRotation$delegate;
    final /* synthetic */ State<Float> $endAngle$delegate;
    final /* synthetic */ State<Float> $startAngle$delegate;
    final /* synthetic */ Stroke $stroke;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3(long j8, Stroke stroke, float f8, long j9, State<Integer> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j8;
        this.$stroke = stroke;
        this.$strokeWidth = f8;
        this.$color = j9;
        this.$currentRotation$delegate = state;
        this.$endAngle$delegate = state2;
        this.$startAngle$delegate = state3;
        this.$baseRotation$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(DrawScope Canvas) {
        int CircularProgressIndicator_LxG7B9w$lambda$8;
        float CircularProgressIndicator_LxG7B9w$lambda$10;
        float CircularProgressIndicator_LxG7B9w$lambda$11;
        float CircularProgressIndicator_LxG7B9w$lambda$9;
        float CircularProgressIndicator_LxG7B9w$lambda$112;
        AbstractC3292y.i(Canvas, "$this$Canvas");
        ProgressIndicatorKt.m1291drawCircularIndicatorBackgroundbw27NRU(Canvas, this.$backgroundColor, this.$stroke);
        CircularProgressIndicator_LxG7B9w$lambda$8 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(this.$currentRotation$delegate);
        CircularProgressIndicator_LxG7B9w$lambda$10 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(this.$endAngle$delegate);
        CircularProgressIndicator_LxG7B9w$lambda$11 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(this.$startAngle$delegate);
        float abs = Math.abs(CircularProgressIndicator_LxG7B9w$lambda$10 - CircularProgressIndicator_LxG7B9w$lambda$11);
        CircularProgressIndicator_LxG7B9w$lambda$9 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(this.$baseRotation$delegate);
        float f8 = (((CircularProgressIndicator_LxG7B9w$lambda$8 * 216.0f) % 360.0f) - 90.0f) + CircularProgressIndicator_LxG7B9w$lambda$9;
        CircularProgressIndicator_LxG7B9w$lambda$112 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(this.$startAngle$delegate);
        ProgressIndicatorKt.m1293drawIndeterminateCircularIndicatorhrjfTZI(Canvas, CircularProgressIndicator_LxG7B9w$lambda$112 + f8, this.$strokeWidth, abs, this.$color, this.$stroke);
    }
}
