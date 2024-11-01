package s3;

import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import q3.C3632a;
import q3.C3634c;
import q3.C3636e;
import q3.C3641j;
import q3.C3644m;
import q3.C3646o;
import q3.C3648q;
import q3.C3651t;
import r3.C3889c;
import s3.n;
import y2.C4237a;
import y2.C4239c;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3950b {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f38936a;

        /* renamed from: b, reason: collision with root package name */
        private PaymentAnalyticsRequestFactory f38937b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f38938c;

        /* renamed from: d, reason: collision with root package name */
        private U5.g f38939d;

        /* renamed from: e, reason: collision with root package name */
        private U5.g f38940e;

        /* renamed from: f, reason: collision with root package name */
        private Map f38941f;

        /* renamed from: g, reason: collision with root package name */
        private Function0 f38942g;

        /* renamed from: h, reason: collision with root package name */
        private Set f38943h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f38944i;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f38945j;

        private a() {
        }

        @Override // s3.n.a
        public n build() {
            z5.h.a(this.f38936a, Context.class);
            z5.h.a(this.f38937b, PaymentAnalyticsRequestFactory.class);
            z5.h.a(this.f38938c, Boolean.class);
            z5.h.a(this.f38939d, U5.g.class);
            z5.h.a(this.f38940e, U5.g.class);
            z5.h.a(this.f38941f, Map.class);
            z5.h.a(this.f38942g, Function0.class);
            z5.h.a(this.f38943h, Set.class);
            z5.h.a(this.f38944i, Boolean.class);
            z5.h.a(this.f38945j, Boolean.class);
            return new C0881b(new I(), new C4237a(), this.f38936a, this.f38937b, this.f38938c, this.f38939d, this.f38940e, this.f38941f, this.f38942g, this.f38943h, this.f38944i, this.f38945j);
        }

        @Override // s3.n.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a i(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.f38937b = (PaymentAnalyticsRequestFactory) z5.h.b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // s3.n.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f38936a = (Context) z5.h.b(context);
            return this;
        }

        @Override // s3.n.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f38938c = (Boolean) z5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // s3.n.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a j(boolean z8) {
            this.f38945j = (Boolean) z5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // s3.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a e(boolean z8) {
            this.f38944i = (Boolean) z5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // s3.n.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f38943h = (Set) z5.h.b(set);
            return this;
        }

        @Override // s3.n.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f38942g = (Function0) z5.h.b(function0);
            return this;
        }

        @Override // s3.n.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a g(Map map) {
            this.f38941f = (Map) z5.h.b(map);
            return this;
        }

        @Override // s3.n.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a h(U5.g gVar) {
            this.f38940e = (U5.g) z5.h.b(gVar);
            return this;
        }

        @Override // s3.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a f(U5.g gVar) {
            this.f38939d = (U5.g) z5.h.b(gVar);
            return this;
        }
    }

    /* renamed from: s3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0881b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final C0881b f38946a;

        /* renamed from: b, reason: collision with root package name */
        private z5.i f38947b;

        /* renamed from: c, reason: collision with root package name */
        private z5.i f38948c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f38949d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f38950e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f38951f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f38952g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f38953h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f38954i;

        /* renamed from: j, reason: collision with root package name */
        private z5.i f38955j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f38956k;

        /* renamed from: l, reason: collision with root package name */
        private z5.i f38957l;

        /* renamed from: m, reason: collision with root package name */
        private z5.i f38958m;

        /* renamed from: n, reason: collision with root package name */
        private z5.i f38959n;

        /* renamed from: o, reason: collision with root package name */
        private z5.i f38960o;

        /* renamed from: p, reason: collision with root package name */
        private z5.i f38961p;

        /* renamed from: q, reason: collision with root package name */
        private z5.i f38962q;

        /* renamed from: r, reason: collision with root package name */
        private z5.i f38963r;

        /* renamed from: s, reason: collision with root package name */
        private z5.i f38964s;

        /* renamed from: t, reason: collision with root package name */
        private z5.i f38965t;

        /* renamed from: u, reason: collision with root package name */
        private z5.i f38966u;

        /* renamed from: v, reason: collision with root package name */
        private z5.i f38967v;

        /* renamed from: w, reason: collision with root package name */
        private z5.i f38968w;

        /* renamed from: x, reason: collision with root package name */
        private z5.i f38969x;

        /* renamed from: y, reason: collision with root package name */
        private z5.i f38970y;

        /* renamed from: z, reason: collision with root package name */
        private z5.i f38971z;

        private void b(I i8, C4237a c4237a, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, U5.g gVar, U5.g gVar2, Map map, Function0 function0, Set set, Boolean bool2, Boolean bool3) {
            z5.c cVar = new z5.c();
            this.f38947b = cVar;
            z5.i c8 = z5.d.c(r.a(cVar));
            this.f38948c = c8;
            this.f38949d = z5.d.c(C3636e.a(c8));
            z5.e a9 = z5.f.a(context);
            this.f38950e = a9;
            z5.i c9 = z5.d.c(p.a(a9));
            this.f38951f = c9;
            this.f38952g = z5.d.c(q.a(this.f38947b, c9));
            z5.e a10 = z5.f.a(bool);
            this.f38953h = a10;
            this.f38954i = z5.d.c(C4239c.a(c4237a, a10));
            z5.e a11 = z5.f.a(gVar);
            this.f38955j = a11;
            this.f38956k = B2.n.a(this.f38954i, a11);
            this.f38957l = z5.f.a(paymentAnalyticsRequestFactory);
            this.f38958m = z5.f.a(gVar2);
            this.f38959n = z5.f.a(function0);
            z5.e a12 = z5.f.a(bool2);
            this.f38960o = a12;
            this.f38961p = z5.d.c(C3644m.a(this.f38952g, this.f38948c, this.f38956k, this.f38957l, this.f38953h, this.f38958m, this.f38959n, a12));
            z5.i c10 = z5.d.c(C3646o.a(this.f38948c));
            this.f38962q = c10;
            this.f38963r = J.a(i8, c10);
            z5.e a13 = z5.f.a(map);
            this.f38964s = a13;
            z5.i c11 = z5.d.c(C3651t.a(this.f38952g, this.f38956k, this.f38957l, this.f38953h, this.f38958m, a13, this.f38959n, this.f38960o, this.f38951f, C3641j.a()));
            this.f38965t = c11;
            this.f38966u = z5.d.c(C3648q.a(c11, this.f38949d, this.f38950e));
            this.f38967v = z5.d.c(C3946A.a());
            z5.e a14 = z5.f.a(set);
            this.f38968w = a14;
            this.f38969x = z5.d.c(C3889c.a(this.f38967v, this.f38953h, this.f38959n, a14));
            this.f38970y = z5.g.b(11).c(StripeIntent.a.n.class, this.f38963r).c(StripeIntent.a.j.C0487a.class, this.f38965t).c(StripeIntent.a.i.class, this.f38965t).c(StripeIntent.a.C0478a.class, this.f38965t).c(StripeIntent.a.f.class, this.f38966u).c(StripeIntent.a.g.class, this.f38966u).c(StripeIntent.a.e.class, this.f38966u).c(StripeIntent.a.d.class, this.f38966u).c(StripeIntent.a.c.class, this.f38965t).c(StripeIntent.a.k.class, this.f38965t).c(StripeIntent.a.j.b.class, this.f38969x).b();
            z5.e a15 = z5.f.a(bool3);
            this.f38971z = a15;
            z5.c.a(this.f38947b, z5.d.c(C3634c.a(this.f38949d, this.f38961p, this.f38970y, a15, this.f38950e)));
        }

        @Override // s3.n
        public C3632a a() {
            return (C3632a) this.f38947b.get();
        }

        private C0881b(I i8, C4237a c4237a, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, U5.g gVar, U5.g gVar2, Map map, Function0 function0, Set set, Boolean bool2, Boolean bool3) {
            this.f38946a = this;
            b(i8, c4237a, context, paymentAnalyticsRequestFactory, bool, gVar, gVar2, map, function0, set, bool2, bool3);
        }
    }

    public static n.a a() {
        return new a();
    }
}
