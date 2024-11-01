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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.googlepaylauncher.i;
import com.stripe.android.model.p;
import com.stripe.android.view.InterfaceC2668p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.M;
import org.json.JSONObject;
import p3.i;
import q6.InterfaceC3802A;
import q6.InterfaceC3822g;
import r0.C3871i;
import t0.C4001a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GooglePayLauncherActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f24973a = new ViewModelLazy(U.b(i.class), new d(this), new f(), new e(null, this));

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f24974b = Q5.l.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private GooglePayLauncherContract.a f24975c;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p3.i invoke() {
            return i.a.b(p3.i.f36196a, GooglePayLauncherActivity.this, null, 2, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24977a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GooglePayLauncherActivity f24979a;

            a(GooglePayLauncherActivity googlePayLauncherActivity) {
                this.f24979a = googlePayLauncherActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(h hVar, U5.d dVar) {
                if (hVar != null) {
                    this.f24979a.o(hVar);
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
            int i8 = this.f24977a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3802A m8 = GooglePayLauncherActivity.this.q().m();
                a aVar = new a(GooglePayLauncherActivity.this);
                this.f24977a = 1;
                if (m8.collect(aVar, this) == e8) {
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
        int f24980a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f24982c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f24983a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GooglePayLauncherActivity f24984b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ActivityResultLauncher f24985c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0464a implements InterfaceC3822g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ActivityResultLauncher f24986a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ GooglePayLauncherActivity f24987b;

                C0464a(ActivityResultLauncher activityResultLauncher, GooglePayLauncherActivity googlePayLauncherActivity) {
                    this.f24986a = activityResultLauncher;
                    this.f24987b = googlePayLauncherActivity;
                }

                @Override // q6.InterfaceC3822g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(Task task, U5.d dVar) {
                    if (task != null) {
                        this.f24986a.launch(task);
                        this.f24987b.q().q();
                    }
                    return I.f8786a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GooglePayLauncherActivity googlePayLauncherActivity, ActivityResultLauncher activityResultLauncher, U5.d dVar) {
                super(2, dVar);
                this.f24984b = googlePayLauncherActivity;
                this.f24985c = activityResultLauncher;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f24984b, this.f24985c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f24983a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    InterfaceC3802A l8 = this.f24984b.q().l();
                    C0464a c0464a = new C0464a(this.f24985c, this.f24984b);
                    this.f24983a = 1;
                    if (l8.collect(c0464a, this) == e8) {
                        return e8;
                    }
                }
                throw new C1413h();
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher activityResultLauncher, U5.d dVar) {
            super(2, dVar);
            this.f24982c = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f24982c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f24980a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                GooglePayLauncherActivity googlePayLauncherActivity = GooglePayLauncherActivity.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                a aVar = new a(googlePayLauncherActivity, this.f24982c, null);
                this.f24980a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(googlePayLauncherActivity, state, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24988a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f24988a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f24988a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f24989a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24990b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f24989a = function0;
            this.f24990b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24989a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f24990b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            GooglePayLauncherContract.a aVar = GooglePayLauncherActivity.this.f24975c;
            if (aVar == null) {
                AbstractC3292y.y("args");
                aVar = null;
            }
            return new i.c(aVar, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(h hVar) {
        setResult(-1, new Intent().putExtras(BundleKt.bundleOf(x.a("extra_result", hVar))));
        finish();
    }

    private final p3.i p() {
        return (p3.i) this.f24974b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i q() {
        return (i) this.f24973a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(GooglePayLauncherActivity this$0, C4001a c4001a) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.f(c4001a);
        this$0.s(c4001a);
    }

    private final void s(C4001a c4001a) {
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
                i.b.a(p(), i.d.f36214r, null, Q.k(x.a("status_message", y8), x.a("status_code", String.valueOf(b9.v()))), 2, null);
                i q8 = q();
                int v9 = b9.v();
                String y9 = b9.y();
                if (y9 != null) {
                    str = y9;
                }
                q8.u(new h.c(new RuntimeException("Google Pay failed with error " + v9 + ": " + str)));
                return;
            }
            q().u(h.a.f25087a);
            return;
        }
        C3871i c3871i = (C3871i) c4001a.a();
        if (c3871i != null) {
            q().h(InterfaceC2668p.a.b(InterfaceC2668p.f29141a, this, null, 2, null), p.f25804u.j(new JSONObject(c3871i.u())));
        } else {
            i.b.a(p(), i.f.f36238i, null, null, 6, null);
            q().u(new h.c(new RuntimeException("Google Pay missing result data.")));
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        A4.c.a(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        switch (i8) {
            case DefaultLoadControl.DEFAULT_MAX_BUFFER_MS /* 50000 */:
            case 50001:
                i q8 = q();
                if (intent == null) {
                    intent = new Intent();
                }
                q8.r(i8, intent);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b9;
        GooglePayLauncherContract.a a9;
        super.onCreate(bundle);
        try {
            s.a aVar = s.f8810b;
            GooglePayLauncherContract.a.C0465a c0465a = GooglePayLauncherContract.a.f24993a;
            Intent intent = getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            a9 = c0465a.a(intent);
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        if (a9 != null) {
            b9 = s.b(a9);
            Throwable e8 = s.e(b9);
            if (e8 == null) {
                this.f24975c = (GooglePayLauncherContract.a) b9;
                AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
                ActivityResultLauncher registerForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultCallback() { // from class: N2.e
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        GooglePayLauncherActivity.r(GooglePayLauncherActivity.this, (C4001a) obj);
                    }
                });
                AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
                AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(registerForActivityResult, null), 3, null);
                return;
            }
            o(new h.c(e8));
            return;
        }
        throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.".toString());
    }
}
