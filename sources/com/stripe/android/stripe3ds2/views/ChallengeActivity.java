package com.stripe.android.stripe3ds2.views;

import Q5.InterfaceC1412g;
import Q5.InterfaceC1416k;
import Q5.x;
import Y3.q;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c4.v;
import com.stripe.android.stripe3ds2.transaction.a;
import com.stripe.android.stripe3ds2.transaction.b;
import com.stripe.android.stripe3ds2.transaction.h;
import com.stripe.android.stripe3ds2.transaction.q;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.stripe3ds2.views.b;
import com.stripe.android.stripe3ds2.views.d;
import f4.C2849a;
import f4.C2855g;
import f4.C2857i;
import f4.C2861m;
import f4.C2866r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.InterfaceC3286s;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.U;
import n6.C3445b0;
import n6.I;

/* loaded from: classes4.dex */
public final class ChallengeActivity extends AppCompatActivity {

    /* renamed from: m, reason: collision with root package name */
    private static final a f28186m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private static final I f28187n = C3445b0.b();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f28188a = Q5.l.b(new q());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f28189b = Q5.l.b(new c());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f28190c = Q5.l.b(new e());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1416k f28191d = Q5.l.b(new f());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1416k f28192e = Q5.l.b(new s());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1416k f28193f = Q5.l.b(new b());

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1416k f28194g = Q5.l.b(new d());

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1416k f28195h = new ViewModelLazy(U.b(com.stripe.android.stripe3ds2.views.b.class), new o(this), new t(), new p(null, this));

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1416k f28196i = Q5.l.b(new r());

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1416k f28197j = Q5.l.b(new g());

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1416k f28198k = Q5.l.b(new m());

    /* renamed from: l, reason: collision with root package name */
    private Dialog f28199l;

