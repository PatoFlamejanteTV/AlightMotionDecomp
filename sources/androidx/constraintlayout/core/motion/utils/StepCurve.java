package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class StepCurve extends Easing {
    private static final boolean DEBUG = false;
    MonotonicCurveFit mCurveFit;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StepCurve(String str) {
        this.str = str;
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
        this.mCurveFit = genSpline(Arrays.copyOf(dArr, i8 + 1));
    }

    private static MonotonicCurveFit genSpline(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i8 = 0; i8 < length; i8++) {
            dArr[i8] = Double.parseDouble(split[i8]);
        }
        return genSpline(dArr);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d8) {
        return this.mCurveFit.getPos(d8, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d8) {
        return this.mCurveFit.getSlope(d8, 0);
    }

    private static MonotonicCurveFit genSpline(double[] dArr) {
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
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + monotonicCurveFit.getPos(0.0d, 0));
        printStream.println(" 1 " + monotonicCurveFit.getPos(1.0d, 0));
        return monotonicCurveFit;
    }
}
