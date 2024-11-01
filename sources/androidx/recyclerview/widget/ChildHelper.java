package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChildHelper {
    private static final boolean DEBUG = false;
    private static final int REMOVE_STATUS_IN_REMOVE = 1;
    private static final int REMOVE_STATUS_IN_REMOVE_IF_HIDDEN = 2;
    private static final int REMOVE_STATUS_NONE = 0;
    private static final String TAG = "ChildrenHelper";
    final Callback mCallback;
    private View mViewInRemoveView;
    private int mRemoveStatus = 0;
    final Bucket mBucket = new Bucket();
    final List<View> mHiddenViews = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Bucket {
        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = Long.MIN_VALUE;
        long mData = 0;
        Bucket mNext;

        Bucket() {
        }

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        void clear(int i8) {
            if (i8 >= 64) {
                Bucket bucket = this.mNext;
                if (bucket != null) {
                    bucket.clear(i8 - 64);
                    return;
                }
                return;
            }
            this.mData &= ~(1 << i8);
        }

        int countOnesBefore(int i8) {
            Bucket bucket = this.mNext;
            if (bucket == null) {
                if (i8 >= 64) {
                    return Long.bitCount(this.mData);
                }
                return Long.bitCount(this.mData & ((1 << i8) - 1));
            }
            if (i8 < 64) {
                return Long.bitCount(this.mData & ((1 << i8) - 1));
            }
            return bucket.countOnesBefore(i8 - 64) + Long.bitCount(this.mData);
        }

        boolean get(int i8) {
            if (i8 >= 64) {
                ensureNext();
                return this.mNext.get(i8 - 64);
            }
            if ((this.mData & (1 << i8)) != 0) {
                return true;
            }
            return false;
        }

        void insert(int i8, boolean z8) {
            boolean z9;
            if (i8 >= 64) {
                ensureNext();
                this.mNext.insert(i8 - 64, z8);
                return;
            }
            long j8 = this.mData;
            if ((Long.MIN_VALUE & j8) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            long j9 = (1 << i8) - 1;
            this.mData = ((j8 & (~j9)) << 1) | (j8 & j9);
            if (z8) {
                set(i8);
            } else {
                clear(i8);
            }
            if (z9 || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, z9);
            }
        }

        boolean remove(int i8) {
            boolean z8;
            if (i8 >= 64) {
                ensureNext();
                return this.mNext.remove(i8 - 64);
            }
            long j8 = 1 << i8;
            long j9 = this.mData;
            if ((j9 & j8) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            long j10 = j9 & (~j8);
            this.mData = j10;
            long j11 = j8 - 1;
            this.mData = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z8;
        }

        void reset() {
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        void set(int i8) {
            if (i8 >= 64) {
                ensureNext();
                this.mNext.set(i8 - 64);
            } else {
                this.mData |= 1 << i8;
            }
        }

        public String toString() {
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            return this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface Callback {
        void addView(View view, int i8);

        void attachViewToParent(View view, int i8, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i8);

        View getChildAt(int i8);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChildHelper(Callback callback) {
        this.mCallback = callback;
    }

    private int getOffset(int i8) {
        if (i8 < 0) {
            return -1;
        }
        int childCount = this.mCallback.getChildCount();
        int i9 = i8;
        while (i9 < childCount) {
            int countOnesBefore = i8 - (i9 - this.mBucket.countOnesBefore(i9));
            if (countOnesBefore == 0) {
                while (this.mBucket.get(i9)) {
                    i9++;
                }
                return i9;
            }
            i9 += countOnesBefore;
        }
        return -1;
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.onEnteredHiddenState(view);
    }

    private boolean unhideViewInternal(View view) {
        if (this.mHiddenViews.remove(view)) {
            this.mCallback.onLeftHiddenState(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addView(View view, boolean z8) {
        addView(view, -1, z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void attachViewToParent(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z8) {
        int offset;
        if (i8 < 0) {
            offset = this.mCallback.getChildCount();
        } else {
            offset = getOffset(i8);
        }
        this.mBucket.insert(offset, z8);
        if (z8) {
            hideViewInternal(view);
        }
        this.mCallback.attachViewToParent(view, offset, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void detachViewFromParent(int i8) {
        int offset = getOffset(i8);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View findHiddenNonRemovedView(int i8) {
        int size = this.mHiddenViews.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = this.mHiddenViews.get(i9);
            RecyclerView.ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            if (childViewHolder.getLayoutPosition() == i8 && !childViewHolder.isInvalid() && !childViewHolder.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View getChildAt(int i8) {
        return this.mCallback.getChildAt(getOffset(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View getUnfilteredChildAt(int i8) {
        return this.mCallback.getChildAt(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void hide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.mBucket.set(indexOfChild);
            hideViewInternal(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int indexOfChild(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild == -1 || this.mBucket.get(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.mBucket.countOnesBefore(indexOfChild);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.onLeftHiddenState(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeView(View view) {
        int i8 = this.mRemoveStatus;
        if (i8 != 1) {
            if (i8 != 2) {
                try {
                    this.mRemoveStatus = 1;
                    this.mViewInRemoveView = view;
                    int indexOfChild = this.mCallback.indexOfChild(view);
                    if (indexOfChild < 0) {
                        this.mRemoveStatus = 0;
                        this.mViewInRemoveView = null;
                        return;
                    }
                    if (this.mBucket.remove(indexOfChild)) {
                        unhideViewInternal(view);
                    }
                    this.mCallback.removeViewAt(indexOfChild);
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    return;
                } catch (Throwable th) {
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeViewAt(int i8) {
        int i9 = this.mRemoveStatus;
        if (i9 != 1) {
            if (i9 != 2) {
                try {
                    int offset = getOffset(i8);
                    View childAt = this.mCallback.getChildAt(offset);
                    if (childAt == null) {
                        this.mRemoveStatus = 0;
                        this.mViewInRemoveView = null;
                        return;
                    }
                    this.mRemoveStatus = 1;
                    this.mViewInRemoveView = childAt;
                    if (this.mBucket.remove(offset)) {
                        unhideViewInternal(childAt);
                    }
                    this.mCallback.removeViewAt(offset);
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    return;
                } catch (Throwable th) {
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean removeViewIfHidden(View view) {
        int i8 = this.mRemoveStatus;
        if (i8 == 1) {
            if (this.mViewInRemoveView == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i8 != 2) {
            try {
                this.mRemoveStatus = 2;
                int indexOfChild = this.mCallback.indexOfChild(view);
                if (indexOfChild == -1) {
                    unhideViewInternal(view);
                    return true;
                }
                if (!this.mBucket.get(indexOfChild)) {
                    return false;
                }
                this.mBucket.remove(indexOfChild);
                unhideViewInternal(view);
                this.mCallback.removeViewAt(indexOfChild);
                return true;
            } finally {
                this.mRemoveStatus = 0;
            }
        }
        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void unhide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (this.mBucket.get(indexOfChild)) {
                this.mBucket.clear(indexOfChild);
                unhideViewInternal(view);
                return;
            } else {
                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
            }
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addView(View view, int i8, boolean z8) {
        int offset;
        if (i8 < 0) {
            offset = this.mCallback.getChildCount();
        } else {
            offset = getOffset(i8);
        }
        this.mBucket.insert(offset, z8);
        if (z8) {
            hideViewInternal(view);
        }
        this.mCallback.addView(view, offset);
    }
}
