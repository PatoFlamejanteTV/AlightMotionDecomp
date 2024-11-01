package j$.util;

import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Comparator$CC {
    public static Comparator a() {
        return EnumC3000f.INSTANCE;
    }

    public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> function, Comparator<? super U> comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return new C2996c(comparator, function, 1);
    }
}
