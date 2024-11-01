package s3;

import android.content.Context;
import b4.InterfaceC1970a;

/* loaded from: classes4.dex */
public final class D implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f38931a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f38932b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f38933c;

    public D(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f38931a = aVar;
        this.f38932b = aVar2;
        this.f38933c = aVar3;
    }

    public static D a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new D(aVar, aVar2, aVar3);
    }

    public static InterfaceC1970a c(Context context, boolean z8, U5.g gVar) {
        return (InterfaceC1970a) z5.h.d(AbstractC3947B.f38929a.b(context, z8, gVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1970a get() {
        return c((Context) this.f38931a.get(), ((Boolean) this.f38932b.get()).booleanValue(), (U5.g) this.f38933c.get());
    }
}
