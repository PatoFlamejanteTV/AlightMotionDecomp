package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z8) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(int i8, int i9) {
            super(i8, i9);
            this.isOverflowButton = false;
        }

        LayoutParams(int i8, int i9, boolean z8) {
            super(i8, i9);
            this.isOverflowButton = z8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class MenuBuilderCallback implements MenuBuilder.Callback {
        MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.mOnMenuItemClickListener;
            if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int measureChildForCells(View view, int i8, int i9, int i10, int i11) {
        ActionMenuItemView actionMenuItemView;
        boolean z8;
        int i12;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - i11, View.MeasureSpec.getMode(i10));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z9 = false;
        if (actionMenuItemView != null && actionMenuItemView.hasText()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (i9 > 0) {
            i12 = 2;
            if (!z8 || i9 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i13 = measuredWidth / i8;
                if (measuredWidth % i8 != 0) {
                    i13++;
                }
                if (!z8 || i13 >= 2) {
                    i12 = i13;
                }
                if (!layoutParams.isOverflowButton && z8) {
                    z9 = true;
                }
                layoutParams.expandable = z9;
                layoutParams.cellsUsed = i12;
                view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i12, 1073741824), makeMeasureSpec);
                return i12;
            }
        }
        i12 = 0;
        if (!layoutParams.isOverflowButton) {
            z9 = true;
        }
        layoutParams.expandable = z9;
        layoutParams.cellsUsed = i12;
        view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i12, 1073741824), makeMeasureSpec);
        return i12;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    private void onMeasureExactFormat(int i8, int i9) {
        boolean z8;
        int i10;
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        ?? r14;
        boolean z13;
        int i16;
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.mMinCellSize;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = i18 + (i20 / i19);
        int childCount = getChildCount();
        int i22 = 0;
        int i23 = 0;
        boolean z14 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j8 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            int i27 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i28 = i24 + 1;
                if (z15) {
                    int i29 = this.mGeneratedItemPadding;
                    i15 = i28;
                    r14 = 0;
                    childAt.setPadding(i29, 0, i29, 0);
                } else {
                    i15 = i28;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r14;
                layoutParams.extraPixels = r14;
                layoutParams.cellsUsed = r14;
                layoutParams.expandable = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                if (z15 && ((ActionMenuItemView) childAt).hasText()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                layoutParams.preventEdgeOffset = z13;
                if (layoutParams.isOverflowButton) {
                    i16 = 1;
                } else {
                    i16 = i19;
                }
                int measureChildForCells = measureChildForCells(childAt, i21, i16, childMeasureSpec, paddingTop);
                i25 = Math.max(i25, measureChildForCells);
                if (layoutParams.expandable) {
                    i26++;
                }
                if (layoutParams.isOverflowButton) {
                    z14 = true;
                }
                i19 -= measureChildForCells;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (measureChildForCells == 1) {
                    j8 |= 1 << i23;
                    i22 = i22;
                }
                i24 = i15;
            }
            i23++;
            size2 = i27;
        }
        int i30 = size2;
        if (z14 && i24 == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z16 = false;
        while (i26 > 0 && i19 > 0) {
            int i31 = 0;
            int i32 = 0;
            int i33 = Integer.MAX_VALUE;
            long j9 = 0;
            while (i32 < childCount) {
                boolean z17 = z16;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i32).getLayoutParams();
                int i34 = i22;
                if (layoutParams2.expandable) {
                    int i35 = layoutParams2.cellsUsed;
                    if (i35 < i33) {
                        j9 = 1 << i32;
                        i33 = i35;
                        i31 = 1;
                    } else if (i35 == i33) {
                        i31++;
                        j9 |= 1 << i32;
                    }
                }
                i32++;
                i22 = i34;
                z16 = z17;
            }
            z9 = z16;
            i12 = i22;
            j8 |= j9;
            if (i31 > i19) {
                i10 = mode;
                i11 = i17;
                break;
            }
            int i36 = i33 + 1;
            int i37 = 0;
            while (i37 < childCount) {
                View childAt2 = getChildAt(i37);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i38 = i17;
                int i39 = mode;
                long j10 = 1 << i37;
                if ((j9 & j10) == 0) {
                    if (layoutParams3.cellsUsed == i36) {
                        j8 |= j10;
                    }
                    z12 = z8;
                } else {
                    if (z8 && layoutParams3.preventEdgeOffset && i19 == 1) {
                        int i40 = this.mGeneratedItemPadding;
                        z12 = z8;
                        childAt2.setPadding(i40 + i21, 0, i40, 0);
                    } else {
                        z12 = z8;
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = true;
                    i19--;
                }
                i37++;
                mode = i39;
                i17 = i38;
                z8 = z12;
            }
            i22 = i12;
            z16 = true;
        }
        i10 = mode;
        i11 = i17;
        z9 = z16;
        i12 = i22;
        if (!z14 && i24 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i19 > 0 && j8 != 0 && (i19 < i24 - 1 || z10 || i25 > 1)) {
            float bitCount = Long.bitCount(j8);
            if (!z10) {
                if ((j8 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount - 1;
                if ((j8 & (1 << i41)) != 0 && !((LayoutParams) getChildAt(i41).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i14 = (int) ((i19 * i21) / bitCount);
            } else {
                i14 = 0;
            }
            z11 = z9;
            for (int i42 = 0; i42 < childCount; i42++) {
                if ((j8 & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i14;
                        layoutParams4.expanded = true;
                        if (i42 == 0 && !layoutParams4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i14) / 2;
                        }
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i14;
                        layoutParams4.expanded = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i14) / 2;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i14 / 2;
                        }
                        if (i42 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i14 / 2;
                        }
                    }
                    z11 = true;
                }
            }
        } else {
            z11 = z9;
        }
        if (z11) {
            for (int i43 = 0; i43 < childCount; i43++) {
                View childAt4 = getChildAt(i43);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i21) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i10 != 1073741824) {
            i13 = i12;
        } else {
            i13 = i30;
        }
        setMeasuredDimension(i11, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            MenuPresenter.Callback callback = this.mActionMenuPresenterCallback;
            if (callback == null) {
                callback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(callback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected boolean hasSupportDividerBeforeChildAt(int i8) {
        boolean z8 = false;
        if (i8 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i8 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i8);
        if (i8 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z8 = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        if (i8 > 0 && (childAt2 instanceof ActionMenuChildView)) {
            return z8 | ((ActionMenuChildView) childAt2).needsDividerBefore();
        }
        return z8;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending()) {
            return true;
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing()) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int i12;
        int width;
        int i13;
        if (!this.mFormatItems) {
            super.onLayout(z8, i8, i9, i10, i11);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i11 - i9) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i10 - i8;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (isLayoutRtl) {
                        i13 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i13 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i13 = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i13, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        if (i22 > 0) {
            i12 = paddingRight / i22;
        } else {
            i12 = 0;
        }
        int max = Math.max(0, i12);
        if (isLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i27 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i8, int i9) {
        boolean z8;
        MenuBuilder menuBuilder;
        boolean z9 = this.mFormatItems;
        if (View.MeasureSpec.getMode(i8) == 1073741824) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mFormatItems = z8;
        if (z9 != z8) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i8, i9);
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i10).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i8, i9);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z8) {
        this.mPresenter.setExpandedActionViewsExclusive(z8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z8) {
        this.mReserveOverflow = z8;
    }

    public void setPopupTheme(@StyleRes int i8) {
        if (this.mPopupTheme != i8) {
            this.mPopupTheme = i8;
            if (i8 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu()) {
            return true;
        }
        return false;
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f8);
        this.mGeneratedItemPadding = (int) (f8 * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }
}
