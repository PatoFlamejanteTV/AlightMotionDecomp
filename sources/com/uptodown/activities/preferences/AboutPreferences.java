package com.uptodown.activities.preferences;

import H4.g;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.AboutPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3788m;

/* loaded from: classes4.dex */
public final class AboutPreferences extends g {

    /* loaded from: classes4.dex */
    public static final class a extends PreferenceFragmentCompat {

        /* renamed from: a, reason: collision with root package name */
        private Preference f30519a;

        /* renamed from: b, reason: collision with root package name */
        private int f30520b;

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            if (aVar.getActivity() != null) {
                C3788m c3788m = new C3788m();
                FragmentActivity requireActivity = aVar.requireActivity();
                AbstractC3292y.h(requireActivity, "requireActivity(...)");
                C3788m.r(c3788m, requireActivity, aVar.getString(R.string.url) + "/android", null, 4, null);
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m(a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            if (aVar.getActivity() != null) {
                C3788m c3788m = new C3788m();
                FragmentActivity requireActivity = aVar.requireActivity();
                AbstractC3292y.h(requireActivity, "requireActivity(...)");
                String string = aVar.getString(R.string.url_developers);
                AbstractC3292y.h(string, "getString(...)");
                C3788m.r(c3788m, requireActivity, string, null, 4, null);
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(a aVar, Preference preference, Preference it) {
            AbstractC3292y.i(it, "it");
            if (aVar.f30520b == 4) {
                preference.setSummary(((Object) preference.getSummary()) + " id:" + Settings.Secure.getString(aVar.requireActivity().getContentResolver(), "android_id"));
            }
            int i8 = aVar.f30520b;
            if (i8 < 5) {
                aVar.f30520b = i8 + 1;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a aVar, Preference it) {
            Bundle bundle;
            AbstractC3292y.i(it, "it");
            Intent intent = new Intent(aVar.getActivity(), (Class<?>) G4.a.class);
            FragmentActivity activity = aVar.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29249C.a(activity);
            } else {
                bundle = null;
            }
            aVar.startActivity(intent, bundle);
            return true;
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.about_preferences);
            Preference findPreference = findPreference("uptodown_website");
            AbstractC3292y.f(findPreference);
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.a
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean l8;
                    l8 = AboutPreferences.a.l(AboutPreferences.a.this, preference);
                    return l8;
                }
            });
            Preference findPreference2 = findPreference("uptodown_developers");
            AbstractC3292y.f(findPreference2);
            findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.b
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean m8;
                    m8 = AboutPreferences.a.m(AboutPreferences.a.this, preference);
                    return m8;
                }
            });
            final Preference findPreference3 = findPreference("version");
            AbstractC3292y.f(findPreference3);
            findPreference3.setSummary(getString(R.string.version, getString(R.string.app_name), "6.33", "633"));
            findPreference3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.c
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean n8;
                    n8 = AboutPreferences.a.n(AboutPreferences.a.this, findPreference3, preference);
                    return n8;
                }
            });
            Preference findPreference4 = findPreference("publication_date");
            AbstractC3292y.f(findPreference4);
            findPreference4.setSummary("Oct 30, 2024 07:57");
            Preference findPreference5 = findPreference("core_version");
            AbstractC3292y.f(findPreference5);
            findPreference5.setSummary("0.2.08");
            Preference findPreference6 = findPreference("consola");
            this.f30519a = findPreference6;
            if (findPreference6 != null) {
                findPreference6.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.d
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        boolean o8;
                        o8 = AboutPreferences.a.o(AboutPreferences.a.this, preference);
                        return o8;
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new a()).commit();
    }
}
