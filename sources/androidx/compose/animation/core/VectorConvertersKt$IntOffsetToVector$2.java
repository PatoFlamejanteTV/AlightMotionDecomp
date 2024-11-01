package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntOffsetToVector$2 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$IntOffsetToVector$2 INSTANCE = new VectorConvertersKt$IntOffsetToVector$2();

    VectorConvertersKt$IntOffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m5270boximpl(m233invokeBjo55l4((AnimationVector2D) obj));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m233invokeBjo55l4(AnimationVector2D it) {
        AbstractC3292y.i(it, "it");
        return IntOffsetKt.IntOffset(AbstractC2829a.d(it.getV1()), AbstractC2829a.d(it.getV2()));
    }
}
