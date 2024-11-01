package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$OffsetToVector$1 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$OffsetToVector$1 INSTANCE = new VectorConvertersKt$OffsetToVector$1();

    VectorConvertersKt$OffsetToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m236invokek4lQ0M(((Offset) obj).m2722unboximpl());
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final AnimationVector2D m236invokek4lQ0M(long j8) {
        return new AnimationVector2D(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8));
    }
}
