package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Color> $borderColor$delegate;
    final /* synthetic */ State<Color> $boxColor$delegate;
    final /* synthetic */ CheckDrawingCache $checkCache;
    final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction$delegate;
    final /* synthetic */ State<Color> $checkColor$delegate;
    final /* synthetic */ State<Float> $checkDrawFraction$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(CheckDrawingCache checkDrawingCache, State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5) {
        super(1);
        this.$checkCache = checkDrawingCache;
        this.$boxColor$delegate = state;
        this.$borderColor$delegate = state2;
        this.$checkColor$delegate = state3;
        this.$checkDrawFraction$delegate = state4;
        this.$checkCenterGravitationShiftFraction$delegate = state5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(DrawScope Canvas) {
        float f8;
        long CheckboxImpl$lambda$9;
        long CheckboxImpl$lambda$10;
        float f9;
        long CheckboxImpl$lambda$8;
        float CheckboxImpl$lambda$4;
        float CheckboxImpl$lambda$6;
        AbstractC3292y.i(Canvas, "$this$Canvas");
        f8 = CheckboxKt.StrokeWidth;
        float floor = (float) Math.floor(Canvas.mo425toPx0680j_4(f8));
        CheckboxImpl$lambda$9 = CheckboxKt.CheckboxImpl$lambda$9(this.$boxColor$delegate);
        CheckboxImpl$lambda$10 = CheckboxKt.CheckboxImpl$lambda$10(this.$borderColor$delegate);
        f9 = CheckboxKt.RadiusSize;
        CheckboxKt.m1135drawBox1wkBAMs(Canvas, CheckboxImpl$lambda$9, CheckboxImpl$lambda$10, Canvas.mo425toPx0680j_4(f9), floor);
        CheckboxImpl$lambda$8 = CheckboxKt.CheckboxImpl$lambda$8(this.$checkColor$delegate);
        CheckboxImpl$lambda$4 = CheckboxKt.CheckboxImpl$lambda$4(this.$checkDrawFraction$delegate);
        CheckboxImpl$lambda$6 = CheckboxKt.CheckboxImpl$lambda$6(this.$checkCenterGravitationShiftFraction$delegate);
        CheckboxKt.m1136drawCheck3IgeMak(Canvas, CheckboxImpl$lambda$8, CheckboxImpl$lambda$4, CheckboxImpl$lambda$6, floor, this.$checkCache);
    }
}
