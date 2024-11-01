package K6;

import K6.q;
import K6.x;
import K6.z;
import M6.d;
import U6.AbstractC1456l;
import U6.AbstractC1457m;
import U6.C1449e;
import U6.C1452h;
import U6.InterfaceC1450f;
import U6.InterfaceC1451g;
import U6.L;
import U6.X;
import U6.Z;
import androidx.browser.trusted.sharing.ShareTarget;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: K6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1322c implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    final M6.f f4841a;

    /* renamed from: b, reason: collision with root package name */
    final M6.d f4842b;

    /* renamed from: c, reason: collision with root package name */
    int f4843c;

    /* renamed from: d, reason: collision with root package name */
    int f4844d;

    /* renamed from: e, reason: collision with root package name */
    private int f4845e;

    /* renamed from: f, reason: collision with root package name */
    private int f4846f;

    /* renamed from: g, reason: collision with root package name */
    private int f4847g;

    /* renamed from: K6.c$a */
    /* loaded from: classes5.dex */
    class a implements M6.f {
        a() {
        }

        @Override // M6.f
        public M6.b a(z zVar) {
            return C1322c.this.h(zVar);
        }

        @Override // M6.f
        public void b(M6.c cVar) {
            C1322c.this.p(cVar);
        }

        @Override // M6.f
        public void c(x xVar) {
            C1322c.this.j(xVar);
        }

        @Override // M6.f
        public z d(x xVar) {
            return C1322c.this.b(xVar);
        }

        @Override // M6.f
        public void e(z zVar, z zVar2) {
            C1322c.this.q(zVar, zVar2);
        }

        @Override // M6.f
        public void trackConditionalCacheHit() {
            C1322c.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K6.c$b */
    /* loaded from: classes5.dex */
    public final class b implements M6.b {

        /* renamed from: a, reason: collision with root package name */
        private final d.c f4849a;

        /* renamed from: b, reason: collision with root package name */
        private X f4850b;

        /* renamed from: c, reason: collision with root package name */
        private X f4851c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4852d;

        /* renamed from: K6.c$b$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC1456l {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1322c f4854b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d.c f4855c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(X x8, C1322c c1322c, d.c cVar) {
                super(x8);
                this.f4854b = c1322c;
                this.f4855c = cVar;
            }

            @Override // U6.AbstractC1456l, U6.X, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (C1322c.this) {
                    try {
                        b bVar = b.this;
                        if (bVar.f4852d) {
                            return;
                        }
                        bVar.f4852d = true;
                        C1322c.this.f4843c++;
                        super.close();
                        this.f4855c.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        b(d.c cVar) {
            this.f4849a = cVar;
            X d8 = cVar.d(1);
            this.f4850b = d8;
            this.f4851c = new a(d8, C1322c.this, cVar);
        }

        @Override // M6.b
        public void abort() {
            synchronized (C1322c.this) {
                try {
                    if (this.f4852d) {
                        return;
                    }
                    this.f4852d = true;
                    C1322c.this.f4844d++;
                    L6.c.d(this.f4850b);
                    try {
                        this.f4849a.a();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // M6.b
        public X body() {
            return this.f4851c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K6.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0085c extends A {

        /* renamed from: a, reason: collision with root package name */
        final d.e f4857a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1451g f4858b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4859c;

        /* renamed from: d, reason: collision with root package name */
        private final String f4860d;

        /* renamed from: K6.c$c$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC1457m {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.e f4861b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z8, d.e eVar) {
                super(z8);
                this.f4861b = eVar;
            }

            @Override // U6.AbstractC1457m, U6.Z, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f4861b.close();
                super.close();
            }
        }

        C0085c(d.e eVar, String str, String str2) {
            this.f4857a = eVar;
            this.f4859c = str;
            this.f4860d = str2;
            this.f4858b = L.d(new a(eVar.b(1), eVar));
        }

        @Override // K6.A
        public long a() {
            try {
                String str = this.f4860d;
                if (str == null) {
                    return -1L;
                }
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // K6.A
        public InterfaceC1451g h() {
            return this.f4858b;
        }
    }

    public C1322c(File file, long j8) {
        this(file, j8, R6.a.f9353a);
    }

    private void a(d.c cVar) {
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public static String g(r rVar) {
        return C1452h.f(rVar.toString()).B().n();
    }

    static int i(InterfaceC1451g interfaceC1451g) {
        try {
            long readDecimalLong = interfaceC1451g.readDecimalLong();
            String readUtf8LineStrict = interfaceC1451g.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.isEmpty()) {
                return (int) readDecimalLong;
            }
            throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + "\"");
        } catch (NumberFormatException e8) {
            throw new IOException(e8.getMessage());
        }
    }

    z b(x xVar) {
        try {
            d.e k8 = this.f4842b.k(g(xVar.i()));
            if (k8 == null) {
                return null;
            }
            try {
                d dVar = new d(k8.b(0));
                z d8 = dVar.d(k8);
                if (!dVar.b(xVar, d8)) {
                    L6.c.d(d8.a());
                    return null;
                }
                return d8;
            } catch (IOException unused) {
                L6.c.d(k8);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4842b.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f4842b.flush();
    }

    M6.b h(z zVar) {
        d.c cVar;
        String g8 = zVar.E().g();
        if (O6.f.a(zVar.E().g())) {
            try {
                j(zVar.E());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!g8.equals(ShareTarget.METHOD_GET) || O6.e.e(zVar)) {
            return null;
        }
        d dVar = new d(zVar);
        try {
            cVar = this.f4842b.i(g(zVar.E().i()));
            if (cVar == null) {
                return null;
            }
            try {
                dVar.f(cVar);
                return new b(cVar);
            } catch (IOException unused2) {
                a(cVar);
                return null;
            }
        } catch (IOException unused3) {
            cVar = null;
        }
    }

    void j(x xVar) {
        this.f4842b.B(g(xVar.i()));
    }

    synchronized void k() {
        this.f4846f++;
    }

    synchronized void p(M6.c cVar) {
        try {
            this.f4847g++;
            if (cVar.f6181a != null) {
                this.f4845e++;
            } else if (cVar.f6182b != null) {
                this.f4846f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void q(z zVar, z zVar2) {
        d.c cVar;
        d dVar = new d(zVar2);
        try {
            cVar = ((C0085c) zVar.a()).f4857a.a();
            if (cVar != null) {
                try {
                    dVar.f(cVar);
                    cVar.b();
                } catch (IOException unused) {
                    a(cVar);
                }
            }
        } catch (IOException unused2) {
            cVar = null;
        }
    }

    C1322c(File file, long j8, R6.a aVar) {
        this.f4841a = new a();
        this.f4842b = M6.d.g(aVar, file, 201105, 2, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K6.c$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: k, reason: collision with root package name */
        private static final String f4863k = S6.f.i().j() + "-Sent-Millis";

        /* renamed from: l, reason: collision with root package name */
        private static final String f4864l = S6.f.i().j() + "-Received-Millis";

        /* renamed from: a, reason: collision with root package name */
        private final String f4865a;

        /* renamed from: b, reason: collision with root package name */
        private final q f4866b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4867c;

        /* renamed from: d, reason: collision with root package name */
        private final v f4868d;

        /* renamed from: e, reason: collision with root package name */
        private final int f4869e;

        /* renamed from: f, reason: collision with root package name */
        private final String f4870f;

        /* renamed from: g, reason: collision with root package name */
        private final q f4871g;

        /* renamed from: h, reason: collision with root package name */
        private final p f4872h;

        /* renamed from: i, reason: collision with root package name */
        private final long f4873i;

        /* renamed from: j, reason: collision with root package name */
        private final long f4874j;

        d(Z z8) {
            C c8;
            try {
                InterfaceC1451g d8 = L.d(z8);
                this.f4865a = d8.readUtf8LineStrict();
                this.f4867c = d8.readUtf8LineStrict();
                q.a aVar = new q.a();
                int i8 = C1322c.i(d8);
                for (int i9 = 0; i9 < i8; i9++) {
                    aVar.b(d8.readUtf8LineStrict());
                }
                this.f4866b = aVar.d();
                O6.k a9 = O6.k.a(d8.readUtf8LineStrict());
                this.f4868d = a9.f7906a;
                this.f4869e = a9.f7907b;
                this.f4870f = a9.f7908c;
                q.a aVar2 = new q.a();
                int i10 = C1322c.i(d8);
                for (int i11 = 0; i11 < i10; i11++) {
                    aVar2.b(d8.readUtf8LineStrict());
                }
                String str = f4863k;
                String f8 = aVar2.f(str);
                String str2 = f4864l;
                String f9 = aVar2.f(str2);
                aVar2.g(str);
                aVar2.g(str2);
                this.f4873i = f8 != null ? Long.parseLong(f8) : 0L;
                this.f4874j = f9 != null ? Long.parseLong(f9) : 0L;
                this.f4871g = aVar2.d();
                if (a()) {
                    String readUtf8LineStrict = d8.readUtf8LineStrict();
                    if (readUtf8LineStrict.length() <= 0) {
                        g a10 = g.a(d8.readUtf8LineStrict());
                        List c9 = c(d8);
                        List c10 = c(d8);
                        if (!d8.exhausted()) {
                            c8 = C.a(d8.readUtf8LineStrict());
                        } else {
                            c8 = C.SSL_3_0;
                        }
                        this.f4872h = p.b(c8, a10, c9, c10);
                    } else {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict + "\"");
                    }
                } else {
                    this.f4872h = null;
                }
                z8.close();
            } catch (Throwable th) {
                z8.close();
                throw th;
            }
        }

        private boolean a() {
            return this.f4865a.startsWith("https://");
        }

        private List c(InterfaceC1451g interfaceC1451g) {
            int i8 = C1322c.i(interfaceC1451g);
            if (i8 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(i8);
                for (int i9 = 0; i9 < i8; i9++) {
                    String readUtf8LineStrict = interfaceC1451g.readUtf8LineStrict();
                    C1449e c1449e = new C1449e();
                    c1449e.I(C1452h.c(readUtf8LineStrict));
                    arrayList.add(certificateFactory.generateCertificate(c1449e.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        private void e(InterfaceC1450f interfaceC1450f, List list) {
            try {
                interfaceC1450f.writeDecimalLong(list.size()).writeByte(10);
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    interfaceC1450f.writeUtf8(C1452h.C(((Certificate) list.get(i8)).getEncoded()).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public boolean b(x xVar, z zVar) {
            if (this.f4865a.equals(xVar.i().toString()) && this.f4867c.equals(xVar.g()) && O6.e.o(zVar, this.f4866b, xVar)) {
                return true;
            }
            return false;
        }

        public z d(d.e eVar) {
            String a9 = this.f4871g.a("Content-Type");
            String a10 = this.f4871g.a("Content-Length");
            return new z.a().o(new x.a().h(this.f4865a).e(this.f4867c, null).d(this.f4866b).a()).m(this.f4868d).g(this.f4869e).j(this.f4870f).i(this.f4871g).b(new C0085c(eVar, a9, a10)).h(this.f4872h).p(this.f4873i).n(this.f4874j).c();
        }

        public void f(d.c cVar) {
            InterfaceC1450f c8 = L.c(cVar.d(0));
            c8.writeUtf8(this.f4865a).writeByte(10);
            c8.writeUtf8(this.f4867c).writeByte(10);
            c8.writeDecimalLong(this.f4866b.e()).writeByte(10);
            int e8 = this.f4866b.e();
            for (int i8 = 0; i8 < e8; i8++) {
                c8.writeUtf8(this.f4866b.c(i8)).writeUtf8(": ").writeUtf8(this.f4866b.f(i8)).writeByte(10);
            }
            c8.writeUtf8(new O6.k(this.f4868d, this.f4869e, this.f4870f).toString()).writeByte(10);
            c8.writeDecimalLong(this.f4871g.e() + 2).writeByte(10);
            int e9 = this.f4871g.e();
            for (int i9 = 0; i9 < e9; i9++) {
                c8.writeUtf8(this.f4871g.c(i9)).writeUtf8(": ").writeUtf8(this.f4871g.f(i9)).writeByte(10);
            }
            c8.writeUtf8(f4863k).writeUtf8(": ").writeDecimalLong(this.f4873i).writeByte(10);
            c8.writeUtf8(f4864l).writeUtf8(": ").writeDecimalLong(this.f4874j).writeByte(10);
            if (a()) {
                c8.writeByte(10);
                c8.writeUtf8(this.f4872h.a().c()).writeByte(10);
                e(c8, this.f4872h.e());
                e(c8, this.f4872h.d());
                c8.writeUtf8(this.f4872h.f().c()).writeByte(10);
            }
            c8.close();
        }

        d(z zVar) {
            this.f4865a = zVar.E().i().toString();
            this.f4866b = O6.e.n(zVar);
            this.f4867c = zVar.E().g();
            this.f4868d = zVar.z();
            this.f4869e = zVar.h();
            this.f4870f = zVar.r();
            this.f4871g = zVar.p();
            this.f4872h = zVar.i();
            this.f4873i = zVar.F();
            this.f4874j = zVar.B();
        }
    }
}
