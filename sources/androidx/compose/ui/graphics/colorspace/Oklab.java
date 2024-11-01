package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class Oklab extends ColorSpace {
    public static final Companion Companion = new Companion(null);
    private static final float[] InverseM1;
    private static final float[] InverseM2;

    /* renamed from: M1, reason: collision with root package name */
    private static final float[] f14439M1;

    /* renamed from: M2, reason: collision with root package name */
    private static final float[] f14440M2;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        float[] transform$ui_graphics_release = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] mul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        f14439M1 = mul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f14440M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(mul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }

    public Oklab(String str, int i8) {
        super(str, ColorModel.Companion.m3338getLabxdoWZVw(), i8, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(f14439M1, fArr);
        double d8 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d8));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d8));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d8));
        ColorSpaceKt.mul3x3Float3(f14440M2, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i8) {
        return i8 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i8) {
        return i8 == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f8, float f9, float f10) {
        float j8 = i6.m.j(f8, 0.0f, 1.0f);
        float j9 = i6.m.j(f9, -0.5f, 0.5f);
        float j10 = i6.m.j(f10, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, j8, j9, j10);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, j8, j9, j10);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, j8, j9, j10);
        float f11 = mul3x3Float3_0 * mul3x3Float3_0 * mul3x3Float3_0;
        float f12 = mul3x3Float3_1 * mul3x3Float3_1 * mul3x3Float3_1;
        float f13 = mul3x3Float3_2 * mul3x3Float3_2 * mul3x3Float3_2;
        float[] fArr2 = InverseM1;
        float mul3x3Float3_02 = ColorSpaceKt.mul3x3Float3_0(fArr2, f11, f12, f13);
        float mul3x3Float3_12 = ColorSpaceKt.mul3x3Float3_1(fArr2, f11, f12, f13);
        return (Float.floatToRawIntBits(mul3x3Float3_02) << 32) | (Float.floatToRawIntBits(mul3x3Float3_12) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        fArr[0] = i6.m.j(fArr[0], 0.0f, 1.0f);
        fArr[1] = i6.m.j(fArr[1], -0.5f, 0.5f);
        fArr[2] = i6.m.j(fArr[2], -0.5f, 0.5f);
        ColorSpaceKt.mul3x3Float3(InverseM2, fArr);
        float f8 = fArr[0];
        fArr[0] = f8 * f8 * f8;
        float f9 = fArr[1];
        fArr[1] = f9 * f9 * f9;
        float f10 = fArr[2];
        fArr[2] = f10 * f10 * f10;
        ColorSpaceKt.mul3x3Float3(InverseM1, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f8, float f9, float f10) {
        float j8 = i6.m.j(f8, 0.0f, 1.0f);
        float j9 = i6.m.j(f9, -0.5f, 0.5f);
        float j10 = i6.m.j(f10, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, j8, j9, j10);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, j8, j9, j10);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, j8, j9, j10);
        float f11 = mul3x3Float3_2 * mul3x3Float3_2 * mul3x3Float3_2;
        return ColorSpaceKt.mul3x3Float3_2(InverseM1, mul3x3Float3_0 * mul3x3Float3_0 * mul3x3Float3_0, mul3x3Float3_1 * mul3x3Float3_1 * mul3x3Float3_1, f11);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo3342xyzaToColorJlNiLsg$ui_graphics_release(float f8, float f9, float f10, float f11, ColorSpace colorSpace) {
        float[] fArr = f14439M1;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, f8, f9, f10);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, f8, f9, f10);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, f8, f9, f10);
        double d8 = 0.33333334f;
        float signum = Math.signum(mul3x3Float3_0) * ((float) Math.pow(Math.abs(mul3x3Float3_0), d8));
        float signum2 = Math.signum(mul3x3Float3_1) * ((float) Math.pow(Math.abs(mul3x3Float3_1), d8));
        float signum3 = Math.signum(mul3x3Float3_2) * ((float) Math.pow(Math.abs(mul3x3Float3_2), d8));
        float[] fArr2 = f14440M2;
        return ColorKt.Color(ColorSpaceKt.mul3x3Float3_0(fArr2, signum, signum2, signum3), ColorSpaceKt.mul3x3Float3_1(fArr2, signum, signum2, signum3), ColorSpaceKt.mul3x3Float3_2(fArr2, signum, signum2, signum3), f11, colorSpace);
    }
}
