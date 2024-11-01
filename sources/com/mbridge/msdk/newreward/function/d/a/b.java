package com.mbridge.msdk.newreward.function.d.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.e;
import com.mbridge.msdk.newreward.function.d.c.i;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    private String f22273A;

    /* renamed from: B, reason: collision with root package name */
    private int f22274B;

    /* renamed from: C, reason: collision with root package name */
    private int f22275C;

    /* renamed from: D, reason: collision with root package name */
    private List<CampaignEx> f22276D;

    /* renamed from: E, reason: collision with root package name */
    private int f22277E;

    /* renamed from: G, reason: collision with root package name */
    private long f22279G;

    /* renamed from: H, reason: collision with root package name */
    private Map<String, Object> f22280H;

    /* renamed from: I, reason: collision with root package name */
    private String f22281I;

    /* renamed from: a, reason: collision with root package name */
    private int f22282a;

    /* renamed from: b, reason: collision with root package name */
    private String f22283b;

    /* renamed from: c, reason: collision with root package name */
    private String f22284c;

    /* renamed from: d, reason: collision with root package name */
    private String f22285d;

    /* renamed from: e, reason: collision with root package name */
    private String f22286e;

    /* renamed from: f, reason: collision with root package name */
    private String f22287f;

    /* renamed from: g, reason: collision with root package name */
    private String f22288g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22289h;

    /* renamed from: j, reason: collision with root package name */
    private int f22291j;

    /* renamed from: k, reason: collision with root package name */
    private String f22292k;

    /* renamed from: l, reason: collision with root package name */
    private String f22293l;

    /* renamed from: m, reason: collision with root package name */
    private String f22294m;

    /* renamed from: n, reason: collision with root package name */
    private String f22295n;

    /* renamed from: o, reason: collision with root package name */
    private int f22296o;

    /* renamed from: p, reason: collision with root package name */
    private long f22297p;

    /* renamed from: q, reason: collision with root package name */
    private long f22298q;

    /* renamed from: r, reason: collision with root package name */
    private long f22299r;

    /* renamed from: s, reason: collision with root package name */
    private double f22300s;

    /* renamed from: t, reason: collision with root package name */
    private int f22301t;

    /* renamed from: u, reason: collision with root package name */
    private List<a> f22302u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f22303v;

    /* renamed from: w, reason: collision with root package name */
    private d<?> f22304w;

    /* renamed from: z, reason: collision with root package name */
    private Context f22307z;

    /* renamed from: i, reason: collision with root package name */
    private long f22290i = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    /* renamed from: x, reason: collision with root package name */
    private int f22305x = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: y, reason: collision with root package name */
    private int f22306y = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: F, reason: collision with root package name */
    private int f22278F = 0;

    public b(int i8, String str, String str2, String str3) {
        this.f22282a = i8;
        this.f22283b = str;
        this.f22284c = str2;
        this.f22285d = str3;
    }

    public final int A() {
        return this.f22275C;
    }

    public final int B() {
        return this.f22274B;
    }

    public final List<CampaignEx> C() {
        return this.f22276D;
    }

    public final int D() {
        int i8 = this.f22277E;
        if (i8 <= 0) {
            return 1;
        }
        return i8;
    }

    public final int E() {
        return this.f22278F;
    }

    public final Map<String, Object> F() {
        if (this.f22280H == null) {
            this.f22280H = new HashMap();
        }
        return this.f22280H;
    }

    public final long G() {
        return this.f22279G;
    }

    public final String H() {
        return this.f22281I;
    }

    public final int a() {
        return this.f22282a;
    }

    public final String b() {
        return this.f22284c;
    }

    public final String c() {
        return this.f22285d;
    }

    public final String d() {
        return this.f22286e;
    }

    public final String e() {
        return this.f22287f;
    }

    public final String f() {
        return this.f22288g;
    }

    public final boolean g() {
        return this.f22289h;
    }

    public final int h() {
        return this.f22291j;
    }

    public final String i() {
        return this.f22292k;
    }

    public final String j() {
        return this.f22293l;
    }

    public final String k() {
        return this.f22294m;
    }

    public final String l() {
        return this.f22295n;
    }

    public final int m() {
        return this.f22296o;
    }

    public final long n() {
        return this.f22297p;
    }

    public final long o() {
        return this.f22298q;
    }

    public final long p() {
        return this.f22299r;
    }

    public final double q() {
        return this.f22300s;
    }

    public final int r() {
        return this.f22301t;
    }

    public final List<a> s() {
        return this.f22302u;
    }

    public final JSONObject t() {
        return this.f22303v;
    }

    public final d<?> u() {
        d<?> dVar = this.f22304w;
        if (dVar != null) {
            return dVar;
        }
        String str = this.f22273A;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f22304w == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                this.f22304w = new e(this, null);
            } else {
                this.f22304w = new i(this, null);
            }
        }
        return this.f22304w;
    }

    public final int v() {
        return this.f22305x;
    }

    public final Context w() {
        return this.f22307z;
    }

    public final boolean x() {
        List<a> list;
        boolean z8;
        boolean z9;
        d<?> dVar = this.f22304w;
        if ((dVar != null && !dVar.c()) || (list = this.f22302u) == null || list.isEmpty()) {
            return false;
        }
        int size = this.f22302u.size();
        Iterator<a> it = this.f22302u.iterator();
        int i8 = 0;
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            n d8 = next.d();
            if (d8 != null && !d8.c()) {
                z8 = false;
            } else {
                z8 = true;
            }
            d<?> f8 = next.f();
            if (f8 != null && !f8.c()) {
                z9 = false;
            } else {
                z9 = true;
            }
            d<?> c8 = next.c();
            if (c8 != null && !c8.c()) {
                z10 = false;
            }
            if (z8 && z9 && z10) {
                i8++;
            }
        }
        if (i8 != size) {
            return false;
        }
        return true;
    }

    public final boolean y() {
        boolean z8;
        List<a> list;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f22297p > System.currentTimeMillis()) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean x8 = x();
        d<?> dVar = this.f22304w;
        if ((dVar == null || dVar.c()) && (list = this.f22302u) != null && !list.isEmpty()) {
            int size = this.f22302u.size();
            int i8 = 0;
            for (a aVar : this.f22302u) {
                n d8 = aVar.d();
                if (d8 != null && !d8.d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d<?> f8 = aVar.f();
                if (f8 != null && !f8.d()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                d<?> c8 = aVar.c();
                if (c8 != null && !c8.d()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z10 && z11 && z12) {
                    i8++;
                }
            }
            if (i8 == size) {
                z9 = true;
                if (!z8 && x8 && z9) {
                    return true;
                }
                return false;
            }
        }
        z9 = false;
        if (!z8) {
        }
        return false;
    }

    public final String z() {
        return this.f22273A;
    }

    public final void a(String str) {
        this.f22286e = str;
    }

    public final void b(String str) {
        this.f22287f = str;
    }

    public final void c(String str) {
        this.f22288g = str;
    }

    public final void d(String str) {
        this.f22292k = str;
    }

    public final void e(String str) {
        this.f22293l = str;
    }

    public final void f(String str) {
        this.f22294m = str;
    }

    public final void g(String str) {
        this.f22295n = str;
    }

    public final void h(String str) {
        this.f22273A = str;
    }

    public final void i(int i8) {
        this.f22278F = i8;
    }

    public final void a(boolean z8) {
        this.f22289h = z8;
    }

    public final void b(int i8) {
        this.f22296o = i8;
    }

    public final void c(long j8) {
        this.f22298q = j8;
    }

    public final void d(long j8) {
        this.f22299r = j8;
    }

    public final void e(int i8) {
        this.f22306y = i8;
    }

    public final void f(int i8) {
        this.f22275C = i8;
    }

    public final void g(int i8) {
        this.f22274B = i8;
    }

    public final void h(int i8) {
        this.f22277E = i8;
    }

    public final void i(String str) {
        this.f22281I = str;
    }

    public final void a(long j8) {
        this.f22290i = j8;
    }

    public final void b(long j8) {
        this.f22297p = j8;
    }

    public final void c(int i8) {
        this.f22301t = i8;
    }

    public final void d(int i8) {
        this.f22305x = i8;
    }

    public final void e(long j8) {
        this.f22279G = j8;
    }

    public final void a(int i8) {
        this.f22291j = i8;
    }

    public final void b(List<CampaignEx> list) {
        this.f22276D = list;
    }

    public final void a(double d8) {
        this.f22300s = d8;
    }

    public final void a(List<a> list) {
        this.f22302u = list;
    }

    public final void a(JSONObject jSONObject) {
        this.f22303v = jSONObject;
    }
}
