package n2;

import B2.j;
import R5.a0;
import android.content.Context;
import c6.InterfaceC2072n;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import v2.C4120a;

/* loaded from: classes4.dex */
public final class I {

    /* renamed from: i, reason: collision with root package name */
    private static v2.c f35289i;

    /* renamed from: a, reason: collision with root package name */
    private final j3.m f35291a;

    /* renamed from: b, reason: collision with root package name */
    private final s f35292b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35293c;

    /* renamed from: d, reason: collision with root package name */
    private final U5.g f35294d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35295e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f35286f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f35287g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final String f35288h = v2.b.f40425c.a().b();

    /* renamed from: j, reason: collision with root package name */
    private static boolean f35290j = true;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35296a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f35296a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f35296a;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35297a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f35297a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f35297a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public final boolean a() {
            return I.f35290j;
        }

        public final v2.c b() {
            return I.f35289i;
        }

        public /* synthetic */ c(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f35298a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.p f35300c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35301d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35302e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.stripe.android.model.p pVar, String str, String str2, U5.d dVar) {
            super(1, dVar);
            this.f35300c = pVar;
            this.f35301d = str;
            this.f35302e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(U5.d dVar) {
            return new d(this.f35300c, this.f35301d, this.f35302e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(U5.d dVar) {
            return ((d) create(dVar)).invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object w8;
            Object e8 = V5.b.e();
            int i8 = this.f35298a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    w8 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                j3.m i9 = I.this.i();
                com.stripe.android.model.p pVar = this.f35300c;
                j.c cVar = new j.c(I.this.h(), this.f35301d, this.f35302e);
                this.f35298a = 1;
                w8 = i9.w(pVar, cVar, this);
                if (w8 == e8) {
                    return e8;
                }
            }
            return Q5.s.a(w8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f35304b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3398a f35305c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, InterfaceC3398a interfaceC3398a, U5.d dVar) {
            super(2, dVar);
            this.f35304b = obj;
            this.f35305c = interfaceC3398a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f35304b, this.f35305c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f35303a == 0) {
                Q5.t.b(obj);
                Object obj2 = this.f35304b;
                InterfaceC3398a interfaceC3398a = this.f35305c;
                Throwable e8 = Q5.s.e(obj2);
                if (e8 == null) {
                    interfaceC3398a.b((z2.f) obj2);
                } else {
                    interfaceC3398a.a(x2.k.f40948e.b(e8));
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35306a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f35307b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ I f35308c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3398a f35309d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, I i8, InterfaceC3398a interfaceC3398a, U5.d dVar) {
            super(2, dVar);
            this.f35307b = function1;
            this.f35308c = i8;
            this.f35309d = interfaceC3398a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f35307b, this.f35308c, this.f35309d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f35306a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                Function1 function1 = this.f35307b;
                this.f35306a = 1;
                obj = function1.invoke(this);
                if (obj == e8) {
                    return e8;
                }
            }
            Object j8 = ((Q5.s) obj).j();
            I i9 = this.f35308c;
            InterfaceC3398a interfaceC3398a = this.f35309d;
            this.f35306a = 2;
            if (i9.f(j8, interfaceC3398a, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public I(j3.m stripeRepository, s paymentController, String publishableKey, String str, U5.g workContext) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(paymentController, "paymentController");
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(workContext, "workContext");
        this.f35291a = stripeRepository;
        this.f35292b = paymentController;
        this.f35293c = str;
        this.f35294d = workContext;
        this.f35295e = new C4120a().b(publishableKey);
    }

    public static /* synthetic */ void e(I i8, com.stripe.android.model.p pVar, String str, String str2, InterfaceC3398a interfaceC3398a, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = null;
        }
        if ((i9 & 4) != 0) {
            str2 = i8.f35293c;
        }
        i8.d(pVar, str, str2, interfaceC3398a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(Object obj, InterfaceC3398a interfaceC3398a, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new e(obj, interfaceC3398a, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    private final void g(InterfaceC3398a interfaceC3398a, Function1 function1) {
        AbstractC3462k.d(N.a(this.f35294d), null, null, new f(function1, this, interfaceC3398a, null), 3, null);
    }

    public final void d(com.stripe.android.model.p paymentMethodCreateParams, String str, String str2, InterfaceC3398a callback) {
        AbstractC3292y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
        AbstractC3292y.i(callback, "callback");
        g(callback, new d(paymentMethodCreateParams, str2, str, null));
    }

    public final String h() {
        return this.f35295e;
    }

    public final j3.m i() {
        return this.f35291a;
    }

    public /* synthetic */ I(Context context, String str, String str2, boolean z8, Set set, int i8, AbstractC3284p abstractC3284p) {
        this(context, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? a0.f() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I(android.content.Context r22, java.lang.String r23, java.lang.String r24, boolean r25, java.util.Set r26) {
        /*
            r21 = this;
            r0 = r23
            r14 = r26
            java.lang.String r1 = "context"
            r2 = r22
            kotlin.jvm.internal.AbstractC3292y.i(r2, r1)
            java.lang.String r1 = "publishableKey"
            kotlin.jvm.internal.AbstractC3292y.i(r0, r1)
            java.lang.String r1 = "betas"
            r3 = r26
            kotlin.jvm.internal.AbstractC3292y.i(r3, r1)
            android.content.Context r15 = r22.getApplicationContext()
            java.lang.String r3 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r15, r3)
            com.stripe.android.networking.a r19 = new com.stripe.android.networking.a
            r1 = r19
            android.content.Context r4 = r22.getApplicationContext()
            r2 = r4
            kotlin.jvm.internal.AbstractC3292y.h(r4, r3)
            n2.I$a r4 = new n2.I$a
            r3 = r4
            r4.<init>(r0)
            v2.c r4 = n2.I.f35289i
            v2.d$a r5 = v2.d.f40434a
            r13 = r25
            v2.d r5 = r5.a(r13)
            r17 = 28656(0x6ff0, float:4.0156E-41)
            r18 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r13 = r16
            r20 = r15
            r15 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            v2.a$a r1 = v2.C4120a.f40423a
            v2.a r1 = r1.a()
            java.lang.String r5 = r1.b(r0)
            r2 = r21
            r3 = r20
            r4 = r19
            r6 = r24
            r7 = r25
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.I.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private I(android.content.Context r15, j3.m r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            r14 = this;
            r0 = r17
            com.stripe.android.b r13 = new com.stripe.android.b
            android.content.Context r2 = r15.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r1)
            n2.I$b r3 = new n2.I$b
            r3.<init>(r0)
            r11 = 496(0x1f0, float:6.95E-43)
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r1 = r13
            r4 = r16
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r14
            r2 = r16
            r3 = r18
            r14.<init>(r2, r13, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.I.<init>(android.content.Context, j3.m, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I(j3.m stripeRepository, s paymentController, String publishableKey, String str) {
        this(stripeRepository, paymentController, publishableKey, str, C3445b0.b());
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(paymentController, "paymentController");
        AbstractC3292y.i(publishableKey, "publishableKey");
    }
}
