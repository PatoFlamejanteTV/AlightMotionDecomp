package androidx.compose.animation.core;

import Q5.r;
import Q5.x;
import R5.Q;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3291x;

/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;
    private static final Rect rectVisibilityThreshold;
    private static final Map<TwoWayConverter<?, ?>, Float> visibilityThresholdMap;

    static {
        Float valueOf = Float.valueOf(0.5f);
        rectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C3291x.f34603a);
        Float valueOf2 = Float.valueOf(1.0f);
        r a9 = x.a(vectorConverter, valueOf2);
        r a10 = x.a(VectorConvertersKt.getVectorConverter(IntSize.Companion), valueOf2);
        r a11 = x.a(VectorConvertersKt.getVectorConverter(IntOffset.Companion), valueOf2);
        r a12 = x.a(VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.r.f34602a), Float.valueOf(0.01f));
        r a13 = x.a(VectorConvertersKt.getVectorConverter(Rect.Companion), valueOf);
        r a14 = x.a(VectorConvertersKt.getVectorConverter(Size.Companion), valueOf);
        r a15 = x.a(VectorConvertersKt.getVectorConverter(Offset.Companion), valueOf);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(Dp.Companion);
        Float valueOf3 = Float.valueOf(0.1f);
        visibilityThresholdMap = Q.k(a9, a10, a11, a12, a13, a14, a15, x.a(vectorConverter2, valueOf3), x.a(VectorConvertersKt.getVectorConverter(DpOffset.Companion), valueOf3));
    }

    public static final int getVisibilityThreshold(C3291x c3291x) {
        AbstractC3292y.i(c3291x, "<this>");
        return 1;
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return visibilityThresholdMap;
    }

    public static final long getVisibilityThreshold(IntOffset.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return IntOffsetKt.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(Offset.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(DpOffset.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        Dp.Companion companion2 = Dp.Companion;
        return DpKt.m5176DpOffsetYgX7TsA(getVisibilityThreshold(companion2), getVisibilityThreshold(companion2));
    }

    public static final long getVisibilityThreshold(Size.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(IntSize.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return IntSizeKt.IntSize(1, 1);
    }

    public static final Rect getVisibilityThreshold(Rect.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return rectVisibilityThreshold;
    }

    public static final float getVisibilityThreshold(Dp.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return Dp.m5155constructorimpl(0.1f);
    }
}
