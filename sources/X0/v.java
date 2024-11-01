package x0;

import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class v {
    private static Collection a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return x.g(iterable.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] b(Iterable iterable) {
        return a(iterable).toArray();
    }
}
