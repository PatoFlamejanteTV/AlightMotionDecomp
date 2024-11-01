package androidx.leanback.widget;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public class ArrayObjectAdapter extends ObjectAdapter {
    private static final Boolean DEBUG = Boolean.FALSE;
    private static final String TAG = "ArrayObjectAdapter";
    private final List mItems;
    ListUpdateCallback mListUpdateCallback;
    final List mOldItems;
    private List mUnmodifiableItems;

    public ArrayObjectAdapter(PresenterSelector presenterSelector) {
        super(presenterSelector);
        this.mItems = new ArrayList();
        this.mOldItems = new ArrayList();
    }

    public void add(Object obj) {
        add(this.mItems.size(), obj);
    }

    public void addAll(int i8, Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return;
        }
        this.mItems.addAll(i8, collection);
        notifyItemRangeInserted(i8, size);
    }

    public void clear() {
        int size = this.mItems.size();
        if (size == 0) {
            return;
        }
        this.mItems.clear();
        notifyItemRangeRemoved(0, size);
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public Object get(int i8) {
        return this.mItems.get(i8);
    }

    public int indexOf(Object obj) {
        return this.mItems.indexOf(obj);
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public boolean isImmediateNotifySupported() {
        return true;
    }

    public void move(int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        this.mItems.add(i9, this.mItems.remove(i8));
        notifyItemMoved(i8, i9);
    }

    public void notifyArrayItemRangeChanged(int i8, int i9) {
        notifyItemRangeChanged(i8, i9);
    }

    public boolean remove(Object obj) {
        int indexOf = this.mItems.indexOf(obj);
        if (indexOf >= 0) {
            this.mItems.remove(indexOf);
            notifyItemRangeRemoved(indexOf, 1);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public int removeItems(int i8, int i9) {
        int min = Math.min(i9, this.mItems.size() - i8);
        if (min <= 0) {
            return 0;
        }
        for (int i10 = 0; i10 < min; i10++) {
            this.mItems.remove(i8);
        }
        notifyItemRangeRemoved(i8, min);
        return min;
    }

    public void replace(int i8, Object obj) {
        this.mItems.set(i8, obj);
        notifyItemRangeChanged(i8, 1);
    }

    public void setItems(final List list, final DiffCallback diffCallback) {
        if (diffCallback == null) {
            this.mItems.clear();
            this.mItems.addAll(list);
            notifyChanged();
            return;
        }
        this.mOldItems.clear();
        this.mOldItems.addAll(this.mItems);
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: androidx.leanback.widget.ArrayObjectAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i8, int i9) {
                return diffCallback.areContentsTheSame(ArrayObjectAdapter.this.mOldItems.get(i8), list.get(i9));
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i8, int i9) {
                return diffCallback.areItemsTheSame(ArrayObjectAdapter.this.mOldItems.get(i8), list.get(i9));
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            @Nullable
            public Object getChangePayload(int i8, int i9) {
                return diffCallback.getChangePayload(ArrayObjectAdapter.this.mOldItems.get(i8), list.get(i9));
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                return list.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return ArrayObjectAdapter.this.mOldItems.size();
            }
        });
        this.mItems.clear();
        this.mItems.addAll(list);
        if (this.mListUpdateCallback == null) {
            this.mListUpdateCallback = new ListUpdateCallback() { // from class: androidx.leanback.widget.ArrayObjectAdapter.2
                @Override // androidx.recyclerview.widget.ListUpdateCallback
                public void onChanged(int i8, int i9, Object obj) {
                    if (ArrayObjectAdapter.DEBUG.booleanValue()) {
                        Log.d(ArrayObjectAdapter.TAG, "onChanged");
                    }
                    ArrayObjectAdapter.this.notifyItemRangeChanged(i8, i9, obj);
                }

                @Override // androidx.recyclerview.widget.ListUpdateCallback
                public void onInserted(int i8, int i9) {
                    if (ArrayObjectAdapter.DEBUG.booleanValue()) {
                        Log.d(ArrayObjectAdapter.TAG, "onInserted");
                    }
                    ArrayObjectAdapter.this.notifyItemRangeInserted(i8, i9);
                }

                @Override // androidx.recyclerview.widget.ListUpdateCallback
                public void onMoved(int i8, int i9) {
                    if (ArrayObjectAdapter.DEBUG.booleanValue()) {
                        Log.d(ArrayObjectAdapter.TAG, "onMoved");
                    }
                    ArrayObjectAdapter.this.notifyItemMoved(i8, i9);
                }

                @Override // androidx.recyclerview.widget.ListUpdateCallback
                public void onRemoved(int i8, int i9) {
                    if (ArrayObjectAdapter.DEBUG.booleanValue()) {
                        Log.d(ArrayObjectAdapter.TAG, "onRemoved");
                    }
                    ArrayObjectAdapter.this.notifyItemRangeRemoved(i8, i9);
                }
            };
        }
        calculateDiff.dispatchUpdatesTo(this.mListUpdateCallback);
        this.mOldItems.clear();
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public int size() {
        return this.mItems.size();
    }

    public <E> List<E> unmodifiableList() {
        if (this.mUnmodifiableItems == null) {
            this.mUnmodifiableItems = DesugarCollections.unmodifiableList(this.mItems);
        }
        return this.mUnmodifiableItems;
    }

    public void add(int i8, Object obj) {
        this.mItems.add(i8, obj);
        notifyItemRangeInserted(i8, 1);
    }

    public ArrayObjectAdapter(Presenter presenter) {
        super(presenter);
        this.mItems = new ArrayList();
        this.mOldItems = new ArrayList();
    }

    public ArrayObjectAdapter() {
        this.mItems = new ArrayList();
        this.mOldItems = new ArrayList();
    }
}
