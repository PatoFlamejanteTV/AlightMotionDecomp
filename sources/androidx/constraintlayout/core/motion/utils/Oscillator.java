package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double[] mArea;
    MonotonicCurveFit mCustomCurve;
    String mCustomType;
    int mType;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    double PI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public void addPoint(double d8, float f8) {
        int length = this.mPeriod.length + 1;
        int binarySearch = Arrays.binarySearch(this.mPosition, d8);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.mPosition[binarySearch] = d8;
        this.mPeriod[binarySearch] = f8;
        this.mNormalized = false;
    }

    double getDP(double d8) {
        if (d8 <= 0.0d) {
            d8 = 1.0E-5d;
        } else if (d8 >= 1.0d) {
            d8 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d8);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i8 = -binarySearch;
        int i9 = i8 - 1;
        float[] fArr = this.mPeriod;
        float f8 = fArr[i9];
        int i10 = i8 - 2;
        float f9 = fArr[i10];
        double[] dArr = this.mPosition;
        double d9 = dArr[i9];
        double d10 = dArr[i10];
        double d11 = (f8 - f9) / (d9 - d10);
        return (d8 * d11) + (f9 - (d11 * d10));
    }

    double getP(double d8) {
        if (d8 < 0.0d) {
            d8 = 0.0d;
        } else if (d8 > 1.0d) {
            d8 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d8);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i8 = -binarySearch;
        int i9 = i8 - 1;
        float[] fArr = this.mPeriod;
        float f8 = fArr[i9];
        int i10 = i8 - 2;
        float f9 = fArr[i10];
        double[] dArr = this.mPosition;
        double d9 = dArr[i9];
        double d10 = dArr[i10];
        double d11 = (f8 - f9) / (d9 - d10);
        return this.mArea[i10] + ((f9 - (d11 * d10)) * (d8 - d10)) + ((d11 * ((d8 * d8) - (d10 * d10))) / 2.0d);
    }

    public double getSlope(double d8, double d9, double d10) {
        double p8 = d9 + getP(d8);
        double dp = getDP(d8) + d10;
        switch (this.mType) {
            case 1:
                return 0.0d;
            case 2:
                return dp * 4.0d * Math.signum((((p8 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dp * 2.0d;
            case 4:
                return (-dp) * 2.0d;
            case 5:
                double d11 = this.PI2;
                return (-d11) * dp * Math.sin(d11 * p8);
            case 6:
                return dp * 4.0d * ((((p8 * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.mCustomCurve.getSlope(p8 % 1.0d, 0);
            default:
                double d12 = this.PI2;
                return dp * d12 * Math.cos(d12 * p8);
        }
    }

    public double getValue(double d8, double d9) {
        double abs;
        double p8 = getP(d8) + d9;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (p8 % 1.0d));
            case 2:
                abs = Math.abs((((p8 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((p8 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((p8 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.PI2 * (d9 + p8));
            case 6:
                double abs2 = 1.0d - Math.abs(((p8 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.mCustomCurve.getPos(p8 % 1.0d, 0);
            default:
                return Math.sin(this.PI2 * p8);
        }
        return 1.0d - abs;
    }

    public void normalize() {
        double d8 = 0.0d;
        int i8 = 0;
        while (true) {
            if (i8 >= this.mPeriod.length) {
                break;
            }
            d8 += r7[i8];
            i8++;
        }
        double d9 = 0.0d;
        int i9 = 1;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i9 >= fArr.length) {
                break;
            }
            int i10 = i9 - 1;
            float f8 = (fArr[i10] + fArr[i9]) / 2.0f;
            double[] dArr = this.mPosition;
            d9 += (dArr[i9] - dArr[i10]) * f8;
            i9++;
        }
        int i11 = 0;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i11 >= fArr2.length) {
                break;
            }
            fArr2[i11] = (float) (fArr2[i11] * (d8 / d9));
            i11++;
        }
        this.mArea[0] = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i12 < fArr3.length) {
                int i13 = i12 - 1;
                float f9 = (fArr3[i13] + fArr3[i12]) / 2.0f;
                double[] dArr2 = this.mPosition;
                double d10 = dArr2[i12] - dArr2[i13];
                double[] dArr3 = this.mArea;
                dArr3[i12] = dArr3[i13] + (d10 * f9);
                i12++;
            } else {
                this.mNormalized = true;
                return;
            }
        }
    }

    public void setType(int i8, String str) {
        this.mType = i8;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }
}
