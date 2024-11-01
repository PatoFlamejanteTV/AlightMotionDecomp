package U5;

import U5.g;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class a implements g.b {
    private final g.c key;

    public a(g.c key) {
        AbstractC3292y.i(key, "key");
        this.key = key;
    }

    @Override // U5.g.b, U5.g
    public <R> R fold(R r8, InterfaceC2072n interfaceC2072n) {
        return (R) g.b.a.a(this, r8, interfaceC2072n);
    }

    @Override // U5.g.b, U5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // U5.g.b
    public g.c getKey() {
        return this.key;
    }

    @Override // U5.g.b, U5.g
    public g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // U5.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
