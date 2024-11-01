package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class PreferenceGroupAdapter extends RecyclerView.Adapter<PreferenceViewHolder> implements Preference.OnPreferenceChangeInternalListener, PreferenceGroup.PreferencePositionCallback {
    private final PreferenceGroup mPreferenceGroup;
    private final List<PreferenceResourceDescriptor> mPreferenceResourceDescriptors;
    private List<Preference> mPreferences;
    private List<Preference> mVisiblePreferences;
    private final Runnable mSyncRunnable = new Runnable() { // from class: androidx.preference.PreferenceGroupAdapter.1
        @Override // java.lang.Runnable
        public void run() {
            PreferenceGroupAdapter.this.updatePreferences();
        }
    };
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class PreferenceResourceDescriptor {
        String mClassName;
        int mLayoutResId;
        int mWidgetLayoutResId;

        PreferenceResourceDescriptor(@NonNull Preference preference) {
            this.mClassName = preference.getClass().getName();
            this.mLayoutResId = preference.getLayoutResource();
            this.mWidgetLayoutResId = preference.getWidgetLayoutResource();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PreferenceResourceDescriptor)) {
                return false;
            }
            PreferenceResourceDescriptor preferenceResourceDescriptor = (PreferenceResourceDescriptor) obj;
            if (this.mLayoutResId != preferenceResourceDescriptor.mLayoutResId || this.mWidgetLayoutResId != preferenceResourceDescriptor.mWidgetLayoutResId || !TextUtils.equals(this.mClassName, preferenceResourceDescriptor.mClassName)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((((527 + this.mLayoutResId) * 31) + this.mWidgetLayoutResId) * 31) + this.mClassName.hashCode();
        }
    }

    public PreferenceGroupAdapter(@NonNull PreferenceGroup preferenceGroup) {
        this.mPreferenceGroup = preferenceGroup;
        preferenceGroup.setOnPreferenceChangeInternalListener(this);
        this.mPreferences = new ArrayList();
        this.mVisiblePreferences = new ArrayList();
        this.mPreferenceResourceDescriptors = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).shouldUseGeneratedIds());
        } else {
            setHasStableIds(true);
        }
        updatePreferences();
    }

    private ExpandButton createExpandButton(final PreferenceGroup preferenceGroup, List<Preference> list) {
        ExpandButton expandButton = new ExpandButton(preferenceGroup.getContext(), list, preferenceGroup.getId());
        expandButton.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: androidx.preference.PreferenceGroupAdapter.3
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(@NonNull Preference preference) {
                preferenceGroup.setInitialExpandedChildrenCount(Integer.MAX_VALUE);
                PreferenceGroupAdapter.this.onPreferenceHierarchyChange(preference);
                PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener = preferenceGroup.getOnExpandButtonClickListener();
                if (onExpandButtonClickListener != null) {
                    onExpandButtonClickListener.onExpandButtonClick();
                    return true;
                }
                return true;
            }
        });
        return expandButton;
    }

    private List<Preference> createVisiblePreferencesList(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i8 = 0;
        for (int i9 = 0; i9 < preferenceCount; i9++) {
            Preference preference = preferenceGroup.getPreference(i9);
            if (preference.isVisible()) {
                if (isGroupExpandable(preferenceGroup) && i8 >= preferenceGroup.getInitialExpandedChildrenCount()) {
                    arrayList2.add(preference);
                } else {
                    arrayList.add(preference);
                }
                if (!(preference instanceof PreferenceGroup)) {
                    i8++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                    if (!preferenceGroup2.isOnSameScreenAsChildren()) {
                        continue;
                    } else {
                        if (isGroupExpandable(preferenceGroup) && isGroupExpandable(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference2 : createVisiblePreferencesList(preferenceGroup2)) {
                            if (isGroupExpandable(preferenceGroup) && i8 >= preferenceGroup.getInitialExpandedChildrenCount()) {
                                arrayList2.add(preference2);
                            } else {
                                arrayList.add(preference2);
                            }
                            i8++;
                        }
                    }
                }
            }
        }
        if (isGroupExpandable(preferenceGroup) && i8 > preferenceGroup.getInitialExpandedChildrenCount()) {
            arrayList.add(createExpandButton(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void flattenPreferenceGroup(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.sortPreferences();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            Preference preference = preferenceGroup.getPreference(i8);
            list.add(preference);
            PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(preference);
            if (!this.mPreferenceResourceDescriptors.contains(preferenceResourceDescriptor)) {
                this.mPreferenceResourceDescriptors.add(preferenceResourceDescriptor);
            }
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (preferenceGroup2.isOnSameScreenAsChildren()) {
                    flattenPreferenceGroup(list, preferenceGroup2);
                }
            }
            preference.setOnPreferenceChangeInternalListener(this);
        }
    }

    private boolean isGroupExpandable(PreferenceGroup preferenceGroup) {
        if (preferenceGroup.getInitialExpandedChildrenCount() != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Nullable
    public Preference getItem(int i8) {
        if (i8 >= 0 && i8 < getItemCount()) {
            return this.mVisiblePreferences.get(i8);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mVisiblePreferences.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        if (!hasStableIds()) {
            return -1L;
        }
        return getItem(i8).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(getItem(i8));
        int indexOf = this.mPreferenceResourceDescriptors.indexOf(preferenceResourceDescriptor);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.mPreferenceResourceDescriptors.size();
        this.mPreferenceResourceDescriptors.add(preferenceResourceDescriptor);
        return size;
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public int getPreferenceAdapterPosition(@NonNull String str) {
        int size = this.mVisiblePreferences.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (TextUtils.equals(str, this.mVisiblePreferences.get(i8).getKey())) {
                return i8;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceChange(@NonNull Preference preference) {
        int indexOf = this.mVisiblePreferences.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceHierarchyChange(@NonNull Preference preference) {
        this.mHandler.removeCallbacks(this.mSyncRunnable);
        this.mHandler.post(this.mSyncRunnable);
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceVisibilityChange(@NonNull Preference preference) {
        onPreferenceHierarchyChange(preference);
    }

    void updatePreferences() {
        Iterator<Preference> it = this.mPreferences.iterator();
        while (it.hasNext()) {
            it.next().setOnPreferenceChangeInternalListener(null);
        }
        ArrayList arrayList = new ArrayList(this.mPreferences.size());
        this.mPreferences = arrayList;
        flattenPreferenceGroup(arrayList, this.mPreferenceGroup);
        final List<Preference> list = this.mVisiblePreferences;
        final List<Preference> createVisiblePreferencesList = createVisiblePreferencesList(this.mPreferenceGroup);
        this.mVisiblePreferences = createVisiblePreferencesList;
        PreferenceManager preferenceManager = this.mPreferenceGroup.getPreferenceManager();
        if (preferenceManager != null && preferenceManager.getPreferenceComparisonCallback() != null) {
            final PreferenceManager.PreferenceComparisonCallback preferenceComparisonCallback = preferenceManager.getPreferenceComparisonCallback();
            DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: androidx.preference.PreferenceGroupAdapter.2
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areContentsTheSame(int i8, int i9) {
                    return preferenceComparisonCallback.arePreferenceContentsTheSame((Preference) list.get(i8), (Preference) createVisiblePreferencesList.get(i9));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areItemsTheSame(int i8, int i9) {
                    return preferenceComparisonCallback.arePreferenceItemsTheSame((Preference) list.get(i8), (Preference) createVisiblePreferencesList.get(i9));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getNewListSize() {
                    return createVisiblePreferencesList.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getOldListSize() {
                    return list.size();
                }
            }).dispatchUpdatesTo(this);
        } else {
            notifyDataSetChanged();
        }
        Iterator<Preference> it2 = this.mPreferences.iterator();
        while (it2.hasNext()) {
            it2.next().clearWasDetached();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder, int i8) {
        Preference item = getItem(i8);
        preferenceViewHolder.resetState();
        item.onBindViewHolder(preferenceViewHolder);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public PreferenceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i8) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = this.mPreferenceResourceDescriptors.get(i8);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = AppCompatResources.getDrawable(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(preferenceResourceDescriptor.mLayoutResId, viewGroup, false);
        if (inflate.getBackground() == null) {
            ViewCompat.setBackground(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i9 = preferenceResourceDescriptor.mWidgetLayoutResId;
            if (i9 != 0) {
                from.inflate(i9, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new PreferenceViewHolder(inflate);
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public int getPreferenceAdapterPosition(@NonNull Preference preference) {
        int size = this.mVisiblePreferences.size();
        for (int i8 = 0; i8 < size; i8++) {
            Preference preference2 = this.mVisiblePreferences.get(i8);
            if (preference2 != null && preference2.equals(preference)) {
                return i8;
            }
        }
        return -1;
    }
}
