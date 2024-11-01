package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class VelocityMatrix {
    private static String TAG = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    public void applyTransform(float f8, float f9, int i8, int i9, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = (f9 - 0.5f) * 2.0f;
        float f13 = f10 + this.mDTranslateX;
        float f14 = f11 + this.mDTranslateY;
        float f15 = f13 + (this.mDScaleX * (f8 - 0.5f) * 2.0f);
        float f16 = f14 + (this.mDScaleY * f12);
        float radians = (float) Math.toRadians(this.mRotate);
        float radians2 = (float) Math.toRadians(this.mDRotate);
        double d8 = radians;
        double d9 = i9 * f12;
        float sin = f15 + (((float) ((((-i8) * r7) * Math.sin(d8)) - (Math.cos(d8) * d9))) * radians2);
        float cos = f16 + (radians2 * ((float) (((i8 * r7) * Math.cos(d8)) - (d9 * Math.sin(d8)))));
        fArr[0] = sin;
        fArr[1] = cos;
    }

    public void clear() {
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f8) {
        if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f8);
            this.mRotate = splineSet.get(f8);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f8) {
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f8);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f8);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f8) {
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f8);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f8);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f8) {
        if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f8);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f8) {
        if (keyCycleOscillator != null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f8);
        }
        if (keyCycleOscillator2 != null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f8);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f8) {
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f8);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f8);
        }
    }
}
