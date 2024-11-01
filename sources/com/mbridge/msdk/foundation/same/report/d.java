package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d implements com.mbridge.msdk.e.d {
    @Override // com.mbridge.msdk.e.d
    public final Map<String, String> a(com.mbridge.msdk.e.m mVar, List<com.mbridge.msdk.e.i> list, JSONObject jSONObject) {
        HashMap hashMap;
        if (list != null && list.size() != 0) {
            c.a(jSONObject);
            if (jSONObject == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, String.valueOf(jSONObject.opt(next)));
                }
            }
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            try {
                hashMap.put(DataSchemeDataSource.SCHEME_DATA, a(list).toString());
                return hashMap;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static StringBuilder a(List<com.mbridge.msdk.e.i> list) {
        com.mbridge.msdk.e.e c8;
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            com.mbridge.msdk.e.i iVar = list.get(i8);
            if (iVar != null && (c8 = iVar.c()) != null) {
                JSONObject d8 = c8.d();
                c.a(d8);
                if (d8 == null) {
                    d8 = new JSONObject();
                }
                try {
                    try {
                        d8.put(CampaignEx.JSON_KEY_ST_TS, c8.f());
                        int d9 = iVar.d() - 1;
                        if (d9 >= 1) {
                            d8.put("retryed", d9);
                        }
                        long g8 = c8.g();
                        if (g8 > 0) {
                            d8.put(TypedValues.TransitionType.S_DURATION, g8);
                        }
                    } catch (Exception e8) {
                        if (com.mbridge.msdk.e.a.f19988a) {
                            Log.e("TrackManager", "decorateRequestParams: ", e8);
                        }
                    }
                    sb.append(a(d8));
                    if (i8 < list.size() - 1) {
                        sb.append("\n");
                    }
                } catch (Throwable th) {
                    sb.append(a(d8));
                    throw th;
                }
            }
        }
        return sb;
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> keys = jSONObject.keys();
        int i8 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            i8++;
            if (i8 <= jSONObject.length() - 1) {
                sb.append(next);
                sb.append("=");
                sb.append(a(String.valueOf(jSONObject.opt(next))));
                sb.append("&");
            } else {
                sb.append(next);
                sb.append("=");
                sb.append(a(String.valueOf(jSONObject.opt(next))));
            }
        }
        return sb.toString();
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception unused) {
            return str;
        }
    }
}
