package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.Address;
import com.mbridge.msdk.thrid.okhttp.Call;
import com.mbridge.msdk.thrid.okhttp.ConnectionPool;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.Interceptor;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Route;
import com.mbridge.msdk.thrid.okhttp.internal.Internal;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.connection.RouteSelector;
import com.mbridge.msdk.thrid.okhttp.internal.http.HttpCodec;
import com.mbridge.msdk.thrid.okhttp.internal.http2.ConnectionShutdownException;
import com.mbridge.msdk.thrid.okhttp.internal.http2.ErrorCode;
import com.mbridge.msdk.thrid.okhttp.internal.http2.StreamResetException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* loaded from: classes4.dex */
public final class StreamAllocation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final Address address;
    public final Call call;
    private final Object callStackTrace;
    private boolean canceled;
    private HttpCodec codec;
    private RealConnection connection;
    private final ConnectionPool connectionPool;
    public final EventListener eventListener;
    private int refusedStreamCount;
    private boolean released;
    private boolean reportedAcquired;
    private Route route;
    private RouteSelector.Selection routeSelection;
    private final RouteSelector routeSelector;

    /* loaded from: classes4.dex */
    public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {
        public final Object callStackTrace;

        StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.callStackTrace = obj;
        }
    }

    public StreamAllocation(ConnectionPool connectionPool, Address address, Call call, EventListener eventListener, Object obj) {
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
        this.routeSelector = new RouteSelector(address, routeDatabase(), call, eventListener);
        this.callStackTrace = obj;
    }

    private Socket deallocate(boolean z8, boolean z9, boolean z10) {
        Socket socket;
        if (z10) {
            this.codec = null;
        }
        if (z9) {
            this.released = true;
        }
        RealConnection realConnection = this.connection;
        if (realConnection == null) {
            return null;
        }
        if (z8) {
            realConnection.noNewStreams = true;
        }
        if (this.codec != null) {
            return null;
        }
        if (!this.released && !realConnection.noNewStreams) {
            return null;
        }
        release(realConnection);
        if (this.connection.allocations.isEmpty()) {
            this.connection.idleAtNanos = System.nanoTime();
            if (Internal.instance.connectionBecameIdle(this.connectionPool, this.connection)) {
                socket = this.connection.socket();
                this.connection = null;
                return socket;
            }
        }
        socket = null;
        this.connection = null;
        return socket;
    }

    private RealConnection findConnection(int i8, int i9, int i10, int i11, boolean z8) throws IOException {
        RealConnection realConnection;
        Socket releaseIfNoNewStreams;
        RealConnection realConnection2;
        Socket socket;
        Route route;
        boolean z9;
        boolean z10;
        RouteSelector.Selection selection;
        synchronized (this.connectionPool) {
            try {
                if (!this.released) {
                    if (this.codec == null) {
                        if (!this.canceled) {
                            realConnection = this.connection;
                            releaseIfNoNewStreams = releaseIfNoNewStreams();
                            realConnection2 = this.connection;
                            socket = null;
                            if (realConnection2 != null) {
                                realConnection = null;
                            } else {
                                realConnection2 = null;
                            }
                            if (!this.reportedAcquired) {
                                realConnection = null;
                            }
                            if (realConnection2 == null) {
                                Internal.instance.get(this.connectionPool, this.address, this, null);
                                RealConnection realConnection3 = this.connection;
                                if (realConnection3 != null) {
                                    realConnection2 = realConnection3;
                                    z9 = true;
                                    route = null;
                                } else {
                                    route = this.route;
                                }
                            } else {
                                route = null;
                            }
                            z9 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } finally {
            }
        }
        Util.closeQuietly(releaseIfNoNewStreams);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (z9) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
        }
        if (realConnection2 != null) {
            this.route = this.connection.route();
            return realConnection2;
        }
        if (route == null && ((selection = this.routeSelection) == null || !selection.hasNext())) {
            this.routeSelection = this.routeSelector.next();
            z10 = true;
        } else {
            z10 = false;
        }
        synchronized (this.connectionPool) {
            try {
                if (!this.canceled) {
                    if (z10) {
                        List<Route> all = this.routeSelection.getAll();
                        int size = all.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                break;
                            }
                            Route route2 = all.get(i12);
                            Internal.instance.get(this.connectionPool, this.address, this, route2);
                            RealConnection realConnection4 = this.connection;
                            if (realConnection4 != null) {
                                this.route = route2;
                                realConnection2 = realConnection4;
                                z9 = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (!z9) {
                        if (route == null) {
                            route = this.routeSelection.next();
                        }
                        this.route = route;
                        this.refusedStreamCount = 0;
                        realConnection2 = new RealConnection(this.connectionPool, route);
                        acquire(realConnection2, false);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        if (z9) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
            return realConnection2;
        }
        realConnection2.connect(i8, i9, i10, i11, z8, this.call, this.eventListener);
        routeDatabase().connected(realConnection2.route());
        synchronized (this.connectionPool) {
            try {
                this.reportedAcquired = true;
                Internal.instance.put(this.connectionPool, realConnection2);
                if (realConnection2.isMultiplexed()) {
                    socket = Internal.instance.deduplicate(this.connectionPool, this.address, this);
                    realConnection2 = this.connection;
                }
            } finally {
            }
        }
        Util.closeQuietly(socket);
        this.eventListener.connectionAcquired(this.call, realConnection2);
        return realConnection2;
    }

    private RealConnection findHealthyConnection(int i8, int i9, int i10, int i11, boolean z8, boolean z9) throws IOException {
        while (true) {
            RealConnection findConnection = findConnection(i8, i9, i10, i11, z8);
            synchronized (this.connectionPool) {
                try {
                    if (findConnection.successCount == 0 && !findConnection.isMultiplexed()) {
                        return findConnection;
                    }
                    if (!findConnection.isHealthy(z9)) {
                        noNewStreams();
                    } else {
                        return findConnection;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private Socket releaseIfNoNewStreams() {
        RealConnection realConnection = this.connection;
        if (realConnection != null && realConnection.noNewStreams) {
            return deallocate(false, false, true);
        }
        return null;
    }

    private RouteDatabase routeDatabase() {
        return Internal.instance.routeDatabase(this.connectionPool);
    }

    public void acquire(RealConnection realConnection, boolean z8) {
        if (this.connection == null) {
            this.connection = realConnection;
            this.reportedAcquired = z8;
            realConnection.allocations.add(new StreamAllocationReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException();
    }

    public void cancel() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            httpCodec = this.codec;
            realConnection = this.connection;
        }
        if (httpCodec != null) {
            httpCodec.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public HttpCodec codec() {
        HttpCodec httpCodec;
        synchronized (this.connectionPool) {
            httpCodec = this.codec;
        }
        return httpCodec;
    }

    public synchronized RealConnection connection() {
        return this.connection;
    }

    public boolean hasMoreRoutes() {
        RouteSelector.Selection selection;
        if (this.route == null && (((selection = this.routeSelection) == null || !selection.hasNext()) && !this.routeSelector.hasNext())) {
            return false;
        }
        return true;
    }

    public HttpCodec newStream(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z8) {
        try {
            HttpCodec newCodec = findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z8).newCodec(okHttpClient, chain, this);
            synchronized (this.connectionPool) {
                this.codec = newCodec;
            }
            return newCodec;
        } catch (IOException e8) {
            throw new RouteException(e8);
        }
    }

    public void noNewStreams() {
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            deallocate = deallocate(true, false, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public void release() {
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            deallocate = deallocate(false, true, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.connectionReleased(this.call, realConnection);
            this.eventListener.callEnd(this.call);
        }
    }

    public Socket releaseAndAcquire(RealConnection realConnection) {
        if (this.codec == null && this.connection.allocations.size() == 1) {
            Reference<StreamAllocation> reference = this.connection.allocations.get(0);
            Socket deallocate = deallocate(true, false, false);
            this.connection = realConnection;
            realConnection.allocations.add(reference);
            return deallocate;
        }
        throw new IllegalStateException();
    }

    public Route route() {
        return this.route;
    }

    public void streamFailed(IOException iOException) {
        RealConnection realConnection;
        boolean z8;
        Socket deallocate;
        synchronized (this.connectionPool) {
            try {
                realConnection = null;
                if (iOException instanceof StreamResetException) {
                    ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                    if (errorCode == ErrorCode.REFUSED_STREAM) {
                        int i8 = this.refusedStreamCount + 1;
                        this.refusedStreamCount = i8;
                        if (i8 > 1) {
                            this.route = null;
                            z8 = true;
                        }
                        z8 = false;
                    } else {
                        if (errorCode != ErrorCode.CANCEL) {
                            this.route = null;
                            z8 = true;
                        }
                        z8 = false;
                    }
                } else {
                    RealConnection realConnection2 = this.connection;
                    if (realConnection2 != null && (!realConnection2.isMultiplexed() || (iOException instanceof ConnectionShutdownException))) {
                        if (this.connection.successCount == 0) {
                            Route route = this.route;
                            if (route != null && iOException != null) {
                                this.routeSelector.connectFailed(route, iOException);
                            }
                            this.route = null;
                        }
                        z8 = true;
                    }
                    z8 = false;
                }
                RealConnection realConnection3 = this.connection;
                deallocate = deallocate(z8, false, true);
                if (this.connection == null && this.reportedAcquired) {
                    realConnection = realConnection3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public void streamFinished(boolean z8, HttpCodec httpCodec, long j8, IOException iOException) {
        RealConnection realConnection;
        Socket deallocate;
        boolean z9;
        this.eventListener.responseBodyEnd(this.call, j8);
        synchronized (this.connectionPool) {
            if (httpCodec != null) {
                try {
                    if (httpCodec == this.codec) {
                        if (!z8) {
                            this.connection.successCount++;
                        }
                        realConnection = this.connection;
                        deallocate = deallocate(z8, false, true);
                        if (this.connection != null) {
                            realConnection = null;
                        }
                        z9 = this.released;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.codec + " but was " + httpCodec);
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (iOException != null) {
            this.eventListener.callFailed(this.call, Internal.instance.timeoutExit(this.call, iOException));
        } else if (z9) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.callEnd(this.call);
        }
    }

    public String toString() {
        RealConnection connection = connection();
        if (connection != null) {
            return connection.toString();
        }
        return this.address.toString();
    }

    private void release(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (realConnection.allocations.get(i8).get() == this) {
                realConnection.allocations.remove(i8);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
