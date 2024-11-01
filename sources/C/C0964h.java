package C;

import android.content.Context;
import w.InterfaceC4139b;

/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0964h implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f676a;

    public C0964h(N5.a aVar) {
        this.f676a = aVar;
    }

    public static C0964h a(N5.a aVar) {
        return new C0964h(aVar);
    }

    public static String c(Context context) {
        return (String) w.d.d(AbstractC0962f.b(context));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f676a.get());
    }
}
