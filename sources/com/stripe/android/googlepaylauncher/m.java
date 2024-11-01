package com.stripe.android.googlepaylauncher;

import B2.InterfaceC0951c;
import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.j;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.functions.Function1;
import n6.M;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f25185a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f25186b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f25187c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f25188d;

    public m(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        this.f25185a = aVar;
        this.f25186b = aVar2;
        this.f25187c = aVar3;
        this.f25188d = aVar4;
    }

    public static m a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        return new m(aVar, aVar2, aVar3, aVar4);
    }

    public static j c(M m8, j.d dVar, j.e eVar, ActivityResultLauncher activityResultLauncher, boolean z8, Context context, Function1 function1, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC0951c interfaceC0951c) {
        return new j(m8, dVar, eVar, activityResultLauncher, z8, context, function1, paymentAnalyticsRequestFactory, interfaceC0951c);
    }

    public j b(M m8, j.d dVar, j.e eVar, ActivityResultLauncher activityResultLauncher, boolean z8) {
        return c(m8, dVar, eVar, activityResultLauncher, z8, (Context) this.f25185a.get(), (Function1) this.f25186b.get(), (PaymentAnalyticsRequestFactory) this.f25187c.get(), (InterfaceC0951c) this.f25188d.get());
    }
}
