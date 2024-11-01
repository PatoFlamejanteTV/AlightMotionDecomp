package com.stripe.android.view;

import Q5.C1413h;
import Q5.InterfaceC1412g;
import Q5.InterfaceC1416k;
import Q5.s;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.util.LinkifyCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;
import com.stripe.android.model.o;
import com.stripe.android.view.AbstractC2646e;
import com.stripe.android.view.C0;
import com.stripe.android.view.D0;
import com.stripe.android.view.InterfaceC2664n;
import com.stripe.android.view.v0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.InterfaceC3286s;
import n2.AbstractC3390A;
import n2.AbstractC3403f;
import n6.AbstractC3462k;
import q6.InterfaceC3822g;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentMethodsActivity extends AppCompatActivity {

    /* renamed from: j, reason: collision with root package name */
    public static final a f28759j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f28760k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f28761a = Q5.l.b(new s());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f28762b = Q5.l.b(new r());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f28763c = Q5.l.b(new f());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1416k f28764d = Q5.l.b(new e());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1416k f28765e = Q5.l.b(new c());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1416k f28766f = Q5.l.b(new d());

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1416k f28767g = new ViewModelLazy(kotlin.jvm.internal.U.b(D0.class), new p(this), new t(), new q(null, this));

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1416k f28768h = Q5.l.b(new b());

    /* renamed from: i, reason: collision with root package name */
    private boolean f28769i;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0 invoke() {
            return new C0(PaymentMethodsActivity.this.y(), PaymentMethodsActivity.this.y().l(), PaymentMethodsActivity.this.D().g(), PaymentMethodsActivity.this.y().s(), PaymentMethodsActivity.this.y().u(), PaymentMethodsActivity.this.y().f());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2664n.a invoke() {
            return new InterfaceC2664n.a(PaymentMethodsActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke() {
            v0.a aVar = v0.f29223l;
            Intent intent = PaymentMethodsActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            return aVar.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2681z invoke() {
            return new C2681z(PaymentMethodsActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        public final Object a() {
            try {
                s.a aVar = Q5.s.f8810b;
                AbstractC3403f.f35323a.a();
                return Q5.s.b(null);
            } catch (Throwable th) {
                s.a aVar2 = Q5.s.f8810b;
                return Q5.s.b(Q5.t.a(th));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Q5.s.a(a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28775a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentMethodsActivity f28777a;

            a(PaymentMethodsActivity paymentMethodsActivity) {
                this.f28777a = paymentMethodsActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Q5.s sVar, U5.d dVar) {
                String message;
                if (sVar != null) {
                    Object j8 = sVar.j();
                    PaymentMethodsActivity paymentMethodsActivity = this.f28777a;
                    Throwable e8 = Q5.s.e(j8);
                    if (e8 == null) {
                        paymentMethodsActivity.w().z((List) j8);
                    } else {
                        InterfaceC2664n x8 = paymentMethodsActivity.x();
                        if (e8 instanceof x2.k) {
                            x2.k kVar = (x2.k) e8;
                            message = C4.b.f980a.a().a(kVar.c(), e8.getMessage(), kVar.d());
                        } else {
                            message = e8.getMessage();
                            if (message == null) {
                                message = "";
                            }
                        }
                        x8.show(message);
                    }
                }
                return Q5.I.f8786a;
            }
        }

        g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f28775a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                q6.w d8 = PaymentMethodsActivity.this.D().d();
                a aVar = new a(PaymentMethodsActivity.this);
                this.f28775a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5537invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5537invoke() {
            PaymentMethodsActivity.this.y();
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3292y.i(addCallback, "$this$addCallback");
            PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
            paymentMethodsActivity.u(paymentMethodsActivity.w().p(), 0);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28780a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentMethodsActivity f28782a;

            a(PaymentMethodsActivity paymentMethodsActivity) {
                this.f28782a = paymentMethodsActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, U5.d dVar) {
                if (str != null) {
                    Snackbar.make(this.f28782a.C().f5356b, str, -1).show();
                }
                return Q5.I.f8786a;
            }
        }

        j(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f28780a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                q6.w h8 = PaymentMethodsActivity.this.D().h();
                a aVar = new a(PaymentMethodsActivity.this);
                this.f28780a = 1;
                if (h8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28783a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentMethodsActivity f28785a;

            a(PaymentMethodsActivity paymentMethodsActivity) {
                this.f28785a = paymentMethodsActivity;
            }

            public final Object b(boolean z8, U5.d dVar) {
                int i8;
                LinearProgressIndicator progressBar = this.f28785a.C().f5358d;
                AbstractC3292y.h(progressBar, "progressBar");
                if (z8) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                progressBar.setVisibility(i8);
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        k(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f28783a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                q6.w f8 = PaymentMethodsActivity.this.D().f();
                a aVar = new a(PaymentMethodsActivity.this);
                this.f28783a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class l implements ActivityResultCallback, InterfaceC3286s {
        l() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(AbstractC2646e p02) {
            AbstractC3292y.i(p02, "p0");
            PaymentMethodsActivity.this.F(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return new C3289v(1, PaymentMethodsActivity.this, PaymentMethodsActivity.class, "onAddPaymentMethodResult", "onAddPaymentMethodResult$payments_core_release(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements C0.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f28788b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2641b0 f28789c;

        m(ActivityResultLauncher activityResultLauncher, C2641b0 c2641b0) {
            this.f28788b = activityResultLauncher;
            this.f28789c = c2641b0;
        }

        @Override // com.stripe.android.view.C0.b
        public void a(com.stripe.android.model.o paymentMethod) {
            AbstractC3292y.i(paymentMethod, "paymentMethod");
            this.f28789c.d(paymentMethod).show();
        }

        @Override // com.stripe.android.view.C0.b
        public void b() {
            PaymentMethodsActivity.this.t();
        }

        @Override // com.stripe.android.view.C0.b
        public void c(C2644d args) {
            AbstractC3292y.i(args, "args");
            this.f28788b.launch(args);
        }

        @Override // com.stripe.android.view.C0.b
        public void d(com.stripe.android.model.o paymentMethod) {
            AbstractC3292y.i(paymentMethod, "paymentMethod");
            PaymentMethodsActivity.this.C().f5359e.setTappedPaymentMethod$payments_core_release(paymentMethod);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements Function1 {
        n() {
            super(1);
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3292y.i(it, "it");
            PaymentMethodsActivity.v(PaymentMethodsActivity.this, it, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3293z implements Function1 {
        o() {
            super(1);
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3292y.i(it, "it");
            PaymentMethodsActivity.this.D().j(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28792a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f28792a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28792a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28793a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28794b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28793a = function0;
            this.f28794b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28793a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28794b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends AbstractC3293z implements Function0 {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(PaymentMethodsActivity.this.y().w());
        }
    }

    /* loaded from: classes4.dex */
    static final class s extends AbstractC3293z implements Function0 {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L2.q invoke() {
            L2.q c8 = L2.q.c(PaymentMethodsActivity.this.getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class t extends AbstractC3293z implements Function0 {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            Application application = PaymentMethodsActivity.this.getApplication();
            AbstractC3292y.h(application, "getApplication(...)");
            return new D0.a(application, PaymentMethodsActivity.this.A(), PaymentMethodsActivity.this.y().h(), PaymentMethodsActivity.this.B());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A() {
        return ((Q5.s) this.f28763c.getValue()).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B() {
        return ((Boolean) this.f28762b.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D0 D() {
        return (D0) this.f28767g.getValue();
    }

    private final void E() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
    }

    private final void G(com.stripe.android.model.o oVar) {
        o.p pVar = oVar.f25635e;
        if (pVar != null && pVar.f25774b) {
            D().i(oVar);
        } else {
            v(this, oVar, 0, 2, null);
        }
    }

    private final void H(ActivityResultLauncher activityResultLauncher) {
        C2641b0 c2641b0 = new C2641b0(this, w(), z(), A(), D().e(), new o());
        w().y(new m(activityResultLauncher, c2641b0));
        C().f5359e.setAdapter(w());
        C().f5359e.setPaymentMethodSelectedCallback$payments_core_release(new n());
        if (y().f()) {
            C().f5359e.a(new t0(this, w(), new R0(c2641b0)));
        }
    }

    private final View s(ViewGroup viewGroup) {
        if (y().p() > 0) {
            View inflate = getLayoutInflater().inflate(y().p(), viewGroup, false);
            inflate.setId(AbstractC3390A.f35110V);
            if (inflate instanceof TextView) {
                TextView textView = (TextView) inflate;
                LinkifyCompat.addLinks(textView, 15);
                ViewCompat.enableAccessibleClickableSpanSupport(inflate);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return inflate;
            }
            return inflate;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        setResult(-1, new Intent().putExtras(new w0(null, true, 1, null).a()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(com.stripe.android.model.o oVar, int i8) {
        boolean z8;
        Intent intent = new Intent();
        if (y().u() && oVar == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        intent.putExtras(new w0(oVar, z8).a());
        Q5.I i9 = Q5.I.f8786a;
        setResult(i8, intent);
        finish();
    }

    static /* synthetic */ void v(PaymentMethodsActivity paymentMethodsActivity, com.stripe.android.model.o oVar, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = -1;
        }
        paymentMethodsActivity.u(oVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 w() {
        return (C0) this.f28768h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2664n x() {
        return (InterfaceC2664n) this.f28765e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v0 y() {
        return (v0) this.f28766f.getValue();
    }

    private final C2681z z() {
        return (C2681z) this.f28764d.getValue();
    }

    public final L2.q C() {
        return (L2.q) this.f28761a.getValue();
    }

    public final void F(AbstractC2646e result) {
        AbstractC3292y.i(result, "result");
        if (result instanceof AbstractC2646e.d) {
            G(((AbstractC2646e.d) result).r());
        } else {
            boolean z8 = result instanceof AbstractC2646e.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Q5.s.g(A())) {
            u(null, 0);
            return;
        }
        if (B4.a.a(this, new h())) {
            this.f28769i = true;
            return;
        }
        setContentView(C().getRoot());
        Integer v8 = y().v();
        if (v8 != null) {
            getWindow().addFlags(v8.intValue());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3292y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new i(), 3, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new j(null), 3, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(null), 3, null);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new AddPaymentMethodContract(), new l());
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        E();
        H(registerForActivityResult);
        setSupportActionBar(C().f5360f);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
        }
        FrameLayout footerContainer = C().f5357c;
        AbstractC3292y.h(footerContainer, "footerContainer");
        View s8 = s(footerContainer);
        if (s8 != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                C().f5359e.setAccessibilityTraversalBefore(s8.getId());
                s8.setAccessibilityTraversalAfter(C().f5359e.getId());
            }
            C().f5357c.addView(s8);
            FrameLayout footerContainer2 = C().f5357c;
            AbstractC3292y.h(footerContainer2, "footerContainer");
            footerContainer2.setVisibility(0);
        }
        C().f5359e.requestFocusFromTouch();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str;
        if (!this.f28769i) {
            D0 D8 = D();
            com.stripe.android.model.o p8 = w().p();
            if (p8 != null) {
                str = p8.f25631a;
            } else {
                str = null;
            }
            D8.k(str);
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        u(w().p(), 0);
        return true;
    }
}
