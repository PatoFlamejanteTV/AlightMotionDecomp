package C;

import android.content.Context;
import w.InterfaceC4139b;

/* loaded from: classes3.dex */
public final class X implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f658a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f659b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f660c;

    public X(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f658a = aVar;
        this.f659b = aVar2;
        this.f660c = aVar3;
    }

    public static X a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new X(aVar, aVar2, aVar3);
    }

    public static W c(Context context, String str, int i8) {
        return new W(context, str, i8);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c((Context) this.f658a.get(), (String) this.f659b.get(), ((Integer) this.f660c.get()).intValue());
    }
}
