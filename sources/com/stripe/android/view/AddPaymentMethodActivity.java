package com.stripe.android.view;

import Q5.InterfaceC1416k;
import Q5.s;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.util.LinkifyCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import com.stripe.android.view.A;
import com.stripe.android.view.AbstractC2646e;
import com.stripe.android.view.C2644d;
import com.stripe.android.view.C2660l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3390A;
import n2.AbstractC3392C;
import n2.AbstractC3394E;
import n2.AbstractC3403f;
import n6.AbstractC3462k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AddPaymentMethodActivity extends M0 {

    /* renamed from: n, reason: collision with root package name */
    public static final a f28362n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f28363o = 8;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1416k f28364g = Q5.l.b(new d());

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1416k f28365h = Q5.l.b(new m());

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1416k f28366i = Q5.l.b(new i());

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1416k f28367j = Q5.l.b(new j());

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1416k f28368k = Q5.l.b(new c());

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1416k f28369l = new ViewModelLazy(kotlin.jvm.internal.U.b(C2660l.class), new k(this), new n(), new l(null, this));

    /* renamed from: m, reason: collision with root package name */
    private final f f28370m = new f();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28371a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25755i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25757k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f25731A.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28371a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC2658k invoke() {
            AddPaymentMethodActivity addPaymentMethodActivity = AddPaymentMethodActivity.this;
            AbstractC2658k G8 = addPaymentMethodActivity.G(addPaymentMethodActivity.K());
            G8.setId(AbstractC3390A.f35106R);
            return G8;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2644d invoke() {
            C2644d.b bVar = C2644d.f28902h;
            Intent intent = AddPaymentMethodActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            return bVar.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28374a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f28376c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC3403f abstractC3403f, com.stripe.android.model.o oVar, U5.d dVar) {
            super(2, dVar);
            this.f28376c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(null, this.f28376c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a9;
            Object e8 = V5.b.e();
            int i8 = this.f28374a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    a9 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C2660l P8 = AddPaymentMethodActivity.this.P();
                com.stripe.android.model.o oVar = this.f28376c;
                this.f28374a = 1;
                a9 = P8.a(null, oVar, this);
                if (a9 == e8) {
                    return e8;
                }
            }
            AddPaymentMethodActivity addPaymentMethodActivity = AddPaymentMethodActivity.this;
            Throwable e9 = Q5.s.e(a9);
            if (e9 == null) {
                addPaymentMethodActivity.H((com.stripe.android.model.o) a9);
            } else {
                addPaymentMethodActivity.s(false);
                String message = e9.getMessage();
                if (message == null) {
                    message = "";
                }
                addPaymentMethodActivity.t(message);
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements A {
        f() {
        }

        @Override // com.stripe.android.view.A
        public void a() {
        }

        @Override // com.stripe.android.view.A
        public void b() {
        }

        @Override // com.stripe.android.view.A
        public void c() {
        }

        @Override // com.stripe.android.view.A
        public void d(A.a focusField) {
            AbstractC3292y.i(focusField, "focusField");
        }

        @Override // com.stripe.android.view.A
        public void e() {
            AddPaymentMethodActivity.this.P().e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28378a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2660l f28379b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.p f28380c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AddPaymentMethodActivity f28381d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C2660l c2660l, com.stripe.android.model.p pVar, AddPaymentMethodActivity addPaymentMethodActivity, U5.d dVar) {
            super(2, dVar);
            this.f28379b = c2660l;
            this.f28380c = pVar;
            this.f28381d = addPaymentMethodActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f28379b, this.f28380c, this.f28381d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            Object e8 = V5.b.e();
            int i8 = this.f28378a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    b9 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C2660l c2660l = this.f28379b;
                com.stripe.android.model.p pVar = this.f28380c;
                this.f28378a = 1;
                b9 = c2660l.b(pVar, this);
                if (b9 == e8) {
                    return e8;
                }
            }
            AddPaymentMethodActivity addPaymentMethodActivity = this.f28381d;
            Throwable e9 = Q5.s.e(b9);
            if (e9 == null) {
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) b9;
                if (addPaymentMethodActivity.M()) {
                    addPaymentMethodActivity.C(oVar);
                } else {
                    addPaymentMethodActivity.H(oVar);
                }
            } else {
                addPaymentMethodActivity.s(false);
                String message = e9.getMessage();
                if (message == null) {
                    message = "";
                }
                addPaymentMethodActivity.t(message);
            }
            return Q5.I.f8786a;
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
            m5527invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5527invoke() {
            AddPaymentMethodActivity.this.K();
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o.p invoke() {
            return AddPaymentMethodActivity.this.K().h();
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3293z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AddPaymentMethodActivity.this.L().f25774b && AddPaymentMethodActivity.this.K().i());
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f28385a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28385a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28387b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28386a = function0;
            this.f28387b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28386a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28387b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3293z implements Function0 {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n2.I invoke() {
            n2.r f8 = AddPaymentMethodActivity.this.K().f();
            if (f8 == null) {
                f8 = n2.r.f35413c.a(AddPaymentMethodActivity.this);
            }
            Context applicationContext = AddPaymentMethodActivity.this.getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            return new n2.I(applicationContext, f8.f(), f8.h(), false, null, 24, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3293z implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new C2660l.b(AddPaymentMethodActivity.this.N(), AddPaymentMethodActivity.this.K());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(com.stripe.android.model.o oVar) {
        Object b9;
        try {
            s.a aVar = Q5.s.f8810b;
            AbstractC3403f.f35323a.a();
            b9 = Q5.s.b(null);
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        Throwable e8 = Q5.s.e(b9);
        if (e8 == null) {
            android.support.v4.media.a.a(b9);
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null, oVar, null), 3, null);
        } else {
            I(new AbstractC2646e.c(e8));
        }
    }

    private final void D(C2644d c2644d) {
        Integer l8 = c2644d.l();
        if (l8 != null) {
            getWindow().addFlags(l8.intValue());
        }
        p().setLayoutResource(AbstractC3392C.f35156c);
        View inflate = p().inflate();
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        L2.c a9 = L2.c.a((ViewGroup) inflate);
        AbstractC3292y.h(a9, "bind(...)");
        a9.f5293b.addView(J());
        LinearLayout root = a9.f5293b;
        AbstractC3292y.h(root, "root");
        View E8 = E(root);
        if (E8 != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                J().setAccessibilityTraversalBefore(E8.getId());
                E8.setAccessibilityTraversalAfter(J().getId());
            }
            a9.f5293b.addView(E8);
        }
        setTitle(O());
    }

    private final View E(ViewGroup viewGroup) {
        if (K().a() > 0) {
            View inflate = getLayoutInflater().inflate(K().a(), viewGroup, false);
            inflate.setId(AbstractC3390A.f35105Q);
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
    public final AbstractC2658k G(C2644d c2644d) {
        int i8 = b.f28371a[L().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return C2656j.f28989c.a(this);
                }
                throw new IllegalArgumentException("Unsupported Payment Method type: " + L().f25773a);
            }
            return C2650g.f28954d.a(this);
        }
        C2648f c2648f = new C2648f(this, null, 0, c2644d.b(), 6, null);
        c2648f.setCardInputListener(this.f28370m);
        return c2648f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(com.stripe.android.model.o oVar) {
        I(new AbstractC2646e.d(oVar));
    }

    private final void I(AbstractC2646e abstractC2646e) {
        s(false);
        setResult(-1, new Intent().putExtras(abstractC2646e.a()));
        finish();
    }

    private final AbstractC2658k J() {
        return (AbstractC2658k) this.f28368k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2644d K() {
        return (C2644d) this.f28364g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o.p L() {
        return (o.p) this.f28366i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M() {
        return ((Boolean) this.f28367j.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n2.I N() {
        return (n2.I) this.f28365h.getValue();
    }

    private final int O() {
        int i8 = b.f28371a[L().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return AbstractC3394E.f35199J0;
                }
                throw new IllegalArgumentException("Unsupported Payment Method type: " + L().f25773a);
            }
            return AbstractC3394E.f35199J0;
        }
        return AbstractC3394E.f35195H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2660l P() {
        return (C2660l) this.f28369l.getValue();
    }

    public final void F(C2660l viewModel, com.stripe.android.model.p pVar) {
        AbstractC3292y.i(viewModel, "viewModel");
        if (pVar == null) {
            return;
        }
        s(true);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(viewModel, pVar, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.stripe.android.view.M0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (B4.a.a(this, new h())) {
            return;
        }
        P().g();
        D(K());
        setResult(-1, new Intent().putExtras(AbstractC2646e.a.f28918b.a()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        J().requestFocus();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        P().f();
    }

    @Override // com.stripe.android.view.M0
    public void q() {
        P().h();
        F(P(), J().getCreateParams());
    }

    @Override // com.stripe.android.view.M0
    protected void r(boolean z8) {
        J().setCommunicatingProgress(z8);
    }
}
