package j$.util.function;

import j$.util.Objects;
import java.util.function.Predicate;

/* renamed from: j$.util.function.Predicate$-CC */
/* loaded from: classes2.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new a(2, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 1);
    }
}
