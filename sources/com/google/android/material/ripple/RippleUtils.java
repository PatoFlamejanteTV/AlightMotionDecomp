package com.google.android.material.ripple;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.color.MaterialColors;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class RippleUtils {

    @VisibleForTesting
    static final String TRANSPARENT_DEFAULT_COLOR_WARNING = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean USE_FRAMEWORK_RIPPLE = true;
    private static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    private static final int[] HOVERED_FOCUSED_STATE_SET = {R.attr.state_hovered, R.attr.state_focused};
    private static final int[] FOCUSED_STATE_SET = {R.attr.state_focused};
    private static final int[] HOVERED_STATE_SET = {R.attr.state_hovered};
    private static final int[] SELECTED_PRESSED_STATE_SET = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
    private static final int[] SELECTED_FOCUSED_STATE_SET = {R.attr.state_selected, R.attr.state_focused};
    private static final int[] SELECTED_HOVERED_STATE_SET = {R.attr.state_selected, R.attr.state_hovered};
    private static final int[] SELECTED_STATE_SET = {R.attr.state_selected};
    private static final int[] ENABLED_PRESSED_STATE_SET = {R.attr.state_enabled, R.attr.state_pressed};

    @VisibleForTesting
    static final String LOG_TAG = RippleUtils.class.getSimpleName();

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    private static class RippleUtilsLollipop {
        private RippleUtilsLollipop() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        public static Drawable createOvalRipple(@NonNull Context context, @Px int i8) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(MaterialColors.getColorStateList(context, com.google.android.material.R.attr.colorControlHighlight, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i8, i8, i8, i8));
        }
    }

    private RippleUtils() {
    }

    @NonNull
    public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (USE_FRAMEWORK_RIPPLE) {
            int[] iArr = FOCUSED_STATE_SET;
            return new ColorStateList(new int[][]{SELECTED_STATE_SET, iArr, StateSet.NOTHING}, new int[]{getColorForState(colorStateList, SELECTED_PRESSED_STATE_SET), getColorForState(colorStateList, iArr), getColorForState(colorStateList, PRESSED_STATE_SET)});
        }
        int[] iArr2 = SELECTED_PRESSED_STATE_SET;
        int[] iArr3 = SELECTED_HOVERED_FOCUSED_STATE_SET;
        int[] iArr4 = SELECTED_FOCUSED_STATE_SET;
        int[] iArr5 = SELECTED_HOVERED_STATE_SET;
        int[] iArr6 = PRESSED_STATE_SET;
        int[] iArr7 = HOVERED_FOCUSED_STATE_SET;
        int[] iArr8 = FOCUSED_STATE_SET;
        int[] iArr9 = HOVERED_STATE_SET;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, SELECTED_STATE_SET, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{getColorForState(colorStateList, iArr2), getColorForState(colorStateList, iArr3), getColorForState(colorStateList, iArr4), getColorForState(colorStateList, iArr5), 0, getColorForState(colorStateList, iArr6), getColorForState(colorStateList, iArr7), getColorForState(colorStateList, iArr8), getColorForState(colorStateList, iArr9), 0});
    }

    @NonNull
    @RequiresApi(21)
    public static Drawable createOvalRippleLollipop(@NonNull Context context, @Px int i8) {
        return RippleUtilsLollipop.createOvalRipple(context, i8);
    }

    @ColorInt
    @TargetApi(21)
    private static int doubleAlpha(@ColorInt int i8) {
        return ColorUtils.setAlphaComponent(i8, Math.min(Color.alpha(i8) * 2, 255));
    }

    @ColorInt
    private static int getColorForState(@Nullable ColorStateList colorStateList, int[] iArr) {
        int i8;
        if (colorStateList != null) {
            i8 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i8 = 0;
        }
        if (USE_FRAMEWORK_RIPPLE) {
            return doubleAlpha(i8);
        }
        return i8;
    }

    @NonNull
    public static ColorStateList sanitizeRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 22 && i8 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(ENABLED_PRESSED_STATE_SET, 0)) != 0) {
                Log.w(LOG_TAG, TRANSPARENT_DEFAULT_COLOR_WARNING);
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean shouldDrawRippleCompat(@NonNull int[] iArr) {
        boolean z8 = false;
        boolean z9 = false;
        for (int i8 : iArr) {
            if (i8 == 16842910) {
                z8 = true;
            } else if (i8 == 16842908 || i8 == 16842919 || i8 == 16843623) {
                z9 = true;
            }
        }
        if (!z8 || !z9) {
            return false;
        }
        return true;
    }
}
