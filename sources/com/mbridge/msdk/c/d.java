package com.mbridge.msdk.c;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private String f19245f;

    /* renamed from: g, reason: collision with root package name */
    private String f19246g;

    /* renamed from: h, reason: collision with root package name */
    private int f19247h;

    /* renamed from: a, reason: collision with root package name */
    private int f19240a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f19241b = 1;

    /* renamed from: c, reason: collision with root package name */
    private int f19242c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f19243d = 30;

    /* renamed from: e, reason: collision with root package name */
    private int f19244e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f19248i = 0;

    public static d a(String str) {
        Exception e8;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.f19245f = jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.g.d.f().f20937e);
                dVar.f19246g = jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.g.d.f().f20942j);
                dVar.f19247h = jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.g.d.f().f20946n);
                dVar.f19248i = jSONObject.optInt("type", 1);
                dVar.f19243d = jSONObject.optInt("d_t", 30);
                dVar.f19242c = jSONObject.optInt("d_a", 0);
            } catch (Exception e9) {
                e8 = e9;
                e8.printStackTrace();
                return dVar;
            }
        } catch (Exception e10) {
            e8 = e10;
            dVar = null;
        }
        return dVar;
    }

    public final int b() {
        return this.f19243d;
    }

    public final String c() {
        return this.f19245f;
    }

    public final String d() {
        return this.f19246g;
    }

    public final int e() {
        return this.f19247h;
    }

    public final int a() {
        return this.f19242c;
    }
}
