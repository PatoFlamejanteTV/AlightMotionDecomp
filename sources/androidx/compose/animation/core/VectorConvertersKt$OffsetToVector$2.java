package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$OffsetToVector$2 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$OffsetToVector$2 INSTANCE = new VectorConvertersKt$OffsetToVector$2();

    VectorConvertersKt$OffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m2701boximpl(m237invoketuRUvjQ((AnimationVector2D) obj));
    }

    /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
    public final long m237invoketuRUvjQ(AnimationVector2D it) {
        AbstractC3292y.i(it, "it");
        return OffsetKt.Offset(it.getV1(), it.getV2());
    }
}
