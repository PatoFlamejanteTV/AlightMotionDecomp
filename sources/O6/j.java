package O6;

import K6.B;
import K6.C1320a;
import K6.o;
import K6.r;
import K6.s;
import K6.u;
import K6.x;
import K6.y;
import K6.z;
import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    private final u f7901a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7902b;

    /* renamed from: c, reason: collision with root package name */
    private volatile N6.g f7903c;

    /* renamed from: d, reason: collision with root package name */
    private Object f7904d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f7905e;

    public j(u uVar, boolean z8) {
        this.f7901a = uVar;
        this.f7902b = z8;
    }

    private C1320a b(r rVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        K6.f fVar;
        if (rVar.l()) {
            sSLSocketFactory = this.f7901a.C();
            hostnameVerifier = this.f7901a.n();
            fVar = this.f7901a.d();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new C1320a(rVar.k(), rVar.w(), this.f7901a.j(), this.f7901a.B(), sSLSocketFactory, hostnameVerifier, fVar, this.f7901a.w(), this.f7901a.t(), this.f7901a.s(), this.f7901a.g(), this.f7901a.x());
    }

    private x c(z zVar, B b9) {
        String j8;
        r z8;
        Proxy t8;
        if (zVar != null) {
            int h8 = zVar.h();
            String g8 = zVar.E().g();
            y yVar = null;
            if (h8 != 307 && h8 != 308) {
                if (h8 != 401) {
                    if (h8 != 503) {
                        if (h8 != 407) {
                            if (h8 != 408) {
                                switch (h8) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.f7901a.A()) {
                                    return null;
                                }
                                zVar.E().a();
                                if ((zVar.v() != null && zVar.v().h() == 408) || f(zVar, 0) > 0) {
                                    return null;
                                }
                                return zVar.E();
                            }
                        } else {
                            if (b9 != null) {
                                t8 = b9.b();
                            } else {
                                t8 = this.f7901a.t();
                            }
                            if (t8.type() == Proxy.Type.HTTP) {
                                return this.f7901a.w().a(b9, zVar);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        if ((zVar.v() != null && zVar.v().h() == 503) || f(zVar, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return zVar.E();
                    }
                } else {
                    return this.f7901a.b().a(b9, zVar);
                }
            } else if (!g8.equals(ShareTarget.METHOD_GET) && !g8.equals("HEAD")) {
                return null;
            }
            if (!this.f7901a.l() || (j8 = zVar.j("Location")) == null || (z8 = zVar.E().i().z(j8)) == null) {
                return null;
            }
            if (!z8.A().equals(zVar.E().i().A()) && !this.f7901a.m()) {
                return null;
            }
            x.a h9 = zVar.E().h();
            if (f.b(g8)) {
                boolean d8 = f.d(g8);
                if (f.c(g8)) {
                    h9.e(ShareTarget.METHOD_GET, null);
                } else {
                    if (d8) {
                        yVar = zVar.E().a();
                    }
                    h9.e(g8, yVar);
                }
                if (!d8) {
                    h9.f("Transfer-Encoding");
                    h9.f("Content-Length");
                    h9.f("Content-Type");
                }
            }
            if (!g(zVar, z8)) {
                h9.f("Authorization");
            }
            return h9.g(z8).a();
        }
        throw new IllegalStateException();
    }

    private boolean d(IOException iOException, boolean z8) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z8) {
                return false;
            }
            return true;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private boolean e(IOException iOException, N6.g gVar, boolean z8, x xVar) {
        gVar.p(iOException);
        if (!this.f7901a.A()) {
            return false;
        }
        if (z8) {
            xVar.a();
        }
        if (!d(iOException, z8) || !gVar.g()) {
            return false;
        }
        return true;
    }

    private int f(z zVar, int i8) {
        String j8 = zVar.j("Retry-After");
        if (j8 == null) {
            return i8;
        }
        if (j8.matches("\\d+")) {
            return Integer.valueOf(j8).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean g(z zVar, r rVar) {
        r i8 = zVar.E().i();
        if (i8.k().equals(rVar.k()) && i8.w() == rVar.w() && i8.A().equals(rVar.A())) {
            return true;
        }
        return false;
    }

    @Override // K6.s
    public z a(s.a aVar) {
        z f8;
        x c8;
        x request = aVar.request();
        g gVar = (g) aVar;
        K6.e b9 = gVar.b();
        o d8 = gVar.d();
        N6.g gVar2 = new N6.g(this.f7901a.f(), b(request.i()), b9, d8, this.f7904d);
        this.f7903c = gVar2;
        z zVar = null;
        int i8 = 0;
        while (!this.f7905e) {
            try {
                try {
                    f8 = gVar.f(request, gVar2, null, null);
                    if (zVar != null) {
                        f8 = f8.u().l(zVar.u().b(null).c()).c();
                    }
                    c8 = c(f8, gVar2.n());
                } catch (N6.e e8) {
                    if (!e(e8.c(), gVar2, false, request)) {
                        throw e8.c();
                    }
                } catch (IOException e9) {
                    if (!e(e9, gVar2, !(e9 instanceof Q6.a), request)) {
                        throw e9;
                    }
                }
                if (c8 == null) {
                    if (!this.f7902b) {
                        gVar2.j();
                    }
                    return f8;
                }
                L6.c.d(f8.a());
                int i9 = i8 + 1;
                if (i9 <= 20) {
                    c8.a();
                    if (!g(f8, c8.i())) {
                        gVar2.j();
                        gVar2 = new N6.g(this.f7901a.f(), b(c8.i()), b9, d8, this.f7904d);
                        this.f7903c = gVar2;
                    } else if (gVar2.b() != null) {
                        throw new IllegalStateException("Closing the body of " + f8 + " didn't close its backing stream. Bad interceptor?");
                    }
                    zVar = f8;
                    request = c8;
                    i8 = i9;
                } else {
                    gVar2.j();
                    throw new ProtocolException("Too many follow-up requests: " + i9);
                }
            } catch (Throwable th) {
                gVar2.p(null);
                gVar2.j();
                throw th;
            }
        }
        gVar2.j();
        throw new IOException("Canceled");
    }

    public void h(Object obj) {
        this.f7904d = obj;
    }
}
