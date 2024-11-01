package com.stripe.android.payments.paymentlauncher;

import B2.InterfaceC0951c;
import B2.j;
import Q5.I;
import Q5.InterfaceC1412g;
import Q5.p;
import Q5.r;
import Q5.s;
import Q5.t;
import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import android.app.Application;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.a;
import com.stripe.android.view.InterfaceC2668p;
import g3.AbstractC2911j;
import g3.InterfaceC2910i;
import j3.m;
import j6.InterfaceC3214c;
import java.util.List;
import java.util.Map;
import k3.AbstractC3239e;
import k3.C3235a;
import k3.C3237c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.InterfaceC3286s;
import n2.K;
import n6.AbstractC3458i;
import n6.M;
import p3.i;
import q3.AbstractC3637f;
import q3.InterfaceC3639h;
import q6.AbstractC3815N;
import q6.w;
import s3.AbstractC3953e;
import s3.y;
import u3.AbstractC4078b;
import x2.k;
import y5.InterfaceC4247a;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: o, reason: collision with root package name */
    public static final a f26527o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f26528p = 8;

    /* renamed from: q, reason: collision with root package name */
    private static final List f26529q = AbstractC1435t.e("payment_method");

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26530a;

    /* renamed from: b, reason: collision with root package name */
    private final m f26531b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3639h f26532c;

    /* renamed from: d, reason: collision with root package name */
    private final C3235a f26533d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f26534e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f26535f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4247a f26536g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC4247a f26537h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC0951c f26538i;

    /* renamed from: j, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f26539j;

    /* renamed from: k, reason: collision with root package name */
    private final U5.g f26540k;

    /* renamed from: l, reason: collision with root package name */
    private final SavedStateHandle f26541l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f26542m;

    /* renamed from: n, reason: collision with root package name */
    private final w f26543n;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.payments.paymentlauncher.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0557b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26544a;

        /* renamed from: com.stripe.android.payments.paymentlauncher.b$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherContract.a f26545a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaymentLauncherContract.a aVar) {
                super(0);
                this.f26545a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f26545a.h();
            }
        }

        /* renamed from: com.stripe.android.payments.paymentlauncher.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0558b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherContract.a f26546a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0558b(PaymentLauncherContract.a aVar) {
                super(0);
                this.f26546a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f26546a.l();
            }
        }

        public C0557b(Function0 argsSupplier) {
            AbstractC3292y.i(argsSupplier, "argsSupplier");
            this.f26544a = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            PaymentLauncherContract.a aVar = (PaymentLauncherContract.a) this.f26544a.invoke();
            Application a9 = E2.b.a(extras);
            SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            y.a a10 = AbstractC3953e.a().a(a9).d(aVar.a()).c(new a(aVar)).e(new C0558b(aVar)).b(aVar.f()).f(aVar.b()).build().a();
            boolean z8 = false;
            if (aVar instanceof PaymentLauncherContract.a.b) {
                InterfaceC2910i s8 = ((PaymentLauncherContract.a.b) aVar).s();
                if (!(s8 instanceof com.stripe.android.model.b)) {
                    if (!(s8 instanceof com.stripe.android.model.c)) {
                        throw new p();
                    }
                    b a11 = a10.b(z8).a(createSavedStateHandle).build().a();
                    AbstractC3292y.g(a11, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
                    return a11;
                }
                z8 = true;
                b a112 = a10.b(z8).a(createSavedStateHandle).build().a();
                AbstractC3292y.g(a112, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
                return a112;
            }
            if (!(aVar instanceof PaymentLauncherContract.a.c)) {
                if (!(aVar instanceof PaymentLauncherContract.a.d)) {
                    throw new p();
                }
                b a1122 = a10.b(z8).a(createSavedStateHandle).build().a();
                AbstractC3292y.g(a1122, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
                return a1122;
            }
            z8 = true;
            b a11222 = a10.b(z8).a(createSavedStateHandle).build().a();
            AbstractC3292y.g(a11222, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
            return a11222;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26547a;

        /* renamed from: c, reason: collision with root package name */
        int f26549c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26547a = obj;
            this.f26549c |= Integer.MIN_VALUE;
            Object q8 = b.this.q(null, null, this);
            return q8 == V5.b.e() ? q8 : s.a(q8);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f26550a;

        /* renamed from: b, reason: collision with root package name */
        Object f26551b;

        /* renamed from: c, reason: collision with root package name */
        int f26552c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2910i f26554e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2668p f26555f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f26556a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26557b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ StripeIntent f26558c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, StripeIntent stripeIntent, U5.d dVar) {
                super(2, dVar);
                this.f26557b = bVar;
                this.f26558c = stripeIntent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f26557b, this.f26558c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f26556a == 0) {
                    t.b(obj);
                    b.B(this.f26557b, new a.c(this.f26558c), this.f26558c, null, 4, null);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.payments.paymentlauncher.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0559b extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f26559a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26560b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f26561c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f26562d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0559b(b bVar, Throwable th, Map map, U5.d dVar) {
                super(2, dVar);
                this.f26560b = bVar;
                this.f26561c = th;
                this.f26562d = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0559b(this.f26560b, this.f26561c, this.f26562d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f26559a == 0) {
                    t.b(obj);
                    b.B(this.f26560b, new a.d(this.f26561c), null, this.f26562d, 2, null);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0559b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC2910i interfaceC2910i, InterfaceC2668p interfaceC2668p, U5.d dVar) {
            super(2, dVar);
            this.f26554e = interfaceC2910i;
            this.f26555f = interfaceC2668p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f26554e, this.f26555f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String A8;
            Map map;
            Object obj2;
            String id;
            Object e8 = V5.b.e();
            int i8 = this.f26552c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3 && i8 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.f8786a;
                }
                A8 = (String) this.f26551b;
                map = (Map) this.f26550a;
                t.b(obj);
                obj2 = ((s) obj).j();
            } else {
                t.b(obj);
                b.this.f26541l.set("key_has_started", kotlin.coroutines.jvm.internal.b.a(true));
                b.this.f26541l.set("confirm_action_requested", kotlin.coroutines.jvm.internal.b.a(true));
                Map w8 = b.this.w(this.f26554e);
                b.this.y(this.f26554e.A());
                if (b.this.f26542m) {
                    A8 = this.f26554e.A();
                } else {
                    A8 = this.f26554e.A();
                    if (A8 == null || l6.n.T(A8)) {
                        A8 = null;
                    }
                    if (A8 == null) {
                        A8 = b.this.f26533d.a();
                    }
                }
                b bVar = b.this;
                InterfaceC2910i interfaceC2910i = this.f26554e;
                this.f26550a = w8;
                this.f26551b = A8;
                this.f26552c = 1;
                Object q8 = bVar.q(interfaceC2910i, A8, this);
                if (q8 == e8) {
                    return e8;
                }
                map = w8;
                obj2 = q8;
            }
            b bVar2 = b.this;
            InterfaceC2668p interfaceC2668p = this.f26555f;
            Throwable e9 = s.e(obj2);
            if (e9 != null) {
                U5.g gVar = bVar2.f26540k;
                C0559b c0559b = new C0559b(bVar2, e9, map, null);
                this.f26550a = null;
                this.f26551b = null;
                this.f26552c = 4;
                if (AbstractC3458i.g(gVar, c0559b, this) == e8) {
                    return e8;
                }
            } else {
                StripeIntent stripeIntent = (StripeIntent) obj2;
                StripeIntent.a j8 = stripeIntent.j();
                if (j8 != null && (j8 instanceof StripeIntent.a.j.C0487a) && (id = stripeIntent.getId()) != null) {
                    Map map2 = bVar2.f26535f;
                    if (A8 == null) {
                        A8 = "";
                    }
                    map2.put(id, A8);
                }
                if (!stripeIntent.t()) {
                    U5.g gVar2 = bVar2.f26540k;
                    a aVar = new a(bVar2, stripeIntent, null);
                    this.f26550a = null;
                    this.f26551b = null;
                    this.f26552c = 2;
                    if (AbstractC3458i.g(gVar2, aVar, this) == e8) {
                        return e8;
                    }
                } else {
                    AbstractC3637f a9 = bVar2.f26532c.a(stripeIntent);
                    Object obj3 = bVar2.f26534e.get();
                    AbstractC3292y.h(obj3, "get(...)");
                    this.f26550a = null;
                    this.f26551b = null;
                    this.f26552c = 3;
                    if (a9.d(interfaceC2668p, stripeIntent, (j.c) obj3, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f26563a;

        /* renamed from: b, reason: collision with root package name */
        int f26564b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f26566d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2668p f26567e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f26568a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26569b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f26570c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f26571d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Throwable th, Map map, U5.d dVar) {
                super(2, dVar);
                this.f26569b = bVar;
                this.f26570c = th;
                this.f26571d = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f26569b, this.f26570c, this.f26571d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f26568a == 0) {
                    t.b(obj);
                    b.B(this.f26569b, new a.d(this.f26570c), null, this.f26571d, 2, null);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, InterfaceC2668p interfaceC2668p, U5.d dVar) {
            super(2, dVar);
            this.f26566d = str;
            this.f26567e = interfaceC2668p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f26566d, this.f26567e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map x8;
            Object d8;
            Object e8 = V5.b.e();
            int i8 = this.f26564b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.f8786a;
                }
                x8 = (Map) this.f26563a;
                t.b(obj);
                d8 = ((s) obj).j();
            } else {
                t.b(obj);
                b.this.f26541l.set("key_has_started", kotlin.coroutines.jvm.internal.b.a(true));
                b.this.f26541l.set("confirm_action_requested", kotlin.coroutines.jvm.internal.b.a(false));
                x8 = b.this.x(this.f26566d);
                m mVar = b.this.f26531b;
                String str = this.f26566d;
                Object obj2 = b.this.f26534e.get();
                AbstractC3292y.h(obj2, "get(...)");
                this.f26563a = x8;
                this.f26564b = 1;
                d8 = m.a.d(mVar, str, (j.c) obj2, null, this, 4, null);
                if (d8 == e8) {
                    return e8;
                }
            }
            b bVar = b.this;
            InterfaceC2668p interfaceC2668p = this.f26567e;
            Throwable e9 = s.e(d8);
            if (e9 != null) {
                U5.g gVar = bVar.f26540k;
                a aVar = new a(bVar, e9, x8, null);
                this.f26563a = null;
                this.f26564b = 3;
                if (AbstractC3458i.g(gVar, aVar, this) == e8) {
                    return e8;
                }
            } else {
                StripeIntent stripeIntent = (StripeIntent) d8;
                AbstractC3637f a9 = bVar.f26532c.a(stripeIntent);
                Object obj3 = bVar.f26534e.get();
                AbstractC3292y.h(obj3, "get(...)");
                this.f26563a = null;
                this.f26564b = 2;
                if (a9.d(interfaceC2668p, stripeIntent, (j.c) obj3, this) == e8) {
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
    public static final class f extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26572a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3237c f26574c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f26575a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26576b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ K f26577c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, K k8, U5.d dVar) {
                super(2, dVar);
                this.f26576b = bVar;
                this.f26577c = k8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f26576b, this.f26577c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f26575a == 0) {
                    t.b(obj);
                    this.f26576b.C(this.f26577c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.payments.paymentlauncher.b$f$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0560b extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f26578a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26579b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f26580c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0560b(b bVar, Throwable th, U5.d dVar) {
                super(2, dVar);
                this.f26579b = bVar;
                this.f26580c = th;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0560b(this.f26579b, this.f26580c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f26578a == 0) {
                    t.b(obj);
                    b.B(this.f26579b, new a.d(this.f26580c), null, null, 6, null);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0560b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3237c c3237c, U5.d dVar) {
            super(2, dVar);
            this.f26574c = c3237c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f26574c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3239e abstractC3239e;
            Object p8;
            Object e8 = V5.b.e();
            int i8 = this.f26572a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.f8786a;
                }
                t.b(obj);
                p8 = ((s) obj).j();
            } else {
                t.b(obj);
                if (b.this.f26530a) {
                    abstractC3239e = (AbstractC3239e) b.this.f26536g.get();
                } else {
                    abstractC3239e = (AbstractC3239e) b.this.f26537h.get();
                }
                C3237c c3237c = this.f26574c;
                this.f26572a = 1;
                p8 = abstractC3239e.p(c3237c, this);
                if (p8 == e8) {
                    return e8;
                }
            }
            b bVar = b.this;
            Throwable e9 = s.e(p8);
            if (e9 == null) {
                U5.g gVar = bVar.f26540k;
                a aVar = new a(bVar, (K) p8, null);
                this.f26572a = 2;
                if (AbstractC3458i.g(gVar, aVar, this) == e8) {
                    return e8;
                }
            } else {
                U5.g gVar2 = bVar.f26540k;
                C0560b c0560b = new C0560b(bVar, e9, null);
                this.f26572a = 3;
                if (AbstractC3458i.g(gVar2, c0560b, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class g implements ActivityResultCallback, InterfaceC3286s {
        g() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(C3237c p02) {
            AbstractC3292y.i(p02, "p0");
            b.this.z(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return new C3289v(1, b.this, b.class, "onPaymentFlowResult", "onPaymentFlowResult$payments_core_release(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements DefaultLifecycleObserver {
        h() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3292y.i(owner, "owner");
            b.this.f26532c.c();
            androidx.lifecycle.c.b(this, owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.c(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.d(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.e(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.f(this, lifecycleOwner);
        }
    }

    public b(boolean z8, m stripeApiRepository, InterfaceC3639h nextActionHandlerRegistry, C3235a defaultReturnUrl, N5.a apiRequestOptionsProvider, Map threeDs1IntentReturnUrlMap, InterfaceC4247a lazyPaymentIntentFlowResultProcessor, InterfaceC4247a lazySetupIntentFlowResultProcessor, InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, U5.g uiContext, SavedStateHandle savedStateHandle, boolean z9) {
        AbstractC3292y.i(stripeApiRepository, "stripeApiRepository");
        AbstractC3292y.i(nextActionHandlerRegistry, "nextActionHandlerRegistry");
        AbstractC3292y.i(defaultReturnUrl, "defaultReturnUrl");
        AbstractC3292y.i(apiRequestOptionsProvider, "apiRequestOptionsProvider");
        AbstractC3292y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        AbstractC3292y.i(lazyPaymentIntentFlowResultProcessor, "lazyPaymentIntentFlowResultProcessor");
        AbstractC3292y.i(lazySetupIntentFlowResultProcessor, "lazySetupIntentFlowResultProcessor");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(uiContext, "uiContext");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        this.f26530a = z8;
        this.f26531b = stripeApiRepository;
        this.f26532c = nextActionHandlerRegistry;
        this.f26533d = defaultReturnUrl;
        this.f26534e = apiRequestOptionsProvider;
        this.f26535f = threeDs1IntentReturnUrlMap;
        this.f26536g = lazyPaymentIntentFlowResultProcessor;
        this.f26537h = lazySetupIntentFlowResultProcessor;
        this.f26538i = analyticsRequestExecutor;
        this.f26539j = paymentAnalyticsRequestFactory;
        this.f26540k = uiContext;
        this.f26541l = savedStateHandle;
        this.f26542m = z9;
        this.f26543n = AbstractC3815N.a(null);
    }

    private final void A(com.stripe.android.payments.paymentlauncher.a aVar, StripeIntent stripeIntent, Map map) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        String str;
        String str2;
        Map h8;
        o r8;
        o.p pVar;
        StripeIntent.Status status;
        String d8;
        w wVar = this.f26543n;
        if (s()) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f26033C;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f26037E;
        }
        String str3 = null;
        if (stripeIntent != null && (d8 = stripeIntent.d()) != null) {
            str = AbstractC4078b.a(d8);
        } else {
            str = null;
        }
        r a9 = x.a("intent_id", str);
        if (stripeIntent != null && (status = stripeIntent.getStatus()) != null) {
            str2 = status.b();
        } else {
            str2 = null;
        }
        r a10 = x.a(NotificationCompat.CATEGORY_STATUS, str2);
        if (stripeIntent != null && (r8 = stripeIntent.r()) != null && (pVar = r8.f25635e) != null) {
            str3 = pVar.f25773a;
        }
        Map a11 = B4.b.a(Q.k(a9, a10, x.a("payment_method_type", str3)));
        if (aVar instanceof a.d) {
            h8 = i.f36196a.d(k.f40948e.b(((a.d) aVar).b()));
        } else {
            h8 = Q.h();
        }
        this.f26538i.a(this.f26539j.g(paymentAnalyticsEvent, Q.q(Q.q(map, a11), h8)));
        wVar.setValue(aVar);
    }

    static /* synthetic */ void B(b bVar, com.stripe.android.payments.paymentlauncher.a aVar, StripeIntent stripeIntent, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            stripeIntent = null;
        }
        if ((i8 & 4) != 0) {
            map = Q.h();
        }
        bVar.A(aVar, stripeIntent, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(K k8) {
        com.stripe.android.payments.paymentlauncher.a cVar;
        int h8 = k8.h();
        if (h8 != 1) {
            if (h8 != 2) {
                if (h8 != 3) {
                    if (h8 != 4) {
                        cVar = new a.d(new x2.h("Payment fails due to unknown error. \n" + k8.b(), "unknownIntentOutcomeError"));
                    } else {
                        cVar = new a.d(new x2.h("Payment fails due to time out. \n" + k8.b(), "timedOutIntentOutcomeError"));
                    }
                } else {
                    cVar = a.C0553a.f26524b;
                }
            } else {
                cVar = new a.d(new x2.h(k8.b(), "failedIntentOutcomeError"));
            }
        } else {
            cVar = new a.c(k8.f());
        }
        B(this, cVar, k8.f(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(g3.InterfaceC2910i r6, java.lang.String r7, U5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.payments.paymentlauncher.b.c
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.payments.paymentlauncher.b$c r0 = (com.stripe.android.payments.paymentlauncher.b.c) r0
            int r1 = r0.f26549c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26549c = r1
            goto L18
        L13:
            com.stripe.android.payments.paymentlauncher.b$c r0 = new com.stripe.android.payments.paymentlauncher.b$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26547a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26549c
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
            goto L83
        L3b:
            Q5.t.b(r8)
            r6.V(r7)
            g3.i r6 = r6.E(r4)
            boolean r7 = r6 instanceof com.stripe.android.model.b
            java.lang.String r8 = "get(...)"
            if (r7 == 0) goto L65
            j3.m r7 = r5.f26531b
            com.stripe.android.model.b r6 = (com.stripe.android.model.b) r6
            N5.a r2 = r5.f26534e
            java.lang.Object r2 = r2.get()
            kotlin.jvm.internal.AbstractC3292y.h(r2, r8)
            B2.j$c r2 = (B2.j.c) r2
            java.util.List r8 = com.stripe.android.payments.paymentlauncher.b.f26529q
            r0.f26549c = r4
            java.lang.Object r6 = r7.m(r6, r2, r8, r0)
            if (r6 != r1) goto L83
            return r1
        L65:
            boolean r7 = r6 instanceof com.stripe.android.model.c
            if (r7 == 0) goto L84
            j3.m r7 = r5.f26531b
            com.stripe.android.model.c r6 = (com.stripe.android.model.c) r6
            N5.a r2 = r5.f26534e
            java.lang.Object r2 = r2.get()
            kotlin.jvm.internal.AbstractC3292y.h(r2, r8)
            B2.j$c r2 = (B2.j.c) r2
            java.util.List r8 = com.stripe.android.payments.paymentlauncher.b.f26529q
            r0.f26549c = r3
            java.lang.Object r6 = r7.h(r6, r2, r8, r0)
            if (r6 != r1) goto L83
            return r1
        L83:
            return r6
        L84:
            Q5.p r6 = new Q5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.b.q(g3.i, java.lang.String, U5.d):java.lang.Object");
    }

    private final boolean s() {
        Boolean bool = (Boolean) this.f26541l.get("confirm_action_requested");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean t() {
        Boolean bool = (Boolean) this.f26541l.get("key_has_started");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map w(InterfaceC2910i interfaceC2910i) {
        String str;
        com.stripe.android.model.p a9 = AbstractC2911j.a(interfaceC2910i);
        if (a9 != null) {
            str = a9.p();
        } else {
            str = null;
        }
        Map a10 = B4.b.a(Q.k(x.a("payment_method_type", str), x.a("intent_id", AbstractC4078b.a(interfaceC2910i.d()))));
        this.f26538i.a(this.f26539j.g(PaymentAnalyticsEvent.f26031B, a10));
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map x(String str) {
        Map e8 = Q.e(x.a("intent_id", AbstractC4078b.a(str)));
        this.f26538i.a(this.f26539j.g(PaymentAnalyticsEvent.f26035D, e8));
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (AbstractC3292y.d(str, this.f26533d.a())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f26049O;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f26048N;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f26050P;
        }
        this.f26538i.a(PaymentAnalyticsRequestFactory.v(this.f26539j, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    public final void D(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        AbstractC3292y.i(lifecycleOwner, "lifecycleOwner");
        this.f26532c.b(activityResultCaller, new g());
        lifecycleOwner.getLifecycle().addObserver(new h());
    }

    public final void r(InterfaceC2910i confirmStripeIntentParams, InterfaceC2668p host) {
        AbstractC3292y.i(confirmStripeIntentParams, "confirmStripeIntentParams");
        AbstractC3292y.i(host, "host");
        if (t()) {
            return;
        }
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), null, null, new d(confirmStripeIntentParams, host, null), 3, null);
    }

    public final w u() {
        return this.f26543n;
    }

    public final void v(String clientSecret, InterfaceC2668p host) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        AbstractC3292y.i(host, "host");
        if (t()) {
            return;
        }
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), null, null, new e(clientSecret, host, null), 3, null);
    }

    public final void z(C3237c paymentFlowResult) {
        AbstractC3292y.i(paymentFlowResult, "paymentFlowResult");
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), null, null, new f(paymentFlowResult, null), 3, null);
    }
}
