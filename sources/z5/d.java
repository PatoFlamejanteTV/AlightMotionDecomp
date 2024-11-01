package z5;

import y5.InterfaceC4247a;

/* loaded from: classes5.dex */
public final class d implements i, InterfaceC4247a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f41555c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile i f41556a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f41557b = f41555c;

    private d(i iVar) {
        this.f41556a = iVar;
    }

    public static InterfaceC4247a a(N5.a aVar) {
        return b(j.a(aVar));
    }

    public static InterfaceC4247a b(i iVar) {
        if (iVar instanceof InterfaceC4247a) {
            return (InterfaceC4247a) iVar;
        }
        return new d((i) h.b(iVar));
    }

    public static i c(i iVar) {
        h.b(iVar);
        if (iVar instanceof d) {
            return iVar;
        }
        return new d(iVar);
    }

    private static Object d(Object obj, Object obj2) {
        if (obj != f41555c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // N5.a
    public Object get() {
        Object obj = this.f41557b;
        Object obj2 = f41555c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f41557b;
                    if (obj == obj2) {
                        obj = this.f41556a.get();
                        this.f41557b = d(this.f41557b, obj);
                        this.f41556a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
