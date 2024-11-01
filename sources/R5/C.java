package R5;

import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class C extends B {
    public static final void a0(List list) {
        AbstractC3292y.i(list, "<this>");
        Collections.reverse(list);
    }

    public static SortedSet b0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        return (SortedSet) D.S0(iterable, new TreeSet());
    }
}
