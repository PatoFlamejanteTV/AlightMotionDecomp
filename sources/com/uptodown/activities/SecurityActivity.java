package com.uptodown.activities;

import F4.AbstractActivityC1198w2;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.C1519j0;
import Y4.C1528s;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import b5.InterfaceC1978b;
import c5.C2041f;
import c5.C2043h;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.z;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import q5.AbstractC3768A;
import q5.C3788m;
import q5.C3800y;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class SecurityActivity extends AbstractActivityC1198w2 {

    /* renamed from: s0, reason: collision with root package name */
    private boolean f30126s0;

    /* renamed from: t0, reason: collision with root package name */
    private I4.G f30127t0;

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1416k f30124q0 = Q5.l.b(new Function0() { // from class: F4.h4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C1519j0 K42;
            K42 = SecurityActivity.K4(SecurityActivity.this);
            return K42;
        }
    });

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1416k f30125r0 = new ViewModelLazy(U.b(z.class), new g(this), new f(this), new h(null, this));

    /* renamed from: u0, reason: collision with root package name */
    private j f30128u0 = new j();

    /* renamed from: v0, reason: collision with root package name */
    private final b f30129v0 = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30130a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1519j0 f30132c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.SecurityActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0699a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30133a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1519j0 f30134b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0699a(C1519j0 c1519j0, U5.d dVar) {
                super(2, dVar);
                this.f30134b = c1519j0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0699a(this.f30134b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30133a == 0) {
                    Q5.t.b(obj);
                    this.f30134b.f12810c.f12236b.setVisibility(0);
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((C0699a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1519j0 c1519j0, U5.d dVar) {
            super(2, dVar);
            this.f30132c = c1519j0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f30132c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30130a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                J0 c8 = C3445b0.c();
                C0699a c0699a = new C0699a(this.f30132c, null);
                this.f30130a = 1;
                if (AbstractC3458i.g(c8, c0699a, this) == e8) {
                    return e8;
                }
            }
            SecurityActivity.this.j4();
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1978b {
        b() {
        }

        @Override // b5.InterfaceC1978b
        public void a(int i8) {
            if (UptodownApp.f29249C.a0() && !SecurityActivity.this.f30126s0) {
                I4.G g8 = SecurityActivity.this.f30127t0;
                AbstractC3292y.f(g8);
                if (g8.b().get(i8) instanceof C2041f) {
                    I4.G g9 = SecurityActivity.this.f30127t0;
                    AbstractC3292y.f(g9);
                    Object obj = g9.b().get(i8);
                    AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                    SecurityActivity.this.L4((C2041f) obj);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30136a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SecurityActivity f30138a;

            a(SecurityActivity securityActivity) {
                this.f30138a = securityActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f30138a.Q4().f12810c.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    if (((z.a) cVar.a()).a().isEmpty()) {
                        this.f30138a.Q4().f12811d.setVisibility(0);
                        this.f30138a.Q4().f12812e.setVisibility(8);
                        this.f30138a.Q4().f12815h.setText(this.f30138a.getString(R.string.uptodown_last_analysis, String.valueOf(new C3788m().m(SettingsPreferences.f30529b.q(this.f30138a)))));
                    } else {
                        this.f30138a.Q4().f12812e.setVisibility(0);
                        this.f30138a.Q4().f12811d.setVisibility(8);
                        this.f30138a.Z4(((z.a) cVar.a()).a());
                    }
                    this.f30138a.Q4().f12810c.f12236b.setVisibility(8);
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
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
            int i8 = this.f30136a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L b9 = SecurityActivity.this.R4().b();
                a aVar = new a(SecurityActivity.this);
                this.f30136a = 1;
                if (b9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements b5.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2041f f30140b;

        d(C2041f c2041f) {
            this.f30140b = c2041f;
        }

        @Override // b5.r
        public void b(int i8) {
            SecurityActivity securityActivity = SecurityActivity.this;
            String string = securityActivity.getString(R.string.rollback_not_available, this.f30140b.z());
            AbstractC3292y.h(string, "getString(...)");
            securityActivity.Z1(string);
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (appInfo.b()) {
                Intent intent = new Intent(SecurityActivity.this.getApplicationContext(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f30140b);
                intent.putExtra("appInfo", appInfo);
                SecurityActivity securityActivity = SecurityActivity.this;
                securityActivity.startActivity(intent, UptodownApp.f29249C.a(securityActivity));
                return;
            }
            SecurityActivity securityActivity2 = SecurityActivity.this;
            String string = securityActivity2.getString(R.string.rollback_not_available, appInfo.q0());
            AbstractC3292y.h(string, "getString(...)");
            securityActivity2.Z1(string);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30141a;

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30141a == 0) {
                Q5.t.b(obj);
                SecurityActivity.this.Q4().f12810c.f12236b.setVisibility(8);
                SecurityActivity.this.Q4().f12815h.setText(SecurityActivity.this.getString(R.string.uptodown_last_analysis, String.valueOf(new C3788m().m(SettingsPreferences.f30529b.q(SecurityActivity.this)))));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30143a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f30143a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30143a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30144a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f30144a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30144a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30145a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30146b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30145a = function0;
            this.f30146b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30145a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30146b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30147a;

        i(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30147a == 0) {
                Q5.t.b(obj);
                SecurityActivity.this.Y4();
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements b5.F {
        j() {
        }

        @Override // b5.F
        public void a() {
        }

        @Override // b5.F
        public void b() {
            SecurityActivity.this.j4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1519j0 K4(SecurityActivity securityActivity) {
        return C1519j0.c(securityActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L4(final C2041f c2041f) {
        if (!isFinishing() && c2041f != null) {
            C1528s c8 = C1528s.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            K2(new AlertDialog.Builder(this).setView(c8.getRoot()).create());
            TextView textView = c8.f12929c;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            c8.f12929c.setText(c2041f.z());
            if (c2041f.Q() != null && c2041f.x() != null && c2041f.b() > 0) {
                c8.f12928b.setTypeface(aVar.v());
                c8.f12928b.setOnClickListener(new View.OnClickListener() { // from class: F4.i4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.M4(SecurityActivity.this, c2041f, view);
                    }
                });
                c8.f12932f.setTypeface(aVar.v());
                c8.f12932f.setOnClickListener(new View.OnClickListener() { // from class: F4.j4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.N4(SecurityActivity.this, c2041f, view);
                    }
                });
                c8.f12930d.setTypeface(aVar.v());
                c8.f12930d.setOnClickListener(new View.OnClickListener() { // from class: F4.k4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.O4(SecurityActivity.this, c2041f, view);
                    }
                });
            } else {
                c8.f12928b.setVisibility(8);
                c8.f12932f.setVisibility(8);
                c8.f12930d.setVisibility(8);
            }
            if (!l6.n.s(getPackageName(), c2041f.Q(), true)) {
                c8.f12931e.setTypeface(aVar.v());
                c8.f12931e.setOnClickListener(new View.OnClickListener() { // from class: F4.l4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.P4(C2041f.this, this, view);
                    }
                });
            } else {
                c8.f12931e.setVisibility(8);
            }
            if (!isFinishing()) {
                AlertDialog o22 = o2();
                AbstractC3292y.f(o22);
                Window window = o22.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog o23 = o2();
                AbstractC3292y.f(o23);
                o23.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(SecurityActivity securityActivity, C2041f c2041f, View view) {
        securityActivity.C2(c2041f.b());
        AlertDialog o22 = securityActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(SecurityActivity securityActivity, C2041f c2041f, View view) {
        securityActivity.F2(c2041f.X());
        AlertDialog o22 = securityActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(SecurityActivity securityActivity, C2041f c2041f, View view) {
        securityActivity.X4(c2041f);
        AlertDialog o22 = securityActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P4(C2041f c2041f, SecurityActivity securityActivity, View view) {
        if (c2041f.Q() != null) {
            J4.i iVar = new J4.i(securityActivity);
            String Q8 = c2041f.Q();
            AbstractC3292y.f(Q8);
            iVar.h(Q8);
        }
        AlertDialog o22 = securityActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1519j0 Q4() {
        return (C1519j0) this.f30124q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z R4() {
        return (z) this.f30125r0.getValue();
    }

    private final void S4() {
        setContentView(Q4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            Q4().f12813f.setNavigationIcon(drawable);
            Q4().f12813f.setNavigationContentDescription(getString(R.string.back));
        }
        final C1519j0 Q42 = Q4();
        Q42.f12813f.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.T4(SecurityActivity.this, view);
            }
        });
        TextView textView = Q42.f12817j;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        Q42.f12812e.setLayoutManager(new LinearLayoutManager(this, 1, false));
        Q42.f12812e.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) Q42.f12812e.getItemAnimator();
        AbstractC3292y.f(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        Q42.f12812e.addItemDecoration(new s5.m((int) getResources().getDimension(R.dimen.margin_m), 0));
        Q42.f12810c.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.U4(view);
            }
        });
        Q42.f12816i.setTypeface(aVar.u());
        Q42.f12815h.setTypeface(aVar.v());
        Q42.f12814g.setTypeface(aVar.u());
        Q42.f12814g.setOnClickListener(new View.OnClickListener() { // from class: F4.g4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.V4(SecurityActivity.this, Q42, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(SecurityActivity securityActivity, View view) {
        securityActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V4(SecurityActivity securityActivity, C1519j0 c1519j0, View view) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(securityActivity), C3445b0.b(), null, new a(c1519j0, null), 2, null);
    }

    private final void W4() {
        R4().a(this);
    }

    private final void X4(C2041f c2041f) {
        new X4.i(this, c2041f.b(), new d(c2041f), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z4(ArrayList arrayList) {
        I4.G g8 = this.f30127t0;
        if (g8 == null) {
            b bVar = this.f30129v0;
            j jVar = this.f30128u0;
            AbstractC3292y.f(jVar);
            this.f30127t0 = new I4.G(arrayList, this, bVar, jVar);
            Q4().f12812e.setAdapter(this.f30127t0);
            return;
        }
        AbstractC3292y.f(g8);
        g8.c(arrayList);
    }

    public final void Y4() {
        if (Q4().f12810c.f12236b.getVisibility() == 8) {
            j4();
            W4();
        }
    }

    public final void a5() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new i(null), 2, null);
    }

    @Override // F4.AbstractActivityC1198w2
    protected void o4() {
        W4();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        S4();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new c(null), 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3292y.i(event, "event");
        if (i8 == 82) {
            Q4().f12813f.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        j4();
        C3800y.f37330a.g(this);
    }
}
