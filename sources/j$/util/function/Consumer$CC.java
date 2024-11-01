package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.t;
import java.util.function.Consumer;

/* renamed from: j$.util.function.Consumer$-CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Consumer$CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new t(3, consumer, consumer2);
    }
}
