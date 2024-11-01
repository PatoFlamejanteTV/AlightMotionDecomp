package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes.dex */
public final class Xyz extends ColorSpace {
    public Xyz(String str, int i8) {
        super(str, ColorModel.Companion.m3340getXyzxdoWZVw(), i8, null);
    }

    private final float clamp(float f8) {
        return i6.m.j(f8, -2.0f, 2.0f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        fArr[0] = clamp(fArr[0]);
        fArr[1] = clamp(fArr[1]);
        fArr[2] = clamp(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i8) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i8) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f8, float f9, float f10) {
        float clamp = clamp(f8);
        float clamp2 = clamp(f9);
        return (Float.floatToRawIntBits(clamp2) & 4294967295L) | (Float.floatToRawIntBits(clamp) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        fArr[0] = clamp(fArr[0]);
        fArr[1] = clamp(fArr[1]);
        fArr[2] = clamp(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f8, float f9, float f10) {
        return clamp(f10);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo3342xyzaToColorJlNiLsg$ui_graphics_release(float f8, float f9, float f10, float f11, ColorSpace colorSpace) {
        return ColorKt.Color(clamp(f8), clamp(f9), clamp(f10), f11, colorSpace);
    }
}
