package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes4.dex */
public final class GzipSink implements Sink {
    private boolean closed;
    private final CRC32 crc = new CRC32();
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final BufferedSink sink;

    public GzipSink(Sink sink) {
        if (sink != null) {
            Deflater deflater = new Deflater(-1, true);
            this.deflater = deflater;
            BufferedSink buffer = Okio.buffer(sink);
            this.sink = buffer;
            this.deflaterSink = new DeflaterSink(buffer, deflater);
            writeHeader();
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    private void updateCrc(Buffer buffer, long j8) {
        Segment segment = buffer.head;
        while (j8 > 0) {
            int min = (int) Math.min(j8, segment.limit - segment.pos);
            this.crc.update(segment.data, segment.pos, min);
            j8 -= min;
            segment = segment.next;
        }
    }

    private void writeFooter() throws IOException {
        this.sink.writeIntLe((int) this.crc.getValue());
        this.sink.writeIntLe((int) this.deflater.getBytesRead());
    }

    private void writeHeader() {
        Buffer buffer = this.sink.buffer();
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            this.deflaterSink.finishDeflate();
            writeFooter();
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

    public final Deflater deflater() {
        return this.deflater;
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.deflaterSink.flush();
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j8) throws IOException {
        if (j8 >= 0) {
            if (j8 == 0) {
                return;
            }
            updateCrc(buffer, j8);
            this.deflaterSink.write(buffer, j8);
            return;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j8);
    }
}
