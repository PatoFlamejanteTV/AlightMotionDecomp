package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    private float height;
    private Easing mKeyFrameEasing;
    private float position;
    int visibility;
    private float width;

    /* renamed from: x, reason: collision with root package name */
    private float f14534x;

    /* renamed from: y, reason: collision with root package name */
    private float f14535y;
    private float alpha = 1.0f;
    int mVisibilityMode = 0;
    private boolean applyElevation = false;
    private float elevation = 0.0f;
    private float rotation = 0.0f;
    private float rotationX = 0.0f;
    public float rotationY = 0.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float translationX = 0.0f;
    private float translationY = 0.0f;
    private float translationZ = 0.0f;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    private int mAnimateRelativeTo = -1;
    LinkedHashMap<String, CustomVariable> mCustomVariable = new LinkedHashMap<>();
    int mMode = 0;
    double[] mTempValue = new double[18];
    double[] mTempDelta = new double[18];

    private boolean diff(float f8, float f9) {
        if (!Float.isNaN(f8) && !Float.isNaN(f9)) {
            if (Math.abs(f8 - f9) <= 1.0E-6f) {
                return false;
            }
            return true;
        }
        if (Float.isNaN(f8) == Float.isNaN(f9)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0026. Please report as an issue. */
    public void addValues(HashMap<String, SplineSet> hashMap, int i8) {
        for (String str : hashMap.keySet()) {
            SplineSet splineSet = hashMap.get(str);
            str.hashCode();
            float f8 = 1.0f;
            float f9 = 0.0f;
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
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c8 = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c8 = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
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
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c8 = '\f';
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    if (!Float.isNaN(this.rotationX)) {
                        f9 = this.rotationX;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                case 1:
                    if (!Float.isNaN(this.rotationY)) {
                        f9 = this.rotationY;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                case 2:
                    if (!Float.isNaN(this.rotation)) {
                        f9 = this.rotation;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                case 3:
                    if (!Float.isNaN(this.translationX)) {
                        f9 = this.translationX;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                case 4:
                    if (!Float.isNaN(this.translationY)) {
                        f9 = this.translationY;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                case 5:
                    if (!Float.isNaN(this.translationZ)) {
                        f9 = this.translationZ;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                case 6:
                    if (!Float.isNaN(this.mProgress)) {
                        f9 = this.mProgress;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                case 7:
                    if (!Float.isNaN(this.mPivotX)) {
                        f9 = this.mPivotX;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                case '\b':
                    if (!Float.isNaN(this.mPivotY)) {
                        f9 = this.mPivotY;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                case '\t':
                    if (!Float.isNaN(this.scaleX)) {
                        f8 = this.scaleX;
                    }
                    splineSet.setPoint(i8, f8);
                    break;
                case '\n':
                    if (!Float.isNaN(this.scaleY)) {
                        f8 = this.scaleY;
                    }
                    splineSet.setPoint(i8, f8);
                    break;
                case 11:
                    if (!Float.isNaN(this.alpha)) {
                        f8 = this.alpha;
                    }
                    splineSet.setPoint(i8, f8);
                    break;
                case '\f':
                    if (!Float.isNaN(this.mPathRotate)) {
                        f9 = this.mPathRotate;
                    }
                    splineSet.setPoint(i8, f9);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.mCustomVariable.containsKey(str2)) {
                            CustomVariable customVariable = this.mCustomVariable.get(str2);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).setPoint(i8, customVariable);
                                break;
                            } else {
                                Utils.loge("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i8 + ", value" + customVariable.getValueToInterpolate() + splineSet);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Utils.loge("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void applyParameters(MotionWidget motionWidget) {
        float alpha;
        this.visibility = motionWidget.getVisibility();
        if (motionWidget.getVisibility() != 4) {
            alpha = 0.0f;
        } else {
            alpha = motionWidget.getAlpha();
        }
        this.alpha = alpha;
        this.applyElevation = false;
        this.rotation = motionWidget.getRotationZ();
        this.rotationX = motionWidget.getRotationX();
        this.rotationY = motionWidget.getRotationY();
        this.scaleX = motionWidget.getScaleX();
        this.scaleY = motionWidget.getScaleY();
        this.mPivotX = motionWidget.getPivotX();
        this.mPivotY = motionWidget.getPivotY();
        this.translationX = motionWidget.getTranslationX();
        this.translationY = motionWidget.getTranslationY();
        this.translationZ = motionWidget.getTranslationZ();
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.mCustomVariable.put(str, customAttribute);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.alpha, motionConstrainedPoint.alpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("translationZ");
        }
        int i8 = this.visibility;
        int i9 = motionConstrainedPoint.visibility;
        if (i8 != i9 && this.mVisibilityMode == 0 && (i8 == 4 || i9 == 4)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.rotationX, motionConstrainedPoint.rotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add("pivotX");
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add("pivotY");
        }
        if (diff(this.scaleX, motionConstrainedPoint.scaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.scaleY, motionConstrainedPoint.scaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.translationX, motionConstrainedPoint.translationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.translationY, motionConstrainedPoint.translationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.translationZ, motionConstrainedPoint.translationZ)) {
            hashSet.add("translationZ");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("elevation");
        }
    }

    void fillStandard(double[] dArr, int[] iArr) {
        int i8 = 0;
        float[] fArr = {this.position, this.f14534x, this.f14535y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        for (int i9 : iArr) {
            if (i9 < 18) {
                dArr[i8] = fArr[r5];
                i8++;
            }
        }
    }

    int getCustomData(String str, double[] dArr, int i8) {
        CustomVariable customVariable = this.mCustomVariable.get(str);
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i8] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        int i9 = 0;
        while (i9 < numberOfInterpolatedValues) {
            dArr[i8] = r1[i9];
            i9++;
            i8++;
        }
        return numberOfInterpolatedValues;
    }

    int getCustomDataCount(String str) {
        return this.mCustomVariable.get(str).numberOfInterpolatedValues();
    }

    boolean hasCustomData(String str) {
        return this.mCustomVariable.containsKey(str);
    }

    void setBounds(float f8, float f9, float f10, float f11) {
        this.f14534x = f8;
        this.f14535y = f9;
        this.width = f10;
        this.height = f11;
    }

    public void setState(MotionWidget motionWidget) {
        setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        applyParameters(motionWidget);
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.position, motionConstrainedPoint.position);
    }

    public void setState(Rect rect, MotionWidget motionWidget, int i8, float f8) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(motionWidget);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (i8 == 1) {
            this.rotation = f8 - 90.0f;
        } else {
            if (i8 != 2) {
                return;
            }
            this.rotation = f8 + 90.0f;
        }
    }

    void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.f14534x, motionConstrainedPoint.f14534x);
        zArr[2] = zArr[2] | diff(this.f14535y, motionConstrainedPoint.f14535y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }
}
