package Q6;

import K6.A;
import K6.q;
import K6.s;
import K6.u;
import K6.v;
import K6.x;
import K6.z;
import U6.AbstractC1457m;
import U6.C1449e;
import U6.C1452h;
import U6.L;
import U6.X;
import U6.Z;
import U6.a0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class f implements O6.c {

    /* renamed from: f, reason: collision with root package name */
    private static final C1452h f8875f;

    /* renamed from: g, reason: collision with root package name */
    private static final C1452h f8876g;

    /* renamed from: h, reason: collision with root package name */
    private static final C1452h f8877h;

    /* renamed from: i, reason: collision with root package name */
    private static final C1452h f8878i;

    /* renamed from: j, reason: collision with root package name */
    private static final C1452h f8879j;

    /* renamed from: k, reason: collision with root package name */
    private static final C1452h f8880k;

    /* renamed from: l, reason: collision with root package name */
    private static final C1452h f8881l;

    /* renamed from: m, reason: collision with root package name */
    private static final C1452h f8882m;

    /* renamed from: n, reason: collision with root package name */
    private static final List f8883n;

    /* renamed from: o, reason: collision with root package name */
    private static final List f8884o;

    /* renamed from: a, reason: collision with root package name */
    private final u f8885a;

    /* renamed from: b, reason: collision with root package name */
    private final s.a f8886b;

    /* renamed from: c, reason: collision with root package name */
    final N6.g f8887c;

    /* renamed from: d, reason: collision with root package name */
    private final g f8888d;

    /* renamed from: e, reason: collision with root package name */
    private i f8889e;

    /* loaded from: classes5.dex */
    class a extends AbstractC1457m {

        /* renamed from: b, reason: collision with root package name */
        boolean f8890b;

        /* renamed from: c, reason: collision with root package name */
        long f8891c;

        a(Z z8) {
            super(z8);
            this.f8890b = false;
            this.f8891c = 0L;
        }

        private void b(IOException iOException) {
            if (this.f8890b) {
                return;
            }
            this.f8890b = true;
            f fVar = f.this;
            fVar.f8887c.q(false, fVar, this.f8891c, iOException);
        }

        @Override // U6.AbstractC1457m, U6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            b(null);
        }

        @Override // U6.AbstractC1457m, U6.Z
        public long m(C1449e c1449e, long j8) {
            try {
                long m8 = a().m(c1449e, j8);
                if (m8 > 0) {
                    this.f8891c += m8;
                }
                return m8;
            } catch (IOException e8) {
                b(e8);
                throw e8;
            }
        }
    }

    static {
        C1452h f8 = C1452h.f("connection");
        f8875f = f8;
        C1452h f9 = C1452h.f("host");
        f8876g = f9;
        C1452h f10 = C1452h.f("keep-alive");
        f8877h = f10;
        C1452h f11 = C1452h.f("proxy-connection");
        f8878i = f11;
        C1452h f12 = C1452h.f("transfer-encoding");
        f8879j = f12;
        C1452h f13 = C1452h.f("te");
        f8880k = f13;
        C1452h f14 = C1452h.f("encoding");
        f8881l = f14;
        C1452h f15 = C1452h.f("upgrade");
        f8882m = f15;
        f8883n = L6.c.r(f8, f9, f10, f11, f13, f12, f14, f15, c.f8844f, c.f8845g, c.f8846h, c.f8847i);
        f8884o = L6.c.r(f8, f9, f10, f11, f13, f12, f14, f15);
    }

    public f(u uVar, s.a aVar, N6.g gVar, g gVar2) {
        this.f8885a = uVar;
        this.f8886b = aVar;
        this.f8887c = gVar;
        this.f8888d = gVar2;
    }

    public static List d(x xVar) {
        q d8 = xVar.d();
        ArrayList arrayList = new ArrayList(d8.e() + 4);
        arrayList.add(new c(c.f8844f, xVar.g()));
        arrayList.add(new c(c.f8845g, O6.i.c(xVar.i())));
        String c8 = xVar.c("Host");
        if (c8 != null) {
            arrayList.add(new c(c.f8847i, c8));
        }
        arrayList.add(new c(c.f8846h, xVar.i().A()));
        int e8 = d8.e();
        for (int i8 = 0; i8 < e8; i8++) {
            C1452h f8 = C1452h.f(d8.c(i8).toLowerCase(Locale.US));
            if (!f8883n.contains(f8)) {
                arrayList.add(new c(f8, d8.f(i8)));
            }
        }
        return arrayList;
    }

    public static z.a e(List list) {
        q.a aVar = new q.a();
        int size = list.size();
        O6.k kVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = (c) list.get(i8);
            if (cVar == null) {
                if (kVar != null && kVar.f7907b == 100) {
                    aVar = new q.a();
                    kVar = null;
                }
            } else {
                C1452h c1452h = cVar.f8848a;
                String P8 = cVar.f8849b.P();
                if (c1452h.equals(c.f8843e)) {
                    kVar = O6.k.a("HTTP/1.1 " + P8);
                } else if (!f8884o.contains(c1452h)) {
                    L6.a.f5408a.b(aVar, c1452h.P(), P8);
                }
            }
        }
        if (kVar != null) {
            return new z.a().m(v.HTTP_2).g(kVar.f7907b).j(kVar.f7908c).i(aVar.d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // O6.c
    public A a(z zVar) {
        N6.g gVar = this.f8887c;
        gVar.f6848f.q(gVar.f6847e);
        return new O6.h(zVar.j("Content-Type"), O6.e.b(zVar), L.d(new a(this.f8889e.i())));
    }

    @Override // O6.c
    public void b(x xVar) {
        boolean z8;
        if (this.f8889e != null) {
            return;
        }
        if (xVar.a() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        i u8 = this.f8888d.u(d(xVar), z8);
        this.f8889e = u8;
        a0 l8 = u8.l();
        long readTimeoutMillis = this.f8886b.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l8.g(readTimeoutMillis, timeUnit);
        this.f8889e.s().g(this.f8886b.writeTimeoutMillis(), timeUnit);
    }

    @Override // O6.c
    public X c(x xVar, long j8) {
        return this.f8889e.h();
    }

    @Override // O6.c
    public void finishRequest() {
        this.f8889e.h().close();
    }

    @Override // O6.c
    public void flushRequest() {
        this.f8888d.flush();
    }

    @Override // O6.c
    public z.a readResponseHeaders(boolean z8) {
        z.a e8 = e(this.f8889e.q());
        if (z8 && L6.a.f5408a.d(e8) == 100) {
            return null;
        }
        return e8;
    }
}
