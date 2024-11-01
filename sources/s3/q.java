package s3;

import k3.C3235a;
import kotlin.jvm.functions.Function1;
import y5.InterfaceC4247a;

/* loaded from: classes4.dex */
public final class q implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f39047a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f39048b;

    public q(N5.a aVar, N5.a aVar2) {
        this.f39047a = aVar;
        this.f39048b = aVar2;
    }

    public static q a(N5.a aVar, N5.a aVar2) {
        return new q(aVar, aVar2);
    }

    public static Function1 c(InterfaceC4247a interfaceC4247a, C3235a c3235a) {
        return (Function1) z5.h.d(o.f39042a.b(interfaceC4247a, c3235a));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(z5.d.a(this.f39047a), (C3235a) this.f39048b.get());
    }
}
