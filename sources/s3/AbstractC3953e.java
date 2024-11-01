package s3;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import k3.C3235a;
import k3.C3242h;
import kotlin.jvm.functions.Function0;
import q3.InterfaceC3639h;
import s3.x;
import s3.y;
import y2.C4237a;
import y2.C4239c;
import y2.C4240d;
import y2.C4241e;
import y2.C4242f;

/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3953e {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements x.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f38972a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f38973b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f38974c;

        /* renamed from: d, reason: collision with root package name */
        private Function0 f38975d;

        /* renamed from: e, reason: collision with root package name */
        private Set f38976e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f38977f;

        private a() {
        }

        @Override // s3.x.a
        public x build() {
            z5.h.a(this.f38972a, Context.class);
            z5.h.a(this.f38973b, Boolean.class);
            z5.h.a(this.f38974c, Function0.class);
            z5.h.a(this.f38975d, Function0.class);
            z5.h.a(this.f38976e, Set.class);
            z5.h.a(this.f38977f, Boolean.class);
            return new b(new s(), new C4240d(), new C4237a(), this.f38972a, this.f38973b, this.f38974c, this.f38975d, this.f38976e, this.f38977f);
        }

        @Override // s3.x.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f38972a = (Context) z5.h.b(context);
            return this;
        }

        @Override // s3.x.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f38973b = (Boolean) z5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // s3.x.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a f(boolean z8) {
            this.f38977f = (Boolean) z5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // s3.x.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f38976e = (Set) z5.h.b(set);
            return this;
        }

        @Override // s3.x.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f38974c = (Function0) z5.h.b(function0);
            return this;
        }

        @Override // s3.x.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(Function0 function0) {
            this.f38975d = (Function0) z5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.e$b */
    /* loaded from: classes4.dex */
    public static final class b implements x {

        /* renamed from: a, reason: collision with root package name */
        private final Context f38978a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f38979b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f38980c;

        /* renamed from: d, reason: collision with root package name */
        private final s f38981d;

        /* renamed from: e, reason: collision with root package name */
        private final b f38982e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f38983f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f38984g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f38985h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f38986i;

        /* renamed from: j, reason: collision with root package name */
        private z5.i f38987j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f38988k;

        /* renamed from: l, reason: collision with root package name */
        private z5.i f38989l;

        /* renamed from: m, reason: collision with root package name */
        private z5.i f38990m;

        /* renamed from: n, reason: collision with root package name */
        private z5.i f38991n;

        /* renamed from: o, reason: collision with root package name */
        private z5.i f38992o;

        /* renamed from: p, reason: collision with root package name */
        private z5.i f38993p;

        /* renamed from: q, reason: collision with root package name */
        private z5.i f38994q;

        /* renamed from: r, reason: collision with root package name */
        private z5.i f38995r;

        /* renamed from: s, reason: collision with root package name */
        private z5.i f38996s;

        /* renamed from: t, reason: collision with root package name */
        private z5.i f38997t;

        /* renamed from: u, reason: collision with root package name */
        private z5.i f38998u;

        /* renamed from: v, reason: collision with root package name */
        private z5.i f38999v;

        /* renamed from: w, reason: collision with root package name */
        private z5.i f39000w;

        /* JADX INFO: Access modifiers changed from: private */
        public B2.m n() {
            return new B2.m((v2.d) this.f38985h.get(), (U5.g) this.f38983f.get());
        }

        private void o(s sVar, C4240d c4240d, C4237a c4237a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, Boolean bool2) {
            this.f38983f = z5.d.c(C4242f.a(c4240d));
            z5.e a9 = z5.f.a(bool);
            this.f38984g = a9;
            this.f38985h = z5.d.c(C4239c.a(c4237a, a9));
            this.f38986i = z5.f.a(context);
            this.f38987j = z5.d.c(C4241e.a(c4240d));
            this.f38988k = z5.d.c(w.a(sVar));
            this.f38989l = z5.f.a(function0);
            z5.e a10 = z5.f.a(set);
            this.f38990m = a10;
            this.f38991n = j3.j.a(this.f38986i, this.f38989l, a10);
            this.f38992o = u.a(sVar, this.f38986i);
            z5.e a11 = z5.f.a(bool2);
            this.f38993p = a11;
            this.f38994q = z5.d.c(v.a(sVar, this.f38986i, this.f38984g, this.f38983f, this.f38987j, this.f38988k, this.f38991n, this.f38989l, this.f38990m, this.f38992o, a11));
            this.f38995r = z5.d.c(t.a(sVar, this.f38986i));
            this.f38996s = z5.f.a(function02);
            B2.n a12 = B2.n.a(this.f38985h, this.f38983f);
            this.f38997t = a12;
            j3.k a13 = j3.k.a(this.f38986i, this.f38989l, this.f38983f, this.f38990m, this.f38991n, a12, this.f38985h);
            this.f38998u = a13;
            this.f38999v = z5.d.c(C3242h.a(this.f38986i, this.f38989l, a13, this.f38985h, this.f38983f));
            this.f39000w = z5.d.c(k3.k.a(this.f38986i, this.f38989l, this.f38998u, this.f38985h, this.f38983f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p() {
            return this.f38981d.b(this.f38978a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory q() {
            return new PaymentAnalyticsRequestFactory(this.f38978a, this.f38979b, this.f38980c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a r() {
            return new com.stripe.android.networking.a(this.f38978a, this.f38979b, (U5.g) this.f38983f.get(), this.f38980c, q(), n(), (v2.d) this.f38985h.get());
        }

        @Override // s3.x
        public y.a a() {
            return new c(this.f38982e);
        }

        private b(s sVar, C4240d c4240d, C4237a c4237a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, Boolean bool2) {
            this.f38982e = this;
            this.f38978a = context;
            this.f38979b = function0;
            this.f38980c = set;
            this.f38981d = sVar;
            o(sVar, c4240d, c4237a, context, bool, function0, function02, set, bool2);
        }
    }

    /* renamed from: s3.e$c */
    /* loaded from: classes4.dex */
    private static final class c implements y.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f39001a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f39002b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f39003c;

        @Override // s3.y.a
        public y build() {
            z5.h.a(this.f39002b, Boolean.class);
            z5.h.a(this.f39003c, SavedStateHandle.class);
            return new d(this.f39001a, this.f39002b, this.f39003c);
        }

        @Override // s3.y.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(boolean z8) {
            this.f39002b = (Boolean) z5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // s3.y.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f39003c = (SavedStateHandle) z5.h.b(savedStateHandle);
            return this;
        }

        private c(b bVar) {
            this.f39001a = bVar;
        }
    }

    /* renamed from: s3.e$d */
    /* loaded from: classes4.dex */
    private static final class d implements y {

        /* renamed from: a, reason: collision with root package name */
        private final Boolean f39004a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f39005b;

        /* renamed from: c, reason: collision with root package name */
        private final b f39006c;

        /* renamed from: d, reason: collision with root package name */
        private final d f39007d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f39008e;

        private void b(Boolean bool, SavedStateHandle savedStateHandle) {
            this.f39008e = B2.k.a(this.f39006c.f38989l, this.f39006c.f38996s);
        }

        @Override // s3.y
        public com.stripe.android.payments.paymentlauncher.b a() {
            return new com.stripe.android.payments.paymentlauncher.b(this.f39004a.booleanValue(), this.f39006c.r(), (InterfaceC3639h) this.f39006c.f38994q.get(), (C3235a) this.f39006c.f38995r.get(), this.f39008e, (Map) this.f39006c.f38988k.get(), z5.d.b(this.f39006c.f38999v), z5.d.b(this.f39006c.f39000w), this.f39006c.n(), this.f39006c.q(), (U5.g) this.f39006c.f38987j.get(), this.f39005b, this.f39006c.p());
        }

        private d(b bVar, Boolean bool, SavedStateHandle savedStateHandle) {
            this.f39007d = this;
            this.f39006c = bVar;
            this.f39004a = bool;
            this.f39005b = savedStateHandle;
            b(bool, savedStateHandle);
        }
    }

    public static x.a a() {
        return new a();
    }
}
