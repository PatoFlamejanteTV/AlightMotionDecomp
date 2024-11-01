package O2;

import B2.j;
import O2.l;
import O2.m;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.j;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import n2.n;
import r0.C3875m;
import y2.C4237a;
import y2.C4239c;
import y2.C4240d;
import y2.C4242f;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements l.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f7095a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f7096b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f7097c;

        /* renamed from: d, reason: collision with root package name */
        private Function0 f7098d;

        /* renamed from: e, reason: collision with root package name */
        private Set f7099e;

        /* renamed from: f, reason: collision with root package name */
        private j.d f7100f;

        private a() {
        }

        @Override // O2.l.a
        public l build() {
            z5.h.a(this.f7095a, Context.class);
            z5.h.a(this.f7096b, Boolean.class);
            z5.h.a(this.f7097c, Function0.class);
            z5.h.a(this.f7098d, Function0.class);
            z5.h.a(this.f7099e, Set.class);
            z5.h.a(this.f7100f, j.d.class);
            return new C0135b(new C4240d(), new C4237a(), this.f7095a, this.f7096b, this.f7097c, this.f7098d, this.f7099e, this.f7100f);
        }

        @Override // O2.l.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f7095a = (Context) z5.h.b(context);
            return this;
        }

        @Override // O2.l.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f7096b = (Boolean) z5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // O2.l.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a f(j.d dVar) {
            this.f7100f = (j.d) z5.h.b(dVar);
            return this;
        }

        @Override // O2.l.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f7099e = (Set) z5.h.b(set);
            return this;
        }

        @Override // O2.l.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f7097c = (Function0) z5.h.b(function0);
            return this;
        }

        @Override // O2.l.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(Function0 function0) {
            this.f7098d = (Function0) z5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0135b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f7101a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f7102b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f7103c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f7104d;

        /* renamed from: e, reason: collision with root package name */
        private final C0135b f7105e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f7106f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f7107g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f7108h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f7109i;

        /* renamed from: j, reason: collision with root package name */
        private z5.i f7110j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f7111k;

        /* renamed from: l, reason: collision with root package name */
        private z5.i f7112l;

        /* renamed from: m, reason: collision with root package name */
        private z5.i f7113m;

        /* renamed from: n, reason: collision with root package name */
        private z5.i f7114n;

        /* renamed from: o, reason: collision with root package name */
        private z5.i f7115o;

        /* renamed from: p, reason: collision with root package name */
        private z5.i f7116p;

        /* renamed from: q, reason: collision with root package name */
        private z5.i f7117q;

        /* renamed from: r, reason: collision with root package name */
        private z5.i f7118r;

        /* renamed from: s, reason: collision with root package name */
        private z5.i f7119s;

        /* renamed from: t, reason: collision with root package name */
        private z5.i f7120t;

        /* renamed from: u, reason: collision with root package name */
        private z5.i f7121u;

        /* renamed from: v, reason: collision with root package name */
        private z5.i f7122v;

        /* renamed from: w, reason: collision with root package name */
        private z5.i f7123w;

        private B2.m h() {
            return new B2.m((v2.d) this.f7113m.get(), (U5.g) this.f7111k.get());
        }

        private void i(C4240d c4240d, C4237a c4237a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, j.d dVar) {
            this.f7106f = z5.f.a(dVar);
            z5.e a9 = z5.f.a(context);
            this.f7107g = a9;
            N2.b a10 = N2.b.a(a9);
            this.f7108h = a10;
            z5.i c8 = z5.d.c(a10);
            this.f7109i = c8;
            this.f7110j = z5.d.c(k.a(this.f7106f, c8));
            this.f7111k = z5.d.c(C4242f.a(c4240d));
            z5.e a11 = z5.f.a(bool);
            this.f7112l = a11;
            this.f7113m = z5.d.c(C4239c.a(c4237a, a11));
            this.f7114n = z5.f.a(function0);
            z5.e a12 = z5.f.a(function02);
            this.f7115o = a12;
            this.f7116p = z5.d.c(n.a(this.f7114n, a12, this.f7106f));
            this.f7117q = B2.n.a(this.f7113m, this.f7111k);
            z5.e a13 = z5.f.a(set);
            this.f7118r = a13;
            j3.j a14 = j3.j.a(this.f7107g, this.f7114n, a13);
            this.f7119s = a14;
            z5.i c9 = z5.d.c(a14);
            this.f7120t = c9;
            p3.k a15 = p3.k.a(this.f7117q, c9);
            this.f7121u = a15;
            z5.i c10 = z5.d.c(a15);
            this.f7122v = c10;
            this.f7123w = z5.d.c(com.stripe.android.googlepaylauncher.d.a(this.f7107g, this.f7106f, this.f7113m, c10));
        }

        private PaymentAnalyticsRequestFactory j() {
            return new PaymentAnalyticsRequestFactory(this.f7103c, this.f7101a, this.f7104d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a k() {
            return new com.stripe.android.networking.a(this.f7103c, this.f7101a, (U5.g) this.f7111k.get(), this.f7104d, j(), h(), (v2.d) this.f7113m.get());
        }

        @Override // O2.l
        public m.a a() {
            return new c(this.f7105e);
        }

        private C0135b(C4240d c4240d, C4237a c4237a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, j.d dVar) {
            this.f7105e = this;
            this.f7101a = function0;
            this.f7102b = function02;
            this.f7103c = context;
            this.f7104d = set;
            i(c4240d, c4237a, context, bool, function0, function02, set, dVar);
        }
    }

    /* loaded from: classes4.dex */
    private static final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0135b f7124a;

        /* renamed from: b, reason: collision with root package name */
        private GooglePayPaymentMethodLauncherContractV2.a f7125b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f7126c;

        @Override // O2.m.a
        public m build() {
            z5.h.a(this.f7125b, GooglePayPaymentMethodLauncherContractV2.a.class);
            z5.h.a(this.f7126c, SavedStateHandle.class);
            return new d(this.f7124a, this.f7125b, this.f7126c);
        }

        @Override // O2.m.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(GooglePayPaymentMethodLauncherContractV2.a aVar) {
            this.f7125b = (GooglePayPaymentMethodLauncherContractV2.a) z5.h.b(aVar);
            return this;
        }

        @Override // O2.m.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f7126c = (SavedStateHandle) z5.h.b(savedStateHandle);
            return this;
        }

        private c(C0135b c0135b) {
            this.f7124a = c0135b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements m {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayPaymentMethodLauncherContractV2.a f7127a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f7128b;

        /* renamed from: c, reason: collision with root package name */
        private final C0135b f7129c;

        /* renamed from: d, reason: collision with root package name */
        private final d f7130d;

        private j.c b() {
            return new j.c(this.f7129c.f7101a, this.f7129c.f7102b);
        }

        @Override // O2.m
        public com.stripe.android.googlepaylauncher.l a() {
            return new com.stripe.android.googlepaylauncher.l((C3875m) this.f7129c.f7110j.get(), b(), this.f7127a, this.f7129c.k(), (n2.m) this.f7129c.f7116p.get(), (com.stripe.android.googlepaylauncher.n) this.f7129c.f7123w.get(), this.f7128b);
        }

        private d(C0135b c0135b, GooglePayPaymentMethodLauncherContractV2.a aVar, SavedStateHandle savedStateHandle) {
            this.f7130d = this;
            this.f7129c = c0135b;
            this.f7127a = aVar;
            this.f7128b = savedStateHandle;
        }
    }

    public static l.a a() {
        return new a();
    }
}
