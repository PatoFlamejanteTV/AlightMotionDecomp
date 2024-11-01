package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Motion implements TypedValues {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private MotionKeyTrigger[] mKeyTriggers;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    MotionWidget mView;
    Rect mTempRect = new Rect();
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<MotionKey> mKeyList = new ArrayList<>();
    private int mPathMotionArc = -1;
    private int mTransformPivotTarget = -1;
    private MotionWidget mTransformPivotView = null;
    private int mQuantizeMotionSteps = -1;
    private float mQuantizeMotionPhase = Float.NaN;
    private DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public Motion(MotionWidget motionWidget) {
        setView(motionWidget);
    }

    private float getAdjustedPosition(float f8, float[] fArr) {
        float f9 = 0.0f;
        float f10 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f11 = this.mStaggerScale;
            if (f11 != 1.0d) {
                float f12 = this.mStaggerOffset;
                if (f8 < f12) {
                    f8 = 0.0f;
                }
                if (f8 > f12 && f8 < 1.0d) {
                    f8 = Math.min((f8 - f12) * f11, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        float f13 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths next = it.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f14 = next.time;
                if (f14 < f8) {
                    easing = easing2;
                    f9 = f14;
                } else if (Float.isNaN(f13)) {
                    f13 = next.time;
                }
            }
        }
        if (easing != null) {
            if (!Float.isNaN(f13)) {
                f10 = f13;
            }
            float f15 = f10 - f9;
            double d8 = (f8 - f9) / f15;
            f8 = (((float) easing.get(d8)) * f15) + f9;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d8);
            }
        }
        return f8;
    }

    private static DifferentialInterpolator getInterpolator(int i8, String str, int i9) {
        if (i8 != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1
            float mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f8) {
                this.mX = f8;
                return (float) Easing.this.get(f8);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) Easing.this.getDiff(this.mX);
            }
        };
    }

    private float getPreCycleDistance() {
        char c8;
        float f8;
        float[] fArr = new float[2];
        float f9 = 1.0f / 99;
        double d8 = 0.0d;
        double d9 = 0.0d;
        float f10 = 0.0f;
        int i8 = 0;
        while (i8 < 100) {
            float f11 = i8 * f9;
            double d10 = f11;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f12 = Float.NaN;
            float f13 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f14 = next.time;
                    if (f14 < f11) {
                        easing = easing2;
                        f13 = f14;
                    } else if (Float.isNaN(f12)) {
                        f12 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                d10 = (((float) easing.get((f11 - f13) / r17)) * (f12 - f13)) + f13;
            }
            this.mSpline[0].getPos(d10, this.mInterpolateData);
            float f15 = f10;
            int i9 = i8;
            this.mStartMotionPath.getCenter(d10, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i9 > 0) {
                c8 = 0;
                f8 = (float) (f15 + Math.hypot(d9 - fArr[1], d8 - fArr[0]));
            } else {
                c8 = 0;
                f8 = f15;
            }
            d8 = fArr[c8];
            i8 = i9 + 1;
            f10 = f8;
            d9 = fArr[1];
        }
        return f10;
    }

    private void insertKey(MotionPaths motionPaths) {
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        MotionPaths motionPaths2 = null;
        while (it.hasNext()) {
            MotionPaths next = it.next();
            if (motionPaths.position == next.position) {
                motionPaths2 = next;
            }
        }
        if (motionPaths2 != null) {
            this.mMotionPaths.remove(motionPaths2);
        }
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Utils.loge(TAG, " KeyPath position \"" + motionPaths.position + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds(this.mView.getX(), this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(MotionKey motionKey) {
        this.mKeyList.add(motionKey);
    }

    void addKeys(ArrayList<MotionKey> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    void buildBounds(float[] fArr, int i8) {
        float f8 = 1.0f / (i8 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            float f9 = i9 * f8;
            float f10 = this.mStaggerScale;
            float f11 = 0.0f;
            if (f10 != 1.0f) {
                float f12 = this.mStaggerOffset;
                if (f9 < f12) {
                    f9 = 0.0f;
                }
                if (f9 > f12 && f9 < 1.0d) {
                    f9 = Math.min((f9 - f12) * f10, 1.0f);
                }
            }
            double d8 = f9;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f13 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f14 = next.time;
                    if (f14 < f9) {
                        easing = easing2;
                        f11 = f14;
                    } else if (Float.isNaN(f13)) {
                        f13 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                d8 = (((float) easing.get((f9 - f11) / r12)) * (f13 - f11)) + f11;
            }
            this.mSpline[0].getPos(d8, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d8, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i9 * 2);
        }
    }

    int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                iArr[i8] = it.next().mMode;
                i8++;
            }
        }
        int i9 = 0;
        for (double d8 : timePoints) {
            this.mSpline[0].getPos(d8, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i9);
            i9 += 2;
        }
        return i9 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                iArr[i8] = it.next().mMode;
                i8++;
            }
        }
        if (iArr2 != null) {
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            int i9 = 0;
            while (it2.hasNext()) {
                iArr2[i9] = (int) (it2.next().position * 100.0f);
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < timePoints.length; i11++) {
            this.mSpline[0].getPos(timePoints[i11], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i11], this.mInterpolateVariables, this.mInterpolateData, fArr, i10);
            i10 += 2;
        }
        return i10 / 2;
    }

    public void buildPath(float[] fArr, int i8) {
        SplineSet splineSet;
        SplineSet splineSet2;
        KeyCycleOscillator keyCycleOscillator;
        double d8;
        float f8 = 1.0f;
        float f9 = 1.0f / (i8 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        KeyCycleOscillator keyCycleOscillator2 = null;
        if (hashMap == null) {
            splineSet = null;
        } else {
            splineSet = hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            splineSet2 = null;
        } else {
            splineSet2 = hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 == null) {
            keyCycleOscillator = null;
        } else {
            keyCycleOscillator = hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            keyCycleOscillator2 = hashMap4.get("translationY");
        }
        KeyCycleOscillator keyCycleOscillator3 = keyCycleOscillator2;
        int i9 = 0;
        while (i9 < i8) {
            float f10 = i9 * f9;
            float f11 = this.mStaggerScale;
            float f12 = 0.0f;
            if (f11 != f8) {
                float f13 = this.mStaggerOffset;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f11, f8);
                }
            }
            float f14 = f10;
            double d9 = f14;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f15 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                double d10 = d9;
                if (easing2 != null) {
                    float f16 = next.time;
                    if (f16 < f14) {
                        f12 = f16;
                        easing = easing2;
                    } else if (Float.isNaN(f15)) {
                        f15 = next.time;
                    }
                }
                d9 = d10;
            }
            double d11 = d9;
            if (easing != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                d8 = (((float) easing.get((f14 - f12) / r16)) * (f15 - f12)) + f12;
            } else {
                d8 = d11;
            }
            this.mSpline[0].getPos(d8, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d8, dArr);
                }
            }
            int i10 = i9 * 2;
            int i11 = i9;
            this.mStartMotionPath.getCenter(d8, this.mInterpolateVariables, this.mInterpolateData, fArr, i10);
            if (keyCycleOscillator != null) {
                fArr[i10] = fArr[i10] + keyCycleOscillator.get(f14);
            } else if (splineSet != null) {
                fArr[i10] = fArr[i10] + splineSet.get(f14);
            }
            if (keyCycleOscillator3 != null) {
                int i12 = i10 + 1;
                fArr[i12] = fArr[i12] + keyCycleOscillator3.get(f14);
            } else if (splineSet2 != null) {
                int i13 = i10 + 1;
                fArr[i13] = fArr[i13] + splineSet2.get(f14);
            }
            i9 = i11 + 1;
            f8 = 1.0f;
        }
    }

    public void buildRect(float f8, float[] fArr, int i8) {
        this.mSpline[0].getPos(getAdjustedPosition(f8, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i8);
    }

    void buildRectangles(float[] fArr, int i8) {
        float f8 = 1.0f / (i8 - 1);
        for (int i9 = 0; i9 < i8; i9++) {
            this.mSpline[0].getPos(getAdjustedPosition(i9 * f8, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i9 * 8);
        }
    }

    void endTrigger(boolean z8) {
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    int getAttributeValues(String str, float[] fArr, int i8) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i9 = 0; i9 < fArr.length; i9++) {
            fArr[i9] = splineSet.get(i9 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d8, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d8, dArr);
        this.mSpline[0].getSlope(d8, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d8, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    void getDpDt(float f8, float f9, float f10, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f8, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i8 = 0;
        if (curveFitArr != null) {
            double d8 = adjustedPosition;
            curveFitArr[0].getSlope(d8, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d8, this.mInterpolateData);
            float f11 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i8 >= dArr.length) {
                    break;
                }
                dArr[i8] = dArr[i8] * f11;
                i8++;
            }
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d8, dArr2);
                    this.mArcSpline.getSlope(d8, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f9, f10, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f9, f10, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        float f12 = motionPaths.f14536x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f13 = f12 - motionPaths2.f14536x;
        float f14 = motionPaths.f14537y - motionPaths2.f14537y;
        float f15 = (motionPaths.width - motionPaths2.width) + f13;
        float f16 = (motionPaths.height - motionPaths2.height) + f14;
        fArr[0] = (f13 * (1.0f - f9)) + (f15 * f9);
        fArr[1] = (f14 * (1.0f - f10)) + (f16 * f10);
    }

    public int getDrawPath() {
        int i8 = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            i8 = Math.max(i8, it.next().mDrawPath);
        }
        return Math.max(i8, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.height;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.width;
    }

    public float getFinalX() {
        return this.mEndMotionPath.f14536x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f14537y;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i8) {
        return this.mMotionPaths.get(i8);
    }

    public int getKeyFrameInfo(int i8, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<MotionKey> it = this.mKeyList.iterator();
        int i9 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            MotionKey next = it.next();
            int i11 = next.mType;
            if (i11 == i8 || i8 != -1) {
                iArr[i10] = 0;
                iArr[i10 + 1] = i11;
                int i12 = next.mFramePosition;
                iArr[i10 + 2] = i12;
                double d8 = i12 / 100.0f;
                this.mSpline[0].getPos(d8, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d8, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i10 + 3] = Float.floatToIntBits(fArr[0]);
                int i13 = i10 + 4;
                iArr[i13] = Float.floatToIntBits(fArr[1]);
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    iArr[i10 + 5] = motionKeyPosition.mPositionType;
                    iArr[i10 + 6] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i13 = i10 + 7;
                    iArr[i13] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i14 = i13 + 1;
                iArr[i10] = i14 - i10;
                i9++;
                i10 = i14;
            }
        }
        return i9;
    }

    float getKeyFrameParameter(int i8, float f8, float f9) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f10 = motionPaths.f14536x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f11 = motionPaths2.f14536x;
        float f12 = f10 - f11;
        float f13 = motionPaths.f14537y;
        float f14 = motionPaths2.f14537y;
        float f15 = f13 - f14;
        float f16 = f11 + (motionPaths2.width / 2.0f);
        float f17 = f14 + (motionPaths2.height / 2.0f);
        float hypot = (float) Math.hypot(f12, f15);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f18 = f8 - f16;
        float f19 = f9 - f17;
        if (((float) Math.hypot(f18, f19)) == 0.0f) {
            return 0.0f;
        }
        float f20 = (f18 * f12) + (f19 * f15);
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                return 0.0f;
                            }
                            return f19 / f15;
                        }
                        return f18 / f15;
                    }
                    return f19 / f12;
                }
                return f18 / f12;
            }
            return (float) Math.sqrt((hypot * hypot) - (f20 * f20));
        }
        return f20 / hypot;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<MotionKey> it = this.mKeyList.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            MotionKey next = it.next();
            int i10 = next.mFramePosition;
            iArr[i8] = (next.mType * 1000) + i10;
            double d8 = i10 / 100.0f;
            this.mSpline[0].getPos(d8, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d8, this.mInterpolateVariables, this.mInterpolateData, fArr, i9);
            i9 += 2;
            i8++;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double[] getPos(double d8) {
        this.mSpline[0].getPos(d8, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d8, dArr);
            }
        }
        return this.mInterpolateData;
    }

    MotionKeyPosition getPositionKeyframe(int i8, int i9, float f8, float f9) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f10 = motionPaths.f14536x;
        floatRect.left = f10;
        float f11 = motionPaths.f14537y;
        floatRect.top = f11;
        floatRect.right = f10 + motionPaths.width;
        floatRect.bottom = f11 + motionPaths.height;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f12 = motionPaths2.f14536x;
        floatRect2.left = f12;
        float f13 = motionPaths2.f14537y;
        floatRect2.top = f13;
        floatRect2.right = f12 + motionPaths2.width;
        floatRect2.bottom = f13 + motionPaths2.height;
        Iterator<MotionKey> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            MotionKey next = it.next();
            if (next instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                if (motionKeyPosition.intersects(i8, i9, floatRect, floatRect2, f8, f9)) {
                    return motionKeyPosition;
                }
            }
        }
        return null;
    }

    void getPostLayoutDvDp(float f8, int i8, int i9, float f9, float f10, float[] fArr) {
        SplineSet splineSet;
        SplineSet splineSet2;
        SplineSet splineSet3;
        SplineSet splineSet4;
        SplineSet splineSet5;
        KeyCycleOscillator keyCycleOscillator;
        KeyCycleOscillator keyCycleOscillator2;
        KeyCycleOscillator keyCycleOscillator3;
        KeyCycleOscillator keyCycleOscillator4;
        float adjustedPosition = getAdjustedPosition(f8, this.mVelocity);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        KeyCycleOscillator keyCycleOscillator5 = null;
        if (hashMap == null) {
            splineSet = null;
        } else {
            splineSet = hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            splineSet2 = null;
        } else {
            splineSet2 = hashMap2.get("translationY");
        }
        HashMap<String, SplineSet> hashMap3 = this.mAttributesMap;
        if (hashMap3 == null) {
            splineSet3 = null;
        } else {
            splineSet3 = hashMap3.get("rotationZ");
        }
        HashMap<String, SplineSet> hashMap4 = this.mAttributesMap;
        if (hashMap4 == null) {
            splineSet4 = null;
        } else {
            splineSet4 = hashMap4.get("scaleX");
        }
        HashMap<String, SplineSet> hashMap5 = this.mAttributesMap;
        if (hashMap5 == null) {
            splineSet5 = null;
        } else {
            splineSet5 = hashMap5.get("scaleY");
        }
        HashMap<String, KeyCycleOscillator> hashMap6 = this.mCycleMap;
        if (hashMap6 == null) {
            keyCycleOscillator = null;
        } else {
            keyCycleOscillator = hashMap6.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap7 = this.mCycleMap;
        if (hashMap7 == null) {
            keyCycleOscillator2 = null;
        } else {
            keyCycleOscillator2 = hashMap7.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap8 = this.mCycleMap;
        if (hashMap8 == null) {
            keyCycleOscillator3 = null;
        } else {
            keyCycleOscillator3 = hashMap8.get("rotationZ");
        }
        HashMap<String, KeyCycleOscillator> hashMap9 = this.mCycleMap;
        if (hashMap9 == null) {
            keyCycleOscillator4 = null;
        } else {
            keyCycleOscillator4 = hashMap9.get("scaleX");
        }
        HashMap<String, KeyCycleOscillator> hashMap10 = this.mCycleMap;
        if (hashMap10 != null) {
            keyCycleOscillator5 = hashMap10.get("scaleY");
        }
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d8 = adjustedPosition;
                curveFit.getPos(d8, dArr);
                this.mArcSpline.getSlope(d8, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f9, f10, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f9, f10, i8, i9, fArr);
            return;
        }
        int i10 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f11 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i10 < dArr2.length) {
                    dArr2[i10] = dArr2[i10] * f11;
                    i10++;
                } else {
                    this.mStartMotionPath.setDpDt(f9, f10, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f9, f10, i8, i9, fArr);
                    return;
                }
            }
        } else {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f12 = motionPaths.f14536x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f13 = f12 - motionPaths2.f14536x;
            KeyCycleOscillator keyCycleOscillator6 = keyCycleOscillator5;
            float f14 = motionPaths.f14537y - motionPaths2.f14537y;
            KeyCycleOscillator keyCycleOscillator7 = keyCycleOscillator4;
            float f15 = (motionPaths.width - motionPaths2.width) + f13;
            float f16 = (motionPaths.height - motionPaths2.height) + f14;
            fArr[0] = (f13 * (1.0f - f9)) + (f15 * f9);
            fArr[1] = (f14 * (1.0f - f10)) + (f16 * f10);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator7, keyCycleOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f9, f10, i8, i9, fArr);
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.height;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.width;
    }

    public float getStartX() {
        return this.mStartMotionPath.f14536x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f14537y;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f8, long j8, KeyCache keyCache) {
        double d8;
        float f9;
        float adjustedPosition = getAdjustedPosition(f8, null);
        int i8 = this.mQuantizeMotionSteps;
        if (i8 != -1) {
            float f10 = 1.0f / i8;
            float floor = ((float) Math.floor(adjustedPosition / f10)) * f10;
            float f11 = (adjustedPosition % f10) / f10;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f11 = (f11 + this.mQuantizeMotionPhase) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            if (differentialInterpolator != null) {
                f9 = differentialInterpolator.getInterpolation(f11);
            } else if (f11 > 0.5d) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            adjustedPosition = (f9 * f10) + floor;
        }
        float f12 = adjustedPosition;
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<SplineSet> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget, f12);
            }
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d9 = f12;
            curveFitArr[0].getPos(d9, this.mInterpolateData);
            this.mSpline[0].getSlope(d9, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d9, dArr);
                    this.mArcSpline.getSlope(d9, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                d8 = d9;
                this.mStartMotionPath.setView(f12, motionWidget, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
            } else {
                d8 = d9;
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget.getParent().findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (motionWidget.getRight() - motionWidget.getLeft() > 0 && motionWidget.getBottom() - motionWidget.getTop() > 0) {
                        motionWidget.setPivotX(left - motionWidget.getLeft());
                        motionWidget.setPivotY(top - motionWidget.getTop());
                    }
                }
            }
            int i9 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i9 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i9].getPos(d8, this.mValuesBuff);
                this.mStartMotionPath.customAttributes.get(this.mAttributeNames[i9 - 1]).setInterpolatedValue(motionWidget, this.mValuesBuff);
                i9++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f12 <= 0.0f) {
                    motionWidget.setVisibility(motionConstrainedPoint.visibility);
                } else if (f12 >= 1.0f) {
                    motionWidget.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                    motionWidget.setVisibility(4);
                }
            }
            if (this.mKeyTriggers != null) {
                int i10 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i10 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i10].conditionallyFire(f12, motionWidget);
                    i10++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f13 = motionPaths.f14536x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f14 = f13 + ((motionPaths2.f14536x - f13) * f12);
            float f15 = motionPaths.f14537y;
            float f16 = f15 + ((motionPaths2.f14537y - f15) * f12);
            float f17 = motionPaths.width;
            float f18 = f17 + ((motionPaths2.width - f17) * f12);
            float f19 = motionPaths.height;
            float f20 = f14 + 0.5f;
            float f21 = f16 + 0.5f;
            motionWidget.layout((int) f20, (int) f21, (int) (f20 + f18), (int) (f21 + f19 + ((motionPaths2.height - f19) * f12)));
        }
        HashMap<String, KeyCycleOscillator> hashMap2 = this.mCycleMap;
        if (hashMap2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : hashMap2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget, f12, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.setProperty(motionWidget, f12);
                }
            }
            return false;
        }
        return false;
    }

    String name() {
        return this.mView.getName();
    }

    void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f8, float f9, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f10 = motionPaths.f14536x;
        floatRect.left = f10;
        float f11 = motionPaths.f14537y;
        floatRect.top = f11;
        floatRect.right = f10 + motionPaths.width;
        floatRect.bottom = f11 + motionPaths.height;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f12 = motionPaths2.f14536x;
        floatRect2.left = f12;
        float f13 = motionPaths2.f14537y;
        floatRect2.top = f13;
        floatRect2.right = f12 + motionPaths2.width;
        floatRect2.bottom = f13 + motionPaths2.height;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f8, f9, strArr, fArr);
    }

    void rotate(Rect rect, Rect rect2, int i8, int i9, int i10) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 == 4) {
                        int i11 = rect.left + rect.right;
                        rect2.left = i9 - (((rect.bottom + rect.top) + rect.width()) / 2);
                        rect2.top = (i11 - rect.height()) / 2;
                        rect2.right = rect2.left + rect.width();
                        rect2.bottom = rect2.top + rect.height();
                        return;
                    }
                    return;
                }
                int i12 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i12 / 2);
                rect2.top = i10 - ((i12 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            }
            int i13 = rect.left + rect.right;
            rect2.left = i9 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i13 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i14 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i10 - ((i14 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    void setBothStates(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartPoint.setState(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setDrawPath(int i8) {
        this.mStartMotionPath.mDrawPath = i8;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.applyParameters(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setPathMotionArc(int i8) {
        this.mPathMotionArc = i8;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartMotionPath.applyParameters(motionWidget);
        this.mStartPoint.setState(motionWidget);
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i8, int i9, int i10) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        Rect rect = new Rect();
        if (i8 != 1) {
            if (i8 == 2) {
                int i11 = viewState.left + viewState.right;
                rect.left = i10 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
                rect.top = (i11 - viewState.height()) / 2;
                rect.right = rect.left + viewState.width();
                rect.bottom = rect.top + viewState.height();
            }
        } else {
            int i12 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i9 - ((i12 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i8, viewState.rotation);
    }

    public void setTransformPivotTarget(int i8) {
        this.mTransformPivotTarget = i8;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, float f8) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    public void setup(int i8, int i9, float f8, long j8) {
        ArrayList arrayList;
        String[] strArr;
        boolean z8;
        int i10;
        int i11;
        CustomVariable customVariable;
        int i12;
        SplineSet makeSpline;
        CustomVariable customVariable2;
        int i13;
        Integer num;
        SplineSet makeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i14 = this.mPathMotionArc;
        if (i14 != -1) {
            this.mStartMotionPath.mPathMotionArc = i14;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<MotionKey> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                MotionKey next = it.next();
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    insertKey(new MotionPaths(i8, i9, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i15 = motionKeyPosition.mCurveFit;
                    if (i15 != -1) {
                        this.mCurveFitType = i15;
                    }
                } else if (next instanceof MotionKeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof MotionKeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        char c8 = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next2.split(",")[c8];
                    Iterator<MotionKey> it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        MotionKey next3 = it3.next();
                        HashMap<String, CustomVariable> hashMap2 = next3.mCustom;
                        if (hashMap2 != null && (customVariable3 = hashMap2.get(str)) != null) {
                            customVar.append(next3.mFramePosition, customVariable3);
                        }
                    }
                    makeSpline2 = SplineSet.makeCustomSplineSet(next2, customVar);
                } else {
                    makeSpline2 = SplineSet.makeSpline(next2, j8);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
                c8 = 1;
            }
            ArrayList<MotionKey> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<MotionKey> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    MotionKey next4 = it4.next();
                    if (next4 instanceof MotionKeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i13 = num.intValue();
                } else {
                    i13 = 0;
                }
                SplineSet splineSet = this.mAttributesMap.get(str2);
                if (splineSet != null) {
                    splineSet.setup(i13);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str3 = next5.split(",")[1];
                        Iterator<MotionKey> it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            MotionKey next6 = it6.next();
                            HashMap<String, CustomVariable> hashMap3 = next6.mCustom;
                            if (hashMap3 != null && (customVariable2 = hashMap3.get(str3)) != null) {
                                customVar2.append(next6.mFramePosition, customVariable2);
                            }
                        }
                        makeSpline = SplineSet.makeCustomSplineSet(next5, customVar2);
                    } else {
                        makeSpline = SplineSet.makeSpline(next5, j8);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                    }
                }
            }
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<MotionKey> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    MotionKey next7 = it7.next();
                    if (next7 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i12 = hashMap.get(str4).intValue();
                } else {
                    i12 = 0;
                }
                this.mTimeCycleAttributesMap.get(str4).setup(i12);
            }
        }
        int size = this.mMotionPaths.size();
        int i16 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i16];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it8 = this.mMotionPaths.iterator();
        int i17 = 1;
        while (it8.hasNext()) {
            motionPathsArr[i17] = it8.next();
            i17++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.customAttributes.keySet()) {
            if (this.mStartMotionPath.customAttributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i18 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i18 >= strArr.length) {
                break;
            }
            String str6 = strArr[i18];
            this.mAttributeInterpolatorCount[i18] = 0;
            int i19 = 0;
            while (true) {
                if (i19 >= i16) {
                    break;
                }
                if (motionPathsArr[i19].customAttributes.containsKey(str6) && (customVariable = motionPathsArr[i19].customAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i18] = iArr[i18] + customVariable.numberOfInterpolatedValues();
                    break;
                }
                i19++;
            }
            i18++;
        }
        if (motionPathsArr[0].mPathMotionArc != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i20 = 1; i20 < i16; i20++) {
            motionPathsArr[i20].different(motionPathsArr[i20 - 1], zArr, this.mAttributeNames, z8);
        }
        int i21 = 0;
        for (int i22 = 1; i22 < length; i22++) {
            if (zArr[i22]) {
                i21++;
            }
        }
        this.mInterpolateVariables = new int[i21];
        int i23 = 2;
        int max = Math.max(2, i21);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i24 = 0;
        for (int i25 = 1; i25 < length; i25++) {
            if (zArr[i25]) {
                this.mInterpolateVariables[i24] = i25;
                i24++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, this.mInterpolateVariables.length);
        double[] dArr2 = new double[i16];
        for (int i26 = 0; i26 < i16; i26++) {
            motionPathsArr[i26].fillStandard(dArr[i26], this.mInterpolateVariables);
            dArr2[i26] = motionPathsArr[i26].time;
        }
        int i27 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i27 >= iArr2.length) {
                break;
            }
            if (iArr2[i27] < MotionPaths.names.length) {
                String str7 = MotionPaths.names[this.mInterpolateVariables[i27]] + " [";
                for (int i28 = 0; i28 < i16; i28++) {
                    str7 = str7 + dArr[i28][i27];
                }
            }
            i27++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i29 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i29 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i29];
            int i30 = 0;
            int i31 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i30 < i16) {
                if (motionPathsArr[i30].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i16];
                        int[] iArr3 = new int[i23];
                        iArr3[1] = motionPathsArr[i30].getCustomDataCount(str8);
                        i11 = 0;
                        iArr3[0] = i16;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    } else {
                        i11 = 0;
                    }
                    MotionPaths motionPaths = motionPathsArr[i30];
                    i10 = i16;
                    dArr3[i31] = motionPaths.time;
                    motionPaths.getCustomData(str8, dArr4[i31], i11);
                    i31++;
                } else {
                    i10 = i16;
                }
                i30++;
                i16 = i10;
                i23 = 2;
            }
            i29++;
            this.mSpline[i29] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i31), (double[][]) Arrays.copyOf(dArr4, i31));
            i16 = i16;
            i23 = 2;
        }
        int i32 = i16;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr4 = new int[i32];
            double[] dArr5 = new double[i32];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i32, 2);
            for (int i33 = 0; i33 < i32; i33++) {
                iArr4[i33] = motionPathsArr[i33].mPathMotionArc;
                dArr5[i33] = r7.time;
                double[] dArr7 = dArr6[i33];
                dArr7[0] = r7.f14536x;
                dArr7[1] = r7.f14537y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f9 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                KeyCycleOscillator makeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(next8);
                if (makeWidgetCycle != null) {
                    if (makeWidgetCycle.variesByPath() && Float.isNaN(f9)) {
                        f9 = getPreCycleDistance();
                    }
                    makeWidgetCycle.setType(next8);
                    this.mCycleMap.put(next8, makeWidgetCycle);
                }
            }
            Iterator<MotionKey> it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                MotionKey next9 = it10.next();
                if (next9 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<KeyCycleOscillator> it11 = this.mCycleMap.values().iterator();
            while (it11.hasNext()) {
                it11.next().setup(f9);
            }
        }
    }

    public void setupRelative(Motion motion) {
        this.mStartMotionPath.setupRelative(motion, motion.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motion, motion.mEndMotionPath);
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f14536x + " y: " + this.mStartMotionPath.f14537y + " end: x: " + this.mEndMotionPath.f14536x + " y: " + this.mEndMotionPath.f14537y;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, boolean z8) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, int i9) {
        if (i8 != 509) {
            return i8 == 704;
        }
        setPathMotionArc(i9);
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, String str) {
        if (705 == i8) {
            System.out.println("TYPE_INTERPOLATOR  " + str);
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
        }
        return false;
    }
}
