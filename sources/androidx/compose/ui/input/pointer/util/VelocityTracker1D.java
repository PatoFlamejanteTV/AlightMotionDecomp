package androidx.compose.ui.input.pointer.util;

import Q5.p;
import R5.AbstractC1428l;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VelocityTracker1D {
    public static final int $stable = 8;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;
    private final float[] reusableDataPointsArray;
    private final float[] reusableTimeArray;
    private final float[] reusableVelocityCoefficients;
    private final DataPointAtTime[] samples;
    private final Strategy strategy;

    /* loaded from: classes.dex */
    public enum Strategy {
        Lsq2,
        Impulse
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final float calculateLeastSquaresVelocity(float[] fArr, float[] fArr2, int i8) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(fArr2, fArr, i8, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void addDataPoint(long j8, float f8) {
        int i8 = (this.index + 1) % 20;
        this.index = i8;
        VelocityTrackerKt.set(this.samples, i8, j8, f8);
    }

    public final float calculateVelocity() {
        float calculateImpulseVelocity;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i8 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i8];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i9 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i8];
            if (dataPointAtTime3 != null) {
                float time = (float) (dataPointAtTime.getTime() - dataPointAtTime3.getTime());
                float abs = (float) Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i9] = dataPointAtTime3.getDataPoint();
                fArr2[i9] = -time;
                if (i8 == 0) {
                    i8 = 20;
                }
                i8--;
                i9++;
                if (i9 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime3;
            } else {
                break;
            }
        }
        if (i9 < this.minSampleSize) {
            return 0.0f;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i10 == 1) {
            calculateImpulseVelocity = VelocityTrackerKt.calculateImpulseVelocity(fArr, fArr2, i9, this.isDataDifferential);
        } else {
            if (i10 != 2) {
                throw new p();
            }
            calculateImpulseVelocity = calculateLeastSquaresVelocity(fArr, fArr2, i9);
        }
        return calculateImpulseVelocity * 1000;
    }

    public final boolean isDataDifferential() {
        return this.isDataDifferential;
    }

    public final void resetTracking() {
        AbstractC1428l.x(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public VelocityTracker1D(boolean z8, Strategy strategy) {
        this.isDataDifferential = z8;
        this.strategy = strategy;
        if (z8 && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i9 = 2;
        if (i8 != 1) {
            if (i8 != 2) {
                throw new p();
            }
            i9 = 3;
        }
        this.minSampleSize = i9;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public /* synthetic */ VelocityTracker1D(boolean z8, Strategy strategy, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public final float calculateVelocity(float f8) {
        if (f8 > 0.0f) {
            float calculateVelocity = calculateVelocity();
            if (calculateVelocity == 0.0f) {
                return 0.0f;
            }
            if (calculateVelocity > 0.0f) {
                return m.f(calculateVelocity, f8);
            }
            return m.c(calculateVelocity, -f8);
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + f8).toString());
    }

    public VelocityTracker1D(boolean z8) {
        this(z8, Strategy.Impulse);
    }
}
