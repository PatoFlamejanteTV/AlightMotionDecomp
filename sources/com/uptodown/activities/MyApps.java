package com.uptodown.activities;

import F4.AbstractActivityC1198w2;
import I4.C1239s;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import b5.InterfaceC1976E;
import b5.InterfaceC1978b;
import c5.C2041f;
import c5.C2043h;
import c5.Q;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.C2705o;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.GenerateQueueWorker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3800y;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class MyApps extends AbstractActivityC1198w2 {

    /* renamed from: s0, reason: collision with root package name */
    private C1239s f29845s0;

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1416k f29843q0 = Q5.l.b(new Function0() { // from class: F4.V1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.O K42;
            K42 = MyApps.K4(MyApps.this);
            return K42;
        }
    });

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1416k f29844r0 = new ViewModelLazy(U.b(C2705o.class), new i(this), new h(this), new j(null, this));

    /* renamed from: t0, reason: collision with root package name */
    private final b f29846t0 = new b();

    /* renamed from: u0, reason: collision with root package name */
    private final k f29847u0 = new k();

    /* renamed from: v0, reason: collision with root package name */
    private final e f29848v0 = new e();

    /* renamed from: w0, reason: collision with root package name */
    private final d f29849w0 = new d();

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29850a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29851b;

        public a(int i8, String str) {
            this.f29850a = i8;
            this.f29851b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = this.f29850a;
            boolean z8 = true;
            if (i8 != 102) {
                if (i8 == 104) {
                    Toast.makeText(MyApps.this.getApplicationContext(), R.string.no_free_space, 1).show();
                }
            } else {
                Toast.makeText(MyApps.this.getApplicationContext(), R.string.descarga_error, 1).show();
            }
            if (MyApps.this.f29845s0 != null) {
                int i9 = 0;
                if (this.f29851b != null) {
                    C1239s c1239s = MyApps.this.f29845s0;
                    AbstractC3292y.f(c1239s);
                    ArrayList b9 = c1239s.b();
                    int i10 = 0;
                    while (i10 < b9.size()) {
                        if (b9.get(i10) instanceof C2041f) {
                            Object obj = b9.get(i10);
                            AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                            C2041f c2041f = (C2041f) obj;
                            if (c2041f.Q() != null && l6.n.s(c2041f.Q(), this.f29851b, true)) {
                                i9 = i10;
                                break;
                            }
                        }
                        i10++;
                    }
                    i9 = i10;
                }
                z8 = false;
                if (z8) {
                    C1239s c1239s2 = MyApps.this.f29845s0;
                    AbstractC3292y.f(c1239s2);
                    c1239s2.notifyItemChanged(i9);
                } else {
                    C1239s c1239s3 = MyApps.this.f29845s0;
                    AbstractC3292y.f(c1239s3);
                    c1239s3.c();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1978b {
        b() {
        }

        @Override // b5.InterfaceC1978b
        public void a(int i8) {
            if (UptodownApp.f29249C.a0() && MyApps.this.T4(i8)) {
                C1239s c1239s = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s);
                Object obj = c1239s.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                C2041f c2041f = (C2041f) obj;
                if (c2041f.c0() == C2041f.c.f15791b) {
                    MyApps myApps = MyApps.this;
                    myApps.K3(c2041f, i8, myApps.f29847u0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29854a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29856c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29857d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, U5.d dVar) {
            super(2, dVar);
            this.f29856c = str;
            this.f29857d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f29856c, this.f29857d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:            if (r0.equals("app_updated") != false) goto L22;     */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:            if (r4 < 0) goto L24;     */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:            r3.f29855b.U4(false);     */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:            if (r0.equals("app_installed") == false) goto L24;     */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                V5.b.e()
                int r0 = r3.f29854a
                if (r0 != 0) goto L6d
                Q5.t.b(r4)
                com.uptodown.activities.MyApps r4 = com.uptodown.activities.MyApps.this
                java.lang.String r0 = r3.f29856c
                int r4 = com.uptodown.activities.MyApps.E4(r4, r0)
                java.lang.String r0 = r3.f29857d
                int r1 = r0.hashCode()
                r2 = -1972881700(0xffffffff8a6836dc, float:-1.11807116E-32)
                if (r1 == r2) goto L59
                r2 = -1487908707(0xffffffffa750509d, float:-2.89095E-15)
                if (r1 == r2) goto L50
                r2 = 389690339(0x173a33e3, float:6.016533E-25)
                if (r1 == r2) goto L28
                goto L6a
            L28:
                java.lang.String r1 = "app_uninstalled"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L31
                goto L6a
            L31:
                if (r4 < 0) goto L6a
                com.uptodown.activities.MyApps r0 = com.uptodown.activities.MyApps.this
                I4.s r0 = com.uptodown.activities.MyApps.C4(r0)
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                java.util.ArrayList r0 = r0.b()
                r0.remove(r4)
                com.uptodown.activities.MyApps r0 = com.uptodown.activities.MyApps.this
                I4.s r0 = com.uptodown.activities.MyApps.C4(r0)
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                r0.notifyItemRemoved(r4)
                goto L6a
            L50:
                java.lang.String r1 = "app_updated"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L6a
                goto L62
            L59:
                java.lang.String r1 = "app_installed"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L62
                goto L6a
            L62:
                if (r4 < 0) goto L6a
                com.uptodown.activities.MyApps r4 = com.uptodown.activities.MyApps.this
                r0 = 0
                r4.U4(r0)
            L6a:
                Q5.I r4 = Q5.I.f8786a
                return r4
            L6d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MyApps.c.invokeSuspend(java.lang.Object):java.lang.Object");
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
            AbstractC3292y.i(appInfo, "appInfo");
            String r02 = appInfo.r0();
            if (r02 != null && !l6.n.T(r02)) {
                HashMap e42 = MyApps.this.e4();
                AbstractC3292y.f(e42);
                String v02 = appInfo.v0();
                AbstractC3292y.f(v02);
                String r03 = appInfo.r0();
                AbstractC3292y.f(r03);
                e42.put(v02, r03);
                C1239s c1239s = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s);
                c1239s.d(appInfo);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements b5.t {
        e() {
        }

        @Override // b5.t
        public void a() {
            if (UptodownApp.f29249C.a0()) {
                MyApps myApps = MyApps.this;
                String string = myApps.getString(R.string.disabled_apps_explanation);
                AbstractC3292y.h(string, "getString(...)");
                myApps.Z1(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29860a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MyApps f29862a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.activities.MyApps$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0696a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f29863a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MyApps f29864b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0696a(MyApps myApps, U5.d dVar) {
                    super(2, dVar);
                    this.f29864b = myApps;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0696a(this.f29864b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f29863a == 0) {
                        Q5.t.b(obj);
                        this.f29864b.M4().f12369b.f12236b.setVisibility(0);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(n6.M m8, U5.d dVar) {
                    return ((C0696a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f29865a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MyApps f29866b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC3768A f29867c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(MyApps myApps, AbstractC3768A abstractC3768A, U5.d dVar) {
                    super(2, dVar);
                    this.f29866b = myApps;
                    this.f29867c = abstractC3768A;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new b(this.f29866b, this.f29867c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f29865a == 0) {
                        Q5.t.b(obj);
                        this.f29866b.M4().f12369b.f12236b.setVisibility(8);
                        this.f29866b.V4(((C2705o.a) ((AbstractC3768A.c) this.f29867c).a()).d(), ((C2705o.a) ((AbstractC3768A.c) this.f29867c).a()).b(), ((C2705o.a) ((AbstractC3768A.c) this.f29867c).a()).a(), ((C2705o.a) ((AbstractC3768A.c) this.f29867c).a()).c());
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(n6.M m8, U5.d dVar) {
                    return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
                }
            }

            a(MyApps myApps) {
                this.f29862a = myApps;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    Object g8 = AbstractC3458i.g(C3445b0.c(), new C0696a(this.f29862a, null), dVar);
                    if (g8 == V5.b.e()) {
                        return g8;
                    }
                    return Q5.I.f8786a;
                }
                if (abstractC3768A instanceof AbstractC3768A.c) {
                    Object g9 = AbstractC3458i.g(C3445b0.c(), new b(this.f29862a, abstractC3768A, null), dVar);
                    if (g9 == V5.b.e()) {
                        return g9;
                    }
                    return Q5.I.f8786a;
                }
                if (abstractC3768A instanceof AbstractC3768A.b) {
                    return Q5.I.f8786a;
                }
                throw new Q5.p();
            }
        }

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29860a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L c8 = MyApps.this.O4().c();
                a aVar = new a(MyApps.this);
                this.f29860a = 1;
                if (c8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
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
        int f29868a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29870c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ArrayList arrayList, U5.d dVar) {
            super(2, dVar);
            this.f29870c = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(MyApps myApps, View view) {
            UptodownApp.a aVar = UptodownApp.f29249C;
            if (aVar.a0()) {
                myApps.startActivity(new Intent(myApps.getApplicationContext(), (Class<?>) SettingsPreferences.class), aVar.a(myApps));
                AlertDialog o22 = myApps.o2();
                if (o22 != null) {
                    o22.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(MyApps myApps, View view) {
            AlertDialog o22 = myApps.o2();
            if (o22 != null) {
                o22.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(MyApps myApps, View view) {
            AlertDialog o22 = myApps.o2();
            if (o22 != null) {
                o22.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(ArrayList arrayList, MyApps myApps, View view) {
            if (arrayList != null && arrayList.size() > 0) {
                myApps.X4(arrayList);
            }
            AlertDialog o22 = myApps.o2();
            if (o22 != null) {
                o22.dismiss();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f29870c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29868a == 0) {
                Q5.t.b(obj);
                AlertDialog o22 = MyApps.this.o2();
                if (o22 != null) {
                    o22.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MyApps.this);
                Y4.r c8 = Y4.r.c(MyApps.this.getLayoutInflater());
                AbstractC3292y.h(c8, "inflate(...)");
                final MyApps myApps = MyApps.this;
                final ArrayList arrayList = this.f29870c;
                TextView textView = c8.f12917g;
                j.a aVar = J4.j.f4395g;
                textView.setTypeface(aVar.u());
                c8.f12914d.setTypeface(aVar.v());
                c8.f12916f.setTypeface(aVar.u());
                c8.f12913c.setTypeface(aVar.u());
                c8.f12915e.setTypeface(aVar.u());
                c8.f12916f.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.g.q(MyApps.this, view);
                    }
                });
                c8.f12913c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.g.r(MyApps.this, view);
                    }
                });
                c8.f12912b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.g.u(MyApps.this, view);
                    }
                });
                c8.f12915e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.g.v(arrayList, myApps, view);
                    }
                });
                builder.setView(c8.getRoot());
                MyApps.this.K2(builder.create());
                if (!MyApps.this.isFinishing() && MyApps.this.o2() != null) {
                    MyApps.this.S2();
                }
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
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f29871a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29871a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29872a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f29872a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29872a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29873a = function0;
            this.f29874b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29873a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29874b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC1976E {
        k() {
        }

        @Override // b5.InterfaceC1976E
        public void a(int i8) {
            if (UptodownApp.f29249C.a0() && MyApps.this.T4(i8)) {
                C1239s c1239s = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s);
                Object obj = c1239s.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                C2041f c2041f = (C2041f) obj;
                if (c2041f.c0() == C2041f.c.f15790a) {
                    MyApps.this.K3(c2041f, i8, this);
                }
            }
        }

        @Override // b5.InterfaceC1976E
        public void b(int i8) {
            if (MyApps.this.T4(i8)) {
                C1239s c1239s = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s);
                Object obj = c1239s.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C2041f) obj).H0(true);
                C1239s c1239s2 = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s2);
                c1239s2.notifyItemChanged(i8);
            }
        }

        @Override // b5.InterfaceC1976E
        public void c(int i8) {
            if (UptodownApp.f29249C.a0() && MyApps.this.T4(i8)) {
                C1239s c1239s = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s);
                Object obj = c1239s.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                C2041f c2041f = (C2041f) obj;
                if (c2041f.c0() == C2041f.c.f15790a) {
                    MyApps.this.l4(c2041f);
                    C1239s c1239s2 = MyApps.this.f29845s0;
                    if (c1239s2 != null) {
                        c1239s2.notifyItemChanged(i8);
                    }
                }
            }
        }

        @Override // b5.InterfaceC1976E
        public void d(int i8) {
            if (MyApps.this.T4(i8)) {
                C1239s c1239s = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s);
                c1239s.notifyItemChanged(i8);
            }
            MyApps.this.U4(false);
        }

        @Override // b5.InterfaceC1976E
        public void e(int i8) {
            if (UptodownApp.f29249C.a0() && MyApps.this.T4(i8)) {
                C1239s c1239s = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s);
                Object obj = c1239s.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                MyApps.this.k4((C2041f) obj);
                C1239s c1239s2 = MyApps.this.f29845s0;
                if (c1239s2 != null) {
                    c1239s2.notifyItemChanged(i8);
                }
            }
        }

        @Override // b5.InterfaceC1976E
        public void f(int i8) {
            if (MyApps.this.T4(i8)) {
                C1239s c1239s = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s);
                Object obj = c1239s.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C2041f) obj).H0(false);
                C1239s c1239s2 = MyApps.this.f29845s0;
                AbstractC3292y.f(c1239s2);
                c1239s2.notifyItemChanged(i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29876a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29878c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29879d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, int i8, U5.d dVar) {
            super(2, dVar);
            this.f29878c = str;
            this.f29879d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(this.f29878c, this.f29879d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            String string;
            V5.b.e();
            if (this.f29876a == 0) {
                Q5.t.b(obj);
                if (MyApps.this.f29845s0 != null) {
                    C1239s c1239s = MyApps.this.f29845s0;
                    AbstractC3292y.f(c1239s);
                    ArrayList b9 = c1239s.b();
                    int i8 = 0;
                    while (true) {
                        if (i8 < b9.size()) {
                            if (b9.get(i8) instanceof C2041f) {
                                Object obj2 = b9.get(i8);
                                AbstractC3292y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                                z8 = true;
                                if (l6.n.s(((C2041f) obj2).Q(), this.f29878c, true)) {
                                    break;
                                }
                            }
                            i8++;
                        } else {
                            z8 = false;
                            break;
                        }
                    }
                    int i9 = this.f29879d;
                    if (i9 == 306) {
                        if (z8) {
                            C1239s c1239s2 = MyApps.this.f29845s0;
                            AbstractC3292y.f(c1239s2);
                            c1239s2.b().remove(i8);
                            C1239s c1239s3 = MyApps.this.f29845s0;
                            AbstractC3292y.f(c1239s3);
                            c1239s3.notifyItemRemoved(i8);
                        }
                    } else if (i9 == 301) {
                        if (z8) {
                            C1239s c1239s4 = MyApps.this.f29845s0;
                            AbstractC3292y.f(c1239s4);
                            c1239s4.notifyItemChanged(i8);
                        }
                    } else if (i9 != 305) {
                        if (i9 == 302) {
                            if (z8) {
                                C1239s c1239s5 = MyApps.this.f29845s0;
                                AbstractC3292y.f(c1239s5);
                                c1239s5.notifyItemChanged(i8);
                            } else {
                                MyApps.this.U4(false);
                            }
                        } else {
                            if (i9 != 303) {
                                if (i9 != 304) {
                                    if (i9 != 307) {
                                        string = "ERROR: (" + this.f29879d + ") " + MyApps.this.getString(R.string.error_generico);
                                    } else {
                                        string = MyApps.this.getString(R.string.error_generico);
                                    }
                                } else {
                                    string = MyApps.this.getString(R.string.msg_root_install_failed_invalid_versioncode);
                                }
                            } else {
                                string = MyApps.this.getString(R.string.msg_install_failed);
                            }
                            MyApps.this.Z1(string);
                            if (z8) {
                                C1239s c1239s6 = MyApps.this.f29845s0;
                                AbstractC3292y.f(c1239s6);
                                c1239s6.notifyItemChanged(i8);
                            } else {
                                C1239s c1239s7 = MyApps.this.f29845s0;
                                AbstractC3292y.f(c1239s7);
                                c1239s7.c();
                            }
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29880a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29881b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MyApps f29882c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29883d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i8, MyApps myApps, String str, U5.d dVar) {
            super(2, dVar);
            this.f29881b = i8;
            this.f29882c = myApps;
            this.f29883d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(this.f29881b, this.f29882c, this.f29883d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29880a == 0) {
                Q5.t.b(obj);
                int i8 = this.f29881b;
                boolean z8 = true;
                if (i8 != 102) {
                    if (i8 != 104) {
                        if (i8 == 106) {
                            Toast.makeText(this.f29882c.getApplicationContext(), R.string.download_cancelled, 1).show();
                        }
                    } else {
                        Toast.makeText(this.f29882c.getApplicationContext(), R.string.no_free_space, 1).show();
                    }
                } else {
                    Toast.makeText(this.f29882c.getApplicationContext(), R.string.descarga_error, 1).show();
                }
                if (this.f29882c.f29845s0 != null) {
                    int i9 = 0;
                    if (this.f29883d != null) {
                        C1239s c1239s = this.f29882c.f29845s0;
                        AbstractC3292y.f(c1239s);
                        ArrayList b9 = c1239s.b();
                        int i10 = 0;
                        while (i10 < b9.size()) {
                            if (b9.get(i10) instanceof C2041f) {
                                Object obj2 = b9.get(i10);
                                AbstractC3292y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                                C2041f c2041f = (C2041f) obj2;
                                if (c2041f.Q() != null && l6.n.s(c2041f.Q(), this.f29883d, true)) {
                                    i9 = i10;
                                    break;
                                }
                            }
                            i10++;
                        }
                        i9 = i10;
                    }
                    z8 = false;
                    if (z8) {
                        C1239s c1239s2 = this.f29882c.f29845s0;
                        AbstractC3292y.f(c1239s2);
                        c1239s2.notifyItemChanged(i9);
                    } else {
                        C1239s c1239s3 = this.f29882c.f29845s0;
                        AbstractC3292y.f(c1239s3);
                        c1239s3.c();
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.O K4(MyApps myApps) {
        return Y4.O.c(myApps.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y4.O M4() {
        return (Y4.O) this.f29843q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int N4(String str) {
        ArrayList arrayList;
        C1239s c1239s = this.f29845s0;
        ArrayList arrayList2 = null;
        if (c1239s != null) {
            arrayList = c1239s.b();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            C1239s c1239s2 = this.f29845s0;
            if (c1239s2 != null) {
                arrayList2 = c1239s2.b();
            }
            AbstractC3292y.f(arrayList2);
            int i8 = 0;
            for (Object obj : arrayList2) {
                int i9 = i8 + 1;
                if (((obj instanceof Q) && l6.n.s(((Q) obj).s(), str, true)) || ((obj instanceof C2041f) && l6.n.s(((C2041f) obj).Q(), str, true))) {
                    return i8;
                }
                i8 = i9;
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2705o O4() {
        return (C2705o) this.f29844r0.getValue();
    }

    private final void P4() {
        setContentView(M4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            M4().f12371d.setNavigationIcon(drawable);
            M4().f12371d.setNavigationContentDescription(getString(R.string.back));
        }
        M4().f12371d.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.W1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyApps.Q4(MyApps.this, view);
            }
        });
        M4().f12371d.inflateMenu(R.menu.toolbar_menu_my_apps);
        M4().f12372e.setTypeface(J4.j.f4395g.u());
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        boolean g02 = aVar.g0(this);
        M4().f12371d.getMenu().findItem(R.id.action_show_system_apps).setChecked(g02);
        M4().f12371d.getMenu().findItem(R.id.action_show_system_services).setChecked(aVar.h0(this));
        Toolbar toolbarMyApps = M4().f12371d;
        AbstractC3292y.h(toolbarMyApps, "toolbarMyApps");
        c4(R.id.action_show_system_services, g02, toolbarMyApps);
        M4().f12371d.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        M4().f12371d.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: F4.X1
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean R42;
                R42 = MyApps.R4(MyApps.this, menuItem);
                return R42;
            }
        });
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        M4().f12370c.addItemDecoration(new s5.m(dimension, dimension));
        M4().f12370c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        M4().f12370c.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) M4().f12370c.getItemAnimator();
        AbstractC3292y.f(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        M4().f12369b.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.Y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyApps.S4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q4(MyApps myApps, View view) {
        myApps.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R4(MyApps myApps, MenuItem item) {
        AbstractC3292y.i(item, "item");
        if (item.getItemId() == R.id.action_show_system_apps) {
            boolean isChecked = item.isChecked();
            item.setChecked(!isChecked);
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            Context applicationContext = myApps.getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            aVar.V0(applicationContext, !isChecked);
            if (isChecked) {
                Context applicationContext2 = myApps.getApplicationContext();
                AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                aVar.W0(applicationContext2, false);
                Toolbar toolbarMyApps = myApps.M4().f12371d;
                AbstractC3292y.h(toolbarMyApps, "toolbarMyApps");
                myApps.c4(R.id.action_show_system_services, false, toolbarMyApps);
                Toolbar toolbarMyApps2 = myApps.M4().f12371d;
                AbstractC3292y.h(toolbarMyApps2, "toolbarMyApps");
                myApps.A3(R.id.action_show_system_services, false, toolbarMyApps2);
            } else {
                Toolbar toolbarMyApps3 = myApps.M4().f12371d;
                AbstractC3292y.h(toolbarMyApps3, "toolbarMyApps");
                myApps.c4(R.id.action_show_system_services, true, toolbarMyApps3);
            }
            myApps.U4(true);
        } else if (item.getItemId() == R.id.action_show_system_services) {
            boolean isChecked2 = item.isChecked();
            item.setChecked(!isChecked2);
            SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
            Context applicationContext3 = myApps.getApplicationContext();
            AbstractC3292y.h(applicationContext3, "getApplicationContext(...)");
            aVar2.W0(applicationContext3, !isChecked2);
            myApps.U4(true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T4(int i8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1239s c1239s = this.f29845s0;
        if (c1239s != null) {
            ArrayList arrayList3 = null;
            if (c1239s != null) {
                arrayList = c1239s.b();
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                C1239s c1239s2 = this.f29845s0;
                if (c1239s2 != null) {
                    arrayList2 = c1239s2.b();
                } else {
                    arrayList2 = null;
                }
                AbstractC3292y.f(arrayList2);
                if (arrayList2.size() > i8) {
                    C1239s c1239s3 = this.f29845s0;
                    if (c1239s3 != null) {
                        arrayList3 = c1239s3.b();
                    }
                    AbstractC3292y.f(arrayList3);
                    if (arrayList3.get(i8) instanceof C2041f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V4(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        C1239s c1239s = this.f29845s0;
        if (c1239s == null) {
            this.f29845s0 = new C1239s(arrayList, arrayList2, arrayList3, arrayList4, this, this.f29846t0, this.f29847u0, this.f29848v0);
            M4().f12370c.setAdapter(this.f29845s0);
        } else {
            AbstractC3292y.f(c1239s);
            c1239s.g(arrayList, arrayList2, arrayList3, arrayList4);
        }
        if (!arrayList.isEmpty()) {
            if (e4() == null) {
                p4(new HashMap());
                ArrayList arrayList5 = new ArrayList(AbstractC1435t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList5.add(Long.valueOf(((C2041f) it.next()).b()));
                }
                new X4.l(this, arrayList5, this.f29849w0, LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            C1239s c1239s2 = this.f29845s0;
            AbstractC3292y.f(c1239s2);
            HashMap e42 = e4();
            AbstractC3292y.f(e42);
            c1239s2.e(e42);
            Q5.I i8 = Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4(ArrayList arrayList) {
        if (!UptodownApp.f29249C.W("GenerateQueueWorker", this)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", true).putString("packagename", ((C2041f) arrayList.get(0)).Q()).build();
            AbstractC3292y.h(build, "build(...)");
            WorkManager.getInstance(this).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
            Y4();
        }
    }

    private final void Y4() {
        runOnUiThread(new Runnable() { // from class: F4.Z1
            @Override // java.lang.Runnable
            public final void run() {
                MyApps.Z4(MyApps.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(final MyApps myApps) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: F4.a2
            @Override // java.lang.Runnable
            public final void run() {
                MyApps.a5(MyApps.this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a5(MyApps myApps) {
        C1239s c1239s = myApps.f29845s0;
        if (c1239s != null) {
            c1239s.c();
        }
    }

    public final Object L4(String str, String str2, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new c(str2, str, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    public final void U4(boolean z8) {
        O4().b(this, z8);
    }

    public final void W4(ArrayList arrayList) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new g(arrayList, null), 2, null);
    }

    public final void b5(int i8, String packageName) {
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new l(packageName, i8, null), 2, null);
    }

    public final void c5(int i8, String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new m(i8, this, str, null), 2, null);
    }

    @Override // F4.AbstractActivityC1198w2
    protected void o4() {
        U4(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        P4();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new f(null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3292y.i(event, "event");
        if (i8 == 82) {
            M4().f12371d.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U4(true);
        C3800y.f37330a.g(this);
    }
}
