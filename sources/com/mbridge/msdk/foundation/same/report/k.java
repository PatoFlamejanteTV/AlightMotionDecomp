package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21164a = "k";

    public static boolean a() {
        try {
            return System.currentTimeMillis() - 86400000 > ((Long) al.a(com.mbridge.msdk.foundation.controller.c.m().c(), "privateAuthorityTimesTamp", 0L)).longValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a(str, context), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.k.3
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str2) {
                    ad.b(k.f21164a, str2);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str2) {
                    ad.b(k.f21164a, str2);
                }
            });
        } catch (Exception e8) {
            e8.printStackTrace();
            ad.b(f21164a, e8.getMessage());
        }
    }

    private static String c(Context context, String str) {
        String str2 = "1";
        if (context == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pf", "1");
            jSONObject.put("ov", z.v());
            jSONObject.put("pn", z.e(context));
            jSONObject.put("vn", z.p(context));
            jSONObject.put("vc", z.q(context));
            jSONObject.put("ot", z.r(context));
            jSONObject.put("dm", z.h());
            jSONObject.put("bd", z.w());
            jSONObject.put("gaid", com.mbridge.msdk.foundation.tools.e.c());
            jSONObject.put("mnc", z.k(context));
            jSONObject.put("mcc", z.j(context));
            int l8 = z.l(context);
            jSONObject.put("nt", l8);
            jSONObject.put("nts", z.a(context, l8));
            jSONObject.put("l", z.s(context));
            jSONObject.put("tz", z.x());
            jSONObject.put("ua", z.g());
            jSONObject.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sv", MBConfiguration.SDK_VERSION);
            jSONObject.put("ss", z.i(context) + "x" + z.g(context));
            jSONObject.put("adid_limit", com.mbridge.msdk.foundation.tools.e.a());
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
                str2 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            jSONObject.put("adid_limit_dev", str2);
            if (com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k()) != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    try {
                        String l9 = z.l();
                        if (!TextUtils.isEmpty(l9)) {
                            jSONObject2.put("manufacturer", l9);
                        }
                        int k8 = z.k();
                        if (k8 != -1) {
                            jSONObject2.put("sdkint", k8);
                        }
                        String m8 = z.m(context);
                        if (!TextUtils.isEmpty(m8)) {
                            jSONObject2.put("is24H", m8);
                        }
                        String p8 = z.p();
                        if (!TextUtils.isEmpty(p8)) {
                            jSONObject2.put("totalram", p8);
                        }
                        String n8 = z.n(context);
                        if (!TextUtils.isEmpty(n8)) {
                            jSONObject2.put("totalmemory", n8);
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("ReportUtilDiff", e8.getMessage());
                        }
                    } catch (Throwable th) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("ReportUtilDiff", th.getMessage());
                        }
                    }
                    if (!TextUtils.isEmpty(jSONObject2.toString())) {
                        String b9 = x.b(jSONObject2.toString());
                        if (!TextUtils.isEmpty(b9)) {
                            jSONObject.put("dvi", URLEncoder.encode(b9, "utf-8"));
                        }
                    }
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("ReportUtilDiff", e9.getMessage());
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static void d(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a(str, context), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.k.2
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str2) {
                        com.mbridge.msdk.foundation.entity.l lVar = new com.mbridge.msdk.foundation.entity.l();
                        lVar.a(str);
                        lVar.a(System.currentTimeMillis());
                        lVar.a(0);
                        lVar.b(ShareTarget.METHOD_POST);
                        lVar.c(com.mbridge.msdk.foundation.same.net.g.d.f().f20935c);
                        com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(context)).a(lVar);
                        ad.b(k.f21164a, str2);
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str2) {
                        ad.b(k.f21164a, str2);
                    }
                });
            } catch (Exception e8) {
                e8.printStackTrace();
                ad.b(f21164a, e8.getMessage());
            }
        }
    }

    public static String a(Campaign campaign, int i8, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put("action", str);
            jSONObject.put("label", i8);
            if (campaign == null) {
                jSONObject.put("value", "");
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put(CampaignEx.JSON_KEY_TITLE, campaign.getAppName());
                jSONObject.put("value", jSONObject2);
            }
        } catch (Exception e8) {
            ad.b(f21164a, e8.getMessage());
        }
        return jSONObject.toString();
    }

    public static void b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&");
            stringBuffer.append("network_type=");
            stringBuffer.append(z.l(context));
            stringBuffer.append("&");
            stringBuffer.append("unit_id=");
            stringBuffer.append(str);
            stringBuffer.append("&");
            stringBuffer.append("cid=");
            stringBuffer.append(campaignEx.getId());
            stringBuffer.append("&");
            stringBuffer.append("reason=&");
            stringBuffer.append("result=2&");
            if (!TextUtils.isEmpty(str2)) {
                stringBuffer.append(str2);
            }
            if (campaignEx.getAdType() == 287) {
                stringBuffer.append("creative=");
                stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                stringBuffer.append("&");
                stringBuffer.append("ad_type=3&");
            } else if (campaignEx.getAdType() == 94) {
                stringBuffer.append("creative=");
                stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                stringBuffer.append("&");
                stringBuffer.append("ad_type=1&");
            } else if (campaignEx.getAdType() == 296) {
                stringBuffer.append("ad_type=5&");
                stringBuffer.append("creative=");
                stringBuffer.append(campaignEx.getCreativeId());
                stringBuffer.append("&");
            } else if (campaignEx.getAdType() == 297) {
                stringBuffer.append("ad_type=6&");
                stringBuffer.append("creative=");
                stringBuffer.append(campaignEx.getCreativeId());
                stringBuffer.append("&");
            } else if (campaignEx.getAdType() == 298) {
                stringBuffer.append("ad_type=7&");
                stringBuffer.append("creative=");
                stringBuffer.append(campaignEx.getCreativeId());
                stringBuffer.append("&");
            } else {
                stringBuffer.append("creative=");
                stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                stringBuffer.append("&");
                stringBuffer.append("ad_type=1&");
            }
            stringBuffer.append("devid=");
            stringBuffer.append(com.mbridge.msdk.foundation.tools.e.c());
            stringBuffer.append("&");
            if (campaignEx.isBidCampaign()) {
                stringBuffer.append("hb=1&");
            }
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=");
            stringBuffer.append(campaignEx.getRequestIdNotice());
            stringBuffer.append("&");
            stringBuffer.append("adspace_t=");
            stringBuffer.append(campaignEx.getAdSpaceT());
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(Context context, String str) {
        com.mbridge.msdk.foundation.same.net.h.e a9 = a(context);
        a9.a(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                a9.a(DataSchemeDataSource.SCHEME_DATA, URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        return a9;
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(Context context) {
        String str = "1";
        com.mbridge.msdk.foundation.same.net.h.e eVar = new com.mbridge.msdk.foundation.same.net.h.e();
        try {
            eVar.a("platform", "1");
            eVar.a(CampaignEx.JSON_KEY_PACKAGE_NAME, URLEncoder.encode(z.e(context)));
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("os_version", Build.VERSION.RELEASE);
                eVar.a("brand", URLEncoder.encode(z.w()));
                eVar.a("model", URLEncoder.encode(z.h()));
                if (com.mbridge.msdk.f.b.a()) {
                    eVar.a("gaid", "");
                } else {
                    eVar.a("gaid", com.mbridge.msdk.foundation.tools.e.c());
                }
                eVar.a("mnc", z.k(context));
                eVar.a("mcc", z.j(context));
                int l8 = z.l(context);
                eVar.a("network_type", l8 + "");
                eVar.a("network_str", z.a(context, l8));
                eVar.a("language", URLEncoder.encode(z.s(context)));
                eVar.a("timezone", URLEncoder.encode(z.x()));
                eVar.a("ua", URLEncoder.encode(z.g()));
                eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
                if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
                    str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                }
                eVar.a("adid_limit_dev", str);
            }
            eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
            eVar.a("app_version_name", URLEncoder.encode(z.p(context)));
            eVar.a("orientation", URLEncoder.encode(z.r(context) + ""));
            eVar.a("screen_size", z.i(context) + "x" + z.g(context));
            if (com.mbridge.msdk.f.b.a()) {
                com.mbridge.msdk.foundation.same.net.h.f.b(eVar);
            }
            com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 == null) {
                com.mbridge.msdk.c.h.a();
                b9 = com.mbridge.msdk.c.i.a();
            }
            if (b9 != null) {
                JSONObject a9 = l.a(context, b9);
                if (!TextUtils.isEmpty(a9.toString())) {
                    String b10 = x.b(a9.toString());
                    if (!TextUtils.isEmpty(b10)) {
                        eVar.a("dvi", b10);
                    }
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return eVar;
    }

    public static void b(String str) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
            StringBuilder sb = new StringBuilder();
            sb.append("key=");
            sb.append("2000090");
            sb.append("&");
            sb.append("reason=");
            sb.append(TextUtils.isEmpty(str) ? "" : str);
            sb.append("&");
            sb.append("result=");
            sb.append(!TextUtils.isEmpty(str));
            aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a(sb.toString(), com.mbridge.msdk.foundation.controller.c.m().c(), ""), null);
        } catch (Exception e8) {
            ad.b(f21164a, e8.getMessage());
        }
    }

    public static void b() {
        try {
            al.b(com.mbridge.msdk.foundation.controller.c.m().c(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c() {
        try {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.k.5
                @Override // java.lang.Runnable
                public final void run() {
                    String[] list;
                    try {
                        String a9 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_CRASH_INFO);
                        if (TextUtils.isEmpty(a9)) {
                            return;
                        }
                        File file = new File(a9);
                        if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
                            for (String str : list) {
                                File file2 = new File(a9 + "/" + str);
                                if (file2.exists()) {
                                    String b9 = ab.b(file2);
                                    if (!TextUtils.isEmpty(b9)) {
                                        String[] split = b9.split("====");
                                        if (split.length > 0) {
                                            new i(com.mbridge.msdk.foundation.controller.c.m().c()).a(split[0], file2);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        ad.b(k.f21164a, th.getMessage());
                    }
                }
            });
        } catch (Throwable th) {
            ad.b(f21164a, th.getMessage());
        }
    }

    public static JSONObject a(Context context, com.mbridge.msdk.c.g gVar) throws Exception {
        return l.a(context, gVar);
    }

    public static String a(String str, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("key=" + str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                sb.append("&" + entry.getKey() + "=" + entry.getValue());
            }
        }
        sb.append("\n");
        return sb.toString();
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(String str, String str2, Context context, String str3) {
        String jSONObject;
        if (context != null) {
            context = context.getApplicationContext();
        }
        com.mbridge.msdk.foundation.same.net.h.e eVar = new com.mbridge.msdk.foundation.same.net.h.e();
        eVar.a("m_device_info", c(context, str3));
        eVar.a("m_action", str);
        try {
            if (!TextUtils.isEmpty(str2)) {
                String a9 = Aa.a();
                if (a9 == null) {
                    a9 = "";
                }
                JSONObject jSONObject2 = new JSONObject(str2);
                jSONObject2.put("channel", a9);
                String str4 = com.mbridge.msdk.foundation.controller.a.f20292b.get(str3);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject2.put("u_stid", str4 != null ? str4 : "");
                }
                jSONObject = jSONObject2.toString();
            } else {
                JSONObject jSONObject3 = new JSONObject();
                String str5 = com.mbridge.msdk.foundation.controller.a.f20292b.get(str3);
                if (!TextUtils.isEmpty(str5)) {
                    jSONObject3.put("u_stid", str5);
                }
                jSONObject = jSONObject3.toString();
            }
            str2 = jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        eVar.a("m_data", str2);
        eVar.a("m_sdk", "msdk");
        return eVar;
    }

    private static void a(final Context context, final String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a(str, context, str2), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.k.1
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str3) {
                    com.mbridge.msdk.foundation.entity.l lVar = new com.mbridge.msdk.foundation.entity.l();
                    lVar.a(str);
                    lVar.a(System.currentTimeMillis());
                    lVar.a(0);
                    lVar.b(ShareTarget.METHOD_POST);
                    lVar.c(com.mbridge.msdk.foundation.same.net.g.d.f().f20935c);
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(context)).a(lVar);
                    ad.b(k.f21164a, str3);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str3) {
                    ad.b(k.f21164a, str3);
                }
            });
        } catch (Exception e8) {
            e8.printStackTrace();
            ad.b(f21164a, e8.getMessage());
        }
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(String str, Context context, String str2) {
        com.mbridge.msdk.foundation.same.net.h.e a9 = a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(com.mbridge.msdk.foundation.controller.c.m().k());
        sb.append("");
        a9.a(MBridgeConstans.APP_ID, sb.toString());
        a9.a(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
        try {
            if (!TextUtils.isEmpty(str2)) {
                String str3 = com.mbridge.msdk.foundation.controller.a.f20292b.get(str2);
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("&");
                    sb2.append("u_stid");
                    sb2.append("=");
                    sb2.append(str3 != null ? str3 : "");
                    str = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("u_stid=");
                    sb3.append(str3 != null ? str3 : "");
                    str = sb3.toString();
                }
            }
            a9.a(DataSchemeDataSource.SCHEME_DATA, URLEncoder.encode(str, "utf-8"));
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        a9.a("m_sdk", "msdk");
        return a9;
    }

    public static void a(Context context, String str, String str2, int i8, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000076&");
                    stringBuffer.append("network_type=" + z.l(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("reason=" + str3 + "&");
                    stringBuffer.append("result=" + i8 + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (e.a().b()) {
                        e.a().a(stringBuffer.toString());
                    } else {
                        a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i8, String str3, int i9) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000073&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str2 + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("reason=" + str3 + "&");
            stringBuffer.append("result=" + i8 + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
            if (i9 != -1) {
                stringBuffer.append("d_t=" + i9 + "&");
            }
            stringBuffer.append("url=" + URLEncoder.encode(str, "utf-8"));
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i8, int i9, int i10) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000075&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str2 + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("type=" + i8 + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
            stringBuffer.append("statue=" + i9 + "&");
            if (i10 != -1) {
                stringBuffer.append("d_t=" + i10 + "&");
            }
            stringBuffer.append("url=" + URLEncoder.encode(str, "utf-8"));
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i8, int i9) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000074&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str2 + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("type=" + i8 + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
            if (i9 != -1) {
                stringBuffer.append("d_t=" + i9 + "&");
            }
            stringBuffer.append("url=" + URLEncoder.encode(str, "utf-8"));
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2, boolean z8, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000047&");
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = com.mbridge.msdk.foundation.controller.a.f20292b.get(str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("u_stid=");
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append("&");
                    stringBuffer.append(sb.toString());
                }
                if (campaignEx != null) {
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("adtp=" + campaignEx.getAdType() + "&");
                    stringBuffer.append("rid=" + campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                }
                stringBuffer.append("st=" + System.currentTimeMillis() + "&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str2 + "&");
                stringBuffer.append("hb=");
                stringBuffer.append(z8 ? 1 : 0);
                stringBuffer.append("&");
                stringBuffer.append("reason=" + str);
                if (e.a().b()) {
                    e.a().a(stringBuffer.toString());
                } else {
                    d(context, stringBuffer.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(String str, Context context) {
        com.mbridge.msdk.foundation.same.net.h.e a9 = a(context);
        a9.a(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                a9.a(DataSchemeDataSource.SCHEME_DATA, URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        a9.a("m_sdk", "msdk");
        return a9;
    }

    public static void a(Context context, List<CampaignEx> list, String str, boolean z8) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.size() <= 0 || TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000048&");
            stringBuffer.append("st=" + System.currentTimeMillis() + "&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            CampaignEx campaignEx = list.get(0);
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            if (z8) {
                stringBuffer.append("hb=");
                stringBuffer.append(1);
                stringBuffer.append("&");
            }
            String requestId = campaignEx.getRequestId();
            if (!TextUtils.isEmpty(requestId)) {
                stringBuffer.append("rid=");
                stringBuffer.append(requestId);
                stringBuffer.append("&");
            }
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (!TextUtils.isEmpty(requestIdNotice)) {
                stringBuffer.append("rid_n=");
                stringBuffer.append(requestIdNotice);
                stringBuffer.append("&");
            }
            StringBuilder sb = new StringBuilder("rtins_type=");
            for (int i8 = 0; i8 < list.size(); i8++) {
                CampaignEx campaignEx2 = list.get(i8);
                if (i8 < list.size() - 1) {
                    sb.append(campaignEx2.getRtinsType());
                    sb.append(",");
                } else {
                    sb.append(campaignEx2.getRtinsType());
                }
            }
            stringBuffer.append((CharSequence) sb);
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th) {
            ad.b(f21164a, th.getMessage());
        }
    }

    public static void a(Context context, String str, String str2, boolean z8, String str3, String str4, String str5, String str6) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000104&");
                if (!TextUtils.isEmpty(str2)) {
                    String str7 = com.mbridge.msdk.foundation.controller.a.f20292b.get(str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("u_stid=");
                    if (str7 == null) {
                        str7 = "";
                    }
                    sb.append(str7);
                    sb.append("&");
                    stringBuffer.append(sb.toString());
                }
                stringBuffer.append("network_type=" + z.l(context) + "&");
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append("rid=" + str3 + "&");
                }
                if (!TextUtils.isEmpty(str4)) {
                    stringBuffer.append("rid_n=" + str4 + "&");
                }
                if (!TextUtils.isEmpty(str5)) {
                    stringBuffer.append("cid=" + str5 + "&");
                }
                if (!TextUtils.isEmpty(str6)) {
                    stringBuffer.append("template_id=" + str6 + "&");
                }
                stringBuffer.append("unit_id=" + str2 + "&");
                stringBuffer.append("hb=");
                stringBuffer.append(z8 ? 1 : 0);
                stringBuffer.append("&");
                stringBuffer.append("reason=" + str);
                if (e.a().b()) {
                    e.a().a(stringBuffer.toString());
                } else {
                    d(context, stringBuffer.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + z.l(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("result=1&");
                    stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("cid=" + campaignEx.getId() + "&");
                        if (campaignEx.getAdType() == 287) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=3&");
                        } else if (campaignEx.getAdType() == 94) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        } else if (campaignEx.getAdType() == 296) {
                            stringBuffer.append("ad_type=5&");
                            stringBuffer.append("creative=" + campaignEx.getCreativeId() + "&");
                        } else if (campaignEx.getAdType() == 297) {
                            stringBuffer.append("ad_type=6&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else if (campaignEx.getAdType() == 298) {
                            stringBuffer.append("ad_type=7&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        }
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    }
                    if (e.a().b()) {
                        e.a().a(stringBuffer.toString());
                    } else {
                        a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i8, int i9, String str2, int i10, int i11, int i12, String str3) {
        com.mbridge.msdk.foundation.same.report.d.b bVar;
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(LeanbackPreferenceDialogFragment.ARG_KEY, URLEncoder.encode("2000094", "utf-8"));
            if (campaignEx != null) {
                dVar.a("rid", URLEncoder.encode(campaignEx.getRequestId(), "utf-8"));
                dVar.a("rid_n", URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8"));
                dVar.a("cid", URLEncoder.encode(campaignEx.getId(), "utf-8"));
                bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
            } else {
                bVar = null;
            }
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str, "utf-8"));
            if (i8 == 0) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                }
                dVar.a("video_prg", str3 + "");
            } else {
                dVar.a("video_prg", i8 + "");
            }
            dVar.a(TypedValues.CycleType.S_WAVE_PHASE, i9 + "");
            dVar.a("feedback_content", URLEncoder.encode(str2, "utf-8"));
            dVar.a("feedback_close", i10 + "");
            dVar.a("type", i12 + "");
            dVar.a("ad_type", i11 + "");
            dVar.a("network_type", URLEncoder.encode(String.valueOf(z.l(com.mbridge.msdk.foundation.controller.c.m().c())), "utf-8"));
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.d(str);
            bVar.b(i11);
            bVar.a("2000094", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000094", bVar);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
            String str2 = "key=2000088&state=" + str;
            ad.b(f21164a, str2);
            com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 == null || b.a(b9, str2)) {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a(str2, com.mbridge.msdk.foundation.controller.c.m().c(), ""), null);
            }
        } catch (Throwable th) {
            ad.b(f21164a, th.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, int i8, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000114&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("gh_id=");
            String str3 = "";
            sb.append(TextUtils.isEmpty(campaignEx.getGhId()) ? "" : URLEncoder.encode(campaignEx.getGhId(), "utf-8"));
            sb.append("&");
            stringBuffer.append(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gh_path=");
            sb2.append(TextUtils.isEmpty(campaignEx.getGhPath()) ? "" : URLEncoder.encode(campaignEx.getGhPath(), "utf-8"));
            sb2.append("&");
            stringBuffer.append(sb2.toString());
            stringBuffer.append("unit_id=" + str2 + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
            stringBuffer.append("result=" + i8 + "&");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("reason=");
            if (!TextUtils.isEmpty(str)) {
                str3 = URLEncoder.encode(str, "utf-8");
            }
            sb3.append(str3);
            sb3.append("&");
            stringBuffer.append(sb3.toString());
            stringBuffer.append("cid=" + campaignEx.getId());
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(int i8, String str, String str2) {
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c()).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a("key=2000080&reason=" + str2 + "&ad_type=" + i8 + "&url=" + URLEncoder.encode(str, "utf-8"), com.mbridge.msdk.foundation.controller.c.m().c(), ""), null);
        } catch (Exception e8) {
            ad.b(f21164a, e8.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i8, int i9, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
            StringBuilder sb = new StringBuilder();
            sb.append(LeanbackPreferenceDialogFragment.ARG_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000121", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8"));
            sb.append("&");
            sb.append("cid");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getId(), "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("type");
            sb.append("=");
            sb.append(i8);
            sb.append("&");
            sb.append("result");
            sb.append("=");
            sb.append(i9);
            sb.append("&");
            sb.append("reason");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a(sb.toString(), com.mbridge.msdk.foundation.controller.c.m().c(), str), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.k.4
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str3) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str3) {
                    }
                });
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(String str, int i8, int i9, String str2, int i10, String str3) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(LeanbackPreferenceDialogFragment.ARG_KEY, URLEncoder.encode("m_water_mark_result", "utf-8"));
            dVar.a("water_mark_result", i9 + "");
            dVar.a("water_mark_error_msg", URLEncoder.encode(str2, "utf-8"));
            dVar.a("render_result", i10 + "");
            dVar.a("water_mark_str", URLEncoder.encode(str3, "utf-8"));
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.b(i8);
            bVar.d(str);
            bVar.a("m_water_mark_result", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_water_mark_result", bVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
