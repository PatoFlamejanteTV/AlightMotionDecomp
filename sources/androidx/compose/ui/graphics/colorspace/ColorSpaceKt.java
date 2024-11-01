package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.Connector;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14;
        if (d8 < 0.0d) {
            d14 = -d8;
        } else {
            d14 = d8;
        }
        return Math.copySign(rcpResponse(d14, d9, d10, d11, d12, d13), d8);
    }

    public static final double absResponse(double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14;
        if (d8 < 0.0d) {
            d14 = -d8;
        } else {
            d14 = d8;
        }
        return Math.copySign(response(d14, d9, d10, d11, d12, d13), d8);
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint) {
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            adaptation = Adaptation.Companion.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    public static final float[] chromaticAdaptation(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] mul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] mul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{mul3x3Float32[0] / mul3x3Float3[0], mul3x3Float32[1] / mul3x3Float3[1], mul3x3Float32[2] / mul3x3Float3[2]}, fArr));
    }

    public static final boolean compare(TransferParameters transferParameters, TransferParameters transferParameters2) {
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    /* renamed from: connect-YBCOT_4 */
    public static final Connector m3343connectYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i8) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (colorSpace == colorSpaces.getSrgb()) {
            if (colorSpace2 == colorSpaces.getSrgb()) {
                return Connector.Companion.getSrgbIdentity$ui_graphics_release();
            }
            if (colorSpace2 == colorSpaces.getOklab() && RenderIntent.m3353equalsimpl0(i8, RenderIntent.Companion.m3358getPerceptualuksYyKA())) {
                return Connector.Companion.getSrgbToOklabPerceptual$ui_graphics_release();
            }
        } else if (colorSpace == colorSpaces.getOklab() && colorSpace2 == colorSpaces.getSrgb() && RenderIntent.m3353equalsimpl0(i8, RenderIntent.Companion.m3358getPerceptualuksYyKA())) {
            return Connector.Companion.getOklabToSrgbPerceptual$ui_graphics_release();
        }
        if (colorSpace == colorSpace2) {
            return Connector.Companion.identity$ui_graphics_release(colorSpace);
        }
        long m3341getModelxdoWZVw = colorSpace.m3341getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
        AbstractC3284p abstractC3284p = null;
        if (ColorModel.m3332equalsimpl0(m3341getModelxdoWZVw, companion.m3339getRgbxdoWZVw()) && ColorModel.m3332equalsimpl0(colorSpace2.m3341getModelxdoWZVw(), companion.m3339getRgbxdoWZVw())) {
            AbstractC3292y.g(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            AbstractC3292y.g(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i8, abstractC3284p);
        }
        return new Connector(colorSpace, colorSpace2, i8, abstractC3284p);
    }

    /* renamed from: connect-YBCOT_4$default */
    public static /* synthetic */ Connector m3344connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i9 & 2) != 0) {
            i8 = RenderIntent.Companion.m3358getPerceptualuksYyKA();
        }
        return m3343connectYBCOT_4(colorSpace, colorSpace2, i8);
    }

    public static final float[] inverse3x3(float[] fArr) {
        float f8 = fArr[0];
        float f9 = fArr[3];
        float f10 = fArr[6];
        float f11 = fArr[1];
        float f12 = fArr[4];
        float f13 = fArr[7];
        float f14 = fArr[2];
        float f15 = fArr[5];
        float f16 = fArr[8];
        float f17 = (f12 * f16) - (f13 * f15);
        float f18 = (f13 * f14) - (f11 * f16);
        float f19 = (f11 * f15) - (f12 * f14);
        float f20 = (f8 * f17) + (f9 * f18) + (f10 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f17 / f20;
        fArr2[1] = f18 / f20;
        fArr2[2] = f19 / f20;
        fArr2[3] = ((f10 * f15) - (f9 * f16)) / f20;
        fArr2[4] = ((f16 * f8) - (f10 * f14)) / f20;
        fArr2[5] = ((f14 * f9) - (f15 * f8)) / f20;
        fArr2[6] = ((f9 * f13) - (f10 * f12)) / f20;
        fArr2[7] = ((f10 * f11) - (f13 * f8)) / f20;
        fArr2[8] = ((f8 * f12) - (f9 * f11)) / f20;
        return fArr2;
    }

    public static final float[] mul3x3(float[] fArr, float[] fArr2) {
        float f8 = fArr[0];
        float f9 = fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        float f14 = (f8 * f9) + (f10 * f11) + (f12 * f13);
        float f15 = fArr[1];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = (f15 * f9) + (f16 * f11) + (f17 * f13);
        float f19 = fArr[2];
        float f20 = fArr[5];
        float f21 = fArr[8];
        float f22 = (f9 * f19) + (f11 * f20) + (f13 * f21);
        float f23 = fArr2[3];
        float f24 = fArr2[4];
        float f25 = fArr2[5];
        float f26 = (f8 * f23) + (f10 * f24) + (f12 * f25);
        float f27 = (f15 * f23) + (f16 * f24) + (f17 * f25);
        float f28 = (f23 * f19) + (f24 * f20) + (f25 * f21);
        float f29 = fArr2[6];
        float f30 = fArr2[7];
        float f31 = (f8 * f29) + (f10 * f30);
        float f32 = fArr2[8];
        return new float[]{f14, f18, f22, f26, f27, f28, f31 + (f12 * f32), (f15 * f29) + (f16 * f30) + (f17 * f32), (f19 * f29) + (f20 * f30) + (f21 * f32)};
    }

    public static final float[] mul3x3Diag(float[] fArr, float[] fArr2) {
        float f8 = fArr[0];
        float f9 = fArr2[0] * f8;
        float f10 = fArr[1];
        float f11 = fArr2[1] * f10;
        float f12 = fArr[2];
        return new float[]{f9, f11, fArr2[2] * f12, fArr2[3] * f8, fArr2[4] * f10, fArr2[5] * f12, f8 * fArr2[6], f10 * fArr2[7], f12 * fArr2[8]};
    }

    public static final float[] mul3x3Float3(float[] fArr, float[] fArr2) {
        float f8 = fArr2[0];
        float f9 = fArr2[1];
        float f10 = fArr2[2];
        fArr2[0] = (fArr[0] * f8) + (fArr[3] * f9) + (fArr[6] * f10);
        fArr2[1] = (fArr[1] * f8) + (fArr[4] * f9) + (fArr[7] * f10);
        fArr2[2] = (fArr[2] * f8) + (fArr[5] * f9) + (fArr[8] * f10);
        return fArr2;
    }

    public static final float mul3x3Float3_0(float[] fArr, float f8, float f9, float f10) {
        return (fArr[0] * f8) + (fArr[3] * f9) + (fArr[6] * f10);
    }

    public static final float mul3x3Float3_1(float[] fArr, float f8, float f9, float f10) {
        return (fArr[1] * f8) + (fArr[4] * f9) + (fArr[7] * f10);
    }

    public static final float mul3x3Float3_2(float[] fArr, float f8, float f9, float f10) {
        return (fArr[2] * f8) + (fArr[5] * f9) + (fArr[8] * f10);
    }

    public static final double rcpResponse(double d8, double d9, double d10, double d11, double d12, double d13) {
        return d8 >= d12 * d11 ? (Math.pow(d8, 1.0d / d13) - d10) / d9 : d8 / d11;
    }

    public static final double response(double d8, double d9, double d10, double d11, double d12, double d13) {
        return d8 >= d12 ? Math.pow((d9 * d8) + d10, d13) : d8 * d11;
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (!ColorModel.m3332equalsimpl0(colorSpace.m3341getModelxdoWZVw(), ColorModel.Companion.m3339getRgbxdoWZVw())) {
            return colorSpace;
        }
        AbstractC3292y.g(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Rgb rgb = (Rgb) colorSpace;
        if (compare(rgb.getWhitePoint(), whitePoint)) {
            return colorSpace;
        }
        return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics_release(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform$ui_graphics_release()), whitePoint);
    }

    public static final double rcpResponse(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        return d8 >= d12 * d11 ? (Math.pow(d8 - d13, 1.0d / d15) - d10) / d9 : (d8 - d14) / d11;
    }

    public static final double response(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        return d8 >= d12 ? Math.pow((d9 * d8) + d10, d15) + d13 : (d11 * d8) + d14;
    }

    public static final boolean compare(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (Float.compare(fArr[i8], fArr2[i8]) != 0 && Math.abs(fArr[i8] - fArr2[i8]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
