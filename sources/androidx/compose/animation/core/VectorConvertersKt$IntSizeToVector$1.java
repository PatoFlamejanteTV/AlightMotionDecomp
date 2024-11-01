package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntSizeToVector$1 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$IntSizeToVector$1 INSTANCE = new VectorConvertersKt$IntSizeToVector$1();

    VectorConvertersKt$IntSizeToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m234invokeozmzZPI(((IntSize) obj).m5325unboximpl());
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final AnimationVector2D m234invokeozmzZPI(long j8) {
        return new AnimationVector2D(IntSize.m5321getWidthimpl(j8), IntSize.m5320getHeightimpl(j8));
    }
}
