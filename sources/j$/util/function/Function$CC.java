package j$.util.function;

import j$.util.Objects;
import java.util.function.Function;

/* renamed from: j$.util.function.Function$-CC */
/* loaded from: classes2.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$andThen(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new d(function, function2, 0);
    }

    public static Function $default$compose(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new d(function, function2, 1);
    }
}
