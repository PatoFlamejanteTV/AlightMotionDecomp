package com.stripe.android.googlepaylauncher;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.t;
import android.content.Context;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.m;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class c implements n {

    /* renamed from: b, reason: collision with root package name */
    private final Context f25050b;

    /* renamed from: c, reason: collision with root package name */
    private final N2.d f25051c;

    /* renamed from: d, reason: collision with root package name */
    private final m.a f25052d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25053e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f25054f;

    /* renamed from: g, reason: collision with root package name */
    private final N2.g f25055g;

    /* renamed from: h, reason: collision with root package name */
    private final p3.i f25056h;

    /* renamed from: i, reason: collision with root package name */
    private final v2.d f25057i;

    /* renamed from: j, reason: collision with root package name */
    private final n2.m f25058j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1416k f25059k;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return n.f25189a.a().a(c.this.f25055g.a(c.this.f25051c));
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f25061a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25062b;

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(dVar);
            bVar.f25062b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3822g interfaceC3822g;
            Object e8 = V5.b.e();
            int i8 = this.f25061a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3822g = (InterfaceC3822g) this.f25062b;
                t.b(obj);
            } else {
                t.b(obj);
                interfaceC3822g = (InterfaceC3822g) this.f25062b;
                c cVar = c.this;
                this.f25062b = interfaceC3822g;
                this.f25061a = 1;
                obj = cVar.e(this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f25062b = null;
            this.f25061a = 2;
            if (interfaceC3822g.emit(obj, this) == e8) {
                return e8;
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            return ((b) create(interfaceC3822g, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0471c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25064a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25065b;

        /* renamed from: d, reason: collision with root package name */
        int f25067d;

        C0471c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25065b = obj;
            this.f25067d |= Integer.MIN_VALUE;
            return c.this.e(this);
        }
    }

    public c(Context context, N2.d environment, m.a billingAddressParameters, boolean z8, boolean z9, N2.g paymentsClientFactory, p3.i errorReporter, v2.d logger) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(environment, "environment");
        AbstractC3292y.i(billingAddressParameters, "billingAddressParameters");
        AbstractC3292y.i(paymentsClientFactory, "paymentsClientFactory");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(logger, "logger");
        this.f25050b = context;
        this.f25051c = environment;
        this.f25052d = billingAddressParameters;
        this.f25053e = z8;
        this.f25054f = z9;
        this.f25055g = paymentsClientFactory;
        this.f25056h = errorReporter;
        this.f25057i = logger;
        this.f25058j = new n2.m(context, false, 2, null);
        this.f25059k = Q5.l.b(new a());
    }

    private final e d() {
        return (e) this.f25059k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(U5.d r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.c.e(U5.d):java.lang.Object");
    }

    @Override // com.stripe.android.googlepaylauncher.n
    public InterfaceC3821f isReady() {
        return AbstractC3823h.z(new b(null));
    }

    public /* synthetic */ c(Context context, N2.d dVar, m.a aVar, boolean z8, boolean z9, N2.g gVar, p3.i iVar, v2.d dVar2, int i8, AbstractC3284p abstractC3284p) {
        this(context, dVar, aVar, z8, z9, (i8 & 32) != 0 ? new N2.a(context) : gVar, iVar, (i8 & 128) != 0 ? v2.d.f40434a.b() : dVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r11, com.stripe.android.googlepaylauncher.j.d r12, v2.d r13, p3.i r14) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3292y.i(r11, r0)
            java.lang.String r0 = "googlePayConfig"
            kotlin.jvm.internal.AbstractC3292y.i(r12, r0)
            java.lang.String r0 = "logger"
            kotlin.jvm.internal.AbstractC3292y.i(r13, r0)
            java.lang.String r0 = "errorReporter"
            kotlin.jvm.internal.AbstractC3292y.i(r14, r0)
            android.content.Context r2 = r11.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
            N2.d r3 = r12.f()
            com.stripe.android.googlepaylauncher.j$b r0 = r12.b()
            n2.m$a r4 = com.stripe.android.googlepaylauncher.a.b(r0)
            boolean r5 = r12.h()
            boolean r6 = r12.a()
            N2.a r7 = new N2.a
            r7.<init>(r11)
            r1 = r10
            r8 = r14
            r9 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.c.<init>(android.content.Context, com.stripe.android.googlepaylauncher.j$d, v2.d, p3.i):void");
    }
}
