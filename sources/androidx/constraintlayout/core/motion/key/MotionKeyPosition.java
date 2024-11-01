package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.f;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class MotionKeyPosition extends MotionKey {
    static final int KEY_TYPE = 2;
    static final String NAME = "KeyPosition";
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float mAltPercentX;
    public float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public String mTransitionEasing;

    public MotionKeyPosition() {
        int i8 = MotionKey.UNSET;
        this.mCurveFit = i8;
        this.mTransitionEasing = null;
        this.mPathMotionArc = i8;
        this.mDrawPath = 0;
        this.mPercentWidth = Float.NaN;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = Float.NaN;
        this.mPercentY = Float.NaN;
        this.mAltPercentX = Float.NaN;
        this.mAltPercentY = Float.NaN;
        this.mPositionType = 0;
        this.mCalculatedPositionX = Float.NaN;
        this.mCalculatedPositionY = Float.NaN;
        this.mType = 2;
    }

    private void calcCartesianPosition(float f8, float f9, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float f15 = f10 - f8;
        float f16 = f11 - f9;
        float f17 = 0.0f;
        if (Float.isNaN(this.mPercentX)) {
            f12 = 0.0f;
        } else {
            f12 = this.mPercentX;
        }
        if (Float.isNaN(this.mAltPercentY)) {
            f13 = 0.0f;
        } else {
            f13 = this.mAltPercentY;
        }
        if (Float.isNaN(this.mPercentY)) {
            f14 = 0.0f;
        } else {
            f14 = this.mPercentY;
        }
        if (!Float.isNaN(this.mAltPercentX)) {
            f17 = this.mAltPercentX;
        }
        this.mCalculatedPositionX = (int) (f8 + (f12 * f15) + (f17 * f16));
        this.mCalculatedPositionY = (int) (f9 + (f15 * f13) + (f16 * f14));
    }

    private void calcPathPosition(float f8, float f9, float f10, float f11) {
        float f12 = f10 - f8;
        float f13 = f11 - f9;
        float f14 = this.mPercentX;
        float f15 = this.mPercentY;
        this.mCalculatedPositionX = f8 + (f12 * f14) + ((-f13) * f15);
        this.mCalculatedPositionY = f9 + (f13 * f14) + (f12 * f15);
    }

    private void calcScreenPosition(int i8, int i9) {
        float f8 = this.mPercentX;
        float f9 = 0;
        this.mCalculatedPositionX = (i8 * f8) + f9;
        this.mCalculatedPositionY = (i9 * f8) + f9;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    void calcPosition(int i8, int i9, float f8, float f9, float f10, float f11) {
        int i10 = this.mPositionType;
        if (i10 != 1) {
            if (i10 != 2) {
                calcCartesianPosition(f8, f9, f10, f11);
                return;
            } else {
                calcScreenPosition(i8, i9);
                return;
            }
        }
        calcPathPosition(f8, f9, f10, f11);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.mCalculatedPositionX = motionKeyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = motionKeyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return f.a(str);
    }

    float getPositionX() {
        return this.mCalculatedPositionX;
    }

    float getPositionY() {
        return this.mCalculatedPositionY;
    }

    public boolean intersects(int i8, int i9, FloatRect floatRect, FloatRect floatRect2, float f8, float f9) {
        calcPosition(i8, i9, floatRect.centerX(), floatRect.centerY(), floatRect2.centerX(), floatRect2.centerY());
        if (Math.abs(f8 - this.mCalculatedPositionX) < 20.0f && Math.abs(f9 - this.mCalculatedPositionY) < 20.0f) {
            return true;
        }
        return false;
    }

    public void positionAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f8, float f9, String[] strArr, float[] fArr) {
        int i8 = this.mPositionType;
        if (i8 != 1) {
            if (i8 != 2) {
                positionCartAttributes(floatRect, floatRect2, f8, f9, strArr, fArr);
                return;
            } else {
                positionScreenAttributes(motionWidget, floatRect, floatRect2, f8, f9, strArr, fArr);
                return;
            }
        }
        positionPathAttributes(floatRect, floatRect2, f8, f9, strArr, fArr);
    }

    void positionCartAttributes(FloatRect floatRect, FloatRect floatRect2, float f8, float f9, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f8 - centerX) / centerX2;
                fArr[1] = (f9 - centerY) / centerY2;
                return;
            } else {
                fArr[1] = (f8 - centerX) / centerX2;
                fArr[0] = (f9 - centerY) / centerY2;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = (f8 - centerX) / centerX2;
        strArr[1] = "percentY";
        fArr[1] = (f9 - centerY) / centerY2;
    }

    void positionPathAttributes(FloatRect floatRect, FloatRect floatRect2, float f8, float f9, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f10 = centerX2 / hypot;
        float f11 = centerY2 / hypot;
        float f12 = f9 - centerY;
        float f13 = f8 - centerX;
        float f14 = ((f10 * f12) - (f13 * f11)) / hypot;
        float f15 = ((f10 * f13) + (f11 * f12)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f15;
                fArr[1] = f14;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f15;
        fArr[1] = f14;
    }

    void positionScreenAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f8, float f9, String[] strArr, float[] fArr) {
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f8 / width;
                fArr[1] = f9 / height;
                return;
            } else {
                fArr[1] = f8 / width;
                fArr[0] = f9 / height;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = f8 / width;
        strArr[1] = "percentY";
        fArr[1] = f9 / height;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, int i9) {
        if (i8 == 100) {
            this.mFramePosition = i9;
            return true;
        }
        if (i8 == 508) {
            this.mCurveFit = i9;
            return true;
        }
        if (i8 != 510) {
            return super.setValue(i8, i9);
        }
        this.mPositionType = i9;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo5417clone() {
        return new MotionKeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, float f8) {
        switch (i8) {
            case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
                this.mPercentWidth = f8;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
                this.mPercentHeight = f8;
                return true;
            case TypedValues.PositionType.TYPE_SIZE_PERCENT /* 505 */:
                this.mPercentWidth = f8;
                this.mPercentHeight = f8;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
                this.mPercentX = f8;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                this.mPercentY = f8;
                return true;
            default:
                return super.setValue(i8, f8);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, String str) {
        if (i8 != 501) {
            return super.setValue(i8, str);
        }
        this.mTransitionEasing = str.toString();
        return true;
    }
}
