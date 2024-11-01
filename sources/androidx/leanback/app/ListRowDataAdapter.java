package androidx.leanback.app;

import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.Row;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ListRowDataAdapter extends ObjectAdapter {
    public static final int ON_CHANGED = 16;
    public static final int ON_ITEM_RANGE_CHANGED = 2;
    public static final int ON_ITEM_RANGE_INSERTED = 4;
    public static final int ON_ITEM_RANGE_REMOVED = 8;
    private final ObjectAdapter mAdapter;
    final ObjectAdapter.DataObserver mDataObserver;
    int mLastVisibleRowIndex;

    /* loaded from: classes3.dex */
    private class QueueBasedDataObserver extends ObjectAdapter.DataObserver {
        QueueBasedDataObserver() {
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onChanged() {
            ListRowDataAdapter.this.initialize();
            ListRowDataAdapter.this.notifyChanged();
        }
    }

    /* loaded from: classes3.dex */
    private class SimpleDataObserver extends ObjectAdapter.DataObserver {
        SimpleDataObserver() {
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onChanged() {
            ListRowDataAdapter.this.initialize();
            onEventFired(16, -1, -1);
        }

        protected void onEventFired(int i8, int i9, int i10) {
            ListRowDataAdapter.this.doNotify(i8, i9, i10);
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onItemRangeChanged(int i8, int i9) {
            int i10 = ListRowDataAdapter.this.mLastVisibleRowIndex;
            if (i8 <= i10) {
                onEventFired(2, i8, Math.min(i9, (i10 - i8) + 1));
            }
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onItemRangeInserted(int i8, int i9) {
            ListRowDataAdapter listRowDataAdapter = ListRowDataAdapter.this;
            int i10 = listRowDataAdapter.mLastVisibleRowIndex;
            if (i8 <= i10) {
                listRowDataAdapter.mLastVisibleRowIndex = i10 + i9;
                onEventFired(4, i8, i9);
                return;
            }
            listRowDataAdapter.initialize();
            int i11 = ListRowDataAdapter.this.mLastVisibleRowIndex;
            if (i11 > i10) {
                onEventFired(4, i10 + 1, i11 - i10);
            }
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onItemRangeRemoved(int i8, int i9) {
            int i10 = (i8 + i9) - 1;
            ListRowDataAdapter listRowDataAdapter = ListRowDataAdapter.this;
            int i11 = listRowDataAdapter.mLastVisibleRowIndex;
            if (i10 < i11) {
                listRowDataAdapter.mLastVisibleRowIndex = i11 - i9;
                onEventFired(8, i8, i9);
                return;
            }
            listRowDataAdapter.initialize();
            int i12 = ListRowDataAdapter.this.mLastVisibleRowIndex;
            int i13 = i11 - i12;
            if (i13 > 0) {
                onEventFired(8, Math.min(i12 + 1, i8), i13);
            }
        }
    }

    public ListRowDataAdapter(ObjectAdapter objectAdapter) {
        super(objectAdapter.getPresenterSelector());
        this.mAdapter = objectAdapter;
        initialize();
        if (objectAdapter.isImmediateNotifySupported()) {
            this.mDataObserver = new SimpleDataObserver();
        } else {
            this.mDataObserver = new QueueBasedDataObserver();
        }
        attach();
    }

    void attach() {
        initialize();
        this.mAdapter.registerObserver(this.mDataObserver);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void detach() {
        this.mAdapter.unregisterObserver(this.mDataObserver);
    }

    void doNotify(int i8, int i9, int i10) {
        if (i8 != 2) {
            if (i8 != 4) {
                if (i8 != 8) {
                    if (i8 == 16) {
                        notifyChanged();
                        return;
                    }
                    throw new IllegalArgumentException("Invalid event type " + i8);
                }
                notifyItemRangeRemoved(i9, i10);
                return;
            }
            notifyItemRangeInserted(i9, i10);
            return;
        }
        notifyItemRangeChanged(i9, i10);
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public Object get(int i8) {
        return this.mAdapter.get(i8);
    }

    void initialize() {
        this.mLastVisibleRowIndex = -1;
        for (int size = this.mAdapter.size() - 1; size >= 0; size--) {
            if (((Row) this.mAdapter.get(size)).isRenderedAsRowView()) {
                this.mLastVisibleRowIndex = size;
                return;
            }
        }
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public int size() {
        return this.mLastVisibleRowIndex + 1;
    }
}
