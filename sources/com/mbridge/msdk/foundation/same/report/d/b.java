package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f21082a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f21083b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f21084c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f21085d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.foundation.c.b f21086e;

    /* renamed from: f, reason: collision with root package name */
    private String f21087f;

    /* renamed from: g, reason: collision with root package name */
    private List<CampaignEx> f21088g;

    /* renamed from: h, reason: collision with root package name */
    private String f21089h;

    /* renamed from: i, reason: collision with root package name */
    private int f21090i;

    /* renamed from: j, reason: collision with root package name */
    private String f21091j;

    /* renamed from: k, reason: collision with root package name */
    private String f21092k;

    /* renamed from: l, reason: collision with root package name */
    private String f21093l;

    /* renamed from: m, reason: collision with root package name */
    private String f21094m;

    /* renamed from: n, reason: collision with root package name */
    private String f21095n;

    /* renamed from: o, reason: collision with root package name */
    private String f21096o;

    /* renamed from: p, reason: collision with root package name */
    private String f21097p;

    /* renamed from: q, reason: collision with root package name */
    private String f21098q;

    /* renamed from: r, reason: collision with root package name */
    private int f21099r;

    /* renamed from: s, reason: collision with root package name */
    private int f21100s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21101t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21102u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21103v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21104w;

    /* renamed from: x, reason: collision with root package name */
    private CampaignEx f21105x;

    /* renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f21106y;

    public b() {
        this.f21082a = false;
        this.f21083b = new HashMap();
        this.f21084c = new HashMap();
        this.f21085d = new HashMap();
        this.f21087f = "";
        this.f21099r = -1;
        this.f21101t = false;
        this.f21103v = false;
    }

    public final boolean a() {
        return this.f21082a;
    }

    public final int b() {
        return this.f21099r;
    }

    public final String c() {
        return this.f21098q;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String d() {
        return this.f21097p;
    }

    public final List<CampaignEx> e() {
        return this.f21088g;
    }

    public final String f() {
        return this.f21087f;
    }

    public final CampaignEx g() {
        return this.f21105x;
    }

    public final List<CampaignEx> h() {
        return this.f21106y;
    }

    public final String i() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f21089h)) {
            return this.f21089h;
        }
        try {
            if (TextUtils.isEmpty(this.f21089h)) {
                String str = this.f21087f + this.f21098q;
                Map<String, Map<String, String>> map2 = this.f21083b;
                if (map2 != null && map2.containsKey(str) && (map = this.f21083b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f21089h = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return this.f21089h;
    }

    public final int j() {
        return this.f21090i;
    }

    public final String k() {
        return this.f21092k;
    }

    public final String l() {
        return this.f21093l;
    }

    public final String m() {
        return this.f21095n;
    }

    public final int n() {
        return this.f21100s;
    }

    public final com.mbridge.msdk.foundation.c.b o() {
        return this.f21086e;
    }

    public final Map<String, Map<String, String>> p() {
        return this.f21083b;
    }

    public final Map<String, Map<String, String>> q() {
        return this.f21084c;
    }

    public final boolean r() {
        return this.f21102u;
    }

    public final boolean s() {
        return this.f21103v;
    }

    public final String t() {
        return this.f21094m;
    }

    public final void a(boolean z8) {
        this.f21101t = z8;
    }

    public final void b(String str) {
        this.f21097p = str;
    }

    public final void c(String str) {
        this.f21087f = str;
    }

    public final void d(String str) {
        this.f21089h = str;
    }

    public final void e(String str) {
        this.f21091j = str;
    }

    public final void f(String str) {
        this.f21092k = str;
    }

    public final void g(String str) {
        this.f21093l = str;
    }

    public final void h(String str) {
        this.f21095n = str;
    }

    public final Map<String, String> j(String str) {
        int F8;
        String a9;
        com.mbridge.msdk.foundation.c.b bVar;
        com.mbridge.msdk.foundation.c.b bVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d dVar = new d();
        try {
            this.f21098q = str;
            dVar.a(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(i())) {
                dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, i());
            }
            int i8 = this.f21090i;
            if (i8 != 0) {
                dVar.a("adtp", Integer.valueOf(i8));
            }
            if (!TextUtils.isEmpty(this.f21096o)) {
                dVar.a(CampaignEx.JSON_KEY_HB, this.f21096o);
            }
            if (!TextUtils.isEmpty(this.f21091j)) {
                dVar.a("bid_tk", this.f21091j);
            }
            if (!TextUtils.isEmpty(str)) {
                dVar.a(LeanbackPreferenceDialogFragment.ARG_KEY, str);
            }
            if (Arrays.asList(a.f21071a).contains(str)) {
                dVar.a("from_cache", this.f21101t ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVar2 = this.f21086e) != null) {
                dVar.a("type", Integer.valueOf(bVar2.f()));
                dVar.a("reason", bVar2.b());
                if (!TextUtils.isEmpty(bVar2.h())) {
                    dVar.a("reason_d", bVar2.h());
                    dVar.a("type_d", Integer.valueOf(bVar2.g()));
                }
            }
            if ("2000048".contains(str) && (bVar = this.f21086e) != null && !TextUtils.isEmpty(bVar.h())) {
                dVar.a("type", Integer.valueOf(bVar.g()));
                dVar.a("reason", bVar.h());
            }
            if ("2000126".equals(this.f21098q)) {
                String str2 = this.f21091j;
                g a10 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                if (TextUtils.isEmpty(str2)) {
                    F8 = a10.ar();
                } else {
                    F8 = a10.F();
                }
                String a11 = com.mbridge.msdk.foundation.same.net.g.d.f().a(str2, F8);
                if (TextUtils.isEmpty(a11)) {
                    a9 = "";
                } else {
                    a9 = ao.a(a11);
                }
                dVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.c.e.a().a(a9)));
                dVar.a("dns_hs", a9);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return dVar.a();
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f21087f + str;
            Map<String, Map<String, String>> map = this.f21083b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f21083b.remove(str2);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final long l(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f21085d) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l8 = this.f21085d.get(str);
            return System.currentTimeMillis() - (l8 != null ? l8.longValue() : 0L);
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e8.printStackTrace();
            return 0L;
        }
    }

    public final void m(String str) {
        if (this.f21085d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f21085d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public final void n(String str) {
        this.f21094m = str;
    }

    public final void a(int i8) {
        this.f21099r = i8;
    }

    public final void b(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f21106y = list;
    }

    public final void c(int i8) {
        this.f21100s = i8;
    }

    public final void d(boolean z8) {
        this.f21104w = z8;
    }

    public final void a(String str) {
        this.f21098q = str;
    }

    public final void c(boolean z8) {
        this.f21103v = z8;
    }

    public final void a(List<CampaignEx> list) {
        this.f21088g = list;
    }

    public final void b(int i8) {
        this.f21090i = i8;
    }

    public final void a(CampaignEx campaignEx) {
        this.f21105x = campaignEx;
    }

    public final void b(boolean z8) {
        this.f21102u = z8;
    }

    public final void a(String str, d dVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f21087f + str;
            Map<String, Map<String, String>> map2 = this.f21083b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f21083b.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f21083b.put(str2, dVar.a());
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public b(boolean z8) {
        this.f21082a = false;
        this.f21083b = new HashMap();
        this.f21084c = new HashMap();
        this.f21085d = new HashMap();
        this.f21087f = "";
        this.f21099r = -1;
        this.f21101t = false;
        this.f21103v = false;
        this.f21082a = z8;
    }

    public final void i(String str) {
        this.f21096o = str;
    }

    public final void a(String str, d dVar, int i8) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f21087f + "_" + i8 + "_" + str;
            Map<String, Map<String, String>> map2 = this.f21084c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f21084c.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f21084c.put(str2, dVar.a());
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        this.f21086e = bVar;
    }
}
