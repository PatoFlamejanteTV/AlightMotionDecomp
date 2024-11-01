package androidx.compose.ui.geometry;

import androidx.collection.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.r;

@Immutable
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = SizeKt.Size(0.0f, 0.0f);
    private static final long Unspecified = SizeKt.Size(Float.NaN, Float.NaN);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2787getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2788getZeroNHjbRc$annotations() {
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m2789getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m2790getZeroNHjbRc() {
            return Size.Zero;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ Size(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m2769boximpl(long j8) {
        return new Size(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2770component1impl(long j8) {
        return m2781getWidthimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2771component2impl(long j8) {
        return m2778getHeightimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2772constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m2773copyxjbvk4A(long j8, float f8, float f9) {
        return SizeKt.Size(f8, f9);
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m2774copyxjbvk4A$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m2781getWidthimpl(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m2778getHeightimpl(j8);
        }
        return m2773copyxjbvk4A(j8, f8, f9);
    }

    @Stable
    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m2775div7Ah8Wj8(long j8, float f8) {
        return SizeKt.Size(m2781getWidthimpl(j8) / f8, m2778getHeightimpl(j8) / f8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2776equalsimpl(long j8, Object obj) {
        return (obj instanceof Size) && j8 == ((Size) obj).m2786unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2777equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m2778getHeightimpl(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f34602a;
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m2779getMaxDimensionimpl(long j8) {
        return Math.max(Math.abs(m2781getWidthimpl(j8)), Math.abs(m2778getHeightimpl(j8)));
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m2780getMinDimensionimpl(long j8) {
        return Math.min(Math.abs(m2781getWidthimpl(j8)), Math.abs(m2778getHeightimpl(j8)));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m2781getWidthimpl(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f34602a;
            return Float.intBitsToFloat((int) (j8 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2782hashCodeimpl(long j8) {
        return a.a(j8);
    }

    @Stable
    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m2783isEmptyimpl(long j8) {
        if (m2781getWidthimpl(j8) > 0.0f && m2778getHeightimpl(j8) > 0.0f) {
            return false;
        }
        return true;
    }

    @Stable
    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m2784times7Ah8Wj8(long j8, float f8) {
        return SizeKt.Size(m2781getWidthimpl(j8) * f8, m2778getHeightimpl(j8) * f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2785toStringimpl(long j8) {
        if (j8 != Companion.m2789getUnspecifiedNHjbRc()) {
            return "Size(" + GeometryUtilsKt.toStringAsFixed(m2781getWidthimpl(j8), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m2778getHeightimpl(j8), 1) + ')';
        }
        return "Size.Unspecified";
    }

    public boolean equals(Object obj) {
        return m2776equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2782hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2785toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2786unboximpl() {
        return this.packedValue;
    }
}
