package androidx.compose.foundation.layout;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final float[] SplinePositions = new float[101];
    private static final float[] SplineTimes = new float[101];

    /* loaded from: classes.dex */
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j8) {
            this.packedValue = j8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m482boximpl(long j8) {
            return new FlingResult(j8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m483constructorimpl(long j8) {
            return j8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m484equalsimpl(long j8, Object obj) {
            return (obj instanceof FlingResult) && j8 == ((FlingResult) obj).m490unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m485equalsimpl0(long j8, long j9) {
            return j8 == j9;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m486getDistanceCoefficientimpl(long j8) {
            r rVar = r.f34602a;
            return Float.intBitsToFloat((int) (j8 >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m487getVelocityCoefficientimpl(long j8) {
            r rVar = r.f34602a;
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m488hashCodeimpl(long j8) {
            return androidx.collection.a.a(j8);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m489toStringimpl(long j8) {
            return "FlingResult(packedValue=" + j8 + ')';
        }

        public boolean equals(Object obj) {
            return m484equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m488hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m489toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m490unboximpl() {
            return this.packedValue;
        }
    }

    static {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i8 = 0; i8 < 100; i8++) {
            float f18 = i8 / 100;
            float f19 = 1.0f;
            while (true) {
                f8 = ((f19 - f16) / 2.0f) + f16;
                f9 = 1.0f - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float f20 = (((f9 * 0.175f) + (f8 * 0.35000002f)) * f10) + f11;
                if (Math.abs(f20 - f18) < 1.0E-5d) {
                    break;
                } else if (f20 > f18) {
                    f19 = f8;
                } else {
                    f16 = f8;
                }
            }
            float f21 = 0.5f;
            SplinePositions[i8] = (f10 * ((f9 * 0.5f) + f8)) + f11;
            float f22 = 1.0f;
            while (true) {
                f12 = ((f22 - f17) / 2.0f) + f17;
                f13 = 1.0f - f12;
                f14 = f12 * 3.0f * f13;
                f15 = f12 * f12 * f12;
                float f23 = (((f13 * f21) + f12) * f14) + f15;
                if (Math.abs(f23 - f18) >= 1.0E-5d) {
                    if (f23 > f18) {
                        f22 = f12;
                    } else {
                        f17 = f12;
                    }
                    f21 = 0.5f;
                }
            }
            SplineTimes[i8] = (f14 * ((f13 * 0.175f) + (f12 * 0.35000002f))) + f15;
        }
        SplineTimes[100] = 1.0f;
        SplinePositions[100] = 1.0f;
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f8, float f9) {
        return Math.log((Math.abs(f8) * 0.35f) / f9);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m481flingPositionLfoxSSI(float f8) {
        float f9;
        float f10;
        float f11 = 100;
        int i8 = (int) (f11 * f8);
        if (i8 < 100) {
            float f12 = i8 / f11;
            int i9 = i8 + 1;
            float f13 = i9 / f11;
            float[] fArr = SplinePositions;
            float f14 = fArr[i8];
            f10 = (fArr[i9] - f14) / (f13 - f12);
            f9 = f14 + ((f8 - f12) * f10);
        } else {
            f9 = 1.0f;
            f10 = 0.0f;
        }
        return FlingResult.m483constructorimpl((Float.floatToIntBits(f10) & 4294967295L) | (Float.floatToIntBits(f9) << 32));
    }
}
