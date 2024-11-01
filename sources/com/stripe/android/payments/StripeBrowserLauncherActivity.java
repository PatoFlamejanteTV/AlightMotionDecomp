package com.stripe.android.payments;

import Q5.InterfaceC1416k;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.payments.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import p3.i;
import x2.k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StripeBrowserLauncherActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f26268a;

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f26269a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f26269a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f26270a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26270a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26271a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26271a = function0;
            this.f26272b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26271a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26272b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f26273a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new a.b();
        }
    }

    public StripeBrowserLauncherActivity() {
        Function0 function0 = d.f26273a;
        this.f26268a = new ViewModelLazy(U.b(com.stripe.android.payments.a.class), new b(this), function0 == null ? new a(this) : function0, new c(null, this));
    }

    private final void l(PaymentBrowserAuthContract.a aVar) {
        setResult(-1, n().c(aVar));
        finish();
    }

    private final void m(PaymentBrowserAuthContract.a aVar) {
        setResult(-1, n().e(aVar));
        finish();
    }

    private final com.stripe.android.payments.a n() {
        return (com.stripe.android.payments.a) this.f26268a.getValue();
    }

    private final void o(final PaymentBrowserAuthContract.a aVar) {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: k3.l
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                StripeBrowserLauncherActivity.p(StripeBrowserLauncherActivity.this, aVar, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        try {
            registerForActivityResult.launch(n().b(aVar));
            n().g(true);
        } catch (ActivityNotFoundException e8) {
            i.a aVar2 = i.f36196a;
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar2, applicationContext, null, 2, null), i.d.f36212p, k.f40948e.b(e8), null, 4, null);
            l(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(StripeBrowserLauncherActivity this$0, PaymentBrowserAuthContract.a args, ActivityResult activityResult) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(args, "$args");
        this$0.m(args);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBrowserAuthContract.b bVar = PaymentBrowserAuthContract.f24688a;
        Intent intent = getIntent();
        AbstractC3292y.h(intent, "getIntent(...)");
        PaymentBrowserAuthContract.a a9 = bVar.a(intent);
        if (a9 == null) {
            finish();
            i.a aVar = i.f36196a;
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar, applicationContext, null, 2, null), i.d.f36213q, null, null, 6, null);
            return;
        }
        if (n().d()) {
            m(a9);
        } else {
            o(a9);
        }
    }
}
