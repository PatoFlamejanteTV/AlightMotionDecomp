package s6;

import U5.g;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import n6.V0;

/* loaded from: classes5.dex */
public final class K implements V0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39176a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal f39177b;

    /* renamed from: c, reason: collision with root package name */
    private final g.c f39178c;

    public K(Object obj, ThreadLocal threadLocal) {
        this.f39176a = obj;
        this.f39177b = threadLocal;
        this.f39178c = new L(threadLocal);
    }

    @Override // U5.g.b, U5.g
    public Object fold(Object obj, InterfaceC2072n interfaceC2072n) {
        return V0.a.a(this, obj, interfaceC2072n);
    }

    @Override // U5.g.b, U5.g
    public g.b get(g.c cVar) {
        if (AbstractC3292y.d(getKey(), cVar)) {
            AbstractC3292y.g(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            return this;
        }
        return null;
    }

    @Override // U5.g.b
    public g.c getKey() {
        return this.f39178c;
    }

    @Override // U5.g.b, U5.g
    public U5.g minusKey(g.c cVar) {
        if (AbstractC3292y.d(getKey(), cVar)) {
            return U5.h.f10149a;
        }
        return this;
    }

    @Override // U5.g
    public U5.g plus(U5.g gVar) {
        return V0.a.b(this, gVar);
    }

    @Override // n6.V0
    public void restoreThreadContext(U5.g gVar, Object obj) {
        this.f39177b.set(obj);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f39176a + ", threadLocal = " + this.f39177b + ')';
    }

    @Override // n6.V0
    public Object updateThreadContext(U5.g gVar) {
        Object obj = this.f39177b.get();
        this.f39177b.set(this.f39176a);
        return obj;
    }
}
