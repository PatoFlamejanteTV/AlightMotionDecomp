package com.stripe.android.googlepaylauncher;

import B2.F;
import B2.InterfaceC0951c;
import B2.j;
import Q5.I;
import Q5.t;
import R5.a0;
import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.f;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.b;
import com.stripe.android.model.c;
import com.stripe.android.model.p;
import com.stripe.android.model.u;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2668p;
import g3.InterfaceC2910i;
import j6.InterfaceC3214c;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.C3409l;
import n2.m;
import n2.r;
import n2.s;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import q6.AbstractC3804C;
import q6.AbstractC3823h;
import q6.InterfaceC3802A;
import q6.v;
import r0.C3875m;

/* loaded from: classes4.dex */
public final class i extends ViewModel {

    /* renamed from: o, reason: collision with root package name */
    public static final b f25090o = new b(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f25091p = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3875m f25092a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f25093b;

    /* renamed from: c, reason: collision with root package name */
    private final GooglePayLauncherContract.a f25094c;

    /* renamed from: d, reason: collision with root package name */
    private final j3.m f25095d;

    /* renamed from: e, reason: collision with root package name */
    private final s f25096e;

    /* renamed from: f, reason: collision with root package name */
    private final n2.m f25097f;

    /* renamed from: g, reason: collision with root package name */
    private final n f25098g;

    /* renamed from: h, reason: collision with root package name */
    private final SavedStateHandle f25099h;

    /* renamed from: i, reason: collision with root package name */
    private final p3.i f25100i;

    /* renamed from: j, reason: collision with root package name */
    private final U5.g f25101j;

    /* renamed from: k, reason: collision with root package name */
    private final v f25102k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3802A f25103l;

    /* renamed from: m, reason: collision with root package name */
    private final v f25104m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3802A f25105n;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f25106a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r4.f25106a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Q5.t.b(r5)
                goto L59
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                Q5.t.b(r5)
                Q5.s r5 = (Q5.s) r5
                java.lang.Object r5 = r5.j()
                goto L3a
            L24:
                Q5.t.b(r5)
                com.stripe.android.googlepaylauncher.i r5 = com.stripe.android.googlepaylauncher.i.this
                boolean r5 = com.stripe.android.googlepaylauncher.i.b(r5)
                if (r5 != 0) goto L59
                com.stripe.android.googlepaylauncher.i r5 = com.stripe.android.googlepaylauncher.i.this
                r4.f25106a = r3
                java.lang.Object r5 = com.stripe.android.googlepaylauncher.i.g(r5, r4)
                if (r5 != r0) goto L3a
                return r0
            L3a:
                com.stripe.android.googlepaylauncher.i r1 = com.stripe.android.googlepaylauncher.i.this
                java.lang.Throwable r3 = Q5.s.e(r5)
                if (r3 != 0) goto L51
                com.google.android.gms.tasks.Task r5 = (com.google.android.gms.tasks.Task) r5
                q6.v r1 = com.stripe.android.googlepaylauncher.i.e(r1)
                r4.f25106a = r2
                java.lang.Object r5 = r1.emit(r5, r4)
                if (r5 != r0) goto L59
                return r0
            L51:
                com.stripe.android.googlepaylauncher.h$c r5 = new com.stripe.android.googlepaylauncher.h$c
                r5.<init>(r3)
                r1.u(r5)
            L59:
                Q5.I r5 = Q5.I.f8786a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayLauncherContract.a f25108a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25109b;

        /* renamed from: c, reason: collision with root package name */
        private final U5.g f25110c;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f25111a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f25111a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f25111a;
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f25112a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(0);
                this.f25112a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f25112a;
            }
        }

        public c(GooglePayLauncherContract.a args, boolean z8, U5.g workContext) {
            AbstractC3292y.i(args, "args");
            AbstractC3292y.i(workContext, "workContext");
            this.f25108a = args;
            this.f25109b = z8;
            this.f25110c = workContext;
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
            N2.d f8 = this.f25108a.b().f();
            v2.d a10 = v2.d.f40434a.a(this.f25109b);
            r a11 = r.f35413c.a(a9);
            String f9 = a11.f();
            String h8 = a11.h();
            Set d8 = a0.d("GooglePayLauncher");
            v2.c cVar = null;
            F f10 = null;
            InterfaceC0951c interfaceC0951c = null;
            byte b9 = 0 == true ? 1 : 0;
            byte b10 = 0 == true ? 1 : 0;
            byte b11 = 0 == true ? 1 : 0;
            byte b12 = 0 == true ? 1 : 0;
            com.stripe.android.networking.a aVar = new com.stripe.android.networking.a(a9, new b(f9), cVar, a10, this.f25110c, d8, f10, interfaceC0951c, b9, b10, new PaymentAnalyticsRequestFactory(a9, f9, d8), b11, b12, null, null, 31684, null);
            p3.i a12 = p3.i.f36196a.a(a9, d8);
            com.stripe.android.googlepaylauncher.c cVar2 = new com.stripe.android.googlepaylauncher.c(a9, this.f25108a.b().f(), com.stripe.android.googlepaylauncher.a.a(this.f25108a.b().b()), this.f25108a.b().h(), this.f25108a.b().a(), null, a12, a10, 32, null);
            return new i(new N2.a(a9).a(f8), new j.c(f9, h8, null, 4, null), this.f25108a, aVar, new com.stripe.android.b(a9, new a(f9), aVar, this.f25109b, this.f25110c, null, null, null, null, 480, 0 == true ? 1 : 0), new n2.m(new C3409l(f9, h8), this.f25108a.b().s()), cVar2, SavedStateHandleSupport.createSavedStateHandle(extras), a12, this.f25110c);
        }

        public /* synthetic */ c(GooglePayLauncherContract.a aVar, boolean z8, U5.g gVar, int i8, AbstractC3284p abstractC3284p) {
            this(aVar, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? C3445b0.b() : gVar);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25113a;

        static {
            int[] iArr = new int[f.b.values().length];
            try {
                iArr[f.b.f25075b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.b.f25076c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25113a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f25114a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f25116c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2668p f25117d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p pVar, InterfaceC2668p interfaceC2668p, U5.d dVar) {
            super(2, dVar);
            this.f25116c = pVar;
            this.f25117d = interfaceC2668p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f25116c, this.f25117d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2910i c8;
            Object e8 = V5.b.e();
            int i8 = this.f25114a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                GooglePayLauncherContract.a aVar = i.this.f25094c;
                if (aVar instanceof GooglePayLauncherContract.c) {
                    c8 = b.a.c(com.stripe.android.model.b.f25433o, this.f25116c, i.this.f25094c.a(), null, null, null, null, null, null, 252, null);
                } else if (aVar instanceof GooglePayLauncherContract.d) {
                    c8 = c.a.c(com.stripe.android.model.c.f25461h, this.f25116c, i.this.f25094c.a(), null, null, 12, null);
                } else {
                    throw new Q5.p();
                }
                s sVar = i.this.f25096e;
                InterfaceC2668p interfaceC2668p = this.f25117d;
                j.c cVar = i.this.f25093b;
                this.f25114a = 1;
                if (sVar.c(interfaceC2668p, c8, cVar, this) == e8) {
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
        Object f25118a;

        /* renamed from: b, reason: collision with root package name */
        Object f25119b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25120c;

        /* renamed from: e, reason: collision with root package name */
        int f25122e;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25120c = obj;
            this.f25122e |= Integer.MIN_VALUE;
            Object i8 = i.this.i(null, this);
            return i8 == V5.b.e() ? i8 : Q5.s.a(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25123a;

        /* renamed from: c, reason: collision with root package name */
        int f25125c;

        g(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25123a = obj;
            this.f25125c |= Integer.MIN_VALUE;
            return i.this.o(0, null, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f25126a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f25128c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Intent f25129d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8, Intent intent, U5.d dVar) {
            super(2, dVar);
            this.f25128c = i8;
            this.f25129d = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f25128c, this.f25129d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f25126a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                i iVar = i.this;
                int i9 = this.f25128c;
                Intent intent = this.f25129d;
                this.f25126a = 1;
                obj = iVar.o(i9, intent, this);
                if (obj == e8) {
                    return e8;
                }
            }
            v vVar = i.this.f25102k;
            this.f25126a = 2;
            if (vVar.emit((com.stripe.android.googlepaylauncher.h) obj, this) == e8) {
                return e8;
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.i$i, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0473i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25130a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25131b;

        /* renamed from: d, reason: collision with root package name */
        int f25133d;

        C0473i(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25131b = obj;
            this.f25133d |= Integer.MIN_VALUE;
            Object s8 = i.this.s(this);
            return s8 == V5.b.e() ? s8 : Q5.s.a(s8);
        }
    }

    public i(C3875m paymentsClient, j.c requestOptions, GooglePayLauncherContract.a args, j3.m stripeRepository, s paymentController, n2.m googlePayJsonFactory, n googlePayRepository, SavedStateHandle savedStateHandle, p3.i errorReporter, U5.g workContext) {
        AbstractC3292y.i(paymentsClient, "paymentsClient");
        AbstractC3292y.i(requestOptions, "requestOptions");
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(paymentController, "paymentController");
        AbstractC3292y.i(googlePayJsonFactory, "googlePayJsonFactory");
        AbstractC3292y.i(googlePayRepository, "googlePayRepository");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        this.f25092a = paymentsClient;
        this.f25093b = requestOptions;
        this.f25094c = args;
        this.f25095d = stripeRepository;
        this.f25096e = paymentController;
        this.f25097f = googlePayJsonFactory;
        this.f25098g = googlePayRepository;
        this.f25099h = savedStateHandle;
        this.f25100i = errorReporter;
        this.f25101j = workContext;
        v b9 = AbstractC3804C.b(1, 0, null, 6, null);
        this.f25102k = b9;
        this.f25103l = AbstractC3823h.a(b9);
        v b10 = AbstractC3804C.b(1, 0, null, 6, null);
        this.f25104m = b10;
        this.f25105n = AbstractC3823h.a(b10);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), workContext, null, new a(null), 2, null);
    }

    public static /* synthetic */ m.e k(i iVar, StripeIntent stripeIntent, String str, Long l8, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            l8 = null;
        }
        if ((i8 & 8) != 0) {
            str2 = null;
        }
        return iVar.j(stripeIntent, str, l8, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        return AbstractC3292y.d(this.f25099h.get("has_launched"), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069 A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:34:0x004a, B:35:0x0061, B:37:0x0069, B:44:0x0070, B:45:0x007b), top: B:33:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070 A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:34:0x004a, B:35:0x0061, B:37:0x0069, B:44:0x0070, B:45:0x007b), top: B:33:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(U5.d r8) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.i.s(U5.d):java.lang.Object");
    }

    private final void t(boolean z8) {
        this.f25099h.set("has_launched", Boolean.valueOf(z8));
    }

    public final void h(InterfaceC2668p host, p params) {
        AbstractC3292y.i(host, "host");
        AbstractC3292y.i(params, "params");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), this.f25101j, null, new e(params, host, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a r23, U5.d r24) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.i.i(com.stripe.android.googlepaylauncher.GooglePayLauncherContract$a, U5.d):java.lang.Object");
    }

    public final m.e j(StripeIntent stripeIntent, String currencyCode, Long l8, String str) {
        long j8;
        AbstractC3292y.i(stripeIntent, "stripeIntent");
        AbstractC3292y.i(currencyCode, "currencyCode");
        if (stripeIntent instanceof com.stripe.android.model.n) {
            return new m.e(currencyCode, m.e.c.f35386d, this.f25094c.b().i(), stripeIntent.getId(), ((com.stripe.android.model.n) stripeIntent).f(), null, m.e.a.f35380c);
        }
        if (stripeIntent instanceof u) {
            m.e.c cVar = m.e.c.f35385c;
            String i8 = this.f25094c.b().i();
            String id = stripeIntent.getId();
            if (l8 != null) {
                j8 = l8.longValue();
            } else {
                j8 = 0;
            }
            return new m.e(currencyCode, cVar, i8, id, Long.valueOf(j8), str, m.e.a.f35379b);
        }
        throw new Q5.p();
    }

    public final InterfaceC3802A l() {
        return this.f25105n;
    }

    public final InterfaceC3802A m() {
        return this.f25103l;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(int r6, android.content.Intent r7, U5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.googlepaylauncher.i.g
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.googlepaylauncher.i$g r0 = (com.stripe.android.googlepaylauncher.i.g) r0
            int r1 = r0.f25125c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25125c = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.i$g r0 = new com.stripe.android.googlepaylauncher.i$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25123a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f25125c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Q5.t.b(r8)
            Q5.s r8 = (Q5.s) r8
            java.lang.Object r6 = r8.j()
            goto L90
        L3b:
            Q5.t.b(r8)
            n2.s r8 = r5.f25096e
            boolean r8 = r8.b(r6, r7)
            if (r8 == 0) goto L51
            n2.s r6 = r5.f25096e
            r0.f25125c = r4
            java.lang.Object r6 = r6.d(r7, r0)
            if (r6 != r1) goto L90
            return r1
        L51:
            n2.s r8 = r5.f25096e
            boolean r8 = r8.a(r6, r7)
            if (r8 == 0) goto L64
            n2.s r6 = r5.f25096e
            r0.f25125c = r3
            java.lang.Object r6 = r6.e(r7, r0)
            if (r6 != r1) goto L90
            return r1
        L64:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unexpected confirmation result."
            r7.<init>(r8)
            p3.i r8 = r5.f25100i
            p3.i$f r0 = p3.i.f.f36237h
            x2.k$a r1 = x2.k.f40948e
            x2.k r1 = r1.b(r7)
            java.lang.String r2 = "request_code"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            Q5.r r6 = Q5.x.a(r2, r6)
            java.util.Map r6 = R5.Q.e(r6)
            r8.a(r0, r1, r6)
            Q5.s$a r6 = Q5.s.f8810b
            java.lang.Object r6 = Q5.t.a(r7)
            java.lang.Object r6 = Q5.s.b(r6)
        L90:
            java.lang.Throwable r7 = Q5.s.e(r6)
            if (r7 != 0) goto L9b
            n2.K r6 = (n2.K) r6
            com.stripe.android.googlepaylauncher.h$b r6 = com.stripe.android.googlepaylauncher.h.b.f25088a
            goto La0
        L9b:
            com.stripe.android.googlepaylauncher.h$c r6 = new com.stripe.android.googlepaylauncher.h$c
            r6.<init>(r7)
        La0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.i.o(int, android.content.Intent, U5.d):java.lang.Object");
    }

    public final Object p(U5.d dVar) {
        return AbstractC3823h.w(this.f25098g.isReady(), dVar);
    }

    public final void q() {
        t(true);
        this.f25104m.d(null);
    }

    public final void r(int i8, Intent data) {
        AbstractC3292y.i(data, "data");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), this.f25101j, null, new h(i8, data, null), 2, null);
    }

    public final void u(com.stripe.android.googlepaylauncher.h result) {
        AbstractC3292y.i(result, "result");
        this.f25102k.d(result);
    }
}
