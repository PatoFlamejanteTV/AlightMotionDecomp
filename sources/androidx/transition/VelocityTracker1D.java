package androidx.transition;

import java.util.Arrays;

/* loaded from: classes3.dex */
class VelocityTracker1D {
    private static final int ASSUME_POINTER_MOVE_STOPPED_MILLIS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final int HORIZON_MILLIS = 100;
    private float[] mDataSamples = new float[20];
    private int mIndex = 0;
    private long[] mTimeSamples;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VelocityTracker1D() {
        long[] jArr = new long[20];
        this.mTimeSamples = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float kineticEnergyToVelocity(float f8) {
        return (float) (Math.signum(f8) * Math.sqrt(Math.abs(f8) * 2.0f));
    }

    public void addDataPoint(long j8, float f8) {
        int i8 = (this.mIndex + 1) % 20;
        this.mIndex = i8;
        this.mTimeSamples[i8] = j8;
        this.mDataSamples[i8] = f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float calculateVelocity() {
        float kineticEnergyToVelocity;
        int i8 = this.mIndex;
        if (i8 == 0 && this.mTimeSamples[i8] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j8 = this.mTimeSamples[i8];
        int i9 = 0;
        long j9 = j8;
        while (true) {
            long j10 = this.mTimeSamples[i8];
            if (j10 == Long.MIN_VALUE) {
                break;
            }
            float f8 = (float) (j8 - j10);
            float abs = (float) Math.abs(j10 - j9);
            if (f8 > 100.0f || abs > 40.0f) {
                break;
            }
            if (i8 == 0) {
                i8 = 20;
            }
            i8--;
            i9++;
            if (i9 >= 20) {
                break;
            }
            j9 = j10;
        }
        if (i9 < 2) {
            return 0.0f;
        }
        if (i9 == 2) {
            int i10 = this.mIndex;
            int i11 = i10 == 0 ? 19 : i10 - 1;
            long[] jArr = this.mTimeSamples;
            float f9 = (float) (jArr[i10] - jArr[i11]);
            if (f9 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.mDataSamples;
            kineticEnergyToVelocity = (fArr[i10] - fArr[i11]) / f9;
        } else {
            int i12 = this.mIndex;
            int i13 = ((i12 - i9) + 21) % 20;
            int i14 = (i12 + 21) % 20;
            long j11 = this.mTimeSamples[i13];
            float f10 = this.mDataSamples[i13];
            int i15 = i13 + 1;
            float f11 = 0.0f;
            for (int i16 = i15 % 20; i16 != i14; i16 = (i16 + 1) % 20) {
                long j12 = this.mTimeSamples[i16];
                float f12 = (float) (j12 - j11);
                if (f12 != 0.0f) {
                    float f13 = this.mDataSamples[i16];
                    float f14 = (f13 - f10) / f12;
                    f11 += (f14 - kineticEnergyToVelocity(f11)) * Math.abs(f14);
                    if (i16 == i15) {
                        f11 *= 0.5f;
                    }
                    f10 = f13;
                    j11 = j12;
                }
            }
            kineticEnergyToVelocity = kineticEnergyToVelocity(f11);
        }
        return kineticEnergyToVelocity * 1000.0f;
    }

    public void resetTracking() {
        this.mIndex = 0;
        Arrays.fill(this.mTimeSamples, Long.MIN_VALUE);
        Arrays.fill(this.mDataSamples, 0.0f);
    }
}
