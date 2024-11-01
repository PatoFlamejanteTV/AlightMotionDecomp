package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.DecorView
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;

    @Dimension(unit = 0)
    static final int DEFAULT_GAP_TEXT_ICON = 8;

    @Dimension(unit = 0)
    private static final int DEFAULT_HEIGHT = 48;

    @Dimension(unit = 0)
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;

    @Dimension(unit = 0)
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = -1;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;

    @Dimension(unit = 0)
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;

    @Nullable
    private BaseOnTabSelectedListener currentVpSelectedListener;
    private final int defaultTabTextAppearance;
    int indicatorPosition;
    boolean inlineLabel;
    int mode;
    private TabLayoutOnPageChangeListener pageChangeListener;

    @Nullable
    private PagerAdapter pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;

    @Nullable
    private BaseOnTabSelectedListener selectedListener;
    private final ArrayList<BaseOnTabSelectedListener> selectedListeners;

    @Nullable
    private Tab selectedTab;
    private int selectedTabTextAppearance;
    float selectedTabTextSize;
    private boolean setupViewPagerImplicitly;

    @NonNull
    final SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    private TabIndicatorInterpolator tabIndicatorInterpolator;
    private final TimeInterpolator tabIndicatorTimeInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;

    @NonNull
    Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    private final int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final Pools.Pool<TabView> tabViewPool;
    private final ArrayList<Tab> tabs;
    boolean unboundedRipple;

    @Nullable
    ViewPager viewPager;
    private int viewPagerScrollState;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TabLayout;
    private static final Pools.Pool<Tab> tabPool = new Pools.SynchronizedPool(16);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {
        private boolean autoRefresh;

        AdapterChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.viewPager == viewPager) {
                tabLayout.setPagerAdapter(pagerAdapter2, this.autoRefresh);
            }
        }

        void setAutoRefresh(boolean z8) {
            this.autoRefresh = z8;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t8);

        void onTabSelected(T t8);

        void onTabUnselected(T t8);
    }

    /* loaded from: classes3.dex */
    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface Mode {
    }

    /* loaded from: classes3.dex */
    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class PagerAdapterObserver extends DataSetObserver {
        PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class SlidingTabIndicator extends LinearLayout {
        ValueAnimator indicatorAnimator;
        private int layoutDirection;

        SlidingTabIndicator(Context context) {
            super(context);
            this.layoutDirection = -1;
            setWillNotDraw(false);
        }

        private void jumpIndicatorToIndicatorPosition() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == -1) {
                tabLayout.indicatorPosition = tabLayout.getSelectedTabPosition();
            }
            jumpIndicatorToPosition(TabLayout.this.indicatorPosition);
        }

        private void jumpIndicatorToPosition(int i8) {
            if (TabLayout.this.viewPagerScrollState != 0 && (TabLayout.this.getTabSelectedIndicator().getBounds().left != -1 || TabLayout.this.getTabSelectedIndicator().getBounds().right != -1)) {
                return;
            }
            View childAt = getChildAt(i8);
            TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.tabIndicatorInterpolator;
            TabLayout tabLayout = TabLayout.this;
            tabIndicatorInterpolator.setIndicatorBoundsForTab(tabLayout, childAt, tabLayout.tabSelectedIndicator);
            TabLayout.this.indicatorPosition = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jumpIndicatorToSelectedPosition() {
            jumpIndicatorToPosition(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tweenIndicatorPosition(View view, View view2, float f8) {
            if (view != null && view.getWidth() > 0) {
                TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolator.updateIndicatorForOffset(tabLayout, view, view2, f8, tabLayout.tabSelectedIndicator);
            } else {
                Drawable drawable = TabLayout.this.tabSelectedIndicator;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.tabSelectedIndicator.getBounds().bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }

        private void updateOrRecreateIndicatorAnimation(boolean z8, int i8, int i9) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == i8) {
                return;
            }
            final View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            final View childAt2 = getChildAt(i8);
            if (childAt2 == null) {
                jumpIndicatorToSelectedPosition();
                return;
            }
            TabLayout.this.indicatorPosition = i8;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    SlidingTabIndicator.this.tweenIndicatorPosition(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (z8) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.indicatorAnimator = valueAnimator;
                valueAnimator.setInterpolator(TabLayout.this.tabIndicatorTimeInterpolator);
                valueAnimator.setDuration(i9);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(animatorUpdateListener);
                valueAnimator.start();
                return;
            }
            this.indicatorAnimator.removeAllUpdateListeners();
            this.indicatorAnimator.addUpdateListener(animatorUpdateListener);
        }

        void animateIndicatorToPosition(int i8, int i9) {
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.indicatorPosition != i8) {
                this.indicatorAnimator.cancel();
            }
            updateOrRecreateIndicatorAnimation(true, i8, i9);
        }

        boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            int height;
            int height2 = TabLayout.this.tabSelectedIndicator.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            }
            int i8 = TabLayout.this.tabIndicatorGravity;
            if (i8 != 0) {
                if (i8 != 1) {
                    height = 0;
                    if (i8 != 2) {
                        if (i8 != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.tabSelectedIndicator.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
                TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.tabSelectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
            super.onLayout(z8, i8, i9, i10, i11);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                updateOrRecreateIndicatorAnimation(false, TabLayout.this.getSelectedTabPosition(), -1);
            } else {
                jumpIndicatorToIndicatorPosition();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            if (View.MeasureSpec.getMode(i8) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z8 = true;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() == 0) {
                        i10 = Math.max(i10, childAt.getMeasuredWidth());
                    }
                }
                if (i10 <= 0) {
                    return;
                }
                if (i10 * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z9 = false;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i12).getLayoutParams();
                        if (layoutParams.width != i10 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i10;
                            layoutParams.weight = 0.0f;
                            z9 = true;
                        }
                    }
                    z8 = z9;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.tabGravity = 0;
                    tabLayout2.updateTabViews(false);
                }
                if (z8) {
                    super.onMeasure(i8, i9);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i8) {
            super.onRtlPropertiesChanged(i8);
            if (Build.VERSION.SDK_INT < 23 && this.layoutDirection != i8) {
                requestLayout();
                this.layoutDirection = i8;
            }
        }

        void setIndicatorPositionFromTabPosition(int i8, float f8) {
            TabLayout.this.indicatorPosition = Math.round(i8 + f8);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.indicatorAnimator.cancel();
            }
            tweenIndicatorPosition(getChildAt(i8), getChildAt(i8 + 1), f8);
        }

        void setSelectedIndicatorHeight(int i8) {
            Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
            TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i8);
            requestLayout();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface TabIndicatorGravity {
    }

    /* loaded from: classes3.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        private int previousScrollState;
        private int scrollState;

        @NonNull
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i8;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
            boolean z8;
            boolean z9;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i10 = this.scrollState;
                if (i10 == 2 && this.previousScrollState != 1) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (i10 == 2 && this.previousScrollState == 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                tabLayout.setScrollPosition(i8, f8, z8, z9, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
            boolean z8;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i8 && i8 < tabLayout.getTabCount()) {
                int i9 = this.scrollState;
                if (i9 != 0 && (i9 != 2 || this.previousScrollState != 0)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i8), z8);
            }
        }

        void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    /* loaded from: classes3.dex */
    public final class TabView extends LinearLayout {

        @Nullable
        private View badgeAnchorView;

        @Nullable
        private BadgeDrawable badgeDrawable;

        @Nullable
        private Drawable baseBackgroundDrawable;

        @Nullable
        private ImageView customIconView;

        @Nullable
        private TextView customTextView;

        @Nullable
        private View customView;
        private int defaultMaxLines;
        private ImageView iconView;
        private Tab tab;
        private TextView textView;

        public TabView(@NonNull Context context) {
            super(context);
            this.defaultMaxLines = 2;
            updateBackgroundDrawable(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND));
        }

        private void addOnLayoutChangeListener(@Nullable final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    if (view.getVisibility() == 0) {
                        TabView.this.tryUpdateBadgeDrawableBounds(view);
                    }
                }
            });
        }

        private float approximateLineWidth(@NonNull Layout layout, int i8, float f8) {
            return layout.getLineWidth(i8) * (f8 / layout.getPaint().getTextSize());
        }

        private void clipViewToPaddingForBadge(boolean z8) {
            setClipChildren(z8);
            setClipToPadding(z8);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z8);
                viewGroup.setClipToPadding(z8);
            }
        }

        @NonNull
        private FrameLayout createPreApi18BadgeAnchorRoot() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void drawBackground(@NonNull Canvas canvas) {
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public BadgeDrawable getBadge() {
            return this.badgeDrawable;
        }

        @Nullable
        private FrameLayout getCustomParentForBadge(@NonNull View view) {
            if ((view != this.iconView && view != this.textView) || !BadgeUtils.USE_COMPAT_PARENT) {
                return null;
            }
            return (FrameLayout) view.getParent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            if (this.badgeDrawable == null) {
                this.badgeDrawable = BadgeDrawable.create(getContext());
            }
            tryUpdateBadgeAnchor();
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasBadgeDrawable() {
            if (this.badgeDrawable != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void inflateAndAddDefaultIconView() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = createPreApi18BadgeAnchorRoot();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.iconView = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void inflateAndAddDefaultTextView() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = createPreApi18BadgeAnchorRoot();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.textView = textView;
            frameLayout.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBadge() {
            if (this.badgeAnchorView != null) {
                tryRemoveBadgeFromAnchor();
            }
            this.badgeDrawable = null;
        }

        private void tryAttachBadgeToAnchor(@Nullable View view) {
            if (hasBadgeDrawable() && view != null) {
                clipViewToPaddingForBadge(false);
                BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
                this.badgeAnchorView = view;
            }
        }

        private void tryRemoveBadgeFromAnchor() {
            if (!hasBadgeDrawable()) {
                return;
            }
            clipViewToPaddingForBadge(true);
            View view = this.badgeAnchorView;
            if (view != null) {
                BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
                this.badgeAnchorView = null;
            }
        }

        private void tryUpdateBadgeAnchor() {
            Tab tab;
            Tab tab2;
            if (!hasBadgeDrawable()) {
                return;
            }
            if (this.customView != null) {
                tryRemoveBadgeFromAnchor();
                return;
            }
            if (this.iconView != null && (tab2 = this.tab) != null && tab2.getIcon() != null) {
                View view = this.badgeAnchorView;
                ImageView imageView = this.iconView;
                if (view != imageView) {
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.iconView);
                    return;
                } else {
                    tryUpdateBadgeDrawableBounds(imageView);
                    return;
                }
            }
            if (this.textView != null && (tab = this.tab) != null && tab.getTabLabelVisibility() == 1) {
                View view2 = this.badgeAnchorView;
                TextView textView = this.textView;
                if (view2 != textView) {
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.textView);
                    return;
                } else {
                    tryUpdateBadgeDrawableBounds(textView);
                    return;
                }
            }
            tryRemoveBadgeFromAnchor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tryUpdateBadgeDrawableBounds(@NonNull View view) {
            if (hasBadgeDrawable() && view == this.badgeAnchorView) {
                BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void updateBackgroundDrawable(Context context) {
            int i8 = TabLayout.this.tabBackgroundResId;
            GradientDrawable gradientDrawable = null;
            if (i8 != 0) {
                Drawable drawable = AppCompatResources.getDrawable(context, i8);
                this.baseBackgroundDrawable = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.baseBackgroundDrawable.setState(getDrawableState());
                }
            } else {
                this.baseBackgroundDrawable = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.tabRippleColorStateList != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList convertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(TabLayout.this.tabRippleColorStateList);
                boolean z8 = TabLayout.this.unboundedRipple;
                if (z8) {
                    gradientDrawable2 = null;
                }
                if (!z8) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(convertToRippleDrawableColor, gradientDrawable2, gradientDrawable);
            }
            ViewCompat.setBackground(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        private void updateTextAndIcon(@Nullable TextView textView, @Nullable ImageView imageView, boolean z8) {
            Drawable drawable;
            CharSequence charSequence;
            int i8;
            CharSequence charSequence2;
            int i9;
            Tab tab = this.tab;
            CharSequence charSequence3 = null;
            if (tab != null && tab.getIcon() != null) {
                drawable = DrawableCompat.wrap(this.tab.getIcon()).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                DrawableCompat.setTintList(drawable, TabLayout.this.tabIconTint);
                PorterDuff.Mode mode = TabLayout.this.tabIconTintMode;
                if (mode != null) {
                    DrawableCompat.setTintMode(drawable, mode);
                }
            }
            Tab tab2 = this.tab;
            if (tab2 != null) {
                charSequence = tab2.getText();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z9 = true;
            boolean z10 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!z10 || this.tab.labelVisibilityMode != 1) {
                    z9 = false;
                }
                if (z10) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z9) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                textView.setVisibility(i9);
                if (z10) {
                    setVisibility(0);
                }
            } else {
                z9 = false;
            }
            if (z8 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z9 && imageView.getVisibility() == 0) {
                    i8 = (int) ViewUtils.dpToPx(getContext(), 8);
                } else {
                    i8 = 0;
                }
                if (TabLayout.this.inlineLabel) {
                    if (i8 != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, i8);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i8 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i8;
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.tab;
            if (tab3 != null) {
                charSequence3 = tab3.contentDesc;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z10) {
                    charSequence = charSequence3;
                }
                TooltipCompat.setTooltipText(this, charSequence);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            boolean z8;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null && drawable.isStateful()) {
                z8 = this.baseBackgroundDrawable.setState(drawableState);
            } else {
                z8 = false;
            }
            if (z8) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i8 = 0;
            int i9 = 0;
            boolean z8 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    if (z8) {
                        i9 = Math.min(i9, view.getTop());
                    } else {
                        i9 = view.getTop();
                    }
                    if (z8) {
                        i8 = Math.max(i8, view.getBottom());
                    } else {
                        i8 = view.getBottom();
                    }
                    z8 = true;
                }
            }
            return i8 - i9;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i8 = 0;
            int i9 = 0;
            boolean z8 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    if (z8) {
                        i9 = Math.min(i9, view.getLeft());
                    } else {
                        i9 = view.getLeft();
                    }
                    if (z8) {
                        i8 = Math.max(i8, view.getRight());
                    } else {
                        i8 = view.getRight();
                    }
                    z8 = true;
                }
            }
            return i8 - i9;
        }

        @Nullable
        public Tab getTab() {
            return this.tab;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                wrap.setContentDescription(this.badgeDrawable.getContentDescription());
            }
            wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.tab.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                wrap.setClickable(false);
                wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            wrap.setRoleDescription(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i8, int i9) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i8);
            int mode = View.MeasureSpec.getMode(i8);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i8 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i8, i9);
            if (this.textView != null) {
                float f8 = TabLayout.this.tabTextSize;
                int i10 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i10 = 1;
                } else {
                    TextView textView = this.textView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f8 = TabLayout.this.tabTextMultiLineSize;
                    }
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.textView);
                if (f8 != textSize || (maxLines >= 0 && i10 != maxLines)) {
                    if (TabLayout.this.mode != 1 || f8 <= textSize || lineCount != 1 || ((layout = this.textView.getLayout()) != null && approximateLineWidth(layout, 0, f8) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.textView.setTextSize(0, f8);
                        this.textView.setMaxLines(i10);
                        super.onMeasure(i8, i9);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.tab.select();
                return true;
            }
            return performClick;
        }

        void reset() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z8) {
            isSelected();
            super.setSelected(z8);
            TextView textView = this.textView;
            if (textView != null) {
                textView.setSelected(z8);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z8);
            }
            View view = this.customView;
            if (view != null) {
                view.setSelected(z8);
            }
        }

        void setTab(@Nullable Tab tab) {
            if (tab != this.tab) {
                this.tab = tab;
                update();
            }
        }

        final void update() {
            boolean z8;
            updateTab();
            Tab tab = this.tab;
            if (tab != null && tab.isSelected()) {
                z8 = true;
            } else {
                z8 = false;
            }
            setSelected(z8);
        }

        final void updateOrientation() {
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            TextView textView = this.customTextView;
            if (textView == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView, true);
            } else {
                updateTextAndIcon(textView, this.customIconView, false);
            }
        }

        final void updateTab() {
            View view;
            ViewParent parent;
            Tab tab = this.tab;
            if (tab != null) {
                view = tab.getCustomView();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.customView;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.customView);
                    }
                    addView(view);
                }
                this.customView = view;
                TextView textView = this.textView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
                this.customTextView = textView2;
                if (textView2 != null) {
                    this.defaultMaxLines = TextViewCompat.getMaxLines(textView2);
                }
                this.customIconView = (ImageView) view.findViewById(android.R.id.icon);
            } else {
                View view3 = this.customView;
                if (view3 != null) {
                    removeView(view3);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            }
            if (this.customView == null) {
                if (this.iconView == null) {
                    inflateAndAddDefaultIconView();
                }
                if (this.textView == null) {
                    inflateAndAddDefaultTextView();
                    this.defaultMaxLines = TextViewCompat.getMaxLines(this.textView);
                }
                TextViewCompat.setTextAppearance(this.textView, TabLayout.this.defaultTabTextAppearance);
                if (isSelected() && TabLayout.this.selectedTabTextAppearance != -1) {
                    TextViewCompat.setTextAppearance(this.textView, TabLayout.this.selectedTabTextAppearance);
                } else {
                    TextViewCompat.setTextAppearance(this.textView, TabLayout.this.tabTextAppearance);
                }
                ColorStateList colorStateList = TabLayout.this.tabTextColors;
                if (colorStateList != null) {
                    this.textView.setTextColor(colorStateList);
                }
                updateTextAndIcon(this.textView, this.iconView, true);
                tryUpdateBadgeAnchor();
                addOnLayoutChangeListener(this.iconView);
                addOnLayoutChangeListener(this.textView);
            } else {
                TextView textView3 = this.customTextView;
                if (textView3 != null || this.customIconView != null) {
                    updateTextAndIcon(textView3, this.customIconView, false);
                }
            }
            if (tab != null && !TextUtils.isEmpty(tab.contentDesc)) {
                setContentDescription(tab.contentDesc);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager viewPager;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.viewPager = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    private void addTabFromItemView(@NonNull TabItem tabItem) {
        Tab newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.setText(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            newTab.setIcon(drawable);
        }
        int i8 = tabItem.customLayout;
        if (i8 != 0) {
            newTab.setCustomView(i8);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(newTab);
    }

    private void addTabView(@NonNull Tab tab) {
        TabView tabView = tab.view;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.slidingTabIndicator.addView(tabView, tab.getPosition(), createLayoutParamsForTabs());
    }

    private void addViewInternal(View view) {
        if (view instanceof TabItem) {
            addTabFromItemView((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int i8) {
        if (i8 == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this) && !this.slidingTabIndicator.childrenNeedLayout()) {
            int scrollX = getScrollX();
            int calculateScrollXForTab = calculateScrollXForTab(i8, 0.0f);
            if (scrollX != calculateScrollXForTab) {
                ensureScrollAnimator();
                this.scrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                this.scrollAnimator.start();
            }
            this.slidingTabIndicator.animateIndicatorToPosition(i8, this.tabIndicatorAnimationDuration);
            return;
        }
        setScrollPosition(i8, 0.0f, true);
    }

    private void applyGravityForModeScrollable(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    return;
                }
            } else {
                this.slidingTabIndicator.setGravity(1);
                return;
            }
        } else {
            Log.w(LOG_TAG, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.slidingTabIndicator.setGravity(GravityCompat.START);
    }

    private void applyModeAndGravity() {
        int max;
        int i8 = this.mode;
        if (i8 != 0 && i8 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
        }
        ViewCompat.setPaddingRelative(this.slidingTabIndicator, max, 0, 0, 0);
        int i9 = this.mode;
        if (i9 != 0) {
            if (i9 == 1 || i9 == 2) {
                if (this.tabGravity == 2) {
                    Log.w(LOG_TAG, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.slidingTabIndicator.setGravity(1);
            }
        } else {
            applyGravityForModeScrollable(this.tabGravity);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i8, float f8) {
        View childAt;
        View view;
        int i9 = this.mode;
        int i10 = 0;
        if ((i9 != 0 && i9 != 2) || (childAt = this.slidingTabIndicator.getChildAt(i8)) == null) {
            return 0;
        }
        int i11 = i8 + 1;
        if (i11 < this.slidingTabIndicator.getChildCount()) {
            view = this.slidingTabIndicator.getChildAt(i11);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i10 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i12 = (int) ((width + i10) * 0.5f * f8);
        if (ViewCompat.getLayoutDirection(this) == 0) {
            return left + i12;
        }
        return left - i12;
    }

    private void configureTab(@NonNull Tab tab, int i8) {
        tab.setPosition(i8);
        this.tabs.add(i8, tab);
        int size = this.tabs.size();
        int i9 = -1;
        for (int i10 = i8 + 1; i10 < size; i10++) {
            if (this.tabs.get(i10).getPosition() == this.indicatorPosition) {
                i9 = i10;
            }
            this.tabs.get(i10).setPosition(i10);
        }
        this.indicatorPosition = i9;
    }

    @NonNull
    private static ColorStateList createColorStateList(int i8, int i9) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i9, i8});
    }

    @NonNull
    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    @NonNull
    private TabView createTabView(@NonNull Tab tab) {
        TabView tabView;
        Pools.Pool<TabView> pool = this.tabViewPool;
        if (pool != null) {
            tabView = pool.acquire();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.contentDesc)) {
            tabView.setContentDescription(tab.text);
        } else {
            tabView.setContentDescription(tab.contentDesc);
        }
        return tabView;
    }

    private void dispatchTabReselected(@NonNull Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabReselected(tab);
        }
    }

    private void dispatchTabSelected(@NonNull Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabSelected(tab);
        }
    }

    private void dispatchTabUnselected(@NonNull Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabUnselected(tab);
        }
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(this.tabIndicatorTimeInterpolator);
            this.scrollAnimator.setDuration(this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.tabs.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            Tab tab = this.tabs.get(i8);
            if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                if (!this.inlineLabel) {
                    return 72;
                }
            } else {
                i8++;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i8 = this.requestedTabMinWidth;
        if (i8 != -1) {
            return i8;
        }
        int i9 = this.mode;
        if (i9 != 0 && i9 != 2) {
            return 0;
        }
        return this.scrollableTabMinWidth;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private boolean isScrollingEnabled() {
        if (getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return true;
    }

    private void removeTabViewAt(int i8) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i8);
        this.slidingTabIndicator.removeViewAt(i8);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i8) {
        boolean z8;
        boolean z9;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i8 < childCount) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = this.slidingTabIndicator.getChildAt(i9);
                boolean z10 = true;
                if ((i9 == i8 && !childAt.isSelected()) || (i9 != i8 && childAt.isSelected())) {
                    if (i9 == i8) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    childAt.setSelected(z9);
                    if (i9 != i8) {
                        z10 = false;
                    }
                    childAt.setActivated(z10);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).updateTab();
                    }
                } else {
                    if (i9 == i8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    childAt.setSelected(z8);
                    if (i9 != i8) {
                        z10 = false;
                    }
                    childAt.setActivated(z10);
                }
            }
        }
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.tabs.get(i8).updateView();
        }
    }

    private void updateTabViewLayoutParams(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void addOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        addOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab) {
        addTab(tab, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    protected Tab createTabFromPool() {
        Tab acquire = tabPool.acquire();
        if (acquire == null) {
            return new Tab();
        }
        return acquire;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.selectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    @Nullable
    public Tab getTabAt(int i8) {
        if (i8 >= 0 && i8 < getTabCount()) {
            return this.tabs.get(i8);
        }
        return null;
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    @NonNull
    public Tab newTab() {
        Tab createTabFromPool = createTabFromPool();
        createTabFromPool.parent = this;
        createTabFromPool.view = createTabView(createTabFromPool);
        if (createTabFromPool.id != -1) {
            createTabFromPool.view.setId(createTabFromPool.id);
        }
        return createTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        for (int i8 = 0; i8 < this.slidingTabIndicator.getChildCount(); i8++) {
            View childAt = this.slidingTabIndicator.getChildAt(i8);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isScrollingEnabled() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        int round = Math.round(ViewUtils.dpToPx(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i9);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i9 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i9) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i8);
        if (View.MeasureSpec.getMode(i8) != 0) {
            int i10 = this.requestedTabMaxWidth;
            if (i10 <= 0) {
                i10 = (int) (size - ViewUtils.dpToPx(getContext(), 56));
            }
            this.tabMaxWidth = i10;
        }
        super.onMeasure(i8, i9);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i11 = this.mode;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !isScrollingEnabled()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i8 = 0; i8 < count; i8++) {
                addTab(newTab().setText(this.pagerAdapter.getPageTitle(i8)), false);
            }
            ViewPager viewPager = this.viewPager;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
            }
        }
    }

    protected boolean releaseFromTabPool(Tab tab) {
        return tabPool.release(tab);
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<Tab> it = this.tabs.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.reset();
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    public void removeOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        removeOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void removeTab(@NonNull Tab tab) {
        if (tab.parent == this) {
            removeTabAt(tab.getPosition());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i8) {
        int i9;
        Tab tab;
        Tab tab2 = this.selectedTab;
        if (tab2 != null) {
            i9 = tab2.getPosition();
        } else {
            i9 = 0;
        }
        removeTabViewAt(i8);
        Tab remove = this.tabs.remove(i8);
        if (remove != null) {
            remove.reset();
            releaseFromTabPool(remove);
        }
        int size = this.tabs.size();
        int i10 = -1;
        for (int i11 = i8; i11 < size; i11++) {
            if (this.tabs.get(i11).getPosition() == this.indicatorPosition) {
                i10 = i11;
            }
            this.tabs.get(i11).setPosition(i11);
        }
        this.indicatorPosition = i10;
        if (i9 == i8) {
            if (this.tabs.isEmpty()) {
                tab = null;
            } else {
                tab = this.tabs.get(Math.max(0, i8 - 1));
            }
            selectTab(tab);
        }
    }

    public void selectTab(@Nullable Tab tab) {
        selectTab(tab, true);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f8) {
        super.setElevation(f8);
        MaterialShapeUtils.setElevation(this, f8);
    }

    public void setInlineLabel(boolean z8) {
        if (this.inlineLabel != z8) {
            this.inlineLabel = z8;
            for (int i8 = 0; i8 < this.slidingTabIndicator.getChildCount(); i8++) {
                View childAt = this.slidingTabIndicator.getChildAt(i8);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(@BoolRes int i8) {
        setInlineLabel(getResources().getBoolean(i8));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    void setPagerAdapter(@Nullable PagerAdapter pagerAdapter, boolean z8) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.pagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.pagerAdapterObserver) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.pagerAdapter = pagerAdapter;
        if (z8 && pagerAdapter != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new PagerAdapterObserver();
            }
            pagerAdapter.registerDataSetObserver(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i8, float f8, boolean z8) {
        setScrollPosition(i8, f8, z8, true);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        this.tabSelectedIndicator = mutate;
        DrawableUtils.setTint(mutate, this.tabSelectedIndicatorColor);
        int i8 = this.tabIndicatorHeight;
        if (i8 == -1) {
            i8 = this.tabSelectedIndicator.getIntrinsicHeight();
        }
        this.slidingTabIndicator.setSelectedIndicatorHeight(i8);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i8) {
        this.tabSelectedIndicatorColor = i8;
        DrawableUtils.setTint(this.tabSelectedIndicator, i8);
        updateTabViews(false);
    }

    public void setSelectedTabIndicatorGravity(int i8) {
        if (this.tabIndicatorGravity != i8) {
            this.tabIndicatorGravity = i8;
            ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i8) {
        this.tabIndicatorHeight = i8;
        this.slidingTabIndicator.setSelectedIndicatorHeight(i8);
    }

    public void setTabGravity(int i8) {
        if (this.tabGravity != i8) {
            this.tabGravity = i8;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(@ColorRes int i8) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i8));
    }

    public void setTabIndicatorAnimationMode(int i8) {
        this.tabIndicatorAnimationMode = i8;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    this.tabIndicatorInterpolator = new FadeTabIndicatorInterpolator();
                    return;
                }
                throw new IllegalArgumentException(i8 + " is not a valid TabIndicatorAnimationMode");
            }
            this.tabIndicatorInterpolator = new ElasticTabIndicatorInterpolator();
            return;
        }
        this.tabIndicatorInterpolator = new TabIndicatorInterpolator();
    }

    public void setTabIndicatorFullWidth(boolean z8) {
        this.tabIndicatorFullWidth = z8;
        this.slidingTabIndicator.jumpIndicatorToSelectedPosition();
        ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
    }

    public void setTabMode(int i8) {
        if (i8 != this.mode) {
            this.mode = i8;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i8 = 0; i8 < this.slidingTabIndicator.getChildCount(); i8++) {
                View childAt = this.slidingTabIndicator.getChildAt(i8);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i8) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i8));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        setPagerAdapter(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z8) {
        if (this.unboundedRipple != z8) {
            this.unboundedRipple = z8;
            for (int i8 = 0; i8 < this.slidingTabIndicator.getChildCount(); i8++) {
                View childAt = this.slidingTabIndicator.getChildAt(i8);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i8) {
        setUnboundedRipple(getResources().getBoolean(i8));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    void updateTabViews(boolean z8) {
        for (int i8 = 0; i8 < this.slidingTabIndicator.getChildCount(); i8++) {
            View childAt = this.slidingTabIndicator.getChildAt(i8);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z8) {
                childAt.requestLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateViewPagerScrollState(int i8) {
        this.viewPagerScrollState = i8;
    }

    /* loaded from: classes3.dex */
    public static class Tab {
        public static final int INVALID_POSITION = -1;

        @Nullable
        private CharSequence contentDesc;

        @Nullable
        private View customView;

        @Nullable
        private Drawable icon;

        @Nullable
        public TabLayout parent;

        @Nullable
        private Object tag;

        @Nullable
        private CharSequence text;

        @NonNull
        public TabView view;
        private int position = -1;

        @LabelVisibility
        private int labelVisibilityMode = 1;
        private int id = -1;

        @Nullable
        public BadgeDrawable getBadge() {
            return this.view.getBadge();
        }

        @Nullable
        public CharSequence getContentDescription() {
            TabView tabView = this.view;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @Nullable
        public View getCustomView() {
            return this.customView;
        }

        @Nullable
        public Drawable getIcon() {
            return this.icon;
        }

        public int getId() {
            return this.id;
        }

        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.position;
        }

        @LabelVisibility
        public int getTabLabelVisibility() {
            return this.labelVisibilityMode;
        }

        @Nullable
        public Object getTag() {
            return this.tag;
        }

        @Nullable
        public CharSequence getText() {
            return this.text;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == this.position) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void removeBadge() {
            this.view.removeBadge();
        }

        void reset() {
            this.parent = null;
            this.view = null;
            this.tag = null;
            this.icon = null;
            this.id = -1;
            this.text = null;
            this.contentDesc = null;
            this.position = -1;
            this.customView = null;
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                tabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public Tab setContentDescription(@StringRes int i8) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i8));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public Tab setCustomView(@Nullable View view) {
            this.customView = view;
            updateView();
            return this;
        }

        @NonNull
        public Tab setIcon(@Nullable Drawable drawable) {
            this.icon = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.hasBadgeDrawable() && this.view.badgeDrawable.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        public Tab setId(int i8) {
            this.id = i8;
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.setId(i8);
            }
            return this;
        }

        void setPosition(int i8) {
            this.position = i8;
        }

        @NonNull
        public Tab setTabLabelVisibility(@LabelVisibility int i8) {
            this.labelVisibilityMode = i8;
            TabLayout tabLayout = this.parent;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.hasBadgeDrawable() && this.view.badgeDrawable.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        public Tab setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }

        @NonNull
        public Tab setText(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.contentDesc) && !TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.text = charSequence;
            updateView();
            return this;
        }

        void updateView() {
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.update();
            }
        }

        @NonNull
        public Tab setCustomView(@LayoutRes int i8) {
            return setCustomView(LayoutInflater.from(this.view.getContext()).inflate(i8, (ViewGroup) this.view, false));
        }

        @NonNull
        public Tab setContentDescription(@Nullable CharSequence charSequence) {
            this.contentDesc = charSequence;
            updateView();
            return this;
        }

        @NonNull
        public Tab setText(@StringRes int i8) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i8));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public Tab setIcon(@DrawableRes int i8) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(AppCompatResources.getDrawable(tabLayout.getContext(), i8));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (this.selectedListeners.contains(baseOnTabSelectedListener)) {
            return;
        }
        this.selectedListeners.add(baseOnTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab, int i8) {
        addTab(tab, i8, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i8) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        this.selectedListeners.remove(baseOnTabSelectedListener);
    }

    public void selectTab(@Nullable Tab tab, boolean z8) {
        Tab tab2 = this.selectedTab;
        if (tab2 == tab) {
            if (tab2 != null) {
                dispatchTabReselected(tab);
                animateToTab(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z8) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                animateToTab(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.selectedTab = tab;
        if (tab2 != null && tab2.parent != null) {
            dispatchTabUnselected(tab2);
        }
        if (tab != null) {
            dispatchTabSelected(tab);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.selectedListener;
        if (baseOnTabSelectedListener2 != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener2);
        }
        this.selectedListener = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            addOnTabSelectedListener(baseOnTabSelectedListener);
        }
    }

    public void setScrollPosition(int i8, float f8, boolean z8, boolean z9) {
        setScrollPosition(i8, f8, z8, z9, true);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager, boolean z8) {
        setupWithViewPager(viewPager, z8, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setupWithViewPager(@Nullable ViewPager viewPager, boolean z8, boolean z9) {
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.pageChangeListener;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.adapterChangeListener;
            if (adapterChangeListener != null) {
                this.viewPager.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.currentVpSelectedListener;
        if (baseOnTabSelectedListener != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener);
            this.currentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.viewPager = viewPager;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            this.pageChangeListener.reset();
            viewPager.addOnPageChangeListener(this.pageChangeListener);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.currentVpSelectedListener = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener((BaseOnTabSelectedListener) viewPagerOnTabSelectedListener);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z8);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new AdapterChangeListener();
            }
            this.adapterChangeListener.setAutoRefresh(z8);
            viewPager.addOnAdapterChangeListener(this.adapterChangeListener);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z9;
    }

    public void addTab(@NonNull Tab tab, boolean z8) {
        addTab(tab, this.tabs.size(), z8);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setScrollPosition(int i8, float f8, boolean z8, boolean z9, boolean z10) {
        int round = Math.round(i8 + f8);
        if (round < 0 || round >= this.slidingTabIndicator.getChildCount()) {
            return;
        }
        if (z9) {
            this.slidingTabIndicator.setIndicatorPositionFromTabPosition(i8, f8);
        }
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.scrollAnimator.cancel();
        }
        int calculateScrollXForTab = calculateScrollXForTab(i8, f8);
        int scrollX = getScrollX();
        boolean z11 = (i8 < getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || (i8 > getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || i8 == getSelectedTabPosition();
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z11 = (i8 < getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || (i8 > getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || i8 == getSelectedTabPosition();
        }
        if (z11 || this.viewPagerScrollState == 1 || z10) {
            if (i8 < 0) {
                calculateScrollXForTab = 0;
            }
            scrollTo(calculateScrollXForTab, 0);
        }
        if (z8) {
            setSelectedTabView(round);
        }
    }

    public void addTab(@NonNull Tab tab, int i8, boolean z8) {
        if (tab.parent == this) {
            configureTab(tab, i8);
            addTabView(tab);
            if (z8) {
                tab.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void setTabTextColors(int i8, int i9) {
        setTabTextColors(createColorStateList(i8, i9));
    }

    public void setSelectedTabIndicator(@DrawableRes int i8) {
        if (i8 != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i8));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
