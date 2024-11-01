package com.uptodown.activities;

import I4.C1222a;
import J4.j;
import Q5.InterfaceC1416k;
import Y4.C1510f;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import b5.InterfaceC1979c;
import c5.C2041f;
import c5.C2055u;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppFilesActivity;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import q5.C3770C;
import q5.C3784i;
import q5.C3788m;
import q5.C3791p;

/* loaded from: classes4.dex */
public final class AppFilesActivity extends AbstractActivityC2691a {

    /* renamed from: Q, reason: collision with root package name */
    private C2041f f29413Q;

    /* renamed from: O, reason: collision with root package name */
    private final LifecycleCoroutineScope f29411O = LifecycleOwnerKt.getLifecycleScope(this);

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f29412P = Q5.l.b(new Function0() { // from class: F4.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C1510f g32;
            g32 = AppFilesActivity.g3(AppFilesActivity.this);
            return g32;
        }
    });

    /* renamed from: R, reason: collision with root package name */
    private a f29414R = new a();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1979c {
        a() {
        }

        @Override // b5.InterfaceC1979c
        public void a(C2055u fileInfo) {
            AbstractC3292y.i(fileInfo, "fileInfo");
            if (UptodownApp.f29249C.a0() && fileInfo.d() != null && !AppFilesActivity.this.isFinishing()) {
                AppFilesActivity.this.l3(fileInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29416a;

        /* renamed from: b, reason: collision with root package name */
        Object f29417b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29418c;

        /* renamed from: e, reason: collision with root package name */
        int f29420e;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29418c = obj;
            this.f29420e |= Integer.MIN_VALUE;
            return AppFilesActivity.this.i3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29421a;

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29421a == 0) {
                Q5.t.b(obj);
                AppFilesActivity.this.h3().f12645c.f12236b.setVisibility(0);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        int f29423a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ArrayList arrayList, U5.d dVar) {
            super(2, dVar);
            this.f29425c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f29425c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29423a == 0) {
                Q5.t.b(obj);
                PackageManager packageManager = AppFilesActivity.this.getPackageManager();
                AbstractC3292y.h(packageManager, "getPackageManager(...)");
                C2041f c2041f = AppFilesActivity.this.f29413Q;
                AbstractC3292y.f(c2041f);
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                ApplicationInfo a9 = S4.r.a(packageManager, Q8, 128);
                File file = new File(a9.sourceDir);
                C2055u c2055u = new C2055u();
                c2055u.f(a9.sourceDir);
                c2055u.h(S4.d.f9430a.e(a9.sourceDir));
                c2055u.i(file.length());
                this.f29425c.add(c2055u);
                C3791p a10 = C3791p.f37286s.a(AppFilesActivity.this);
                a10.a();
                C2041f c2041f2 = AppFilesActivity.this.f29413Q;
                AbstractC3292y.f(c2041f2);
                c2041f2.p0(a9, a10);
                C2041f c2041f3 = AppFilesActivity.this.f29413Q;
                AbstractC3292y.f(c2041f3);
                if (c2041f3.b0() != null) {
                    ArrayList arrayList = this.f29425c;
                    C2041f c2041f4 = AppFilesActivity.this.f29413Q;
                    AbstractC3292y.f(c2041f4);
                    ArrayList b02 = c2041f4.b0();
                    AbstractC3292y.f(b02);
                    arrayList.addAll(b02);
                }
                C2041f c2041f5 = AppFilesActivity.this.f29413Q;
                AbstractC3292y.f(c2041f5);
                c2041f5.o0(a10);
                C2041f c2041f6 = AppFilesActivity.this.f29413Q;
                AbstractC3292y.f(c2041f6);
                if (c2041f6.I() != null) {
                    ArrayList arrayList2 = this.f29425c;
                    C2041f c2041f7 = AppFilesActivity.this.f29413Q;
                    AbstractC3292y.f(c2041f7);
                    ArrayList I8 = c2041f7.I();
                    AbstractC3292y.f(I8);
                    arrayList2.addAll(I8);
                }
                a10.i();
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29426a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ArrayList arrayList, U5.d dVar) {
            super(2, dVar);
            this.f29428c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f29428c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29426a == 0) {
                Q5.t.b(obj);
                AppFilesActivity.this.h3().f12647e.setAdapter(new C1222a(this.f29428c, AppFilesActivity.this.f29414R));
                AppFilesActivity.this.h3().f12645c.f12236b.setVisibility(8);
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
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29429a;

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
            int i8 = this.f29429a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                AppFilesActivity appFilesActivity = AppFilesActivity.this;
                this.f29429a = 1;
                if (appFilesActivity.i3(this) == e8) {
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
    public static final class g implements b5.J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2055u f29432b;

        g(C2055u c2055u) {
            this.f29432b = c2055u;
        }

        @Override // b5.J
        public void a() {
            if (this.f29432b.d() != null && !AppFilesActivity.this.isFinishing()) {
                C3788m c3788m = new C3788m();
                AppFilesActivity appFilesActivity = AppFilesActivity.this;
                C3784i c3784i = new C3784i();
                String d8 = this.f29432b.d();
                AbstractC3292y.f(d8);
                c3788m.q(appFilesActivity, c3784i.s(d8), AppFilesActivity.this.getString(R.string.virustotal_safety_report_title));
            }
        }

        @Override // b5.J
        public void b(c5.J reportVT) {
            AbstractC3292y.i(reportVT, "reportVT");
            Intent intent = new Intent(AppFilesActivity.this, (Class<?>) VirusTotalReport.class);
            intent.putExtra("app_selected", AppFilesActivity.this.f29413Q);
            intent.putExtra("appReportVT", reportVT);
            AppFilesActivity appFilesActivity = AppFilesActivity.this;
            appFilesActivity.startActivity(intent, UptodownApp.f29249C.a(appFilesActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1510f g3(AppFilesActivity appFilesActivity) {
        return C1510f.c(appFilesActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1510f h3() {
        return (C1510f) this.f29412P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i3(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.uptodown.activities.AppFilesActivity.b
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.activities.AppFilesActivity$b r0 = (com.uptodown.activities.AppFilesActivity.b) r0
            int r1 = r0.f29420e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29420e = r1
            goto L18
        L13:
            com.uptodown.activities.AppFilesActivity$b r0 = new com.uptodown.activities.AppFilesActivity$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29418c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f29420e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            Q5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f29417b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r4 = r0.f29416a
            com.uptodown.activities.AppFilesActivity r4 = (com.uptodown.activities.AppFilesActivity) r4
            Q5.t.b(r9)
            goto L87
        L44:
            java.lang.Object r2 = r0.f29417b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r5 = r0.f29416a
            com.uptodown.activities.AppFilesActivity r5 = (com.uptodown.activities.AppFilesActivity) r5
            Q5.t.b(r9)
            goto L70
        L50:
            Q5.t.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            n6.J0 r2 = n6.C3445b0.c()
            com.uptodown.activities.AppFilesActivity$c r7 = new com.uptodown.activities.AppFilesActivity$c
            r7.<init>(r6)
            r0.f29416a = r8
            r0.f29417b = r9
            r0.f29420e = r5
            java.lang.Object r2 = n6.AbstractC3458i.g(r2, r7, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r2 = r9
        L70:
            n6.I r9 = n6.C3445b0.b()
            com.uptodown.activities.AppFilesActivity$d r7 = new com.uptodown.activities.AppFilesActivity$d
            r7.<init>(r2, r6)
            r0.f29416a = r5
            r0.f29417b = r2
            r0.f29420e = r4
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r7, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r4 = r5
        L87:
            n6.J0 r9 = n6.C3445b0.c()
            com.uptodown.activities.AppFilesActivity$e r5 = new com.uptodown.activities.AppFilesActivity$e
            r5.<init>(r2, r6)
            r0.f29416a = r6
            r0.f29417b = r6
            r0.f29420e = r3
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r5, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            Q5.I r9 = Q5.I.f8786a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppFilesActivity.i3(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(AppFilesActivity appFilesActivity, View view) {
        if (UptodownApp.f29249C.a0()) {
            appFilesActivity.getOnBackPressedDispatcher().onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l3(C2055u c2055u) {
        if (UptodownApp.f29249C.a0() && !isFinishing()) {
            new X4.m(this, null, c2055u.d(), new g(c2055u), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    private final void m3() {
        C3770C c3770c = C3770C.f37260a;
        C2041f c2041f = this.f29413Q;
        AbstractC3292y.f(c2041f);
        h3().f12644b.setImageDrawable(c3770c.i(this, c2041f.Q()));
        TextView textView = h3().f12649g;
        C2041f c2041f2 = this.f29413Q;
        AbstractC3292y.f(c2041f2);
        textView.setText(c2041f2.z());
        TextView textView2 = h3().f12649g;
        j.a aVar = J4.j.f4395g;
        textView2.setTypeface(aVar.u());
        TextView textView3 = h3().f12650h;
        C2041f c2041f3 = this.f29413Q;
        AbstractC3292y.f(c2041f3);
        textView3.setText(c2041f3.h0());
        h3().f12650h.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        try {
            setContentView(h3().getRoot());
            Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appInstalled")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInstalled", C2041f.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInstalled");
                }
                this.f29413Q = (C2041f) parcelable;
            }
            C1510f h32 = h3();
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                h32.f12648f.setNavigationIcon(drawable);
                h32.f12648f.setNavigationContentDescription(getString(R.string.back));
            }
            h32.f12648f.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppFilesActivity.j3(AppFilesActivity.this, view);
                }
            });
            h32.f12651i.setTypeface(J4.j.f4395g.v());
            h32.f12645c.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppFilesActivity.k3(view);
                }
            });
            h32.f12647e.setLayoutManager(new LinearLayoutManager(this, 1, false));
            h32.f12647e.setItemAnimator(new DefaultItemAnimator());
            h32.f12647e.addItemDecoration(new S4.t((int) getResources().getDimension(R.dimen.margin_m)));
            if (this.f29413Q != null) {
                m3();
                AbstractC3462k.d(this.f29411O, null, null, new f(null), 3, null);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
