package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;
    private double[] mT;
    private double mTotalLength;
    private double[][] mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        this.mT = dArr;
        this.mY = dArr2;
        if (length2 > 2) {
            double d8 = 0.0d;
            double d9 = 0.0d;
            int i8 = 0;
            while (i8 < dArr.length) {
                double d10 = dArr2[i8][0];
                if (i8 > 0) {
                    Math.hypot(d10 - d8, d10 - d9);
                }
                i8++;
                d8 = d10;
                d9 = d8;
            }
            this.mTotalLength = 0.0d;
        }
    }

    private double getLength2D(double d8) {
        if (Double.isNaN(this.mTotalLength)) {
            return 0.0d;
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        if (d8 <= dArr[0]) {
            return 0.0d;
        }
        int i8 = length - 1;
        if (d8 >= dArr[i8]) {
            return this.mTotalLength;
        }
        double d9 = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i9 = 0;
        while (i9 < i8) {
            double[] dArr2 = this.mY[i9];
            double d12 = dArr2[0];
            double d13 = dArr2[1];
            if (i9 > 0) {
                d9 += Math.hypot(d12 - d10, d13 - d11);
            }
            double[] dArr3 = this.mT;
            double d14 = dArr3[i9];
            if (d8 == d14) {
                return d9;
            }
            int i10 = i9 + 1;
            double d15 = dArr3[i10];
            if (d8 < d15) {
                double d16 = (d8 - d14) / (d15 - d14);
                double[][] dArr4 = this.mY;
                double[] dArr5 = dArr4[i9];
                double d17 = dArr5[0];
                double[] dArr6 = dArr4[i10];
                double d18 = 1.0d - d16;
                return d9 + Math.hypot(d13 - ((dArr5[1] * d18) + (dArr6[1] * d16)), d12 - ((d17 * d18) + (dArr6[0] * d16)));
            }
            i9 = i10;
            d10 = d12;
            d11 = d13;
        }
        return 0.0d;
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
                double d13 = (d8 - d12) / (d11 - d12);
                while (i8 < length2) {
                    double[][] dArr4 = this.mY;
                    dArr[i8] = (dArr4[i13][i8] * (1.0d - d13)) + (dArr4[i15][i8] * d13);
                    i8++;
                }
                return;
            }
            i13 = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:            if (r13 >= r4) goto L4;     */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getSlope(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.mT
            int r1 = r0.length
            double[][] r2 = r12.mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = 0
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.mY
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.LinearCurveFit.getSlope(double, double[]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:            if (r8 >= r3) goto L4;     */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double getSlope(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.mT
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.mT
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.mY
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.LinearCurveFit.getSlope(double, int):double");
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
                double d13 = (d8 - d12) / (d11 - d12);
                while (i8 < length2) {
                    double[][] dArr3 = this.mY;
                    fArr[i8] = (float) ((dArr3[i13][i8] * (1.0d - d13)) + (dArr3[i15][i8] * d13));
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
                double d15 = (d8 - d13) / (d14 - d13);
                double[][] dArr3 = this.mY;
                return (dArr3[i9][i8] * (1.0d - d15)) + (dArr3[i12][i8] * d15);
            }
            i9 = i12;
        }
        return 0.0d;
    }
}
