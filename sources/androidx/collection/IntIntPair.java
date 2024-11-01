package androidx.collection;

/* loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m92boximpl(long j8) {
        return new IntIntPair(j8);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m93component1impl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m94component2impl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m96constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m97equalsimpl(long j8, Object obj) {
        return (obj instanceof IntIntPair) && j8 == ((IntIntPair) obj).m103unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m98equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m99getFirstimpl(long j8) {
        return (int) (j8 >> 32);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m100getSecondimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m101hashCodeimpl(long j8) {
        return a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m102toStringimpl(long j8) {
        return '(' + m99getFirstimpl(j8) + ", " + m100getSecondimpl(j8) + ')';
    }

    public boolean equals(Object obj) {
        return m97equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m101hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m102toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m103unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m95constructorimpl(int i8, int i9) {
        return m96constructorimpl((i9 & 4294967295L) | (i8 << 32));
    }
}
