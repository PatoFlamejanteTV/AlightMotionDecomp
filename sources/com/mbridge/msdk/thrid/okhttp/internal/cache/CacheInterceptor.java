package com.mbridge.msdk.thrid.okhttp.internal.cache;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.Interceptor;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.internal.Internal;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.cache.CacheStrategy;
import com.mbridge.msdk.thrid.okhttp.internal.http.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.internal.http.HttpMethod;
import com.mbridge.msdk.thrid.okhttp.internal.http.RealResponseBody;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.Okio;
import com.mbridge.msdk.thrid.okio.Sink;
import com.mbridge.msdk.thrid.okio.Source;
import com.mbridge.msdk.thrid.okio.Timeout;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class CacheInterceptor implements Interceptor {
    final InternalCache cache;

    public CacheInterceptor(InternalCache internalCache) {
        this.cache = internalCache;
    }

    private Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        Sink body = cacheRequest.body();
        if (body == null) {
            return response;
        }
        final BufferedSource source = response.body().source();
        final BufferedSink buffer = Okio.buffer(body);
        Source source2 = new Source() { // from class: com.mbridge.msdk.thrid.okhttp.internal.cache.CacheInterceptor.1
            boolean cacheRequestClosed;

            @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                source.close();
            }

            @Override // com.mbridge.msdk.thrid.okio.Source
            public long read(Buffer buffer2, long j8) throws IOException {
                try {
                    long read = source.read(buffer2, j8);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            buffer.close();
                        }
                        return -1L;
                    }
                    buffer2.copyTo(buffer.buffer(), buffer2.size() - read, read);
                    buffer.emitCompleteSegments();
                    return read;
                } catch (IOException e8) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e8;
                }
            }

            @Override // com.mbridge.msdk.thrid.okio.Source
            public Timeout timeout() {
                return source.timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(response.header("Content-Type"), response.body().contentLength(), Okio.buffer(source2))).build();
    }

    private static Headers combine(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i8 = 0; i8 < size; i8++) {
            String name = headers.name(i8);
            String value = headers.value(i8);
            if ((!"Warning".equalsIgnoreCase(name) || !value.startsWith("1")) && (isContentSpecificHeader(name) || !isEndToEnd(name) || headers2.get(name) == null)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        int size2 = headers2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            String name2 = headers2.name(i9);
            if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                Internal.instance.addLenient(builder, name2, headers2.value(i9));
            }
        }
        return builder.build();
    }

    static boolean isContentSpecificHeader(String str) {
        if (!"Content-Length".equalsIgnoreCase(str) && !"Content-Encoding".equalsIgnoreCase(str) && !"Content-Type".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    static boolean isEndToEnd(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    private static Response stripBody(Response response) {
        if (response != null && response.body() != null) {
            return response.newBuilder().body(null).build();
        }
        return response;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response response;
        InternalCache internalCache = this.cache;
        if (internalCache != null) {
            response = internalCache.get(chain.request());
        } else {
            response = null;
        }
        CacheStrategy cacheStrategy = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).get();
        Request request = cacheStrategy.networkRequest;
        Response response2 = cacheStrategy.cacheResponse;
        InternalCache internalCache2 = this.cache;
        if (internalCache2 != null) {
            internalCache2.trackResponse(cacheStrategy);
        }
        if (response != null && response2 == null) {
            Util.closeQuietly(response.body());
        }
        if (request == null && response2 == null) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (request == null) {
            return response2.newBuilder().cacheResponse(stripBody(response2)).build();
        }
        try {
            Response proceed = chain.proceed(request);
            if (proceed == null && response != null) {
            }
            if (response2 != null) {
                if (proceed.code() == 304) {
                    Response build = response2.newBuilder().headers(combine(response2.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
                    proceed.body().close();
                    this.cache.trackConditionalCacheHit();
                    this.cache.update(response2, build);
                    return build;
                }
                Util.closeQuietly(response2.body());
            }
            Response build2 = proceed.newBuilder().cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.hasBody(build2) && CacheStrategy.isCacheable(build2, request)) {
                    return cacheWritingResponse(this.cache.put(build2), build2);
                }
                if (HttpMethod.invalidatesCache(request.method())) {
                    try {
                        this.cache.remove(request);
                    } catch (IOException unused) {
                    }
                }
            }
            return build2;
        } finally {
            if (response != null) {
                Util.closeQuietly(response.body());
            }
        }
    }
}
