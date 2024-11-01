package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.r;

@Immutable
/* loaded from: classes.dex */
public final class Velocity {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = VelocityKt.Velocity(0.0f, 0.0f);
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m5396getZero9UxMQ8M$annotations() {
        }

        /* renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m5397getZero9UxMQ8M() {
            return Velocity.Zero;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ Velocity(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m5377boximpl(long j8) {
        return new Velocity(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5378component1impl(long j8) {
        return m5386getXimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5379component2impl(long j8) {
        return m5387getYimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5380constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m5381copyOhffZ5M(long j8, float f8, float f9) {
        return VelocityKt.Velocity(f8, f9);
    }

    /* renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m5382copyOhffZ5M$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m5386getXimpl(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m5387getYimpl(j8);
        }
        return m5381copyOhffZ5M(j8, f8, f9);
    }

    @Stable
    /* renamed from: div-adjELrA, reason: not valid java name */
    public static final long m5383divadjELrA(long j8, float f8) {
        return VelocityKt.Velocity(m5386getXimpl(j8) / f8, m5387getYimpl(j8) / f8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5384equalsimpl(long j8, Object obj) {
        return (obj instanceof Velocity) && j8 == ((Velocity) obj).m5395unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5385equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m5386getXimpl(long j8) {
        r rVar = r.f34602a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m5387getYimpl(long j8) {
        r rVar = r.f34602a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5388hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    @Stable
    /* renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m5389minusAH228Gc(long j8, long j9) {
        return VelocityKt.Velocity(m5386getXimpl(j8) - m5386getXimpl(j9), m5387getYimpl(j8) - m5387getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m5390plusAH228Gc(long j8, long j9) {
        return VelocityKt.Velocity(m5386getXimpl(j8) + m5386getXimpl(j9), m5387getYimpl(j8) + m5387getYimpl(j9));
    }

    @Stable
    /* renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m5391remadjELrA(long j8, float f8) {
        return VelocityKt.Velocity(m5386getXimpl(j8) % f8, m5387getYimpl(j8) % f8);
    }

    @Stable
    /* renamed from: times-adjELrA, reason: not valid java name */
    public static final long m5392timesadjELrA(long j8, float f8) {
        return VelocityKt.Velocity(m5386getXimpl(j8) * f8, m5387getYimpl(j8) * f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5393toStringimpl(long j8) {
        return '(' + m5386getXimpl(j8) + ", " + m5387getYimpl(j8) + ") px/sec";
    }

    @Stable
    /* renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m5394unaryMinus9UxMQ8M(long j8) {
        return VelocityKt.Velocity(-m5386getXimpl(j8), -m5387getYimpl(j8));
    }

    public boolean equals(Object obj) {
        return m5384equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5388hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5393toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5395unboximpl() {
        return this.packedValue;
    }
}
