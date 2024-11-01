package o2;

import B2.m;
import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.internal.AbstractC3292y;
import n2.r;
import n6.C3445b0;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3522d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3522d f35921a = new C3522d();

    private C3522d() {
    }

    public final InterfaceC3521c a(Context context) {
        AbstractC3292y.i(context, "context");
        return new C3519a(new m(v2.d.f40434a.a(false), C3445b0.b()), new PaymentAnalyticsRequestFactory(context, r.f35413c.a(context).f(), null, 4, null), E2.c.f1550b.a(), C3445b0.b());
    }
}
