package androidx.leanback.graphics;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.View;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public final class ColorFilterDimmer {
    private final float mActiveLevel;
    private final ColorFilterCache mColorDimmer;
    private final float mDimmedLevel;
    private ColorFilter mFilter;
    private final Paint mPaint;

    private ColorFilterDimmer(ColorFilterCache colorFilterCache, float f8, float f9) {
        this.mColorDimmer = colorFilterCache;
        f8 = f8 > 1.0f ? 1.0f : f8;
        f8 = f8 < 0.0f ? 0.0f : f8;
        f9 = f9 > 1.0f ? 1.0f : f9;
        float f10 = f9 >= 0.0f ? f9 : 0.0f;
        this.mActiveLevel = f8;
        this.mDimmedLevel = f10;
        this.mPaint = new Paint();
    }

    public static ColorFilterDimmer create(ColorFilterCache colorFilterCache, float f8, float f9) {
        return new ColorFilterDimmer(colorFilterCache, f8, f9);
    }

    public static ColorFilterDimmer createDefault(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.styleable.LeanbackTheme);
        int color = obtainStyledAttributes.getColor(R.styleable.LeanbackTheme_overlayDimMaskColor, context.getResources().getColor(R.color.lb_view_dim_mask_color));
        float fraction = obtainStyledAttributes.getFraction(R.styleable.LeanbackTheme_overlayDimActiveLevel, 1, 1, context.getResources().getFraction(R.fraction.lb_view_active_level, 1, 0));
        float fraction2 = obtainStyledAttributes.getFraction(R.styleable.LeanbackTheme_overlayDimDimmedLevel, 1, 1, context.getResources().getFraction(R.fraction.lb_view_dimmed_level, 1, 1));
        obtainStyledAttributes.recycle();
        return new ColorFilterDimmer(ColorFilterCache.getColorFilterCache(color), fraction, fraction2);
    }

    public void applyFilterToView(View view) {
        if (this.mFilter != null) {
            view.setLayerType(2, this.mPaint);
        } else {
            view.setLayerType(0, null);
        }
        view.invalidate();
    }

    public ColorFilter getColorFilter() {
        return this.mFilter;
    }

    public Paint getPaint() {
        return this.mPaint;
    }

    public void setActiveLevel(float f8) {
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        ColorFilterCache colorFilterCache = this.mColorDimmer;
        float f9 = this.mDimmedLevel;
        ColorFilter filterForLevel = colorFilterCache.getFilterForLevel(f9 + (f8 * (this.mActiveLevel - f9)));
        this.mFilter = filterForLevel;
        this.mPaint.setColorFilter(filterForLevel);
    }
}
