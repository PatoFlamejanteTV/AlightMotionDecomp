package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class Okio {
    static final Logger logger = Logger.getLogger(Okio.class.getName());

    private Okio() {
    }

    public static Sink appendingSink(File file) throws FileNotFoundException {
        if (file != null) {
            return sink(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static Sink blackhole() {
        return new Sink() { // from class: com.mbridge.msdk.thrid.okio.Okio.3
            @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
            public void flush() throws IOException {
            }

            @Override // com.mbridge.msdk.thrid.okio.Sink
            public Timeout timeout() {
                return Timeout.NONE;
            }

            @Override // com.mbridge.msdk.thrid.okio.Sink
            public void write(Buffer buffer, long j8) throws IOException {
                buffer.skip(j8);
            }
        };
    }

    public static BufferedSource buffer(Source source) {
        return new RealBufferedSource(source);
    }

    static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        if (assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed")) {
            return true;
        }
        return false;
    }

    public static Sink sink(OutputStream outputStream) {
        return sink(outputStream, new Timeout());
    }

    public static Source source(InputStream inputStream) {
        return source(inputStream, new Timeout());
    }

    private static AsyncTimeout timeout(final Socket socket) {
        return new AsyncTimeout() { // from class: com.mbridge.msdk.thrid.okio.Okio.4
            @Override // com.mbridge.msdk.thrid.okio.AsyncTimeout
            protected IOException newTimeoutException(@Nullable IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // com.mbridge.msdk.thrid.okio.AsyncTimeout
            protected void timedOut() {
                try {
                    socket.close();
                } catch (AssertionError e8) {
                    if (Okio.isAndroidGetsocknameError(e8)) {
                        Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
                        return;
                    }
                    throw e8;
                } catch (Exception e9) {
                    Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e9);
                }
            }
        };
    }

    public static BufferedSink buffer(Sink sink) {
        return new RealBufferedSink(sink);
    }

    private static Sink sink(final OutputStream outputStream, final Timeout timeout) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (timeout != null) {
            return new Sink() { // from class: com.mbridge.msdk.thrid.okio.Okio.1
                @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    outputStream.close();
                }

                @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
                public void flush() throws IOException {
                    outputStream.flush();
                }

                @Override // com.mbridge.msdk.thrid.okio.Sink
                public Timeout timeout() {
                    return Timeout.this;
                }

                public String toString() {
                    return "sink(" + outputStream + ")";
                }

                @Override // com.mbridge.msdk.thrid.okio.Sink
                public void write(Buffer buffer, long j8) throws IOException {
                    Util.checkOffsetAndCount(buffer.size, 0L, j8);
                    while (j8 > 0) {
                        Timeout.this.throwIfReached();
                        Segment segment = buffer.head;
                        int min = (int) Math.min(j8, segment.limit - segment.pos);
                        outputStream.write(segment.data, segment.pos, min);
                        int i8 = segment.pos + min;
                        segment.pos = i8;
                        long j9 = min;
                        j8 -= j9;
                        buffer.size -= j9;
                        if (i8 == segment.limit) {
                            buffer.head = segment.pop();
                            SegmentPool.recycle(segment);
                        }
                    }
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    private static Source source(final InputStream inputStream, final Timeout timeout) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (timeout != null) {
            return new Source() { // from class: com.mbridge.msdk.thrid.okio.Okio.2
                @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    inputStream.close();
                }

                @Override // com.mbridge.msdk.thrid.okio.Source
                public long read(Buffer buffer, long j8) throws IOException {
                    if (j8 >= 0) {
                        if (j8 == 0) {
                            return 0L;
                        }
                        try {
                            Timeout.this.throwIfReached();
                            Segment writableSegment = buffer.writableSegment(1);
                            int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j8, 8192 - writableSegment.limit));
                            if (read == -1) {
                                return -1L;
                            }
                            writableSegment.limit += read;
                            long j9 = read;
                            buffer.size += j9;
                            return j9;
                        } catch (AssertionError e8) {
                            if (Okio.isAndroidGetsocknameError(e8)) {
                                throw new IOException(e8);
                            }
                            throw e8;
                        }
                    }
                    throw new IllegalArgumentException("byteCount < 0: " + j8);
                }

                @Override // com.mbridge.msdk.thrid.okio.Source
                public Timeout timeout() {
                    return Timeout.this;
                }

                public String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static Sink sink(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                AsyncTimeout timeout = timeout(socket);
                return timeout.sink(sink(socket.getOutputStream(), timeout));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static Source source(File file) throws FileNotFoundException {
        if (file != null) {
            return source(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static Source source(Path path, OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        if (path != null) {
            newInputStream = Files.newInputStream(path, openOptionArr);
            return source(newInputStream);
        }
        throw new IllegalArgumentException("path == null");
    }

    public static Source source(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                AsyncTimeout timeout = timeout(socket);
                return timeout.source(source(socket.getInputStream(), timeout));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static Sink sink(File file) throws FileNotFoundException {
        if (file != null) {
            return sink(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static Sink sink(Path path, OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        if (path != null) {
            newOutputStream = Files.newOutputStream(path, openOptionArr);
            return sink(newOutputStream);
        }
        throw new IllegalArgumentException("path == null");
    }
}
