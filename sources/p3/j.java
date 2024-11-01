package p3;

import B2.C0953e;
import B2.InterfaceC0951c;
import R5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;

/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0951c f36254b;

    /* renamed from: c, reason: collision with root package name */
    private final C0953e f36255c;

    public j(InterfaceC0951c analyticsRequestExecutor, C0953e analyticsRequestFactory) {
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(analyticsRequestFactory, "analyticsRequestFactory");
        this.f36254b = analyticsRequestExecutor;
        this.f36255c = analyticsRequestFactory;
    }

    @Override // p3.i
    public void a(i.c errorEvent, x2.k kVar, Map additionalNonPiiParams) {
        Map d8;
        AbstractC3292y.i(errorEvent, "errorEvent");
        AbstractC3292y.i(additionalNonPiiParams, "additionalNonPiiParams");
        if (kVar == null) {
            d8 = Q.h();
        } else {
            d8 = i.f36196a.d(kVar);
        }
        this.f36254b.a(this.f36255c.g(errorEvent, Q.q(d8, additionalNonPiiParams)));
    }
}
