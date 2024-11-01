package com.uptodown.activities;

import I4.C1227f;
import I4.C1229h;
import J4.j;
import K4.a1;
import Y4.C1527q;
import Y4.C1532w;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.ComposerKt;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1987k;
import b5.InterfaceC1988l;
import c5.C2043h;
import c5.C2047l;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2691a;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.view.WrapContentLinearLayoutManager;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import q5.C3775H;
import q5.C3784i;
import q5.C3788m;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3797v;

/* renamed from: com.uptodown.activities.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC2691a extends a1 {

    /* renamed from: N, reason: collision with root package name */
    public static final C0701a f30376N = new C0701a(null);

    /* renamed from: A, reason: collision with root package name */
    private RecyclerView f30377A;

    /* renamed from: B, reason: collision with root package name */
    private C1229h f30378B;

    /* renamed from: D, reason: collision with root package name */
    private RecyclerView f30380D;

    /* renamed from: E, reason: collision with root package name */
    private C1227f f30381E;

    /* renamed from: G, reason: collision with root package name */
    private long f30383G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f30384H;

    /* renamed from: I, reason: collision with root package name */
    private RecyclerView f30385I;

    /* renamed from: J, reason: collision with root package name */
    private I4.A f30386J;

    /* renamed from: M, reason: collision with root package name */
    private ActivityResultLauncher f30389M;

    /* renamed from: w, reason: collision with root package name */
    private UptodownApp f30390w;

    /* renamed from: x, reason: collision with root package name */
    private C3795t f30391x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f30392y;

    /* renamed from: z, reason: collision with root package name */
    private AlertDialog f30393z;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC1988l f30379C = new h();

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC1987k f30382F = new g();

    /* renamed from: K, reason: collision with root package name */
    private b5.y f30387K = new o();

    /* renamed from: L, reason: collision with root package name */
    private ArrayList f30388L = new ArrayList();

    /* renamed from: com.uptodown.activities.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0701a {
        private C0701a() {
        }

        public /* synthetic */ C0701a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.uptodown.activities.a$b */
    /* loaded from: classes4.dex */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!AbstractActivityC2691a.this.u2()) {
                AbstractActivityC2691a abstractActivityC2691a = AbstractActivityC2691a.this;
                String string = abstractActivityC2691a.getString(R.string.error_no_connection);
                AbstractC3292y.h(string, "getString(...)");
                abstractActivityC2691a.Z1(string);
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends ItemTouchHelper.SimpleCallback {
        c() {
            super(0, 8);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            AbstractC3292y.i(recyclerView, "recyclerView");
            AbstractC3292y.i(viewHolder, "viewHolder");
            AbstractC3292y.i(target, "target");
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i8) {
            AbstractC3292y.i(viewHolder, "viewHolder");
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            I4.A a9 = AbstractActivityC2691a.this.f30386J;
            if (a9 != null) {
                a9.e(absoluteAdapterPosition);
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30396a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0702a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30398a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2691a f30399b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.activities.a$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0703a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f30400a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ T f30401b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ File f30402c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractActivityC2691a f30403d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0703a(T t8, File file, AbstractActivityC2691a abstractActivityC2691a, U5.d dVar) {
                    super(2, dVar);
                    this.f30401b = t8;
                    this.f30402c = file;
                    this.f30403d = abstractActivityC2691a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0703a(this.f30401b, this.f30402c, this.f30403d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f30400a == 0) {
                        Q5.t.b(obj);
                        if (this.f30401b.f34573a != null) {
                            C2047l c2047l = new C2047l();
                            File file = this.f30402c;
                            AbstractC3292y.f(file);
                            c2047l.h(file.getAbsolutePath());
                            c2047l.f(String.valueOf(this.f30402c.lastModified()));
                            this.f30403d.D2((String) this.f30401b.f34573a, c2047l);
                        } else {
                            this.f30403d.B2();
                        }
                        this.f30403d.M2(true);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(n6.M m8, U5.d dVar) {
                    return ((C0703a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0702a(AbstractActivityC2691a abstractActivityC2691a, U5.d dVar) {
                super(2, dVar);
                this.f30399b = abstractActivityC2691a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0702a(this.f30399b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f30398a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    T t8 = new T();
                    File h8 = new C3794s().h(this.f30399b);
                    if (h8 != null) {
                        C3791p a9 = C3791p.f37286s.a(this.f30399b);
                        a9.a();
                        ArrayList X8 = a9.X();
                        a9.i();
                        Iterator it = X8.iterator();
                        AbstractC3292y.h(it, "iterator(...)");
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                AbstractC3292y.h(next, "next(...)");
                                C2047l c2047l = (C2047l) next;
                                if (l6.n.s(c2047l.e(), h8.getAbsolutePath(), true) && Long.parseLong(c2047l.a()) == h8.lastModified()) {
                                    break;
                                }
                            } else {
                                C3794s c3794s = new C3794s();
                                String name = h8.getName();
                                AbstractC3292y.h(name, "getName(...)");
                                t8.f34573a = c3794s.i(name);
                                break;
                            }
                        }
                    }
                    J0 c8 = C3445b0.c();
                    C0703a c0703a = new C0703a(t8, h8, this.f30399b, null);
                    this.f30398a = 1;
                    if (AbstractC3458i.g(c8, c0703a, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((C0702a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30396a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                n6.I b9 = C3445b0.b();
                C0702a c0702a = new C0702a(AbstractActivityC2691a.this, null);
                this.f30396a = 1;
                if (AbstractC3458i.g(b9, c0702a, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.uptodown.activities.a$e */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30404a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30406c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f30407d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f30408e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Function0 function0, Function0 function02, U5.d dVar) {
            super(2, dVar);
            this.f30406c = str;
            this.f30407d = function0;
            this.f30408e = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(Function0 function0, AbstractActivityC2691a abstractActivityC2691a, View view) {
            function0.invoke();
            abstractActivityC2691a.m2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(Function0 function0, AbstractActivityC2691a abstractActivityC2691a, View view) {
            function0.invoke();
            abstractActivityC2691a.m2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f30406c, this.f30407d, this.f30408e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30404a == 0) {
                Q5.t.b(obj);
                if (!AbstractActivityC2691a.this.isFinishing()) {
                    AlertDialog o22 = AbstractActivityC2691a.this.o2();
                    if (o22 != null) {
                        o22.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(AbstractActivityC2691a.this);
                    C1527q c8 = C1527q.c(AbstractActivityC2691a.this.getLayoutInflater());
                    AbstractC3292y.h(c8, "inflate(...)");
                    String str = this.f30406c;
                    final Function0 function0 = this.f30407d;
                    final AbstractActivityC2691a abstractActivityC2691a = AbstractActivityC2691a.this;
                    final Function0 function02 = this.f30408e;
                    TextView textView = c8.f12902d;
                    j.a aVar = J4.j.f4395g;
                    textView.setTypeface(aVar.v());
                    c8.f12902d.setText(str);
                    c8.f12903e.setTypeface(aVar.u());
                    c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractActivityC2691a.e.k(Function0.this, abstractActivityC2691a, view);
                        }
                    });
                    c8.f12901c.setTypeface(aVar.u());
                    c8.f12901c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractActivityC2691a.e.p(Function0.this, abstractActivityC2691a, view);
                        }
                    });
                    builder.setCancelable(false);
                    builder.setView(c8.getRoot());
                    AbstractActivityC2691a.this.K2(builder.create());
                    if (!AbstractActivityC2691a.this.isFinishing() && AbstractActivityC2691a.this.o2() != null) {
                        AbstractActivityC2691a.this.S2();
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.uptodown.activities.a$f */
    /* loaded from: classes4.dex */
    public static final class f implements b5.r {
        f() {
        }

        @Override // b5.r
        public void b(int i8) {
            AbstractActivityC2691a abstractActivityC2691a = AbstractActivityC2691a.this;
            String string = abstractActivityC2691a.getString(R.string.app_detail_not_found);
            AbstractC3292y.h(string, "getString(...)");
            abstractActivityC2691a.Z1(string);
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            AbstractActivityC2691a.this.X2(appInfo);
        }
    }

    /* renamed from: com.uptodown.activities.a$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC1987k {
        g() {
        }

        @Override // b5.InterfaceC1987k
        public void a(File file) {
            AbstractC3292y.i(file, "file");
            UptodownApp.a.Z(UptodownApp.f29249C, file, AbstractActivityC2691a.this, null, 4, null);
            AbstractActivityC2691a.this.k2(file);
        }
    }

    /* renamed from: com.uptodown.activities.a$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC1988l {
        h() {
        }

        @Override // b5.InterfaceC1988l
        public void a() {
            if (UptodownApp.f29249C.a0()) {
                AbstractActivityC2691a.this.E2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$i */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30412a;

        /* renamed from: b, reason: collision with root package name */
        int f30413b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f30414c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2691a f30415d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30416e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j8, AbstractActivityC2691a abstractActivityC2691a, int i8, U5.d dVar) {
            super(2, dVar);
            this.f30414c = j8;
            this.f30415d = abstractActivityC2691a;
            this.f30416e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(this.f30414c, this.f30415d, this.f30416e, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r7.f30413b
                r2 = 2
                java.lang.String r3 = "downloadApkWorker"
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r2) goto L16
                int r1 = r7.f30412a
                Q5.t.b(r8)
                goto L50
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                Q5.t.b(r8)
                goto L30
            L22:
                Q5.t.b(r8)
                long r5 = r7.f30414c
                r7.f30413b = r4
                java.lang.Object r8 = n6.X.b(r5, r7)
                if (r8 != r0) goto L30
                return r0
            L30:
                com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f29249C
                com.uptodown.activities.a r1 = r7.f30415d
                androidx.work.WorkInfo$State r8 = r8.I(r3, r1)
                r1 = 0
            L39:
                int r5 = r7.f30416e
                if (r1 >= r5) goto L59
                androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.ENQUEUED
                if (r8 != r5) goto L59
                int r1 = r1 + 1
                long r5 = r7.f30414c
                r7.f30412a = r1
                r7.f30413b = r2
                java.lang.Object r8 = n6.X.b(r5, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f29249C
                com.uptodown.activities.a r5 = r7.f30415d
                androidx.work.WorkInfo$State r8 = r8.I(r3, r5)
                goto L39
            L59:
                com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f29249C
                com.uptodown.activities.a r0 = r7.f30415d
                boolean r8 = r8.W(r3, r0)
                if (r8 != 0) goto L84
                q5.m r8 = new q5.m
                r8.<init>()
                com.uptodown.activities.a r0 = r7.f30415d
                java.util.ArrayList r8 = r8.k(r0)
                boolean r0 = r8.isEmpty()
                r0 = r0 ^ r4
                if (r0 == 0) goto L84
                com.uptodown.activities.a r0 = r7.f30415d
                java.lang.Object r8 = R5.AbstractC1435t.m0(r8)
                c5.r r8 = (c5.r) r8
                int r8 = r8.y()
                r0.I2(r0, r8)
            L84:
                Q5.I r8 = Q5.I.f8786a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AbstractActivityC2691a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.uptodown.activities.a$j */
    /* loaded from: classes4.dex */
    public static final class j implements b5.J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f30418b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30419c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f30420d;

        j(File file, String str, boolean z8) {
            this.f30418b = file;
            this.f30419c = str;
            this.f30420d = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I d(AbstractActivityC2691a abstractActivityC2691a, File file, String str, boolean z8) {
            new J4.i(abstractActivityC2691a).c(file, str, z8);
            return Q5.I.f8786a;
        }

        @Override // b5.J
        public void a() {
        }

        @Override // b5.J
        public void b(c5.J reportVT) {
            AbstractC3292y.i(reportVT, "reportVT");
            if (reportVT.h() > 0) {
                Application application = AbstractActivityC2691a.this.getApplication();
                AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.UptodownApp");
                final AbstractActivityC2691a abstractActivityC2691a = AbstractActivityC2691a.this;
                final File file = this.f30418b;
                final String str = this.f30419c;
                final boolean z8 = this.f30420d;
                ((UptodownApp) application).m1(reportVT, new Function0() { // from class: F4.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I d8;
                        d8 = AbstractActivityC2691a.j.d(AbstractActivityC2691a.this, file, str, z8);
                        return d8;
                    }
                }, AbstractActivityC2691a.this);
                return;
            }
            new J4.i(AbstractActivityC2691a.this).c(this.f30418b, this.f30419c, this.f30420d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$k */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30421a;

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
            int i8 = this.f30421a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                AbstractActivityC2691a abstractActivityC2691a = AbstractActivityC2691a.this;
                this.f30421a = 1;
                if (abstractActivityC2691a.z2(this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$l */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30423a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.a$l$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0704a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30425a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2691a f30426b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f30427c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0704a(AbstractActivityC2691a abstractActivityC2691a, ArrayList arrayList, U5.d dVar) {
                super(2, dVar);
                this.f30426b = abstractActivityC2691a;
                this.f30427c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0704a(this.f30426b, this.f30427c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30425a == 0) {
                    Q5.t.b(obj);
                    C1229h c1229h = this.f30426b.f30378B;
                    if (c1229h != null) {
                        c1229h.i(this.f30427c);
                        return Q5.I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((C0704a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        l(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30423a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                ArrayList k8 = new C3788m().k(AbstractActivityC2691a.this);
                J0 c8 = C3445b0.c();
                C0704a c0704a = new C0704a(AbstractActivityC2691a.this, k8, null);
                this.f30423a = 1;
                obj = AbstractC3458i.g(c8, c0704a, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.uptodown.activities.a$m */
    /* loaded from: classes4.dex */
    public static final class m implements b5.r {
        m() {
        }

        @Override // b5.r
        public void b(int i8) {
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (!AbstractActivityC2691a.this.isFinishing()) {
                Intent intent = new Intent(AbstractActivityC2691a.this, (Class<?>) AppDetailActivity.class);
                intent.putExtra("appInfo", appInfo);
                AbstractActivityC2691a abstractActivityC2691a = AbstractActivityC2691a.this;
                abstractActivityC2691a.startActivity(intent, UptodownApp.f29249C.a(abstractActivityC2691a));
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$n */
    /* loaded from: classes4.dex */
    public static final class n implements b5.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2047l f30429a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2691a f30430b;

        n(C2047l c2047l, AbstractActivityC2691a abstractActivityC2691a) {
            this.f30429a = c2047l;
            this.f30430b = abstractActivityC2691a;
        }

        @Override // b5.r
        public void b(int i8) {
            this.f30430b.B2();
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (appInfo.h() > 0) {
                UptodownApp.f29249C.r0(this.f30429a);
                if (this.f30429a != null) {
                    C3791p a9 = C3791p.f37286s.a(this.f30430b);
                    a9.a();
                    a9.C0(this.f30429a);
                    a9.i();
                }
                this.f30430b.A2(appInfo);
                return;
            }
            this.f30430b.B2();
        }
    }

    /* renamed from: com.uptodown.activities.a$o */
    /* loaded from: classes4.dex */
    public static final class o implements b5.y {
        o() {
        }

        @Override // b5.y
        public void a() {
            if (AbstractActivityC2691a.this.r2().size() > 0) {
                Object remove = AbstractActivityC2691a.this.r2().remove(0);
                AbstractC3292y.h(remove, "removeAt(...)");
                AbstractActivityC2691a.this.H2((c5.G) remove);
            }
        }

        @Override // b5.y
        public void b(c5.G preregister) {
            AbstractC3292y.i(preregister, "preregister");
            AbstractActivityC2691a.this.C2(preregister.b());
            I4.A a9 = AbstractActivityC2691a.this.f30386J;
            if (a9 != null) {
                a9.d(preregister);
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$p */
    /* loaded from: classes4.dex */
    public static final class p implements b5.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.G f30433b;

        p(c5.G g8) {
            this.f30433b = g8;
        }

        @Override // b5.r
        public void b(int i8) {
            if (i8 == 404) {
                C3791p a9 = C3791p.f37286s.a(AbstractActivityC2691a.this);
                a9.a();
                a9.a1(this.f30433b.b());
                a9.i();
            }
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            c5.G g8 = new c5.G();
            g8.j(appInfo.h());
            g8.l(appInfo.q0());
            g8.k(appInfo.j0());
            AbstractActivityC2691a.this.Q1(g8);
            C3791p a9 = C3791p.f37286s.a(AbstractActivityC2691a.this);
            a9.a();
            a9.a1(g8.b());
            a9.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(AbstractActivityC2691a abstractActivityC2691a) {
        String string = abstractActivityC2691a.getString(R.string.error_no_connection);
        AbstractC3292y.h(string, "getString(...)");
        abstractActivityC2691a.Z1(string);
    }

    private final void N1(c5.r rVar) {
        if (rVar.X() != null) {
            File f8 = new C3794s().f(this);
            String X8 = rVar.X();
            AbstractC3292y.f(X8);
            final File file = new File(f8, X8);
            if (file.exists()) {
                C1227f c1227f = this.f30381E;
                if (c1227f != null) {
                    c1227f.b(file, rVar);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: F4.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC2691a.O1(AbstractActivityC2691a.this, file);
                    }
                }, 5000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O1(AbstractActivityC2691a abstractActivityC2691a, File file) {
        abstractActivityC2691a.k2(file);
    }

    private final void R1() {
        new ItemTouchHelper(new c()).attachToRecyclerView(this.f30385I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V1(Function0 function0, AbstractActivityC2691a abstractActivityC2691a, View view) {
        function0.invoke();
        abstractActivityC2691a.m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(AbstractActivityC2691a abstractActivityC2691a, View view) {
        abstractActivityC2691a.m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I Y1(File file, AbstractActivityC2691a abstractActivityC2691a) {
        UptodownApp.a.Z(UptodownApp.f29249C, file, abstractActivityC2691a, null, 4, null);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(AbstractActivityC2691a abstractActivityC2691a, View view) {
        abstractActivityC2691a.m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I c2(AbstractActivityC2691a abstractActivityC2691a, long j8) {
        Context applicationContext = abstractActivityC2691a.getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        new X4.i(applicationContext, j8, new f(), LifecycleOwnerKt.getLifecycleScope(abstractActivityC2691a));
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(AbstractActivityC2691a abstractActivityC2691a, View view) {
        AlertDialog alertDialog = abstractActivityC2691a.f30393z;
        AbstractC3292y.f(alertDialog);
        alertDialog.dismiss();
        abstractActivityC2691a.l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(AbstractActivityC2691a abstractActivityC2691a, View view) {
        AlertDialog alertDialog = abstractActivityC2691a.f30393z;
        AbstractC3292y.f(alertDialog);
        alertDialog.dismiss();
        abstractActivityC2691a.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h2(AbstractActivityC2691a abstractActivityC2691a, Function0 function0, View view) {
        AlertDialog alertDialog = abstractActivityC2691a.f30393z;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i2(Function0 function0, AbstractActivityC2691a abstractActivityC2691a, View view) {
        function0.invoke();
        AlertDialog alertDialog = abstractActivityC2691a.f30393z;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(final File file) {
        Integer num;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        C1227f c1227f = this.f30381E;
        View view = null;
        if (c1227f != null) {
            num = Integer.valueOf(c1227f.c(file));
        } else {
            num = null;
        }
        if (num != null && num.intValue() >= 0) {
            RecyclerView recyclerView = this.f30380D;
            if (recyclerView != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(num.intValue())) != null) {
                view = findViewHolderForAdapterPosition.itemView;
            }
            if (view != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_out_left);
                AbstractC3292y.h(loadAnimation, "loadAnimation(...)");
                loadAnimation.setDuration(300L);
                view.startAnimation(loadAnimation);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: F4.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC2691a.l2(AbstractActivityC2691a.this, file);
                    }
                }, loadAnimation.getDuration());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(AbstractActivityC2691a abstractActivityC2691a, File file) {
        C1227f c1227f = abstractActivityC2691a.f30381E;
        if (c1227f != null) {
            c1227f.e(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2() {
        AlertDialog alertDialog = this.f30393z;
        AbstractC3292y.f(alertDialog);
        alertDialog.dismiss();
        UptodownApp.f29249C.s0(false);
    }

    public static /* synthetic */ void x2(AbstractActivityC2691a abstractActivityC2691a, File file, String str, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                str = null;
            }
            abstractActivityC2691a.w2(file, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchInstallation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z2(U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new l(null), dVar);
    }

    public void A2(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
        X2(appInfo);
    }

    public void B2() {
    }

    public void C2(long j8) {
        if (j8 > 0) {
            new X4.i(this, j8, new m(), LifecycleOwnerKt.getLifecycleScope(this));
        } else {
            E2();
            Q5.I i8 = Q5.I.f8786a;
        }
    }

    public final void D2(String packageNameToOpen, C2047l c2047l) {
        AbstractC3292y.i(packageNameToOpen, "packageNameToOpen");
        new X4.j(this, packageNameToOpen, new n(c2047l, this), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final void E2() {
        Activity f8 = J4.j.f4395g.f();
        if (!isFinishing() && !(f8 instanceof MyDownloads)) {
            startActivity(new Intent(this, (Class<?>) MyDownloads.class), UptodownApp.f29249C.a(this));
        }
    }

    public final void F2(String str) {
        if (str != null && !isFinishing()) {
            String s8 = new C3784i().s(str);
            String string = getString(R.string.virustotal_safety_report_title);
            AbstractC3292y.h(string, "getString(...)");
            new C3788m().q(this, s8, string);
        }
    }

    public final void G2(c5.r download) {
        ArrayList arrayList;
        AbstractC3292y.i(download, "download");
        C1229h c1229h = this.f30378B;
        if (c1229h != null) {
            c1229h.h(download);
        }
        C1229h c1229h2 = this.f30378B;
        if (c1229h2 != null) {
            arrayList = c1229h2.f();
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            s2();
        }
    }

    public final void H2(c5.G preregister) {
        AbstractC3292y.i(preregister, "preregister");
        new X4.i(this, preregister.b(), new p(preregister), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final void I2(Context context, int i8) {
        AbstractC3292y.i(context, "context");
        if (C3797v.f37313a.d()) {
            DownloadApkWorker.f31190k.f(context, i8);
        } else {
            runOnUiThread(new Runnable() { // from class: F4.v
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractActivityC2691a.J2(AbstractActivityC2691a.this);
                }
            });
        }
    }

    public final void K2(AlertDialog alertDialog) {
        this.f30393z = alertDialog;
    }

    public final void L2() {
        this.f30391x = new C3795t(this);
    }

    public final void M2(boolean z8) {
        this.f30384H = z8;
    }

    public final void N2(C3795t c3795t) {
        this.f30391x = c3795t;
    }

    public final void O2(Window window) {
        WindowInsetsController insetsController;
        int statusBars;
        int navigationBars;
        AbstractC3292y.i(window, "window");
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            if (insetsController != null) {
                statusBars = WindowInsets.Type.statusBars();
                navigationBars = WindowInsets.Type.navigationBars();
                insetsController.hide(statusBars | navigationBars);
                insetsController.setSystemBarsBehavior(2);
                return;
            }
            return;
        }
        window.getDecorView().setSystemUiVisibility(4);
        window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
    }

    public final void P1(c5.r download) {
        ArrayList arrayList;
        AbstractC3292y.i(download, "download");
        C1229h c1229h = this.f30378B;
        if (c1229h != null) {
            c1229h.e(download);
        }
        C1229h c1229h2 = this.f30378B;
        if (c1229h2 != null) {
            arrayList = c1229h2.f();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            T2();
        }
    }

    public final void P2(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<set-?>");
        this.f30388L = arrayList;
    }

    public final void Q1(c5.G preRegister) {
        AbstractC3292y.i(preRegister, "preRegister");
        I4.A a9 = this.f30386J;
        if (a9 != null) {
            a9.b(preRegister);
        }
    }

    public final void Q2(Drawable drawable, int i8) {
        AbstractC3292y.i(drawable, "drawable");
        DrawableCompat.setTint(drawable, i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R2(ActivityResultLauncher activityResultLauncher) {
        this.f30389M = activityResultLauncher;
    }

    public final void S1() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f30383G > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            this.f30383G = currentTimeMillis;
            AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new d(null), 3, null);
        }
    }

    public final void S2() {
        AlertDialog alertDialog = this.f30393z;
        AbstractC3292y.f(alertDialog);
        Window window = alertDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.f30393z;
        AbstractC3292y.f(alertDialog2);
        alertDialog2.show();
        UptodownApp.f29249C.s0(true);
    }

    public final void T1(String msg, final Function0 acceptAction) {
        AbstractC3292y.i(msg, "msg");
        AbstractC3292y.i(acceptAction, "acceptAction");
        if (!isFinishing()) {
            AlertDialog alertDialog = this.f30393z;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            C1527q c8 = C1527q.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f12902d;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            c8.f12902d.setText(msg);
            c8.f12903e.setTypeface(aVar.u());
            c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: F4.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2691a.V1(Function0.this, this, view);
                }
            });
            c8.f12901c.setTypeface(aVar.u());
            c8.f12901c.setOnClickListener(new View.OnClickListener() { // from class: F4.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2691a.W1(AbstractActivityC2691a.this, view);
                }
            });
            builder.setView(c8.getRoot());
            this.f30393z = builder.create();
            if (!isFinishing() && this.f30393z != null) {
                S2();
            }
        }
    }

    public final void T2() {
        RecyclerView recyclerView = this.f30377A;
        if (recyclerView != null && recyclerView.getVisibility() == 8) {
            RecyclerView recyclerView2 = this.f30377A;
            if (recyclerView2 != null) {
                recyclerView2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_next_in));
            }
            RecyclerView recyclerView3 = this.f30377A;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
        }
    }

    public final void U1(String msg, Function0 acceptAction, Function0 cancelAction) {
        AbstractC3292y.i(msg, "msg");
        AbstractC3292y.i(acceptAction, "acceptAction");
        AbstractC3292y.i(cancelAction, "cancelAction");
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new e(msg, acceptAction, cancelAction, null), 2, null);
    }

    public void U2(long j8) {
        String string = getString(R.string.core_kill_this_app, getString(R.string.app_name));
        AbstractC3292y.h(string, "getString(...)");
        Z1(string);
    }

    public final void V2() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        AbstractC3292y.h(build, "build(...)");
        build.intent.setData(Uri.parse(new C3788m().c(C3775H.f37269c.c(this))));
        ActivityResultLauncher activityResultLauncher = this.f30389M;
        if (activityResultLauncher != null) {
            AbstractC3292y.f(activityResultLauncher);
            activityResultLauncher.launch(build.intent, UptodownApp.f29249C.b(this));
        } else {
            startActivity(build.intent, UptodownApp.f29249C.a(this));
        }
    }

    public final void W2(int i8, c5.r download, boolean z8) {
        AbstractC3292y.i(download, "download");
        switch (i8) {
            case 199:
                C1229h c1229h = this.f30378B;
                if (c1229h != null) {
                    c1229h.j(download, i8);
                    return;
                }
                return;
            case 200:
                C1229h c1229h2 = this.f30378B;
                if (c1229h2 != null) {
                    c1229h2.j(download, i8);
                    return;
                }
                return;
            case ComposerKt.providerKey /* 201 */:
                C1229h c1229h3 = this.f30378B;
                if (c1229h3 != null) {
                    c1229h3.j(download, i8);
                    return;
                }
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
                G2(download);
                return;
            case ComposerKt.providerValuesKey /* 203 */:
                y2();
                return;
            case ComposerKt.providerMapsKey /* 204 */:
            default:
                return;
            case 205:
                C1229h c1229h4 = this.f30378B;
                if (c1229h4 != null) {
                    c1229h4.j(download, i8);
                    return;
                }
                return;
            case ComposerKt.referenceKey /* 206 */:
                G2(download);
                if (z8) {
                    N1(download);
                    return;
                }
                return;
            case ComposerKt.reuseKey /* 207 */:
                G2(download);
                return;
            case 208:
                y2();
                return;
        }
    }

    public final void X1(final File updateFile) {
        AbstractC3292y.i(updateFile, "updateFile");
        String string = getString(R.string.warning_auto_update);
        AbstractC3292y.h(string, "getString(...)");
        T1(string, new Function0() { // from class: F4.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I Y12;
                Y12 = AbstractActivityC2691a.Y1(updateFile, this);
                return Y12;
            }
        });
    }

    public void X2(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
    }

    @Override // K4.r
    public void Y() {
    }

    @Override // K4.r
    public void Z() {
    }

    @Override // K4.a1
    public void Z0() {
    }

    public final void Z1(String msg) {
        AbstractC3292y.i(msg, "msg");
        if (!isFinishing()) {
            AlertDialog alertDialog = this.f30393z;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            C1527q c8 = C1527q.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f12902d;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            c8.f12902d.setText(msg);
            c8.f12901c.setVisibility(8);
            c8.f12903e.setTypeface(aVar.u());
            c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: F4.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2691a.a2(AbstractActivityC2691a.this, view);
                }
            });
            builder.setView(c8.getRoot());
            this.f30393z = builder.create();
            if (!isFinishing() && this.f30393z != null) {
                S2();
            }
        }
    }

    @Override // K4.r
    public void a0() {
    }

    @Override // K4.r
    public void b0() {
    }

    public final void b2(String str, String str2, final long j8) {
        T1(str + '\n' + str2, new Function0() { // from class: F4.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I c22;
                c22 = AbstractActivityC2691a.c2(AbstractActivityC2691a.this, j8);
                return c22;
            }
        });
    }

    @Override // K4.r
    public void d0() {
    }

    public final void d2() {
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog alertDialog2 = this.f30393z;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            C1527q c8 = C1527q.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f12902d;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            c8.f12902d.setText(getString(R.string.msg_storage_permission_required));
            c8.f12903e.setTypeface(aVar.u());
            c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: F4.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2691a.e2(AbstractActivityC2691a.this, view);
                }
            });
            c8.f12901c.setTypeface(aVar.u());
            c8.f12901c.setText(getString(R.string.exit));
            c8.f12901c.setOnClickListener(new View.OnClickListener() { // from class: F4.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2691a.f2(AbstractActivityC2691a.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(false);
            this.f30393z = builder.create();
            if (!isFinishing() && (alertDialog = this.f30393z) != null) {
                AbstractC3292y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog3 = this.f30393z;
                AbstractC3292y.f(alertDialog3);
                alertDialog3.show();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getSource() == 8194) {
            return true;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.right_to_left_out);
    }

    public final void g2(C2043h appInfo, final Function0 action, final Function0 cancelAction) {
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(action, "action");
        AbstractC3292y.i(cancelAction, "cancelAction");
        AlertDialog alertDialog = this.f30393z;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C1532w c8 = C1532w.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        TextView textView = c8.f13051e;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        c8.f13050d.setTypeface(aVar.v());
        c8.f13048b.setOnClickListener(new View.OnClickListener() { // from class: F4.E
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC2691a.h2(AbstractActivityC2691a.this, cancelAction, view);
            }
        });
        if (appInfo.h1()) {
            c8.f13050d.setText(appInfo.X());
            c8.f13049c.setText(getString(R.string.leave_anyways));
        } else {
            c8.f13049c.setText(getString(R.string.download_anyways));
        }
        c8.f13049c.setTypeface(aVar.u());
        c8.f13049c.setOnClickListener(new View.OnClickListener() { // from class: F4.F
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC2691a.i2(Function0.this, this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: F4.G
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AbstractActivityC2691a.j2(Function0.this, dialogInterface);
            }
        });
        this.f30393z = builder.create();
        S2();
    }

    public final boolean n2() {
        return this.f30392y;
    }

    public final AlertDialog o2() {
        return this.f30393z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Application application = getApplication();
        AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.UptodownApp");
        this.f30390w = (UptodownApp) application;
        C3795t c3795t = new C3795t(this);
        this.f30391x = c3795t;
        String simpleName = getClass().getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f30392y = false;
        UptodownApp uptodownApp = this.f30390w;
        AbstractC3292y.f(uptodownApp);
        uptodownApp.p1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f30392y = true;
        UptodownApp uptodownApp = this.f30390w;
        AbstractC3292y.f(uptodownApp);
        uptodownApp.q1();
        y2();
        v2();
    }

    public final boolean p2() {
        return this.f30384H;
    }

    public final C3795t q2() {
        return this.f30391x;
    }

    public final ArrayList r2() {
        return this.f30388L;
    }

    public final void s2() {
        RecyclerView recyclerView = this.f30377A;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    public final void t2() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_floating_queue);
        if (UptodownApp.f29249C.S()) {
            relativeLayout.removeAllViews();
            relativeLayout.setVisibility(8);
            return;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_floating_notifications);
        this.f30380D = recyclerView;
        if (recyclerView != null) {
            AbstractC3292y.f(recyclerView);
            recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            RecyclerView recyclerView2 = this.f30380D;
            AbstractC3292y.f(recyclerView2);
            recyclerView2.addItemDecoration(new s5.n((int) getResources().getDimension(R.dimen.margin_m)));
            this.f30381E = new C1227f(this, this.f30382F);
            RecyclerView recyclerView3 = this.f30380D;
            AbstractC3292y.f(recyclerView3);
            recyclerView3.setAdapter(this.f30381E);
        }
        if (this.f30377A == null) {
            RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.rv_floating_queue);
            this.f30377A = recyclerView4;
            if (recyclerView4 != null) {
                AbstractC3292y.f(recyclerView4);
                recyclerView4.setLayoutManager(new WrapContentLinearLayoutManager(this, 0, false));
                RecyclerView recyclerView5 = this.f30377A;
                AbstractC3292y.f(recyclerView5);
                recyclerView5.addItemDecoration(new s5.o((int) getResources().getDimension(R.dimen.margin_m)));
                RecyclerView recyclerView6 = this.f30377A;
                AbstractC3292y.f(recyclerView6);
                recyclerView6.setItemAnimator(null);
                this.f30378B = new C1229h(this, this.f30379C);
                RecyclerView recyclerView7 = this.f30377A;
                AbstractC3292y.f(recyclerView7);
                recyclerView7.setAdapter(this.f30378B);
            }
        }
        RecyclerView recyclerView8 = (RecyclerView) findViewById(R.id.rv_preregister_notifications);
        this.f30385I = recyclerView8;
        if (recyclerView8 != null) {
            AbstractC3292y.f(recyclerView8);
            recyclerView8.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            RecyclerView recyclerView9 = this.f30385I;
            AbstractC3292y.f(recyclerView9);
            recyclerView9.addItemDecoration(new s5.n((int) getResources().getDimension(R.dimen.margin_m)));
            this.f30386J = new I4.A(this, this.f30387K);
            RecyclerView recyclerView10 = this.f30385I;
            AbstractC3292y.f(recyclerView10);
            recyclerView10.setAdapter(this.f30386J);
            R1();
        }
    }

    public final boolean u2() {
        AlertDialog alertDialog = this.f30393z;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return false;
        }
        return true;
    }

    public final void v2() {
        AbstractC3462k.d(n6.N.a(C3445b0.a()), null, null, new i(5000L, this, 5, null), 3, null);
    }

    public final void w2(File item, String str) {
        String str2;
        AbstractC3292y.i(item, "item");
        boolean z8 = new C3784i().z(this);
        c5.T e8 = c5.T.f15689k.e(this);
        C3791p a9 = C3791p.f37286s.a(this);
        a9.a();
        String name = item.getName();
        AbstractC3292y.h(name, "getName(...)");
        c5.r Y8 = a9.Y(name);
        a9.i();
        if (e8 != null && e8.y()) {
            if (Y8 != null) {
                str2 = Y8.w();
            } else {
                str2 = null;
            }
            if (str2 == null || str2.length() == 0) {
                new X4.m(this, null, S4.d.f9430a.e(item.getAbsolutePath()), new j(item, str, z8), LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
        }
        new J4.i(this).c(item, str, z8);
        Q5.I i8 = Q5.I.f8786a;
    }

    public final void y2() {
        if (SettingsPreferences.f30529b.T(this)) {
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(null), 3, null);
        }
    }
}
