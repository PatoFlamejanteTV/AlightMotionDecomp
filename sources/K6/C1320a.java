package K6;

import K6.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: K6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1320a {

    /* renamed from: a, reason: collision with root package name */
    final r f4829a;

    /* renamed from: b, reason: collision with root package name */
    final n f4830b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f4831c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1321b f4832d;

    /* renamed from: e, reason: collision with root package name */
    final List f4833e;

    /* renamed from: f, reason: collision with root package name */
    final List f4834f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f4835g;

    /* renamed from: h, reason: collision with root package name */
    final Proxy f4836h;

    /* renamed from: i, reason: collision with root package name */
    final SSLSocketFactory f4837i;

    /* renamed from: j, reason: collision with root package name */
    final HostnameVerifier f4838j;

    /* renamed from: k, reason: collision with root package name */
    final f f4839k;

    public C1320a(String str, int i8, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, InterfaceC1321b interfaceC1321b, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        r.a aVar = new r.a();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        this.f4829a = aVar.p(str2).e(str).k(i8).a();
        if (nVar != null) {
            this.f4830b = nVar;
            if (socketFactory != null) {
                this.f4831c = socketFactory;
                if (interfaceC1321b != null) {
                    this.f4832d = interfaceC1321b;
                    if (list != null) {
                        this.f4833e = L6.c.q(list);
                        if (list2 != null) {
                            this.f4834f = L6.c.q(list2);
                            if (proxySelector != null) {
                                this.f4835g = proxySelector;
                                this.f4836h = proxy;
                                this.f4837i = sSLSocketFactory;
                                this.f4838j = hostnameVerifier;
                                this.f4839k = fVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public f a() {
        return this.f4839k;
    }

    public List b() {
        return this.f4834f;
    }

    public n c() {
        return this.f4830b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(C1320a c1320a) {
        if (this.f4830b.equals(c1320a.f4830b) && this.f4832d.equals(c1320a.f4832d) && this.f4833e.equals(c1320a.f4833e) && this.f4834f.equals(c1320a.f4834f) && this.f4835g.equals(c1320a.f4835g) && L6.c.n(this.f4836h, c1320a.f4836h) && L6.c.n(this.f4837i, c1320a.f4837i) && L6.c.n(this.f4838j, c1320a.f4838j) && L6.c.n(this.f4839k, c1320a.f4839k) && l().w() == c1320a.l().w()) {
            return true;
        }
        return false;
    }

    public HostnameVerifier e() {
        return this.f4838j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1320a) {
            C1320a c1320a = (C1320a) obj;
            if (this.f4829a.equals(c1320a.f4829a) && d(c1320a)) {
                return true;
            }
        }
        return false;
    }

    public List f() {
        return this.f4833e;
    }

    public Proxy g() {
        return this.f4836h;
    }

    public InterfaceC1321b h() {
        return this.f4832d;
    }

    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int hashCode = (((((((((((527 + this.f4829a.hashCode()) * 31) + this.f4830b.hashCode()) * 31) + this.f4832d.hashCode()) * 31) + this.f4833e.hashCode()) * 31) + this.f4834f.hashCode()) * 31) + this.f4835g.hashCode()) * 31;
        Proxy proxy = this.f4836h;
        int i11 = 0;
        if (proxy != null) {
            i8 = proxy.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (hashCode + i8) * 31;
        SSLSocketFactory sSLSocketFactory = this.f4837i;
        if (sSLSocketFactory != null) {
            i9 = sSLSocketFactory.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i12 + i9) * 31;
        HostnameVerifier hostnameVerifier = this.f4838j;
        if (hostnameVerifier != null) {
            i10 = hostnameVerifier.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        f fVar = this.f4839k;
        if (fVar != null) {
            i11 = fVar.hashCode();
        }
        return i14 + i11;
    }

    public ProxySelector i() {
        return this.f4835g;
    }

    public SocketFactory j() {
        return this.f4831c;
    }

    public SSLSocketFactory k() {
        return this.f4837i;
    }

    public r l() {
        return this.f4829a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f4829a.k());
        sb.append(":");
        sb.append(this.f4829a.w());
        if (this.f4836h != null) {
            sb.append(", proxy=");
            sb.append(this.f4836h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f4835g);
        }
        sb.append("}");
        return sb.toString();
    }
}
