package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements Carousel, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;

    @NonNull
    private CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;

    @Nullable
    private KeylineState currentKeylineState;
    private final DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;

    @Nullable
    private KeylineStateList keylineStateList;

    @Nullable
    private Map<Integer, KeylineState> keylineStatePositionMap;
    private int lastItemCount;

    @VisibleForTesting
    int maxScroll;

    @VisibleForTesting
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    private final View.OnLayoutChangeListener recyclerViewSizeChangeListener;

    @VisibleForTesting
    int scrollOffset;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class ChildCalculations {
        final float center;
        final View child;
        final float offsetCenter;
        final KeylineRange range;

        ChildCalculations(View view, float f8, float f9, KeylineRange keylineRange) {
            this.child = view;
            this.center = f8;
            this.offsetCenter = f9;
            this.range = keylineRange;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class DebugItemDecoration extends RecyclerView.ItemDecoration {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = DesugarCollections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(ColorUtils.blendARGB(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }

        void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = DesugarCollections.unmodifiableList(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class KeylineRange {
        final KeylineState.Keyline leftOrTop;
        final KeylineState.Keyline rightOrBottom;

        KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            boolean z8;
            if (keyline.loc <= keyline2.loc) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkArgument(z8);
            this.leftOrTop = keyline;
            this.rightOrBottom = keyline2;
        }
    }

    /* loaded from: classes3.dex */
    private static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private void addAndLayoutView(View view, int i8, ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i8);
        float f8 = childCalculations.offsetCenter;
        this.orientationHelper.layoutDecoratedWithMargins(view, (int) (f8 - itemSize), (int) (f8 + itemSize));
        updateChildMaskForLocation(view, childCalculations.center, childCalculations.range);
    }

    private float addEnd(float f8, float f9) {
        if (isLayoutRtl()) {
            return f8 - f9;
        }
        return f8 + f9;
    }

    private float addStart(float f8, float f9) {
        if (isLayoutRtl()) {
            return f8 + f9;
        }
        return f8 - f9;
    }

    private void addViewAtPosition(@NonNull RecyclerView.Recycler recycler, int i8, int i9) {
        if (i8 >= 0 && i8 < getItemCount()) {
            ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill(i8), i8);
            addAndLayoutView(makeChildCalculations.child, i9, makeChildCalculations);
        }
    }

    private void addViewsEnd(RecyclerView.Recycler recycler, RecyclerView.State state, int i8) {
        float calculateChildStartForFill = calculateChildStartForFill(i8);
        while (i8 < state.getItemCount()) {
            ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill, i8);
            if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                calculateChildStartForFill = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                    addAndLayoutView(makeChildCalculations.child, -1, makeChildCalculations);
                }
                i8++;
            } else {
                return;
            }
        }
    }

    private void addViewsStart(RecyclerView.Recycler recycler, int i8) {
        float calculateChildStartForFill = calculateChildStartForFill(i8);
        while (i8 >= 0) {
            ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill, i8);
            if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                calculateChildStartForFill = addStart(calculateChildStartForFill, this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                    addAndLayoutView(makeChildCalculations.child, 0, makeChildCalculations);
                }
                i8--;
            } else {
                return;
            }
        }
    }

    private float calculateChildOffsetCenterForLocation(View view, float f8, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f9 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float lerp = AnimationUtils.lerp(f9, keyline2.locOffset, keyline.loc, keyline2.loc, f8);
        if (keylineRange.rightOrBottom == this.currentKeylineState.getFirstKeyline() || keylineRange.leftOrTop == this.currentKeylineState.getLastKeyline()) {
            float maskMargins = this.orientationHelper.getMaskMargins((RecyclerView.LayoutParams) view.getLayoutParams()) / this.currentKeylineState.getItemSize();
            KeylineState.Keyline keyline3 = keylineRange.rightOrBottom;
            return lerp + ((f8 - keyline3.loc) * ((1.0f - keyline3.mask) + maskMargins));
        }
        return lerp;
    }

    private float calculateChildStartForFill(int i8) {
        return addEnd(getParentStart() - this.scrollOffset, this.currentKeylineState.getItemSize() * i8);
    }

    private int calculateEndScroll(RecyclerView.State state, KeylineStateList keylineStateList) {
        KeylineState endState;
        KeylineState.Keyline lastFocalKeyline;
        float f8;
        float f9;
        boolean isLayoutRtl = isLayoutRtl();
        if (isLayoutRtl) {
            endState = keylineStateList.getStartState();
        } else {
            endState = keylineStateList.getEndState();
        }
        if (isLayoutRtl) {
            lastFocalKeyline = endState.getFirstFocalKeyline();
        } else {
            lastFocalKeyline = endState.getLastFocalKeyline();
        }
        float itemCount = (state.getItemCount() - 1) * endState.getItemSize();
        if (isLayoutRtl) {
            f8 = -1.0f;
        } else {
            f8 = 1.0f;
        }
        float f10 = itemCount * f8;
        if (isLayoutRtl) {
            f9 = -lastFocalKeyline.leftOrTopPaddingShift;
        } else {
            f9 = lastFocalKeyline.rightOrBottomPaddingShift;
        }
        int parentStart = (int) ((f10 - (lastFocalKeyline.loc - getParentStart())) + (getParentEnd() - lastFocalKeyline.loc) + f9);
        if (isLayoutRtl) {
            return Math.min(0, parentStart);
        }
        return Math.max(0, parentStart);
    }

    private static int calculateShouldScrollBy(int i8, int i9, int i10, int i11) {
        int i12 = i9 + i8;
        return i12 < i10 ? i10 - i9 : i12 > i11 ? i11 - i9 : i8;
    }

    private int calculateStartScroll(@NonNull KeylineStateList keylineStateList) {
        KeylineState startState;
        KeylineState.Keyline firstFocalKeyline;
        boolean isLayoutRtl = isLayoutRtl();
        if (isLayoutRtl) {
            startState = keylineStateList.getEndState();
        } else {
            startState = keylineStateList.getStartState();
        }
        if (isLayoutRtl) {
            firstFocalKeyline = startState.getLastFocalKeyline();
        } else {
            firstFocalKeyline = startState.getFirstFocalKeyline();
        }
        return (int) (getParentStart() - addStart(firstFocalKeyline.loc, startState.getItemSize() / 2.0f));
    }

    private int convertFocusDirectionToLayoutDirection(int i8) {
        int orientation = getOrientation();
        if (i8 == 1) {
            return -1;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 != 130) {
                        Log.d(TAG, "Unknown focus request:" + i8);
                        return Integer.MIN_VALUE;
                    }
                    if (orientation == 1) {
                        return 1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (orientation != 0) {
                    return Integer.MIN_VALUE;
                }
                if (isLayoutRtl()) {
                    return -1;
                }
                return 1;
            }
            if (orientation == 1) {
                return -1;
            }
            return Integer.MIN_VALUE;
        }
        if (orientation != 0) {
            return Integer.MIN_VALUE;
        }
        if (!isLayoutRtl()) {
            return -1;
        }
        return 1;
    }

    private void fill(RecyclerView.Recycler recycler, RecyclerView.State state) {
        removeAndRecycleOutOfBoundsViews(recycler);
        if (getChildCount() == 0) {
            addViewsStart(recycler, this.currentFillStartPosition - 1);
            addViewsEnd(recycler, state, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(recycler, position - 1);
            addViewsEnd(recycler, state, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private View getChildClosestToEnd() {
        int childCount;
        if (isLayoutRtl()) {
            childCount = 0;
        } else {
            childCount = getChildCount() - 1;
        }
        return getChildAt(childCount);
    }

    private View getChildClosestToStart() {
        int i8;
        if (isLayoutRtl()) {
            i8 = getChildCount() - 1;
        } else {
            i8 = 0;
        }
        return getChildAt(i8);
    }

    private int getContainerSize() {
        if (isHorizontal()) {
            return getContainerWidth();
        }
        return getContainerHeight();
    }

    private float getDecoratedCenterWithMargins(View view) {
        int centerY;
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        if (isHorizontal()) {
            centerY = rect.centerX();
        } else {
            centerY = rect.centerY();
        }
        return centerY;
    }

    private int getItemMargins() {
        int i8;
        int i9;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i9 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i9 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i8 + i9;
    }

    private KeylineState getKeylineStateForPosition(int i8) {
        KeylineState keylineState;
        Map<Integer, KeylineState> map = this.keylineStatePositionMap;
        if (map != null && (keylineState = map.get(Integer.valueOf(MathUtils.clamp(i8, 0, Math.max(0, getItemCount() - 1))))) != null) {
            return keylineState;
        }
        return this.keylineStateList.getDefaultState();
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (!getClipToPadding() && this.carouselStrategy.isContained()) {
            if (getOrientation() == 1) {
                return getPaddingTop();
            }
            return getPaddingLeft();
        }
        return 0;
    }

    private float getMaskedItemSizeForLocOffset(float f8, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f9 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        return AnimationUtils.lerp(f9, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    private int getParentEnd() {
        return this.orientationHelper.getParentEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (!getClipToPadding() && this.carouselStrategy.isContained()) {
            if (getOrientation() == 1) {
                return getPaddingBottom();
            }
            return getPaddingRight();
        }
        return 0;
    }

    private int getScrollOffsetForPosition(int i8, KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (i8 * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) (((i8 * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc) + (keylineState.getItemSize() / 2.0f));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int i8, @NonNull KeylineState keylineState) {
        int i9;
        int i10 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float itemSize = (i8 * keylineState.getItemSize()) + (keylineState.getItemSize() / 2.0f);
            if (isLayoutRtl()) {
                i9 = (int) ((getContainerSize() - keyline.loc) - itemSize);
            } else {
                i9 = (int) (itemSize - keyline.loc);
            }
            int i11 = i9 - this.scrollOffset;
            if (Math.abs(i10) > Math.abs(i11)) {
                i10 = i11;
            }
        }
        return i10;
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f8, boolean z8) {
        float f9;
        float f10 = Float.MAX_VALUE;
        float f11 = Float.MAX_VALUE;
        float f12 = Float.MAX_VALUE;
        float f13 = -3.4028235E38f;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            KeylineState.Keyline keyline = list.get(i12);
            if (z8) {
                f9 = keyline.locOffset;
            } else {
                f9 = keyline.loc;
            }
            float abs = Math.abs(f9 - f8);
            if (f9 <= f8 && abs <= f10) {
                i8 = i12;
                f10 = abs;
            }
            if (f9 > f8 && abs <= f11) {
                i10 = i12;
                f11 = abs;
            }
            if (f9 <= f12) {
                i9 = i12;
                f12 = f9;
            }
            if (f9 > f13) {
                i11 = i12;
                f13 = f9;
            }
        }
        if (i8 == -1) {
            i8 = i9;
        }
        if (i10 == -1) {
            i10 = i11;
        }
        return new KeylineRange(list.get(i8), list.get(i10));
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f8, KeylineRange keylineRange) {
        float addStart = addStart(f8, getMaskedItemSizeForLocOffset(f8, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            if (addStart >= 0.0f) {
                return false;
            }
        } else if (addStart <= getContainerSize()) {
            return false;
        }
        return true;
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f8, KeylineRange keylineRange) {
        float addEnd = addEnd(f8, getMaskedItemSizeForLocOffset(f8, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            if (addEnd <= getContainerSize()) {
                return false;
            }
        } else if (addEnd >= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i8 != i12 || i9 != i13 || i10 != i14 || i11 != i15) {
            view.post(new Runnable() { // from class: com.google.android.material.carousel.a
                @Override // java.lang.Runnable
                public final void run() {
                    CarouselLayoutManager.this.refreshKeylineState();
                }
            });
        }
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "internal representation of views on the screen");
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                Log.d(TAG, "item position " + getPosition(childAt) + ", center:" + getDecoratedCenterWithMargins(childAt) + ", child index:" + i8);
            }
            Log.d(TAG, "==============");
        }
    }

    private ChildCalculations makeChildCalculations(RecyclerView.Recycler recycler, float f8, int i8) {
        View viewForPosition = recycler.getViewForPosition(i8);
        measureChildWithMargins(viewForPosition, 0, 0);
        float addEnd = addEnd(f8, this.currentKeylineState.getItemSize() / 2.0f);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        return new ChildCalculations(viewForPosition, addEnd, calculateChildOffsetCenterForLocation(viewForPosition, addEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private float offsetChild(View view, float f8, float f9, Rect rect) {
        float addEnd = addEnd(f8, f9);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, addEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, addEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view, rect, f9, calculateChildOffsetCenterForLocation);
        return calculateChildOffsetCenterForLocation;
    }

    private void recalculateKeylineStateList(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        KeylineState onFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, viewForPosition);
        if (isLayoutRtl()) {
            onFirstChildMeasuredWithMargins = KeylineState.reverse(onFirstChildMeasuredWithMargins, getContainerSize());
        }
        this.keylineStateList = KeylineStateList.from(this, onFirstChildMeasuredWithMargins, getItemMargins(), getLeftOrTopPaddingForKeylineShift(), getRightOrBottomPaddingForKeylineShift());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterWithMargins = getDecoratedCenterWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterWithMargins2 = getDecoratedCenterWithMargins(childAt2);
            if (isLocOffsetOutOfFillBoundsEnd(decoratedCenterWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins2, true))) {
                removeAndRecycleView(childAt2, recycler);
            } else {
                return;
            }
        }
    }

    private void scrollBy(RecyclerView recyclerView, int i8) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i8, 0);
        } else {
            recyclerView.scrollBy(0, i8);
        }
    }

    private void setCarouselAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            setCarouselAlignment(obtainStyledAttributes.getInt(R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(View view, float f8, KeylineRange keylineRange) {
        if (!(view instanceof Maskable)) {
            return;
        }
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f9 = keyline.mask;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float lerp = AnimationUtils.lerp(f9, keyline2.mask, keyline.loc, keyline2.loc, f8);
        float height = view.getHeight();
        float width = view.getWidth();
        RectF maskRect = this.orientationHelper.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, lerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, lerp));
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, f8, keylineRange);
        RectF rectF = new RectF(calculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), calculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), calculateChildOffsetCenterForLocation + (maskRect.width() / 2.0f), (maskRect.height() / 2.0f) + calculateChildOffsetCenterForLocation);
        RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
        if (this.carouselStrategy.isContained()) {
            this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
        }
        this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
        ((Maskable) view).setMaskRectF(maskRect);
    }

    private void updateCurrentKeylineStateForScrollOffset(@NonNull KeylineStateList keylineStateList) {
        KeylineState startState;
        int i8 = this.maxScroll;
        int i9 = this.minScroll;
        if (i8 <= i9) {
            if (isLayoutRtl()) {
                startState = keylineStateList.getEndState();
            } else {
                startState = keylineStateList.getStartState();
            }
            this.currentKeylineState = startState;
        } else {
            this.currentKeylineState = keylineStateList.getShiftedState(this.scrollOffset, i9, i8);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private void updateItemCount() {
        int itemCount = getItemCount();
        int i8 = this.lastItemCount;
        if (itemCount != i8 && this.keylineStateList != null) {
            if (this.carouselStrategy.shouldRefreshKeylineState(this, i8)) {
                refreshKeylineState();
            }
            this.lastItemCount = itemCount;
        }
    }

    private void validateChildOrderIfDebugging() {
        if (this.isDebuggingEnabled && getChildCount() >= 1) {
            int i8 = 0;
            while (i8 < getChildCount() - 1) {
                int position = getPosition(getChildAt(i8));
                int i9 = i8 + 1;
                int position2 = getPosition(getChildAt(i9));
                if (position <= position2) {
                    i8 = i9;
                } else {
                    logChildrenIfDebugging();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i8 + "] had adapter position [" + position + "] and child at index [" + i9 + "] had adapter position [" + position2 + "].");
                }
            }
        }
    }

    int calculateScrollDeltaToMakePositionVisible(int i8) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i8, getKeylineStateForPosition(i8)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() != 0 && this.keylineStateList != null && getItemCount() > 1) {
            return (int) (getWidth() * (this.keylineStateList.getDefaultState().getItemSize() / computeHorizontalScrollRange(state)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int i8) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i8, getKeylineStateForPosition(i8));
        if (isHorizontal()) {
            return new PointF(offsetToScrollToPosition, 0.0f);
        }
        return new PointF(0.0f, offsetToScrollToPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() != 0 && this.keylineStateList != null && getItemCount() > 1) {
            return (int) (getHeight() * (this.keylineStateList.getDefaultState().getItemSize() / computeVerticalScrollRange(state)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        float f8;
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerY = rect.centerY();
        if (isHorizontal()) {
            centerY = rect.centerX();
        }
        float maskedItemSizeForLocOffset = getMaskedItemSizeForLocOffset(centerY, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), centerY, true));
        float f9 = 0.0f;
        if (isHorizontal()) {
            f8 = (rect.width() - maskedItemSizeForLocOffset) / 2.0f;
        } else {
            f8 = 0.0f;
        }
        if (!isHorizontal()) {
            f9 = (rect.height() - maskedItemSizeForLocOffset) / 2.0f;
        }
        rect.set((int) (rect.left + f8), (int) (rect.top + f9), (int) (rect.right - f8), (int) (rect.bottom - f9));
    }

    int getOffsetToScrollToPosition(int i8, @NonNull KeylineState keylineState) {
        return getScrollOffsetForPosition(i8, keylineState) - this.scrollOffset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getOffsetToScrollToPositionForSnap(int i8, boolean z8) {
        int i9;
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i8, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        if (this.keylineStatePositionMap != null) {
            i9 = getOffsetToScrollToPosition(i8, getKeylineStateForPosition(i8));
        } else {
            i9 = offsetToScrollToPosition;
        }
        if (z8 && Math.abs(i9) < Math.abs(offsetToScrollToPosition)) {
            return i9;
        }
        return offsetToScrollToPosition;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        if (this.orientationHelper.orientation == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isLayoutRtl() {
        if (isHorizontal() && getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i8, int i9) {
        float f8;
        float f9;
        if (view instanceof Maskable) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            Rect rect = new Rect();
            calculateItemDecorationsForChild(view, rect);
            int i10 = i8 + rect.left + rect.right;
            int i11 = i9 + rect.top + rect.bottom;
            KeylineStateList keylineStateList = this.keylineStateList;
            if (keylineStateList != null && this.orientationHelper.orientation == 0) {
                f8 = keylineStateList.getDefaultState().getItemSize();
            } else {
                f8 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            }
            KeylineStateList keylineStateList2 = this.keylineStateList;
            if (keylineStateList2 != null && this.orientationHelper.orientation == 1) {
                f9 = keylineStateList2.getDefaultState().getItemSize();
            } else {
                f9 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            }
            view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i10, (int) f8, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i11, (int) f9, canScrollVertically()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.carouselStrategy.initialize(recyclerView.getContext());
        refreshKeylineState();
        recyclerView.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(@NonNull View view, int i8, @NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i8)) == Integer.MIN_VALUE) {
            return null;
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            addViewAtPosition(recycler, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        addViewAtPosition(recycler, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i8, int i9) {
        super.onItemsAdded(recyclerView, i8, i9);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i8, int i9) {
        super.onItemsRemoved(recyclerView, i8, i9);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z8;
        int i8;
        if (state.getItemCount() > 0 && getContainerSize() > 0.0f) {
            boolean isLayoutRtl = isLayoutRtl();
            if (this.keylineStateList == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                recalculateKeylineStateList(recycler);
            }
            int calculateStartScroll = calculateStartScroll(this.keylineStateList);
            int calculateEndScroll = calculateEndScroll(state, this.keylineStateList);
            if (isLayoutRtl) {
                i8 = calculateEndScroll;
            } else {
                i8 = calculateStartScroll;
            }
            this.minScroll = i8;
            if (isLayoutRtl) {
                calculateEndScroll = calculateStartScroll;
            }
            this.maxScroll = calculateEndScroll;
            if (z8) {
                this.scrollOffset = calculateStartScroll;
                this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
                int i9 = this.currentEstimatedPosition;
                if (i9 != -1) {
                    this.scrollOffset = getScrollOffsetForPosition(i9, getKeylineStateForPosition(i9));
                }
            }
            int i10 = this.scrollOffset;
            this.scrollOffset = i10 + calculateShouldScrollBy(0, i10, this.minScroll, this.maxScroll);
            this.currentFillStartPosition = MathUtils.clamp(this.currentFillStartPosition, 0, state.getItemCount());
            updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
            detachAndScrapAttachedViews(recycler);
            fill(recycler, state);
            this.lastItemCount = getItemCount();
            return;
        }
        removeAndRecycleAllViews(recycler);
        this.currentFillStartPosition = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z8, boolean z9) {
        int smallestScrollOffsetToFocalKeyline;
        if (this.keylineStateList == null || (smallestScrollOffsetToFocalKeyline = getSmallestScrollOffsetToFocalKeyline(getPosition(view), getKeylineStateForPosition(getPosition(view)))) == 0) {
            return false;
        }
        scrollBy(recyclerView, getSmallestScrollOffsetToFocalKeyline(getPosition(view), this.keylineStateList.getShiftedState(this.scrollOffset + calculateShouldScrollBy(smallestScrollOffsetToFocalKeyline, this.scrollOffset, this.minScroll, this.maxScroll), this.minScroll, this.maxScroll)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i8, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i8, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i8) {
        this.currentEstimatedPosition = i8;
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i8, getKeylineStateForPosition(i8));
        this.currentFillStartPosition = MathUtils.clamp(i8, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i8, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(i8, recycler, state);
        }
        return 0;
    }

    public void setCarouselAlignment(int i8) {
        this.carouselAlignment = i8;
        refreshKeylineState();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView, boolean z8) {
        this.isDebuggingEnabled = z8;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z8) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i8) {
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i8);
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i8 != carouselOrientationHelper.orientation) {
            this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, i8);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i8) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDxToMakeVisible(View view, int i9) {
                if (CarouselLayoutManager.this.keylineStateList != null && CarouselLayoutManager.this.isHorizontal()) {
                    CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                    return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
                }
                return 0;
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDyToMakeVisible(View view, int i9) {
                if (CarouselLayoutManager.this.keylineStateList != null && !CarouselLayoutManager.this.isHorizontal()) {
                    CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                    return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
                }
                return 0;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            @Nullable
            public PointF computeScrollVectorForPosition(int i9) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i9);
            }
        };
        linearSmoothScroller.setTargetPosition(i8);
        startSmoothScroll(linearSmoothScroller);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy, int i8) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                CarouselLayoutManager.this.lambda$new$0(view, i9, i10, i11, i12, i13, i14, i15, i16);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i8);
    }

    private int scrollBy(int i8, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float f8;
        if (getChildCount() == 0 || i8 == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(recycler);
        }
        int calculateShouldScrollBy = calculateShouldScrollBy(i8, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += calculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float calculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        if (isLayoutRtl()) {
            f8 = this.currentKeylineState.getLastFocalKeyline().locOffset;
        } else {
            f8 = this.currentKeylineState.getFirstFocalKeyline().locOffset;
        }
        float f9 = Float.MAX_VALUE;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            float abs = Math.abs(f8 - offsetChild(childAt, calculateChildStartForFill, itemSize, rect));
            if (childAt != null && abs < f9) {
                this.currentEstimatedPosition = getPosition(childAt);
                f9 = abs;
            }
            calculateChildStartForFill = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize());
        }
        fill(recycler, state);
        return calculateShouldScrollBy;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i92, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                CarouselLayoutManager.this.lambda$new$0(view, i92, i10, i11, i12, i13, i14, i15, i16);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attributeSet);
    }
}
