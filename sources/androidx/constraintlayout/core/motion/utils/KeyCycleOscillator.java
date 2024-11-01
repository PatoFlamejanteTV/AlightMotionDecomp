package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class KeyCycleOscillator {
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    private CycleOscillator mCycleOscillator;
    private String mType;
    private int mWaveShape = 0;
    private String mWaveString = null;
    public int mVariesBy = 0;
    ArrayList<WavePoint> mWavePoints = new ArrayList<>();

    /* loaded from: classes.dex */
    private static class CoreSpline extends KeyCycleOscillator {
        String type;
        int typeId;

        public CoreSpline(String str) {
            this.type = str;
            this.typeId = c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f8) {
            motionWidget.setValue(this.typeId, get(f8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class CycleOscillator {
        private static final String TAG = "CycleOscillator";
        static final int UNSET = -1;
        private final int OFFST;
        private final int PHASE;
        private final int VALUE;
        CurveFit mCurveFit;
        float[] mOffset;
        Oscillator mOscillator;
        float mPathLength;
        float[] mPeriod;
        float[] mPhase;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        CycleOscillator(int i8, String str, int i9, int i10) {
            Oscillator oscillator = new Oscillator();
            this.mOscillator = oscillator;
            this.OFFST = 0;
            this.PHASE = 1;
            this.VALUE = 2;
            this.mWaveShape = i8;
            this.mVariesBy = i9;
            oscillator.setType(i8, str);
            this.mValues = new float[i10];
            this.mPosition = new double[i10];
            this.mPeriod = new float[i10];
            this.mOffset = new float[i10];
            this.mPhase = new float[i10];
            this.mScale = new float[i10];
        }

        public double getLastPhase() {
            return this.mSplineValueCache[1];
        }

        public double getSlope(float f8) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d8 = f8;
                curveFit.getSlope(d8, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d8, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d9 = f8;
            double value = this.mOscillator.getValue(d9, this.mSplineValueCache[1]);
            double slope = this.mOscillator.getSlope(d9, this.mSplineValueCache[1], this.mSplineSlopeCache[1]);
            double[] dArr2 = this.mSplineSlopeCache;
            return dArr2[0] + (value * dArr2[2]) + (slope * this.mSplineValueCache[2]);
        }

        public double getValues(float f8) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos(f8, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = this.mOffset[0];
                dArr[1] = this.mPhase[0];
                dArr[2] = this.mValues[0];
            }
            double[] dArr2 = this.mSplineValueCache;
            return dArr2[0] + (this.mOscillator.getValue(f8, dArr2[1]) * this.mSplineValueCache[2]);
        }

        public void setPoint(int i8, int i9, float f8, float f9, float f10, float f11) {
            this.mPosition[i8] = i9 / 100.0d;
            this.mPeriod[i8] = f8;
            this.mOffset[i8] = f9;
            this.mPhase[i8] = f10;
            this.mValues[i8] = f11;
        }

        public void setup(float f8) {
            this.mPathLength = f8;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.mPosition.length, 3);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[fArr.length + 2];
            this.mSplineSlopeCache = new double[fArr.length + 2];
            if (this.mPosition[0] > 0.0d) {
                this.mOscillator.addPoint(0.0d, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length]);
            }
            for (int i8 = 0; i8 < dArr.length; i8++) {
                double[] dArr3 = dArr[i8];
                dArr3[0] = this.mOffset[i8];
                dArr3[1] = this.mPhase[i8];
                dArr3[2] = this.mValues[i8];
                this.mOscillator.addPoint(this.mPosition[i8], this.mPeriod[i8]);
            }
            this.mOscillator.normalize();
            double[] dArr4 = this.mPosition;
            if (dArr4.length > 1) {
                this.mCurveFit = CurveFit.get(0, dArr4, dArr);
            } else {
                this.mCurveFit = null;
            }
        }
    }

    /* loaded from: classes.dex */
    private static class IntDoubleSort {
        private IntDoubleSort() {
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

        static void sort(int[] iArr, float[] fArr, int i8, int i9) {
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

        private static void swap(int[] iArr, float[] fArr, int i8, int i9) {
            int i10 = iArr[i8];
            iArr[i8] = iArr[i9];
            iArr[i9] = i10;
            float f8 = fArr[i8];
            fArr[i8] = fArr[i9];
            fArr[i9] = f8;
        }
    }

    /* loaded from: classes.dex */
    private static class IntFloatFloatSort {
        private IntFloatFloatSort() {
        }

        private static int partition(int[] iArr, float[] fArr, float[] fArr2, int i8, int i9) {
            int i10 = iArr[i9];
            int i11 = i8;
            while (i8 < i9) {
                if (iArr[i8] <= i10) {
                    swap(iArr, fArr, fArr2, i11, i8);
                    i11++;
                }
                i8++;
            }
            swap(iArr, fArr, fArr2, i11, i9);
            return i11;
        }

        static void sort(int[] iArr, float[] fArr, float[] fArr2, int i8, int i9) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i9;
            iArr2[1] = i8;
            int i10 = 2;
            while (i10 > 0) {
                int i11 = iArr2[i10 - 1];
                int i12 = i10 - 2;
                int i13 = iArr2[i12];
                if (i11 < i13) {
                    int partition = partition(iArr, fArr, fArr2, i11, i13);
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

        private static void swap(int[] iArr, float[] fArr, float[] fArr2, int i8, int i9) {
            int i10 = iArr[i8];
            iArr[i8] = iArr[i9];
            iArr[i9] = i10;
            float f8 = fArr[i8];
            fArr[i8] = fArr[i9];
            fArr[i9] = f8;
            float f9 = fArr2[i8];
            fArr2[i8] = fArr2[i9];
            fArr2[i9] = f9;
        }
    }

    /* loaded from: classes.dex */
    public static class PathRotateSet extends KeyCycleOscillator {
        String type;
        int typeId;

        public PathRotateSet(String str) {
            this.type = str;
            this.typeId = c.a(str);
        }

        public void setPathRotate(MotionWidget motionWidget, float f8, double d8, double d9) {
            motionWidget.setRotationZ(get(f8) + ((float) Math.toDegrees(Math.atan2(d9, d8))));
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f8) {
            motionWidget.setValue(this.typeId, get(f8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class WavePoint {
        float mOffset;
        float mPeriod;
        float mPhase;
        int mPosition;
        float mValue;

        public WavePoint(int i8, float f8, float f9, float f10, float f11) {
            this.mPosition = i8;
            this.mValue = f11;
            this.mOffset = f9;
            this.mPeriod = f8;
            this.mPhase = f10;
        }
    }

    public static KeyCycleOscillator makeWidgetCycle(String str) {
        if (str.equals("pathRotate")) {
            return new PathRotateSet(str);
        }
        return new CoreSpline(str);
    }

    public float get(float f8) {
        return (float) this.mCycleOscillator.getValues(f8);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f8) {
        return (float) this.mCycleOscillator.getSlope(f8);
    }

    protected void setCustom(Object obj) {
    }

    public void setPoint(int i8, int i9, String str, int i10, float f8, float f9, float f10, float f11, Object obj) {
        this.mWavePoints.add(new WavePoint(i8, f8, f9, f10, f11));
        if (i10 != -1) {
            this.mVariesBy = i10;
        }
        this.mWaveShape = i9;
        setCustom(obj);
        this.mWaveString = str;
    }

    public void setProperty(MotionWidget motionWidget, float f8) {
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(float f8) {
        int size = this.mWavePoints.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.mWavePoints, new Comparator<WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
            @Override // java.util.Comparator
            public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                return Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
            }
        });
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, size);
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            WavePoint next = it.next();
            float f9 = next.mPeriod;
            dArr[i8] = f9 * 0.01d;
            double[] dArr3 = dArr2[i8];
            float f10 = next.mValue;
            dArr3[0] = f10;
            float f11 = next.mOffset;
            dArr3[1] = f11;
            float f12 = next.mPhase;
            dArr3[2] = f12;
            this.mCycleOscillator.setPoint(i8, next.mPosition, f9, f11, f12, f10);
            i8++;
            dArr2 = dArr2;
        }
        this.mCycleOscillator.setup(f8);
        this.mCurveFit = CurveFit.get(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().mPosition + " , " + decimalFormat.format(r3.mValue) + "] ";
        }
        return str;
    }

    public boolean variesByPath() {
        if (this.mVariesBy == 1) {
            return true;
        }
        return false;
    }

    public void setPoint(int i8, int i9, String str, int i10, float f8, float f9, float f10, float f11) {
        this.mWavePoints.add(new WavePoint(i8, f8, f9, f10, f11));
        if (i10 != -1) {
            this.mVariesBy = i10;
        }
        this.mWaveShape = i9;
        this.mWaveString = str;
    }
}
