package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public static JSONObject a() {
        JSONObject jSONObject;
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        try {
            jSONObject = k.a(c8).c();
        } catch (Exception e8) {
            ad.a("CommonDeviceInfo", "getCommonProperty error", e8);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U)) {
                com.mbridge.msdk.foundation.same.a.f20649U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U)) {
                jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f20649U);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                com.mbridge.msdk.foundation.same.a.f20658g = com.mbridge.msdk.foundation.a.a.a.a().a("c");
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                jSONObject.put("c", com.mbridge.msdk.foundation.same.a.f20658g);
            }
            jSONObject.put("open", com.mbridge.msdk.foundation.same.a.f20646R);
            String a9 = Aa.a();
            if (a9 == null) {
                a9 = "";
            }
            jSONObject.put("channel", a9);
            jSONObject.put("band_width", com.mbridge.msdk.foundation.same.net.a.a().d());
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 == null) {
                com.mbridge.msdk.c.h.a();
                b9 = com.mbridge.msdk.c.i.a();
            }
            JSONObject a10 = a(b9);
            if (a10 != null) {
                String jSONObject2 = a10.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    String b10 = x.b(jSONObject2);
                    if (!TextUtils.isEmpty(b10)) {
                        jSONObject.put("dvi", b10);
                    }
                }
            }
            jSONObject.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            jSONObject.put("m_sdk", "msdk");
            jSONObject.put("lqswt", String.valueOf(1));
            jSONObject.put("network_available", String.valueOf(ai.l(c8)));
            String str = "UNKNOWN";
            if (b9 != null) {
                str = b9.o();
                jSONObject.put("a_stid", b9.a());
            }
            jSONObject.put("country_code", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONObject a(com.mbridge.msdk.c.g gVar) {
        try {
            return k.a(com.mbridge.msdk.foundation.controller.c.m().c(), gVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
