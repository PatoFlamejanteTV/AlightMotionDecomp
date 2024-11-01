package com.stripe.android.payments.paymentlauncher;

import Q5.C1413h;
import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.s;
import Q5.t;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.a;
import com.stripe.android.payments.paymentlauncher.b;
import com.stripe.android.view.InterfaceC2668p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.M;
import p3.i;
import q6.InterfaceC3822g;
import q6.w;
import x2.k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentLauncherConfirmationActivity extends AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final a f26479d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f26480e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f26481a = l.b(new f());

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f26482b = new b.C0557b(new h());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f26483c = new ViewModelLazy(U.b(com.stripe.android.payments.paymentlauncher.b.class), new d(this), new g(), new e(null, this));

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26484a = new b();

        b() {
            super(1);
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3292y.i(addCallback, "$this$addCallback");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26485a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherConfirmationActivity f26487a;

            a(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity) {
                this.f26487a = paymentLauncherConfirmationActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.paymentlauncher.a aVar, U5.d dVar) {
                if (aVar != null) {
                    this.f26487a.m(aVar);
                }
                return I.f8786a;
            }
        }

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26485a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                w u8 = PaymentLauncherConfirmationActivity.this.o().u();
                a aVar = new a(PaymentLauncherConfirmationActivity.this);
                this.f26485a = 1;
                if (u8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26488a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f26488a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26488a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26489a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26490b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26489a = function0;
            this.f26490b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26489a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26490b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentLauncherContract.a invoke() {
            PaymentLauncherContract.a.C0549a c0549a = PaymentLauncherContract.a.f26494g;
            Intent intent = PaymentLauncherConfirmationActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            return c0549a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PaymentLauncherConfirmationActivity.this.p();
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentLauncherContract.a invoke() {
            PaymentLauncherContract.a n8 = PaymentLauncherConfirmationActivity.this.n();
            if (n8 != null) {
                return n8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(com.stripe.android.payments.paymentlauncher.a aVar) {
        setResult(-1, new Intent().putExtras(aVar.a()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentLauncherContract.a n() {
        return (PaymentLauncherContract.a) this.f26481a.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        A4.c.a(this);
    }

    public final com.stripe.android.payments.paymentlauncher.b o() {
        return (com.stripe.android.payments.paymentlauncher.b) this.f26483c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b9;
        PaymentLauncherContract.a n8;
        super.onCreate(bundle);
        try {
            s.a aVar = s.f8810b;
            n8 = n();
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        if (n8 != null) {
            b9 = s.b(n8);
            Throwable e8 = s.e(b9);
            if (e8 == null) {
                PaymentLauncherContract.a aVar3 = (PaymentLauncherContract.a) b9;
                OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
                AbstractC3292y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
                OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, b.f26484a, 3, null);
                AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
                o().D(this, this);
                InterfaceC2668p a9 = InterfaceC2668p.f29141a.a(this, aVar3.i());
                if (aVar3 instanceof PaymentLauncherContract.a.b) {
                    o().r(((PaymentLauncherContract.a.b) aVar3).s(), a9);
                    return;
                } else if (aVar3 instanceof PaymentLauncherContract.a.c) {
                    o().v(((PaymentLauncherContract.a.c) aVar3).s(), a9);
                    return;
                } else {
                    if (aVar3 instanceof PaymentLauncherContract.a.d) {
                        o().v(((PaymentLauncherContract.a.d) aVar3).s(), a9);
                        return;
                    }
                    return;
                }
            }
            m(new a.d(e8));
            i.a aVar4 = i.f36196a;
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar4, applicationContext, null, 2, null), i.d.f36211o, k.f40948e.b(e8), null, 4, null);
            return;
        }
        throw new IllegalArgumentException("PaymentLauncherConfirmationActivity was started without arguments".toString());
    }

    public final ViewModelProvider.Factory p() {
        return this.f26482b;
    }
}
