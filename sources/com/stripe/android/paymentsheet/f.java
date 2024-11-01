package com.stripe.android.paymentsheet;

import Q5.I;
import Q5.InterfaceC1412g;
import Q5.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import c6.InterfaceC2072n;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.j;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.e;
import com.stripe.android.paymentsheet.l;
import com.stripe.android.paymentsheet.m;
import com.stripe.android.paymentsheet.n;
import com.stripe.android.paymentsheet.p;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.c;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.InterfaceC3286s;
import kotlin.jvm.internal.U;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;
import n2.AbstractC3394E;
import n6.AbstractC3462k;
import n6.M;
import n6.X;
import p3.i;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import t2.AbstractC4004a;
import u3.AbstractC4079c;
import u3.InterfaceC4077a;
import v3.C4130j;
import v3.EnumC4126f;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: s, reason: collision with root package name */
    public static final c f27218s = new c(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f27219t = 8;

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.g f27220a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f27221b;

    /* renamed from: c, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b f27222c;

    /* renamed from: d, reason: collision with root package name */
    private final O2.h f27223d;

    /* renamed from: e, reason: collision with root package name */
    private final M f27224e;

    /* renamed from: f, reason: collision with root package name */
    private final SavedStateHandle f27225f;

    /* renamed from: g, reason: collision with root package name */
    private final p3.i f27226g;

    /* renamed from: h, reason: collision with root package name */
    private final E2.h f27227h;

    /* renamed from: i, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.e f27228i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC4077a f27229j;

    /* renamed from: k, reason: collision with root package name */
    private ActivityResultLauncher f27230k;

    /* renamed from: l, reason: collision with root package name */
    private I3.c f27231l;

    /* renamed from: m, reason: collision with root package name */
    private ActivityResultLauncher f27232m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f27233n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f27234o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f27235p;

    /* renamed from: q, reason: collision with root package name */
    private final q6.w f27236q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3813L f27237r;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27238a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27238a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C3374a.C0804a c0804a = C3374a.f35036b;
                long s8 = AbstractC3376c.s(1, EnumC3377d.f35046e);
                this.f27238a = 1;
                if (X.c(s8, this) == e8) {
                    return e8;
                }
            }
            if (f.this.f27236q.getValue() instanceof e.b) {
                f.this.M(new p.a(v3.n.f40528c));
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f27240a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.n f27241b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b((StripeIntent) parcel.readParcelable(b.class.getClassLoader()), (com.stripe.android.paymentsheet.n) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(StripeIntent intent, com.stripe.android.paymentsheet.n confirmationOption) {
            AbstractC3292y.i(intent, "intent");
            AbstractC3292y.i(confirmationOption, "confirmationOption");
            this.f27240a = intent;
            this.f27241b = confirmationOption;
        }

        public static /* synthetic */ b b(b bVar, StripeIntent stripeIntent, com.stripe.android.paymentsheet.n nVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                stripeIntent = bVar.f27240a;
            }
            if ((i8 & 2) != 0) {
                nVar = bVar.f27241b;
            }
            return bVar.a(stripeIntent, nVar);
        }

        public final b a(StripeIntent intent, com.stripe.android.paymentsheet.n confirmationOption) {
            AbstractC3292y.i(intent, "intent");
            AbstractC3292y.i(confirmationOption, "confirmationOption");
            return new b(intent, confirmationOption);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f27240a, bVar.f27240a) && AbstractC3292y.d(this.f27241b, bVar.f27241b);
        }

        public final com.stripe.android.paymentsheet.n f() {
            return this.f27241b;
        }

        public final StripeIntent h() {
            return this.f27240a;
        }

        public int hashCode() {
            return (this.f27240a.hashCode() * 31) + this.f27241b.hashCode();
        }

        public String toString() {
            return "Args(intent=" + this.f27240a + ", confirmationOption=" + this.f27241b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f27240a, i8);
            out.writeParcelable(this.f27241b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.g f27242a;

        /* renamed from: b, reason: collision with root package name */
        private final N5.a f27243b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b f27244c;

        /* renamed from: d, reason: collision with root package name */
        private final com.stripe.android.payments.paymentlauncher.d f27245d;

        /* renamed from: e, reason: collision with root package name */
        private final O2.h f27246e;

        /* renamed from: f, reason: collision with root package name */
        private final SavedStateHandle f27247f;

        /* renamed from: g, reason: collision with root package name */
        private final Function0 f27248g;

        /* renamed from: h, reason: collision with root package name */
        private final p3.i f27249h;

        /* renamed from: i, reason: collision with root package name */
        private final E2.h f27250i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.f$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0607a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f27252a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0607a(d dVar) {
                    super(0);
                    this.f27252a = dVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return ((n2.r) this.f27252a.f27243b.get()).f();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f27253a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(d dVar) {
                    super(0);
                    this.f27253a = dVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return ((n2.r) this.f27253a.f27243b.get()).h();
                }
            }

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4077a invoke(ActivityResultLauncher hostActivityLauncher) {
                AbstractC3292y.i(hostActivityLauncher, "hostActivityLauncher");
                return d.this.f27245d.a(new C0607a(d.this), new b(d.this), (Integer) d.this.f27248g.invoke(), true, hostActivityLauncher);
            }
        }

        public d(com.stripe.android.paymentsheet.g intentConfirmationInterceptor, N5.a paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, com.stripe.android.payments.paymentlauncher.d stripePaymentLauncherAssistedFactory, O2.h hVar, SavedStateHandle savedStateHandle, Function0 statusBarColor, p3.i errorReporter, E2.h hVar2) {
            AbstractC3292y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
            AbstractC3292y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
            AbstractC3292y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
            AbstractC3292y.i(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
            AbstractC3292y.i(savedStateHandle, "savedStateHandle");
            AbstractC3292y.i(statusBarColor, "statusBarColor");
            AbstractC3292y.i(errorReporter, "errorReporter");
            this.f27242a = intentConfirmationInterceptor;
            this.f27243b = paymentConfigurationProvider;
            this.f27244c = bacsMandateConfirmationLauncherFactory;
            this.f27245d = stripePaymentLauncherAssistedFactory;
            this.f27246e = hVar;
            this.f27247f = savedStateHandle;
            this.f27248g = statusBarColor;
            this.f27249h = errorReporter;
            this.f27250i = hVar2;
        }

        public final f d(M scope) {
            AbstractC3292y.i(scope, "scope");
            com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bVar = this.f27244c;
            O2.h hVar = this.f27246e;
            com.stripe.android.paymentsheet.g gVar = this.f27242a;
            p3.i iVar = this.f27249h;
            return new f(gVar, new a(), bVar, hVar, scope, this.f27247f, iVar, this.f27250i);
        }
    }

    /* loaded from: classes4.dex */
    public interface e {

        /* loaded from: classes4.dex */
        public static final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.paymentsheet.p f27254a;

            public a(com.stripe.android.paymentsheet.p result) {
                AbstractC3292y.i(result, "result");
                this.f27254a = result;
            }

            public final com.stripe.android.paymentsheet.p a() {
                return this.f27254a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3292y.d(this.f27254a, ((a) obj).f27254a);
            }

            public int hashCode() {
                return this.f27254a.hashCode();
            }

            public String toString() {
                return "Complete(result=" + this.f27254a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f27255a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 296413718;
            }

            public String toString() {
                return "Confirming";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f27256a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -43337784;
            }

            public String toString() {
                return "Idle";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements e {

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.paymentsheet.n f27257a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f27258b;

            public d(com.stripe.android.paymentsheet.n nVar, boolean z8) {
                this.f27257a = nVar;
                this.f27258b = z8;
            }

            public final com.stripe.android.paymentsheet.n a() {
                return this.f27257a;
            }

            public final boolean b() {
                return this.f27258b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return AbstractC3292y.d(this.f27257a, dVar.f27257a) && this.f27258b == dVar.f27258b;
            }

            public int hashCode() {
                com.stripe.android.paymentsheet.n nVar = this.f27257a;
                return ((nVar == null ? 0 : nVar.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27258b);
            }

            public String toString() {
                return "Preconfirming(confirmationOption=" + this.f27257a + ", inPreconfirmFlow=" + this.f27258b + ")";
            }
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0608f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27259a;

        static {
            int[] iArr = new int[w.k.c.values().length];
            try {
                iArr[w.k.c.f27982a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f27259a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27260a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27261b;

        public g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            g gVar = new g(dVar);
            gVar.f27261b = obj;
            return gVar;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(Object obj, U5.d dVar) {
            return ((g) create(obj, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f27260a == 0) {
                Q5.t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f27261b instanceof e.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27262a;

        /* renamed from: c, reason: collision with root package name */
        int f27264c;

        h(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27262a = obj;
            this.f27264c |= Integer.MIN_VALUE;
            return f.this.u(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class i extends C3289v implements Function1 {
        i(Object obj) {
            super(1, obj, f.class, "onExternalPaymentMethodResult", "onExternalPaymentMethodResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
        }

        public final void d(AbstractC4079c p02) {
            AbstractC3292y.i(p02, "p0");
            ((f) this.receiver).K(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((AbstractC4079c) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27265a;

        /* renamed from: b, reason: collision with root package name */
        Object f27266b;

        /* renamed from: c, reason: collision with root package name */
        Object f27267c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27268d;

        /* renamed from: f, reason: collision with root package name */
        int f27270f;

        j(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27268d = obj;
            this.f27270f |= Integer.MIN_VALUE;
            return f.this.x(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.l f27272b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n.d f27273c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StripeIntent f27274d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.stripe.android.paymentsheet.l lVar, n.d dVar, StripeIntent stripeIntent) {
            super(1);
            this.f27272b = lVar;
            this.f27273c = dVar;
            this.f27274d = stripeIntent;
        }

        public final void a(InterfaceC4077a launcher) {
            AbstractC3292y.i(launcher, "launcher");
            f.this.T(((l.c) this.f27272b).a());
            f.this.V();
            f.this.f27228i.c(launcher, (e.a) ((l.c) this.f27272b).b(), this.f27273c, this.f27274d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC4077a) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27275a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.paymentdatacollection.bacs.c f27277c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar, U5.d dVar) {
            super(2, dVar);
            this.f27277c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(this.f27277c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.paymentsheet.n nVar;
            n.a aVar;
            Object e8 = V5.b.e();
            int i8 = this.f27275a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                f.this.R();
                com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar = this.f27277c;
                if (cVar instanceof c.C0625c) {
                    b A8 = f.this.A();
                    if (A8 != null) {
                        nVar = A8.f();
                    } else {
                        nVar = null;
                    }
                    if (nVar instanceof n.a) {
                        aVar = (n.a) nVar;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        f fVar = f.this;
                        b b9 = b.b(A8, null, new n.d.a(aVar.D(), aVar.q(), aVar.b(), null, false), 1, null);
                        this.f27275a = 1;
                        if (fVar.v(b9, this) == e8) {
                            return e8;
                        }
                    }
                } else if (cVar instanceof c.d) {
                    f.this.M(new p.a(v3.n.f40527b));
                } else if (cVar instanceof c.a) {
                    f.this.M(new p.a(v3.n.f40528c));
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27278a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j.f f27279b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f27280c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(j.f fVar, f fVar2, U5.d dVar) {
            super(2, dVar);
            this.f27279b = fVar;
            this.f27280c = fVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(this.f27279b, this.f27280c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C2.c a9;
            com.stripe.android.paymentsheet.n nVar;
            n.c cVar;
            Object e8 = V5.b.e();
            int i8 = this.f27278a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                j.f fVar = this.f27279b;
                if (fVar instanceof j.f.b) {
                    b A8 = this.f27280c.A();
                    if (A8 != null) {
                        nVar = A8.f();
                    } else {
                        nVar = null;
                    }
                    if (nVar instanceof n.c) {
                        cVar = (n.c) nVar;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        j.f fVar2 = this.f27279b;
                        f fVar3 = this.f27280c;
                        b b9 = b.b(A8, null, new n.d.b(cVar.D(), cVar.q(), ((j.f.b) fVar2).r(), null), 1, null);
                        this.f27278a = 1;
                        if (fVar3.v(b9, this) == e8) {
                            return e8;
                        }
                    }
                } else if (fVar instanceof j.f.c) {
                    f fVar4 = this.f27280c;
                    Throwable a10 = ((j.f.c) this.f27279b).a();
                    if (((j.f.c) this.f27279b).b() == 3) {
                        a9 = C2.d.a(AbstractC3394E.f35245m0);
                    } else {
                        a9 = C2.d.a(AbstractC3394E.f35257s0);
                    }
                    fVar4.M(new p.b(a10, a9, new m.c(((j.f.c) this.f27279b).b())));
                } else if (fVar instanceof j.f.a) {
                    this.f27280c.M(new p.a(v3.n.f40526a));
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class n extends C3289v implements Function1 {
        n(Object obj) {
            super(1, obj, f.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V", 0);
        }

        public final void d(com.stripe.android.payments.paymentlauncher.a p02) {
            AbstractC3292y.i(p02, "p0");
            ((f) this.receiver).N(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((com.stripe.android.payments.paymentlauncher.a) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class o implements ActivityResultCallback, InterfaceC3286s {
        o() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(AbstractC4079c p02) {
            AbstractC3292y.i(p02, "p0");
            f.this.K(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return new C3289v(1, f.this, f.class, "onExternalPaymentMethodResult", "onExternalPaymentMethodResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class p implements ActivityResultCallback, InterfaceC3286s {
        p() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(j.f p02) {
            AbstractC3292y.i(p02, "p0");
            f.this.L(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return new C3289v(1, f.this, f.class, "onGooglePayResult", "onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class q implements DefaultLifecycleObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f27284b;

        q(ActivityResultLauncher activityResultLauncher) {
            this.f27284b = activityResultLauncher;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3292y.i(owner, "owner");
            f.this.f27229j = null;
            f.this.f27230k = null;
            f.this.f27231l = null;
            f.this.f27232m = null;
            this.f27284b.unregister();
            androidx.lifecycle.c.b(this, owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.c(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.d(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.e(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.f(this, lifecycleOwner);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class r implements ActivityResultCallback, InterfaceC3286s {
        r() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c p02) {
            AbstractC3292y.i(p02, "p0");
            f.this.J(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return new C3289v(1, f.this, f.class, "onBacsMandateResult", "onBacsMandateResult(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27286a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f27288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(b bVar, U5.d dVar) {
            super(2, dVar);
            this.f27288c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new s(this.f27288c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27286a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                f fVar = f.this;
                b bVar = this.f27288c;
                this.f27286a = 1;
                if (fVar.O(bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((s) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public f(com.stripe.android.paymentsheet.g intentConfirmationInterceptor, Function1 paymentLauncherFactory, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, O2.h hVar, M coroutineScope, SavedStateHandle savedStateHandle, p3.i errorReporter, E2.h hVar2) {
        boolean z8;
        Object obj;
        com.stripe.android.paymentsheet.n nVar;
        AbstractC3292y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        AbstractC3292y.i(paymentLauncherFactory, "paymentLauncherFactory");
        AbstractC3292y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f27220a = intentConfirmationInterceptor;
        this.f27221b = paymentLauncherFactory;
        this.f27222c = bacsMandateConfirmationLauncherFactory;
        this.f27223d = hVar;
        this.f27224e = coroutineScope;
        this.f27225f = savedStateHandle;
        this.f27226g = errorReporter;
        this.f27227h = hVar2;
        this.f27228i = new com.stripe.android.paymentsheet.e(intentConfirmationInterceptor, paymentLauncherFactory);
        boolean F8 = F();
        this.f27233n = F8;
        boolean E8 = E();
        this.f27234o = E8;
        if (!F8 && !E8) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f27235p = z8;
        if (F8) {
            b A8 = A();
            if (A8 != null) {
                nVar = A8.f();
            } else {
                nVar = null;
            }
            obj = new e.d(nVar, true);
        } else if (E8) {
            obj = e.b.f27255a;
        } else {
            obj = e.c.f27256a;
        }
        q6.w a9 = AbstractC3815N.a(obj);
        this.f27236q = a9;
        this.f27237r = AbstractC3823h.b(a9);
        if (E8) {
            AbstractC3462k.d(coroutineScope, null, null, new a(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b A() {
        return (b) this.f27225f.get("IntentConfirmationArguments");
    }

    private final EnumC4126f B() {
        return (EnumC4126f) this.f27225f.get("DeferredIntentConfirmationType");
    }

    private final boolean E() {
        Boolean bool = (Boolean) this.f27225f.get("AwaitingPaymentResult");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean F() {
        Boolean bool = (Boolean) this.f27225f.get("AwaitingPreConfirmResult");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean G(w.l lVar) {
        if (lVar instanceof w.l.b) {
            return true;
        }
        if (lVar instanceof w.l.c) {
            return false;
        }
        if (lVar instanceof w.l.a) {
            return ((w.l.a) lVar).b().a() instanceof w.m.d.a;
        }
        throw new Q5.p();
    }

    private final void H(n.a aVar) {
        Object b9;
        I3.c cVar;
        I3.e a9 = I3.e.f3408e.a(aVar);
        if (a9 != null) {
            try {
                s.a aVar2 = Q5.s.f8810b;
                cVar = this.f27231l;
            } catch (Throwable th) {
                s.a aVar3 = Q5.s.f8810b;
                b9 = Q5.s.b(Q5.t.a(th));
            }
            if (cVar != null) {
                b9 = Q5.s.b(cVar);
                if (Q5.s.h(b9)) {
                    this.f27236q.setValue(new e.d(aVar, true));
                    W();
                    ((I3.c) b9).a(a9, aVar.a());
                }
                Throwable e8 = Q5.s.e(b9);
                if (e8 != null) {
                    M(new p.b(e8, C2.d.a(v3.w.f40618h0), m.d.f27361a));
                }
                Q5.s.a(b9);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        M(new p.b(new IllegalArgumentException("Given payment selection could not be converted to Bacs data!"), C2.d.a(v3.w.f40618h0), m.d.f27361a));
    }

    private final void I(n.c cVar, StripeIntent stripeIntent) {
        Object b9;
        Object b10;
        String l8;
        O2.h hVar;
        ActivityResultLauncher activityResultLauncher;
        if (cVar.a().l() == null && !G(cVar.D())) {
            E2.h hVar2 = this.f27227h;
            if (hVar2 != null) {
                hVar2.a("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            }
            M(new p.b(new IllegalStateException("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent"), C2.d.a(v3.w.f40618h0), m.e.f27362a));
            return;
        }
        try {
            s.a aVar = Q5.s.f8810b;
            activityResultLauncher = this.f27232m;
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        if (activityResultLauncher != null) {
            b9 = Q5.s.b(activityResultLauncher);
            Throwable e8 = Q5.s.e(b9);
            if (e8 == null) {
                ActivityResultLauncher activityResultLauncher2 = (ActivityResultLauncher) b9;
                try {
                    hVar = this.f27223d;
                } catch (Throwable th2) {
                    s.a aVar3 = Q5.s.f8810b;
                    b10 = Q5.s.b(Q5.t.a(th2));
                }
                if (hVar != null) {
                    b10 = Q5.s.b(hVar);
                    Throwable e9 = Q5.s.e(b10);
                    if (e9 == null) {
                        n.c.a a9 = cVar.a();
                        com.stripe.android.googlepaylauncher.j y8 = y((O2.h) b10, activityResultLauncher2, a9);
                        W();
                        this.f27236q.setValue(new e.d(cVar, true));
                        com.stripe.android.model.n t8 = t(stripeIntent);
                        if ((t8 == null || (l8 = t8.L()) == null) && (l8 = a9.l()) == null) {
                            l8 = "";
                        }
                        String str = l8;
                        long j8 = 0;
                        if (stripeIntent instanceof com.stripe.android.model.n) {
                            Long f8 = ((com.stripe.android.model.n) stripeIntent).f();
                            if (f8 != null) {
                                j8 = f8.longValue();
                            }
                        } else if (stripeIntent instanceof com.stripe.android.model.u) {
                            Long b11 = a9.b();
                            if (b11 != null) {
                                j8 = b11.longValue();
                            }
                        } else {
                            throw new Q5.p();
                        }
                        y8.e(str, j8, stripeIntent.getId(), a9.f());
                        return;
                    }
                    M(new p.b(e9, C2.d.a(v3.w.f40618h0), m.d.f27361a));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            M(new p.b(e8, C2.d.a(v3.w.f40618h0), m.d.f27361a));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar) {
        AbstractC3462k.d(this.f27224e, null, null, new l(cVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(AbstractC4079c abstractC4079c) {
        p.b bVar;
        com.stripe.android.paymentsheet.p pVar;
        b A8 = A();
        if (A8 != null) {
            if (abstractC4079c instanceof AbstractC4079c.C0903c) {
                pVar = new p.c(A8.h(), null);
            } else if (abstractC4079c instanceof AbstractC4079c.d) {
                AbstractC4079c.d dVar = (AbstractC4079c.d) abstractC4079c;
                bVar = new p.b(dVar.a(), AbstractC4004a.a(dVar.a()), m.a.f27358a);
            } else if (abstractC4079c instanceof AbstractC4079c.a) {
                pVar = new p.a(v3.n.f40528c);
            } else {
                throw new Q5.p();
            }
            M(pVar);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Arguments should have been initialized before handling EPM result!");
        bVar = new p.b(illegalStateException, AbstractC4004a.a(illegalStateException), m.a.f27358a);
        pVar = bVar;
        M(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(j.f fVar) {
        AbstractC3462k.d(this.f27224e, null, null, new m(fVar, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(com.stripe.android.paymentsheet.p pVar) {
        T(null);
        S(null);
        this.f27236q.setValue(new e.a(pVar));
        Q();
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(com.stripe.android.payments.paymentlauncher.a aVar) {
        Object b9;
        b A8;
        n.d dVar;
        try {
            s.a aVar2 = Q5.s.f8810b;
            A8 = A();
        } catch (Throwable th) {
            s.a aVar3 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        if (A8 != null) {
            com.stripe.android.paymentsheet.n f8 = A8.f();
            if (f8 instanceof n.d) {
                dVar = (n.d) f8;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                b9 = Q5.s.b(this.f27228i.f(dVar, B(), A8.h(), aVar));
                Throwable e8 = Q5.s.e(b9);
                if (e8 != null) {
                    b9 = new p.b(e8, AbstractC4004a.a(e8), m.d.f27361a);
                }
                M((com.stripe.android.paymentsheet.p) b9);
                return;
            }
            throw new IllegalStateException("Cannot confirm intent with non payment method confirmation option");
        }
        throw new IllegalStateException("Arguments should have been initialized before handling payment result!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(b bVar, U5.d dVar) {
        com.stripe.android.paymentsheet.n f8 = bVar.f();
        if (f8 instanceof n.c) {
            I((n.c) f8, bVar.h());
        } else if (f8 instanceof n.a) {
            H((n.a) f8);
        } else {
            Object v8 = v(bVar, dVar);
            if (v8 == V5.b.e()) {
                return v8;
            }
            return I.f8786a;
        }
        return I.f8786a;
    }

    private final void Q() {
        this.f27225f.remove("AwaitingPaymentResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        this.f27225f.remove("AwaitingPreConfirmResult");
    }

    private final void S(b bVar) {
        this.f27225f.set("IntentConfirmationArguments", bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(EnumC4126f enumC4126f) {
        this.f27225f.set("DeferredIntentConfirmationType", enumC4126f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        this.f27225f.set("AwaitingPaymentResult", Boolean.TRUE);
    }

    private final void W() {
        this.f27225f.set("AwaitingPreConfirmResult", Boolean.TRUE);
    }

    private final void X(Function1 function1) {
        I i8;
        InterfaceC4077a interfaceC4077a = this.f27229j;
        if (interfaceC4077a != null) {
            function1.invoke(interfaceC4077a);
            i8 = I.f8786a;
        } else {
            i8 = null;
        }
        if (i8 == null) {
            M(new p.b(new IllegalArgumentException("No 'PaymentLauncher' instance was created before starting confirmation. Did you call register?"), C2.d.g(v3.w.f40618h0, new Object[0], null, 4, null), m.b.f27359a));
        }
    }

    private final com.stripe.android.model.n t(StripeIntent stripeIntent) {
        if (stripeIntent instanceof com.stripe.android.model.n) {
            return (com.stripe.android.model.n) stripeIntent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(b bVar, U5.d dVar) {
        S(bVar);
        this.f27236q.setValue(e.b.f27255a);
        com.stripe.android.paymentsheet.n f8 = bVar.f();
        if (f8 instanceof n.b) {
            w((n.b) f8);
        } else {
            if (f8 instanceof n.d) {
                Object x8 = x((n.d) f8, bVar.h(), dVar);
                if (x8 == V5.b.e()) {
                    return x8;
                }
                return I.f8786a;
            }
            i.b.a(this.f27226g, i.f.f36248s, x2.k.f40948e.b(new IllegalStateException("Attempting to confirm intent for invalid confirmation option: " + f8)), null, 4, null);
            M(new p.b(new IllegalStateException("Attempted to confirm invalid " + U.b(f8.getClass()).a() + " confirmation type"), C2.d.a(v3.w.f40618h0), m.d.f27361a));
        }
        return I.f8786a;
    }

    private final void w(n.b bVar) {
        V();
        C4130j.f40490a.b(bVar.getType(), bVar.a(), new i(this), this.f27230k, this.f27226g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(com.stripe.android.paymentsheet.n.d r5, com.stripe.android.model.StripeIntent r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.f.j
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.f$j r0 = (com.stripe.android.paymentsheet.f.j) r0
            int r1 = r0.f27270f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27270f = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.f$j r0 = new com.stripe.android.paymentsheet.f$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27268d
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f27270f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r5 = r0.f27267c
            r6 = r5
            com.stripe.android.model.StripeIntent r6 = (com.stripe.android.model.StripeIntent) r6
            java.lang.Object r5 = r0.f27266b
            com.stripe.android.paymentsheet.n$d r5 = (com.stripe.android.paymentsheet.n.d) r5
            java.lang.Object r0 = r0.f27265a
            com.stripe.android.paymentsheet.f r0 = (com.stripe.android.paymentsheet.f) r0
            Q5.t.b(r7)
            goto L53
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            Q5.t.b(r7)
            com.stripe.android.paymentsheet.e r7 = r4.f27228i
            r0.f27265a = r4
            r0.f27266b = r5
            r0.f27267c = r6
            r0.f27270f = r3
            java.lang.Object r7 = r7.a(r5, r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r0 = r4
        L53:
            com.stripe.android.paymentsheet.l r7 = (com.stripe.android.paymentsheet.l) r7
            boolean r1 = r7 instanceof com.stripe.android.paymentsheet.l.c
            if (r1 == 0) goto L62
            com.stripe.android.paymentsheet.f$k r1 = new com.stripe.android.paymentsheet.f$k
            r1.<init>(r7, r5, r6)
            r0.X(r1)
            goto L8d
        L62:
            boolean r5 = r7 instanceof com.stripe.android.paymentsheet.l.b
            if (r5 == 0) goto L7b
            com.stripe.android.paymentsheet.p$b r5 = new com.stripe.android.paymentsheet.p$b
            com.stripe.android.paymentsheet.l$b r7 = (com.stripe.android.paymentsheet.l.b) r7
            java.lang.Throwable r6 = r7.a()
            C2.c r7 = r7.b()
            com.stripe.android.paymentsheet.m$f r1 = com.stripe.android.paymentsheet.m.f.f27363a
            r5.<init>(r6, r7, r1)
            r0.M(r5)
            goto L8d
        L7b:
            boolean r5 = r7 instanceof com.stripe.android.paymentsheet.l.a
            if (r5 == 0) goto L8d
            com.stripe.android.paymentsheet.p$c r5 = new com.stripe.android.paymentsheet.p$c
            com.stripe.android.paymentsheet.l$a r7 = (com.stripe.android.paymentsheet.l.a) r7
            v3.f r7 = r7.a()
            r5.<init>(r6, r7)
            r0.M(r5)
        L8d:
            Q5.I r5 = Q5.I.f8786a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.f.x(com.stripe.android.paymentsheet.n$d, com.stripe.android.model.StripeIntent, U5.d):java.lang.Object");
    }

    private final com.stripe.android.googlepaylauncher.j y(O2.h hVar, ActivityResultLauncher activityResultLauncher, n.c.a aVar) {
        int i8;
        N2.d dVar;
        M m8 = this.f27224e;
        w.k.c h8 = aVar.h();
        if (h8 == null) {
            i8 = -1;
        } else {
            i8 = C0608f.f27259a[h8.ordinal()];
        }
        if (i8 == 1) {
            dVar = N2.d.f6435b;
        } else {
            dVar = N2.d.f6436c;
        }
        return hVar.a(m8, new j.d(dVar, aVar.i(), aVar.p(), aVar.a().h(), aVar.a().v(), false, false, 96, null), new j.e() { // from class: v3.l
            @Override // com.stripe.android.googlepaylauncher.j.e
            public final void a(boolean z8) {
                com.stripe.android.paymentsheet.f.z(z8);
            }
        }, activityResultLauncher, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(boolean z8) {
    }

    public final boolean C() {
        return this.f27235p;
    }

    public final InterfaceC3813L D() {
        return this.f27237r;
    }

    public final void P(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        AbstractC3292y.i(lifecycleOwner, "lifecycleOwner");
        this.f27229j = this.f27228i.b(activityResultCaller, new n(this));
        this.f27230k = activityResultCaller.registerForActivityResult(new ExternalPaymentMethodContract(this.f27226g), new o());
        ActivityResultLauncher registerForActivityResult = activityResultCaller.registerForActivityResult(new BacsMandateConfirmationContract(), new r());
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f27231l = this.f27222c.a(registerForActivityResult);
        this.f27232m = activityResultCaller.registerForActivityResult(new GooglePayPaymentMethodLauncherContractV2(), new p());
        lifecycleOwner.getLifecycle().addObserver(new q(registerForActivityResult));
    }

    public final void U(b arguments) {
        AbstractC3292y.i(arguments, "arguments");
        e eVar = (e) this.f27236q.getValue();
        if (!(eVar instanceof e.d) && !(eVar instanceof e.b)) {
            this.f27236q.setValue(new e.d(arguments.f(), false));
            S(arguments);
            AbstractC3462k.d(this.f27224e, null, null, new s(arguments, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(U5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.f.h
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.paymentsheet.f$h r0 = (com.stripe.android.paymentsheet.f.h) r0
            int r1 = r0.f27264c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27264c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.f$h r0 = new com.stripe.android.paymentsheet.f$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27262a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f27264c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r6)
            goto L67
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            Q5.t.b(r6)
            q6.w r6 = r5.f27236q
            java.lang.Object r6 = r6.getValue()
            com.stripe.android.paymentsheet.f$e r6 = (com.stripe.android.paymentsheet.f.e) r6
            boolean r2 = r6 instanceof com.stripe.android.paymentsheet.f.e.c
            r4 = 0
            if (r2 == 0) goto L42
            goto L6f
        L42:
            boolean r2 = r6 instanceof com.stripe.android.paymentsheet.f.e.a
            if (r2 == 0) goto L4d
            com.stripe.android.paymentsheet.f$e$a r6 = (com.stripe.android.paymentsheet.f.e.a) r6
            com.stripe.android.paymentsheet.p r4 = r6.a()
            goto L6f
        L4d:
            boolean r2 = r6 instanceof com.stripe.android.paymentsheet.f.e.d
            if (r2 == 0) goto L53
            r6 = 1
            goto L55
        L53:
            boolean r6 = r6 instanceof com.stripe.android.paymentsheet.f.e.b
        L55:
            if (r6 == 0) goto L78
            q6.w r6 = r5.f27236q
            com.stripe.android.paymentsheet.f$g r2 = new com.stripe.android.paymentsheet.f$g
            r2.<init>(r4)
            r0.f27264c = r3
            java.lang.Object r6 = q6.AbstractC3823h.x(r6, r2, r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            if (r6 == 0) goto L70
            com.stripe.android.paymentsheet.f$e$a r6 = (com.stripe.android.paymentsheet.f.e.a) r6
            com.stripe.android.paymentsheet.p r4 = r6.a()
        L6f:
            return r4
        L70:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.stripe.android.paymentsheet.IntentConfirmationHandler.State.Complete"
            r6.<init>(r0)
            throw r6
        L78:
            Q5.p r6 = new Q5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.f.u(U5.d):java.lang.Object");
    }
}
