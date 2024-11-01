package androidx.collection;

/* loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m80boximpl(long j8) {
        return new FloatFloatPair(j8);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m81component1impl(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m82component2impl(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m84constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m85equalsimpl(long j8, Object obj) {
        return (obj instanceof FloatFloatPair) && j8 == ((FloatFloatPair) obj).m91unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m86equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m87getFirstimpl(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m88getSecondimpl(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m89hashCodeimpl(long j8) {
        return a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m90toStringimpl(long j8) {
        return '(' + Float.intBitsToFloat((int) (j8 >> 32)) + ", " + Float.intBitsToFloat((int) (j8 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m85equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m89hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m90toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m91unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m83constructorimpl(float f8, float f9) {
        return m84constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }
}
