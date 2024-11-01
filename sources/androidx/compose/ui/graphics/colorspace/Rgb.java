package androidx.compose.ui.graphics.colorspace;

import R5.AbstractC1428l;
import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {
    public static final Companion Companion = new Companion(null);
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.h
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d8) {
            double DoubleIdentity$lambda$12;
            DoubleIdentity$lambda$12 = Rgb.DoubleIdentity$lambda$12(d8);
            return DoubleIdentity$lambda$12;
        }
    };
    private final Function1 eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final Function1 oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        private final float area(float[] fArr) {
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[2];
            float f11 = fArr[3];
            float f12 = fArr[4];
            float f13 = fArr[5];
            float f14 = ((((((f8 * f11) + (f9 * f12)) + (f10 * f13)) - (f11 * f12)) - (f9 * f10)) - (f8 * f13)) * 0.5f;
            if (f14 < 0.0f) {
                return -f14;
            }
            return f14;
        }

        private final boolean compare(double d8, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            if (Math.abs(doubleFunction.invoke(d8) - doubleFunction2.invoke(d8)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f8 = mul3x3Float3[0];
            float f9 = mul3x3Float3[1];
            float f10 = f8 + f9 + mul3x3Float3[2];
            return new WhitePoint(f8 / f10, f9 / f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[2];
            float f11 = fArr[3];
            float f12 = fArr[4];
            float f13 = fArr[5];
            float x8 = whitePoint.getX();
            float y8 = whitePoint.getY();
            float f14 = 1;
            float f15 = (f14 - f8) / f9;
            float f16 = (f14 - f10) / f11;
            float f17 = (f14 - f12) / f13;
            float f18 = (f14 - x8) / y8;
            float f19 = f8 / f9;
            float f20 = (f10 / f11) - f19;
            float f21 = (x8 / y8) - f19;
            float f22 = f16 - f15;
            float f23 = (f12 / f13) - f19;
            float f24 = (((f18 - f15) * f20) - (f21 * f22)) / (((f17 - f15) * f20) - (f22 * f23));
            float f25 = (f21 - (f23 * f24)) / f20;
            float f26 = (1.0f - f25) - f24;
            float f27 = f26 / f9;
            float f28 = f25 / f11;
            float f29 = f24 / f13;
            return new float[]{f27 * f8, f26, f27 * ((1.0f - f8) - f9), f28 * f10, f25, f28 * ((1.0f - f10) - f11), f29 * f12, f24, f29 * ((1.0f - f12) - f13)};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f8 = fArr[0];
            float f9 = fArr2[0];
            float f10 = fArr[1];
            float f11 = fArr2[1];
            float f12 = fArr[2] - fArr2[2];
            float f13 = fArr[3] - fArr2[3];
            float f14 = fArr[4];
            float f15 = fArr2[4];
            float f16 = fArr[5];
            float f17 = fArr2[5];
            float[] fArr3 = {f8 - f9, f10 - f11, f12, f13, f14 - f15, f16 - f17};
            if (cross(fArr3[0], fArr3[1], f9 - f15, f11 - f17) < 0.0f || cross(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || cross(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || cross(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || cross(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || cross(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        private final float cross(float f8, float f9, float f10, float f11) {
            return (f8 * f11) - (f9 * f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f8, float f9, int i8) {
            if (i8 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || f8 != 0.0f || f9 != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d8 = 0.0d; d8 <= 1.0d; d8 += 0.00392156862745098d) {
                if (!compare(d8, doubleFunction, srgb.getOetfOrig$ui_graphics_release()) || !compare(d8, doubleFunction2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f8, float f9) {
            float area = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if ((area / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (f8 < 0.0f && f9 > 1.0f)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                float f10 = f8 + f9 + fArr[2];
                fArr2[0] = f8 / f10;
                fArr2[1] = f9 / f10;
                float f11 = fArr[3];
                float f12 = fArr[4];
                float f13 = f11 + f12 + fArr[5];
                fArr2[2] = f11 / f13;
                fArr2[3] = f12 / f13;
                float f14 = fArr[6];
                float f15 = fArr[7];
                float f16 = f14 + f15 + fArr[8];
                fArr2[4] = f14 / f16;
                fArr2[5] = f15 / f16;
            } else {
                AbstractC1428l.k(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f8 = mul3x3Float3[0];
            float f9 = mul3x3Float3[1];
            float f10 = f8 + f9 + mul3x3Float3[2];
            float f11 = mul3x3Float32[0];
            float f12 = mul3x3Float32[1];
            float f13 = f11 + f12 + mul3x3Float32[2];
            float f14 = mul3x3Float33[0];
            float f15 = mul3x3Float33[1];
            float f16 = f14 + f15 + mul3x3Float33[2];
            return new float[]{f8 / f10, f9 / f10, f11 / f13, f12 / f13, f14 / f16, f15 / f16};
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f8, float f9, TransferParameters transferParameters, int i8) {
        super(str, ColorModel.Companion.m3339getRgbxdoWZVw(), i8, null);
        this.whitePoint = whitePoint;
        this.min = f8;
        this.max = f9;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Rgb$oetf$1(this);
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d8) {
                double oetfFunc$lambda$0;
                oetfFunc$lambda$0 = Rgb.oetfFunc$lambda$0(Rgb.this, d8);
                return oetfFunc$lambda$0;
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Rgb$eotf$1(this);
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.g
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d8) {
                double eotfFunc$lambda$1;
                eotfFunc$lambda$1 = Rgb.eotfFunc$lambda$1(Rgb.this, d8);
                return eotfFunc$lambda$1;
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f8 < f9) {
            Companion companion = Companion;
            float[] xyPrimaries = companion.xyPrimaries(fArr);
            this.primaries = xyPrimaries;
            if (fArr2 == null) {
                this.transform = companion.computeXYZMatrix(xyPrimaries, whitePoint);
            } else if (fArr2.length == 9) {
                this.transform = fArr2;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
            this.isWideGamut = companion.isWideGamut(xyPrimaries, f8, f9);
            this.isSrgb = companion.isSrgb(xyPrimaries, whitePoint, doubleFunction, doubleFunction2, f8, f9, i8);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f8 + ", max=" + f9 + "; min must be strictly < max");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d8) {
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$10(double d8, double d9) {
        if (d9 < 0.0d) {
            d9 = 0.0d;
        }
        return Math.pow(d9, 1.0d / d8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$11(double d8, double d9) {
        if (d9 < 0.0d) {
            d9 = 0.0d;
        }
        return Math.pow(d9, d8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(Function1 function1, double d8) {
        return ((Number) function1.invoke(Double.valueOf(d8))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(Function1 function1, double d8) {
        return ((Number) function1.invoke(Double.valueOf(d8))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(Function1 function1, double d8) {
        return ((Number) function1.invoke(Double.valueOf(d8))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(Function1 function1, double d8) {
        return ((Number) function1.invoke(Double.valueOf(d8))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(TransferParameters transferParameters, double d8) {
        return ColorSpaceKt.rcpResponse(d8, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(TransferParameters transferParameters, double d8) {
        return ColorSpaceKt.rcpResponse(d8, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$8(TransferParameters transferParameters, double d8) {
        return ColorSpaceKt.response(d8, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$9(TransferParameters transferParameters, double d8) {
        return ColorSpaceKt.response(d8, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d8) {
        return rgb.eotfOrig.invoke(i6.m.i(d8, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d8) {
        return i6.m.i(rgb.oetfOrig.invoke(d8), rgb.min, rgb.max);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !AbstractC3292y.d(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return AbstractC3292y.d(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (!AbstractC3292y.d(this.oetfOrig, rgb.oetfOrig)) {
            return false;
        }
        return AbstractC3292y.d(this.eotfOrig, rgb.eotfOrig);
    }

    @Size(3)
    public final float[] fromLinear(float f8, float f9, float f10) {
        return fromLinear(new float[]{f8, f9, f10});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    public final Function1 getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.eotfFunc;
    }

    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    @Size(9)
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i8) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i8) {
        return this.min;
    }

    public final Function1 getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.oetfFunc;
    }

    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    @Size(6)
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @Size(9)
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f8 = this.min;
        int i8 = 0;
        if (f8 == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f8);
        }
        int i9 = (hashCode + floatToIntBits) * 31;
        float f9 = this.max;
        if (f9 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f9);
        }
        int i10 = (i9 + floatToIntBits2) * 31;
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            i8 = transferParameters.hashCode();
        }
        int i11 = i10 + i8;
        if (this.transferParameters == null) {
            return (((i11 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return i11;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    @Size(3)
    public final float[] toLinear(float f8, float f9, float f10) {
        return toLinear(new float[]{f8, f9, f10});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f8, float f9, float f10) {
        float invoke = (float) this.eotfFunc.invoke(f8);
        float invoke2 = (float) this.eotfFunc.invoke(f9);
        float invoke3 = (float) this.eotfFunc.invoke(f10);
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(this.transform, invoke, invoke2, invoke3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(this.transform, invoke, invoke2, invoke3);
        return (Float.floatToRawIntBits(mul3x3Float3_0) << 32) | (Float.floatToRawIntBits(mul3x3Float3_1) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f8, float f9, float f10) {
        return ColorSpaceKt.mul3x3Float3_2(this.transform, (float) this.eotfFunc.invoke(f8), (float) this.eotfFunc.invoke(f9), (float) this.eotfFunc.invoke(f10));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo3342xyzaToColorJlNiLsg$ui_graphics_release(float f8, float f9, float f10, float f11, ColorSpace colorSpace) {
        return ColorKt.Color((float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_0(this.inverseTransform, f8, f9, f10)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_1(this.inverseTransform, f8, f9, f10)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_2(this.inverseTransform, f8, f9, f10)), f11, colorSpace);
    }

    @Size(min = 3)
    public final float[] fromLinear(@Size(min = 3) float[] fArr) {
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Size(min = 9)
    public final float[] getInverseTransform(@Size(min = 9) float[] fArr) {
        return AbstractC1428l.k(this.inverseTransform, fArr, 0, 0, 0, 14, null);
    }

    @Size(min = 6)
    public final float[] getPrimaries(@Size(min = 6) float[] fArr) {
        return AbstractC1428l.k(this.primaries, fArr, 0, 0, 0, 14, null);
    }

    @Size(min = 9)
    public final float[] getTransform(@Size(min = 9) float[] fArr) {
        return AbstractC1428l.k(this.transform, fArr, 0, 0, 0, 14, null);
    }

    @Size(min = 3)
    public final float[] toLinear(@Size(min = 3) float[] fArr) {
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@androidx.annotation.Size(min = 1) java.lang.String r14, @androidx.annotation.Size(9) float[] r15, final kotlin.jvm.functions.Function1 r16, final kotlin.jvm.functions.Function1 r17) {
        /*
            r13 = this;
            r0 = r15
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r1 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            float[] r4 = r1.computePrimaries$ui_graphics_release(r15)
            androidx.compose.ui.graphics.colorspace.WhitePoint r5 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r1, r15)
            androidx.compose.ui.graphics.colorspace.i r7 = new androidx.compose.ui.graphics.colorspace.i
            r0 = r16
            r7.<init>()
            androidx.compose.ui.graphics.colorspace.j r8 = new androidx.compose.ui.graphics.colorspace.j
            r0 = r17
            r8.<init>()
            r11 = 0
            r12 = -1
            r6 = 0
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r2 = r13
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    public Rgb(@Size(min = 1) String str, @Size(max = 9, min = 6) float[] fArr, WhitePoint whitePoint, final Function1 function1, final Function1 function12, float f8, float f9) {
        this(str, fArr, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.m
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d8) {
                double _init_$lambda$4;
                _init_$lambda$4 = Rgb._init_$lambda$4(Function1.this, d8);
                return _init_$lambda$4;
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.n
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d8) {
                double _init_$lambda$5;
                _init_$lambda$5 = Rgb._init_$lambda$5(Function1.this, d8);
                return _init_$lambda$5;
            }
        }, f8, f9, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@androidx.annotation.Size(min = 1) java.lang.String r8, @androidx.annotation.Size(9) float[] r9, androidx.compose.ui.graphics.colorspace.TransferParameters r10) {
        /*
            r7 = this;
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r9)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r9)
            r6 = -1
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.TransferParameters):void");
    }

    public Rgb(@Size(min = 1) String str, @Size(max = 9, min = 6) float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final TransferParameters transferParameters, int i8) {
        this(str, fArr, whitePoint, null, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.o
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d8) {
                double _init_$lambda$6;
                _init_$lambda$6 = Rgb._init_$lambda$6(TransferParameters.this, d8);
                return _init_$lambda$6;
            }
        } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d8) {
                double _init_$lambda$7;
                _init_$lambda$7 = Rgb._init_$lambda$7(TransferParameters.this, d8);
                return _init_$lambda$7;
            }
        }, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.e
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d8) {
                double _init_$lambda$8;
                _init_$lambda$8 = Rgb._init_$lambda$8(TransferParameters.this, d8);
                return _init_$lambda$8;
            }
        } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.f
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d8) {
                double _init_$lambda$9;
                _init_$lambda$9 = Rgb._init_$lambda$9(TransferParameters.this, d8);
                return _init_$lambda$9;
            }
        }, 0.0f, 1.0f, transferParameters, i8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@androidx.annotation.Size(min = 1) java.lang.String r11, @androidx.annotation.Size(9) float[] r12, double r13) {
        /*
            r10 = this;
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r12)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r12)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r7 = 0
            r1 = r10
            r2 = r11
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], double):void");
    }

    public Rgb(@Size(min = 1) String str, @Size(max = 9, min = 6) float[] fArr, WhitePoint whitePoint, double d8) {
        this(str, fArr, whitePoint, d8, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(java.lang.String r21, float[] r22, androidx.compose.ui.graphics.colorspace.WhitePoint r23, final double r24, float r26, float r27, int r28) {
        /*
            r20 = this;
            r1 = r24
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld
            androidx.compose.ui.graphics.colorspace.DoubleFunction r3 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
        La:
            r17 = r3
            goto L13
        Ld:
            androidx.compose.ui.graphics.colorspace.k r3 = new androidx.compose.ui.graphics.colorspace.k
            r3.<init>()
            goto La
        L13:
            if (r0 != 0) goto L1a
            androidx.compose.ui.graphics.colorspace.DoubleFunction r0 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
        L17:
            r18 = r0
            goto L20
        L1a:
            androidx.compose.ui.graphics.colorspace.l r0 = new androidx.compose.ui.graphics.colorspace.l
            r0.<init>()
            goto L17
        L20:
            androidx.compose.ui.graphics.colorspace.TransferParameters r19 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r0 = r19
            r15 = 96
            r16 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r1 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r8 = 0
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r9 = r17
            r10 = r18
            r11 = r26
            r12 = r27
            r13 = r19
            r14 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
