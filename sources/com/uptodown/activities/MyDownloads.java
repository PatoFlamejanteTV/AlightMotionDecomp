package com.uptodown.activities;

import I4.C1225d;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import S4.x;
import Y4.C1525o;
import Y4.P;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import b5.InterfaceC1985i;
import c5.C2043h;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.p;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3788m;
import q5.C3791p;
import q5.C3794s;
import q5.C3800y;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class MyDownloads extends AbstractActivityC2691a {

    /* renamed from: Q, reason: collision with root package name */
    private C1225d f29886Q;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f29884O = Q5.l.b(new Function0() { // from class: F4.x2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.P K32;
            K32 = MyDownloads.K3(MyDownloads.this);
            return K32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f29885P = new ViewModelLazy(U.b(p.class), new j(this), new i(this), new k(null, this));

    /* renamed from: R, reason: collision with root package name */
    private boolean f29887R = true;

    /* renamed from: S, reason: collision with root package name */
    private p.b f29888S = p.b.f30500b;

    /* renamed from: T, reason: collision with root package name */
    private final g f29889T = new g();

    /* renamed from: U, reason: collision with root package name */
    private final e f29890U = new e();

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29891a;

        public a(int i8) {
            this.f29891a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = this.f29891a;
            if (i8 != 302 && i8 != 352) {
                MyDownloads.this.x4();
            } else {
                MyDownloads.this.y4(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f29893a;

        /* renamed from: b, reason: collision with root package name */
        int f29894b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29896d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, U5.d dVar) {
            super(2, dVar);
            this.f29896d = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f29896d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r9.f29894b
                java.lang.String r2 = "next(...)"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r1 = r9.f29893a
                java.util.Iterator r1 = (java.util.Iterator) r1
                Q5.t.b(r10)
                goto L99
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.f29893a
                java.util.Iterator r1 = (java.util.Iterator) r1
                Q5.t.b(r10)
                goto L62
            L29:
                Q5.t.b(r10)
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                I4.d r10 = com.uptodown.activities.MyDownloads.C3(r10)
                if (r10 == 0) goto Ld7
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                I4.d r10 = com.uptodown.activities.MyDownloads.C3(r10)
                kotlin.jvm.internal.AbstractC3292y.f(r10)
                java.util.ArrayList r10 = r10.d()
                int r10 = r10.size()
                if (r10 <= 0) goto Ld7
                boolean r10 = r9.f29896d
                java.lang.String r1 = "iterator(...)"
                if (r10 == 0) goto L84
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                I4.d r10 = com.uptodown.activities.MyDownloads.C3(r10)
                kotlin.jvm.internal.AbstractC3292y.f(r10)
                java.util.ArrayList r10 = r10.d()
                java.util.Iterator r10 = r10.iterator()
                kotlin.jvm.internal.AbstractC3292y.h(r10, r1)
                r1 = r10
            L62:
                boolean r10 = r1.hasNext()
                if (r10 == 0) goto Ld1
                java.lang.Object r10 = r1.next()
                kotlin.jvm.internal.AbstractC3292y.h(r10, r2)
                c5.r r10 = (c5.r) r10
                com.uptodown.activities.MyDownloads r3 = com.uptodown.activities.MyDownloads.this
                com.uptodown.activities.p r3 = com.uptodown.activities.MyDownloads.D3(r3)
                com.uptodown.activities.MyDownloads r5 = com.uptodown.activities.MyDownloads.this
                r9.f29893a = r1
                r9.f29894b = r4
                java.lang.Object r10 = r3.h(r5, r10, r9)
                if (r10 != r0) goto L62
                return r0
            L84:
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                I4.d r10 = com.uptodown.activities.MyDownloads.C3(r10)
                kotlin.jvm.internal.AbstractC3292y.f(r10)
                java.util.ArrayList r10 = r10.d()
                java.util.Iterator r10 = r10.iterator()
                kotlin.jvm.internal.AbstractC3292y.h(r10, r1)
                r1 = r10
            L99:
                boolean r10 = r1.hasNext()
                if (r10 == 0) goto Ld1
                java.lang.Object r10 = r1.next()
                kotlin.jvm.internal.AbstractC3292y.h(r10, r2)
                c5.r r10 = (c5.r) r10
                boolean r4 = r10.h0()
                if (r4 != 0) goto L99
                com.uptodown.workers.DownloadApkWorker$a r4 = com.uptodown.workers.DownloadApkWorker.f31190k
                long r5 = r10.h()
                long r7 = r10.e0()
                boolean r4 = r4.d(r5, r7)
                if (r4 != 0) goto L99
                com.uptodown.activities.MyDownloads r4 = com.uptodown.activities.MyDownloads.this
                com.uptodown.activities.p r4 = com.uptodown.activities.MyDownloads.D3(r4)
                com.uptodown.activities.MyDownloads r5 = com.uptodown.activities.MyDownloads.this
                r9.f29893a = r1
                r9.f29894b = r3
                java.lang.Object r10 = r4.h(r5, r10, r9)
                if (r10 != r0) goto L99
                return r0
            Ld1:
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                r0 = 0
                r10.y4(r0)
            Ld7:
                Q5.I r10 = Q5.I.f8786a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MyDownloads.b.invokeSuspend(java.lang.Object):java.lang.Object");
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
        int f29897a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29899c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, U5.d dVar) {
            super(2, dVar);
            this.f29899c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f29899c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29897a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C1225d c1225d = MyDownloads.this.f29886Q;
                AbstractC3292y.f(c1225d);
                Object obj2 = c1225d.d().get(this.f29899c);
                AbstractC3292y.h(obj2, "get(...)");
                p i42 = MyDownloads.this.i4();
                MyDownloads myDownloads = MyDownloads.this;
                this.f29897a = 1;
                obj = i42.h(myDownloads, (c5.r) obj2, this);
                if (obj == e8) {
                    return e8;
                }
            }
            if (((Boolean) obj).booleanValue() && MyDownloads.this.f29886Q != null) {
                C1225d c1225d2 = MyDownloads.this.f29886Q;
                AbstractC3292y.f(c1225d2);
                c1225d2.d().remove(this.f29899c);
                C1225d c1225d3 = MyDownloads.this.f29886Q;
                AbstractC3292y.f(c1225d3);
                c1225d3.notifyItemRemoved(this.f29899c);
                C1225d c1225d4 = MyDownloads.this.f29886Q;
                AbstractC3292y.f(c1225d4);
                if (c1225d4.d().isEmpty()) {
                    MyDownloads.this.g4().f12384l.setVisibility(0);
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f29900a;

        /* renamed from: b, reason: collision with root package name */
        int f29901b;

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Object e8 = V5.b.e();
            int i8 = this.f29901b;
            if (i8 != 0) {
                if (i8 == 1) {
                    it = (Iterator) this.f29900a;
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                if (MyDownloads.this.f29886Q != null) {
                    C1225d c1225d = MyDownloads.this.f29886Q;
                    AbstractC3292y.f(c1225d);
                    Iterator it2 = c1225d.e().iterator();
                    AbstractC3292y.h(it2, "iterator(...)");
                    it = it2;
                }
                MyDownloads.this.y4(false);
                MyDownloads.this.j4();
                return Q5.I.f8786a;
            }
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                p i42 = MyDownloads.this.i4();
                MyDownloads myDownloads = MyDownloads.this;
                this.f29900a = it;
                this.f29901b = 1;
                if (i42.h(myDownloads, (c5.r) next, this) == e8) {
                    return e8;
                }
            }
            MyDownloads.this.y4(false);
            MyDownloads.this.j4();
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC1985i {
        e() {
        }

        @Override // b5.InterfaceC1985i
        public void a(int i8) {
            if (UptodownApp.f29249C.a0()) {
                C1225d c1225d = MyDownloads.this.f29886Q;
                AbstractC3292y.f(c1225d);
                if (c1225d.f()) {
                    C1225d c1225d2 = MyDownloads.this.f29886Q;
                    AbstractC3292y.f(c1225d2);
                    c1225d2.i(i8);
                    MyDownloads.this.A4();
                    return;
                }
                C1225d c1225d3 = MyDownloads.this.f29886Q;
                AbstractC3292y.f(c1225d3);
                Object obj = c1225d3.d().get(i8);
                AbstractC3292y.h(obj, "get(...)");
                MyDownloads.this.Y3((c5.r) obj, i8);
            }
        }

        @Override // b5.InterfaceC1985i
        public void b(int i8) {
            if (UptodownApp.f29249C.a0()) {
                MyDownloads.this.R3(i8);
            }
        }

        @Override // b5.InterfaceC1985i
        public void c(int i8) {
            if (MyDownloads.this.f29886Q != null) {
                C1225d c1225d = MyDownloads.this.f29886Q;
                AbstractC3292y.f(c1225d);
                if (!c1225d.f()) {
                    C1225d c1225d2 = MyDownloads.this.f29886Q;
                    AbstractC3292y.f(c1225d2);
                    AbstractC3292y.f(MyDownloads.this.f29886Q);
                    c1225d2.j(!r1.f());
                    C1225d c1225d3 = MyDownloads.this.f29886Q;
                    AbstractC3292y.f(c1225d3);
                    c1225d3.i(i8);
                    MyDownloads.this.F4();
                    if (MyDownloads.this.g4().f12377e.getRoot().getVisibility() != 0) {
                        MyDownloads.this.g4().f12377e.getRoot().setVisibility(0);
                    }
                }
            }
        }

        @Override // b5.InterfaceC1985i
        public void d(int i8) {
            if (UptodownApp.f29249C.a0()) {
                C1225d c1225d = MyDownloads.this.f29886Q;
                AbstractC3292y.f(c1225d);
                if (c1225d.d().size() > 0) {
                    C1225d c1225d2 = MyDownloads.this.f29886Q;
                    AbstractC3292y.f(c1225d2);
                    if (i8 < c1225d2.d().size()) {
                        C1225d c1225d3 = MyDownloads.this.f29886Q;
                        AbstractC3292y.f(c1225d3);
                        Object obj = c1225d3.d().get(i8);
                        AbstractC3292y.h(obj, "get(...)");
                        if (DownloadApkWorker.f31190k.e((c5.r) obj)) {
                            DownloadWorker.a aVar = DownloadWorker.f31208c;
                            if (aVar.c()) {
                                aVar.h();
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements SearchView.OnQueryTextListener {
        f() {
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String newText) {
            AbstractC3292y.i(newText, "newText");
            MyDownloads.this.J3(newText);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String query) {
            AbstractC3292y.i(query, "query");
            MyDownloads.this.J3(query);
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends OnBackPressedCallback {
        g() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C1225d c1225d = MyDownloads.this.f29886Q;
            if (c1225d != null && c1225d.f()) {
                MyDownloads.this.j4();
            } else {
                MyDownloads.this.finish();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29906a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MyDownloads f29908a;

            a(MyDownloads myDownloads) {
                this.f29908a = myDownloads;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f29908a.g4().f12376d.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    this.f29908a.g4().f12376d.f12236b.setVisibility(8);
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    this.f29908a.z4(((p.a) cVar.a()).a(), ((p.a) cVar.a()).b());
                    this.f29908a.j4();
                    if (!this.f29908a.isFinishing()) {
                        if (((p.a) cVar.a()).a().size() == 0 && ((p.a) cVar.a()).b().size() == 0) {
                            this.f29908a.g4().f12384l.setVisibility(0);
                            this.f29908a.g4().f12378f.setVisibility(8);
                        } else {
                            this.f29908a.g4().f12384l.setVisibility(8);
                            this.f29908a.g4().f12378f.setVisibility(0);
                        }
                        if (((p.a) cVar.a()).b().size() == 0) {
                            this.f29908a.g4().f12383k.setVisibility(8);
                            this.f29908a.g4().f12379g.setVisibility(8);
                        } else {
                            this.f29908a.g4().f12383k.setVisibility(0);
                            if (!UptodownApp.f29249C.W("downloadApkWorker", this.f29908a)) {
                                this.f29908a.g4().f12379g.setVisibility(0);
                            } else {
                                this.f29908a.g4().f12379g.setVisibility(8);
                            }
                        }
                        this.f29908a.g4().f12376d.f12236b.setVisibility(8);
                    }
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
            }
        }

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
            int i8 = this.f29906a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L k8 = MyDownloads.this.i4().k();
                a aVar = new a(MyDownloads.this);
                this.f29906a = 1;
                if (k8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29909a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f29909a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29909a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29910a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f29910a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29910a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29911a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29911a = function0;
            this.f29912b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29911a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29912b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29913a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29915c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c5.r f29916d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i8, c5.r rVar, U5.d dVar) {
            super(2, dVar);
            this.f29915c = i8;
            this.f29916d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(this.f29915c, this.f29916d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int h42;
            V5.b.e();
            if (this.f29913a == 0) {
                Q5.t.b(obj);
                if (MyDownloads.this.f29886Q != null) {
                    int i8 = this.f29915c;
                    if (i8 == 202 || i8 == 203) {
                        MyDownloads.this.y4(false);
                    }
                    c5.r rVar = this.f29916d;
                    if (rVar != null && (h42 = MyDownloads.this.h4(rVar.Y())) > -1) {
                        C1225d c1225d = MyDownloads.this.f29886Q;
                        AbstractC3292y.f(c1225d);
                        c1225d.d().set(h42, this.f29916d);
                        C1225d c1225d2 = MyDownloads.this.f29886Q;
                        AbstractC3292y.f(c1225d2);
                        c1225d2.notifyItemChanged(h42);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void A4() {
        int i8;
        boolean z8;
        boolean z9;
        C1225d c1225d = this.f29886Q;
        if (c1225d != null) {
            AbstractC3292y.f(c1225d);
            i8 = c1225d.c();
            TextView textView = g4().f12377e.f12393h;
            C1225d c1225d2 = this.f29886Q;
            AbstractC3292y.f(c1225d2);
            if (c1225d2.d().size() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            textView.setEnabled(z9);
        } else {
            i8 = 0;
        }
        TextView textView2 = g4().f12377e.f12394i;
        if (i8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        textView2.setEnabled(z8);
        g4().f12377e.f12396k.setText(getString(R.string.core_x_items_selected, String.valueOf(i8)));
    }

    private final void B4() {
        p.b bVar = this.f29888S;
        p.b bVar2 = p.b.f30500b;
        if (bVar != bVar2) {
            this.f29888S = bVar2;
        } else {
            this.f29887R = !this.f29887R;
        }
        J3(g4().f12381i.getQuery().toString());
        if (this.f29887R) {
            g4().f12377e.f12388c.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_desc));
            g4().f12377e.f12389d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_size_desc));
            g4().f12377e.f12387b.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_desc));
        } else {
            g4().f12377e.f12388c.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_asc));
            g4().f12377e.f12389d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_size_asc));
            g4().f12377e.f12387b.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_asc));
        }
    }

    private final void C4() {
        p.b bVar = this.f29888S;
        p.b bVar2 = p.b.f30499a;
        if (bVar != bVar2) {
            this.f29888S = bVar2;
        } else {
            this.f29887R = !this.f29887R;
        }
        J3(g4().f12381i.getQuery().toString());
        if (this.f29887R) {
            g4().f12377e.f12388c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_desc_on));
            g4().f12377e.f12389d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_desc_off));
            g4().f12377e.f12387b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_desc_off));
        } else {
            g4().f12377e.f12388c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_asc_on));
            g4().f12377e.f12389d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_asc_off));
            g4().f12377e.f12387b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_asc_off));
        }
    }

    private final void D4() {
        p.b bVar = this.f29888S;
        p.b bVar2 = p.b.f30501c;
        if (bVar != bVar2) {
            this.f29888S = bVar2;
        } else {
            this.f29887R = !this.f29887R;
        }
        J3(g4().f12381i.getQuery().toString());
        if (this.f29887R) {
            g4().f12377e.f12389d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_desc_on));
            g4().f12377e.f12388c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_desc_off));
            g4().f12377e.f12387b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_desc_off));
        } else {
            g4().f12377e.f12389d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_asc_on));
            g4().f12377e.f12388c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_asc_off));
            g4().f12377e.f12387b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_asc_off));
        }
    }

    private final void E4(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", new File(str));
            intent.setType(getContentResolver().getType(uriForFile));
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            startActivity(Intent.createChooser(intent, getString(R.string.intent_chooser_title_share_file)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F4() {
        g4().f12377e.f12391f.setVisibility(0);
        g4().f12377e.f12392g.setVisibility(4);
        A4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3(String str) {
        i4().j(str, this.f29888S, this.f29887R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P K3(MyDownloads myDownloads) {
        return P.c(myDownloads.getLayoutInflater());
    }

    private final void L3(File file) {
        x.a aVar = S4.x.f9510b;
        String name = file.getName();
        AbstractC3292y.h(name, "getName(...)");
        if (aVar.a(name)) {
            S4.x xVar = new S4.x();
            boolean f8 = xVar.f(file);
            if (xVar.c(file) && !new S4.f().e().canWrite()) {
                if (T()) {
                    U2(0L);
                } else {
                    k0();
                }
                f8 = false;
            }
            if (f8) {
                AbstractActivityC2691a.x2(this, file, null, 2, null);
                return;
            }
            return;
        }
        AbstractActivityC2691a.x2(this, file, null, 2, null);
    }

    private final void M3(boolean z8) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(z8, null), 3, null);
    }

    private final void N3(int i8) {
        C1225d c1225d = this.f29886Q;
        if (c1225d != null) {
            AbstractC3292y.f(c1225d);
            if (c1225d.d().size() > 0) {
                C1225d c1225d2 = this.f29886Q;
                AbstractC3292y.f(c1225d2);
                if (i8 < c1225d2.d().size()) {
                    AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(i8, null), 3, null);
                }
            }
        }
    }

    private final void O3() {
        String format;
        DownloadWorker.f31208c.f();
        if (new C3788m().k(this).size() > 1) {
            Y y8 = Y.f34578a;
            String string = getString(R.string.dialog_cancel_downloads_msg);
            AbstractC3292y.h(string, "getString(...)");
            format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3292y.h(format, "format(...)");
        } else {
            Y y9 = Y.f34578a;
            String string2 = getString(R.string.dialog_cancel_download_msg);
            AbstractC3292y.h(string2, "getString(...)");
            format = String.format(string2, Arrays.copyOf(new Object[0], 0));
            AbstractC3292y.h(format, "format(...)");
        }
        U1(format, new Function0() { // from class: F4.M2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I P32;
                P32 = MyDownloads.P3(MyDownloads.this);
                return P32;
            }
        }, new Function0() { // from class: F4.N2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I Q32;
                Q32 = MyDownloads.Q3(MyDownloads.this);
                return Q32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I P3(MyDownloads myDownloads) {
        myDownloads.M3(true);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I Q3(MyDownloads myDownloads) {
        myDownloads.M3(false);
        DownloadWorker.f31208c.h();
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R3(final int i8) {
        C1225d c1225d = this.f29886Q;
        if (c1225d != null) {
            AbstractC3292y.f(c1225d);
            Object obj = c1225d.d().get(i8);
            AbstractC3292y.h(obj, "get(...)");
            c5.r rVar = (c5.r) obj;
            if (DownloadApkWorker.f31190k.d(rVar.h(), rVar.e0())) {
                DownloadWorker.f31208c.f();
            }
            String string = getString(R.string.download_cancel_confimation_title);
            AbstractC3292y.h(string, "getString(...)");
            U1(string, new Function0() { // from class: F4.D2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I S32;
                    S32 = MyDownloads.S3(MyDownloads.this, i8);
                    return S32;
                }
            }, new Function0() { // from class: F4.E2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I T32;
                    T32 = MyDownloads.T3();
                    return T32;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I S3(MyDownloads myDownloads, int i8) {
        myDownloads.N3(i8);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I T3() {
        DownloadWorker.f31208c.h();
        return Q5.I.f8786a;
    }

    private final void U3() {
        Y y8 = Y.f34578a;
        String string = getString(R.string.dialog_delete_all_download_msg);
        AbstractC3292y.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        AbstractC3292y.h(format, "format(...)");
        T1(format, new Function0() { // from class: F4.B2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I V32;
                V32 = MyDownloads.V3(MyDownloads.this);
                return V32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I V3(MyDownloads myDownloads) {
        if (UptodownApp.f29249C.W("downloadApkWorker", myDownloads)) {
            myDownloads.O3();
        } else {
            myDownloads.M3(false);
        }
        return Q5.I.f8786a;
    }

    private final void W3() {
        Y y8 = Y.f34578a;
        String string = getString(R.string.dialog_delete_selected_download_msg);
        AbstractC3292y.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        AbstractC3292y.h(format, "format(...)");
        T1(format, new Function0() { // from class: F4.C2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I X32;
                X32 = MyDownloads.X3(MyDownloads.this);
                return X32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I X3(MyDownloads myDownloads) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(myDownloads), null, null, new d(null), 3, null);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y3(final c5.r rVar, final int i8) {
        Object obj;
        final T t8 = new T();
        C1525o c8 = C1525o.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        c8.f12878h.setText(rVar.X());
        TextView textView = c8.f12878h;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        if (!f4(rVar) && !rVar.h0()) {
            c8.f12875e.setTypeface(aVar.v());
            c8.f12875e.setOnClickListener(new View.OnClickListener() { // from class: F4.F2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDownloads.Z3(kotlin.jvm.internal.T.this, rVar, this, view);
                }
            });
        } else {
            c8.f12875e.setVisibility(8);
        }
        c8.f12876f.setTypeface(aVar.v());
        c8.f12876f.setOnClickListener(new View.OnClickListener() { // from class: F4.G2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.a4(MyDownloads.this, i8, t8, view);
            }
        });
        c8.f12877g.setTypeface(aVar.v());
        c8.f12877g.setOnClickListener(new View.OnClickListener() { // from class: F4.H2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.b4(kotlin.jvm.internal.T.this, rVar, this, view);
            }
        });
        if (rVar.h() >= 0) {
            c8.f12872b.setTypeface(aVar.v());
            c8.f12872b.setOnClickListener(new View.OnClickListener() { // from class: F4.J2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDownloads.c4(kotlin.jvm.internal.T.this, this, rVar, view);
                }
            });
        } else {
            c8.f12872b.setVisibility(8);
        }
        c8.f12873c.setTypeface(aVar.v());
        c8.f12873c.setOnClickListener(new View.OnClickListener() { // from class: F4.K2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.d4(kotlin.jvm.internal.T.this, this, i8, view);
            }
        });
        C1225d c1225d = this.f29886Q;
        AbstractC3292y.f(c1225d);
        if (((c5.r) c1225d.d().get(i8)).f() != null) {
            c8.f12874d.setTypeface(aVar.v());
            c8.f12874d.setOnClickListener(new View.OnClickListener() { // from class: F4.L2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDownloads.e4(kotlin.jvm.internal.T.this, this, i8, view);
                }
            });
        } else {
            c8.f12874d.setVisibility(8);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        t8.f34573a = builder.create();
        if (!isFinishing() && (obj = t8.f34573a) != null) {
            Window window = ((AlertDialog) obj).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) t8.f34573a).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(T t8, c5.r rVar, MyDownloads myDownloads, View view) {
        AlertDialog alertDialog = (AlertDialog) t8.f34573a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (AbstractC3292y.d(rVar.Y(), myDownloads.getPackageName())) {
            String f8 = rVar.f();
            AbstractC3292y.f(f8);
            File file = new File(f8);
            if (file.exists()) {
                PackageManager packageManager = myDownloads.getPackageManager();
                AbstractC3292y.h(packageManager, "getPackageManager(...)");
                String absolutePath = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                PackageInfo c8 = S4.r.c(packageManager, absolutePath, 128);
                if (c8 == null) {
                    String string = myDownloads.getString(R.string.installable_files_not_found);
                    AbstractC3292y.h(string, "getString(...)");
                    myDownloads.Z1(string);
                    return;
                }
                C3794s c3794s = new C3794s();
                String name = file.getName();
                AbstractC3292y.h(name, "getName(...)");
                String i8 = c3794s.i(name);
                if (i8 != null) {
                    if (new S4.f().m(c8) > 633) {
                        AbstractActivityC2691a.x2(myDownloads, file, null, 2, null);
                        return;
                    } else {
                        myDownloads.D2(i8, null);
                        return;
                    }
                }
                UptodownApp.a.Z(UptodownApp.f29249C, file, myDownloads, null, 4, null);
                return;
            }
            String string2 = myDownloads.getString(R.string.installable_files_not_found);
            AbstractC3292y.h(string2, "getString(...)");
            myDownloads.Z1(string2);
            return;
        }
        String f9 = rVar.f();
        if (f9 != null && f9.length() != 0) {
            String f10 = rVar.f();
            AbstractC3292y.f(f10);
            File file2 = new File(f10);
            if (file2.exists()) {
                myDownloads.L3(file2);
                return;
            }
            String string3 = myDownloads.getString(R.string.installable_files_not_found);
            AbstractC3292y.h(string3, "getString(...)");
            myDownloads.Z1(string3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(MyDownloads myDownloads, int i8, T t8, View view) {
        C1225d c1225d = myDownloads.f29886Q;
        AbstractC3292y.f(c1225d);
        c1225d.j(true);
        C1225d c1225d2 = myDownloads.f29886Q;
        AbstractC3292y.f(c1225d2);
        c1225d2.i(i8);
        myDownloads.F4();
        myDownloads.A4();
        AlertDialog alertDialog = (AlertDialog) t8.f34573a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(T t8, c5.r rVar, MyDownloads myDownloads, View view) {
        if (UptodownApp.f29249C.a0()) {
            AlertDialog alertDialog = (AlertDialog) t8.f34573a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            if (rVar.Z() == 100) {
                myDownloads.E4(rVar.f());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(T t8, MyDownloads myDownloads, c5.r rVar, View view) {
        if (UptodownApp.f29249C.a0()) {
            AlertDialog alertDialog = (AlertDialog) t8.f34573a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            myDownloads.C2(rVar.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(T t8, MyDownloads myDownloads, int i8, View view) {
        AlertDialog alertDialog = (AlertDialog) t8.f34573a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        myDownloads.N3(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(T t8, MyDownloads myDownloads, int i8, View view) {
        String str;
        AlertDialog alertDialog = (AlertDialog) t8.f34573a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C1225d c1225d = myDownloads.f29886Q;
        AbstractC3292y.f(c1225d);
        if (((c5.r) c1225d.d().get(i8)).f() != null) {
            C1225d c1225d2 = myDownloads.f29886Q;
            AbstractC3292y.f(c1225d2);
            String f8 = ((c5.r) c1225d2.d().get(i8)).f();
            AbstractC3292y.f(f8);
            File parentFile = new File(f8).getParentFile();
            if (parentFile != null) {
                str = parentFile.getAbsolutePath();
            } else {
                str = null;
            }
            if (str != null) {
                Intent intent = new Intent(myDownloads.getApplicationContext(), (Class<?>) FileExplorerActivity.class);
                intent.putExtra("subdir", str);
                myDownloads.startActivity(intent);
            } else {
                String string = myDownloads.getString(R.string.installable_files_not_found);
                AbstractC3292y.h(string, "getString(...)");
                myDownloads.Z1(string);
            }
        }
    }

    private final boolean f4(c5.r rVar) {
        if (rVar != null && rVar.Z() > 0 && rVar.Z() < 100) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P g4() {
        return (P) this.f29884O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h4(String str) {
        if (str != null) {
            C1225d c1225d = this.f29886Q;
            AbstractC3292y.f(c1225d);
            ArrayList d8 = c1225d.d();
            int size = d8.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = d8.get(i8);
                AbstractC3292y.h(obj, "get(...)");
                if (l6.n.s(((c5.r) obj).Y(), str, true)) {
                    return i8;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p i4() {
        return (p) this.f29885P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j4() {
        C1225d c1225d = this.f29886Q;
        if (c1225d != null) {
            c1225d.j(false);
        }
        g4().f12377e.f12391f.setVisibility(8);
        g4().f12377e.f12392g.setVisibility(0);
    }

    private final void k4() {
        setContentView(g4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            g4().f12382j.setNavigationIcon(drawable);
            g4().f12382j.setNavigationContentDescription(getString(R.string.back));
        }
        TextView textView = (TextView) findViewById(R.id.tv_toolbar_title_downloads);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        g4().f12382j.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.I2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.l4(MyDownloads.this, view);
            }
        });
        g4().f12382j.inflateMenu(R.menu.toolbar_menu_my_downloads);
        g4().f12382j.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: F4.Q2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean p42;
                p42 = MyDownloads.p4(MyDownloads.this, menuItem);
                return p42;
            }
        });
        g4().f12381i.setOnQueryTextListener(new f());
        g4().f12381i.setOnClickListener(new View.OnClickListener() { // from class: F4.R2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.q4(MyDownloads.this, view);
            }
        });
        ((ImageView) g4().f12381i.findViewById(R.id.search_close_btn)).setBackgroundResource(R.drawable.shape_transparent);
        ((ImageView) g4().f12381i.findViewById(R.id.search_mag_icon)).setImageResource(R.drawable.vector_search_downloads);
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) g4().f12381i.findViewById(R.id.search_src_text);
        searchAutoComplete.setTypeface(aVar.v());
        searchAutoComplete.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        ((TextView) findViewById(R.id.tv_label_order_by_mdf)).setTypeface(aVar.v());
        g4().f12377e.f12388c.setOnClickListener(new View.OnClickListener() { // from class: F4.S2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.r4(MyDownloads.this, view);
            }
        });
        g4().f12377e.f12389d.setOnClickListener(new View.OnClickListener() { // from class: F4.T2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.s4(MyDownloads.this, view);
            }
        });
        g4().f12377e.f12387b.setOnClickListener(new View.OnClickListener() { // from class: F4.U2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.t4(MyDownloads.this, view);
            }
        });
        g4().f12378f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        g4().f12378f.addItemDecoration(new s5.m(dimension, dimension));
        g4().f12378f.setItemAnimator(null);
        g4().f12383k.setTypeface(aVar.v());
        g4().f12379g.setOnClickListener(new View.OnClickListener() { // from class: F4.V2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.u4(MyDownloads.this, view);
            }
        });
        g4().f12384l.setTypeface(aVar.v());
        g4().f12377e.f12397l.setTypeface(aVar.u());
        g4().f12377e.f12397l.setOnClickListener(new View.OnClickListener() { // from class: F4.y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.v4(MyDownloads.this, view);
            }
        });
        TextView textView2 = g4().f12377e.f12394i;
        g4().f12377e.f12396k.setTypeface(aVar.v());
        g4().f12377e.f12393h.setTypeface(aVar.u());
        g4().f12377e.f12393h.setOnClickListener(new View.OnClickListener() { // from class: F4.z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.w4(MyDownloads.this, view);
            }
        });
        g4().f12377e.f12394i.setTypeface(aVar.u());
        g4().f12377e.f12394i.setOnClickListener(new View.OnClickListener() { // from class: F4.A2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.m4(MyDownloads.this, view);
            }
        });
        g4().f12376d.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.O2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.n4(view);
            }
        });
        g4().f12375c.setOnClickListener(new View.OnClickListener() { // from class: F4.P2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.o4(MyDownloads.this, view);
            }
        });
        l0();
        getOnBackPressedDispatcher().addCallback(this, this.f29889T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l4(MyDownloads myDownloads, View view) {
        myDownloads.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m4(MyDownloads myDownloads, View view) {
        myDownloads.W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o4(MyDownloads myDownloads, View view) {
        if (myDownloads.g4().f12377e.getRoot().getVisibility() == 0) {
            myDownloads.g4().f12377e.getRoot().setVisibility(8);
            view.animate().rotation(0.0f).start();
            C1225d c1225d = myDownloads.f29886Q;
            if (c1225d != null && c1225d.f()) {
                myDownloads.j4();
                return;
            }
            return;
        }
        myDownloads.g4().f12377e.getRoot().setVisibility(0);
        view.animate().rotation(180.0f).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p4(MyDownloads myDownloads, MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_file_explorer) {
            myDownloads.startActivity(new Intent(myDownloads, (Class<?>) FileExplorerActivity.class));
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q4(MyDownloads myDownloads, View view) {
        myDownloads.g4().f12381i.setIconified(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(MyDownloads myDownloads, View view) {
        myDownloads.C4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(MyDownloads myDownloads, View view) {
        myDownloads.D4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t4(MyDownloads myDownloads, View view) {
        myDownloads.B4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u4(MyDownloads myDownloads, View view) {
        myDownloads.g4().f12374b.startAnimation(AnimationUtils.loadAnimation(myDownloads, R.anim.rotate));
        myDownloads.v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v4(MyDownloads myDownloads, View view) {
        C1225d c1225d = myDownloads.f29886Q;
        if (c1225d != null) {
            AbstractC3292y.f(c1225d);
            if (c1225d.f()) {
                myDownloads.j4();
            } else {
                myDownloads.F4();
            }
            C1225d c1225d2 = myDownloads.f29886Q;
            AbstractC3292y.f(c1225d2);
            AbstractC3292y.f(myDownloads.f29886Q);
            c1225d2.j(!r0.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w4(MyDownloads myDownloads, View view) {
        myDownloads.U3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x4() {
        C1225d c1225d = this.f29886Q;
        if (c1225d != null) {
            c1225d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z4(ArrayList arrayList, ArrayList arrayList2) {
        if (!isFinishing()) {
            C1225d c1225d = this.f29886Q;
            if (c1225d == null) {
                this.f29886Q = new C1225d(arrayList, arrayList2, this, this.f29890U);
                g4().f12378f.setAdapter(this.f29886Q);
            } else {
                AbstractC3292y.f(c1225d);
                c1225d.g(arrayList, arrayList2);
            }
        }
    }

    public final void G4(int i8, c5.r rVar) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new l(i8, rVar, null), 2, null);
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a
    public void X2(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
        if (!isFinishing()) {
            Intent intent = new Intent(this, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", appInfo);
            startActivity(intent, UptodownApp.f29249C.a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k4();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new h(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        try {
            C3791p a9 = C3791p.f37286s.a(this);
            a9.a();
            a9.g1();
            a9.i();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C3800y.f37330a.g(this);
        y4(true);
    }

    public final void y4(boolean z8) {
        if (g4().f12381i.getQuery().toString().length() > 0) {
            J3(g4().f12381i.getQuery().toString());
        } else {
            i4().i(this, this.f29888S, this.f29887R, z8);
        }
    }
}
