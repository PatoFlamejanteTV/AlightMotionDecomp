package com.mbridge.msdk.a;

import C1.c;
import C1.d;
import C1.f;
import C1.i;
import C1.k;
import C1.l;
import C1.m;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19092a = DomainNameUtils.VERIFICATION_URL;

    public static C1.b a(Context context, boolean z8, String str, String str2, String str3, String str4, String str5, String str6) {
        l a9;
        f fVar;
        i iVar;
        k kVar;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        C1.b bVar = null;
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(str)) {
            try {
                c(context);
                a9 = l.a("Mintegral", MBConfiguration.SDK_VERSION);
                fVar = f.NATIVE_DISPLAY;
                iVar = i.LOADED;
                kVar = k.NATIVE;
            } catch (IllegalArgumentException e8) {
                e = e8;
            } catch (Exception e9) {
                e = e9;
            }
            try {
                bVar = C1.b.b(c.a(fVar, iVar, kVar, z8 ? k.NONE : kVar, false), d.b(a9, MBridgeConstans.OMID_JS_SERVICE_CONTENT, a(str, context, str2, str3, str4, str6), str5, str2));
                ad.a("OMSDK", "adSession create success");
                return bVar;
            } catch (IllegalArgumentException e10) {
                e = e10;
                ad.b("OMSDK", e.getMessage());
                new com.mbridge.msdk.foundation.same.report.i(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return bVar;
            } catch (Exception e11) {
                e = e11;
                ad.b("OMSDK", e.getMessage());
                new com.mbridge.msdk.foundation.same.report.i(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return bVar;
            }
        }
        ad.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new com.mbridge.msdk.foundation.same.report.i(context).a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    private static String b() {
        try {
            File file = new File(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            if (!file.exists()) {
                return "";
            }
            return ab.b(file);
        } catch (Exception e8) {
            ad.a("OMSDK", e8.getMessage());
            return "";
        }
    }

    private static void c(Context context) {
        if (B1.a.b()) {
            return;
        }
        B1.a.a(context);
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        return TextUtils.isEmpty(str) ? str : str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", f19092a);
    }

    public static void b(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_URL)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = "";
            new com.mbridge.msdk.foundation.same.report.i(context).a("", "", "", "", "fetch OM failed, OMID_JS_H5_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_H5_URL, null, new com.mbridge.msdk.foundation.same.net.c.a() { // from class: com.mbridge.msdk.a.b.3
                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void a(String str) {
                        ad.a("OMSDK", "fetch OMJSH5Content failed, errorCode = " + str);
                        new com.mbridge.msdk.foundation.same.report.i(context).a("", "", "", "", "fetch OM H5 failed, request failed");
                    }

                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void b(String str) {
                        MBridgeConstans.OMID_JS_H5_CONTENT = str;
                        b.b(str);
                    }
                });
            } catch (Exception e8) {
                ad.b("OMSDK", e8.getMessage());
            }
        }
    }

    public static void b(final String str) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.a.b.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File file = new File(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    ab.a(str.getBytes(), file);
                } catch (Exception e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
            }
        }).start();
    }

    private static String a() {
        try {
            return ab.b(new File(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e8) {
            ad.a("OMSDK", e8.getMessage());
            return "";
        }
    }

    private static List<m> a(String str, Context context, String str2, String str3, String str4, String str5) {
        m a9;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (str != null) {
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                    String optString = optJSONObject.optString("vkey", "");
                    URL url = new URL(optJSONObject.optString("et_url", ""));
                    String optString2 = optJSONObject.optString("verification_p", "");
                    if (TextUtils.isEmpty(optString2)) {
                        if (TextUtils.isEmpty(optString)) {
                            a9 = m.b(url);
                        } else {
                            a9 = m.b(url);
                        }
                    } else {
                        a9 = m.a(optString, url, optString2);
                    }
                    arrayList.add(a9);
                }
            }
        } catch (IllegalArgumentException e8) {
            ad.b("OMSDK", e8.getMessage());
            new com.mbridge.msdk.foundation.same.report.i(context).a(str2, str5, str3, str4, "failed, exception " + e8.getMessage());
        } catch (MalformedURLException e9) {
            ad.b("OMSDK", e9.getMessage());
            new com.mbridge.msdk.foundation.same.report.i(context).a(str2, str5, str3, str4, "failed, exception " + e9.getMessage());
        } catch (JSONException e10) {
            ad.b("OMSDK", e10.getMessage());
            new com.mbridge.msdk.foundation.same.report.i(context).a(str2, str5, str3, str4, "failed, exception " + e10.getMessage());
        }
        return arrayList;
    }

    public static C1.b a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(campaignEx.getOmid())) {
            f fVar = f.DEFINED_BY_JAVASCRIPT;
            c(context);
            i iVar = i.BEGIN_TO_RENDER;
            k kVar = k.JAVASCRIPT;
            f fVar2 = f.DEFINED_BY_JAVASCRIPT;
            C1.b b9 = C1.b.b(c.a(fVar, iVar, kVar, k.NONE, false), d.a(l.a("Mintegral", MBConfiguration.SDK_VERSION), webView, null, null));
            b9.d(webView);
            return b9;
        }
        ad.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(campaignEx.getOmid()) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new com.mbridge.msdk.foundation.same.report.i(context).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), campaignEx.getCampaignUnitId(), "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    public static void a(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = "";
            new com.mbridge.msdk.foundation.same.report.i(context).a("", "", "", "", "fetch OM failed, OMID_JS_SERVICE_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_SERVICE_URL, null, new com.mbridge.msdk.foundation.same.net.c.a() { // from class: com.mbridge.msdk.a.b.1
                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void a(String str) {
                        ad.a("OMSDK", "fetch OMJSContent failed, errorCode = " + str);
                        new com.mbridge.msdk.foundation.same.report.i(context).a("", "", "", "", "fetch OM failed, request failed");
                    }

                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void b(String str) {
                        MBridgeConstans.OMID_JS_SERVICE_CONTENT = str;
                        b.a(str);
                    }
                });
            } catch (Exception e8) {
                ad.b("OMSDK", e8.getMessage());
            }
        }
    }

    public static void a(final String str) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File file = new File(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    ab.a(str.getBytes(), file);
                } catch (Exception e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
            }
        }).start();
    }
}
