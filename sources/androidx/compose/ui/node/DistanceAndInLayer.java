package androidx.compose.ui.node;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class DistanceAndInLayer {
    private final long packedValue;

    private /* synthetic */ DistanceAndInLayer(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndInLayer m4213boximpl(long j8) {
        return new DistanceAndInLayer(j8);
    }

    /* renamed from: compareTo-S_HNhKs, reason: not valid java name */
    public static final int m4214compareToS_HNhKs(long j8, long j9) {
        boolean m4220isInLayerimpl = m4220isInLayerimpl(j8);
        if (m4220isInLayerimpl != m4220isInLayerimpl(j9)) {
            if (m4220isInLayerimpl) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(m4218getDistanceimpl(j8) - m4218getDistanceimpl(j9));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4215constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4216equalsimpl(long j8, Object obj) {
        return (obj instanceof DistanceAndInLayer) && j8 == ((DistanceAndInLayer) obj).m4222unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4217equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m4218getDistanceimpl(long j8) {
        r rVar = r.f34602a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4219hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m4220isInLayerimpl(long j8) {
        return ((int) (j8 & 4294967295L)) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4221toStringimpl(long j8) {
        return "DistanceAndInLayer(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m4216equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m4219hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4221toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4222unboximpl() {
        return this.packedValue;
    }
}
