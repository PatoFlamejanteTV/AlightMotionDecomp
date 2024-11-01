package com.stripe.android.view;

import Q5.s;
import R5.AbstractC1435t;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import j6.InterfaceC3214c;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.InterfaceC3398a;
import o2.C3522d;
import o2.C3525g;
import o2.InterfaceC3521c;

/* renamed from: com.stripe.android.view.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2660l extends AndroidViewModel {

    /* renamed from: g, reason: collision with root package name */
    private static final a f29088g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f29089h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f29090a;

    /* renamed from: b, reason: collision with root package name */
    private final n2.I f29091b;

    /* renamed from: c, reason: collision with root package name */
    private final C2644d f29092c;

    /* renamed from: d, reason: collision with root package name */
    private final C4.a f29093d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3521c f29094e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f29095f;

    /* renamed from: com.stripe.android.view.l$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.l$b */
    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final n2.I f29096a;

        /* renamed from: b, reason: collision with root package name */
        private final C2644d f29097b;

        public b(n2.I stripe, C2644d args) {
            AbstractC3292y.i(stripe, "stripe");
            AbstractC3292y.i(args, "args");
            this.f29096a = stripe;
            this.f29097b = args;
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
            return new C2660l(E2.b.a(extras), SavedStateHandleSupport.createSavedStateHandle(extras), this.f29096a, this.f29097b, null, null, 48, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.l$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29098a;

        /* renamed from: b, reason: collision with root package name */
        Object f29099b;

        /* renamed from: c, reason: collision with root package name */
        Object f29100c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f29101d;

        /* renamed from: f, reason: collision with root package name */
        int f29103f;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29101d = obj;
            this.f29103f |= Integer.MIN_VALUE;
            Object a9 = C2660l.this.a(null, null, this);
            return a9 == V5.b.e() ? a9 : Q5.s.a(a9);
        }
    }

    /* renamed from: com.stripe.android.view.l$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U5.d f29104a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2660l f29105b;

        d(U5.d dVar, C2660l c2660l) {
            this.f29104a = dVar;
            this.f29105b = c2660l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.l$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29106a;

        /* renamed from: b, reason: collision with root package name */
        Object f29107b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29108c;

        /* renamed from: e, reason: collision with root package name */
        int f29110e;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29108c = obj;
            this.f29110e |= Integer.MIN_VALUE;
            Object b9 = C2660l.this.b(null, this);
            return b9 == V5.b.e() ? b9 : Q5.s.a(b9);
        }
    }

    /* renamed from: com.stripe.android.view.l$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3398a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U5.d f29111a;

        f(U5.d dVar) {
            this.f29111a = dVar;
        }

        @Override // n2.InterfaceC3398a
        public void a(Exception e8) {
            AbstractC3292y.i(e8, "e");
            U5.d dVar = this.f29111a;
            s.a aVar = Q5.s.f8810b;
            dVar.resumeWith(Q5.s.b(Q5.s.a(Q5.s.b(Q5.t.a(e8)))));
        }

        @Override // n2.InterfaceC3398a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(com.stripe.android.model.o result) {
            AbstractC3292y.i(result, "result");
            this.f29111a.resumeWith(Q5.s.b(Q5.s.a(Q5.s.b(result))));
        }
    }

    public /* synthetic */ C2660l(Application application, SavedStateHandle savedStateHandle, n2.I i8, C2644d c2644d, C4.a aVar, InterfaceC3521c interfaceC3521c, int i9, AbstractC3284p abstractC3284p) {
        this(application, savedStateHandle, i8, c2644d, (i9 & 16) != 0 ? C4.b.f980a.a() : aVar, (i9 & 32) != 0 ? C3522d.f35921a.a(application) : interfaceC3521c);
    }

    private final boolean c() {
        Boolean bool = (Boolean) this.f29090a.get("FROM_INTERACTED_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean d() {
        Boolean bool = (Boolean) this.f29090a.get("FROM_SHOWN_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void i(boolean z8) {
        this.f29090a.set("FROM_INTERACTED_EVENT_REPORTED", Boolean.valueOf(z8));
    }

    private final void j(boolean z8) {
        this.f29090a.set("FROM_SHOWN_EVENT_REPORTED", Boolean.valueOf(z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object a(n2.AbstractC3403f r5, com.stripe.android.model.o r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.view.C2660l.c
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.view.l$c r0 = (com.stripe.android.view.C2660l.c) r0
            int r1 = r0.f29103f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29103f = r1
            goto L18
        L13:
            com.stripe.android.view.l$c r0 = new com.stripe.android.view.l$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29101d
            V5.b.e()
            int r1 = r0.f29103f
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 != r2) goto L3b
            java.lang.Object r5 = r0.f29100c
            com.stripe.android.model.o r5 = (com.stripe.android.model.o) r5
            java.lang.Object r5 = r0.f29099b
            android.support.v4.media.a.a(r5)
            java.lang.Object r5 = r0.f29098a
            com.stripe.android.view.l r5 = (com.stripe.android.view.C2660l) r5
            Q5.t.b(r7)
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r5 = r7.j()
            return r5
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            Q5.t.b(r7)
            r0.f29098a = r4
            r0.f29099b = r5
            r0.f29100c = r6
            r0.f29103f = r2
            U5.i r5 = new U5.i
            U5.d r7 = V5.b.c(r0)
            r5.<init>(r7)
            java.lang.String r6 = r6.f25631a
            com.stripe.android.view.l$d r6 = new com.stripe.android.view.l$d
            r6.<init>(r5, r4)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2660l.a(n2.f, com.stripe.android.model.o, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.stripe.android.model.p r11, U5.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.stripe.android.view.C2660l.e
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.view.l$e r0 = (com.stripe.android.view.C2660l.e) r0
            int r1 = r0.f29110e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29110e = r1
            goto L18
        L13:
            com.stripe.android.view.l$e r0 = new com.stripe.android.view.l$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f29108c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f29110e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.f29107b
            com.stripe.android.model.p r11 = (com.stripe.android.model.p) r11
            java.lang.Object r11 = r0.f29106a
            com.stripe.android.view.l r11 = (com.stripe.android.view.C2660l) r11
            Q5.t.b(r12)
            goto L6d
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            Q5.t.b(r12)
            r0.f29106a = r10
            r0.f29107b = r11
            r0.f29110e = r3
            U5.i r12 = new U5.i
            U5.d r2 = V5.b.c(r0)
            r12.<init>(r2)
            n2.I r3 = r10.f29091b
            com.stripe.android.model.p r4 = r10.k(r11)
            com.stripe.android.view.l$f r7 = new com.stripe.android.view.l$f
            r7.<init>(r12)
            r8 = 6
            r9 = 0
            r5 = 0
            r6 = 0
            n2.I.e(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r12 = r12.a()
            java.lang.Object r11 = V5.b.e()
            if (r12 != r11) goto L6a
            kotlin.coroutines.jvm.internal.h.c(r0)
        L6a:
            if (r12 != r1) goto L6d
            return r1
        L6d:
            Q5.s r12 = (Q5.s) r12
            java.lang.Object r11 = r12.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2660l.b(com.stripe.android.model.p, U5.d):java.lang.Object");
    }

    public final void e() {
        this.f29094e.a();
    }

    public final void f() {
        if (!c()) {
            this.f29094e.e(this.f29092c.h().f25773a);
            i(true);
        }
    }

    public final void g() {
        if (!d()) {
            this.f29094e.b(this.f29092c.h().f25773a);
            j(true);
        }
    }

    public final void h() {
        this.f29094e.d(this.f29092c.h().f25773a);
    }

    public final com.stripe.android.model.p k(com.stripe.android.model.p params) {
        com.stripe.android.model.p f8;
        AbstractC3292y.i(params, "params");
        f8 = params.f((r38 & 1) != 0 ? params.f25806a : null, (r38 & 2) != 0 ? params.f25807b : false, (r38 & 4) != 0 ? params.f25808c : null, (r38 & 8) != 0 ? params.f25809d : null, (r38 & 16) != 0 ? params.f25810e : null, (r38 & 32) != 0 ? params.f25811f : null, (r38 & 64) != 0 ? params.f25812g : null, (r38 & 128) != 0 ? params.f25813h : null, (r38 & 256) != 0 ? params.f25814i : null, (r38 & 512) != 0 ? params.f25815j : null, (r38 & 1024) != 0 ? params.f25816k : null, (r38 & 2048) != 0 ? params.f25817l : null, (r38 & 4096) != 0 ? params.f25818m : null, (r38 & 8192) != 0 ? params.f25819n : null, (r38 & 16384) != 0 ? params.f25820o : null, (r38 & 32768) != 0 ? params.f25821p : null, (r38 & 65536) != 0 ? params.f25822q : null, (r38 & 131072) != 0 ? params.f25823r : null, (r38 & 262144) != 0 ? params.f25824s : this.f29095f, (r38 & 524288) != 0 ? params.f25825t : null);
        return f8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2660l(Application application, SavedStateHandle savedStateHandle, n2.I stripe, C2644d args, C4.a errorMessageTranslator, InterfaceC3521c eventReporter) {
        super(application);
        AbstractC3292y.i(application, "application");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(stripe, "stripe");
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(errorMessageTranslator, "errorMessageTranslator");
        AbstractC3292y.i(eventReporter, "eventReporter");
        this.f29090a = savedStateHandle;
        this.f29091b = stripe;
        this.f29092c = args;
        this.f29093d = errorMessageTranslator;
        this.f29094e = eventReporter;
        this.f29095f = AbstractC1435t.b1(AbstractC1435t.r("AddPaymentMethodActivity", args.p() ? "PaymentSession" : null));
        C3525g.f35925a.c(this, savedStateHandle);
        if (d()) {
            return;
        }
        eventReporter.b(args.h().f25773a);
        j(true);
    }
}
