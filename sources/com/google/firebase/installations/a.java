package com.google.firebase.installations;

import com.google.firebase.installations.g;

/* loaded from: classes3.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final String f18474a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18475b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18476c;

    /* loaded from: classes3.dex */
    static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private String f18477a;

        /* renamed from: b, reason: collision with root package name */
        private Long f18478b;

        /* renamed from: c, reason: collision with root package name */
        private Long f18479c;

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f18477a == null) {
                str = " token";
            }
            if (this.f18478b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f18479c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f18477a, this.f18478b.longValue(), this.f18479c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str != null) {
                this.f18477a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j8) {
            this.f18479c = Long.valueOf(j8);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j8) {
            this.f18478b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f18474a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f18476c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f18475b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f18474a.equals(gVar.b()) && this.f18475b == gVar.d() && this.f18476c == gVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f18474a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f18475b;
        long j9 = this.f18476c;
        return ((hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f18474a + ", tokenExpirationTimestamp=" + this.f18475b + ", tokenCreationTimestamp=" + this.f18476c + "}";
    }

    private a(String str, long j8, long j9) {
        this.f18474a = str;
        this.f18475b = j8;
        this.f18476c = j9;
    }
}
