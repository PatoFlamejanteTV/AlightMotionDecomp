package com.stripe.android.paymentsheet;

import B2.j;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.g;
import com.stripe.android.paymentsheet.w;
import g3.InterfaceC2910i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3402e;
import v3.InterfaceC4121a;

/* renamed from: com.stripe.android.paymentsheet.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2634a implements g {

    /* renamed from: f, reason: collision with root package name */
    private static final C0576a f26824f = new C0576a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f26825g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final int f26826h = v3.w.f40618h0;

    /* renamed from: b, reason: collision with root package name */
    private final j3.m f26827b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26828c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f26829d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f26830e;

    /* renamed from: com.stripe.android.paymentsheet.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0576a {
        private C0576a() {
        }

        public /* synthetic */ C0576a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26831a;

        /* renamed from: c, reason: collision with root package name */
        int f26833c;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26831a = obj;
            this.f26833c |= Integer.MIN_VALUE;
            Object h8 = C2634a.this.h(null, this);
            return h8 == V5.b.e() ? h8 : Q5.s.a(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26834a;

        /* renamed from: b, reason: collision with root package name */
        Object f26835b;

        /* renamed from: c, reason: collision with root package name */
        Object f26836c;

        /* renamed from: d, reason: collision with root package name */
        Object f26837d;

        /* renamed from: e, reason: collision with root package name */
        boolean f26838e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f26839f;

        /* renamed from: h, reason: collision with root package name */
        int f26841h;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26839f = obj;
            this.f26841h |= Integer.MIN_VALUE;
            return C2634a.this.k(null, null, null, null, false, this);
        }
    }

    public C2634a(j3.m stripeRepository, boolean z8, Function0 publishableKeyProvider, Function0 stripeAccountIdProvider) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        this.f26827b = stripeRepository;
        this.f26828c = z8;
        this.f26829d = publishableKeyProvider;
        this.f26830e = stripeAccountIdProvider;
    }

    private final g.b.C0609b e(String str, b.d dVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, boolean z8) {
        return new g.b.C0609b(AbstractC3402e.f35322a.a(str, dVar).a(oVar, rVar), z8);
    }

    private final g.b.C0609b f(String str, b.d dVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar) {
        InterfaceC2910i b9;
        AbstractC3402e a9 = AbstractC3402e.f35322a.a(str, dVar);
        String w8 = pVar.w();
        if (w8 != null) {
            b9 = a9.c(w8, o.p.f25754h, rVar);
        } else {
            b9 = a9.b(pVar, rVar);
        }
        return new g.b.C0609b(b9, false);
    }

    static /* synthetic */ g.b.C0609b g(C2634a c2634a, String str, b.d dVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            rVar = null;
        }
        return c2634a.f(str, dVar, pVar, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(com.stripe.android.model.p r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.C2634a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.paymentsheet.a$b r0 = (com.stripe.android.paymentsheet.C2634a.b) r0
            int r1 = r0.f26833c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26833c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.a$b r0 = new com.stripe.android.paymentsheet.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26831a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26833c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r6)
            Q5.s r6 = (Q5.s) r6
            java.lang.Object r5 = r6.j()
            goto L49
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Q5.t.b(r6)
            j3.m r6 = r4.f26827b
            B2.j$c r2 = r4.i()
            r0.f26833c = r3
            java.lang.Object r5 = r6.w(r5, r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.C2634a.h(com.stripe.android.model.p, U5.d):java.lang.Object");
    }

    private final j.c i() {
        return new j.c((String) this.f26829d.invoke(), (String) this.f26830e.invoke(), null, 4, null);
    }

    private final Object j(w.m mVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, b.d dVar, boolean z8, U5.d dVar2) {
        g.f27289a.a();
        throw new IllegalStateException((InterfaceC4121a.class.getSimpleName() + " must be implemented when using IntentConfiguration with PaymentSheet").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(com.stripe.android.paymentsheet.w.m r34, com.stripe.android.model.p r35, com.stripe.android.model.r r36, com.stripe.android.model.b.d r37, boolean r38, U5.d r39) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.C2634a.k(com.stripe.android.paymentsheet.w$m, com.stripe.android.model.p, com.stripe.android.model.r, com.stripe.android.model.b$d, boolean, U5.d):java.lang.Object");
    }

    @Override // com.stripe.android.paymentsheet.g
    public Object a(w.l lVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar, b.d dVar, boolean z8, U5.d dVar2) {
        if (lVar instanceof w.l.a) {
            return k(((w.l.a) lVar).b(), pVar, rVar, dVar, z8, dVar2);
        }
        if (lVar instanceof w.l.b) {
            return f(((w.l.b) lVar).d(), dVar, pVar, rVar);
        }
        if (lVar instanceof w.l.c) {
            return g(this, ((w.l.c) lVar).d(), dVar, pVar, null, 8, null);
        }
        throw new Q5.p();
    }

    @Override // com.stripe.android.paymentsheet.g
    public Object b(w.l lVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, b.d dVar, U5.d dVar2) {
        b.c cVar;
        boolean z8;
        if (lVar instanceof w.l.a) {
            b.c cVar2 = b.c.f25450c;
            w.m b9 = ((w.l.a) lVar).b();
            if (rVar != null) {
                cVar = com.stripe.android.model.s.a(rVar);
            } else {
                cVar = null;
            }
            if (cVar == cVar2) {
                z8 = true;
            } else {
                z8 = false;
            }
            return j(b9, oVar, rVar, dVar, z8, dVar2);
        }
        if (lVar instanceof w.l.b) {
            return e(((w.l.b) lVar).d(), dVar, oVar, rVar, false);
        }
        if (lVar instanceof w.l.c) {
            return e(((w.l.c) lVar).d(), dVar, oVar, rVar, false);
        }
        throw new Q5.p();
    }
}
