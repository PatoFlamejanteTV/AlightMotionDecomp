package com.mbridge.msdk.thrid.okhttp.internal.http1;

import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.HttpUrl;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import com.mbridge.msdk.thrid.okhttp.internal.Internal;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.connection.RealConnection;
import com.mbridge.msdk.thrid.okhttp.internal.connection.StreamAllocation;
import com.mbridge.msdk.thrid.okhttp.internal.http.HttpCodec;
import com.mbridge.msdk.thrid.okhttp.internal.http.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.internal.http.RealResponseBody;
import com.mbridge.msdk.thrid.okhttp.internal.http.RequestLine;
import com.mbridge.msdk.thrid.okhttp.internal.http.StatusLine;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ForwardingTimeout;
import com.mbridge.msdk.thrid.okio.Okio;
import com.mbridge.msdk.thrid.okio.Sink;
import com.mbridge.msdk.thrid.okio.Source;
import com.mbridge.msdk.thrid.okio.Timeout;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class Http1Codec implements HttpCodec {
    private static final int HEADER_LIMIT = 262144;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    final OkHttpClient client;
    final BufferedSink sink;
    final BufferedSource source;
    final StreamAllocation streamAllocation;
    int state = 0;
    private long headerLimit = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public abstract class AbstractSource implements Source {
        protected long bytesRead;
        protected boolean closed;
        protected final ForwardingTimeout timeout;

        private AbstractSource() {
            this.timeout = new ForwardingTimeout(Http1Codec.this.source.timeout());
            this.bytesRead = 0L;
        }

        protected final void endOfInput(boolean z8, IOException iOException) throws IOException {
            Http1Codec http1Codec = Http1Codec.this;
            int i8 = http1Codec.state;
            if (i8 == 6) {
                return;
            }
            if (i8 == 5) {
                http1Codec.detachTimeout(this.timeout);
                Http1Codec http1Codec2 = Http1Codec.this;
                http1Codec2.state = 6;
                StreamAllocation streamAllocation = http1Codec2.streamAllocation;
                if (streamAllocation != null) {
                    streamAllocation.streamFinished(!z8, http1Codec2, this.bytesRead, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + Http1Codec.this.state);
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public long read(Buffer buffer, long j8) throws IOException {
            try {
                long read = Http1Codec.this.source.read(buffer, j8);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e8) {
                endOfInput(false, e8);
                throw e8;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class ChunkedSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        ChunkedSink() {
            this.timeout = new ForwardingTimeout(Http1Codec.this.sink.timeout());
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1Codec.this.sink.writeUtf8("0\r\n\r\n");
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public void write(Buffer buffer, long j8) throws IOException {
            if (!this.closed) {
                if (j8 == 0) {
                    return;
                }
                Http1Codec.this.sink.writeHexadecimalUnsignedLong(j8);
                Http1Codec.this.sink.writeUtf8("\r\n");
                Http1Codec.this.sink.write(buffer, j8);
                Http1Codec.this.sink.writeUtf8("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpUrl url;

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
            this.url = httpUrl;
        }

        private void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                Http1Codec.this.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.readHexadecimalUnsignedLong();
                String trim = Http1Codec.this.source.readUtf8LineStrict().trim();
                if (this.bytesRemainingInChunk >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                    if (this.bytesRemainingInChunk == 0) {
                        this.hasMoreChunks = false;
                        HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                        endOfInput(true, null);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
            } catch (NumberFormatException e8) {
                throw new ProtocolException(e8.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.Http1Codec.AbstractSource, com.mbridge.msdk.thrid.okio.Source
        public long read(Buffer buffer, long j8) throws IOException {
            if (j8 >= 0) {
                if (!this.closed) {
                    if (!this.hasMoreChunks) {
                        return -1L;
                    }
                    long j9 = this.bytesRemainingInChunk;
                    if (j9 == 0 || j9 == -1) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return -1L;
                        }
                    }
                    long read = super.read(buffer, Math.min(j8, this.bytesRemainingInChunk));
                    if (read != -1) {
                        this.bytesRemainingInChunk -= read;
                        return read;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    endOfInput(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class FixedLengthSink implements Sink {
        private long bytesRemaining;
        private boolean closed;
        private final ForwardingTimeout timeout;

        FixedLengthSink(long j8) {
            this.timeout = new ForwardingTimeout(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j8;
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.bytesRemaining <= 0) {
                Http1Codec.this.detachTimeout(this.timeout);
                Http1Codec.this.state = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public void write(Buffer buffer, long j8) throws IOException {
            if (!this.closed) {
                Util.checkOffsetAndCount(buffer.size(), 0L, j8);
                if (j8 <= this.bytesRemaining) {
                    Http1Codec.this.sink.write(buffer, j8);
                    this.bytesRemaining -= j8;
                    return;
                }
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j8);
            }
            throw new IllegalStateException("closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        FixedLengthSource(long j8) throws IOException {
            super();
            this.bytesRemaining = j8;
            if (j8 == 0) {
                endOfInput(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.Http1Codec.AbstractSource, com.mbridge.msdk.thrid.okio.Source
        public long read(Buffer buffer, long j8) throws IOException {
            if (j8 >= 0) {
                if (!this.closed) {
                    long j9 = this.bytesRemaining;
                    if (j9 == 0) {
                        return -1L;
                    }
                    long read = super.read(buffer, Math.min(j9, j8));
                    if (read != -1) {
                        long j10 = this.bytesRemaining - read;
                        this.bytesRemaining = j10;
                        if (j10 == 0) {
                            endOfInput(true, null);
                        }
                        return read;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    endOfInput(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                endOfInput(false, null);
            }
            this.closed = true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.Http1Codec.AbstractSource, com.mbridge.msdk.thrid.okio.Source
        public long read(Buffer buffer, long j8) throws IOException {
            if (j8 >= 0) {
                if (!this.closed) {
                    if (this.inputExhausted) {
                        return -1L;
                    }
                    long read = super.read(buffer, j8);
                    if (read == -1) {
                        this.inputExhausted = true;
                        endOfInput(true, null);
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation;
        this.source = bufferedSource;
        this.sink = bufferedSink;
    }

    private String readHeaderLine() throws IOException {
        String readUtf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
        this.headerLimit -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.HttpCodec
    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.HttpCodec
    public Sink createRequestBody(Request request, long j8) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j8 != -1) {
            return newFixedLengthSink(j8);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    void detachTimeout(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.HttpCodec
    public void finishRequest() throws IOException {
        this.sink.flush();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.HttpCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    public boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    public Sink newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public Source newChunkedSource(HttpUrl httpUrl) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public Sink newFixedLengthSink(long j8) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j8);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public Source newFixedLengthSource(long j8) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j8);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public Source newUnknownLengthSource() throws IOException {
        if (this.state == 4) {
            StreamAllocation streamAllocation = this.streamAllocation;
            if (streamAllocation != null) {
                this.state = 5;
                streamAllocation.noNewStreams();
                return new UnknownLengthSource();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.state);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) throws IOException {
        StreamAllocation streamAllocation = this.streamAllocation;
        streamAllocation.eventListener.responseBodyStart(streamAllocation.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0L, Okio.buffer(newFixedLengthSource(0L)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1L, Okio.buffer(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return new RealResponseBody(header, contentLength, Okio.buffer(newFixedLengthSource(contentLength)));
        }
        return new RealResponseBody(header, -1L, Okio.buffer(newUnknownLengthSource()));
    }

    public Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() != 0) {
                Internal.instance.addLenient(builder, readHeaderLine);
            } else {
                return builder.build();
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z8) throws IOException {
        int i8 = this.state;
        if (i8 != 1 && i8 != 3) {
            throw new IllegalStateException("state: " + this.state);
        }
        try {
            StatusLine parse = StatusLine.parse(readHeaderLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
            if (z8 && parse.code == 100) {
                return null;
            }
            if (parse.code == 100) {
                this.state = 3;
                return headers;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e8) {
            IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
            iOException.initCause(e8);
            throw iOException;
        }
    }

    public void writeRequest(Headers headers, String str) throws IOException {
        if (this.state == 0) {
            this.sink.writeUtf8(str).writeUtf8("\r\n");
            int size = headers.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.sink.writeUtf8(headers.name(i8)).writeUtf8(": ").writeUtf8(headers.value(i8)).writeUtf8("\r\n");
            }
            this.sink.writeUtf8("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.state);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) throws IOException {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }
}
