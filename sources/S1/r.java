package S1;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class r extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f9391c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(O1.p.f7044j);
        linkedHashSet.add(O1.p.f7045k);
        linkedHashSet.add(O1.p.f7046l);
        linkedHashSet.add(O1.p.f7047m);
        f9391c = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r(O1.p pVar) {
        super(new HashSet(Collections.singletonList(pVar)));
        if (f9391c.contains(pVar)) {
            return;
        }
        throw new O1.f("Unsupported EC DSA algorithm: " + pVar);
    }

    public O1.p h() {
        return (O1.p) g().iterator().next();
    }
}
