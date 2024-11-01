package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;

/* loaded from: classes3.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, com.google.android.material.R.attr.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {com.google.android.material.R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    @StyleRes
    private static int obtainAndroidThemeOverlayId(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return resourceId2;
        }
        return resourceId;
    }

    @StyleRes
    private static int obtainMaterialThemeOverlayId(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i8, i9);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        boolean z8;
        int obtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i8, i9);
        if ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == obtainMaterialThemeOverlayId) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (obtainMaterialThemeOverlayId != 0 && !z8) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, obtainMaterialThemeOverlayId);
            int obtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
            if (obtainAndroidThemeOverlayId != 0) {
                contextThemeWrapper.getTheme().applyStyle(obtainAndroidThemeOverlayId, true);
            }
            return contextThemeWrapper;
        }
        return context;
    }
}
