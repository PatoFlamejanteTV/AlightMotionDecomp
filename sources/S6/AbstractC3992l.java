package s6;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3992l {
    public static /* synthetic */ Object b(Object obj, int i8, AbstractC3284p abstractC3284p) {
        if ((i8 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, Object obj2) {
        if (obj == null) {
            return a(obj2);
        }
        if (obj instanceof ArrayList) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return a(arrayList);
    }

    public static Object a(Object obj) {
        return obj;
    }
}
