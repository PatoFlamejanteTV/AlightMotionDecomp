package com.mbridge.msdk.foundation.tools;

import G.a;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.b;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f21300a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f21301b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21302c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f21303d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f21304e = "";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f21305f = false;

    /* renamed from: g, reason: collision with root package name */
    private static String f21306g = "";

    public static int a() {
        return f21303d;
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            return TextUtils.isEmpty(f21301b) ? "" : f21301b;
        }
        if (TextUtils.isEmpty(f21301b)) {
            if (!f21302c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f21302c = true;
            }
            return "";
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            return f21301b;
        }
        return f21303d == 0 ? f21301b : "";
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            if (TextUtils.isEmpty(f21300a)) {
                return "";
            }
            return f21300a;
        }
        if (TextUtils.isEmpty(f21300a)) {
            z.j();
            if (!f21302c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f21302c = true;
            }
            if (TextUtils.isEmpty(f21300a)) {
                return "";
            }
            return f21300a;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            if (f21303d != 0) {
                return "";
            }
            return f21300a;
        }
        return f21300a;
    }

    public static String d() {
        if (TextUtils.isEmpty(f21306g) && !f21305f) {
            e();
        }
        return f21306g;
    }

    public static String e() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f21305f) {
            return f21304e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.m().c().getContentResolver();
                int i8 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, i8);
                jSONObject.put("amazonId", string);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    f21306g = jSONObject2;
                    f21304e = x.b(jSONObject2);
                }
            } catch (Settings.SettingNotFoundException e8) {
                ad.b("DomainSameDiTool", e8.getMessage());
            }
        } catch (Throwable th) {
            ad.b("DomainSameDiTool", th.getMessage());
        }
        f21305f = true;
        return f21304e;
    }

    public static void a(int i8) {
        f21303d = i8;
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.e.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                    try {
                        a.C0040a a9 = G.a.a(context);
                        e.a(a9.a());
                        e.f21303d = a9.b() ? 1 : 0;
                        e.a(context, a9.a(), e.f21303d);
                    } catch (Exception unused) {
                        ad.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                        try {
                            b.a a10 = new b().a(context);
                            e.a(a10.a());
                            e.f21303d = a10.b() ? 1 : 0;
                            e.a(context, a10.a(), e.f21303d);
                        } catch (Exception unused2) {
                            ad.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                        }
                    } catch (Throwable th) {
                        ad.b("DomainSameDiTool", th.getMessage());
                    }
                }
            }
        }).start();
    }

    public static void a(String str) {
        f21301b = x.b(str);
        f21300a = str;
    }

    static /* synthetic */ void a(Context context, String str, int i8) {
        try {
            if (an.b(str)) {
                al.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            al.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i8));
        } catch (Exception e8) {
            ad.b("DomainSameDiTool", e8.getMessage());
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
