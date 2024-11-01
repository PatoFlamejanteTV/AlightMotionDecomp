package v;

import android.content.Context;
import w.InterfaceC4139b;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4114j implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f40407a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f40408b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f40409c;

    public C4114j(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f40407a = aVar;
        this.f40408b = aVar2;
        this.f40409c = aVar3;
    }

    public static C4114j a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new C4114j(aVar, aVar2, aVar3);
    }

    public static C4113i c(Context context, E.a aVar, E.a aVar2) {
        return new C4113i(context, aVar, aVar2);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4113i get() {
        return c((Context) this.f40407a.get(), (E.a) this.f40408b.get(), (E.a) this.f40409c.get());
    }
}
