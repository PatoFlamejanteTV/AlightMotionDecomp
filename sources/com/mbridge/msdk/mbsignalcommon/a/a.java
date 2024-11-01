package com.mbridge.msdk.mbsignalcommon.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e.b;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f21707c = "a";

    /* renamed from: d, reason: collision with root package name */
    private String f21710d = "handlerNativeResult";

    /* renamed from: a, reason: collision with root package name */
    int f21708a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f21709b = 1;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0409a {

        /* renamed from: a, reason: collision with root package name */
        private static a f21712a = new a();
    }

    public static a a() {
        return C0409a.f21712a;
    }

    public final void a(Object obj, String str, JSONArray jSONArray, int i8) {
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        JSONObject optJSONObject6;
        JSONObject optJSONObject7;
        JSONObject optJSONObject8;
        JSONObject optJSONObject9;
        JSONObject optJSONObject10;
        JSONObject optJSONObject11;
        int i9;
        try {
        } catch (Throwable th) {
            ad.a(f21707c, th.getMessage());
            a(this.f21709b, "exception: " + th.getMessage(), obj);
        }
        if (jSONArray == null) {
            a(this.f21709b, "called reporter failed, params empty", obj);
            return;
        }
        int length = jSONArray.length();
        if (length == 0) {
            a(this.f21709b, "called reporter failed, params empty", obj);
            return;
        }
        if ("reportMessageR".equalsIgnoreCase(str)) {
            StringBuffer stringBuffer = new StringBuffer();
            int i10 = 0;
            while (true) {
                i9 = length - 1;
                if (i10 >= i9) {
                    break;
                }
                JSONObject optJSONObject12 = jSONArray.optJSONObject(i10);
                if (optJSONObject12 != null) {
                    stringBuffer.append(optJSONObject12.optString(LeanbackPreferenceDialogFragment.ARG_KEY));
                    stringBuffer.append("=");
                    stringBuffer.append(optJSONObject12.opt("value"));
                    stringBuffer.append("&");
                }
                i10++;
            }
            JSONObject optJSONObject13 = jSONArray.optJSONObject(i9);
            if (optJSONObject13 != null) {
                stringBuffer.append(optJSONObject13.optString(LeanbackPreferenceDialogFragment.ARG_KEY));
                stringBuffer.append("=");
                stringBuffer.append(optJSONObject13.opt("value"));
            }
            String stringBuffer2 = stringBuffer.toString();
            Context c8 = c.m().c();
            if (c8 != null && !TextUtils.isEmpty(stringBuffer2)) {
                try {
                    new com.mbridge.msdk.foundation.same.report.e.a(c8).post(0, d.f().f20935c, k.a(stringBuffer2, c8), new b() { // from class: com.mbridge.msdk.mbsignalcommon.a.a.1
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str6) {
                            ad.b(a.f21707c, str6);
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str6) {
                            ad.b(a.f21707c, str6);
                        }
                    });
                } catch (Exception e8) {
                    ad.b(f21707c, e8.getMessage());
                }
            }
            a(this.f21708a, "called reporter success", obj);
            return;
        }
        if ("reportMessageD".equalsIgnoreCase(str)) {
            String str6 = "";
            if (length <= 0 || (optJSONObject11 = jSONArray.optJSONObject(0)) == null) {
                str2 = "";
            } else {
                str2 = optJSONObject11.getString("value");
            }
            int i11 = (length <= 1 || (optJSONObject10 = jSONArray.optJSONObject(1)) == null) ? -1 : optJSONObject10.getInt("value");
            int i12 = (length <= 2 || (optJSONObject9 = jSONArray.optJSONObject(2)) == null) ? -1 : optJSONObject9.getInt("value");
            int i13 = (length <= 3 || (optJSONObject8 = jSONArray.optJSONObject(3)) == null) ? -1 : optJSONObject8.getInt("value");
            int i14 = (length <= 4 || (optJSONObject7 = jSONArray.optJSONObject(4)) == null) ? -1 : optJSONObject7.getInt("value");
            if (length <= 5 || (optJSONObject6 = jSONArray.optJSONObject(5)) == null) {
                str3 = "";
            } else {
                str3 = optJSONObject6.getString("value");
            }
            if (length <= 6 || (optJSONObject5 = jSONArray.optJSONObject(6)) == null) {
                str4 = "";
            } else {
                str4 = optJSONObject5.getString("value");
            }
            int i15 = (length <= 7 || (optJSONObject4 = jSONArray.optJSONObject(7)) == null) ? -1 : optJSONObject4.getInt("value");
            if (length <= 8 || (optJSONObject3 = jSONArray.optJSONObject(8)) == null) {
                str5 = "";
            } else {
                str5 = optJSONObject3.getString("value");
            }
            int i16 = (length <= 9 || (optJSONObject2 = jSONArray.optJSONObject(9)) == null) ? -1 : optJSONObject2.getInt("value");
            if (length > 10 && (optJSONObject = jSONArray.optJSONObject(10)) != null) {
                str6 = optJSONObject.getString("value");
            }
            String str7 = str6;
            try {
                Context c9 = c.m().c();
                if (c9 != null) {
                    q.a(h.a(c9)).a(new n(str2, i11, i12, i13, i14, str3, str4, i15, str5, i16, str7));
                }
            } catch (Throwable th2) {
                ad.a(f21707c, th2.getMessage());
            }
        }
        a(this.f21708a, "called reporter success", obj);
        return;
        ad.a(f21707c, th.getMessage());
        a(this.f21709b, "exception: " + th.getMessage(), obj);
    }

    private void a(int i8, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i8);
            jSONObject.put("message", str);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e8) {
            ad.a(f21707c, e8.getMessage());
        } catch (Throwable th) {
            ad.a(f21707c, th.getMessage());
        }
    }
}
