package Q6;

import U6.C1447c;
import U6.C1449e;
import U6.InterfaceC1451g;
import U6.X;
import U6.Z;
import U6.a0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    long f8967b;

    /* renamed from: c, reason: collision with root package name */
    final int f8968c;

    /* renamed from: d, reason: collision with root package name */
    final g f8969d;

    /* renamed from: e, reason: collision with root package name */
    private final List f8970e;

    /* renamed from: f, reason: collision with root package name */
    private List f8971f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8972g;

    /* renamed from: h, reason: collision with root package name */
    private final b f8973h;

    /* renamed from: i, reason: collision with root package name */
    final a f8974i;

    /* renamed from: a, reason: collision with root package name */
    long f8966a = 0;

    /* renamed from: j, reason: collision with root package name */
    final c f8975j = new c();

    /* renamed from: k, reason: collision with root package name */
    final c f8976k = new c();

    /* renamed from: l, reason: collision with root package name */
    Q6.b f8977l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1449e f8978a = new C1449e();

        /* renamed from: b, reason: collision with root package name */
        boolean f8979b;

        /* renamed from: c, reason: collision with root package name */
        boolean f8980c;

        a() {
        }

        private void a(boolean z8) {
            i iVar;
            long min;
            i iVar2;
            boolean z9;
            synchronized (i.this) {
                i.this.f8976k.v();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f8967b > 0 || this.f8980c || this.f8979b || iVar.f8977l != null) {
                            break;
                        } else {
                            iVar.r();
                        }
                    } finally {
                        i.this.f8976k.C();
                    }
                }
                iVar.f8976k.C();
                i.this.c();
                min = Math.min(i.this.f8967b, this.f8978a.E());
                iVar2 = i.this;
                iVar2.f8967b -= min;
            }
            iVar2.f8976k.v();
            try {
                i iVar3 = i.this;
                g gVar = iVar3.f8969d;
                int i8 = iVar3.f8968c;
                if (z8 && min == this.f8978a.E()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gVar.K(i8, z9, this.f8978a, min);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // U6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                try {
                    if (this.f8979b) {
                        return;
                    }
                    if (!i.this.f8974i.f8980c) {
                        if (this.f8978a.E() > 0) {
                            while (this.f8978a.E() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.f8969d.K(iVar.f8968c, true, null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f8979b = true;
                    }
                    i.this.f8969d.flush();
                    i.this.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // U6.X
        public void f(C1449e c1449e, long j8) {
            this.f8978a.f(c1449e, j8);
            while (this.f8978a.E() >= 16384) {
                a(false);
            }
        }

        @Override // U6.X, java.io.Flushable
        public void flush() {
            synchronized (i.this) {
                i.this.c();
            }
            while (this.f8978a.E() > 0) {
                a(false);
                i.this.f8969d.flush();
            }
        }

        @Override // U6.X
        public a0 timeout() {
            return i.this.f8976k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final C1449e f8982a = new C1449e();

        /* renamed from: b, reason: collision with root package name */
        private final C1449e f8983b = new C1449e();

        /* renamed from: c, reason: collision with root package name */
        private final long f8984c;

        /* renamed from: d, reason: collision with root package name */
        boolean f8985d;

        /* renamed from: e, reason: collision with root package name */
        boolean f8986e;

        b(long j8) {
            this.f8984c = j8;
        }

        private void a() {
            if (!this.f8985d) {
                if (i.this.f8977l == null) {
                    return;
                } else {
                    throw new n(i.this.f8977l);
                }
            }
            throw new IOException("stream closed");
        }

        private void g() {
            i.this.f8975j.v();
            while (this.f8983b.E() == 0 && !this.f8986e && !this.f8985d) {
                try {
                    i iVar = i.this;
                    if (iVar.f8977l != null) {
                        break;
                    } else {
                        iVar.r();
                    }
                } finally {
                    i.this.f8975j.C();
                }
            }
        }

        void b(InterfaceC1451g interfaceC1451g, long j8) {
            boolean z8;
            boolean z9;
            boolean z10;
            while (j8 > 0) {
                synchronized (i.this) {
                    z8 = this.f8986e;
                    z9 = false;
                    if (this.f8983b.E() + j8 > this.f8984c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    interfaceC1451g.skip(j8);
                    i.this.f(Q6.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z8) {
                    interfaceC1451g.skip(j8);
                    return;
                }
                long m8 = interfaceC1451g.m(this.f8982a, j8);
                if (m8 != -1) {
                    j8 -= m8;
                    synchronized (i.this) {
                        try {
                            if (this.f8983b.E() == 0) {
                                z9 = true;
                            }
                            this.f8983b.L(this.f8982a);
                            if (z9) {
                                i.this.notifyAll();
                            }
                        } finally {
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                this.f8985d = true;
                this.f8983b.a();
                i.this.notifyAll();
            }
            i.this.b();
        }

        @Override // U6.Z
        public long m(C1449e c1449e, long j8) {
            if (j8 >= 0) {
                synchronized (i.this) {
                    try {
                        g();
                        a();
                        if (this.f8983b.E() == 0) {
                            return -1L;
                        }
                        C1449e c1449e2 = this.f8983b;
                        long m8 = c1449e2.m(c1449e, Math.min(j8, c1449e2.E()));
                        i iVar = i.this;
                        long j9 = iVar.f8966a + m8;
                        iVar.f8966a = j9;
                        if (j9 >= iVar.f8969d.f8907n.d() / 2) {
                            i iVar2 = i.this;
                            iVar2.f8969d.O(iVar2.f8968c, iVar2.f8966a);
                            i.this.f8966a = 0L;
                        }
                        synchronized (i.this.f8969d) {
                            try {
                                g gVar = i.this.f8969d;
                                long j10 = gVar.f8905l + m8;
                                gVar.f8905l = j10;
                                if (j10 >= gVar.f8907n.d() / 2) {
                                    g gVar2 = i.this.f8969d;
                                    gVar2.O(0, gVar2.f8905l);
                                    i.this.f8969d.f8905l = 0L;
                                }
                            } finally {
                            }
                        }
                        return m8;
                    } finally {
                    }
                }
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }

        @Override // U6.Z
        public a0 timeout() {
            return i.this.f8975j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c extends C1447c {
        c() {
        }

        @Override // U6.C1447c
        protected void B() {
            i.this.f(Q6.b.CANCEL);
        }

        public void C() {
            if (!w()) {
            } else {
                throw x(null);
            }
        }

        @Override // U6.C1447c
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i8, g gVar, boolean z8, boolean z9, List list) {
        if (gVar != null) {
            if (list != null) {
                this.f8968c = i8;
                this.f8969d = gVar;
                this.f8967b = gVar.f8908o.d();
                b bVar = new b(gVar.f8907n.d());
                this.f8973h = bVar;
                a aVar = new a();
                this.f8974i = aVar;
                bVar.f8986e = z9;
                aVar.f8980c = z8;
                this.f8970e = list;
                return;
            }
            throw new NullPointerException("requestHeaders == null");
        }
        throw new NullPointerException("connection == null");
    }

    private boolean e(Q6.b bVar) {
        synchronized (this) {
            try {
                if (this.f8977l != null) {
                    return false;
                }
                if (this.f8973h.f8986e && this.f8974i.f8980c) {
                    return false;
                }
                this.f8977l = bVar;
                notifyAll();
                this.f8969d.G(this.f8968c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j8) {
        this.f8967b += j8;
        if (j8 > 0) {
            notifyAll();
        }
    }

    void b() {
        boolean z8;
        boolean k8;
        synchronized (this) {
            try {
                b bVar = this.f8973h;
                if (!bVar.f8986e && bVar.f8985d) {
                    a aVar = this.f8974i;
                    if (!aVar.f8980c) {
                        if (aVar.f8979b) {
                        }
                    }
                    z8 = true;
                    k8 = k();
                }
                z8 = false;
                k8 = k();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            d(Q6.b.CANCEL);
        } else if (!k8) {
            this.f8969d.G(this.f8968c);
        }
    }

    void c() {
        a aVar = this.f8974i;
        if (!aVar.f8979b) {
            if (!aVar.f8980c) {
                if (this.f8977l == null) {
                    return;
                } else {
                    throw new n(this.f8977l);
                }
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void d(Q6.b bVar) {
        if (!e(bVar)) {
            return;
        }
        this.f8969d.M(this.f8968c, bVar);
    }

    public void f(Q6.b bVar) {
        if (!e(bVar)) {
            return;
        }
        this.f8969d.N(this.f8968c, bVar);
    }

    public int g() {
        return this.f8968c;
    }

    public X h() {
        synchronized (this) {
            try {
                if (!this.f8972g && !j()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f8974i;
    }

    public Z i() {
        return this.f8973h;
    }

    public boolean j() {
        boolean z8;
        if ((this.f8968c & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f8969d.f8894a == z8) {
            return true;
        }
        return false;
    }

    public synchronized boolean k() {
        try {
            if (this.f8977l != null) {
                return false;
            }
            b bVar = this.f8973h;
            if (!bVar.f8986e) {
                if (bVar.f8985d) {
                }
                return true;
            }
            a aVar = this.f8974i;
            if (aVar.f8980c || aVar.f8979b) {
                if (this.f8972g) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public a0 l() {
        return this.f8975j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(InterfaceC1451g interfaceC1451g, int i8) {
        this.f8973h.b(interfaceC1451g, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        boolean k8;
        synchronized (this) {
            this.f8973h.f8986e = true;
            k8 = k();
            notifyAll();
        }
        if (!k8) {
            this.f8969d.G(this.f8968c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(List list) {
        boolean z8;
        synchronized (this) {
            z8 = true;
            try {
                this.f8972g = true;
                if (this.f8971f == null) {
                    this.f8971f = list;
                    z8 = k();
                    notifyAll();
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.f8971f);
                    arrayList.add(null);
                    arrayList.addAll(list);
                    this.f8971f = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8) {
            this.f8969d.G(this.f8968c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void p(Q6.b bVar) {
        if (this.f8977l == null) {
            this.f8977l = bVar;
            notifyAll();
        }
    }

    public synchronized List q() {
        List list;
        if (j()) {
            this.f8975j.v();
            while (this.f8971f == null && this.f8977l == null) {
                try {
                    r();
                } catch (Throwable th) {
                    this.f8975j.C();
                    throw th;
                }
            }
            this.f8975j.C();
            list = this.f8971f;
            if (list != null) {
                this.f8971f = null;
            } else {
                throw new n(this.f8977l);
            }
        } else {
            throw new IllegalStateException("servers cannot read response headers");
        }
        return list;
    }

    void r() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public a0 s() {
        return this.f8976k;
    }
}
