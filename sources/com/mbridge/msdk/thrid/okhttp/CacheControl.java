package com.mbridge.msdk.thrid.okhttp;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class CacheControl {
    String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* loaded from: classes4.dex */
    public static final class Builder {
        boolean immutable;
        int maxAgeSeconds = -1;
        int maxStaleSeconds = -1;
        int minFreshSeconds = -1;
        boolean noCache;
        boolean noStore;
        boolean noTransform;
        boolean onlyIfCached;

        public CacheControl build() {
            return new CacheControl(this);
        }

        public Builder immutable() {
            this.immutable = true;
            return this;
        }

        public Builder maxAge(int i8, TimeUnit timeUnit) {
            int i9;
            if (i8 >= 0) {
                long seconds = timeUnit.toSeconds(i8);
                if (seconds > 2147483647L) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = (int) seconds;
                }
                this.maxAgeSeconds = i9;
                return this;
            }
            throw new IllegalArgumentException("maxAge < 0: " + i8);
        }

        public Builder maxStale(int i8, TimeUnit timeUnit) {
            int i9;
            if (i8 >= 0) {
                long seconds = timeUnit.toSeconds(i8);
                if (seconds > 2147483647L) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = (int) seconds;
                }
                this.maxStaleSeconds = i9;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i8);
        }

        public Builder minFresh(int i8, TimeUnit timeUnit) {
            int i9;
            if (i8 >= 0) {
                long seconds = timeUnit.toSeconds(i8);
                if (seconds > 2147483647L) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = (int) seconds;
                }
                this.minFreshSeconds = i9;
                return this;
            }
            throw new IllegalArgumentException("minFresh < 0: " + i8);
        }

        public Builder noCache() {
            this.noCache = true;
            return this;
        }

        public Builder noStore() {
            this.noStore = true;
            return this;
        }

        public Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    private CacheControl(boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, String str) {
        this.noCache = z8;
        this.noStore = z9;
        this.maxAgeSeconds = i8;
        this.sMaxAgeSeconds = i9;
        this.isPrivate = z10;
        this.isPublic = z11;
        this.mustRevalidate = z12;
        this.maxStaleSeconds = i10;
        this.minFreshSeconds = i11;
        this.onlyIfCached = z13;
        this.noTransform = z14;
        this.immutable = z15;
        this.headerValue = str;
    }

    private String headerValue() {
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.thrid.okhttp.CacheControl parse(com.mbridge.msdk.thrid.okhttp.Headers r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.CacheControl.parse(com.mbridge.msdk.thrid.okhttp.Headers):com.mbridge.msdk.thrid.okhttp.CacheControl");
    }

    public boolean immutable() {
        return this.immutable;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public boolean noCache() {
        return this.noCache;
    }

    public boolean noStore() {
        return this.noStore;
    }

    public boolean noTransform() {
        return this.noTransform;
    }

    public boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str == null) {
            String headerValue = headerValue();
            this.headerValue = headerValue;
            return headerValue;
        }
        return str;
    }

    CacheControl(Builder builder) {
        this.noCache = builder.noCache;
        this.noStore = builder.noStore;
        this.maxAgeSeconds = builder.maxAgeSeconds;
        this.sMaxAgeSeconds = -1;
        this.isPrivate = false;
        this.isPublic = false;
        this.mustRevalidate = false;
        this.maxStaleSeconds = builder.maxStaleSeconds;
        this.minFreshSeconds = builder.minFreshSeconds;
        this.onlyIfCached = builder.onlyIfCached;
        this.noTransform = builder.noTransform;
        this.immutable = builder.immutable;
    }
}
