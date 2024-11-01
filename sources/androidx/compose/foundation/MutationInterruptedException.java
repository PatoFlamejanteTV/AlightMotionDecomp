package androidx.compose.foundation;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class MutationInterruptedException extends CancellationException {
    public MutationInterruptedException() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
