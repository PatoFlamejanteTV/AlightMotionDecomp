package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    HashMap<String, CustomVariable> customAttributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    float mRelativeAngle;
    Motion mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* renamed from: x, reason: collision with root package name */
    float f14536x;

    /* renamed from: y, reason: collision with root package name */
    float f14537y;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

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

    private static final float xRotate(float f8, float f9, float f10, float f11, float f12, float f13) {
        return (((f12 - f10) * f9) - ((f13 - f11) * f8)) + f10;
    }

    private static final float yRotate(float f8, float f9, float f10, float f11, float f12, float f13) {
        return ((f12 - f10) * f8) + ((f13 - f11) * f9) + f11;
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.motion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.propertySet.mProgress;
        this.mRelativeAngle = 0.0f;
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.customAttributes.put(str, customAttribute);
            }
        }
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos(this.mProgress);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z8) {
        boolean diff = diff(this.f14536x, motionPaths.f14536x);
        boolean diff2 = diff(this.f14537y, motionPaths.f14537y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z9 = diff | diff2 | z8;
        zArr[1] = zArr[1] | z9;
        zArr[2] = z9 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f14536x, this.f14537y, this.width, this.height, this.mPathRotate};
        int i8 = 0;
        for (int i9 : iArr) {
            if (i9 < 6) {
                dArr[i8] = fArr[r2];
                i8++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.width;
        float f9 = this.height;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f10 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 != 3) {
                if (i10 == 4) {
                    f9 = f10;
                }
            } else {
                f8 = f10;
            }
        }
        fArr[i8] = f8;
        fArr[i8 + 1] = f9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(double d8, int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.f14536x;
        float f9 = this.f14537y;
        float f10 = this.width;
        float f11 = this.height;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f12 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 == 1) {
                f8 = f12;
            } else if (i10 == 2) {
                f9 = f12;
            } else if (i10 == 3) {
                f10 = f12;
            } else if (i10 == 4) {
                f11 = f12;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d8, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d9 = f13;
            double d10 = f8;
            double d11 = f9;
            f8 = (float) ((d9 + (Math.sin(d11) * d10)) - (f10 / 2.0f));
            f9 = (float) ((f14 - (d10 * Math.cos(d11))) - (f11 / 2.0f));
        }
        fArr[i8] = f8 + (f10 / 2.0f) + 0.0f;
        fArr[i8 + 1] = f9 + (f11 / 2.0f) + 0.0f;
    }

    void getCenterVelocity(double d8, int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.f14536x;
        float f9 = this.f14537y;
        float f10 = this.width;
        float f11 = this.height;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f12 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            f11 = f12;
                        }
                    } else {
                        f10 = f12;
                    }
                } else {
                    f9 = f12;
                }
            } else {
                f8 = f12;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d8, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d9 = f13;
            double d10 = f8;
            double d11 = f9;
            f8 = (float) ((d9 + (Math.sin(d11) * d10)) - (f10 / 2.0f));
            f9 = (float) ((f14 - (d10 * Math.cos(d11))) - (f11 / 2.0f));
        }
        fArr[i8] = f8 + (f10 / 2.0f) + 0.0f;
        fArr[i8 + 1] = f9 + (f11 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomData(String str, double[] dArr, int i8) {
        CustomVariable customVariable = this.customAttributes.get(str);
        int i9 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i8] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        while (i9 < numberOfInterpolatedValues) {
            dArr[i8] = r2[i9];
            i9++;
            i8++;
        }
        return numberOfInterpolatedValues;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomDataCount(String str) {
        CustomVariable customVariable = this.customAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.f14536x;
        float f9 = this.f14537y;
        float f10 = this.width;
        float f11 = this.height;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f12 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            f11 = f12;
                        }
                    } else {
                        f10 = f12;
                    }
                } else {
                    f9 = f12;
                }
            } else {
                f8 = f12;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d8 = f8;
            double d9 = f9;
            float sin = (float) ((centerX + (Math.sin(d9) * d8)) - (f10 / 2.0f));
            f9 = (float) ((centerY - (d8 * Math.cos(d9))) - (f11 / 2.0f));
            f8 = sin;
        }
        float f13 = f10 + f8;
        float f14 = f11 + f9;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i8] = f8 + 0.0f;
        fArr[i8 + 1] = f9 + 0.0f;
        fArr[i8 + 2] = f13 + 0.0f;
        fArr[i8 + 3] = f9 + 0.0f;
        fArr[i8 + 4] = f13 + 0.0f;
        fArr[i8 + 5] = f14 + 0.0f;
        fArr[i8 + 6] = f8 + 0.0f;
        fArr[i8 + 7] = f14 + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasCustomData(String str) {
        return this.customAttributes.containsKey(str);
    }

    void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f12;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f8 = f12;
        } else {
            f8 = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f9 = f12;
        } else {
            f9 = motionKeyPosition.mPercentHeight;
        }
        float f13 = motionPaths2.width;
        float f14 = motionPaths.width;
        float f15 = motionPaths2.height;
        float f16 = motionPaths.height;
        this.position = this.time;
        float f17 = motionPaths.f14536x;
        float f18 = motionPaths.f14537y;
        float f19 = (motionPaths2.f14536x + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f20 = (motionPaths2.f14537y + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f21 = ((f13 - f14) * f8) / 2.0f;
        this.f14536x = (int) ((f17 + (f19 * f12)) - f21);
        float f22 = ((f15 - f16) * f9) / 2.0f;
        this.f14537y = (int) ((f18 + (f20 * f12)) - f22);
        this.width = (int) (f14 + r9);
        this.height = (int) (f16 + r12);
        if (Float.isNaN(motionKeyPosition.mPercentX)) {
            f10 = f12;
        } else {
            f10 = motionKeyPosition.mPercentX;
        }
        float f23 = 0.0f;
        if (Float.isNaN(motionKeyPosition.mAltPercentY)) {
            f11 = 0.0f;
        } else {
            f11 = motionKeyPosition.mAltPercentY;
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f12 = motionKeyPosition.mPercentY;
        }
        if (!Float.isNaN(motionKeyPosition.mAltPercentX)) {
            f23 = motionKeyPosition.mAltPercentX;
        }
        this.mMode = 0;
        this.f14536x = (int) (((motionPaths.f14536x + (f10 * f19)) + (f23 * f20)) - f21);
        this.f14537y = (int) (((motionPaths.f14537y + (f19 * f11)) + (f20 * f12)) - f22);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8;
        float f9;
        float f10;
        float f11 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f11;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f8 = f11;
        } else {
            f8 = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f9 = f11;
        } else {
            f9 = motionKeyPosition.mPercentHeight;
        }
        float f12 = motionPaths2.width - motionPaths.width;
        float f13 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f11 = motionKeyPosition.mPercentX;
        }
        float f14 = motionPaths.f14536x;
        float f15 = motionPaths.width;
        float f16 = motionPaths.f14537y;
        float f17 = motionPaths.height;
        float f18 = (motionPaths2.f14536x + (motionPaths2.width / 2.0f)) - ((f15 / 2.0f) + f14);
        float f19 = (motionPaths2.f14537y + (motionPaths2.height / 2.0f)) - ((f17 / 2.0f) + f16);
        float f20 = f18 * f11;
        float f21 = (f12 * f8) / 2.0f;
        this.f14536x = (int) ((f14 + f20) - f21);
        float f22 = f11 * f19;
        float f23 = (f13 * f9) / 2.0f;
        this.f14537y = (int) ((f16 + f22) - f23);
        this.width = (int) (f15 + r7);
        this.height = (int) (f17 + r8);
        if (Float.isNaN(motionKeyPosition.mPercentY)) {
            f10 = 0.0f;
        } else {
            f10 = motionKeyPosition.mPercentY;
        }
        this.mMode = 1;
        float f24 = (int) ((motionPaths.f14536x + f20) - f21);
        float f25 = (int) ((motionPaths.f14537y + f22) - f23);
        this.f14536x = f24 + ((-f19) * f10);
        this.f14537y = f25 + (f18 * f10);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initPolar(int i8, int i9, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8;
        float f9;
        float f10;
        float min;
        float f11;
        float f12;
        float f13 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f13;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mMode = motionKeyPosition.mPositionType;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f8 = f13;
        } else {
            f8 = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f9 = f13;
        } else {
            f9 = motionKeyPosition.mPercentHeight;
        }
        float f14 = motionPaths2.width;
        float f15 = motionPaths.width;
        float f16 = motionPaths2.height;
        float f17 = motionPaths.height;
        this.position = this.time;
        this.width = (int) (f15 + ((f14 - f15) * f8));
        this.height = (int) (f17 + ((f16 - f17) * f9));
        int i10 = motionKeyPosition.mPositionType;
        if (i10 != 1) {
            if (i10 != 2) {
                if (Float.isNaN(motionKeyPosition.mPercentX)) {
                    f12 = f13;
                } else {
                    f12 = motionKeyPosition.mPercentX;
                }
                float f18 = motionPaths2.f14536x;
                float f19 = motionPaths.f14536x;
                this.f14536x = (f12 * (f18 - f19)) + f19;
                if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                    f13 = motionKeyPosition.mPercentY;
                }
                float f20 = motionPaths2.f14537y;
                float f21 = motionPaths.f14537y;
                this.f14537y = (f13 * (f20 - f21)) + f21;
            } else {
                if (Float.isNaN(motionKeyPosition.mPercentX)) {
                    float f22 = motionPaths2.f14536x;
                    float f23 = motionPaths.f14536x;
                    min = ((f22 - f23) * f13) + f23;
                } else {
                    min = Math.min(f9, f8) * motionKeyPosition.mPercentX;
                }
                this.f14536x = min;
                if (Float.isNaN(motionKeyPosition.mPercentY)) {
                    float f24 = motionPaths2.f14537y;
                    float f25 = motionPaths.f14537y;
                    f11 = (f13 * (f24 - f25)) + f25;
                } else {
                    f11 = motionKeyPosition.mPercentY;
                }
                this.f14537y = f11;
            }
        } else {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                f10 = f13;
            } else {
                f10 = motionKeyPosition.mPercentX;
            }
            float f26 = motionPaths2.f14536x;
            float f27 = motionPaths.f14536x;
            this.f14536x = (f10 * (f26 - f27)) + f27;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f13 = motionKeyPosition.mPercentY;
            }
            float f28 = motionPaths2.f14537y;
            float f29 = motionPaths.f14537y;
            this.f14537y = (f13 * (f28 - f29)) + f29;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initScreen(int i8, int i9, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8;
        float f9;
        float f10 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f10;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f8 = f10;
        } else {
            f8 = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f9 = f10;
        } else {
            f9 = motionKeyPosition.mPercentHeight;
        }
        float f11 = motionPaths2.width;
        float f12 = motionPaths.width;
        float f13 = motionPaths2.height;
        float f14 = motionPaths.height;
        this.position = this.time;
        float f15 = motionPaths.f14536x;
        float f16 = motionPaths.f14537y;
        float f17 = motionPaths2.f14536x + (f11 / 2.0f);
        float f18 = motionPaths2.f14537y + (f13 / 2.0f);
        float f19 = (f11 - f12) * f8;
        this.f14536x = (int) ((f15 + ((f17 - ((f12 / 2.0f) + f15)) * f10)) - (f19 / 2.0f));
        float f20 = (f13 - f14) * f9;
        this.f14537y = (int) ((f16 + ((f18 - (f16 + (f14 / 2.0f))) * f10)) - (f20 / 2.0f));
        this.width = (int) (f12 + f19);
        this.height = (int) (f14 + f20);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f14536x = (int) (motionKeyPosition.mPercentX * ((int) (i8 - this.width)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f14537y = (int) (motionKeyPosition.mPercentY * ((int) (i9 - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBounds(float f8, float f9, float f10, float f11) {
        this.f14536x = f8;
        this.f14537y = f9;
        this.width = f10;
        this.height = f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDpDt(float f8, float f9, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f14 = (float) dArr[i8];
            double d8 = dArr2[i8];
            int i9 = iArr[i8];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4) {
                            f13 = f14;
                        }
                    } else {
                        f11 = f14;
                    }
                } else {
                    f12 = f14;
                }
            } else {
                f10 = f14;
            }
        }
        float f15 = f10 - ((0.0f * f11) / 2.0f);
        float f16 = f12 - ((0.0f * f13) / 2.0f);
        fArr[0] = (f15 * (1.0f - f8)) + (((f11 * 1.0f) + f15) * f8) + 0.0f;
        fArr[1] = (f16 * (1.0f - f9)) + (((f13 * 1.0f) + f16) * f9) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setView(float f8, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f9;
        float f10;
        float f11 = this.f14536x;
        float f12 = this.f14537y;
        float f13 = this.width;
        float f14 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i8 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i8];
            this.mTempDelta = new double[i8];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i9 = 0; i9 < iArr.length; i9++) {
            double[] dArr4 = this.mTempValue;
            int i10 = iArr[i9];
            dArr4[i10] = dArr[i9];
            this.mTempDelta[i10] = dArr2[i9];
        }
        float f15 = Float.NaN;
        int i11 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i11 >= dArr5.length) {
                break;
            }
            double d8 = 0.0d;
            if (Double.isNaN(dArr5[i11]) && (dArr3 == null || dArr3[i11] == 0.0d)) {
                f10 = f15;
            } else {
                if (dArr3 != null) {
                    d8 = dArr3[i11];
                }
                if (!Double.isNaN(this.mTempValue[i11])) {
                    d8 = this.mTempValue[i11] + d8;
                }
                f10 = f15;
                float f20 = (float) d8;
                float f21 = (float) this.mTempDelta[i11];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    f15 = f20;
                                }
                            } else {
                                f15 = f10;
                                f19 = f21;
                                f14 = f20;
                            }
                        } else {
                            f15 = f10;
                            f18 = f21;
                            f13 = f20;
                        }
                    } else {
                        f15 = f10;
                        f17 = f21;
                        f12 = f20;
                    }
                } else {
                    f15 = f10;
                    f16 = f21;
                    f11 = f20;
                }
                i11++;
            }
            f15 = f10;
            i11++;
        }
        float f22 = f15;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f8, fArr, fArr2);
            float f23 = fArr[0];
            float f24 = fArr[1];
            float f25 = fArr2[0];
            float f26 = fArr2[1];
            double d9 = f11;
            double d10 = f12;
            float sin = (float) ((f23 + (Math.sin(d10) * d9)) - (f13 / 2.0f));
            f9 = f14;
            float cos = (float) ((f24 - (Math.cos(d10) * d9)) - (f14 / 2.0f));
            double d11 = f16;
            double d12 = f17;
            float sin2 = (float) (f25 + (Math.sin(d10) * d11) + (Math.cos(d10) * d9 * d12));
            float cos2 = (float) ((f26 - (d11 * Math.cos(d10))) + (d9 * Math.sin(d10) * d12));
            if (dArr2.length >= 2) {
                dArr2[0] = sin2;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f22)) {
                motionWidget.setRotationZ((float) (f22 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f11 = sin;
            f12 = cos;
        } else {
            f9 = f14;
            if (!Float.isNaN(f22)) {
                motionWidget.setRotationZ((float) (0.0f + f22 + Math.toDegrees(Math.atan2(f17 + (f19 / 2.0f), f16 + (f18 / 2.0f)))));
            }
        }
        float f27 = f11 + 0.5f;
        float f28 = f12 + 0.5f;
        motionWidget.layout((int) f27, (int) f28, (int) (f27 + f13), (int) (f28 + f9));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d8 = ((this.f14536x + (this.width / 2.0f)) - motionPaths.f14536x) - (motionPaths.width / 2.0f);
        double d9 = ((this.f14537y + (this.height / 2.0f)) - motionPaths.f14537y) - (motionPaths.height / 2.0f);
        this.mRelativeToController = motion;
        this.f14536x = (float) Math.hypot(d9, d8);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f14537y = (float) (Math.atan2(d9, d8) + 1.5707963267948966d);
        } else {
            this.f14537y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public MotionPaths(int i8, int i9, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != -1) {
            initPolar(i8, i9, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i10 = motionKeyPosition.mPositionType;
        if (i10 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i10 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i8, i9, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(double d8, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f8;
        float f9 = this.f14536x;
        float f10 = this.f14537y;
        float f11 = this.width;
        float f12 = this.height;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f17 = (float) dArr[i8];
            float f18 = (float) dArr2[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                f9 = f17;
                f13 = f18;
            } else if (i9 == 2) {
                f10 = f17;
                f15 = f18;
            } else if (i9 == 3) {
                f11 = f17;
                f14 = f18;
            } else if (i9 == 4) {
                f12 = f17;
                f16 = f18;
            }
        }
        float f19 = 2.0f;
        float f20 = (f14 / 2.0f) + f13;
        float f21 = (f16 / 2.0f) + f15;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d8, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            double d9 = f9;
            double d10 = f10;
            f8 = f11;
            float sin = (float) ((f22 + (Math.sin(d10) * d9)) - (f11 / 2.0f));
            float cos = (float) ((f23 - (d9 * Math.cos(d10))) - (f12 / 2.0f));
            double d11 = f13;
            double d12 = f15;
            float sin2 = (float) (f24 + (Math.sin(d10) * d11) + (Math.cos(d10) * d12));
            f21 = (float) ((f25 - (d11 * Math.cos(d10))) + (Math.sin(d10) * d12));
            f20 = sin2;
            f9 = sin;
            f10 = cos;
            f19 = 2.0f;
        } else {
            f8 = f11;
        }
        fArr[0] = f9 + (f8 / f19) + 0.0f;
        fArr[1] = f10 + (f12 / f19) + 0.0f;
        fArr2[0] = f20;
        fArr2[1] = f21;
    }
}
