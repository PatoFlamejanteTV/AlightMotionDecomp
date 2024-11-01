package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
    }

    private void releaseInflatedBytes() throws IOException {
        int i8 = this.bufferBytesHeldByInflater;
        if (i8 == 0) {
            return;
        }
        int remaining = i8 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j8) throws IOException {
        boolean refill;
        if (j8 >= 0) {
            if (!this.closed) {
                if (j8 == 0) {
                    return 0L;
                }
                do {
                    refill = refill();
                    try {
                        Segment writableSegment = buffer.writableSegment(1);
                        int inflate = this.inflater.inflate(writableSegment.data, writableSegment.limit, (int) Math.min(j8, 8192 - writableSegment.limit));
                        if (inflate > 0) {
                            writableSegment.limit += inflate;
                            long j9 = inflate;
                            buffer.size += j9;
                            return j9;
                        }
                        if (!this.inflater.finished() && !this.inflater.needsDictionary()) {
                        }
                        releaseInflatedBytes();
                        if (writableSegment.pos == writableSegment.limit) {
                            buffer.head = writableSegment.pop();
                            SegmentPool.recycle(writableSegment);
                            return -1L;
                        }
                        return -1L;
                    } catch (DataFormatException e8) {
                        throw new IOException(e8);
                    }
                } while (!refill);
                throw new EOFException("source exhausted prematurely");
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("byteCount < 0: " + j8);
    }

    public final boolean refill() throws IOException {
        if (!this.inflater.needsInput()) {
            return false;
        }
        releaseInflatedBytes();
        if (this.inflater.getRemaining() == 0) {
            if (this.source.exhausted()) {
                return true;
            }
            Segment segment = this.source.buffer().head;
            int i8 = segment.limit;
            int i9 = segment.pos;
            int i10 = i8 - i9;
            this.bufferBytesHeldByInflater = i10;
            this.inflater.setInput(segment.data, i9, i10);
            return false;
        }
        throw new IllegalStateException("?");
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        if (bufferedSource == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater != null) {
            this.source = bufferedSource;
            this.inflater = inflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }
}
