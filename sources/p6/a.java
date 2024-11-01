package P6;

import K6.A;
import K6.q;
import K6.r;
import K6.u;
import K6.x;
import K6.z;
import O6.h;
import O6.i;
import O6.k;
import U6.C1449e;
import U6.C1458n;
import U6.InterfaceC1450f;
import U6.InterfaceC1451g;
import U6.L;
import U6.X;
import U6.Z;
import U6.a0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a implements O6.c {

    /* renamed from: a, reason: collision with root package name */
    final u f8111a;

    /* renamed from: b, reason: collision with root package name */
    final N6.g f8112b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC1451g f8113c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1450f f8114d;

    /* renamed from: e, reason: collision with root package name */
    int f8115e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f8116f = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public abstract class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        protected final C1458n f8117a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f8118b;

        /* renamed from: c, reason: collision with root package name */
        protected long f8119c;

        private b() {
            this.f8117a = new C1458n(a.this.f8113c.timeout());
            this.f8119c = 0L;
        }

        protected final void a(boolean z8, IOException iOException) {
            a aVar = a.this;
            int i8 = aVar.f8115e;
            if (i8 == 6) {
                return;
            }
            if (i8 == 5) {
                aVar.d(this.f8117a);
                a aVar2 = a.this;
                aVar2.f8115e = 6;
                N6.g gVar = aVar2.f8112b;
                if (gVar != null) {
                    gVar.q(!z8, aVar2, this.f8119c, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + a.this.f8115e);
        }

        @Override // U6.Z
        public long m(C1449e c1449e, long j8) {
            try {
                long m8 = a.this.f8113c.m(c1449e, j8);
                if (m8 > 0) {
                    this.f8119c += m8;
                }
                return m8;
            } catch (IOException e8) {
                a(false, e8);
                throw e8;
            }
        }

        @Override // U6.Z
        public a0 timeout() {
            return this.f8117a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1458n f8121a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8122b;

        c() {
            this.f8121a = new C1458n(a.this.f8114d.timeout());
        }

        @Override // U6.X, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f8122b) {
                return;
            }
            this.f8122b = true;
            a.this.f8114d.writeUtf8("0\r\n\r\n");
            a.this.d(this.f8121a);
            a.this.f8115e = 3;
        }

        @Override // U6.X
        public void f(C1449e c1449e, long j8) {
            if (!this.f8122b) {
                if (j8 == 0) {
                    return;
                }
                a.this.f8114d.writeHexadecimalUnsignedLong(j8);
                a.this.f8114d.writeUtf8("\r\n");
                a.this.f8114d.f(c1449e, j8);
                a.this.f8114d.writeUtf8("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }

        @Override // U6.X, java.io.Flushable
        public synchronized void flush() {
            if (this.f8122b) {
                return;
            }
            a.this.f8114d.flush();
        }

        @Override // U6.X
        public a0 timeout() {
            return this.f8121a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class d extends b {

        /* renamed from: e, reason: collision with root package name */
        private final r f8124e;

        /* renamed from: f, reason: collision with root package name */
        private long f8125f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8126g;

        d(r rVar) {
            super();
            this.f8125f = -1L;
            this.f8126g = true;
            this.f8124e = rVar;
        }

        private void b() {
            if (this.f8125f != -1) {
                a.this.f8113c.readUtf8LineStrict();
            }
            try {
                this.f8125f = a.this.f8113c.readHexadecimalUnsignedLong();
                String trim = a.this.f8113c.readUtf8LineStrict().trim();
                if (this.f8125f >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                    if (this.f8125f == 0) {
                        this.f8126g = false;
                        O6.e.g(a.this.f8111a.h(), this.f8124e, a.this.k());
                        a(true, null);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f8125f + trim + "\"");
            } catch (NumberFormatException e8) {
                throw new ProtocolException(e8.getMessage());
            }
        }

        @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8118b) {
                return;
            }
            if (this.f8126g && !L6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f8118b = true;
        }

        @Override // P6.a.b, U6.Z
        public long m(C1449e c1449e, long j8) {
            if (j8 >= 0) {
                if (!this.f8118b) {
                    if (!this.f8126g) {
                        return -1L;
                    }
                    long j9 = this.f8125f;
                    if (j9 == 0 || j9 == -1) {
                        b();
                        if (!this.f8126g) {
                            return -1L;
                        }
                    }
                    long m8 = super.m(c1449e, Math.min(j8, this.f8125f));
                    if (m8 != -1) {
                        this.f8125f -= m8;
                        return m8;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class e implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1458n f8128a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8129b;

        /* renamed from: c, reason: collision with root package name */
        private long f8130c;

        e(long j8) {
            this.f8128a = new C1458n(a.this.f8114d.timeout());
            this.f8130c = j8;
        }

        @Override // U6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8129b) {
                return;
            }
            this.f8129b = true;
            if (this.f8130c <= 0) {
                a.this.d(this.f8128a);
                a.this.f8115e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // U6.X
        public void f(C1449e c1449e, long j8) {
            if (!this.f8129b) {
                L6.c.c(c1449e.E(), 0L, j8);
                if (j8 <= this.f8130c) {
                    a.this.f8114d.f(c1449e, j8);
                    this.f8130c -= j8;
                    return;
                }
                throw new ProtocolException("expected " + this.f8130c + " bytes but received " + j8);
            }
            throw new IllegalStateException("closed");
        }

        @Override // U6.X, java.io.Flushable
        public void flush() {
            if (this.f8129b) {
                return;
            }
            a.this.f8114d.flush();
        }

        @Override // U6.X
        public a0 timeout() {
            return this.f8128a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class f extends b {

        /* renamed from: e, reason: collision with root package name */
        private long f8132e;

        f(long j8) {
            super();
            this.f8132e = j8;
            if (j8 == 0) {
                a(true, null);
            }
        }

        @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8118b) {
                return;
            }
            if (this.f8132e != 0 && !L6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f8118b = true;
        }

        @Override // P6.a.b, U6.Z
        public long m(C1449e c1449e, long j8) {
            if (j8 >= 0) {
                if (!this.f8118b) {
                    long j9 = this.f8132e;
                    if (j9 == 0) {
                        return -1L;
                    }
                    long m8 = super.m(c1449e, Math.min(j9, j8));
                    if (m8 != -1) {
                        long j10 = this.f8132e - m8;
                        this.f8132e = j10;
                        if (j10 == 0) {
                            a(true, null);
                        }
                        return m8;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class g extends b {

        /* renamed from: e, reason: collision with root package name */
        private boolean f8134e;

        g() {
            super();
        }

        @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8118b) {
                return;
            }
            if (!this.f8134e) {
                a(false, null);
            }
            this.f8118b = true;
        }

        @Override // P6.a.b, U6.Z
        public long m(C1449e c1449e, long j8) {
            if (j8 >= 0) {
                if (!this.f8118b) {
                    if (this.f8134e) {
                        return -1L;
                    }
                    long m8 = super.m(c1449e, j8);
                    if (m8 == -1) {
                        this.f8134e = true;
                        a(true, null);
                        return -1L;
                    }
                    return m8;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    public a(u uVar, N6.g gVar, InterfaceC1451g interfaceC1451g, InterfaceC1450f interfaceC1450f) {
        this.f8111a = uVar;
        this.f8112b = gVar;
        this.f8113c = interfaceC1451g;
        this.f8114d = interfaceC1450f;
    }

    private String j() {
        String readUtf8LineStrict = this.f8113c.readUtf8LineStrict(this.f8116f);
        this.f8116f -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    @Override // O6.c
    public A a(z zVar) {
        N6.g gVar = this.f8112b;
        gVar.f6848f.q(gVar.f6847e);
        String j8 = zVar.j("Content-Type");
        if (!O6.e.c(zVar)) {
            return new h(j8, 0L, L.d(h(0L)));
        }
        if ("chunked".equalsIgnoreCase(zVar.j("Transfer-Encoding"))) {
            return new h(j8, -1L, L.d(f(zVar.E().i())));
        }
        long b9 = O6.e.b(zVar);
        if (b9 != -1) {
            return new h(j8, b9, L.d(h(b9)));
        }
        return new h(j8, -1L, L.d(i()));
    }

    @Override // O6.c
    public void b(x xVar) {
        l(xVar.d(), i.a(xVar, this.f8112b.c().p().b().type()));
    }

    @Override // O6.c
    public X c(x xVar, long j8) {
        if ("chunked".equalsIgnoreCase(xVar.c("Transfer-Encoding"))) {
            return e();
        }
        if (j8 != -1) {
            return g(j8);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    void d(C1458n c1458n) {
        a0 i8 = c1458n.i();
        c1458n.j(a0.f10186e);
        i8.a();
        i8.b();
    }

    public X e() {
        if (this.f8115e == 1) {
            this.f8115e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f8115e);
    }

    public Z f(r rVar) {
        if (this.f8115e == 4) {
            this.f8115e = 5;
            return new d(rVar);
        }
        throw new IllegalStateException("state: " + this.f8115e);
    }

    @Override // O6.c
    public void finishRequest() {
        this.f8114d.flush();
    }

    @Override // O6.c
    public void flushRequest() {
        this.f8114d.flush();
    }

    public X g(long j8) {
        if (this.f8115e == 1) {
            this.f8115e = 2;
            return new e(j8);
        }
        throw new IllegalStateException("state: " + this.f8115e);
    }

    public Z h(long j8) {
        if (this.f8115e == 4) {
            this.f8115e = 5;
            return new f(j8);
        }
        throw new IllegalStateException("state: " + this.f8115e);
    }

    public Z i() {
        if (this.f8115e == 4) {
            N6.g gVar = this.f8112b;
            if (gVar != null) {
                this.f8115e = 5;
                gVar.i();
                return new g();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f8115e);
    }

    public q k() {
        q.a aVar = new q.a();
        while (true) {
            String j8 = j();
            if (j8.length() != 0) {
                L6.a.f5408a.a(aVar, j8);
            } else {
                return aVar.d();
            }
        }
    }

    public void l(q qVar, String str) {
        if (this.f8115e == 0) {
            this.f8114d.writeUtf8(str).writeUtf8("\r\n");
            int e8 = qVar.e();
            for (int i8 = 0; i8 < e8; i8++) {
                this.f8114d.writeUtf8(qVar.c(i8)).writeUtf8(": ").writeUtf8(qVar.f(i8)).writeUtf8("\r\n");
            }
            this.f8114d.writeUtf8("\r\n");
            this.f8115e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f8115e);
    }

    @Override // O6.c
    public z.a readResponseHeaders(boolean z8) {
        int i8 = this.f8115e;
        if (i8 != 1 && i8 != 3) {
            throw new IllegalStateException("state: " + this.f8115e);
        }
        try {
            k a9 = k.a(j());
            z.a i9 = new z.a().m(a9.f7906a).g(a9.f7907b).j(a9.f7908c).i(k());
            if (z8 && a9.f7907b == 100) {
                return null;
            }
            if (a9.f7907b == 100) {
                this.f8115e = 3;
                return i9;
            }
            this.f8115e = 4;
            return i9;
        } catch (EOFException e8) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f8112b);
            iOException.initCause(e8);
            throw iOException;
        }
    }
}
