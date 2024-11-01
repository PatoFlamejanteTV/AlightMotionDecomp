package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l {
    public static JSONObject a(Context context, com.mbridge.msdk.c.g gVar) throws Exception {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            String l8 = z.l();
            if (!TextUtils.isEmpty(l8)) {
                jSONObject.put("manufacturer", l8);
            }
            int k8 = z.k();
            if (k8 != -1) {
                jSONObject.put("sdkint", k8);
            }
            String m8 = z.m(context);
            if (!TextUtils.isEmpty(m8)) {
                jSONObject.put("is24H", m8);
            }
            String p8 = z.p();
            if (!TextUtils.isEmpty(p8)) {
                jSONObject.put("totalram", p8);
            }
            String n8 = z.n(context);
            if (!TextUtils.isEmpty(n8)) {
                jSONObject.put("totalmemory", n8);
            }
            jSONObject.put("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
                str = "1";
            } else {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            jSONObject.put("adid_limit_dev", str);
        }
        if (gVar.au() == 1 && !TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.e.d()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            jSONObject.put("az_aid_info", com.mbridge.msdk.foundation.tools.e.d());
        }
        return jSONObject;
    }
}
