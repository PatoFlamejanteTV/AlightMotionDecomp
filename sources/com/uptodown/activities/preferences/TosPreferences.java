package com.uptodown.activities.preferences;

import H4.g;
import android.app.ActionBar;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.uptodown.R;
import com.uptodown.activities.preferences.TosPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3788m;

/* loaded from: classes4.dex */
public final class TosPreferences extends g {

    /* loaded from: classes4.dex */
    public static final class a extends PreferenceFragmentCompat {
        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            String string = aVar.getString(R.string.privacy_policy_title);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = aVar.getString(R.string.url_privacy);
            AbstractC3292y.h(string2, "getString(...)");
            C3788m c3788m = new C3788m();
            FragmentActivity requireActivity = aVar.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c3788m.q(requireActivity, string2, string);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            String string = aVar.getString(R.string.tos_title);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = aVar.getString(R.string.url_tos);
            AbstractC3292y.h(string2, "getString(...)");
            C3788m c3788m = new C3788m();
            FragmentActivity requireActivity = aVar.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c3788m.q(requireActivity, string2, string);
            return true;
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.tos_preferences);
            Preference findPreference = findPreference("privacy_policy");
            AbstractC3292y.f(findPreference);
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.B
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean j8;
                    j8 = TosPreferences.a.j(TosPreferences.a.this, preference);
                    return j8;
                }
            });
            Preference findPreference2 = findPreference("tos");
            AbstractC3292y.f(findPreference2);
            findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.C
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean k8;
                    k8 = TosPreferences.a.k(TosPreferences.a.this, preference);
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
