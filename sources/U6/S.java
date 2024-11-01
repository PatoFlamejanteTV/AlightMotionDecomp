package U6;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class S implements InterfaceC1450f {

    /* renamed from: a, reason: collision with root package name */
    public final X f10159a;

    /* renamed from: b, reason: collision with root package name */
    public final C1449e f10160b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10161c;

    public S(X sink) {
        AbstractC3292y.i(sink, "sink");
        this.f10159a = sink;
        this.f10160b = new C1449e();
    }

    @Override // U6.InterfaceC1450f
    public C1449e buffer() {
        return this.f10160b;
    }

    @Override // U6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f10161c) {
            try {
                if (this.f10160b.E() > 0) {
                    X x8 = this.f10159a;
                    C1449e c1449e = this.f10160b;
                    x8.f(c1449e, c1449e.E());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f10159a.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f10161c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // U6.InterfaceC1450f
    public InterfaceC1450f emitCompleteSegments() {
        if (!this.f10161c) {
            long g8 = this.f10160b.g();
            if (g8 > 0) {
                this.f10159a.f(this.f10160b, g8);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.X
    public void f(C1449e source, long j8) {
        AbstractC3292y.i(source, "source");
        if (!this.f10161c) {
            this.f10160b.f(source, j8);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.InterfaceC1450f, U6.X, java.io.Flushable
    public void flush() {
        if (!this.f10161c) {
            if (this.f10160b.E() > 0) {
                X x8 = this.f10159a;
                C1449e c1449e = this.f10160b;
                x8.f(c1449e, c1449e.E());
            }
            this.f10159a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f10161c;
    }

    @Override // U6.InterfaceC1450f
    public OutputStream outputStream() {
        return new a();
    }

    @Override // U6.X
    public a0 timeout() {
        return this.f10159a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f10159a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC3292y.i(source, "source");
        if (!this.f10161c) {
            int write = this.f10160b.write(source);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.InterfaceC1450f
    public InterfaceC1450f writeByte(int i8) {
        if (!this.f10161c) {
            this.f10160b.writeByte(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.InterfaceC1450f
    public InterfaceC1450f writeDecimalLong(long j8) {
        if (!this.f10161c) {
            this.f10160b.writeDecimalLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.InterfaceC1450f
    public InterfaceC1450f writeHexadecimalUnsignedLong(long j8) {
        if (!this.f10161c) {
            this.f10160b.writeHexadecimalUnsignedLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.InterfaceC1450f
    public InterfaceC1450f writeInt(int i8) {
        if (!this.f10161c) {
            this.f10160b.writeInt(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.InterfaceC1450f
    public InterfaceC1450f writeShort(int i8) {
        if (!this.f10161c) {
            this.f10160b.writeShort(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.InterfaceC1450f
    public InterfaceC1450f writeUtf8(String string) {
        AbstractC3292y.i(string, "string");
        if (!this.f10161c) {
            this.f10160b.writeUtf8(string);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* loaded from: classes5.dex */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            S.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            S s8 = S.this;
            if (!s8.f10161c) {
                s8.flush();
            }
        }

        public String toString() {
            return S.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            S s8 = S.this;
            if (!s8.f10161c) {
                s8.f10160b.writeByte((byte) i8);
                S.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i8, int i9) {
            AbstractC3292y.i(data, "data");
            S s8 = S.this;
            if (!s8.f10161c) {
                s8.f10160b.write(data, i8, i9);
                S.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // U6.InterfaceC1450f
    public InterfaceC1450f write(byte[] source) {
        AbstractC3292y.i(source, "source");
        if (!this.f10161c) {
            this.f10160b.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.InterfaceC1450f
    public InterfaceC1450f write(byte[] source, int i8, int i9) {
        AbstractC3292y.i(source, "source");
        if (!this.f10161c) {
            this.f10160b.write(source, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }
}
