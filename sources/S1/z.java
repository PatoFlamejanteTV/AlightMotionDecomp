package S1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class z extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f9400c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(O1.p.f7041g);
        linkedHashSet.add(O1.p.f7042h);
        linkedHashSet.add(O1.p.f7043i);
        linkedHashSet.add(O1.p.f7048n);
        linkedHashSet.add(O1.p.f7049o);
        linkedHashSet.add(O1.p.f7050p);
        f9400c = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z() {
        super(f9400c);
    }
}
