package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(@NonNull RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i8;
        int i9;
        if (itemHolderInfo != null && ((i8 = itemHolderInfo.left) != (i9 = itemHolderInfo2.left) || itemHolderInfo.top != itemHolderInfo2.top)) {
            return animateMove(viewHolder, i8, itemHolderInfo.top, i9, itemHolderInfo2.top);
        }
        return animateAdd(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i8, int i9, int i10, int i11);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i8;
        int i9;
        int i10 = itemHolderInfo.left;
        int i11 = itemHolderInfo.top;
        if (viewHolder2.shouldIgnore()) {
            int i12 = itemHolderInfo.left;
            i9 = itemHolderInfo.top;
            i8 = i12;
        } else {
            i8 = itemHolderInfo2.left;
            i9 = itemHolderInfo2.top;
        }
        return animateChange(viewHolder, viewHolder2, i10, i11, i8, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i8;
        int i9;
        int i10 = itemHolderInfo.left;
        int i11 = itemHolderInfo.top;
        View view = viewHolder.itemView;
        if (itemHolderInfo2 == null) {
            i8 = view.getLeft();
        } else {
            i8 = itemHolderInfo2.left;
        }
        int i12 = i8;
        if (itemHolderInfo2 == null) {
            i9 = view.getTop();
        } else {
            i9 = itemHolderInfo2.top;
        }
        int i13 = i9;
        if (!viewHolder.isRemoved() && (i10 != i12 || i11 != i13)) {
            view.layout(i12, i13, view.getWidth() + i12, view.getHeight() + i13);
            return animateMove(viewHolder, i10, i11, i12, i13);
        }
        return animateRemove(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.ViewHolder viewHolder, int i8, int i9, int i10, int i11);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i8 = itemHolderInfo.left;
        int i9 = itemHolderInfo2.left;
        if (i8 == i9 && itemHolderInfo.top == itemHolderInfo2.top) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        return animateMove(viewHolder, i8, itemHolderInfo.top, i9, itemHolderInfo2.top);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (this.mSupportsChangeAnimations && !viewHolder.isInvalid()) {
            return false;
        }
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.ViewHolder viewHolder) {
        onAddFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.ViewHolder viewHolder) {
        onAddStarting(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z8) {
        onChangeFinished(viewHolder, z8);
        dispatchAnimationFinished(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z8) {
        onChangeStarting(viewHolder, z8);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.ViewHolder viewHolder) {
        onMoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.ViewHolder viewHolder) {
        onMoveStarting(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        onRemoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        onRemoveStarting(viewHolder);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z8) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z8) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void setSupportsChangeAnimations(boolean z8) {
        this.mSupportsChangeAnimations = z8;
    }
}
