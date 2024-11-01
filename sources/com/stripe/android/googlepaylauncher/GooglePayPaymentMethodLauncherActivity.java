package com.stripe.android.googlepaylauncher;

import Q5.C1413h;
import Q5.I;
import Q5.InterfaceC1416k;
import Q5.s;
import Q5.t;
import Q5.x;
import R5.Q;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.j;
import com.stripe.android.googlepaylauncher.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import p3.i;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;
import r0.C3871i;
import t0.C4001a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GooglePayPaymentMethodLauncherActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f25002a = new ViewModelLazy(U.b(l.class), new e(this), new g(), new f(null, this));

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f25003b = Q5.l.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private GooglePayPaymentMethodLauncherContractV2.a f25004c;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p3.i invoke() {
            return i.a.b(p3.i.f36196a, GooglePayPaymentMethodLauncherActivity.this, null, 2, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f25006a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GooglePayPaymentMethodLauncherActivity f25008a;

            a(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity) {
                this.f25008a = googlePayPaymentMethodLauncherActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(j.f fVar, U5.d dVar) {
                if (fVar != null) {
                    this.f25008a.p(fVar);
                }
                return I.f8786a;
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
            int i8 = this.f25006a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3813L d8 = GooglePayPaymentMethodLauncherActivity.this.r().d();
                a aVar = new a(GooglePayPaymentMethodLauncherActivity.this);
                this.f25006a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f25009a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25010b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f25012d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f25013a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GooglePayPaymentMethodLauncherActivity f25014b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, U5.d dVar) {
                super(2, dVar);
                this.f25014b = googlePayPaymentMethodLauncherActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f25014b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f25013a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    l r8 = this.f25014b.r();
                    this.f25013a = 1;
                    obj = r8.g(this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher activityResultLauncher, U5.d dVar) {
            super(2, dVar);
            this.f25012d = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            c cVar = new c(this.f25012d, dVar);
            cVar.f25010b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            Object e8 = V5.b.e();
            int i8 = this.f25009a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = GooglePayPaymentMethodLauncherActivity.this;
                    s.a aVar = s.f8810b;
                    n6.I b10 = C3445b0.b();
                    a aVar2 = new a(googlePayPaymentMethodLauncherActivity, null);
                    this.f25009a = 1;
                    obj = AbstractC3458i.g(b10, aVar2, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b9 = s.b((Task) obj);
            } catch (Throwable th) {
                s.a aVar3 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            ActivityResultLauncher activityResultLauncher = this.f25012d;
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
            Throwable e9 = s.e(b9);
            if (e9 != null) {
                googlePayPaymentMethodLauncherActivity2.x(new j.f.c(e9, 1));
            } else {
                activityResultLauncher.launch((Task) b9);
                googlePayPaymentMethodLauncherActivity2.r().h(true);
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f25015a;

        /* renamed from: b, reason: collision with root package name */
        int f25016b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3871i f25018d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3871i c3871i, U5.d dVar) {
            super(2, dVar);
            this.f25018d = c3871i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f25018d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity;
            Object e8 = V5.b.e();
            int i8 = this.f25016b;
            if (i8 != 0) {
                if (i8 == 1) {
                    googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.f25015a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
                l r8 = googlePayPaymentMethodLauncherActivity2.r();
                C3871i c3871i = this.f25018d;
                this.f25015a = googlePayPaymentMethodLauncherActivity2;
                this.f25016b = 1;
                Object b9 = r8.b(c3871i, this);
                if (b9 == e8) {
                    return e8;
                }
                googlePayPaymentMethodLauncherActivity = googlePayPaymentMethodLauncherActivity2;
                obj = b9;
            }
            googlePayPaymentMethodLauncherActivity.p((j.f) obj);
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25019a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f25019a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f25019a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f25020a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f25020a = function0;
            this.f25021b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25020a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f25021b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            GooglePayPaymentMethodLauncherContractV2.a aVar = GooglePayPaymentMethodLauncherActivity.this.f25004c;
            if (aVar == null) {
                AbstractC3292y.y("args");
                aVar = null;
            }
            return new l.b(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(j.f fVar) {
        setResult(-1, new Intent().putExtras(BundleKt.bundleOf(x.a("extra_result", fVar))));
        finish();
    }

    private final p3.i q() {
        return (p3.i) this.f25003b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l r() {
        return (l) this.f25002a.getValue();
    }

    private final int s(int i8) {
        if (i8 != 7) {
            return i8 != 10 ? 1 : 2;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(GooglePayPaymentMethodLauncherActivity this$0, C4001a c4001a) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.f(c4001a);
        this$0.v(c4001a);
    }

    private final void u(C3871i c3871i) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(c3871i, null), 3, null);
    }

    private final void v(C4001a c4001a) {
        int v8 = c4001a.b().v();
        if (v8 != 0) {
            if (v8 != 16) {
                Status b9 = c4001a.b();
                AbstractC3292y.h(b9, "getStatus(...)");
                String y8 = b9.y();
                String str = "";
                if (y8 == null) {
                    y8 = "";
                }
                i.b.a(q(), i.d.f36214r, null, Q.k(x.a("status_message", y8), x.a("status_code", String.valueOf(b9.v()))), 2, null);
                l r8 = r();
                int v9 = b9.v();
                String y9 = b9.y();
                if (y9 != null) {
                    str = y9;
                }
                r8.i(new j.f.c(new RuntimeException("Google Pay failed with error " + v9 + ": " + str), s(b9.v())));
                return;
            }
            x(j.f.a.f25160a);
            return;
        }
        C3871i c3871i = (C3871i) c4001a.a();
        if (c3871i != null) {
            u(c3871i);
        } else {
            i.b.a(q(), i.f.f36238i, null, null, 6, null);
            x(new j.f.c(new RuntimeException("Google Pay failed with missing data."), 1));
        }
    }

    private final void w() {
        A4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(j.f fVar) {
        r().i(fVar);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w();
        GooglePayPaymentMethodLauncherContractV2.a.C0468a c0468a = GooglePayPaymentMethodLauncherContractV2.a.f25037f;
        Intent intent = getIntent();
        AbstractC3292y.h(intent, "getIntent(...)");
        GooglePayPaymentMethodLauncherContractV2.a a9 = c0468a.a(intent);
        if (a9 == null) {
            p(new j.f.c(new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments."), 2));
            return;
        }
        this.f25004c = a9;
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultCallback() { // from class: N2.f
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayPaymentMethodLauncherActivity.t(GooglePayPaymentMethodLauncherActivity.this, (C4001a) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        if (!r().e()) {
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(registerForActivityResult, null), 3, null);
        }
    }
}
