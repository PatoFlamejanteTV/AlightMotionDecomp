package C3;

import B2.C0953e;
import C3.Z;
import C3.i0;
import O3.InterfaceC1371t;
import S2.a;
import S2.b;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import c3.C2025e;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.C2634a;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.f;
import j4.C3175d0;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import p2.C3568j;
import y2.C4237a;
import y2.C4238b;
import y2.C4239c;
import y2.C4240d;
import y2.C4242f;
import z3.InterfaceC4267a;

/* renamed from: C3.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1003y {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.y$a */
    /* loaded from: classes4.dex */
    public static final class a implements Z.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f911a;

        private a() {
        }

        @Override // C3.Z.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f911a = (Application) z5.h.b(application);
            return this;
        }

        @Override // C3.Z.a
        public Z build() {
            z5.h.a(this.f911a, Application.class);
            return new f(new O2.f(), new C4240d(), new C4237a(), this.f911a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.y$b */
    /* loaded from: classes4.dex */
    public static final class b implements a.InterfaceC0197a {

        /* renamed from: a, reason: collision with root package name */
        private final f f912a;

        @Override // S2.a.InterfaceC0197a
        public S2.a build() {
            return new c(this.f912a);
        }

        private b(f fVar) {
            this.f912a = fVar;
        }
    }

    /* renamed from: C3.y$c */
    /* loaded from: classes4.dex */
    private static final class c implements S2.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f913a;

        /* renamed from: b, reason: collision with root package name */
        private final c f914b;

        /* renamed from: c, reason: collision with root package name */
        private z5.i f915c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f916d;

        private void b() {
            R2.b a9 = R2.b.a(this.f913a.f947g, this.f913a.f952l, this.f913a.f957q, this.f913a.f946f, this.f913a.f945e, this.f913a.f953m);
            this.f915c = a9;
            this.f916d = z5.d.c(a9);
        }

        @Override // S2.a
        public R2.c a() {
            return new R2.c((R2.e) this.f916d.get());
        }

        private c(f fVar) {
            this.f914b = this;
            this.f913a = fVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.y$d */
    /* loaded from: classes4.dex */
    public static final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f917a;

        /* renamed from: b, reason: collision with root package name */
        private P2.d f918b;

        @Override // S2.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(P2.d dVar) {
            this.f918b = (P2.d) z5.h.b(dVar);
            return this;
        }

        @Override // S2.b.a
        public S2.b build() {
            z5.h.a(this.f918b, P2.d.class);
            return new e(this.f917a, this.f918b);
        }

        private d(f fVar) {
            this.f917a = fVar;
        }
    }

    /* renamed from: C3.y$e */
    /* loaded from: classes4.dex */
    private static final class e extends S2.b {

        /* renamed from: a, reason: collision with root package name */
        private final P2.d f919a;

        /* renamed from: b, reason: collision with root package name */
        private final f f920b;

        /* renamed from: c, reason: collision with root package name */
        private final e f921c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f922d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f923e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f924f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f925g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f926h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f927i;

        /* renamed from: j, reason: collision with root package name */
        private Y2.d f928j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f929k;

        private void d(P2.d dVar) {
            this.f922d = z5.f.a(dVar);
            this.f923e = z5.d.c(S2.f.a(this.f920b.f945e, this.f920b.f946f));
            this.f924f = z5.d.c(U2.b.a(this.f920b.f950j, this.f920b.f939J, this.f920b.f959s, this.f923e, this.f920b.f946f, this.f920b.f940K, this.f920b.f957q));
            R2.b a9 = R2.b.a(this.f920b.f947g, this.f920b.f952l, this.f920b.f957q, this.f920b.f946f, this.f920b.f945e, this.f920b.f953m);
            this.f925g = a9;
            z5.i c8 = z5.d.c(a9);
            this.f926h = c8;
            z5.i c9 = z5.d.c(Q2.c.a(this.f922d, this.f924f, c8, this.f920b.f957q));
            this.f927i = c9;
            Y2.d a10 = Y2.d.a(this.f922d, c9, this.f926h, this.f920b.f945e);
            this.f928j = a10;
            this.f929k = S2.d.b(a10);
        }

        @Override // S2.b
        public P2.d a() {
            return this.f919a;
        }

        @Override // S2.b
        public S2.c b() {
            return (S2.c) this.f929k.get();
        }

        @Override // S2.b
        public Q2.b c() {
            return (Q2.b) this.f927i.get();
        }

        private e(f fVar, P2.d dVar) {
            this.f921c = this;
            this.f920b = fVar;
            this.f919a = dVar;
            d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.y$f */
    /* loaded from: classes4.dex */
    public static final class f implements Z {

        /* renamed from: A, reason: collision with root package name */
        private z5.i f930A;

        /* renamed from: B, reason: collision with root package name */
        private z5.i f931B;

        /* renamed from: C, reason: collision with root package name */
        private z5.i f932C;

        /* renamed from: D, reason: collision with root package name */
        private z5.i f933D;

        /* renamed from: E, reason: collision with root package name */
        private z5.i f934E;

        /* renamed from: F, reason: collision with root package name */
        private z5.i f935F;

        /* renamed from: G, reason: collision with root package name */
        private z5.i f936G;

        /* renamed from: H, reason: collision with root package name */
        private z5.i f937H;

        /* renamed from: I, reason: collision with root package name */
        private z5.i f938I;

        /* renamed from: J, reason: collision with root package name */
        private z5.i f939J;

        /* renamed from: K, reason: collision with root package name */
        private z5.i f940K;

        /* renamed from: a, reason: collision with root package name */
        private final Application f941a;

        /* renamed from: b, reason: collision with root package name */
        private final f f942b;

        /* renamed from: c, reason: collision with root package name */
        private z5.i f943c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f944d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f945e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f946f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f947g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f948h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f949i;

        /* renamed from: j, reason: collision with root package name */
        private z5.i f950j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f951k;

        /* renamed from: l, reason: collision with root package name */
        private z5.i f952l;

        /* renamed from: m, reason: collision with root package name */
        private z5.i f953m;

        /* renamed from: n, reason: collision with root package name */
        private z5.i f954n;

        /* renamed from: o, reason: collision with root package name */
        private z5.i f955o;

        /* renamed from: p, reason: collision with root package name */
        private z5.i f956p;

        /* renamed from: q, reason: collision with root package name */
        private z5.i f957q;

        /* renamed from: r, reason: collision with root package name */
        private z5.i f958r;

        /* renamed from: s, reason: collision with root package name */
        private z5.i f959s;

        /* renamed from: t, reason: collision with root package name */
        private z5.i f960t;

        /* renamed from: u, reason: collision with root package name */
        private z5.i f961u;

        /* renamed from: v, reason: collision with root package name */
        private z5.i f962v;

        /* renamed from: w, reason: collision with root package name */
        private z5.i f963w;

        /* renamed from: x, reason: collision with root package name */
        private z5.i f964x;

        /* renamed from: y, reason: collision with root package name */
        private z5.i f965y;

        /* renamed from: z, reason: collision with root package name */
        private z5.i f966z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C3.y$f$a */
        /* loaded from: classes4.dex */
        public class a implements z5.i {
            a() {
            }

            @Override // N5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b.a get() {
                return new d(f.this.f942b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C3.y$f$b */
        /* loaded from: classes4.dex */
        public class b implements z5.i {
            b() {
            }

            @Override // N5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a.InterfaceC0197a get() {
                return new b(f.this.f942b);
            }
        }

        private C0953e F() {
            return N.c(this.f941a, this.f949i);
        }

        private B2.m G() {
            return new B2.m((v2.d) this.f945e.get(), (U5.g) this.f946f.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3568j H() {
            return new C3568j(this.f941a, G());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C2634a I() {
            return new C2634a(P(), ((Boolean) this.f937H.get()).booleanValue(), K(), L());
        }

        private void J(O2.f fVar, C4240d c4240d, C4237a c4237a, Application application) {
            this.f943c = z5.d.c(b0.a());
            z5.i c8 = z5.d.c(S.a());
            this.f944d = c8;
            this.f945e = z5.d.c(C4239c.a(c4237a, c8));
            z5.i c9 = z5.d.c(C4242f.a(c4240d));
            this.f946f = c9;
            this.f947g = B2.n.a(this.f945e, c9);
            z5.e a9 = z5.f.a(application);
            this.f948h = a9;
            T a10 = T.a(a9);
            this.f949i = a10;
            this.f950j = V.a(a10);
            z5.i c10 = z5.d.c(d0.a());
            this.f951k = c10;
            this.f952l = j3.j.a(this.f948h, this.f950j, c10);
            z5.i c11 = z5.d.c(Q.a());
            this.f953m = c11;
            this.f954n = z5.d.c(com.stripe.android.paymentsheet.analytics.b.a(this.f943c, this.f947g, this.f952l, c11, this.f946f));
            this.f955o = z5.d.c(U.a(this.f948h, this.f946f));
            N a11 = N.a(this.f948h, this.f949i);
            this.f956p = a11;
            p3.k a12 = p3.k.a(this.f947g, a11);
            this.f957q = a12;
            this.f958r = O2.g.a(fVar, this.f948h, this.f945e, a12);
            j3.k a13 = j3.k.a(this.f948h, this.f950j, this.f946f, this.f951k, this.f952l, this.f947g, this.f945e);
            this.f959s = a13;
            this.f960t = M3.h.a(a13, this.f949i, this.f946f);
            this.f961u = z5.d.c(M3.b.a(this.f959s, this.f949i, this.f945e, this.f957q, this.f946f, this.f951k));
            a aVar = new a();
            this.f962v = aVar;
            z5.i c12 = z5.d.c(P2.l.a(aVar));
            this.f963w = c12;
            this.f964x = N3.c.a(c12);
            this.f965y = z5.d.c(Q2.e.a(this.f948h));
            this.f966z = C3175d0.a(this.f957q);
            this.f930A = E2.g.a(this.f948h);
            this.f931B = z5.d.c(P.a());
            this.f932C = z5.d.c(N3.e.a(this.f955o, this.f958r, this.f960t, this.f961u, C2025e.a(), this.f945e, this.f954n, this.f957q, this.f946f, this.f964x, this.f965y, this.f966z, this.f930A, this.f931B));
            this.f933D = new b();
            P2.a a14 = P2.a.a(this.f959s);
            this.f934E = a14;
            this.f935F = z5.d.c(P2.h.a(this.f933D, a14, this.f965y));
            this.f936G = z5.d.c(O.a());
            this.f937H = z5.d.c(c0.a());
            this.f938I = z5.d.c(Y.a());
            this.f939J = W.a(this.f949i);
            this.f940K = z5.d.c(C4238b.a(c4237a));
        }

        private Function0 K() {
            return V.c(this.f949i);
        }

        private Function0 L() {
            return W.c(this.f949i);
        }

        private PaymentAnalyticsRequestFactory M() {
            return new PaymentAnalyticsRequestFactory(this.f941a, K(), (Set) this.f951k.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public p3.j N() {
            return new p3.j(G(), F());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public E2.f O() {
            return new E2.f(this.f941a);
        }

        private com.stripe.android.networking.a P() {
            return new com.stripe.android.networking.a(this.f941a, K(), (U5.g) this.f946f.get(), (Set) this.f951k.get(), M(), G(), (v2.d) this.f945e.get());
        }

        @Override // C3.Z
        public i0.a a() {
            return new g(this.f942b);
        }

        private f(O2.f fVar, C4240d c4240d, C4237a c4237a, Application application) {
            this.f942b = this;
            this.f941a = application;
            J(fVar, c4240d, c4237a, application);
        }
    }

    /* renamed from: C3.y$g */
    /* loaded from: classes4.dex */
    private static final class g implements i0.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f969a;

        /* renamed from: b, reason: collision with root package name */
        private e0 f970b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f971c;

        @Override // C3.i0.a
        public i0 build() {
            z5.h.a(this.f970b, e0.class);
            z5.h.a(this.f971c, SavedStateHandle.class);
            return new h(this.f969a, this.f970b, this.f971c);
        }

        @Override // C3.i0.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b(e0 e0Var) {
            this.f970b = (e0) z5.h.b(e0Var);
            return this;
        }

        @Override // C3.i0.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g a(SavedStateHandle savedStateHandle) {
            this.f971c = (SavedStateHandle) z5.h.b(savedStateHandle);
            return this;
        }

        private g(f fVar) {
            this.f969a = fVar;
        }
    }

    /* renamed from: C3.y$h */
    /* loaded from: classes4.dex */
    private static final class h implements i0 {

        /* renamed from: a, reason: collision with root package name */
        private final e0 f972a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f973b;

        /* renamed from: c, reason: collision with root package name */
        private final f f974c;

        /* renamed from: d, reason: collision with root package name */
        private final h f975d;

        /* renamed from: e, reason: collision with root package name */
        private com.stripe.android.googlepaylauncher.m f976e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f977f;

        /* renamed from: g, reason: collision with root package name */
        private com.stripe.android.payments.paymentlauncher.f f978g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f979h;

        private void b(e0 e0Var, SavedStateHandle savedStateHandle) {
            com.stripe.android.googlepaylauncher.m a9 = com.stripe.android.googlepaylauncher.m.a(this.f974c.f948h, this.f974c.f958r, this.f974c.f952l, this.f974c.f947g);
            this.f976e = a9;
            this.f977f = O2.i.b(a9);
            com.stripe.android.payments.paymentlauncher.f a10 = com.stripe.android.payments.paymentlauncher.f.a(this.f974c.f944d, this.f974c.f951k);
            this.f978g = a10;
            this.f979h = com.stripe.android.payments.paymentlauncher.e.b(a10);
        }

        private f.d c() {
            return h0.a(this.f972a, this.f973b, this.f974c.f949i, (com.stripe.android.paymentsheet.paymentdatacollection.bacs.b) this.f974c.f936G.get(), (O2.h) this.f977f.get(), (com.stripe.android.payments.paymentlauncher.d) this.f979h.get(), this.f974c.I(), this.f974c.N(), this.f974c.O());
        }

        private com.stripe.android.paymentsheet.i d() {
            return new com.stripe.android.paymentsheet.i((com.stripe.android.link.a) this.f974c.f935F.get(), (P2.e) this.f974c.f963w.get(), this.f973b, (Q2.d) this.f974c.f965y.get(), new b(this.f974c));
        }

        private v3.q e() {
            return g0.a(this.f972a, this.f974c.f941a, (U5.g) this.f974c.f946f.get());
        }

        @Override // C3.i0
        public com.stripe.android.paymentsheet.A a() {
            return new com.stripe.android.paymentsheet.A(f0.a(this.f972a), (EventReporter) this.f974c.f954n.get(), (N3.h) this.f974c.f932C.get(), (M3.c) this.f974c.f961u.get(), e(), (v2.d) this.f974c.f945e.get(), (U5.g) this.f974c.f946f.get(), this.f973b, d(), c(), this.f974c.H(), (InterfaceC1371t.a) this.f974c.f938I.get(), this.f974c.N(), (InterfaceC4267a) this.f974c.f931B.get(), X.a());
        }

        private h(f fVar, e0 e0Var, SavedStateHandle savedStateHandle) {
            this.f975d = this;
            this.f974c = fVar;
            this.f972a = e0Var;
            this.f973b = savedStateHandle;
            b(e0Var, savedStateHandle);
        }
    }

    public static Z.a a() {
        return new a();
    }
}
