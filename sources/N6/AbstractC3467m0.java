package n6;

import java.util.concurrent.CancellationException;

/* renamed from: n6.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3467m0 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
