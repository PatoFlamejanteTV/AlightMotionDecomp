package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class DetailsOverviewRow extends Row {
    private ObjectAdapter mActionsAdapter;
    private PresenterSelector mDefaultActionPresenter;
    private Drawable mImageDrawable;
    private boolean mImageScaleUpAllowed;
    private Object mItem;
    private ArrayList<WeakReference<Listener>> mListeners;

    /* loaded from: classes3.dex */
    public static class Listener {
        public void onActionsAdapterChanged(DetailsOverviewRow detailsOverviewRow) {
        }

        public void onImageDrawableChanged(DetailsOverviewRow detailsOverviewRow) {
        }

        public void onItemChanged(DetailsOverviewRow detailsOverviewRow) {
        }
    }

    public DetailsOverviewRow(Object obj) {
        super(null);
        this.mImageScaleUpAllowed = true;
        this.mDefaultActionPresenter = new ActionPresenterSelector();
        this.mActionsAdapter = new ArrayObjectAdapter(this.mDefaultActionPresenter);
        this.mItem = obj;
        verify();
    }

    private ArrayObjectAdapter getArrayObjectAdapter() {
        return (ArrayObjectAdapter) this.mActionsAdapter;
    }

    private void verify() {
        if (this.mItem != null) {
        } else {
            throw new IllegalArgumentException("Object cannot be null");
        }
    }

    @Deprecated
    public final void addAction(Action action) {
        getArrayObjectAdapter().add(action);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void addListener(Listener listener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        } else {
            int i8 = 0;
            while (i8 < this.mListeners.size()) {
                Listener listener2 = this.mListeners.get(i8).get();
                if (listener2 == null) {
                    this.mListeners.remove(i8);
                } else if (listener2 == listener) {
                    return;
                } else {
                    i8++;
                }
            }
        }
        this.mListeners.add(new WeakReference<>(listener));
    }

    public Action getActionForKeyCode(int i8) {
        ObjectAdapter actionsAdapter = getActionsAdapter();
        if (actionsAdapter != null) {
            for (int i9 = 0; i9 < actionsAdapter.size(); i9++) {
                Action action = (Action) actionsAdapter.get(i9);
                if (action.respondsToKeyCode(i8)) {
                    return action;
                }
            }
            return null;
        }
        return null;
    }

    @Deprecated
    public final List<Action> getActions() {
        return getArrayObjectAdapter().unmodifiableList();
    }

    public final ObjectAdapter getActionsAdapter() {
        return this.mActionsAdapter;
    }

    public final Drawable getImageDrawable() {
        return this.mImageDrawable;
    }

    public final Object getItem() {
        return this.mItem;
    }

    public boolean isImageScaleUpAllowed() {
        return this.mImageScaleUpAllowed;
    }

    final void notifyActionsAdapterChanged() {
        if (this.mListeners != null) {
            int i8 = 0;
            while (i8 < this.mListeners.size()) {
                Listener listener = this.mListeners.get(i8).get();
                if (listener == null) {
                    this.mListeners.remove(i8);
                } else {
                    listener.onActionsAdapterChanged(this);
                    i8++;
                }
            }
        }
    }

    final void notifyImageDrawableChanged() {
        if (this.mListeners != null) {
            int i8 = 0;
            while (i8 < this.mListeners.size()) {
                Listener listener = this.mListeners.get(i8).get();
                if (listener == null) {
                    this.mListeners.remove(i8);
                } else {
                    listener.onImageDrawableChanged(this);
                    i8++;
                }
            }
        }
    }

    final void notifyItemChanged() {
        if (this.mListeners != null) {
            int i8 = 0;
            while (i8 < this.mListeners.size()) {
                Listener listener = this.mListeners.get(i8).get();
                if (listener == null) {
                    this.mListeners.remove(i8);
                } else {
                    listener.onItemChanged(this);
                    i8++;
                }
            }
        }
    }

    @Deprecated
    public final boolean removeAction(Action action) {
        return getArrayObjectAdapter().remove(action);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void removeListener(Listener listener) {
        if (this.mListeners != null) {
            int i8 = 0;
            while (i8 < this.mListeners.size()) {
                Listener listener2 = this.mListeners.get(i8).get();
                if (listener2 == null) {
                    this.mListeners.remove(i8);
                } else {
                    if (listener2 == listener) {
                        this.mListeners.remove(i8);
                        return;
                    }
                    i8++;
                }
            }
        }
    }

    public final void setActionsAdapter(ObjectAdapter objectAdapter) {
        if (objectAdapter != this.mActionsAdapter) {
            this.mActionsAdapter = objectAdapter;
            if (objectAdapter.getPresenterSelector() == null) {
                this.mActionsAdapter.setPresenterSelector(this.mDefaultActionPresenter);
            }
            notifyActionsAdapterChanged();
        }
    }

    public final void setImageBitmap(Context context, Bitmap bitmap) {
        this.mImageDrawable = new BitmapDrawable(context.getResources(), bitmap);
        notifyImageDrawableChanged();
    }

    public final void setImageDrawable(Drawable drawable) {
        if (this.mImageDrawable != drawable) {
            this.mImageDrawable = drawable;
            notifyImageDrawableChanged();
        }
    }

    public void setImageScaleUpAllowed(boolean z8) {
        if (z8 != this.mImageScaleUpAllowed) {
            this.mImageScaleUpAllowed = z8;
            notifyImageDrawableChanged();
        }
    }

    public final void setItem(Object obj) {
        if (obj != this.mItem) {
            this.mItem = obj;
            notifyItemChanged();
        }
    }

    @Deprecated
    public final void addAction(int i8, Action action) {
        getArrayObjectAdapter().add(i8, action);
    }
}
