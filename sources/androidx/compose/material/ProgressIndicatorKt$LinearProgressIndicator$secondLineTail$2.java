package androidx.compose.material;

import Q5.I;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2 extends AbstractC3293z implements Function1 {
    public static final ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2 INSTANCE = new ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2();

    ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
        return I.f8786a;
    }

    public final void invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
        CubicBezierEasing cubicBezierEasing;
        AbstractC3292y.i(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(1800);
        KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 1267);
        cubicBezierEasing = ProgressIndicatorKt.SecondLineTailEasing;
        keyframes.with(at, cubicBezierEasing);
        keyframes.at(Float.valueOf(1.0f), 1800);
    }
}
