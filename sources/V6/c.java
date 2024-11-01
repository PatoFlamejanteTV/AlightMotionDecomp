package V6;

import R5.C1427k;
import U6.AbstractC1455k;
import U6.Q;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class c {
    public static final void a(AbstractC1455k abstractC1455k, Q dir, boolean z8) {
        AbstractC3292y.i(abstractC1455k, "<this>");
        AbstractC3292y.i(dir, "dir");
        C1427k c1427k = new C1427k();
        for (Q q8 = dir; q8 != null && !abstractC1455k.g(q8); q8 = q8.i()) {
            c1427k.c(q8);
        }
        if (z8 && c1427k.isEmpty()) {
            throw new IOException(dir + " already exist.");
        }
        Iterator<E> it = c1427k.iterator();
        while (it.hasNext()) {
            abstractC1455k.c((Q) it.next());
        }
    }

    public static final boolean b(AbstractC1455k abstractC1455k, Q path) {
        AbstractC3292y.i(abstractC1455k, "<this>");
        AbstractC3292y.i(path, "path");
        if (abstractC1455k.h(path) != null) {
            return true;
        }
        return false;
    }
}
