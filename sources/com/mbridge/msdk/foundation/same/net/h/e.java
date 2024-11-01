package com.mbridge.msdk.foundation.same.net.h;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static String f20965a = "h";

    /* renamed from: b, reason: collision with root package name */
    public static String f20966b = "i";

    /* renamed from: c, reason: collision with root package name */
    public static String f20967c = "coppa";

    /* renamed from: d, reason: collision with root package name */
    public static String f20968d = "d";

    /* renamed from: e, reason: collision with root package name */
    public static String f20969e = "e";

    /* renamed from: f, reason: collision with root package name */
    public static String f20970f = "a";

    /* renamed from: g, reason: collision with root package name */
    public static String f20971g = "f";

    /* renamed from: h, reason: collision with root package name */
    public static String f20972h = "g";

    /* renamed from: i, reason: collision with root package name */
    private static final String f20973i = "e";

    /* renamed from: j, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.foundation.same.net.d.a> f20974j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    private Map<String, String> f20975k = new LinkedHashMap();

    public e() {
    }

    public final void a(String str, String str2) {
        if (str2 == null) {
            ad.b(f20973i, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f20975k.put(str, str2);
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f20975k.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return sb.toString();
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f20975k.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), C.UTF8_NAME), URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.d.a> entry2 : this.f20974j.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME), URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e8) {
            ad.b(f20973i, e8.getMessage());
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f20975k.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.d.a> entry2 : this.f20974j.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME));
                sb.append('=');
                sb.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException e8) {
            ad.b(f20973i, e8.getMessage());
        }
        return sb.toString();
    }

    public e(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }

    public final Map<String, String> a() {
        return this.f20975k;
    }

    public final void a(String str) {
        this.f20975k.remove(str);
        this.f20974j.remove(str);
    }
}
