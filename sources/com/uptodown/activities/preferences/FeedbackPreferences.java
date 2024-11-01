package com.uptodown.activities.preferences;

import H4.g;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.Suggestions;
import com.uptodown.activities.preferences.FeedbackPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3788m;

/* loaded from: classes4.dex */
public final class FeedbackPreferences extends g {

    /* loaded from: classes4.dex */
    public static final class a extends PreferenceFragmentCompat {
        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(a aVar, Preference it) {
            Bundle bundle;
            AbstractC3292y.i(it, "it");
            try {
                Intent intent = new Intent(aVar.getActivity(), (Class<?>) Suggestions.class);
                FragmentActivity activity = aVar.getActivity();
                if (activity != null) {
                    bundle = UptodownApp.f29249C.a(activity);
                } else {
                    bundle = null;
                }
                aVar.startActivity(intent, bundle);
                return true;
            } catch (Exception e8) {
                e8.printStackTrace();
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            String string = aVar.getString(R.string.dmca_title);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = aVar.getString(R.string.url_dmca);
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
            addPreferencesFromResource(R.xml.feedback_preferences);
            Preference findPreference = findPreference("suggestion");
            AbstractC3292y.f(findPreference);
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.h
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean j8;
                    j8 = FeedbackPreferences.a.j(FeedbackPreferences.a.this, preference);
                    return j8;
                }
            });
            Preference findPreference2 = findPreference("dmca");
            AbstractC3292y.f(findPreference2);
            findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.i
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean k8;
                    k8 = FeedbackPreferences.a.k(FeedbackPreferences.a.this, preference);
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
