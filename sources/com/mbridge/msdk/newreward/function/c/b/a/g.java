package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g implements com.mbridge.msdk.newreward.function.c.b.d {
    public final Object a(Object obj) {
        Map map;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        if (map == null) {
            return null;
        }
        com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
        long longValue = ((Long) map.get("last_response_empty_time")).longValue();
        if (eVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(eVar.C()) && eVar.r() != null && eVar.r().b() != null) {
            if (System.currentTimeMillis() - longValue < eVar.r().b().a() * 1000) {
                hashMap.put("error_code", "-1");
                hashMap.put(NotificationCompat.CATEGORY_MESSAGE, "EXCEPTION_RETURN_EMPTY");
                return hashMap;
            }
        }
        com.mbridge.msdk.foundation.same.net.k a9 = com.mbridge.msdk.foundation.same.net.g.c.a().a(eVar.v(), eVar.A(), eVar.w(), eVar.C(), eVar.p() + "");
        if (a9 != null) {
            try {
                JSONObject jSONObject = new JSONObject(a9.f21000c.toString());
                jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
                jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                hashMap.put("error_code", jSONObject.optInt(NotificationCompat.CATEGORY_STATUS) + "");
                hashMap.put(NotificationCompat.CATEGORY_MESSAGE, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            } catch (JSONException e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
        return hashMap;
    }
}
