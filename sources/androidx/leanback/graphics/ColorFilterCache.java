package androidx.leanback.graphics;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class ColorFilterCache {
    private static final SparseArray<ColorFilterCache> sColorToFiltersMap = new SparseArray<>();
    private final PorterDuffColorFilter[] mFilters = new PorterDuffColorFilter[256];

    private ColorFilterCache(int i8, int i9, int i10) {
        for (int i11 = 0; i11 <= 255; i11++) {
            this.mFilters[i11] = new PorterDuffColorFilter(Color.argb(i11, i8, i9, i10), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public static ColorFilterCache getColorFilterCache(int i8) {
        int red = Color.red(i8);
        int green = Color.green(i8);
        int blue = Color.blue(i8);
        int rgb = Color.rgb(red, green, blue);
        SparseArray<ColorFilterCache> sparseArray = sColorToFiltersMap;
        ColorFilterCache colorFilterCache = sparseArray.get(rgb);
        if (colorFilterCache == null) {
            ColorFilterCache colorFilterCache2 = new ColorFilterCache(red, green, blue);
            sparseArray.put(rgb, colorFilterCache2);
            return colorFilterCache2;
        }
        return colorFilterCache;
    }

    public ColorFilter getFilterForLevel(float f8) {
        if (f8 >= 0.0f && f8 <= 1.0d) {
            return this.mFilters[(int) (f8 * 255.0f)];
        }
        return null;
    }
}
