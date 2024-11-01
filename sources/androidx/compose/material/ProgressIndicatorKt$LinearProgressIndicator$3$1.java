package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Float> $firstLineHead$delegate;
    final /* synthetic */ State<Float> $firstLineTail$delegate;
    final /* synthetic */ State<Float> $secondLineHead$delegate;
    final /* synthetic */ State<Float> $secondLineTail$delegate;
    final /* synthetic */ int $strokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(long j8, int i8, long j9, State<Float> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j8;
        this.$strokeCap = i8;
        this.$color = j9;
        this.$firstLineHead$delegate = state;
        this.$firstLineTail$delegate = state2;
        this.$secondLineHead$delegate = state3;
        this.$secondLineTail$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(DrawScope Canvas) {
        float LinearProgressIndicator_2cYBFYY$lambda$1;
        float LinearProgressIndicator_2cYBFYY$lambda$2;
        float LinearProgressIndicator_2cYBFYY$lambda$3;
        float LinearProgressIndicator_2cYBFYY$lambda$4;
        float LinearProgressIndicator_2cYBFYY$lambda$32;
        float LinearProgressIndicator_2cYBFYY$lambda$42;
        float LinearProgressIndicator_2cYBFYY$lambda$12;
        float LinearProgressIndicator_2cYBFYY$lambda$22;
        AbstractC3292y.i(Canvas, "$this$Canvas");
        float m2778getHeightimpl = Size.m2778getHeightimpl(Canvas.mo3391getSizeNHjbRc());
        ProgressIndicatorKt.m1295drawLinearIndicatorBackgroundAZGd3zU(Canvas, this.$backgroundColor, m2778getHeightimpl, this.$strokeCap);
        LinearProgressIndicator_2cYBFYY$lambda$1 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(this.$firstLineHead$delegate);
        LinearProgressIndicator_2cYBFYY$lambda$2 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(this.$firstLineTail$delegate);
        if (LinearProgressIndicator_2cYBFYY$lambda$1 - LinearProgressIndicator_2cYBFYY$lambda$2 > 0.0f) {
            LinearProgressIndicator_2cYBFYY$lambda$12 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(this.$firstLineHead$delegate);
            LinearProgressIndicator_2cYBFYY$lambda$22 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(this.$firstLineTail$delegate);
            ProgressIndicatorKt.m1294drawLinearIndicatorqYKTg0g(Canvas, LinearProgressIndicator_2cYBFYY$lambda$12, LinearProgressIndicator_2cYBFYY$lambda$22, this.$color, m2778getHeightimpl, this.$strokeCap);
        }
        LinearProgressIndicator_2cYBFYY$lambda$3 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(this.$secondLineHead$delegate);
        LinearProgressIndicator_2cYBFYY$lambda$4 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(this.$secondLineTail$delegate);
        if (LinearProgressIndicator_2cYBFYY$lambda$3 - LinearProgressIndicator_2cYBFYY$lambda$4 > 0.0f) {
            LinearProgressIndicator_2cYBFYY$lambda$32 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(this.$secondLineHead$delegate);
            LinearProgressIndicator_2cYBFYY$lambda$42 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(this.$secondLineTail$delegate);
            ProgressIndicatorKt.m1294drawLinearIndicatorqYKTg0g(Canvas, LinearProgressIndicator_2cYBFYY$lambda$32, LinearProgressIndicator_2cYBFYY$lambda$42, this.$color, m2778getHeightimpl, this.$strokeCap);
        }
    }
}
