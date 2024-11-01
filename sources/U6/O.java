package U6;

import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class O implements X {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f10154a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f10155b;

    public O(OutputStream out, a0 timeout) {
        AbstractC3292y.i(out, "out");
        AbstractC3292y.i(timeout, "timeout");
        this.f10154a = out;
        this.f10155b = timeout;
    }

    @Override // U6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10154a.close();
    }

    @Override // U6.X
    public void f(C1449e source, long j8) {
        AbstractC3292y.i(source, "source");
        AbstractC1446b.b(source.E(), 0L, j8);
        while (j8 > 0) {
            this.f10155b.f();
            U u8 = source.f10211a;
            AbstractC3292y.f(u8);
            int min = (int) Math.min(j8, u8.f10170c - u8.f10169b);
            this.f10154a.write(u8.f10168a, u8.f10169b, min);
            u8.f10169b += min;
            long j9 = min;
            j8 -= j9;
            source.B(source.E() - j9);
            if (u8.f10169b == u8.f10170c) {
                source.f10211a = u8.b();
                V.b(u8);
            }
        }
    }

    @Override // U6.X, java.io.Flushable
    public void flush() {
        this.f10154a.flush();
    }

    @Override // U6.X
    public a0 timeout() {
        return this.f10155b;
    }

    public String toString() {
        return "sink(" + this.f10154a + ')';
    }
}
