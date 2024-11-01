package com.mbridge.msdk.c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g extends b {
    public static g e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.a(new JSONObject(str));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("Setting", "parseSetting", e8);
            }
            return null;
        }
    }

    public final String aL() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", o());
            jSONObject.put("cfc", q());
            jSONObject.put("cfb", aD());
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, ab());
            jSONObject.put("awct", m());
            jSONObject.put("rurl", aI());
            jSONObject.put("ujds", aJ());
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, ac());
            jSONObject.put("tcto", aq());
            jSONObject.put("mv_wildcard", U());
            jSONObject.put("is_startup_crashsystem", J());
            jSONObject.put("sfct", an());
            jSONObject.put("pcrn", Y());
            jSONObject.put("adct", i());
            jSONObject.put("atrqt", l());
            jSONObject.put("omsdkjs_url", W());
            jSONObject.put("mcs", S());
            jSONObject.put("GDPR_area", aG());
            jSONObject.put("alrbs", j());
            jSONObject.put("ct", x());
            jSONObject.put("isDefault", I());
            jSONObject.put("st_net", ap());
            jSONObject.put("vtag", ax());
            return jSONObject.toString();
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.a("Setting", "toJSON", th);
            }
            return null;
        }
    }
}
