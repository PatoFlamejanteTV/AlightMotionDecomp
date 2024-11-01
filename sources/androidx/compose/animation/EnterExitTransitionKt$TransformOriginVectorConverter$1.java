package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends AbstractC3293z implements Function1 {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$1();

    EnterExitTransitionKt$TransformOriginVectorConverter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m142invoke__ExYCQ(((TransformOrigin) obj).m3315unboximpl());
    }

    /* renamed from: invoke-__ExYCQ, reason: not valid java name */
    public final AnimationVector2D m142invoke__ExYCQ(long j8) {
        return new AnimationVector2D(TransformOrigin.m3311getPivotFractionXimpl(j8), TransformOrigin.m3312getPivotFractionYimpl(j8));
    }
}
