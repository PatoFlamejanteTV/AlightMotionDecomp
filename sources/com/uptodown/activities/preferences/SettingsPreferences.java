package com.uptodown.activities.preferences;

import H4.g;
import S4.s;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import c5.C2031A;
import c5.C2045j;
import c5.C2052q;
import c5.C2058x;
import c5.O;
import c5.S;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.LanguageSettingsActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import java.io.File;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import q5.C3788m;
import q5.C3800y;

/* loaded from: classes4.dex */
public final class SettingsPreferences extends g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30529b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private O f30530a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final String D(Context context, String str) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                if (!sharedPreferences.contains(str)) {
                    return null;
                }
                return sharedPreferences.getString(str, null);
            } catch (Exception e8) {
                e8.printStackTrace();
                return null;
            }
        }

        private final String E(Context context, String str, String str2) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains(str)) {
                    String string = sharedPreferences.getString(str, str2);
                    AbstractC3292y.f(string);
                    return string;
                }
                return str2;
            } catch (Exception unused) {
                return str2;
            }
        }

        private final void O0(Context context, String str, long j8) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
                edit.putLong(str, j8);
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        private final void a1(Context context, String str, String str2) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
                edit.putString(str, str2);
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        private final boolean e0(Context context, String str) {
            try {
                return context.getSharedPreferences("SettingsPreferences", 0).contains(str);
            } catch (Exception unused) {
                return false;
            }
        }

        public static /* synthetic */ boolean i(a aVar, Context context, String str, boolean z8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                z8 = true;
            }
            return aVar.h(context, str, z8);
        }

        public static /* synthetic */ long x(a aVar, Context context, String str, long j8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                j8 = -1;
            }
            return aVar.w(context, str, j8);
        }

        public final int A(Context context) {
            AbstractC3292y.i(context, "context");
            return n(context, "notification_permission_request_api33");
        }

        public final void A0(Context context, String str) {
            AbstractC3292y.i(context, "context");
            a1(context, "device_status", str);
        }

        public final long B(Context context) {
            AbstractC3292y.i(context, "context");
            return w(context, "last_notification_permission_request_timestamp", 0L);
        }

        public final void B0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "is_device_tracking_registered", z8);
        }

        public final long C(Context context) {
            AbstractC3292y.i(context, "context");
            return w(context, "last_sign_in_request_timestamp", 0L);
        }

        public final void C0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "app_detail_inflate_view_failed", z8);
        }

        public final void D0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "gdpr_requested", z8);
        }

        public final void E0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "is_in_eea", z8);
        }

        public final S F(Context context) {
            AbstractC3292y.i(context, "context");
            return new S(w(context, "bytes_uploaded", 0L), w(context, "timestamp_uploaded", 0L));
        }

        public final void F0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "is_in_eea_checked", z8);
        }

        public final long G(Context context) {
            AbstractC3292y.i(context, "context");
            return w(context, "uptodown_turbo_register_popup_shown", 0L);
        }

        public final void G0(Context context, String key, int i8) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(key, "key");
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
                edit.putInt(key, i8);
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        public final String H(Context context) {
            AbstractC3292y.i(context, "context");
            return D(context, "url_526");
        }

        public final void H0(Context context, String language) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(language, "language");
            a1(context, "Language", language);
            new L4.a(context).C(language);
        }

        public final String I(Context context) {
            AbstractC3292y.i(context, "context");
            return D(context, "UTOKEN");
        }

        public final void I0(Context context, long j8) {
            AbstractC3292y.i(context, "context");
            O0(context, "last_analysis_timestamp", j8);
        }

        public final int J(Context context) {
            AbstractC3292y.i(context, "context");
            return n(context, "versioncode_526");
        }

        public final void J0(Context context, String timestamp) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(timestamp, "timestamp");
            a1(context, "last_notification_timestamp", timestamp);
        }

        public final boolean K(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "app_detail_inflate_view_failed", false);
        }

        public final void K0(Context context, String text) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(text, "text");
            a1(context, "last_review_text", text);
        }

        public final boolean L(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "gdpr_analytics_allowed", false);
        }

        public final void L0(Context context, String timestamp) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(timestamp, "timestamp");
            a1(context, "last_review_timestamp", timestamp);
        }

        public final boolean M(Context context) {
            AbstractC3292y.i(context, "context");
            if (UptodownApp.f29249C.S()) {
                return false;
            }
            return i(this, context, "animations", false, 4, null);
        }

        public final void M0(Context context, long j8) {
            AbstractC3292y.i(context, "context");
            O0(context, "last_events_timestamp", j8);
        }

        public final boolean N(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "auto_update_apps", false);
        }

        public final void N0(Context context, long j8) {
            AbstractC3292y.i(context, "context");
            O0(context, "mintegral_interstitial_last_shown", j8);
        }

        public final boolean O(Context context) {
            AbstractC3292y.i(context, "context");
            return e0(context, "auto_update_apps");
        }

        public final boolean P(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "gdpr_crashlytics_allowed", false);
        }

        public final void P0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "new_terms_popup_shown", z8);
        }

        public final boolean Q(Context context) {
            AbstractC3292y.i(context, "context");
            return i(this, context, "delete_apk", false, 4, null);
        }

        public final void Q0(Context context, int i8) {
            AbstractC3292y.i(context, "context");
            G0(context, "notification_permission_request_api33", i8);
        }

        public final boolean R(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "is_device_tracking_registered", false);
        }

        public final void R0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "recibir_notificaciones", z8);
        }

        public final boolean S(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "download_notification", true);
        }

        public final void S0(Context context, long j8) {
            AbstractC3292y.i(context, "context");
            O0(context, "last_notification_permission_request_timestamp", j8);
        }

        public final boolean T(Context context) {
            AbstractC3292y.i(context, "context");
            if (UptodownApp.f29249C.S()) {
                return false;
            }
            return h(context, "floating_download_queue_active", true);
        }

        public final void T0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "storage_sdcard", z8);
        }

        public final boolean U(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "gdpr_requested", false);
        }

        public final void U0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "settings_utd_sended", z8);
        }

        public final boolean V(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "is_in_eea", true);
        }

        public final void V0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "show_system_apps", z8);
        }

        public final boolean W(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "is_in_eea_checked", false);
        }

        public final void W0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "show_system_services", z8);
        }

        public final boolean X(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "install_apk_rooted", false);
        }

        public final void X0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "show_warning_download_incompatible", z8);
        }

        public final boolean Y(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "installation_notification", true);
        }

        public final void Y0(Context context, long j8) {
            AbstractC3292y.i(context, "context");
            O0(context, "last_sign_in_request_timestamp", j8);
        }

        public final boolean Z(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "new_terms_popup_shown", false);
        }

        public final void Z0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "is_status_code_526", z8);
        }

        public final void a(Context context) {
            AbstractC3292y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
            edit.remove("banner_app_id");
            edit.remove("banner_packagename");
            edit.remove(CampaignEx.JSON_KEY_BANNER_URL);
            edit.remove("banner_last_time_shown");
            edit.remove("banner_download_id");
            edit.remove("banner_last_time_clicked");
            edit.remove("banner_counter_impressions");
            edit.remove("banner_last_time_requested");
            edit.apply();
        }

        public final boolean a0(Context context) {
            AbstractC3292y.i(context, "context");
            return i(this, context, "recibir_notificaciones", false, 4, null);
        }

        public final void b(Context context) {
            AbstractC3292y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
            edit.remove("interstitial_app_id");
            edit.remove("interstitial_packagename");
            edit.remove("interstitial_url");
            edit.remove("interstitial_last_time_shown");
            edit.remove("interstitial_download_id");
            edit.remove("interstitial_last_time_clicked");
            edit.remove("interstitial_counter_impressions");
            edit.remove("interstitial_last_time_requested");
            edit.apply();
        }

        public final boolean b0(Context context) {
            AbstractC3292y.i(context, "context");
            return i(this, context, "only_wifi", false, 4, null);
        }

        public final void b1(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "gdpr_tracking_allowed", z8);
        }

        public final void c(Context context) {
            AbstractC3292y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
            edit.remove("fcm_app_id");
            edit.remove("fcm_packagename");
            edit.remove("fcm_download_id");
            edit.remove("fcm_received_timestamp");
            edit.remove("fcm_shown_timestamp");
            edit.apply();
        }

        public final boolean c0(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "storage_sdcard", false);
        }

        public final void c1(Context context, long j8) {
            AbstractC3292y.i(context, "context");
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesTracking", 0).edit();
                edit.putLong("maintenance_time", System.currentTimeMillis() + (j8 * 1000));
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        public final String d(Context context) {
            AbstractC3292y.i(context, "context");
            return D(context, "apk_to_rollback");
        }

        public final boolean d0(Context context) {
            AbstractC3292y.i(context, "context");
            return e0(context, "storage_sdcard");
        }

        public final void d1(Context context, long j8) {
            AbstractC3292y.i(context, "context");
            O0(context, "uptodown_turbo_register_popup_shown", j8);
        }

        public final String e(Context context) {
            AbstractC3292y.i(context, "context");
            return D(context, "app_id_after_kill");
        }

        public final void e1(Context context, String str) {
            AbstractC3292y.i(context, "context");
            a1(context, "url_526", str);
        }

        public final int f(Context context) {
            AbstractC3292y.i(context, "context");
            return Integer.parseInt(E(context, "autoplay_video", MBridgeConstans.ENDCARD_URL_TYPE_PL));
        }

        public final boolean f0(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "settings_utd_sended", false);
        }

        public final void f1(Context context, String str) {
            AbstractC3292y.i(context, "context");
            a1(context, "UTOKEN", str);
        }

        public final C2045j g(Context context) {
            AbstractC3292y.i(context, "context");
            long x8 = x(this, context, "banner_app_id", 0L, 4, null);
            String D8 = D(context, "banner_packagename");
            String D9 = D(context, CampaignEx.JSON_KEY_BANNER_URL);
            if (x8 > -1 && D8 != null && D9 != null) {
                C2045j c2045j = new C2045j(x8, D8, D9);
                c2045j.z(x(this, context, "banner_last_time_shown", 0L, 4, null));
                c2045j.v(n(context, "banner_download_id"));
                c2045j.x(x(this, context, "banner_last_time_clicked", 0L, 4, null));
                c2045j.u(n(context, "banner_counter_impressions"));
                c2045j.y(x(this, context, "banner_last_time_requested", 0L, 4, null));
                return c2045j;
            }
            return null;
        }

        public final boolean g0(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "show_system_apps", false);
        }

        public final void g1(Context context, int i8) {
            AbstractC3292y.i(context, "context");
            G0(context, "versioncode_526", i8);
        }

        public final boolean h(Context context, String key, boolean z8) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(key, "key");
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains(key)) {
                    return sharedPreferences.getBoolean(key, z8);
                }
                return z8;
            } catch (Exception unused) {
                return z8;
            }
        }

        public final boolean h0(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "show_system_services", false);
        }

        public final void h1(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "welcome_popup_shown", z8);
        }

        public final boolean i0(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "is_status_code_526", false);
        }

        public final void i1(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "wizard_completed", z8);
        }

        public final String j(Context context) {
            AbstractC3292y.i(context, "context");
            return E(context, "dark_mode", "system");
        }

        public final boolean j0(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "gdpr_tracking_allowed", false);
        }

        public final void j1(Context context, int i8) {
            AbstractC3292y.i(context, "context");
            x0(context, "wizard_step_" + i8 + "_shown", true);
        }

        public final int k(Context context) {
            AbstractC3292y.i(context, "context");
            return Integer.parseInt(E(context, "data_saver_options", "1"));
        }

        public final boolean k0(Context context) {
            AbstractC3292y.i(context, "context");
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SharedPreferencesTracking", 0);
                if (!sharedPreferences.contains("maintenance_time")) {
                    return false;
                }
                if (System.currentTimeMillis() >= sharedPreferences.getLong("maintenance_time", 0L)) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean k1(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "show_warning_download_incompatible", true);
        }

        public final String l(Context context) {
            AbstractC3292y.i(context, "context");
            return D(context, "device_status");
        }

        public final boolean l0(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "welcome_popup_shown", false);
        }

        public final String m(Context context) {
            AbstractC3292y.i(context, "context");
            return E(context, "download_updates_options", "1");
        }

        public final boolean m0(Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "wizard_completed", false);
        }

        public final int n(Context context, String key) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(key, "key");
            return context.getSharedPreferences("SettingsPreferences", 0).getInt(key, -1);
        }

        public final boolean n0(int i8, Context context) {
            AbstractC3292y.i(context, "context");
            return h(context, "wizard_step_" + i8 + "_shown", false);
        }

        public final C2058x o(Context context) {
            AbstractC3292y.i(context, "context");
            long x8 = x(this, context, "interstitial_app_id", 0L, 4, null);
            String D8 = D(context, "interstitial_packagename");
            String D9 = D(context, "interstitial_url");
            if (x8 > -1 && D8 != null && D9 != null) {
                C2058x c2058x = new C2058x(x8, D8, D9);
                c2058x.z(x(this, context, "interstitial_last_time_shown", 0L, 4, null));
                c2058x.v(n(context, "interstitial_download_id"));
                c2058x.x(x(this, context, "interstitial_last_time_clicked", 0L, 4, null));
                c2058x.u(n(context, "interstitial_counter_impressions"));
                c2058x.y(x(this, context, "interstitial_last_time_requested", 0L, 4, null));
                return c2058x;
            }
            return null;
        }

        public final void o0(Context context, C2045j bannerInfo) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(bannerInfo, "bannerInfo");
            O0(context, "banner_app_id", bannerInfo.k());
            a1(context, "banner_packagename", bannerInfo.r());
            a1(context, CampaignEx.JSON_KEY_BANNER_URL, bannerInfo.n());
            O0(context, "banner_last_time_shown", bannerInfo.q());
            G0(context, "banner_download_id", bannerInfo.m());
            O0(context, "banner_last_time_clicked", bannerInfo.o());
            G0(context, "banner_counter_impressions", bannerInfo.l());
            O0(context, "banner_last_time_requested", bannerInfo.p());
        }

        public final String p(Context context) {
            AbstractC3292y.i(context, "context");
            return D(context, "Language");
        }

        public final void p0(Context context, C2058x interstitialInfo) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(interstitialInfo, "interstitialInfo");
            O0(context, "interstitial_app_id", interstitialInfo.k());
            a1(context, "interstitial_packagename", interstitialInfo.r());
            a1(context, "interstitial_url", interstitialInfo.n());
            O0(context, "interstitial_last_time_shown", interstitialInfo.q());
            G0(context, "interstitial_download_id", interstitialInfo.m());
            O0(context, "interstitial_last_time_clicked", interstitialInfo.o());
            G0(context, "interstitial_counter_impressions", interstitialInfo.l());
            O0(context, "interstitial_last_time_requested", interstitialInfo.p());
        }

        public final long q(Context context) {
            AbstractC3292y.i(context, "context");
            return w(context, "last_analysis_timestamp", 0L);
        }

        public final void q0(Context context, C2031A notificationFCM) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(notificationFCM, "notificationFCM");
            O0(context, "fcm_app_id", notificationFCM.b());
            a1(context, "fcm_packagename", notificationFCM.d());
            G0(context, "fcm_download_id", notificationFCM.c());
            O0(context, "fcm_received_timestamp", notificationFCM.e());
            O0(context, "fcm_shown_timestamp", notificationFCM.f());
        }

        public final String r(Context context) {
            AbstractC3292y.i(context, "context");
            return D(context, "last_notification_timestamp");
        }

        public final void r0(Context context, S uploadInfo) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(uploadInfo, "uploadInfo");
            O0(context, "bytes_uploaded", uploadInfo.b());
            O0(context, "timestamp_uploaded", uploadInfo.c());
        }

        public final String s(Context context) {
            AbstractC3292y.i(context, "context");
            return D(context, "last_review_text");
        }

        public final void s0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "gdpr_analytics_allowed", z8);
        }

        public final String t(Context context) {
            AbstractC3292y.i(context, "context");
            return D(context, "last_review_timestamp");
        }

        public final void t0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "animations", z8);
        }

        public final long u(Context context) {
            AbstractC3292y.i(context, "context");
            return w(context, "last_events_timestamp", 0L);
        }

        public final void u0(Context context, String str) {
            AbstractC3292y.i(context, "context");
            a1(context, "apk_to_rollback", str);
        }

        public final long v(Context context) {
            AbstractC3292y.i(context, "context");
            return w(context, "mintegral_interstitial_last_shown", 0L);
        }

        public final void v0(Context context, String str) {
            AbstractC3292y.i(context, "context");
            a1(context, "app_id_after_kill", str);
        }

        public final long w(Context context, String key, long j8) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(key, "key");
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            try {
                return sharedPreferences.getLong(key, j8);
            } catch (ClassCastException unused) {
                try {
                    long j9 = sharedPreferences.getInt(key, -1);
                    O0(context, key, j9);
                    return j9;
                } catch (ClassCastException unused2) {
                    return j8;
                }
            }
        }

        public final void w0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "auto_update_apps", z8);
        }

        public final void x0(Context context, String key, boolean z8) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(key, "key");
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
                edit.putBoolean(key, z8);
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        public final String y(Context context) {
            AbstractC3292y.i(context, "context");
            String E8 = E(context, "notifications_frecuency", "1");
            if (n.s(E8, MBridgeConstans.ENDCARD_URL_TYPE_PL, false)) {
                a1(context, "notifications_frecuency", "1");
                return "1";
            }
            return E8;
        }

        public final void y0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            x0(context, "gdpr_crashlytics_allowed", z8);
        }

        public final C2031A z(Context context) {
            AbstractC3292y.i(context, "context");
            C2031A c2031a = new C2031A();
            c2031a.j(x(this, context, "fcm_app_id", 0L, 4, null));
            c2031a.m(D(context, "fcm_packagename"));
            c2031a.k(n(context, "fcm_download_id"));
            c2031a.o(x(this, context, "fcm_received_timestamp", 0L, 4, null));
            c2031a.q(x(this, context, "fcm_shown_timestamp", 0L, 4, null));
            if (c2031a.b() > -1 && c2031a.d() != null) {
                return c2031a;
            }
            return null;
        }

        public final void z0(Context context, String str) {
            AbstractC3292y.i(context, "context");
            a1(context, "dark_mode", str);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends PreferenceFragmentCompat {

        /* renamed from: a, reason: collision with root package name */
        private String[] f30531a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f30532b;

        /* renamed from: c, reason: collision with root package name */
        private final ActivityResultLauncher f30533c;

        public b() {
            ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: H4.n
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    SettingsPreferences.b.w(SettingsPreferences.b.this, (ActivityResult) obj);
                }
            });
            AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
            this.f30533c = registerForActivityResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean A(b bVar, Preference it) {
            ActivityOptionsCompat activityOptionsCompat;
            AbstractC3292y.i(it, "it");
            Intent intent = new Intent(bVar.getActivity(), (Class<?>) LanguageSettingsActivity.class);
            ActivityResultLauncher activityResultLauncher = bVar.f30533c;
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                activityOptionsCompat = UptodownApp.f29249C.b(activity);
            } else {
                activityOptionsCompat = null;
            }
            activityResultLauncher.launch(intent, activityOptionsCompat);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean B(b bVar, Preference preference, Object obj) {
            AbstractC3292y.i(preference, "preference");
            a aVar = SettingsPreferences.f30529b;
            Context requireContext = bVar.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            aVar.T0(requireContext, !obj.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL));
            if (obj.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                preference.setSummary(bVar.getString(R.string.internal_storage));
            } else {
                preference.setSummary(bVar.getString(R.string.sd_card));
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean C(b bVar, Preference it) {
            Bundle bundle;
            AbstractC3292y.i(it, "it");
            Intent intent = new Intent(bVar.getActivity(), (Class<?>) TosPreferences.class);
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29249C.a(activity);
            } else {
                bundle = null;
            }
            bVar.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean D(b bVar, Preference it) {
            Bundle bundle;
            AbstractC3292y.i(it, "it");
            Intent intent = new Intent(bVar.getActivity(), (Class<?>) FeedbackPreferences.class);
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29249C.a(activity);
            } else {
                bundle = null;
            }
            bVar.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean E(b bVar, Preference it) {
            Bundle bundle;
            AbstractC3292y.i(it, "it");
            Intent intent = new Intent(bVar.getActivity(), (Class<?>) AboutPreferences.class);
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29249C.a(activity);
            } else {
                bundle = null;
            }
            bVar.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean F(b bVar, Preference it) {
            AbstractC3292y.i(it, "it");
            String string = bVar.getString(R.string.privacy_policy_title);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = bVar.getString(R.string.url_advertising);
            AbstractC3292y.h(string2, "getString(...)");
            C3788m c3788m = new C3788m();
            FragmentActivity requireActivity = bVar.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c3788m.q(requireActivity, string2, string);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean G(b bVar, Preference it) {
            Bundle bundle;
            AbstractC3292y.i(it, "it");
            Intent intent = new Intent(bVar.getActivity(), (Class<?>) AdvancedPreferences.class);
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29249C.a(activity);
            } else {
                bundle = null;
            }
            bVar.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean H(b bVar, Preference pref, Object obj) {
            AbstractC3292y.i(pref, "pref");
            if (obj instanceof String) {
                bVar.v((String) obj, pref);
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean I(b bVar, Preference it) {
            Bundle bundle;
            AbstractC3292y.i(it, "it");
            Intent intent = new Intent(bVar.getActivity(), (Class<?>) NotificationsPreferences.class);
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29249C.a(activity);
            } else {
                bundle = null;
            }
            bVar.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean J(b bVar, Preference it) {
            Bundle bundle;
            AbstractC3292y.i(it, "it");
            UptodownApp.a aVar = UptodownApp.f29249C;
            Context requireContext = bVar.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            if (aVar.U(requireContext)) {
                bVar.startActivity(new Intent(bVar.getActivity(), (Class<?>) TvPrivacyPreferences.class));
                return true;
            }
            Intent intent = new Intent(bVar.getActivity(), (Class<?>) GdprPrivacySettings.class);
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                bundle = aVar.a(activity);
            } else {
                bundle = null;
            }
            bVar.startActivity(intent, bundle);
            return true;
        }

        private final void v(String str, Preference preference) {
            String string;
            if (n.s(str, MBridgeConstans.ENDCARD_URL_TYPE_PL, true)) {
                string = getString(R.string.download_updates_option_0);
            } else if (n.s(str, "1", true)) {
                string = getString(R.string.download_updates_option_1);
            } else if (n.s(str, "2", true)) {
                string = getString(R.string.download_updates_option_2);
            } else {
                string = getString(R.string.download_updates_option_1);
            }
            Long l8 = null;
            File externalFilesDir = requireContext().getExternalFilesDir(null);
            if (externalFilesDir != null) {
                l8 = Long.valueOf(externalFilesDir.getUsableSpace());
            }
            if (l8 == null) {
                preference.setSummary(string + "\n⚠ " + getString(R.string.error_cant_create_dir));
                return;
            }
            if (l8.longValue() < 262144000) {
                preference.setSummary(string + "\n⚠ " + getString(R.string.error_not_enough_space));
                return;
            }
            preference.setSummary(string);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(b bVar, ActivityResult activityResult) {
            Intent intent;
            if (activityResult.getResultCode() == 1003) {
                FragmentActivity activity = bVar.getActivity();
                if (activity != null) {
                    activity.setResult(PointerIconCompat.TYPE_HELP);
                }
                FragmentActivity activity2 = bVar.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                FragmentActivity activity3 = bVar.getActivity();
                if (activity3 != null && (intent = activity3.getIntent()) != null) {
                    bVar.startActivity(intent);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean x(b bVar, Preference it) {
            AbstractC3292y.i(it, "it");
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                activity.setResult(PointerIconCompat.TYPE_WAIT);
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean y(Preference preference, Object obj) {
            AbstractC3292y.i(preference, "<unused var>");
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                try {
                    s.f9466a.d();
                    return true;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return true;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean z(L4.a aVar, Preference preference, Object obj) {
            AbstractC3292y.i(preference, "<unused var>");
            if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                aVar.B(bool.booleanValue());
                if (bool.booleanValue()) {
                    aVar.M(true);
                }
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0239, code lost:            if (r0.z(r2) == false) goto L38;     */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0101 A[LOOP:1: B:18:0x00fb->B:20:0x0101, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x02c4  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        @Override // androidx.preference.PreferenceFragmentCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCreatePreferences(android.os.Bundle r12, java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 732
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.preferences.SettingsPreferences.b.onCreatePreferences(android.os.Bundle, java.lang.String):void");
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            String string;
            super.onResume();
            Preference findPreference = findPreference("notifications");
            AbstractC3292y.f(findPreference);
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.s
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean I8;
                    I8 = SettingsPreferences.b.I(SettingsPreferences.b.this, preference);
                    return I8;
                }
            });
            C3800y c3800y = C3800y.f37330a;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            if (c3800y.a(requireContext)) {
                string = getString(R.string.enabled);
            } else {
                string = getString(R.string.disabled);
            }
            findPreference.setSummary(string);
            Preference findPreference2 = findPreference("gdpr");
            a aVar = SettingsPreferences.f30529b;
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            if (!aVar.V(requireContext2)) {
                PreferenceScreen preferenceScreen = getPreferenceScreen();
                AbstractC3292y.f(findPreference2);
                preferenceScreen.removePreference(findPreference2);
            } else {
                AbstractC3292y.f(findPreference2);
                findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: H4.t
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        boolean J8;
                        J8 = SettingsPreferences.b.J(SettingsPreferences.b.this, preference);
                        return J8;
                    }
                });
            }
        }
    }

    @Override // H4.g, android.app.Activity
    public void finish() {
        O o8 = new O(this);
        if (!o8.b(this.f30530a)) {
            C2052q c2052q = new C2052q();
            c2052q.h(this);
            o8.k(this, c2052q);
        }
        super.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30530a = new O(this);
        setTitle(getString(R.string.settings));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new b()).commit();
    }
}
