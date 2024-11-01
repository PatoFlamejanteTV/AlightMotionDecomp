package C3;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import k4.InterfaceC3244b;

/* renamed from: C3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0983d implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C0981b f802a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f803b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f804c;

    public C0983d(C0981b c0981b, N5.a aVar, N5.a aVar2) {
        this.f802a = c0981b;
        this.f803b = aVar;
        this.f804c = aVar2;
    }

    public static C0983d a(C0981b c0981b, N5.a aVar, N5.a aVar2) {
        return new C0983d(c0981b, aVar, aVar2);
    }

    public static InterfaceC3244b c(C0981b c0981b, Context context, AddressElementActivityContract.a aVar) {
        return c0981b.b(context, aVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3244b get() {
        return c(this.f802a, (Context) this.f803b.get(), (AddressElementActivityContract.a) this.f804c.get());
    }
}
