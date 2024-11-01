package w;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4138a implements N5.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f40646c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile N5.a f40647a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f40648b = f40646c;

    private C4138a(N5.a aVar) {
        this.f40647a = aVar;
    }

    public static N5.a a(N5.a aVar) {
        d.b(aVar);
        if (aVar instanceof C4138a) {
            return aVar;
        }
        return new C4138a(aVar);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj != f40646c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // N5.a
    public Object get() {
        Object obj = this.f40648b;
        Object obj2 = f40646c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f40648b;
                    if (obj == obj2) {
                        obj = this.f40647a.get();
                        this.f40648b = b(this.f40648b, obj);
                        this.f40647a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
