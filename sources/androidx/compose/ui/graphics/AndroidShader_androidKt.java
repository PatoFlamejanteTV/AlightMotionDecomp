package androidx.compose.ui.graphics;

import R5.AbstractC1435t;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m2854ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i8, int i9) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m2859toAndroidTileMode0vamqd0(i8), AndroidTileMode_androidKt.m2859toAndroidTileMode0vamqd0(i9));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m2855ActualLinearGradientShaderVjE6UOU(long j8, long j9, List<Color> list, List<Float> list2, int i8) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8), Offset.m2712getXimpl(j9), Offset.m2713getYimpl(j9), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m2859toAndroidTileMode0vamqd0(i8));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m2856ActualRadialGradientShader8uybcMk(long j8, float f8, List<Color> list, List<Float> list2, int i8) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8), f8, makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m2859toAndroidTileMode0vamqd0(i8));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m2857ActualSweepGradientShader9KIMszo(long j8, List<Color> list, List<Float> list2) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(List<Color> list) {
        int i8 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int o8 = AbstractC1435t.o(list);
        for (int i9 = 1; i9 < o8; i9++) {
            if (Color.m2950getAlphaimpl(list.get(i9).m2958unboximpl()) == 0.0f) {
                i8++;
            }
        }
        return i8;
    }

    @VisibleForTesting
    public static final int[] makeTransparentColors(List<Color> list, int i8) {
        int i9;
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i10 < size) {
                iArr[i10] = ColorKt.m3002toArgb8_81llA(list.get(i10).m2958unboximpl());
                i10++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i8];
        int o8 = AbstractC1435t.o(list);
        int size2 = list.size();
        int i11 = 0;
        while (i10 < size2) {
            long m2958unboximpl = list.get(i10).m2958unboximpl();
            if (Color.m2950getAlphaimpl(m2958unboximpl) == 0.0f) {
                if (i10 == 0) {
                    i9 = i11 + 1;
                    iArr2[i11] = ColorKt.m3002toArgb8_81llA(Color.m2947copywmQWz5c$default(list.get(1).m2958unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i10 == o8) {
                    i9 = i11 + 1;
                    iArr2[i11] = ColorKt.m3002toArgb8_81llA(Color.m2947copywmQWz5c$default(list.get(i10 - 1).m2958unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i12 = i11 + 1;
                    iArr2[i11] = ColorKt.m3002toArgb8_81llA(Color.m2947copywmQWz5c$default(list.get(i10 - 1).m2958unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i11 += 2;
                    iArr2[i12] = ColorKt.m3002toArgb8_81llA(Color.m2947copywmQWz5c$default(list.get(i10 + 1).m2958unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i11 = i9;
            } else {
                iArr2[i11] = ColorKt.m3002toArgb8_81llA(m2958unboximpl);
                i11++;
            }
            i10++;
        }
        return iArr2;
    }

    @VisibleForTesting
    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i8) {
        float f8;
        float f9;
        float o8;
        if (i8 == 0) {
            if (list != null) {
                return AbstractC1435t.T0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i8];
        if (list != null) {
            f8 = list.get(0).floatValue();
        } else {
            f8 = 0.0f;
        }
        fArr[0] = f8;
        int o9 = AbstractC1435t.o(list2);
        int i9 = 1;
        for (int i10 = 1; i10 < o9; i10++) {
            long m2958unboximpl = list2.get(i10).m2958unboximpl();
            if (list != null) {
                o8 = list.get(i10).floatValue();
            } else {
                o8 = i10 / AbstractC1435t.o(list2);
            }
            int i11 = i9 + 1;
            fArr[i9] = o8;
            if (Color.m2950getAlphaimpl(m2958unboximpl) == 0.0f) {
                i9 += 2;
                fArr[i11] = o8;
            } else {
                i9 = i11;
            }
        }
        if (list != null) {
            f9 = list.get(AbstractC1435t.o(list2)).floatValue();
        } else {
            f9 = 1.0f;
        }
        fArr[i9] = f9;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
