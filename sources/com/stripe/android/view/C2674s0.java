package com.stripe.android.view;

import R5.AbstractC1435t;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import g3.C2895E;
import g3.C2896F;
import j6.InterfaceC3214c;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3403f;
import n2.u;
import n6.C3445b0;

/* renamed from: com.stripe.android.view.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2674s0 extends ViewModel {

    /* renamed from: h, reason: collision with root package name */
    public static final a f29178h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f29179i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final Set f29180j = R5.a0.i("PaymentSession", "PaymentFlowActivity", "ShippingInfoScreen");

    /* renamed from: a, reason: collision with root package name */
    private n2.v f29181a;

    /* renamed from: b, reason: collision with root package name */
    private final U5.g f29182b;

    /* renamed from: c, reason: collision with root package name */
    private List f29183c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29184d;

    /* renamed from: e, reason: collision with root package name */
    private C2896F f29185e;

    /* renamed from: f, reason: collision with root package name */
    private C2895E f29186f;

    /* renamed from: g, reason: collision with root package name */
    private int f29187g;

    /* renamed from: com.stripe.android.view.s0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.s0$b */
    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final n2.v f29188a;

        public b(AbstractC3403f customerSession, n2.v paymentSessionData) {
            AbstractC3292y.i(customerSession, "customerSession");
            AbstractC3292y.i(paymentSessionData, "paymentSessionData");
            this.f29188a = paymentSessionData;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            return new C2674s0(null, this.f29188a, C3445b0.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.s0$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29189a;

        /* renamed from: b, reason: collision with root package name */
        Object f29190b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29191c;

        /* renamed from: e, reason: collision with root package name */
        int f29193e;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29191c = obj;
            this.f29193e |= Integer.MIN_VALUE;
            Object g8 = C2674s0.this.g(null, this);
            return g8 == V5.b.e() ? g8 : Q5.s.a(g8);
        }
    }

    /* renamed from: com.stripe.android.view.s0$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U5.d f29195b;

        d(U5.d dVar) {
            this.f29195b = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.s0$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29196a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29197b;

        /* renamed from: d, reason: collision with root package name */
        int f29199d;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29197b = obj;
            this.f29199d |= Integer.MIN_VALUE;
            Object l8 = C2674s0.this.l(null, null, null, this);
            return l8 == V5.b.e() ? l8 : Q5.s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.s0$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29200a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29201b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2895E f29202c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(u.c cVar, C2895E c2895e, u.d dVar, U5.d dVar2) {
            super(2, dVar2);
            this.f29202c = c2895e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            f fVar = new f(null, this.f29202c, null, dVar);
            fVar.f29201b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29200a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q5.t.b(obj);
            throw null;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public C2674s0(AbstractC3403f customerSession, n2.v paymentSessionData, U5.g workContext) {
        AbstractC3292y.i(customerSession, "customerSession");
        AbstractC3292y.i(paymentSessionData, "paymentSessionData");
        AbstractC3292y.i(workContext, "workContext");
        this.f29181a = paymentSessionData;
        this.f29182b = workContext;
        this.f29183c = AbstractC1435t.m();
    }

    public final int a() {
        return this.f29187g;
    }

    public final n2.v b() {
        return this.f29181a;
    }

    public final C2896F c() {
        return this.f29185e;
    }

    public final List d() {
        return this.f29183c;
    }

    public final C2895E e() {
        return this.f29186f;
    }

    public final boolean f() {
        return this.f29184d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object g(g3.C2895E r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.view.C2674s0.c
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.view.s0$c r0 = (com.stripe.android.view.C2674s0.c) r0
            int r1 = r0.f29193e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29193e = r1
            goto L18
        L13:
            com.stripe.android.view.s0$c r0 = new com.stripe.android.view.s0$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29191c
            V5.b.e()
            int r1 = r0.f29193e
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r5 = r0.f29190b
            g3.E r5 = (g3.C2895E) r5
            java.lang.Object r5 = r0.f29189a
            com.stripe.android.view.s0 r5 = (com.stripe.android.view.C2674s0) r5
            Q5.t.b(r6)
            Q5.s r6 = (Q5.s) r6
            java.lang.Object r5 = r6.j()
            return r5
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            Q5.t.b(r6)
            r0.f29189a = r4
            r0.f29190b = r5
            r0.f29193e = r2
            U5.i r6 = new U5.i
            U5.d r0 = V5.b.c(r0)
            r6.<init>(r0)
            r4.f29186f = r5
            com.stripe.android.view.s0$d r5 = new com.stripe.android.view.s0$d
            r5.<init>(r6)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2674s0.g(g3.E, U5.d):java.lang.Object");
    }

    public final void h(int i8) {
        this.f29187g = i8;
    }

    public final void i(n2.v vVar) {
        AbstractC3292y.i(vVar, "<set-?>");
        this.f29181a = vVar;
    }

    public final void j(C2896F c2896f) {
        this.f29185e = c2896f;
    }

    public final void k(boolean z8) {
        this.f29184d = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object l(n2.u.c r6, n2.u.d r7, g3.C2895E r8, U5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.view.C2674s0.e
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.view.s0$e r0 = (com.stripe.android.view.C2674s0.e) r0
            int r1 = r0.f29199d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29199d = r1
            goto L18
        L13:
            com.stripe.android.view.s0$e r0 = new com.stripe.android.view.s0$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29197b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f29199d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f29196a
            com.stripe.android.view.s0 r6 = (com.stripe.android.view.C2674s0) r6
            Q5.t.b(r9)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            Q5.t.b(r9)
            U5.g r9 = r5.f29182b
            com.stripe.android.view.s0$f r2 = new com.stripe.android.view.s0$f
            r4 = 0
            r2.<init>(r6, r8, r7, r4)
            r0.f29196a = r5
            r0.f29199d = r3
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r2, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            r6 = r5
        L4c:
            Q5.s r9 = (Q5.s) r9
            java.lang.Object r7 = r9.j()
            java.util.List r8 = R5.AbstractC1435t.m()
            boolean r9 = Q5.s.g(r7)
            if (r9 == 0) goto L5d
            goto L5e
        L5d:
            r8 = r7
        L5e:
            java.util.List r8 = (java.util.List) r8
            r6.f29183c = r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2674s0.l(n2.u$c, n2.u$d, g3.E, U5.d):java.lang.Object");
    }
}
