package com.uptodown.activities;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.C1523m;
import Y4.C1530u;
import Y4.p0;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c5.T;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.A;
import com.uptodown.activities.UpcomingReleasesActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
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
public final class UpcomingReleasesActivity extends AbstractActivityC2691a {

    /* renamed from: W, reason: collision with root package name */
    public static final a f30162W = new a(null);

    /* renamed from: Q, reason: collision with root package name */
    private I4.M f30165Q;

    /* renamed from: T, reason: collision with root package name */
    private boolean f30168T;

    /* renamed from: V, reason: collision with root package name */
    private final ActivityResultLauncher f30170V;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30163O = new ViewModelLazy(U.b(A.class), new f(this), new e(this), new g(null, this));

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30164P = Q5.l.b(new Function0() { // from class: F4.r4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.p0 w32;
            w32 = UpcomingReleasesActivity.w3(UpcomingReleasesActivity.this);
            return w32;
        }
    });

    /* renamed from: R, reason: collision with root package name */
    private A.a f30166R = A.a.f29348b;

    /* renamed from: S, reason: collision with root package name */
    private boolean f30167S = true;

    /* renamed from: U, reason: collision with root package name */
    private final h f30169U = new h();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3292y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !UpcomingReleasesActivity.this.D3().l() && !UpcomingReleasesActivity.this.D3().j() && recyclerView.getLayoutManager() != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                AbstractC3292y.f(layoutManager);
                int childCount = layoutManager.getChildCount();
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                AbstractC3292y.f(layoutManager2);
                int itemCount = layoutManager2.getItemCount();
                RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                AbstractC3292y.f(layoutManager3);
                if (childCount + ((LinearLayoutManager) layoutManager3).findFirstVisibleItemPosition() >= itemCount - 10) {
                    I4.M m8 = UpcomingReleasesActivity.this.f30165Q;
                    if (m8 != null) {
                        m8.e(true);
                    }
                    A D32 = UpcomingReleasesActivity.this.D3();
                    UpcomingReleasesActivity upcomingReleasesActivity = UpcomingReleasesActivity.this;
                    D32.i(upcomingReleasesActivity, upcomingReleasesActivity.f30166R, UpcomingReleasesActivity.this.f30167S);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30172a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UpcomingReleasesActivity f30174a;

            a(UpcomingReleasesActivity upcomingReleasesActivity) {
                this.f30174a = upcomingReleasesActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f30174a.C3().f12891c.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    this.f30174a.z3(((A.b) cVar.a()).b(), ((A.b) cVar.a()).a());
                    if (((A.b) cVar.a()).b().isEmpty() && ((A.b) cVar.a()).a().isEmpty()) {
                        this.f30174a.C3().f12897i.setVisibility(0);
                    }
                    I4.M m8 = this.f30174a.f30165Q;
                    if (m8 != null) {
                        m8.e(false);
                    }
                    this.f30174a.C3().f12891c.f12236b.setVisibility(8);
                    this.f30174a.C3().f12890b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.b) {
                    I4.M m9 = this.f30174a.f30165Q;
                    if (m9 != null) {
                        m9.e(false);
                    }
                } else {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
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
            int i8 = this.f30172a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L k8 = UpcomingReleasesActivity.this.D3().k();
                a aVar = new a(UpcomingReleasesActivity.this);
                this.f30172a = 1;
                if (k8.collect(aVar, this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30175a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.G f30177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c5.G g8, U5.d dVar) {
            super(2, dVar);
            this.f30177c = g8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f30177c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30175a == 0) {
                Q5.t.b(obj);
                UpcomingReleasesActivity.this.x3(this.f30177c);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30178a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f30178a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30178a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f30179a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30179a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30180a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30180a = function0;
            this.f30181b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30180a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30181b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements b5.I {

        /* loaded from: classes4.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30183a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UpcomingReleasesActivity f30184b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c5.G f30185c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UpcomingReleasesActivity upcomingReleasesActivity, c5.G g8, U5.d dVar) {
                super(2, dVar);
                this.f30184b = upcomingReleasesActivity;
                this.f30185c = g8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f30184b, this.f30185c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30183a == 0) {
                    Q5.t.b(obj);
                    this.f30184b.L3(this.f30185c);
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        h() {
        }

        @Override // b5.I
        public void a(int i8) {
            if (UptodownApp.f29249C.a0() && UpcomingReleasesActivity.this.f30165Q != null) {
                AbstractC3292y.f(UpcomingReleasesActivity.this.f30165Q);
                if (!r0.b().isEmpty()) {
                    I4.M m8 = UpcomingReleasesActivity.this.f30165Q;
                    AbstractC3292y.f(m8);
                    if (m8.b().get(i8) instanceof c5.G) {
                        I4.M m9 = UpcomingReleasesActivity.this.f30165Q;
                        AbstractC3292y.f(m9);
                        Object obj = m9.b().get(i8);
                        AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
                        UpcomingReleasesActivity.this.C2(((c5.G) obj).b());
                    }
                }
            }
        }

        @Override // b5.I
        public void e(int i8) {
            if (UptodownApp.f29249C.a0()) {
                if (T.f15689k.e(UpcomingReleasesActivity.this) == null) {
                    UpcomingReleasesActivity.this.S3();
                    return;
                }
                I4.M m8 = UpcomingReleasesActivity.this.f30165Q;
                AbstractC3292y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
                c5.G g8 = (c5.G) obj;
                if (((ArrayList) UpcomingReleasesActivity.this.D3().o().getValue()).contains(g8)) {
                    UpcomingReleasesActivity.this.O3(g8);
                } else {
                    AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(UpcomingReleasesActivity.this), null, null, new a(UpcomingReleasesActivity.this, g8, null), 3, null);
                }
            }
        }
    }

    public UpcomingReleasesActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.w4
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                UpcomingReleasesActivity.K3(UpcomingReleasesActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f30170V = registerForActivityResult;
    }

    private final void A3(String str) {
        if (o2() != null) {
            AlertDialog o22 = o2();
            AbstractC3292y.f(o22);
            o22.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        C1523m c8 = C1523m.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        TextView textView = c8.f12850d;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        c8.f12849c.setTypeface(aVar.v());
        TextView textView2 = c8.f12849c;
        C3788m c3788m = new C3788m();
        String string = getString(R.string.pre_register_success, str);
        AbstractC3292y.h(string, "getString(...)");
        textView2.setText(c3788m.d(string, str, this));
        c8.f12848b.setTypeface(aVar.u());
        c8.f12848b.setOnClickListener(new View.OnClickListener() { // from class: F4.v4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.B3(UpcomingReleasesActivity.this, view);
            }
        });
        builder.setView(c8.getRoot());
        K2(builder.create());
        if (!isFinishing() && o2() != null) {
            AlertDialog o23 = o2();
            AbstractC3292y.f(o23);
            Window window = o23.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog o24 = o2();
            AbstractC3292y.f(o24);
            o24.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(UpcomingReleasesActivity upcomingReleasesActivity, View view) {
        AlertDialog o22 = upcomingReleasesActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 C3() {
        return (p0) this.f30164P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A D3() {
        return (A) this.f30163O.getValue();
    }

    private final void E3() {
        setContentView(C3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        p0 C32 = C3();
        if (drawable != null) {
            C32.f12895g.setNavigationIcon(drawable);
            C32.f12895g.setNavigationContentDescription(getString(R.string.back));
        }
        C32.f12895g.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.x4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.F3(UpcomingReleasesActivity.this, view);
            }
        });
        TextView textView = C32.f12898j;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        C32.f12894f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        C32.f12894f.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        C3().f12894f.addItemDecoration(new s5.m(dimension, dimension));
        C32.f12897i.setTypeface(aVar.v());
        C32.f12891c.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.y4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.G3(view);
            }
        });
        C32.f12896h.setTypeface(aVar.v());
        C32.f12893e.setOnClickListener(new View.OnClickListener() { // from class: F4.z4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.H3(UpcomingReleasesActivity.this, view);
            }
        });
        C32.f12892d.setOnClickListener(new View.OnClickListener() { // from class: F4.A4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.I3(UpcomingReleasesActivity.this, view);
            }
        });
        C32.f12894f.addOnScrollListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(UpcomingReleasesActivity upcomingReleasesActivity, View view) {
        upcomingReleasesActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(UpcomingReleasesActivity upcomingReleasesActivity, View view) {
        A.a aVar = upcomingReleasesActivity.f30166R;
        A.a aVar2 = A.a.f29347a;
        if (aVar != aVar2) {
            upcomingReleasesActivity.f30166R = aVar2;
        } else {
            upcomingReleasesActivity.f30167S = !upcomingReleasesActivity.f30167S;
        }
        upcomingReleasesActivity.N3();
        upcomingReleasesActivity.D3().r(false);
        upcomingReleasesActivity.J3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(UpcomingReleasesActivity upcomingReleasesActivity, View view) {
        A.a aVar = upcomingReleasesActivity.f30166R;
        A.a aVar2 = A.a.f29348b;
        if (aVar != aVar2) {
            upcomingReleasesActivity.f30166R = aVar2;
        } else {
            upcomingReleasesActivity.f30167S = !upcomingReleasesActivity.f30167S;
        }
        upcomingReleasesActivity.N3();
        upcomingReleasesActivity.D3().r(false);
        upcomingReleasesActivity.J3(true);
    }

    private final void J3(boolean z8) {
        D3().h(this, this.f30166R, this.f30167S, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(UpcomingReleasesActivity upcomingReleasesActivity, ActivityResult activityResult) {
        String str;
        if (activityResult.getResultCode() == 1) {
            T e8 = T.f15689k.e(upcomingReleasesActivity);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null && e8.x(upcomingReleasesActivity)) {
                UptodownApp.a aVar = UptodownApp.f29249C;
                aVar.j0(upcomingReleasesActivity);
                aVar.i0(upcomingReleasesActivity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L3(final c5.G g8) {
        D3().q(this, g8, new Function0() { // from class: F4.B4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I M32;
                M32 = UpcomingReleasesActivity.M3(c5.G.this, this);
                return M32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I M3(c5.G g8, UpcomingReleasesActivity upcomingReleasesActivity) {
        String d8 = g8.d();
        if (d8 != null && d8.length() != 0) {
            String d9 = g8.d();
            AbstractC3292y.f(d9);
            upcomingReleasesActivity.A3(d9);
        }
        upcomingReleasesActivity.J3(false);
        return Q5.I.f8786a;
    }

    private final void N3() {
        if (this.f30167S) {
            C3().f12893e.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_desc));
            C3().f12892d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_desc));
        } else {
            C3().f12893e.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_asc));
            C3().f12892d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_asc));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3(final c5.G g8) {
        AlertDialog o22;
        if (!isFinishing()) {
            if (o2() != null && (o22 = o2()) != null) {
                o22.dismiss();
            }
            C1530u c8 = C1530u.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f13008f;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            c8.f13008f.setText(getString(R.string.cancel_registration));
            c8.f13006d.setTypeface(aVar.v());
            TextView textView2 = c8.f13006d;
            C3788m c3788m = new C3788m();
            String string = getString(R.string.confirm_cancel_preregister, g8.d());
            AbstractC3292y.h(string, "getString(...)");
            String d8 = g8.d();
            AbstractC3292y.f(d8);
            textView2.setText(c3788m.d(string, d8, this));
            c8.f13005c.setTypeface(aVar.u());
            c8.f13007e.setTypeface(aVar.u());
            c8.f13007e.setText(getString(R.string.dialog_confirmation_verify_afirmative));
            c8.f13005c.setVisibility(0);
            c8.f13005c.setOnClickListener(new View.OnClickListener() { // from class: F4.E4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.P3(UpcomingReleasesActivity.this, view);
                }
            });
            c8.f13007e.setOnClickListener(new View.OnClickListener() { // from class: F4.s4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.Q3(UpcomingReleasesActivity.this, g8, view);
                }
            });
            c8.f13004b.setOnClickListener(new View.OnClickListener() { // from class: F4.t4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.R3(UpcomingReleasesActivity.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            K2(builder.create());
            if (o2() != null) {
                AlertDialog o23 = o2();
                AbstractC3292y.f(o23);
                Window window = o23.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog o24 = o2();
                AbstractC3292y.f(o24);
                o24.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(UpcomingReleasesActivity upcomingReleasesActivity, View view) {
        AlertDialog o22 = upcomingReleasesActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(UpcomingReleasesActivity upcomingReleasesActivity, c5.G g8, View view) {
        AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new d(g8, null), 3, null);
        AlertDialog o22 = upcomingReleasesActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(UpcomingReleasesActivity upcomingReleasesActivity, View view) {
        AlertDialog o22 = upcomingReleasesActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S3() {
        AlertDialog o22;
        if (!isFinishing()) {
            if (o2() != null && (o22 = o2()) != null) {
                o22.dismiss();
            }
            C1530u c8 = C1530u.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f13008f;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            c8.f13006d.setTypeface(aVar.v());
            c8.f13007e.setTypeface(aVar.u());
            c8.f13007e.setOnClickListener(new View.OnClickListener() { // from class: F4.C4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.T3(UpcomingReleasesActivity.this, view);
                }
            });
            c8.f13004b.setOnClickListener(new View.OnClickListener() { // from class: F4.D4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.U3(UpcomingReleasesActivity.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            K2(builder.create());
            if (o2() != null) {
                AlertDialog o23 = o2();
                AbstractC3292y.f(o23);
                Window window = o23.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog o24 = o2();
                AbstractC3292y.f(o24);
                o24.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(UpcomingReleasesActivity upcomingReleasesActivity, View view) {
        upcomingReleasesActivity.f30170V.launch(new Intent(upcomingReleasesActivity.getApplicationContext(), (Class<?>) LoginActivity.class), UptodownApp.f29249C.b(upcomingReleasesActivity));
        upcomingReleasesActivity.f30168T = true;
        AlertDialog o22 = upcomingReleasesActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(UpcomingReleasesActivity upcomingReleasesActivity, View view) {
        AlertDialog o22 = upcomingReleasesActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 w3(UpcomingReleasesActivity upcomingReleasesActivity) {
        return p0.c(upcomingReleasesActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x3(c5.G g8) {
        D3().g(this, g8, new Function0() { // from class: F4.u4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I y32;
                y32 = UpcomingReleasesActivity.y3(UpcomingReleasesActivity.this);
                return y32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I y3(UpcomingReleasesActivity upcomingReleasesActivity) {
        upcomingReleasesActivity.J3(true);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(ArrayList arrayList, ArrayList arrayList2) {
        I4.M m8 = this.f30165Q;
        if (m8 == null) {
            this.f30165Q = new I4.M(arrayList, arrayList2, this, this.f30169U);
            C3().f12894f.setAdapter(this.f30165Q);
        } else {
            AbstractC3292y.f(m8);
            m8.d(arrayList, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        E3();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new c(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f30168T) {
            J3(false);
        }
    }
}
