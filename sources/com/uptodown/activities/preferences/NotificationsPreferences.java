package com.uptodown.activities.preferences;

import H4.g;
import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreference;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.NotificationsPreferences;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;
import n6.X;
import q5.C3800y;

/* loaded from: classes4.dex */
public final class NotificationsPreferences extends g {

    /* loaded from: classes4.dex */
    public static final class a extends PreferenceFragmentCompat {

        /* renamed from: a, reason: collision with root package name */
        private SwitchPreference f30521a;

        /* renamed from: b, reason: collision with root package name */
        private ListPreference f30522b;

        /* renamed from: c, reason: collision with root package name */
        private SwitchPreference f30523c;

        /* renamed from: d, reason: collision with root package name */
        private SwitchPreference f30524d;

        /* renamed from: e, reason: collision with root package name */
        private SwitchPreference f30525e;

        /* renamed from: f, reason: collision with root package name */
        private final int f30526f = 2;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.preferences.NotificationsPreferences$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0705a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30527a;

            C0705a(d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0705a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = b.e();
                int i8 = this.f30527a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    this.f30527a = 1;
                    if (X.b(500L, this) == e8) {
                        return e8;
                    }
                }
                ListPreference listPreference = a.this.f30522b;
                ListPreference listPreference2 = null;
                if (listPreference == null) {
                    AbstractC3292y.y("lpNotificationsFrecuency");
                    listPreference = null;
                }
                a aVar = a.this;
                ListPreference listPreference3 = aVar.f30522b;
                if (listPreference3 == null) {
                    AbstractC3292y.y("lpNotificationsFrecuency");
                } else {
                    listPreference2 = listPreference3;
                }
                listPreference.setSummary(aVar.getString(R.string.updates_notification_permission_description, listPreference2.getEntry()));
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((C0705a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        private final void m() {
            ListPreference listPreference = this.f30522b;
            SwitchPreference switchPreference = null;
            if (listPreference == null) {
                AbstractC3292y.y("lpNotificationsFrecuency");
                listPreference = null;
            }
            listPreference.setEnabled(false);
            SwitchPreference switchPreference2 = this.f30523c;
            if (switchPreference2 == null) {
                AbstractC3292y.y("switchDownloadsNotifications");
                switchPreference2 = null;
            }
            switchPreference2.setEnabled(false);
            SwitchPreference switchPreference3 = this.f30524d;
            if (switchPreference3 == null) {
                AbstractC3292y.y("switchInstallationNotifications");
                switchPreference3 = null;
            }
            switchPreference3.setEnabled(false);
            SwitchPreference switchPreference4 = this.f30525e;
            if (switchPreference4 == null) {
                AbstractC3292y.y("switchInstallableFilesNotifications");
            } else {
                switchPreference = switchPreference4;
            }
            switchPreference.setEnabled(false);
        }

        private final void n() {
            ListPreference listPreference = this.f30522b;
            SwitchPreference switchPreference = null;
            if (listPreference == null) {
                AbstractC3292y.y("lpNotificationsFrecuency");
                listPreference = null;
            }
            listPreference.setEnabled(true);
            SwitchPreference switchPreference2 = this.f30523c;
            if (switchPreference2 == null) {
                AbstractC3292y.y("switchDownloadsNotifications");
                switchPreference2 = null;
            }
            switchPreference2.setEnabled(true);
            SwitchPreference switchPreference3 = this.f30524d;
            if (switchPreference3 == null) {
                AbstractC3292y.y("switchInstallationNotifications");
                switchPreference3 = null;
            }
            switchPreference3.setEnabled(true);
            SwitchPreference switchPreference4 = this.f30525e;
            if (switchPreference4 == null) {
                AbstractC3292y.y("switchInstallableFilesNotifications");
            } else {
                switchPreference = switchPreference4;
            }
            switchPreference.setEnabled(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a aVar, Preference preference, Object obj) {
            AbstractC3292y.i(preference, "<unused var>");
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                aVar.n();
                aVar.s();
                return true;
            }
            aVar.m();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean p(a aVar, Preference preference, Object obj) {
            AbstractC3292y.i(preference, "<unused var>");
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(aVar), null, null, new C0705a(null), 3, null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean q(L4.a aVar, Preference it) {
            AbstractC3292y.i(it, "it");
            if (aVar.p()) {
                aVar.G(false);
            } else {
                aVar.G(true);
            }
            return true;
        }

        private final void r() {
            if (getContext() != null) {
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", requireContext().getPackageName());
                if (intent.resolveActivity(requireContext().getPackageManager()) != null) {
                    startActivityForResult(intent, 646);
                }
            }
        }

        private final void s() {
            if (Build.VERSION.SDK_INT >= 33) {
                requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 646);
            }
        }

        private final void t() {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setTitle(R.string.title_notification_dialog_permission);
            builder.setMessage(R.string.description_notification_dialog_permission);
            builder.setPositiveButton(R.string.button_notification_dialog_permission, new DialogInterface.OnClickListener() { // from class: H4.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    NotificationsPreferences.a.u(NotificationsPreferences.a.this, dialogInterface, i8);
                }
            });
            builder.create().show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(a aVar, DialogInterface dialogInterface, int i8) {
            aVar.r();
            dialogInterface.dismiss();
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityResult(int i8, int i9, Intent intent) {
            super.onActivityResult(i8, i9, intent);
            if (i8 == 646) {
                if (Build.VERSION.SDK_INT >= 33) {
                    C3800y c3800y = C3800y.f37330a;
                    Context requireContext = requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    if (c3800y.s(requireContext)) {
                        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
                        Context requireContext2 = requireContext();
                        AbstractC3292y.h(requireContext2, "requireContext(...)");
                        aVar.R0(requireContext2, true);
                        return;
                    }
                }
                SwitchPreference switchPreference = this.f30521a;
                if (switchPreference == null) {
                    AbstractC3292y.y("switchNotifications");
                    switchPreference = null;
                }
                switchPreference.setChecked(false);
                if (getContext() != null) {
                    SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
                    Context requireContext3 = requireContext();
                    AbstractC3292y.h(requireContext3, "requireContext(...)");
                    int A8 = aVar2.A(requireContext3) + 1;
                    Context requireContext4 = requireContext();
                    AbstractC3292y.h(requireContext4, "requireContext(...)");
                    aVar2.Q0(requireContext4, A8);
                }
            }
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.notifications_preferences);
            Preference findPreference = findPreference("recibir_notificaciones");
            AbstractC3292y.g(findPreference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            this.f30521a = (SwitchPreference) findPreference;
            Preference findPreference2 = findPreference("notifications_frecuency");
            AbstractC3292y.g(findPreference2, "null cannot be cast to non-null type androidx.preference.ListPreference");
            this.f30522b = (ListPreference) findPreference2;
            Preference findPreference3 = findPreference("download_notification");
            AbstractC3292y.g(findPreference3, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            this.f30523c = (SwitchPreference) findPreference3;
            Preference findPreference4 = findPreference("installation_notification");
            AbstractC3292y.g(findPreference4, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            this.f30524d = (SwitchPreference) findPreference4;
            Preference findPreference5 = findPreference("search_apk_worker_active");
            AbstractC3292y.g(findPreference5, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            this.f30525e = (SwitchPreference) findPreference5;
            SwitchPreference switchPreference = this.f30521a;
            SwitchPreference switchPreference2 = null;
            if (switchPreference == null) {
                AbstractC3292y.y("switchNotifications");
                switchPreference = null;
            }
            C3800y c3800y = C3800y.f37330a;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            switchPreference.setChecked(c3800y.a(requireContext));
            SwitchPreference switchPreference3 = this.f30521a;
            if (switchPreference3 == null) {
                AbstractC3292y.y("switchNotifications");
                switchPreference3 = null;
            }
            switchPreference3.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: H4.k
                @Override // androidx.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    boolean o8;
                    o8 = NotificationsPreferences.a.o(NotificationsPreferences.a.this, preference, obj);
                    return o8;
                }
            });
            ListPreference listPreference = this.f30522b;
            if (listPreference == null) {
                AbstractC3292y.y("lpNotificationsFrecuency");
                listPreference = null;
            }
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            listPreference.setEnabled(aVar.a0(requireContext2));
            ListPreference listPreference2 = this.f30522b;
            if (listPreference2 == null) {
                AbstractC3292y.y("lpNotificationsFrecuency");
                listPreference2 = null;
            }
            ListPreference listPreference3 = this.f30522b;
            if (listPreference3 == null) {
                AbstractC3292y.y("lpNotificationsFrecuency");
                listPreference3 = null;
            }
            listPreference2.setSummary(getString(R.string.updates_notification_permission_description, listPreference3.getEntry()));
            ListPreference listPreference4 = this.f30522b;
            if (listPreference4 == null) {
                AbstractC3292y.y("lpNotificationsFrecuency");
                listPreference4 = null;
            }
            listPreference4.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: H4.l
                @Override // androidx.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    boolean p8;
                    p8 = NotificationsPreferences.a.p(NotificationsPreferences.a.this, preference, obj);
                    return p8;
                }
            });
            Context requireContext3 = requireContext();
            AbstractC3292y.h(requireContext3, "requireContext(...)");
            final L4.a aVar2 = new L4.a(requireContext3);
            if (UptodownApp.f29249C.S()) {
                SwitchPreference switchPreference4 = this.f30525e;
                if (switchPreference4 == null) {
                    AbstractC3292y.y("switchInstallableFilesNotifications");
                } else {
                    switchPreference2 = switchPreference4;
                }
                switchPreference2.setVisible(false);
                aVar2.G(false);
            } else {
                SwitchPreference switchPreference5 = this.f30525e;
                if (switchPreference5 == null) {
                    AbstractC3292y.y("switchInstallableFilesNotifications");
                    switchPreference5 = null;
                }
                switchPreference5.setChecked(aVar2.p());
                SwitchPreference switchPreference6 = this.f30525e;
                if (switchPreference6 == null) {
                    AbstractC3292y.y("switchInstallableFilesNotifications");
                } else {
                    switchPreference2 = switchPreference6;
                }
                switchPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.m
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        boolean q8;
                        q8 = NotificationsPreferences.a.q(L4.a.this, preference);
                        return q8;
                    }
                });
            }
            Context requireContext4 = requireContext();
            AbstractC3292y.h(requireContext4, "requireContext(...)");
            if (c3800y.a(requireContext4)) {
                n();
            } else {
                m();
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onRequestPermissionsResult(int i8, String[] permissions, int[] grantResults) {
            boolean z8;
            AbstractC3292y.i(permissions, "permissions");
            AbstractC3292y.i(grantResults, "grantResults");
            if (i8 == 646) {
                if (grantResults.length == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((!z8) && grantResults[0] == 0) {
                    SettingsPreferences.a aVar = SettingsPreferences.f30529b;
                    Context requireContext = requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    aVar.R0(requireContext, true);
                    n();
                    return;
                }
                SwitchPreference switchPreference = this.f30521a;
                if (switchPreference == null) {
                    AbstractC3292y.y("switchNotifications");
                    switchPreference = null;
                }
                switchPreference.setChecked(false);
                m();
                if (getContext() != null) {
                    SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
                    Context requireContext2 = requireContext();
                    AbstractC3292y.h(requireContext2, "requireContext(...)");
                    int A8 = aVar2.A(requireContext2) + 1;
                    Context requireContext3 = requireContext();
                    AbstractC3292y.h(requireContext3, "requireContext(...)");
                    aVar2.Q0(requireContext3, A8);
                    if (Build.VERSION.SDK_INT >= 33) {
                        Context requireContext4 = requireContext();
                        AbstractC3292y.h(requireContext4, "requireContext(...)");
                        if (aVar2.A(requireContext4) >= this.f30526f) {
                            C3800y c3800y = C3800y.f37330a;
                            Context requireContext5 = requireContext();
                            AbstractC3292y.h(requireContext5, "requireContext(...)");
                            if (!c3800y.s(requireContext5)) {
                                t();
                            }
                        }
                    }
                }
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            C3800y c3800y = C3800y.f37330a;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            boolean a9 = c3800y.a(requireContext);
            SwitchPreference switchPreference = null;
            if (a9) {
                SwitchPreference switchPreference2 = this.f30521a;
                if (switchPreference2 == null) {
                    AbstractC3292y.y("switchNotifications");
                } else {
                    switchPreference = switchPreference2;
                }
                switchPreference.setChecked(true);
                n();
                return;
            }
            SwitchPreference switchPreference3 = this.f30521a;
            if (switchPreference3 == null) {
                AbstractC3292y.y("switchNotifications");
            } else {
                switchPreference = switchPreference3;
            }
            switchPreference.setChecked(false);
            m();
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
