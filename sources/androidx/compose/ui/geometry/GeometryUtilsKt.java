package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public final class GeometryUtilsKt {
    public static final String toStringAsFixed(float f8, int i8) {
        int max = Math.max(i8, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f9 = f8 * pow;
        int i9 = (int) f9;
        if (f9 - i9 >= 0.5f) {
            i9++;
        }
        float f10 = i9 / pow;
        if (max > 0) {
            return String.valueOf(f10);
        }
        return String.valueOf((int) f10);
    }
}
