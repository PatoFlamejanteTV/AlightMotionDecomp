package com.mbridge.msdk.video.bt.a;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.bt.a.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    int f23013a;

    /* renamed from: b, reason: collision with root package name */
    int f23014b;

    /* renamed from: c, reason: collision with root package name */
    private String f23015c;

    /* loaded from: classes4.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f23016a = new c();
    }

    public static c a() {
        return a.f23016a;
    }

    private c() {
        this.f23015c = "handlerNativeResult";
        this.f23013a = 0;
        this.f23014b = 1;
    }

    public final void a(Object obj, JSONObject jSONObject) {
        b unused;
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String optString = jSONObject.optString("uniqueIdentifier");
                    String optString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                        JSONObject optJSONObject = jSONObject.optJSONObject("result");
                        int i8 = 0;
                        if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                            i8 = optJSONObject.optInt("type", 0);
                        }
                        a(this.f23013a, "receivedMessage", obj);
                        if (optString.equalsIgnoreCase("reporter")) {
                            com.mbridge.msdk.mbsignalcommon.a.a.a().a(obj, optString2, optJSONArray, i8);
                            return;
                        } else {
                            if (optString.equalsIgnoreCase("MediaPlayer")) {
                                unused = b.a.f23012a;
                                return;
                            }
                            return;
                        }
                    }
                    a(this.f23014b, "module or method is null", obj);
                    return;
                }
            } catch (Exception e8) {
                ad.a("HandlerH5MessageManager", e8.getMessage());
                a(this.f23014b, e8.getMessage(), obj);
                return;
            } catch (Throwable th) {
                ad.a("HandlerH5MessageManager", th.getMessage());
                a(this.f23014b, th.getMessage(), obj);
                return;
            }
        }
        a(this.f23014b, "params is null", obj);
    }

    private void a(int i8, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i8);
            jSONObject.put("message", str);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e8) {
            ad.a("HandlerH5MessageManager", e8.getMessage());
        } catch (Throwable th) {
            ad.a("HandlerH5MessageManager", th.getMessage());
        }
    }
}
