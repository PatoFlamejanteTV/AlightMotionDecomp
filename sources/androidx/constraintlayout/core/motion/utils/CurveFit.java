package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public abstract class CurveFit {
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE = 0;

    /* loaded from: classes.dex */
    static class Constant extends CurveFit {
        double mTime;
        double[] mValue;

        Constant(double d8, double[] dArr) {
            this.mTime = d8;
            this.mValue = dArr;
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getPos(double d8, double[] dArr) {
            double[] dArr2 = this.mValue;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double getSlope(double d8, int i8) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double[] getTimePoints() {
            return new double[]{this.mTime};
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getPos(double d8, float[] fArr) {
            int i8 = 0;
            while (true) {
                double[] dArr = this.mValue;
                if (i8 >= dArr.length) {
                    return;
                }
                fArr[i8] = (float) dArr[i8];
                i8++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getSlope(double d8, double[] dArr) {
            for (int i8 = 0; i8 < this.mValue.length; i8++) {
                dArr[i8] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double getPos(double d8, int i8) {
            return this.mValue[i8];
        }
    }

    public static CurveFit get(int i8, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i8 = 2;
        }
        if (i8 != 0) {
            if (i8 != 2) {
                return new LinearCurveFit(dArr, dArr2);
            }
            return new Constant(dArr[0], dArr2[0]);
        }
        return new MonotonicCurveFit(dArr, dArr2);
    }

    public static CurveFit getArc(int[] iArr, double[] dArr, double[][] dArr2) {
        return new ArcCurveFit(iArr, dArr, dArr2);
    }

    public abstract double getPos(double d8, int i8);

    public abstract void getPos(double d8, double[] dArr);

    public abstract void getPos(double d8, float[] fArr);

    public abstract double getSlope(double d8, int i8);

    public abstract void getSlope(double d8, double[] dArr);

    public abstract double[] getTimePoints();
}
