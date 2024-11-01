package v;

import android.content.Context;
import w.InterfaceC4139b;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4116l implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f40415a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f40416b;

    public C4116l(N5.a aVar, N5.a aVar2) {
        this.f40415a = aVar;
        this.f40416b = aVar2;
    }

    public static C4116l a(N5.a aVar, N5.a aVar2) {
        return new C4116l(aVar, aVar2);
    }

    public static C4115k c(Context context, Object obj) {
        return new C4115k(context, (C4113i) obj);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4115k get() {
        return c((Context) this.f40415a.get(), this.f40416b.get());
    }
}
