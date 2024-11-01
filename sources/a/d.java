package A;

import B.x;
import C.InterfaceC0960d;
import java.util.concurrent.Executor;
import v.InterfaceC4109e;
import w.InterfaceC4139b;

/* loaded from: classes3.dex */
public final class d implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f59a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f60b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f61c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f62d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f63e;

    public d(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        this.f59a = aVar;
        this.f60b = aVar2;
        this.f61c = aVar3;
        this.f62d = aVar4;
        this.f63e = aVar5;
    }

    public static d a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, InterfaceC4109e interfaceC4109e, x xVar, InterfaceC0960d interfaceC0960d, D.b bVar) {
        return new c(executor, interfaceC4109e, xVar, interfaceC0960d, bVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f59a.get(), (InterfaceC4109e) this.f60b.get(), (x) this.f61c.get(), (InterfaceC0960d) this.f62d.get(), (D.b) this.f63e.get());
    }
}
