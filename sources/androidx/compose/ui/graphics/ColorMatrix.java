package androidx.compose.ui.graphics;

import R5.AbstractC1428l;
import c6.InterfaceC2072n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ColorMatrix {
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m3003boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m3004constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m3005constructorimpl$default(float[] fArr, int i8, AbstractC3284p abstractC3284p) {
        if ((i8 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m3004constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m3006convertRgbToYuvimpl(float[] fArr) {
        m3013resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m3007convertYuvToRgbimpl(float[] fArr) {
        m3013resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m3008dotMe4OoYI(float[] fArr, float[] fArr2, int i8, float[] fArr3, int i9) {
        int i10 = i8 * 5;
        return (fArr2[i10] * fArr3[i9]) + (fArr2[i10 + 1] * fArr3[5 + i9]) + (fArr2[i10 + 2] * fArr3[10 + i9]) + (fArr2[i10 + 3] * fArr3[15 + i9]);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3009equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && AbstractC3292y.d(fArr, ((ColorMatrix) obj).m3024unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3010equalsimpl0(float[] fArr, float[] fArr2) {
        return AbstractC3292y.d(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m3011getimpl(float[] fArr, int i8, int i9) {
        return fArr[(i8 * 5) + i9];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3012hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m3013resetimpl(float[] fArr) {
        AbstractC1428l.u(fArr, 0.0f, 0, 0, 6, null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m3014rotateInternalimpl(float[] fArr, float f8, InterfaceC2072n interfaceC2072n) {
        m3013resetimpl(fArr);
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        interfaceC2072n.invoke(Float.valueOf((float) Math.cos(d8)), Float.valueOf((float) Math.sin(d8)));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m3015setimpl(float[] fArr, int i8, int i9, float f8) {
        fArr[(i8 * 5) + i9] = f8;
    }

    /* renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m3016setjHGOpc(float[] fArr, float[] fArr2) {
        AbstractC1428l.k(fArr2, fArr, 0, 0, 0, 14, null);
    }

    /* renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m3017setToRotateBlueimpl(float[] fArr, float f8) {
        m3013resetimpl(fArr);
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        fArr[6] = cos;
        fArr[0] = cos;
        fArr[1] = sin;
        fArr[5] = -sin;
    }

    /* renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m3018setToRotateGreenimpl(float[] fArr, float f8) {
        m3013resetimpl(fArr);
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        fArr[12] = cos;
        fArr[0] = cos;
        fArr[2] = -sin;
        fArr[10] = sin;
    }

    /* renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m3019setToRotateRedimpl(float[] fArr, float f8) {
        m3013resetimpl(fArr);
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        fArr[12] = cos;
        fArr[6] = cos;
        fArr[7] = sin;
        fArr[11] = -sin;
    }

    /* renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m3020setToSaturationimpl(float[] fArr, float f8) {
        m3013resetimpl(fArr);
        float f9 = 1 - f8;
        float f10 = 0.213f * f9;
        float f11 = 0.715f * f9;
        float f12 = f9 * 0.072f;
        fArr[0] = f10 + f8;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[5] = f10;
        fArr[6] = f11 + f8;
        fArr[7] = f12;
        fArr[10] = f10;
        fArr[11] = f11;
        fArr[12] = f12 + f8;
    }

    /* renamed from: setToScale-impl, reason: not valid java name */
    public static final void m3021setToScaleimpl(float[] fArr, float f8, float f9, float f10, float f11) {
        m3013resetimpl(fArr);
        fArr[0] = f8;
        fArr[6] = f9;
        fArr[12] = f10;
        fArr[18] = f11;
    }

    /* renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m3022timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        float m3008dotMe4OoYI = m3008dotMe4OoYI(fArr, fArr, 0, fArr2, 0);
        float m3008dotMe4OoYI2 = m3008dotMe4OoYI(fArr, fArr, 0, fArr2, 1);
        float m3008dotMe4OoYI3 = m3008dotMe4OoYI(fArr, fArr, 0, fArr2, 2);
        float m3008dotMe4OoYI4 = m3008dotMe4OoYI(fArr, fArr, 0, fArr2, 3);
        float f8 = (fArr[0] * fArr2[4]) + (fArr[1] * fArr2[9]) + (fArr[2] * fArr2[14]) + (fArr[3] * fArr2[19]) + fArr[4];
        float m3008dotMe4OoYI5 = m3008dotMe4OoYI(fArr, fArr, 1, fArr2, 0);
        float m3008dotMe4OoYI6 = m3008dotMe4OoYI(fArr, fArr, 1, fArr2, 1);
        float m3008dotMe4OoYI7 = m3008dotMe4OoYI(fArr, fArr, 1, fArr2, 2);
        float m3008dotMe4OoYI8 = m3008dotMe4OoYI(fArr, fArr, 1, fArr2, 3);
        float f9 = (fArr[5] * fArr2[4]) + (fArr[6] * fArr2[9]) + (fArr[7] * fArr2[14]) + (fArr[8] * fArr2[19]) + fArr[9];
        float m3008dotMe4OoYI9 = m3008dotMe4OoYI(fArr, fArr, 2, fArr2, 0);
        float m3008dotMe4OoYI10 = m3008dotMe4OoYI(fArr, fArr, 2, fArr2, 1);
        float m3008dotMe4OoYI11 = m3008dotMe4OoYI(fArr, fArr, 2, fArr2, 2);
        float m3008dotMe4OoYI12 = m3008dotMe4OoYI(fArr, fArr, 2, fArr2, 3);
        float f10 = (fArr[10] * fArr2[4]) + (fArr[11] * fArr2[9]) + (fArr[12] * fArr2[14]) + (fArr[13] * fArr2[19]) + fArr[14];
        float m3008dotMe4OoYI13 = m3008dotMe4OoYI(fArr, fArr, 3, fArr2, 0);
        float m3008dotMe4OoYI14 = m3008dotMe4OoYI(fArr, fArr, 3, fArr2, 1);
        float m3008dotMe4OoYI15 = m3008dotMe4OoYI(fArr, fArr, 3, fArr2, 2);
        float m3008dotMe4OoYI16 = m3008dotMe4OoYI(fArr, fArr, 3, fArr2, 3);
        float f11 = (fArr[15] * fArr2[4]) + (fArr[16] * fArr2[9]) + (fArr[17] * fArr2[14]) + (fArr[18] * fArr2[19]) + fArr[19];
        fArr[0] = m3008dotMe4OoYI;
        fArr[1] = m3008dotMe4OoYI2;
        fArr[2] = m3008dotMe4OoYI3;
        fArr[3] = m3008dotMe4OoYI4;
        fArr[4] = f8;
        fArr[5] = m3008dotMe4OoYI5;
        fArr[6] = m3008dotMe4OoYI6;
        fArr[7] = m3008dotMe4OoYI7;
        fArr[8] = m3008dotMe4OoYI8;
        fArr[9] = f9;
        fArr[10] = m3008dotMe4OoYI9;
        fArr[11] = m3008dotMe4OoYI10;
        fArr[12] = m3008dotMe4OoYI11;
        fArr[13] = m3008dotMe4OoYI12;
        fArr[14] = f10;
        fArr[15] = m3008dotMe4OoYI13;
        fArr[16] = m3008dotMe4OoYI14;
        fArr[17] = m3008dotMe4OoYI15;
        fArr[18] = m3008dotMe4OoYI16;
        fArr[19] = f11;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3023toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m3009equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m3012hashCodeimpl(this.values);
    }

    public String toString() {
        return m3023toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m3024unboximpl() {
        return this.values;
    }
}
