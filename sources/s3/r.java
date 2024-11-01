package s3;

import kotlin.jvm.functions.Function1;
import y5.InterfaceC4247a;

/* loaded from: classes4.dex */
public final class r implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f39049a;

    public r(N5.a aVar) {
        this.f39049a = aVar;
    }

    public static r a(N5.a aVar) {
        return new r(aVar);
    }

    public static Function1 c(InterfaceC4247a interfaceC4247a) {
        return (Function1) z5.h.d(o.f39042a.c(interfaceC4247a));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(z5.d.a(this.f39049a));
    }
}
