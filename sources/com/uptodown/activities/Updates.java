package com.uptodown.activities;

import F4.AbstractActivityC1198w2;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import Y4.q0;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.WorkManager;
import b5.InterfaceC1976E;
import b5.InterfaceC1978b;
import c5.C2041f;
import c5.C2043h;
import c5.Q;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.F;
import com.uptodown.activities.Updates;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.InstallUpdatesWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Z;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3791p;
import q5.C3794s;
import q5.C3800y;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class Updates extends AbstractActivityC1198w2 {

    /* renamed from: D0, reason: collision with root package name */
    public static final a f30186D0 = new a(null);

    /* renamed from: C0, reason: collision with root package name */
    private final ActivityResultLauncher f30189C0;

    /* renamed from: s0, reason: collision with root package name */
    private ArrayList f30192s0;

    /* renamed from: t0, reason: collision with root package name */
    private I4.N f30193t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f30194u0;

    /* renamed from: v0, reason: collision with root package name */
    private ImageView f30195v0;

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1416k f30190q0 = Q5.l.b(new Function0() { // from class: F4.F4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.q0 R42;
            R42 = Updates.R4(Updates.this);
            return R42;
        }
    });

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1416k f30191r0 = new ViewModelLazy(U.b(F.class), new i(this), new h(this), new j(null, this));

    /* renamed from: w0, reason: collision with root package name */
    private m f30196w0 = new m();

    /* renamed from: x0, reason: collision with root package name */
    private b f30197x0 = new b();

    /* renamed from: y0, reason: collision with root package name */
    private d f30198y0 = new d();

    /* renamed from: z0, reason: collision with root package name */
    private p f30199z0 = new p();

    /* renamed from: A0, reason: collision with root package name */
    private q f30187A0 = new q();

    /* renamed from: B0, reason: collision with root package name */
    private e f30188B0 = new e();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1978b {
        b() {
        }

        @Override // b5.InterfaceC1978b
        public void a(int i8) {
            Object obj;
            ArrayList b9;
            if (UptodownApp.f29249C.a0()) {
                I4.N n8 = Updates.this.f30193t0;
                if (n8 != null && (b9 = n8.b()) != null) {
                    obj = b9.get(i8);
                } else {
                    obj = null;
                }
                if (obj instanceof C2041f) {
                    I4.N n9 = Updates.this.f30193t0;
                    AbstractC3292y.f(n9);
                    Object obj2 = n9.b().get(i8);
                    AbstractC3292y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                    Updates updates = Updates.this;
                    updates.K3((C2041f) obj2, i8, updates.f30196w0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30201a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30203c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30204d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, U5.d dVar) {
            super(2, dVar);
            this.f30203c = str;
            this.f30204d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f30203c, this.f30204d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30201a == 0) {
                Q5.t.b(obj);
                int Z42 = Updates.this.Z4(this.f30203c);
                if (AbstractC3292y.d(this.f30204d, "app_updated")) {
                    if (Z42 >= 0) {
                        ArrayList arrayList = Updates.this.f30192s0;
                        if (arrayList != null) {
                            I4.N n8 = Updates.this.f30193t0;
                            AbstractC3292y.f(n8);
                            kotlin.coroutines.jvm.internal.b.a(Z.a(arrayList).remove(n8.b().get(Z42)));
                        }
                        I4.N n9 = Updates.this.f30193t0;
                        AbstractC3292y.f(n9);
                        n9.c(Z42);
                    }
                } else if (AbstractC3292y.d(this.f30204d, "app_installed")) {
                    Updates.this.j5(false);
                } else if (AbstractC3292y.d(this.f30204d, "app_uninstalled") && Z42 >= 0) {
                    ArrayList arrayList2 = Updates.this.f30192s0;
                    if (arrayList2 != null) {
                        I4.N n10 = Updates.this.f30193t0;
                        AbstractC3292y.f(n10);
                        kotlin.coroutines.jvm.internal.b.a(Z.a(arrayList2).remove(n10.b().get(Z42)));
                    }
                    I4.N n11 = Updates.this.f30193t0;
                    AbstractC3292y.f(n11);
                    n11.b().remove(Z42);
                    I4.N n12 = Updates.this.f30193t0;
                    AbstractC3292y.f(n12);
                    n12.notifyItemRemoved(Z42);
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
            AbstractC3292y.i(appInfo, "appInfo");
            String r02 = appInfo.r0();
            if (r02 != null && !l6.n.T(r02)) {
                HashMap e42 = Updates.this.e4();
                AbstractC3292y.f(e42);
                String v02 = appInfo.v0();
                AbstractC3292y.f(v02);
                String r03 = appInfo.r0();
                AbstractC3292y.f(r03);
                e42.put(v02, r03);
                I4.N n8 = Updates.this.f30193t0;
                AbstractC3292y.f(n8);
                n8.d(appInfo);
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
                Updates updates = Updates.this;
                String string = updates.getString(R.string.disabled_apps_explanation);
                AbstractC3292y.h(string, "getString(...)");
                updates.Z1(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30207a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Updates f30209a;

            a(Updates updates) {
                this.f30209a = updates;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f30209a.Y4().f12905b.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    this.f30209a.f30192s0 = ((F.b) cVar.a()).e();
                    this.f30209a.k5(((F.b) cVar.a()).e(), ((F.b) cVar.a()).d(), ((F.b) cVar.a()).c(), ((F.b) cVar.a()).a());
                    this.f30209a.l5(((F.b) cVar.a()).b().b(), ((F.b) cVar.a()).b().a());
                    this.f30209a.Y4().f12905b.f12236b.setVisibility(8);
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
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
            int i8 = this.f30207a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L f8 = Updates.this.a5().f();
                a aVar = new a(Updates.this);
                this.f30207a = 1;
                if (f8.collect(aVar, this) == e8) {
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
        int f30210a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f30212c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30213a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Updates f30214b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f30215c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Updates updates, ArrayList arrayList, U5.d dVar) {
                super(2, dVar);
                this.f30214b = updates;
                this.f30215c = arrayList;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void q(Updates updates, View view) {
                UptodownApp.a aVar = UptodownApp.f29249C;
                if (aVar.a0()) {
                    updates.startActivity(new Intent(updates.getApplicationContext(), (Class<?>) SettingsPreferences.class), aVar.a(updates));
                    AlertDialog o22 = updates.o2();
                    if (o22 != null) {
                        o22.dismiss();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void r(Updates updates, View view) {
                AlertDialog o22 = updates.o2();
                if (o22 != null) {
                    o22.dismiss();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void u(Updates updates, View view) {
                AlertDialog o22 = updates.o2();
                if (o22 != null) {
                    o22.dismiss();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void v(ArrayList arrayList, Updates updates, View view) {
                String str;
                if (arrayList != null) {
                    if (arrayList.size() == 1) {
                        str = ((C2041f) arrayList.get(0)).Q();
                    } else {
                        str = null;
                    }
                    if (!UptodownApp.f29249C.O(updates)) {
                        updates.u4(str, true);
                        if (arrayList.size() > 1 && updates.f30193t0 != null) {
                            updates.Q4(2);
                        }
                    }
                }
                AlertDialog o22 = updates.o2();
                if (o22 != null) {
                    o22.dismiss();
                }
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f30214b, this.f30215c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30213a == 0) {
                    Q5.t.b(obj);
                    AlertDialog o22 = this.f30214b.o2();
                    if (o22 != null) {
                        o22.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f30214b);
                    Y4.r c8 = Y4.r.c(this.f30214b.getLayoutInflater());
                    AbstractC3292y.h(c8, "inflate(...)");
                    final Updates updates = this.f30214b;
                    final ArrayList arrayList = this.f30215c;
                    TextView textView = c8.f12917g;
                    j.a aVar = J4.j.f4395g;
                    textView.setTypeface(aVar.u());
                    c8.f12914d.setTypeface(aVar.v());
                    c8.f12916f.setTypeface(aVar.u());
                    c8.f12913c.setTypeface(aVar.u());
                    c8.f12915e.setTypeface(aVar.u());
                    c8.f12916f.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.B
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.q(Updates.this, view);
                        }
                    });
                    c8.f12913c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.C
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.r(Updates.this, view);
                        }
                    });
                    c8.f12912b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.D
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.u(Updates.this, view);
                        }
                    });
                    c8.f12915e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.E
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.v(arrayList, updates, view);
                        }
                    });
                    builder.setView(c8.getRoot());
                    this.f30214b.K2(builder.create());
                    if (!this.f30214b.isFinishing() && this.f30214b.o2() != null) {
                        this.f30214b.S2();
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
        g(ArrayList arrayList, U5.d dVar) {
            super(2, dVar);
            this.f30212c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f30212c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30210a == 0) {
                Q5.t.b(obj);
                AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(Updates.this), C3445b0.c(), null, new a(Updates.this, this.f30212c, null), 2, null);
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
        final /* synthetic */ ComponentActivity f30216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f30216a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30216a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30217a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f30217a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30217a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30218a = function0;
            this.f30219b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30218a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30219b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30220a;

        k(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MenuItem findItem;
            View actionView;
            Animation animation;
            V5.b.e();
            if (this.f30220a == 0) {
                Q5.t.b(obj);
                Menu menu = Updates.this.Y4().f12908e.getMenu();
                if (menu != null && (findItem = menu.findItem(R.id.action_reload)) != null && (actionView = findItem.getActionView()) != null && (animation = actionView.getAnimation()) != null) {
                    animation.setRepeatCount(0);
                }
                Updates.this.s4(false);
                Updates.this.j5(false);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30222a;

        l(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MenuItem findItem;
            View actionView;
            Animation animation;
            V5.b.e();
            if (this.f30222a == 0) {
                Q5.t.b(obj);
                Menu menu = Updates.this.Y4().f12908e.getMenu();
                if (menu != null && (findItem = menu.findItem(R.id.action_reload)) != null && (actionView = findItem.getActionView()) != null && (animation = actionView.getAnimation()) != null) {
                    animation.setRepeatCount(-1);
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

    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC1976E {
        m() {
        }

        @Override // b5.InterfaceC1976E
        public void a(int i8) {
            Object obj;
            ArrayList b9;
            if (UptodownApp.f29249C.a0()) {
                I4.N n8 = Updates.this.f30193t0;
                if (n8 != null && (b9 = n8.b()) != null) {
                    obj = b9.get(i8);
                } else {
                    obj = null;
                }
                if (obj instanceof C2041f) {
                    I4.N n9 = Updates.this.f30193t0;
                    AbstractC3292y.f(n9);
                    Object obj2 = n9.b().get(i8);
                    AbstractC3292y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                    Updates.this.K3((C2041f) obj2, i8, this);
                }
            }
        }

        @Override // b5.InterfaceC1976E
        public void b(int i8) {
            if (Updates.this.h5(i8)) {
                I4.N n8 = Updates.this.f30193t0;
                AbstractC3292y.f(n8);
                Object obj = n8.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C2041f) obj).H0(true);
                I4.N n9 = Updates.this.f30193t0;
                AbstractC3292y.f(n9);
                n9.notifyItemChanged(i8);
            }
        }

        @Override // b5.InterfaceC1976E
        public void c(int i8) {
            if (UptodownApp.f29249C.a0() && Updates.this.h5(i8)) {
                I4.N n8 = Updates.this.f30193t0;
                AbstractC3292y.f(n8);
                Object obj = n8.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                Updates.this.l4((C2041f) obj);
                I4.N n9 = Updates.this.f30193t0;
                if (n9 != null) {
                    n9.notifyItemChanged(i8);
                }
            }
        }

        @Override // b5.InterfaceC1976E
        public void d(int i8) {
            if (Updates.this.h5(i8)) {
                I4.N n8 = Updates.this.f30193t0;
                AbstractC3292y.f(n8);
                n8.notifyItemChanged(i8);
            }
            Updates.this.j5(false);
        }

        @Override // b5.InterfaceC1976E
        public void e(int i8) {
            if (UptodownApp.f29249C.a0() && Updates.this.h5(i8)) {
                I4.N n8 = Updates.this.f30193t0;
                AbstractC3292y.f(n8);
                Object obj = n8.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                Updates.this.k4((C2041f) obj);
                I4.N n9 = Updates.this.f30193t0;
                if (n9 != null) {
                    n9.notifyItemChanged(i8);
                }
            }
        }

        @Override // b5.InterfaceC1976E
        public void f(int i8) {
            if (Updates.this.h5(i8)) {
                I4.N n8 = Updates.this.f30193t0;
                AbstractC3292y.f(n8);
                Object obj = n8.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C2041f) obj).H0(false);
                I4.N n9 = Updates.this.f30193t0;
                AbstractC3292y.f(n9);
                n9.notifyItemChanged(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30225a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30227c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30228d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, String str, U5.d dVar) {
            super(2, dVar);
            this.f30227c = i8;
            this.f30228d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new n(this.f30227c, this.f30228d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                V5.b.e()
                int r0 = r2.f30225a
                if (r0 != 0) goto L8d
                Q5.t.b(r3)
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                I4.N r3 = com.uptodown.activities.Updates.E4(r3)
                if (r3 == 0) goto L8a
                int r3 = r2.f30227c
                r0 = 107(0x6b, float:1.5E-43)
                if (r3 == r0) goto L6d
                switch(r3) {
                    case 101: goto L6d;
                    case 102: goto L53;
                    case 103: goto L2e;
                    case 104: goto L1c;
                    default: goto L1b;
                }
            L1b:
                goto L73
            L1c:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                android.content.Context r3 = r3.getApplicationContext()
                r0 = 2132017893(0x7f1402e5, float:1.9674077E38)
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                goto L73
            L2e:
                com.uptodown.UptodownApp$a r3 = com.uptodown.UptodownApp.f29249C
                java.util.ArrayList r0 = r3.F()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L73
                java.util.ArrayList r3 = r3.G()
                if (r3 == 0) goto L46
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L73
            L46:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                com.uptodown.activities.F r3 = com.uptodown.activities.Updates.K4(r3)
                com.uptodown.activities.Updates r0 = com.uptodown.activities.Updates.this
                r1 = 0
                r3.e(r0, r1)
                goto L73
            L53:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                boolean r3 = r3.u2()
                if (r3 != 0) goto L73
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                r0 = 2132017476(0x7f140144, float:1.9673231E38)
                java.lang.String r0 = r3.getString(r0)
                java.lang.String r1 = "getString(...)"
                kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                r3.Z1(r0)
                goto L73
            L6d:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                r0 = 2
                com.uptodown.activities.Updates.D4(r3, r0)
            L73:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                java.lang.String r0 = r2.f30228d
                int r3 = com.uptodown.activities.Updates.F4(r3, r0)
                r0 = -1
                if (r3 <= r0) goto L8a
                com.uptodown.activities.Updates r0 = com.uptodown.activities.Updates.this
                I4.N r0 = com.uptodown.activities.Updates.E4(r0)
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                r0.notifyItemChanged(r3)
            L8a:
                Q5.I r3 = Q5.I.f8786a
                return r3
            L8d:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.Updates.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30229a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30231c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30232d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, int i8, U5.d dVar) {
            super(2, dVar);
            this.f30231c = str;
            this.f30232d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new o(this.f30231c, this.f30232d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            String string;
            V5.b.e();
            if (this.f30229a == 0) {
                Q5.t.b(obj);
                if (Updates.this.f30193t0 != null) {
                    int W42 = Updates.this.W4(this.f30231c);
                    if (W42 > -1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i8 = this.f30232d;
                    if (i8 == 306) {
                        if (z8) {
                            I4.N n8 = Updates.this.f30193t0;
                            AbstractC3292y.f(n8);
                            n8.b().remove(W42);
                            I4.N n9 = Updates.this.f30193t0;
                            AbstractC3292y.f(n9);
                            n9.notifyItemRemoved(W42);
                        }
                    } else if (i8 == 301) {
                        if (z8) {
                            I4.N n10 = Updates.this.f30193t0;
                            AbstractC3292y.f(n10);
                            n10.notifyItemChanged(W42);
                        }
                    } else if (i8 != 305) {
                        if (i8 == 302) {
                            if (z8) {
                                I4.N n11 = Updates.this.f30193t0;
                                AbstractC3292y.f(n11);
                                n11.notifyItemChanged(W42);
                            } else {
                                Updates.this.j5(false);
                            }
                        } else {
                            if (i8 != 303) {
                                if (i8 != 304) {
                                    if (i8 != 307) {
                                        string = "ERROR: (" + this.f30232d + ") " + Updates.this.getString(R.string.error_generico);
                                    } else {
                                        string = Updates.this.getString(R.string.error_generico);
                                    }
                                } else {
                                    string = Updates.this.getString(R.string.msg_root_install_failed_invalid_versioncode);
                                }
                            } else {
                                string = Updates.this.getString(R.string.msg_install_failed);
                            }
                            Updates.this.Z1(string);
                            if (z8) {
                                I4.N n12 = Updates.this.f30193t0;
                                AbstractC3292y.f(n12);
                                n12.notifyItemChanged(W42);
                            } else {
                                I4.N n13 = Updates.this.f30193t0;
                                AbstractC3292y.f(n13);
                                n13.notifyDataSetChanged();
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
            return ((o) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class p {
        p() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class q implements b5.K {
        q() {
        }

        @Override // b5.K
        public void a() {
            if (UptodownApp.f29249C.a0()) {
                Updates.this.i5();
            }
        }
    }

    public Updates() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.G4
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Updates.V4(Updates.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f30189C0 = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q4(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    Y4().f12906c.setVisibility(8);
                    return;
                } else {
                    m5();
                    return;
                }
            }
            o5();
            return;
        }
        n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 R4(Updates updates) {
        return q0.c(updates.getLayoutInflater());
    }

    private final void S4() {
        WorkManager.getInstance(this).cancelAllWorkByTag("DownloadUpdatesWorker");
        UptodownApp.f29249C.g();
    }

    private final void T4() {
        String str;
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (!aVar.O(this)) {
            ArrayList X42 = X4(this.f30192s0);
            if (!X42.isEmpty()) {
                if (X42.size() == 1) {
                    str = ((C2041f) X42.get(0)).Q();
                } else {
                    str = null;
                }
                Q4(2);
                aVar.I0(this.f30192s0);
                u4(str, false);
                return;
            }
            if (X42.isEmpty()) {
                Q4(3);
                return;
            } else {
                if (this.f30194u0) {
                    InstallUpdatesWorker.f31231b.b(this);
                    return;
                }
                return;
            }
        }
        Q4(0);
        S4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V4(Updates updates, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            updates.L2();
            updates.j5(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int W4(String str) {
        if (str != null) {
            I4.N n8 = this.f30193t0;
            AbstractC3292y.f(n8);
            ArrayList b9 = n8.b();
            Iterator it = b9.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                if (it.next() instanceof C2041f) {
                    Object obj = b9.get(i8);
                    AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                    if (l6.n.s(((C2041f) obj).Q(), str, true)) {
                        return i8;
                    }
                }
                i8 = i9;
            }
        }
        return -1;
    }

    private final ArrayList X4(ArrayList arrayList) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            C3794s c3794s = new C3794s();
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            ArrayList e8 = c3794s.e(applicationContext);
            C3791p.a aVar = C3791p.f37286s;
            Context applicationContext2 = getApplicationContext();
            AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
            C3791p a9 = aVar.a(applicationContext2);
            a9.a();
            Iterator it = arrayList.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                C2041f c2041f = (C2041f) next;
                if (c2041f.i() == 0) {
                    S4.f fVar = new S4.f();
                    String Q8 = c2041f.Q();
                    AbstractC3292y.f(Q8);
                    if (!fVar.p(this, Q8)) {
                        String Q9 = c2041f.Q();
                        AbstractC3292y.f(Q9);
                        Q s02 = a9.s0(Q9);
                        if (s02 != null) {
                            str = s02.l();
                        } else {
                            str = null;
                        }
                        if (str != null && s02.u() == 100) {
                            Iterator it2 = e8.iterator();
                            AbstractC3292y.h(it2, "iterator(...)");
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                AbstractC3292y.h(next2, "next(...)");
                                if (l6.n.s(s02.l(), ((File) next2).getName(), true)) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(c2041f);
                    }
                }
            }
            a9.i();
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0 Y4() {
        return (q0) this.f30190q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Z4(String str) {
        ArrayList arrayList;
        I4.N n8 = this.f30193t0;
        ArrayList arrayList2 = null;
        if (n8 != null) {
            arrayList = n8.b();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            I4.N n9 = this.f30193t0;
            if (n9 != null) {
                arrayList2 = n9.b();
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
    public final F a5() {
        return (F) this.f30191r0.getValue();
    }

    private final void b5() {
        setContentView(Y4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            Y4().f12908e.setNavigationIcon(drawable);
            Y4().f12908e.setNavigationContentDescription(getString(R.string.back));
        }
        Y4().f12908e.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.H4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Updates.c5(Updates.this, view);
            }
        });
        TextView textView = Y4().f12910g;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        Y4().f12908e.inflateMenu(R.menu.toolbar_menu_updates);
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable);
        if (drawable2 != null) {
            Y4().f12908e.setOverflowIcon(drawable2);
        }
        SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
        boolean g02 = aVar2.g0(this);
        Y4().f12908e.getMenu().findItem(R.id.action_show_system_apps).setChecked(g02);
        Y4().f12908e.getMenu().findItem(R.id.action_show_system_services).setChecked(aVar2.h0(this));
        Toolbar toolbarUpdates = Y4().f12908e;
        AbstractC3292y.h(toolbarUpdates, "toolbarUpdates");
        c4(R.id.action_show_system_services, g02, toolbarUpdates);
        MenuItem findItem = Y4().f12908e.getMenu().findItem(R.id.action_reload);
        Y4().f12908e.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: F4.I4
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean d52;
                d52 = Updates.d5(Updates.this, menuItem);
                return d52;
            }
        });
        Object systemService = getSystemService("layout_inflater");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.reload_action_view, (ViewGroup) Y4().f12908e, false);
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        this.f30195v0 = (ImageView) inflate;
        final Animation loadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        ImageView imageView = this.f30195v0;
        if (imageView != null) {
            imageView.startAnimation(loadAnimation);
        }
        ImageView imageView2 = this.f30195v0;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: F4.J4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Updates.e5(Updates.this, loadAnimation, view);
                }
            });
        }
        if (findItem != null) {
            findItem.setActionView(this.f30195v0);
        }
        Y4().f12907d.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        Y4().f12907d.addItemDecoration(new s5.m(dimension, dimension));
        Y4().f12907d.setItemAnimator(defaultItemAnimator);
        Y4().f12905b.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.K4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Updates.f5(view);
            }
        });
        Y4().f12909f.setTypeface(aVar.u());
        Y4().f12909f.setOnClickListener(new View.OnClickListener() { // from class: F4.L4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Updates.g5(Updates.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c5(Updates updates, View view) {
        updates.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d5(Updates updates, MenuItem item) {
        AbstractC3292y.i(item, "item");
        if (item.getItemId() == R.id.action_show_system_apps) {
            boolean isChecked = item.isChecked();
            item.setChecked(!isChecked);
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            Context applicationContext = updates.getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            aVar.V0(applicationContext, !isChecked);
            if (isChecked) {
                Context applicationContext2 = updates.getApplicationContext();
                AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                aVar.W0(applicationContext2, false);
                Toolbar toolbarUpdates = updates.Y4().f12908e;
                AbstractC3292y.h(toolbarUpdates, "toolbarUpdates");
                updates.c4(R.id.action_show_system_services, false, toolbarUpdates);
                Toolbar toolbarUpdates2 = updates.Y4().f12908e;
                AbstractC3292y.h(toolbarUpdates2, "toolbarUpdates");
                updates.A3(R.id.action_show_system_services, false, toolbarUpdates2);
            } else {
                Toolbar toolbarUpdates3 = updates.Y4().f12908e;
                AbstractC3292y.h(toolbarUpdates3, "toolbarUpdates");
                updates.c4(R.id.action_show_system_services, true, toolbarUpdates3);
            }
            if (!isChecked) {
                ImageView imageView = updates.f30195v0;
                if (imageView != null) {
                    imageView.performClick();
                }
            } else {
                updates.j5(true);
            }
        } else if (item.getItemId() == R.id.action_show_system_services) {
            boolean isChecked2 = item.isChecked();
            item.setChecked(!isChecked2);
            SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
            Context applicationContext3 = updates.getApplicationContext();
            AbstractC3292y.h(applicationContext3, "getApplicationContext(...)");
            aVar2.W0(applicationContext3, !isChecked2);
            if (!isChecked2) {
                ImageView imageView2 = updates.f30195v0;
                if (imageView2 != null) {
                    imageView2.performClick();
                }
            } else {
                updates.j5(true);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(Updates updates, Animation animation, View view) {
        AbstractC3292y.i(view, "view");
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.a0() && UptodownApp.a.M0(aVar, updates, false, 2, null)) {
            animation.setRepeatCount(0);
            view.startAnimation(animation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g5(Updates updates, View view) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.a0()) {
            if (!aVar.W("downloadApkWorker", updates)) {
                updates.T4();
                return;
            }
            String string = updates.getString(R.string.error_download_in_progress_wait);
            AbstractC3292y.h(string, "getString(...)");
            updates.Z1(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h5(int i8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        I4.N n8 = this.f30193t0;
        if (n8 != null) {
            ArrayList arrayList3 = null;
            if (n8 != null) {
                arrayList = n8.b();
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                I4.N n9 = this.f30193t0;
                if (n9 != null) {
                    arrayList2 = n9.b();
                } else {
                    arrayList2 = null;
                }
                AbstractC3292y.f(arrayList2);
                if (arrayList2.size() > i8) {
                    I4.N n10 = this.f30193t0;
                    if (n10 != null) {
                        arrayList3 = n10.b();
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
    public final void i5() {
        this.f30189C0.launch(new Intent(getApplicationContext(), (Class<?>) GdprPrivacySettings.class), UptodownApp.f29249C.b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k5(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        I4.N n8 = this.f30193t0;
        if (n8 == null) {
            this.f30193t0 = new I4.N(arrayList, arrayList2, arrayList3, arrayList4, this, this.f30196w0, this.f30197x0, this.f30187A0, this.f30188B0);
            Y4().f12907d.setAdapter(this.f30193t0);
        } else if (n8 != null) {
            n8.g(arrayList, arrayList2, arrayList3, arrayList4);
        }
        if (!arrayList.isEmpty()) {
            if (e4() == null) {
                p4(new HashMap());
                ArrayList arrayList5 = new ArrayList(AbstractC1435t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList5.add(Long.valueOf(((C2041f) it.next()).b()));
                }
                new X4.l(this, arrayList5, this.f30198y0, LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            I4.N n9 = this.f30193t0;
            AbstractC3292y.f(n9);
            HashMap e42 = e4();
            AbstractC3292y.f(e42);
            n9.e(e42);
            Q5.I i8 = Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l5(boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                if (this.f30194u0) {
                    Q4(1);
                    return;
                } else {
                    Q4(3);
                    return;
                }
            }
            Q4(0);
            return;
        }
        Q4(3);
    }

    private final void m5() {
        Y4().f12906c.setVisibility(0);
        Y4().f12909f.setText(android.R.string.cancel);
        Y4().f12909f.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_cancel_all_button));
        Y4().f12909f.setTextColor(ContextCompat.getColor(this, R.color.white));
        Y4().f12909f.setVisibility(0);
    }

    private final void n5() {
        Y4().f12906c.setVisibility(0);
        Y4().f12909f.setText(R.string.download_all_updates);
        Y4().f12909f.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_blue_primary_button));
        Y4().f12909f.setTextColor(ContextCompat.getColor(this, R.color.white));
        Y4().f12909f.setVisibility(0);
    }

    private final void o5() {
        Y4().f12906c.setVisibility(0);
        Y4().f12909f.setText(R.string.install_all);
        Y4().f12909f.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_install_button));
        Y4().f12909f.setTextColor(ContextCompat.getColor(this, R.color.accent_green));
        Y4().f12909f.setVisibility(0);
    }

    public final Object U4(String str, String str2, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new c(str2, str, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    public final void j5(boolean z8) {
        a5().e(this, z8);
    }

    @Override // F4.AbstractActivityC1198w2
    protected void o4() {
        j5(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b5();
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        this.f30194u0 = aVar.X(applicationContext);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ImageView imageView;
        super.onResume();
        j5(true);
        C3800y.f37330a.g(this);
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (!aVar.V("TrackingWorkerSingle", this) && !aVar.V("TrackingWorkerPeriodic", this) && (imageView = this.f30195v0) != null) {
            imageView.clearAnimation();
        }
    }

    public final void p5(ArrayList arrayList) {
        if (g4()) {
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new g(arrayList, null), 2, null);
        }
    }

    public final void q5() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new k(null), 2, null);
    }

    public final void r5() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new l(null), 2, null);
    }

    public final void s5(int i8, String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new n(i8, str, null), 2, null);
    }

    public final void t5(int i8, String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new o(str, i8, null), 2, null);
    }
}
