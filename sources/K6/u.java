package K6;

import K6.e;
import K6.o;
import K6.q;
import K6.z;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public class u implements Cloneable, e.a {

    /* renamed from: B, reason: collision with root package name */
    static final List f5091B = L6.c.r(v.HTTP_2, v.HTTP_1_1);

    /* renamed from: C, reason: collision with root package name */
    static final List f5092C = L6.c.r(j.f5026f, j.f5028h);

    /* renamed from: A, reason: collision with root package name */
    final int f5093A;

    /* renamed from: a, reason: collision with root package name */
    final m f5094a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f5095b;

    /* renamed from: c, reason: collision with root package name */
    final List f5096c;

    /* renamed from: d, reason: collision with root package name */
    final List f5097d;

    /* renamed from: e, reason: collision with root package name */
    final List f5098e;

    /* renamed from: f, reason: collision with root package name */
    final List f5099f;

    /* renamed from: g, reason: collision with root package name */
    final o.c f5100g;

    /* renamed from: h, reason: collision with root package name */
    final ProxySelector f5101h;

    /* renamed from: i, reason: collision with root package name */
    final l f5102i;

    /* renamed from: j, reason: collision with root package name */
    final C1322c f5103j;

    /* renamed from: k, reason: collision with root package name */
    final M6.f f5104k;

    /* renamed from: l, reason: collision with root package name */
    final SocketFactory f5105l;

    /* renamed from: m, reason: collision with root package name */
    final SSLSocketFactory f5106m;

    /* renamed from: n, reason: collision with root package name */
    final T6.c f5107n;

    /* renamed from: o, reason: collision with root package name */
    final HostnameVerifier f5108o;

    /* renamed from: p, reason: collision with root package name */
    final f f5109p;

    /* renamed from: q, reason: collision with root package name */
    final InterfaceC1321b f5110q;

    /* renamed from: r, reason: collision with root package name */
    final InterfaceC1321b f5111r;

    /* renamed from: s, reason: collision with root package name */
    final i f5112s;

    /* renamed from: t, reason: collision with root package name */
    final n f5113t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f5114u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f5115v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f5116w;

    /* renamed from: x, reason: collision with root package name */
    final int f5117x;

    /* renamed from: y, reason: collision with root package name */
    final int f5118y;

    /* renamed from: z, reason: collision with root package name */
    final int f5119z;

    /* loaded from: classes5.dex */
    final class a extends L6.a {
        a() {
        }

        @Override // L6.a
        public void a(q.a aVar, String str) {
            aVar.b(str);
        }

        @Override // L6.a
        public void b(q.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        @Override // L6.a
        public void c(j jVar, SSLSocket sSLSocket, boolean z8) {
            jVar.a(sSLSocket, z8);
        }

        @Override // L6.a
        public int d(z.a aVar) {
            return aVar.f5189c;
        }

        @Override // L6.a
        public boolean e(i iVar, N6.c cVar) {
            return iVar.b(cVar);
        }

        @Override // L6.a
        public Socket f(i iVar, C1320a c1320a, N6.g gVar) {
            return iVar.c(c1320a, gVar);
        }

        @Override // L6.a
        public boolean g(C1320a c1320a, C1320a c1320a2) {
            return c1320a.d(c1320a2);
        }

        @Override // L6.a
        public N6.c h(i iVar, C1320a c1320a, N6.g gVar, B b9) {
            return iVar.d(c1320a, gVar, b9);
        }

        @Override // L6.a
        public void i(i iVar, N6.c cVar) {
            iVar.f(cVar);
        }

        @Override // L6.a
        public N6.d j(i iVar) {
            return iVar.f5022e;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        int f5120A;

        /* renamed from: b, reason: collision with root package name */
        Proxy f5122b;

        /* renamed from: j, reason: collision with root package name */
        C1322c f5130j;

        /* renamed from: k, reason: collision with root package name */
        M6.f f5131k;

        /* renamed from: m, reason: collision with root package name */
        SSLSocketFactory f5133m;

        /* renamed from: n, reason: collision with root package name */
        T6.c f5134n;

        /* renamed from: q, reason: collision with root package name */
        InterfaceC1321b f5137q;

        /* renamed from: r, reason: collision with root package name */
        InterfaceC1321b f5138r;

        /* renamed from: s, reason: collision with root package name */
        i f5139s;

        /* renamed from: t, reason: collision with root package name */
        n f5140t;

        /* renamed from: u, reason: collision with root package name */
        boolean f5141u;

        /* renamed from: v, reason: collision with root package name */
        boolean f5142v;

        /* renamed from: w, reason: collision with root package name */
        boolean f5143w;

        /* renamed from: x, reason: collision with root package name */
        int f5144x;

        /* renamed from: y, reason: collision with root package name */
        int f5145y;

        /* renamed from: z, reason: collision with root package name */
        int f5146z;

        /* renamed from: e, reason: collision with root package name */
        final List f5125e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        final List f5126f = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        m f5121a = new m();

        /* renamed from: c, reason: collision with root package name */
        List f5123c = u.f5091B;

        /* renamed from: d, reason: collision with root package name */
        List f5124d = u.f5092C;

        /* renamed from: g, reason: collision with root package name */
        o.c f5127g = o.k(o.f5059a);

        /* renamed from: h, reason: collision with root package name */
        ProxySelector f5128h = ProxySelector.getDefault();

        /* renamed from: i, reason: collision with root package name */
        l f5129i = l.f5050a;

        /* renamed from: l, reason: collision with root package name */
        SocketFactory f5132l = SocketFactory.getDefault();

        /* renamed from: o, reason: collision with root package name */
        HostnameVerifier f5135o = T6.d.f10000a;

        /* renamed from: p, reason: collision with root package name */
        f f5136p = f.f4898c;

        public b() {
            InterfaceC1321b interfaceC1321b = InterfaceC1321b.f4840a;
            this.f5137q = interfaceC1321b;
            this.f5138r = interfaceC1321b;
            this.f5139s = new i();
            this.f5140t = n.f5058a;
            this.f5141u = true;
            this.f5142v = true;
            this.f5143w = true;
            this.f5144x = 10000;
            this.f5145y = 10000;
            this.f5146z = 10000;
            this.f5120A = 0;
        }

        public u a() {
            return new u(this);
        }

        public b b(C1322c c1322c) {
            this.f5130j = c1322c;
            this.f5131k = null;
            return this;
        }
    }

    static {
        L6.a.f5408a = new a();
    }

    u(b bVar) {
        boolean z8;
        this.f5094a = bVar.f5121a;
        this.f5095b = bVar.f5122b;
        this.f5096c = bVar.f5123c;
        List list = bVar.f5124d;
        this.f5097d = list;
        this.f5098e = L6.c.q(bVar.f5125e);
        this.f5099f = L6.c.q(bVar.f5126f);
        this.f5100g = bVar.f5127g;
        this.f5101h = bVar.f5128h;
        this.f5102i = bVar.f5129i;
        this.f5103j = bVar.f5130j;
        this.f5104k = bVar.f5131k;
        this.f5105l = bVar.f5132l;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z8 = z8 || ((j) it.next()).d();
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f5133m;
        if (sSLSocketFactory == null && z8) {
            X509TrustManager E8 = E();
            this.f5106m = D(E8);
            this.f5107n = T6.c.b(E8);
        } else {
            this.f5106m = sSLSocketFactory;
            this.f5107n = bVar.f5134n;
        }
        this.f5108o = bVar.f5135o;
        this.f5109p = bVar.f5136p.e(this.f5107n);
        this.f5110q = bVar.f5137q;
        this.f5111r = bVar.f5138r;
        this.f5112s = bVar.f5139s;
        this.f5113t = bVar.f5140t;
        this.f5114u = bVar.f5141u;
        this.f5115v = bVar.f5142v;
        this.f5116w = bVar.f5143w;
        this.f5117x = bVar.f5144x;
        this.f5118y = bVar.f5145y;
        this.f5119z = bVar.f5146z;
        this.f5093A = bVar.f5120A;
        if (!this.f5098e.contains(null)) {
            if (!this.f5099f.contains(null)) {
                return;
            }
            throw new IllegalStateException("Null network interceptor: " + this.f5099f);
        }
        throw new IllegalStateException("Null interceptor: " + this.f5098e);
    }

    private SSLSocketFactory D(X509TrustManager x509TrustManager) {
        try {
            SSLContext k8 = S6.f.i().k();
            k8.init(null, new TrustManager[]{x509TrustManager}, null);
            return k8.getSocketFactory();
        } catch (GeneralSecurityException e8) {
            throw L6.c.a("No System TLS", e8);
        }
    }

    private X509TrustManager E() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e8) {
            throw L6.c.a("No System TLS", e8);
        }
    }

    public boolean A() {
        return this.f5116w;
    }

    public SocketFactory B() {
        return this.f5105l;
    }

    public SSLSocketFactory C() {
        return this.f5106m;
    }

    public int F() {
        return this.f5119z;
    }

    @Override // K6.e.a
    public e a(x xVar) {
        return w.d(this, xVar, false);
    }

    public InterfaceC1321b b() {
        return this.f5111r;
    }

    public C1322c c() {
        return this.f5103j;
    }

    public f d() {
        return this.f5109p;
    }

    public int e() {
        return this.f5117x;
    }

    public i f() {
        return this.f5112s;
    }

    public List g() {
        return this.f5097d;
    }

    public l h() {
        return this.f5102i;
    }

    public m i() {
        return this.f5094a;
    }

    public n j() {
        return this.f5113t;
    }

    public o.c k() {
        return this.f5100g;
    }

    public boolean l() {
        return this.f5115v;
    }

    public boolean m() {
        return this.f5114u;
    }

    public HostnameVerifier n() {
        return this.f5108o;
    }

    public List o() {
        return this.f5098e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M6.f p() {
        C1322c c1322c = this.f5103j;
        if (c1322c != null) {
            return c1322c.f4841a;
        }
        return this.f5104k;
    }

    public List q() {
        return this.f5099f;
    }

    public int r() {
        return this.f5093A;
    }

    public List s() {
        return this.f5096c;
    }

    public Proxy t() {
        return this.f5095b;
    }

    public InterfaceC1321b w() {
        return this.f5110q;
    }

    public ProxySelector x() {
        return this.f5101h;
    }

    public int y() {
        return this.f5118y;
    }
}
