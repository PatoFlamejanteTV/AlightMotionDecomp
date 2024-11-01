package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int $stable = 0;

    public PointerEventTimeoutCancellationException(long j8) {
        super("Timed out waiting for " + j8 + " ms");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
