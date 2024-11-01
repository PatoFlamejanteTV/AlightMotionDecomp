package com.mbridge.msdk.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private String f19116e;

    /* renamed from: f, reason: collision with root package name */
    private String f19117f;

    /* renamed from: g, reason: collision with root package name */
    private int f19118g;

    /* renamed from: a, reason: collision with root package name */
    private int f19112a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f19113b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f19114c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f19115d = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f19119h = 0;

    public static a a(String str) {
        Exception e8;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.f19116e = jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.g.d.f().f20939g);
                aVar.f19117f = jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.g.d.f().f20943k);
                aVar.f19118g = jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.g.d.f().f20947o);
                aVar.f19119h = jSONObject.optInt("type", 0);
                int i8 = 1;
                int optInt = jSONObject.optInt("batch_size", 1);
                if (optInt >= 1) {
                    i8 = optInt;
                }
                aVar.f19112a = i8;
                aVar.f19114c = jSONObject.optInt(TypedValues.TransitionType.S_DURATION, 0);
                aVar.f19113b = jSONObject.optInt("disable", 0);
                aVar.f19115d = jSONObject.optInt("e_t_l", 0);
            } catch (Exception e9) {
                e8 = e9;
                e8.printStackTrace();
                return aVar;
            }
        } catch (Exception e10) {
            e8 = e10;
            aVar = null;
        }
        return aVar;
    }

    public final int b() {
        return this.f19113b;
    }

    public final int c() {
        return this.f19114c;
    }

    public final int d() {
        return this.f19115d;
    }

    public final String e() {
        return this.f19116e;
    }

    public final String f() {
        return this.f19117f;
    }

    public final int g() {
        return this.f19118g;
    }

    public final int h() {
        return this.f19119h;
    }

    public final int a() {
        return this.f19112a;
    }
}
