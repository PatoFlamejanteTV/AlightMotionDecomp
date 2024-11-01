package j$.util.function;

import j$.util.Objects;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.DoubleUnaryOperator$-CC */
/* loaded from: classes2.dex */
public final /* synthetic */ class DoubleUnaryOperator$CC {
    public static DoubleUnaryOperator $default$andThen(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        Objects.requireNonNull(doubleUnaryOperator2);
        return new c(doubleUnaryOperator, doubleUnaryOperator2, 1);
    }

    public static DoubleUnaryOperator $default$compose(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        Objects.requireNonNull(doubleUnaryOperator2);
        return new c(doubleUnaryOperator, doubleUnaryOperator2, 0);
    }
}
