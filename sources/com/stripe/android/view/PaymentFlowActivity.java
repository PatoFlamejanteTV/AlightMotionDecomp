package com.stripe.android.view;

import Q5.InterfaceC1416k;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import c6.InterfaceC2072n;
import com.stripe.android.view.C2669p0;
import com.stripe.android.view.C2674s0;
import g3.C2895E;
import g3.C2896F;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3390A;
import n2.AbstractC3392C;
import n2.AbstractC3394E;
import n2.AbstractC3403f;
import n2.u;
import n6.AbstractC3462k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentFlowActivity extends M0 {

    /* renamed from: o, reason: collision with root package name */
    public static final a f28725o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f28726p = 8;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1416k f28727g = Q5.l.b(new n());

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1416k f28728h = Q5.l.b(new p());

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1416k f28729i = Q5.l.b(c.f28736a);

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1416k f28730j = Q5.l.b(new b());

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1416k f28731k = Q5.l.b(new j());

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1416k f28732l = new ViewModelLazy(kotlin.jvm.internal.U.b(C2674s0.class), new k(this), new o(), new l(null, this));

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC1416k f28733m = Q5.l.b(new i());

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1416k f28734n = Q5.l.b(new d());

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
        public final C2669p0 invoke() {
            C2669p0.a aVar = C2669p0.f29143e;
            Intent intent = PaymentFlowActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            return aVar.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f28736a = new c();

        c() {
            super(0);
        }

        public final AbstractC3403f a() {
            AbstractC3403f.f35323a.a();
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2653h0 invoke() {
            return new C2653h0(PaymentFlowActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5536invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5536invoke() {
            PaymentFlowActivity.this.F();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewPager.OnPageChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedCallback f28740b;

        f(OnBackPressedCallback onBackPressedCallback) {
            this.f28740b = onBackPressedCallback;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            paymentFlowActivity.setTitle(paymentFlowActivity.I().getPageTitle(i8));
            if (PaymentFlowActivity.this.I().b(i8) == EnumC2671q0.f29150b) {
                PaymentFlowActivity.this.M().k(false);
                PaymentFlowActivity.this.I().g(false);
            }
            this.f28740b.setEnabled(PaymentFlowActivity.this.P());
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3292y.i(addCallback, "$this$addCallback");
            PaymentFlowActivity.this.M().h(r2.a() - 1);
            PaymentFlowActivity.this.N().setCurrentItem(PaymentFlowActivity.this.M().a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28742a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2895E f28744c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f28745d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C2895E c2895e, List list, U5.d dVar) {
            super(2, dVar);
            this.f28744c = c2895e;
            this.f28745d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f28744c, this.f28745d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object g8;
            Object e8 = V5.b.e();
            int i8 = this.f28742a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    g8 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C2674s0 M8 = PaymentFlowActivity.this.M();
                C2895E c2895e = this.f28744c;
                this.f28742a = 1;
                g8 = M8.g(c2895e, this);
                if (g8 == e8) {
                    return e8;
                }
            }
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            List list = this.f28745d;
            Throwable e9 = Q5.s.e(g8);
            if (e9 == null) {
                paymentFlowActivity.R(((g3.t) g8).b(), list);
            } else {
                String message = e9.getMessage();
                if (message == null) {
                    message = "";
                }
                paymentFlowActivity.t(message);
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentFlowActivity f28747a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaymentFlowActivity paymentFlowActivity) {
                super(1);
                this.f28747a = paymentFlowActivity;
            }

            public final void a(C2896F it) {
                AbstractC3292y.i(it, "it");
                this.f28747a.M().j(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2896F) obj);
                return Q5.I.f8786a;
            }
        }

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2672r0 invoke() {
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            return new C2672r0(paymentFlowActivity, paymentFlowActivity.J(), PaymentFlowActivity.this.J().a(), new a(PaymentFlowActivity.this));
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3293z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n2.u invoke() {
            return PaymentFlowActivity.this.F().a();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28749a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f28749a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28749a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28750a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28750a = function0;
            this.f28751b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28750a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28751b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28752a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2895E f28754c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(u.c cVar, u.d dVar, C2895E c2895e, U5.d dVar2) {
            super(2, dVar2);
            this.f28754c = c2895e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(null, null, this.f28754c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object l8;
            Object e8 = V5.b.e();
            int i8 = this.f28752a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    l8 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C2674s0 M8 = PaymentFlowActivity.this.M();
                C2895E c2895e = this.f28754c;
                this.f28752a = 1;
                l8 = M8.l(null, null, c2895e, this);
                if (l8 == e8) {
                    return e8;
                }
            }
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            Throwable e9 = Q5.s.e(l8);
            if (e9 == null) {
                paymentFlowActivity.T((List) l8);
            } else {
                paymentFlowActivity.Q(e9);
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3293z implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L2.p invoke() {
            PaymentFlowActivity.this.p().setLayoutResource(AbstractC3392C.f35171r);
            View inflate = PaymentFlowActivity.this.p().inflate();
            AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            L2.p a9 = L2.p.a((ViewGroup) inflate);
            AbstractC3292y.h(a9, "bind(...)");
            return a9;
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3293z implements Function0 {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            PaymentFlowActivity.v(PaymentFlowActivity.this);
            return new C2674s0.b(null, PaymentFlowActivity.this.F().b());
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends AbstractC3293z implements Function0 {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentFlowViewPager invoke() {
            PaymentFlowViewPager shippingFlowViewpager = PaymentFlowActivity.this.L().f5354b;
            AbstractC3292y.h(shippingFlowViewpager, "shippingFlowViewpager");
            return shippingFlowViewpager;
        }
    }

    private final void E(n2.v vVar) {
        setResult(-1, new Intent().putExtra("extra_payment_session_data", vVar));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2669p0 F() {
        return (C2669p0) this.f28730j.getValue();
    }

    private final AbstractC3403f G() {
        android.support.v4.media.a.a(this.f28729i.getValue());
        return null;
    }

    private final C2653h0 H() {
        return (C2653h0) this.f28734n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2672r0 I() {
        return (C2672r0) this.f28733m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n2.u J() {
        return (n2.u) this.f28731k.getValue();
    }

    private final C2895E K() {
        return ((ShippingInfoWidget) N().findViewById(AbstractC3390A.f35103O)).getShippingInformation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L2.p L() {
        return (L2.p) this.f28727g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2674s0 M() {
        return (C2674s0) this.f28732l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowViewPager N() {
        return (PaymentFlowViewPager) this.f28728h.getValue();
    }

    private final boolean O() {
        if (N().getCurrentItem() + 1 < I().getCount()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P() {
        if (N().getCurrentItem() != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Throwable th) {
        String message = th.getMessage();
        s(false);
        if (message != null && message.length() != 0) {
            t(message);
        } else {
            String string = getString(AbstractC3394E.f35267x0);
            AbstractC3292y.h(string, "getString(...)");
            t(string);
        }
        M().i(n2.v.b(M().b(), false, false, 0L, 0L, null, null, null, false, 239, null));
    }

    private final void S() {
        H().a();
        C2895E K8 = K();
        if (K8 != null) {
            M().i(n2.v.b(M().b(), false, false, 0L, 0L, K8, null, null, false, 239, null));
            s(true);
            J().i();
            J().l();
            W(null, null, K8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(List list) {
        C2895E f8 = M().b().f();
        if (f8 != null) {
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(f8, list, null), 3, null);
        }
    }

    private final void U() {
        E(n2.v.b(M().b(), false, false, 0L, 0L, null, ((SelectShippingMethodWidget) N().findViewById(AbstractC3390A.f35100L)).getSelectedShippingMethod(), null, false, 223, null));
    }

    private final void V(List list) {
        s(false);
        I().i(list);
        I().g(true);
        if (O()) {
            C2674s0 M8 = M();
            M8.h(M8.a() + 1);
            N().setCurrentItem(M().a());
            return;
        }
        E(M().b());
    }

    private final void W(u.c cVar, u.d dVar, C2895E c2895e) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new m(cVar, dVar, c2895e, null), 3, null);
    }

    public static final /* synthetic */ AbstractC3403f v(PaymentFlowActivity paymentFlowActivity) {
        paymentFlowActivity.G();
        return null;
    }

    public final /* synthetic */ void R(C2895E c2895e, List shippingMethods) {
        AbstractC3292y.i(shippingMethods, "shippingMethods");
        V(shippingMethods);
        M().i(n2.v.b(M().b(), false, false, 0L, 0L, c2895e, null, null, false, 239, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.stripe.android.view.M0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (B4.a.a(this, new e())) {
            return;
        }
        C2669p0.a aVar = C2669p0.f29143e;
        Intent intent = getIntent();
        AbstractC3292y.h(intent, "getIntent(...)");
        Integer f8 = aVar.a(intent).f();
        if (f8 != null) {
            getWindow().addFlags(f8.intValue());
        }
        C2895E e8 = M().e();
        if (e8 == null) {
            e8 = J().h();
        }
        I().i(M().d());
        I().g(M().f());
        I().h(e8);
        I().f(M().c());
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3292y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedCallback addCallback$default = OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new g(), 3, null);
        N().setAdapter(I());
        N().addOnPageChangeListener(new f(addCallback$default));
        N().setCurrentItem(M().a());
        addCallback$default.setEnabled(P());
        setTitle(I().getPageTitle(N().getCurrentItem()));
    }

    @Override // com.stripe.android.view.M0
    public void q() {
        if (EnumC2671q0.f29150b == I().b(N().getCurrentItem())) {
            S();
        } else {
            U();
        }
    }
}
