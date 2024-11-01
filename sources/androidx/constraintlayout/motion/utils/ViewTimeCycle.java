package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    private static final String TAG = "ViewTimeCycle";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AlphaSet extends ViewTimeCycle {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setAlpha(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes.dex */
    public static class CustomSet extends ViewTimeCycle {
        String mAttributeName;
        float[] mCache;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i8, float f8, float f9, int i9, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            boolean z8;
            this.mCurveFit.getPos(f8, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            long j9 = j8 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(view, this.mAttributeName, 0);
                this.last_cycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.last_cycle = 0.0f;
                }
            }
            float f11 = (float) ((this.last_cycle + ((j9 * 1.0E-9d) * f9)) % 1.0d);
            this.last_cycle = f11;
            this.last_time = j8;
            float calcWave = calcWave(f11);
            this.mContinue = false;
            int i8 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i8 >= fArr2.length) {
                    break;
                }
                boolean z9 = this.mContinue;
                float f12 = this.mTempValues[i8];
                if (f12 != 0.0d) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.mContinue = z9 | z8;
                fArr2[i8] = (f12 * calcWave) + f10;
                i8++;
            }
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
            if (f9 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i8) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i9 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i9];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i9);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i10);
                ConstraintAttribute valueAt = this.mConstraintAttributeList.valueAt(i10);
                float[] valueAt2 = this.mWaveProperties.valueAt(i10);
                dArr[i10] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i11 = 0;
                while (true) {
                    if (i11 < this.mTempValues.length) {
                        dArr2[i10][i11] = r8[i11];
                        i11++;
                    }
                }
                double[] dArr3 = dArr2[i10];
                dArr3[numberOfInterpolatedValues] = valueAt2[0];
                dArr3[numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = CurveFit.get(i8, dArr, dArr2);
        }

        public void setPoint(int i8, ConstraintAttribute constraintAttribute, float f8, int i9, float f9) {
            this.mConstraintAttributeList.append(i8, constraintAttribute);
            this.mWaveProperties.append(i8, new float[]{f8, f9});
            this.mWaveShape = Math.max(this.mWaveShape, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ElevationSet extends ViewTimeCycle {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setElevation(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes.dex */
    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view, KeyCache keyCache, float f8, long j8, double d8, double d9) {
            view.setRotation(get(f8, j8, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d9, d8))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ProgressSet extends ViewTimeCycle {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f8, j8, view, keyCache));
            } else {
                if (this.mNoMethod) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(get(f8, j8, view, keyCache)));
                    } catch (IllegalAccessException e8) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e8);
                    } catch (InvocationTargetException e9) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e9);
                    }
                }
            }
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class RotationSet extends ViewTimeCycle {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setRotation(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class RotationXset extends ViewTimeCycle {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setRotationX(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class RotationYset extends ViewTimeCycle {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setRotationY(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ScaleXset extends ViewTimeCycle {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setScaleX(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ScaleYset extends ViewTimeCycle {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setScaleY(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class TranslationXset extends ViewTimeCycle {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setTranslationX(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class TranslationYset extends ViewTimeCycle {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setTranslationY(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class TranslationZset extends ViewTimeCycle {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setTranslationZ(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x009c. Please report as an issue. */
    public static ViewTimeCycle makeSpline(String str, long j8) {
        ViewTimeCycle rotationXset;
        str.hashCode();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c8 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c8 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c8 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c8 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c8 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c8 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c8 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c8 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c8 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c8 = 11;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                rotationXset = new RotationXset();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case 1:
                rotationXset = new RotationYset();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case 2:
                rotationXset = new TranslationXset();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case 3:
                rotationXset = new TranslationYset();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case 4:
                rotationXset = new TranslationZset();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case 5:
                rotationXset = new ProgressSet();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case 6:
                rotationXset = new ScaleXset();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case 7:
                rotationXset = new ScaleYset();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case '\b':
                rotationXset = new RotationSet();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case '\t':
                rotationXset = new ElevationSet();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case '\n':
                rotationXset = new PathRotate();
                rotationXset.setStartTime(j8);
                return rotationXset;
            case 11:
                rotationXset = new AlphaSet();
                rotationXset.setStartTime(j8);
                return rotationXset;
            default:
                return null;
        }
    }

    public float get(float f8, long j8, View view, KeyCache keyCache) {
        boolean z8;
        this.mCurveFit.getPos(f8, this.mCache);
        float[] fArr = this.mCache;
        float f9 = fArr[1];
        if (f9 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.last_cycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.last_cycle = 0.0f;
            }
        }
        float f10 = (float) ((this.last_cycle + (((j8 - this.last_time) * 1.0E-9d) * f9)) % 1.0d);
        this.last_cycle = f10;
        keyCache.setFloatValue(view, this.mType, 0, f10);
        this.last_time = j8;
        float f11 = this.mCache[0];
        float calcWave = (calcWave(this.last_cycle) * f11) + this.mCache[2];
        if (f11 == 0.0f && f9 == 0.0f) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.mContinue = z8;
        return calcWave;
    }

    public abstract boolean setProperty(View view, float f8, long j8, KeyCache keyCache);
}
