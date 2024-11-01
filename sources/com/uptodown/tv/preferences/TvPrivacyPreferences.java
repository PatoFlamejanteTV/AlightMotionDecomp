package com.uptodown.tv.preferences;

import H4.g;
import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3788m;

/* loaded from: classes5.dex */
public final class TvPrivacyPreferences extends g {

    /* loaded from: classes5.dex */
    public static final class a extends PreferenceFragmentCompat {
        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            C3788m c3788m = new C3788m();
            FragmentActivity requireActivity = aVar.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            String string = aVar.getString(R.string.url_contact);
            AbstractC3292y.h(string, "getString(...)");
            C3788m.r(c3788m, requireActivity, string, null, 4, null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
            Context requireContext = aVar.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            aVar2.D0(requireContext, true);
            Context requireContext2 = aVar.requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            aVar2.s0(requireContext2, true);
            Context requireContext3 = aVar.requireContext();
            AbstractC3292y.h(requireContext3, "requireContext(...)");
            aVar2.y0(requireContext3, true);
            Context requireContext4 = aVar.requireContext();
            AbstractC3292y.h(requireContext4, "requireContext(...)");
            aVar2.b1(requireContext4, true);
            aVar.requireActivity().finish();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m(a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
            Context requireContext = aVar.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            aVar2.D0(requireContext, false);
            Context requireContext2 = aVar.requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            aVar2.s0(requireContext2, false);
            Context requireContext3 = aVar.requireContext();
            AbstractC3292y.h(requireContext3, "requireContext(...)");
            aVar2.y0(requireContext3, false);
            Context requireContext4 = aVar.requireContext();
            AbstractC3292y.h(requireContext4, "requireContext(...)");
            aVar2.b1(requireContext4, false);
            aVar.requireActivity().finish();
            return true;
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.tv_privacy_preferences);
            Preference findPreference = findPreference("right_to_be_forgotten");
            AbstractC3292y.f(findPreference);
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: k5.a
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean k8;
                    k8 = TvPrivacyPreferences.a.k(TvPrivacyPreferences.a.this, preference);
                    return k8;
                }
            });
            Preference findPreference2 = findPreference("privacy_accept_all");
            AbstractC3292y.f(findPreference2);
            findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: k5.b
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean l8;
                    l8 = TvPrivacyPreferences.a.l(TvPrivacyPreferences.a.this, preference);
                    return l8;
                }
            });
            Preference findPreference3 = findPreference("privacy_decline_all");
            AbstractC3292y.f(findPreference3);
            findPreference3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: k5.c
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean m8;
                    m8 = TvPrivacyPreferences.a.m(TvPrivacyPreferences.a.this, preference);
                    return m8;
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
