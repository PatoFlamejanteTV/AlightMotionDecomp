package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader;
import com.mbridge.msdk.thrid.okhttp.internal.platform.Platform;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ByteString;
import com.mbridge.msdk.thrid.okio.Okio;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class Http2Connection implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int AWAIT_PING = 3;
    static final int DEGRADED_PING = 2;
    static final long DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    static final int INTERVAL_PING = 1;
    static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private static final ExecutorService listenerExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
    long bytesLeftInWriteWindow;
    final boolean client;
    final Set<Integer> currentPushRequests;
    final String hostname;
    int lastGoodStreamId;
    final Listener listener;
    int nextStreamId;
    final Settings peerSettings;
    private final ExecutorService pushExecutor;
    final PushObserver pushObserver;
    final ReaderRunnable readerRunnable;
    private boolean shutdown;
    final Socket socket;
    final Http2Writer writer;
    private final ScheduledExecutorService writerExecutor;
    final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    private long intervalPingsSent = 0;
    private long intervalPongsReceived = 0;
    private long degradedPingsSent = 0;
    private long degradedPongsReceived = 0;
    private long awaitPingsSent = 0;
    private long awaitPongsReceived = 0;
    private long degradedPongDeadlineNs = 0;
    long unacknowledgedBytesRead = 0;
    Settings okHttpSettings = new Settings();

    /* loaded from: classes4.dex */
    final class IntervalPingRunnable extends NamedRunnable {
        IntervalPingRunnable() {
            super("OkHttp %s ping", Http2Connection.this.hostname);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
        public void execute() {
            boolean z8;
            synchronized (Http2Connection.this) {
                if (Http2Connection.this.intervalPongsReceived < Http2Connection.this.intervalPingsSent) {
                    z8 = true;
                } else {
                    Http2Connection.access$208(Http2Connection.this);
                    z8 = false;
                }
            }
            if (z8) {
                Http2Connection.this.failConnection();
            } else {
                Http2Connection.this.writePing(false, 1, 0);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.Listener.1
            @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) throws IOException {
                http2Stream.close(ErrorCode.REFUSED_STREAM);
            }
        };

        public void onSettings(Http2Connection http2Connection) {
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    /* loaded from: classes4.dex */
    final class PingRunnable extends NamedRunnable {
        final int payload1;
        final int payload2;
        final boolean reply;

        PingRunnable(boolean z8, int i8, int i9) {
            super("OkHttp %s ping %08x%08x", Http2Connection.this.hostname, Integer.valueOf(i8), Integer.valueOf(i9));
            this.reply = z8;
            this.payload1 = i8;
            this.payload2 = i9;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
        public void execute() {
            Http2Connection.this.writePing(this.reply, this.payload1, this.payload2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {
        final Http2Reader reader;

        ReaderRunnable(Http2Reader http2Reader) {
            super("OkHttp %s", Http2Connection.this.hostname);
            this.reader = http2Reader;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void alternateService(int i8, String str, ByteString byteString, String str2, int i9, long j8) {
        }

        void applyAndAckSettings(boolean z8, Settings settings) {
            Http2Stream[] http2StreamArr;
            long j8;
            synchronized (Http2Connection.this.writer) {
                synchronized (Http2Connection.this) {
                    try {
                        int initialWindowSize = Http2Connection.this.peerSettings.getInitialWindowSize();
                        if (z8) {
                            Http2Connection.this.peerSettings.clear();
                        }
                        Http2Connection.this.peerSettings.merge(settings);
                        int initialWindowSize2 = Http2Connection.this.peerSettings.getInitialWindowSize();
                        http2StreamArr = null;
                        if (initialWindowSize2 != -1 && initialWindowSize2 != initialWindowSize) {
                            j8 = initialWindowSize2 - initialWindowSize;
                            if (!Http2Connection.this.streams.isEmpty()) {
                                http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                            }
                        } else {
                            j8 = 0;
                        }
                    } finally {
                    }
                }
                try {
                    Http2Connection http2Connection = Http2Connection.this;
                    http2Connection.writer.applyAndAckSettings(http2Connection.peerSettings);
                } catch (IOException unused) {
                    Http2Connection.this.failConnection();
                }
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(j8);
                    }
                }
            }
            Http2Connection.listenerExecutor.execute(new NamedRunnable("OkHttp %s settings", Http2Connection.this.hostname) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.ReaderRunnable.3
                @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
                public void execute() {
                    Http2Connection http2Connection2 = Http2Connection.this;
                    http2Connection2.listener.onSettings(http2Connection2);
                }
            });
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void data(boolean z8, int i8, BufferedSource bufferedSource, int i9) throws IOException {
            if (Http2Connection.this.pushedStream(i8)) {
                Http2Connection.this.pushDataLater(i8, bufferedSource, i9, z8);
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i8);
            if (stream == null) {
                Http2Connection.this.writeSynResetLater(i8, ErrorCode.PROTOCOL_ERROR);
                long j8 = i9;
                Http2Connection.this.updateConnectionFlowControl(j8);
                bufferedSource.skip(j8);
                return;
            }
            stream.receiveData(bufferedSource, i9);
            if (z8) {
                stream.receiveFin();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
        protected void execute() {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    do {
                    } while (this.reader.nextFrame(false, this));
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode3;
                    try {
                        Http2Connection.this.close(errorCode, errorCode3);
                    } catch (IOException unused2) {
                    }
                    Util.closeQuietly(this.reader);
                    throw th;
                }
                try {
                    errorCode3 = ErrorCode.CANCEL;
                    Http2Connection.this.close(errorCode2, errorCode3);
                    errorCode = errorCode2;
                } catch (IOException unused3) {
                    errorCode3 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection http2Connection = Http2Connection.this;
                    http2Connection.close(errorCode3, errorCode3);
                    errorCode = http2Connection;
                    Util.closeQuietly(this.reader);
                }
                Util.closeQuietly(this.reader);
            } catch (Throwable th2) {
                th = th2;
                Http2Connection.this.close(errorCode, errorCode3);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void goAway(int i8, ErrorCode errorCode, ByteString byteString) {
            Http2Stream[] http2StreamArr;
            byteString.size();
            synchronized (Http2Connection.this) {
                http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                Http2Connection.this.shutdown = true;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i8 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.removeStream(http2Stream.getId());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void headers(boolean z8, int i8, int i9, List<Header> list) {
            if (Http2Connection.this.pushedStream(i8)) {
                Http2Connection.this.pushHeadersLater(i8, list, z8);
                return;
            }
            synchronized (Http2Connection.this) {
                try {
                    Http2Stream stream = Http2Connection.this.getStream(i8);
                    if (stream == null) {
                        if (Http2Connection.this.shutdown) {
                            return;
                        }
                        Http2Connection http2Connection = Http2Connection.this;
                        if (i8 <= http2Connection.lastGoodStreamId) {
                            return;
                        }
                        if (i8 % 2 == http2Connection.nextStreamId % 2) {
                            return;
                        }
                        final Http2Stream http2Stream = new Http2Stream(i8, Http2Connection.this, false, z8, Util.toHeaders(list));
                        Http2Connection http2Connection2 = Http2Connection.this;
                        http2Connection2.lastGoodStreamId = i8;
                        http2Connection2.streams.put(Integer.valueOf(i8), http2Stream);
                        Http2Connection.listenerExecutor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{Http2Connection.this.hostname, Integer.valueOf(i8)}) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.ReaderRunnable.1
                            @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
                            public void execute() {
                                try {
                                    Http2Connection.this.listener.onStream(http2Stream);
                                } catch (IOException e8) {
                                    Platform.get().log(4, "Http2Connection.Listener failure for " + Http2Connection.this.hostname, e8);
                                    try {
                                        http2Stream.close(ErrorCode.PROTOCOL_ERROR);
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                        });
                        return;
                    }
                    stream.receiveHeaders(list);
                    if (z8) {
                        stream.receiveFin();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void ping(boolean z8, int i8, int i9) {
            if (z8) {
                synchronized (Http2Connection.this) {
                    try {
                        if (i8 == 1) {
                            Http2Connection.access$108(Http2Connection.this);
                        } else if (i8 == 2) {
                            Http2Connection.access$608(Http2Connection.this);
                        } else if (i8 == 3) {
                            Http2Connection.access$708(Http2Connection.this);
                            Http2Connection.this.notifyAll();
                        }
                    } finally {
                    }
                }
                return;
            }
            try {
                Http2Connection.this.writerExecutor.execute(new PingRunnable(true, i8, i9));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void priority(int i8, int i9, int i10, boolean z8) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void pushPromise(int i8, int i9, List<Header> list) {
            Http2Connection.this.pushRequestLater(i9, list);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void rstStream(int i8, ErrorCode errorCode) {
            if (Http2Connection.this.pushedStream(i8)) {
                Http2Connection.this.pushResetLater(i8, errorCode);
                return;
            }
            Http2Stream removeStream = Http2Connection.this.removeStream(i8);
            if (removeStream != null) {
                removeStream.receiveRstStream(errorCode);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void settings(final boolean z8, final Settings settings) {
            try {
                Http2Connection.this.writerExecutor.execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{Http2Connection.this.hostname}) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.ReaderRunnable.2
                    @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
                    public void execute() {
                        ReaderRunnable.this.applyAndAckSettings(z8, settings);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i8, long j8) {
            if (i8 == 0) {
                synchronized (Http2Connection.this) {
                    Http2Connection http2Connection = Http2Connection.this;
                    http2Connection.bytesLeftInWriteWindow += j8;
                    http2Connection.notifyAll();
                }
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i8);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j8);
                }
            }
        }
    }

    Http2Connection(Builder builder) {
        int i8;
        Settings settings = new Settings();
        this.peerSettings = settings;
        this.currentPushRequests = new LinkedHashSet();
        this.pushObserver = builder.pushObserver;
        boolean z8 = builder.client;
        this.client = z8;
        this.listener = builder.listener;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        this.nextStreamId = i8;
        if (z8) {
            this.nextStreamId = i8 + 2;
        }
        if (z8) {
            this.okHttpSettings.set(7, 16777216);
        }
        String str = builder.hostname;
        this.hostname = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(Util.format("OkHttp %s Writer", str), false));
        this.writerExecutor = scheduledThreadPoolExecutor;
        if (builder.pingIntervalMillis != 0) {
            IntervalPingRunnable intervalPingRunnable = new IntervalPingRunnable();
            int i9 = builder.pingIntervalMillis;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(intervalPingRunnable, i9, i9, TimeUnit.MILLISECONDS);
        }
        this.pushExecutor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", str), true));
        settings.set(7, 65535);
        settings.set(5, 16384);
        this.bytesLeftInWriteWindow = settings.getInitialWindowSize();
        this.socket = builder.socket;
        this.writer = new Http2Writer(builder.sink, z8);
        this.readerRunnable = new ReaderRunnable(new Http2Reader(builder.source, z8));
    }

    static /* synthetic */ long access$108(Http2Connection http2Connection) {
        long j8 = http2Connection.intervalPongsReceived;
        http2Connection.intervalPongsReceived = 1 + j8;
        return j8;
    }

    static /* synthetic */ long access$208(Http2Connection http2Connection) {
        long j8 = http2Connection.intervalPingsSent;
        http2Connection.intervalPingsSent = 1 + j8;
        return j8;
    }

    static /* synthetic */ long access$608(Http2Connection http2Connection) {
        long j8 = http2Connection.degradedPongsReceived;
        http2Connection.degradedPongsReceived = 1 + j8;
        return j8;
    }

    static /* synthetic */ long access$708(Http2Connection http2Connection) {
        long j8 = http2Connection.awaitPongsReceived;
        http2Connection.awaitPongsReceived = 1 + j8;
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failConnection() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            close(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    private synchronized void pushExecutorExecute(NamedRunnable namedRunnable) {
        if (!this.shutdown) {
            this.pushExecutor.execute(namedRunnable);
        }
    }

    synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void flush() throws IOException {
        this.writer.flush();
    }

    public Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    synchronized Http2Stream getStream(int i8) {
        return this.streams.get(Integer.valueOf(i8));
    }

    public synchronized boolean isHealthy(long j8) {
        if (this.shutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j8 >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public synchronized int maxConcurrentStreams() {
        return this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
    }

    public Http2Stream newStream(List<Header> list, boolean z8) throws IOException {
        return newStream(0, list, z8);
    }

    public synchronized int openStreamCount() {
        return this.streams.size();
    }

    void pushDataLater(final int i8, BufferedSource bufferedSource, final int i9, final boolean z8) throws IOException {
        final Buffer buffer = new Buffer();
        long j8 = i9;
        bufferedSource.require(j8);
        bufferedSource.read(buffer, j8);
        if (buffer.size() == j8) {
            pushExecutorExecute(new NamedRunnable("OkHttp %s Push Data[%s]", new Object[]{this.hostname, Integer.valueOf(i8)}) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.6
                @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
                public void execute() {
                    try {
                        boolean onData = Http2Connection.this.pushObserver.onData(i8, buffer, i9, z8);
                        if (onData) {
                            Http2Connection.this.writer.rstStream(i8, ErrorCode.CANCEL);
                        }
                        if (onData || z8) {
                            synchronized (Http2Connection.this) {
                                Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i8));
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            });
            return;
        }
        throw new IOException(buffer.size() + " != " + i9);
    }

    void pushHeadersLater(final int i8, final List<Header> list, final boolean z8) {
        try {
            pushExecutorExecute(new NamedRunnable("OkHttp %s Push Headers[%s]", new Object[]{this.hostname, Integer.valueOf(i8)}) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.5
                @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
                public void execute() {
                    boolean onHeaders = Http2Connection.this.pushObserver.onHeaders(i8, list, z8);
                    if (onHeaders) {
                        try {
                            Http2Connection.this.writer.rstStream(i8, ErrorCode.CANCEL);
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    if (onHeaders || z8) {
                        synchronized (Http2Connection.this) {
                            Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i8));
                        }
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    void pushRequestLater(final int i8, final List<Header> list) {
        synchronized (this) {
            try {
                if (this.currentPushRequests.contains(Integer.valueOf(i8))) {
                    writeSynResetLater(i8, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                this.currentPushRequests.add(Integer.valueOf(i8));
                try {
                    pushExecutorExecute(new NamedRunnable("OkHttp %s Push Request[%s]", new Object[]{this.hostname, Integer.valueOf(i8)}) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.4
                        @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
                        public void execute() {
                            if (Http2Connection.this.pushObserver.onRequest(i8, list)) {
                                try {
                                    Http2Connection.this.writer.rstStream(i8, ErrorCode.CANCEL);
                                    synchronized (Http2Connection.this) {
                                        Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i8));
                                    }
                                } catch (IOException unused) {
                                }
                            }
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void pushResetLater(final int i8, final ErrorCode errorCode) {
        pushExecutorExecute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[]{this.hostname, Integer.valueOf(i8)}) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.7
            @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
            public void execute() {
                Http2Connection.this.pushObserver.onReset(i8, errorCode);
                synchronized (Http2Connection.this) {
                    Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i8));
                }
            }
        });
    }

    public Http2Stream pushStream(int i8, List<Header> list, boolean z8) throws IOException {
        if (!this.client) {
            return newStream(i8, list, z8);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    boolean pushedStream(int i8) {
        return i8 != 0 && (i8 & 1) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Http2Stream removeStream(int i8) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i8));
        notifyAll();
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendDegradedPingLater() {
        synchronized (this) {
            try {
                long j8 = this.degradedPongsReceived;
                long j9 = this.degradedPingsSent;
                if (j8 < j9) {
                    return;
                }
                this.degradedPingsSent = j9 + 1;
                this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
                try {
                    this.writerExecutor.execute(new NamedRunnable("OkHttp %s ping", this.hostname) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.3
                        @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
                        public void execute() {
                            Http2Connection.this.writePing(false, 2, 0);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setSettings(Settings settings) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.shutdown) {
                    this.okHttpSettings.merge(settings);
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public void shutdown(ErrorCode errorCode) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (this.shutdown) {
                    return;
                }
                this.shutdown = true;
                this.writer.goAway(this.lastGoodStreamId, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public void start() throws IOException {
        start(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void updateConnectionFlowControl(long j8) {
        long j9 = this.unacknowledgedBytesRead + j8;
        this.unacknowledgedBytesRead = j9;
        if (j9 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater(0, this.unacknowledgedBytesRead);
            this.unacknowledgedBytesRead = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:            throw new java.io.IOException("stream closed");     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:            r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.writer.maxDataLength());        r6 = r3;        r8.bytesLeftInWriteWindow -= r6;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeData(int r9, boolean r10, com.mbridge.msdk.thrid.okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r3 = r8.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L32
            java.util.Map<java.lang.Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Stream> r3 = r8.streams     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            goto L12
        L28:
            r9 = move-exception
            goto L65
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
        L32:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L28
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L28
            com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Writer r3 = r8.writer     // Catch: java.lang.Throwable -> L28
            int r3 = r3.maxDataLength()     // Catch: java.lang.Throwable -> L28
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.bytesLeftInWriteWindow = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L53
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = 0
        L54:
            r4.data(r5, r9, r11, r3)
            goto Ld
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.writeData(int, boolean, com.mbridge.msdk.thrid.okio.Buffer, long):void");
    }

    void writePing(boolean z8, int i8, int i9) {
        try {
            this.writer.ping(z8, i8, i9);
        } catch (IOException unused) {
            failConnection();
        }
    }

    void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeSynReply(int i8, boolean z8, List<Header> list) throws IOException {
        this.writer.synReply(z8, i8, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeSynReset(int i8, ErrorCode errorCode) throws IOException {
        this.writer.rstStream(i8, errorCode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeSynResetLater(final int i8, final ErrorCode errorCode) {
        try {
            this.writerExecutor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.hostname, Integer.valueOf(i8)}) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.1
                @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writeSynReset(i8, errorCode);
                    } catch (IOException unused) {
                        Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeWindowUpdateLater(final int i8, final long j8) {
        try {
            this.writerExecutor.execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.hostname, Integer.valueOf(i8)}) { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.2
                @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writer.windowUpdate(i8, j8);
                    } catch (IOException unused) {
                        Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x0006, B:8:0x000d, B:9:0x0015, B:11:0x0019, B:13:0x002c, B:15:0x0034, B:19:0x003e, B:21:0x0044, B:22:0x004d, B:36:0x0072, B:37:0x0077), top: B:5:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Stream newStream(int r11, java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.Header> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L56
            int r0 = r10.nextStreamId     // Catch: java.lang.Throwable -> L13
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L15
            com.mbridge.msdk.thrid.okhttp.internal.http2.ErrorCode r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r10.shutdown(r0)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r11 = move-exception
            goto L78
        L15:
            boolean r0 = r10.shutdown     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L72
            int r8 = r10.nextStreamId     // Catch: java.lang.Throwable -> L13
            int r0 = r8 + 2
            r10.nextStreamId = r0     // Catch: java.lang.Throwable -> L13
            com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Stream r9 = new com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L13
            r5 = 0
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L13
            if (r13 == 0) goto L3d
            long r0 = r10.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L13
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3d
            long r0 = r9.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L13
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L3b
            goto L3d
        L3b:
            r13 = 0
            goto L3e
        L3d:
            r13 = 1
        L3e:
            boolean r0 = r9.isOpen()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L4d
            java.util.Map<java.lang.Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Stream> r0 = r10.streams     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L13
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L13
        L4d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L13
            if (r11 != 0) goto L58
            com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Writer r0 = r10.writer     // Catch: java.lang.Throwable -> L56
            r0.synStream(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L56
            goto L61
        L56:
            r11 = move-exception
            goto L7a
        L58:
            boolean r0 = r10.client     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L6a
            com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Writer r0 = r10.writer     // Catch: java.lang.Throwable -> L56
            r0.pushPromise(r11, r8, r12)     // Catch: java.lang.Throwable -> L56
        L61:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L56
            if (r13 == 0) goto L69
            com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L69:
            return r9
        L6a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L56
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L56
            throw r11     // Catch: java.lang.Throwable -> L56
        L72:
            com.mbridge.msdk.thrid.okhttp.internal.http2.ConnectionShutdownException r11 = new com.mbridge.msdk.thrid.okhttp.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L13
            r11.<init>()     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L13
        L78:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L56
        L7a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L56
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Stream");
    }

    void close(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        Http2Stream[] http2StreamArr = null;
        try {
            shutdown(errorCode);
            e = null;
        } catch (IOException e8) {
            e = e8;
        }
        synchronized (this) {
            try {
                if (!this.streams.isEmpty()) {
                    http2StreamArr = (Http2Stream[]) this.streams.values().toArray(new Http2Stream[this.streams.size()]);
                    this.streams.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2);
                } catch (IOException e9) {
                    if (e != null) {
                        e = e9;
                    }
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException e10) {
            if (e == null) {
                e = e10;
            }
        }
        try {
            this.socket.close();
        } catch (IOException e11) {
            e = e11;
        }
        this.writerExecutor.shutdown();
        this.pushExecutor.shutdown();
        if (e != null) {
            throw e;
        }
    }

    void start(boolean z8) throws IOException {
        if (z8) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - 65535);
            }
        }
        new Thread(this.readerRunnable).start();
    }

    /* loaded from: classes4.dex */
    public static class Builder {
        boolean client;
        String hostname;
        int pingIntervalMillis;
        BufferedSink sink;
        Socket socket;
        BufferedSource source;
        Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        PushObserver pushObserver = PushObserver.CANCEL;

        public Builder(boolean z8) {
            this.client = z8;
        }

        public Http2Connection build() {
            return new Http2Connection(this);
        }

        public Builder listener(Listener listener) {
            this.listener = listener;
            return this;
        }

        public Builder pingIntervalMillis(int i8) {
            this.pingIntervalMillis = i8;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver) {
            this.pushObserver = pushObserver;
            return this;
        }

        public Builder socket(Socket socket) throws IOException {
            return socket(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), Okio.buffer(Okio.source(socket)), Okio.buffer(Okio.sink(socket)));
        }

        public Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.socket = socket;
            this.hostname = str;
            this.source = bufferedSource;
            this.sink = bufferedSink;
            return this;
        }
    }

    void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
