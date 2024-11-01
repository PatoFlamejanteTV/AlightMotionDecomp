package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class SplineSet {
    private static final String TAG = "SplineSet";
    private int count;
    protected CurveFit mCurveFit;
    private String mType;
    protected int[] mTimePoints = new int[10];
    protected float[] mValues = new float[10];

    /* loaded from: classes.dex */
    private static class CoreSpline extends SplineSet {
        long start;
        String type;

        public CoreSpline(String str, long j8) {
            this.type = str;
            this.start = j8;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f8) {
            typedValues.setValue(typedValues.getId(this.type), get(f8));
        }
    }

    /* loaded from: classes.dex */
    public static class CustomSet extends SplineSet {
        String mAttributeName;
        KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i8, float f8) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setProperty(WidgetFrame widgetFrame, float f8) {
            this.mCurveFit.getPos(f8, this.mTempValues);
            widgetFrame.setCustomValue(this.mConstraintAttributeList.valueAt(0), this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i8) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, numberOfInterpolatedValues);
            for (int i9 = 0; i9 < size; i9++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i9);
                CustomAttribute valueAt = this.mConstraintAttributeList.valueAt(i9);
                dArr[i9] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i10 = 0;
                while (true) {
                    if (i10 < this.mTempValues.length) {
                        dArr2[i9][i10] = r6[i10];
                        i10++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i8, dArr, dArr2);
        }

        public void setPoint(int i8, CustomAttribute customAttribute) {
            this.mConstraintAttributeList.append(i8, customAttribute);
        }
    }

    /* loaded from: classes.dex */
    public static class CustomSpline extends SplineSet {
        String mAttributeName;
        KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mTempValues;

        public CustomSpline(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i8, float f8) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f8) {
            setProperty((MotionWidget) typedValues, f8);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i8) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, numberOfInterpolatedValues);
            for (int i9 = 0; i9 < size; i9++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i9);
                CustomVariable valueAt = this.mConstraintAttributeList.valueAt(i9);
                dArr[i9] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i10 = 0;
                while (true) {
                    if (i10 < this.mTempValues.length) {
                        dArr2[i9][i10] = r6[i10];
                        i10++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i8, dArr, dArr2);
        }

        public void setPoint(int i8, CustomVariable customVariable) {
            this.mConstraintAttributeList.append(i8, customVariable);
        }

        public void setProperty(MotionWidget motionWidget, float f8) {
            this.mCurveFit.getPos(f8, this.mTempValues);
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mTempValues);
        }
    }

    /* loaded from: classes.dex */
    private static class Sort {
        private Sort() {
        }

        static void doubleQuickSort(int[] iArr, float[] fArr, int i8, int i9) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i9;
            iArr2[1] = i8;
            int i10 = 2;
            while (i10 > 0) {
                int i11 = iArr2[i10 - 1];
                int i12 = i10 - 2;
                int i13 = iArr2[i12];
                if (i11 < i13) {
                    int partition = partition(iArr, fArr, i11, i13);
                    iArr2[i12] = partition - 1;
                    iArr2[i10 - 1] = i11;
                    int i14 = i10 + 1;
                    iArr2[i10] = i13;
                    i10 += 2;
                    iArr2[i14] = partition + 1;
                } else {
                    i10 = i12;
                }
            }
        }

        private static int partition(int[] iArr, float[] fArr, int i8, int i9) {
            int i10 = iArr[i9];
            int i11 = i8;
            while (i8 < i9) {
                if (iArr[i8] <= i10) {
                    swap(iArr, fArr, i11, i8);
                    i11++;
                }
                i8++;
            }
            swap(iArr, fArr, i11, i9);
            return i11;
        }

        private static void swap(int[] iArr, float[] fArr, int i8, int i9) {
            int i10 = iArr[i8];
            iArr[i8] = iArr[i9];
            iArr[i9] = i10;
            float f8 = fArr[i8];
            fArr[i8] = fArr[i9];
            fArr[i9] = f8;
        }
    }

    public static SplineSet makeCustomSpline(String str, KeyFrameArray.CustomArray customArray) {
        return new CustomSet(str, customArray);
    }

    public static SplineSet makeCustomSplineSet(String str, KeyFrameArray.CustomVar customVar) {
        return new CustomSpline(str, customVar);
    }

    public static SplineSet makeSpline(String str, long j8) {
        return new CoreSpline(str, j8);
    }

    public float get(float f8) {
        return (float) this.mCurveFit.getPos(f8, 0);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f8) {
        return (float) this.mCurveFit.getSlope(f8, 0);
    }

    public void setPoint(int i8, float f8) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.count + 1) {
            this.mTimePoints = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i9 = this.count;
        iArr2[i9] = i8;
        this.mValues[i9] = f8;
        this.count = i9 + 1;
    }

    public void setProperty(TypedValues typedValues, float f8) {
        typedValues.setValue(a.a(this.mType), get(f8));
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(int i8) {
        int i9 = this.count;
        if (i9 == 0) {
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i9 - 1);
        int i10 = 1;
        for (int i11 = 1; i11 < this.count; i11++) {
            int[] iArr = this.mTimePoints;
            if (iArr[i11 - 1] != iArr[i11]) {
                i10++;
            }
        }
        double[] dArr = new double[i10];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i10, 1);
        int i12 = 0;
        for (int i13 = 0; i13 < this.count; i13++) {
            if (i13 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i13] == iArr2[i13 - 1]) {
                }
            }
            dArr[i12] = this.mTimePoints[i13] * 0.01d;
            dArr2[i12][0] = this.mValues[i13];
            i12++;
        }
        this.mCurveFit = CurveFit.get(i8, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i8 = 0; i8 < this.count; i8++) {
            str = str + "[" + this.mTimePoints[i8] + " , " + decimalFormat.format(this.mValues[i8]) + "] ";
        }
        return str;
    }
}
