package androidx.compose.animation.core;

import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$1 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$DpOffsetToVector$1 INSTANCE = new VectorConvertersKt$DpOffsetToVector$1();

    VectorConvertersKt$DpOffsetToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m228invokejoFl9I(((DpOffset) obj).m5224unboximpl());
    }

    /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
    public final AnimationVector2D m228invokejoFl9I(long j8) {
        return new AnimationVector2D(DpOffset.m5216getXD9Ej5fM(j8), DpOffset.m5218getYD9Ej5fM(j8));
    }
}
