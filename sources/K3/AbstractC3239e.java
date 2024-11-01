package k3;

import B2.B;
import B2.j;
import B2.r;
import Q5.I;
import Q5.s;
import R5.AbstractC1435t;
import android.content.Context;
import c6.InterfaceC2072n;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import j3.m;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import n2.K;
import n6.M;

/* renamed from: k3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3239e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f34419g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f34420h = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final List f34421i = AbstractC1435t.e("payment_method");

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f34422a;

    /* renamed from: b, reason: collision with root package name */
    private final m f34423b;

    /* renamed from: c, reason: collision with root package name */
    private final v2.d f34424c;

    /* renamed from: d, reason: collision with root package name */
    private final U5.g f34425d;

    /* renamed from: e, reason: collision with root package name */
    private final B f34426e;

    /* renamed from: f, reason: collision with root package name */
    private final C3236b f34427f;

    /* renamed from: k3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final List a() {
            return AbstractC3239e.f34421i;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: k3.e$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34428a;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.f25374h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.f25375i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f34428a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34429a;

        /* renamed from: c, reason: collision with root package name */
        int f34431c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34429a = obj;
            this.f34431c |= Integer.MIN_VALUE;
            Object p8 = AbstractC3239e.this.p(null, this);
            if (p8 == V5.b.e()) {
                return p8;
            }
            return s.a(p8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f34432a;

        /* renamed from: b, reason: collision with root package name */
        int f34433b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f34434c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3237c f34436e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3237c c3237c, U5.d dVar) {
            super(2, dVar);
            this.f34436e = c3237c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(this.f34436e, dVar);
            dVar2.f34434c = obj;
            return dVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0192 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 506
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.AbstractC3239e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0786e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34437a;

        /* renamed from: b, reason: collision with root package name */
        Object f34438b;

        /* renamed from: c, reason: collision with root package name */
        Object f34439c;

        /* renamed from: d, reason: collision with root package name */
        Object f34440d;

        /* renamed from: e, reason: collision with root package name */
        Object f34441e;

        /* renamed from: f, reason: collision with root package name */
        Object f34442f;

        /* renamed from: g, reason: collision with root package name */
        Object f34443g;

        /* renamed from: h, reason: collision with root package name */
        int f34444h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f34445i;

        /* renamed from: k, reason: collision with root package name */
        int f34447k;

        C0786e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34445i = obj;
            this.f34447k |= Integer.MIN_VALUE;
            Object r8 = AbstractC3239e.this.r(null, null, null, this);
            if (r8 == V5.b.e()) {
                return r8;
            }
            return s.a(r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.e$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f34448a;

        /* renamed from: b, reason: collision with root package name */
        int f34449b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f34451d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Q f34452e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f34453f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ StripeIntent f34454g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f34455h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ j.c f34456i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(T t8, Q q8, int i8, StripeIntent stripeIntent, String str, j.c cVar, U5.d dVar) {
            super(2, dVar);
            this.f34451d = t8;
            this.f34452e = q8;
            this.f34453f = i8;
            this.f34454g = stripeIntent;
            this.f34455h = str;
            this.f34456i = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f34451d, this.f34452e, this.f34453f, this.f34454g, this.f34455h, this.f34456i, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007d -> B:10:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0094 -> B:10:0x0097). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r8.f34449b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r1 = r8.f34448a
                kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
                Q5.t.b(r9)
                Q5.s r9 = (Q5.s) r9
                java.lang.Object r9 = r9.j()
                goto L97
            L28:
                Q5.t.b(r9)
                goto L5d
            L2c:
                Q5.t.b(r9)
            L2f:
                k3.e r9 = k3.AbstractC3239e.this
                kotlin.jvm.internal.T r1 = r8.f34451d
                java.lang.Object r1 = r1.f34573a
                boolean r9 = k3.AbstractC3239e.k(r9, r1)
                if (r9 == 0) goto La2
                kotlin.jvm.internal.Q r9 = r8.f34452e
                int r9 = r9.f34571a
                if (r9 <= r4) goto La2
                k3.e r9 = k3.AbstractC3239e.this
                B2.B r9 = k3.AbstractC3239e.f(r9)
                int r1 = r8.f34453f
                kotlin.jvm.internal.Q r5 = r8.f34452e
                int r5 = r5.f34571a
                long r5 = r9.a(r1, r5)
                r9 = 0
                r8.f34448a = r9
                r8.f34449b = r4
                java.lang.Object r9 = n6.X.c(r5, r8)
                if (r9 != r0) goto L5d
                return r0
            L5d:
                kotlin.jvm.internal.T r1 = r8.f34451d
                k3.e r9 = k3.AbstractC3239e.this
                com.stripe.android.model.StripeIntent r5 = r8.f34454g
                boolean r9 = k3.AbstractC3239e.h(r9, r5)
                if (r9 == 0) goto L80
                k3.e r9 = k3.AbstractC3239e.this
                java.lang.String r5 = r8.f34455h
                B2.j$c r6 = r8.f34456i
                k3.e$a r7 = k3.AbstractC3239e.f34419g
                java.util.List r7 = r7.a()
                r8.f34448a = r1
                r8.f34449b = r3
                java.lang.Object r9 = r9.q(r5, r6, r7, r8)
                if (r9 != r0) goto L97
                return r0
            L80:
                k3.e r9 = k3.AbstractC3239e.this
                java.lang.String r5 = r8.f34455h
                B2.j$c r6 = r8.f34456i
                k3.e$a r7 = k3.AbstractC3239e.f34419g
                java.util.List r7 = r7.a()
                r8.f34448a = r1
                r8.f34449b = r2
                java.lang.Object r9 = r9.s(r5, r6, r7, r8)
                if (r9 != r0) goto L97
                return r0
            L97:
                r1.f34573a = r9
                kotlin.jvm.internal.Q r9 = r8.f34452e
                int r1 = r9.f34571a
                int r1 = r1 + (-1)
                r9.f34571a = r1
                goto L2f
            La2:
                Q5.I r9 = Q5.I.f8786a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.AbstractC3239e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public /* synthetic */ AbstractC3239e(Context context, N5.a aVar, m mVar, v2.d dVar, U5.g gVar, B b9, AbstractC3284p abstractC3284p) {
        this(context, aVar, mVar, dVar, gVar, b9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(StripeIntent stripeIntent, int i8) {
        int i9;
        StripeIntent.Status status = stripeIntent.getStatus();
        if (status == null) {
            i9 = -1;
        } else {
            i9 = b.f34428a[status.ordinal()];
        }
        if (i9 == 1 || i9 == 2) {
            return 1;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(com.stripe.android.model.StripeIntent r24, java.lang.String r25, B2.j.c r26, U5.d r27) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.AbstractC3239e.r(com.stripe.android.model.StripeIntent, java.lang.String, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(StripeIntent stripeIntent) {
        o.a aVar;
        o.p pVar;
        o r8 = stripeIntent.r();
        if (r8 != null && (pVar = r8.f25635e) != null) {
            aVar = pVar.b();
        } else {
            aVar = null;
        }
        return aVar instanceof o.a.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(StripeIntent stripeIntent, boolean z8) {
        if (z8 && stripeIntent.t()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(com.stripe.android.model.StripeIntent r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r9 != r1) goto Lc
            boolean r2 = com.stripe.android.model.y.b(r8)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r3 = 0
            r4 = 3
            if (r9 != r4) goto L29
            com.stripe.android.model.StripeIntent$Status r5 = r8.getStatus()
            com.stripe.android.model.StripeIntent$Status r6 = com.stripe.android.model.StripeIntent.Status.f25370d
            if (r5 != r6) goto L29
            com.stripe.android.model.o r5 = r8.r()
            if (r5 == 0) goto L22
            com.stripe.android.model.o$p r5 = r5.f25635e
            goto L23
        L22:
            r5 = r3
        L23:
            com.stripe.android.model.o$p r6 = com.stripe.android.model.o.p.f25755i
            if (r5 != r6) goto L29
            r5 = 1
            goto L2a
        L29:
            r5 = 0
        L2a:
            if (r9 != r4) goto L4a
            com.stripe.android.model.StripeIntent$Status r9 = r8.getStatus()
            com.stripe.android.model.StripeIntent$Status r4 = com.stripe.android.model.StripeIntent.Status.f25371e
            if (r9 != r4) goto L4a
            com.stripe.android.model.o r9 = r8.r()
            if (r9 == 0) goto L3c
            com.stripe.android.model.o$p r3 = r9.f25635e
        L3c:
            com.stripe.android.model.o$p r9 = com.stripe.android.model.o.p.f25755i
            if (r3 != r9) goto L4a
            com.stripe.android.model.StripeIntent$NextActionType r9 = r8.k()
            com.stripe.android.model.StripeIntent$NextActionType r3 = com.stripe.android.model.StripeIntent.NextActionType.f25353d
            if (r9 != r3) goto L4a
            r9 = 1
            goto L4b
        L4a:
            r9 = 0
        L4b:
            boolean r3 = r8.t()
            if (r3 == 0) goto L69
            com.stripe.android.model.o r8 = r8.r()
            if (r8 == 0) goto L69
            com.stripe.android.model.o$p r8 = r8.f25635e
            if (r8 == 0) goto L69
            com.stripe.android.model.o$a r8 = r8.b()
            if (r8 == 0) goto L69
            boolean r8 = r8.T()
            if (r8 != r1) goto L69
            r8 = 1
            goto L6a
        L69:
            r8 = 0
        L6a:
            if (r2 != 0) goto L72
            if (r5 != 0) goto L72
            if (r9 != 0) goto L72
            if (r8 == 0) goto L73
        L72:
            r0 = 1
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.AbstractC3239e.v(com.stripe.android.model.StripeIntent, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w(Object obj) {
        boolean z8;
        o.p pVar = null;
        if (s.g(obj)) {
            obj = null;
        }
        StripeIntent stripeIntent = (StripeIntent) obj;
        if (stripeIntent == null) {
            return true;
        }
        boolean t8 = stripeIntent.t();
        if (stripeIntent.getStatus() == StripeIntent.Status.f25370d) {
            o r8 = stripeIntent.r();
            if (r8 != null) {
                pVar = r8.f25635e;
            }
            if (pVar == o.p.f25755i) {
                z8 = true;
                if (t8 && !z8) {
                    return false;
                }
            }
        }
        z8 = false;
        return t8 ? true : true;
    }

    protected abstract Object l(String str, j.c cVar, String str2, U5.d dVar);

    protected abstract K m(StripeIntent stripeIntent, int i8, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final m o() {
        return this.f34423b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(k3.C3237c r6, U5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof k3.AbstractC3239e.c
            if (r0 == 0) goto L13
            r0 = r7
            k3.e$c r0 = (k3.AbstractC3239e.c) r0
            int r1 = r0.f34431c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34431c = r1
            goto L18
        L13:
            k3.e$c r0 = new k3.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34429a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f34431c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Q5.t.b(r7)
            U5.g r7 = r5.f34425d
            k3.e$d r2 = new k3.e$d
            r4 = 0
            r2.<init>(r6, r4)
            r0.f34431c = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r6 = r7.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.AbstractC3239e.p(k3.c, U5.d):java.lang.Object");
    }

    protected abstract Object q(String str, j.c cVar, List list, U5.d dVar);

    protected abstract Object s(String str, j.c cVar, List list, U5.d dVar);

    private AbstractC3239e(Context context, N5.a aVar, m mVar, v2.d dVar, U5.g gVar, B b9) {
        this.f34422a = aVar;
        this.f34423b = mVar;
        this.f34424c = dVar;
        this.f34425d = gVar;
        this.f34426e = b9;
        this.f34427f = new C3236b(context);
    }

    public /* synthetic */ AbstractC3239e(Context context, N5.a aVar, m mVar, v2.d dVar, U5.g gVar, B b9, int i8, AbstractC3284p abstractC3284p) {
        this(context, aVar, mVar, dVar, gVar, (i8 & 32) != 0 ? new r() : b9, null);
    }
}
