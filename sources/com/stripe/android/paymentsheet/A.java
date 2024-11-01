package com.stripe.android.paymentsheet;

import C3.AbstractC1003y;
import C3.e0;
import D3.f;
import D3.h;
import E3.c;
import J3.c;
import J3.e;
import N3.m;
import O3.C1361i;
import O3.C1363k;
import O3.InterfaceC1371t;
import Q5.I;
import R5.AbstractC1435t;
import android.app.Application;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import com.stripe.android.googlepaylauncher.j;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.r;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.f;
import com.stripe.android.paymentsheet.i;
import com.stripe.android.paymentsheet.m;
import com.stripe.android.paymentsheet.n;
import com.stripe.android.paymentsheet.p;
import com.stripe.android.paymentsheet.w;
import com.stripe.android.paymentsheet.z;
import d3.C2752d;
import g3.EnumC2906e;
import g4.C2918b;
import j4.Q;
import j6.InterfaceC3214c;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3269a;
import kotlin.jvm.internal.C3289v;
import n6.AbstractC3458i;
import n6.M;
import n6.N;
import o2.C3525g;
import p2.InterfaceC3560b;
import q6.AbstractC3804C;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3802A;
import q6.InterfaceC3808G;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import t2.AbstractC4004a;
import u3.AbstractC4079c;
import v3.C4122b;
import v3.EnumC4126f;
import y3.AbstractC4244b;
import z3.InterfaceC4267a;

/* loaded from: classes4.dex */
public final class A extends R3.a {

    /* renamed from: C, reason: collision with root package name */
    private final PaymentSheetContractV2.a f26593C;

    /* renamed from: D, reason: collision with root package name */
    private final N3.h f26594D;

    /* renamed from: E, reason: collision with root package name */
    private final v3.q f26595E;

    /* renamed from: F, reason: collision with root package name */
    private final v2.d f26596F;

    /* renamed from: G, reason: collision with root package name */
    private final p3.i f26597G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC4267a f26598H;

    /* renamed from: I, reason: collision with root package name */
    private final e.a f26599I;

    /* renamed from: J, reason: collision with root package name */
    private final q6.w f26600J;

    /* renamed from: K, reason: collision with root package name */
    private final InterfaceC3813L f26601K;

    /* renamed from: L, reason: collision with root package name */
    private final R3.c f26602L;

    /* renamed from: M, reason: collision with root package name */
    private final q6.v f26603M;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC3802A f26604N;

    /* renamed from: O, reason: collision with root package name */
    private final q6.w f26605O;

    /* renamed from: P, reason: collision with root package name */
    private c f26606P;

    /* renamed from: Q, reason: collision with root package name */
    private final InterfaceC3813L f26607Q;

    /* renamed from: R, reason: collision with root package name */
    private com.stripe.android.paymentsheet.k f26608R;

    /* renamed from: S, reason: collision with root package name */
    private final D3.b f26609S;

    /* renamed from: T, reason: collision with root package name */
    private final j.d f26610T;

    /* renamed from: U, reason: collision with root package name */
    private final InterfaceC3813L f26611U;

    /* renamed from: V, reason: collision with root package name */
    private final InterfaceC3813L f26612V;

    /* renamed from: W, reason: collision with root package name */
    private final InterfaceC3813L f26613W;

    /* renamed from: X, reason: collision with root package name */
    private final InterfaceC3813L f26614X;

