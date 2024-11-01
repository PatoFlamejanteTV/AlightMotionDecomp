package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class PointerInputResetException extends CancellationException {
    public PointerInputResetException() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
