package androidx.compose.animation.core;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m193boximpl(long j8) {
        return new Motion(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m194constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-XB9eQnU, reason: not valid java name */
    public static final long m195copyXB9eQnU(long j8, float f8, float f9) {
        return SpringSimulationKt.Motion(f8, f9);
    }

    /* renamed from: copy-XB9eQnU$default, reason: not valid java name */
    public static /* synthetic */ long m196copyXB9eQnU$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m199getValueimpl(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m200getVelocityimpl(j8);
        }
        return m195copyXB9eQnU(j8, f8, f9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m197equalsimpl(long j8, Object obj) {
        return (obj instanceof Motion) && j8 == ((Motion) obj).m203unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m198equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m199getValueimpl(long j8) {
        r rVar = r.f34602a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m200getVelocityimpl(long j8) {
        r rVar = r.f34602a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m201hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m202toStringimpl(long j8) {
        return "Motion(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m197equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m201hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m202toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m203unboximpl() {
        return this.packedValue;
    }
}
