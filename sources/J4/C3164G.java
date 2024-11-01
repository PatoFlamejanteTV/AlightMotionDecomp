package j4;

import h4.InterfaceC2949a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import p2.InterfaceC3560b;
import q6.InterfaceC3813L;

/* renamed from: j4.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3164G implements r4.m0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3161D f33801a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33802b;

    /* renamed from: c, reason: collision with root package name */
    private final g4.e f33803c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f33804d;

    public C3164G(InterfaceC3560b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC2949a cbcEligibility) {
        AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3292y.i(initialValues, "initialValues");
        AbstractC3292y.i(cbcEligibility, "cbcEligibility");
        C3161D c3161d = new C3161D(r4.G.Companion.a("card_detail"), cardAccountRangeRepositoryFactory, initialValues, z8, cbcEligibility, null, 32, null);
        this.f33801a = c3161d;
        this.f33802b = c3161d.j();
        this.f33803c = new g4.e();
        this.f33804d = c3161d.i().getError();
    }

    @Override // r4.m0
    public InterfaceC3813L getError() {
        return this.f33804d;
    }

    public final C3161D v() {
        return this.f33801a;
    }

    public final boolean w() {
        return this.f33802b;
    }

    public final g4.e x() {
        return this.f33803c;
    }
}
