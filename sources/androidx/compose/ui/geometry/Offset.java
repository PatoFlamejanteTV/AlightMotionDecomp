package androidx.compose.ui.geometry;

import androidx.collection.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.r;

@Immutable
/* loaded from: classes.dex */
public final class Offset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = OffsetKt.Offset(0.0f, 0.0f);
    private static final long Infinite = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long Unspecified = OffsetKt.Offset(Float.NaN, Float.NaN);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m2723getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m2724getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m2725getZeroF1C5BW0$annotations() {
        }

        /* renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m2726getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m2727getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m2728getZeroF1C5BW0() {
            return Offset.Zero;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ Offset(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m2701boximpl(long j8) {
        return new Offset(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2702component1impl(long j8) {
        return m2712getXimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2703component2impl(long j8) {
        return m2713getYimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2704constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m2705copydBAh8RU(long j8, float f8, float f9) {
        return OffsetKt.Offset(f8, f9);
    }

    /* renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m2706copydBAh8RU$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m2712getXimpl(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m2713getYimpl(j8);
        }
        return m2705copydBAh8RU(j8, f8, f9);
    }

    @Stable
    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m2707divtuRUvjQ(long j8, float f8) {
        return OffsetKt.Offset(m2712getXimpl(j8) / f8, m2713getYimpl(j8) / f8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2708equalsimpl(long j8, Object obj) {
        return (obj instanceof Offset) && j8 == ((Offset) obj).m2722unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2709equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    @Stable
    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m2710getDistanceimpl(long j8) {
        return (float) Math.sqrt((m2712getXimpl(j8) * m2712getXimpl(j8)) + (m2713getYimpl(j8) * m2713getYimpl(j8)));
    }

    @Stable
    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m2711getDistanceSquaredimpl(long j8) {
        return (m2712getXimpl(j8) * m2712getXimpl(j8)) + (m2713getYimpl(j8) * m2713getYimpl(j8));
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m2712getXimpl(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f34602a;
            return Float.intBitsToFloat((int) (j8 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m2713getYimpl(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f34602a;
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2714hashCodeimpl(long j8) {
        return a.a(j8);
    }

    @Stable
    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m2715isValidimpl(long j8) {
        if (!Float.isNaN(m2712getXimpl(j8)) && !Float.isNaN(m2713getYimpl(j8))) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    @Stable
    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m2716minusMKHz9U(long j8, long j9) {
        return OffsetKt.Offset(m2712getXimpl(j8) - m2712getXimpl(j9), m2713getYimpl(j8) - m2713getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m2717plusMKHz9U(long j8, long j9) {
        return OffsetKt.Offset(m2712getXimpl(j8) + m2712getXimpl(j9), m2713getYimpl(j8) + m2713getYimpl(j9));
    }

    @Stable
    /* renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m2718remtuRUvjQ(long j8, float f8) {
        return OffsetKt.Offset(m2712getXimpl(j8) % f8, m2713getYimpl(j8) % f8);
    }

    @Stable
    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m2719timestuRUvjQ(long j8, float f8) {
        return OffsetKt.Offset(m2712getXimpl(j8) * f8, m2713getYimpl(j8) * f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2720toStringimpl(long j8) {
        if (OffsetKt.m2731isSpecifiedk4lQ0M(j8)) {
            return "Offset(" + GeometryUtilsKt.toStringAsFixed(m2712getXimpl(j8), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m2713getYimpl(j8), 1) + ')';
        }
        return "Offset.Unspecified";
    }

    @Stable
    /* renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m2721unaryMinusF1C5BW0(long j8) {
        return OffsetKt.Offset(-m2712getXimpl(j8), -m2713getYimpl(j8));
    }

    public boolean equals(Object obj) {
        return m2708equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2714hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2720toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2722unboximpl() {
        return this.packedValue;
    }
}
