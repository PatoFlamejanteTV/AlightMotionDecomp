package com.stripe.android.payments.core.authentication.threeds2;

import B2.j;
import Q5.I;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import c4.q;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.c;
import com.stripe.android.view.InterfaceC2668p;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.p;
import q3.AbstractC3637f;

/* loaded from: classes4.dex */
public final class b extends AbstractC3637f {

    /* renamed from: a, reason: collision with root package name */
    private final p f26427a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26428b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f26429c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f26430d;

    /* renamed from: e, reason: collision with root package name */
    private ActivityResultLauncher f26431e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f26432f;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(InterfaceC2668p host) {
            AbstractC3292y.i(host, "host");
            ActivityResultLauncher f8 = b.this.f();
            if (f8 != null) {
                return new c.b(f8);
            }
            return new c.a(host);
        }
    }

    public b(p config, boolean z8, Function0 publishableKeyProvider, Set productUsage) {
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(productUsage, "productUsage");
        this.f26427a = config;
        this.f26428b = z8;
        this.f26429c = publishableKeyProvider;
        this.f26430d = productUsage;
        this.f26432f = new a();
    }

    @Override // q3.AbstractC3637f, o3.InterfaceC3526a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        AbstractC3292y.i(activityResultCallback, "activityResultCallback");
        this.f26431e = activityResultCaller.registerForActivityResult(new Stripe3ds2TransactionContract(), activityResultCallback);
    }

    @Override // q3.AbstractC3637f, o3.InterfaceC3526a
    public void c() {
        ActivityResultLauncher activityResultLauncher = this.f26431e;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f26431e = null;
    }

    public final ActivityResultLauncher f() {
        return this.f26431e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q3.AbstractC3637f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2668p interfaceC2668p, StripeIntent stripeIntent, j.c cVar, U5.d dVar) {
        c cVar2 = (c) this.f26432f.invoke(interfaceC2668p);
        q a9 = q.f15532b.a();
        p.c c8 = this.f26427a.c();
        StripeIntent.a j8 = stripeIntent.j();
        AbstractC3292y.g(j8, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2");
        cVar2.a(new Stripe3ds2TransactionContract.a(a9, c8, stripeIntent, (StripeIntent.a.j.b) j8, cVar, this.f26428b, interfaceC2668p.a(), (String) this.f26429c.invoke(), this.f26430d));
        return I.f8786a;
    }
}
