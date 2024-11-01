package com.uptodown.activities;

import R5.AbstractC1435t;
import Z4.C1541b1;
import Z4.C1574e;
import Z4.C1635y1;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import c5.C2040e;
import c5.C2043h;
import c5.C2046k;
import c5.Q;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.GetUserDataWorker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.C3791p;
import u5.C4086f;

/* loaded from: classes4.dex */
public final class AppDetailActivity extends AbstractActivityC2691a {

    /* renamed from: V, reason: collision with root package name */
    public static final a f29385V = new a(null);

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f29386O = new ArrayList();

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f29387P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    private ArrayList f29388Q = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    private final C4086f f29389R = new C4086f();

    /* renamed from: S, reason: collision with root package name */
    private RelativeLayout f29390S;

    /* renamed from: T, reason: collision with root package name */
    private final ActivityResultLauncher f29391T;

    /* renamed from: U, reason: collision with root package name */
    private final e f29392U;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29393a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29394b;

        public b(int i8, String str) {
            this.f29393a = i8;
            this.f29394b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1541b1 n32;
            String str;
            if (this.f29394b != null && (n32 = AppDetailActivity.this.n3()) != null && n32.isResumed()) {
                C2043h u32 = n32.u3();
                if (u32 != null) {
                    str = u32.v0();
                } else {
                    str = null;
                }
                if (l6.n.t(str, this.f29394b, false, 2, null)) {
                    C3791p.a aVar = C3791p.f37286s;
                    Context baseContext = AppDetailActivity.this.getBaseContext();
                    AbstractC3292y.h(baseContext, "getBaseContext(...)");
                    C3791p a9 = aVar.a(baseContext);
                    a9.a();
                    Q s02 = a9.s0(this.f29394b);
                    a9.i();
                    if (s02 != null) {
                        AppDetailActivity.this.runOnUiThread(new C1541b1.RunnableC1543b(this.f29393a, s02));
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f29396a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29397b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppDetailActivity f29398c;

        public c(AppDetailActivity appDetailActivity, String packagename, int i8) {
            AbstractC3292y.i(packagename, "packagename");
            this.f29398c = appDetailActivity;
            this.f29396a = packagename;
            this.f29397b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f29398c.getSupportFragmentManager().getFragments();
            AbstractC3292y.h(fragments, "getFragments(...)");
            Fragment fragment = (Fragment) AbstractC1435t.y0(fragments);
            if (fragment != null && (fragment instanceof C1541b1)) {
                new C1541b1.RunnableC1544c((C1541b1) fragment, this.f29396a, this.f29397b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29399a;

        /* renamed from: b, reason: collision with root package name */
        private final c5.r f29400b;

        public d(int i8, c5.r rVar) {
            this.f29399a = i8;
            this.f29400b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            C1541b1 n32 = AppDetailActivity.this.n3();
            if (n32 != null && n32.isResumed()) {
                AppDetailActivity.this.runOnUiThread(new C1541b1.RunnableC1546e(this.f29399a, this.f29400b));
            }
            String str2 = null;
            if (AppDetailActivity.this.o3() != null) {
                C1635y1 o32 = AppDetailActivity.this.o3();
                AbstractC3292y.f(o32);
                c5.r rVar = this.f29400b;
                if (rVar != null) {
                    str = rVar.Y();
                } else {
                    str = null;
                }
                o32.S(str);
            }
            if (AppDetailActivity.this.m3() != null) {
                C1574e m32 = AppDetailActivity.this.m3();
                AbstractC3292y.f(m32);
                c5.r rVar2 = this.f29400b;
                if (rVar2 != null) {
                    str2 = rVar2.Y();
                }
                m32.E(str2);
            }
            if (this.f29400b != null) {
                AppDetailActivity.this.k3().W(this.f29400b, AppDetailActivity.this.l3(), this.f29399a, AppDetailActivity.this);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends OnBackPressedCallback {
        e() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            RelativeLayout l32 = AppDetailActivity.this.l3();
            if (l32 != null && l32.getVisibility() == 0) {
                C4086f k32 = AppDetailActivity.this.k3();
                AppDetailActivity appDetailActivity = AppDetailActivity.this;
                RelativeLayout l33 = appDetailActivity.l3();
                AbstractC3292y.f(l33);
                k32.f(appDetailActivity, l33);
                return;
            }
            if (AppDetailActivity.this.f29387P.size() > 0) {
                AppDetailActivity.this.f29387P.remove(AbstractC1435t.o(AppDetailActivity.this.f29387P));
                AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
                return;
            }
            if (AppDetailActivity.this.f29388Q.size() > 0) {
                AppDetailActivity.this.f29388Q.remove(AbstractC1435t.o(AppDetailActivity.this.f29388Q));
                AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
            } else {
                if (AppDetailActivity.this.f29386O.size() > 0) {
                    AppDetailActivity.this.f29386O.remove(AbstractC1435t.o(AppDetailActivity.this.f29386O));
                    AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
                    if (AppDetailActivity.this.f29386O.size() == 0) {
                        AppDetailActivity.this.finish();
                        return;
                    }
                    return;
                }
                AppDetailActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29403a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f29405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(g gVar, U5.d dVar) {
            super(2, dVar);
            this.f29405c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f29405c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29403a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f31222b;
                AppDetailActivity appDetailActivity = AppDetailActivity.this;
                g gVar = this.f29405c;
                this.f29403a = 1;
                if (aVar.b(appDetailActivity, gVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements b5.H {
        g() {
        }

        @Override // b5.H
        public void a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29406a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29408c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, U5.d dVar) {
            super(2, dVar);
            this.f29408c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f29408c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29406a == 0) {
                Q5.t.b(obj);
                C1541b1 n32 = AppDetailActivity.this.n3();
                if (n32 != null && n32.isResumed()) {
                    n32.A6(this.f29408c);
                    n32.y6(this.f29408c);
                }
                if (!AppDetailActivity.this.f29387P.isEmpty()) {
                    ((C1635y1) AbstractC1435t.y0(AppDetailActivity.this.f29387P)).S(this.f29408c);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29409a;

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
            if (this.f29409a == 0) {
                Q5.t.b(obj);
                C1541b1 n32 = AppDetailActivity.this.n3();
                if (n32 != null && n32.isResumed()) {
                    AppDetailActivity.this.runOnUiThread(new C1541b1.RunnableC1545d());
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public AppDetailActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AppDetailActivity.j3(AppDetailActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f29391T = registerForActivityResult;
        this.f29392U = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(AppDetailActivity appDetailActivity, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            UptodownApp.a.M0(UptodownApp.f29249C, appDetailActivity, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1574e m3() {
        if (this.f29388Q.size() > 0) {
            return (C1574e) AbstractC1435t.y0(this.f29388Q);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1541b1 n3() {
        if (this.f29386O.size() > 0) {
            return (C1541b1) AbstractC1435t.y0(this.f29386O);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1635y1 o3() {
        if (this.f29387P.size() > 0) {
            return (C1635y1) AbstractC1435t.y0(this.f29387P);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(AppDetailActivity appDetailActivity, ActivityResult activityResult) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(appDetailActivity), C3445b0.b(), null, new f(new g(), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(AppDetailActivity appDetailActivity, C2043h c2043h, View view) {
        RelativeLayout relativeLayout = appDetailActivity.f29390S;
        AbstractC3292y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        appDetailActivity.f29389R.E(0L);
        appDetailActivity.X2(c2043h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(AppDetailActivity appDetailActivity, C2043h c2043h, View view) {
        RelativeLayout relativeLayout = appDetailActivity.f29390S;
        AbstractC3292y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        appDetailActivity.f29389R.E(0L);
        appDetailActivity.X2(c2043h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(AppDetailActivity appDetailActivity, C2043h c2043h, Function0 function0, View view) {
        appDetailActivity.f29389R.g(c2043h, appDetailActivity);
        C4086f c4086f = appDetailActivity.f29389R;
        RelativeLayout relativeLayout = appDetailActivity.f29390S;
        AbstractC3292y.f(relativeLayout);
        c4086f.f(appDetailActivity, relativeLayout);
        function0.invoke();
    }

    public final void A3(C2046k category) {
        AbstractC3292y.i(category, "category");
        C1635y1 a9 = C1635y1.f13904i.a(category);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out).add(android.R.id.content, a9, (String) null).addToBackStack(String.valueOf(category.b())).commit();
        this.f29387P.add(a9);
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a
    public void X2(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
        C1541b1 a9 = C1541b1.f13378n.a(appInfo, appInfo.h());
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, a9, (String) null).addToBackStack(String.valueOf(appInfo.h())).commit();
        this.f29386O.add(a9);
    }

    public final C4086f k3() {
        return this.f29389R;
    }

    public final RelativeLayout l3() {
        return this.f29390S;
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C2043h c2043h;
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        long j8 = -1;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("appId")) {
                j8 = extras.getLong("appId");
            }
            if (extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C2043h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                c2043h = (C2043h) parcelable;
                if (c2043h != null) {
                    j8 = c2043h.h();
                }
                C1541b1 a9 = C1541b1.f13378n.a(c2043h, j8);
                getSupportFragmentManager().beginTransaction().add(android.R.id.content, a9, (String) null).commit();
                getOnBackPressedDispatcher().addCallback(this, this.f29392U);
                R2(registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.b
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        AppDetailActivity.q3(AppDetailActivity.this, (ActivityResult) obj);
                    }
                }));
                this.f29386O.add(a9);
            }
        }
        c2043h = null;
        C1541b1 a92 = C1541b1.f13378n.a(c2043h, j8);
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, a92, (String) null).commit();
        getOnBackPressedDispatcher().addCallback(this, this.f29392U);
        R2(registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AppDetailActivity.q3(AppDetailActivity.this, (ActivityResult) obj);
            }
        }));
        this.f29386O.add(a92);
    }

    public final ActivityResultLauncher p3() {
        return this.f29391T;
    }

    public final void r3() {
        C1541b1 n32 = n3();
        if (n32 != null) {
            n32.x5();
        }
    }

    public final void s3(RelativeLayout relativeLayout) {
        this.f29390S = relativeLayout;
    }

    public final void t3(final C2043h appInfo, final Function0 updateCard) {
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(updateCard, "updateCard");
        RelativeLayout relativeLayout = this.f29390S;
        if (relativeLayout != null) {
            C4086f c4086f = this.f29389R;
            AbstractC3292y.f(relativeLayout);
            c4086f.H(appInfo, this, relativeLayout);
            this.f29389R.m().setOnClickListener(new View.OnClickListener() { // from class: F4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.u3(AppDetailActivity.this, appInfo, view);
                }
            });
            this.f29389R.s().setOnClickListener(new View.OnClickListener() { // from class: F4.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.v3(AppDetailActivity.this, appInfo, view);
                }
            });
            this.f29389R.q().setOnClickListener(new View.OnClickListener() { // from class: F4.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.w3(AppDetailActivity.this, appInfo, updateCard, view);
                }
            });
            RelativeLayout relativeLayout2 = this.f29390S;
            AbstractC3292y.f(relativeLayout2);
            if (relativeLayout2.getVisibility() != 0) {
                RelativeLayout relativeLayout3 = this.f29390S;
                AbstractC3292y.f(relativeLayout3);
                relativeLayout3.setVisibility(0);
                if (SettingsPreferences.f30529b.M(this) && !UptodownApp.f29249C.S()) {
                    this.f29389R.p().startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom));
                }
                this.f29389R.p().setVisibility(0);
            }
            this.f29389R.p().setVisibility(0);
        }
    }

    public final Object x3(String str, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new h(str, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    public final Object y3(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new i(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    public final void z3(C2040e alternatives) {
        AbstractC3292y.i(alternatives, "alternatives");
        C1574e a9 = C1574e.f13529f.a(alternatives);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out).add(android.R.id.content, a9, (String) null).addToBackStack(alternatives.c()).commit();
        this.f29388Q.add(a9);
    }
}
