package r6;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class j extends CancellationException {
    public j() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
