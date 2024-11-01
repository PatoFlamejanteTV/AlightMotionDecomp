package B;

import C.InterfaceC0960d;
import java.util.concurrent.Executor;
import w.InterfaceC4139b;

/* loaded from: classes3.dex */
public final class w implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f364a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f365b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f366c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f367d;

    public w(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        this.f364a = aVar;
        this.f365b = aVar2;
        this.f366c = aVar3;
        this.f367d = aVar4;
    }

    public static w a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, InterfaceC0960d interfaceC0960d, x xVar, D.b bVar) {
        return new v(executor, interfaceC0960d, xVar, bVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f364a.get(), (InterfaceC0960d) this.f365b.get(), (x) this.f366c.get(), (D.b) this.f367d.get());
    }
}
