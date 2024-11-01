package K6;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private static final g[] f5025e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f5026f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f5027g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f5028h;

    /* renamed from: a, reason: collision with root package name */
    final boolean f5029a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f5030b;

    /* renamed from: c, reason: collision with root package name */
    final String[] f5031c;

    /* renamed from: d, reason: collision with root package name */
    final String[] f5032d;

    static {
        g[] gVarArr = {g.f4953Z0, g.f4964d1, g.f4955a1, g.f4967e1, g.f4985k1, g.f4982j1, g.f4923K0, g.f4925L0, g.f4978i0, g.f4981j0, g.f4914G, g.f4922K, g.f4983k};
        f5025e = gVarArr;
        a b9 = new a(true).b(gVarArr);
        C c8 = C.TLS_1_0;
        j a9 = b9.e(C.TLS_1_3, C.TLS_1_2, C.TLS_1_1, c8).d(true).a();
        f5026f = a9;
        f5027g = new a(a9).e(c8).d(true).a();
        f5028h = new a(false).a();
    }

    j(a aVar) {
        this.f5029a = aVar.f5033a;
        this.f5031c = aVar.f5034b;
        this.f5032d = aVar.f5035c;
        this.f5030b = aVar.f5036d;
    }

    private j e(SSLSocket sSLSocket, boolean z8) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f5031c != null) {
            enabledCipherSuites = L6.c.v(g.f4956b, sSLSocket.getEnabledCipherSuites(), this.f5031c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f5032d != null) {
            enabledProtocols = L6.c.v(L6.c.f5426q, sSLSocket.getEnabledProtocols(), this.f5032d);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int s8 = L6.c.s(g.f4956b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z8 && s8 != -1) {
            enabledCipherSuites = L6.c.f(enabledCipherSuites, supportedCipherSuites[s8]);
        }
        return new a(this).c(enabledCipherSuites).f(enabledProtocols).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z8) {
        j e8 = e(sSLSocket, z8);
        String[] strArr = e8.f5032d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e8.f5031c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public List b() {
        String[] strArr = this.f5031c;
        if (strArr != null) {
            return g.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f5029a) {
            return false;
        }
        String[] strArr = this.f5032d;
        if (strArr != null && !L6.c.x(L6.c.f5426q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f5031c;
        if (strArr2 != null && !L6.c.x(g.f4956b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return false;
        }
        return true;
    }

    public boolean d() {
        return this.f5029a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z8 = this.f5029a;
        if (z8 != jVar.f5029a) {
            return false;
        }
        if (z8 && (!Arrays.equals(this.f5031c, jVar.f5031c) || !Arrays.equals(this.f5032d, jVar.f5032d) || this.f5030b != jVar.f5030b)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f5030b;
    }

    public List g() {
        String[] strArr = this.f5032d;
        if (strArr != null) {
            return C.b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f5029a) {
            return ((((527 + Arrays.hashCode(this.f5031c)) * 31) + Arrays.hashCode(this.f5032d)) * 31) + (!this.f5030b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        if (!this.f5029a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        if (this.f5031c == null) {
            str = "[all enabled]";
        } else {
            str = b().toString();
        }
        if (this.f5032d != null) {
            str2 = g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f5030b + ")";
    }

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f5033a;

        /* renamed from: b, reason: collision with root package name */
        String[] f5034b;

        /* renamed from: c, reason: collision with root package name */
        String[] f5035c;

        /* renamed from: d, reason: collision with root package name */
        boolean f5036d;

        a(boolean z8) {
            this.f5033a = z8;
        }

        public j a() {
            return new j(this);
        }

        public a b(g... gVarArr) {
            if (this.f5033a) {
                String[] strArr = new String[gVarArr.length];
                for (int i8 = 0; i8 < gVarArr.length; i8++) {
                    strArr[i8] = gVarArr[i8].f5016a;
                }
                return c(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(String... strArr) {
            if (this.f5033a) {
                if (strArr.length != 0) {
                    this.f5034b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z8) {
            if (this.f5033a) {
                this.f5036d = z8;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(C... cArr) {
            if (this.f5033a) {
                String[] strArr = new String[cArr.length];
                for (int i8 = 0; i8 < cArr.length; i8++) {
                    strArr[i8] = cArr[i8].f4828a;
                }
                return f(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a f(String... strArr) {
            if (this.f5033a) {
                if (strArr.length != 0) {
                    this.f5035c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(j jVar) {
            this.f5033a = jVar.f5029a;
            this.f5034b = jVar.f5031c;
            this.f5035c = jVar.f5032d;
            this.f5036d = jVar.f5030b;
        }
    }
}
