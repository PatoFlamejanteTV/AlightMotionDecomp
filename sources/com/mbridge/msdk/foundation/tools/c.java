package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f21278a;

    /* renamed from: b, reason: collision with root package name */
    public int f21279b;

    /* renamed from: c, reason: collision with root package name */
    public String f21280c;

    /* renamed from: d, reason: collision with root package name */
    public String f21281d;

    /* renamed from: e, reason: collision with root package name */
    public String f21282e;

    /* renamed from: f, reason: collision with root package name */
    public String f21283f;

    /* renamed from: g, reason: collision with root package name */
    public String f21284g;

    /* renamed from: h, reason: collision with root package name */
    public String f21285h;

    /* renamed from: j, reason: collision with root package name */
    public String f21287j;

    /* renamed from: k, reason: collision with root package name */
    public String f21288k;

    /* renamed from: m, reason: collision with root package name */
    public int f21290m;

    /* renamed from: n, reason: collision with root package name */
    public String f21291n;

    /* renamed from: o, reason: collision with root package name */
    public String f21292o;

    /* renamed from: p, reason: collision with root package name */
    public String f21293p;

    /* renamed from: r, reason: collision with root package name */
    public String f21295r;

    /* renamed from: s, reason: collision with root package name */
    public String f21296s;

    /* renamed from: t, reason: collision with root package name */
    public String f21297t;

    /* renamed from: v, reason: collision with root package name */
    public String f21299v;

    /* renamed from: q, reason: collision with root package name */
    public String f21294q = "android";

    /* renamed from: i, reason: collision with root package name */
    public String f21286i = z.m();

    /* renamed from: u, reason: collision with root package name */
    public String f21298u = z.v();

    /* renamed from: l, reason: collision with root package name */
    public String f21289l = e.c();

    public c(Context context) {
        int l8 = z.l(context);
        this.f21291n = String.valueOf(l8);
        this.f21292o = z.a(context, l8);
        this.f21287j = z.f(context);
        this.f21282e = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f21281d = com.mbridge.msdk.foundation.controller.c.m().k();
        this.f21297t = String.valueOf(ai.f(context));
        this.f21296s = String.valueOf(ai.e(context));
        this.f21295r = String.valueOf(ai.d(context));
        this.f21299v = com.mbridge.msdk.foundation.controller.c.m().i().toString();
        this.f21284g = z.w();
        this.f21290m = ai.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f21293p = "landscape";
        } else {
            this.f21293p = "portrait";
        }
        this.f21283f = com.mbridge.msdk.foundation.same.a.f20649U;
        this.f21285h = com.mbridge.msdk.foundation.same.a.f20658g;
        this.f21288k = z.n();
        this.f21280c = e.d();
        this.f21278a = e.a();
        this.f21279b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f21286i);
                jSONObject.put("system_version", this.f21298u);
                jSONObject.put("network_type", this.f21291n);
                jSONObject.put("network_type_str", this.f21292o);
                jSONObject.put("device_ua", this.f21287j);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.y());
                jSONObject.put("opensdk_ver", z.t() + "");
                jSONObject.put("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
                jSONObject.put("brand", this.f21284g);
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.f21278a);
                jSONObject.put("adid_limit_dev", this.f21279b);
            }
            jSONObject.put("plantform", this.f21294q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f21289l);
                jSONObject.put("az_aid_info", this.f21280c);
            }
            jSONObject.put("appkey", this.f21282e);
            jSONObject.put("appId", this.f21281d);
            jSONObject.put("screen_width", this.f21297t);
            jSONObject.put("screen_height", this.f21296s);
            jSONObject.put("orientation", this.f21293p);
            jSONObject.put("scale", this.f21295r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f21283f);
            jSONObject.put("c", this.f21285h);
            jSONObject.put("web_env", this.f21299v);
            jSONObject.put("f", this.f21288k);
            jSONObject.put("misk_spt", this.f21290m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.h.e.f20967c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f21278a);
                jSONObject2.put("adid_limit_dev", this.f21279b);
                jSONObject.put("dvi", x.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }
}
