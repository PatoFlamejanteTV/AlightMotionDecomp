package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_LABELED_TRANSFORM;
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int INVALID_ITEM_POSITION = -1;
    private ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorLabelPadding;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private ActiveIndicatorTransform activeIndicatorTransform;

    @Nullable
    private final View activeIndicatorView;

    @StyleRes
    private int activeTextAppearance;

    @Nullable
    private BadgeDrawable badgeDrawable;
    private final ImageView icon;

    @Nullable
    private final FrameLayout iconContainer;

    @Nullable
    private ColorStateList iconTint;
    private boolean initialized;
    private boolean isShifting;

    @Nullable
    Drawable itemBackground;

    @Nullable
    private MenuItemImpl itemData;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition;
    private ColorStateList itemRippleColor;
    private final ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;

    @Nullable
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;

    @Nullable
    private Drawable wrappedIconDrawable;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ActiveIndicatorTransform {
        private static final float ALPHA_FRACTION = 0.2f;
        private static final float SCALE_X_HIDDEN = 0.4f;
        private static final float SCALE_X_SHOWN = 1.0f;

        private ActiveIndicatorTransform() {
        }

        protected float calculateAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
            float f10;
            float f11;
            if (f9 == 0.0f) {
                f10 = 0.8f;
            } else {
                f10 = 0.0f;
            }
            if (f9 == 0.0f) {
                f11 = 1.0f;
            } else {
                f11 = 0.2f;
            }
            return AnimationUtils.lerp(0.0f, 1.0f, f10, f11, f8);
        }

        protected float calculateScaleX(@FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
            return AnimationUtils.lerp(0.4f, 1.0f, f8);
        }

        protected float calculateScaleY(@FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
            return 1.0f;
        }

        public void updateForProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, @NonNull View view) {
            view.setScaleX(calculateScaleX(f8, f9));
            view.setScaleY(calculateScaleY(f8, f9));
            view.setAlpha(calculateAlpha(f8, f9));
        }
    }

    /* loaded from: classes3.dex */
    private static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
            super();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        protected float calculateScaleY(float f8, float f9) {
            return calculateScaleX(f8, f9);
        }
    }

    static {
        ACTIVE_INDICATOR_LABELED_TRANSFORM = new ActiveIndicatorTransform();
        ACTIVE_INDICATOR_UNLABELED_TRANSFORM = new ActiveIndicatorUnlabeledTransform();
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.initialized = false;
        this.itemPosition = -1;
        this.activeTextAppearance = 0;
        this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        this.activeIndicatorProgress = 0.0f;
        this.activeIndicatorEnabled = false;
        this.activeIndicatorDesiredWidth = 0;
        this.activeIndicatorDesiredHeight = 0;
        this.activeIndicatorResizeable = false;
        this.activeIndicatorMarginHorizontal = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.iconContainer = (FrameLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        this.activeIndicatorView = findViewById(com.google.android.material.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        this.icon = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        this.labelGroup = viewGroup;
        TextView textView = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_small_label_view);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_large_label_view);
        this.largeLabel = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.itemPaddingBottom = viewGroup.getPaddingBottom();
        this.activeIndicatorLabelPadding = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_item_active_indicator_label_padding);
        ViewCompat.setImportantForAccessibility(textView, 2);
        ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    if (NavigationBarItemView.this.icon.getVisibility() == 0) {
                        NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                        navigationBarItemView.tryUpdateBadgeBounds(navigationBarItemView.icon);
                    }
                }
            });
        }
    }

    private void calculateTextScaleFactors(float f8, float f9) {
        this.shiftAmount = f8 - f9;
        this.scaleUpFactor = (f9 * 1.0f) / f8;
        this.scaleDownFactor = (f8 * 1.0f) / f9;
    }

    private static Drawable createItemBackgroundCompat(@NonNull ColorStateList colorStateList) {
        return new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null);
    }

    @Nullable
    private FrameLayout getCustomParentForBadge(View view) {
        ImageView imageView = this.icon;
        if (view != imageView || !BadgeUtils.USE_COMPAT_PARENT) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout == null) {
            return this.icon;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i8 = 0;
        for (int i9 = 0; i9 < indexOfChild; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i8++;
            }
        }
        return i8;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin + getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = badgeDrawable.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.icon.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private boolean hasBadge() {
        if (this.badgeDrawable != null) {
            return true;
        }
        return false;
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        if (this.activeIndicatorResizeable && this.labelVisibilityMode == 2) {
            return true;
        }
        return false;
    }

    private void maybeAnimateActiveIndicatorToProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f8) {
        if (this.activeIndicatorEnabled && this.initialized && ViewCompat.isAttachedToWindow(this)) {
            ValueAnimator valueAnimator = this.activeIndicatorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.activeIndicatorAnimator = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.activeIndicatorProgress, f8);
            this.activeIndicatorAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NavigationBarItemView.this.setActiveIndicatorProgress(((Float) valueAnimator2.getAnimatedValue()).floatValue(), f8);
                }
            });
            this.activeIndicatorAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.activeIndicatorAnimator.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
            this.activeIndicatorAnimator.start();
            return;
        }
        setActiveIndicatorProgress(f8, f8);
    }

    private void refreshChecked() {
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    private void refreshItemBackground() {
        Drawable drawable = this.itemBackground;
        RippleDrawable rippleDrawable = null;
        boolean z8 = true;
        if (this.itemRippleColor != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.activeIndicatorEnabled && getActiveIndicatorDrawable() != null && this.iconContainer != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.itemRippleColor), null, activeIndicatorDrawable);
                z8 = false;
            } else if (drawable == null) {
                drawable = createItemBackgroundCompat(this.itemRippleColor);
            }
        }
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.iconContainer.setForeground(rippleDrawable);
        }
        ViewCompat.setBackground(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveIndicatorProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8, float f9) {
        View view = this.activeIndicatorView;
        if (view != null) {
            this.activeIndicatorTransform.updateForProgress(f8, f9, view);
        }
        this.activeIndicatorProgress = f8;
    }

    private static void setTextAppearanceWithoutFontScaling(TextView textView, @StyleRes int i8) {
        TextViewCompat.setTextAppearance(textView, i8);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i8, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    private static void setViewScaleValues(@NonNull View view, float f8, float f9, int i8) {
        view.setScaleX(f8);
        view.setScaleY(f9);
        view.setVisibility(i8);
    }

    private static void setViewTopMarginAndGravity(@NonNull View view, int i8, int i9) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i8;
        layoutParams.bottomMargin = i8;
        layoutParams.gravity = i9;
        view.setLayoutParams(layoutParams);
    }

    private void tryAttachBadgeToAnchor(@Nullable View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryRemoveBadgeFromAnchor(@Nullable View view) {
        if (!hasBadge()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
        }
        this.badgeDrawable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUpdateBadgeBounds(View view) {
        if (!hasBadge()) {
            return;
        }
        BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateActiveIndicatorLayoutParams(int i8) {
        int i9;
        if (this.activeIndicatorView != null && i8 > 0) {
            int min = Math.min(this.activeIndicatorDesiredWidth, i8 - (this.activeIndicatorMarginHorizontal * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
            if (isActiveIndicatorResizeableAndUnlabeled()) {
                i9 = min;
            } else {
                i9 = this.activeIndicatorDesiredHeight;
            }
            layoutParams.height = i9;
            layoutParams.width = min;
            this.activeIndicatorView.setLayoutParams(layoutParams);
        }
    }

    private void updateActiveIndicatorTransform() {
        if (isActiveIndicatorResizeableAndUnlabeled()) {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
        } else {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        }
    }

    private static void updateViewPaddingBottom(@NonNull View view, int i8) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null && this.activeIndicatorEnabled) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.activeIndicatorView;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    @DrawableRes
    protected int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    @DimenRes
    protected int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.itemPosition;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        int i8;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        int suggestedIconHeight = getSuggestedIconHeight();
        if (this.labelGroup.getVisibility() == 0) {
            i8 = this.activeIndicatorLabelPadding;
        } else {
            i8 = 0;
        }
        return suggestedIconHeight + i8 + layoutParams.topMargin + this.labelGroup.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.labelGroup.getMeasuredWidth() + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i8) {
        CharSequence title;
        int i9;
        this.itemData = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        if (!TextUtils.isEmpty(menuItemImpl.getTooltipText())) {
            title = menuItemImpl.getTooltipText();
        } else {
            title = menuItemImpl.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, title);
        }
        if (menuItemImpl.isVisible()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        setVisibility(i9);
        this.initialized = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 1);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.itemData.getTitle();
            if (!TextUtils.isEmpty(this.itemData.getContentDescription())) {
                title = this.itemData.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
        }
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            wrap.setClickable(false);
            wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        wrap.setRoleDescription(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    @Override // android.view.View
    protected void onSizeChanged(final int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // java.lang.Runnable
            public void run() {
                NavigationBarItemView.this.updateActiveIndicatorLayoutParams(i8);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.activeIndicatorView;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        refreshItemBackground();
    }

    public void setActiveIndicatorEnabled(boolean z8) {
        int i8;
        this.activeIndicatorEnabled = z8;
        refreshItemBackground();
        View view = this.activeIndicatorView;
        if (view != null) {
            if (z8) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            view.setVisibility(i8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i8) {
        this.activeIndicatorDesiredHeight = i8;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i8) {
        if (this.activeIndicatorLabelPadding != i8) {
            this.activeIndicatorLabelPadding = i8;
            refreshChecked();
        }
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i8) {
        this.activeIndicatorMarginHorizontal = i8;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z8) {
        this.activeIndicatorResizeable = z8;
    }

    public void setActiveIndicatorWidth(int i8) {
        this.activeIndicatorDesiredWidth = i8;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        if (this.badgeDrawable == badgeDrawable) {
            return;
        }
        if (hasBadge() && this.icon != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            tryRemoveBadgeFromAnchor(this.icon);
        }
        this.badgeDrawable = badgeDrawable;
        ImageView imageView = this.icon;
        if (imageView != null) {
            tryAttachBadgeToAnchor(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z8) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z8) {
        float f8;
        this.largeLabel.setPivotX(r0.getWidth() / 2);
        this.largeLabel.setPivotY(r0.getBaseline());
        this.smallLabel.setPivotX(r0.getWidth() / 2);
        this.smallLabel.setPivotY(r0.getBaseline());
        if (z8) {
            f8 = 1.0f;
        } else {
            f8 = 0.0f;
        }
        maybeAnimateActiveIndicatorToProgress(f8);
        int i8 = this.labelVisibilityMode;
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                        this.largeLabel.setVisibility(8);
                        this.smallLabel.setVisibility(8);
                    }
                } else {
                    updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                    if (z8) {
                        setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                        setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                        TextView textView = this.smallLabel;
                        float f9 = this.scaleUpFactor;
                        setViewScaleValues(textView, f9, f9, 4);
                    } else {
                        setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                        TextView textView2 = this.largeLabel;
                        float f10 = this.scaleDownFactor;
                        setViewScaleValues(textView2, f10, f10, 4);
                        setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
                    }
                }
            } else {
                if (z8) {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                    this.largeLabel.setVisibility(0);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                    updateViewPaddingBottom(this.labelGroup, 0);
                    this.largeLabel.setVisibility(4);
                }
                this.smallLabel.setVisibility(4);
            }
        } else if (this.isShifting) {
            if (z8) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                this.largeLabel.setVisibility(0);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                updateViewPaddingBottom(this.labelGroup, 0);
                this.largeLabel.setVisibility(4);
            }
            this.smallLabel.setVisibility(4);
        } else {
            updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
            if (z8) {
                setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                TextView textView3 = this.smallLabel;
                float f11 = this.scaleUpFactor;
                setViewScaleValues(textView3, f11, f11, 4);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                TextView textView4 = this.largeLabel;
                float f12 = this.scaleDownFactor;
                setViewScaleValues(textView4, f12, f12, 4);
                setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z8);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        this.smallLabel.setEnabled(z8);
        this.largeLabel.setEnabled(z8);
        this.icon.setEnabled(z8);
        if (z8) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconSize(int i8) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i8;
        layoutParams.height = i8;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData != null && (drawable = this.wrappedIconDrawable) != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            this.wrappedIconDrawable.invalidateSelf();
        }
    }

    public void setItemBackground(int i8) {
        setItemBackground(i8 == 0 ? null : ContextCompat.getDrawable(getContext(), i8));
    }

    public void setItemPaddingBottom(int i8) {
        if (this.itemPaddingBottom != i8) {
            this.itemPaddingBottom = i8;
            refreshChecked();
        }
    }

    public void setItemPaddingTop(int i8) {
        if (this.itemPaddingTop != i8) {
            this.itemPaddingTop = i8;
            refreshChecked();
        }
    }

    public void setItemPosition(int i8) {
        this.itemPosition = i8;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        refreshItemBackground();
    }

    public void setLabelVisibilityMode(int i8) {
        if (this.labelVisibilityMode != i8) {
            this.labelVisibilityMode = i8;
            updateActiveIndicatorTransform();
            updateActiveIndicatorLayoutParams(getWidth());
            refreshChecked();
        }
    }

    public void setShifting(boolean z8) {
        if (this.isShifting != z8) {
            this.isShifting = z8;
            refreshChecked();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z8, char c8) {
    }

    public void setTextAppearanceActive(@StyleRes int i8) {
        this.activeTextAppearance = i8;
        setTextAppearanceWithoutFontScaling(this.largeLabel, i8);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z8) {
        setTextAppearanceActive(this.activeTextAppearance);
        TextView textView = this.largeLabel;
        textView.setTypeface(textView.getTypeface(), z8 ? 1 : 0);
    }

    public void setTextAppearanceInactive(@StyleRes int i8) {
        setTextAppearanceWithoutFontScaling(this.smallLabel, i8);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.itemData;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.itemBackground = drawable;
        refreshItemBackground();
    }
}
