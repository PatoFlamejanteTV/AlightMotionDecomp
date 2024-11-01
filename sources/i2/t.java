package I2;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.f;

/* loaded from: classes4.dex */
public final class t implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f3353a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f3354b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f3355c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f3356d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f3357e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f3358f;

    /* renamed from: g, reason: collision with root package name */
    private final N5.a f3359g;

    public t(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7) {
        this.f3353a = aVar;
        this.f3354b = aVar2;
        this.f3355c = aVar3;
        this.f3356d = aVar4;
        this.f3357e = aVar5;
        this.f3358f = aVar6;
        this.f3359g = aVar7;
    }

    public static t a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static f.d c(SavedStateHandle savedStateHandle, N5.a aVar, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bVar, com.stripe.android.payments.paymentlauncher.d dVar, Integer num, com.stripe.android.paymentsheet.g gVar, p3.i iVar) {
        return (f.d) z5.h.d(d.f3329a.r(savedStateHandle, aVar, bVar, dVar, num, gVar, iVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f.d get() {
        return c((SavedStateHandle) this.f3353a.get(), this.f3354b, (com.stripe.android.paymentsheet.paymentdatacollection.bacs.b) this.f3355c.get(), (com.stripe.android.payments.paymentlauncher.d) this.f3356d.get(), (Integer) this.f3357e.get(), (com.stripe.android.paymentsheet.g) this.f3358f.get(), (p3.i) this.f3359g.get());
    }
}
