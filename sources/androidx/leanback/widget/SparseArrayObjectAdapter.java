package androidx.leanback.widget;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public class SparseArrayObjectAdapter extends ObjectAdapter {
    private SparseArray<Object> mItems;

    public SparseArrayObjectAdapter(PresenterSelector presenterSelector) {
        super(presenterSelector);
        this.mItems = new SparseArray<>();
    }

    public void clear(int i8) {
        int indexOfKey = this.mItems.indexOfKey(i8);
        if (indexOfKey >= 0) {
            this.mItems.removeAt(indexOfKey);
            notifyItemRangeRemoved(indexOfKey, 1);
        }
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public Object get(int i8) {
        return this.mItems.valueAt(i8);
    }

    public int indexOf(Object obj) {
        return this.mItems.indexOfValue(obj);
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public boolean isImmediateNotifySupported() {
        return true;
    }

    public Object lookup(int i8) {
        return this.mItems.get(i8);
    }

    public void notifyArrayItemRangeChanged(int i8, int i9) {
        notifyItemRangeChanged(i8, i9);
    }

    public void set(int i8, Object obj) {
        int indexOfKey = this.mItems.indexOfKey(i8);
        if (indexOfKey >= 0) {
            if (this.mItems.valueAt(indexOfKey) != obj) {
                this.mItems.setValueAt(indexOfKey, obj);
                notifyItemRangeChanged(indexOfKey, 1);
                return;
            }
            return;
        }
        this.mItems.append(i8, obj);
        notifyItemRangeInserted(this.mItems.indexOfKey(i8), 1);
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public int size() {
        return this.mItems.size();
    }

    public int indexOf(int i8) {
        return this.mItems.indexOfKey(i8);
    }

    public SparseArrayObjectAdapter(Presenter presenter) {
        super(presenter);
        this.mItems = new SparseArray<>();
    }

    public void clear() {
        int size = this.mItems.size();
        if (size == 0) {
            return;
        }
        this.mItems.clear();
        notifyItemRangeRemoved(0, size);
    }

    public SparseArrayObjectAdapter() {
        this.mItems = new SparseArray<>();
    }
}
