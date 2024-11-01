package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PreferenceGroup extends Preference {
    private static final String TAG = "PreferenceGroup";
    private boolean mAttachedToHierarchy;
    private final Runnable mClearRecycleCacheRunnable;
    private int mCurrentPreferenceOrder;
    private final Handler mHandler;
    final SimpleArrayMap<String, Long> mIdRecycleCache;
    private int mInitialExpandedChildrenCount;
    private OnExpandButtonClickListener mOnExpandButtonClickListener;
    private boolean mOrderingAsAdded;
    private final List<Preference> mPreferences;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes3.dex */
    public interface OnExpandButtonClickListener {
        void onExpandButtonClick();
    }

    /* loaded from: classes3.dex */
    public interface PreferencePositionCallback {
        int getPreferenceAdapterPosition(@NonNull Preference preference);

        int getPreferenceAdapterPosition(@NonNull String str);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.mIdRecycleCache = new SimpleArrayMap<>();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mOrderingAsAdded = true;
        this.mCurrentPreferenceOrder = 0;
        this.mAttachedToHierarchy = false;
        this.mInitialExpandedChildrenCount = Integer.MAX_VALUE;
        this.mOnExpandButtonClickListener = null;
        this.mClearRecycleCacheRunnable = new Runnable() { // from class: androidx.preference.PreferenceGroup.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    PreferenceGroup.this.mIdRecycleCache.clear();
                }
            }
        };
        this.mPreferences = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PreferenceGroup, i8, i9);
        int i10 = R.styleable.PreferenceGroup_orderingFromXml;
        this.mOrderingAsAdded = TypedArrayUtils.getBoolean(obtainStyledAttributes, i10, i10, true);
        int i11 = R.styleable.PreferenceGroup_initialExpandedChildrenCount;
        if (obtainStyledAttributes.hasValue(i11)) {
            setInitialExpandedChildrenCount(TypedArrayUtils.getInt(obtainStyledAttributes, i11, i11, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    private boolean removePreferenceInt(@NonNull Preference preference) {
        boolean remove;
        synchronized (this) {
            try {
                preference.onPrepareForRemoval();
                if (preference.getParent() == this) {
                    preference.assignParent(null);
                }
                remove = this.mPreferences.remove(preference);
                if (remove) {
                    String key = preference.getKey();
                    if (key != null) {
                        this.mIdRecycleCache.put(key, Long.valueOf(preference.getId()));
                        this.mHandler.removeCallbacks(this.mClearRecycleCacheRunnable);
                        this.mHandler.post(this.mClearRecycleCacheRunnable);
                    }
                    if (this.mAttachedToHierarchy) {
                        preference.onDetached();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    public void addItemFromInflater(@NonNull Preference preference) {
        addPreference(preference);
    }

    public boolean addPreference(@NonNull Preference preference) {
        long nextId;
        if (this.mPreferences.contains(preference)) {
            return true;
        }
        if (preference.getKey() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.getParent() != null) {
                preferenceGroup = preferenceGroup.getParent();
            }
            String key = preference.getKey();
            if (preferenceGroup.findPreference(key) != null) {
                Log.e(TAG, "Found duplicated key: \"" + key + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.getOrder() == Integer.MAX_VALUE) {
            if (this.mOrderingAsAdded) {
                int i8 = this.mCurrentPreferenceOrder;
                this.mCurrentPreferenceOrder = i8 + 1;
                preference.setOrder(i8);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).setOrderingAsAdded(this.mOrderingAsAdded);
            }
        }
        int binarySearch = Collections.binarySearch(this.mPreferences, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!onPrepareAddPreference(preference)) {
            return false;
        }
        synchronized (this) {
            this.mPreferences.add(binarySearch, preference);
        }
        PreferenceManager preferenceManager = getPreferenceManager();
        String key2 = preference.getKey();
        if (key2 != null && this.mIdRecycleCache.containsKey(key2)) {
            nextId = this.mIdRecycleCache.get(key2).longValue();
            this.mIdRecycleCache.remove(key2);
        } else {
            nextId = preferenceManager.getNextId();
        }
        preference.onAttachedToHierarchy(preferenceManager, nextId);
        preference.assignParent(this);
        if (this.mAttachedToHierarchy) {
            preference.onAttached();
        }
        notifyHierarchyChanged();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void dispatchRestoreInstanceState(@NonNull Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            getPreference(i8).dispatchRestoreInstanceState(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void dispatchSaveInstanceState(@NonNull Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            getPreference(i8).dispatchSaveInstanceState(bundle);
        }
    }

    @Nullable
    public <T extends Preference> T findPreference(@NonNull CharSequence charSequence) {
        T t8;
        if (charSequence != null) {
            if (TextUtils.equals(getKey(), charSequence)) {
                return this;
            }
            int preferenceCount = getPreferenceCount();
            for (int i8 = 0; i8 < preferenceCount; i8++) {
                PreferenceGroup preferenceGroup = (T) getPreference(i8);
                if (TextUtils.equals(preferenceGroup.getKey(), charSequence)) {
                    return preferenceGroup;
                }
                if ((preferenceGroup instanceof PreferenceGroup) && (t8 = (T) preferenceGroup.findPreference(charSequence)) != null) {
                    return t8;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public int getInitialExpandedChildrenCount() {
        return this.mInitialExpandedChildrenCount;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public OnExpandButtonClickListener getOnExpandButtonClickListener() {
        return this.mOnExpandButtonClickListener;
    }

    @NonNull
    public Preference getPreference(int i8) {
        return this.mPreferences.get(i8);
    }

    public int getPreferenceCount() {
        return this.mPreferences.size();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAttached() {
        return this.mAttachedToHierarchy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isOnSameScreenAsChildren() {
        return true;
    }

    public boolean isOrderingAsAdded() {
        return this.mOrderingAsAdded;
    }

    @Override // androidx.preference.Preference
    public void notifyDependencyChange(boolean z8) {
        super.notifyDependencyChange(z8);
        int preferenceCount = getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            getPreference(i8).onParentChanged(this, z8);
        }
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        this.mAttachedToHierarchy = true;
        int preferenceCount = getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            getPreference(i8).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        this.mAttachedToHierarchy = false;
        int preferenceCount = getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            getPreference(i8).onDetached();
        }
    }

    protected boolean onPrepareAddPreference(@NonNull Preference preference) {
        preference.onParentChanged(this, shouldDisableDependents());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            this.mInitialExpandedChildrenCount = savedState.mInitialExpandedChildrenCount;
            super.onRestoreInstanceState(savedState.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    @NonNull
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.mInitialExpandedChildrenCount);
    }

    public void removeAll() {
        synchronized (this) {
            try {
                List<Preference> list = this.mPreferences;
                for (int size = list.size() - 1; size >= 0; size--) {
                    removePreferenceInt(list.get(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyHierarchyChanged();
    }

    public boolean removePreference(@NonNull Preference preference) {
        boolean removePreferenceInt = removePreferenceInt(preference);
        notifyHierarchyChanged();
        return removePreferenceInt;
    }

    public boolean removePreferenceRecursively(@NonNull CharSequence charSequence) {
        Preference findPreference = findPreference(charSequence);
        if (findPreference == null) {
            return false;
        }
        return findPreference.getParent().removePreference(findPreference);
    }

    public void setInitialExpandedChildrenCount(int i8) {
        if (i8 != Integer.MAX_VALUE && !hasKey()) {
            Log.e(TAG, getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.mInitialExpandedChildrenCount = i8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOnExpandButtonClickListener(@Nullable OnExpandButtonClickListener onExpandButtonClickListener) {
        this.mOnExpandButtonClickListener = onExpandButtonClickListener;
    }

    public void setOrderingAsAdded(boolean z8) {
        this.mOrderingAsAdded = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sortPreferences() {
        synchronized (this) {
            Collections.sort(this.mPreferences);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.PreferenceGroup.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }
        };
        int mInitialExpandedChildrenCount;

        SavedState(Parcel parcel) {
            super(parcel);
            this.mInitialExpandedChildrenCount = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.mInitialExpandedChildrenCount);
        }

        SavedState(Parcelable parcelable, int i8) {
            super(parcelable);
            this.mInitialExpandedChildrenCount = i8;
        }
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
