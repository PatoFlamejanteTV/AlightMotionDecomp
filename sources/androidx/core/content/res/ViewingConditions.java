package androidx.core.content.res;

import androidx.annotation.NonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    private ViewingConditions(float f8, float f9, float f10, float f11, float f12, float f13, float[] fArr, float f14, float f15, float f16) {
        this.mN = f8;
        this.mAw = f9;
        this.mNbb = f10;
        this.mNcb = f11;
        this.mC = f12;
        this.mNc = f13;
        this.mRgbD = fArr;
        this.mFl = f14;
        this.mFlRoot = f15;
        this.mZ = f16;
    }

    @NonNull
    static ViewingConditions make(@NonNull float[] fArr, float f8, float f9, float f10, boolean z8) {
        float lerp;
        float exp;
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = f12 + (fArr3[1] * f13);
        float f15 = fArr[2];
        float f16 = f14 + (fArr3[2] * f15);
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[0] * f11) + (fArr4[1] * f13) + (fArr4[2] * f15);
        float[] fArr5 = fArr2[2];
        float f18 = (f11 * fArr5[0]) + (f13 * fArr5[1]) + (f15 * fArr5[2]);
        float f19 = (f10 / 10.0f) + 0.8f;
        if (f19 >= 0.9d) {
            lerp = CamUtils.lerp(0.59f, 0.69f, (f19 - 0.9f) * 10.0f);
        } else {
            lerp = CamUtils.lerp(0.525f, 0.59f, (f19 - 0.8f) * 10.0f);
        }
        float f20 = lerp;
        if (z8) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f8) - 42.0f) / 92.0f)) * 0.2777778f)) * f19;
        }
        double d8 = exp;
        if (d8 > 1.0d) {
            exp = 1.0f;
        } else if (d8 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp};
        float f21 = 1.0f / ((5.0f * f8) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float cbrt = (f22 * f8) + (0.1f * f23 * f23 * ((float) Math.cbrt(f8 * 5.0d)));
        float yFromLStar = CamUtils.yFromLStar(f9) / fArr[1];
        double d9 = yFromLStar;
        float sqrt = ((float) Math.sqrt(d9)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d9, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f17) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f18) / 100.0d, 0.42d)};
        float f24 = fArr7[0];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[1];
        float f27 = (f26 * 400.0f) / (f26 + 27.13f);
        float f28 = fArr7[2];
        float[] fArr8 = {f25, f27, (400.0f * f28) / (f28 + 27.13f)};
        return new ViewingConditions(yFromLStar, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, f20, f19, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getAw() {
        return this.mAw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getC() {
        return this.mC;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFl() {
        return this.mFl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFlRoot() {
        return this.mFlRoot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getN() {
        return this.mN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getNbb() {
        return this.mNbb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getNc() {
        return this.mNc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getNcb() {
        return this.mNcb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getZ() {
        return this.mZ;
    }
}
