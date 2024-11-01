package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Hpack;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;
    final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2Writer(BufferedSink bufferedSink, boolean z8) {
        this.sink = bufferedSink;
        this.client = z8;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.hpackWriter = new Hpack.Writer(buffer);
        this.maxFrameSize = 16384;
    }

    private void writeContinuationFrames(int i8, long j8) throws IOException {
        byte b9;
        while (j8 > 0) {
            int min = (int) Math.min(this.maxFrameSize, j8);
            long j9 = min;
            j8 -= j9;
            if (j8 == 0) {
                b9 = 4;
            } else {
                b9 = 0;
            }
            frameHeader(i8, min, (byte) 9, b9);
            this.sink.write(this.hpackBuffer, j9);
        }
    }

    private static void writeMedium(BufferedSink bufferedSink, int i8) throws IOException {
        bufferedSink.writeByte((i8 >>> 16) & 255);
        bufferedSink.writeByte((i8 >>> 8) & 255);
        bufferedSink.writeByte(i8 & 255);
    }

    public synchronized void applyAndAckSettings(Settings settings) throws IOException {
        try {
            if (!this.closed) {
                this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
                if (settings.getHeaderTableSize() != -1) {
                    this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
                }
                frameHeader(0, 0, (byte) 4, (byte) 1);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void connectionPreface() throws IOException {
        try {
            if (!this.closed) {
                if (!this.client) {
                    return;
                }
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.hex()));
                }
                this.sink.write(Http2.CONNECTION_PREFACE.toByteArray());
                this.sink.flush();
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void data(boolean z8, int i8, Buffer buffer, int i9) throws IOException {
        byte b9;
        if (!this.closed) {
            if (z8) {
                b9 = (byte) 1;
            } else {
                b9 = 0;
            }
            dataFrame(i8, b9, buffer, i9);
        } else {
            throw new IOException("closed");
        }
    }

    void dataFrame(int i8, byte b9, Buffer buffer, int i9) throws IOException {
        frameHeader(i8, i9, (byte) 0, b9);
        if (i9 > 0) {
            this.sink.write(buffer, i9);
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void frameHeader(int i8, int i9, byte b9, byte b10) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.frameLog(false, i8, i9, b9, b10));
        }
        int i10 = this.maxFrameSize;
        if (i9 <= i10) {
            if ((Integer.MIN_VALUE & i8) == 0) {
                writeMedium(this.sink, i9);
                this.sink.writeByte(b9 & 255);
                this.sink.writeByte(b10 & 255);
                this.sink.writeInt(i8 & Integer.MAX_VALUE);
                return;
            }
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i8));
        }
        throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i10), Integer.valueOf(i9));
    }

    public synchronized void goAway(int i8, ErrorCode errorCode, byte[] bArr) throws IOException {
        try {
            if (!this.closed) {
                if (errorCode.httpCode != -1) {
                    frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.sink.writeInt(i8);
                    this.sink.writeInt(errorCode.httpCode);
                    if (bArr.length > 0) {
                        this.sink.write(bArr);
                    }
                    this.sink.flush();
                } else {
                    throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void headers(int i8, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(false, i8, list);
        } else {
            throw new IOException("closed");
        }
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void ping(boolean z8, int i8, int i9) throws IOException {
        if (!this.closed) {
            frameHeader(0, 8, (byte) 6, z8 ? (byte) 1 : (byte) 0);
            this.sink.writeInt(i8);
            this.sink.writeInt(i9);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void pushPromise(int i8, int i9, List<Header> list) throws IOException {
        byte b9;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize - 4, size);
            long j8 = min;
            if (size == j8) {
                b9 = 4;
            } else {
                b9 = 0;
            }
            frameHeader(i8, min + 4, (byte) 5, b9);
            this.sink.writeInt(i9 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j8);
            if (size > j8) {
                writeContinuationFrames(i8, size - j8);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void rstStream(int i8, ErrorCode errorCode) throws IOException {
        if (!this.closed) {
            if (errorCode.httpCode != -1) {
                frameHeader(i8, 4, (byte) 3, (byte) 0);
                this.sink.writeInt(errorCode.httpCode);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void settings(Settings settings) throws IOException {
        int i8;
        try {
            if (!this.closed) {
                frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
                for (int i9 = 0; i9 < 10; i9++) {
                    if (settings.isSet(i9)) {
                        if (i9 == 4) {
                            i8 = 3;
                        } else if (i9 == 7) {
                            i8 = 4;
                        } else {
                            i8 = i9;
                        }
                        this.sink.writeShort(i8);
                        this.sink.writeInt(settings.get(i9));
                    }
                }
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void synReply(boolean z8, int i8, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z8, i8, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void synStream(boolean z8, int i8, int i9, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z8, i8, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void windowUpdate(int i8, long j8) throws IOException {
        if (!this.closed) {
            if (j8 != 0 && j8 <= 2147483647L) {
                frameHeader(i8, 4, (byte) 8, (byte) 0);
                this.sink.writeInt((int) j8);
                this.sink.flush();
            } else {
                throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j8));
            }
        } else {
            throw new IOException("closed");
        }
    }

    void headers(boolean z8, int i8, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize, size);
            long j8 = min;
            byte b9 = size == j8 ? (byte) 4 : (byte) 0;
            if (z8) {
                b9 = (byte) (b9 | 1);
            }
            frameHeader(i8, min, (byte) 1, b9);
            this.sink.write(this.hpackBuffer, j8);
            if (size > j8) {
                writeContinuationFrames(i8, size - j8);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
