package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StableIdStorage;
import androidx.recyclerview.widget.ViewTypeStorage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class NestedAdapterWrapper {
    public final RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
    private RecyclerView.AdapterDataObserver mAdapterObserver = new RecyclerView.AdapterDataObserver() { // from class: androidx.recyclerview.widget.NestedAdapterWrapper.1
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCachedItemCount = nestedAdapterWrapper.adapter.getItemCount();
            NestedAdapterWrapper nestedAdapterWrapper2 = NestedAdapterWrapper.this;
            nestedAdapterWrapper2.mCallback.onChanged(nestedAdapterWrapper2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i8, int i9) {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCallback.onItemRangeChanged(nestedAdapterWrapper, i8, i9, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i8, int i9) {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCachedItemCount += i9;
            nestedAdapterWrapper.mCallback.onItemRangeInserted(nestedAdapterWrapper, i8, i9);
            NestedAdapterWrapper nestedAdapterWrapper2 = NestedAdapterWrapper.this;
            if (nestedAdapterWrapper2.mCachedItemCount > 0 && nestedAdapterWrapper2.adapter.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                NestedAdapterWrapper nestedAdapterWrapper3 = NestedAdapterWrapper.this;
                nestedAdapterWrapper3.mCallback.onStateRestorationPolicyChanged(nestedAdapterWrapper3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i8, int i9, int i10) {
            boolean z8 = true;
            if (i10 != 1) {
                z8 = false;
            }
            Preconditions.checkArgument(z8, "moving more than 1 item is not supported in RecyclerView");
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCallback.onItemRangeMoved(nestedAdapterWrapper, i8, i9);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i8, int i9) {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCachedItemCount -= i9;
            nestedAdapterWrapper.mCallback.onItemRangeRemoved(nestedAdapterWrapper, i8, i9);
            NestedAdapterWrapper nestedAdapterWrapper2 = NestedAdapterWrapper.this;
            if (nestedAdapterWrapper2.mCachedItemCount < 1 && nestedAdapterWrapper2.adapter.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                NestedAdapterWrapper nestedAdapterWrapper3 = NestedAdapterWrapper.this;
                nestedAdapterWrapper3.mCallback.onStateRestorationPolicyChanged(nestedAdapterWrapper3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCallback.onStateRestorationPolicyChanged(nestedAdapterWrapper);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i8, int i9, @Nullable Object obj) {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCallback.onItemRangeChanged(nestedAdapterWrapper, i8, i9, obj);
        }
    };
    int mCachedItemCount;
    final Callback mCallback;

    @NonNull
    private final StableIdStorage.StableIdLookup mStableIdLookup;

    @NonNull
    private final ViewTypeStorage.ViewTypeLookup mViewTypeLookup;

    /* loaded from: classes3.dex */
    interface Callback {
        void onChanged(@NonNull NestedAdapterWrapper nestedAdapterWrapper);

        void onItemRangeChanged(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i8, int i9);

        void onItemRangeChanged(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i8, int i9, @Nullable Object obj);

        void onItemRangeInserted(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i8, int i9);

        void onItemRangeMoved(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i8, int i9);

        void onItemRangeRemoved(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i8, int i9);

        void onStateRestorationPolicyChanged(NestedAdapterWrapper nestedAdapterWrapper);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NestedAdapterWrapper(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter, Callback callback, ViewTypeStorage viewTypeStorage, StableIdStorage.StableIdLookup stableIdLookup) {
        this.adapter = adapter;
        this.mCallback = callback;
        this.mViewTypeLookup = viewTypeStorage.createViewTypeWrapper(this);
        this.mStableIdLookup = stableIdLookup;
        this.mCachedItemCount = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.mAdapterObserver);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispose() {
        this.adapter.unregisterAdapterDataObserver(this.mAdapterObserver);
        this.mViewTypeLookup.dispose();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCachedItemCount() {
        return this.mCachedItemCount;
    }

    public long getItemId(int i8) {
        return this.mStableIdLookup.localToGlobal(this.adapter.getItemId(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getItemViewType(int i8) {
        return this.mViewTypeLookup.localToGlobal(this.adapter.getItemViewType(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        this.adapter.bindViewHolder(viewHolder, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return this.adapter.onCreateViewHolder(viewGroup, this.mViewTypeLookup.globalToLocal(i8));
    }
}
