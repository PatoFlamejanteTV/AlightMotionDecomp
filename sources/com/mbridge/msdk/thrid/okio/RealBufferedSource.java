package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Buffer buffer = new Buffer();
    boolean closed;
    public final Source source;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealBufferedSource(Source source) {
        if (source != null) {
            this.source = source;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource, com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.buffer.clear();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean exhausted() throws IOException {
        if (!this.closed) {
            if (this.buffer.exhausted() && this.source.read(this.buffer, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b9) throws IOException {
        return indexOf(b9, 0L, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString) throws IOException {
        return indexOfElement(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.mbridge.msdk.thrid.okio.RealBufferedSource.1
            @Override // java.io.InputStream
            public int available() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (!realBufferedSource.closed) {
                    return (int) Math.min(realBufferedSource.buffer.size, 2147483647L);
                }
                throw new IOException("closed");
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (!realBufferedSource.closed) {
                    Buffer buffer = realBufferedSource.buffer;
                    if (buffer.size == 0 && realBufferedSource.source.read(buffer, 8192L) == -1) {
                        return -1;
                    }
                    return RealBufferedSource.this.buffer.readByte() & 255;
                }
                throw new IOException("closed");
            }

            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i8, int i9) throws IOException {
                if (!RealBufferedSource.this.closed) {
                    Util.checkOffsetAndCount(bArr.length, i8, i9);
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    Buffer buffer = realBufferedSource.buffer;
                    if (buffer.size == 0 && realBufferedSource.source.read(buffer, 8192L) == -1) {
                        return -1;
                    }
                    return RealBufferedSource.this.buffer.read(bArr, i8, i9);
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j8, ByteString byteString) throws IOException {
        return rangeEquals(j8, byteString, 0, byteString.size());
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j8) throws IOException {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j8 >= 0) {
            if (!this.closed) {
                Buffer buffer2 = this.buffer;
                if (buffer2.size == 0 && this.source.read(buffer2, 8192L) == -1) {
                    return -1L;
                }
                return this.buffer.read(buffer, Math.min(j8, this.buffer.size));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("byteCount < 0: " + j8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        if (sink != null) {
            long j8 = 0;
            while (this.source.read(this.buffer, 8192L) != -1) {
                long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
                if (completeSegmentByteCount > 0) {
                    j8 += completeSegmentByteCount;
                    sink.write(this.buffer, completeSegmentByteCount);
                }
            }
            if (this.buffer.size() > 0) {
                long size = j8 + this.buffer.size();
                Buffer buffer = this.buffer;
                sink.write(buffer, buffer.size());
                return size;
            }
            return j8;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte readByte() throws IOException {
        require(1L);
        return this.buffer.readByte();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public ByteString readByteString() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:            if (r2 == 0) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:            throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9] or '-' character but was %#x", java.lang.Byte.valueOf(r4)));     */
    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 1
            r1 = 1
            r7.require(r1)
            r1 = 0
            r2 = 0
        L8:
            int r3 = r2 + 1
            long r4 = (long) r3
            boolean r4 = r7.request(r4)
            if (r4 == 0) goto L40
            com.mbridge.msdk.thrid.okio.Buffer r4 = r7.buffer
            long r5 = (long) r2
            byte r4 = r4.getByte(r5)
            r5 = 48
            if (r4 < r5) goto L20
            r5 = 57
            if (r4 <= r5) goto L27
        L20:
            if (r2 != 0) goto L29
            r5 = 45
            if (r4 == r5) goto L27
            goto L29
        L27:
            r2 = r3
            goto L8
        L29:
            if (r2 == 0) goto L2c
            goto L40
        L2c:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r3
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r2.<init>(r0)
            throw r2
        L40:
            com.mbridge.msdk.thrid.okio.Buffer r0 = r7.buffer
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.RealBufferedSource.readDecimalLong():long");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(byte[] bArr) throws IOException {
        try {
            require(bArr.length);
            this.buffer.readFully(bArr);
        } catch (EOFException e8) {
            int i8 = 0;
            while (true) {
                Buffer buffer = this.buffer;
                long j8 = buffer.size;
                if (j8 > 0) {
                    int read = buffer.read(bArr, i8, (int) j8);
                    if (read == -1) {
                        throw new AssertionError();
                    }
                    i8 += read;
                } else {
                    throw e8;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:            if (r2 == 0) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:            throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r4)));     */
    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 1
            r1 = 1
            r7.require(r1)
            r1 = 0
            r2 = 0
        L8:
            int r3 = r2 + 1
            long r4 = (long) r3
            boolean r4 = r7.request(r4)
            if (r4 == 0) goto L4a
            com.mbridge.msdk.thrid.okio.Buffer r4 = r7.buffer
            long r5 = (long) r2
            byte r4 = r4.getByte(r5)
            r5 = 48
            if (r4 < r5) goto L20
            r5 = 57
            if (r4 <= r5) goto L31
        L20:
            r5 = 97
            if (r4 < r5) goto L28
            r5 = 102(0x66, float:1.43E-43)
            if (r4 <= r5) goto L31
        L28:
            r5 = 65
            if (r4 < r5) goto L33
            r5 = 70
            if (r4 <= r5) goto L31
            goto L33
        L31:
            r2 = r3
            goto L8
        L33:
            if (r2 == 0) goto L36
            goto L4a
        L36:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r3
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r2.<init>(r0)
            throw r2
        L4a:
            com.mbridge.msdk.thrid.okio.Buffer r0 = r7.buffer
            long r0 = r0.readHexadecimalUnsignedLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.RealBufferedSource.readHexadecimalUnsignedLong():long");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readInt() throws IOException {
        require(4L);
        return this.buffer.readInt();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readIntLe() throws IOException {
        require(4L);
        return this.buffer.readIntLe();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLong() throws IOException {
        require(8L);
        return this.buffer.readLong();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLongLe() throws IOException {
        require(8L);
        return this.buffer.readLongLe();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public short readShort() throws IOException {
        require(2L);
        return this.buffer.readShort();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public short readShortLe() throws IOException {
        require(2L);
        return this.buffer.readShortLe();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(Charset charset) throws IOException {
        if (charset != null) {
            this.buffer.writeAll(this.source);
            return this.buffer.readString(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readUtf8CodePoint() throws IOException {
        require(1L);
        byte b9 = this.buffer.getByte(0L);
        if ((b9 & 224) == 192) {
            require(2L);
        } else if ((b9 & 240) == 224) {
            require(3L);
        } else if ((b9 & 248) == 240) {
            require(4L);
        }
        return this.buffer.readUtf8CodePoint();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws IOException {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            long j8 = this.buffer.size;
            if (j8 != 0) {
                return readUtf8(j8);
            }
            return null;
        }
        return this.buffer.readUtf8Line(indexOf);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8LineStrict() throws IOException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean request(long j8) throws IOException {
        Buffer buffer;
        if (j8 >= 0) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            do {
                buffer = this.buffer;
                if (buffer.size >= j8) {
                    return true;
                }
            } while (this.source.read(buffer, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void require(long j8) throws IOException {
        if (request(j8)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int select(Options options) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int selectPrefix = this.buffer.selectPrefix(options, true);
            if (selectPrefix == -1) {
                return -1;
            }
            if (selectPrefix != -2) {
                this.buffer.skip(options.byteStrings[selectPrefix].size());
                return selectPrefix;
            }
        } while (this.source.read(this.buffer, 8192L) != -1);
        return -1;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void skip(long j8) throws IOException {
        if (!this.closed) {
            while (j8 > 0) {
                Buffer buffer = this.buffer;
                if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j8, this.buffer.size());
                this.buffer.skip(min);
                j8 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    public String toString() {
        return "buffer(" + this.source + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b9, long j8) throws IOException {
        return indexOf(b9, j8, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j8) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = this.buffer.indexOfElement(byteString, j8);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            Buffer buffer = this.buffer;
            long j9 = buffer.size;
            if (this.source.read(buffer, 8192L) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, j9);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j8, ByteString byteString, int i8, int i9) throws IOException {
        if (!this.closed) {
            if (j8 < 0 || i8 < 0 || i9 < 0 || byteString.size() - i8 < i9) {
                return false;
            }
            for (int i10 = 0; i10 < i9; i10++) {
                long j9 = i10 + j8;
                if (!request(1 + j9) || this.buffer.getByte(j9) != byteString.getByte(i8 + i10)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8LineStrict(long j8) throws IOException {
        if (j8 >= 0) {
            long j9 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
            long indexOf = indexOf((byte) 10, 0L, j9);
            if (indexOf != -1) {
                return this.buffer.readUtf8Line(indexOf);
            }
            if (j9 < Long.MAX_VALUE && request(j9) && this.buffer.getByte(j9 - 1) == 13 && request(1 + j9) && this.buffer.getByte(j9) == 10) {
                return this.buffer.readUtf8Line(j9);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.buffer;
            buffer2.copyTo(buffer, 0L, Math.min(32L, buffer2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.buffer.size(), j8) + " content=" + buffer.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b9, long j8, long j9) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j8 < 0 || j9 < j8) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j8), Long.valueOf(j9)));
        }
        while (j8 < j9) {
            long indexOf = this.buffer.indexOf(b9, j8, j9);
            if (indexOf == -1) {
                Buffer buffer = this.buffer;
                long j10 = buffer.size;
                if (j10 >= j9 || this.source.read(buffer, 8192L) == -1) {
                    break;
                }
                j8 = Math.max(j8, j10);
            } else {
                return indexOf;
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray(long j8) throws IOException {
        require(j8);
        return this.buffer.readByteArray(j8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public ByteString readByteString(long j8) throws IOException {
        require(j8);
        return this.buffer.readByteString(j8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8(long j8) throws IOException {
        require(j8);
        return this.buffer.readUtf8(j8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(long j8, Charset charset) throws IOException {
        require(j8);
        if (charset != null) {
            return this.buffer.readString(j8, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(Buffer buffer, long j8) throws IOException {
        try {
            require(j8);
            this.buffer.readFully(buffer, j8);
        } catch (EOFException e8) {
            buffer.writeAll(this.buffer);
            throw e8;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr, int i8, int i9) throws IOException {
        long j8 = i9;
        Util.checkOffsetAndCount(bArr.length, i8, j8);
        Buffer buffer = this.buffer;
        if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
            return -1;
        }
        return this.buffer.read(bArr, i8, (int) Math.min(j8, this.buffer.size));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString, long j8) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.buffer.indexOf(byteString, j8);
            if (indexOf != -1) {
                return indexOf;
            }
            Buffer buffer = this.buffer;
            long j9 = buffer.size;
            if (this.source.read(buffer, 8192L) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, (j9 - byteString.size()) + 1);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        Buffer buffer = this.buffer;
        if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
            return -1;
        }
        return this.buffer.read(byteBuffer);
    }
}
