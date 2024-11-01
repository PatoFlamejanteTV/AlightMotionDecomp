package androidx.leanback.widget;

import android.animation.TimeAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.leanback.R;
import androidx.leanback.graphics.ColorOverlayDimmer;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.RowHeaderPresenter;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class FocusHighlightHelper {

    /* loaded from: classes3.dex */
    static class BrowseItemFocusHighlight implements FocusHighlightHandler {
        private static final int DURATION_MS = 150;
        private int mScaleIndex;
        private final boolean mUseDimmer;

        BrowseItemFocusHighlight(int i8, boolean z8) {
            if (FocusHighlightHelper.isValidZoomIndex(i8)) {
                this.mScaleIndex = i8;
                this.mUseDimmer = z8;
                return;
            }
            throw new IllegalArgumentException("Unhandled zoom index");
        }

        private FocusAnimator getOrCreateAnimator(View view) {
            int i8 = R.id.lb_focus_animator;
            FocusAnimator focusAnimator = (FocusAnimator) view.getTag(i8);
            if (focusAnimator == null) {
                FocusAnimator focusAnimator2 = new FocusAnimator(view, getScale(view.getResources()), this.mUseDimmer, 150);
                view.setTag(i8, focusAnimator2);
                return focusAnimator2;
            }
            return focusAnimator;
        }

        private float getScale(Resources resources) {
            int i8 = this.mScaleIndex;
            if (i8 == 0) {
                return 1.0f;
            }
            return resources.getFraction(FocusHighlightHelper.getResId(i8), 1, 1);
        }

        @Override // androidx.leanback.widget.FocusHighlightHandler
        public void onInitializeView(View view) {
            getOrCreateAnimator(view).animateFocus(false, true);
        }

        @Override // androidx.leanback.widget.FocusHighlightHandler
        public void onItemFocused(View view, boolean z8) {
            view.setSelected(z8);
            getOrCreateAnimator(view).animateFocus(z8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class FocusAnimator implements TimeAnimator.TimeListener {
        private final TimeAnimator mAnimator;
        private final ColorOverlayDimmer mDimmer;
        private final int mDuration;
        private float mFocusLevel = 0.0f;
        private float mFocusLevelDelta;
        private float mFocusLevelStart;
        private final Interpolator mInterpolator;
        private final float mScaleDiff;
        private final View mView;
        private final ShadowOverlayContainer mWrapper;

        FocusAnimator(View view, float f8, boolean z8, int i8) {
            TimeAnimator timeAnimator = new TimeAnimator();
            this.mAnimator = timeAnimator;
            this.mInterpolator = new AccelerateDecelerateInterpolator();
            this.mView = view;
            this.mDuration = i8;
            this.mScaleDiff = f8 - 1.0f;
            if (view instanceof ShadowOverlayContainer) {
                this.mWrapper = (ShadowOverlayContainer) view;
            } else {
                this.mWrapper = null;
            }
            timeAnimator.setTimeListener(this);
            if (z8) {
                this.mDimmer = ColorOverlayDimmer.createDefault(view.getContext());
            } else {
                this.mDimmer = null;
            }
        }

        void animateFocus(boolean z8, boolean z9) {
            float f8;
            endAnimation();
            if (z8) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            if (z9) {
                setFocusLevel(f8);
                return;
            }
            float f9 = this.mFocusLevel;
            if (f9 != f8) {
                this.mFocusLevelStart = f9;
                this.mFocusLevelDelta = f8 - f9;
                this.mAnimator.start();
            }
        }

        void endAnimation() {
            this.mAnimator.end();
        }

        float getFocusLevel() {
            return this.mFocusLevel;
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j8, long j9) {
            float f8;
            int i8 = this.mDuration;
            if (j8 >= i8) {
                this.mAnimator.end();
                f8 = 1.0f;
            } else {
                f8 = (float) (j8 / i8);
            }
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null) {
                f8 = interpolator.getInterpolation(f8);
            }
            setFocusLevel(this.mFocusLevelStart + (f8 * this.mFocusLevelDelta));
        }

        void setFocusLevel(float f8) {
            this.mFocusLevel = f8;
            float f9 = (this.mScaleDiff * f8) + 1.0f;
            this.mView.setScaleX(f9);
            this.mView.setScaleY(f9);
            ShadowOverlayContainer shadowOverlayContainer = this.mWrapper;
            if (shadowOverlayContainer != null) {
                shadowOverlayContainer.setShadowFocusLevel(f8);
            } else {
                ShadowOverlayHelper.setNoneWrapperShadowFocusLevel(this.mView, f8);
            }
            ColorOverlayDimmer colorOverlayDimmer = this.mDimmer;
            if (colorOverlayDimmer != null) {
                colorOverlayDimmer.setActiveLevel(f8);
                int color = this.mDimmer.getPaint().getColor();
                ShadowOverlayContainer shadowOverlayContainer2 = this.mWrapper;
                if (shadowOverlayContainer2 != null) {
                    shadowOverlayContainer2.setOverlayColor(color);
                } else {
                    ShadowOverlayHelper.setNoneWrapperOverlayColor(this.mView, color);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class HeaderItemFocusHighlight implements FocusHighlightHandler {
        private int mDuration;
        private boolean mInitialized;
        boolean mScaleEnabled;
        private float mSelectScale;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static class HeaderFocusAnimator extends FocusAnimator {
            ItemBridgeAdapter.ViewHolder mViewHolder;

            HeaderFocusAnimator(View view, float f8, int i8) {
                super(view, f8, false, i8);
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof RecyclerView)) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    this.mViewHolder = (ItemBridgeAdapter.ViewHolder) ((RecyclerView) parent).getChildViewHolder(view);
                }
            }

            @Override // androidx.leanback.widget.FocusHighlightHelper.FocusAnimator
            void setFocusLevel(float f8) {
                Presenter presenter = this.mViewHolder.getPresenter();
                if (presenter instanceof RowHeaderPresenter) {
                    ((RowHeaderPresenter) presenter).setSelectLevel((RowHeaderPresenter.ViewHolder) this.mViewHolder.getViewHolder(), f8);
                }
                super.setFocusLevel(f8);
            }
        }

        HeaderItemFocusHighlight(boolean z8) {
            this.mScaleEnabled = z8;
        }

        private void viewFocused(View view, boolean z8) {
            lazyInit(view);
            view.setSelected(z8);
            int i8 = R.id.lb_focus_animator;
            FocusAnimator focusAnimator = (FocusAnimator) view.getTag(i8);
            if (focusAnimator == null) {
                focusAnimator = new HeaderFocusAnimator(view, this.mSelectScale, this.mDuration);
                view.setTag(i8, focusAnimator);
            }
            focusAnimator.animateFocus(z8, false);
        }

        void lazyInit(View view) {
            if (!this.mInitialized) {
                Resources resources = view.getResources();
                TypedValue typedValue = new TypedValue();
                if (this.mScaleEnabled) {
                    resources.getValue(R.dimen.lb_browse_header_select_scale, typedValue, true);
                    this.mSelectScale = typedValue.getFloat();
                } else {
                    this.mSelectScale = 1.0f;
                }
                resources.getValue(R.dimen.lb_browse_header_select_duration, typedValue, true);
                this.mDuration = typedValue.data;
                this.mInitialized = true;
            }
        }

        @Override // androidx.leanback.widget.FocusHighlightHandler
        public void onInitializeView(View view) {
        }

        @Override // androidx.leanback.widget.FocusHighlightHandler
        public void onItemFocused(View view, boolean z8) {
            viewFocused(view, z8);
        }
    }

    @Deprecated
    public FocusHighlightHelper() {
    }

    static int getResId(int i8) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return 0;
                    }
                    return R.fraction.lb_focus_zoom_factor_xsmall;
                }
                return R.fraction.lb_focus_zoom_factor_large;
            }
            return R.fraction.lb_focus_zoom_factor_medium;
        }
        return R.fraction.lb_focus_zoom_factor_small;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidZoomIndex(int i8) {
        if (i8 != 0 && getResId(i8) <= 0) {
            return false;
        }
        return true;
    }

    public static void setupBrowseItemFocusHighlight(ItemBridgeAdapter itemBridgeAdapter, int i8, boolean z8) {
        itemBridgeAdapter.setFocusHighlight(new BrowseItemFocusHighlight(i8, z8));
    }

    @Deprecated
    public static void setupHeaderItemFocusHighlight(VerticalGridView verticalGridView) {
        setupHeaderItemFocusHighlight(verticalGridView, true);
    }

    @Deprecated
    public static void setupHeaderItemFocusHighlight(VerticalGridView verticalGridView, boolean z8) {
        if (verticalGridView == null || !(verticalGridView.getAdapter() instanceof ItemBridgeAdapter)) {
            return;
        }
        ((ItemBridgeAdapter) verticalGridView.getAdapter()).setFocusHighlight(new HeaderItemFocusHighlight(z8));
    }

    public static void setupHeaderItemFocusHighlight(ItemBridgeAdapter itemBridgeAdapter) {
        setupHeaderItemFocusHighlight(itemBridgeAdapter, true);
    }

    public static void setupHeaderItemFocusHighlight(ItemBridgeAdapter itemBridgeAdapter, boolean z8) {
        itemBridgeAdapter.setFocusHighlight(new HeaderItemFocusHighlight(z8));
    }
}
