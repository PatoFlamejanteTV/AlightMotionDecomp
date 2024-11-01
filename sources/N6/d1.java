package n6;

import U5.g;
import c6.InterfaceC2072n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d1 implements g.b, g.c {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f35703a = new d1();

    private d1() {
    }

    @Override // U5.g.b, U5.g
    public Object fold(Object obj, InterfaceC2072n interfaceC2072n) {
        return g.b.a.a(this, obj, interfaceC2072n);
    }

    @Override // U5.g.b, U5.g
    public g.b get(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // U5.g.b, U5.g
    public U5.g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // U5.g
    public U5.g plus(U5.g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // U5.g.b
    public g.c getKey() {
        return this;
    }
}