    /* renamed from: Y, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.f f26615Y;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.i f26617b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ A f26618c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.A$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0561a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f26619a;

            C0561a(A a9) {
                this.f26619a = a9;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.a aVar, U5.d dVar) {
                this.f26619a.v0(aVar);
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.stripe.android.paymentsheet.i iVar, A a9, U5.d dVar) {
            super(2, dVar);
            this.f26617b = iVar;
            this.f26618c = a9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f26617b, this.f26618c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26616a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3821f f8 = this.f26617b.f();
                C0561a c0561a = new C0561a(this.f26618c);
                this.f26616a = 1;
                if (f8.collect(c0561a, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26620a;

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26620a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                A a9 = A.this;
                this.f26620a = 1;
                if (a9.D0(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f26622a = new c("SheetTopWallet", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f26623b = new c("SheetBottomBuy", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f26624c = new c("None", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f26625d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f26626e;

        static {
            c[] a9 = a();
            f26625d = a9;
            f26626e = W5.b.a(a9);
        }

        private c(String str, int i8) {
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f26622a, f26623b, f26624c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f26625d.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26627a;

        public d(Function0 starterArgsSupplier) {
            AbstractC3292y.i(starterArgsSupplier, "starterArgsSupplier");
            this.f26627a = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            Application a9 = E2.b.a(extras);
            A a10 = AbstractC1003y.a().b(a9).build().a().b(new e0((PaymentSheetContractV2.a) this.f26627a.invoke())).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3292y.g(a10, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.create");
            return a10;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26628a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26629b;

        static {
            int[] iArr = new int[w.k.a.values().length];
            try {
                iArr[w.k.a.f27972a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.k.a.f27973b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.k.a.f27974c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.k.a.f27975d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w.k.a.f27976e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w.k.a.f27978g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w.k.a.f27979h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[w.k.a.f27977f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f26628a = iArr;
            int[] iArr2 = new int[w.k.c.values().length];
            try {
                iArr2[w.k.c.f27982a.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            f26629b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26630a;

        /* renamed from: c, reason: collision with root package name */
        int f26632c;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26630a = obj;
            this.f26632c |= Integer.MIN_VALUE;
            return A.this.f0(this);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D3.h invoke(D3.h hVar) {
            return A.this.E0(hVar, c.f26623b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f26634a;

        /* renamed from: b, reason: collision with root package name */
        Object f26635b;

        /* renamed from: c, reason: collision with root package name */
        int f26636c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f26637d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D3.f f26639f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(D3.f fVar, U5.d dVar) {
            super(2, dVar);
            this.f26639f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            h hVar = new h(this.f26639f, dVar);
            hVar.f26637d = obj;
            return hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x009a, code lost:            if (r1 == null) goto L23;     */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r9.f26636c
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r9.f26635b
                com.stripe.android.paymentsheet.n r0 = (com.stripe.android.paymentsheet.n) r0
                java.lang.Object r1 = r9.f26634a
                com.stripe.android.paymentsheet.A r1 = (com.stripe.android.paymentsheet.A) r1
                java.lang.Object r2 = r9.f26637d
                n6.M r2 = (n6.M) r2
                Q5.t.b(r10)
                goto L60
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                Q5.t.b(r10)
                java.lang.Object r10 = r9.f26637d
                n6.M r10 = (n6.M) r10
                com.stripe.android.paymentsheet.A r1 = com.stripe.android.paymentsheet.A.this
                D3.f r3 = r9.f26639f
                D3.f r1 = com.stripe.android.paymentsheet.A.a0(r1, r3)
                r3 = 0
                if (r1 == 0) goto L4a
                com.stripe.android.paymentsheet.A r4 = com.stripe.android.paymentsheet.A.this
                com.stripe.android.paymentsheet.PaymentSheetContractV2$a r4 = r4.l0()
                com.stripe.android.paymentsheet.w$l r4 = r4.f()
                com.stripe.android.paymentsheet.A r5 = com.stripe.android.paymentsheet.A.this
                com.stripe.android.paymentsheet.w$g r5 = r5.f()
                com.stripe.android.paymentsheet.n r1 = com.stripe.android.paymentsheet.o.a(r1, r4, r5)
                goto L4b
            L4a:
                r1 = r3
            L4b:
                if (r1 == 0) goto L70
                com.stripe.android.paymentsheet.A r3 = com.stripe.android.paymentsheet.A.this
                r9.f26637d = r10
                r9.f26634a = r3
                r9.f26635b = r1
                r9.f26636c = r2
                java.lang.Object r10 = com.stripe.android.paymentsheet.A.N(r3, r9)
                if (r10 != r0) goto L5e
                return r0
            L5e:
                r0 = r1
                r1 = r3
            L60:
                com.stripe.android.model.StripeIntent r10 = (com.stripe.android.model.StripeIntent) r10
                com.stripe.android.paymentsheet.f r1 = com.stripe.android.paymentsheet.A.R(r1)
                com.stripe.android.paymentsheet.f$b r2 = new com.stripe.android.paymentsheet.f$b
                r2.<init>(r10, r0)
                r1.U(r2)
                Q5.I r3 = Q5.I.f8786a
            L70:
                if (r3 != 0) goto Lcd
                D3.f r10 = r9.f26639f
                com.stripe.android.paymentsheet.A r0 = com.stripe.android.paymentsheet.A.this
                if (r10 == 0) goto L9c
                java.lang.Class r1 = r10.getClass()
                j6.c r1 = kotlin.jvm.internal.U.b(r1)
                java.lang.String r1 = r1.a()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot confirm using a "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " payment selection!"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                if (r1 != 0) goto L9e
            L9c:
                java.lang.String r1 = "Cannot confirm without a payment selection!"
            L9e:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>(r1)
                if (r10 == 0) goto Lac
                p3.i$f r10 = p3.i.f.f36246q
                if (r10 != 0) goto Laa
                goto Lac
            Laa:
                r4 = r10
                goto Laf
            Lac:
                p3.i$f r10 = p3.i.f.f36245p
                goto Laa
            Laf:
                p3.i r3 = com.stripe.android.paymentsheet.A.P(r0)
                x2.k$a r10 = x2.k.f40948e
                x2.k r5 = r10.b(r2)
                r7 = 4
                r8 = 0
                r6 = 0
                p3.i.b.a(r3, r4, r5, r6, r7, r8)
                com.stripe.android.paymentsheet.p$b r10 = new com.stripe.android.paymentsheet.p$b
                C2.c r1 = t2.AbstractC4004a.a(r2)
                com.stripe.android.paymentsheet.m$d r3 = com.stripe.android.paymentsheet.m.d.f27361a
                r10.<init>(r2, r1, r3)
                com.stripe.android.paymentsheet.A.b0(r0, r10)
            Lcd:
                Q5.I r10 = Q5.I.f8786a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.A.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f26640a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2.c invoke(D3.h hVar) {
            h.d a9;
            if (hVar != null && (a9 = hVar.a()) != null) {
                return a9.a();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5487invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5487invoke() {
            A.this.f26603M.d(z.b.f28042a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26642a;

        /* renamed from: b, reason: collision with root package name */
        Object f26643b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26644c;

        /* renamed from: e, reason: collision with root package name */
        int f26646e;

        k(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26644c = obj;
            this.f26646e |= Integer.MIN_VALUE;
            return A.this.z0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26647a;

        /* renamed from: b, reason: collision with root package name */
        Object f26648b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26649c;

        /* renamed from: e, reason: collision with root package name */
        int f26651e;

        l(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26649c = obj;
            this.f26651e |= Integer.MIN_VALUE;
            return A.this.A0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26652a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f26654a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26655b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ A f26656c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(A a9, U5.d dVar) {
                super(2, dVar);
                this.f26656c = a9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                a aVar = new a(this.f26656c, dVar);
                aVar.f26655b = obj;
                return aVar;
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f.e eVar, U5.d dVar) {
                return ((a) create(eVar, dVar)).invokeSuspend(I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f26654a == 0) {
                    Q5.t.b(obj);
                    f.e eVar = (f.e) this.f26655b;
                    if (!(eVar instanceof f.e.c)) {
                        if (eVar instanceof f.e.d) {
                            f.e.d dVar = (f.e.d) eVar;
                            if (!dVar.b() || !(dVar.a() instanceof n.c)) {
                                this.f26656c.O0(true);
                            } else {
                                this.f26656c.O0(false);
                            }
                            A a9 = this.f26656c;
                            a9.P0(a9.n0());
                        } else if (eVar instanceof f.e.b) {
                            this.f26656c.O0(true);
                            if (!(this.f26656c.t0().getValue() instanceof h.c)) {
                                A a10 = this.f26656c;
                                a10.P0(a10.n0());
                            }
                        } else if (eVar instanceof f.e.a) {
                            this.f26656c.O0(true);
                            this.f26656c.J0(((f.e.a) eVar).a());
                        }
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        m(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26652a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3813L D8 = A.this.f26615Y.D();
                a aVar = new a(A.this, null);
                this.f26652a = 1;
                if (AbstractC3823h.j(D8, aVar, this) == e8) {
                    return e8;
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
    public static final class n extends AbstractC3293z implements Function1 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f26658a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J3.e f26659b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ A f26660c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.A$n$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0562a extends C3269a implements InterfaceC2072n {
                C0562a(Object obj) {
                    super(2, obj, A.class, "handleCvcCompletionState", "handleCvcCompletionState(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;)V", 4);
                }

                @Override // c6.InterfaceC2072n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J3.c cVar, U5.d dVar) {
                    return a.j((A) this.receiver, cVar, dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J3.e eVar, A a9, U5.d dVar) {
                super(2, dVar);
                this.f26659b = eVar;
                this.f26660c = a9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object j(A a9, J3.c cVar, U5.d dVar) {
                a9.u0(cVar);
                return I.f8786a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f26659b, this.f26660c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f26658a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    InterfaceC3813L c8 = this.f26659b.c();
                    C0562a c0562a = new C0562a(this.f26660c);
                    this.f26658a = 1;
                    if (AbstractC3823h.j(c8, c0562a, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        n() {
            super(1);
        }

        public final void a(J3.d cvcRecollectionData) {
            StripeIntent W8;
            AbstractC3292y.i(cvcRecollectionData, "cvcRecollectionData");
            e.a aVar = A.this.f26599I;
            String b9 = cvcRecollectionData.b();
            if (b9 == null) {
                b9 = "";
            }
            EnumC2906e a9 = cvcRecollectionData.a();
            C2752d c2752d = (C2752d) A.this.t().getValue();
            boolean z8 = false;
            if (c2752d != null && (W8 = c2752d.W()) != null && !W8.c()) {
                z8 = true;
            }
            J3.e a10 = aVar.a(new J3.a(b9, a9, "", z8), A.this.v(), ViewModelKt.getViewModelScope(A.this));
            AbstractC3458i.d(ViewModelKt.getViewModelScope(A.this), null, null, new a(a10, A.this, null), 3, null);
            A.this.r().m(new c.d(a10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J3.d) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26661a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26662b;

        /* renamed from: d, reason: collision with root package name */
        int f26664d;

        o(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26662b = obj;
            this.f26664d |= Integer.MIN_VALUE;
            return A.this.D0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26665a;

        p(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new p(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a9;
            Object e8 = V5.b.e();
            int i8 = this.f26665a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    a9 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                N3.h hVar = A.this.f26594D;
                w.l f8 = A.this.l0().f();
                w.g a10 = A.this.l0().a();
                boolean C8 = A.this.f26615Y.C();
                boolean h8 = A.this.l0().h();
                this.f26665a = 1;
                a9 = hVar.a(f8, a10, C8, h8, this);
                if (a9 == e8) {
                    return e8;
                }
            }
            return Q5.s.a(a9);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((p) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26667a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4079c f26669c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(AbstractC4079c abstractC4079c, U5.d dVar) {
            super(2, dVar);
            this.f26669c = abstractC4079c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new q(this.f26669c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26667a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                A a9 = A.this;
                this.f26667a = 1;
                obj = a9.f0(this);
                if (obj == e8) {
                    return e8;
                }
            }
            A.this.K0((StripeIntent) obj, this.f26669c);
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f26670a = new r();

        r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2918b invoke(C2752d c2752d) {
            if (c2752d != null) {
                return c2752d.h();
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class s extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventReporter f26671a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f26672b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(EventReporter eventReporter, A a9) {
            super(0);
            this.f26671a = eventReporter;
            this.f26672b = a9;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5488invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5488invoke() {
            this.f26671a.l((D3.f) this.f26672b.y().getValue());
            this.f26672b.g0();
        }
    }

    /* loaded from: classes4.dex */
    public static final class t implements DefaultLifecycleObserver {
        t() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3292y.i(owner, "owner");
            A.this.p().n();
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

    /* loaded from: classes4.dex */
    static final class u extends AbstractC3293z implements Function1 {
        u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N3.m invoke(D3.h hVar) {
            D3.h E02 = A.this.E0(hVar, c.f26622a);
            C2.c cVar = null;
            if (E02 == null) {
                return null;
            }
            if (E02 instanceof h.b) {
                h.d a9 = ((h.b) E02).a();
                if (a9 != null) {
                    cVar = a9.a();
                }
                return new m.b(cVar);
            }
            if (E02 instanceof h.c) {
                return m.c.f6608a;
            }
            if (E02 instanceof h.a) {
                return new m.a(((h.a) E02).b());
            }
            throw new Q5.p();
        }
    }

    /* loaded from: classes4.dex */
    static final class v extends AbstractC3293z implements InterfaceC2074p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.i f26676b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3289v implements Function0 {
            a(Object obj) {
                super(0, obj, A.class, "checkoutWithGooglePay", "checkoutWithGooglePay()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5489invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5489invoke() {
                ((A) this.receiver).i0();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C3289v implements Function0 {
            b(Object obj) {
                super(0, obj, com.stripe.android.paymentsheet.i.class, "launchLink", "launchLink()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5490invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5490invoke() {
                ((com.stripe.android.paymentsheet.i) this.receiver).h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(com.stripe.android.paymentsheet.i iVar) {
            super(4);
            this.f26676b = iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:            if (r15.a0() == true) goto L8;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final N3.n a(java.lang.Boolean r12, java.lang.String r13, boolean r14, d3.C2752d r15) {
            /*
                r11 = this;
                N3.n$a r0 = N3.n.f6609g
                r1 = 0
                if (r15 == 0) goto Ld
                boolean r2 = r15.a0()
                r3 = 1
                if (r2 != r3) goto Ld
                goto Le
            Ld:
                r3 = 0
            Le:
                r1 = 0
                if (r15 == 0) goto L16
                java.util.List r2 = r15.h0()
                goto L17
            L16:
                r2 = r1
            L17:
                if (r2 != 0) goto L1d
                java.util.List r2 = R5.AbstractC1435t.m()
            L1d:
                r6 = r2
                com.stripe.android.paymentsheet.A r2 = com.stripe.android.paymentsheet.A.this
                com.stripe.android.googlepaylauncher.j$d r7 = r2.r0()
                com.stripe.android.paymentsheet.A r2 = com.stripe.android.paymentsheet.A.this
                D3.b r4 = com.stripe.android.paymentsheet.A.Q(r2)
                com.stripe.android.paymentsheet.A$v$a r8 = new com.stripe.android.paymentsheet.A$v$a
                com.stripe.android.paymentsheet.A r2 = com.stripe.android.paymentsheet.A.this
                r8.<init>(r2)
                com.stripe.android.paymentsheet.A$v$b r9 = new com.stripe.android.paymentsheet.A$v$b
                com.stripe.android.paymentsheet.i r2 = r11.f26676b
                r9.<init>(r2)
                if (r15 == 0) goto L3e
                com.stripe.android.model.StripeIntent r1 = r15.W()
            L3e:
                boolean r10 = r1 instanceof com.stripe.android.model.u
                r1 = r12
                r2 = r13
                r5 = r14
                N3.n r12 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.A.v.a(java.lang.Boolean, java.lang.String, boolean, d3.d):N3.n");
        }

        @Override // c6.InterfaceC2074p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((Boolean) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (C2752d) obj4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(PaymentSheetContractV2.a args, EventReporter eventReporter, N3.h paymentSheetLoader, M3.c customerRepository, v3.q prefsRepository, v2.d logger, U5.g workContext, SavedStateHandle savedStateHandle, com.stripe.android.paymentsheet.i linkHandler, f.d intentConfirmationHandlerFactory, InterfaceC3560b.a cardAccountRangeRepositoryFactory, InterfaceC1371t.a editInteractorFactory, p3.i errorReporter, InterfaceC4267a cvcRecollectionHandler, e.a cvcRecollectionInteractorFactory) {
        super(args.a(), eventReporter, customerRepository, workContext, savedStateHandle, linkHandler, editInteractorFactory, cardAccountRangeRepositoryFactory, true);
        D3.b bVar;
        j.d dVar;
        N2.d dVar2;
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(eventReporter, "eventReporter");
        AbstractC3292y.i(paymentSheetLoader, "paymentSheetLoader");
        AbstractC3292y.i(customerRepository, "customerRepository");
        AbstractC3292y.i(prefsRepository, "prefsRepository");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(linkHandler, "linkHandler");
        AbstractC3292y.i(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3292y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(cvcRecollectionHandler, "cvcRecollectionHandler");
        AbstractC3292y.i(cvcRecollectionInteractorFactory, "cvcRecollectionInteractorFactory");
        this.f26593C = args;
        this.f26594D = paymentSheetLoader;
        this.f26595E = prefsRepository;
        this.f26596F = logger;
        this.f26597G = errorReporter;
        this.f26598H = cvcRecollectionHandler;
        this.f26599I = cvcRecollectionInteractorFactory;
        q6.w a9 = AbstractC3815N.a(Boolean.TRUE);
        this.f26600J = a9;
        this.f26601K = a9;
        R3.c cVar = new R3.c(f(), B0(), r().f(), d(), A4.g.m(t(), r.f26670a), y(), g(), k(), new s(eventReporter, this));
        this.f26602L = cVar;
        q6.v b9 = AbstractC3804C.b(1, 0, null, 6, null);
        this.f26603M = b9;
        this.f26604N = b9;
        q6.w a10 = AbstractC3815N.a(null);
        this.f26605O = a10;
        this.f26606P = c.f26623b;
        InterfaceC3813L m8 = A4.g.m(a10, new g());
        this.f26607Q = m8;
        w.k u8 = args.a().u();
        w.k.a b10 = u8 != null ? u8.b() : null;
        switch (b10 == null ? -1 : e.f26628a[b10.ordinal()]) {
            case -1:
            case 8:
                bVar = D3.b.f1238f;
                break;
            case 0:
            default:
                throw new Q5.p();
            case 1:
                bVar = D3.b.f1233a;
                break;
            case 2:
                bVar = D3.b.f1234b;
                break;
            case 3:
                bVar = D3.b.f1235c;
                break;
            case 4:
                bVar = D3.b.f1236d;
                break;
            case 5:
                bVar = D3.b.f1237e;
                break;
            case 6:
                bVar = D3.b.f1239g;
                break;
            case 7:
                bVar = D3.b.f1240h;
                break;
        }
        this.f26609S = bVar;
        w.k b11 = args.b();
        if (b11 != null) {
            if (b11.f() == null && !B0()) {
                logger.c("GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            } else {
                if (e.f26629b[b11.h().ordinal()] == 1) {
                    dVar2 = N2.d.f6435b;
                } else {
                    dVar2 = N2.d.f6436c;
                }
                dVar = new j.d(dVar2, b11.m(), f().v(), args.a().i().h(), args.a().i().v(), false, false, 96, null);
                this.f26610T = dVar;
                this.f26611U = AbstractC3823h.J(cVar.h(), ViewModelKt.getViewModelScope(this), InterfaceC3808G.a.b(InterfaceC3808G.f37362a, 0L, 0L, 3, null), null);
                this.f26612V = A4.g.m(m8, i.f26640a);
                this.f26613W = A4.g.f(linkHandler.g(), linkHandler.e().f(), d(), t(), new v(linkHandler));
                this.f26614X = A4.g.m(a10, new u());
                this.f26615Y = intentConfirmationHandlerFactory.d(N.h(ViewModelKt.getViewModelScope(this), workContext));
                C3525g.f35925a.c(this, savedStateHandle);
                AbstractC3458i.d(ViewModelKt.getViewModelScope(this), null, null, new a(linkHandler, this, null), 3, null);
                eventReporter.k(f(), args.f() instanceof w.l.a);
                AbstractC3458i.d(ViewModelKt.getViewModelScope(this), workContext, null, new b(null), 2, null);
            }
        }
        dVar = null;
        this.f26610T = dVar;
        this.f26611U = AbstractC3823h.J(cVar.h(), ViewModelKt.getViewModelScope(this), InterfaceC3808G.a.b(InterfaceC3808G.f37362a, 0L, 0L, 3, null), null);
        this.f26612V = A4.g.m(m8, i.f26640a);
        this.f26613W = A4.g.f(linkHandler.g(), linkHandler.e().f(), d(), t(), new v(linkHandler));
        this.f26614X = A4.g.m(a10, new u());
        this.f26615Y = intentConfirmationHandlerFactory.d(N.h(ViewModelKt.getViewModelScope(this), workContext));
        C3525g.f35925a.c(this, savedStateHandle);
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), null, null, new a(linkHandler, this, null), 3, null);
        eventReporter.k(f(), args.f() instanceof w.l.a);
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), workContext, null, new b(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0(N3.l r10, U5.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.stripe.android.paymentsheet.A.l
            if (r0 == 0) goto L13
            r0 = r11
            com.stripe.android.paymentsheet.A$l r0 = (com.stripe.android.paymentsheet.A.l) r0
            int r1 = r0.f26651e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26651e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.A$l r0 = new com.stripe.android.paymentsheet.A$l
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f26649c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26651e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r10 = r0.f26648b
            N3.l r10 = (N3.l) r10
            java.lang.Object r0 = r0.f26647a
            com.stripe.android.paymentsheet.A r0 = (com.stripe.android.paymentsheet.A) r0
            Q5.t.b(r11)
            goto L70
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            Q5.t.b(r11)
            v3.b r11 = r9.i()
            N3.a r2 = r10.b()
            r11.d(r2)
            D3.f r11 = r10.i()
            r9.M(r11)
            d3.d r11 = r10.h()
            r9.J(r11)
            com.stripe.android.paymentsheet.i r11 = r9.p()
            N3.g r2 = r10.f()
            r11.m(r2)
            com.stripe.android.paymentsheet.f r11 = r9.f26615Y
            r0.f26647a = r9
            r0.f26648b = r10
            r0.f26651e = r3
            java.lang.Object r11 = r11.u(r0)
            if (r11 != r1) goto L6f
            return r1
        L6f:
            r0 = r9
        L70:
            boolean r1 = r11 instanceof com.stripe.android.paymentsheet.p.b
            r2 = 0
            if (r1 == 0) goto L78
            com.stripe.android.paymentsheet.p$b r11 = (com.stripe.android.paymentsheet.p.b) r11
            goto L79
        L78:
            r11 = r2
        L79:
            if (r11 == 0) goto L86
            java.lang.Throwable r11 = r11.a()
            if (r11 == 0) goto L86
            C2.c r11 = t2.AbstractC4004a.a(r11)
            goto L87
        L86:
            r11 = r2
        L87:
            r0.M0(r11)
            E3.b r11 = r0.r()
            d3.d r10 = r10.h()
            v3.b r1 = r0.i()
            java.util.List r10 = r0.k0(r10, r1)
            r11.l(r10)
            n6.M r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            com.stripe.android.paymentsheet.A$m r6 = new com.stripe.android.paymentsheet.A$m
            r6.<init>(r2)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            n6.AbstractC3458i.d(r3, r4, r5, r6, r7, r8)
            Q5.I r10 = Q5.I.f8786a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.A.A0(N3.l, U5.d):java.lang.Object");
    }

    private final void C0() {
        this.f26598H.b((D3.f) y().getValue(), new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D0(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.A.o
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.A$o r0 = (com.stripe.android.paymentsheet.A.o) r0
            int r1 = r0.f26664d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26664d = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.A$o r0 = new com.stripe.android.paymentsheet.A$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26662b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26664d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            Q5.t.b(r7)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f26661a
            com.stripe.android.paymentsheet.A r2 = (com.stripe.android.paymentsheet.A) r2
            Q5.t.b(r7)
            goto L55
        L3d:
            Q5.t.b(r7)
            U5.g r7 = r6.B()
            com.stripe.android.paymentsheet.A$p r2 = new com.stripe.android.paymentsheet.A$p
            r2.<init>(r3)
            r0.f26661a = r6
            r0.f26664d = r5
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r7 = r7.j()
            java.lang.Throwable r5 = Q5.s.e(r7)
            if (r5 != 0) goto L6e
            N3.l r7 = (N3.l) r7
            r0.f26661a = r3
            r0.f26664d = r4
            java.lang.Object r7 = r2.z0(r7, r0)
            if (r7 != r1) goto L71
            return r1
        L6e:
            r2.y0(r5)
        L71:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.A.D0(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D3.h E0(D3.h hVar, c cVar) {
        if (this.f26606P != cVar) {
            return null;
        }
        return hVar;
    }

    private final void F0(Throwable th) {
        this.f26596F.a("Payment Sheet error", th);
        this.f26603M.d(new z.c(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D3.f H0(D3.f fVar) {
        r.b bVar;
        if ((fVar instanceof f.C0023f) && B.c(this)) {
            f.C0023f c0023f = (f.C0023f) fVar;
            com.stripe.android.model.r i8 = c0023f.i();
            if (i8 instanceof r.b) {
                bVar = (r.b) i8;
            } else {
                bVar = null;
            }
            if (bVar == null) {
                bVar = new r.b(null, null, null, 7, null);
            }
            f.C0023f h8 = f.C0023f.h(c0023f, null, null, r.b.f(bVar, (String) ((Q) j().getValue()).j().getValue(), null, null, null, 14, null), 3, null);
            M(h8);
            return h8;
        }
        return fVar;
    }

    private final void I0(p.b bVar) {
        boolean d8;
        com.stripe.android.paymentsheet.m c8 = bVar.c();
        if (AbstractC3292y.d(c8, m.f.f27363a)) {
            x0(new AbstractC4244b.c(bVar.a()), bVar.b());
            return;
        }
        if (AbstractC3292y.d(c8, m.a.f27358a)) {
            x0(AbstractC4244b.a.f41166a, bVar.b());
            return;
        }
        if (c8 instanceof m.c) {
            x0(new AbstractC4244b.C0942b(((m.c) bVar.c()).a()), bVar.b());
            return;
        }
        if (AbstractC3292y.d(c8, m.b.f27359a)) {
            F0(bVar.a());
            return;
        }
        if (AbstractC3292y.d(c8, m.e.f27362a)) {
            d8 = true;
        } else {
            d8 = AbstractC3292y.d(c8, m.d.f27361a);
        }
        if (d8) {
            G(bVar.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(com.stripe.android.paymentsheet.p pVar) {
        if (pVar instanceof p.c) {
            p.c cVar = (p.c) pVar;
            w0(cVar.b(), cVar.a(), false);
        } else if (pVar instanceof p.b) {
            I0((p.b) pVar);
        } else if ((pVar instanceof p.a) || pVar == null) {
            N0(this, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(StripeIntent stripeIntent, AbstractC4079c abstractC4079c) {
        if (abstractC4079c instanceof AbstractC4079c.C0903c) {
            w0(stripeIntent, null, false);
            return;
        }
        if (abstractC4079c instanceof AbstractC4079c.d) {
            AbstractC4079c.d dVar = (AbstractC4079c.d) abstractC4079c;
            x0(new AbstractC4244b.c(dVar.a()), AbstractC4004a.a(dVar.a()));
        } else if (abstractC4079c instanceof AbstractC4079c.a) {
            N0(this, null, 1, null);
        }
    }

    private final void M0(C2.c cVar) {
        h.d dVar;
        q6.w wVar = this.f26605O;
        if (cVar != null) {
            dVar = new h.d(cVar);
        } else {
            dVar = null;
        }
        wVar.setValue(new h.b(dVar));
        x().set("processing", Boolean.FALSE);
    }

    static /* synthetic */ void N0(A a9, C2.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cVar = null;
        }
        a9.M0(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(boolean z8) {
        this.f26600J.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(c cVar) {
        this.f26606P = cVar;
        x().set("processing", Boolean.TRUE);
        this.f26605O.setValue(h.c.f1312b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f0(U5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.stripe.android.paymentsheet.A.f
            if (r0 == 0) goto L13
            r0 = r5
            com.stripe.android.paymentsheet.A$f r0 = (com.stripe.android.paymentsheet.A.f) r0
            int r1 = r0.f26632c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26632c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.A$f r0 = new com.stripe.android.paymentsheet.A$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26630a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26632c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Q5.t.b(r5)
            q6.L r5 = r4.t()
            q6.f r5 = q6.AbstractC3823h.v(r5)
            r0.f26632c = r3
            java.lang.Object r5 = q6.AbstractC3823h.w(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            d3.d r5 = (d3.C2752d) r5
            com.stripe.android.model.StripeIntent r5 = r5.W()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.A.f0(U5.d):java.lang.Object");
    }

    private final void h0(D3.f fVar, c cVar) {
        this.f26606P = cVar;
        j0(fVar);
    }

    private final void j0(D3.f fVar) {
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), B(), null, new h(fVar, null), 2, null);
    }

    private final List k0(C2752d c2752d, C4122b c4122b) {
        Object bVar;
        if (f().w() == w.n.f28014d) {
            return Q3.u.f8728a.a(this, c2752d, c4122b);
        }
        if (!((Collection) c4122b.c().getValue()).isEmpty()) {
            bVar = new c.j(C1363k.f7617r.a(this, c2752d, c4122b, w()), q0());
        } else {
            bVar = new c.b(C1361i.f7563r.a(this, c2752d));
        }
        return AbstractC1435t.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(J3.c cVar) {
        f.C0023f c0023f;
        r.b bVar;
        Object value = y().getValue();
        if (value instanceof f.C0023f) {
            c0023f = (f.C0023f) value;
        } else {
            c0023f = null;
        }
        if (c0023f != null) {
            if (cVar instanceof c.a) {
                bVar = new r.b(((c.a) cVar).a(), null, null, 6, null);
            } else if (AbstractC3292y.d(cVar, c.b.f4093a)) {
                bVar = new r.b("", null, null, 6, null);
            } else {
                throw new Q5.p();
            }
            M(new f.C0023f(c0023f.r(), c0023f.p(), bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(i.a aVar) {
        int i8 = 1;
        I i9 = null;
        byte b9 = 0;
        byte b10 = 0;
        if (AbstractC3292y.d(aVar, i.a.C0610a.f27306a)) {
            N0(this, null, 1, null);
            return;
        }
        if (aVar instanceof i.a.f) {
            M(new f.C0023f(((i.a.f) aVar).a(), f.C0023f.b.f1304c, null, 4, null));
            h0((D3.f) y().getValue(), c.f26622a);
            return;
        }
        if (aVar instanceof i.a.c) {
            G0(((i.a.c) aVar).a());
            return;
        }
        if (AbstractC3292y.d(aVar, i.a.d.f27310a)) {
            P0(c.f26622a);
            return;
        }
        if (aVar instanceof i.a.e) {
            D3.f a9 = ((i.a.e) aVar).a();
            if (a9 != null) {
                M(a9);
                h0((D3.f) y().getValue(), c.f26623b);
                i9 = I.f8786a;
            }
            if (i9 == null) {
                h0((D3.f) y().getValue(), c.f26623b);
                return;
            }
            return;
        }
        if (AbstractC3292y.d(aVar, i.a.g.f27314a)) {
            this.f26606P = c.f26623b;
            this.f26605O.setValue(new h.b(b10 == true ? 1 : 0, i8, b9 == true ? 1 : 0));
        } else if (AbstractC3292y.d(aVar, i.a.h.f27315a)) {
            this.f26606P = c.f26623b;
            this.f26605O.setValue(h.c.f1312b);
        } else if (AbstractC3292y.d(aVar, i.a.b.f27307a)) {
            g0();
        }
    }

    private final void w0(StripeIntent stripeIntent, EnumC4126f enumC4126f, boolean z8) {
        com.stripe.android.model.o oVar;
        D3.f fVar = (D3.f) y().getValue();
        n().u(fVar, enumC4126f);
        if (fVar != null && D3.g.a(fVar)) {
            p().i();
        }
        if (fVar instanceof f.e) {
            com.stripe.android.model.o r8 = stripeIntent.r();
            boolean a9 = P3.d.a((f.e) fVar, this.f26593C.f());
            fVar = null;
            if (a9) {
                oVar = r8;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                fVar = new f.C0023f(oVar, null, null, 6, null);
            }
        }
        if (fVar != null) {
            this.f26595E.a(fVar);
        }
        if (z8) {
            this.f26603M.d(z.b.f28042a);
        } else {
            this.f26605O.setValue(new h.a(new j()));
        }
    }

    private final void x0(AbstractC4244b abstractC4244b, C2.c cVar) {
        n().j((D3.f) y().getValue(), abstractC4244b);
        M0(cVar);
    }

    private final void y0(Throwable th) {
        J(null);
        F0(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z0(N3.l r7, U5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.A.k
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.paymentsheet.A$k r0 = (com.stripe.android.paymentsheet.A.k) r0
            int r1 = r0.f26646e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26646e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.A$k r0 = new com.stripe.android.paymentsheet.A$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26644c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26646e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r8)
            goto L85
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f26643b
            N3.l r7 = (N3.l) r7
            java.lang.Object r2 = r0.f26642a
            com.stripe.android.paymentsheet.A r2 = (com.stripe.android.paymentsheet.A) r2
            Q5.t.b(r8)
            goto L53
        L40:
            Q5.t.b(r8)
            com.stripe.android.paymentsheet.f r8 = r6.f26615Y
            r0.f26642a = r6
            r0.f26643b = r7
            r0.f26646e = r4
            java.lang.Object r8 = r8.u(r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            com.stripe.android.paymentsheet.p r8 = (com.stripe.android.paymentsheet.p) r8
            boolean r5 = r8 instanceof com.stripe.android.paymentsheet.p.c
            if (r5 == 0) goto L67
            com.stripe.android.paymentsheet.p$c r8 = (com.stripe.android.paymentsheet.p.c) r8
            com.stripe.android.model.StripeIntent r7 = r8.b()
            v3.f r8 = r8.a()
            r2.w0(r7, r8, r4)
            goto L74
        L67:
            N3.j r8 = r7.s()
            if (r8 == 0) goto L77
            N3.j r7 = r7.s()
            r2.y0(r7)
        L74:
            Q5.I r7 = Q5.I.f8786a
            return r7
        L77:
            r8 = 0
            r0.f26642a = r8
            r0.f26643b = r8
            r0.f26646e = r3
            java.lang.Object r7 = r2.A0(r7, r0)
            if (r7 != r1) goto L85
            return r1
        L85:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.A.z0(N3.l, U5.d):java.lang.Object");
    }

    @Override // R3.a
    public InterfaceC3813L A() {
        return this.f26613W;
    }

    public final boolean B0() {
        return C.a(this.f26593C.f());
    }

    @Override // R3.a
    public void D(f.e.d paymentSelection) {
        AbstractC3292y.i(paymentSelection, "paymentSelection");
        M(paymentSelection);
        n().l((D3.f) y().getValue());
        g0();
    }

    @Override // R3.a
    public void E(D3.f fVar) {
        if (!AbstractC3292y.d(fVar, y().getValue())) {
            M(fVar);
        }
    }

    @Override // R3.a
    public void G(C2.c cVar) {
        M0(cVar);
    }

    public void G0(AbstractC4079c paymentResult) {
        AbstractC3292y.i(paymentResult, "paymentResult");
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), B(), null, new q(paymentResult, null), 2, null);
    }

    @Override // R3.a
    public void H() {
        n().onDismiss();
        this.f26603M.d(z.a.f28041a);
    }

    @Override // R3.a
    public void I(com.stripe.android.paymentsheet.k kVar) {
        this.f26608R = kVar;
    }

    public final void L0(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        AbstractC3292y.i(lifecycleOwner, "lifecycleOwner");
        p().l(activityResultCaller);
        this.f26615Y.P(activityResultCaller, lifecycleOwner);
        lifecycleOwner.getLifecycle().addObserver(new t());
    }

    @Override // R3.a
    public void b() {
        if (this.f26605O.getValue() instanceof h.b) {
            this.f26605O.setValue(new h.b(null));
        }
    }

    public final void g0() {
        if (B.d(this)) {
            C0();
        } else {
            h0((D3.f) y().getValue(), c.f26623b);
        }
    }

    public final void i0() {
        h0(f.c.f1258a, c.f26622a);
    }

    public final PaymentSheetContractV2.a l0() {
        return this.f26593C;
    }

    @Override // R3.a
    public InterfaceC3813L m() {
        return this.f26612V;
    }

    public final InterfaceC3813L m0() {
        return this.f26607Q;
    }

    public final c n0() {
        return this.f26606P;
    }

    public final InterfaceC3813L o0() {
        return this.f26601K;
    }

    public final InterfaceC4267a p0() {
        return this.f26598H;
    }

    public final c.j.b q0() {
        if (B.a(this)) {
            return new c.j.b.C0033b(j());
        }
        return c.j.b.a.f1687a;
    }

    public final j.d r0() {
        return this.f26610T;
    }

    @Override // R3.a
    public com.stripe.android.paymentsheet.k s() {
        return this.f26608R;
    }

    public final InterfaceC3802A s0() {
        return this.f26604N;
    }

    public final q6.w t0() {
        return this.f26605O;
    }

    @Override // R3.a
    public InterfaceC3813L u() {
        return this.f26611U;
    }

    @Override // R3.a
    public InterfaceC3813L z() {
        return this.f26614X;
    }
}
