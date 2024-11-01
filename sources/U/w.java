package u;

import w.InterfaceC4139b;

/* loaded from: classes3.dex */
public final class w implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f40147a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f40148b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f40149c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f40150d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f40151e;

    public w(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        this.f40147a = aVar;
        this.f40148b = aVar2;
        this.f40149c = aVar3;
        this.f40150d = aVar4;
        this.f40151e = aVar5;
    }

    public static w a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(E.a aVar, E.a aVar2, A.e eVar, B.r rVar, B.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((E.a) this.f40147a.get(), (E.a) this.f40148b.get(), (A.e) this.f40149c.get(), (B.r) this.f40150d.get(), (B.v) this.f40151e.get());
    }
}
