package n6;

import Q5.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class P0 extends E0 {

    /* renamed from: e, reason: collision with root package name */
    private final C3472p f35673e;

    public P0(C3472p c3472p) {
        this.f35673e = c3472p;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return Q5.I.f8786a;
    }

    @Override // n6.AbstractC3439E
    public void r(Throwable th) {
        Object d02 = s().d0();
        if (d02 instanceof C3437C) {
            C3472p c3472p = this.f35673e;
            s.a aVar = Q5.s.f8810b;
            c3472p.resumeWith(Q5.s.b(Q5.t.a(((C3437C) d02).f35626a)));
        } else {
            C3472p c3472p2 = this.f35673e;
            s.a aVar2 = Q5.s.f8810b;
            c3472p2.resumeWith(Q5.s.b(G0.h(d02)));
        }
    }
}
