package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntToVector$1 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$IntToVector$1 INSTANCE = new VectorConvertersKt$IntToVector$1();

    VectorConvertersKt$IntToVector$1() {
        super(1);
    }

    public final AnimationVector1D invoke(int i8) {
        return new AnimationVector1D(i8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
