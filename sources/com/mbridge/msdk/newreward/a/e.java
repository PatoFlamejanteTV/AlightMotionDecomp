package com.mbridge.msdk.newreward.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    private int f22057A;

    /* renamed from: B, reason: collision with root package name */
    private long f22058B;

    /* renamed from: K, reason: collision with root package name */
    private RewardVideoListener f22067K;

    /* renamed from: a, reason: collision with root package name */
    public b f22068a;

    /* renamed from: b, reason: collision with root package name */
    int f22069b;

    /* renamed from: c, reason: collision with root package name */
    private String f22070c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22071d;

    /* renamed from: e, reason: collision with root package name */
    private int f22072e;

    /* renamed from: f, reason: collision with root package name */
    private int f22073f;

    /* renamed from: g, reason: collision with root package name */
    private int f22074g;

    /* renamed from: h, reason: collision with root package name */
    private int f22075h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22078k;

    /* renamed from: m, reason: collision with root package name */
    private long f22080m;

    /* renamed from: n, reason: collision with root package name */
    private long f22081n;

    /* renamed from: r, reason: collision with root package name */
    private String f22085r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f22086s;

    /* renamed from: u, reason: collision with root package name */
    private String f22088u;

    /* renamed from: v, reason: collision with root package name */
    private String f22089v;

    /* renamed from: w, reason: collision with root package name */
    private int f22090w;

    /* renamed from: x, reason: collision with root package name */
    private String f22091x;

    /* renamed from: y, reason: collision with root package name */
    private String f22092y;

    /* renamed from: i, reason: collision with root package name */
    private int f22076i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f22077j = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22079l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22082o = false;

    /* renamed from: p, reason: collision with root package name */
    private int f22083p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f22084q = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22087t = false;

    /* renamed from: z, reason: collision with root package name */
    private String f22093z = "";

    /* renamed from: C, reason: collision with root package name */
    private boolean f22059C = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f22060D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f22061E = false;

    /* renamed from: F, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.a f22062F = new com.mbridge.msdk.newreward.function.f.a();

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.d f22063G = new com.mbridge.msdk.newreward.function.f.d();

    /* renamed from: H, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.e f22064H = new com.mbridge.msdk.newreward.function.f.e();

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.c f22065I = new com.mbridge.msdk.newreward.function.f.c();

    /* renamed from: J, reason: collision with root package name */
    private int f22066J = 25000;

    public e(boolean z8, int i8, String str, String str2, boolean z9) {
        this.f22071d = z8;
        this.f22090w = i8;
        this.f22088u = str;
        this.f22089v = str2;
        this.f22078k = z9;
    }

    public final String A() {
        return this.f22089v;
    }

    public final boolean B() {
        return this.f22071d;
    }

    public final String C() {
        return this.f22088u;
    }

    public final RewardVideoListener D() {
        return this.f22067K;
    }

    public final int E() {
        return this.f22073f;
    }

    public final int F() {
        if (this.f22071d) {
            return 2;
        }
        return 3;
    }

    public final int G() {
        return this.f22072e;
    }

    public final int H() {
        return this.f22076i;
    }

    public final int I() {
        int i8 = this.f22066J;
        if (i8 <= 0) {
            return 25000;
        }
        return i8;
    }

    public final int J() {
        return this.f22077j;
    }

    public final boolean K() {
        return this.f22078k;
    }

    public final long L() {
        long f8;
        com.mbridge.msdk.newreward.function.f.a aVar = this.f22062F;
        if (aVar != null && aVar.b() != null && this.f22062F.b().n() > 0) {
            return this.f22062F.b().n();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.mbridge.msdk.videocommon.d.a a9 = this.f22064H.a();
        if (a9 == null) {
            f8 = 3600000;
        } else {
            f8 = a9.f();
        }
        return f8 + currentTimeMillis;
    }

    public final boolean a() {
        return this.f22086s;
    }

    public final String b() {
        return this.f22085r;
    }

    public final void c() {
        this.f22083p++;
    }

    public final void d() {
        this.f22084q++;
    }

    public final boolean e() {
        return this.f22082o;
    }

    public final long f() {
        return this.f22081n;
    }

    public final long g() {
        return this.f22080m;
    }

    public final boolean h() {
        return this.f22079l;
    }

    public final boolean i() {
        return this.f22087t;
    }

    public final int j() {
        return this.f22074g;
    }

    public final int k() {
        return this.f22075h;
    }

    public final boolean l() {
        return this.f22061E;
    }

    public final boolean m() {
        return this.f22060D;
    }

    public final boolean n() {
        return this.f22059C;
    }

    public final long o() {
        return this.f22058B;
    }

    public final int p() {
        return this.f22090w;
    }

    public final String q() {
        return this.f22093z;
    }

    public final com.mbridge.msdk.newreward.function.f.e r() {
        return this.f22064H;
    }

    public final int s() {
        return this.f22057A;
    }

    public final com.mbridge.msdk.newreward.function.f.c t() {
        return this.f22065I;
    }

    public final int u() {
        return this.f22069b;
    }

    public final String v() {
        return this.f22091x;
    }

    public final String w() {
        return this.f22092y;
    }

    public final com.mbridge.msdk.newreward.function.f.a x() {
        return this.f22062F;
    }

    public final com.mbridge.msdk.newreward.function.f.d y() {
        return this.f22063G;
    }

    public final String z() {
        return this.f22070c;
    }

    public final void a(boolean z8) {
        this.f22086s = z8;
    }

    public final void b(boolean z8) {
        this.f22082o = z8;
    }

    public final void c(boolean z8) {
        this.f22079l = z8;
    }

    public final void d(boolean z8) {
        this.f22087t = z8;
    }

    public final void e(boolean z8) {
        this.f22061E = z8;
    }

    public final void f(boolean z8) {
        this.f22060D = z8;
    }

    public final void g(boolean z8) {
        this.f22059C = z8;
    }

    public final void a(String str) {
        this.f22085r = str;
    }

    public final void b(long j8) {
        this.f22080m = j8;
    }

    public final void c(long j8) {
        this.f22058B = j8;
    }

    public final void d(String str) {
        this.f22092y = str;
    }

    public final void e(String str) {
        this.f22070c = str;
    }

    public final void f(int i8) {
        this.f22077j = i8;
    }

    public final void a(long j8) {
        this.f22081n = j8;
    }

    public final void b(String str) {
        this.f22093z = str;
    }

    public final void c(int i8) {
        this.f22069b = i8;
    }

    public final void d(int i8) {
        this.f22076i = i8;
    }

    public final void e(int i8) {
        this.f22066J = i8;
    }

    public final void a(int i8) {
        this.f22072e = i8;
    }

    public final void b(int i8) {
        this.f22057A = i8;
    }

    public final void c(String str) {
        this.f22091x = str;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.e eVar) {
        this.f22064H = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.a aVar) {
        this.f22062F = aVar;
    }

    public final void a(RewardVideoListener rewardVideoListener) {
        this.f22067K = rewardVideoListener;
    }

    public final void a(int i8, int i9, int i10) {
        this.f22073f = i8;
        this.f22074g = i9;
        this.f22075h = i10;
    }
}
