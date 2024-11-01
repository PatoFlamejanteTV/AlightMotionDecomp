package com.uptodown.activities;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1980d;
import c5.C2034D;
import c5.C2043h;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3788m;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class OrganizationActivity extends AbstractActivityC2691a {

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30000O = Q5.l.b(new Function0() { // from class: F4.m3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.U l32;
            l32 = OrganizationActivity.l3(OrganizationActivity.this);
            return l32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30001P = new ViewModelLazy(U.b(t.class), new d(this), new c(this), new e(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private I4.x f30002Q;

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1980d {
        a() {
        }

        @Override // b5.InterfaceC1980d
        public void a(C2043h app) {
            AbstractC3292y.i(app, "app");
            if (UptodownApp.f29249C.a0()) {
                OrganizationActivity.this.C2(app.h());
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30004a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OrganizationActivity f30006a;

            a(OrganizationActivity organizationActivity) {
                this.f30006a = organizationActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    if (this.f30006a.f30002Q == null) {
                        this.f30006a.n3().f12416g.f12236b.setVisibility(0);
                    }
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    if (!((t.a) cVar.a()).a()) {
                        this.f30006a.p3(((t.a) cVar.a()).b());
                        this.f30006a.m3(((t.a) cVar.a()).b());
                    } else {
                        I4.x xVar = this.f30006a.f30002Q;
                        AbstractC3292y.f(xVar);
                        xVar.a(((t.a) cVar.a()).b().i());
                    }
                    this.f30006a.n3().f12416g.f12236b.setVisibility(8);
                    this.f30006a.n3().f12420k.setVisibility(0);
                    I4.x xVar2 = this.f30006a.f30002Q;
                    if (xVar2 != null) {
                        xVar2.c(false);
                    }
                } else if (AbstractC3292y.d(abstractC3768A, AbstractC3768A.b.f37254a)) {
                    I4.x xVar3 = this.f30006a.f30002Q;
                    if (xVar3 != null) {
                        xVar3.c(false);
                    }
                } else {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
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
            int i8 = this.f30004a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L h8 = OrganizationActivity.this.o3().h();
                a aVar = new a(OrganizationActivity.this);
                this.f30004a = 1;
                if (h8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30007a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f30007a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30007a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f30008a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30008a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30009a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30009a = function0;
            this.f30010b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30009a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30010b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30011a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.r f30012b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrganizationActivity f30013c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c5.r rVar, OrganizationActivity organizationActivity, U5.d dVar) {
            super(2, dVar);
            this.f30012b = rVar;
            this.f30013c = organizationActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f30012b, this.f30013c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String Y8;
            V5.b.e();
            if (this.f30011a == 0) {
                Q5.t.b(obj);
                c5.r rVar = this.f30012b;
                if (rVar != null && (Y8 = rVar.Y()) != null && Y8.length() != 0 && this.f30013c.f30002Q != null) {
                    I4.x xVar = this.f30013c.f30002Q;
                    AbstractC3292y.f(xVar);
                    String Y9 = this.f30012b.Y();
                    AbstractC3292y.f(Y9);
                    RecyclerView rvOrganization = this.f30013c.n3().f12419j;
                    AbstractC3292y.h(rvOrganization, "rvOrganization");
                    xVar.d(Y9, rvOrganization);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.U l3(OrganizationActivity organizationActivity) {
        return Y4.U.c(organizationActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m3(C2034D c2034d) {
        String j8;
        if (this.f30002Q == null && (j8 = c2034d.j()) != null && j8.length() != 0) {
            a aVar = new a();
            String j9 = c2034d.j();
            AbstractC3292y.f(j9);
            this.f30002Q = new I4.x(aVar, j9);
            n3().f12419j.setAdapter(this.f30002Q);
        }
        I4.x xVar = this.f30002Q;
        if (xVar != null) {
            xVar.b(c2034d.h(), c2034d.f(), c2034d.b(), c2034d.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y4.U n3() {
        return (Y4.U) this.f30000O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t o3() {
        return (t) this.f30001P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p3(final C2034D c2034d) {
        String a9;
        String e8;
        if (!o3().l()) {
            final Y4.U n32 = n3();
            n32.f12425p.setText(c2034d.j());
            String c8 = c2034d.c();
            if (c8 != null && c8.length() != 0 && (a9 = c2034d.a()) != null && a9.length() != 0 && (e8 = c2034d.e()) != null && e8.length() != 0) {
                String c9 = c2034d.c();
                if (c9 != null && c9.length() != 0) {
                    com.squareup.picasso.s.h().l(c2034d.d()).n(UptodownApp.f29249C.e0(this)).i(n32.f12411b);
                }
                String e9 = c2034d.e();
                if (e9 != null && e9.length() != 0) {
                    com.squareup.picasso.s.h().l(c2034d.e()).n(UptodownApp.f29249C.f0(this)).i(n32.f12413d);
                }
                TextView textView = n32.f12423n;
                j.a aVar = J4.j.f4395g;
                textView.setTypeface(aVar.u());
                n32.f12423n.setText(c2034d.j());
                n32.f12426q.setTypeface(aVar.u());
                n32.f12426q.setOnClickListener(new View.OnClickListener() { // from class: F4.h3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OrganizationActivity.q3(C2034D.this, this, view);
                    }
                });
                String l8 = c2034d.l();
                if (l8 != null && l8.length() != 0) {
                    n32.f12415f.setVisibility(0);
                    n32.f12415f.setOnClickListener(new View.OnClickListener() { // from class: F4.i3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OrganizationActivity.r3(OrganizationActivity.this, c2034d, view);
                        }
                    });
                }
                String g8 = c2034d.g();
                if (g8 != null && g8.length() != 0) {
                    n32.f12412c.setVisibility(0);
                    n32.f12412c.setOnClickListener(new View.OnClickListener() { // from class: F4.j3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OrganizationActivity.s3(OrganizationActivity.this, c2034d, view);
                        }
                    });
                }
                String k8 = c2034d.k();
                if (k8 != null && k8.length() != 0) {
                    n32.f12414e.setVisibility(0);
                    n32.f12414e.setOnClickListener(new View.OnClickListener() { // from class: F4.k3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OrganizationActivity.t3(OrganizationActivity.this, c2034d, view);
                        }
                    });
                }
                n32.f12422m.setTypeface(aVar.v());
                n32.f12422m.setText(c2034d.a());
                n32.f12424o.setTypeface(aVar.u());
                n32.f12424o.setOnClickListener(new View.OnClickListener() { // from class: F4.l3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OrganizationActivity.u3(C2034D.this, n32, view);
                    }
                });
            } else {
                n3().f12418i.setVisibility(8);
            }
            o3().o(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(C2034D c2034d, OrganizationActivity organizationActivity, View view) {
        if (c2034d.m() != null) {
            C3788m c3788m = new C3788m();
            String m8 = c2034d.m();
            AbstractC3292y.f(m8);
            c3788m.q(organizationActivity, m8, c2034d.j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(OrganizationActivity organizationActivity, C2034D c2034d, View view) {
        if (!organizationActivity.isFinishing()) {
            C3788m c3788m = new C3788m();
            String l8 = c2034d.l();
            AbstractC3292y.f(l8);
            C3788m.r(c3788m, organizationActivity, l8, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(OrganizationActivity organizationActivity, C2034D c2034d, View view) {
        if (!organizationActivity.isFinishing()) {
            C3788m c3788m = new C3788m();
            String g8 = c2034d.g();
            AbstractC3292y.f(g8);
            C3788m.r(c3788m, organizationActivity, g8, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(OrganizationActivity organizationActivity, C2034D c2034d, View view) {
        if (!organizationActivity.isFinishing()) {
            C3788m c3788m = new C3788m();
            String k8 = c2034d.k();
            AbstractC3292y.f(k8);
            C3788m.r(c3788m, organizationActivity, k8, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(C2034D c2034d, Y4.U u8, View view) {
        String a9 = c2034d.a();
        if (a9 != null && a9.length() != 0) {
            if (u8.f12427r.getVisibility() == 0) {
                u8.f12424o.setText(R.string.read_less_desc_app_detail);
                u8.f12427r.setVisibility(8);
                u8.f12422m.setMaxLines(Integer.MAX_VALUE);
                u8.f12422m.setEllipsize(null);
                return;
            }
            u8.f12424o.setText(R.string.read_more_desc_app_detail);
            u8.f12427r.setVisibility(0);
            u8.f12422m.setMaxLines(6);
            u8.f12422m.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    private final void v3() {
        setContentView(n3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        final Y4.U n32 = n3();
        if (drawable != null) {
            n32.f12421l.setNavigationIcon(drawable);
            n32.f12421l.setNavigationContentDescription(getString(R.string.back));
        }
        n32.f12421l.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.f3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrganizationActivity.w3(OrganizationActivity.this, view);
            }
        });
        n32.f12425p.setTypeface(J4.j.f4395g.u());
        n32.f12419j.setLayoutManager(new LinearLayoutManager(this, 1, false));
        n32.f12419j.setItemAnimator(null);
        if (((CharSequence) o3().k().getValue()).length() > 0) {
            n32.f12425p.setText((CharSequence) o3().k().getValue());
        }
        n32.f12420k.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: F4.g3
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                OrganizationActivity.x3(OrganizationActivity.this, n32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(OrganizationActivity organizationActivity, View view) {
        organizationActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(OrganizationActivity organizationActivity, Y4.U u8) {
        if (!organizationActivity.o3().i() && !organizationActivity.o3().g()) {
            ScrollView scrollView = u8.f12420k;
            if (scrollView.getChildAt(scrollView.getChildCount() - 1).getBottom() - (u8.f12420k.getHeight() + u8.f12420k.getScrollY()) <= 0 && !organizationActivity.o3().i() && !organizationActivity.o3().g()) {
                I4.x xVar = organizationActivity.f30002Q;
                if (xVar != null) {
                    xVar.c(true);
                }
                organizationActivity.z3();
            }
        }
    }

    private final void y3() {
        o3().e(this);
    }

    private final void z3() {
        o3().f(this);
    }

    public final void A3(c5.r rVar) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new f(rVar, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("organizationID")) {
                o3().j().setValue(Long.valueOf(extras.getLong("organizationID")));
            }
            if (extras.containsKey("organizationName")) {
                q6.w k8 = o3().k();
                String string = extras.getString("organizationName");
                AbstractC3292y.f(string);
                k8.setValue(string);
            }
        }
        v3();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new b(null), 2, null);
        y3();
    }
}
