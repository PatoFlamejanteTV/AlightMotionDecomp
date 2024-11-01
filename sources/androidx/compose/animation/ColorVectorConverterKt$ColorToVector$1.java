package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ColorVectorConverterKt$ColorToVector$1 extends AbstractC3293z implements Function1 {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m136invoke8_81llA(((Color) obj).m2958unboximpl());
        }

        /* renamed from: invoke-8_81llA, reason: not valid java name */
        public final AnimationVector4D m136invoke8_81llA(long j8) {
            long m2945convertvNxB06k = Color.m2945convertvNxB06k(j8, ColorSpaces.INSTANCE.getOklab());
            return new AnimationVector4D(Color.m2942component4impl(m2945convertvNxB06k), Color.m2939component1impl(m2945convertvNxB06k), Color.m2940component2impl(m2945convertvNxB06k), Color.m2941component3impl(m2945convertvNxB06k));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        final /* synthetic */ ColorSpace $colorSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.$colorSpace = colorSpace;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Color.m2938boximpl(m137invokevNxB06k((AnimationVector4D) obj));
        }

        /* renamed from: invoke-vNxB06k, reason: not valid java name */
        public final long m137invokevNxB06k(AnimationVector4D vector) {
            AbstractC3292y.i(vector, "vector");
            return Color.m2945convertvNxB06k(ColorKt.Color(m.j(vector.getV2(), 0.0f, 1.0f), m.j(vector.getV3(), -0.5f, 0.5f), m.j(vector.getV4(), -0.5f, 0.5f), m.j(vector.getV1(), 0.0f, 1.0f), ColorSpaces.INSTANCE.getOklab()), this.$colorSpace);
        }
    }

    ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TwoWayConverter<Color, AnimationVector4D> invoke(ColorSpace colorSpace) {
        AbstractC3292y.i(colorSpace, "colorSpace");
        return VectorConvertersKt.TwoWayConverter(AnonymousClass1.INSTANCE, new AnonymousClass2(colorSpace));
    }
}
