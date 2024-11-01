package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.RenderIntent;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public class Connector {
    public static final Companion Companion;
    private static final Connector OklabToSrgbPerceptual;
    private static final Connector SrgbIdentity;
    private static final Connector SrgbToOklabPerceptual;
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m3348computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i8) {
            float[] d50Xyz$ui_graphics_release;
            float[] d50Xyz$ui_graphics_release2;
            if (!RenderIntent.m3353equalsimpl0(i8, RenderIntent.Companion.m3357getAbsoluteuksYyKA())) {
                return null;
            }
            long m3341getModelxdoWZVw = colorSpace.m3341getModelxdoWZVw();
            ColorModel.Companion companion = ColorModel.Companion;
            boolean m3332equalsimpl0 = ColorModel.m3332equalsimpl0(m3341getModelxdoWZVw, companion.m3339getRgbxdoWZVw());
            boolean m3332equalsimpl02 = ColorModel.m3332equalsimpl0(colorSpace2.m3341getModelxdoWZVw(), companion.m3339getRgbxdoWZVw());
            if (m3332equalsimpl0 && m3332equalsimpl02) {
                return null;
            }
            if (!m3332equalsimpl0 && !m3332equalsimpl02) {
                return null;
            }
            if (!m3332equalsimpl0) {
                colorSpace = colorSpace2;
            }
            AbstractC3292y.g(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (m3332equalsimpl0) {
                d50Xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            } else {
                d50Xyz$ui_graphics_release = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            }
            if (m3332equalsimpl02) {
                d50Xyz$ui_graphics_release2 = rgb.getWhitePoint().toXyz$ui_graphics_release();
            } else {
                d50Xyz$ui_graphics_release2 = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            }
            return new float[]{d50Xyz$ui_graphics_release[0] / d50Xyz$ui_graphics_release2[0], d50Xyz$ui_graphics_release[1] / d50Xyz$ui_graphics_release2[1], d50Xyz$ui_graphics_release[2] / d50Xyz$ui_graphics_release2[2]};
        }

        public final Connector getOklabToSrgbPerceptual$ui_graphics_release() {
            return Connector.OklabToSrgbPerceptual;
        }

        public final Connector getSrgbIdentity$ui_graphics_release() {
            return Connector.SrgbIdentity;
        }

        public final Connector getSrgbToOklabPerceptual$ui_graphics_release() {
            return Connector.SrgbToOklabPerceptual;
        }

        public final Connector identity$ui_graphics_release(final ColorSpace colorSpace) {
            final int m3359getRelativeuksYyKA = RenderIntent.Companion.m3359getRelativeuksYyKA();
            return new Connector(colorSpace, m3359getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(colorSpace, colorSpace, m3359getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public float[] transform(float[] fArr) {
                    return fArr;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
                public long mo3346transformToColorwmQWz5c$ui_graphics_release(float f8, float f9, float f10, float f11) {
                    return ColorKt.Color(f8, f9, f10, f11, getDestination());
                }
            };
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class RgbConnector extends Connector {
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i8, AbstractC3284p abstractC3284p) {
            this(rgb, rgb2, i8);
        }

        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m3349computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i8) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics_release(), rgb.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = rgb.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = rgb2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                float[] transform$ui_graphics_release2 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                AbstractC3292y.h(copyOf, "copyOf(this, size)");
                transform$ui_graphics_release = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release2, xyz$ui_graphics_release, copyOf), rgb.getTransform$ui_graphics_release());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                float[] transform$ui_graphics_release3 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release2 = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                AbstractC3292y.h(copyOf2, "copyOf(this, size)");
                inverseTransform$ui_graphics_release = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release3, xyz$ui_graphics_release2, copyOf2), rgb2.getTransform$ui_graphics_release()));
            }
            if (RenderIntent.m3353equalsimpl0(i8, RenderIntent.Companion.m3357getAbsoluteuksYyKA())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics_release, transform$ui_graphics_release);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public float[] transform(float[] fArr) {
            fArr[0] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, fArr);
            fArr[0] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[2]);
            return fArr;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
        public long mo3346transformToColorwmQWz5c$ui_graphics_release(float f8, float f9, float f10, float f11) {
            float invoke = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(f8);
            float invoke2 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(f9);
            float invoke3 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(f10);
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_0(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_1(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_2(this.mTransform, invoke, invoke2, invoke3)), f11, this.mDestination);
        }

        private RgbConnector(Rgb rgb, Rgb rgb2, int i8) {
            super(rgb, rgb2, rgb, rgb2, i8, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m3349computeTransformYBCOT_4(rgb, rgb2, i8);
        }
    }

    static {
        AbstractC3284p abstractC3284p = null;
        Companion companion = new Companion(abstractC3284p);
        Companion = companion;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        SrgbIdentity = companion.identity$ui_graphics_release(colorSpaces.getSrgb());
        Rgb srgb = colorSpaces.getSrgb();
        ColorSpace oklab = colorSpaces.getOklab();
        RenderIntent.Companion companion2 = RenderIntent.Companion;
        SrgbToOklabPerceptual = new Connector(srgb, oklab, companion2.m3358getPerceptualuksYyKA(), abstractC3284p);
        OklabToSrgbPerceptual = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion2.m3358getPerceptualuksYyKA(), abstractC3284p);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i8, AbstractC3284p abstractC3284p) {
        this(colorSpace, colorSpace2, i8);
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m3345getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    @Size(3)
    public final float[] transform(float f8, float f9, float f10) {
        return transform(new float[]{f8, f9, f10});
    }

    /* renamed from: transformToColor-wmQWz5c$ui_graphics_release, reason: not valid java name */
    public long mo3346transformToColorwmQWz5c$ui_graphics_release(float f8, float f9, float f10, float f11) {
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(f8, f9, f10);
        r rVar = r.f34602a;
        float intBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(f8, f9, f10);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f12 = intBitsToFloat2;
        float f13 = intBitsToFloat;
        return this.transformDestination.mo3342xyzaToColorJlNiLsg$ui_graphics_release(f13, f12, z$ui_graphics_release, f11, this.destination);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i8, float[] fArr, AbstractC3284p abstractC3284p) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i8, fArr);
    }

    @Size(min = 3)
    public float[] transform(@Size(min = 3) float[] fArr) {
        float[] xyz = this.transformSource.toXyz(fArr);
        float[] fArr2 = this.transform;
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i8, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i8;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Connector(androidx.compose.ui.graphics.colorspace.ColorSpace r13, androidx.compose.ui.graphics.colorspace.ColorSpace r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.m3341getModelxdoWZVw()
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r2 = androidx.compose.ui.graphics.colorspace.ColorModel.Companion
            long r3 = r2.m3339getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m3332equalsimpl0(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L1e
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r13, r0, r3, r1, r3)
            r7 = r0
            goto L1f
        L1e:
            r7 = r13
        L1f:
            long r4 = r14.m3341getModelxdoWZVw()
            long r8 = r2.m3339getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m3332equalsimpl0(r4, r8)
            if (r0 == 0) goto L39
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r14, r0, r3, r1, r3)
            r8 = r0
            goto L3a
        L39:
            r8 = r14
        L3a:
            androidx.compose.ui.graphics.colorspace.Connector$Companion r0 = androidx.compose.ui.graphics.colorspace.Connector.Companion
            float[] r10 = androidx.compose.ui.graphics.colorspace.Connector.Companion.m3347access$computeTransformYBCOT_4(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }
}
