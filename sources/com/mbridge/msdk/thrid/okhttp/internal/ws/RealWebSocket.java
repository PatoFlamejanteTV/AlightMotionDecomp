package com.mbridge.msdk.thrid.okhttp.internal.ws;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.view.PointerIconCompat;
import com.mbridge.msdk.thrid.okhttp.Call;
import com.mbridge.msdk.thrid.okhttp.Callback;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.WebSocket;
import com.mbridge.msdk.thrid.okhttp.WebSocketListener;
import com.mbridge.msdk.thrid.okhttp.internal.Internal;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.connection.StreamAllocation;
import com.mbridge.msdk.thrid.okhttp.internal.ws.WebSocketReader;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ByteString;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    final WebSocketListener listener;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;
    private final ArrayDeque<ByteString> pongQueue = new ArrayDeque<>();
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private int receivedCloseCode = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class CancelRunnable implements Runnable {
        CancelRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final ByteString reason;

        Close(int i8, ByteString byteString, long j8) {
            this.code = i8;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Message {
        final ByteString data;
        final int formatOpcode;

        Message(int i8, ByteString byteString) {
            this.formatOpcode = i8;
            this.data = byteString;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class PingRunnable implements Runnable {
        PingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.writePingFrame();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final BufferedSink sink;
        public final BufferedSource source;

        public Streams(boolean z8, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.client = z8;
            this.source = bufferedSource;
            this.sink = bufferedSink;
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j8) {
        if (ShareTarget.METHOD_GET.equals(request.method())) {
            this.originalRequest = request;
            this.listener = webSocketListener;
            this.random = random;
            this.pingIntervalMillis = j8;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.key = ByteString.of(bArr).base64();
            this.writerRunnable = new Runnable() { // from class: com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.1
                @Override // java.lang.Runnable
                public void run() {
                    do {
                        try {
                        } catch (IOException e8) {
                            RealWebSocket.this.failWebSocket(e8, null);
                            return;
                        }
                    } while (RealWebSocket.this.writeOneFrame());
                }
            };
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + request.method());
    }

    private void runWriter() {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    void awaitTermination(int i8, TimeUnit timeUnit) throws InterruptedException {
        this.executor.awaitTermination(i8, timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.WebSocket
    public void cancel() {
        this.call.cancel();
    }

    void checkResponse(Response response) throws ProtocolException {
        if (response.code() == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    String base64 = ByteString.encodeUtf8(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
                    if (base64.equals(header3)) {
                        return;
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header3 + "'");
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + "'");
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + "'");
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.WebSocket
    public boolean close(int i8, String str) {
        return close(i8, str, 60000L);
    }

    public void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        Call newWebSocketCall = Internal.instance.newWebSocketCall(build, build2);
        this.call = newWebSocketCall;
        newWebSocketCall.timeout().clearTimeout();
        this.call.enqueue(new Callback() { // from class: com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.2
            @Override // com.mbridge.msdk.thrid.okhttp.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // com.mbridge.msdk.thrid.okhttp.Callback
            public void onResponse(Call call, Response response) {
                try {
                    RealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        realWebSocket.listener.onOpen(realWebSocket, response);
                        RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + build2.url().redact(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e8) {
                        RealWebSocket.this.failWebSocket(e8, null);
                    }
                } catch (ProtocolException e9) {
                    RealWebSocket.this.failWebSocket(e9, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public void failWebSocket(Exception exc, Response response) {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                this.failed = true;
                Streams streams = this.streams;
                this.streams = null;
                ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.executor;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.listener.onFailure(this, exc, response);
                } finally {
                    Util.closeQuietly(streams);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initReaderAndWriter(String str, Streams streams) throws IOException {
        synchronized (this) {
            try {
                this.streams = streams;
                this.writer = new WebSocketWriter(streams.client, streams.sink, this.random);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
                this.executor = scheduledThreadPoolExecutor;
                if (this.pingIntervalMillis != 0) {
                    PingRunnable pingRunnable = new PingRunnable();
                    long j8 = this.pingIntervalMillis;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(pingRunnable, j8, j8, TimeUnit.MILLISECONDS);
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.reader = new WebSocketReader(streams.client, streams.source, this);
    }

    public void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i8, String str) {
        Streams streams;
        if (i8 != -1) {
            synchronized (this) {
                try {
                    if (this.receivedCloseCode == -1) {
                        this.receivedCloseCode = i8;
                        this.receivedCloseReason = str;
                        streams = null;
                        if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                            Streams streams2 = this.streams;
                            this.streams = null;
                            ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.executor.shutdown();
                            streams = streams2;
                        }
                    } else {
                        throw new IllegalStateException("already closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                this.listener.onClosing(this, i8, str);
                if (streams != null) {
                    this.listener.onClosed(this, i8, str);
                }
                return;
            } finally {
                Util.closeQuietly(streams);
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        this.listener.onMessage(this, str);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString byteString) {
        try {
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(byteString);
                runWriter();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString byteString) {
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    synchronized boolean pong(ByteString byteString) {
        try {
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(byteString);
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    boolean processNextFrame() throws IOException {
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode != -1) {
                return false;
            }
            return true;
        } catch (Exception e8) {
            failWebSocket(e8, null);
            return false;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.WebSocket
    public boolean send(String str) {
        if (str != null) {
            return send(ByteString.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    void tearDown() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #2 {all -> 0x005d, blocks: (B:19:0x0059, B:22:0x005f, B:24:0x0063, B:25:0x007f, B:33:0x008e, B:34:0x008f, B:36:0x0093, B:38:0x009e, B:39:0x00a8, B:40:0x00ad, B:27:0x0080, B:28:0x008a), top: B:17:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:19:0x0059, B:22:0x005f, B:24:0x0063, B:25:0x007f, B:33:0x008e, B:34:0x008f, B:36:0x0093, B:38:0x009e, B:39:0x00a8, B:40:0x00ad, B:27:0x0080, B:28:0x008a), top: B:17:0x0057, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean writeOneFrame() throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.failed     // Catch: java.lang.Throwable -> L8
            r1 = 0
            if (r0 == 0) goto Lb
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8
            return r1
        L8:
            r0 = move-exception
            goto Lb2
        Lb:
            com.mbridge.msdk.thrid.okhttp.internal.ws.WebSocketWriter r0 = r11.writer     // Catch: java.lang.Throwable -> L8
            java.util.ArrayDeque<com.mbridge.msdk.thrid.okio.ByteString> r2 = r11.pongQueue     // Catch: java.lang.Throwable -> L8
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L8
            com.mbridge.msdk.thrid.okio.ByteString r2 = (com.mbridge.msdk.thrid.okio.ByteString) r2     // Catch: java.lang.Throwable -> L8
            r3 = 0
            r4 = -1
            if (r2 != 0) goto L53
            java.util.ArrayDeque<java.lang.Object> r5 = r11.messageAndCloseQueue     // Catch: java.lang.Throwable -> L8
            java.lang.Object r5 = r5.poll()     // Catch: java.lang.Throwable -> L8
            boolean r6 = r5 instanceof com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L8
            if (r6 == 0) goto L4a
            int r1 = r11.receivedCloseCode     // Catch: java.lang.Throwable -> L8
            java.lang.String r6 = r11.receivedCloseReason     // Catch: java.lang.Throwable -> L8
            if (r1 == r4) goto L34
            com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket$Streams r4 = r11.streams     // Catch: java.lang.Throwable -> L8
            r11.streams = r3     // Catch: java.lang.Throwable -> L8
            java.util.concurrent.ScheduledExecutorService r3 = r11.executor     // Catch: java.lang.Throwable -> L8
            r3.shutdown()     // Catch: java.lang.Throwable -> L8
        L32:
            r3 = r5
            goto L56
        L34:
            java.util.concurrent.ScheduledExecutorService r4 = r11.executor     // Catch: java.lang.Throwable -> L8
            com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket$CancelRunnable r7 = new com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket$CancelRunnable     // Catch: java.lang.Throwable -> L8
            r7.<init>()     // Catch: java.lang.Throwable -> L8
            r8 = r5
            com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket$Close r8 = (com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.Close) r8     // Catch: java.lang.Throwable -> L8
            long r8 = r8.cancelAfterCloseMillis     // Catch: java.lang.Throwable -> L8
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L8
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r7, r8, r10)     // Catch: java.lang.Throwable -> L8
            r11.cancelFuture = r4     // Catch: java.lang.Throwable -> L8
            r4 = r3
            goto L32
        L4a:
            if (r5 != 0) goto L4e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8
            return r1
        L4e:
            r4 = r3
            r6 = r4
            r3 = r5
        L51:
            r1 = -1
            goto L56
        L53:
            r4 = r3
            r6 = r4
            goto L51
        L56:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8
            if (r2 == 0) goto L5f
            r0.writePong(r2)     // Catch: java.lang.Throwable -> L5d
            goto La3
        L5d:
            r0 = move-exception
            goto Lae
        L5f:
            boolean r2 = r3 instanceof com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.Message     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L8f
            r1 = r3
            com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket$Message r1 = (com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.Message) r1     // Catch: java.lang.Throwable -> L5d
            com.mbridge.msdk.thrid.okio.ByteString r1 = r1.data     // Catch: java.lang.Throwable -> L5d
            com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket$Message r3 = (com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.Message) r3     // Catch: java.lang.Throwable -> L5d
            int r2 = r3.formatOpcode     // Catch: java.lang.Throwable -> L5d
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L5d
            long r5 = (long) r3     // Catch: java.lang.Throwable -> L5d
            com.mbridge.msdk.thrid.okio.Sink r0 = r0.newMessageSink(r2, r5)     // Catch: java.lang.Throwable -> L5d
            com.mbridge.msdk.thrid.okio.BufferedSink r0 = com.mbridge.msdk.thrid.okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L5d
            r0.write(r1)     // Catch: java.lang.Throwable -> L5d
            r0.close()     // Catch: java.lang.Throwable -> L5d
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L5d
            long r2 = r11.queueSize     // Catch: java.lang.Throwable -> L8c
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L8c
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L8c
            long r2 = r2 - r0
            r11.queueSize = r2     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8c
            goto La3
        L8c:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L5d
        L8f:
            boolean r2 = r3 instanceof com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto La8
            com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket$Close r3 = (com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.Close) r3     // Catch: java.lang.Throwable -> L5d
            int r2 = r3.code     // Catch: java.lang.Throwable -> L5d
            com.mbridge.msdk.thrid.okio.ByteString r3 = r3.reason     // Catch: java.lang.Throwable -> L5d
            r0.writeClose(r2, r3)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto La3
            com.mbridge.msdk.thrid.okhttp.WebSocketListener r0 = r11.listener     // Catch: java.lang.Throwable -> L5d
            r0.onClosed(r11, r1, r6)     // Catch: java.lang.Throwable -> L5d
        La3:
            com.mbridge.msdk.thrid.okhttp.internal.Util.closeQuietly(r4)
            r0 = 1
            return r0
        La8:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L5d
            r0.<init>()     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        Lae:
            com.mbridge.msdk.thrid.okhttp.internal.Util.closeQuietly(r4)
            throw r0
        Lb2:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.ws.RealWebSocket.writeOneFrame():boolean");
    }

    void writePingFrame() {
        int i8;
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (this.awaitingPong) {
                    i8 = this.sentPingCount;
                } else {
                    i8 = -1;
                }
                this.sentPingCount++;
                this.awaitingPong = true;
                if (i8 != -1) {
                    failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i8 - 1) + " successful ping/pongs)"), null);
                    return;
                }
                try {
                    webSocketWriter.writePing(ByteString.EMPTY);
                } catch (IOException e8) {
                    failWebSocket(e8, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    synchronized boolean close(int i8, String str, long j8) {
        ByteString byteString;
        try {
            WebSocketProtocol.validateCloseCode(i8);
            if (str != null) {
                byteString = ByteString.encodeUtf8(str);
                if (byteString.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: " + str);
                }
            } else {
                byteString = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i8, byteString, j8));
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString byteString) throws IOException {
        this.listener.onMessage(this, byteString);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.WebSocket
    public boolean send(ByteString byteString) {
        if (byteString != null) {
            return send(byteString, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    private synchronized boolean send(ByteString byteString, int i8) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + byteString.size() > MAX_QUEUE_SIZE) {
                close(PointerIconCompat.TYPE_CONTEXT_MENU, null);
                return false;
            }
            this.queueSize += byteString.size();
            this.messageAndCloseQueue.add(new Message(i8, byteString));
            runWriter();
            return true;
        }
        return false;
    }
}
