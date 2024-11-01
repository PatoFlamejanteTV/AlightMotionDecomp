package androidx.compose.runtime;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class LeftCompositionCancellationException extends CancellationException {
    public LeftCompositionCancellationException() {
        super("The coroutine scope left the composition");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
