package N6;

import K6.B;
import K6.C1320a;
import K6.i;
import K6.o;
import K6.s;
import K6.u;
import N6.f;
import Q6.n;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C1320a f6843a;

    /* renamed from: b, reason: collision with root package name */
    private f.a f6844b;

    /* renamed from: c, reason: collision with root package name */
    private B f6845c;

    /* renamed from: d, reason: collision with root package name */
    private final i f6846d;

    /* renamed from: e, reason: collision with root package name */
    public final K6.e f6847e;

    /* renamed from: f, reason: collision with root package name */
    public final o f6848f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f6849g;

    /* renamed from: h, reason: collision with root package name */
    private final f f6850h;

    /* renamed from: i, reason: collision with root package name */
    private int f6851i;

    /* renamed from: j, reason: collision with root package name */
    private c f6852j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6853k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6854l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6855m;

    /* renamed from: n, reason: collision with root package name */
    private O6.c f6856n;

    /* loaded from: classes5.dex */
    public static final class a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final Object f6857a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f6857a = obj;
        }
    }

    public g(i iVar, C1320a c1320a, K6.e eVar, o oVar, Object obj) {
        this.f6846d = iVar;
        this.f6843a = c1320a;
        this.f6847e = eVar;
        this.f6848f = oVar;
        this.f6850h = new f(c1320a, o(), eVar, oVar);
        this.f6849g = obj;
    }

    private Socket d(boolean z8, boolean z9, boolean z10) {
        Socket socket;
        if (z10) {
            this.f6856n = null;
        }
        if (z9) {
            this.f6854l = true;
        }
        c cVar = this.f6852j;
        if (cVar == null) {
            return null;
        }
        if (z8) {
            cVar.f6825k = true;
        }
        if (this.f6856n != null) {
            return null;
        }
        if (!this.f6854l && !cVar.f6825k) {
            return null;
        }
        k(cVar);
        if (this.f6852j.f6828n.isEmpty()) {
            this.f6852j.f6829o = System.nanoTime();
            if (L6.a.f5408a.e(this.f6846d, this.f6852j)) {
                socket = this.f6852j.q();
                this.f6852j = null;
                return socket;
            }
        }
        socket = null;
        this.f6852j = null;
        return socket;
    }

    private c e(int i8, int i9, int i10, int i11, boolean z8) {
        c cVar;
        Socket m8;
        c cVar2;
        Socket socket;
        B b9;
        boolean z9;
        boolean z10;
        f.a aVar;
        synchronized (this.f6846d) {
            try {
                if (!this.f6854l) {
                    if (this.f6856n == null) {
                        if (!this.f6855m) {
                            cVar = this.f6852j;
                            m8 = m();
                            cVar2 = this.f6852j;
                            socket = null;
                            if (cVar2 != null) {
                                cVar = null;
                            } else {
                                cVar2 = null;
                            }
                            if (!this.f6853k) {
                                cVar = null;
                            }
                            if (cVar2 == null) {
                                L6.a.f5408a.h(this.f6846d, this.f6843a, this, null);
                                c cVar3 = this.f6852j;
                                if (cVar3 != null) {
                                    cVar2 = cVar3;
                                    z9 = true;
                                    b9 = null;
                                } else {
                                    b9 = this.f6845c;
                                }
                            } else {
                                b9 = null;
                            }
                            z9 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } finally {
            }
        }
        L6.c.e(m8);
        if (cVar != null) {
            this.f6848f.h(this.f6847e, cVar);
        }
        if (z9) {
            this.f6848f.g(this.f6847e, cVar2);
        }
        if (cVar2 != null) {
            return cVar2;
        }
        if (b9 == null && ((aVar = this.f6844b) == null || !aVar.b())) {
            this.f6844b = this.f6850h.e();
            z10 = true;
        } else {
            z10 = false;
        }
        synchronized (this.f6846d) {
            try {
                if (!this.f6855m) {
                    if (z10) {
                        List a9 = this.f6844b.a();
                        int size = a9.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                break;
                            }
                            B b10 = (B) a9.get(i12);
                            L6.a.f5408a.h(this.f6846d, this.f6843a, this, b10);
                            c cVar4 = this.f6852j;
                            if (cVar4 != null) {
                                this.f6845c = b10;
                                cVar2 = cVar4;
                                z9 = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (!z9) {
                        if (b9 == null) {
                            b9 = this.f6844b.c();
                        }
                        this.f6845c = b9;
                        this.f6851i = 0;
                        cVar2 = new c(this.f6846d, b9);
                        a(cVar2, false);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        if (z9) {
            this.f6848f.g(this.f6847e, cVar2);
            return cVar2;
        }
        cVar2.c(i8, i9, i10, i11, z8, this.f6847e, this.f6848f);
        o().a(cVar2.p());
        synchronized (this.f6846d) {
            try {
                this.f6853k = true;
                L6.a.f5408a.i(this.f6846d, cVar2);
                if (cVar2.m()) {
                    socket = L6.a.f5408a.f(this.f6846d, this.f6843a, this);
                    cVar2 = this.f6852j;
                }
            } finally {
            }
        }
        L6.c.e(socket);
        this.f6848f.g(this.f6847e, cVar2);
        return cVar2;
    }

    private c f(int i8, int i9, int i10, int i11, boolean z8, boolean z9) {
        while (true) {
            c e8 = e(i8, i9, i10, i11, z8);
            synchronized (this.f6846d) {
                try {
                    if (e8.f6826l == 0) {
                        return e8;
                    }
                    if (!e8.l(z9)) {
                        i();
                    } else {
                        return e8;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void k(c cVar) {
        int size = cVar.f6828n.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((Reference) cVar.f6828n.get(i8)).get() == this) {
                cVar.f6828n.remove(i8);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket m() {
        c cVar = this.f6852j;
        if (cVar != null && cVar.f6825k) {
            return d(false, false, true);
        }
        return null;
    }

    private d o() {
        return L6.a.f5408a.j(this.f6846d);
    }

    public void a(c cVar, boolean z8) {
        if (this.f6852j == null) {
            this.f6852j = cVar;
            this.f6853k = z8;
            cVar.f6828n.add(new a(this, this.f6849g));
            return;
        }
        throw new IllegalStateException();
    }

    public O6.c b() {
        O6.c cVar;
        synchronized (this.f6846d) {
            cVar = this.f6856n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f6852j;
    }

    public boolean g() {
        f.a aVar;
        if (this.f6845c == null && (((aVar = this.f6844b) == null || !aVar.b()) && !this.f6850h.c())) {
            return false;
        }
        return true;
    }

    public O6.c h(u uVar, s.a aVar, boolean z8) {
        try {
            O6.c o8 = f(aVar.connectTimeoutMillis(), aVar.readTimeoutMillis(), aVar.writeTimeoutMillis(), uVar.r(), uVar.A(), z8).o(uVar, aVar, this);
            synchronized (this.f6846d) {
                this.f6856n = o8;
            }
            return o8;
        } catch (IOException e8) {
            throw new e(e8);
        }
    }

    public void i() {
        c cVar;
        Socket d8;
        synchronized (this.f6846d) {
            cVar = this.f6852j;
            d8 = d(true, false, false);
            if (this.f6852j != null) {
                cVar = null;
            }
        }
        L6.c.e(d8);
        if (cVar != null) {
            this.f6848f.h(this.f6847e, cVar);
        }
    }

    public void j() {
        c cVar;
        Socket d8;
        synchronized (this.f6846d) {
            cVar = this.f6852j;
            d8 = d(false, true, false);
            if (this.f6852j != null) {
                cVar = null;
            }
        }
        L6.c.e(d8);
        if (cVar != null) {
            this.f6848f.h(this.f6847e, cVar);
        }
    }

    public Socket l(c cVar) {
        if (this.f6856n == null && this.f6852j.f6828n.size() == 1) {
            Reference reference = (Reference) this.f6852j.f6828n.get(0);
            Socket d8 = d(true, false, false);
            this.f6852j = cVar;
            cVar.f6828n.add(reference);
            return d8;
        }
        throw new IllegalStateException();
    }

    public B n() {
        return this.f6845c;
    }

    public void p(IOException iOException) {
        c cVar;
        boolean z8;
        Socket d8;
        synchronized (this.f6846d) {
            try {
                cVar = null;
                if (iOException instanceof n) {
                    Q6.b bVar = ((n) iOException).f9006a;
                    Q6.b bVar2 = Q6.b.REFUSED_STREAM;
                    if (bVar == bVar2) {
                        this.f6851i++;
                    }
                    if (bVar != bVar2 || this.f6851i > 1) {
                        this.f6845c = null;
                        z8 = true;
                    }
                    z8 = false;
                } else {
                    c cVar2 = this.f6852j;
                    if (cVar2 != null && (!cVar2.m() || (iOException instanceof Q6.a))) {
                        if (this.f6852j.f6826l == 0) {
                            B b9 = this.f6845c;
                            if (b9 != null && iOException != null) {
                                this.f6850h.a(b9, iOException);
                            }
                            this.f6845c = null;
                        }
                        z8 = true;
                    }
                    z8 = false;
                }
                c cVar3 = this.f6852j;
                d8 = d(z8, false, true);
                if (this.f6852j == null && this.f6853k) {
                    cVar = cVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        L6.c.e(d8);
        if (cVar != null) {
            this.f6848f.h(this.f6847e, cVar);
        }
    }

    public void q(boolean z8, O6.c cVar, long j8, IOException iOException) {
        c cVar2;
        Socket d8;
        boolean z9;
        this.f6848f.p(this.f6847e, j8);
        synchronized (this.f6846d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f6856n) {
                        if (!z8) {
                            this.f6852j.f6826l++;
                        }
                        cVar2 = this.f6852j;
                        d8 = d(z8, false, true);
                        if (this.f6852j != null) {
                            cVar2 = null;
                        }
                        z9 = this.f6854l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f6856n + " but was " + cVar);
        }
        L6.c.e(d8);
        if (cVar2 != null) {
            this.f6848f.h(this.f6847e, cVar2);
        }
        if (iOException != null) {
            this.f6848f.b(this.f6847e, iOException);
        } else if (z9) {
            this.f6848f.a(this.f6847e);
        }
    }

    public String toString() {
        c c8 = c();
        if (c8 != null) {
            return c8.toString();
        }
        return this.f6843a.toString();
    }
}
