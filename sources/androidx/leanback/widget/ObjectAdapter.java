package androidx.leanback.widget;

import android.database.Observable;
import androidx.annotation.RestrictTo;

/* loaded from: classes3.dex */
public abstract class ObjectAdapter {
    public static final int NO_ID = -1;
    private boolean mHasStableIds;
    private final DataObservable mObservable = new DataObservable();
    private PresenterSelector mPresenterSelector;

    /* loaded from: classes3.dex */
    public static abstract class DataObserver {
        public void onChanged() {
        }

        public void onItemMoved(int i8, int i9) {
            onChanged();
        }

        public void onItemRangeChanged(int i8, int i9) {
            onChanged();
        }

        public void onItemRangeInserted(int i8, int i9) {
            onChanged();
        }

        public void onItemRangeRemoved(int i8, int i9) {
            onChanged();
        }

        public void onItemRangeChanged(int i8, int i9, Object obj) {
            onChanged();
        }
    }

    public ObjectAdapter(PresenterSelector presenterSelector) {
        setPresenterSelector(presenterSelector);
    }

    public abstract Object get(int i8);

    public long getId(int i8) {
        return -1L;
    }

    public final Presenter getPresenter(Object obj) {
        PresenterSelector presenterSelector = this.mPresenterSelector;
        if (presenterSelector != null) {
            return presenterSelector.getPresenter(obj);
        }
        throw new IllegalStateException("Presenter selector must not be null");
    }

    public final PresenterSelector getPresenterSelector() {
        return this.mPresenterSelector;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasObserver() {
        return this.mObservable.hasObserver();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public boolean isImmediateNotifySupported() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyChanged() {
        this.mObservable.notifyChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyItemMoved(int i8, int i9) {
        this.mObservable.notifyItemMoved(i8, i9);
    }

    public final void notifyItemRangeChanged(int i8, int i9) {
        this.mObservable.notifyItemRangeChanged(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyItemRangeInserted(int i8, int i9) {
        this.mObservable.notifyItemRangeInserted(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyItemRangeRemoved(int i8, int i9) {
        this.mObservable.notifyItemRangeRemoved(i8, i9);
    }

    protected void onHasStableIdsChanged() {
    }

    protected void onPresenterSelectorChanged() {
    }

    public final void registerObserver(DataObserver dataObserver) {
        this.mObservable.registerObserver(dataObserver);
    }

    public final void setHasStableIds(boolean z8) {
        boolean z9;
        if (this.mHasStableIds != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mHasStableIds = z8;
        if (z9) {
            onHasStableIdsChanged();
        }
    }

    public final void setPresenterSelector(PresenterSelector presenterSelector) {
        boolean z8;
        if (presenterSelector != null) {
            PresenterSelector presenterSelector2 = this.mPresenterSelector;
            boolean z9 = false;
            if (presenterSelector2 != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 && presenterSelector2 != presenterSelector) {
                z9 = true;
            }
            this.mPresenterSelector = presenterSelector;
            if (z9) {
                onPresenterSelectorChanged();
            }
            if (z8) {
                notifyChanged();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Presenter selector must not be null");
    }

    public abstract int size();

    public final void unregisterAllObservers() {
        this.mObservable.unregisterAll();
    }

    public final void unregisterObserver(DataObserver dataObserver) {
        this.mObservable.unregisterObserver(dataObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class DataObservable extends Observable<DataObserver> {
        DataObservable() {
        }

        boolean hasObserver() {
            if (((Observable) this).mObservers.size() > 0) {
                return true;
            }
            return false;
        }

        public void notifyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((DataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void notifyItemMoved(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((DataObserver) ((Observable) this).mObservers.get(size)).onItemMoved(i8, i9);
            }
        }

        public void notifyItemRangeChanged(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((DataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i8, i9);
            }
        }

        public void notifyItemRangeInserted(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((DataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i8, i9);
            }
        }

        public void notifyItemRangeRemoved(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((DataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i8, i9);
            }
        }

        public void notifyItemRangeChanged(int i8, int i9, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((DataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i8, i9, obj);
            }
        }
    }

    public final void notifyItemRangeChanged(int i8, int i9, Object obj) {
        this.mObservable.notifyItemRangeChanged(i8, i9, obj);
    }

    public ObjectAdapter(Presenter presenter) {
        setPresenterSelector(new SinglePresenterSelector(presenter));
    }

    public ObjectAdapter() {
    }
}
