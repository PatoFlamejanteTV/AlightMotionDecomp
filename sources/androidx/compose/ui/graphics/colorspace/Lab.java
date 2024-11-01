package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class Lab extends ColorSpace {

    /* renamed from: A, reason: collision with root package name */
    private static final float f14435A = 0.008856452f;

    /* renamed from: B, reason: collision with root package name */
    private static final float f14436B = 7.787037f;

    /* renamed from: C, reason: collision with root package name */
    private static final float f14437C = 0.13793103f;
    public static final Companion Companion = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final float f14438D = 0.20689656f;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public Lab(String str, int i8) {
        super(str, ColorModel.Companion.m3338getLabxdoWZVw(), i8, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        float f8;
        float f9;
        float f10;
        float f11 = fArr[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f12 = f11 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f13 = fArr[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f14 = fArr[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        if (f12 > f14435A) {
            f8 = (float) Math.pow(f12, 0.33333334f);
        } else {
            f8 = (f12 * f14436B) + f14437C;
        }
        if (f13 > f14435A) {
            f9 = (float) Math.pow(f13, 0.33333334f);
        } else {
            f9 = (f13 * f14436B) + f14437C;
        }
        if (f14 > f14435A) {
            f10 = (float) Math.pow(f14, 0.33333334f);
        } else {
            f10 = f14437C + (f14 * f14436B);
        }
        fArr[0] = i6.m.j((116.0f * f9) - 16.0f, 0.0f, 100.0f);
        fArr[1] = i6.m.j((f8 - f9) * 500.0f, -128.0f, 128.0f);
        fArr[2] = i6.m.j((f9 - f10) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i8) {
        return i8 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i8) {
        return i8 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f8, float f9, float f10) {
        float f11;
        float f12;
        float j8 = (i6.m.j(f8, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float j9 = (i6.m.j(f9, -128.0f, 128.0f) * 0.002f) + j8;
        if (j9 > f14438D) {
            f11 = j9 * j9 * j9;
        } else {
            f11 = (j9 - f14437C) * 0.12841855f;
        }
        if (j8 > f14438D) {
            f12 = j8 * j8 * j8;
        } else {
            f12 = (j8 - f14437C) * 0.12841855f;
        }
        Illuminant illuminant = Illuminant.INSTANCE;
        float f13 = f11 * illuminant.getD50Xyz$ui_graphics_release()[0];
        float f14 = f12 * illuminant.getD50Xyz$ui_graphics_release()[1];
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float f8;
        float f9;
        float f10;
        fArr[0] = i6.m.j(fArr[0], 0.0f, 100.0f);
        fArr[1] = i6.m.j(fArr[1], -128.0f, 128.0f);
        float j8 = i6.m.j(fArr[2], -128.0f, 128.0f);
        fArr[2] = j8;
        float f11 = (fArr[0] + 16.0f) / 116.0f;
        float f12 = (fArr[1] * 0.002f) + f11;
        float f13 = f11 - (j8 * 0.005f);
        if (f12 > f14438D) {
            f8 = f12 * f12 * f12;
        } else {
            f8 = (f12 - f14437C) * 0.12841855f;
        }
        if (f11 > f14438D) {
            f9 = f11 * f11 * f11;
        } else {
            f9 = (f11 - f14437C) * 0.12841855f;
        }
        if (f13 > f14438D) {
            f10 = f13 * f13 * f13;
        } else {
            f10 = (f13 - f14437C) * 0.12841855f;
        }
        Illuminant illuminant = Illuminant.INSTANCE;
        fArr[0] = f8 * illuminant.getD50Xyz$ui_graphics_release()[0];
        fArr[1] = f9 * illuminant.getD50Xyz$ui_graphics_release()[1];
        fArr[2] = f10 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f8, float f9, float f10) {
        float f11;
        float j8 = ((i6.m.j(f8, 0.0f, 100.0f) + 16.0f) / 116.0f) - (i6.m.j(f10, -128.0f, 128.0f) * 0.005f);
        if (j8 > f14438D) {
            f11 = j8 * j8 * j8;
        } else {
            f11 = 0.12841855f * (j8 - f14437C);
        }
        return f11 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo3342xyzaToColorJlNiLsg$ui_graphics_release(float f8, float f9, float f10, float f11, ColorSpace colorSpace) {
        float f12;
        float f13;
        float f14;
        Illuminant illuminant = Illuminant.INSTANCE;
        float f15 = f8 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f16 = f9 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f17 = f10 / illuminant.getD50Xyz$ui_graphics_release()[2];
        if (f15 > f14435A) {
            f12 = (float) Math.pow(f15, 0.33333334f);
        } else {
            f12 = (f15 * f14436B) + f14437C;
        }
        if (f16 > f14435A) {
            f13 = (float) Math.pow(f16, 0.33333334f);
        } else {
            f13 = (f16 * f14436B) + f14437C;
        }
        if (f17 > f14435A) {
            f14 = (float) Math.pow(f17, 0.33333334f);
        } else {
            f14 = (f17 * f14436B) + f14437C;
        }
        return ColorKt.Color(i6.m.j((116.0f * f13) - 16.0f, 0.0f, 100.0f), i6.m.j((f12 - f13) * 500.0f, -128.0f, 128.0f), i6.m.j((f13 - f14) * 200.0f, -128.0f, 128.0f), f11, colorSpace);
    }
}
