package n2;

import R5.a0;
import android.content.Context;
import c6.InterfaceC2072n;
import j3.C3152c;
import j3.C3153d;
import j3.InterfaceC3156g;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.M;
import n6.N;

/* renamed from: n2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3404g implements InterfaceC3406i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3408k f35327a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3156g f35328b;

    /* renamed from: c, reason: collision with root package name */
    private final B2.F f35329c;

    /* renamed from: d, reason: collision with root package name */
    private final p3.i f35330d;

    /* renamed from: e, reason: collision with root package name */
    private final U5.g f35331e;

    /* renamed from: f, reason: collision with root package name */
    private C3153d f35332f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n2.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35333a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35334b;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(dVar);
            aVar.f35334b = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[ADDED_TO_REGION] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r8.f35333a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r8.f35334b
                n2.g r0 = (n2.C3404g) r0
                Q5.t.b(r9)     // Catch: java.lang.Throwable -> L16
                goto L74
            L16:
                r9 = move-exception
                goto L81
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r1 = r8.f35334b
                n6.M r1 = (n6.M) r1
                Q5.t.b(r9)
                goto L40
            L28:
                Q5.t.b(r9)
                java.lang.Object r9 = r8.f35334b
                n6.M r9 = (n6.M) r9
                n2.g r1 = n2.C3404g.this
                n2.k r1 = n2.C3404g.f(r1)
                r8.f35334b = r9
                r8.f35333a = r3
                java.lang.Object r9 = r1.a(r8)
                if (r9 != r0) goto L40
                return r0
            L40:
                n2.g r1 = n2.C3404g.this
                j3.d r9 = (j3.C3153d) r9
                if (r9 == 0) goto L5a
                kotlin.jvm.functions.Function0 r3 = n2.AbstractC3407j.b()
                java.lang.Object r3 = r3.invoke()
                java.lang.Number r3 = (java.lang.Number) r3
                long r3 = r3.longValue()
                boolean r3 = r9.i(r3)
                if (r3 == 0) goto Lac
            L5a:
                Q5.s$a r3 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L7f
                B2.F r3 = n2.C3404g.g(r1)     // Catch: java.lang.Throwable -> L7f
                j3.g r4 = n2.C3404g.e(r1)     // Catch: java.lang.Throwable -> L7f
                j3.f r9 = r4.a(r9)     // Catch: java.lang.Throwable -> L7f
                r8.f35334b = r1     // Catch: java.lang.Throwable -> L7f
                r8.f35333a = r2     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r9 = r3.a(r9, r8)     // Catch: java.lang.Throwable -> L7f
                if (r9 != r0) goto L73
                return r0
            L73:
                r0 = r1
            L74:
                B2.H r9 = (B2.H) r9     // Catch: java.lang.Throwable -> L16
                j3.d r9 = n2.AbstractC3407j.a(r9)     // Catch: java.lang.Throwable -> L16
                java.lang.Object r9 = Q5.s.b(r9)     // Catch: java.lang.Throwable -> L16
                goto L8b
            L7f:
                r9 = move-exception
                r0 = r1
            L81:
                Q5.s$a r1 = Q5.s.f8810b
                java.lang.Object r9 = Q5.t.a(r9)
                java.lang.Object r9 = Q5.s.b(r9)
            L8b:
                java.lang.Throwable r1 = Q5.s.e(r9)
                if (r1 == 0) goto La3
                p3.i r2 = n2.C3404g.d(r0)
                p3.i$d r3 = p3.i.d.f36215s
                x2.k$a r0 = x2.k.f40948e
                x2.k r4 = r0.b(r1)
                r6 = 4
                r7 = 0
                r5 = 0
                p3.i.b.a(r2, r3, r4, r5, r6, r7)
            La3:
                boolean r0 = Q5.s.g(r9)
                if (r0 == 0) goto Laa
                r9 = 0
            Laa:
                j3.d r9 = (j3.C3153d) r9
            Lac:
                n2.g r0 = n2.C3404g.this
                j3.d r0 = n2.C3404g.c(r0)
                boolean r0 = kotlin.jvm.internal.AbstractC3292y.d(r0, r9)
                if (r0 != 0) goto Lbf
                if (r9 == 0) goto Lbf
                n2.g r0 = n2.C3404g.this
                r0.i(r9)
            Lbf:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.C3404g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n2.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35336a;

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
            int i8 = this.f35336a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C3404g c3404g = C3404g.this;
                this.f35336a = 1;
                if (c3404g.h(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public C3404g(InterfaceC3408k localStore, InterfaceC3156g fraudDetectionDataRequestFactory, B2.F stripeNetworkClient, p3.i errorReporter, U5.g workContext) {
        AbstractC3292y.i(localStore, "localStore");
        AbstractC3292y.i(fraudDetectionDataRequestFactory, "fraudDetectionDataRequestFactory");
        AbstractC3292y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        this.f35327a = localStore;
        this.f35328b = fraudDetectionDataRequestFactory;
        this.f35329c = stripeNetworkClient;
        this.f35330d = errorReporter;
        this.f35331e = workContext;
    }

    @Override // n2.InterfaceC3406i
    public C3153d a() {
        C3153d c3153d = this.f35332f;
        if (!I.f35286f.a()) {
            return null;
        }
        return c3153d;
    }

    @Override // n2.InterfaceC3406i
    public void b() {
        if (I.f35286f.a()) {
            AbstractC3458i.d(N.a(this.f35331e), null, null, new b(null), 3, null);
        }
    }

    public Object h(U5.d dVar) {
        return AbstractC3458i.g(this.f35331e, new a(null), dVar);
    }

    public void i(C3153d fraudDetectionData) {
        AbstractC3292y.i(fraudDetectionData, "fraudDetectionData");
        this.f35332f = fraudDetectionData;
        this.f35327a.b(fraudDetectionData);
    }

    public /* synthetic */ C3404g(Context context, U5.g gVar, int i8, AbstractC3284p abstractC3284p) {
        this(context, (i8 & 2) != 0 ? C3445b0.b() : gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3404g(Context context, U5.g workContext) {
        this(new C3405h(context, workContext), new C3152c(context), new B2.o(workContext, null, null, 0, null, 30, null), p3.i.f36196a.a(context, a0.f()), workContext);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(workContext, "workContext");
    }
}
