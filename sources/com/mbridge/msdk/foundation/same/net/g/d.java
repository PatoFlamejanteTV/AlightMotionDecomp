package com.mbridge.msdk.foundation.same.net.g;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.e.o;
import com.mbridge.msdk.e.t;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public String f20907A;

    /* renamed from: B, reason: collision with root package name */
    public String f20908B;

    /* renamed from: C, reason: collision with root package name */
    public String f20909C;

    /* renamed from: D, reason: collision with root package name */
    public String f20910D;

    /* renamed from: E, reason: collision with root package name */
    public String f20911E;

    /* renamed from: F, reason: collision with root package name */
    public String f20912F;

    /* renamed from: G, reason: collision with root package name */
    public String f20913G;

    /* renamed from: H, reason: collision with root package name */
    public String f20914H;

    /* renamed from: I, reason: collision with root package name */
    public String f20915I;

    /* renamed from: J, reason: collision with root package name */
    public String f20916J;

    /* renamed from: K, reason: collision with root package name */
    public String f20917K;

    /* renamed from: L, reason: collision with root package name */
    public String f20918L;

    /* renamed from: M, reason: collision with root package name */
    public String f20919M;

    /* renamed from: N, reason: collision with root package name */
    public String f20920N;

    /* renamed from: O, reason: collision with root package name */
    public String f20921O;

    /* renamed from: P, reason: collision with root package name */
    private final String f20922P;

    /* renamed from: Q, reason: collision with root package name */
    private String f20923Q;

    /* renamed from: R, reason: collision with root package name */
    private String f20924R;

    /* renamed from: S, reason: collision with root package name */
    private String f20925S;

    /* renamed from: T, reason: collision with root package name */
    private String f20926T;

    /* renamed from: U, reason: collision with root package name */
    private String f20927U;

    /* renamed from: V, reason: collision with root package name */
    private String f20928V;

    /* renamed from: W, reason: collision with root package name */
    private String f20929W;

    /* renamed from: X, reason: collision with root package name */
    private String f20930X;

    /* renamed from: Y, reason: collision with root package name */
    private String f20931Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f20932Z;

    /* renamed from: a, reason: collision with root package name */
    public String f20933a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private boolean ae;
    private int af;

    /* renamed from: b, reason: collision with root package name */
    public String f20934b;

    /* renamed from: c, reason: collision with root package name */
    public String f20935c;

    /* renamed from: d, reason: collision with root package name */
    public String f20936d;

    /* renamed from: e, reason: collision with root package name */
    public String f20937e;

    /* renamed from: f, reason: collision with root package name */
    public String f20938f;

    /* renamed from: g, reason: collision with root package name */
    public String f20939g;

    /* renamed from: h, reason: collision with root package name */
    public String f20940h;

    /* renamed from: i, reason: collision with root package name */
    public String f20941i;

    /* renamed from: j, reason: collision with root package name */
    public String f20942j;

    /* renamed from: k, reason: collision with root package name */
    public String f20943k;

    /* renamed from: l, reason: collision with root package name */
    public String f20944l;

    /* renamed from: m, reason: collision with root package name */
    public int f20945m;

    /* renamed from: n, reason: collision with root package name */
    public int f20946n;

    /* renamed from: o, reason: collision with root package name */
    public int f20947o;

    /* renamed from: p, reason: collision with root package name */
    public int f20948p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20949q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20950r;

    /* renamed from: s, reason: collision with root package name */
    public int f20951s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<String> f20952t;

    /* renamed from: u, reason: collision with root package name */
    public int f20953u;

    /* renamed from: v, reason: collision with root package name */
    public int f20954v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList<String> f20955w;

    /* renamed from: x, reason: collision with root package name */
    public String f20956x;

    /* renamed from: y, reason: collision with root package name */
    public String f20957y;

    /* renamed from: z, reason: collision with root package name */
    public String f20958z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f20959a = new d();
    }

    public static d f() {
        return a.f20959a;
    }

    public final boolean a() {
        try {
            if (!this.f20950r) {
                ArrayList<String> arrayList = this.f20952t;
                if (arrayList != null && this.f20953u <= arrayList.size() - 1) {
                    this.f20940h = this.f20952t.get(this.f20953u);
                    b();
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f20955w;
                if (arrayList2 != null && this.f20954v <= arrayList2.size() - 1) {
                    if (!b(this.f20955w.get(this.f20954v))) {
                        this.f20944l = this.f20955w.get(this.f20954v);
                        c();
                    }
                    return true;
                }
            }
            if (this.f20949q) {
                this.f20953u = 0;
                this.f20954v = 0;
            }
            return false;
        } catch (Throwable th) {
            ad.a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    public final void b() {
        this.f20913G = this.f20940h + this.f20931Y;
        this.f20957y = this.f20940h + this.f20925S;
        this.f20915I = this.f20940h + this.f20932Z;
        this.f20909C = this.f20940h + this.f20928V;
        this.f20917K = this.f20940h + this.aa;
    }

    public final void c() {
        this.f20914H = this.f20944l + this.f20931Y;
        this.f20958z = this.f20944l + this.f20925S;
        this.f20916J = this.f20944l + this.f20932Z;
        this.f20910D = this.f20944l + this.f20928V;
        this.f20918L = this.f20944l + this.aa;
    }

    public final int d() {
        return this.af;
    }

    public final void e() {
        boolean z8;
        HashMap<String, String> G8;
        o oVar;
        g b9 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b9 != null) {
            com.mbridge.msdk.c.a n8 = b9.n();
            if (n8 != null) {
                this.f20943k = n8.f();
                this.f20947o = n8.g();
                this.f20939g = n8.e();
                this.f20912F = this.f20939g + this.f20930X;
            }
            com.mbridge.msdk.c.d C8 = b9.C();
            if (C8 != null) {
                this.f20942j = C8.d();
                this.f20946n = C8.e();
                this.f20937e = C8.c();
                this.f20911E = this.f20937e + this.f20929W;
                com.mbridge.msdk.c.d C9 = b9.C();
                if (C9 != null && C9.a() != 1) {
                    int a9 = af.a().a("monitor", "type", af.a().a("t_r_t", 1));
                    if (a9 != 0 && a9 != 1) {
                        a9 = 0;
                    }
                    w.a a10 = new w.a().a(new com.mbridge.msdk.foundation.same.report.d()).a(new com.mbridge.msdk.foundation.same.report.o());
                    if (a9 == 1) {
                        oVar = new o(new n((byte) 2), a.f20959a.f20942j, a.f20959a.f20946n);
                    } else {
                        oVar = new o(new com.mbridge.msdk.e.a.a.g(), a.f20959a.f20911E, 0);
                    }
                    t.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), a10.a(a9, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 2)).a(), C9.b() * 1000, com.mbridge.msdk.foundation.same.report.c.a());
                }
            }
            if (b9.ap() == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f20950r = z8;
            this.f20951s = b9.ap();
            this.ae = !b9.y(2);
            if (b9.G() != null && b9.G().size() > 0 && (G8 = b9.G()) != null && G8.size() > 0) {
                if (G8.containsKey("v") && !TextUtils.isEmpty(G8.get("v")) && b(G8.get("v"))) {
                    this.f20936d = G8.get("v");
                    this.f20919M = this.f20936d + this.ab;
                    this.f20920N = this.f20936d + this.ac;
                    this.f20921O = this.f20936d + this.ad;
                    this.f20907A = this.f20936d + this.f20926T;
                }
                if (G8.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(G8.get(CampaignEx.JSON_KEY_HB)) && b(G8.get(CampaignEx.JSON_KEY_HB))) {
                    this.f20923Q = G8.get(CampaignEx.JSON_KEY_HB);
                    this.f20956x = this.f20923Q + this.f20924R;
                    this.f20908B = this.f20923Q + this.f20927U;
                }
                if (G8.containsKey("lg") && !TextUtils.isEmpty(G8.get("lg"))) {
                    String str = G8.get("lg");
                    if (b(str)) {
                        this.f20935c = str;
                    } else {
                        this.f20941i = str;
                    }
                }
                if (G8.containsKey("lgt") && !TextUtils.isEmpty(G8.get("lgt"))) {
                    String str2 = G8.get("lgt");
                    if (b(str2)) {
                        String c8 = c(str2);
                        if (!TextUtils.isEmpty(c8)) {
                            this.f20941i = c8;
                        }
                    } else {
                        this.f20941i = str2;
                    }
                }
            }
            String y8 = b9.y();
            if (!TextUtils.isEmpty(y8)) {
                this.f20940h = y8;
                b();
                this.f20952t.add(0, y8);
            }
            String z9 = b9.z();
            if (!TextUtils.isEmpty(z9)) {
                this.f20944l = z9;
                c();
                this.f20955w.add(0, z9);
            }
        }
    }

    private d() {
        this.f20922P = "RequestUrlUtil";
        this.f20933a = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f20934b = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f20935c = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f20936d = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f20937e = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f20938f = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f20939g = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f20940h = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f20941i = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f20942j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f20943k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f20944l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f20945m = 9377;
        this.f20946n = 9377;
        this.f20947o = 9988;
        this.f20948p = 9377;
        this.f20949q = false;
        this.f20950r = false;
        this.f20951s = 1;
        this.f20952t = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f20953u = 0;
        this.f20954v = 0;
        this.f20955w = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f20923Q = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f20924R = "/bid";
        this.f20956x = this.f20923Q + this.f20924R;
        this.f20925S = "/sdk/customid";
        this.f20957y = this.f20940h + this.f20925S;
        this.f20958z = this.f20944l + this.f20925S;
        this.f20926T = "/image";
        this.f20907A = this.f20936d + this.f20926T;
        this.f20927U = "/load";
        this.f20908B = this.f20923Q + this.f20927U;
        this.f20928V = "/mapping";
        this.f20909C = this.f20940h + this.f20928V;
        this.f20910D = this.f20944l + this.f20928V;
        this.f20929W = "";
        this.f20911E = this.f20939g + this.f20929W;
        this.f20930X = "/batchPaidEvent";
        this.f20912F = this.f20939g + this.f20930X;
        this.f20931Y = "/setting";
        this.f20913G = this.f20940h + this.f20931Y;
        this.f20914H = this.f20944l + this.f20931Y;
        this.f20932Z = "/rewardsetting";
        this.f20915I = this.f20940h + this.f20932Z;
        this.f20916J = this.f20944l + this.f20932Z;
        this.aa = "/appwall/setting";
        this.f20917K = this.f20940h + this.aa;
        this.f20918L = this.f20944l + this.aa;
        this.ab = "/openapi/ad/v3";
        this.f20919M = this.f20936d + this.ab;
        this.ac = "/openapi/ad/v4";
        this.f20920N = this.f20936d + this.ac;
        this.ad = "/openapi/ad/v5";
        this.f20921O = this.f20936d + this.ad;
        this.ae = true;
        this.af = 0;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th) {
            ad.b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    public final String a(String str, int i8) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return a(true, split[1]);
                }
                return a(true, "");
            }
        } catch (Exception e8) {
            ad.b("RequestUrlUtil", e8.getMessage());
        }
        return i8 % 2 == 0 ? this.f20921O : this.f20919M;
    }

    public final String a(boolean z8, String str) {
        if (!z8) {
            return this.f20956x.replace("{}", "");
        }
        if (!this.f20908B.contains("{}") || TextUtils.isEmpty(str)) {
            return this.f20908B.replace("{}", "");
        }
        return this.f20908B.replace("{}", str + "-");
    }

    public final void a(int i8) {
        this.af = i8;
    }

    public final String a(String str) {
        return a.f20959a.a(str, 1);
    }
}
