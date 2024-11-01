package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class HyperSpline {
    double[][] mCtl;
    Cubic[][] mCurve;
    double[] mCurveLength;
    int mDimensionality;
    int mPoints;
    double mTotalLength;

    /* loaded from: classes.dex */
    public static class Cubic {
        double mA;
        double mB;
        double mC;
        double mD;

        public Cubic(double d8, double d9, double d10, double d11) {
            this.mA = d8;
            this.mB = d9;
            this.mC = d10;
            this.mD = d11;
        }

        public double eval(double d8) {
            return (((((this.mD * d8) + this.mC) * d8) + this.mB) * d8) + this.mA;
        }

        public double vel(double d8) {
            return (((this.mD * 3.0d * d8) + (this.mC * 2.0d)) * d8) + this.mB;
        }
    }

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    static Cubic[] calcNaturalCubic(int i8, double[] dArr) {
        double[] dArr2 = new double[i8];
        double[] dArr3 = new double[i8];
        double[] dArr4 = new double[i8];
        int i9 = i8 - 1;
        int i10 = 0;
        dArr2[0] = 0.5d;
        int i11 = 1;
        for (int i12 = 1; i12 < i9; i12++) {
            dArr2[i12] = 1.0d / (4.0d - dArr2[i12 - 1]);
        }
        int i13 = i8 - 2;
        dArr2[i9] = 1.0d / (2.0d - dArr2[i13]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i11 < i9) {
            int i14 = i11 + 1;
            int i15 = i11 - 1;
            dArr3[i11] = (((dArr[i14] - dArr[i15]) * 3.0d) - dArr3[i15]) * dArr2[i11];
            i11 = i14;
        }
        double d8 = (((dArr[i9] - dArr[i13]) * 3.0d) - dArr3[i13]) * dArr2[i9];
        dArr3[i9] = d8;
        dArr4[i9] = d8;
        while (i13 >= 0) {
            dArr4[i13] = dArr3[i13] - (dArr2[i13] * dArr4[i13 + 1]);
            i13--;
        }
        Cubic[] cubicArr = new Cubic[i9];
        while (i10 < i9) {
            double d9 = dArr[i10];
            double d10 = dArr4[i10];
            int i16 = i10 + 1;
            double d11 = dArr[i16];
            double d12 = dArr4[i16];
            cubicArr[i10] = new Cubic((float) d9, d10, (((d11 - d9) * 3.0d) - (d10 * 2.0d)) - d12, ((d9 - d11) * 2.0d) + d10 + d12);
            i10 = i16;
        }
        return cubicArr;
    }

    public double approxLength(Cubic[] cubicArr) {
        int i8;
        int length = cubicArr.length;
        double[] dArr = new double[cubicArr.length];
        double d8 = 0.0d;
        double d9 = 0.0d;
        double d10 = 0.0d;
        while (true) {
            i8 = 0;
            if (d9 >= 1.0d) {
                break;
            }
            double d11 = 0.0d;
            while (i8 < cubicArr.length) {
                double d12 = dArr[i8];
                double eval = cubicArr[i8].eval(d9);
                dArr[i8] = eval;
                double d13 = d12 - eval;
                d11 += d13 * d13;
                i8++;
            }
            if (d9 > 0.0d) {
                d10 += Math.sqrt(d11);
            }
            d9 += 0.1d;
        }
        while (i8 < cubicArr.length) {
            double d14 = dArr[i8];
            double eval2 = cubicArr[i8].eval(1.0d);
            dArr[i8] = eval2;
            double d15 = d14 - eval2;
            d8 += d15 * d15;
            i8++;
        }
        return d10 + Math.sqrt(d8);
    }

    public void getPos(double d8, double[] dArr) {
        double d9 = d8 * this.mTotalLength;
        int i8 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i8 >= dArr2.length - 1) {
                break;
            }
            double d10 = dArr2[i8];
            if (d10 >= d9) {
                break;
            }
            d9 -= d10;
            i8++;
        }
        for (int i9 = 0; i9 < dArr.length; i9++) {
            dArr[i9] = this.mCurve[i9][i8].eval(d9 / this.mCurveLength[i8]);
        }
    }

    public void getVelocity(double d8, double[] dArr) {
        double d9 = d8 * this.mTotalLength;
        int i8 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i8 >= dArr2.length - 1) {
                break;
            }
            double d10 = dArr2[i8];
            if (d10 >= d9) {
                break;
            }
            d9 -= d10;
            i8++;
        }
        for (int i9 = 0; i9 < dArr.length; i9++) {
            dArr[i9] = this.mCurve[i9][i8].vel(d9 / this.mCurveLength[i8]);
        }
    }

    public void setup(double[][] dArr) {
        int i8;
        int length = dArr[0].length;
        this.mDimensionality = length;
        int length2 = dArr.length;
        this.mPoints = length2;
        this.mCtl = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.mCurve = new Cubic[this.mDimensionality];
        for (int i9 = 0; i9 < this.mDimensionality; i9++) {
            for (int i10 = 0; i10 < this.mPoints; i10++) {
                this.mCtl[i9][i10] = dArr[i10][i9];
            }
        }
        int i11 = 0;
        while (true) {
            i8 = this.mDimensionality;
            if (i11 >= i8) {
                break;
            }
            Cubic[][] cubicArr = this.mCurve;
            double[] dArr2 = this.mCtl[i11];
            cubicArr[i11] = calcNaturalCubic(dArr2.length, dArr2);
            i11++;
        }
        this.mCurveLength = new double[this.mPoints - 1];
        this.mTotalLength = 0.0d;
        Cubic[] cubicArr2 = new Cubic[i8];
        for (int i12 = 0; i12 < this.mCurveLength.length; i12++) {
            for (int i13 = 0; i13 < this.mDimensionality; i13++) {
                cubicArr2[i13] = this.mCurve[i13][i12];
            }
            double d8 = this.mTotalLength;
            double[] dArr3 = this.mCurveLength;
            double approxLength = approxLength(cubicArr2);
            dArr3[i12] = approxLength;
            this.mTotalLength = d8 + approxLength;
        }
    }

    public HyperSpline() {
    }

    public void getPos(double d8, float[] fArr) {
        double d9 = d8 * this.mTotalLength;
        int i8 = 0;
        while (true) {
            double[] dArr = this.mCurveLength;
            if (i8 >= dArr.length - 1) {
                break;
            }
            double d10 = dArr[i8];
            if (d10 >= d9) {
                break;
            }
            d9 -= d10;
            i8++;
        }
        for (int i9 = 0; i9 < fArr.length; i9++) {
            fArr[i9] = (float) this.mCurve[i9][i8].eval(d9 / this.mCurveLength[i8]);
        }
    }

    public double getPos(double d8, int i8) {
        double[] dArr;
        double d9 = d8 * this.mTotalLength;
        int i9 = 0;
        while (true) {
            dArr = this.mCurveLength;
            if (i9 >= dArr.length - 1) {
                break;
            }
            double d10 = dArr[i9];
            if (d10 >= d9) {
                break;
            }
            d9 -= d10;
            i9++;
        }
        return this.mCurve[i8][i9].eval(d9 / dArr[i9]);
    }
}
