package U5;

import U5.g;
import c6.InterfaceC2072n;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class c implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final g f10143a;

    /* renamed from: b, reason: collision with root package name */
    private final g.b f10144b;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10145a = new a();

        a() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            AbstractC3292y.i(acc, "acc");
            AbstractC3292y.i(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        AbstractC3292y.i(left, "left");
        AbstractC3292y.i(element, "element");
        this.f10143a = left;
        this.f10144b = element;
    }

    private final boolean c(g.b bVar) {
        return AbstractC3292y.d(get(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (c(cVar.f10144b)) {
            g gVar = cVar.f10143a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                AbstractC3292y.g(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((g.b) gVar);
            }
        }
        return false;
    }

    private final int e() {
        int i8 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f10143a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return i8;
            }
            i8++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // U5.g
    public Object fold(Object obj, InterfaceC2072n operation) {
        AbstractC3292y.i(operation, "operation");
        return operation.invoke(this.f10143a.fold(obj, operation), this.f10144b);
    }

    @Override // U5.g
    public g.b get(g.c key) {
        AbstractC3292y.i(key, "key");
        c cVar = this;
        while (true) {
            g.b bVar = cVar.f10144b.get(key);
            if (bVar != null) {
                return bVar;
            }
            g gVar = cVar.f10143a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                return gVar.get(key);
            }
        }
    }

    public int hashCode() {
        return this.f10143a.hashCode() + this.f10144b.hashCode();
    }

    @Override // U5.g
    public g minusKey(g.c key) {
        AbstractC3292y.i(key, "key");
        if (this.f10144b.get(key) != null) {
            return this.f10143a;
        }
        g minusKey = this.f10143a.minusKey(key);
        if (minusKey == this.f10143a) {
            return this;
        }
        if (minusKey == h.f10149a) {
            return this.f10144b;
        }
        return new c(minusKey, this.f10144b);
    }

    @Override // U5.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f10145a)) + ']';
    }
}
