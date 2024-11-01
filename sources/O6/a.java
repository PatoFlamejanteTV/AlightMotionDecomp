package O6;

import K6.l;
import K6.s;
import K6.x;
import K6.y;
import K6.z;
import U6.C1459o;
import U6.L;
import com.mbridge.msdk.foundation.download.Command;
import java.util.List;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    private final l f7879a;

    public a(l lVar) {
        this.f7879a = lVar;
    }

    private String b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                sb.append("; ");
            }
            K6.k kVar = (K6.k) list.get(i8);
            sb.append(kVar.c());
            sb.append('=');
            sb.append(kVar.k());
        }
        return sb.toString();
    }

    @Override // K6.s
    public z a(s.a aVar) {
        x request = aVar.request();
        x.a h8 = request.h();
        y a9 = request.a();
        if (a9 != null) {
            a9.b();
            long a10 = a9.a();
            if (a10 != -1) {
                h8.c("Content-Length", Long.toString(a10));
                h8.f("Transfer-Encoding");
            } else {
                h8.c("Transfer-Encoding", "chunked");
                h8.f("Content-Length");
            }
        }
        boolean z8 = false;
        if (request.c("Host") == null) {
            h8.c("Host", L6.c.p(request.i(), false));
        }
        if (request.c("Connection") == null) {
            h8.c("Connection", "Keep-Alive");
        }
        if (request.c("Accept-Encoding") == null && request.c(Command.HTTP_HEADER_RANGE) == null) {
            h8.c("Accept-Encoding", "gzip");
            z8 = true;
        }
        List a11 = this.f7879a.a(request.i());
        if (!a11.isEmpty()) {
            h8.c("Cookie", b(a11));
        }
        if (request.c(Command.HTTP_HEADER_USER_AGENT) == null) {
            h8.c(Command.HTTP_HEADER_USER_AGENT, L6.d.a());
        }
        z a12 = aVar.a(h8.a());
        e.g(this.f7879a, request.i(), a12.p());
        z.a o8 = a12.u().o(request);
        if (z8 && "gzip".equalsIgnoreCase(a12.j("Content-Encoding")) && e.c(a12)) {
            C1459o c1459o = new C1459o(a12.a().h());
            o8.i(a12.p().d().g("Content-Encoding").g("Content-Length").d());
            o8.b(new h(a12.j("Content-Type"), -1L, L.d(c1459o)));
        }
        return o8.c();
    }
}
