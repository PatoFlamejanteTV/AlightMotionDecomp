package U6;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1459o implements Z {

    /* renamed from: a, reason: collision with root package name */
    private byte f10251a;

    /* renamed from: b, reason: collision with root package name */
    private final T f10252b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f10253c;

    /* renamed from: d, reason: collision with root package name */
    private final C1460p f10254d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f10255e;

    public C1459o(Z source) {
        AbstractC3292y.i(source, "source");
        T t8 = new T(source);
        this.f10252b = t8;
        Inflater inflater = new Inflater(true);
        this.f10253c = inflater;
        this.f10254d = new C1460p((InterfaceC1451g) t8, inflater);
        this.f10255e = new CRC32();
    }

    private final void a(String str, int i8, int i9) {
        if (i9 == i8) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i9), Integer.valueOf(i8)}, 3));
        AbstractC3292y.h(format, "format(this, *args)");
        throw new IOException(format);
    }

    private final void b() {
        boolean z8;
        this.f10252b.require(10L);
        byte k8 = this.f10252b.f10164b.k(3L);
        if (((k8 >> 1) & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            h(this.f10252b.f10164b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f10252b.readShort());
        this.f10252b.skip(8L);
        if (((k8 >> 2) & 1) == 1) {
            this.f10252b.require(2L);
            if (z8) {
                h(this.f10252b.f10164b, 0L, 2L);
            }
            long readShortLe = this.f10252b.f10164b.readShortLe() & 65535;
            this.f10252b.require(readShortLe);
            if (z8) {
                h(this.f10252b.f10164b, 0L, readShortLe);
            }
            this.f10252b.skip(readShortLe);
        }
        if (((k8 >> 3) & 1) == 1) {
            long indexOf = this.f10252b.indexOf((byte) 0);
            if (indexOf != -1) {
                if (z8) {
                    h(this.f10252b.f10164b, 0L, indexOf + 1);
                }
                this.f10252b.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((k8 >> 4) & 1) == 1) {
            long indexOf2 = this.f10252b.indexOf((byte) 0);
            if (indexOf2 != -1) {
                if (z8) {
                    h(this.f10252b.f10164b, 0L, indexOf2 + 1);
                }
                this.f10252b.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z8) {
            a("FHCRC", this.f10252b.readShortLe(), (short) this.f10255e.getValue());
            this.f10255e.reset();
        }
    }

    private final void g() {
        a("CRC", this.f10252b.readIntLe(), (int) this.f10255e.getValue());
        a("ISIZE", this.f10252b.readIntLe(), (int) this.f10253c.getBytesWritten());
    }

    private final void h(C1449e c1449e, long j8, long j9) {
        U u8 = c1449e.f10211a;
        AbstractC3292y.f(u8);
        while (true) {
            int i8 = u8.f10170c;
            int i9 = u8.f10169b;
            if (j8 < i8 - i9) {
                break;
            }
            j8 -= i8 - i9;
            u8 = u8.f10173f;
            AbstractC3292y.f(u8);
        }
        while (j9 > 0) {
            int min = (int) Math.min(u8.f10170c - r7, j9);
            this.f10255e.update(u8.f10168a, (int) (u8.f10169b + j8), min);
            j9 -= min;
            u8 = u8.f10173f;
            AbstractC3292y.f(u8);
            j8 = 0;
        }
    }

    @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10254d.close();
    }

    @Override // U6.Z
    public long m(C1449e sink, long j8) {
        AbstractC3292y.i(sink, "sink");
        if (j8 >= 0) {
            if (j8 == 0) {
                return 0L;
            }
            if (this.f10251a == 0) {
                b();
                this.f10251a = (byte) 1;
            }
            if (this.f10251a == 1) {
                long E8 = sink.E();
                long m8 = this.f10254d.m(sink, j8);
                if (m8 != -1) {
                    h(sink, E8, m8);
                    return m8;
                }
                this.f10251a = (byte) 2;
            }
            if (this.f10251a == 2) {
                g();
                this.f10251a = (byte) 3;
                if (!this.f10252b.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    @Override // U6.Z
    public a0 timeout() {
        return this.f10252b.timeout();
    }
}
