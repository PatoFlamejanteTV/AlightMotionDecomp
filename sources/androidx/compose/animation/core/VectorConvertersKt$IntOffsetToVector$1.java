package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntOffsetToVector$1 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$IntOffsetToVector$1 INSTANCE = new VectorConvertersKt$IntOffsetToVector$1();

    VectorConvertersKt$IntOffsetToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m232invokegyyYBs(((IntOffset) obj).m5288unboximpl());
    }

    /* renamed from: invoke--gyyYBs, reason: not valid java name */
    public final AnimationVector2D m232invokegyyYBs(long j8) {
        return new AnimationVector2D(IntOffset.m5279getXimpl(j8), IntOffset.m5280getYimpl(j8));
    }
}
