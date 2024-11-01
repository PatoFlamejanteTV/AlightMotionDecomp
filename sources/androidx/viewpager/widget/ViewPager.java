package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    PagerAdapter mAdapter;
    private List<OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() { // from class: androidx.viewpager.widget.ViewPager.1
        @Override // java.util.Comparator
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.viewpager.widget.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (f9 * f9 * f9 * f9 * f9) + 1.0f;
        }
    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface DecorView {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        MyAccessibilityDelegate() {
        }

        private boolean canScroll() {
            PagerAdapter pagerAdapter = ViewPager.this.mAdapter;
            if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && (pagerAdapter = ViewPager.this.mAdapter) != null) {
                accessibilityEvent.setItemCount(pagerAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            if (super.performAccessibilityAction(view, i8, bundle)) {
                return true;
            }
            if (i8 != 4096) {
                if (i8 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    /* loaded from: classes3.dex */
    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i8);

        void onPageScrolled(int i8, float f8, @Px int i9);

        void onPageSelected(int i8);
    }

    /* loaded from: classes3.dex */
    public interface PageTransformer {
        void transformPage(@NonNull View view, float f8);
    }

    /* loaded from: classes3.dex */
    private class PagerObserver extends DataSetObserver {
        PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i8);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    /* loaded from: classes3.dex */
    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ViewPositionComparator implements Comparator<View> {
        ViewPositionComparator() {
        }

        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z8 = layoutParams.isDecor;
            if (z8 != layoutParams2.isDecor) {
                return z8 ? 1 : -1;
            }
            return layoutParams.position - layoutParams2.position;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i8, ItemInfo itemInfo2) {
        float f8;
        float f9;
        float f10;
        int i9;
        int i10;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f8 = this.mPageMargin / clientWidth;
        } else {
            f8 = 0.0f;
        }
        if (itemInfo2 != null) {
            int i11 = itemInfo2.position;
            int i12 = itemInfo.position;
            if (i11 < i12) {
                float f11 = itemInfo2.offset + itemInfo2.widthFactor + f8;
                int i13 = i11 + 1;
                int i14 = 0;
                while (i13 <= itemInfo.position && i14 < this.mItems.size()) {
                    ItemInfo itemInfo5 = this.mItems.get(i14);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i13 <= itemInfo4.position || i14 >= this.mItems.size() - 1) {
                            break;
                        }
                        i14++;
                        itemInfo5 = this.mItems.get(i14);
                    }
                    while (i13 < itemInfo4.position) {
                        f11 += this.mAdapter.getPageWidth(i13) + f8;
                        i13++;
                    }
                    itemInfo4.offset = f11;
                    f11 += itemInfo4.widthFactor + f8;
                    i13++;
                }
            } else if (i11 > i12) {
                int size = this.mItems.size() - 1;
                float f12 = itemInfo2.offset;
                while (true) {
                    i11--;
                    if (i11 < itemInfo.position || size < 0) {
                        break;
                    }
                    ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i11 >= itemInfo3.position || size <= 0) {
                            break;
                        }
                        size--;
                        itemInfo6 = this.mItems.get(size);
                    }
                    while (i11 > itemInfo3.position) {
                        f12 -= this.mAdapter.getPageWidth(i11) + f8;
                        i11--;
                    }
                    f12 -= itemInfo3.widthFactor + f8;
                    itemInfo3.offset = f12;
                }
            }
        }
        int size2 = this.mItems.size();
        float f13 = itemInfo.offset;
        int i15 = itemInfo.position;
        int i16 = i15 - 1;
        if (i15 == 0) {
            f9 = f13;
        } else {
            f9 = -3.4028235E38f;
        }
        this.mFirstOffset = f9;
        int i17 = count - 1;
        if (i15 == i17) {
            f10 = (itemInfo.widthFactor + f13) - 1.0f;
        } else {
            f10 = Float.MAX_VALUE;
        }
        this.mLastOffset = f10;
        int i18 = i8 - 1;
        while (i18 >= 0) {
            ItemInfo itemInfo7 = this.mItems.get(i18);
            while (true) {
                i10 = itemInfo7.position;
                if (i16 <= i10) {
                    break;
                }
                f13 -= this.mAdapter.getPageWidth(i16) + f8;
                i16--;
            }
            f13 -= itemInfo7.widthFactor + f8;
            itemInfo7.offset = f13;
            if (i10 == 0) {
                this.mFirstOffset = f13;
            }
            i18--;
            i16--;
        }
        float f14 = itemInfo.offset + itemInfo.widthFactor + f8;
        int i19 = itemInfo.position + 1;
        int i20 = i8 + 1;
        while (i20 < size2) {
            ItemInfo itemInfo8 = this.mItems.get(i20);
            while (true) {
                i9 = itemInfo8.position;
                if (i19 >= i9) {
                    break;
                }
                f14 += this.mAdapter.getPageWidth(i19) + f8;
                i19++;
            }
            if (i9 == i17) {
                this.mLastOffset = (itemInfo8.widthFactor + f14) - 1.0f;
            }
            itemInfo8.offset = f14;
            f14 += itemInfo8.widthFactor + f8;
            i20++;
            i19++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z8) {
        boolean z9;
        if (this.mScrollState == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i8 = 0; i8 < this.mItems.size(); i8++) {
            ItemInfo itemInfo = this.mItems.get(i8);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                z9 = true;
            }
        }
        if (z9) {
            if (z8) {
                ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private int determineTargetPage(int i8, float f8, int i9, int i10) {
        float f9;
        if (Math.abs(i10) > this.mFlingDistance && Math.abs(i9) > this.mMinimumVelocity) {
            if (i9 <= 0) {
                i8++;
            }
        } else {
            if (i8 >= this.mCurItem) {
                f9 = 0.4f;
            } else {
                f9 = 0.6f;
            }
            i8 += (int) (f8 + f9);
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).position, Math.min(i8, this.mItems.get(r4.size() - 1).position));
        }
        return i8;
    }

    private void dispatchOnPageScrolled(int i8, float f8, int i9) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i8, f8, i9);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i10);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i8, f8, i9);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i8, f8, i9);
        }
    }

    private void dispatchOnPageSelected(int i8) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i8);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i9);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i8);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i8);
        }
    }

    private void dispatchOnScrollStateChanged(int i8) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i8);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i9);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i8);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i8);
        }
    }

    private void enableLayers(boolean z8) {
        int i8;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            if (z8) {
                i8 = this.mPageTransformerLayerType;
            } else {
                i8 = 0;
            }
            getChildAt(i9).setLayerType(i8, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private ItemInfo infoForCurrentScrollPosition() {
        float f8;
        float f9;
        int i8;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        if (clientWidth > 0) {
            f8 = getScrollX() / clientWidth;
        } else {
            f8 = 0.0f;
        }
        if (clientWidth > 0) {
            f9 = this.mPageMargin / clientWidth;
        } else {
            f9 = 0.0f;
        }
        ItemInfo itemInfo = null;
        float f11 = 0.0f;
        int i9 = -1;
        int i10 = 0;
        boolean z8 = true;
        while (i10 < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i10);
            if (!z8 && itemInfo2.position != (i8 = i9 + 1)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.offset = f10 + f11 + f9;
                itemInfo2.position = i8;
                itemInfo2.widthFactor = this.mAdapter.getPageWidth(i8);
                i10--;
            }
            ItemInfo itemInfo3 = itemInfo2;
            f10 = itemInfo3.offset;
            float f12 = itemInfo3.widthFactor + f10 + f9;
            if (!z8 && f8 < f10) {
                return itemInfo;
            }
            if (f8 >= f12 && i10 != this.mItems.size() - 1) {
                int i11 = itemInfo3.position;
                float f13 = itemInfo3.widthFactor;
                i10++;
                z8 = false;
                i9 = i11;
                f11 = f13;
                itemInfo = itemInfo3;
            } else {
                return itemInfo3;
            }
        }
        return itemInfo;
    }

    private static boolean isDecorView(@NonNull View view) {
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            return true;
        }
        return false;
    }

    private boolean isGutterDrag(float f8, float f9) {
        if ((f8 < this.mGutterSize && f9 > 0.0f) || (f8 > getWidth() - this.mGutterSize && f9 < 0.0f)) {
            return true;
        }
        return false;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i8;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            this.mLastMotionX = motionEvent.getX(i8);
            this.mActivePointerId = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i8) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i9 = this.mPageMargin;
        int i10 = clientWidth + i9;
        float f8 = clientWidth;
        int i11 = infoForCurrentScrollPosition.position;
        float f9 = ((i8 / f8) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + (i9 / f8));
        this.mCalledSuper = false;
        onPageScrolled(i11, f9, (int) (i10 * f9));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f8) {
        boolean z8;
        boolean z9;
        float f9 = this.mLastMotionX - f8;
        this.mLastMotionX = f8;
        float scrollX = getScrollX() + f9;
        float clientWidth = getClientWidth();
        float f10 = this.mFirstOffset * clientWidth;
        float f11 = this.mLastOffset * clientWidth;
        boolean z10 = false;
        ItemInfo itemInfo = this.mItems.get(0);
        ArrayList<ItemInfo> arrayList = this.mItems;
        ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
        if (itemInfo.position != 0) {
            f10 = itemInfo.offset * clientWidth;
            z8 = false;
        } else {
            z8 = true;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f11 = itemInfo2.offset * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (scrollX < f10) {
            if (z8) {
                this.mLeftEdge.onPull(Math.abs(f10 - scrollX) / clientWidth);
                z10 = true;
            }
            scrollX = f10;
        } else if (scrollX > f11) {
            if (z9) {
                this.mRightEdge.onPull(Math.abs(scrollX - f11) / clientWidth);
                z10 = true;
            }
            scrollX = f11;
        }
        int i8 = (int) scrollX;
        this.mLastMotionX += scrollX - i8;
        scrollTo(i8, getScrollY());
        pageScrolled(i8);
        return z10;
    }

    private void recomputeScrollPosition(int i8, int i9, int i10, int i11) {
        float f8;
        if (i9 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i9 - getPaddingLeft()) - getPaddingRight()) + i11)) * (((i8 - getPaddingLeft()) - getPaddingRight()) + i10)), getScrollY());
            return;
        }
        ItemInfo infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            f8 = Math.min(infoForPosition.offset, this.mLastOffset);
        } else {
            f8 = 0.0f;
        }
        int paddingLeft = (int) (f8 * ((i8 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            completeScroll(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i8 = 0;
        while (i8 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i8).getLayoutParams()).isDecor) {
                removeViewAt(i8);
                i8--;
            }
            i8++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z8) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z8);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished() && !this.mRightEdge.isFinished()) {
            return false;
        }
        return true;
    }

    private void scrollToItem(int i8, boolean z8, int i9, boolean z9) {
        int i10;
        ItemInfo infoForPosition = infoForPosition(i8);
        if (infoForPosition != null) {
            i10 = (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.offset, this.mLastOffset)));
        } else {
            i10 = 0;
        }
        if (z8) {
            smoothScrollTo(i10, 0, i9);
            if (z9) {
                dispatchOnPageSelected(i8);
                return;
            }
            return;
        }
        if (z9) {
            dispatchOnPageSelected(i8);
        }
        completeScroll(false);
        scrollTo(i10, 0);
        pageScrolled(i10);
    }

    private void setScrollingCacheEnabled(boolean z8) {
        if (this.mScrollingCacheEnabled != z8) {
            this.mScrollingCacheEnabled = z8;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                this.mDrawingOrderedChildren.add(getChildAt(i8));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i8, int i9) {
        ItemInfo infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem) {
                    childAt.addFocusables(arrayList, i8, i9);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i9 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    ItemInfo addNewItem(int i8, int i9) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i8;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i8);
        itemInfo.widthFactor = this.mAdapter.getPageWidth(i8);
        if (i9 >= 0 && i9 < this.mItems.size()) {
            this.mItems.add(i9, itemInfo);
        } else {
            this.mItems.add(itemInfo);
        }
        return itemInfo;
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo infoForChild;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean isDecorView = layoutParams2.isDecor | isDecorView(view);
        layoutParams2.isDecor = isDecorView;
        if (this.mInLayout) {
            if (!isDecorView) {
                layoutParams2.needsMeasure = true;
                addViewInLayout(view, i8, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i8, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            if (r5 != r3) goto L93
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.getChildRectInPagerCoordinates(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.getChildRectInPagerCoordinates(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8e
            if (r2 < r3) goto L8e
            boolean r0 = r4.pageLeft()
            goto Lca
        L8e:
            boolean r0 = r1.requestFocus()
            goto Lca
        L93:
            if (r5 != r2) goto Lbf
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.getChildRectInPagerCoordinates(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.getChildRectInPagerCoordinates(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r4.pageRight()
            goto Lca
        Lae:
            boolean r0 = r1.requestFocus()
            goto Lca
        Lb3:
            if (r5 == r3) goto Lc6
            r0 = 1
            if (r5 != r0) goto Lb9
            goto Lc6
        Lb9:
            if (r5 == r2) goto Lc1
            r0 = 2
            if (r5 != r0) goto Lbf
            goto Lc1
        Lbf:
            r0 = 0
            goto Lca
        Lc1:
            boolean r0 = r4.pageRight()
            goto Lca
        Lc6:
            boolean r0 = r4.pageLeft()
        Lca:
            if (r0 == 0) goto Ld3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    protected boolean canScroll(View view, boolean z8, int i8, int i9, int i10) {
        int i11;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i12 = i9 + scrollX;
                if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && (i11 = i10 + scrollY) >= childAt.getTop() && i11 < childAt.getBottom() && canScroll(childAt, true, i8, i12 - childAt.getLeft(), i11 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z8 && view.canScrollHorizontally(-i8)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i8) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i8 < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        }
        if (i8 <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        completeScroll(true);
    }

    void dataSetChanged() {
        boolean z8;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i8 = this.mCurItem;
        int i9 = 0;
        boolean z9 = false;
        while (i9 < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i9);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i9);
                    i9--;
                    if (!z9) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z9 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    int i10 = this.mCurItem;
                    if (i10 == itemInfo.position) {
                        i8 = Math.max(0, Math.min(i10, count - 1));
                    }
                } else {
                    int i11 = itemInfo.position;
                    if (i11 != itemPosition) {
                        if (i11 == this.mCurItem) {
                            i8 = itemPosition;
                        }
                        itemInfo.position = itemPosition;
                    }
                }
                z8 = true;
            }
            i9++;
        }
        if (z9) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z8) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i12).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(i8, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f8) {
        return (float) Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z8 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        } else {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z8 = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z8 |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z8) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((scrollX / clientWidth) - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return pageRight();
                    }
                    return arrowScroll(66);
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return pageLeft();
                }
                return arrowScroll(17);
            }
        }
        return false;
    }

    public void fakeDragBy(float f8) {
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f8;
            float scrollX = getScrollX() - f8;
            float clientWidth = getClientWidth();
            float f9 = this.mFirstOffset * clientWidth;
            float f10 = this.mLastOffset * clientWidth;
            ItemInfo itemInfo = this.mItems.get(0);
            ItemInfo itemInfo2 = this.mItems.get(r4.size() - 1);
            if (itemInfo.position != 0) {
                f9 = itemInfo.offset * clientWidth;
            }
            if (itemInfo2.position != this.mAdapter.getCount() - 1) {
                f10 = itemInfo2.offset * clientWidth;
            }
            if (scrollX < f9) {
                scrollX = f9;
            } else if (scrollX > f10) {
                scrollX = f10;
            }
            int i8 = (int) scrollX;
            this.mLastMotionX += scrollX - i8;
            scrollTo(i8, getScrollY());
            pageScrolled(i8);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i8, int i9) {
        if (this.mDrawingOrder == 2) {
            i9 = (i8 - 1) - i9;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i9).getLayoutParams()).childIndex;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    ItemInfo infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return infoForChild(view);
            }
        }
    }

    ItemInfo infoForChild(View view) {
        for (int i8 = 0; i8 < this.mItems.size(); i8++) {
            ItemInfo itemInfo = this.mItems.get(i8);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    ItemInfo infoForPosition(int i8) {
        for (int i9 = 0; i9 < this.mItems.size(); i9++) {
            ItemInfo itemInfo = this.mItems.get(i9);
            if (itemInfo.position == i8) {
                return itemInfo;
            }
        }
        return null;
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f8);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f8);
        this.mCloseEnough = (int) (2.0f * f8);
        this.mDefaultGutterSize = (int) (f8 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4
            private final Rect mTempRect = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = this.mTempRect;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = ViewPager.this.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i8), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i8;
        float f8;
        float f9;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f10 = this.mPageMargin / width;
            int i9 = 0;
            ItemInfo itemInfo = this.mItems.get(0);
            float f11 = itemInfo.offset;
            int size = this.mItems.size();
            int i10 = itemInfo.position;
            int i11 = this.mItems.get(size - 1).position;
            while (i10 < i11) {
                while (true) {
                    i8 = itemInfo.position;
                    if (i10 <= i8 || i9 >= size) {
                        break;
                    }
                    i9++;
                    itemInfo = this.mItems.get(i9);
                }
                if (i10 == i8) {
                    float f12 = itemInfo.offset;
                    float f13 = itemInfo.widthFactor;
                    f8 = (f12 + f13) * width;
                    f11 = f12 + f13 + f10;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i10);
                    f8 = (f11 + pageWidth) * width;
                    f11 += pageWidth + f10;
                }
                if (this.mPageMargin + f8 > scrollX) {
                    f9 = f10;
                    this.mMarginDrawable.setBounds(Math.round(f8), this.mTopPageBounds, Math.round(this.mPageMargin + f8), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    f9 = f10;
                }
                if (f8 <= scrollX + r2) {
                    i10++;
                    f10 = f9;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f8;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                } else {
                    int i8 = this.mActivePointerId;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        float x8 = motionEvent.getX(findPointerIndex);
                        float f9 = x8 - this.mLastMotionX;
                        float abs = Math.abs(f9);
                        float y8 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y8 - this.mInitialMotionY);
                        if (f9 != 0.0f && !isGutterDrag(this.mLastMotionX, f9) && canScroll(this, false, (int) f9, (int) x8, (int) y8)) {
                            this.mLastMotionX = x8;
                            this.mLastMotionY = y8;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        int i9 = this.mTouchSlop;
                        if (abs > i9 && abs * 0.5f > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                            float f10 = this.mInitialMotionX;
                            float f11 = this.mTouchSlop;
                            if (f9 > 0.0f) {
                                f8 = f10 + f11;
                            } else {
                                f8 = f10 - f11;
                            }
                            this.mLastMotionX = f8;
                            this.mLastMotionY = y8;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i9) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && performDrag(x8)) {
                            ViewCompat.postInvalidateOnAnimation(this);
                        }
                    }
                }
            } else {
                float x9 = motionEvent.getX();
                this.mInitialMotionX = x9;
                this.mLastMotionX = x9;
                float y9 = motionEvent.getY();
                this.mInitialMotionY = y9;
                this.mLastMotionY = y9;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        resetTouch();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.isDecor
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.gravity
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$PageTransformer r13 = r12.mPageTransformer
            if (r13 == 0) goto La0
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7b:
            if (r1 >= r14) goto La0
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.isDecor
            if (r0 == 0) goto L8c
            goto L9d
        L8c:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$PageTransformer r3 = r12.mPageTransformer
            r3.transformPage(r15, r0)
        L9d:
            int r1 = r1 + 1
            goto L7b
        La0:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        int i9;
        int i10;
        int i11;
        ItemInfo infoForChild;
        int childCount = getChildCount();
        if ((i8 & 2) != 0) {
            i10 = childCount;
            i9 = 0;
            i11 = 1;
        } else {
            i9 = childCount - 1;
            i10 = -1;
            i11 = -1;
        }
        while (i9 != i10) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem && childAt.requestFocus(i8, rect)) {
                return true;
            }
            i9 += i11;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.adapterState, savedState.loader);
            setCurrentItemInternal(savedState.position, false, true);
        } else {
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.adapterState;
            this.mRestoredClassLoader = savedState.loader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.adapterState = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 != i10) {
            int i12 = this.mPageMargin;
            recomputeScrollPosition(i8, i10, i12, i12);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        float f8;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z8 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                onSecondaryPointerUp(motionEvent);
                                this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionX = motionEvent.getX(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.mIsBeingDragged) {
                        scrollToItem(this.mCurItem, true, 0, false);
                        z8 = resetTouch();
                    }
                } else {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (findPointerIndex == -1) {
                            z8 = resetTouch();
                        } else {
                            float x8 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x8 - this.mLastMotionX);
                            float y8 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y8 - this.mLastMotionY);
                            if (abs > this.mTouchSlop && abs > abs2) {
                                this.mIsBeingDragged = true;
                                requestParentDisallowInterceptTouchEvent(true);
                                float f9 = this.mInitialMotionX;
                                if (x8 - f9 > 0.0f) {
                                    f8 = f9 + this.mTouchSlop;
                                } else {
                                    f8 = f9 - this.mTouchSlop;
                                }
                                this.mLastMotionX = f8;
                                this.mLastMotionY = y8;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.mIsBeingDragged) {
                        z8 = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                float f10 = clientWidth;
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((scrollX / f10) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + (this.mPageMargin / f10)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                z8 = resetTouch();
            }
        } else {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x9 = motionEvent.getX();
            this.mInitialMotionX = x9;
            this.mLastMotionX = x9;
            float y9 = motionEvent.getY();
            this.mInitialMotionY = y9;
            this.mLastMotionY = y9;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        if (z8) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    boolean pageLeft() {
        int i8 = this.mCurItem;
        if (i8 > 0) {
            setCurrentItem(i8 - 1, true);
            return true;
        }
        return false;
    }

    boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && this.mCurItem < pagerAdapter.getCount() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i8 = 0; i8 < this.mItems.size(); i8++) {
                ItemInfo itemInfo = this.mItems.get(i8);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z8 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z8) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i9 = 0; i9 < size; i9++) {
                this.mAdapterChangeListeners.get(i9).onAdapterChanged(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    public void setCurrentItem(int i8) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i8, !this.mFirstLayout, false);
    }

    void setCurrentItemInternal(int i8, boolean z8, boolean z9) {
        setCurrentItemInternal(i8, z8, z9, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void setOffscreenPageLimit(int i8) {
        if (i8 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i8 + " too small; defaulting to 1");
            i8 = 1;
        }
        if (i8 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i8;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i8) {
        int i9 = this.mPageMargin;
        this.mPageMargin = i8;
        int width = getWidth();
        recomputeScrollPosition(width, width, i8, i9);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z8, @Nullable PageTransformer pageTransformer) {
        setPageTransformer(z8, pageTransformer, 2);
    }

    void setScrollState(int i8) {
        boolean z8;
        if (this.mScrollState == i8) {
            return;
        }
        this.mScrollState = i8;
        if (this.mPageTransformer != null) {
            if (i8 != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            enableLayers(z8);
        }
        dispatchOnScrollStateChanged(i8);
    }

    void smoothScrollTo(int i8, int i9) {
        smoothScrollTo(i8, i9, 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mMarginDrawable) {
            return false;
        }
        return true;
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
            super(-1, -1);
            this.widthFactor = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.widthFactor = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:            if (r9 == r10) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:            r8 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void populate(int r18) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    void setCurrentItemInternal(int i8, boolean z8, boolean z9, int i9) {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (!z9 && this.mCurItem == i8 && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i8 < 0) {
                i8 = 0;
            } else if (i8 >= this.mAdapter.getCount()) {
                i8 = this.mAdapter.getCount() - 1;
            }
            int i10 = this.mOffscreenPageLimit;
            int i11 = this.mCurItem;
            if (i8 > i11 + i10 || i8 < i11 - i10) {
                for (int i12 = 0; i12 < this.mItems.size(); i12++) {
                    this.mItems.get(i12).scrolling = true;
                }
            }
            boolean z10 = this.mCurItem != i8;
            if (this.mFirstLayout) {
                this.mCurItem = i8;
                if (z10) {
                    dispatchOnPageSelected(i8);
                }
                requestLayout();
                return;
            }
            populate(i8);
            scrollToItem(i8, z8, i9, z10);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setPageTransformer(boolean z8, @Nullable PageTransformer pageTransformer, int i8) {
        boolean z9 = pageTransformer != null;
        boolean z10 = z9 != (this.mPageTransformer != null);
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z9);
        if (z9) {
            this.mDrawingOrder = z8 ? 2 : 1;
            this.mPageTransformerLayerType = i8;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z10) {
            populate();
        }
    }

    void smoothScrollTo(int i8, int i9, int i10) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i11 = scrollX;
        int scrollY = getScrollY();
        int i12 = i8 - i11;
        int i13 = i9 - scrollY;
        if (i12 == 0 && i13 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i14 = clientWidth / 2;
        float f8 = clientWidth;
        float f9 = i14;
        float distanceInfluenceForSnapDuration = f9 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i12) * 1.0f) / f8)) * f9);
        int abs2 = Math.abs(i10);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i12) / ((f8 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i11, scrollY, i12, i13, min);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setCurrentItem(int i8, boolean z8) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i8, z8, false);
    }

    public void setPageMarginDrawable(@DrawableRes int i8) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i8));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }
}
