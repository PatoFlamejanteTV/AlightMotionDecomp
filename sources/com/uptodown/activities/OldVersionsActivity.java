package com.uptodown.activities;

import I4.C1243w;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import Y4.T;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import c5.C2033C;
import c5.C2041f;
import c5.C2043h;
import c5.Q;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3776a;
import q5.C3791p;
import q5.C3794s;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class OldVersionsActivity extends AbstractActivityC2691a {

    /* renamed from: S, reason: collision with root package name */
    public static final a f29972S = new a(null);

    /* renamed from: Q, reason: collision with root package name */
    private C1243w f29975Q;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f29973O = Q5.l.b(new Function0() { // from class: F4.b3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.T l32;
            l32 = OldVersionsActivity.l3(OldVersionsActivity.this);
            return l32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f29974P = new ViewModelLazy(U.b(r.class), new i(this), new h(this), new j(null, this));

    /* renamed from: R, reason: collision with root package name */
    private e f29976R = new e();

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
        private final String f29977a;

        /* renamed from: b, reason: collision with root package name */
        private final long f29978b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29979c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OldVersionsActivity f29980d;

        public b(OldVersionsActivity oldVersionsActivity, String packagename, long j8, String downloadName) {
            AbstractC3292y.i(packagename, "packagename");
            AbstractC3292y.i(downloadName, "downloadName");
            this.f29980d = oldVersionsActivity;
            this.f29977a = packagename;
            this.f29978b = j8;
            this.f29979c = downloadName;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29980d.s3().d().getValue() != null) {
                Object value = this.f29980d.s3().d().getValue();
                AbstractC3292y.f(value);
                if (((C2043h) value).v0() != null) {
                    Object value2 = this.f29980d.s3().d().getValue();
                    AbstractC3292y.f(value2);
                    if (l6.n.s(((C2043h) value2).v0(), this.f29977a, true)) {
                        OldVersionsActivity oldVersionsActivity = this.f29980d;
                        Object value3 = oldVersionsActivity.s3().d().getValue();
                        AbstractC3292y.f(value3);
                        String v02 = ((C2043h) value3).v0();
                        AbstractC3292y.f(v02);
                        oldVersionsActivity.B3(v02, this.f29978b, this.f29979c);
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29981a;

        /* renamed from: b, reason: collision with root package name */
        private final c5.r f29982b;

        public c(int i8, c5.r rVar) {
            this.f29981a = i8;
            this.f29982b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Long l8;
            int i8 = this.f29981a;
            if (i8 == 203) {
                OldVersionsActivity.this.G3(this.f29982b);
                return;
            }
            if (i8 == 208) {
                Toast.makeText(OldVersionsActivity.this.getApplicationContext(), R.string.no_free_space, 1).show();
                return;
            }
            if (OldVersionsActivity.this.f29975Q != null && !OldVersionsActivity.this.s3().g()) {
                c5.r rVar = this.f29982b;
                Long l9 = null;
                if (rVar != null) {
                    l8 = Long.valueOf(rVar.h());
                } else {
                    l8 = null;
                }
                C2043h c2043h = (C2043h) OldVersionsActivity.this.s3().d().getValue();
                if (c2043h != null) {
                    l9 = Long.valueOf(c2043h.h());
                }
                if (AbstractC3292y.d(l8, l9)) {
                    OldVersionsActivity.this.G3(this.f29982b);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f29984a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29985b;

        public d(String str, int i8) {
            this.f29984a = str;
            this.f29985b = i8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:            if (l6.n.s(((c5.C2041f) r0).Q(), r4.f29984a, true) == false) goto L27;     */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                java.lang.String r0 = r4.f29984a
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r1 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r1 = com.uptodown.activities.OldVersionsActivity.g3(r1)
                q6.w r1 = r1.d()
                java.lang.Object r1 = r1.getValue()
                kotlin.jvm.internal.AbstractC3292y.f(r1)
                c5.h r1 = (c5.C2043h) r1
                java.lang.String r1 = r1.v0()
                r2 = 1
                boolean r0 = l6.n.s(r0, r1, r2)
                if (r0 == 0) goto L114
                int r0 = r4.f29985b
                r1 = 306(0x132, float:4.29E-43)
                r3 = 8
                if (r0 != r1) goto L38
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                Y4.T r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                Y4.K r0 = r0.f12405b
                android.widget.RelativeLayout r0 = r0.f12236b
                r0.setVisibility(r3)
                goto L49
            L38:
                r1 = 307(0x133, float:4.3E-43)
                if (r0 != r1) goto L49
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                Y4.T r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                Y4.K r0 = r0.f12405b
                android.widget.RelativeLayout r0 = r0.f12236b
                r0.setVisibility(r3)
            L49:
                int r0 = r4.f29985b
                r1 = 301(0x12d, float:4.22E-43)
                if (r0 == r1) goto Lfb
                r1 = 351(0x15f, float:4.92E-43)
                if (r0 != r1) goto L55
                goto Lfb
            L55:
                r1 = 352(0x160, float:4.93E-43)
                if (r0 != r1) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r0 = com.uptodown.activities.OldVersionsActivity.g3(r0)
                boolean r0 = r0.g()
                if (r0 != 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r0 = com.uptodown.activities.OldVersionsActivity.g3(r0)
                q6.w r0 = r0.c()
                java.lang.Object r0 = r0.getValue()
                if (r0 == 0) goto Lad
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r0 = com.uptodown.activities.OldVersionsActivity.g3(r0)
                q6.w r0 = r0.c()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                c5.f r0 = (c5.C2041f) r0
                java.lang.String r0 = r0.Q()
                if (r0 == 0) goto Lad
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r0 = com.uptodown.activities.OldVersionsActivity.g3(r0)
                q6.w r0 = r0.c()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                c5.f r0 = (c5.C2041f) r0
                java.lang.String r0 = r0.Q()
                java.lang.String r1 = r4.f29984a
                boolean r0 = l6.n.s(r0, r1, r2)
                if (r0 != 0) goto Lf5
            Lad:
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r0 = com.uptodown.activities.OldVersionsActivity.g3(r0)
                q6.w r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r0 = com.uptodown.activities.OldVersionsActivity.g3(r0)
                q6.w r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                c5.h r0 = (c5.C2043h) r0
                java.lang.String r0 = r0.v0()
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r0 = com.uptodown.activities.OldVersionsActivity.g3(r0)
                q6.w r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                c5.h r0 = (c5.C2043h) r0
                java.lang.String r0 = r0.v0()
                java.lang.String r1 = r4.f29984a
                boolean r0 = l6.n.s(r0, r1, r2)
                if (r0 == 0) goto L114
            Lf5:
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.OldVersionsActivity.f3(r0)
                goto L114
            Lfb:
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                I4.w r0 = com.uptodown.activities.OldVersionsActivity.d3(r0)
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r0 = com.uptodown.activities.OldVersionsActivity.g3(r0)
                boolean r0 = r0.g()
                if (r0 != 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.OldVersionsActivity.j3(r0)
            L114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.OldVersionsActivity.d.run():void");
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements b5.w {
        e() {
        }

        @Override // b5.w
        public void a() {
            if (UptodownApp.f29249C.a0()) {
                OldVersionsActivity.this.s3().l(true);
                OldVersionsActivity.this.s3().n(r0.i() - 1);
                OldVersionsActivity.this.s3().m(OldVersionsActivity.this.s3().i() * 20);
                OldVersionsActivity.this.r3();
            }
        }

        @Override // b5.x
        public void b(C2043h appInfo, C2041f c2041f) {
            AbstractC3292y.i(appInfo, "appInfo");
        }

        @Override // b5.w
        public void c(int i8) {
            if (UptodownApp.f29249C.a0()) {
                OldVersionsActivity.this.z3(i8);
            }
        }

        @Override // b5.w
        public void d(int i8) {
            OldVersionsActivity.this.y3(i8);
        }

        @Override // b5.x
        public void e(String appName) {
            AbstractC3292y.i(appName, "appName");
        }

        @Override // b5.w
        public void f() {
            if (UptodownApp.f29249C.a0()) {
                OldVersionsActivity.this.s3().l(true);
                r s32 = OldVersionsActivity.this.s3();
                s32.n(s32.i() + 1);
                OldVersionsActivity.this.s3().m(OldVersionsActivity.this.s3().i() * 20);
                OldVersionsActivity.this.r3();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29988a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OldVersionsActivity f29990a;

            a(OldVersionsActivity oldVersionsActivity) {
                this.f29990a = oldVersionsActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    if (this.f29990a.s3().f()) {
                        this.f29990a.q3().f12405b.f12236b.setVisibility(0);
                    }
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    if (((r.a) cVar.a()).c()) {
                        this.f29990a.s3().c().setValue(((r.a) cVar.a()).a());
                        this.f29990a.s3().d().setValue(((r.a) cVar.a()).b());
                        if (((r.a) cVar.a()).b().t0() != null) {
                            if (this.f29990a.f29975Q == null) {
                                this.f29990a.m3();
                                this.f29990a.q3().f12406c.setAdapter(this.f29990a.f29975Q);
                            } else {
                                C1243w c1243w = this.f29990a.f29975Q;
                                AbstractC3292y.f(c1243w);
                                c1243w.g(this.f29990a.s3().i());
                                C1243w c1243w2 = this.f29990a.f29975Q;
                                AbstractC3292y.f(c1243w2);
                                c1243w2.f(((r.a) cVar.a()).b().t0());
                                C1243w c1243w3 = this.f29990a.f29975Q;
                                AbstractC3292y.f(c1243w3);
                                c1243w3.e((C2041f) this.f29990a.s3().c().getValue());
                                this.f29990a.F3();
                            }
                        } else {
                            this.f29990a.q3().f12408e.setVisibility(0);
                        }
                        this.f29990a.D3();
                    } else {
                        C2043h c2043h = (C2043h) this.f29990a.s3().d().getValue();
                        if (c2043h != null) {
                            c2043h.p1(null);
                        }
                        this.f29990a.q3().f12408e.setVisibility(0);
                        this.f29990a.D3();
                    }
                } else if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.b.f37254a)) {
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
            int i8 = this.f29988a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L e9 = OldVersionsActivity.this.s3().e();
                a aVar = new a(OldVersionsActivity.this);
                this.f29988a = 1;
                if (e9.collect(aVar, this) == e8) {
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

    /* loaded from: classes4.dex */
    public static final class g implements b5.J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2033C f29992b;

        g(C2033C c2033c) {
            this.f29992b = c2033c;
        }

        @Override // b5.J
        public void a() {
            if (OldVersionsActivity.this.s3().d().getValue() != null) {
                OldVersionsActivity oldVersionsActivity = OldVersionsActivity.this;
                Object value = oldVersionsActivity.s3().d().getValue();
                AbstractC3292y.f(value);
                oldVersionsActivity.F2(((C2043h) value).M0());
            }
        }

        @Override // b5.J
        public void b(c5.J reportVT) {
            AbstractC3292y.i(reportVT, "reportVT");
            Intent intent = new Intent(OldVersionsActivity.this, (Class<?>) VirusTotalReport.class);
            intent.putExtra("appInfo", (Parcelable) OldVersionsActivity.this.s3().d().getValue());
            intent.putExtra("appReportVT", reportVT);
            intent.putExtra("old_version", this.f29992b.p());
            OldVersionsActivity oldVersionsActivity = OldVersionsActivity.this;
            oldVersionsActivity.startActivity(intent, UptodownApp.f29249C.a(oldVersionsActivity));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f29993a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29993a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f29994a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29994a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29996b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29995a = function0;
            this.f29996b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29995a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29996b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29997a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29999c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, U5.d dVar) {
            super(2, dVar);
            this.f29999c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(this.f29999c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:            if (l6.n.s(((c5.C2041f) r3).Q(), r2.f29999c, true) == false) goto L12;     */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00a7, code lost:            r2.f29998b.r3();     */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:            if (l6.n.s(((c5.C2043h) r3).v0(), r2.f29999c, true) != false) goto L18;     */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                V5.b.e()
                int r0 = r2.f29997a
                if (r0 != 0) goto Laf
                Q5.t.b(r3)
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r3 = com.uptodown.activities.OldVersionsActivity.g3(r3)
                boolean r3 = r3.g()
                if (r3 != 0) goto Lac
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r3 = com.uptodown.activities.OldVersionsActivity.g3(r3)
                q6.w r3 = r3.c()
                java.lang.Object r3 = r3.getValue()
                r0 = 1
                if (r3 == 0) goto L5f
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r3 = com.uptodown.activities.OldVersionsActivity.g3(r3)
                q6.w r3 = r3.c()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3292y.f(r3)
                c5.f r3 = (c5.C2041f) r3
                java.lang.String r3 = r3.Q()
                if (r3 == 0) goto L5f
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r3 = com.uptodown.activities.OldVersionsActivity.g3(r3)
                q6.w r3 = r3.c()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3292y.f(r3)
                c5.f r3 = (c5.C2041f) r3
                java.lang.String r3 = r3.Q()
                java.lang.String r1 = r2.f29999c
                boolean r3 = l6.n.s(r3, r1, r0)
                if (r3 != 0) goto La7
            L5f:
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r3 = com.uptodown.activities.OldVersionsActivity.g3(r3)
                q6.w r3 = r3.d()
                java.lang.Object r3 = r3.getValue()
                if (r3 == 0) goto Lac
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r3 = com.uptodown.activities.OldVersionsActivity.g3(r3)
                q6.w r3 = r3.d()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3292y.f(r3)
                c5.h r3 = (c5.C2043h) r3
                java.lang.String r3 = r3.v0()
                if (r3 == 0) goto Lac
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.r r3 = com.uptodown.activities.OldVersionsActivity.g3(r3)
                q6.w r3 = r3.d()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3292y.f(r3)
                c5.h r3 = (c5.C2043h) r3
                java.lang.String r3 = r3.v0()
                java.lang.String r1 = r2.f29999c
                boolean r3 = l6.n.s(r3, r1, r0)
                if (r3 == 0) goto Lac
            La7:
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.OldVersionsActivity.f3(r3)
            Lac:
                Q5.I r3 = Q5.I.f8786a
                return r3
            Laf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.OldVersionsActivity.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    private final void A3(C2033C c2033c) {
        if (!isFinishing() && s3().d().getValue() != null) {
            Object value = s3().d().getValue();
            AbstractC3292y.f(value);
            if (((C2043h) value).g1()) {
                new X4.m(this, c2033c.a(), null, new g(c2033c), LifecycleOwnerKt.getLifecycleScope(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(String str, long j8, String str2) {
        if (x3(str, j8)) {
            n3(str, str2);
            return;
        }
        C3794s c3794s = new C3794s();
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        UptodownApp.a.Z(UptodownApp.f29249C, new File(c3794s.f(applicationContext), str2), this, null, 4, null);
    }

    private final void C3(String str, long j8, String str2) {
        if (x3(str, j8)) {
            n3(str, str2);
            return;
        }
        C3794s c3794s = new C3794s();
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        UptodownApp.a.Z(UptodownApp.f29249C, new File(c3794s.g(applicationContext), str2), this, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3() {
        s3().k(false);
        q3().f12405b.f12236b.setVisibility(8);
        s3().l(false);
    }

    private final void E3(String str) {
        new J4.i(this).h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3() {
        C1243w c1243w = this.f29975Q;
        if (c1243w != null) {
            c1243w.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(c5.r rVar) {
        C2033C c2033c;
        Object obj;
        String str;
        Object value = s3().d().getValue();
        AbstractC3292y.f(value);
        ArrayList t02 = ((C2043h) value).t0();
        Integer num = null;
        if (t02 != null) {
            Iterator it = t02.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String a9 = ((C2033C) obj).a();
                    if (rVar != null) {
                        str = rVar.w();
                    } else {
                        str = null;
                    }
                    if (AbstractC3292y.d(a9, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c2033c = (C2033C) obj;
        } else {
            c2033c = null;
        }
        Object value2 = s3().d().getValue();
        AbstractC3292y.f(value2);
        ArrayList t03 = ((C2043h) value2).t0();
        if (t03 != null) {
            num = Integer.valueOf(AbstractC1435t.r0(t03, c2033c));
        }
        if (c2033c != null && num != null) {
            C1243w c1243w = this.f29975Q;
            if (c1243w != null) {
                c1243w.notifyItemChanged(num.intValue());
                return;
            }
            return;
        }
        F3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T l3(OldVersionsActivity oldVersionsActivity) {
        return T.c(oldVersionsActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m3() {
        Object value = s3().d().getValue();
        AbstractC3292y.f(value);
        C2043h c2043h = (C2043h) value;
        C2041f c2041f = (C2041f) s3().c().getValue();
        e eVar = this.f29976R;
        Object value2 = s3().d().getValue();
        AbstractC3292y.f(value2);
        this.f29975Q = new C1243w(c2043h, c2041f, this, eVar, ((C2043h) value2).V0());
    }

    private final void n3(final String str, final String str2) {
        String string = getString(R.string.msg_warning_old_versions);
        AbstractC3292y.h(string, "getString(...)");
        T1(string, new Function0() { // from class: F4.c3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I o32;
                o32 = OldVersionsActivity.o3(OldVersionsActivity.this, str2, str);
                return o32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I o3(OldVersionsActivity oldVersionsActivity, String str, String str2) {
        SettingsPreferences.f30529b.u0(oldVersionsActivity, str);
        oldVersionsActivity.E3(str2);
        return Q5.I.f8786a;
    }

    private final void p3(c5.r rVar) {
        Object value = s3().d().getValue();
        AbstractC3292y.f(value);
        rVar.a((C2043h) value);
        int l02 = rVar.l0(this);
        if (l02 >= 0) {
            I2(this, l02);
            return;
        }
        Toast.makeText(this, getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T q3() {
        return (T) this.f29973O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r3() {
        s3().l(true);
        if (s3().d().getValue() != null) {
            s3().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r s3() {
        return (r) this.f29974P.getValue();
    }

    private final void t3() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_old_versions);
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
            }
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.d3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OldVersionsActivity.u3(OldVersionsActivity.this, view);
                }
            });
        }
        TextView textView = (TextView) findViewById(R.id.tv_toolbar_old_versions);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        q3().f12408e.setTypeface(aVar.v());
        q3().f12406c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        q3().f12406c.setItemAnimator(null);
        q3().f12406c.addItemDecoration(new s5.m((int) getResources().getDimension(R.dimen.margin_m), (int) getResources().getDimension(R.dimen.margin_xl)));
        q3().f12405b.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.e3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OldVersionsActivity.v3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(OldVersionsActivity oldVersionsActivity, View view) {
        oldVersionsActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(View view) {
    }

    private final boolean x3(String str, long j8) {
        PackageManager packageManager = getPackageManager();
        try {
            AbstractC3292y.f(packageManager);
            if (j8 >= new S4.f().m(S4.r.d(packageManager, str, 128))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final Object H3(String str, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new k(str, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        setContentView(q3().getRoot());
        s3().k(true);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                q6.w c8 = s3().c();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, C2041f.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                }
                c8.setValue(parcelable3);
            }
            if (extras.containsKey("appInfo")) {
                q6.w d8 = s3().d();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C2043h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                d8.setValue(parcelable);
            }
        }
        t3();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        r3();
    }

    public final void w3(String packageName) {
        AbstractC3292y.i(packageName, "packageName");
        s3().j(this, packageName);
    }

    public final void y3(int i8) {
        Q q8;
        Object value = s3().d().getValue();
        AbstractC3292y.f(value);
        if (((C2043h) value).t0() != null) {
            Object value2 = s3().d().getValue();
            AbstractC3292y.f(value2);
            ArrayList t02 = ((C2043h) value2).t0();
            AbstractC3292y.f(t02);
            if (i8 < t02.size()) {
                Object value3 = s3().d().getValue();
                AbstractC3292y.f(value3);
                ArrayList t03 = ((C2043h) value3).t0();
                AbstractC3292y.f(t03);
                long l8 = ((C2033C) t03.get(i8)).l();
                if (s3().c().getValue() != null) {
                    Object value4 = s3().c().getValue();
                    AbstractC3292y.f(value4);
                    if (l8 == ((C2041f) value4).f0()) {
                        Y y8 = Y.f34578a;
                        String string = getString(R.string.autoupdate_installed_version);
                        AbstractC3292y.h(string, "getString(...)");
                        Object value5 = s3().d().getValue();
                        AbstractC3292y.f(value5);
                        ArrayList t04 = ((C2043h) value5).t0();
                        AbstractC3292y.f(t04);
                        String format = String.format(string, Arrays.copyOf(new Object[]{((C2033C) t04.get(i8)).p()}, 1));
                        AbstractC3292y.h(format, "format(...)");
                        Toast.makeText(this, format, 1).show();
                        return;
                    }
                }
                C3791p.a aVar = C3791p.f37286s;
                Context applicationContext = getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                C3791p a9 = aVar.a(applicationContext);
                a9.a();
                Object value6 = s3().d().getValue();
                AbstractC3292y.f(value6);
                ArrayList t05 = ((C2043h) value6).t0();
                AbstractC3292y.f(t05);
                String a10 = ((C2033C) t05.get(i8)).a();
                AbstractC3292y.f(a10);
                c5.r Z8 = a9.Z(a10);
                if (Z8 != null) {
                    int Z9 = Z8.Z();
                    if (1 <= Z9 && Z9 < 100) {
                        if (Z8.X() != null) {
                            C3776a c3776a = new C3776a();
                            Context applicationContext2 = getApplicationContext();
                            AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                            c3776a.a(applicationContext2, Z8.X());
                        }
                    } else if (Z8.Z() == 100) {
                        Object value7 = s3().d().getValue();
                        AbstractC3292y.f(value7);
                        String v02 = ((C2043h) value7).v0();
                        AbstractC3292y.f(v02);
                        long e02 = Z8.e0();
                        String X8 = Z8.X();
                        AbstractC3292y.f(X8);
                        B3(v02, e02, X8);
                    } else {
                        Z8.n0(this);
                        C1243w c1243w = this.f29975Q;
                        if (c1243w != null) {
                            c1243w.notifyItemChanged(i8);
                        }
                    }
                } else {
                    Object value8 = s3().d().getValue();
                    AbstractC3292y.f(value8);
                    if (((C2043h) value8).v0() != null) {
                        Object value9 = s3().d().getValue();
                        AbstractC3292y.f(value9);
                        String v03 = ((C2043h) value9).v0();
                        AbstractC3292y.f(v03);
                        q8 = a9.s0(v03);
                    } else {
                        q8 = null;
                    }
                    if (q8 != null && q8.u() == 100) {
                        long w8 = q8.w();
                        Object value10 = s3().d().getValue();
                        AbstractC3292y.f(value10);
                        ArrayList t06 = ((C2043h) value10).t0();
                        AbstractC3292y.f(t06);
                        if (w8 == ((C2033C) t06.get(i8)).l()) {
                            Object value11 = s3().d().getValue();
                            AbstractC3292y.f(value11);
                            String v04 = ((C2043h) value11).v0();
                            AbstractC3292y.f(v04);
                            long w9 = q8.w();
                            String l9 = q8.l();
                            AbstractC3292y.f(l9);
                            C3(v04, w9, l9);
                        }
                    }
                    File f8 = new C3794s().f(this);
                    C3776a c3776a2 = new C3776a();
                    long k8 = new C3794s().k(this, f8);
                    Object value12 = s3().d().getValue();
                    AbstractC3292y.f(value12);
                    ArrayList t07 = ((C2043h) value12).t0();
                    AbstractC3292y.f(t07);
                    if (c3776a2.c(k8, ((C2033C) t07.get(i8)).i())) {
                        c5.r rVar = new c5.r();
                        Object value13 = s3().d().getValue();
                        AbstractC3292y.f(value13);
                        ArrayList t08 = ((C2043h) value13).t0();
                        AbstractC3292y.f(t08);
                        rVar.w0(((C2033C) t08.get(i8)).a());
                        Object value14 = s3().d().getValue();
                        AbstractC3292y.f(value14);
                        ArrayList t09 = ((C2043h) value14).t0();
                        AbstractC3292y.f(t09);
                        rVar.J0(((C2033C) t09.get(i8)).l());
                        Object value15 = s3().d().getValue();
                        AbstractC3292y.f(value15);
                        ArrayList t010 = ((C2043h) value15).t0();
                        AbstractC3292y.f(t010);
                        rVar.G0(((C2033C) t010.get(i8)).i());
                        p3(rVar);
                        C1243w c1243w2 = this.f29975Q;
                        if (c1243w2 != null) {
                            c1243w2.notifyItemChanged(i8);
                        }
                    } else {
                        String string2 = getString(R.string.error_not_enough_space);
                        AbstractC3292y.h(string2, "getString(...)");
                        Z1(string2);
                    }
                }
                a9.i();
            }
        }
    }

    public final void z3(int i8) {
        C2033C c2033c;
        Object value = s3().d().getValue();
        AbstractC3292y.f(value);
        if (((C2043h) value).t0() != null) {
            Object value2 = s3().d().getValue();
            AbstractC3292y.f(value2);
            ArrayList t02 = ((C2043h) value2).t0();
            AbstractC3292y.f(t02);
            if (i8 < t02.size()) {
                Object value3 = s3().d().getValue();
                AbstractC3292y.f(value3);
                ArrayList t03 = ((C2043h) value3).t0();
                if (t03 != null) {
                    c2033c = (C2033C) t03.get(i8);
                } else {
                    c2033c = null;
                }
                AbstractC3292y.f(c2033c);
                A3(c2033c);
            }
        }
    }
}
