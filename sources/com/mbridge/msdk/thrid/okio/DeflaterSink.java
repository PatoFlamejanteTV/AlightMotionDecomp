package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes4.dex */
public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    public DeflaterSink(Sink sink, Deflater deflater) {
        this(Okio.buffer(sink), deflater);
    }

    private void deflate(boolean z8) throws IOException {
        Segment writableSegment;
        int deflate;
        Buffer buffer = this.sink.buffer();
        while (true) {
            writableSegment = buffer.writableSegment(1);
            if (z8) {
                Deflater deflater = this.deflater;
                byte[] bArr = writableSegment.data;
                int i8 = writableSegment.limit;
                deflate = deflater.deflate(bArr, i8, 8192 - i8, 2);
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = writableSegment.data;
                int i9 = writableSegment.limit;
                deflate = deflater2.deflate(bArr2, i9, 8192 - i9);
            }
            if (deflate > 0) {
                writableSegment.limit += deflate;
                buffer.size += deflate;
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (writableSegment.pos == writableSegment.limit) {
            buffer.head = writableSegment.pop();
            SegmentPool.recycle(writableSegment);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            finishDeflate();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            Util.sneakyRethrow(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void finishDeflate() throws IOException {
        this.deflater.finish();
        deflate(false);
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        deflate(true);
        this.sink.flush();
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.sink + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j8) throws IOException {
        Util.checkOffsetAndCount(buffer.size, 0L, j8);
        while (j8 > 0) {
            Segment segment = buffer.head;
            int min = (int) Math.min(j8, segment.limit - segment.pos);
            this.deflater.setInput(segment.data, segment.pos, min);
            deflate(false);
            long j9 = min;
            buffer.size -= j9;
            int i8 = segment.pos + min;
            segment.pos = i8;
            if (i8 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            j8 -= j9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
        if (bufferedSink == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater != null) {
            this.sink = bufferedSink;
            this.deflater = deflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }
}
