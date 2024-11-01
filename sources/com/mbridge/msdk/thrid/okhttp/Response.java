package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.internal.http.HttpHeaders;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Response implements Closeable {
    final ResponseBody body;
    private volatile CacheControl cacheControl;
    final Response cacheResponse;
    final int code;
    final Handshake handshake;
    final Headers headers;
    final String message;
    final Response networkResponse;
    final Response priorResponse;
    final Protocol protocol;
    final long receivedResponseAtMillis;
    final Request request;
    final long sentRequestAtMillis;

    Response(Builder builder) {
        this.request = builder.request;
        this.protocol = builder.protocol;
        this.code = builder.code;
        this.message = builder.message;
        this.handshake = builder.handshake;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.networkResponse = builder.networkResponse;
        this.cacheResponse = builder.cacheResponse;
        this.priorResponse = builder.priorResponse;
        this.sentRequestAtMillis = builder.sentRequestAtMillis;
        this.receivedResponseAtMillis = builder.receivedResponseAtMillis;
    }

    public ResponseBody body() {
        return this.body;
    }

    public CacheControl cacheControl() {
        CacheControl cacheControl = this.cacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.parse(this.headers);
            this.cacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    public Response cacheResponse() {
        return this.cacheResponse;
    }

    public List<Challenge> challenges() {
        String str;
        int i8 = this.code;
        if (i8 == 401) {
            str = "WWW-Authenticate";
        } else if (i8 == 407) {
            str = "Proxy-Authenticate";
        } else {
            return Collections.emptyList();
        }
        return HttpHeaders.parseChallenges(headers(), str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public int code() {
        return this.code;
    }

    public Handshake handshake() {
        return this.handshake;
    }

    public String header(String str) {
        return header(str, null);
    }

    public List<String> headers(String str) {
        return this.headers.values(str);
    }

    public boolean isRedirect() {
        int i8 = this.code;
        if (i8 == 307 || i8 == 308) {
            return true;
        }
        switch (i8) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public boolean isSuccessful() {
        int i8 = this.code;
        if (i8 >= 200 && i8 < 300) {
            return true;
        }
        return false;
    }

    public String message() {
        return this.message;
    }

    public Response networkResponse() {
        return this.networkResponse;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public ResponseBody peekBody(long j8) throws IOException {
        BufferedSource source = this.body.source();
        source.request(j8);
        Buffer m5462clone = source.buffer().m5462clone();
        if (m5462clone.size() > j8) {
            Buffer buffer = new Buffer();
            buffer.write(m5462clone, j8);
            m5462clone.clear();
            m5462clone = buffer;
        }
        return ResponseBody.create(this.body.contentType(), m5462clone.size(), m5462clone);
    }

    public Response priorResponse() {
        return this.priorResponse;
    }

    public Protocol protocol() {
        return this.protocol;
    }

    public long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public Request request() {
        return this.request;
    }

    public long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public String header(String str, String str2) {
        String str3 = this.headers.get(str);
        return str3 != null ? str3 : str2;
    }

    public Headers headers() {
        return this.headers;
    }

    /* loaded from: classes4.dex */
    public static class Builder {
        ResponseBody body;
        Response cacheResponse;
        int code;
        Handshake handshake;
        Headers.Builder headers;
        String message;
        Response networkResponse;
        Response priorResponse;
        Protocol protocol;
        long receivedResponseAtMillis;
        Request request;
        long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private void checkPriorResponse(Response response) {
            if (response.body == null) {
            } else {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void checkSupportResponse(String str, Response response) {
            if (response.body == null) {
                if (response.networkResponse == null) {
                    if (response.cacheResponse == null) {
                        if (response.priorResponse == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Response build() {
            if (this.request != null) {
                if (this.protocol != null) {
                    if (this.code >= 0) {
                        if (this.message != null) {
                            return new Response(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.code);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public Builder cacheResponse(Response response) {
            if (response != null) {
                checkSupportResponse("cacheResponse", response);
            }
            this.cacheResponse = response;
            return this;
        }

        public Builder code(int i8) {
            this.code = i8;
            return this;
        }

        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder networkResponse(Response response) {
            if (response != null) {
                checkSupportResponse("networkResponse", response);
            }
            this.networkResponse = response;
            return this;
        }

        public Builder priorResponse(Response response) {
            if (response != null) {
                checkPriorResponse(response);
            }
            this.priorResponse = response;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long j8) {
            this.receivedResponseAtMillis = j8;
            return this;
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        public Builder request(Request request) {
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long j8) {
            this.sentRequestAtMillis = j8;
            return this;
        }

        Builder(Response response) {
            this.code = -1;
            this.request = response.request;
            this.protocol = response.protocol;
            this.code = response.code;
            this.message = response.message;
            this.handshake = response.handshake;
            this.headers = response.headers.newBuilder();
            this.body = response.body;
            this.networkResponse = response.networkResponse;
            this.cacheResponse = response.cacheResponse;
            this.priorResponse = response.priorResponse;
            this.sentRequestAtMillis = response.sentRequestAtMillis;
            this.receivedResponseAtMillis = response.receivedResponseAtMillis;
        }
    }
}
