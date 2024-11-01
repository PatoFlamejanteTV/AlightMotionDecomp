package U6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1460p implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1451g f10256a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f10257b;

    /* renamed from: c, reason: collision with root package name */
    private int f10258c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10259d;

    public C1460p(InterfaceC1451g source, Inflater inflater) {
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(inflater, "inflater");
        this.f10256a = source;
        this.f10257b = inflater;
    }

    private final void g() {
        int i8 = this.f10258c;
        if (i8 == 0) {
            return;
        }
        int remaining = i8 - this.f10257b.getRemaining();
        this.f10258c -= remaining;
        this.f10256a.skip(remaining);
    }

    public final long a(C1449e sink, long j8) {
        AbstractC3292y.i(sink, "sink");
        if (j8 >= 0) {
            if (!this.f10259d) {
                if (j8 == 0) {
                    return 0L;
                }
                try {
                    U H8 = sink.H(1);
                    int min = (int) Math.min(j8, 8192 - H8.f10170c);
                    b();
                    int inflate = this.f10257b.inflate(H8.f10168a, H8.f10170c, min);
                    g();
                    if (inflate > 0) {
                        H8.f10170c += inflate;
                        long j9 = inflate;
                        sink.B(sink.E() + j9);
                        return j9;
                    }
                    if (H8.f10169b == H8.f10170c) {
                        sink.f10211a = H8.b();
                        V.b(H8);
                    }
                    return 0L;
                } catch (DataFormatException e8) {
                    throw new IOException(e8);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    public final boolean b() {
        if (!this.f10257b.needsInput()) {
            return false;
        }
        if (this.f10256a.exhausted()) {
            return true;
        }
        U u8 = this.f10256a.l().f10211a;
        AbstractC3292y.f(u8);
        int i8 = u8.f10170c;
        int i9 = u8.f10169b;
        int i10 = i8 - i9;
        this.f10258c = i10;
        this.f10257b.setInput(u8.f10168a, i9, i10);
        return false;
    }

    @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10259d) {
            return;
        }
        this.f10257b.end();
        this.f10259d = true;
        this.f10256a.close();
    }

    @Override // U6.Z
    public long m(C1449e sink, long j8) {
        AbstractC3292y.i(sink, "sink");
        do {
            long a9 = a(sink, j8);
            if (a9 > 0) {
                return a9;
            }
            if (this.f10257b.finished() || this.f10257b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f10256a.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // U6.Z
    public a0 timeout() {
        return this.f10256a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1460p(Z source, Inflater inflater) {
        this(L.d(source), inflater);
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(inflater, "inflater");
    }
}
