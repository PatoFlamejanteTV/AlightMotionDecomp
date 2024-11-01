package androidx.core.util;

import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* loaded from: classes3.dex */
public final class ConsumerKt {
    @RequiresApi(24)
    public static final <T> java.util.function.Consumer<T> asConsumer(U5.d dVar) {
        return new ContinuationConsumer(dVar);
    }
}
