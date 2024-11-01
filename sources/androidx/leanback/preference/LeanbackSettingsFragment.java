package androidx.leanback.preference;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragment;

/* loaded from: classes3.dex */
public abstract class LeanbackSettingsFragment extends Fragment implements PreferenceFragment.OnPreferenceStartFragmentCallback, PreferenceFragment.OnPreferenceStartScreenCallback, PreferenceFragment.OnPreferenceDisplayDialogCallback {
    private static final String PREFERENCE_FRAGMENT_TAG = "androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT";
    private final RootViewOnKeyListener mRootViewOnKeyListener = new RootViewOnKeyListener();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static class DummyFragment extends Fragment {
        @Override // android.app.Fragment
        @Nullable
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            Space space = new Space(layoutInflater.getContext());
            space.setVisibility(8);
            return space;
        }
    }

    /* loaded from: classes3.dex */
    private class RootViewOnKeyListener implements View.OnKeyListener {
        RootViewOnKeyListener() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            if (i8 == 4) {
                return LeanbackSettingsFragment.this.getChildFragmentManager().popBackStackImmediate();
            }
            return false;
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.leanback_settings_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        LeanbackSettingsRootView leanbackSettingsRootView = (LeanbackSettingsRootView) getView();
        if (leanbackSettingsRootView != null) {
            leanbackSettingsRootView.setOnBackKeyListener(null);
        }
    }

    @Override // androidx.preference.PreferenceFragment.OnPreferenceDisplayDialogCallback
    public boolean onPreferenceDisplayDialog(@NonNull PreferenceFragment preferenceFragment, Preference preference) {
        if (preferenceFragment != null) {
            if (preference instanceof ListPreference) {
                LeanbackListPreferenceDialogFragment newInstanceSingle = LeanbackListPreferenceDialogFragment.newInstanceSingle(((ListPreference) preference).getKey());
                newInstanceSingle.setTargetFragment(preferenceFragment, 0);
                startPreferenceFragment(newInstanceSingle);
                return true;
            }
            if (!(preference instanceof MultiSelectListPreference)) {
                return false;
            }
            LeanbackListPreferenceDialogFragment newInstanceMulti = LeanbackListPreferenceDialogFragment.newInstanceMulti(((MultiSelectListPreference) preference).getKey());
            newInstanceMulti.setTargetFragment(preferenceFragment, 0);
            startPreferenceFragment(newInstanceMulti);
            return true;
        }
        throw new IllegalArgumentException("Cannot display dialog for preference " + preference + ", Caller must not be null!");
    }

    public abstract void onPreferenceStartInitialScreen();

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        LeanbackSettingsRootView leanbackSettingsRootView = (LeanbackSettingsRootView) getView();
        if (leanbackSettingsRootView != null) {
            leanbackSettingsRootView.setOnBackKeyListener(this.mRootViewOnKeyListener);
        }
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            onPreferenceStartInitialScreen();
        }
    }

    public void startImmersiveFragment(@NonNull Fragment fragment) {
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag(PREFERENCE_FRAGMENT_TAG);
        if (findFragmentByTag != null && !findFragmentByTag.isHidden()) {
            if (Build.VERSION.SDK_INT < 23) {
                beginTransaction.add(R.id.settings_preference_fragment_container, new DummyFragment());
            }
            beginTransaction.remove(findFragmentByTag);
        }
        beginTransaction.add(R.id.settings_dialog_container, fragment).addToBackStack(null).commit();
    }

    public void startPreferenceFragment(@NonNull Fragment fragment) {
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        if (getChildFragmentManager().findFragmentByTag(PREFERENCE_FRAGMENT_TAG) != null) {
            beginTransaction.addToBackStack(null).replace(R.id.settings_preference_fragment_container, fragment, PREFERENCE_FRAGMENT_TAG);
        } else {
            beginTransaction.add(R.id.settings_preference_fragment_container, fragment, PREFERENCE_FRAGMENT_TAG);
        }
        beginTransaction.commit();
    }
}
