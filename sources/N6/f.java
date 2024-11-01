package N6;

import K6.B;
import K6.C1320a;
import K6.o;
import K6.r;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final C1320a f6833a;

    /* renamed from: b, reason: collision with root package name */
    private final d f6834b;

    /* renamed from: c, reason: collision with root package name */
    private final K6.e f6835c;

    /* renamed from: d, reason: collision with root package name */
    private final o f6836d;

    /* renamed from: f, reason: collision with root package name */
    private int f6838f;

    /* renamed from: e, reason: collision with root package name */
    private List f6837e = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    private List f6839g = Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    private final List f6840h = new ArrayList();

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f6841a;

        /* renamed from: b, reason: collision with root package name */
        private int f6842b = 0;

        a(List list) {
            this.f6841a = list;
        }

        public List a() {
            return new ArrayList(this.f6841a);
        }

        public boolean b() {
            if (this.f6842b < this.f6841a.size()) {
                return true;
            }
            return false;
        }

        public B c() {
            if (b()) {
                List list = this.f6841a;
                int i8 = this.f6842b;
                this.f6842b = i8 + 1;
                return (B) list.get(i8);
            }
            throw new NoSuchElementException();
        }
    }

    public f(C1320a c1320a, d dVar, K6.e eVar, o oVar) {
        this.f6833a = c1320a;
        this.f6834b = dVar;
        this.f6835c = eVar;
        this.f6836d = oVar;
        h(c1320a.l(), c1320a.g());
    }

    static String b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    private boolean d() {
        if (this.f6838f < this.f6837e.size()) {
            return true;
        }
        return false;
    }

    private Proxy f() {
        if (d()) {
            List list = this.f6837e;
            int i8 = this.f6838f;
            this.f6838f = i8 + 1;
            Proxy proxy = (Proxy) list.get(i8);
            g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f6833a.l().k() + "; exhausted proxy configurations: " + this.f6837e);
    }

    private void g(Proxy proxy) {
        String k8;
        int w8;
        this.f6839g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                k8 = b(inetSocketAddress);
                w8 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            k8 = this.f6833a.l().k();
            w8 = this.f6833a.l().w();
        }
        if (w8 >= 1 && w8 <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f6839g.add(InetSocketAddress.createUnresolved(k8, w8));
                return;
            }
            this.f6836d.j(this.f6835c, k8);
            List lookup = this.f6833a.c().lookup(k8);
            if (!lookup.isEmpty()) {
                this.f6836d.i(this.f6835c, k8, lookup);
                int size = lookup.size();
                for (int i8 = 0; i8 < size; i8++) {
                    this.f6839g.add(new InetSocketAddress((InetAddress) lookup.get(i8), w8));
                }
                return;
            }
            throw new UnknownHostException(this.f6833a.c() + " returned no addresses for " + k8);
        }
        throw new SocketException("No route to " + k8 + ":" + w8 + "; port is out of range");
    }

    private void h(r rVar, Proxy proxy) {
        List r8;
        if (proxy != null) {
            this.f6837e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f6833a.i().select(rVar.B());
            if (select != null && !select.isEmpty()) {
                r8 = L6.c.q(select);
            } else {
                r8 = L6.c.r(Proxy.NO_PROXY);
            }
            this.f6837e = r8;
        }
        this.f6838f = 0;
    }

    public void a(B b9, IOException iOException) {
        if (b9.b().type() != Proxy.Type.DIRECT && this.f6833a.i() != null) {
            this.f6833a.i().connectFailed(this.f6833a.l().B(), b9.b().address(), iOException);
        }
        this.f6834b.b(b9);
    }

    public boolean c() {
        if (!d() && this.f6840h.isEmpty()) {
            return false;
        }
        return true;
    }

    public a e() {
        if (c()) {
            ArrayList arrayList = new ArrayList();
            while (d()) {
                Proxy f8 = f();
                int size = this.f6839g.size();
                for (int i8 = 0; i8 < size; i8++) {
                    B b9 = new B(this.f6833a, f8, (InetSocketAddress) this.f6839g.get(i8));
                    if (this.f6834b.c(b9)) {
                        this.f6840h.add(b9);
                    } else {
                        arrayList.add(b9);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f6840h);
                this.f6840h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
