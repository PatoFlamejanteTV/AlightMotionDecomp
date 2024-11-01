package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer buffer = new Buffer();
    boolean closed;
    public final Sink sink;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealBufferedSink(Sink sink) {
        if (sink != null) {
            this.sink = sink;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            Buffer buffer = this.buffer;
            long j8 = buffer.size;
            if (j8 > 0) {
                this.sink.write(buffer, j8);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            Util.sneakyRethrow(th);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink emit() throws IOException {
        if (!this.closed) {
            long size = this.buffer.size();
            if (size > 0) {
                this.sink.write(this.buffer, size);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink emitCompleteSegments() throws IOException {
        if (!this.closed) {
            long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                this.sink.write(this.buffer, completeSegmentByteCount);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink, com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (!this.closed) {
            Buffer buffer = this.buffer;
            long j8 = buffer.size;
            if (j8 > 0) {
                this.sink.write(buffer, j8);
            }
            this.sink.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.mbridge.msdk.thrid.okio.RealBufferedSink.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                RealBufferedSink.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.flush();
                }
            }

            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i8) throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.buffer.writeByte((int) ((byte) i8));
                    RealBufferedSink.this.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i8, int i9) throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.buffer.write(bArr, i8, i9);
                    RealBufferedSink.this.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "buffer(" + this.sink + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j8) throws IOException {
        if (!this.closed) {
            this.buffer.write(buffer, j8);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        if (source != null) {
            long j8 = 0;
            while (true) {
                long read = source.read(this.buffer, 8192L);
                if (read != -1) {
                    j8 += read;
                    emitCompleteSegments();
                } else {
                    return j8;
                }
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeByte(int i8) throws IOException {
        if (!this.closed) {
            this.buffer.writeByte(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeDecimalLong(long j8) throws IOException {
        if (!this.closed) {
            this.buffer.writeDecimalLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeHexadecimalUnsignedLong(long j8) throws IOException {
        if (!this.closed) {
            this.buffer.writeHexadecimalUnsignedLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeInt(int i8) throws IOException {
        if (!this.closed) {
            this.buffer.writeInt(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeIntLe(int i8) throws IOException {
        if (!this.closed) {
            this.buffer.writeIntLe(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeLong(long j8) throws IOException {
        if (!this.closed) {
            this.buffer.writeLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeLongLe(long j8) throws IOException {
        if (!this.closed) {
            this.buffer.writeLongLe(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeShort(int i8) throws IOException {
        if (!this.closed) {
            this.buffer.writeShort(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeShortLe(int i8) throws IOException {
        if (!this.closed) {
            this.buffer.writeShortLe(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeString(String str, Charset charset) throws IOException {
        if (!this.closed) {
            this.buffer.writeString(str, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeUtf8(String str) throws IOException {
        if (!this.closed) {
            this.buffer.writeUtf8(str);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeUtf8CodePoint(int i8) throws IOException {
        if (!this.closed) {
            this.buffer.writeUtf8CodePoint(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(ByteString byteString) throws IOException {
        if (!this.closed) {
            this.buffer.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeString(String str, int i8, int i9, Charset charset) throws IOException {
        if (!this.closed) {
            this.buffer.writeString(str, i8, i9, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeUtf8(String str, int i8, int i9) throws IOException {
        if (!this.closed) {
            this.buffer.writeUtf8(str, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(byte[] bArr) throws IOException {
        if (!this.closed) {
            this.buffer.write(bArr);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(byte[] bArr, int i8, int i9) throws IOException {
        if (!this.closed) {
            this.buffer.write(bArr, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.closed) {
            int write = this.buffer.write(byteBuffer);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(Source source, long j8) throws IOException {
        while (j8 > 0) {
            long read = source.read(this.buffer, j8);
            if (read != -1) {
                j8 -= read;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
