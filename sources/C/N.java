package C;

import w.InterfaceC4139b;

/* loaded from: classes3.dex */
public final class N implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f641a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f642b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f643c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f644d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f645e;

    public N(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        this.f641a = aVar;
        this.f642b = aVar2;
        this.f643c = aVar3;
        this.f644d = aVar4;
        this.f645e = aVar5;
    }

    public static N a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        return new N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static M c(E.a aVar, E.a aVar2, Object obj, Object obj2, N5.a aVar3) {
        return new M(aVar, aVar2, (AbstractC0961e) obj, (W) obj2, aVar3);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((E.a) this.f641a.get(), (E.a) this.f642b.get(), this.f643c.get(), this.f644d.get(), this.f645e);
    }
}
