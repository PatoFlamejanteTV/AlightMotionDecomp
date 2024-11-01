package x0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import x0.AbstractC4193p;
import x0.AbstractC4194q;

/* renamed from: x0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4195s extends AbstractC4194q implements InterfaceC4172A {

    /* renamed from: c, reason: collision with root package name */
    private final transient r f40923c;

    /* renamed from: x0.s$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4194q.a {
        public C4195s a() {
            Collection entrySet = this.f40919a.entrySet();
            Comparator comparator = this.f40920b;
            if (comparator != null) {
                entrySet = G.a(comparator).d().b(entrySet);
            }
            return C4195s.e(entrySet, this.f40921c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4195s(AbstractC4193p abstractC4193p, int i8, Comparator comparator) {
        super(abstractC4193p, i8);
        this.f40923c = d(comparator);
    }

    private static r d(Comparator comparator) {
        if (comparator == null) {
            return r.t();
        }
        return AbstractC4196t.F(comparator);
    }

    static C4195s e(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return f();
        }
        AbstractC4193p.a aVar = new AbstractC4193p.a(collection.size());
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            r g8 = g(comparator, (Collection) entry.getValue());
            if (!g8.isEmpty()) {
                aVar.e(key, g8);
                i8 += g8.size();
            }
        }
        return new C4195s(aVar.b(), i8, comparator);
    }

    public static C4195s f() {
        return C4189l.f40894d;
    }

    private static r g(Comparator comparator, Collection collection) {
        if (comparator == null) {
            return r.o(collection);
        }
        return AbstractC4196t.C(comparator, collection);
    }
}
