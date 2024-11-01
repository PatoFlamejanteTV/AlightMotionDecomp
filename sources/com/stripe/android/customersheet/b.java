package com.stripe.android.customersheet;

import D3.f;
import D3.i;
import D3.j;
import G2.b;
import H2.a;
import O3.AbstractC1355c;
import O3.InterfaceC1366n;
import O3.InterfaceC1371t;
import Q5.s;
import R5.AbstractC1435t;
import U5.g;
import Y2.e;
import android.app.Application;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import c3.C2027g;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.customersheet.CustomerSheetContract;
import com.stripe.android.customersheet.a;
import com.stripe.android.customersheet.c;
import com.stripe.android.customersheet.d;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.paymentsheet.f;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import d3.C2752d;
import d3.InterfaceC2756h;
import g3.EnumC2906e;
import h4.InterfaceC2949a;
import j6.InterfaceC3214c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;
import n6.N;
import n6.U;
import n6.X;
import p2.C3568j;
import p3.i;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import t2.AbstractC4004a;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: B, reason: collision with root package name */
    private static final C2602e f24807B = new C2602e(null);

    /* renamed from: C, reason: collision with root package name */
    public static final int f24808C = 8;

    /* renamed from: A, reason: collision with root package name */
    private List f24809A;

    /* renamed from: a, reason: collision with root package name */
    private f f24810a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f24811b;

    /* renamed from: c, reason: collision with root package name */
    private final U f24812c;

    /* renamed from: d, reason: collision with root package name */
    private final U f24813d;

    /* renamed from: e, reason: collision with root package name */
    private final U f24814e;

    /* renamed from: f, reason: collision with root package name */
    private final F2.c f24815f;

    /* renamed from: g, reason: collision with root package name */
    private final v2.d f24816g;

    /* renamed from: h, reason: collision with root package name */
    private final j3.m f24817h;

    /* renamed from: i, reason: collision with root package name */
    private final G2.b f24818i;

    /* renamed from: j, reason: collision with root package name */
    private final g f24819j;

    /* renamed from: k, reason: collision with root package name */
    private final Function0 f24820k;

    /* renamed from: l, reason: collision with root package name */
    private final F2.d f24821l;

    /* renamed from: m, reason: collision with root package name */
    private final t3.d f24822m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1371t.a f24823n;

    /* renamed from: o, reason: collision with root package name */
    private final i f24824o;

    /* renamed from: p, reason: collision with root package name */
    private final C3568j f24825p;

    /* renamed from: q, reason: collision with root package name */
    private final q6.w f24826q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3813L f24827r;

    /* renamed from: s, reason: collision with root package name */
    private final q6.w f24828s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3813L f24829t;

    /* renamed from: u, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.f f24830u;

    /* renamed from: v, reason: collision with root package name */
    private final q6.w f24831v;

    /* renamed from: w, reason: collision with root package name */
    private final q6.w f24832w;

    /* renamed from: x, reason: collision with root package name */
    private final q6.w f24833x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3813L f24834y;

    /* renamed from: z, reason: collision with root package name */
    private C2027g f24835z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3293z implements Function1 {
        A() {
            super(1);
        }

        public final void a(InterfaceC1366n.a event) {
            AbstractC3292y.i(event, "event");
            if (event instanceof InterfaceC1366n.a.b) {
                b.this.f24818i.g(b.a.f2806b, ((InterfaceC1366n.a.b) event).a());
            } else if (event instanceof InterfaceC1366n.a.C0149a) {
                b.this.f24818i.d(b.a.f2806b, ((InterfaceC1366n.a.C0149a) event).a());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1366n.a) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class B extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24837a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24838b;

        B(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            B b9 = new B(dVar);
            b9.f24838b = obj;
            return b9;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, U5.d dVar) {
            return ((B) create(oVar, dVar)).invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.model.o oVar;
            Object e8 = V5.b.e();
            int i8 = this.f24837a;
            if (i8 != 0) {
                if (i8 == 1) {
                    oVar = (com.stripe.android.model.o) this.f24838b;
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                com.stripe.android.model.o oVar2 = (com.stripe.android.model.o) this.f24838b;
                b bVar = b.this;
                this.f24838b = oVar2;
                this.f24837a = 1;
                Object l02 = bVar.l0(oVar2, this);
                if (l02 == e8) {
                    return e8;
                }
                oVar = oVar2;
                obj = l02;
            }
            H2.a aVar = (H2.a) obj;
            b bVar2 = b.this;
            if (aVar instanceof a.b) {
                bVar2.W();
                bVar2.Q(oVar);
            }
            H2.b.a(aVar);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        int f24840a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24841b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24842c;

        C(U5.d dVar) {
            super(3, dVar);
        }

        @Override // c6.InterfaceC2073o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, EnumC2906e enumC2906e, U5.d dVar) {
            C c8 = new C(dVar);
            c8.f24841b = oVar;
            c8.f24842c = enumC2906e;
            return c8.invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            Object e8 = V5.b.e();
            int i8 = this.f24840a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f24841b;
                EnumC2906e enumC2906e = (EnumC2906e) this.f24842c;
                b bVar = b.this;
                this.f24841b = null;
                this.f24840a = 1;
                obj = bVar.T(oVar, enumC2906e, this);
                if (obj == e8) {
                    return e8;
                }
            }
            H2.a aVar = (H2.a) obj;
            if (aVar instanceof a.b) {
                s.a aVar2 = Q5.s.f8810b;
                b9 = Q5.s.b(((a.b) aVar).a());
            } else if (aVar instanceof a.C0062a) {
                s.a aVar3 = Q5.s.f8810b;
                b9 = Q5.s.b(Q5.t.a(((a.C0062a) aVar).a()));
            } else {
                throw new Q5.p();
            }
            return Q5.s.a(b9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class D extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final D f24844a = new D();

        D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2605h invoke(C2605h state) {
            AbstractC3292y.i(state, "state");
            return C2605h.b(state, true, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24845a;

        /* renamed from: b, reason: collision with root package name */
        Object f24846b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24847c;

        /* renamed from: e, reason: collision with root package name */
        int f24849e;

        E(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24847c = obj;
            this.f24849e |= Integer.MIN_VALUE;
            return b.this.l0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24850a;

        F(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new F(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f24850a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        H2.a aVar = (H2.a) obj;
                        b bVar = b.this;
                        if (aVar instanceof a.b) {
                            bVar.H(f.c.f1258a, "google_pay");
                        }
                        H2.b.a(aVar);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                b bVar2 = b.this;
                this.f24850a = 1;
                obj = bVar2.F(this);
                if (obj == e8) {
                    return e8;
                }
            }
            android.support.v4.media.a.a(obj);
            i.a aVar2 = i.a.f1314a;
            this.f24850a = 2;
            throw null;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((F) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class G extends AbstractC3293z implements InterfaceC2073o {
        G() {
            super(3);
        }

        public final c.d a(C2603f customerState, C2605h selectionConfirmationState, boolean z8) {
            boolean z9;
            boolean z10;
            boolean z11;
            C2.c cVar;
            C2.c b9;
            AbstractC3292y.i(customerState, "customerState");
            AbstractC3292y.i(selectionConfirmationState, "selectionConfirmationState");
            List i8 = customerState.i();
            C2752d h8 = customerState.h();
            f g8 = customerState.g();
            if (z8 && customerState.c()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 && !AbstractC3292y.d(b.this.f24810a, g8)) {
                z10 = true;
            } else {
                z10 = false;
            }
            String l8 = b.this.f24815f.l();
            boolean booleanValue = ((Boolean) b.this.f24820k.invoke()).booleanValue();
            boolean d8 = customerState.d();
            if (h8 != null && h8.a0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean d9 = selectionConfirmationState.d();
            String c8 = selectionConfirmationState.c();
            boolean z12 = customerState.f() instanceof InterfaceC2949a.b;
            boolean c9 = customerState.c();
            if (g8 != null && (b9 = g8.b(b.this.f24815f.p(), false)) != null && z10) {
                cVar = b9;
            } else {
                cVar = null;
            }
            return new c.d(l8, i8, g8, booleanValue, d9, z9, z11, z10, c9, d8, c8, cVar, z12);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C2603f) obj, (C2605h) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24853a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.C0023f f24855c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(f.C0023f c0023f, U5.d dVar) {
            super(2, dVar);
            this.f24855c = c0023f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new H(this.f24855c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.model.o r8;
            o.p pVar;
            Object e8 = V5.b.e();
            int i8 = this.f24853a;
            String str = null;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        H2.a aVar = (H2.a) obj;
                        b bVar = b.this;
                        f.C0023f c0023f = this.f24855c;
                        if (aVar instanceof a.b) {
                            if (c0023f != null && (r8 = c0023f.r()) != null && (pVar = r8.f25635e) != null) {
                                str = pVar.f25773a;
                            }
                            bVar.H(c0023f, str);
                        }
                        H2.b.a(aVar);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                b bVar2 = b.this;
                this.f24853a = 1;
                obj = bVar2.F(this);
                if (obj == e8) {
                    return e8;
                }
            }
            android.support.v4.media.a.a(obj);
            f.C0023f c0023f2 = this.f24855c;
            if (c0023f2 != null) {
                j.a(c0023f2);
            }
            this.f24853a = 2;
            throw null;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class I extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final I f24856a = new I();

        I() {
            super(1);
        }

        public final void a(e it) {
            AbstractC3292y.i(it, "it");
            throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class J extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24857a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f24859c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f24860a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f24861b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, f fVar) {
                super(1);
                this.f24860a = list;
                this.f24861b = fVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2603f invoke(C2603f state) {
                AbstractC3292y.i(state, "state");
                return C2603f.b(state, this.f24860a, this.f24861b, null, null, null, 28, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(com.stripe.android.model.o oVar, U5.d dVar) {
            super(2, dVar);
            this.f24859c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new J(this.f24859c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f24857a == 0) {
                Q5.t.b(obj);
                C2603f c2603f = (C2603f) b.this.f24833x.getValue();
                List<com.stripe.android.model.o> i8 = c2603f.i();
                com.stripe.android.model.o oVar = this.f24859c;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(i8, 10));
                for (com.stripe.android.model.o oVar2 : i8) {
                    String str = oVar2.f25631a;
                    String str2 = oVar.f25631a;
                    if (str2 != null && str != null && AbstractC3292y.d(str2, str)) {
                        oVar2 = oVar;
                    }
                    arrayList.add(oVar2);
                }
                f fVar = b.this.f24810a;
                f g8 = c2603f.g();
                b bVar = b.this;
                boolean z8 = g8 instanceof f.C0023f;
                if (z8 && (fVar instanceof f.C0023f) && AbstractC3292y.d(((f.C0023f) g8).r().f25631a, this.f24859c.f25631a)) {
                    fVar = f.C0023f.h((f.C0023f) fVar, this.f24859c, null, null, 6, null);
                }
                bVar.f24810a = fVar;
                if (z8) {
                    f.C0023f c0023f = (f.C0023f) g8;
                    if (AbstractC3292y.d(c0023f.r().f25631a, this.f24859c.f25631a)) {
                        g8 = f.C0023f.h(c0023f, this.f24859c, null, null, 6, null);
                    }
                }
                b.this.p0(new a(arrayList, g8));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((J) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class K extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final K f24862a = new K();

        K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(List it) {
            AbstractC3292y.i(it, "it");
            return (c) AbstractC1435t.y0(it);
        }
    }

    /* renamed from: com.stripe.android.customersheet.b$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    static final class C2599a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24863a;

        C2599a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C2599a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f24863a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                b bVar = b.this;
                this.f24863a = 1;
                if (bVar.S(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C2599a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.stripe.android.customersheet.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0460b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24865a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.customersheet.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f24867a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f24868b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f24869c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f24869c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                a aVar = new a(this.f24869c, dVar);
                aVar.f24868b = obj;
                return aVar;
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(c.d dVar, U5.d dVar2) {
                return ((a) create(dVar, dVar2)).invokeSuspend(Q5.I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                ArrayList arrayList;
                V5.b.e();
                if (this.f24867a == 0) {
                    Q5.t.b(obj);
                    c.d dVar = (c.d) this.f24868b;
                    q6.w wVar = this.f24869c.f24826q;
                    do {
                        value = wVar.getValue();
                        List<c> list = (List) value;
                        arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                        for (c cVar : list) {
                            if (cVar instanceof c.d) {
                                cVar = dVar;
                            }
                            arrayList.add(cVar);
                        }
                    } while (!wVar.a(value, arrayList));
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C0460b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0460b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f24865a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = b.this.f24834y;
                a aVar = new a(b.this, null);
                this.f24865a = 1;
                if (AbstractC3823h.j(interfaceC3813L, aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0460b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.stripe.android.customersheet.b$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    static final class C2600c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24870a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.customersheet.b$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f24872a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f24873b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f24874c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f24874c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                a aVar = new a(this.f24874c, dVar);
                aVar.f24873b = obj;
                return aVar;
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C2603f c2603f, U5.d dVar) {
                return ((a) create(c2603f, dVar)).invokeSuspend(Q5.I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f24872a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    if (!((C2603f) this.f24873b).e() && (this.f24874c.O().getValue() instanceof c.d)) {
                        this.f24872a = 1;
                        if (X.b(50L, this) == e8) {
                            return e8;
                        }
                    }
                    return Q5.I.f8786a;
                }
                this.f24874c.t0(true);
                this.f24874c.f24832w.setValue(new C2605h(false, null));
                return Q5.I.f8786a;
            }
        }

        C2600c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C2600c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f24870a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                q6.w wVar = b.this.f24833x;
                a aVar = new a(b.this, null);
                this.f24870a = 1;
                if (AbstractC3823h.j(wVar, aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C2600c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.stripe.android.customersheet.b$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    static final class C2601d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24875a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.customersheet.b$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f24877a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f24878b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f24879c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f24879c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                a aVar = new a(this.f24879c, dVar);
                aVar.f24878b = obj;
                return aVar;
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C2603f c2603f, U5.d dVar) {
                return ((a) create(c2603f, dVar)).invokeSuspend(Q5.I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f24877a == 0) {
                    Q5.t.b(obj);
                    if (!((C2603f) this.f24878b).c() && ((Boolean) this.f24879c.f24831v.getValue()).booleanValue()) {
                        this.f24879c.f24831v.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C2601d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C2601d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f24875a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                q6.w wVar = b.this.f24833x;
                a aVar = new a(b.this, null);
                this.f24875a = 1;
                if (AbstractC3823h.j(wVar, aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C2601d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.stripe.android.customersheet.b$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    private static final class C2602e {
        private C2602e() {
        }

        public /* synthetic */ C2602e(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.stripe.android.customersheet.b$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2603f {

        /* renamed from: a, reason: collision with root package name */
        private final List f24880a;

        /* renamed from: b, reason: collision with root package name */
        private final f f24881b;

        /* renamed from: c, reason: collision with root package name */
        private final C2752d f24882c;

        /* renamed from: d, reason: collision with root package name */
        private final F2.b f24883d;

        /* renamed from: e, reason: collision with root package name */
        private final F2.c f24884e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f24885f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC2949a f24886g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f24887h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f24888i;

        /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C2603f(java.util.List r3, D3.f r4, d3.C2752d r5, F2.b r6, F2.c r7) {
            /*
                r2 = this;
                java.lang.String r0 = "paymentMethods"
                kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                java.lang.String r0 = "permissions"
                kotlin.jvm.internal.AbstractC3292y.i(r6, r0)
                java.lang.String r0 = "configuration"
                kotlin.jvm.internal.AbstractC3292y.i(r7, r0)
                r2.<init>()
                r2.f24880a = r3
                r2.f24881b = r4
                r2.f24882c = r5
                r2.f24883d = r6
                r2.f24884e = r7
                int r4 = r3.size()
                r0 = 0
                r1 = 1
                if (r4 == 0) goto L39
                if (r4 == r1) goto L2b
                boolean r4 = r6.a()
                goto L3a
            L2b:
                boolean r4 = r7.a()
                if (r4 == 0) goto L39
                boolean r4 = r6.a()
                if (r4 == 0) goto L39
                r4 = 1
                goto L3a
            L39:
                r4 = 0
            L3a:
                r2.f24885f = r4
                if (r5 == 0) goto L44
                h4.a r5 = r5.w()
                if (r5 != 0) goto L46
            L44:
                h4.a$c r5 = h4.InterfaceC2949a.c.f32646a
            L46:
                r2.f24886g = r5
                if (r4 != 0) goto L75
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                boolean r4 = r3 instanceof java.util.Collection
                if (r4 == 0) goto L5a
                r4 = r3
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L5a
                goto L73
            L5a:
                java.util.Iterator r3 = r3.iterator()
            L5e:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L73
                java.lang.Object r4 = r3.next()
                com.stripe.android.model.o r4 = (com.stripe.android.model.o) r4
                h4.a r5 = r2.f24886g
                boolean r4 = F2.h.a(r4, r5)
                if (r4 == 0) goto L5e
                goto L75
            L73:
                r3 = 0
                goto L76
            L75:
                r3 = 1
            L76:
                r2.f24887h = r3
                java.util.List r3 = r2.f24880a
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                r3 = r3 ^ r1
                if (r3 != 0) goto L8d
                d3.d r3 = r2.f24882c
                if (r3 == 0) goto L8e
                boolean r3 = r3.a0()
                if (r3 != r1) goto L8e
            L8d:
                r0 = 1
            L8e:
                r2.f24888i = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.b.C2603f.<init>(java.util.List, D3.f, d3.d, F2.b, F2.c):void");
        }

        public static /* synthetic */ C2603f b(C2603f c2603f, List list, f fVar, C2752d c2752d, F2.b bVar, F2.c cVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                list = c2603f.f24880a;
            }
            if ((i8 & 2) != 0) {
                fVar = c2603f.f24881b;
            }
            f fVar2 = fVar;
            if ((i8 & 4) != 0) {
                c2752d = c2603f.f24882c;
            }
            C2752d c2752d2 = c2752d;
            if ((i8 & 8) != 0) {
                bVar = c2603f.f24883d;
            }
            F2.b bVar2 = bVar;
            if ((i8 & 16) != 0) {
                cVar = c2603f.f24884e;
            }
            return c2603f.a(list, fVar2, c2752d2, bVar2, cVar);
        }

        public final C2603f a(List paymentMethods, f fVar, C2752d c2752d, F2.b permissions, F2.c configuration) {
            AbstractC3292y.i(paymentMethods, "paymentMethods");
            AbstractC3292y.i(permissions, "permissions");
            AbstractC3292y.i(configuration, "configuration");
            return new C2603f(paymentMethods, fVar, c2752d, permissions, configuration);
        }

        public final boolean c() {
            return this.f24887h;
        }

        public final boolean d() {
            return this.f24885f;
        }

        public final boolean e() {
            return this.f24888i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2603f)) {
                return false;
            }
            C2603f c2603f = (C2603f) obj;
            return AbstractC3292y.d(this.f24880a, c2603f.f24880a) && AbstractC3292y.d(this.f24881b, c2603f.f24881b) && AbstractC3292y.d(this.f24882c, c2603f.f24882c) && AbstractC3292y.d(this.f24883d, c2603f.f24883d) && AbstractC3292y.d(this.f24884e, c2603f.f24884e);
        }

        public final InterfaceC2949a f() {
            return this.f24886g;
        }

        public final f g() {
            return this.f24881b;
        }

        public final C2752d h() {
            return this.f24882c;
        }

        public int hashCode() {
            int hashCode = this.f24880a.hashCode() * 31;
            f fVar = this.f24881b;
            int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
            C2752d c2752d = this.f24882c;
            return ((((hashCode2 + (c2752d != null ? c2752d.hashCode() : 0)) * 31) + this.f24883d.hashCode()) * 31) + this.f24884e.hashCode();
        }

        public final List i() {
            return this.f24880a;
        }

        public String toString() {
            return "CustomerState(paymentMethods=" + this.f24880a + ", currentSelection=" + this.f24881b + ", metadata=" + this.f24882c + ", permissions=" + this.f24883d + ", configuration=" + this.f24884e + ")";
        }
    }

    /* renamed from: com.stripe.android.customersheet.b$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2604g implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final CustomerSheetContract.a f24889a;

        public C2604g(CustomerSheetContract.a args) {
            AbstractC3292y.i(args, "args");
            this.f24889a = args;
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
            b a9 = I2.x.a().b(E2.b.a(extras)).d(this.f24889a.a()).c(this.f24889a.b()).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3292y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.customersheet.CustomerSheetViewModel.Factory.create");
            return a9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.stripe.android.customersheet.b$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2605h {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f24890a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24891b;

        public C2605h(boolean z8, String str) {
            this.f24890a = z8;
            this.f24891b = str;
        }

        public static /* synthetic */ C2605h b(C2605h c2605h, boolean z8, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = c2605h.f24890a;
            }
            if ((i8 & 2) != 0) {
                str = c2605h.f24891b;
            }
            return c2605h.a(z8, str);
        }

        public final C2605h a(boolean z8, String str) {
            return new C2605h(z8, str);
        }

        public final String c() {
            return this.f24891b;
        }

        public final boolean d() {
            return this.f24890a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2605h)) {
                return false;
            }
            C2605h c2605h = (C2605h) obj;
            return this.f24890a == c2605h.f24890a && AbstractC3292y.d(this.f24891b, c2605h.f24891b);
        }

        public int hashCode() {
            int a9 = androidx.compose.foundation.a.a(this.f24890a) * 31;
            String str = this.f24891b;
            return a9 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SelectionConfirmationState(isConfirming=" + this.f24890a + ", error=" + this.f24891b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.customersheet.b$i, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2606i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24892a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f24894c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2606i(com.stripe.android.model.o oVar, U5.d dVar) {
            super(2, dVar);
            this.f24894c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C2606i(this.f24894c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f24892a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        Q5.t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                b bVar = b.this;
                this.f24892a = 1;
                obj = bVar.D(this);
                if (obj == e8) {
                    return e8;
                }
            }
            android.support.v4.media.a.a(obj);
            throw null;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C2606i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.customersheet.b$j, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2607j extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24895a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2607j(String str) {
            super(1);
            this.f24895a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2605h invoke(C2605h state) {
            AbstractC3292y.i(state, "state");
            return state.a(false, this.f24895a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.customersheet.b$k, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2608k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24896a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.p f24898c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2608k(com.stripe.android.model.p pVar, U5.d dVar) {
            super(2, dVar);
            this.f24898c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C2608k(this.f24898c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            ArrayList arrayList;
            boolean z8;
            Object e8 = V5.b.e();
            int i8 = this.f24896a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    obj2 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                b bVar = b.this;
                com.stripe.android.model.p pVar = this.f24898c;
                this.f24896a = 1;
                Object L8 = bVar.L(pVar, this);
                if (L8 == e8) {
                    return e8;
                }
                obj2 = L8;
            }
            b bVar2 = b.this;
            if (Q5.s.h(obj2)) {
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) obj2;
                if (!K2.e.a(oVar)) {
                    bVar2.C(oVar);
                } else {
                    bVar2.f24828s.d(new d.C0463d(new f.C0023f(oVar, null, null, 6, null)));
                }
            }
            b bVar3 = b.this;
            com.stripe.android.model.p pVar2 = this.f24898c;
            Throwable e9 = Q5.s.e(obj2);
            if (e9 != null) {
                bVar3.f24816g.a("Failed to create payment method for " + pVar2.u(), e9);
                q6.w wVar = bVar3.f24826q;
                do {
                    value = wVar.getValue();
                    List<Object> list = (List) value;
                    arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                    for (Object obj3 : list) {
                        if (obj3 instanceof c.a) {
                            c.a aVar = (c.a) obj3;
                            C2.c a9 = AbstractC4004a.a(e9);
                            if (aVar.o() != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            obj3 = c.a.f(aVar, null, null, null, null, null, null, null, false, false, false, a9, false, null, z8, null, null, false, false, null, null, 1038847, null);
                        }
                        arrayList.add(obj3);
                    }
                } while (!wVar.a(value, arrayList));
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C2608k) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements InterfaceC2072n {
        l() {
            super(2);
        }

        public final void a(C2.c cVar, boolean z8) {
            b.this.R(new a.q(cVar, z8));
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C2.c) obj, ((Boolean) obj2).booleanValue());
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3293z implements Function1 {
        m() {
            super(1);
        }

        public final void a(f.e.d it) {
            AbstractC3292y.i(it, "it");
            b.this.R(new a.g(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f.e.d) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements Function1 {
        n() {
            super(1);
        }

        public final void a(com.stripe.android.payments.bankaccount.navigation.d it) {
            AbstractC3292y.i(it, "it");
            b.this.R(new a.f(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.payments.bankaccount.navigation.d) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3293z implements Function1 {
        o() {
            super(1);
        }

        public final void a(Function1 it) {
            AbstractC3292y.i(it, "it");
            b.this.R(new a.p(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Function1) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final p f24903a = new p();

        p() {
            super(1);
        }

        public final void a(PrimaryButton.a it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PrimaryButton.a) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3293z implements Function1 {
        q() {
            super(1);
        }

        public final void a(C2.c cVar) {
            b.this.R(new a.j(cVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2.c) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24905a;

        /* renamed from: c, reason: collision with root package name */
        int f24907c;

        r(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24905a = obj;
            this.f24907c |= Integer.MIN_VALUE;
            Object L8 = b.this.L(null, this);
            return L8 == V5.b.e() ? L8 : Q5.s.a(L8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str) {
            super(1);
            this.f24908a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2605h invoke(C2605h state) {
            AbstractC3292y.i(state, "state");
            return state.a(false, this.f24908a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24909a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f24911c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(com.stripe.android.model.o oVar, U5.d dVar) {
            super(2, dVar);
            this.f24911c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new t(this.f24911c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f24909a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                this.f24909a = 1;
                if (X.b(600L, this) == e8) {
                    return e8;
                }
            }
            b.this.m0(this.f24911c);
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24912a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24913b;

        /* renamed from: d, reason: collision with root package name */
        int f24915d;

        u(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24913b = obj;
            this.f24915d |= Integer.MIN_VALUE;
            return b.this.S(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24916a;

        v(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new v(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a9;
            Object e8 = V5.b.e();
            int i8 = this.f24916a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    a9 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                F2.d dVar = b.this.f24821l;
                F2.c cVar = b.this.f24815f;
                this.f24916a = 1;
                a9 = dVar.a(cVar, this);
                if (a9 == e8) {
                    return e8;
                }
            }
            return Q5.s.a(a9);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((v) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24918a;

        /* renamed from: b, reason: collision with root package name */
        Object f24919b;

        /* renamed from: c, reason: collision with root package name */
        Object f24920c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f24921d;

        /* renamed from: f, reason: collision with root package name */
        int f24923f;

        w(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24921d = obj;
            this.f24923f |= Integer.MIN_VALUE;
            return b.this.T(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final x f24924a = new x();

        x() {
            super(1);
        }

        public final void a(e it) {
            AbstractC3292y.i(it, "it");
            throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24925a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f24927c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(com.stripe.android.model.o oVar, U5.d dVar) {
            super(2, dVar);
            this.f24927c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new y(this.f24927c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f24925a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                b bVar = b.this;
                com.stripe.android.model.o oVar = this.f24927c;
                this.f24925a = 1;
                obj = bVar.l0(oVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            H2.a aVar = (H2.a) obj;
            b bVar2 = b.this;
            if (aVar instanceof a.C0062a) {
                a.C0062a c0062a = (a.C0062a) aVar;
                c0062a.a();
                bVar2.P(c0062a.b());
            } else if (aVar instanceof a.b) {
                bVar2.m0((com.stripe.android.model.o) ((a.b) aVar).a());
            } else {
                throw new Q5.p();
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((y) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class z extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(f fVar) {
            super(1);
            this.f24928a = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2603f invoke(C2603f state) {
            AbstractC3292y.i(state, "state");
            return C2603f.b(state, null, this.f24928a, null, null, null, 29, null);
        }
    }

    public b(Application application, f fVar, N5.a paymentConfigurationProvider, U paymentMethodDataSourceProvider, U intentDataSourceProvider, U savedSelectionDataSourceProvider, F2.c configuration, v2.d logger, j3.m stripeRepository, G2.b eventReporter, g workContext, Function0 isLiveModeProvider, f.d intentConfirmationHandlerFactory, F2.d customerSheetLoader, t3.d isFinancialConnectionsAvailable, InterfaceC1371t.a editInteractorFactory, p3.i errorReporter) {
        AbstractC3292y.i(application, "application");
        AbstractC3292y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
        AbstractC3292y.i(paymentMethodDataSourceProvider, "paymentMethodDataSourceProvider");
        AbstractC3292y.i(intentDataSourceProvider, "intentDataSourceProvider");
        AbstractC3292y.i(savedSelectionDataSourceProvider, "savedSelectionDataSourceProvider");
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(eventReporter, "eventReporter");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3292y.i(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        AbstractC3292y.i(customerSheetLoader, "customerSheetLoader");
        AbstractC3292y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3292y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f24810a = fVar;
        this.f24811b = paymentConfigurationProvider;
        this.f24812c = paymentMethodDataSourceProvider;
        this.f24813d = intentDataSourceProvider;
        this.f24814e = savedSelectionDataSourceProvider;
        this.f24815f = configuration;
        this.f24816g = logger;
        this.f24817h = stripeRepository;
        this.f24818i = eventReporter;
        this.f24819j = workContext;
        this.f24820k = isLiveModeProvider;
        this.f24821l = customerSheetLoader;
        this.f24822m = isFinancialConnectionsAvailable;
        this.f24823n = editInteractorFactory;
        this.f24824o = errorReporter;
        this.f24825p = new C3568j(application);
        q6.w a9 = AbstractC3815N.a(AbstractC1435t.e(new c.C0461c(((Boolean) isLiveModeProvider.invoke()).booleanValue())));
        this.f24826q = a9;
        InterfaceC3813L m8 = A4.g.m(a9, K.f24862a);
        this.f24827r = m8;
        q6.w a10 = AbstractC3815N.a(null);
        this.f24828s = a10;
        this.f24829t = a10;
        this.f24830u = intentConfirmationHandlerFactory.d(N.h(ViewModelKt.getViewModelScope(this), workContext));
        q6.w a11 = AbstractC3815N.a(Boolean.FALSE);
        this.f24831v = a11;
        q6.w a12 = AbstractC3815N.a(new C2605h(false, null));
        this.f24832w = a12;
        q6.w a13 = AbstractC3815N.a(new C2603f(AbstractC1435t.m(), this.f24810a, null, new F2.b(false), configuration));
        this.f24833x = a13;
        this.f24834y = A4.g.e(a13, a12, a11, new G());
        this.f24809A = new ArrayList();
        com.stripe.android.paymentsheet.x.a(configuration.b());
        eventReporter.f(configuration);
        if (m8.getValue() instanceof c.C0461c) {
            AbstractC3462k.d(ViewModelKt.getViewModelScope(this), workContext, null, new C2599a(null), 2, null);
        }
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new C0460b(null), 3, null);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new C2600c(null), 3, null);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new C2601d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(com.stripe.android.model.o oVar) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), this.f24819j, null, new C2606i(oVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(U5.d dVar) {
        return this.f24813d.h(dVar);
    }

    private final Object E(U5.d dVar) {
        return this.f24812c.h(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(U5.d dVar) {
        return this.f24814e.h(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(D3.f fVar, String str) {
        if (str != null) {
            this.f24818i.k(str);
        }
        this.f24828s.d(new d.C0463d(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(D3.f fVar, String str, Throwable th, String str2) {
        if (str != null) {
            this.f24818i.h(str);
        }
        this.f24816g.a("Failed to persist payment selection: " + fVar, th);
        q0(new C2607j(str2));
    }

    private final void J(com.stripe.android.model.p pVar) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), this.f24819j, null, new C2608k(pVar, null), 2, null);
    }

    private final G3.d K(StripeIntent stripeIntent) {
        String str;
        String str2 = null;
        if (stripeIntent != null) {
            str = stripeIntent.getId();
        } else {
            str = null;
        }
        if (stripeIntent != null) {
            str2 = stripeIntent.d();
        }
        return new G3.d(false, null, false, false, false, str, str2, "customer_sheet", null, null, new l(), new m(), new n(), new o(), p.f24903a, new q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(com.stripe.android.model.p r11, U5.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.stripe.android.customersheet.b.r
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.customersheet.b$r r0 = (com.stripe.android.customersheet.b.r) r0
            int r1 = r0.f24907c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24907c = r1
            goto L18
        L13:
            com.stripe.android.customersheet.b$r r0 = new com.stripe.android.customersheet.b$r
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f24905a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f24907c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r12)
            Q5.s r12 = (Q5.s) r12
            java.lang.Object r11 = r12.j()
            goto L66
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            Q5.t.b(r12)
            j3.m r12 = r10.f24817h
            B2.j$c r2 = new B2.j$c
            N5.a r4 = r10.f24811b
            java.lang.Object r4 = r4.get()
            n2.r r4 = (n2.r) r4
            java.lang.String r5 = r4.f()
            N5.a r4 = r10.f24811b
            java.lang.Object r4 = r4.get()
            n2.r r4 = (n2.r) r4
            java.lang.String r6 = r4.h()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f24907c = r3
            java.lang.Object r11 = r12.w(r11, r2, r0)
            if (r11 != r1) goto L66
            return r1
        L66:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.b.L(com.stripe.android.model.p, U5.d):java.lang.Object");
    }

    private final b.EnumC0047b M(c cVar) {
        if (cVar instanceof c.a) {
            return b.EnumC0047b.f2809b;
        }
        if (cVar instanceof c.d) {
            return b.EnumC0047b.f2810c;
        }
        if (cVar instanceof c.b) {
            return b.EnumC0047b.f2811d;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(String str) {
        q0(new s(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(com.stripe.android.model.o oVar) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), this.f24819j, null, new t(oVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.stripe.android.customersheet.b.u
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.customersheet.b$u r0 = (com.stripe.android.customersheet.b.u) r0
            int r1 = r0.f24915d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24915d = r1
            goto L18
        L13:
            com.stripe.android.customersheet.b$u r0 = new com.stripe.android.customersheet.b$u
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f24913b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f24915d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f24912a
            com.stripe.android.customersheet.b r0 = (com.stripe.android.customersheet.b) r0
            Q5.t.b(r9)
            goto L4c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            Q5.t.b(r9)
            U5.g r9 = r8.f24819j
            com.stripe.android.customersheet.b$v r2 = new com.stripe.android.customersheet.b$v
            r4 = 0
            r2.<init>(r4)
            r0.f24912a = r8
            r0.f24915d = r3
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r2, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            r0 = r8
        L4c:
            Q5.s r9 = (Q5.s) r9
            java.lang.Object r9 = r9.j()
            java.lang.Throwable r1 = Q5.s.e(r9)
            if (r1 != 0) goto Lb0
            F2.f r9 = (F2.f) r9
            java.lang.Throwable r1 = r9.f()
            if (r1 == 0) goto L79
            q6.w r1 = r0.f24828s
        L62:
            java.lang.Object r0 = r1.getValue()
            r2 = r0
            com.stripe.android.customersheet.d r2 = (com.stripe.android.customersheet.d) r2
            com.stripe.android.customersheet.d$c r2 = new com.stripe.android.customersheet.d$c
            java.lang.Throwable r3 = r9.f()
            r2.<init>(r3)
            boolean r0 = r1.a(r0, r2)
            if (r0 == 0) goto L62
            goto Lc4
        L79:
            java.util.List r1 = r0.f24809A
            r1.clear()
            java.util.List r1 = r0.f24809A
            java.util.List r2 = r9.e()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            D3.f r1 = r9.d()
            r0.f24810a = r1
            q6.w r1 = r0.f24833x
            java.util.List r3 = r9.a()
            F2.c r7 = r0.f24815f
            D3.f r4 = r9.d()
            d3.d r5 = r9.c()
            F2.b r6 = r9.b()
            com.stripe.android.customersheet.b$f r9 = new com.stripe.android.customersheet.b$f
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r1.setValue(r9)
            r0.u0()
            goto Lc4
        Lb0:
            q6.w r9 = r0.f24828s
        Lb2:
            java.lang.Object r0 = r9.getValue()
            r2 = r0
            com.stripe.android.customersheet.d r2 = (com.stripe.android.customersheet.d) r2
            com.stripe.android.customersheet.d$c r2 = new com.stripe.android.customersheet.d$c
            r2.<init>(r1)
            boolean r0 = r9.a(r0, r2)
            if (r0 == 0) goto Lb2
        Lc4:
            Q5.I r9 = Q5.I.f8786a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.b.S(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T(com.stripe.android.model.o r19, g3.EnumC2906e r20, U5.d r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof com.stripe.android.customersheet.b.w
            if (r2 == 0) goto L17
            r2 = r1
            com.stripe.android.customersheet.b$w r2 = (com.stripe.android.customersheet.b.w) r2
            int r3 = r2.f24923f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f24923f = r3
            goto L1c
        L17:
            com.stripe.android.customersheet.b$w r2 = new com.stripe.android.customersheet.b$w
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f24921d
            java.lang.Object r3 = V5.b.e()
            int r4 = r2.f24923f
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L74
            if (r4 == r6) goto L5e
            if (r4 != r5) goto L56
            java.lang.Object r3 = r2.f24919b
            g3.e r3 = (g3.EnumC2906e) r3
            java.lang.Object r2 = r2.f24918a
            com.stripe.android.customersheet.b r2 = (com.stripe.android.customersheet.b) r2
            Q5.t.b(r1)
            H2.a r1 = (H2.a) r1
            boolean r4 = r1 instanceof H2.a.b
            if (r4 == 0) goto L52
            r4 = r1
            H2.a$b r4 = (H2.a.b) r4
            java.lang.Object r4 = r4.a()
            com.stripe.android.model.o r4 = (com.stripe.android.model.o) r4
            r2.W()
            r2.x0(r4)
            G2.b r2 = r2.f24818i
            r2.c(r3)
        L52:
            H2.b.a(r1)
            return r1
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L5e:
            java.lang.Object r3 = r2.f24920c
            g3.e r3 = (g3.EnumC2906e) r3
            java.lang.Object r4 = r2.f24919b
            com.stripe.android.model.o r4 = (com.stripe.android.model.o) r4
            java.lang.Object r6 = r2.f24918a
            com.stripe.android.customersheet.b r6 = (com.stripe.android.customersheet.b) r6
            Q5.t.b(r1)
            r17 = r6
            r6 = r1
            r1 = r4
            r4 = r17
            goto L8c
        L74:
            Q5.t.b(r1)
            r2.f24918a = r0
            r1 = r19
            r2.f24919b = r1
            r4 = r20
            r2.f24920c = r4
            r2.f24923f = r6
            java.lang.Object r6 = r0.E(r2)
            if (r6 != r3) goto L8a
            return r3
        L8a:
            r3 = r4
            r4 = r0
        L8c:
            android.support.v4.media.a.a(r6)
            java.lang.String r1 = r1.f25631a
            kotlin.jvm.internal.AbstractC3292y.f(r1)
            com.stripe.android.model.t$b r8 = com.stripe.android.model.t.f25899b
            com.stripe.android.model.t$a$c r11 = new com.stripe.android.model.t$a$c
            java.lang.String r1 = r3.f()
            r11.<init>(r1)
            java.lang.String r1 = "CustomerSheet"
            java.util.Set r14 = R5.a0.d(r1)
            r15 = 27
            r16 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            com.stripe.android.model.t.b.b(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.f24918a = r4
            r2.f24919b = r3
            r2.f24920c = r7
            r2.f24923f = r5
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.b.T(com.stripe.android.model.o, g3.e, U5.d):java.lang.Object");
    }

    private final void U() {
        t0(false);
    }

    private final void V(C2027g c2027g) {
        c.a aVar;
        Object value;
        ArrayList arrayList;
        List m8;
        C2.c a9;
        C2.c cVar;
        boolean z8;
        Object value2 = this.f24827r.getValue();
        if (value2 instanceof c.a) {
            aVar = (c.a) value2;
        } else {
            aVar = null;
        }
        if (aVar != null && AbstractC3292y.d(aVar.q(), c2027g.d())) {
            return;
        }
        C2603f c2603f = (C2603f) this.f24833x.getValue();
        C2752d h8 = c2603f.h();
        this.f24818i.e(c2027g.d());
        this.f24835z = c2027g;
        q6.w wVar = this.f24826q;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof c.a) {
                    c.a aVar2 = (c.a) obj;
                    String d8 = c2027g.d();
                    B3.b bVar = B3.b.f565a;
                    String d9 = c2027g.d();
                    F2.c cVar2 = this.f24815f;
                    F3.a a10 = bVar.a(d9, cVar2, cVar2.p(), c2603f.f());
                    if (h8 == null || (m8 = h8.l(c2027g.d(), new InterfaceC2756h.a.InterfaceC0717a.C0718a(this.f24825p, null, x.f24924a, null, null, 24, null))) == null) {
                        m8 = AbstractC1435t.m();
                    }
                    List list2 = m8;
                    if (AbstractC3292y.d(c2027g.d(), o.p.f25745O.f25773a) && !(aVar2.g() instanceof d.b)) {
                        a9 = C2.d.a(g4.n.f32418o);
                    } else {
                        a9 = C2.d.a(v3.w.f40604a0);
                    }
                    C2.c cVar3 = a9;
                    D3.f j8 = aVar2.j();
                    if (j8 != null) {
                        cVar = j8.b(this.f24815f.p(), true);
                    } else {
                        cVar = null;
                    }
                    if (aVar2.o() != null && !aVar2.b()) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    obj = c.a.f(aVar2, d8, null, null, list2, a10, null, null, false, false, false, null, false, cVar3, z8, null, cVar, false, false, null, null, 1003494, null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.a(value, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        Object value;
        List list;
        if (((List) this.f24826q.getValue()).size() == 1) {
            this.f24828s.d(new d.a(this.f24810a));
            return;
        }
        q6.w wVar = this.f24826q;
        do {
            value = wVar.getValue();
            list = (List) value;
            b.EnumC0047b M8 = M((c) AbstractC1435t.y0(list));
            if (M8 != null) {
                this.f24818i.o(M8);
            }
        } while (!wVar.a(value, AbstractC1435t.g0(list, 1)));
    }

    private final void X() {
        Object value;
        ArrayList arrayList;
        q6.w wVar = this.f24826q;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof c.a) {
                    obj = c.a.f((c.a) obj, null, null, null, null, null, null, null, false, false, false, null, false, null, false, null, null, false, false, null, null, 917503, null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.a(value, arrayList));
    }

    private final void Y() {
        this.f24818i.a();
    }

    private final void Z(com.stripe.android.payments.bankaccount.navigation.d dVar) {
        Object value;
        ArrayList arrayList;
        C2.c a9;
        q6.w wVar = this.f24826q;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof c.a) {
                    c.a aVar = (c.a) obj;
                    if (dVar instanceof d.b) {
                        a9 = C2.d.a(v3.w.f40604a0);
                    } else {
                        a9 = C2.d.a(g4.n.f32418o);
                    }
                    obj = c.a.f(aVar, null, null, null, null, null, null, null, false, false, false, null, false, a9, false, null, null, false, false, dVar, null, 782335, null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.a(value, arrayList));
    }

    private final void a0(f.e.d dVar) {
        J(dVar.h());
    }

    private final void b0() {
        Object value;
        q6.w wVar = this.f24828s;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, new d.a(this.f24810a)));
    }

    private final void c0() {
        if (!((C2603f) this.f24833x.getValue()).c()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.f24831v.getValue()).booleanValue();
        if (booleanValue) {
            this.f24818i.n();
        } else {
            this.f24818i.m();
        }
        this.f24831v.setValue(Boolean.valueOf(!booleanValue));
    }

    private final void d0(C2.c cVar) {
        Object value;
        ArrayList arrayList;
        q6.w wVar = this.f24826q;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof c.a) {
                    obj = c.a.f((c.a) obj, null, null, null, null, null, null, null, false, false, false, cVar, false, null, false, null, null, false, false, null, null, 1047551, null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.a(value, arrayList));
    }

    private final void e0(B3.c cVar) {
        Object obj;
        q6.w wVar;
        C2752d c2752d;
        ArrayList arrayList;
        boolean z8;
        D3.f fVar;
        B3.c cVar2 = cVar;
        C2752d h8 = ((C2603f) this.f24833x.getValue()).h();
        if (h8 != null) {
            q6.w wVar2 = this.f24826q;
            while (true) {
                Object value = wVar2.getValue();
                List<Object> list = (List) value;
                ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(list, 10));
                for (Object obj2 : list) {
                    if (obj2 instanceof c.a) {
                        c.a aVar = (c.a) obj2;
                        if (cVar2 != null && !aVar.b()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (cVar2 != null) {
                            for (C2027g c2027g : aVar.u()) {
                                if (AbstractC3292y.d(c2027g.d(), aVar.q())) {
                                    fVar = AbstractC1355c.g(cVar2, c2027g, h8);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        fVar = null;
                        obj = value;
                        wVar = wVar2;
                        c2752d = h8;
                        obj2 = c.a.f(aVar, null, null, cVar, null, null, null, fVar, false, false, false, null, false, null, z8, null, null, false, false, null, null, 1040315, null);
                        arrayList = arrayList2;
                    } else {
                        obj = value;
                        wVar = wVar2;
                        c2752d = h8;
                        arrayList = arrayList2;
                    }
                    arrayList.add(obj2);
                    cVar2 = cVar;
                    arrayList2 = arrayList;
                    h8 = c2752d;
                    value = obj;
                    wVar2 = wVar;
                }
                q6.w wVar3 = wVar2;
                C2752d c2752d2 = h8;
                if (!wVar3.a(value, arrayList2)) {
                    cVar2 = cVar;
                    wVar2 = wVar3;
                    h8 = c2752d2;
                } else {
                    return;
                }
            }
        }
    }

    private final void f0(com.stripe.android.model.o oVar) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), this.f24819j, null, new y(oVar, null), 2, null);
    }

    private final void g0(D3.f fVar) {
        boolean z8;
        if (fVar instanceof f.c) {
            z8 = true;
        } else {
            z8 = fVar instanceof f.C0023f;
        }
        if (z8) {
            if (((Boolean) this.f24831v.getValue()).booleanValue()) {
                return;
            }
            p0(new z(fVar));
        } else {
            throw new IllegalStateException(("Unsupported payment selection " + fVar).toString());
        }
    }

    private final void h0(com.stripe.android.model.o oVar) {
        String str;
        C2603f c2603f = (C2603f) this.f24833x.getValue();
        InterfaceC1371t.a aVar = this.f24823n;
        o.p pVar = oVar.f25635e;
        if (pVar != null) {
            str = pVar.f25773a;
        } else {
            str = null;
        }
        C2.c j02 = j0(str);
        boolean d8 = c2603f.d();
        C2752d h8 = c2603f.h();
        if (h8 != null) {
            s0(this, new c.b(aVar.a(oVar, new A(), new B(null), new C(null), j02, d8, h8.W().c()), ((Boolean) this.f24820k.invoke()).booleanValue()), false, 2, null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void i0() {
        Object value;
        ArrayList arrayList;
        c cVar = (c) this.f24827r.getValue();
        if (cVar instanceof c.a) {
            c.a aVar = (c.a) cVar;
            if (aVar.h() == null) {
                q6.w wVar = this.f24826q;
                do {
                    value = wVar.getValue();
                    List<Object> list = (List) value;
                    arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                    for (Object obj : list) {
                        if (obj instanceof c.a) {
                            obj = c.a.f((c.a) obj, null, null, null, null, null, null, null, false, false, true, null, false, null, false, null, null, false, false, null, null, 1039743, null);
                        }
                        arrayList.add(obj);
                    }
                } while (!wVar.a(value, arrayList));
                B3.c o8 = aVar.o();
                if (o8 != null) {
                    String q8 = aVar.q();
                    C2752d h8 = ((C2603f) this.f24833x.getValue()).h();
                    if (h8 != null) {
                        J(AbstractC1355c.e(o8, q8, h8));
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalStateException("completeFormValues cannot be null".toString());
            }
            aVar.h().f().invoke();
            return;
        }
        if (cVar instanceof c.d) {
            q0(D.f24844a);
            D3.f h9 = ((c.d) cVar).h();
            if (h9 instanceof f.c) {
                n0();
                return;
            }
            if (h9 instanceof f.C0023f) {
                o0((f.C0023f) h9);
                return;
            } else {
                if (h9 == null) {
                    o0(null);
                    return;
                }
                throw new IllegalStateException((h9 + " is not supported").toString());
            }
        }
        throw new IllegalStateException((this.f24827r.getValue() + " is not supported").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l0(com.stripe.android.model.o r7, U5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.customersheet.b.E
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.customersheet.b$E r0 = (com.stripe.android.customersheet.b.E) r0
            int r1 = r0.f24849e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24849e = r1
            goto L18
        L13:
            com.stripe.android.customersheet.b$E r0 = new com.stripe.android.customersheet.b$E
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f24847c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f24849e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L60
            if (r2 == r5) goto L54
            if (r2 != r4) goto L4c
            java.lang.Object r7 = r0.f24846b
            com.stripe.android.model.o r7 = (com.stripe.android.model.o) r7
            java.lang.Object r7 = r0.f24845a
            com.stripe.android.customersheet.b r7 = (com.stripe.android.customersheet.b) r7
            Q5.t.b(r8)
            H2.a r8 = (H2.a) r8
            boolean r0 = r8 instanceof H2.a.b
            if (r0 == 0) goto L48
            r0 = r8
            H2.a$b r0 = (H2.a.b) r0
            java.lang.Object r0 = r0.a()
            com.stripe.android.model.o r0 = (com.stripe.android.model.o) r0
            G2.b r7 = r7.f24818i
            r7.i()
        L48:
            H2.b.a(r8)
            return r8
        L4c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L54:
            java.lang.Object r7 = r0.f24846b
            com.stripe.android.model.o r7 = (com.stripe.android.model.o) r7
            java.lang.Object r1 = r0.f24845a
            com.stripe.android.customersheet.b r1 = (com.stripe.android.customersheet.b) r1
            Q5.t.b(r8)
            goto L71
        L60:
            Q5.t.b(r8)
            r0.f24845a = r6
            r0.f24846b = r7
            r0.f24849e = r5
            java.lang.Object r8 = r6.E(r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            r1 = r6
        L71:
            android.support.v4.media.a.a(r8)
            java.lang.String r8 = r7.f25631a
            kotlin.jvm.internal.AbstractC3292y.f(r8)
            r0.f24845a = r1
            r0.f24846b = r7
            r0.f24849e = r4
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.b.l0(com.stripe.android.model.o, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(com.stripe.android.model.o oVar) {
        boolean z8;
        D3.f fVar;
        C2603f c2603f = (C2603f) this.f24833x.getValue();
        List i8 = c2603f.i();
        ArrayList arrayList = new ArrayList();
        Iterator it = i8.iterator();
        while (true) {
            z8 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = ((com.stripe.android.model.o) next).f25631a;
            String str2 = oVar.f25631a;
            AbstractC3292y.f(str2);
            if (true ^ AbstractC3292y.d(str, str2)) {
                arrayList.add(next);
            }
        }
        D3.f g8 = c2603f.g();
        D3.f fVar2 = this.f24810a;
        boolean z9 = g8 instanceof f.C0023f;
        if (!z9 || !AbstractC3292y.d(((f.C0023f) g8).r().f25631a, oVar.f25631a)) {
            z8 = false;
        }
        if (z9 && (fVar2 instanceof f.C0023f) && AbstractC3292y.d(((f.C0023f) g8).r().f25631a, ((f.C0023f) fVar2).r().f25631a)) {
            this.f24810a = null;
        }
        q6.w wVar = this.f24833x;
        if (z8) {
            g8 = null;
        }
        if (g8 == null) {
            fVar = this.f24810a;
        } else {
            fVar = g8;
        }
        wVar.setValue(C2603f.b(c2603f, arrayList, fVar, null, null, null, 28, null));
    }

    private final void n0() {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), this.f24819j, null, new F(null), 2, null);
    }

    private final void o0(f.C0023f c0023f) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), this.f24819j, null, new H(c0023f, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(Function1 function1) {
        q6.w wVar = this.f24833x;
        wVar.setValue(function1.invoke(wVar.getValue()));
    }

    private final void q0(Function1 function1) {
        q6.w wVar = this.f24832w;
        wVar.setValue(function1.invoke(wVar.getValue()));
    }

    private final void r0(c cVar, boolean z8) {
        Object value;
        List H02;
        if (cVar instanceof c.a) {
            this.f24818i.j(b.EnumC0047b.f2809b);
        } else if (cVar instanceof c.d) {
            this.f24818i.j(b.EnumC0047b.f2810c);
        } else if (cVar instanceof c.b) {
            this.f24818i.j(b.EnumC0047b.f2811d);
        }
        q6.w wVar = this.f24826q;
        do {
            value = wVar.getValue();
            List list = (List) value;
            if (z8) {
                H02 = AbstractC1435t.e(cVar);
            } else {
                H02 = AbstractC1435t.H0(list, cVar);
            }
        } while (!wVar.a(value, H02));
    }

    static /* synthetic */ void s0(b bVar, c cVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        bVar.r0(cVar, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(boolean z8) {
        String str;
        List h02;
        List m8;
        C2603f c2603f = (C2603f) this.f24833x.getValue();
        C2752d h8 = c2603f.h();
        C2027g c2027g = this.f24835z;
        StripeIntent stripeIntent = null;
        if (c2027g == null || (str = c2027g.d()) == null) {
            if (h8 != null && (h02 = h8.h0()) != null) {
                str = (String) AbstractC1435t.o0(h02);
            } else {
                str = null;
            }
            if (str == null) {
                str = o.p.f25755i.f25773a;
            }
        }
        String str2 = str;
        B3.b bVar = B3.b.f565a;
        F2.c cVar = this.f24815f;
        F3.a a9 = bVar.a(str2, cVar, cVar.p(), c2603f.f());
        C2027g c2027g2 = this.f24835z;
        if (c2027g2 == null) {
            if (h8 != null) {
                c2027g2 = h8.g0(str2);
            } else {
                c2027g2 = null;
            }
            if (c2027g2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        if (h8 != null) {
            stripeIntent = h8.W();
        }
        if (h8 == null || (m8 = h8.l(c2027g2.d(), new InterfaceC2756h.a.InterfaceC0717a.C0718a(this.f24825p, null, I.f24856a, null, null, 24, null))) == null) {
            m8 = AbstractC1435t.m();
        }
        r0(new c.a(str2, this.f24809A, null, m8, a9, K(stripeIntent), null, true, ((Boolean) this.f24820k.invoke()).booleanValue(), false, null, z8, C2.d.a(v3.w.f40604a0), false, null, null, false, false, null, this.f24824o, 230400, null), z8);
    }

    private final void u0() {
        if (((C2603f) this.f24833x.getValue()).e()) {
            r0((c) this.f24834y.getValue(), true);
        } else {
            t0(true);
        }
    }

    private final void v0(Function1 function1) {
        Object value;
        ArrayList arrayList;
        boolean z8;
        q6.w wVar = this.f24826q;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof c.a) {
                    c.a aVar = (c.a) obj;
                    PrimaryButton.b bVar = (PrimaryButton.b) function1.invoke(aVar.h());
                    if (bVar != null) {
                        obj = c.a.f(aVar, null, null, null, null, null, null, null, false, false, false, null, false, null, bVar.c(), bVar, null, false, false, null, null, 1023999, null);
                    } else {
                        if (aVar.o() != null && !aVar.b()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        obj = c.a.f(aVar, null, null, null, null, null, null, null, false, false, false, null, false, null, z8, null, null, false, false, null, null, 1023999, null);
                    }
                }
                arrayList.add(obj);
            }
        } while (!wVar.a(value, arrayList));
    }

    private final void w0(C2.c cVar, boolean z8) {
        Object value;
        ArrayList arrayList;
        q6.w wVar = this.f24826q;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof c.a) {
                    obj = c.a.f((c.a) obj, null, null, null, null, null, null, null, false, false, false, null, false, null, false, null, cVar, z8, false, null, null, 950271, null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.a(value, arrayList));
    }

    private final void x0(com.stripe.android.model.o oVar) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new J(oVar, null), 3, null);
    }

    public final boolean G() {
        Object value;
        ArrayList arrayList;
        if (((c) this.f24827r.getValue()).c(this.f24822m)) {
            q6.w wVar = this.f24826q;
            do {
                value = wVar.getValue();
                List<Object> list = (List) value;
                arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                for (Object obj : list) {
                    if (obj instanceof c.a) {
                        obj = c.a.f((c.a) obj, null, null, null, null, null, null, null, false, false, false, null, false, null, false, null, null, false, true, null, null, 917503, null);
                    }
                    arrayList.add(obj);
                }
            } while (!wVar.a(value, arrayList));
            return false;
        }
        return true;
    }

    public final InterfaceC3813L N() {
        return this.f24829t;
    }

    public final InterfaceC3813L O() {
        return this.f24827r;
    }

    public final void R(a viewAction) {
        AbstractC3292y.i(viewAction, "viewAction");
        if (viewAction instanceof a.h) {
            b0();
            return;
        }
        if (viewAction instanceof a.C0459a) {
            U();
            return;
        }
        if (viewAction instanceof a.e) {
            Y();
            return;
        }
        if (viewAction instanceof a.c) {
            W();
            return;
        }
        if (viewAction instanceof a.i) {
            c0();
            return;
        }
        if (viewAction instanceof a.l) {
            f0(((a.l) viewAction).a());
            return;
        }
        if (viewAction instanceof a.n) {
            h0(((a.n) viewAction).a());
            return;
        }
        if (viewAction instanceof a.m) {
            g0(((a.m) viewAction).a());
            return;
        }
        if (viewAction instanceof a.o) {
            i0();
            return;
        }
        if (viewAction instanceof a.b) {
            V(((a.b) viewAction).a());
            return;
        }
        if (viewAction instanceof a.k) {
            e0(((a.k) viewAction).a());
            return;
        }
        if (viewAction instanceof a.p) {
            v0(((a.p) viewAction).a());
            return;
        }
        if (viewAction instanceof a.q) {
            a.q qVar = (a.q) viewAction;
            w0(qVar.a(), qVar.b());
            return;
        }
        if (viewAction instanceof a.f) {
            Z(((a.f) viewAction).a());
            return;
        }
        if (viewAction instanceof a.g) {
            a0(((a.g) viewAction).a());
        } else if (viewAction instanceof a.j) {
            d0(((a.j) viewAction).a());
        } else if (viewAction instanceof a.d) {
            X();
        }
    }

    public final C2.c j0(String str) {
        C2027g c2027g;
        C2.c cVar = null;
        if (str != null) {
            C2752d h8 = ((C2603f) this.f24833x.getValue()).h();
            if (h8 != null) {
                c2027g = h8.g0(str);
            } else {
                c2027g = null;
            }
            if (c2027g != null) {
                cVar = c2027g.f();
            }
        }
        return C2.d.c(cVar);
    }

    public final void k0(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        AbstractC3292y.i(lifecycleOwner, "lifecycleOwner");
        this.f24830u.P(activityResultCaller, lifecycleOwner);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.app.Application r19, D3.f r20, N5.a r21, F2.c r22, v2.d r23, j3.m r24, G2.b r25, U5.g r26, kotlin.jvm.functions.Function0 r27, com.stripe.android.paymentsheet.f.d r28, F2.d r29, t3.d r30, O3.InterfaceC1371t.a r31, p3.i r32) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r32
            java.lang.String r4 = "application"
            r5 = r19
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "paymentConfigurationProvider"
            r5 = r21
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "configuration"
            r5 = r22
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "logger"
            r5 = r23
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "stripeRepository"
            r5 = r24
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "eventReporter"
            r5 = r25
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "workContext"
            r5 = r26
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "isLiveModeProvider"
            r5 = r27
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "intentConfirmationHandlerFactory"
            r5 = r28
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "customerSheetLoader"
            r5 = r29
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "isFinancialConnectionsAvailable"
            r5 = r30
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "editInteractorFactory"
            r5 = r31
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            java.lang.String r4 = "errorReporter"
            r5 = r32
            kotlin.jvm.internal.AbstractC3292y.i(r5, r4)
            K2.a r6 = K2.a.f4570a
            n6.U r4 = r6.c()
            n6.U r5 = r6.b()
            n6.U r6 = r6.d()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.b.<init>(android.app.Application, D3.f, N5.a, F2.c, v2.d, j3.m, G2.b, U5.g, kotlin.jvm.functions.Function0, com.stripe.android.paymentsheet.f$d, F2.d, t3.d, O3.t$a, p3.i):void");
    }
}
