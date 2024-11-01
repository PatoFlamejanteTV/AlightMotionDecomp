package androidx.compose.foundation.lazy.staggeredgrid;

/* loaded from: classes.dex */
public final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m767boximpl(long j8) {
        return new SpanRange(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m769constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m770equalsimpl(long j8, Object obj) {
        return (obj instanceof SpanRange) && j8 == ((SpanRange) obj).m777unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m771equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m772getEndimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m773getSizeimpl(long j8) {
        return ((int) (4294967295L & j8)) - ((int) (j8 >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m774getStartimpl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m775hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m776toStringimpl(long j8) {
        return "SpanRange(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m770equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m775hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m776toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m777unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m768constructorimpl(int i8, int i9) {
        return m769constructorimpl(((i9 + i8) & 4294967295L) | (i8 << 32));
    }
}
