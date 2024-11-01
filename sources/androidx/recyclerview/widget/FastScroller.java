package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes3.dex */
public class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    private static final int ANIMATION_STATE_FADING_IN = 1;
    private static final int ANIMATION_STATE_FADING_OUT = 3;
    private static final int ANIMATION_STATE_IN = 2;
    private static final int ANIMATION_STATE_OUT = 0;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_X = 1;
    private static final int DRAG_Y = 2;
    private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
    private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
    private static final int HIDE_DURATION_MS = 500;
    private static final int SCROLLBAR_FULL_OPAQUE = 255;
    private static final int SHOW_DURATION_MS = 500;
    private static final int STATE_DRAGGING = 2;
    private static final int STATE_HIDDEN = 0;
    private static final int STATE_VISIBLE = 1;
    int mAnimationState;
    private final Runnable mHideRunnable;

    @VisibleForTesting
    float mHorizontalDragX;

    @VisibleForTesting
    int mHorizontalThumbCenterX;
    private final StateListDrawable mHorizontalThumbDrawable;
    private final int mHorizontalThumbHeight;

    @VisibleForTesting
    int mHorizontalThumbWidth;
    private final Drawable mHorizontalTrackDrawable;
    private final int mHorizontalTrackHeight;
    private final int mMargin;
    private final RecyclerView.OnScrollListener mOnScrollListener;
    private RecyclerView mRecyclerView;
    private final int mScrollbarMinimumRange;
    final ValueAnimator mShowHideAnimator;

    @VisibleForTesting
    float mVerticalDragY;

    @VisibleForTesting
    int mVerticalThumbCenterY;
    final StateListDrawable mVerticalThumbDrawable;

    @VisibleForTesting
    int mVerticalThumbHeight;
    private final int mVerticalThumbWidth;
    final Drawable mVerticalTrackDrawable;
    private final int mVerticalTrackWidth;
    private static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    private static final int[] EMPTY_STATE_SET = new int[0];
    private int mRecyclerViewWidth = 0;
    private int mRecyclerViewHeight = 0;
    private boolean mNeedVerticalScrollbar = false;
    private boolean mNeedHorizontalScrollbar = false;
    private int mState = 0;
    private int mDragState = 0;
    private final int[] mVerticalRange = new int[2];
    private final int[] mHorizontalRange = new int[2];

    /* loaded from: classes3.dex */
    private class AnimatorListener extends AnimatorListenerAdapter {
        private boolean mCanceled = false;

        AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mCanceled) {
                this.mCanceled = false;
                return;
            }
            if (((Float) FastScroller.this.mShowHideAnimator.getAnimatedValue()).floatValue() == 0.0f) {
                FastScroller fastScroller = FastScroller.this;
                fastScroller.mAnimationState = 0;
                fastScroller.setState(0);
            } else {
                FastScroller fastScroller2 = FastScroller.this;
                fastScroller2.mAnimationState = 2;
                fastScroller2.requestRedraw();
            }
        }
    }

    /* loaded from: classes3.dex */
    private class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller.this.mVerticalThumbDrawable.setAlpha(floatValue);
            FastScroller.this.mVerticalTrackDrawable.setAlpha(floatValue);
            FastScroller.this.requestRedraw();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i8, int i9, int i10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mShowHideAnimator = ofFloat;
        this.mAnimationState = 0;
        this.mHideRunnable = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public void run() {
                FastScroller.this.hide(500);
            }
        };
        this.mOnScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i11, int i12) {
                FastScroller.this.updateScrollPosition(recyclerView2.computeHorizontalScrollOffset(), recyclerView2.computeVerticalScrollOffset());
            }
        };
        this.mVerticalThumbDrawable = stateListDrawable;
        this.mVerticalTrackDrawable = drawable;
        this.mHorizontalThumbDrawable = stateListDrawable2;
        this.mHorizontalTrackDrawable = drawable2;
        this.mVerticalThumbWidth = Math.max(i8, stateListDrawable.getIntrinsicWidth());
        this.mVerticalTrackWidth = Math.max(i8, drawable.getIntrinsicWidth());
        this.mHorizontalThumbHeight = Math.max(i8, stateListDrawable2.getIntrinsicWidth());
        this.mHorizontalTrackHeight = Math.max(i8, drawable2.getIntrinsicWidth());
        this.mScrollbarMinimumRange = i9;
        this.mMargin = i10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnimatorListener());
        ofFloat.addUpdateListener(new AnimatorUpdater());
        attachToRecyclerView(recyclerView);
    }

    private void cancelHide() {
        this.mRecyclerView.removeCallbacks(this.mHideRunnable);
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this);
        this.mRecyclerView.removeOnScrollListener(this.mOnScrollListener);
        cancelHide();
    }

    private void drawHorizontalScrollbar(Canvas canvas) {
        int i8 = this.mRecyclerViewHeight;
        int i9 = this.mHorizontalThumbHeight;
        int i10 = this.mHorizontalThumbCenterX;
        int i11 = this.mHorizontalThumbWidth;
        this.mHorizontalThumbDrawable.setBounds(0, 0, i11, i9);
        this.mHorizontalTrackDrawable.setBounds(0, 0, this.mRecyclerViewWidth, this.mHorizontalTrackHeight);
        canvas.translate(0.0f, i8 - i9);
        this.mHorizontalTrackDrawable.draw(canvas);
        canvas.translate(i10 - (i11 / 2), 0.0f);
        this.mHorizontalThumbDrawable.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void drawVerticalScrollbar(Canvas canvas) {
        int i8 = this.mRecyclerViewWidth;
        int i9 = this.mVerticalThumbWidth;
        int i10 = i8 - i9;
        int i11 = this.mVerticalThumbCenterY;
        int i12 = this.mVerticalThumbHeight;
        int i13 = i11 - (i12 / 2);
        this.mVerticalThumbDrawable.setBounds(0, 0, i9, i12);
        this.mVerticalTrackDrawable.setBounds(0, 0, this.mVerticalTrackWidth, this.mRecyclerViewHeight);
        if (isLayoutRTL()) {
            this.mVerticalTrackDrawable.draw(canvas);
            canvas.translate(this.mVerticalThumbWidth, i13);
            canvas.scale(-1.0f, 1.0f);
            this.mVerticalThumbDrawable.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.mVerticalThumbWidth, -i13);
            return;
        }
        canvas.translate(i10, 0.0f);
        this.mVerticalTrackDrawable.draw(canvas);
        canvas.translate(0.0f, i13);
        this.mVerticalThumbDrawable.draw(canvas);
        canvas.translate(-i10, -i13);
    }

    private int[] getHorizontalRange() {
        int[] iArr = this.mHorizontalRange;
        int i8 = this.mMargin;
        iArr[0] = i8;
        iArr[1] = this.mRecyclerViewWidth - i8;
        return iArr;
    }

    private int[] getVerticalRange() {
        int[] iArr = this.mVerticalRange;
        int i8 = this.mMargin;
        iArr[0] = i8;
        iArr[1] = this.mRecyclerViewHeight - i8;
        return iArr;
    }

    private void horizontalScrollTo(float f8) {
        int[] horizontalRange = getHorizontalRange();
        float max = Math.max(horizontalRange[0], Math.min(horizontalRange[1], f8));
        if (Math.abs(this.mHorizontalThumbCenterX - max) < 2.0f) {
            return;
        }
        int scrollTo = scrollTo(this.mHorizontalDragX, max, horizontalRange, this.mRecyclerView.computeHorizontalScrollRange(), this.mRecyclerView.computeHorizontalScrollOffset(), this.mRecyclerViewWidth);
        if (scrollTo != 0) {
            this.mRecyclerView.scrollBy(scrollTo, 0);
        }
        this.mHorizontalDragX = max;
    }

    private boolean isLayoutRTL() {
        if (ViewCompat.getLayoutDirection(this.mRecyclerView) == 1) {
            return true;
        }
        return false;
    }

    private void resetHideDelay(int i8) {
        cancelHide();
        this.mRecyclerView.postDelayed(this.mHideRunnable, i8);
    }

    private int scrollTo(float f8, float f9, int[] iArr, int i8, int i9, int i10) {
        int i11 = iArr[1] - iArr[0];
        if (i11 == 0) {
            return 0;
        }
        int i12 = i8 - i10;
        int i13 = (int) (((f9 - f8) / i11) * i12);
        int i14 = i9 + i13;
        if (i14 >= i12 || i14 < 0) {
            return 0;
        }
        return i13;
    }

    private void setupCallbacks() {
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this);
        this.mRecyclerView.addOnScrollListener(this.mOnScrollListener);
    }

    private void verticalScrollTo(float f8) {
        int[] verticalRange = getVerticalRange();
        float max = Math.max(verticalRange[0], Math.min(verticalRange[1], f8));
        if (Math.abs(this.mVerticalThumbCenterY - max) < 2.0f) {
            return;
        }
        int scrollTo = scrollTo(this.mVerticalDragY, max, verticalRange, this.mRecyclerView.computeVerticalScrollRange(), this.mRecyclerView.computeVerticalScrollOffset(), this.mRecyclerViewHeight);
        if (scrollTo != 0) {
            this.mRecyclerView.scrollBy(0, scrollTo);
        }
        this.mVerticalDragY = max;
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
        }
    }

    @VisibleForTesting
    Drawable getHorizontalThumbDrawable() {
        return this.mHorizontalThumbDrawable;
    }

    @VisibleForTesting
    Drawable getHorizontalTrackDrawable() {
        return this.mHorizontalTrackDrawable;
    }

    @VisibleForTesting
    Drawable getVerticalThumbDrawable() {
        return this.mVerticalThumbDrawable;
    }

    @VisibleForTesting
    Drawable getVerticalTrackDrawable() {
        return this.mVerticalTrackDrawable;
    }

    @VisibleForTesting
    void hide(int i8) {
        int i9 = this.mAnimationState;
        if (i9 != 1) {
            if (i9 != 2) {
                return;
            }
        } else {
            this.mShowHideAnimator.cancel();
        }
        this.mAnimationState = 3;
        ValueAnimator valueAnimator = this.mShowHideAnimator;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.mShowHideAnimator.setDuration(i8);
        this.mShowHideAnimator.start();
    }

    public boolean isDragging() {
        if (this.mState == 2) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    boolean isPointInsideHorizontalThumb(float f8, float f9) {
        if (f9 >= this.mRecyclerViewHeight - this.mHorizontalThumbHeight) {
            int i8 = this.mHorizontalThumbCenterX;
            int i9 = this.mHorizontalThumbWidth;
            if (f8 >= i8 - (i9 / 2) && f8 <= i8 + (i9 / 2)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    boolean isPointInsideVerticalThumb(float f8, float f9) {
        if (!isLayoutRTL() ? f8 >= this.mRecyclerViewWidth - this.mVerticalThumbWidth : f8 <= this.mVerticalThumbWidth) {
            int i8 = this.mVerticalThumbCenterY;
            int i9 = this.mVerticalThumbHeight;
            if (f9 >= i8 - (i9 / 2) && f9 <= i8 + (i9 / 2)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    boolean isVisible() {
        if (this.mState == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.mRecyclerViewWidth == this.mRecyclerView.getWidth() && this.mRecyclerViewHeight == this.mRecyclerView.getHeight()) {
            if (this.mAnimationState != 0) {
                if (this.mNeedVerticalScrollbar) {
                    drawVerticalScrollbar(canvas);
                }
                if (this.mNeedHorizontalScrollbar) {
                    drawHorizontalScrollbar(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.mRecyclerViewWidth = this.mRecyclerView.getWidth();
        this.mRecyclerViewHeight = this.mRecyclerView.getHeight();
        setState(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i8 = this.mState;
        if (i8 == 1) {
            boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
            boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!isPointInsideVerticalThumb && !isPointInsideHorizontalThumb) {
                return false;
            }
            if (isPointInsideHorizontalThumb) {
                this.mDragState = 1;
                this.mHorizontalDragX = (int) motionEvent.getX();
            } else if (isPointInsideVerticalThumb) {
                this.mDragState = 2;
                this.mVerticalDragY = (int) motionEvent.getY();
            }
            setState(2);
        } else if (i8 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z8) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.mState == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
            boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
            if (isPointInsideVerticalThumb || isPointInsideHorizontalThumb) {
                if (isPointInsideHorizontalThumb) {
                    this.mDragState = 1;
                    this.mHorizontalDragX = (int) motionEvent.getX();
                } else if (isPointInsideVerticalThumb) {
                    this.mDragState = 2;
                    this.mVerticalDragY = (int) motionEvent.getY();
                }
                setState(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.mState == 2) {
            this.mVerticalDragY = 0.0f;
            this.mHorizontalDragX = 0.0f;
            setState(1);
            this.mDragState = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.mState == 2) {
            show();
            if (this.mDragState == 1) {
                horizontalScrollTo(motionEvent.getX());
            }
            if (this.mDragState == 2) {
                verticalScrollTo(motionEvent.getY());
            }
        }
    }

    void requestRedraw() {
        this.mRecyclerView.invalidate();
    }

    void setState(int i8) {
        if (i8 == 2 && this.mState != 2) {
            this.mVerticalThumbDrawable.setState(PRESSED_STATE_SET);
            cancelHide();
        }
        if (i8 == 0) {
            requestRedraw();
        } else {
            show();
        }
        if (this.mState == 2 && i8 != 2) {
            this.mVerticalThumbDrawable.setState(EMPTY_STATE_SET);
            resetHideDelay(HIDE_DELAY_AFTER_DRAGGING_MS);
        } else if (i8 == 1) {
            resetHideDelay(HIDE_DELAY_AFTER_VISIBLE_MS);
        }
        this.mState = i8;
    }

    public void show() {
        int i8 = this.mAnimationState;
        if (i8 != 0) {
            if (i8 == 3) {
                this.mShowHideAnimator.cancel();
            } else {
                return;
            }
        }
        this.mAnimationState = 1;
        ValueAnimator valueAnimator = this.mShowHideAnimator;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.mShowHideAnimator.setDuration(500L);
        this.mShowHideAnimator.setStartDelay(0L);
        this.mShowHideAnimator.start();
    }

    void updateScrollPosition(int i8, int i9) {
        boolean z8;
        boolean z9;
        int computeVerticalScrollRange = this.mRecyclerView.computeVerticalScrollRange();
        int i10 = this.mRecyclerViewHeight;
        if (computeVerticalScrollRange - i10 > 0 && i10 >= this.mScrollbarMinimumRange) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mNeedVerticalScrollbar = z8;
        int computeHorizontalScrollRange = this.mRecyclerView.computeHorizontalScrollRange();
        int i11 = this.mRecyclerViewWidth;
        if (computeHorizontalScrollRange - i11 > 0 && i11 >= this.mScrollbarMinimumRange) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mNeedHorizontalScrollbar = z9;
        boolean z10 = this.mNeedVerticalScrollbar;
        if (!z10 && !z9) {
            if (this.mState != 0) {
                setState(0);
                return;
            }
            return;
        }
        if (z10) {
            float f8 = i10;
            this.mVerticalThumbCenterY = (int) ((f8 * (i9 + (f8 / 2.0f))) / computeVerticalScrollRange);
            this.mVerticalThumbHeight = Math.min(i10, (i10 * i10) / computeVerticalScrollRange);
        }
        if (this.mNeedHorizontalScrollbar) {
            float f9 = i11;
            this.mHorizontalThumbCenterX = (int) ((f9 * (i8 + (f9 / 2.0f))) / computeHorizontalScrollRange);
            this.mHorizontalThumbWidth = Math.min(i11, (i11 * i11) / computeHorizontalScrollRange);
        }
        int i12 = this.mState;
        if (i12 == 0 || i12 == 1) {
            setState(1);
        }
    }
}
