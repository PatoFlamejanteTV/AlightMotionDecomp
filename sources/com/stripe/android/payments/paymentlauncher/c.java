package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import u3.InterfaceC4077a;

/* loaded from: classes4.dex */
public final class c implements InterfaceC4077a {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f26583a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f26584b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f26585c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f26586d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26587e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26588f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f26589g;

    public c(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, ActivityResultLauncher hostActivityLauncher, Integer num, boolean z8, boolean z9, Set productUsage) {
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3292y.i(hostActivityLauncher, "hostActivityLauncher");
        AbstractC3292y.i(productUsage, "productUsage");
        this.f26583a = publishableKeyProvider;
        this.f26584b = stripeAccountIdProvider;
        this.f26585c = hostActivityLauncher;
        this.f26586d = num;
        this.f26587e = z8;
        this.f26588f = z9;
        this.f26589g = productUsage;
    }

    @Override // u3.InterfaceC4077a
    public void a(com.stripe.android.model.b params) {
        AbstractC3292y.i(params, "params");
        this.f26585c.launch(new PaymentLauncherContract.a.b((String) this.f26583a.invoke(), (String) this.f26584b.invoke(), this.f26588f, this.f26589g, this.f26587e, params, this.f26586d));
    }

    @Override // u3.InterfaceC4077a
    public void b(String clientSecret) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        this.f26585c.launch(new PaymentLauncherContract.a.c((String) this.f26583a.invoke(), (String) this.f26584b.invoke(), this.f26588f, this.f26589g, this.f26587e, clientSecret, this.f26586d));
    }

    @Override // u3.InterfaceC4077a
    public void c(com.stripe.android.model.c params) {
        AbstractC3292y.i(params, "params");
        this.f26585c.launch(new PaymentLauncherContract.a.b((String) this.f26583a.invoke(), (String) this.f26584b.invoke(), this.f26588f, this.f26589g, this.f26587e, params, this.f26586d));
    }

    @Override // u3.InterfaceC4077a
    public void d(String clientSecret) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        this.f26585c.launch(new PaymentLauncherContract.a.d((String) this.f26583a.invoke(), (String) this.f26584b.invoke(), this.f26588f, this.f26589g, this.f26587e, clientSecret, this.f26586d));
    }
}
