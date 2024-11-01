package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$2 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$DpOffsetToVector$2 INSTANCE = new VectorConvertersKt$DpOffsetToVector$2();

    VectorConvertersKt$DpOffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return DpOffset.m5210boximpl(m229invokegVRvYmI((AnimationVector2D) obj));
    }

    /* renamed from: invoke-gVRvYmI, reason: not valid java name */
    public final long m229invokegVRvYmI(AnimationVector2D it) {
        AbstractC3292y.i(it, "it");
        return DpKt.m5176DpOffsetYgX7TsA(Dp.m5155constructorimpl(it.getV1()), Dp.m5155constructorimpl(it.getV2()));
    }
}
