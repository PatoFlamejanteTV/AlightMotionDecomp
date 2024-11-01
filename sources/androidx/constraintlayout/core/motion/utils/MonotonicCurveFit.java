package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class MonotonicCurveFit extends CurveFit {
    private static final String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;
    private double[] mT;
    private double[][] mTangent;
    private double[][] mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        int i8 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i8, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i9 = 0; i9 < length2; i9++) {
            int i10 = 0;
            while (i10 < i8) {
                int i11 = i10 + 1;
                double d8 = dArr[i11] - dArr[i10];
                double[] dArr5 = dArr3[i10];
                double d9 = (dArr2[i11][i9] - dArr2[i10][i9]) / d8;
                dArr5[i9] = d9;
                if (i10 == 0) {
                    dArr4[i10][i9] = d9;
                } else {
                    dArr4[i10][i9] = (dArr3[i10 - 1][i9] + d9) * 0.5d;
                }
                i10 = i11;
            }
            dArr4[i8][i9] = dArr3[length - 2][i9];
        }
        for (int i12 = 0; i12 < i8; i12++) {
            for (int i13 = 0; i13 < length2; i13++) {
                double d10 = dArr3[i12][i13];
                if (d10 == 0.0d) {
                    dArr4[i12][i13] = 0.0d;
                    dArr4[i12 + 1][i13] = 0.0d;
                } else {
                    double d11 = dArr4[i12][i13] / d10;
                    int i14 = i12 + 1;
                    double d12 = dArr4[i14][i13] / d10;
                    double hypot = Math.hypot(d11, d12);
                    if (hypot > 9.0d) {
                        double d13 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i12];
                        double[] dArr7 = dArr3[i12];
                        dArr6[i13] = d11 * d13 * dArr7[i13];
                        dArr4[i14][i13] = d13 * d12 * dArr7[i13];
                    }
                }
            }
        }
        this.mT = dArr;
        this.mY = dArr2;
        this.mTangent = dArr4;
    }

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i8 = 0;
        while (indexOf2 != -1) {
            dArr[i8] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i8++;
        }
        dArr[i8] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return buildWave(Arrays.copyOf(dArr, i8 + 1));
    }

    private static double diff(double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14 = d9 * d9;
        double d15 = d9 * 6.0d;
        double d16 = 3.0d * d8;
        return ((((((((((-6.0d) * d14) * d11) + (d15 * d11)) + ((6.0d * d14) * d10)) - (d15 * d10)) + ((d16 * d13) * d14)) + ((d16 * d12) * d14)) - (((2.0d * d8) * d13) * d9)) - (((4.0d * d8) * d12) * d9)) + (d8 * d12);
    }

    private static double interpolate(double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14 = d9 * d9;
        double d15 = d14 * d9;
        double d16 = 3.0d * d14;
        double d17 = ((((((-2.0d) * d15) * d11) + (d16 * d11)) + ((d15 * 2.0d) * d10)) - (d16 * d10)) + d10;
        double d18 = d8 * d13;
        double d19 = d8 * d12;
        return ((((d17 + (d18 * d15)) + (d15 * d19)) - (d18 * d14)) - (((d8 * 2.0d) * d12) * d14)) + (d19 * d9);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d8, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int i8 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d9 = dArr2[0];
            if (d8 <= d9) {
                getSlope(d9, this.mSlopeTemp);
                for (int i9 = 0; i9 < length2; i9++) {
                    dArr[i9] = this.mY[0][i9] + ((d8 - this.mT[0]) * this.mSlopeTemp[i9]);
                }
                return;
            }
            int i10 = length - 1;
            double d10 = dArr2[i10];
            if (d8 >= d10) {
                getSlope(d10, this.mSlopeTemp);
                while (i8 < length2) {
                    dArr[i8] = this.mY[i10][i8] + ((d8 - this.mT[i10]) * this.mSlopeTemp[i8]);
                    i8++;
                }
                return;
            }
        } else {
            if (d8 <= dArr2[0]) {
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = this.mY[0][i11];
                }
                return;
            }
            int i12 = length - 1;
            if (d8 >= dArr2[i12]) {
                while (i8 < length2) {
                    dArr[i8] = this.mY[i12][i8];
                    i8++;
                }
                return;
            }
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d8 == this.mT[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.mY[i13][i14];
                }
            }
            double[] dArr3 = this.mT;
            int i15 = i13 + 1;
            double d11 = dArr3[i15];
            if (d8 < d11) {
                double d12 = dArr3[i13];
                double d13 = d11 - d12;
                double d14 = (d8 - d12) / d13;
                while (i8 < length2) {
                    double[][] dArr4 = this.mY;
                    double d15 = dArr4[i13][i8];
                    double d16 = dArr4[i15][i8];
                    double[][] dArr5 = this.mTangent;
                    dArr[i8] = interpolate(d13, d14, d15, d16, dArr5[i13][i8], dArr5[i15][i8]);
                    i8++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d8, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        double d9 = dArr2[0];
        if (d8 > d9) {
            d9 = dArr2[length - 1];
            if (d8 < d9) {
                d9 = d8;
            }
        }
        int i8 = 0;
        while (i8 < length - 1) {
            double[] dArr3 = this.mT;
            int i9 = i8 + 1;
            double d10 = dArr3[i9];
            if (d9 <= d10) {
                double d11 = dArr3[i8];
                double d12 = d10 - d11;
                double d13 = (d9 - d11) / d12;
                for (int i10 = 0; i10 < length2; i10++) {
                    double[][] dArr4 = this.mY;
                    double d14 = dArr4[i8][i10];
                    double d15 = dArr4[i9][i10];
                    double[][] dArr5 = this.mTangent;
                    dArr[i10] = diff(d12, d13, d14, d15, dArr5[i8][i10], dArr5[i9][i10]) / d12;
                }
                return;
            }
            i8 = i9;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mT;
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d8 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            double d9 = dArr[i8];
            int i9 = i8 + length2;
            dArr2[i9][0] = d9;
            double d10 = i8 * d8;
            dArr3[i9] = d10;
            if (i8 > 0) {
                int i10 = (length2 * 2) + i8;
                dArr2[i10][0] = d9 + 1.0d;
                dArr3[i10] = d10 + 1.0d;
                int i11 = i8 - 1;
                dArr2[i11][0] = (d9 - 1.0d) - d8;
                dArr3[i11] = (d10 - 1.0d) - d8;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d8, int i8) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i9 = 0;
        double d9 = dArr[0];
        if (d8 >= d9) {
            d9 = dArr[length - 1];
            if (d8 < d9) {
                d9 = d8;
            }
        }
        while (i9 < length - 1) {
            double[] dArr2 = this.mT;
            int i10 = i9 + 1;
            double d10 = dArr2[i10];
            if (d9 <= d10) {
                double d11 = dArr2[i9];
                double d12 = d10 - d11;
                double[][] dArr3 = this.mY;
                double d13 = dArr3[i9][i8];
                double d14 = dArr3[i10][i8];
                double[][] dArr4 = this.mTangent;
                return diff(d12, (d9 - d11) / d12, d13, d14, dArr4[i9][i8], dArr4[i10][i8]) / d12;
            }
            i9 = i10;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d8, float[] fArr) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i8 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d9 = dArr[0];
            if (d8 <= d9) {
                getSlope(d9, this.mSlopeTemp);
                for (int i9 = 0; i9 < length2; i9++) {
                    fArr[i9] = (float) (this.mY[0][i9] + ((d8 - this.mT[0]) * this.mSlopeTemp[i9]));
                }
                return;
            }
            int i10 = length - 1;
            double d10 = dArr[i10];
            if (d8 >= d10) {
                getSlope(d10, this.mSlopeTemp);
                while (i8 < length2) {
                    fArr[i8] = (float) (this.mY[i10][i8] + ((d8 - this.mT[i10]) * this.mSlopeTemp[i8]));
                    i8++;
                }
                return;
            }
        } else {
            if (d8 <= dArr[0]) {
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) this.mY[0][i11];
                }
                return;
            }
            int i12 = length - 1;
            if (d8 >= dArr[i12]) {
                while (i8 < length2) {
                    fArr[i8] = (float) this.mY[i12][i8];
                    i8++;
                }
                return;
            }
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d8 == this.mT[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.mY[i13][i14];
                }
            }
            double[] dArr2 = this.mT;
            int i15 = i13 + 1;
            double d11 = dArr2[i15];
            if (d8 < d11) {
                double d12 = dArr2[i13];
                double d13 = d11 - d12;
                double d14 = (d8 - d12) / d13;
                while (i8 < length2) {
                    double[][] dArr3 = this.mY;
                    double d15 = dArr3[i13][i8];
                    double d16 = dArr3[i15][i8];
                    double[][] dArr4 = this.mTangent;
                    fArr[i8] = (float) interpolate(d13, d14, d15, d16, dArr4[i13][i8], dArr4[i15][i8]);
                    i8++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d8, int i8) {
        double d9;
        double d10;
        double slope;
        double[] dArr = this.mT;
        int length = dArr.length;
        int i9 = 0;
        if (this.mExtrapolate) {
            double d11 = dArr[0];
            if (d8 <= d11) {
                d9 = this.mY[0][i8];
                d10 = d8 - d11;
                slope = getSlope(d11, i8);
            } else {
                int i10 = length - 1;
                double d12 = dArr[i10];
                if (d8 >= d12) {
                    d9 = this.mY[i10][i8];
                    d10 = d8 - d12;
                    slope = getSlope(d12, i8);
                }
            }
            return d9 + (d10 * slope);
        }
        if (d8 <= dArr[0]) {
            return this.mY[0][i8];
        }
        int i11 = length - 1;
        if (d8 >= dArr[i11]) {
            return this.mY[i11][i8];
        }
        while (i9 < length - 1) {
            double[] dArr2 = this.mT;
            double d13 = dArr2[i9];
            if (d8 == d13) {
                return this.mY[i9][i8];
            }
            int i12 = i9 + 1;
            double d14 = dArr2[i12];
            if (d8 < d14) {
                double d15 = d14 - d13;
                double d16 = (d8 - d13) / d15;
                double[][] dArr3 = this.mY;
                double d17 = dArr3[i9][i8];
                double d18 = dArr3[i12][i8];
                double[][] dArr4 = this.mTangent;
                return interpolate(d15, d16, d17, d18, dArr4[i9][i8], dArr4[i12][i8]);
            }
            i9 = i12;
        }
        return 0.0d;
    }
}
