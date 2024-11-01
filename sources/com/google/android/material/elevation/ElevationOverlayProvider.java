package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: classes3.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(@ColorInt int i8) {
        if (ColorUtils.setAlphaComponent(i8, 255) == this.colorSurface) {
            return true;
        }
        return false;
    }

    public int calculateOverlayAlpha(float f8) {
        return Math.round(calculateOverlayAlphaFraction(f8) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f8) {
        if (this.displayDensity <= 0.0f || f8 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f8 / r0)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i8, float f8, @NonNull View view) {
        return compositeOverlay(i8, f8 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i8, float f8, @NonNull View view) {
        return compositeOverlayIfNeeded(i8, f8 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f8, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f8 + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i8, float f8) {
        int i9;
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f8);
        int alpha = Color.alpha(i8);
        int layer = MaterialColors.layer(ColorUtils.setAlphaComponent(i8, 255), this.elevationOverlayColor, calculateOverlayAlphaFraction);
        if (calculateOverlayAlphaFraction > 0.0f && (i9 = this.elevationOverlayAccentColor) != 0) {
            layer = MaterialColors.layer(layer, ColorUtils.setAlphaComponent(i9, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return ColorUtils.setAlphaComponent(layer, alpha);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i8, float f8) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i8)) ? compositeOverlay(i8, f8) : i8;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f8) {
        return compositeOverlayIfNeeded(this.colorSurface, f8);
    }

    public ElevationOverlayProvider(boolean z8, @ColorInt int i8, @ColorInt int i9, @ColorInt int i10, float f8) {
        this.elevationOverlayEnabled = z8;
        this.elevationOverlayColor = i8;
        this.elevationOverlayAccentColor = i9;
        this.colorSurface = i10;
        this.displayDensity = f8;
    }
}
