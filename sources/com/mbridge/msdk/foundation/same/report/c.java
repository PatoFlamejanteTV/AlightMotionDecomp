package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21068a = "c";

    public static JSONObject a() {
        return a.a();
    }

    public static com.mbridge.msdk.e.f b() {
        return new com.mbridge.msdk.e.f() { // from class: com.mbridge.msdk.foundation.same.report.c.1
            @Override // com.mbridge.msdk.e.f
            public final boolean a(com.mbridge.msdk.e.e eVar) throws Exception {
                return c.a(eVar);
            }
        };
    }

    public static com.mbridge.msdk.e.h c() {
        return new com.mbridge.msdk.e.h() { // from class: com.mbridge.msdk.foundation.same.report.c.2
            @Override // com.mbridge.msdk.e.h
            public final JSONObject a(com.mbridge.msdk.e.e eVar) {
                String str = "";
                if (eVar == null) {
                    return null;
                }
                JSONObject d8 = eVar.d();
                if (d8 == null) {
                    d8 = new JSONObject();
                }
                try {
                    d8.put(LeanbackPreferenceDialogFragment.ARG_KEY, eVar.a());
                    Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                    int l8 = z.l(c8);
                    if (!d8.has("network_type")) {
                        d8.put("network_type", l8);
                        d8.put("network_str", z.a(c8, l8));
                    }
                    if (!d8.has("st")) {
                        d8.put("st", System.currentTimeMillis());
                    }
                    String optString = d8.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                    if (!TextUtils.isEmpty(optString)) {
                        String str2 = com.mbridge.msdk.foundation.controller.a.f20292b.get(optString);
                        if (str2 != null) {
                            str = str2;
                        }
                        d8.put("u_stid", str);
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U) && !d8.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        d8.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f20649U);
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g) && !d8.has(c.f21068a)) {
                        d8.put(c.f21068a, com.mbridge.msdk.foundation.same.a.f20658g);
                    }
                } catch (Exception e8) {
                    ad.b(c.f21068a, e8.getMessage());
                }
                return d8;
            }
        };
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove("model");
            jSONObject.remove("brand");
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove("ua");
            jSONObject.remove("language");
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove("os_version");
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.h.e.f20965a);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.h.e.f20966b);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove("gaid");
        jSONObject.remove("gaid2");
        jSONObject.remove("oaid");
        jSONObject.remove("az_aid_info");
    }

    static /* synthetic */ boolean a(com.mbridge.msdk.e.e eVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.a())) {
            return false;
        }
        String a9 = eVar.a();
        if (TextUtils.isEmpty(a9)) {
            return false;
        }
        com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b9 == null) {
            return true;
        }
        return b.a(b9, a9);
    }
}
