package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Window;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.w;
import com.stripe.android.paymentsheet.z;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import v3.C4130j;

/* renamed from: com.stripe.android.paymentsheet.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2635b implements y {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityResultLauncher f27195a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f27196b;

    /* renamed from: c, reason: collision with root package name */
    private final LifecycleOwner f27197c;

    /* renamed from: d, reason: collision with root package name */
    private final Application f27198d;

    /* renamed from: e, reason: collision with root package name */
    private final v3.p f27199e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f27200f;

    /* renamed from: com.stripe.android.paymentsheet.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements DefaultLifecycleObserver {
        a() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3292y.i(owner, "owner");
            g.f27289a.b(null);
            C4130j.f40490a.c(null);
            androidx.lifecycle.c.b(this, owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.c(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.d(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.e(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.f(this, lifecycleOwner);
        }
    }

    public C2635b(ActivityResultLauncher activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, v3.p callback, boolean z8) {
        AbstractC3292y.i(activityResultLauncher, "activityResultLauncher");
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(lifecycleOwner, "lifecycleOwner");
        AbstractC3292y.i(application, "application");
        AbstractC3292y.i(callback, "callback");
        this.f27195a = activityResultLauncher;
        this.f27196b = activity;
        this.f27197c = lifecycleOwner;
        this.f27198d = application;
        this.f27199e = callback;
        this.f27200f = z8;
        lifecycleOwner.getLifecycle().addObserver(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(v3.p callback, z zVar) {
        AbstractC3292y.i(callback, "$callback");
        AbstractC3292y.f(zVar);
        callback.a(zVar);
    }

    @Override // com.stripe.android.paymentsheet.y
    public void a(w.l mode, w.g gVar) {
        Integer num;
        AbstractC3292y.i(mode, "mode");
        if (gVar == null) {
            gVar = w.g.f27936q.a(this.f27196b);
        }
        Window window = this.f27196b.getWindow();
        if (window != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        } else {
            num = null;
        }
        PaymentSheetContractV2.a aVar = new PaymentSheetContractV2.a(mode, gVar, num, this.f27200f);
        Context applicationContext = this.f27198d.getApplicationContext();
        A4.a aVar2 = A4.a.f159a;
        ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(applicationContext, aVar2.a(), aVar2.b());
        AbstractC3292y.h(makeCustomAnimation, "makeCustomAnimation(...)");
        try {
            this.f27195a.launch(aVar, makeCustomAnimation);
        } catch (IllegalStateException e8) {
            this.f27199e.a(new z.c(new IllegalStateException("The host activity is not in a valid state (" + this.f27197c.getLifecycle().getCurrentState() + ").", e8)));
        }
    }

    public /* synthetic */ C2635b(ActivityResultLauncher activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, v3.p pVar, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(activityResultLauncher, activity, lifecycleOwner, application, pVar, (i8 & 32) != 0 ? false : z8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2635b(androidx.activity.ComponentActivity r12, final v3.p r13) {
        /*
            r11 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.AbstractC3292y.i(r12, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.AbstractC3292y.i(r13, r0)
            com.stripe.android.paymentsheet.PaymentSheetContractV2 r0 = new com.stripe.android.paymentsheet.PaymentSheetContractV2
            r0.<init>()
            v3.d r1 = new v3.d
            r1.<init>()
            androidx.activity.result.ActivityResultLauncher r3 = r12.registerForActivityResult(r0, r1)
            java.lang.String r0 = "registerForActivityResult(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r3, r0)
            android.app.Application r6 = r12.getApplication()
            java.lang.String r0 = "getApplication(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r6, r0)
            r9 = 32
            r10 = 0
            r8 = 0
            r2 = r11
            r4 = r12
            r5 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.C2635b.<init>(androidx.activity.ComponentActivity, v3.p):void");
    }
}
