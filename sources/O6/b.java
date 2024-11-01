package O6;

import K6.s;
import K6.x;
import K6.z;
import U6.AbstractC1456l;
import U6.C1449e;
import U6.InterfaceC1450f;
import U6.L;
import U6.X;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.ProtocolException;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7880a;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC1456l {

        /* renamed from: b, reason: collision with root package name */
        long f7881b;

        a(X x8) {
            super(x8);
        }

        @Override // U6.AbstractC1456l, U6.X
        public void f(C1449e c1449e, long j8) {
            super.f(c1449e, j8);
            this.f7881b += j8;
        }
    }

    public b(boolean z8) {
        this.f7880a = z8;
    }

    @Override // K6.s
    public z a(s.a aVar) {
        z c8;
        g gVar = (g) aVar;
        c e8 = gVar.e();
        N6.g g8 = gVar.g();
        N6.c cVar = (N6.c) gVar.c();
        x request = gVar.request();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.d().o(gVar.b());
        e8.b(request);
        gVar.d().n(gVar.b(), request);
        z.a aVar2 = null;
        if (f.b(request.g()) && request.a() != null) {
            if ("100-continue".equalsIgnoreCase(request.c("Expect"))) {
                e8.flushRequest();
                gVar.d().s(gVar.b());
                aVar2 = e8.readResponseHeaders(true);
            }
            if (aVar2 == null) {
                gVar.d().m(gVar.b());
                a aVar3 = new a(e8.c(request, request.a().a()));
                InterfaceC1450f c9 = L.c(aVar3);
                request.a().e(c9);
                c9.close();
                gVar.d().l(gVar.b(), aVar3.f7881b);
            } else if (!cVar.m()) {
                g8.i();
            }
        }
        e8.finishRequest();
        if (aVar2 == null) {
            gVar.d().s(gVar.b());
            aVar2 = e8.readResponseHeaders(false);
        }
        z c10 = aVar2.o(request).h(g8.c().j()).p(currentTimeMillis).n(System.currentTimeMillis()).c();
        int h8 = c10.h();
        if (h8 == 100) {
            c10 = e8.readResponseHeaders(false).o(request).h(g8.c().j()).p(currentTimeMillis).n(System.currentTimeMillis()).c();
            h8 = c10.h();
        }
        gVar.d().r(gVar.b(), c10);
        if (this.f7880a && h8 == 101) {
            c8 = c10.u().b(L6.c.f5412c).c();
        } else {
            c8 = c10.u().b(e8.a(c10)).c();
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c8.E().c("Connection")) || CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c8.j("Connection"))) {
            g8.i();
        }
        if ((h8 != 204 && h8 != 205) || c8.a().a() <= 0) {
            return c8;
        }
        throw new ProtocolException("HTTP " + h8 + " had non-zero Content-Length: " + c8.a().a());
    }
}
