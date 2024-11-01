package N6;

import K6.B;
import K6.C1320a;
import K6.h;
import K6.i;
import K6.j;
import K6.o;
import K6.p;
import K6.r;
import K6.s;
import K6.u;
import K6.v;
import K6.x;
import K6.z;
import Q6.g;
import U6.InterfaceC1450f;
import U6.InterfaceC1451g;
import U6.L;
import U6.Z;
import U6.a0;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class c extends g.h implements h {

    /* renamed from: b, reason: collision with root package name */
    private final i f6816b;

    /* renamed from: c, reason: collision with root package name */
    private final B f6817c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f6818d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f6819e;

    /* renamed from: f, reason: collision with root package name */
    private p f6820f;

    /* renamed from: g, reason: collision with root package name */
    private v f6821g;

    /* renamed from: h, reason: collision with root package name */
    private Q6.g f6822h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC1451g f6823i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC1450f f6824j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6825k;

    /* renamed from: l, reason: collision with root package name */
    public int f6826l;

    /* renamed from: m, reason: collision with root package name */
    public int f6827m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final List f6828n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f6829o = Long.MAX_VALUE;

    public c(i iVar, B b9) {
        this.f6816b = iVar;
        this.f6817c = b9;
    }

    private void d(int i8, int i9, K6.e eVar, o oVar) {
        Socket createSocket;
        Proxy b9 = this.f6817c.b();
        C1320a a9 = this.f6817c.a();
        if (b9.type() != Proxy.Type.DIRECT && b9.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(b9);
        } else {
            createSocket = a9.j().createSocket();
        }
        this.f6818d = createSocket;
        oVar.f(eVar, this.f6817c.d(), b9);
        this.f6818d.setSoTimeout(i9);
        try {
            S6.f.i().g(this.f6818d, this.f6817c.d(), i8);
            try {
                this.f6823i = L.d(L.m(this.f6818d));
                this.f6824j = L.c(L.i(this.f6818d));
            } catch (NullPointerException e8) {
                if (!"throw with null exception".equals(e8.getMessage())) {
                } else {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f6817c.d());
            connectException.initCause(e9);
            throw connectException;
        }
    }

    private void e(b bVar) {
        v vVar;
        C1320a a9 = this.f6817c.a();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) a9.k().createSocket(this.f6818d, a9.l().k(), a9.l().w(), true);
                try {
                    j a10 = bVar.a(sSLSocket2);
                    if (a10.f()) {
                        S6.f.i().f(sSLSocket2, a9.l().k(), a9.f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    if (n(session)) {
                        p c8 = p.c(session);
                        if (a9.e().verify(a9.l().k(), session)) {
                            a9.a().a(a9.l().k(), c8.e());
                            if (a10.f()) {
                                str = S6.f.i().l(sSLSocket2);
                            }
                            this.f6819e = sSLSocket2;
                            this.f6823i = L.d(L.m(sSLSocket2));
                            this.f6824j = L.c(L.i(this.f6819e));
                            this.f6820f = c8;
                            if (str != null) {
                                vVar = v.a(str);
                            } else {
                                vVar = v.HTTP_1_1;
                            }
                            this.f6821g = vVar;
                            S6.f.i().a(sSLSocket2);
                            return;
                        }
                        X509Certificate x509Certificate = (X509Certificate) c8.e().get(0);
                        throw new SSLPeerUnverifiedException("Hostname " + a9.l().k() + " not verified:\n    certificate: " + K6.f.c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + T6.d.a(x509Certificate));
                    }
                    throw new IOException("a valid ssl session was not established");
                } catch (AssertionError e8) {
                    e = e8;
                    if (L6.c.w(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        S6.f.i().a(sSLSocket);
                    }
                    L6.c.e(sSLSocket);
                    throw th;
                }
            } catch (AssertionError e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void f(int i8, int i9, int i10, K6.e eVar, o oVar) {
        x h8 = h();
        r i11 = h8.i();
        for (int i12 = 0; i12 < 21; i12++) {
            d(i8, i9, eVar, oVar);
            h8 = g(i9, i10, h8, i11);
            if (h8 != null) {
                L6.c.e(this.f6818d);
                this.f6818d = null;
                this.f6824j = null;
                this.f6823i = null;
                oVar.d(eVar, this.f6817c.d(), this.f6817c.b(), null);
            } else {
                return;
            }
        }
    }

    private x g(int i8, int i9, x xVar, r rVar) {
        String str = "CONNECT " + L6.c.p(rVar, true) + " HTTP/1.1";
        while (true) {
            P6.a aVar = new P6.a(null, null, this.f6823i, this.f6824j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f6823i.timeout().g(i8, timeUnit);
            this.f6824j.timeout().g(i9, timeUnit);
            aVar.l(xVar.d(), str);
            aVar.finishRequest();
            z c8 = aVar.readResponseHeaders(false).o(xVar).c();
            long b9 = O6.e.b(c8);
            if (b9 == -1) {
                b9 = 0;
            }
            Z h8 = aVar.h(b9);
            L6.c.y(h8, Integer.MAX_VALUE, timeUnit);
            h8.close();
            int h9 = c8.h();
            if (h9 != 200) {
                if (h9 == 407) {
                    x a9 = this.f6817c.a().h().a(this.f6817c, c8);
                    if (a9 != null) {
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c8.j("Connection"))) {
                            return a9;
                        }
                        xVar = a9;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c8.h());
                }
            } else {
                if (this.f6823i.buffer().exhausted() && this.f6824j.buffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private x h() {
        return new x.a().g(this.f6817c.a().l()).c("Host", L6.c.p(this.f6817c.a().l(), true)).c("Proxy-Connection", "Keep-Alive").c(Command.HTTP_HEADER_USER_AGENT, L6.d.a()).a();
    }

    private void i(b bVar, int i8, K6.e eVar, o oVar) {
        if (this.f6817c.a().k() == null) {
            this.f6821g = v.HTTP_1_1;
            this.f6819e = this.f6818d;
            return;
        }
        oVar.u(eVar);
        e(bVar);
        oVar.t(eVar, this.f6820f);
        if (this.f6821g == v.HTTP_2) {
            this.f6819e.setSoTimeout(0);
            Q6.g a9 = new g.C0183g(true).d(this.f6819e, this.f6817c.a().l().k(), this.f6823i, this.f6824j).b(this).c(i8).a();
            this.f6822h = a9;
            a9.I();
        }
    }

    private boolean n(SSLSession sSLSession) {
        if (!"NONE".equals(sSLSession.getProtocol()) && !"SSL_NULL_WITH_NULL_NULL".equals(sSLSession.getCipherSuite())) {
            return true;
        }
        return false;
    }

    @Override // Q6.g.h
    public void a(Q6.g gVar) {
        synchronized (this.f6816b) {
            this.f6827m = gVar.r();
        }
    }

    @Override // Q6.g.h
    public void b(Q6.i iVar) {
        iVar.d(Q6.b.REFUSED_STREAM);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r17, int r18, int r19, int r20, boolean r21, K6.e r22, K6.o r23) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.c.c(int, int, int, int, boolean, K6.e, K6.o):void");
    }

    public p j() {
        return this.f6820f;
    }

    public boolean k(C1320a c1320a, B b9) {
        if (this.f6828n.size() >= this.f6827m || this.f6825k || !L6.a.f5408a.g(this.f6817c.a(), c1320a)) {
            return false;
        }
        if (c1320a.l().k().equals(p().a().l().k())) {
            return true;
        }
        if (this.f6822h == null || b9 == null) {
            return false;
        }
        Proxy.Type type = b9.b().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.f6817c.b().type() != type2 || !this.f6817c.d().equals(b9.d()) || b9.a().e() != T6.d.f10000a || !r(c1320a.l())) {
            return false;
        }
        try {
            c1320a.a().a(c1320a.l().k(), j().e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean l(boolean z8) {
        if (this.f6819e.isClosed() || this.f6819e.isInputShutdown() || this.f6819e.isOutputShutdown()) {
            return false;
        }
        if (this.f6822h != null) {
            return !r0.q();
        }
        if (z8) {
            try {
                int soTimeout = this.f6819e.getSoTimeout();
                try {
                    this.f6819e.setSoTimeout(1);
                    if (this.f6823i.exhausted()) {
                        return false;
                    }
                    return true;
                } finally {
                    this.f6819e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean m() {
        if (this.f6822h != null) {
            return true;
        }
        return false;
    }

    public O6.c o(u uVar, s.a aVar, g gVar) {
        if (this.f6822h != null) {
            return new Q6.f(uVar, aVar, gVar, this.f6822h);
        }
        this.f6819e.setSoTimeout(aVar.readTimeoutMillis());
        a0 timeout = this.f6823i.timeout();
        long readTimeoutMillis = aVar.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(readTimeoutMillis, timeUnit);
        this.f6824j.timeout().g(aVar.writeTimeoutMillis(), timeUnit);
        return new P6.a(uVar, gVar, this.f6823i, this.f6824j);
    }

    public B p() {
        return this.f6817c;
    }

    public Socket q() {
        return this.f6819e;
    }

    public boolean r(r rVar) {
        if (rVar.w() != this.f6817c.a().l().w()) {
            return false;
        }
        if (rVar.k().equals(this.f6817c.a().l().k())) {
            return true;
        }
        if (this.f6820f == null || !T6.d.f10000a.c(rVar.k(), (X509Certificate) this.f6820f.e().get(0))) {
            return false;
        }
        return true;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f6817c.a().l().k());
        sb.append(":");
        sb.append(this.f6817c.a().l().w());
        sb.append(", proxy=");
        sb.append(this.f6817c.b());
        sb.append(" hostAddress=");
        sb.append(this.f6817c.d());
        sb.append(" cipherSuite=");
        p pVar = this.f6820f;
        if (pVar != null) {
            obj = pVar.a();
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f6821g);
        sb.append('}');
        return sb.toString();
    }
}
