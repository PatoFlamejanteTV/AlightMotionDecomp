package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3291x;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class VectorConvertersKt {
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(VectorConvertersKt$FloatToVector$1.INSTANCE, VectorConvertersKt$FloatToVector$2.INSTANCE);
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(VectorConvertersKt$IntToVector$1.INSTANCE, VectorConvertersKt$IntToVector$2.INSTANCE);
    private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(VectorConvertersKt$DpToVector$1.INSTANCE, VectorConvertersKt$DpToVector$2.INSTANCE);
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(VectorConvertersKt$DpOffsetToVector$1.INSTANCE, VectorConvertersKt$DpOffsetToVector$2.INSTANCE);
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(VectorConvertersKt$SizeToVector$1.INSTANCE, VectorConvertersKt$SizeToVector$2.INSTANCE);
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(VectorConvertersKt$OffsetToVector$1.INSTANCE, VectorConvertersKt$OffsetToVector$2.INSTANCE);
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(VectorConvertersKt$IntOffsetToVector$1.INSTANCE, VectorConvertersKt$IntOffsetToVector$2.INSTANCE);
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(VectorConvertersKt$IntSizeToVector$1.INSTANCE, VectorConvertersKt$IntSizeToVector$2.INSTANCE);
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(VectorConvertersKt$RectToVector$1.INSTANCE, VectorConvertersKt$RectToVector$2.INSTANCE);

    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(Function1 convertToVector, Function1 convertFromVector) {
        AbstractC3292y.i(convertToVector, "convertToVector");
        AbstractC3292y.i(convertFromVector, "convertFromVector");
        return new TwoWayConverterImpl(convertToVector, convertFromVector);
    }

    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(r rVar) {
        AbstractC3292y.i(rVar, "<this>");
        return FloatToVector;
    }

    public static final float lerp(float f8, float f9, float f10) {
        return (f8 * (1 - f10)) + (f9 * f10);
    }

    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(C3291x c3291x) {
        AbstractC3292y.i(c3291x, "<this>");
        return IntToVector;
    }

    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(Rect.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return RectToVector;
    }

    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(Dp.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return DpToVector;
    }

    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(DpOffset.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return DpOffsetToVector;
    }

    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(Size.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return SizeToVector;
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(Offset.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return OffsetToVector;
    }

    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(IntOffset.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return IntOffsetToVector;
    }

    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(IntSize.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return IntSizeToVector;
    }
}
