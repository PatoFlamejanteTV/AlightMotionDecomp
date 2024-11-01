package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;

/* loaded from: classes3.dex */
public class PreferenceManager {
    public static final String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
    private static final int STORAGE_DEFAULT = 0;
    private static final int STORAGE_DEVICE_PROTECTED = 1;
    private final Context mContext;

    @Nullable
    private SharedPreferences.Editor mEditor;
    private boolean mNoCommit;
    private OnDisplayPreferenceDialogListener mOnDisplayPreferenceDialogListener;
    private OnNavigateToScreenListener mOnNavigateToScreenListener;
    private OnPreferenceTreeClickListener mOnPreferenceTreeClickListener;
    private PreferenceComparisonCallback mPreferenceComparisonCallback;

    @Nullable
    private PreferenceDataStore mPreferenceDataStore;
    private PreferenceScreen mPreferenceScreen;

    @Nullable
    private SharedPreferences mSharedPreferences;
    private int mSharedPreferencesMode;
    private String mSharedPreferencesName;
    private long mNextId = 0;
    private int mStorage = 0;

    /* loaded from: classes3.dex */
    public interface OnDisplayPreferenceDialogListener {
        void onDisplayPreferenceDialog(@NonNull Preference preference);
    }

    /* loaded from: classes3.dex */
    public interface OnNavigateToScreenListener {
        void onNavigateToScreen(@NonNull PreferenceScreen preferenceScreen);
    }

    /* loaded from: classes3.dex */
    public interface OnPreferenceTreeClickListener {
        boolean onPreferenceTreeClick(@NonNull Preference preference);
    }

    /* loaded from: classes3.dex */
    public static abstract class PreferenceComparisonCallback {
        public abstract boolean arePreferenceContentsTheSame(@NonNull Preference preference, @NonNull Preference preference2);

        public abstract boolean arePreferenceItemsTheSame(@NonNull Preference preference, @NonNull Preference preference2);
    }

