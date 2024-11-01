package B2;

import R5.AbstractC1435t;
import R5.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import x2.C4213g;

/* loaded from: classes4.dex */
public abstract class q {
    public static final Map a(D6.i iVar) {
        AbstractC3292y.i(iVar, "<this>");
        if (iVar instanceof D6.v) {
            return b((D6.v) iVar);
        }
        String simpleName = iVar.getClass().getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        throw new C4213g(simpleName);
    }

    public static final Map b(D6.v vVar) {
        AbstractC3292y.i(vVar, "<this>");
        ArrayList arrayList = new ArrayList(vVar.size());
        for (Map.Entry<String, D6.i> entry : vVar.entrySet()) {
            arrayList.add(Q5.x.a(entry.getKey(), c(entry.getValue())));
        }
        return Q.u(arrayList);
    }

    public static final Object c(D6.i iVar) {
        AbstractC3292y.i(iVar, "<this>");
        if (AbstractC3292y.d(iVar, D6.t.INSTANCE)) {
            return null;
        }
        if (iVar instanceof D6.b) {
            return d((D6.b) iVar);
        }
        if (iVar instanceof D6.v) {
            return b((D6.v) iVar);
        }
        if (iVar instanceof D6.x) {
            return new l6.j("^\"|\"$").f(((D6.x) iVar).c(), "");
        }
        throw new Q5.p();
    }

    public static final List d(D6.b bVar) {
        AbstractC3292y.i(bVar, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(bVar, 10));
        Iterator<D6.i> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next()));
        }
        return arrayList;
    }
}
