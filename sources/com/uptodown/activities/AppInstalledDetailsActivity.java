package com.uptodown.activities;

import F4.AbstractActivityC1198w2;
import Q5.InterfaceC1416k;
import Y4.C1503b0;
import Y4.C1514h;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import c5.C2035E;
import c5.C2041f;
import c5.C2043h;
import c5.C2046k;
import c5.Q;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppInstalledDetailsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.J0;
import q5.C3791p;
import s5.C3969c;

/* loaded from: classes4.dex */
public final class AppInstalledDetailsActivity extends AbstractActivityC1198w2 {

    /* renamed from: u0, reason: collision with root package name */
    public static final a f29433u0 = new a(null);

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1416k f29434q0 = Q5.l.b(new Function0() { // from class: F4.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C1514h S42;
            S42 = AppInstalledDetailsActivity.S4(AppInstalledDetailsActivity.this);
            return S42;
        }
    });

    /* renamed from: r0, reason: collision with root package name */
    private C2041f f29435r0;

    /* renamed from: s0, reason: collision with root package name */
    private C2043h f29436s0;

    /* renamed from: t0, reason: collision with root package name */
    private ArrayList f29437t0;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29438a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29440a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppInstalledDetailsActivity f29441b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f29442c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AppInstalledDetailsActivity appInstalledDetailsActivity, Q q8, U5.d dVar) {
                super(2, dVar);
                this.f29441b = appInstalledDetailsActivity;
                this.f29442c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f29441b, this.f29442c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29440a == 0) {
                    Q5.t.b(obj);
                    this.f29441b.V4().f12753n0.setTypeface(J4.j.f4395g.u());
                    this.f29441b.k5(this.f29442c.s());
                    if (this.f29442c.u() != 100) {
                        this.f29441b.V4().f12753n0.setText(this.f29441b.getString(R.string.updates_button_download_app));
                        this.f29441b.V4().f12753n0.setBackground(ContextCompat.getDrawable(this.f29441b, R.drawable.ripple_blue_primary_button));
                    } else {
                        this.f29441b.V4().f12753n0.setText(this.f29441b.getString(R.string.action_update));
                        this.f29441b.V4().f12753n0.setBackground(ContextCompat.getDrawable(this.f29441b, R.drawable.ripple_install_button));
                    }
                    if (UptodownApp.f29249C.R(this.f29442c.s())) {
                        this.f29441b.m5();
                        this.f29441b.V4().f12724Y.setText(this.f29441b.getString(R.string.status_download_update_pending));
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.AppInstalledDetailsActivity$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0694b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29443a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppInstalledDetailsActivity f29444b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0694b(AppInstalledDetailsActivity appInstalledDetailsActivity, U5.d dVar) {
                super(2, dVar);
                this.f29444b = appInstalledDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0694b(this.f29444b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29443a == 0) {
                    Q5.t.b(obj);
                    if (!this.f29444b.isFinishing()) {
                        AppInstalledDetailsActivity appInstalledDetailsActivity = this.f29444b;
                        String packageName = appInstalledDetailsActivity.getPackageName();
                        AbstractC3292y.h(packageName, "getPackageName(...)");
                        appInstalledDetailsActivity.k5(packageName);
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((C0694b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29438a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                C3791p.a aVar = C3791p.f37286s;
                Context applicationContext = AppInstalledDetailsActivity.this.getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                C3791p a9 = aVar.a(applicationContext);
                a9.a();
                C2041f c2041f = AppInstalledDetailsActivity.this.f29435r0;
                AbstractC3292y.f(c2041f);
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                Q s02 = a9.s0(Q8);
                a9.i();
                if (s02 != null && s02.h() == 0) {
                    J0 c8 = C3445b0.c();
                    a aVar2 = new a(AppInstalledDetailsActivity.this, s02, null);
                    this.f29438a = 1;
                    if (AbstractC3458i.g(c8, aVar2, this) == e8) {
                        return e8;
                    }
                }
            }
            if (UptodownApp.f29249C.M()) {
                C2041f c2041f2 = AppInstalledDetailsActivity.this.f29435r0;
                AbstractC3292y.f(c2041f2);
                if (l6.n.t(c2041f2.Q(), AppInstalledDetailsActivity.this.getPackageName(), false, 2, null)) {
                    J0 c9 = C3445b0.c();
                    C0694b c0694b = new C0694b(AppInstalledDetailsActivity.this, null);
                    this.f29438a = 2;
                    if (AbstractC3458i.g(c9, c0694b, this) == e8) {
                        return e8;
                    }
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29445a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29446b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppInstalledDetailsActivity f29447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, AppInstalledDetailsActivity appInstalledDetailsActivity, U5.d dVar) {
            super(2, dVar);
            this.f29446b = str;
            this.f29447c = appInstalledDetailsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f29446b, this.f29447c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29445a == 0) {
                Q5.t.b(obj);
                if (AbstractC3292y.d(this.f29446b, "app_updated")) {
                    this.f29447c.Y4();
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements b5.r {
        d() {
        }

        @Override // b5.r
        public void b(int i8) {
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            C2046k p8;
            AbstractC3292y.i(appInfo, "appInfo");
            AppInstalledDetailsActivity.this.f29436s0 = appInfo;
            if (!AppInstalledDetailsActivity.this.isFinishing() && (p8 = appInfo.p()) != null && p8.u() == 1) {
                AppInstalledDetailsActivity.this.V4().f12719T.setText(AppInstalledDetailsActivity.this.getString(R.string.app_detail_play_button));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29449a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29450b;

        /* renamed from: d, reason: collision with root package name */
        int f29452d;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29450b = obj;
            this.f29452d |= Integer.MIN_VALUE;
            return AppInstalledDetailsActivity.this.X4(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29453a;

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            PackageInfo packageInfo;
            PermissionInfo[] permissionInfoArr;
            V5.b.e();
            if (this.f29453a == 0) {
                Q5.t.b(obj);
                try {
                    PackageManager packageManager = AppInstalledDetailsActivity.this.getPackageManager();
                    AbstractC3292y.h(packageManager, "getPackageManager(...)");
                    C2041f c2041f = AppInstalledDetailsActivity.this.f29435r0;
                    AbstractC3292y.f(c2041f);
                    String Q8 = c2041f.Q();
                    AbstractC3292y.f(Q8);
                    packageInfo = S4.r.d(packageManager, Q8, 4096);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null && (permissionInfoArr = packageInfo.permissions) != null) {
                    AppInstalledDetailsActivity.this.f29437t0 = new ArrayList();
                    Iterator a9 = AbstractC3274f.a(permissionInfoArr);
                    while (a9.hasNext()) {
                        PermissionInfo permissionInfo = (PermissionInfo) a9.next();
                        C2035E c2035e = new C2035E();
                        c2035e.c(String.valueOf(permissionInfo.loadDescription(AppInstalledDetailsActivity.this.getPackageManager())));
                        c2035e.d(permissionInfo.name);
                        ArrayList arrayList = AppInstalledDetailsActivity.this.f29437t0;
                        AbstractC3292y.f(arrayList);
                        arrayList.add(c2035e);
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29455a;

        g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            V5.b.e();
            if (this.f29455a == 0) {
                Q5.t.b(obj);
                if (AppInstalledDetailsActivity.this.f29437t0 != null) {
                    ArrayList arrayList = AppInstalledDetailsActivity.this.f29437t0;
                    AbstractC3292y.f(arrayList);
                    if (arrayList.size() > 0) {
                        AppInstalledDetailsActivity appInstalledDetailsActivity = AppInstalledDetailsActivity.this;
                        ArrayList arrayList2 = appInstalledDetailsActivity.f29437t0;
                        AbstractC3292y.f(arrayList2);
                        LinearLayout llPermissionsAida = AppInstalledDetailsActivity.this.V4().f12762s;
                        AbstractC3292y.h(llPermissionsAida, "llPermissionsAida");
                        appInstalledDetailsActivity.j5(arrayList2, llPermissionsAida);
                        ArrayList arrayList3 = AppInstalledDetailsActivity.this.f29437t0;
                        AbstractC3292y.f(arrayList3);
                        i8 = arrayList3.size();
                        AppInstalledDetailsActivity.this.V4().f12722W.setText(String.valueOf(i8));
                        return Q5.I.f8786a;
                    }
                }
                AppInstalledDetailsActivity.this.V4().f12700A.setVisibility(8);
                i8 = 0;
                AppInstalledDetailsActivity.this.V4().f12722W.setText(String.valueOf(i8));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29457a;

        h(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29457a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity = AppInstalledDetailsActivity.this;
                this.f29457a = 1;
                if (appInstalledDetailsActivity.X4(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29459a;

        i(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29459a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity = AppInstalledDetailsActivity.this;
                this.f29459a = 1;
                if (appInstalledDetailsActivity.T4(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements b5.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f29461a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppInstalledDetailsActivity f29462b;

        j(CharSequence charSequence, AppInstalledDetailsActivity appInstalledDetailsActivity) {
            this.f29461a = charSequence;
            this.f29462b = appInstalledDetailsActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(AppInstalledDetailsActivity appInstalledDetailsActivity, C2043h c2043h, View view) {
            if (UptodownApp.f29249C.a0()) {
                appInstalledDetailsActivity.C2(c2043h.h());
            }
        }

        @Override // b5.r
        public void b(int i8) {
        }

        @Override // b5.r
        public void c(final C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            SpannableString a9 = defpackage.b.f14849d.a(this.f29461a.toString());
            float dimension = this.f29462b.getResources().getDimension(R.dimen.text_size_m);
            Typeface v8 = J4.j.f4395g.v();
            AbstractC3292y.f(v8);
            a9.setSpan(new defpackage.b(dimension, v8, ContextCompat.getColor(this.f29462b, R.color.blue_primary)), 0, this.f29461a.length(), 33);
            this.f29462b.V4().f12755o0.setText(a9);
            TextView textView = this.f29462b.V4().f12755o0;
            final AppInstalledDetailsActivity appInstalledDetailsActivity = this.f29462b;
            textView.setOnClickListener(new View.OnClickListener() { // from class: F4.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppInstalledDetailsActivity.j.d(AppInstalledDetailsActivity.this, appInfo, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29463a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29465c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29466d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29467a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f29468b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AppInstalledDetailsActivity f29469c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f29470d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Q f29471e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i8, AppInstalledDetailsActivity appInstalledDetailsActivity, String str, Q q8, U5.d dVar) {
                super(2, dVar);
                this.f29468b = i8;
                this.f29469c = appInstalledDetailsActivity;
                this.f29470d = str;
                this.f29471e = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f29468b, this.f29469c, this.f29470d, this.f29471e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29467a == 0) {
                    Q5.t.b(obj);
                    switch (this.f29468b) {
                        case 102:
                            Toast.makeText(this.f29469c.getApplicationContext(), R.string.descarga_error, 1).show();
                            break;
                        case 103:
                        case 106:
                            AppInstalledDetailsActivity appInstalledDetailsActivity = this.f29469c;
                            String str = this.f29470d;
                            AbstractC3292y.f(str);
                            appInstalledDetailsActivity.k5(str);
                            this.f29469c.V4().f12724Y.setText(this.f29469c.getString(R.string.zero) + this.f29469c.getString(R.string.percent));
                            this.f29469c.V4().f12766u.setProgress(0);
                            break;
                        case 104:
                        case 105:
                        default:
                            this.f29469c.V4().f12766u.setIndeterminate(false);
                            if (this.f29471e != null) {
                                this.f29469c.m5();
                                this.f29469c.V4().f12766u.setProgress(this.f29471e.u());
                                this.f29469c.V4().f12724Y.setText(this.f29469c.getString(R.string.percent_of_total_size, kotlin.coroutines.jvm.internal.b.c(this.f29471e.u()), new S4.g().c(this.f29471e.v())));
                                break;
                            } else {
                                this.f29469c.Y4();
                                break;
                            }
                        case 107:
                            this.f29469c.m5();
                            this.f29469c.V4().f12724Y.setText(this.f29469c.getString(R.string.status_download_update_pending));
                            break;
                        case 108:
                            AppInstalledDetailsActivity appInstalledDetailsActivity2 = this.f29469c;
                            String str2 = this.f29470d;
                            AbstractC3292y.f(str2);
                            appInstalledDetailsActivity2.k5(str2);
                            Q q8 = this.f29471e;
                            if (q8 != null && q8.u() == 100) {
                                this.f29469c.V4().f12753n0.setText(this.f29469c.getString(R.string.action_update));
                                this.f29469c.V4().f12753n0.setBackground(ContextCompat.getDrawable(this.f29469c, R.drawable.ripple_install_button));
                                this.f29469c.V4().f12753n0.setVisibility(0);
                                break;
                            }
                            break;
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i8, String str, U5.d dVar) {
            super(2, dVar);
            this.f29465c = i8;
            this.f29466d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(this.f29465c, this.f29466d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29463a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C3791p.a aVar = C3791p.f37286s;
                Context applicationContext = AppInstalledDetailsActivity.this.getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                C3791p a9 = aVar.a(applicationContext);
                a9.a();
                C2041f c2041f = AppInstalledDetailsActivity.this.f29435r0;
                AbstractC3292y.f(c2041f);
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                Q s02 = a9.s0(Q8);
                a9.i();
                J0 c8 = C3445b0.c();
                a aVar2 = new a(this.f29465c, AppInstalledDetailsActivity.this, this.f29466d, s02, null);
                this.f29463a = 1;
                if (AbstractC3458i.g(c8, aVar2, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1514h S4(AppInstalledDetailsActivity appInstalledDetailsActivity) {
        return C1514h.c(appInstalledDetailsActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T4(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1514h V4() {
        return (C1514h) this.f29434q0.getValue();
    }

    private final void W4() {
        C2041f c2041f = this.f29435r0;
        AbstractC3292y.f(c2041f);
        new X4.i(this, c2041f.b(), new d(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object X4(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.activities.AppInstalledDetailsActivity.e
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.activities.AppInstalledDetailsActivity$e r0 = (com.uptodown.activities.AppInstalledDetailsActivity.e) r0
            int r1 = r0.f29452d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29452d = r1
            goto L18
        L13:
            com.uptodown.activities.AppInstalledDetailsActivity$e r0 = new com.uptodown.activities.AppInstalledDetailsActivity$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29450b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f29452d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f29449a
            com.uptodown.activities.AppInstalledDetailsActivity r2 = (com.uptodown.activities.AppInstalledDetailsActivity) r2
            Q5.t.b(r7)
            goto L55
        L3d:
            Q5.t.b(r7)
            n6.I r7 = n6.C3445b0.b()
            com.uptodown.activities.AppInstalledDetailsActivity$f r2 = new com.uptodown.activities.AppInstalledDetailsActivity$f
            r2.<init>(r5)
            r0.f29449a = r6
            r0.f29452d = r4
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            n6.J0 r7 = n6.C3445b0.c()
            com.uptodown.activities.AppInstalledDetailsActivity$g r4 = new com.uptodown.activities.AppInstalledDetailsActivity$g
            r4.<init>(r5)
            r0.f29449a = r5
            r0.f29452d = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppInstalledDetailsActivity.X4(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y4() {
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAida = V4().f12766u;
        AbstractC3292y.h(pbProgressAida, "pbProgressAida");
        ImageView ivLogoAida = V4().f12734e;
        AbstractC3292y.h(ivLogoAida, "ivLogoAida");
        c3969c.c(pbProgressAida, ivLogoAida);
        V4().f12758q.setVisibility(8);
        V4().f12753n0.setVisibility(8);
        V4().f12761r0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(AppInstalledDetailsActivity appInstalledDetailsActivity, View view) {
        appInstalledDetailsActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a5(View view) {
    }

    private final void b5() {
        V4().f12707H.setVisibility(8);
        V4().f12718S.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c5() {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppInstalledDetailsActivity.c5():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d5(AppInstalledDetailsActivity appInstalledDetailsActivity, View view) {
        PackageManager packageManager = appInstalledDetailsActivity.getPackageManager();
        C2041f c2041f = appInstalledDetailsActivity.f29435r0;
        AbstractC3292y.f(c2041f);
        String Q8 = c2041f.Q();
        AbstractC3292y.f(Q8);
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(Q8);
        if (launchIntentForPackage != null) {
            appInstalledDetailsActivity.startActivity(launchIntentForPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(AppInstalledDetailsActivity appInstalledDetailsActivity, View view) {
        J4.i iVar = new J4.i(appInstalledDetailsActivity);
        C2041f c2041f = appInstalledDetailsActivity.f29435r0;
        AbstractC3292y.f(c2041f);
        String Q8 = c2041f.Q();
        AbstractC3292y.f(Q8);
        iVar.h(Q8);
        appInstalledDetailsActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(AppInstalledDetailsActivity appInstalledDetailsActivity, View view) {
        Intent intent = new Intent(appInstalledDetailsActivity, (Class<?>) AppFilesActivity.class);
        intent.putExtra("appInstalled", appInstalledDetailsActivity.f29435r0);
        appInstalledDetailsActivity.startActivity(intent, UptodownApp.f29249C.a(appInstalledDetailsActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g5(final AppInstalledDetailsActivity appInstalledDetailsActivity, View view) {
        if (appInstalledDetailsActivity.V4().f12762s.getVisibility() == 0) {
            appInstalledDetailsActivity.V4().f12762s.setVisibility(8);
            appInstalledDetailsActivity.V4().f12742i.setImageResource(R.drawable.vector_add);
        } else {
            appInstalledDetailsActivity.V4().f12762s.setVisibility(0);
            appInstalledDetailsActivity.V4().f12742i.setImageResource(R.drawable.vector_remove);
            appInstalledDetailsActivity.V4().f12707H.post(new Runnable() { // from class: F4.k
                @Override // java.lang.Runnable
                public final void run() {
                    AppInstalledDetailsActivity.h5(AppInstalledDetailsActivity.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h5(AppInstalledDetailsActivity appInstalledDetailsActivity) {
        appInstalledDetailsActivity.V4().f12707H.smoothScrollTo(0, appInstalledDetailsActivity.V4().f12700A.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i5(AppInstalledDetailsActivity appInstalledDetailsActivity, View view) {
        Intent intent = new Intent(appInstalledDetailsActivity, (Class<?>) AppDetailActivity.class);
        C2043h c2043h = appInstalledDetailsActivity.f29436s0;
        if (c2043h != null) {
            intent.putExtra("appInfo", c2043h);
        } else {
            C2041f c2041f = appInstalledDetailsActivity.f29435r0;
            AbstractC3292y.f(c2041f);
            intent.putExtra("appId", c2041f.b());
        }
        appInstalledDetailsActivity.startActivity(intent, UptodownApp.f29249C.a(appInstalledDetailsActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j5(ArrayList arrayList, LinearLayout linearLayout) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1503b0 c8 = C1503b0.c(LayoutInflater.from(getApplicationContext()));
            AbstractC3292y.h(c8, "inflate(...)");
            c8.f12485b.setTypeface(J4.j.f4395g.v());
            c8.f12485b.setText(((C2035E) arrayList.get(i8)).b());
            linearLayout.addView(c8.getRoot());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k5(final String str) {
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAida = V4().f12766u;
        AbstractC3292y.h(pbProgressAida, "pbProgressAida");
        ImageView ivLogoAida = V4().f12734e;
        AbstractC3292y.h(ivLogoAida, "ivLogoAida");
        c3969c.c(pbProgressAida, ivLogoAida);
        V4().f12724Y.setVisibility(0);
        V4().f12761r0.setVisibility(0);
        V4().f12758q.setVisibility(8);
        V4().f12753n0.setText(getString(R.string.updates_button_download_app));
        V4().f12753n0.setTextColor(ContextCompat.getColor(this, R.color.white));
        V4().f12753n0.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_blue_primary_button));
        V4().f12753n0.setOnClickListener(new View.OnClickListener() { // from class: F4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppInstalledDetailsActivity.l5(AppInstalledDetailsActivity.this, str, view);
            }
        });
        V4().f12753n0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l5(AppInstalledDetailsActivity appInstalledDetailsActivity, String str, View view) {
        appInstalledDetailsActivity.l4(appInstalledDetailsActivity.f29435r0);
        if (UptodownApp.f29249C.R(str)) {
            appInstalledDetailsActivity.m5();
            appInstalledDetailsActivity.V4().f12724Y.setText(appInstalledDetailsActivity.getString(R.string.status_download_update_pending));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m5() {
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAida = V4().f12766u;
        AbstractC3292y.h(pbProgressAida, "pbProgressAida");
        ImageView ivLogoAida = V4().f12734e;
        AbstractC3292y.h(ivLogoAida, "ivLogoAida");
        c3969c.e(pbProgressAida, ivLogoAida);
        V4().f12758q.setVisibility(0);
        V4().f12761r0.setVisibility(8);
        V4().f12753n0.setText(getString(R.string.option_button_cancel));
        V4().f12753n0.setTextColor(ContextCompat.getColor(this, R.color.main_blue));
        V4().f12753n0.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_open_button));
        V4().f12753n0.setOnClickListener(new View.OnClickListener() { // from class: F4.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppInstalledDetailsActivity.n5(AppInstalledDetailsActivity.this, view);
            }
        });
        V4().f12753n0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n5(AppInstalledDetailsActivity appInstalledDetailsActivity, View view) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        C2041f c2041f = appInstalledDetailsActivity.f29435r0;
        AbstractC3292y.f(c2041f);
        String Q8 = c2041f.Q();
        AbstractC3292y.f(Q8);
        aVar.c0(Q8, appInstalledDetailsActivity);
    }

    public final Object U4(String str, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new c(str, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    @Override // F4.AbstractActivityC1198w2
    protected void o4() {
    }

    public final Object o5(int i8, String str, U5.d dVar) {
        C2041f c2041f = this.f29435r0;
        AbstractC3292y.f(c2041f);
        if (AbstractC3292y.d(str, c2041f.Q())) {
            Object g8 = AbstractC3458i.g(C3445b0.b(), new k(i8, str, null), dVar);
            if (g8 == V5.b.e()) {
                return g8;
            }
            return Q5.I.f8786a;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppInstalledDetailsActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str;
        super.onResume();
        if (this.f29435r0 != null) {
            P4.a h8 = J4.j.f4395g.h();
            if (h8 != null) {
                str = h8.b();
            } else {
                str = null;
            }
            C2041f c2041f = this.f29435r0;
            AbstractC3292y.f(c2041f);
            if (l6.n.s(str, c2041f.Q(), true)) {
                V4().f12766u.setIndeterminate(true);
                C3969c c3969c = C3969c.f39130a;
                ProgressBar pbProgressAida = V4().f12766u;
                AbstractC3292y.h(pbProgressAida, "pbProgressAida");
                ImageView ivLogoAida = V4().f12734e;
                AbstractC3292y.h(ivLogoAida, "ivLogoAida");
                c3969c.e(pbProgressAida, ivLogoAida);
            }
        }
    }
}
