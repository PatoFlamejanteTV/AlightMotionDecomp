package U6;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1456l implements X {

    /* renamed from: a, reason: collision with root package name */
    private final X f10248a;

    public AbstractC1456l(X delegate) {
        AbstractC3292y.i(delegate, "delegate");
        this.f10248a = delegate;
    }

    @Override // U6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10248a.close();
    }

    @Override // U6.X
    public void f(C1449e source, long j8) {
        AbstractC3292y.i(source, "source");
        this.f10248a.f(source, j8);
    }

    @Override // U6.X, java.io.Flushable
    public void flush() {
        this.f10248a.flush();
    }

    @Override // U6.X
    public a0 timeout() {
        return this.f10248a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f10248a + ')';
    }
}
