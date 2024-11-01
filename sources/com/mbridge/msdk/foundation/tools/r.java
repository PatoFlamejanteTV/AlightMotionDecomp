package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r {
    public static String a(int i8, int i9, int i10, int i11, int i12) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put("message", "Sucess");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i8);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TtmlNode.LEFT, i9);
                jSONObject3.put(TtmlNode.RIGHT, i10);
                jSONObject3.put("top", i11);
                jSONObject3.put("bottom", i12);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            } catch (Exception e8) {
                ad.b("JSONUtils", e8.getMessage());
            }
        } catch (Throwable th) {
            ad.b("JSONUtils", th.getMessage());
            try {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Fail");
            } catch (JSONException e9) {
                ad.b("JSONUtils", e9.getMessage());
            }
        }
        return jSONObject.toString();
    }

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(jSONArray.optString(i8));
        }
        return arrayList;
    }
}
