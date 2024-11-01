package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes.dex */
final class ColorMatrixFilterHelper {
    public static final ColorMatrixFilterHelper INSTANCE = new ColorMatrixFilterHelper();

    private ColorMatrixFilterHelper() {
    }

    @DoNotInline
    /* renamed from: getColorMatrix-8unuwjk, reason: not valid java name */
    public final float[] m3028getColorMatrix8unuwjk(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return ColorMatrix.m3004constructorimpl(colorMatrix.getArray());
    }
}
