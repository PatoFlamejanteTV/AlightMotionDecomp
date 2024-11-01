package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class AdapterListUpdateCallback implements ListUpdateCallback {

    @NonNull
    private final RecyclerView.Adapter mAdapter;

    public AdapterListUpdateCallback(@NonNull RecyclerView.Adapter adapter) {
        this.mAdapter = adapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i8, int i9, Object obj) {
        this.mAdapter.notifyItemRangeChanged(i8, i9, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i8, int i9) {
        this.mAdapter.notifyItemRangeInserted(i8, i9);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i8, int i9) {
        this.mAdapter.notifyItemMoved(i8, i9);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i8, int i9) {
        this.mAdapter.notifyItemRangeRemoved(i8, i9);
    }
}
