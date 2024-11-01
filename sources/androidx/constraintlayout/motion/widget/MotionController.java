package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MotionController {
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
    private HashMap<String, ViewSpline> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, ViewOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private CurveFit[] mSpline;
    private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private View mTransformPivotView;
    View mView;
    Rect mTempRect = new Rect();
    boolean mForceMeasure = false;
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
    private ArrayList<Key> mKeyList = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public MotionController(View view) {
        int i8 = Key.UNSET;
        this.mPathMotionArc = i8;
        this.mTransformPivotTarget = i8;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i8;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
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

    private static Interpolator getInterpolator(Context context, int i8, String str, int i9) {
        if (i8 != -2) {
            if (i8 != -1) {
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 4) {
                                if (i8 != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f8) {
                    return (float) Easing.this.get(f8);
                }
            };
        }
        return AnimationUtils.loadInterpolator(context, i9);
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
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Log.e(TAG, " KeyPath position \"" + motionPaths.position + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    void buildBounds(float[] fArr, int i8) {
        float f8 = 1.0f / (i8 - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public int buildKeyFrames(float[] fArr, int[] iArr) {
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
        for (int i10 = 0; i10 < timePoints.length; i10++) {
            this.mSpline[0].getPos(timePoints[i10], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i10], this.mInterpolateVariables, this.mInterpolateData, fArr, i9);
            i9 += 2;
        }
        return i9 / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void buildPath(float[] fArr, int i8) {
        ViewSpline viewSpline;
        ViewSpline viewSpline2;
        ViewOscillator viewOscillator;
        double d8;
        float f8 = 1.0f;
        float f9 = 1.0f / (i8 - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewOscillator viewOscillator2 = null;
        if (hashMap == null) {
            viewSpline = null;
        } else {
            viewSpline = hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            viewSpline2 = null;
        } else {
            viewSpline2 = hashMap2.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 == null) {
            viewOscillator = null;
        } else {
            viewOscillator = hashMap3.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            viewOscillator2 = hashMap4.get("translationY");
        }
        ViewOscillator viewOscillator3 = viewOscillator2;
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
            if (viewOscillator != null) {
                fArr[i10] = fArr[i10] + viewOscillator.get(f14);
            } else if (viewSpline != null) {
                fArr[i10] = fArr[i10] + viewSpline.get(f14);
            }
            if (viewOscillator3 != null) {
                int i12 = i10 + 1;
                fArr[i12] = fArr[i12] + viewOscillator3.get(f14);
            } else if (viewSpline2 != null) {
                int i13 = i10 + 1;
                fArr[i13] = fArr[i13] + viewSpline2.get(f14);
            }
            i9 = i11 + 1;
            f8 = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void buildRect(float f8, float[] fArr, int i8) {
        this.mSpline[0].getPos(getAdjustedPosition(f8, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void buildRectangles(float[] fArr, int i8) {
        float f8 = 1.0f / (i8 - 1);
        for (int i9 = 0; i9 < i8; i9++) {
            this.mSpline[0].getPos(getAdjustedPosition(i9 * f8, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i9 * 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void endTrigger(boolean z8) {
        float f8;
        if ("button".equals(Debug.getName(this.mView)) && this.mKeyTriggers != null) {
            int i8 = 0;
            while (true) {
                KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                if (i8 < keyTriggerArr.length) {
                    KeyTrigger keyTrigger = keyTriggerArr[i8];
                    if (z8) {
                        f8 = -100.0f;
                    } else {
                        f8 = 100.0f;
                    }
                    keyTrigger.conditionallyFire(f8, this.mView);
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAttributeValues(String str, float[] fArr, int i8) {
        ViewSpline viewSpline = this.mAttributesMap.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i9 = 0; i9 < fArr.length; i9++) {
            fArr[i9] = viewSpline.get(i9 / (fArr.length - 1));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getDpDt(float f8, float f9, float f10, float[] fArr) {
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
        float f12 = motionPaths.f14550x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f13 = f12 - motionPaths2.f14550x;
        float f14 = motionPaths.f14551y - motionPaths2.f14551y;
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
        return this.mEndMotionPath.f14550x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f14551y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MotionPaths getKeyFrame(int i8) {
        return this.mMotionPaths.get(i8);
    }

    public int getKeyFrameInfo(int i8, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<Key> it = this.mKeyList.iterator();
        int i9 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            Key next = it.next();
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
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    iArr[i10 + 5] = keyPosition.mPositionType;
                    iArr[i10 + 6] = Float.floatToIntBits(keyPosition.mPercentX);
                    i13 = i10 + 7;
                    iArr[i13] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i14 = i13 + 1;
                iArr[i10] = i14 - i10;
                i9++;
                i10 = i14;
            }
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getKeyFrameParameter(int i8, float f8, float f9) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f10 = motionPaths.f14550x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f11 = motionPaths2.f14550x;
        float f12 = f10 - f11;
        float f13 = motionPaths.f14551y;
        float f14 = motionPaths2.f14551y;
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
        Iterator<Key> it = this.mKeyList.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            Key next = it.next();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyPositionBase getPositionKeyframe(int i8, int i9, float f8, float f9) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f10 = motionPaths.f14550x;
        rectF.left = f10;
        float f11 = motionPaths.f14551y;
        rectF.top = f11;
        rectF.right = f10 + motionPaths.width;
        rectF.bottom = f11 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f12 = motionPaths2.f14550x;
        rectF2.left = f12;
        float f13 = motionPaths2.f14551y;
        rectF2.top = f13;
        rectF2.right = f12 + motionPaths2.width;
        rectF2.bottom = f13 + motionPaths2.height;
        Iterator<Key> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            Key next = it.next();
            if (next instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) next;
                if (keyPositionBase.intersects(i8, i9, rectF, rectF2, f8, f9)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getPostLayoutDvDp(float f8, int i8, int i9, float f9, float f10, float[] fArr) {
        ViewSpline viewSpline;
        ViewSpline viewSpline2;
        ViewSpline viewSpline3;
        ViewSpline viewSpline4;
        ViewSpline viewSpline5;
        ViewOscillator viewOscillator;
        ViewOscillator viewOscillator2;
        ViewOscillator viewOscillator3;
        ViewOscillator viewOscillator4;
        float adjustedPosition = getAdjustedPosition(f8, this.mVelocity);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewOscillator viewOscillator5 = null;
        if (hashMap == null) {
            viewSpline = null;
        } else {
            viewSpline = hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            viewSpline2 = null;
        } else {
            viewSpline2 = hashMap2.get("translationY");
        }
        HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
        if (hashMap3 == null) {
            viewSpline3 = null;
        } else {
            viewSpline3 = hashMap3.get(Key.ROTATION);
        }
        HashMap<String, ViewSpline> hashMap4 = this.mAttributesMap;
        if (hashMap4 == null) {
            viewSpline4 = null;
        } else {
            viewSpline4 = hashMap4.get("scaleX");
        }
        HashMap<String, ViewSpline> hashMap5 = this.mAttributesMap;
        if (hashMap5 == null) {
            viewSpline5 = null;
        } else {
            viewSpline5 = hashMap5.get("scaleY");
        }
        HashMap<String, ViewOscillator> hashMap6 = this.mCycleMap;
        if (hashMap6 == null) {
            viewOscillator = null;
        } else {
            viewOscillator = hashMap6.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap7 = this.mCycleMap;
        if (hashMap7 == null) {
            viewOscillator2 = null;
        } else {
            viewOscillator2 = hashMap7.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap8 = this.mCycleMap;
        if (hashMap8 == null) {
            viewOscillator3 = null;
        } else {
            viewOscillator3 = hashMap8.get(Key.ROTATION);
        }
        HashMap<String, ViewOscillator> hashMap9 = this.mCycleMap;
        if (hashMap9 == null) {
            viewOscillator4 = null;
        } else {
            viewOscillator4 = hashMap9.get("scaleX");
        }
        HashMap<String, ViewOscillator> hashMap10 = this.mCycleMap;
        if (hashMap10 != null) {
            viewOscillator5 = hashMap10.get("scaleY");
        }
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
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
            float f12 = motionPaths.f14550x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f13 = f12 - motionPaths2.f14550x;
            ViewOscillator viewOscillator6 = viewOscillator5;
            float f14 = motionPaths.f14551y - motionPaths2.f14551y;
            ViewOscillator viewOscillator7 = viewOscillator4;
            float f15 = (motionPaths.width - motionPaths2.width) + f13;
            float f16 = (motionPaths.height - motionPaths2.height) + f14;
            fArr[0] = (f13 * (1.0f - f9)) + (f15 * f9);
            fArr[1] = (f14 * (1.0f - f10)) + (f16 * f10);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator7, viewOscillator6, adjustedPosition);
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
        return this.mStartMotionPath.f14550x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f14551y;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public View getView() {
        return this.mView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean interpolate(View view, float f8, long j8, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean z8;
        char c8;
        double d8;
        float f9;
        float adjustedPosition = getAdjustedPosition(f8, null);
        int i8 = this.mQuantizeMotionSteps;
        if (i8 != Key.UNSET) {
            float f10 = 1.0f / i8;
            float floor = ((float) Math.floor(adjustedPosition / f10)) * f10;
            float f11 = (adjustedPosition % f10) / f10;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f11 = (f11 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            if (interpolator != null) {
                f9 = interpolator.getInterpolation(f11);
            } else if (f11 > 0.5d) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            adjustedPosition = (f9 * f10) + floor;
        }
        float f12 = adjustedPosition;
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<ViewSpline> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view, f12);
            }
        }
        HashMap<String, ViewTimeCycle> hashMap2 = this.mTimeCycleAttributesMap;
        if (hashMap2 != null) {
            ViewTimeCycle.PathRotate pathRotate2 = null;
            boolean z9 = false;
            for (ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate2 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z9 |= viewTimeCycle.setProperty(view, f12, j8, keyCache);
                }
            }
            z8 = z9;
            pathRotate = pathRotate2;
        } else {
            pathRotate = null;
            z8 = false;
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
                this.mStartMotionPath.setView(f12, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                this.mForceMeasure = false;
            } else {
                d8 = d9;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
            if (hashMap3 != null) {
                for (ViewSpline viewSpline : hashMap3.values()) {
                    if (viewSpline instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) viewSpline).setPathRotate(view, f12, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                c8 = 1;
                z8 |= pathRotate.setPathRotate(view, keyCache, f12, j8, dArr3[0], dArr3[1]);
            } else {
                c8 = 1;
            }
            int i9 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i9 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i9].getPos(d8, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.attributes.get(this.mAttributeNames[i9 - 1]), view, this.mValuesBuff);
                i9++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f12 <= 0.0f) {
                    view.setVisibility(motionConstrainedPoint.visibility);
                } else if (f12 >= 1.0f) {
                    view.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                    view.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i10 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i10 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i10].conditionallyFire(f12, view);
                    i10++;
                }
            }
        } else {
            c8 = 1;
            MotionPaths motionPaths = this.mStartMotionPath;
            float f13 = motionPaths.f14550x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f14 = f13 + ((motionPaths2.f14550x - f13) * f12);
            float f15 = motionPaths.f14551y;
            float f16 = f15 + ((motionPaths2.f14551y - f15) * f12);
            float f17 = motionPaths.width;
            float f18 = motionPaths2.width;
            float f19 = motionPaths.height;
            float f20 = motionPaths2.height;
            float f21 = f14 + 0.5f;
            int i11 = (int) f21;
            float f22 = f16 + 0.5f;
            int i12 = (int) f22;
            int i13 = (int) (f21 + ((f18 - f17) * f12) + f17);
            int i14 = (int) (f22 + ((f20 - f19) * f12) + f19);
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            if (f18 != f17 || f20 != f19 || this.mForceMeasure) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                this.mForceMeasure = false;
            }
            view.layout(i11, i12, i13, i14);
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            for (ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view, f12, dArr4[0], dArr4[c8]);
                } else {
                    viewOscillator.setProperty(view, f12);
                }
            }
        }
        return z8;
    }

    String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f8, float f9, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f10 = motionPaths.f14550x;
        rectF.left = f10;
        float f11 = motionPaths.f14551y;
        rectF.top = f11;
        rectF.right = f10 + motionPaths.width;
        rectF.bottom = f11 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f12 = motionPaths2.f14550x;
        rectF2.left = f12;
        float f13 = motionPaths2.f14551y;
        rectF2.top = f13;
        rectF2.right = f12 + motionPaths2.width;
        rectF2.bottom = f13 + motionPaths2.height;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f8, f9, strArr, fArr);
    }

    public void remeasure() {
        this.mForceMeasure = true;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBothStates(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mEndMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
        this.mEndPoint.setState(view);
    }

    public void setDrawPath(int i8) {
        this.mStartMotionPath.mDrawPath = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndState(Rect rect, ConstraintSet constraintSet, int i8, int i9) {
        int i10 = constraintSet.mRotate;
        if (i10 != 0) {
            rotate(rect, this.mTempRect, i10, i8, i9);
            rect = this.mTempRect;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(rect, constraintSet, i10, this.mId);
    }

    public void setPathMotionArc(int i8) {
        this.mPathMotionArc = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ViewState viewState, View view, int i8, int i9, int i10) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        Rect rect = new Rect();
        if (i8 == 1) {
            int i11 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i9 - ((i11 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i8 == 2) {
            int i12 = viewState.left + viewState.right;
            rect.left = i10 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
            rect.top = (i12 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, view, i8, viewState.rotation);
    }

    public void setTransformPivotTarget(int i8) {
        this.mTransformPivotTarget = i8;
        this.mTransformPivotView = null;
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i8, int i9, float f8, long j8) {
        ArrayList arrayList;
        String[] strArr;
        boolean z8;
        double[][] dArr;
        ConstraintAttribute constraintAttribute;
        int i10;
        ViewTimeCycle makeSpline;
        ConstraintAttribute constraintAttribute2;
        int i11;
        Integer num;
        ViewSpline makeSpline2;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i12 = this.mPathMotionArc;
        if (i12 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i12;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                Key next = it.next();
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    insertKey(new MotionPaths(i8, i9, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i13 = keyPosition.mCurveFit;
                    if (i13 != Key.UNSET) {
                        this.mCurveFitType = i13;
                    }
                } else if (next instanceof KeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof KeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        char c8 = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<Key> it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        Key next3 = it3.next();
                        HashMap<String, ConstraintAttribute> hashMap2 = next3.mCustomConstraints;
                        if (hashMap2 != null && (constraintAttribute3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.mFramePosition, constraintAttribute3);
                        }
                    }
                    makeSpline2 = ViewSpline.makeCustomSpline(next2, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    makeSpline2 = ViewSpline.makeSpline(next2);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
            }
            ArrayList<Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<Key> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Key next4 = it4.next();
                    if (next4 instanceof KeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                ViewSpline viewSpline = this.mAttributesMap.get(str2);
                if (viewSpline != null) {
                    viewSpline.setup(i11);
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
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<Key> it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            Key next6 = it6.next();
                            HashMap<String, ConstraintAttribute> hashMap3 = next6.mCustomConstraints;
                            if (hashMap3 != null && (constraintAttribute2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.mFramePosition, constraintAttribute2);
                            }
                        }
                        makeSpline = ViewTimeCycle.makeCustomSpline(next5, sparseArray2);
                    } else {
                        makeSpline = ViewTimeCycle.makeSpline(next5, j8);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                        this.mTimeCycleAttributesMap.put(next5, makeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<Key> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    Key next7 = it7.next();
                    if (next7 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i10 = hashMap.get(str4).intValue();
                } else {
                    i10 = 0;
                }
                this.mTimeCycleAttributesMap.get(str4).setup(i10);
            }
        }
        int size = this.mMotionPaths.size();
        int i14 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i14];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it8 = this.mMotionPaths.iterator();
        int i15 = 1;
        while (it8.hasNext()) {
            motionPathsArr[i15] = it8.next();
            i15++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i16 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i16 >= strArr.length) {
                break;
            }
            String str6 = strArr[i16];
            this.mAttributeInterpolatorCount[i16] = 0;
            int i17 = 0;
            while (true) {
                if (i17 >= i14) {
                    break;
                }
                if (motionPathsArr[i17].attributes.containsKey(str6) && (constraintAttribute = motionPathsArr[i17].attributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i16] = iArr[i16] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
                i17++;
            }
            i16++;
        }
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            z8 = true;
        } else {
            z8 = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i18 = 1; i18 < i14; i18++) {
            motionPathsArr[i18].different(motionPathsArr[i18 - 1], zArr, this.mAttributeNames, z8);
        }
        int i19 = 0;
        for (int i20 = 1; i20 < length; i20++) {
            if (zArr[i20]) {
                i19++;
            }
        }
        this.mInterpolateVariables = new int[i19];
        int i21 = 2;
        int max = Math.max(2, i19);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i22 = 0;
        for (int i23 = 1; i23 < length; i23++) {
            if (zArr[i23]) {
                this.mInterpolateVariables[i22] = i23;
                i22++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i14, this.mInterpolateVariables.length);
        double[] dArr3 = new double[i14];
        for (int i24 = 0; i24 < i14; i24++) {
            motionPathsArr[i24].fillStandard(dArr2[i24], this.mInterpolateVariables);
            dArr3[i24] = motionPathsArr[i24].time;
        }
        int i25 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i25 >= iArr2.length) {
                break;
            }
            if (iArr2[i25] < MotionPaths.names.length) {
                String str7 = MotionPaths.names[this.mInterpolateVariables[i25]] + " [";
                for (int i26 = 0; i26 < i14; i26++) {
                    str7 = str7 + dArr2[i26][i25];
                }
            }
            i25++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i27 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i27 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i27];
            int i28 = 0;
            double[] dArr4 = null;
            int i29 = 0;
            double[][] dArr5 = null;
            while (i28 < i14) {
                if (motionPathsArr[i28].hasCustomData(str8)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i14];
                        int[] iArr3 = new int[i21];
                        iArr3[c8] = motionPathsArr[i28].getCustomDataCount(str8);
                        iArr3[0] = i14;
                        dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    }
                    MotionPaths motionPaths = motionPathsArr[i28];
                    dArr = dArr2;
                    dArr4[i29] = motionPaths.time;
                    motionPaths.getCustomData(str8, dArr5[i29], 0);
                    i29++;
                } else {
                    dArr = dArr2;
                }
                i28++;
                dArr2 = dArr;
                i21 = 2;
                c8 = 1;
            }
            i27++;
            this.mSpline[i27] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr4, i29), (double[][]) Arrays.copyOf(dArr5, i29));
            dArr2 = dArr2;
            i21 = 2;
            c8 = 1;
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr3, dArr2);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr4 = new int[i14];
            double[] dArr6 = new double[i14];
            double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i14, 2);
            for (int i30 = 0; i30 < i14; i30++) {
                iArr4[i30] = motionPathsArr[i30].mPathMotionArc;
                dArr6[i30] = r9.time;
                double[] dArr8 = dArr7[i30];
                dArr8[0] = r9.f14550x;
                dArr8[1] = r9.f14551y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr6, dArr7);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f9 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                ViewOscillator makeSpline3 = ViewOscillator.makeSpline(next8);
                if (makeSpline3 != null) {
                    if (makeSpline3.variesByPath() && Float.isNaN(f9)) {
                        f9 = getPreCycleDistance();
                    }
                    makeSpline3.setType(next8);
                    this.mCycleMap.put(next8, makeSpline3);
                }
            }
            Iterator<Key> it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                Key next9 = it10.next();
                if (next9 instanceof KeyCycle) {
                    ((KeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<ViewOscillator> it11 = this.mCycleMap.values().iterator();
            while (it11.hasNext()) {
                it11.next().setup(f9);
            }
        }
    }

    public void setupRelative(MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f14550x + " y: " + this.mStartMotionPath.f14551y + " end: x: " + this.mEndMotionPath.f14550x + " y: " + this.mEndMotionPath.f14551y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartState(Rect rect, ConstraintSet constraintSet, int i8, int i9) {
        int i10 = constraintSet.mRotate;
        if (i10 != 0) {
            rotate(rect, this.mTempRect, i10, i8, i9);
        }
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        readView(motionPaths);
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(rect, constraintSet, i10, this.mId);
        this.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        this.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        this.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = this.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        this.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }
}
