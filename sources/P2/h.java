package P2;

import S2.a;
import com.stripe.android.link.LinkActivityContract;

/* loaded from: classes4.dex */
public final class h implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f8038a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f8039b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f8040c;

    public h(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f8038a = aVar;
        this.f8039b = aVar2;
        this.f8040c = aVar3;
    }

    public static h a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new h(aVar, aVar2, aVar3);
    }

    public static com.stripe.android.link.a c(a.InterfaceC0197a interfaceC0197a, LinkActivityContract linkActivityContract, Q2.d dVar) {
        return new com.stripe.android.link.a(interfaceC0197a, linkActivityContract, dVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.link.a get() {
        return c((a.InterfaceC0197a) this.f8038a.get(), (LinkActivityContract) this.f8039b.get(), (Q2.d) this.f8040c.get());
    }
}
