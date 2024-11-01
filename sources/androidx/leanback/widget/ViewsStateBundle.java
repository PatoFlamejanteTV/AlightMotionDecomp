package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.collection.LruCache;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ViewsStateBundle {
    public static final int LIMIT_DEFAULT = 100;
    public static final int UNLIMITED = Integer.MAX_VALUE;
    private LruCache<String, SparseArray<Parcelable>> mChildStates;
    private int mSavePolicy = 0;
    private int mLimitNumber = 100;

    static String getSaveStatesKey(int i8) {
        return Integer.toString(i8);
    }

    protected void applyPolicyChanges() {
        int i8 = this.mSavePolicy;
        if (i8 == 2) {
            if (this.mLimitNumber > 0) {
                LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
                if (lruCache == null || lruCache.maxSize() != this.mLimitNumber) {
                    this.mChildStates = new LruCache<>(this.mLimitNumber);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        if (i8 != 3 && i8 != 1) {
            this.mChildStates = null;
            return;
        }
        LruCache<String, SparseArray<Parcelable>> lruCache2 = this.mChildStates;
        if (lruCache2 == null || lruCache2.maxSize() != Integer.MAX_VALUE) {
            this.mChildStates = new LruCache<>(Integer.MAX_VALUE);
        }
    }

    public void clear() {
        LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    public final int getLimitNumber() {
        return this.mLimitNumber;
    }

    public final int getSavePolicy() {
        return this.mSavePolicy;
    }

    public final void loadFromBundle(Bundle bundle) {
        LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
        if (lruCache != null && bundle != null) {
            lruCache.evictAll();
            for (String str : bundle.keySet()) {
                this.mChildStates.put(str, bundle.getSparseParcelableArray(str));
            }
        }
    }

    public final void loadView(View view, int i8) {
        if (this.mChildStates != null) {
            SparseArray<Parcelable> remove = this.mChildStates.remove(getSaveStatesKey(i8));
            if (remove != null) {
                view.restoreHierarchyState(remove);
            }
        }
    }

    public void remove(int i8) {
        LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
        if (lruCache != null && lruCache.size() != 0) {
            this.mChildStates.remove(getSaveStatesKey(i8));
        }
    }

    public final Bundle saveAsBundle() {
        LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
        if (lruCache != null && lruCache.size() != 0) {
            Map<String, SparseArray<Parcelable>> snapshot = this.mChildStates.snapshot();
            Bundle bundle = new Bundle();
            for (Map.Entry<String, SparseArray<Parcelable>> entry : snapshot.entrySet()) {
                bundle.putSparseParcelableArray(entry.getKey(), entry.getValue());
            }
            return bundle;
        }
        return null;
    }

    public final void saveOffscreenView(View view, int i8) {
        int i9 = this.mSavePolicy;
        if (i9 != 1) {
            if (i9 == 2 || i9 == 3) {
                saveViewUnchecked(view, i8);
                return;
            }
            return;
        }
        remove(i8);
    }

    public final Bundle saveOnScreenView(Bundle bundle, View view, int i8) {
        if (this.mSavePolicy != 0) {
            String saveStatesKey = getSaveStatesKey(i8);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(saveStatesKey, sparseArray);
        }
        return bundle;
    }

    protected final void saveViewUnchecked(View view, int i8) {
        if (this.mChildStates != null) {
            String saveStatesKey = getSaveStatesKey(i8);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            this.mChildStates.put(saveStatesKey, sparseArray);
        }
    }

    public final void setLimitNumber(int i8) {
        this.mLimitNumber = i8;
        applyPolicyChanges();
    }

    public final void setSavePolicy(int i8) {
        this.mSavePolicy = i8;
        applyPolicyChanges();
    }
}
