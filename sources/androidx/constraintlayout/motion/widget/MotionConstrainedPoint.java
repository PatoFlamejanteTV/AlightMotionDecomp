package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
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
    private float f14548x;

    /* renamed from: y, reason: collision with root package name */
    private float f14549y;
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
    LinkedHashMap<String, ConstraintAttribute> attributes = new LinkedHashMap<>();
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
    public void addValues(HashMap<String, ViewSpline> hashMap, int i8) {
        for (String str : hashMap.keySet()) {
            ViewSpline viewSpline = hashMap.get(str);
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
                case -760884510:
                    if (str.equals(Key.PIVOT_X)) {
                        c8 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals(Key.PIVOT_Y)) {
                        c8 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals(Key.ROTATION)) {
                        c8 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c8 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c8 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c8 = '\r';
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    if (!Float.isNaN(this.rotationX)) {
                        f9 = this.rotationX;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case 1:
                    if (!Float.isNaN(this.rotationY)) {
                        f9 = this.rotationY;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case 2:
                    if (!Float.isNaN(this.translationX)) {
                        f9 = this.translationX;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case 3:
                    if (!Float.isNaN(this.translationY)) {
                        f9 = this.translationY;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case 4:
                    if (!Float.isNaN(this.translationZ)) {
                        f9 = this.translationZ;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case 5:
                    if (!Float.isNaN(this.mProgress)) {
                        f9 = this.mProgress;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case 6:
                    if (!Float.isNaN(this.scaleX)) {
                        f8 = this.scaleX;
                    }
                    viewSpline.setPoint(i8, f8);
                    break;
                case 7:
                    if (!Float.isNaN(this.scaleY)) {
                        f8 = this.scaleY;
                    }
                    viewSpline.setPoint(i8, f8);
                    break;
                case '\b':
                    if (!Float.isNaN(this.mPivotX)) {
                        f9 = this.mPivotX;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case '\t':
                    if (!Float.isNaN(this.mPivotY)) {
                        f9 = this.mPivotY;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case '\n':
                    if (!Float.isNaN(this.rotation)) {
                        f9 = this.rotation;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case 11:
                    if (!Float.isNaN(this.elevation)) {
                        f9 = this.elevation;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case '\f':
                    if (!Float.isNaN(this.mPathRotate)) {
                        f9 = this.mPathRotate;
                    }
                    viewSpline.setPoint(i8, f9);
                    break;
                case '\r':
                    if (!Float.isNaN(this.alpha)) {
                        f8 = this.alpha;
                    }
                    viewSpline.setPoint(i8, f8);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.attributes.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.attributes.get(str2);
                            if (viewSpline instanceof ViewSpline.CustomSet) {
                                ((ViewSpline.CustomSet) viewSpline).setPoint(i8, constraintAttribute);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i8 + ", value" + constraintAttribute.getValueToInterpolate() + viewSpline);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void applyParameters(View view) {
        this.visibility = view.getVisibility();
        this.alpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.applyElevation = false;
        this.elevation = view.getElevation();
        this.rotation = view.getRotation();
        this.rotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.scaleX = view.getScaleX();
        this.scaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.translationX = view.getTranslationX();
        this.translationY = view.getTranslationY();
        this.translationZ = view.getTranslationZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.alpha, motionConstrainedPoint.alpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("elevation");
        }
        int i8 = this.visibility;
        int i9 = motionConstrainedPoint.visibility;
        if (i8 != i9 && this.mVisibilityMode == 0 && (i8 == 0 || i9 == 0)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("transitionPathRotate");
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
            hashSet.add(Key.PIVOT_X);
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add(Key.PIVOT_Y);
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
    }

    void fillStandard(double[] dArr, int[] iArr) {
        int i8 = 0;
        float[] fArr = {this.position, this.f14548x, this.f14549y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        for (int i9 : iArr) {
            if (i9 < 18) {
                dArr[i8] = fArr[r5];
                i8++;
            }
        }
    }

    int getCustomData(String str, double[] dArr, int i8) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i8] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        int i9 = 0;
        while (i9 < numberOfInterpolatedValues) {
            dArr[i8] = r1[i9];
            i9++;
            i8++;
        }
        return numberOfInterpolatedValues;
    }

    int getCustomDataCount(String str) {
        return this.attributes.get(str).numberOfInterpolatedValues();
    }

    boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    void setBounds(float f8, float f9, float f10, float f11) {
        this.f14548x = f8;
        this.f14549y = f9;
        this.width = f10;
        this.height = f11;
    }

    public void setState(View view) {
        setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        applyParameters(view);
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.position, motionConstrainedPoint.position);
    }

    public void setState(Rect rect, View view, int i8, float f8) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(view);
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

    public void setState(Rect rect, ConstraintSet constraintSet, int i8, int i9) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(constraintSet.getParameters(i9));
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return;
                    }
                }
            }
            float f8 = this.rotation + 90.0f;
            this.rotation = f8;
            if (f8 > 180.0f) {
                this.rotation = f8 - 360.0f;
                return;
            }
            return;
        }
        this.rotation -= 90.0f;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        int i8 = propertySet.mVisibilityMode;
        this.mVisibilityMode = i8;
        int i9 = propertySet.visibility;
        this.visibility = i9;
        this.alpha = (i9 == 0 || i8 != 0) ? propertySet.alpha : 0.0f;
        ConstraintSet.Transform transform = constraint.transform;
        this.applyElevation = transform.applyElevation;
        this.elevation = transform.elevation;
        this.rotation = transform.rotation;
        this.rotationX = transform.rotationX;
        this.rotationY = transform.rotationY;
        this.scaleX = transform.scaleX;
        this.scaleY = transform.scaleY;
        this.mPivotX = transform.transformPivotX;
        this.mPivotY = transform.transformPivotY;
        this.translationX = transform.translationX;
        this.translationY = transform.translationY;
        this.translationZ = transform.translationZ;
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.f14548x, motionConstrainedPoint.f14548x);
        zArr[2] = zArr[2] | diff(this.f14549y, motionConstrainedPoint.f14549y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }
}
