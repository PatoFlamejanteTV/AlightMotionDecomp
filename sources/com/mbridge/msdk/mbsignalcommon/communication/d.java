package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21790a = "d";

    /* renamed from: b, reason: collision with root package name */
    public static int f21791b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f21792c = 1;

    public static void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                a(obj, "data camapign is empty");
                return;
            }
            new Thread(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.communication.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        k a9 = k.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        if (a9 != null) {
                            if (!a9.b(CampaignEx.this.getId())) {
                                g gVar = new g();
                                gVar.a(CampaignEx.this.getId());
                                gVar.b(CampaignEx.this.getFca());
                                gVar.c(CampaignEx.this.getFcb());
                                gVar.a(0);
                                gVar.d(1);
                                gVar.a(System.currentTimeMillis());
                                a9.a(gVar);
                            } else {
                                a9.a(CampaignEx.this.getId());
                            }
                        }
                        d.a(CampaignEx.this.getCampaignUnitId(), CampaignEx.this);
                    } catch (Throwable th) {
                        ad.a(d.f21790a, th.getMessage(), th);
                    }
                }
            }).start();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f21791b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", "");
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject3);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception e8) {
                a(obj, e8.getMessage());
                ad.a(f21790a, e8.getMessage());
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public static String a(float f8, float f9) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f20659h, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), f8));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f20660i, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), f9));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f20664m, 0);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f20662k, com.mbridge.msdk.foundation.controller.c.m().c().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f20663l, ai.d(com.mbridge.msdk.foundation.controller.c.m().c()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f20661j, jSONObject2);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String a(int i8) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i8);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            ad.b(f21790a, "code to string is error");
            return "";
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21792c);
            jSONObject.put("message", str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            ad.a(f21790a, e8.getMessage());
        }
    }

    static /* synthetic */ void a(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.a.d.f20685b == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.d.a(str, campaignEx, "banner");
    }
}
