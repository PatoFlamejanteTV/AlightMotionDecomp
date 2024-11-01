package Q;

/* renamed from: Q.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1397q {

    /* renamed from: b, reason: collision with root package name */
    private static C1397q f8297b;

    /* renamed from: c, reason: collision with root package name */
    private static final r f8298c = new r(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private r f8299a;

    private C1397q() {
    }

    public static synchronized C1397q b() {
        C1397q c1397q;
        synchronized (C1397q.class) {
            try {
                if (f8297b == null) {
                    f8297b = new C1397q();
                }
                c1397q = f8297b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1397q;
    }

    public r a() {
        return this.f8299a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.f8299a = f8298c;
            return;
        }
        r rVar2 = this.f8299a;
        if (rVar2 != null && rVar2.z() >= rVar.z()) {
            return;
        }
        this.f8299a = rVar;
    }
}
