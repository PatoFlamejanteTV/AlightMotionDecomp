package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$FloatToVector$2 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$FloatToVector$2 INSTANCE = new VectorConvertersKt$FloatToVector$2();

    VectorConvertersKt$FloatToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(AnimationVector1D it) {
        AbstractC3292y.i(it, "it");
        return Float.valueOf(it.getValue());
    }
}
