package C3;

import C3.H;
import C3.K;
import O3.InterfaceC1371t;
import S2.a;
import S2.b;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.Set;
import p2.C3568j;
import y2.C4237a;
import y2.C4238b;
import y2.C4239c;
import y2.C4240d;
import y2.C4242f;

/* renamed from: C3.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0995p {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.p$a */
    /* loaded from: classes4.dex */
    public static final class a implements H.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f854a;

        /* renamed from: b, reason: collision with root package name */
        private Set f855b;

        private a() {
        }

        @Override // C3.H.a
        public H build() {
            z5.h.a(this.f854a, Context.class);
            z5.h.a(this.f855b, Set.class);
            return new f(new I(), new C4240d(), new C4237a(), this.f854a, this.f855b);
        }

        @Override // C3.H.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f854a = (Context) z5.h.b(context);
            return this;
        }

        @Override // C3.H.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f855b = (Set) z5.h.b(set);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.p$b */
    /* loaded from: classes4.dex */
    public static final class b implements a.InterfaceC0197a {

        /* renamed from: a, reason: collision with root package name */
        private final f f856a;

        @Override // S2.a.InterfaceC0197a
        public S2.a build() {
            return new c(this.f856a);
        }

        private b(f fVar) {
            this.f856a = fVar;
        }
    }

    /* renamed from: C3.p$c */
    /* loaded from: classes4.dex */
    private static final class c implements S2.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f857a;

        /* renamed from: b, reason: collision with root package name */
        private final c f858b;

        /* renamed from: c, reason: collision with root package name */
        private z5.i f859c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f860d;

        private void b() {
            R2.b a9 = R2.b.a(this.f857a.f881g, this.f857a.f886l, this.f857a.f891q, this.f857a.f880f, this.f857a.f879e, this.f857a.f887m);
            this.f859c = a9;
            this.f860d = z5.d.c(a9);
        }

        @Override // S2.a
        public R2.c a() {
            return new R2.c((R2.e) this.f860d.get());
        }

        private c(f fVar) {
            this.f858b = this;
            this.f857a = fVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.p$d */
    /* loaded from: classes4.dex */
    public static final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f861a;

        /* renamed from: b, reason: collision with root package name */
        private P2.d f862b;

        @Override // S2.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(P2.d dVar) {
            this.f862b = (P2.d) z5.h.b(dVar);
            return this;
        }

        @Override // S2.b.a
        public S2.b build() {
            z5.h.a(this.f862b, P2.d.class);
            return new e(this.f861a, this.f862b);
        }

        private d(f fVar) {
            this.f861a = fVar;
        }
    }

    /* renamed from: C3.p$e */
    /* loaded from: classes4.dex */
    private static final class e extends S2.b {

        /* renamed from: a, reason: collision with root package name */
        private final P2.d f863a;

        /* renamed from: b, reason: collision with root package name */
        private final f f864b;

        /* renamed from: c, reason: collision with root package name */
        private final e f865c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f866d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f867e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f868f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f869g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f870h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f871i;

        /* renamed from: j, reason: collision with root package name */
        private Y2.d f872j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f873k;

        private void d(P2.d dVar) {
            this.f866d = z5.f.a(dVar);
            this.f867e = z5.d.c(S2.f.a(this.f864b.f879e, this.f864b.f880f));
            this.f868f = z5.d.c(U2.b.a(this.f864b.f884j, this.f864b.f900z, this.f864b.f889o, this.f867e, this.f864b.f880f, this.f864b.f874A, this.f864b.f891q));
            R2.b a9 = R2.b.a(this.f864b.f881g, this.f864b.f886l, this.f864b.f891q, this.f864b.f880f, this.f864b.f879e, this.f864b.f887m);
            this.f869g = a9;
            z5.i c8 = z5.d.c(a9);
            this.f870h = c8;
            z5.i c9 = z5.d.c(Q2.c.a(this.f866d, this.f868f, c8, this.f864b.f891q));
            this.f871i = c9;
            Y2.d a10 = Y2.d.a(this.f866d, c9, this.f870h, this.f864b.f879e);
            this.f872j = a10;
            this.f873k = S2.d.b(a10);
        }

        @Override // S2.b
        public P2.d a() {
            return this.f863a;
        }

        @Override // S2.b
        public S2.c b() {
            return (S2.c) this.f873k.get();
        }

        @Override // S2.b
        public Q2.b c() {
            return (Q2.b) this.f871i.get();
        }

        private e(f fVar, P2.d dVar) {
            this.f865c = this;
            this.f864b = fVar;
            this.f863a = dVar;
            d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.p$f */
    /* loaded from: classes4.dex */
    public static final class f implements H {

        /* renamed from: A, reason: collision with root package name */
        private z5.i f874A;

        /* renamed from: a, reason: collision with root package name */
        private final Context f875a;

        /* renamed from: b, reason: collision with root package name */
        private final f f876b;

        /* renamed from: c, reason: collision with root package name */
        private z5.i f877c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f878d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f879e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f880f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f881g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f882h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f883i;

        /* renamed from: j, reason: collision with root package name */
        private z5.i f884j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f885k;

        /* renamed from: l, reason: collision with root package name */
        private z5.i f886l;

        /* renamed from: m, reason: collision with root package name */
        private z5.i f887m;

        /* renamed from: n, reason: collision with root package name */
        private z5.i f888n;

        /* renamed from: o, reason: collision with root package name */
        private z5.i f889o;

        /* renamed from: p, reason: collision with root package name */
        private z5.i f890p;

        /* renamed from: q, reason: collision with root package name */
        private z5.i f891q;

        /* renamed from: r, reason: collision with root package name */
        private z5.i f892r;

        /* renamed from: s, reason: collision with root package name */
        private z5.i f893s;

        /* renamed from: t, reason: collision with root package name */
        private z5.i f894t;

        /* renamed from: u, reason: collision with root package name */
        private z5.i f895u;

        /* renamed from: v, reason: collision with root package name */
        private z5.i f896v;

        /* renamed from: w, reason: collision with root package name */
        private z5.i f897w;

        /* renamed from: x, reason: collision with root package name */
        private z5.i f898x;

        /* renamed from: y, reason: collision with root package name */
        private z5.i f899y;

        /* renamed from: z, reason: collision with root package name */
        private z5.i f900z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C3.p$f$a */
        /* loaded from: classes4.dex */
        public class a implements z5.i {
            a() {
            }

            @Override // N5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a.InterfaceC0197a get() {
                return new b(f.this.f876b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C3.p$f$b */
        /* loaded from: classes4.dex */
        public class b implements z5.i {
            b() {
            }

            @Override // N5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b.a get() {
                return new d(f.this.f876b);
            }
        }

        private B2.m t() {
            return new B2.m((v2.d) this.f879e.get(), (U5.g) this.f880f.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3568j u() {
            return new C3568j(this.f875a, t());
        }

        private void v(I i8, C4240d c4240d, C4237a c4237a, Context context, Set set) {
            this.f877c = z5.d.c(J.a(i8));
            z5.i c8 = z5.d.c(S.a());
            this.f878d = c8;
            this.f879e = z5.d.c(C4239c.a(c4237a, c8));
            z5.i c9 = z5.d.c(C4242f.a(c4240d));
            this.f880f = c9;
            this.f881g = B2.n.a(this.f879e, c9);
            z5.e a9 = z5.f.a(context);
            this.f882h = a9;
            T a10 = T.a(a9);
            this.f883i = a10;
            this.f884j = V.a(a10);
            z5.e a11 = z5.f.a(set);
            this.f885k = a11;
            this.f886l = j3.j.a(this.f882h, this.f884j, a11);
            z5.i c10 = z5.d.c(Q.a());
            this.f887m = c10;
            this.f888n = z5.d.c(com.stripe.android.paymentsheet.analytics.b.a(this.f877c, this.f881g, this.f886l, c10, this.f880f));
            this.f889o = j3.k.a(this.f882h, this.f884j, this.f880f, this.f885k, this.f886l, this.f881g, this.f879e);
            N a12 = N.a(this.f882h, this.f883i);
            this.f890p = a12;
            p3.k a13 = p3.k.a(this.f881g, a12);
            this.f891q = a13;
            this.f892r = z5.d.c(M3.b.a(this.f889o, this.f883i, this.f879e, a13, this.f880f, this.f885k));
            this.f893s = new a();
            this.f894t = P2.a.a(this.f889o);
            z5.i c11 = z5.d.c(Q2.e.a(this.f882h));
            this.f895u = c11;
            this.f896v = z5.d.c(P2.h.a(this.f893s, this.f894t, c11));
            b bVar = new b();
            this.f897w = bVar;
            this.f898x = z5.d.c(P2.l.a(bVar));
            this.f899y = z5.d.c(Y.a());
            this.f900z = W.a(this.f883i);
            this.f874A = z5.d.c(C4238b.a(c4237a));
        }

        @Override // C3.H
        public K.a a() {
            return new g(this.f876b);
        }

        private f(I i8, C4240d c4240d, C4237a c4237a, Context context, Set set) {
            this.f876b = this;
            this.f875a = context;
            v(i8, c4240d, c4237a, context, set);
        }
    }

    /* renamed from: C3.p$g */
    /* loaded from: classes4.dex */
    private static final class g implements K.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f903a;

        /* renamed from: b, reason: collision with root package name */
        private Application f904b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f905c;

        /* renamed from: d, reason: collision with root package name */
        private PaymentOptionContract.a f906d;

        @Override // C3.K.a
        public K build() {
            z5.h.a(this.f904b, Application.class);
            z5.h.a(this.f905c, SavedStateHandle.class);
            z5.h.a(this.f906d, PaymentOptionContract.a.class);
            return new h(this.f903a, this.f904b, this.f905c, this.f906d);
        }

        @Override // C3.K.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g b(Application application) {
            this.f904b = (Application) z5.h.b(application);
            return this;
        }

        @Override // C3.K.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public g c(PaymentOptionContract.a aVar) {
            this.f906d = (PaymentOptionContract.a) z5.h.b(aVar);
            return this;
        }

        @Override // C3.K.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g a(SavedStateHandle savedStateHandle) {
            this.f905c = (SavedStateHandle) z5.h.b(savedStateHandle);
            return this;
        }

        private g(f fVar) {
            this.f903a = fVar;
        }
    }

    /* renamed from: C3.p$h */
    /* loaded from: classes4.dex */
    private static final class h implements K {

        /* renamed from: a, reason: collision with root package name */
        private final PaymentOptionContract.a f907a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f908b;

        /* renamed from: c, reason: collision with root package name */
        private final f f909c;

        /* renamed from: d, reason: collision with root package name */
        private final h f910d;

        private com.stripe.android.paymentsheet.i b() {
            return new com.stripe.android.paymentsheet.i((com.stripe.android.link.a) this.f909c.f896v.get(), (P2.e) this.f909c.f898x.get(), this.f908b, (Q2.d) this.f909c.f895u.get(), new b(this.f909c));
        }

        @Override // C3.K
        public com.stripe.android.paymentsheet.v a() {
            return new com.stripe.android.paymentsheet.v(this.f907a, (EventReporter) this.f909c.f888n.get(), (M3.c) this.f909c.f892r.get(), (U5.g) this.f909c.f880f.get(), this.f908b, b(), this.f909c.u(), (InterfaceC1371t.a) this.f909c.f899y.get());
        }

        private h(f fVar, Application application, SavedStateHandle savedStateHandle, PaymentOptionContract.a aVar) {
            this.f910d = this;
            this.f909c = fVar;
            this.f907a = aVar;
            this.f908b = savedStateHandle;
        }
    }

    public static H.a a() {
        return new a();
    }
}