    /* loaded from: classes4.dex */
    private static final class a {
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
        public final b.a invoke() {
            return new b.a(ChallengeActivity.this.H().a(), ChallengeActivity.this.B(), ChallengeActivity.this.H().f(), ChallengeActivity.f28187n);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z3.a invoke() {
            Context applicationContext = ChallengeActivity.this.getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            return new Z3.a(applicationContext, new Z3.e(ChallengeActivity.this.H().l()), null, null, null, null, null, 0, 252, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.transaction.k invoke() {
            return new q.b(ChallengeActivity.f28187n).a(ChallengeActivity.this.H().b().a(), ChallengeActivity.this.B());
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.c invoke() {
            return (com.stripe.android.stripe3ds2.views.c) ChallengeActivity.this.I().f10552b.getFragment();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V3.c invoke() {
            return ChallengeActivity.this.D().H();
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2866r invoke() {
            return new C2866r(ChallengeActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends OnBackPressedCallback {
        h() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            ChallengeActivity.this.J().u(a.C0666a.f28044a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function1 {
        i() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.a aVar) {
            if (!ChallengeActivity.this.isFinishing()) {
                ChallengeActivity.this.z();
                ChallengeActivity challengeActivity = ChallengeActivity.this;
                Dialog a9 = challengeActivity.F().a();
                a9.show();
                challengeActivity.f28199l = a9;
                com.stripe.android.stripe3ds2.views.b J8 = ChallengeActivity.this.J();
                AbstractC3292y.f(aVar);
                J8.u(aVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.stripe3ds2.transaction.a) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3293z implements Function1 {
        j() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.h hVar) {
            ChallengeActivity.this.setResult(-1, new Intent().putExtras(hVar.f()));
            if (!ChallengeActivity.this.isFinishing()) {
                ChallengeActivity.this.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.stripe3ds2.transaction.h) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f28210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(T t8) {
            super(1);
            this.f28210b = t8;
        }

        public final void a(d4.b bVar) {
            String str;
            ChallengeActivity.this.y();
            if (bVar != null) {
                ChallengeActivity.this.K(bVar);
                T t8 = this.f28210b;
                d4.g b02 = bVar.b0();
                if (b02 != null) {
                    str = b02.b();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                t8.f34573a = str;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((d4.b) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f28212b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(T t8) {
            super(1);
            this.f28212b = t8;
        }

        public final void a(Boolean bool) {
            if (AbstractC3292y.d(bool, Boolean.TRUE)) {
                ChallengeActivity.this.J().n(new h.g((String) this.f28212b.f34573a, ChallengeActivity.this.H().h().b0(), ChallengeActivity.this.H().i()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3293z implements Function0 {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2857i invoke() {
            ChallengeActivity challengeActivity = ChallengeActivity.this;
            return new C2857i(challengeActivity, challengeActivity.H().s());
        }
    }

    /* loaded from: classes4.dex */
    static final class n implements Observer, InterfaceC3286s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f28214a;

        n(Function1 function) {
            AbstractC3292y.i(function, "function");
            this.f28214a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return this.f28214a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28214a.invoke(obj);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28215a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f28215a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28215a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28216a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28217b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28216a = function0;
            this.f28217b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28216a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28217b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class q extends AbstractC3293z implements Function0 {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c4.j invoke() {
            return new c4.j(ChallengeActivity.this.H().p(), ChallengeActivity.this.C(), ChallengeActivity.this.H().a());
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends AbstractC3293z implements Function0 {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.d invoke() {
            d.a aVar = com.stripe.android.stripe3ds2.views.d.f28335h;
            Bundle extras = ChallengeActivity.this.getIntent().getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            AbstractC3292y.f(extras);
            return aVar.a(extras);
        }
    }

    /* loaded from: classes4.dex */
    static final class s extends AbstractC3293z implements Function0 {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V3.b invoke() {
            V3.b c8 = V3.b.c(ChallengeActivity.this.getLayoutInflater());
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
            return new b.C0679b(ChallengeActivity.this.A(), ChallengeActivity.this.G(), ChallengeActivity.this.B(), ChallengeActivity.f28187n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.transaction.b A() {
        return (com.stripe.android.stripe3ds2.transaction.b) this.f28193f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Z3.c B() {
        return (Z3.c) this.f28189b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.transaction.k C() {
        return (com.stripe.android.stripe3ds2.transaction.k) this.f28194g.getValue();
    }

    private final C2866r E() {
        return (C2866r) this.f28197j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2857i F() {
        return (C2857i) this.f28198k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v G() {
        return (v) this.f28188a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.views.d H() {
        return (com.stripe.android.stripe3ds2.views.d) this.f28196i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(d4.b bVar) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        AbstractC3292y.h(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction()");
        C2849a c2849a = C2849a.f31860a;
        beginTransaction.setCustomAnimations(c2849a.a(), c2849a.b(), c2849a.a(), c2849a.b());
        beginTransaction.replace(I().f10552b.getId(), com.stripe.android.stripe3ds2.views.c.class, BundleKt.bundleOf(x.a("arg_cres", bVar)));
        beginTransaction.commit();
    }

    private final void w() {
        final ThreeDS2Button a9 = new C2861m(this).a(H().s().i(), H().s().a(q.a.CANCEL));
        if (a9 != null) {
            a9.setOnClickListener(new View.OnClickListener() { // from class: f4.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeActivity.x(ThreeDS2Button.this, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(ThreeDS2Button threeDS2Button, ChallengeActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        threeDS2Button.setClickable(false);
        this$0.J().u(a.C0666a.f28044a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        Dialog dialog = this.f28199l;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.f28199l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        E().a();
    }

    public final com.stripe.android.stripe3ds2.views.c D() {
        return (com.stripe.android.stripe3ds2.views.c) this.f28190c.getValue();
    }

    public final V3.b I() {
        return (V3.b) this.f28192e.getValue();
    }

    public final com.stripe.android.stripe3ds2.views.b J() {
        return (com.stripe.android.stripe3ds2.views.b) this.f28195h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getSupportFragmentManager().setFragmentFactory(new C2855g(H().s(), G(), C(), B(), A(), H().h().b0(), H().i(), f28187n));
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(new h());
        getWindow().setFlags(8192, 8192);
        setContentView(I().getRoot());
        J().l().observe(this, new n(new i()));
        J().j().observe(this, new n(new j()));
        w();
        T t8 = new T();
        t8.f34573a = "";
        J().h().observe(this, new n(new k(t8)));
        if (bundle == null) {
            J().p(H().h());
        }
        J().m().observe(this, new n(new l(t8)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        y();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        J().o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        J().s(true);
        z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (J().k()) {
            J().q();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i8) {
        super.onTrimMemory(i8);
        J().o();
    }
}
