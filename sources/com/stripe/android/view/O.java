package com.stripe.android.view;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.view.O;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.C3445b0;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class O extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f28690a;

    /* renamed from: b, reason: collision with root package name */
    private final j3.m f28691b;

    /* renamed from: c, reason: collision with root package name */
    private final n6.I f28692c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.w f28693d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f28694e;

    /* renamed from: f, reason: collision with root package name */
    private String f28695f;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Context f28696a;

        /* renamed from: com.stripe.android.view.O$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0688a extends AbstractC3293z implements Function0 {
            C0688a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return n2.r.f35413c.a(a.this.c()).f();
            }
        }

        public a(Context context) {
            AbstractC3292y.i(context, "context");
            this.f28696a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n2.r b(a this$0) {
            AbstractC3292y.i(this$0, "this$0");
            return n2.r.f35413c.a(this$0.f28696a);
        }

        public final Context c() {
            return this.f28696a;
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
            return new O(new N5.a() { // from class: com.stripe.android.view.N
                @Override // N5.a
                public final Object get() {
                    n2.r b9;
                    b9 = O.a.b(O.a.this);
                    return b9;
                }
            }, new com.stripe.android.networking.a(this.f28696a, new C0688a(), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null), 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f28698a;

        /* renamed from: c, reason: collision with root package name */
        int f28700c;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28698a = obj;
            this.f28700c |= Integer.MIN_VALUE;
            return O.this.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f28701a;

        /* renamed from: b, reason: collision with root package name */
        int f28702b;

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            q6.w wVar;
            Object e8 = V5.b.e();
            int i8 = this.f28702b;
            if (i8 != 0) {
                if (i8 == 1) {
                    wVar = (q6.w) this.f28701a;
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                q6.w wVar2 = O.this.f28693d;
                O o8 = O.this;
                this.f28701a = wVar2;
                this.f28702b = 1;
                Object c8 = o8.c(this);
                if (c8 == e8) {
                    return e8;
                }
                wVar = wVar2;
                obj = c8;
            }
            wVar.setValue(obj);
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public /* synthetic */ O(N5.a aVar, j3.m mVar, n6.I i8, int i9, AbstractC3284p abstractC3284p) {
        this(aVar, mVar, (i9 & 4) != 0 ? C3445b0.b() : i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(U5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.stripe.android.view.O.b
            if (r0 == 0) goto L13
            r0 = r13
            com.stripe.android.view.O$b r0 = (com.stripe.android.view.O.b) r0
            int r1 = r0.f28700c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28700c = r1
            goto L18
        L13:
            com.stripe.android.view.O$b r0 = new com.stripe.android.view.O$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f28698a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f28700c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            Q5.t.b(r13)
            Q5.s r13 = (Q5.s) r13
            java.lang.Object r13 = r13.j()
            goto L71
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            Q5.t.b(r13)
            N5.a r13 = r12.f28690a
            java.lang.Object r13 = r13.get()
            n2.r r13 = (n2.r) r13
            j3.m r2 = r12.f28691b
            B2.j$c r11 = new B2.j$c
            java.lang.String r6 = r13.f()
            java.lang.String r7 = r13.h()
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r13 = r12.e()
            if (r13 == 0) goto L67
            java.lang.String r5 = "on_behalf_of"
            Q5.r r13 = Q5.x.a(r5, r13)
            java.util.Map r13 = R5.Q.e(r13)
            goto L68
        L67:
            r13 = r3
        L68:
            r0.f28700c = r4
            java.lang.Object r13 = r2.e(r11, r13, r0)
            if (r13 != r1) goto L71
            return r1
        L71:
            boolean r0 = Q5.s.g(r13)
            if (r0 == 0) goto L78
            goto L79
        L78:
            r3 = r13
        L79:
            g3.B r3 = (g3.C2892B) r3
            r13 = 0
            if (r3 == 0) goto L8b
            g3.B$a r0 = r3.a()
            if (r0 == 0) goto L8b
            boolean r0 = r0.a()
            if (r0 == 0) goto L8b
            goto L8c
        L8b:
            r4 = 0
        L8c:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.O.c(U5.d):java.lang.Object");
    }

    private final void d() {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), this.f28692c, null, new c(null), 2, null);
    }

    public final String e() {
        return this.f28695f;
    }

    public final InterfaceC3813L f() {
        return this.f28694e;
    }

    public final void g(String str) {
        this.f28695f = str;
        d();
    }

    public O(N5.a paymentConfigProvider, j3.m stripeRepository, n6.I dispatcher) {
        AbstractC3292y.i(paymentConfigProvider, "paymentConfigProvider");
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(dispatcher, "dispatcher");
        this.f28690a = paymentConfigProvider;
        this.f28691b = stripeRepository;
        this.f28692c = dispatcher;
        q6.w a9 = AbstractC3815N.a(Boolean.FALSE);
        this.f28693d = a9;
        this.f28694e = a9;
        d();
    }
}
