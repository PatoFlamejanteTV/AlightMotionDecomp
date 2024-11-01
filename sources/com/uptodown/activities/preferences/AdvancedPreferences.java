package com.uptodown.activities.preferences;

import H4.g;
import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreference;
import com.uptodown.R;
import com.uptodown.activities.preferences.AdvancedPreferences;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class AdvancedPreferences extends g {

    /* loaded from: classes4.dex */
    public static final class a extends PreferenceFragmentCompat {
        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(L4.a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            aVar.I(!aVar.r());
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(L4.a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            aVar.J(!aVar.N());
            return true;
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.advanced_preferences);
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            final L4.a aVar = new L4.a(requireContext);
            Preference findPreference = findPreference("show_splits_dialog");
            AbstractC3292y.g(findPreference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            SwitchPreference switchPreference = (SwitchPreference) findPreference;
            switchPreference.setChecked(aVar.r());
            switchPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.e
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean j8;
                    j8 = AdvancedPreferences.a.j(L4.a.this, preference);
                    return j8;
                }
            });
            Preference findPreference2 = findPreference("show_warning_installed");
            AbstractC3292y.g(findPreference2, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            SwitchPreference switchPreference2 = (SwitchPreference) findPreference2;
            switchPreference2.setChecked(aVar.N());
            switchPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.f
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean k8;
                    k8 = AdvancedPreferences.a.k(L4.a.this, preference);
                    return k8;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new a()).commit();
    }
}
