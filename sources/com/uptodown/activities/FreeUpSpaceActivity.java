package com.uptodown.activities;

import I4.C1230i;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
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
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.C2694d;
import com.uptodown.activities.FreeUpSpaceActivity;
import java.util.ArrayList;
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
public final class FreeUpSpaceActivity extends AbstractActivityC2691a {

    /* renamed from: Q, reason: collision with root package name */
    private C1230i f29510Q;

    /* renamed from: R, reason: collision with root package name */
    private C2043h f29511R;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f29508O = Q5.l.b(new Function0() { // from class: F4.K
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.A i32;
            i32 = FreeUpSpaceActivity.i3(FreeUpSpaceActivity.this);
            return i32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f29509P = new ViewModelLazy(U.b(C2694d.class), new e(this), new d(this), new f(null, this));

    /* renamed from: S, reason: collision with root package name */
    private final a f29512S = new a();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1978b {
        a() {
        }

        @Override // b5.InterfaceC1978b
        public void a(int i8) {
            C1230i c1230i;
            ArrayList a9;
            C2041f c2041f;
            String Q8;
            if (UptodownApp.f29249C.a0() && (c1230i = FreeUpSpaceActivity.this.f29510Q) != null && (a9 = c1230i.a()) != null && (c2041f = (C2041f) a9.get(i8)) != null && (Q8 = c2041f.Q()) != null) {
                new J4.i(FreeUpSpaceActivity.this).h(Q8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29514a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29516c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29517d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, U5.d dVar) {
            super(2, dVar);
            this.f29516c = str;
            this.f29517d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f29516c, this.f29517d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:            if (r0.equals("app_updated") != false) goto L23;     */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:            r3.f29515b.q3(false);     */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:            if (r0.equals("app_installed") == false) goto L24;     */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                V5.b.e()
                int r0 = r3.f29514a
                if (r0 != 0) goto L70
                Q5.t.b(r4)
                com.uptodown.activities.FreeUpSpaceActivity r4 = com.uptodown.activities.FreeUpSpaceActivity.this
                java.lang.String r0 = r3.f29516c
                int r4 = com.uptodown.activities.FreeUpSpaceActivity.c3(r4, r0)
                if (r4 < 0) goto L68
                java.lang.String r0 = r3.f29517d
                int r1 = r0.hashCode()
                r2 = -1972881700(0xffffffff8a6836dc, float:-1.11807116E-32)
                if (r1 == r2) goto L59
                r2 = -1487908707(0xffffffffa750509d, float:-2.89095E-15)
                if (r1 == r2) goto L50
                r2 = 389690339(0x173a33e3, float:6.016533E-25)
                if (r1 == r2) goto L2a
                goto L68
            L2a:
                java.lang.String r1 = "app_uninstalled"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L33
                goto L68
            L33:
                com.uptodown.activities.FreeUpSpaceActivity r0 = com.uptodown.activities.FreeUpSpaceActivity.this
                I4.i r0 = com.uptodown.activities.FreeUpSpaceActivity.b3(r0)
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                java.util.ArrayList r0 = r0.a()
                r0.remove(r4)
                com.uptodown.activities.FreeUpSpaceActivity r0 = com.uptodown.activities.FreeUpSpaceActivity.this
                I4.i r0 = com.uptodown.activities.FreeUpSpaceActivity.b3(r0)
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                r0.notifyItemRemoved(r4)
                goto L68
            L50:
                java.lang.String r4 = "app_updated"
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L68
                goto L62
            L59:
                java.lang.String r4 = "app_installed"
                boolean r4 = r0.equals(r4)
                if (r4 != 0) goto L62
                goto L68
            L62:
                com.uptodown.activities.FreeUpSpaceActivity r4 = com.uptodown.activities.FreeUpSpaceActivity.this
                r0 = 0
                com.uptodown.activities.FreeUpSpaceActivity.f3(r4, r0)
            L68:
                com.uptodown.activities.FreeUpSpaceActivity r4 = com.uptodown.activities.FreeUpSpaceActivity.this
                com.uptodown.activities.FreeUpSpaceActivity.g3(r4)
                Q5.I r4 = Q5.I.f8786a
                return r4
            L70:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.FreeUpSpaceActivity.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29518a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FreeUpSpaceActivity f29520a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.activities.FreeUpSpaceActivity$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0695a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f29521a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FreeUpSpaceActivity f29522b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0695a(FreeUpSpaceActivity freeUpSpaceActivity, U5.d dVar) {
                    super(2, dVar);
                    this.f29522b = freeUpSpaceActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0695a(this.f29522b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f29521a == 0) {
                        Q5.t.b(obj);
                        this.f29522b.l3().f12071c.f12236b.setVisibility(0);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(n6.M m8, U5.d dVar) {
                    return ((C0695a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f29523a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FreeUpSpaceActivity f29524b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC3768A f29525c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(FreeUpSpaceActivity freeUpSpaceActivity, AbstractC3768A abstractC3768A, U5.d dVar) {
                    super(2, dVar);
                    this.f29524b = freeUpSpaceActivity;
                    this.f29525c = abstractC3768A;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new b(this.f29524b, this.f29525c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f29523a == 0) {
                        Q5.t.b(obj);
                        this.f29524b.l3().f12071c.f12236b.setVisibility(8);
                        this.f29524b.s3(((C2694d.a) ((AbstractC3768A.c) this.f29525c).a()).a());
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(n6.M m8, U5.d dVar) {
                    return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
                }
            }

            a(FreeUpSpaceActivity freeUpSpaceActivity) {
                this.f29520a = freeUpSpaceActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    Object g8 = AbstractC3458i.g(C3445b0.c(), new C0695a(this.f29520a, null), dVar);
                    if (g8 == V5.b.e()) {
                        return g8;
                    }
                    return Q5.I.f8786a;
                }
                if (abstractC3768A instanceof AbstractC3768A.c) {
                    Object g9 = AbstractC3458i.g(C3445b0.c(), new b(this.f29520a, abstractC3768A, null), dVar);
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
            int i8 = this.f29518a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L c8 = FreeUpSpaceActivity.this.m3().c();
                a aVar = new a(FreeUpSpaceActivity.this);
                this.f29518a = 1;
                if (c8.collect(aVar, this) == e8) {
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
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29526a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f29526a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29526a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29527a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f29527a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29527a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29528a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29529b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29528a = function0;
            this.f29529b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29528a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29529b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.A i3(FreeUpSpaceActivity freeUpSpaceActivity) {
        return Y4.A.c(freeUpSpaceActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k3(String str) {
        ArrayList arrayList;
        C1230i c1230i = this.f29510Q;
        ArrayList arrayList2 = null;
        if (c1230i != null) {
            arrayList = c1230i.a();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            C1230i c1230i2 = this.f29510Q;
            if (c1230i2 != null) {
                arrayList2 = c1230i2.a();
            }
            AbstractC3292y.f(arrayList2);
            Iterator it = arrayList2.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                if (l6.n.s(((C2041f) it.next()).Q(), str, true)) {
                    return i8;
                }
                i8 = i9;
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y4.A l3() {
        return (Y4.A) this.f29508O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2694d m3() {
        return (C2694d) this.f29509P.getValue();
    }

    private final void n3() {
        setContentView(l3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            l3().f12073e.setNavigationIcon(drawable);
            l3().f12073e.setNavigationContentDescription(getString(R.string.back));
        }
        l3().f12073e.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FreeUpSpaceActivity.o3(FreeUpSpaceActivity.this, view);
            }
        });
        TextView textView = l3().f12074f;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        l3().f12070b.f12177g.setTypeface(aVar.v());
        l3().f12070b.f12178h.setTypeface(aVar.v());
        l3().f12070b.f12176f.setTypeface(aVar.u());
        l3().f12070b.f12176f.setVisibility(8);
        r3();
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        l3().f12072d.addItemDecoration(new s5.m(dimension, dimension));
        l3().f12072d.setLayoutManager(new LinearLayoutManager(this, 1, false));
        l3().f12072d.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) l3().f12072d.getItemAnimator();
        AbstractC3292y.f(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        l3().f12071c.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.M
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FreeUpSpaceActivity.p3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(FreeUpSpaceActivity freeUpSpaceActivity, View view) {
        freeUpSpaceActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q3(boolean z8) {
        m3().b(this, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.FreeUpSpaceActivity.r3():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s3(ArrayList arrayList) {
        C1230i c1230i = this.f29510Q;
        if (c1230i == null) {
            this.f29510Q = new C1230i(arrayList, this, this.f29512S);
            l3().f12072d.setAdapter(this.f29510Q);
        } else {
            AbstractC3292y.f(c1230i);
            c1230i.b(arrayList);
        }
    }

    public final Object j3(String str, String str2, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new b(str2, str, null), dVar);
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
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appInfo")) {
            Intent intent2 = getIntent();
            AbstractC3292y.f(intent2);
            Bundle extras2 = intent2.getExtras();
            AbstractC3292y.f(extras2);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = extras2.getParcelable("appInfo", C2043h.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = extras2.getParcelable("appInfo");
            }
            this.f29511R = (C2043h) parcelable;
        }
        n3();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3292y.i(event, "event");
        if (i8 == 82) {
            l3().f12073e.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        q3(true);
        C3800y.f37330a.g(this);
    }
}
