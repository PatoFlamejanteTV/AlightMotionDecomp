package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FadeTabIndicatorInterpolator extends TabIndicatorInterpolator {
    private static final float FADE_THRESHOLD = 0.5f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f8, @NonNull Drawable drawable) {
        float lerp;
        if (f8 >= 0.5f) {
            view = view2;
        }
        RectF calculateIndicatorWidthForTab = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view);
        if (f8 < 0.5f) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f8);
        } else {
            lerp = AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f8);
        }
        drawable.setBounds((int) calculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) calculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (lerp * 255.0f));
    }
}
