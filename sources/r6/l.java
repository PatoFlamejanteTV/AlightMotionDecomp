package r6;

import U5.g;
import c6.InterfaceC2072n;

/* loaded from: classes5.dex */
public final class l implements U5.g {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f38846a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ U5.g f38847b;

    public l(Throwable th, U5.g gVar) {
        this.f38846a = th;
        this.f38847b = gVar;
    }

    @Override // U5.g
    public Object fold(Object obj, InterfaceC2072n interfaceC2072n) {
        return this.f38847b.fold(obj, interfaceC2072n);
    }

    @Override // U5.g
    public g.b get(g.c cVar) {
        return this.f38847b.get(cVar);
    }

    @Override // U5.g
    public U5.g minusKey(g.c cVar) {
        return this.f38847b.minusKey(cVar);
    }

    @Override // U5.g
    public U5.g plus(U5.g gVar) {
        return this.f38847b.plus(gVar);
    }
}
