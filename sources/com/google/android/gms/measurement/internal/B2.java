package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2176j7;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class B2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17149a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f17150b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f17151c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C2484z2 f17152d;

    public B2(C2484z2 c2484z2, String str, Bundle bundle) {
        this.f17152d = c2484z2;
        AbstractC1396p.f(str);
        this.f17149a = str;
        if (c2484z2.b().q(G.f17317l1)) {
            this.f17150b = new Bundle();
        } else {
            this.f17150b = new Bundle();
        }
    }

    private final String c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str);
                    if (C2176j7.a() && this.f17152d.b().q(G.f17249J0)) {
                        if (obj instanceof String) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "d");
                        } else {
                            this.f17152d.a().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                    } else {
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f17152d.a().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e8) {
                    this.f17152d.a().G().b("Cannot serialize bundle value to SharedPreferences", e8);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120 A[Catch: NumberFormatException | JSONException -> 0x0128, NumberFormatException | JSONException -> 0x0128, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0128, blocks: (B:13:0x0025, B:31:0x0091, B:31:0x0091, B:34:0x00a2, B:34:0x00a2, B:36:0x00a8, B:36:0x00a8, B:38:0x00b6, B:38:0x00b6, B:40:0x00c8, B:40:0x00c8, B:42:0x00d1, B:42:0x00d1, B:46:0x00d5, B:46:0x00d5, B:48:0x00db, B:48:0x00db, B:50:0x00e9, B:50:0x00e9, B:52:0x00fb, B:52:0x00fb, B:54:0x0104, B:54:0x0104, B:58:0x0108, B:58:0x0108, B:60:0x0114, B:60:0x0114, B:62:0x0120, B:62:0x0120, B:64:0x0052, B:67:0x005c, B:70:0x0066, B:73:0x0070, B:76:0x007a), top: B:12:0x0025, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.B2.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        } else if (this.f17152d.b().q(G.f17317l1)) {
            bundle = new Bundle(bundle);
        }
        SharedPreferences.Editor edit = this.f17152d.J().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f17149a);
        } else {
            edit.putString(this.f17149a, c(bundle));
        }
        edit.apply();
        this.f17151c = bundle;
    }
}
