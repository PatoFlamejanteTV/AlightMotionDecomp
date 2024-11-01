package M6;

import K6.q;
import K6.s;
import K6.v;
import K6.x;
import K6.z;
import M6.c;
import O6.h;
import U6.C1449e;
import U6.InterfaceC1450f;
import U6.InterfaceC1451g;
import U6.L;
import U6.X;
import U6.Z;
import U6.a0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    final f f6175a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0113a implements Z {

        /* renamed from: a, reason: collision with root package name */
        boolean f6176a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1451g f6177b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f6178c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1450f f6179d;

        C0113a(InterfaceC1451g interfaceC1451g, b bVar, InterfaceC1450f interfaceC1450f) {
            this.f6177b = interfaceC1451g;
            this.f6178c = bVar;
            this.f6179d = interfaceC1450f;
        }

        @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f6176a && !L6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                this.f6176a = true;
                this.f6178c.abort();
            }
            this.f6177b.close();
        }

        @Override // U6.Z
        public long m(C1449e c1449e, long j8) {
            try {
                long m8 = this.f6177b.m(c1449e, j8);
                if (m8 == -1) {
                    if (!this.f6176a) {
                        this.f6176a = true;
                        this.f6179d.close();
                    }
                    return -1L;
                }
                c1449e.i(this.f6179d.buffer(), c1449e.E() - m8, m8);
                this.f6179d.emitCompleteSegments();
                return m8;
            } catch (IOException e8) {
                if (!this.f6176a) {
                    this.f6176a = true;
                    this.f6178c.abort();
                }
                throw e8;
            }
        }

        @Override // U6.Z
        public a0 timeout() {
            return this.f6177b.timeout();
        }
    }

    public a(f fVar) {
        this.f6175a = fVar;
    }

    private z b(b bVar, z zVar) {
        if (bVar == null) {
            return zVar;
        }
        X body = bVar.body();
        if (body == null) {
            return zVar;
        }
        C0113a c0113a = new C0113a(zVar.a().h(), bVar, L.c(body));
        return zVar.u().b(new h(zVar.j("Content-Type"), zVar.a().a(), L.d(c0113a))).c();
    }

    private static q c(q qVar, q qVar2) {
        q.a aVar = new q.a();
        int e8 = qVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            String c8 = qVar.c(i8);
            String f8 = qVar.f(i8);
            if ((!"Warning".equalsIgnoreCase(c8) || !f8.startsWith("1")) && (d(c8) || !e(c8) || qVar2.a(c8) == null)) {
                L6.a.f5408a.b(aVar, c8, f8);
            }
        }
        int e9 = qVar2.e();
        for (int i9 = 0; i9 < e9; i9++) {
            String c9 = qVar2.c(i9);
            if (!d(c9) && e(c9)) {
                L6.a.f5408a.b(aVar, c9, qVar2.f(i9));
            }
        }
        return aVar.d();
    }

    static boolean d(String str) {
        if (!"Content-Length".equalsIgnoreCase(str) && !"Content-Encoding".equalsIgnoreCase(str) && !"Content-Type".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    static boolean e(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    private static z f(z zVar) {
        if (zVar != null && zVar.a() != null) {
            return zVar.u().b(null).c();
        }
        return zVar;
    }

    @Override // K6.s
    public z a(s.a aVar) {
        z zVar;
        f fVar = this.f6175a;
        if (fVar != null) {
            zVar = fVar.d(aVar.request());
        } else {
            zVar = null;
        }
        c c8 = new c.a(System.currentTimeMillis(), aVar.request(), zVar).c();
        x xVar = c8.f6181a;
        z zVar2 = c8.f6182b;
        f fVar2 = this.f6175a;
        if (fVar2 != null) {
            fVar2.b(c8);
        }
        if (zVar != null && zVar2 == null) {
            L6.c.d(zVar.a());
        }
        if (xVar == null && zVar2 == null) {
            return new z.a().o(aVar.request()).m(v.HTTP_1_1).g(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).j("Unsatisfiable Request (only-if-cached)").b(L6.c.f5412c).p(-1L).n(System.currentTimeMillis()).c();
        }
        if (xVar == null) {
            return zVar2.u().d(f(zVar2)).c();
        }
        try {
            z a9 = aVar.a(xVar);
            if (a9 == null && zVar != null) {
            }
            if (zVar2 != null) {
                if (a9.h() == 304) {
                    z c9 = zVar2.u().i(c(zVar2.p(), a9.p())).p(a9.F()).n(a9.B()).d(f(zVar2)).k(f(a9)).c();
                    a9.a().close();
                    this.f6175a.trackConditionalCacheHit();
                    this.f6175a.e(zVar2, c9);
                    return c9;
                }
                L6.c.d(zVar2.a());
            }
            z c10 = a9.u().d(f(zVar2)).k(f(a9)).c();
            if (this.f6175a != null) {
                if (O6.e.c(c10) && c.a(c10, xVar)) {
                    return b(this.f6175a.a(c10), c10);
                }
                if (O6.f.a(xVar.g())) {
                    try {
                        this.f6175a.c(xVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return c10;
        } finally {
            if (zVar != null) {
                L6.c.d(zVar.a());
            }
        }
    }
}
