package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TabIndicatorInterpolator {

    @Dimension(unit = 0)
    private static final int MIN_INDICATOR_WIDTH = 24;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF calculateIndicatorWidthForTab(TabLayout tabLayout, @Nullable View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.isTabIndicatorFullWidth() && (view instanceof TabLayout.TabView)) {
            return calculateTabViewContentBounds((TabLayout.TabView) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static RectF calculateTabViewContentBounds(@NonNull TabLayout.TabView tabView, @Dimension(unit = 0) int i8) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int dpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), i8);
        if (contentWidth < dpToPx) {
            contentWidth = dpToPx;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i9 = contentWidth / 2;
        return new RectF(left - i9, top - (contentHeight / 2), i9 + left, top + (left / 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIndicatorBoundsForTab(TabLayout tabLayout, View view, @NonNull Drawable drawable) {
        RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        drawable.setBounds((int) calculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) calculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, @FloatRange(from = 0.0d, to = 1.0d) float f8, @NonNull Drawable drawable) {
        RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        RectF calculateIndicatorWidthForTab2 = calculateIndicatorWidthForTab(tabLayout, view2);
        drawable.setBounds(AnimationUtils.lerp((int) calculateIndicatorWidthForTab.left, (int) calculateIndicatorWidthForTab2.left, f8), drawable.getBounds().top, AnimationUtils.lerp((int) calculateIndicatorWidthForTab.right, (int) calculateIndicatorWidthForTab2.right, f8), drawable.getBounds().bottom);
    }
}
