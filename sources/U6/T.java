package U6;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class T implements InterfaceC1451g {

    /* renamed from: a, reason: collision with root package name */
    public final Z f10163a;

    /* renamed from: b, reason: collision with root package name */
    public final C1449e f10164b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10165c;

    public T(Z source) {
        AbstractC3292y.i(source, "source");
        this.f10163a = source;
        this.f10164b = new C1449e();
    }

    public boolean a(long j8, C1452h bytes, int i8, int i9) {
        AbstractC3292y.i(bytes, "bytes");
        if (!this.f10165c) {
            if (j8 >= 0 && i8 >= 0 && i9 >= 0 && bytes.J() - i8 >= i9) {
                for (int i10 = 0; i10 < i9; i10++) {
                    long j9 = i10 + j8;
                    if (request(1 + j9) && this.f10164b.k(j9) == bytes.h(i8 + i10)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.InterfaceC1451g
    public C1449e buffer() {
        return this.f10164b;
    }

    @Override // U6.InterfaceC1451g
    public boolean c(long j8, C1452h bytes) {
        AbstractC3292y.i(bytes, "bytes");
        return a(j8, bytes, 0, bytes.J());
    }

    @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f10165c) {
            this.f10165c = true;
            this.f10163a.close();
            this.f10164b.a();
        }
    }

    @Override // U6.InterfaceC1451g
    public boolean exhausted() {
        if (!this.f10165c) {
            if (this.f10164b.exhausted() && this.f10163a.m(this.f10164b, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long indexOf(byte b9) {
        return indexOf(b9, 0L, Long.MAX_VALUE);
    }

    @Override // U6.InterfaceC1451g
    public InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f10165c;
    }

    @Override // U6.InterfaceC1451g
    public C1449e l() {
        return this.f10164b;
    }

    @Override // U6.Z
    public long m(C1449e sink, long j8) {
        AbstractC3292y.i(sink, "sink");
        if (j8 >= 0) {
            if (!this.f10165c) {
                if (this.f10164b.E() == 0 && this.f10163a.m(this.f10164b, 8192L) == -1) {
                    return -1L;
                }
                return this.f10164b.m(sink, Math.min(j8, this.f10164b.E()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC3292y.i(sink, "sink");
        if (this.f10164b.E() == 0 && this.f10163a.m(this.f10164b, 8192L) == -1) {
            return -1;
        }
        return this.f10164b.read(sink);
    }

    @Override // U6.InterfaceC1451g
    public byte readByte() {
        require(1L);
        return this.f10164b.readByte();
    }

    @Override // U6.InterfaceC1451g
    public byte[] readByteArray() {
        this.f10164b.L(this.f10163a);
        return this.f10164b.readByteArray();
    }

    @Override // U6.InterfaceC1451g
    public C1452h readByteString(long j8) {
        require(j8);
        return this.f10164b.readByteString(j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:            if (r4 == 0) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:            r1 = new java.lang.StringBuilder();        r1.append("Expected a digit or '-' but was 0x");        r2 = java.lang.Integer.toString(r8, l6.AbstractC3335a.a(l6.AbstractC3335a.a(16)));        kotlin.jvm.internal.AbstractC3292y.h(r2, "toString(this, checkRadix(radix))");        r1.append(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:            throw new java.lang.NumberFormatException(r1.toString());     */
    @Override // U6.InterfaceC1451g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() {
        /*
            r10 = this;
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L56
            U6.e r8 = r10.f10164b
            byte r8 = r8.k(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L29
            r4 = 45
            if (r8 == r4) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r9 == 0) goto L2c
            goto L56
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = l6.AbstractC3335a.a(r2)
            int r2 = l6.AbstractC3335a.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L56:
            U6.e r0 = r10.f10164b
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U6.T.readDecimalLong():long");
    }

    @Override // U6.InterfaceC1451g
    public void readFully(byte[] sink) {
        AbstractC3292y.i(sink, "sink");
        try {
            require(sink.length);
            this.f10164b.readFully(sink);
        } catch (EOFException e8) {
            int i8 = 0;
            while (this.f10164b.E() > 0) {
                C1449e c1449e = this.f10164b;
                int read = c1449e.read(sink, i8, (int) c1449e.E());
                if (read != -1) {
                    i8 += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:            if (r0 == 0) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:            r1 = new java.lang.StringBuilder();        r1.append("Expected leading [0-9a-fA-F] character but was 0x");        r2 = java.lang.Integer.toString(r2, l6.AbstractC3335a.a(l6.AbstractC3335a.a(16)));        kotlin.jvm.internal.AbstractC3292y.h(r2, "toString(this, checkRadix(radix))");        r1.append(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:            throw new java.lang.NumberFormatException(r1.toString());     */
    @Override // U6.InterfaceC1451g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() {
        /*
            r5 = this;
            r0 = 1
            r5.require(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L5e
            U6.e r2 = r5.f10164b
            long r3 = (long) r0
            byte r2 = r2.k(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5e
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = l6.AbstractC3335a.a(r3)
            int r3 = l6.AbstractC3335a.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            U6.e r0 = r5.f10164b
            long r0 = r0.readHexadecimalUnsignedLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U6.T.readHexadecimalUnsignedLong():long");
    }

    @Override // U6.InterfaceC1451g
    public int readInt() {
        require(4L);
        return this.f10164b.readInt();
    }

    @Override // U6.InterfaceC1451g
    public int readIntLe() {
        require(4L);
        return this.f10164b.readIntLe();
    }

    @Override // U6.InterfaceC1451g
    public long readLongLe() {
        require(8L);
        return this.f10164b.readLongLe();
    }

    @Override // U6.InterfaceC1451g
    public short readShort() {
        require(2L);
        return this.f10164b.readShort();
    }

    @Override // U6.InterfaceC1451g
    public short readShortLe() {
        require(2L);
        return this.f10164b.readShortLe();
    }

    @Override // U6.InterfaceC1451g
    public String readUtf8(long j8) {
        require(j8);
        return this.f10164b.readUtf8(j8);
    }

    @Override // U6.InterfaceC1451g
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public boolean request(long j8) {
        if (j8 >= 0) {
            if (!(!this.f10165c)) {
                throw new IllegalStateException("closed".toString());
            }
            while (this.f10164b.E() < j8) {
                if (this.f10163a.m(this.f10164b, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    @Override // U6.InterfaceC1451g
    public void require(long j8) {
        if (request(j8)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // U6.InterfaceC1451g
    public void skip(long j8) {
        if (!this.f10165c) {
            while (j8 > 0) {
                if (this.f10164b.E() == 0 && this.f10163a.m(this.f10164b, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j8, this.f10164b.E());
                this.f10164b.skip(min);
                j8 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // U6.Z
    public a0 timeout() {
        return this.f10163a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f10163a + ')';
    }

    public long indexOf(byte b9, long j8, long j9) {
        if (!(!this.f10165c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > j8 || j8 > j9) {
            throw new IllegalArgumentException(("fromIndex=" + j8 + " toIndex=" + j9).toString());
        }
        while (j8 < j9) {
            long indexOf = this.f10164b.indexOf(b9, j8, j9);
            if (indexOf != -1) {
                return indexOf;
            }
            long E8 = this.f10164b.E();
            if (E8 >= j9 || this.f10163a.m(this.f10164b, 8192L) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, E8);
        }
        return -1L;
    }

    @Override // U6.InterfaceC1451g
    public String readUtf8LineStrict(long j8) {
        if (j8 >= 0) {
            long j9 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
            long indexOf = indexOf((byte) 10, 0L, j9);
            if (indexOf != -1) {
                return V6.a.b(this.f10164b, indexOf);
            }
            if (j9 < Long.MAX_VALUE && request(j9) && this.f10164b.k(j9 - 1) == 13 && request(1 + j9) && this.f10164b.k(j9) == 10) {
                return V6.a.b(this.f10164b, j9);
            }
            C1449e c1449e = new C1449e();
            C1449e c1449e2 = this.f10164b;
            c1449e2.i(c1449e, 0L, Math.min(32, c1449e2.E()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f10164b.E(), j8) + " content=" + c1449e.t().n() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j8).toString());
    }

    @Override // U6.InterfaceC1451g
    public byte[] readByteArray(long j8) {
        require(j8);
        return this.f10164b.readByteArray(j8);
    }

    /* loaded from: classes5.dex */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            T t8 = T.this;
            if (!t8.f10165c) {
                return (int) Math.min(t8.f10164b.E(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            T.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            T t8 = T.this;
            if (!t8.f10165c) {
                if (t8.f10164b.E() == 0) {
                    T t9 = T.this;
                    if (t9.f10163a.m(t9.f10164b, 8192L) == -1) {
                        return -1;
                    }
                }
                return T.this.f10164b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return T.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i8, int i9) {
            AbstractC3292y.i(data, "data");
            if (!T.this.f10165c) {
                AbstractC1446b.b(data.length, i8, i9);
                if (T.this.f10164b.E() == 0) {
                    T t8 = T.this;
                    if (t8.f10163a.m(t8.f10164b, 8192L) == -1) {
                        return -1;
                    }
                }
                return T.this.f10164b.read(data, i8, i9);
            }
            throw new IOException("closed");
        }
    }
}
