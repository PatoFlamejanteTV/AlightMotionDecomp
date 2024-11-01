package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$DpToVector$2 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$DpToVector$2 INSTANCE = new VectorConvertersKt$DpToVector$2();

    VectorConvertersKt$DpToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Dp.m5153boximpl(m231invokeu2uoSUM((AnimationVector1D) obj));
    }

    /* renamed from: invoke-u2uoSUM, reason: not valid java name */
    public final float m231invokeu2uoSUM(AnimationVector1D it) {
        AbstractC3292y.i(it, "it");
        return Dp.m5155constructorimpl(it.getValue());
    }
}
