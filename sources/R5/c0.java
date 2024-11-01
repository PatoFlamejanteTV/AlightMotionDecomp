package R5;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c0 extends b0 {
    public static Set f() {
        return I.f9300a;
    }

    public static Set g(Object... elements) {
        AbstractC3292y.i(elements, "elements");
        return (Set) AbstractC1432p.T0(elements, new LinkedHashSet(Q.d(elements.length)));
    }

    public static final Set h(Set set) {
        AbstractC3292y.i(set, "<this>");
        int size = set.size();
        if (size != 0) {
            if (size == 1) {
                return a0.d(set.iterator().next());
            }
            return set;
        }
        return a0.f();
    }

    public static Set i(Object... elements) {
        AbstractC3292y.i(elements, "elements");
        return AbstractC1432p.a1(elements);
    }

    public static Set j(Object obj) {
        if (obj != null) {
            return a0.d(obj);
        }
        return a0.f();
    }

    public static Set k(Object... elements) {
        AbstractC3292y.i(elements, "elements");
        return (Set) AbstractC1432p.a0(elements, new LinkedHashSet());
    }
}
