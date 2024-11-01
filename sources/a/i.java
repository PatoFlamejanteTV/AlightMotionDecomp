package A;

import B.x;
import C.InterfaceC0960d;
import android.content.Context;
import w.InterfaceC4139b;

/* loaded from: classes3.dex */
public final class i implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f65a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f66b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f67c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f68d;

    public i(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        this.f65a = aVar;
        this.f66b = aVar2;
        this.f67c = aVar3;
        this.f68d = aVar4;
    }

    public static i a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, InterfaceC0960d interfaceC0960d, B.f fVar, E.a aVar) {
        return (x) w.d.d(h.a(context, interfaceC0960d, fVar, aVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f65a.get(), (InterfaceC0960d) this.f66b.get(), (B.f) this.f67c.get(), (E.a) this.f68d.get());
    }
}
