package com.mbridge.msdk.thrid.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.http.HttpMethod;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Request {
    final RequestBody body;
    private volatile CacheControl cacheControl;
    final Headers headers;
    final String method;
    final Map<Class<?>, Object> tags;
    final HttpUrl url;

    /* loaded from: classes4.dex */
    public static class Builder {
        RequestBody body;
        Headers.Builder headers;
        String method;
        Map<Class<?>, Object> tags;
        HttpUrl url;

        public Builder() {
            this.tags = Collections.emptyMap();
            this.method = ShareTarget.METHOD_GET;
            this.headers = new Headers.Builder();
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Request build() {
            if (this.url != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public Builder cacheControl(CacheControl cacheControl) {
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.isEmpty()) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", cacheControl2);
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public Builder get() {
            return method(ShareTarget.METHOD_GET, null);
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            if (str != null) {
                if (str.length() != 0) {
                    if (requestBody != null && !HttpMethod.permitsRequestBody(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (requestBody == null && HttpMethod.requiresRequestBody(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.method = str;
                    this.body = requestBody;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public Builder patch(RequestBody requestBody) {
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            return method(ShareTarget.METHOD_POST, requestBody);
        }

        public Builder put(RequestBody requestBody) {
            return method("PUT", requestBody);
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            if (httpUrl != null) {
                this.url = httpUrl;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public Builder delete() {
            return delete(Util.EMPTY_REQUEST);
        }

        public <T> Builder tag(Class<? super T> cls, T t8) {
            if (cls == null) {
                throw new NullPointerException("type == null");
            }
            if (t8 == null) {
                this.tags.remove(cls);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                this.tags.put(cls, cls.cast(t8));
            }
            return this;
        }

        public Builder url(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str = "https:" + str.substring(4);
                }
                return url(HttpUrl.get(str));
            }
            throw new NullPointerException("url == null");
        }

        Builder(Request request) {
            this.tags = Collections.emptyMap();
            this.url = request.url;
            this.method = request.method;
            this.body = request.body;
            this.tags = request.tags.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(request.tags);
            this.headers = request.headers.newBuilder();
        }

        public Builder url(URL url) {
            if (url != null) {
                return url(HttpUrl.get(url.toString()));
            }
            throw new NullPointerException("url == null");
        }
    }

    Request(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.tags = Util.immutableMap(builder.tags);
    }

    public RequestBody body() {
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

    public String header(String str) {
        return this.headers.get(str);
    }

    public Headers headers() {
        return this.headers;
    }

    public boolean isHttps() {
        return this.url.isHttps();
    }

    public String method() {
        return this.method;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        return "Request{method=" + this.method + ", url=" + this.url + ", tags=" + this.tags + '}';
    }

    public HttpUrl url() {
        return this.url;
    }

    public List<String> headers(String str) {
        return this.headers.values(str);
    }

    public <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.tags.get(cls));
    }
}
