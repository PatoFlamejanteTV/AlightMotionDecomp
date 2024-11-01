package com.stripe.android.paymentsheet;

import P2.b;
import Q5.I;
import Q5.InterfaceC1416k;
import S2.a;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.SavedStateHandle;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.AbstractC3462k;
import n6.C3475q0;
import n6.M;
import q6.AbstractC3804C;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import u3.AbstractC4079c;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.link.a f27295a;

    /* renamed from: b, reason: collision with root package name */
    private final P2.e f27296b;

    /* renamed from: c, reason: collision with root package name */
    private final SavedStateHandle f27297c;

    /* renamed from: d, reason: collision with root package name */
    private final Q2.d f27298d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.v f27299e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3821f f27300f;

    /* renamed from: g, reason: collision with root package name */
    private final q6.w f27301g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f27302h;

    /* renamed from: i, reason: collision with root package name */
    private final q6.w f27303i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3813L f27304j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1416k f27305k;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: com.stripe.android.paymentsheet.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0610a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0610a f27306a = new C0610a();

            private C0610a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0610a);
            }

            public int hashCode() {
                return -1384461919;
            }

            public String toString() {
                return "Cancelled";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f27307a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 870884921;
            }

            public String toString() {
                return "CompleteWithoutLink";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f27308b = AbstractC4079c.f40268b;

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC4079c f27309a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC4079c result) {
                super(null);
                AbstractC3292y.i(result, "result");
                this.f27309a = result;
            }

            public final AbstractC4079c a() {
                return this.f27309a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3292y.d(this.f27309a, ((c) obj).f27309a);
            }

            public int hashCode() {
                return this.f27309a.hashCode();
            }

            public String toString() {
                return "CompletedWithPaymentResult(result=" + this.f27309a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f27310a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1190189758;
            }

            public String toString() {
                return "Launched";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            private final D3.f f27311a;

            public e(D3.f fVar) {
                super(null);
                this.f27311a = fVar;
            }

            public final D3.f a() {
                return this.f27311a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && AbstractC3292y.d(this.f27311a, ((e) obj).f27311a);
            }

            public int hashCode() {
                D3.f fVar = this.f27311a;
                if (fVar == null) {
                    return 0;
                }
                return fVar.hashCode();
            }

            public String toString() {
                return "PaymentDetailsCollected(paymentSelection=" + this.f27311a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class f extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f27312b = com.stripe.android.model.o.f25630u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f27313a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f27313a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f27313a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && AbstractC3292y.d(this.f27313a, ((f) obj).f27313a);
            }

            public int hashCode() {
                return this.f27313a.hashCode();
            }

            public String toString() {
                return "PaymentMethodCollected(paymentMethod=" + this.f27313a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class g extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final g f27314a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return -66772493;
            }

            public String toString() {
                return "Ready";
            }
        }

        /* loaded from: classes4.dex */
        public static final class h extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final h f27315a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public int hashCode() {
                return 1573500113;
            }

            public String toString() {
                return "Started";
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27316a;

        static {
            int[] iArr = new int[T2.a.values().length];
            try {
                iArr[T2.a.f9960a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T2.a.f9962c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T2.a.f9961b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[T2.a.f9963d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[T2.a.f9964e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27316a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27317a;

        /* renamed from: b, reason: collision with root package name */
        Object f27318b;

        /* renamed from: c, reason: collision with root package name */
        Object f27319c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27320d;

        /* renamed from: f, reason: collision with root package name */
        int f27322f;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27320d = obj;
            this.f27322f |= Integer.MIN_VALUE;
            return i.this.b(null, null, null, false, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0197a f27323a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a.InterfaceC0197a interfaceC0197a) {
            super(0);
            this.f27323a = interfaceC0197a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R2.c invoke() {
            return this.f27323a.build().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27324a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P2.d f27326c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(P2.d dVar, U5.d dVar2) {
            super(2, dVar2);
            this.f27326c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f27326c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27324a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                P2.e e9 = i.this.e();
                P2.d dVar = this.f27326c;
                this.f27324a = 1;
                if (e9.a(dVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27327a;

        /* renamed from: b, reason: collision with root package name */
        Object f27328b;

        /* renamed from: c, reason: collision with root package name */
        Object f27329c;

        /* renamed from: d, reason: collision with root package name */
        Object f27330d;

        /* renamed from: e, reason: collision with root package name */
        Object f27331e;

        /* renamed from: f, reason: collision with root package name */
        boolean f27332f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f27333g;

        /* renamed from: i, reason: collision with root package name */
        int f27335i;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27333g = obj;
            this.f27335i |= Integer.MIN_VALUE;
            return i.this.k(null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class g extends C3289v implements Function1 {
        g(Object obj) {
            super(1, obj, i.class, "onLinkActivityResult", "onLinkActivityResult(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
        }

        public final void d(P2.b p02) {
            AbstractC3292y.i(p02, "p0");
            ((i) this.receiver).j(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((P2.b) obj);
            return I.f8786a;
        }
    }

    public i(com.stripe.android.link.a linkLauncher, P2.e linkConfigurationCoordinator, SavedStateHandle savedStateHandle, Q2.d linkStore, a.InterfaceC0197a linkAnalyticsComponentBuilder) {
        AbstractC3292y.i(linkLauncher, "linkLauncher");
        AbstractC3292y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(linkStore, "linkStore");
        AbstractC3292y.i(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        this.f27295a = linkLauncher;
        this.f27296b = linkConfigurationCoordinator;
        this.f27297c = savedStateHandle;
        this.f27298d = linkStore;
        q6.v b9 = AbstractC3804C.b(1, 5, null, 4, null);
        this.f27299e = b9;
        this.f27300f = b9;
        q6.w a9 = AbstractC3815N.a(null);
        this.f27301g = a9;
        this.f27302h = a9;
        q6.w a10 = AbstractC3815N.a(null);
        this.f27303i = a10;
        this.f27304j = AbstractC3823h.b(a10);
        this.f27305k = Q5.l.b(new d(linkAnalyticsComponentBuilder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010e, code lost:            if (r8 == null) goto L46;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(P2.d r27, com.stripe.android.model.p r28, D3.f.a r29, boolean r30, U5.d r31) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.i.b(P2.d, com.stripe.android.model.p, D3.f$a, boolean, U5.d):java.lang.Object");
    }

    private final AbstractC4079c c(P2.b bVar) {
        if (bVar instanceof b.C0156b) {
            return AbstractC4079c.C0903c.f40270c;
        }
        if (bVar instanceof b.a) {
            return AbstractC4079c.a.f40269c;
        }
        if (bVar instanceof b.c) {
            return new AbstractC4079c.d(((b.c) bVar).a());
        }
        throw new Q5.p();
    }

    private final R2.c d() {
        return (R2.c) this.f27305k.getValue();
    }

    public final P2.e e() {
        return this.f27296b;
    }

    public final InterfaceC3821f f() {
        return this.f27300f;
    }

    public final InterfaceC3813L g() {
        return this.f27302h;
    }

    public final void h() {
        P2.d dVar = (P2.d) this.f27303i.getValue();
        if (dVar == null) {
            return;
        }
        this.f27295a.b(dVar);
        this.f27299e.d(a.d.f27310a);
    }

    public final void i() {
        P2.d dVar = (P2.d) this.f27304j.getValue();
        if (dVar != null) {
            AbstractC3462k.d(C3475q0.f35747a, null, null, new e(dVar, null), 3, null);
        }
    }

    public final void j(P2.b result) {
        b.C0156b c0156b;
        boolean z8;
        AbstractC3292y.i(result, "result");
        com.stripe.android.model.o oVar = null;
        if (result instanceof b.C0156b) {
            c0156b = (b.C0156b) result;
        } else {
            c0156b = null;
        }
        if (c0156b != null) {
            oVar = c0156b.r();
        }
        if ((result instanceof b.a) && ((b.a) result).a() == b.a.EnumC0155b.f8007a) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (oVar != null) {
            this.f27299e.d(new a.f(oVar));
            this.f27298d.c();
        } else {
            if (z8) {
                this.f27299e.d(a.C0610a.f27306a);
                return;
            }
            this.f27299e.d(new a.c(c(result)));
            this.f27298d.c();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(Y2.m r19, D3.f r20, boolean r21, U5.d r22) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.i.k(Y2.m, D3.f, boolean, U5.d):java.lang.Object");
    }

    public final void l(ActivityResultCaller activityResultCaller) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        this.f27295a.c(activityResultCaller, new g(this));
    }

    public final void m(N3.g gVar) {
        boolean z8;
        q6.w wVar = this.f27301g;
        if (gVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        wVar.setValue(Boolean.valueOf(z8));
        if (gVar == null) {
            return;
        }
        this.f27303i.setValue(gVar.a());
    }

    public final void n() {
        this.f27295a.e();
    }
}
