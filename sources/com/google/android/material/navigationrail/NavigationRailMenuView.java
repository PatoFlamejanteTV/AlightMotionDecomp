package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    @Px
    private int itemMinimumHeight;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int makeSharedHeightSpec(int i8, int i9, int i10) {
        int max = i9 / Math.max(1, i10);
        int i11 = this.itemMinimumHeight;
        if (i11 == -1) {
            i11 = View.MeasureSpec.getSize(i8);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i11, max), 0);
    }

    private int measureChildHeight(View view, int i8, int i9) {
        if (view.getVisibility() != 8) {
            view.measure(i8, i9);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int measureSharedChildHeights(int i8, int i9, int i10, View view) {
        int makeMeasureSpec;
        if (view == null) {
            makeMeasureSpec = makeSharedHeightSpec(i8, i9, i10);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != view) {
                i11 += measureChildHeight(childAt, i8, makeMeasureSpec);
            }
        }
        return i11;
    }

    private int measureShiftingChildHeights(int i8, int i9, int i10) {
        int i11;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i11 = measureChildHeight(childAt, i8, makeSharedHeightSpec(i8, i9, i10));
            i9 -= i11;
            i10--;
        } else {
            i11 = 0;
        }
        return i11 + measureSharedChildHeights(i8, i9, i10, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    protected NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isTopGravity() {
        if ((this.layoutParams.gravity & 112) == 48) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int i12 = i10 - i8;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i13;
                childAt.layout(0, i13, i12, measuredHeight);
                i13 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int measureSharedChildHeights;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = getMenu().getVisibleItems().size();
        if (size2 > 1 && isShifting(getLabelVisibilityMode(), size2)) {
            measureSharedChildHeights = measureShiftingChildHeights(i8, size, size2);
        } else {
            measureSharedChildHeights = measureSharedChildHeights(i8, size, size2, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i8), View.resolveSizeAndState(measureSharedChildHeights, i9, 0));
    }

    public void setItemMinimumHeight(@Px int i8) {
        if (this.itemMinimumHeight != i8) {
            this.itemMinimumHeight = i8;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMenuGravity(int i8) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams.gravity != i8) {
            layoutParams.gravity = i8;
            setLayoutParams(layoutParams);
        }
    }
}
