package O3;

import O3.C1367o;
import O3.InterfaceC1365m;
import O3.InterfaceC1366n;
import O3.InterfaceC1371t;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2075q;
import com.stripe.android.model.o;
import g3.EnumC2906e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.U0;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* renamed from: O3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1362j implements InterfaceC1371t {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f7596a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2072n f7597b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2073o f7598c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7599d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7600e;

    /* renamed from: f, reason: collision with root package name */
    private final q6.w f7601f;

    /* renamed from: g, reason: collision with root package name */
    private final q6.w f7602g;

    /* renamed from: h, reason: collision with root package name */
    private final q6.w f7603h;

    /* renamed from: i, reason: collision with root package name */
    private final q6.w f7604i;

    /* renamed from: j, reason: collision with root package name */
    private final q6.w f7605j;

    /* renamed from: k, reason: collision with root package name */
    private final n6.M f7606k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3813L f7607l;

    /* renamed from: O3.j$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1371t.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7608a = new a();

        private a() {
        }

        @Override // O3.InterfaceC1371t.a
        public InterfaceC1371t a(com.stripe.android.model.o initialPaymentMethod, Function1 eventHandler, InterfaceC2072n removeExecutor, InterfaceC2073o updateExecutor, C2.c displayName, boolean z8, boolean z9) {
            AbstractC3292y.i(initialPaymentMethod, "initialPaymentMethod");
            AbstractC3292y.i(eventHandler, "eventHandler");
            AbstractC3292y.i(removeExecutor, "removeExecutor");
            AbstractC3292y.i(updateExecutor, "updateExecutor");
            AbstractC3292y.i(displayName, "displayName");
            return new C1362j(initialPaymentMethod, displayName, eventHandler, removeExecutor, updateExecutor, z8, z9, null, 128, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.j$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7609a;

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r8.f7609a
                r2 = 0
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L35
                if (r1 == r7) goto L31
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L29
                if (r1 == r4) goto L25
                if (r1 != r3) goto L1d
                Q5.t.b(r9)
                goto L9b
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                Q5.t.b(r9)
                goto L8a
            L29:
                Q5.t.b(r9)
                goto L73
            L2d:
                Q5.t.b(r9)
                goto L58
            L31:
                Q5.t.b(r9)
                goto L47
            L35:
                Q5.t.b(r9)
                O3.j r9 = O3.C1362j.this
                q6.w r9 = O3.C1362j.f(r9)
                r8.f7609a = r7
                java.lang.Object r9 = r9.emit(r2, r8)
                if (r9 != r0) goto L47
                return r0
            L47:
                O3.j r9 = O3.C1362j.this
                q6.w r9 = O3.C1362j.k(r9)
                O3.o$b r1 = O3.C1367o.b.f7729c
                r8.f7609a = r6
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto L58
                return r0
            L58:
                O3.j r9 = O3.C1362j.this
                q6.w r9 = O3.C1362j.h(r9)
                java.lang.Object r9 = r9.getValue()
                com.stripe.android.model.o r9 = (com.stripe.android.model.o) r9
                O3.j r1 = O3.C1362j.this
                c6.n r1 = O3.C1362j.j(r1)
                r8.f7609a = r5
                java.lang.Object r9 = r1.invoke(r9, r8)
                if (r9 != r0) goto L73
                return r0
            L73:
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                O3.j r1 = O3.C1362j.this
                q6.w r1 = O3.C1362j.f(r1)
                if (r9 == 0) goto L81
                C2.c r2 = t2.AbstractC4004a.a(r9)
            L81:
                r8.f7609a = r4
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto L8a
                return r0
            L8a:
                O3.j r9 = O3.C1362j.this
                q6.w r9 = O3.C1362j.k(r9)
                O3.o$b r1 = O3.C1367o.b.f7727a
                r8.f7609a = r3
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto L9b
                return r0
            L9b:
                Q5.I r9 = Q5.I.f8786a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: O3.C1362j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.j$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f7611a;

        /* renamed from: b, reason: collision with root package name */
        int f7612b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1367o.a f7614d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1367o.a aVar, U5.d dVar) {
            super(2, dVar);
            this.f7614d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f7614d, dVar);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x00c4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0053 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r5.f7612b
                r2 = 0
                switch(r1) {
                    case 0: goto L2f;
                    case 1: goto L2b;
                    case 2: goto L27;
                    case 3: goto L23;
                    case 4: goto L1c;
                    case 5: goto L17;
                    case 6: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L12:
                Q5.t.b(r6)
                goto Lc5
            L17:
                Q5.t.b(r6)
                goto Lb1
            L1c:
                java.lang.Object r1 = r5.f7611a
                Q5.t.b(r6)
                goto L95
            L23:
                Q5.t.b(r6)
                goto L74
            L27:
                Q5.t.b(r6)
                goto L54
            L2b:
                Q5.t.b(r6)
                goto L42
            L2f:
                Q5.t.b(r6)
                O3.j r6 = O3.C1362j.this
                q6.w r6 = O3.C1362j.f(r6)
                r1 = 1
                r5.f7612b = r1
                java.lang.Object r6 = r6.emit(r2, r5)
                if (r6 != r0) goto L42
                return r0
            L42:
                O3.j r6 = O3.C1362j.this
                q6.w r6 = O3.C1362j.k(r6)
                O3.o$b r1 = O3.C1367o.b.f7728b
                r3 = 2
                r5.f7612b = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L54
                return r0
            L54:
                O3.j r6 = O3.C1362j.this
                c6.o r6 = O3.C1362j.l(r6)
                O3.j r1 = O3.C1362j.this
                q6.w r1 = O3.C1362j.h(r1)
                java.lang.Object r1 = r1.getValue()
                O3.o$a r3 = r5.f7614d
                g3.e r3 = r3.a()
                r4 = 3
                r5.f7612b = r4
                java.lang.Object r6 = r6.invoke(r1, r3, r5)
                if (r6 != r0) goto L74
                return r0
            L74:
                Q5.s r6 = (Q5.s) r6
                java.lang.Object r1 = r6.j()
                O3.j r6 = O3.C1362j.this
                boolean r3 = Q5.s.h(r1)
                if (r3 == 0) goto L95
                r3 = r1
                com.stripe.android.model.o r3 = (com.stripe.android.model.o) r3
                q6.w r6 = O3.C1362j.h(r6)
                r5.f7611a = r1
                r4 = 4
                r5.f7612b = r4
                java.lang.Object r6 = r6.emit(r3, r5)
                if (r6 != r0) goto L95
                return r0
            L95:
                O3.j r6 = O3.C1362j.this
                java.lang.Throwable r3 = Q5.s.e(r1)
                if (r3 == 0) goto Lb1
                q6.w r6 = O3.C1362j.f(r6)
                C2.c r3 = t2.AbstractC4004a.a(r3)
                r5.f7611a = r1
                r1 = 5
                r5.f7612b = r1
                java.lang.Object r6 = r6.emit(r3, r5)
                if (r6 != r0) goto Lb1
                return r0
            Lb1:
                O3.j r6 = O3.C1362j.this
                q6.w r6 = O3.C1362j.k(r6)
                O3.o$b r1 = O3.C1367o.b.f7727a
                r5.f7611a = r2
                r2 = 6
                r5.f7612b = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto Lc5
                return r0
            Lc5:
                Q5.I r6 = Q5.I.f8786a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: O3.C1362j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.j$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements InterfaceC2075q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2.c f7616b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2.c cVar) {
            super(5);
            this.f7616b = cVar;
        }

        public final C1367o a(com.stripe.android.model.o paymentMethod, C1367o.a choice, C1367o.b status, boolean z8, C2.c cVar) {
            AbstractC3292y.i(paymentMethod, "paymentMethod");
            AbstractC3292y.i(choice, "choice");
            AbstractC3292y.i(status, "status");
            C1367o.a p8 = C1362j.this.p(paymentMethod);
            return new C1367o(status, C1362j.this.o(paymentMethod), this.f7616b, !AbstractC3292y.d(p8, choice), choice, C1362j.this.m(paymentMethod), C1362j.this.f7599d, z8, cVar);
        }

        @Override // c6.InterfaceC2075q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return a((com.stripe.android.model.o) obj, (C1367o.a) obj2, (C1367o.b) obj3, ((Boolean) obj4).booleanValue(), (C2.c) obj5);
        }
    }

    public C1362j(com.stripe.android.model.o initialPaymentMethod, C2.c displayName, Function1 eventHandler, InterfaceC2072n removeExecutor, InterfaceC2073o updateExecutor, boolean z8, boolean z9, U5.g workContext) {
        AbstractC3292y.i(initialPaymentMethod, "initialPaymentMethod");
        AbstractC3292y.i(displayName, "displayName");
        AbstractC3292y.i(eventHandler, "eventHandler");
        AbstractC3292y.i(removeExecutor, "removeExecutor");
        AbstractC3292y.i(updateExecutor, "updateExecutor");
        AbstractC3292y.i(workContext, "workContext");
        this.f7596a = eventHandler;
        this.f7597b = removeExecutor;
        this.f7598c = updateExecutor;
        this.f7599d = z8;
        this.f7600e = z9;
        q6.w a9 = AbstractC3815N.a(p(initialPaymentMethod));
        this.f7601f = a9;
        q6.w a10 = AbstractC3815N.a(C1367o.b.f7727a);
        this.f7602g = a10;
        q6.w a11 = AbstractC3815N.a(initialPaymentMethod);
        this.f7603h = a11;
        q6.w a12 = AbstractC3815N.a(Boolean.FALSE);
        this.f7604i = a12;
        q6.w a13 = AbstractC3815N.a(null);
        this.f7605j = a13;
        this.f7606k = n6.N.a(workContext.plus(U0.b(null, 1, null)));
        this.f7607l = A4.g.g(a11, a9, a10, a12, a13, new d(displayName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List m(com.stripe.android.model.o oVar) {
        Set a9;
        o.g.c cVar = n(oVar).f25708k;
        if (cVar != null && (a9 = cVar.a()) != null) {
            Set set = a9;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(x(EnumC2906e.f32115m.b((String) it.next())));
            }
            return arrayList;
        }
        return AbstractC1435t.m();
    }

    private final o.g n(com.stripe.android.model.o oVar) {
        o.g gVar = oVar.f25638h;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("Payment method must be a card in order to be edited");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(com.stripe.android.model.o oVar) {
        String str = n(oVar).f25705h;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Card payment method must contain last 4 digits");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1367o.a p(com.stripe.android.model.o oVar) {
        return x(EnumC2906e.f32115m.b(n(oVar).f25709l));
    }

    private final void q(C1367o.a aVar) {
        this.f7601f.setValue(aVar);
        this.f7596a.invoke(new InterfaceC1366n.a.C0149a(aVar.a()));
    }

    private final void r() {
        this.f7596a.invoke(new InterfaceC1366n.a.C0149a(null));
    }

    private final void s() {
        this.f7596a.invoke(new InterfaceC1366n.a.b(((C1367o.a) this.f7601f.getValue()).a()));
    }

    private final void t() {
        this.f7604i.setValue(Boolean.FALSE);
    }

    private final void u() {
        this.f7604i.setValue(Boolean.FALSE);
        AbstractC3462k.d(this.f7606k, null, null, new b(null), 3, null);
    }

    private final void v() {
        this.f7604i.setValue(Boolean.TRUE);
    }

    private final void w() {
        com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f7603h.getValue();
        C1367o.a aVar = (C1367o.a) this.f7601f.getValue();
        if (!AbstractC3292y.d(p(oVar), aVar)) {
            AbstractC3462k.d(this.f7606k, null, null, new c(aVar, null), 3, null);
        }
    }

    private final C1367o.a x(EnumC2906e enumC2906e) {
        return new C1367o.a(enumC2906e);
    }

    @Override // O3.InterfaceC1366n
    public InterfaceC3813L a() {
        return this.f7607l;
    }

    @Override // O3.InterfaceC1366n
    public void b(InterfaceC1365m viewAction) {
        AbstractC3292y.i(viewAction, "viewAction");
        if (viewAction instanceof InterfaceC1365m.f) {
            v();
            return;
        }
        if (viewAction instanceof InterfaceC1365m.e) {
            u();
            return;
        }
        if (viewAction instanceof InterfaceC1365m.g) {
            w();
            return;
        }
        if (viewAction instanceof InterfaceC1365m.c) {
            s();
            return;
        }
        if (viewAction instanceof InterfaceC1365m.b) {
            r();
        } else if (viewAction instanceof InterfaceC1365m.a) {
            q(((InterfaceC1365m.a) viewAction).a());
        } else if (viewAction instanceof InterfaceC1365m.d) {
            t();
        }
    }

    @Override // O3.InterfaceC1371t
    public boolean c() {
        return this.f7600e;
    }

    @Override // O3.InterfaceC1371t
    public void close() {
        n6.N.d(this.f7606k, null, 1, null);
    }

    public /* synthetic */ C1362j(com.stripe.android.model.o oVar, C2.c cVar, Function1 function1, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, boolean z8, boolean z9, U5.g gVar, int i8, AbstractC3284p abstractC3284p) {
        this(oVar, cVar, function1, interfaceC2072n, interfaceC2073o, z8, z9, (i8 & 128) != 0 ? C3445b0.a() : gVar);
    }
}
