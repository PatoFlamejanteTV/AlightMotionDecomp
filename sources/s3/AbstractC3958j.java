package s3;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import b4.InterfaceC1970a;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import r3.C3888b;
import s3.E;
import s3.F;
import y2.C4237a;
import y2.C4239c;
import y2.C4240d;
import y2.C4242f;

/* renamed from: s3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3958j {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.j$a */
    /* loaded from: classes4.dex */
    public static final class a implements E.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f39009a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f39010b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f39011c;

        /* renamed from: d, reason: collision with root package name */
        private Set f39012d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f39013e;

        private a() {
        }

        @Override // s3.E.a
        public E build() {
            z5.h.a(this.f39009a, Context.class);
            z5.h.a(this.f39010b, Boolean.class);
            z5.h.a(this.f39011c, Function0.class);
            z5.h.a(this.f39012d, Set.class);
            z5.h.a(this.f39013e, Boolean.class);
            return new b(new C4240d(), new C4237a(), this.f39009a, this.f39010b, this.f39011c, this.f39012d, this.f39013e);
        }

        @Override // s3.E.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f39009a = (Context) z5.h.b(context);
            return this;
        }

        @Override // s3.E.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f39010b = (Boolean) z5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // s3.E.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a e(boolean z8) {
            this.f39013e = (Boolean) z5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // s3.E.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f39012d = (Set) z5.h.b(set);
            return this;
        }

        @Override // s3.E.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f39011c = (Function0) z5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.j$b */
    /* loaded from: classes4.dex */
    public static final class b implements E {

        /* renamed from: a, reason: collision with root package name */
        private final Context f39014a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f39015b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f39016c;

        /* renamed from: d, reason: collision with root package name */
        private final Boolean f39017d;

        /* renamed from: e, reason: collision with root package name */
        private final b f39018e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f39019f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f39020g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f39021h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f39022i;

        /* renamed from: j, reason: collision with root package name */
        private z5.i f39023j;

        /* renamed from: k, reason: collision with root package name */
        private z5.i f39024k;

        /* renamed from: l, reason: collision with root package name */
        private z5.i f39025l;

        /* renamed from: m, reason: collision with root package name */
        private z5.i f39026m;

        /* renamed from: n, reason: collision with root package name */
        private z5.i f39027n;

        /* renamed from: o, reason: collision with root package name */
        private z5.i f39028o;

        /* renamed from: p, reason: collision with root package name */
        private z5.i f39029p;

        /* renamed from: q, reason: collision with root package name */
        private z5.i f39030q;

        /* renamed from: r, reason: collision with root package name */
        private z5.i f39031r;

        /* JADX INFO: Access modifiers changed from: private */
        public B2.m j() {
            return new B2.m((v2.d) this.f39021h.get(), (U5.g) this.f39019f.get());
        }

        private void k(C4240d c4240d, C4237a c4237a, Context context, Boolean bool, Function0 function0, Set set, Boolean bool2) {
            this.f39019f = z5.d.c(C4242f.a(c4240d));
            z5.e a9 = z5.f.a(bool);
            this.f39020g = a9;
            this.f39021h = z5.d.c(C4239c.a(c4237a, a9));
            z5.e a10 = z5.f.a(context);
            this.f39022i = a10;
            this.f39023j = z5.d.c(D.a(a10, this.f39020g, this.f39019f));
            this.f39024k = z5.d.c(C3948C.a());
            this.f39025l = z5.f.a(function0);
            z5.e a11 = z5.f.a(set);
            this.f39026m = a11;
            this.f39027n = j3.j.a(this.f39022i, this.f39025l, a11);
            B2.n a12 = B2.n.a(this.f39021h, this.f39019f);
            this.f39028o = a12;
            this.f39029p = j3.k.a(this.f39022i, this.f39025l, this.f39019f, this.f39026m, this.f39027n, a12, this.f39021h);
            z5.i c8 = z5.d.c(B2.s.a());
            this.f39030q = c8;
            this.f39031r = z5.d.c(C3888b.a(this.f39029p, this.f39028o, this.f39027n, c8, this.f39021h, this.f39019f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory l() {
            return new PaymentAnalyticsRequestFactory(this.f39014a, this.f39015b, this.f39016c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a m() {
            return new com.stripe.android.networking.a(this.f39014a, this.f39015b, (U5.g) this.f39019f.get(), this.f39016c, l(), j(), (v2.d) this.f39021h.get());
        }

        @Override // s3.E
        public F.a a() {
            return new c(this.f39018e);
        }

        private b(C4240d c4240d, C4237a c4237a, Context context, Boolean bool, Function0 function0, Set set, Boolean bool2) {
            this.f39018e = this;
            this.f39014a = context;
            this.f39015b = function0;
            this.f39016c = set;
            this.f39017d = bool2;
            k(c4240d, c4237a, context, bool, function0, set, bool2);
        }
    }

    /* renamed from: s3.j$c */
    /* loaded from: classes4.dex */
    private static final class c implements F.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f39032a;

        /* renamed from: b, reason: collision with root package name */
        private Stripe3ds2TransactionContract.a f39033b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f39034c;

        /* renamed from: d, reason: collision with root package name */
        private Application f39035d;

        @Override // s3.F.a
        public F build() {
            z5.h.a(this.f39033b, Stripe3ds2TransactionContract.a.class);
            z5.h.a(this.f39034c, SavedStateHandle.class);
            z5.h.a(this.f39035d, Application.class);
            return new d(this.f39032a, new G(), this.f39033b, this.f39034c, this.f39035d);
        }

        @Override // s3.F.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c b(Application application) {
            this.f39035d = (Application) z5.h.b(application);
            return this;
        }

        @Override // s3.F.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public c c(Stripe3ds2TransactionContract.a aVar) {
            this.f39033b = (Stripe3ds2TransactionContract.a) z5.h.b(aVar);
            return this;
        }

        @Override // s3.F.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f39034c = (SavedStateHandle) z5.h.b(savedStateHandle);
            return this;
        }

        private c(b bVar) {
            this.f39032a = bVar;
        }
    }

    /* renamed from: s3.j$d */
    /* loaded from: classes4.dex */
    private static final class d implements F {

        /* renamed from: a, reason: collision with root package name */
        private final Stripe3ds2TransactionContract.a f39036a;

        /* renamed from: b, reason: collision with root package name */
        private final G f39037b;

        /* renamed from: c, reason: collision with root package name */
        private final Application f39038c;

        /* renamed from: d, reason: collision with root package name */
        private final SavedStateHandle f39039d;

        /* renamed from: e, reason: collision with root package name */
        private final b f39040e;

        /* renamed from: f, reason: collision with root package name */
        private final d f39041f;

        private c4.n b() {
            return H.a(this.f39037b, this.f39038c, this.f39036a, (U5.g) this.f39040e.f39019f.get());
        }

        @Override // s3.F
        public com.stripe.android.payments.core.authentication.threeds2.d a() {
            return new com.stripe.android.payments.core.authentication.threeds2.d(this.f39036a, this.f39040e.m(), this.f39040e.j(), this.f39040e.l(), (InterfaceC1970a) this.f39040e.f39023j.get(), (c4.p) this.f39040e.f39024k.get(), (r3.d) this.f39040e.f39031r.get(), b(), (U5.g) this.f39040e.f39019f.get(), this.f39039d, this.f39040e.f39017d.booleanValue());
        }

        private d(b bVar, G g8, Stripe3ds2TransactionContract.a aVar, SavedStateHandle savedStateHandle, Application application) {
            this.f39041f = this;
            this.f39040e = bVar;
            this.f39036a = aVar;
            this.f39037b = g8;
            this.f39038c = application;
            this.f39039d = savedStateHandle;
        }
    }

    public static E.a a() {
        return new a();
    }
}
