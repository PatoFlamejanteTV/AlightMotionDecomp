package x0;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class G implements Comparator {
    public static G a(Comparator comparator) {
        if (comparator instanceof G) {
            return (G) comparator;
        }
        return new C4188k(comparator);
    }

    public static G c() {
        return C4175D.f40825a;
    }

    public AbstractC4192o b(Iterable iterable) {
        return AbstractC4192o.A(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public G d() {
        return e(z.b());
    }

    public G e(w0.c cVar) {
        return new C4183f(cVar, this);
    }
}
