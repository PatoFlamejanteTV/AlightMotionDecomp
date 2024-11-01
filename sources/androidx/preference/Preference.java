package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class Preference implements Comparable<Preference> {
    private static final String CLIPBOARD_ID = "Preference";
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;
    private boolean mBaseMethodCalled;
    private final View.OnClickListener mClickListener;

    @NonNull
    private final Context mContext;
    private boolean mCopyingEnabled;
    private Object mDefaultValue;
    private String mDependencyKey;
    private boolean mDependencyMet;
    private List<Preference> mDependents;
    private boolean mEnabled;
    private Bundle mExtras;
    private String mFragment;
    private boolean mHasId;
    private boolean mHasSingleLineTitleAttr;
    private Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private Intent mIntent;
    private String mKey;
    private int mLayoutResId;
    private OnPreferenceChangeInternalListener mListener;
    private OnPreferenceChangeListener mOnChangeListener;
    private OnPreferenceClickListener mOnClickListener;
    private OnPreferenceCopyListener mOnCopyListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private PreferenceGroup mParentGroup;
    private boolean mPersistent;

    @Nullable
    private PreferenceDataStore mPreferenceDataStore;

    @Nullable
    private PreferenceManager mPreferenceManager;
    private boolean mRequiresKey;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private CharSequence mSummary;
    private SummaryProvider mSummaryProvider;
    private CharSequence mTitle;
    private int mViewId;
    private boolean mVisible;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    /* loaded from: classes3.dex */
    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new Parcelable.Creator<BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BaseSavedState[] newArray(int i8) {
                return new BaseSavedState[i8];
            }
        };

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface OnPreferenceChangeInternalListener {
        void onPreferenceChange(@NonNull Preference preference);

        void onPreferenceHierarchyChange(@NonNull Preference preference);

        void onPreferenceVisibilityChange(@NonNull Preference preference);
    }

    /* loaded from: classes3.dex */
    public interface OnPreferenceChangeListener {
        boolean onPreferenceChange(@NonNull Preference preference, Object obj);
    }

    /* loaded from: classes3.dex */
    public interface OnPreferenceClickListener {
        boolean onPreferenceClick(@NonNull Preference preference);
    }

    /* loaded from: classes3.dex */
    private static class OnPreferenceCopyListener implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        private final Preference mPreference;

        OnPreferenceCopyListener(@NonNull Preference preference) {
            this.mPreference = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence summary = this.mPreference.getSummary();
            if (this.mPreference.isCopyingEnabled() && !TextUtils.isEmpty(summary)) {
                contextMenu.setHeaderTitle(summary);
                contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.mPreference.getContext().getSystemService("clipboard");
            CharSequence summary = this.mPreference.getSummary();
            clipboardManager.setPrimaryClip(ClipData.newPlainText(Preference.CLIPBOARD_ID, summary));
            Toast.makeText(this.mPreference.getContext(), this.mPreference.getContext().getString(R.string.preference_copied, summary), 0).show();
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface SummaryProvider<T extends Preference> {
        @Nullable
        CharSequence provideSummary(@NonNull T t8);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8, int i9) {
        this.mOrder = Integer.MAX_VALUE;
        this.mViewId = 0;
        this.mEnabled = true;
        this.mSelectable = true;
        this.mPersistent = true;
        this.mDependencyMet = true;
        this.mParentDependencyMet = true;
        this.mVisible = true;
        this.mAllowDividerAbove = true;
        this.mAllowDividerBelow = true;
        this.mSingleLineTitle = true;
        this.mShouldDisableView = true;
        int i10 = R.layout.preference;
        this.mLayoutResId = i10;
        this.mClickListener = new View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Preference.this.performClick(view);
            }
        };
        this.mContext = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i8, i9);
        this.mIconResId = TypedArrayUtils.getResourceId(obtainStyledAttributes, R.styleable.Preference_icon, R.styleable.Preference_android_icon, 0);
        this.mKey = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.Preference_key, R.styleable.Preference_android_key);
        this.mTitle = TypedArrayUtils.getText(obtainStyledAttributes, R.styleable.Preference_title, R.styleable.Preference_android_title);
        this.mSummary = TypedArrayUtils.getText(obtainStyledAttributes, R.styleable.Preference_summary, R.styleable.Preference_android_summary);
        this.mOrder = TypedArrayUtils.getInt(obtainStyledAttributes, R.styleable.Preference_order, R.styleable.Preference_android_order, Integer.MAX_VALUE);
        this.mFragment = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.Preference_fragment, R.styleable.Preference_android_fragment);
        this.mLayoutResId = TypedArrayUtils.getResourceId(obtainStyledAttributes, R.styleable.Preference_layout, R.styleable.Preference_android_layout, i10);
        this.mWidgetLayoutResId = TypedArrayUtils.getResourceId(obtainStyledAttributes, R.styleable.Preference_widgetLayout, R.styleable.Preference_android_widgetLayout, 0);
        this.mEnabled = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_enabled, R.styleable.Preference_android_enabled, true);
        this.mSelectable = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_selectable, R.styleable.Preference_android_selectable, true);
        this.mPersistent = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_persistent, R.styleable.Preference_android_persistent, true);
        this.mDependencyKey = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.Preference_dependency, R.styleable.Preference_android_dependency);
        int i11 = R.styleable.Preference_allowDividerAbove;
        this.mAllowDividerAbove = TypedArrayUtils.getBoolean(obtainStyledAttributes, i11, i11, this.mSelectable);
        int i12 = R.styleable.Preference_allowDividerBelow;
        this.mAllowDividerBelow = TypedArrayUtils.getBoolean(obtainStyledAttributes, i12, i12, this.mSelectable);
        int i13 = R.styleable.Preference_defaultValue;
        if (obtainStyledAttributes.hasValue(i13)) {
            this.mDefaultValue = onGetDefaultValue(obtainStyledAttributes, i13);
        } else {
            int i14 = R.styleable.Preference_android_defaultValue;
            if (obtainStyledAttributes.hasValue(i14)) {
                this.mDefaultValue = onGetDefaultValue(obtainStyledAttributes, i14);
            }
        }
        this.mShouldDisableView = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_shouldDisableView, R.styleable.Preference_android_shouldDisableView, true);
        int i15 = R.styleable.Preference_singleLineTitle;
        boolean hasValue = obtainStyledAttributes.hasValue(i15);
        this.mHasSingleLineTitleAttr = hasValue;
        if (hasValue) {
            this.mSingleLineTitle = TypedArrayUtils.getBoolean(obtainStyledAttributes, i15, R.styleable.Preference_android_singleLineTitle, true);
        }
        this.mIconSpaceReserved = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_iconSpaceReserved, R.styleable.Preference_android_iconSpaceReserved, false);
        int i16 = R.styleable.Preference_isPreferenceVisible;
        this.mVisible = TypedArrayUtils.getBoolean(obtainStyledAttributes, i16, i16, true);
        int i17 = R.styleable.Preference_enableCopying;
        this.mCopyingEnabled = TypedArrayUtils.getBoolean(obtainStyledAttributes, i17, i17, false);
        obtainStyledAttributes.recycle();
    }

    private void dispatchSetInitialValue() {
        if (getPreferenceDataStore() != null) {
            onSetInitialValue(true, this.mDefaultValue);
            return;
        }
        if (shouldPersist() && getSharedPreferences().contains(this.mKey)) {
            onSetInitialValue(true, null);
            return;
        }
        Object obj = this.mDefaultValue;
        if (obj != null) {
            onSetInitialValue(false, obj);
        }
    }

    private void registerDependency() {
        if (TextUtils.isEmpty(this.mDependencyKey)) {
            return;
        }
        Preference findPreferenceInHierarchy = findPreferenceInHierarchy(this.mDependencyKey);
        if (findPreferenceInHierarchy != null) {
            findPreferenceInHierarchy.registerDependent(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.mDependencyKey + "\" not found for preference \"" + this.mKey + "\" (title: \"" + ((Object) this.mTitle) + "\"");
    }

    private void registerDependent(Preference preference) {
        if (this.mDependents == null) {
            this.mDependents = new ArrayList();
        }
        this.mDependents.add(preference);
        preference.onDependencyChanged(this, shouldDisableDependents());
    }

    private void setEnabledStateOnViews(@NonNull View view, boolean z8) {
        view.setEnabled(z8);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                setEnabledStateOnViews(viewGroup.getChildAt(childCount), z8);
            }
        }
    }

    private void tryCommit(@NonNull SharedPreferences.Editor editor) {
        if (this.mPreferenceManager.shouldCommit()) {
            editor.apply();
        }
    }

    private void unregisterDependency() {
        Preference findPreferenceInHierarchy;
        String str = this.mDependencyKey;
        if (str != null && (findPreferenceInHierarchy = findPreferenceInHierarchy(str)) != null) {
            findPreferenceInHierarchy.unregisterDependent(this);
        }
    }

    private void unregisterDependent(Preference preference) {
        List<Preference> list = this.mDependents;
        if (list != null) {
            list.remove(preference);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void assignParent(@Nullable PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.mParentGroup != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.mParentGroup = preferenceGroup;
    }

    public boolean callChangeListener(Object obj) {
        OnPreferenceChangeListener onPreferenceChangeListener = this.mOnChangeListener;
        if (onPreferenceChangeListener != null && !onPreferenceChangeListener.onPreferenceChange(this, obj)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void clearWasDetached() {
        this.mWasDetached = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchRestoreInstanceState(@NonNull Bundle bundle) {
        Parcelable parcelable;
        if (hasKey() && (parcelable = bundle.getParcelable(this.mKey)) != null) {
            this.mBaseMethodCalled = false;
            onRestoreInstanceState(parcelable);
            if (!this.mBaseMethodCalled) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchSaveInstanceState(@NonNull Bundle bundle) {
        if (hasKey()) {
            this.mBaseMethodCalled = false;
            Parcelable onSaveInstanceState = onSaveInstanceState();
            if (this.mBaseMethodCalled) {
                if (onSaveInstanceState != null) {
                    bundle.putParcelable(this.mKey, onSaveInstanceState);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
    }

    @Nullable
    protected <T extends Preference> T findPreferenceInHierarchy(@NonNull String str) {
        PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(str);
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    @Nullable
    public String getDependency() {
        return this.mDependencyKey;
    }

    @NonNull
    public Bundle getExtras() {
        if (this.mExtras == null) {
            this.mExtras = new Bundle();
        }
        return this.mExtras;
    }

    @NonNull
    StringBuilder getFilterableStringBuilder() {
        StringBuilder sb = new StringBuilder();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            sb.append(title);
            sb.append(' ');
        }
        CharSequence summary = getSummary();
        if (!TextUtils.isEmpty(summary)) {
            sb.append(summary);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    @Nullable
    public String getFragment() {
        return this.mFragment;
    }

    @Nullable
    public Drawable getIcon() {
        int i8;
        if (this.mIcon == null && (i8 = this.mIconResId) != 0) {
            this.mIcon = AppCompatResources.getDrawable(this.mContext, i8);
        }
        return this.mIcon;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getId() {
        return this.mId;
    }

    @Nullable
    public Intent getIntent() {
        return this.mIntent;
    }

    public String getKey() {
        return this.mKey;
    }

    public final int getLayoutResource() {
        return this.mLayoutResId;
    }

    @Nullable
    public OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return this.mOnChangeListener;
    }

    @Nullable
    public OnPreferenceClickListener getOnPreferenceClickListener() {
        return this.mOnClickListener;
    }

    public int getOrder() {
        return this.mOrder;
    }

    @Nullable
    public PreferenceGroup getParent() {
        return this.mParentGroup;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getPersistedBoolean(boolean z8) {
        if (!shouldPersist()) {
            return z8;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getBoolean(this.mKey, z8);
        }
        return this.mPreferenceManager.getSharedPreferences().getBoolean(this.mKey, z8);
    }

    protected float getPersistedFloat(float f8) {
        if (!shouldPersist()) {
            return f8;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getFloat(this.mKey, f8);
        }
        return this.mPreferenceManager.getSharedPreferences().getFloat(this.mKey, f8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getPersistedInt(int i8) {
        if (!shouldPersist()) {
            return i8;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getInt(this.mKey, i8);
        }
        return this.mPreferenceManager.getSharedPreferences().getInt(this.mKey, i8);
    }

    protected long getPersistedLong(long j8) {
        if (!shouldPersist()) {
            return j8;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getLong(this.mKey, j8);
        }
        return this.mPreferenceManager.getSharedPreferences().getLong(this.mKey, j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getPersistedString(String str) {
        if (!shouldPersist()) {
            return str;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getString(this.mKey, str);
        }
        return this.mPreferenceManager.getSharedPreferences().getString(this.mKey, str);
    }

    public Set<String> getPersistedStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return set;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getStringSet(this.mKey, set);
        }
        return this.mPreferenceManager.getSharedPreferences().getStringSet(this.mKey, set);
    }

    @Nullable
    public PreferenceDataStore getPreferenceDataStore() {
        PreferenceDataStore preferenceDataStore = this.mPreferenceDataStore;
        if (preferenceDataStore != null) {
            return preferenceDataStore;
        }
        PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager != null) {
            return preferenceManager.getPreferenceDataStore();
        }
        return null;
    }

    public PreferenceManager getPreferenceManager() {
        return this.mPreferenceManager;
    }

    @Nullable
    public SharedPreferences getSharedPreferences() {
        if (this.mPreferenceManager != null && getPreferenceDataStore() == null) {
            return this.mPreferenceManager.getSharedPreferences();
        }
        return null;
    }

    public boolean getShouldDisableView() {
        return this.mShouldDisableView;
    }

    @Nullable
    public CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        return this.mSummary;
    }

    @Nullable
    public final SummaryProvider getSummaryProvider() {
        return this.mSummaryProvider;
    }

    @Nullable
    public CharSequence getTitle() {
        return this.mTitle;
    }

    public final int getWidgetLayoutResource() {
        return this.mWidgetLayoutResId;
    }

    public boolean hasKey() {
        return !TextUtils.isEmpty(this.mKey);
    }

    public boolean isCopyingEnabled() {
        return this.mCopyingEnabled;
    }

    public boolean isEnabled() {
        if (this.mEnabled && this.mDependencyMet && this.mParentDependencyMet) {
            return true;
        }
        return false;
    }

    public boolean isIconSpaceReserved() {
        return this.mIconSpaceReserved;
    }

    public boolean isPersistent() {
        return this.mPersistent;
    }

    public boolean isSelectable() {
        return this.mSelectable;
    }

    public final boolean isShown() {
        if (!isVisible() || getPreferenceManager() == null) {
            return false;
        }
        if (this == getPreferenceManager().getPreferenceScreen()) {
            return true;
        }
        PreferenceGroup parent = getParent();
        if (parent == null) {
            return false;
        }
        return parent.isShown();
    }

    public boolean isSingleLineTitle() {
        return this.mSingleLineTitle;
    }

    public final boolean isVisible() {
        return this.mVisible;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyChanged() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceChange(this);
        }
    }

    public void notifyDependencyChange(boolean z8) {
        List<Preference> list = this.mDependents;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).onDependencyChanged(this, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyHierarchyChanged() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceHierarchyChange(this);
        }
    }

    public void onAttached() {
        registerDependency();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAttachedToHierarchy(@NonNull PreferenceManager preferenceManager) {
        this.mPreferenceManager = preferenceManager;
        if (!this.mHasId) {
            this.mId = preferenceManager.getNextId();
        }
        dispatchSetInitialValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBindViewHolder(@androidx.annotation.NonNull androidx.preference.PreferenceViewHolder r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.onBindViewHolder(androidx.preference.PreferenceViewHolder):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onClick() {
    }

    public void onDependencyChanged(@NonNull Preference preference, boolean z8) {
        if (this.mDependencyMet == z8) {
            this.mDependencyMet = !z8;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onDetached() {
        unregisterDependency();
        this.mWasDetached = true;
    }

    @Nullable
    protected Object onGetDefaultValue(@NonNull TypedArray typedArray, int i8) {
        return null;
    }

    @CallSuper
    @Deprecated
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void onParentChanged(@NonNull Preference preference, boolean z8) {
        if (this.mParentDependencyMet == z8) {
            this.mParentDependencyMet = !z8;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPrepareForRemoval() {
        unregisterDependency();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        this.mBaseMethodCalled = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public Parcelable onSaveInstanceState() {
        this.mBaseMethodCalled = true;
        return AbsSavedState.EMPTY_STATE;
    }

    protected void onSetInitialValue(@Nullable Object obj) {
    }

    @Nullable
    public Bundle peekExtras() {
        return this.mExtras;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void performClick(@NonNull View view) {
        performClick();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean persistBoolean(boolean z8) {
        if (!shouldPersist()) {
            return false;
        }
        if (z8 == getPersistedBoolean(!z8)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putBoolean(this.mKey, z8);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putBoolean(this.mKey, z8);
            tryCommit(editor);
        }
        return true;
    }

    protected boolean persistFloat(float f8) {
        if (!shouldPersist()) {
            return false;
        }
        if (f8 == getPersistedFloat(Float.NaN)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putFloat(this.mKey, f8);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putFloat(this.mKey, f8);
            tryCommit(editor);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean persistInt(int i8) {
        if (!shouldPersist()) {
            return false;
        }
        if (i8 == getPersistedInt(~i8)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putInt(this.mKey, i8);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putInt(this.mKey, i8);
            tryCommit(editor);
        }
        return true;
    }

    protected boolean persistLong(long j8) {
        if (!shouldPersist()) {
            return false;
        }
        if (j8 == getPersistedLong(~j8)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putLong(this.mKey, j8);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putLong(this.mKey, j8);
            tryCommit(editor);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean persistString(String str) {
        if (!shouldPersist()) {
            return false;
        }
        if (TextUtils.equals(str, getPersistedString(null))) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putString(this.mKey, str);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putString(this.mKey, str);
            tryCommit(editor);
        }
        return true;
    }

    public boolean persistStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return false;
        }
        if (set.equals(getPersistedStringSet(null))) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putStringSet(this.mKey, set);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putStringSet(this.mKey, set);
            tryCommit(editor);
        }
        return true;
    }

    void requireKey() {
        if (!TextUtils.isEmpty(this.mKey)) {
            this.mRequiresKey = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }

    public void restoreHierarchyState(@NonNull Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveHierarchyState(@NonNull Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCopyingEnabled(boolean z8) {
        if (this.mCopyingEnabled != z8) {
            this.mCopyingEnabled = z8;
            notifyChanged();
        }
    }

    public void setDefaultValue(Object obj) {
        this.mDefaultValue = obj;
    }

    public void setDependency(@Nullable String str) {
        unregisterDependency();
        this.mDependencyKey = str;
        registerDependency();
    }

    public void setEnabled(boolean z8) {
        if (this.mEnabled != z8) {
            this.mEnabled = z8;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void setFragment(@Nullable String str) {
        this.mFragment = str;
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.mIcon != drawable) {
            this.mIcon = drawable;
            this.mIconResId = 0;
            notifyChanged();
        }
    }

    public void setIconSpaceReserved(boolean z8) {
        if (this.mIconSpaceReserved != z8) {
            this.mIconSpaceReserved = z8;
            notifyChanged();
        }
    }

    public void setIntent(@Nullable Intent intent) {
        this.mIntent = intent;
    }

    public void setKey(String str) {
        this.mKey = str;
        if (this.mRequiresKey && !hasKey()) {
            requireKey();
        }
    }

    public void setLayoutResource(int i8) {
        this.mLayoutResId = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setOnPreferenceChangeInternalListener(@Nullable OnPreferenceChangeInternalListener onPreferenceChangeInternalListener) {
        this.mListener = onPreferenceChangeInternalListener;
    }

    public void setOnPreferenceChangeListener(@Nullable OnPreferenceChangeListener onPreferenceChangeListener) {
        this.mOnChangeListener = onPreferenceChangeListener;
    }

    public void setOnPreferenceClickListener(@Nullable OnPreferenceClickListener onPreferenceClickListener) {
        this.mOnClickListener = onPreferenceClickListener;
    }

    public void setOrder(int i8) {
        if (i8 != this.mOrder) {
            this.mOrder = i8;
            notifyHierarchyChanged();
        }
    }

    public void setPersistent(boolean z8) {
        this.mPersistent = z8;
    }

    public void setPreferenceDataStore(@Nullable PreferenceDataStore preferenceDataStore) {
        this.mPreferenceDataStore = preferenceDataStore;
    }

    public void setSelectable(boolean z8) {
        if (this.mSelectable != z8) {
            this.mSelectable = z8;
            notifyChanged();
        }
    }

    public void setShouldDisableView(boolean z8) {
        if (this.mShouldDisableView != z8) {
            this.mShouldDisableView = z8;
            notifyChanged();
        }
    }

    public void setSingleLineTitle(boolean z8) {
        this.mHasSingleLineTitleAttr = true;
        this.mSingleLineTitle = z8;
    }

    public void setSummary(@Nullable CharSequence charSequence) {
        if (getSummaryProvider() == null) {
            if (TextUtils.equals(this.mSummary, charSequence)) {
                return;
            }
            this.mSummary = charSequence;
            notifyChanged();
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public final void setSummaryProvider(@Nullable SummaryProvider summaryProvider) {
        this.mSummaryProvider = summaryProvider;
        notifyChanged();
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.mTitle)) {
            return;
        }
        this.mTitle = charSequence;
        notifyChanged();
    }

    public void setViewId(int i8) {
        this.mViewId = i8;
    }

    public final void setVisible(boolean z8) {
        if (this.mVisible != z8) {
            this.mVisible = z8;
            OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
            if (onPreferenceChangeInternalListener != null) {
                onPreferenceChangeInternalListener.onPreferenceVisibilityChange(this);
            }
        }
    }

    public void setWidgetLayoutResource(int i8) {
        this.mWidgetLayoutResId = i8;
    }

    public boolean shouldDisableDependents() {
        return !isEnabled();
    }

    protected boolean shouldPersist() {
        if (this.mPreferenceManager != null && isPersistent() && hasKey()) {
            return true;
        }
        return false;
    }

    @NonNull
    public String toString() {
        return getFilterableStringBuilder().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean wasDetached() {
        return this.mWasDetached;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Preference preference) {
        int i8 = this.mOrder;
        int i9 = preference.mOrder;
        if (i8 != i9) {
            return i8 - i9;
        }
        CharSequence charSequence = this.mTitle;
        CharSequence charSequence2 = preference.mTitle;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.mTitle.toString());
    }

    @Deprecated
    protected void onSetInitialValue(boolean z8, Object obj) {
        onSetInitialValue(obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void performClick() {
        PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener;
        if (isEnabled() && isSelectable()) {
            onClick();
            OnPreferenceClickListener onPreferenceClickListener = this.mOnClickListener;
            if (onPreferenceClickListener == null || !onPreferenceClickListener.onPreferenceClick(this)) {
                PreferenceManager preferenceManager = getPreferenceManager();
                if ((preferenceManager == null || (onPreferenceTreeClickListener = preferenceManager.getOnPreferenceTreeClickListener()) == null || !onPreferenceTreeClickListener.onPreferenceTreeClick(this)) && this.mIntent != null) {
                    getContext().startActivity(this.mIntent);
                }
            }
        }
    }

    public void setTitle(int i8) {
        setTitle(this.mContext.getString(i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onAttachedToHierarchy(@NonNull PreferenceManager preferenceManager, long j8) {
        this.mId = j8;
        this.mHasId = true;
        try {
            onAttachedToHierarchy(preferenceManager);
        } finally {
            this.mHasId = false;
        }
    }

    public void setIcon(int i8) {
        setIcon(AppCompatResources.getDrawable(this.mContext, i8));
        this.mIconResId = i8;
    }

    public void setSummary(int i8) {
        setSummary(this.mContext.getString(i8));
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(@NonNull Context context) {
        this(context, null);
    }
}
