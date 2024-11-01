package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List<Integer> tempChildWidths;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    protected NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int i12 = i10 - i8;
        int i13 = i11 - i9;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i16 = i12 - i14;
                    childAt.layout(i16 - childAt.getMeasuredWidth(), 0, i16, i13);
                } else {
                    childAt.layout(i14, 0, childAt.getMeasuredWidth() + i14, i13);
                }
                i14 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        MenuBuilder menu = getMenu();
        int size = View.MeasureSpec.getSize(i8);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int size3 = View.MeasureSpec.getSize(i9);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i13 = 1;
        if (isShifting(getLabelVisibilityMode(), size2) && isItemHorizontalTranslationEnabled()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i14 = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                i14 = Math.max(i14, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            int i15 = size2 - i11;
            int min = Math.min(size - (this.inactiveItemMinWidth * i15), Math.min(i14, this.activeItemMaxWidth));
            int i16 = size - min;
            if (i15 != 0) {
                i13 = i15;
            }
            int min2 = Math.min(i16 / i13, this.inactiveItemMaxWidth);
            int i17 = i16 - (i15 * min2);
            for (int i18 = 0; i18 < childCount; i18++) {
                if (getChildAt(i18).getVisibility() != 8) {
                    if (i18 == getSelectedItemPosition()) {
                        i12 = min;
                    } else {
                        i12 = min2;
                    }
                    if (i17 > 0) {
                        i12++;
                        i17--;
                    }
                } else {
                    i12 = 0;
                }
                this.tempChildWidths.add(Integer.valueOf(i12));
            }
        } else {
            if (size2 != 0) {
                i13 = size2;
            }
            int min3 = Math.min(size / i13, this.activeItemMaxWidth);
            int i19 = size - (size2 * min3);
            for (int i20 = 0; i20 < childCount; i20++) {
                if (getChildAt(i20).getVisibility() != 8) {
                    if (i19 > 0) {
                        i10 = min3 + 1;
                        i19--;
                    } else {
                        i10 = min3;
                    }
                } else {
                    i10 = 0;
                }
                this.tempChildWidths.add(Integer.valueOf(i10));
            }
        }
        int i21 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i22).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i21 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(i21, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z8) {
        this.itemHorizontalTranslationEnabled = z8;
    }
}
