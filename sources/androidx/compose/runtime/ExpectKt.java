package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class ExpectKt {
    public static final <T> ThreadLocal<T> ThreadLocal() {
        return new ThreadLocal<>(ExpectKt$ThreadLocal$1.INSTANCE);
    }

    public static final int postIncrement(AtomicInt atomicInt) {
        return atomicInt.add(1) - 1;
    }
}
