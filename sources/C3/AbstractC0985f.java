package C3;

import C3.G;
import C3.InterfaceC0980a;
import C3.InterfaceC0984e;
import android.app.Application;
import android.content.Context;
import c3.C2028h;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.g;
import com.stripe.android.paymentsheet.addresselement.h;
import j4.C3201q0;
import java.util.Map;
import k4.InterfaceC3244b;
import x3.C4217d;
import x3.InterfaceC4215b;
import y2.C4237a;
import y2.C4239c;
import y2.C4240d;
import y2.C4242f;

/* renamed from: C3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0985f {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC0980a {

        /* renamed from: a, reason: collision with root package name */
        private final AddressElementActivityContract.a f808a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f809b;

        /* renamed from: c, reason: collision with root package name */
        private final a f810c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f811d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f812e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f813f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f814g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f815h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f816i;

        /* renamed from: j, reason: collision with root package name */
        private z5.i f817j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f818k;

        /* renamed from: l, reason: collision with root package name */
        private z5.i f819l;

        /* renamed from: m, reason: collision with root package name */
        private z5.i f820m;

        /* renamed from: n, reason: collision with root package name */
        private z5.i f821n;

        /* renamed from: o, reason: collision with root package name */
        private z5.i f822o;

        /* renamed from: p, reason: collision with root package name */
        private z5.i f823p;

        /* renamed from: q, reason: collision with root package name */
        private z5.i f824q;

        /* renamed from: r, reason: collision with root package name */
        private z5.i f825r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C3.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0018a implements z5.i {
            C0018a() {
            }

            @Override // N5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public G.a get() {
                return new g(a.this.f810c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C3.f$a$b */
        /* loaded from: classes4.dex */
        public class b implements z5.i {
            b() {
            }

            @Override // N5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC0984e.a get() {
                return new b(a.this.f810c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C3.f$a$c */
        /* loaded from: classes4.dex */
        public class c implements z5.i {
            c() {
            }

            @Override // N5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h.a get() {
                return new e(a.this.f810c);
            }
        }

        private void i(C4240d c4240d, C4237a c4237a, C0981b c0981b, Context context, AddressElementActivityContract.a aVar) {
            this.f811d = z5.d.c(w3.c.a());
            this.f812e = new C0018a();
            this.f813f = new b();
            z5.i c8 = z5.d.c(S.a());
            this.f814g = c8;
            this.f815h = z5.d.c(C4239c.a(c4237a, c8));
            z5.i c9 = z5.d.c(C4242f.a(c4240d));
            this.f816i = c9;
            this.f817j = B2.n.a(this.f815h, c9);
            z5.e a9 = z5.f.a(context);
            this.f818k = a9;
            T a10 = T.a(a9);
            this.f819l = a10;
            N a11 = N.a(this.f818k, a10);
            this.f820m = a11;
            z5.i c10 = z5.d.c(C4217d.a(this.f817j, a11, this.f816i));
            this.f821n = c10;
            this.f822o = z5.d.c(C0982c.a(c0981b, c10));
            this.f823p = new c();
            z5.e a12 = z5.f.a(aVar);
            this.f824q = a12;
            this.f825r = z5.d.c(C0983d.a(c0981b, this.f818k, a12));
        }

        @Override // C3.InterfaceC0980a
        public com.stripe.android.paymentsheet.addresselement.c a() {
            return new com.stripe.android.paymentsheet.addresselement.c((com.stripe.android.paymentsheet.addresselement.a) this.f811d.get(), this.f812e, this.f813f);
        }

        private a(C4240d c4240d, C4237a c4237a, C0981b c0981b, Context context, AddressElementActivityContract.a aVar) {
            this.f810c = this;
            this.f808a = aVar;
            this.f809b = context;
            i(c4240d, c4237a, c0981b, context, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC0984e.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f829a;

        /* renamed from: b, reason: collision with root package name */
        private Application f830b;

        /* renamed from: c, reason: collision with root package name */
        private g.c f831c;

        @Override // C3.InterfaceC0984e.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b b(Application application) {
            this.f830b = (Application) z5.h.b(application);
            return this;
        }

        @Override // C3.InterfaceC0984e.a
        public InterfaceC0984e build() {
            z5.h.a(this.f830b, Application.class);
            z5.h.a(this.f831c, g.c.class);
            return new c(this.f829a, this.f830b, this.f831c);
        }

        @Override // C3.InterfaceC0984e.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b c(g.c cVar) {
            this.f831c = (g.c) z5.h.b(cVar);
            return this;
        }

        private b(a aVar) {
            this.f829a = aVar;
        }
    }

    /* renamed from: C3.f$c */
    /* loaded from: classes4.dex */
    private static final class c implements InterfaceC0984e {

        /* renamed from: a, reason: collision with root package name */
        private final g.c f832a;

        /* renamed from: b, reason: collision with root package name */
        private final Application f833b;

        /* renamed from: c, reason: collision with root package name */
        private final a f834c;

        /* renamed from: d, reason: collision with root package name */
        private final c f835d;

        @Override // C3.InterfaceC0984e
        public com.stripe.android.paymentsheet.addresselement.g a() {
            return new com.stripe.android.paymentsheet.addresselement.g(this.f834c.f808a, (com.stripe.android.paymentsheet.addresselement.a) this.f834c.f811d.get(), (InterfaceC3244b) this.f834c.f825r.get(), this.f832a, (InterfaceC4215b) this.f834c.f822o.get(), this.f833b);
        }

        private c(a aVar, Application application, g.c cVar) {
            this.f835d = this;
            this.f834c = aVar;
            this.f832a = cVar;
            this.f833b = application;
        }
    }

    /* renamed from: C3.f$d */
    /* loaded from: classes4.dex */
    private static final class d implements InterfaceC0980a.InterfaceC0017a {

        /* renamed from: a, reason: collision with root package name */
        private Context f836a;

        /* renamed from: b, reason: collision with root package name */
        private AddressElementActivityContract.a f837b;

        private d() {
        }

        @Override // C3.InterfaceC0980a.InterfaceC0017a
        public InterfaceC0980a build() {
            z5.h.a(this.f836a, Context.class);
            z5.h.a(this.f837b, AddressElementActivityContract.a.class);
            return new a(new C4240d(), new C4237a(), new C0981b(), this.f836a, this.f837b);
        }

        @Override // C3.InterfaceC0980a.InterfaceC0017a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a(Context context) {
            this.f836a = (Context) z5.h.b(context);
            return this;
        }

        @Override // C3.InterfaceC0980a.InterfaceC0017a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d b(AddressElementActivityContract.a aVar) {
            this.f837b = (AddressElementActivityContract.a) z5.h.b(aVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.f$e */
    /* loaded from: classes4.dex */
    public static final class e implements h.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f838a;

        /* renamed from: b, reason: collision with root package name */
        private C3201q0 f839b;

        /* renamed from: c, reason: collision with root package name */
        private Map f840c;

        /* renamed from: d, reason: collision with root package name */
        private Map f841d;

        /* renamed from: e, reason: collision with root package name */
        private n6.M f842e;

        /* renamed from: f, reason: collision with root package name */
        private StripeIntent f843f;

        /* renamed from: g, reason: collision with root package name */
        private String f844g;

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        public com.stripe.android.paymentsheet.addresselement.h build() {
            z5.h.a(this.f839b, C3201q0.class);
            z5.h.a(this.f840c, Map.class);
            z5.h.a(this.f842e, n6.M.class);
            z5.h.a(this.f844g, String.class);
            return new C0019f(this.f838a, this.f839b, this.f840c, this.f841d, this.f842e, this.f843f, this.f844g);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e a(C3201q0 c3201q0) {
            this.f839b = (C3201q0) z5.h.b(c3201q0);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public e b(Map map) {
            this.f840c = (Map) z5.h.b(map);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public e c(String str) {
            this.f844g = (String) z5.h.b(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public e e(Map map) {
            this.f841d = map;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public e f(StripeIntent stripeIntent) {
            this.f843f = stripeIntent;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public e d(n6.M m8) {
            this.f842e = (n6.M) z5.h.b(m8);
            return this;
        }

        private e(a aVar) {
            this.f838a = aVar;
        }
    }

    /* renamed from: C3.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0019f implements com.stripe.android.paymentsheet.addresselement.h {

        /* renamed from: a, reason: collision with root package name */
        private final C3201q0 f845a;

        /* renamed from: b, reason: collision with root package name */
        private final String f846b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f847c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f848d;

        /* renamed from: e, reason: collision with root package name */
        private final a f849e;

        /* renamed from: f, reason: collision with root package name */
        private final C0019f f850f;

        private C2028h b() {
            return w3.k.a(this.f849e.f809b, this.f846b, this.f847c, this.f848d);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h
        public w3.i a() {
            return new w3.i(this.f845a, b());
        }

        private C0019f(a aVar, C3201q0 c3201q0, Map map, Map map2, n6.M m8, StripeIntent stripeIntent, String str) {
            this.f850f = this;
            this.f849e = aVar;
            this.f845a = c3201q0;
            this.f846b = str;
            this.f847c = map;
            this.f848d = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.f$g */
    /* loaded from: classes4.dex */
    public static final class g implements G.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f851a;

        @Override // C3.G.a
        public G build() {
            return new h(this.f851a);
        }

        private g(a aVar) {
            this.f851a = aVar;
        }
    }

    /* renamed from: C3.f$h */
    /* loaded from: classes4.dex */
    private static final class h implements G {

        /* renamed from: a, reason: collision with root package name */
        private final a f852a;

        /* renamed from: b, reason: collision with root package name */
        private final h f853b;

        @Override // C3.G
        public com.stripe.android.paymentsheet.addresselement.j a() {
            return new com.stripe.android.paymentsheet.addresselement.j(this.f852a.f808a, (com.stripe.android.paymentsheet.addresselement.a) this.f852a.f811d.get(), (InterfaceC4215b) this.f852a.f822o.get(), this.f852a.f823p);
        }

        private h(a aVar) {
            this.f853b = this;
            this.f852a = aVar;
        }
    }

    public static InterfaceC0980a.InterfaceC0017a a() {
        return new d();
    }
}
