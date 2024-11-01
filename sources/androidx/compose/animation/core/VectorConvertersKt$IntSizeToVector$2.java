package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntSizeToVector$2 extends AbstractC3293z implements Function1 {
    public static final VectorConvertersKt$IntSizeToVector$2 INSTANCE = new VectorConvertersKt$IntSizeToVector$2();

    VectorConvertersKt$IntSizeToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m5313boximpl(m235invokeYEO4UFw((AnimationVector2D) obj));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m235invokeYEO4UFw(AnimationVector2D it) {
        AbstractC3292y.i(it, "it");
        return IntSizeKt.IntSize(AbstractC2829a.d(it.getV1()), AbstractC2829a.d(it.getV2()));
    }
}
