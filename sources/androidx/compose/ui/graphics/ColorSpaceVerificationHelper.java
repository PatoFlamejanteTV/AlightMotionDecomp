package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import j$.util.function.DoubleUnaryOperator$CC;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(26)
/* loaded from: classes.dex */
public final class ColorSpaceVerificationHelper {
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    @DoNotInline
    @RequiresApi(26)
    public static final ColorSpace androidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb a9;
        ColorSpace.Named named2;
        ColorSpace colorSpace3;
        ColorSpace.Named named3;
        ColorSpace colorSpace4;
        ColorSpace.Named named4;
        ColorSpace colorSpace5;
        ColorSpace.Named named5;
        ColorSpace colorSpace6;
        ColorSpace.Named named6;
        ColorSpace colorSpace7;
        ColorSpace.Named named7;
        ColorSpace colorSpace8;
        ColorSpace.Named named8;
        ColorSpace colorSpace9;
        ColorSpace.Named named9;
        ColorSpace colorSpace10;
        ColorSpace.Named named10;
        ColorSpace colorSpace11;
        ColorSpace.Named named11;
        ColorSpace colorSpace12;
        ColorSpace.Named named12;
        ColorSpace colorSpace13;
        ColorSpace.Named named13;
        ColorSpace colorSpace14;
        ColorSpace.Named named14;
        ColorSpace colorSpace15;
        ColorSpace.Named named15;
        ColorSpace colorSpace16;
        ColorSpace.Named named16;
        ColorSpace colorSpace17;
        ColorSpace.Named named17;
        ColorSpace colorSpace18;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (AbstractC3292y.d(colorSpace, colorSpaces.getSrgb())) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace18 = ColorSpace.get(named17);
            return colorSpace18;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getAces())) {
            named16 = ColorSpace.Named.ACES;
            colorSpace17 = ColorSpace.get(named16);
            return colorSpace17;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getAcescg())) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace16 = ColorSpace.get(named15);
            return colorSpace16;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getAdobeRgb())) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace15 = ColorSpace.get(named14);
            return colorSpace15;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getBt2020())) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace14 = ColorSpace.get(named13);
            return colorSpace14;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getBt709())) {
            named12 = ColorSpace.Named.BT709;
            colorSpace13 = ColorSpace.get(named12);
            return colorSpace13;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getCieLab())) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace12 = ColorSpace.get(named11);
            return colorSpace12;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getCieXyz())) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace11 = ColorSpace.get(named10);
            return colorSpace11;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getDciP3())) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace10 = ColorSpace.get(named9);
            return colorSpace10;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getDisplayP3())) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace9 = ColorSpace.get(named8);
            return colorSpace9;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getExtendedSrgb())) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace8 = ColorSpace.get(named7);
            return colorSpace8;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named6);
            return colorSpace7;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getLinearSrgb())) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace6 = ColorSpace.get(named5);
            return colorSpace6;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getNtsc1953())) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace5 = ColorSpace.get(named4);
            return colorSpace5;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getProPhotoRgb())) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace4 = ColorSpace.get(named3);
            return colorSpace4;
        }
        if (AbstractC3292y.d(colorSpace, colorSpaces.getSmpteC())) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace3 = ColorSpace.get(named2);
            return colorSpace3;
        }
        if (!(colorSpace instanceof Rgb)) {
            named = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named);
            return colorSpace2;
        }
        Rgb rgb = (Rgb) colorSpace;
        float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
        TransferParameters transferParameters2 = rgb.getTransferParameters();
        if (transferParameters2 != null) {
            H0.a();
            transferParameters = D0.a(transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
        } else {
            transferParameters = null;
        }
        if (transferParameters != null) {
            I0.a();
            a9 = F0.a(colorSpace.getName(), rgb.getPrimaries$ui_graphics_release(), xyz$ui_graphics_release, transferParameters);
        } else {
            I0.a();
            String name = colorSpace.getName();
            float[] primaries$ui_graphics_release = rgb.getPrimaries$ui_graphics_release();
            final Function1 oetf = rgb.getOetf();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.P0
                public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                    return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                }

                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d8) {
                    double androidColorSpace$lambda$0;
                    androidColorSpace$lambda$0 = ColorSpaceVerificationHelper.androidColorSpace$lambda$0(Function1.this, d8);
                    return androidColorSpace$lambda$0;
                }

                public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                    return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                }
            };
            final Function1 eotf = rgb.getEotf();
            a9 = G0.a(name, primaries$ui_graphics_release, xyz$ui_graphics_release, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.Q0
                public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                    return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                }

                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d8) {
                    double androidColorSpace$lambda$1;
                    androidColorSpace$lambda$1 = ColorSpaceVerificationHelper.androidColorSpace$lambda$1(Function1.this, d8);
                    return androidColorSpace$lambda$1;
                }

                public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                    return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                }
            }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
        }
        return AbstractC1718e0.a(a9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(Function1 function1, double d8) {
        return ((Number) function1.invoke(Double.valueOf(d8))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(Function1 function1, double d8) {
        return ((Number) function1.invoke(Double.valueOf(d8))).doubleValue();
    }

    @DoNotInline
    @RequiresApi(26)
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(final ColorSpace colorSpace) {
        int id;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        WhitePoint whitePoint2;
        float[] whitePoint3;
        float[] whitePoint4;
        TransferParameters transferParameters2;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id2;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        float[] whitePoint5;
        float[] whitePoint6;
        float[] whitePoint7;
        id = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id != ordinal) {
            named2 = ColorSpace.Named.ACES;
            ordinal2 = named2.ordinal();
            if (id != ordinal2) {
                named3 = ColorSpace.Named.ACESCG;
                ordinal3 = named3.ordinal();
                if (id != ordinal3) {
                    named4 = ColorSpace.Named.ADOBE_RGB;
                    ordinal4 = named4.ordinal();
                    if (id != ordinal4) {
                        named5 = ColorSpace.Named.BT2020;
                        ordinal5 = named5.ordinal();
                        if (id != ordinal5) {
                            named6 = ColorSpace.Named.BT709;
                            ordinal6 = named6.ordinal();
                            if (id != ordinal6) {
                                named7 = ColorSpace.Named.CIE_LAB;
                                ordinal7 = named7.ordinal();
                                if (id != ordinal7) {
                                    named8 = ColorSpace.Named.CIE_XYZ;
                                    ordinal8 = named8.ordinal();
                                    if (id != ordinal8) {
                                        named9 = ColorSpace.Named.DCI_P3;
                                        ordinal9 = named9.ordinal();
                                        if (id != ordinal9) {
                                            named10 = ColorSpace.Named.DISPLAY_P3;
                                            ordinal10 = named10.ordinal();
                                            if (id != ordinal10) {
                                                named11 = ColorSpace.Named.EXTENDED_SRGB;
                                                ordinal11 = named11.ordinal();
                                                if (id != ordinal11) {
                                                    named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                                                    ordinal12 = named12.ordinal();
                                                    if (id != ordinal12) {
                                                        named13 = ColorSpace.Named.LINEAR_SRGB;
                                                        ordinal13 = named13.ordinal();
                                                        if (id != ordinal13) {
                                                            named14 = ColorSpace.Named.NTSC_1953;
                                                            ordinal14 = named14.ordinal();
                                                            if (id != ordinal14) {
                                                                named15 = ColorSpace.Named.PRO_PHOTO_RGB;
                                                                ordinal15 = named15.ordinal();
                                                                if (id != ordinal15) {
                                                                    named16 = ColorSpace.Named.SMPTE_C;
                                                                    ordinal16 = named16.ordinal();
                                                                    if (id == ordinal16) {
                                                                        return ColorSpaces.INSTANCE.getSmpteC();
                                                                    }
                                                                    if (AbstractC1734m0.a(colorSpace)) {
                                                                        transferParameters = X.a(colorSpace).getTransferParameters();
                                                                        whitePoint = X.a(colorSpace).getWhitePoint();
                                                                        if (whitePoint.length == 3) {
                                                                            whitePoint5 = X.a(colorSpace).getWhitePoint();
                                                                            float f8 = whitePoint5[0];
                                                                            whitePoint6 = X.a(colorSpace).getWhitePoint();
                                                                            float f9 = whitePoint6[1];
                                                                            whitePoint7 = X.a(colorSpace).getWhitePoint();
                                                                            whitePoint2 = new WhitePoint(f8, f9, whitePoint7[2]);
                                                                        } else {
                                                                            whitePoint3 = X.a(colorSpace).getWhitePoint();
                                                                            float f10 = whitePoint3[0];
                                                                            whitePoint4 = X.a(colorSpace).getWhitePoint();
                                                                            whitePoint2 = new WhitePoint(f10, whitePoint4[1]);
                                                                        }
                                                                        WhitePoint whitePoint8 = whitePoint2;
                                                                        if (transferParameters != null) {
                                                                            d8 = transferParameters.g;
                                                                            d9 = transferParameters.a;
                                                                            d10 = transferParameters.b;
                                                                            d11 = transferParameters.c;
                                                                            d12 = transferParameters.d;
                                                                            d13 = transferParameters.e;
                                                                            d14 = transferParameters.f;
                                                                            transferParameters2 = new TransferParameters(d8, d9, d10, d11, d12, d13, d14);
                                                                        } else {
                                                                            transferParameters2 = null;
                                                                        }
                                                                        name = X.a(colorSpace).getName();
                                                                        primaries = X.a(colorSpace).getPrimaries();
                                                                        transform = X.a(colorSpace).getTransform();
                                                                        DoubleFunction doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.R0
                                                                            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                                                                            public final double invoke(double d15) {
                                                                                double composeColorSpace$lambda$2;
                                                                                composeColorSpace$lambda$2 = ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d15);
                                                                                return composeColorSpace$lambda$2;
                                                                            }
                                                                        };
                                                                        DoubleFunction doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.S0
                                                                            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                                                                            public final double invoke(double d15) {
                                                                                double composeColorSpace$lambda$3;
                                                                                composeColorSpace$lambda$3 = ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d15);
                                                                                return composeColorSpace$lambda$3;
                                                                            }
                                                                        };
                                                                        minValue = colorSpace.getMinValue(0);
                                                                        maxValue = colorSpace.getMaxValue(0);
                                                                        id2 = X.a(colorSpace).getId();
                                                                        return new Rgb(name, primaries, whitePoint8, transform, doubleFunction, doubleFunction2, minValue, maxValue, transferParameters2, id2);
                                                                    }
                                                                    return ColorSpaces.INSTANCE.getSrgb();
                                                                }
                                                                return ColorSpaces.INSTANCE.getProPhotoRgb();
                                                            }
                                                            return ColorSpaces.INSTANCE.getNtsc1953();
                                                        }
                                                        return ColorSpaces.INSTANCE.getLinearSrgb();
                                                    }
                                                    return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
                                                }
                                                return ColorSpaces.INSTANCE.getExtendedSrgb();
                                            }
                                            return ColorSpaces.INSTANCE.getDisplayP3();
                                        }
                                        return ColorSpaces.INSTANCE.getDciP3();
                                    }
                                    return ColorSpaces.INSTANCE.getCieXyz();
                                }
                                return ColorSpaces.INSTANCE.getCieLab();
                            }
                            return ColorSpaces.INSTANCE.getBt709();
                        }
                        return ColorSpaces.INSTANCE.getBt2020();
                    }
                    return ColorSpaces.INSTANCE.getAdobeRgb();
                }
                return ColorSpaces.INSTANCE.getAcescg();
            }
            return ColorSpaces.INSTANCE.getAces();
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$2(ColorSpace colorSpace, double d8) {
        DoubleUnaryOperator oetf;
        oetf = X.a(colorSpace).getOetf();
        return oetf.applyAsDouble(d8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$3(ColorSpace colorSpace, double d8) {
        DoubleUnaryOperator eotf;
        eotf = X.a(colorSpace).getEotf();
        return eotf.applyAsDouble(d8);
    }
}
