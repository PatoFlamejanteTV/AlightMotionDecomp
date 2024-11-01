package androidx.compose.runtime.collection;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class IdentityArraySetKt {
    public static final <T> void fastForEach(Set<? extends T> set, Function1 function1) {
        if (set instanceof IdentityArraySet) {
            IdentityArraySet identityArraySet = (IdentityArraySet) set;
            Object[] values = identityArraySet.getValues();
            int size = identityArraySet.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = values[i8];
                AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                function1.invoke(obj);
            }
            return;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }
}
