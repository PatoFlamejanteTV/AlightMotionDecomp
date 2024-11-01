package U6;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1457m implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final Z f10249a;

    public AbstractC1457m(Z delegate) {
        AbstractC3292y.i(delegate, "delegate");
        this.f10249a = delegate;
    }

    public final Z a() {
        return this.f10249a;
    }

    @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10249a.close();
    }

    @Override // U6.Z
    public long m(C1449e sink, long j8) {
        AbstractC3292y.i(sink, "sink");
        return this.f10249a.m(sink, j8);
    }

    @Override // U6.Z
    public a0 timeout() {
        return this.f10249a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f10249a + ')';
    }
}
