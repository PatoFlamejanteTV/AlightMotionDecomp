package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ReadException<T> extends State<T> {
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable readException, int i8) {
        super(i8, null);
        AbstractC3292y.i(readException, "readException");
        this.readException = readException;
    }

    public final Throwable getReadException() {
        return this.readException;
    }
}
