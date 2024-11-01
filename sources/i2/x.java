package I2;

import I2.a;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import c3.C2025e;
import v3.C4123c;

/* loaded from: classes4.dex */
public abstract class x {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements a.InterfaceC0065a {

        /* renamed from: a, reason: collision with root package name */
        private Application f3362a;

        /* renamed from: b, reason: collision with root package name */
        private F2.c f3363b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f3364c;

        /* renamed from: d, reason: collision with root package name */
        private SavedStateHandle f3365d;

        private a() {
        }

        @Override // I2.a.InterfaceC0065a
        public I2.a build() {
            z5.h.a(this.f3362a, Application.class);
            z5.h.a(this.f3363b, F2.c.class);
            z5.h.a(this.f3365d, SavedStateHandle.class);
            return new b(new O2.f(), this.f3362a, this.f3363b, this.f3364c, this.f3365d);
        }

        @Override // I2.a.InterfaceC0065a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f3362a = (Application) z5.h.b(application);
            return this;
        }

        @Override // I2.a.InterfaceC0065a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a d(F2.c cVar) {
            this.f3363b = (F2.c) z5.h.b(cVar);
            return this;
        }

        @Override // I2.a.InterfaceC0065a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(SavedStateHandle savedStateHandle) {
            this.f3365d = (SavedStateHandle) z5.h.b(savedStateHandle);
            return this;
        }

        @Override // I2.a.InterfaceC0065a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a c(Integer num) {
            this.f3364c = num;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    private static final class b implements I2.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f3366a;

        /* renamed from: b, reason: collision with root package name */
        private z5.i f3367b;

        /* renamed from: c, reason: collision with root package name */
        private z5.i f3368c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f3369d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f3370e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f3371f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f3372g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f3373h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f3374i;

        /* renamed from: j, reason: collision with root package name */
        private z5.i f3375j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f3376k;

        /* renamed from: l, reason: collision with root package name */
        private z5.i f3377l;

        /* renamed from: m, reason: collision with root package name */
        private z5.i f3378m;

        /* renamed from: n, reason: collision with root package name */
        private z5.i f3379n;

        /* renamed from: o, reason: collision with root package name */
        private com.stripe.android.payments.paymentlauncher.f f3380o;

        /* renamed from: p, reason: collision with root package name */
        private z5.i f3381p;

        /* renamed from: q, reason: collision with root package name */
        private z5.i f3382q;

        /* renamed from: r, reason: collision with root package name */
        private z5.i f3383r;

        /* renamed from: s, reason: collision with root package name */
        private z5.i f3384s;

        /* renamed from: t, reason: collision with root package name */
        private z5.i f3385t;

        /* renamed from: u, reason: collision with root package name */
        private z5.i f3386u;

        /* renamed from: v, reason: collision with root package name */
        private z5.i f3387v;

        /* renamed from: w, reason: collision with root package name */
        private z5.i f3388w;

        /* renamed from: x, reason: collision with root package name */
        private z5.i f3389x;

        /* renamed from: y, reason: collision with root package name */
        private z5.i f3390y;

        private void b(O2.f fVar, Application application, F2.c cVar, Integer num, SavedStateHandle savedStateHandle) {
            z5.e a9 = z5.f.a(application);
            this.f3367b = a9;
            this.f3368c = h.a(a9);
            this.f3369d = z5.f.a(cVar);
            this.f3370e = l.a(r.a());
            this.f3371f = e.b(this.f3367b);
            n a10 = n.a(this.f3368c);
            this.f3372g = a10;
            this.f3373h = j3.j.a(this.f3371f, a10, m.a());
            this.f3374i = B2.n.a(this.f3370e, f.a());
            this.f3375j = j3.k.a(this.f3371f, this.f3372g, f.a(), m.a(), this.f3373h, this.f3374i, this.f3370e);
            i a11 = i.a(this.f3367b, this.f3368c);
            this.f3376k = a11;
            this.f3377l = G2.d.a(this.f3374i, a11, f.a());
            this.f3378m = g.a(this.f3368c);
            this.f3379n = z5.f.a(savedStateHandle);
            com.stripe.android.payments.paymentlauncher.f a12 = com.stripe.android.payments.paymentlauncher.f.a(r.a(), m.a());
            this.f3380o = a12;
            this.f3381p = com.stripe.android.payments.paymentlauncher.e.b(a12);
            this.f3382q = z5.f.b(num);
            this.f3383r = o.a(this.f3368c);
            this.f3384s = C4123c.a(this.f3375j, k.a(), this.f3372g, this.f3383r);
            this.f3385t = s.a(this.f3376k, this.f3374i);
            this.f3386u = t.a(this.f3379n, this.f3368c, p.a(), this.f3381p, this.f3382q, this.f3384s, this.f3385t);
            this.f3387v = O2.g.a(fVar, this.f3371f, this.f3370e, this.f3385t);
            M3.h a13 = M3.h.a(this.f3375j, this.f3368c, f.a());
            this.f3388w = a13;
            this.f3389x = F2.j.a(this.f3378m, this.f3387v, a13, u.a(), C2025e.a(), this.f3385t, f.a());
            this.f3390y = z5.d.c(F2.g.a(this.f3367b, v.a(), this.f3368c, this.f3369d, this.f3370e, this.f3375j, this.f3377l, j.a(), this.f3378m, this.f3386u, this.f3389x, u.a(), q.a(), this.f3385t));
        }

        @Override // I2.a
        public com.stripe.android.customersheet.b a() {
            return (com.stripe.android.customersheet.b) this.f3390y.get();
        }

        private b(O2.f fVar, Application application, F2.c cVar, Integer num, SavedStateHandle savedStateHandle) {
            this.f3366a = this;
            b(fVar, application, cVar, num, savedStateHandle);
        }
    }

    public static a.InterfaceC0065a a() {
        return new a();
    }
}