    /* loaded from: classes3.dex */
    public static class SimplePreferenceComparisonCallback extends PreferenceComparisonCallback {
        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceContentsTheSame(@NonNull Preference preference, @NonNull Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.wasDetached()) || !TextUtils.equals(preference.getTitle(), preference2.getTitle()) || !TextUtils.equals(preference.getSummary(), preference2.getSummary())) {
                return false;
            }
            Drawable icon = preference.getIcon();
            Drawable icon2 = preference2.getIcon();
            if ((icon != icon2 && (icon == null || !icon.equals(icon2))) || preference.isEnabled() != preference2.isEnabled() || preference.isSelectable() != preference2.isSelectable()) {
                return false;
            }
            if ((preference instanceof TwoStatePreference) && ((TwoStatePreference) preference).isChecked() != ((TwoStatePreference) preference2).isChecked()) {
                return false;
            }
            if ((preference instanceof DropDownPreference) && preference != preference2) {
                return false;
            }
            return true;
        }

        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceItemsTheSame(@NonNull Preference preference, @NonNull Preference preference2) {
            if (preference.getId() == preference2.getId()) {
                return true;
            }
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceManager(@NonNull Context context) {
        this.mContext = context;
        setSharedPreferencesName(getDefaultSharedPreferencesName(context));
    }

    public static SharedPreferences getDefaultSharedPreferences(@NonNull Context context) {
        return context.getSharedPreferences(getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode());
    }

    private static int getDefaultSharedPreferencesMode() {
        return 0;
    }

    private static String getDefaultSharedPreferencesName(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static void setDefaultValues(@NonNull Context context, int i8, boolean z8) {
        setDefaultValues(context, getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode(), i8, z8);
    }

    private void setNoCommit(boolean z8) {
        SharedPreferences.Editor editor;
        if (!z8 && (editor = this.mEditor) != null) {
            editor.apply();
        }
        this.mNoCommit = z8;
    }

    @NonNull
    public PreferenceScreen createPreferenceScreen(@NonNull Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.onAttachedToHierarchy(this);
        return preferenceScreen;
    }

    @Nullable
    public <T extends Preference> T findPreference(@NonNull CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.mPreferenceScreen;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.findPreference(charSequence);
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public SharedPreferences.Editor getEditor() {
        if (this.mPreferenceDataStore != null) {
            return null;
        }
        if (this.mNoCommit) {
            if (this.mEditor == null) {
                this.mEditor = getSharedPreferences().edit();
            }
            return this.mEditor;
        }
        return getSharedPreferences().edit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNextId() {
        long j8;
        synchronized (this) {
            j8 = this.mNextId;
            this.mNextId = 1 + j8;
        }
        return j8;
    }

    @Nullable
    public OnDisplayPreferenceDialogListener getOnDisplayPreferenceDialogListener() {
        return this.mOnDisplayPreferenceDialogListener;
    }

    @Nullable
    public OnNavigateToScreenListener getOnNavigateToScreenListener() {
        return this.mOnNavigateToScreenListener;
    }

    @Nullable
    public OnPreferenceTreeClickListener getOnPreferenceTreeClickListener() {
        return this.mOnPreferenceTreeClickListener;
    }

    @Nullable
    public PreferenceComparisonCallback getPreferenceComparisonCallback() {
        return this.mPreferenceComparisonCallback;
    }

    @Nullable
    public PreferenceDataStore getPreferenceDataStore() {
        return this.mPreferenceDataStore;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceScreen;
    }

    @Nullable
    public SharedPreferences getSharedPreferences() {
        Context createDeviceProtectedStorageContext;
        if (getPreferenceDataStore() != null) {
            return null;
        }
        if (this.mSharedPreferences == null) {
            if (this.mStorage != 1) {
                createDeviceProtectedStorageContext = this.mContext;
            } else {
                createDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(this.mContext);
            }
            this.mSharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences(this.mSharedPreferencesName, this.mSharedPreferencesMode);
        }
        return this.mSharedPreferences;
    }

    public int getSharedPreferencesMode() {
        return this.mSharedPreferencesMode;
    }

    public String getSharedPreferencesName() {
        return this.mSharedPreferencesName;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen inflateFromResource(@NonNull Context context, int i8, @Nullable PreferenceScreen preferenceScreen) {
        setNoCommit(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new PreferenceInflater(context, this).inflate(i8, preferenceScreen);
        preferenceScreen2.onAttachedToHierarchy(this);
        setNoCommit(false);
        return preferenceScreen2;
    }

    public boolean isStorageDefault() {
        if (Build.VERSION.SDK_INT < 24 || this.mStorage == 0) {
            return true;
        }
        return false;
    }

    public boolean isStorageDeviceProtected() {
        if (Build.VERSION.SDK_INT < 24 || this.mStorage != 1) {
            return false;
        }
        return true;
    }

    public void setOnDisplayPreferenceDialogListener(@Nullable OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener) {
        this.mOnDisplayPreferenceDialogListener = onDisplayPreferenceDialogListener;
    }

    public void setOnNavigateToScreenListener(@Nullable OnNavigateToScreenListener onNavigateToScreenListener) {
        this.mOnNavigateToScreenListener = onNavigateToScreenListener;
    }

    public void setOnPreferenceTreeClickListener(@Nullable OnPreferenceTreeClickListener onPreferenceTreeClickListener) {
        this.mOnPreferenceTreeClickListener = onPreferenceTreeClickListener;
    }

    public void setPreferenceComparisonCallback(@Nullable PreferenceComparisonCallback preferenceComparisonCallback) {
        this.mPreferenceComparisonCallback = preferenceComparisonCallback;
    }

    public void setPreferenceDataStore(@Nullable PreferenceDataStore preferenceDataStore) {
        this.mPreferenceDataStore = preferenceDataStore;
    }

    public boolean setPreferences(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.mPreferenceScreen;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.onDetached();
            }
            this.mPreferenceScreen = preferenceScreen;
            return true;
        }
        return false;
    }

    public void setSharedPreferencesMode(int i8) {
        this.mSharedPreferencesMode = i8;
        this.mSharedPreferences = null;
    }

    public void setSharedPreferencesName(String str) {
        this.mSharedPreferencesName = str;
        this.mSharedPreferences = null;
    }

    public void setStorageDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mStorage = 0;
            this.mSharedPreferences = null;
        }
    }

    public void setStorageDeviceProtected() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mStorage = 1;
            this.mSharedPreferences = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldCommit() {
        return !this.mNoCommit;
    }

    public void showDialog(@NonNull Preference preference) {
        OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener = this.mOnDisplayPreferenceDialogListener;
        if (onDisplayPreferenceDialogListener != null) {
            onDisplayPreferenceDialogListener.onDisplayPreferenceDialog(preference);
        }
    }

    public static void setDefaultValues(@NonNull Context context, String str, int i8, int i9, boolean z8) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(KEY_HAS_SET_DEFAULT_VALUES, 0);
        if (z8 || !sharedPreferences.getBoolean(KEY_HAS_SET_DEFAULT_VALUES, false)) {
            PreferenceManager preferenceManager = new PreferenceManager(context);
            preferenceManager.setSharedPreferencesName(str);
            preferenceManager.setSharedPreferencesMode(i8);
            preferenceManager.inflateFromResource(context, i9, null);
            sharedPreferences.edit().putBoolean(KEY_HAS_SET_DEFAULT_VALUES, true).apply();
        }
    }
}
