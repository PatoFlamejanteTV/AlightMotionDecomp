package n6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n6.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3490y0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC3488x0 f35759a;

    public C3490y0(String str, Throwable th, InterfaceC3488x0 interfaceC3488x0) {
        super(str);
        this.f35759a = interfaceC3488x0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C3490y0) {
                C3490y0 c3490y0 = (C3490y0) obj;
                if (!AbstractC3292y.d(c3490y0.getMessage(), getMessage()) || !AbstractC3292y.d(c3490y0.f35759a, this.f35759a) || !AbstractC3292y.d(c3490y0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i8;
        String message = getMessage();
        AbstractC3292y.f(message);
        int hashCode = ((message.hashCode() * 31) + this.f35759a.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i8 = cause.hashCode();
        } else {
            i8 = 0;
        }
        return hashCode + i8;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f35759a;
    }
}
