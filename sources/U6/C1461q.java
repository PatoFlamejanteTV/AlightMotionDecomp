package U6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: U6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1461q implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f10260a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f10261b;

    public C1461q(InputStream input, a0 timeout) {
        AbstractC3292y.i(input, "input");
        AbstractC3292y.i(timeout, "timeout");
        this.f10260a = input;
        this.f10261b = timeout;
    }

    @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10260a.close();
    }

    @Override // U6.Z
    public long m(C1449e sink, long j8) {
        AbstractC3292y.i(sink, "sink");
        if (j8 == 0) {
            return 0L;
        }
        if (j8 >= 0) {
            try {
                this.f10261b.f();
                U H8 = sink.H(1);
                int read = this.f10260a.read(H8.f10168a, H8.f10170c, (int) Math.min(j8, 8192 - H8.f10170c));
                if (read == -1) {
                    if (H8.f10169b == H8.f10170c) {
                        sink.f10211a = H8.b();
                        V.b(H8);
                        return -1L;
                    }
                    return -1L;
                }
                H8.f10170c += read;
                long j9 = read;
                sink.B(sink.E() + j9);
                return j9;
            } catch (AssertionError e8) {
                if (L.e(e8)) {
                    throw new IOException(e8);
                }
                throw e8;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    @Override // U6.Z
    public a0 timeout() {
        return this.f10261b;
    }

    public String toString() {
        return "source(" + this.f10260a + ')';
    }
}
