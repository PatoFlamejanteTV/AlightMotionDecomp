package F1;

import C1.n;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f2107c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f2108a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f2109b = new ArrayList();

    private c() {
    }

    public static c e() {
        return f2107c;
    }

    public Collection a() {
        return DesugarCollections.unmodifiableCollection(this.f2109b);
    }

    public void b(n nVar) {
        this.f2108a.add(nVar);
    }

    public Collection c() {
        return DesugarCollections.unmodifiableCollection(this.f2108a);
    }

    public void d(n nVar) {
        boolean g8 = g();
        this.f2108a.remove(nVar);
        this.f2109b.remove(nVar);
        if (g8 && !g()) {
            h.d().f();
        }
    }

    public void f(n nVar) {
        boolean g8 = g();
        this.f2109b.add(nVar);
        if (!g8) {
            h.d().e();
        }
    }

    public boolean g() {
        if (this.f2109b.size() > 0) {
            return true;
        }
        return false;
    }
}
