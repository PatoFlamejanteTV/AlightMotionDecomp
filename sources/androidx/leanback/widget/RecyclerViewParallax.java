package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.leanback.widget.Parallax;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class RecyclerViewParallax extends Parallax<ChildPositionProperty> {
    boolean mIsVertical;
    RecyclerView mRecylerView;
    RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.leanback.widget.RecyclerViewParallax.1
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            RecyclerViewParallax.this.updateValues();
        }
    };
    View.OnLayoutChangeListener mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.leanback.widget.RecyclerViewParallax.2
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            RecyclerViewParallax.this.updateValues();
        }
    };

    /* loaded from: classes3.dex */
    public static final class ChildPositionProperty extends Parallax.IntProperty {
        int mAdapterPosition;
        float mFraction;
        int mOffset;
        int mViewId;

        ChildPositionProperty(String str, int i8) {
            super(str, i8);
        }

        public ChildPositionProperty adapterPosition(int i8) {
            this.mAdapterPosition = i8;
            return this;
        }

        public ChildPositionProperty fraction(float f8) {
            this.mFraction = f8;
            return this;
        }

        public int getAdapterPosition() {
            return this.mAdapterPosition;
        }

        public float getFraction() {
            return this.mFraction;
        }

        public int getOffset() {
            return this.mOffset;
        }

        public int getViewId() {
            return this.mViewId;
        }

        public ChildPositionProperty offset(int i8) {
            this.mOffset = i8;
            return this;
        }

        void updateValue(RecyclerViewParallax recyclerViewParallax) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition;
            RecyclerView recyclerView = recyclerViewParallax.mRecylerView;
            if (recyclerView == null) {
                findViewHolderForAdapterPosition = null;
            } else {
                findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.mAdapterPosition);
            }
            if (findViewHolderForAdapterPosition == null) {
                if (recyclerView != null && recyclerView.getLayoutManager().getChildCount() != 0) {
                    if (recyclerView.findContainingViewHolder(recyclerView.getLayoutManager().getChildAt(0)).getAdapterPosition() < this.mAdapterPosition) {
                        recyclerViewParallax.setIntPropertyValue(getIndex(), Integer.MAX_VALUE);
                        return;
                    } else {
                        recyclerViewParallax.setIntPropertyValue(getIndex(), Integer.MIN_VALUE);
                        return;
                    }
                }
                recyclerViewParallax.setIntPropertyValue(getIndex(), Integer.MAX_VALUE);
                return;
            }
            View findViewById = findViewHolderForAdapterPosition.itemView.findViewById(this.mViewId);
            if (findViewById == null) {
                return;
            }
            Rect rect = new Rect(0, 0, findViewById.getWidth(), findViewById.getHeight());
            recyclerView.offsetDescendantRectToMyCoords(findViewById, rect);
            float f8 = 0.0f;
            float f9 = 0.0f;
            while (findViewById != recyclerView && findViewById != null) {
                if (findViewById.getParent() != recyclerView || !recyclerView.isAnimating()) {
                    f8 += findViewById.getTranslationX();
                    f9 += findViewById.getTranslationY();
                }
                findViewById = (View) findViewById.getParent();
            }
            rect.offset((int) f8, (int) f9);
            if (recyclerViewParallax.mIsVertical) {
                recyclerViewParallax.setIntPropertyValue(getIndex(), rect.top + this.mOffset + ((int) (this.mFraction * rect.height())));
            } else {
                recyclerViewParallax.setIntPropertyValue(getIndex(), rect.left + this.mOffset + ((int) (this.mFraction * rect.width())));
            }
        }

        public ChildPositionProperty viewId(int i8) {
            this.mViewId = i8;
            return this;
        }
    }

    @Override // androidx.leanback.widget.Parallax
    public float getMaxValue() {
        int width;
        RecyclerView recyclerView = this.mRecylerView;
        if (recyclerView == null) {
            return 0.0f;
        }
        if (this.mIsVertical) {
            width = recyclerView.getHeight();
        } else {
            width = recyclerView.getWidth();
        }
        return width;
    }

    public RecyclerView getRecyclerView() {
        return this.mRecylerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecylerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.mOnScrollListener);
            this.mRecylerView.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        }
        this.mRecylerView = recyclerView;
        if (recyclerView != null) {
            recyclerView.getLayoutManager();
            boolean z8 = false;
            if (RecyclerView.LayoutManager.getProperties(this.mRecylerView.getContext(), null, 0, 0).orientation == 1) {
                z8 = true;
            }
            this.mIsVertical = z8;
            this.mRecylerView.addOnScrollListener(this.mOnScrollListener);
            this.mRecylerView.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        }
    }

    @Override // androidx.leanback.widget.Parallax
    public void updateValues() {
        Iterator<ChildPositionProperty> it = getProperties().iterator();
        while (it.hasNext()) {
            it.next().updateValue(this);
        }
        super.updateValues();
    }

    @Override // androidx.leanback.widget.Parallax
    public ChildPositionProperty createProperty(String str, int i8) {
        return new ChildPositionProperty(str, i8);
    }
}
