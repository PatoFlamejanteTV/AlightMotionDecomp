package com.uptodown.activities;

import F4.AbstractActivityC1198w2;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.C1513g0;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
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
import b5.InterfaceC1973B;
import c5.C2041f;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RollbackActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.w;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class RollbackActivity extends AbstractActivityC1198w2 implements InterfaceC1973B {

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1416k f30082q0 = Q5.l.b(new Function0() { // from class: F4.R3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C1513g0 F42;
            F42 = RollbackActivity.F4(RollbackActivity.this);
            return F42;
        }
    });

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1416k f30083r0 = new ViewModelLazy(U.b(w.class), new d(this), new c(this), new e(null, this));

    /* renamed from: s0, reason: collision with root package name */
    private I4.D f30084s0;

    /* renamed from: t0, reason: collision with root package name */
    private final ActivityResultLauncher f30085t0;

    /* loaded from: classes4.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RollbackActivity.this.O4(false);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30087a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RollbackActivity f30089a;

            a(RollbackActivity rollbackActivity) {
                this.f30089a = rollbackActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f30089a.I4().f12693b.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    this.f30089a.G4(((w.a) ((AbstractC3768A.c) abstractC3768A).a()).a());
                    this.f30089a.I4().f12698g.setVisibility(0);
                    this.f30089a.I4().f12693b.f12236b.setVisibility(8);
                } else if (abstractC3768A instanceof AbstractC3768A.b) {
                    this.f30089a.I4().f12693b.f12236b.setVisibility(8);
                    this.f30089a.I4().f12697f.setVisibility(0);
                    this.f30089a.I4().f12697f.setText(this.f30089a.getString(R.string.no_results));
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
            int i8 = this.f30087a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L d8 = RollbackActivity.this.J4().d();
                a aVar = new a(RollbackActivity.this);
                this.f30087a = 1;
                if (d8.collect(aVar, this) == e8) {
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
        final /* synthetic */ ComponentActivity f30090a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f30090a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30090a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30091a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f30091a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30091a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30092a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30093b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30092a = function0;
            this.f30093b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30092a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30093b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public RollbackActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.S3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                RollbackActivity.H4(RollbackActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f30085t0 = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1513g0 F4(RollbackActivity rollbackActivity) {
        return C1513g0.c(rollbackActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G4(ArrayList arrayList) {
        I4.D d8 = this.f30084s0;
        if (d8 == null) {
            this.f30084s0 = new I4.D(arrayList, this, this);
            I4().f12694c.setAdapter(this.f30084s0);
        } else {
            AbstractC3292y.f(d8);
            d8.d(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H4(RollbackActivity rollbackActivity, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            rollbackActivity.L2();
            rollbackActivity.I4().f12696e.setVisibility(8);
            rollbackActivity.I4().f12697f.setText(rollbackActivity.getString(R.string.msg_checking_device_rollback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1513g0 I4() {
        return (C1513g0) this.f30082q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w J4() {
        return (w) this.f30083r0.getValue();
    }

    private final void K4() {
        setContentView(I4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            I4().f12695d.setNavigationIcon(drawable);
            I4().f12695d.setNavigationContentDescription(getString(R.string.back));
        }
        I4().f12695d.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.T3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.L4(RollbackActivity.this, view);
            }
        });
        TextView textView = I4().f12699h;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        I4().f12694c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        I4().f12694c.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        I4().f12694c.addItemDecoration(new s5.m(dimension, dimension));
        I4().f12697f.setTypeface(aVar.v());
        if (!SettingsPreferences.f30529b.j0(this)) {
            I4().f12697f.setText(getString(R.string.msg_permissions_rollback));
        }
        I4().f12698g.setTypeface(aVar.v());
        I4().f12696e.setTypeface(aVar.v());
        I4().f12696e.setOnClickListener(new View.OnClickListener() { // from class: F4.U3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.M4(RollbackActivity.this, view);
            }
        });
        I4().f12693b.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.V3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.N4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L4(RollbackActivity rollbackActivity, View view) {
        rollbackActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(RollbackActivity rollbackActivity, View view) {
        rollbackActivity.P4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O4(boolean z8) {
        J4().c(this, z8);
    }

    private final void P4() {
        this.f30085t0.launch(new Intent(getApplicationContext(), (Class<?>) GdprPrivacySettings.class), UptodownApp.f29249C.b(this));
    }

    @Override // b5.InterfaceC1973B
    public void a(int i8) {
        I4.D d8;
        if (UptodownApp.f29249C.a0() && (d8 = this.f30084s0) != null) {
            AbstractC3292y.f(d8);
            if (i8 < d8.a().size()) {
                I4.D d9 = this.f30084s0;
                AbstractC3292y.f(d9);
                if (((C2041f) d9.a().get(i8)).b() != 0) {
                    I4.D d10 = this.f30084s0;
                    AbstractC3292y.f(d10);
                    Object obj = d10.a().get(i8);
                    AbstractC3292y.h(obj, "get(...)");
                    m4((C2041f) obj);
                }
            }
        }
    }

    @Override // F4.AbstractActivityC1198w2
    protected void o4() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        K4();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new b(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        O4(true);
    }
}
