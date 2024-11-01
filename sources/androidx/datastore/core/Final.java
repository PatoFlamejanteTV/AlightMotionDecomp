package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class Final<T> extends State<T> {
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        AbstractC3292y.i(finalException, "finalException");
        this.finalException = finalException;
    }

    public final Throwable getFinalException() {
        return this.finalException;
    }
}
