package x7;

import W6.AbstractC1489o;
import W6.C1488n;
import b7.InterfaceC1991a;
import c7.C2081a;
import c7.C2082b;
import i7.AbstractC2981b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p7.C3590b;
import p7.InterfaceC3593e;
import p7.j;
import p7.n;
import q7.C3835d;
import q7.C3840i;
import s7.C3999b;
import t7.C4066b;
import w7.C4166c;
import y7.r;
import y7.t;
import y7.x;
import y7.z;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static Map f41140a;

    /* loaded from: classes5.dex */
    private static class b extends g {
        private b() {
            super();
        }

        @Override // x7.c.g
        AbstractC2981b a(C2082b c2082b, Object obj) {
            byte[] y8 = AbstractC1489o.v(c2082b.o()).y();
            if (J7.f.a(y8, 0) == 1) {
                return C3840i.a(J7.a.h(y8, 4, y8.length));
            }
            if (y8.length == 64) {
                y8 = J7.a.h(y8, 4, y8.length);
            }
            return C3835d.a(y8);
        }
    }

    /* renamed from: x7.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0939c extends g {
        private C0939c() {
            super();
        }

        @Override // x7.c.g
        AbstractC2981b a(C2082b c2082b, Object obj) {
            C3590b n8 = C3590b.n(c2082b.o());
            return new r7.c(n8.o(), n8.q(), n8.m(), x7.e.c(n8.l().l()));
        }
    }

    /* loaded from: classes5.dex */
    private static class d extends g {
        private d() {
            super();
        }

        @Override // x7.c.g
        AbstractC2981b a(C2082b c2082b, Object obj) {
            return new C3999b(c2082b.n().v());
        }
    }

    /* loaded from: classes5.dex */
    private static class e extends g {
        private e() {
            super();
        }

        @Override // x7.c.g
        AbstractC2981b a(C2082b c2082b, Object obj) {
            return new C4066b(x7.e.e(c2082b.l()), c2082b.n().y());
        }
    }

    /* loaded from: classes5.dex */
    private static class f extends g {
        private f() {
            super();
        }

        @Override // x7.c.g
        AbstractC2981b a(C2082b c2082b, Object obj) {
            return new C4166c(c2082b.n().v(), x7.e.g(p7.h.l(c2082b.l().n())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class g {
        private g() {
        }

        abstract AbstractC2981b a(C2082b c2082b, Object obj);
    }

    /* loaded from: classes5.dex */
    private static class h extends g {
        private h() {
            super();
        }

        @Override // x7.c.g
        AbstractC2981b a(C2082b c2082b, Object obj) {
            z.b f8;
            p7.i m8 = p7.i.m(c2082b.l().n());
            if (m8 != null) {
                C1488n l8 = m8.n().l();
                n l9 = n.l(c2082b.o());
                f8 = new z.b(new x(m8.l(), x7.e.b(l8))).g(l9.m()).h(l9.n());
            } else {
                byte[] y8 = AbstractC1489o.v(c2082b.o()).y();
                f8 = new z.b(x.k(J7.f.a(y8, 0))).f(y8);
            }
            return f8.e();
        }
    }

    /* loaded from: classes5.dex */
    private static class i extends g {
        private i() {
            super();
        }

        @Override // x7.c.g
        AbstractC2981b a(C2082b c2082b, Object obj) {
            t.b f8;
            j m8 = j.m(c2082b.l().n());
            if (m8 != null) {
                C1488n l8 = m8.o().l();
                n l9 = n.l(c2082b.o());
                f8 = new t.b(new r(m8.l(), m8.n(), x7.e.b(l8))).g(l9.m()).h(l9.n());
            } else {
                byte[] y8 = AbstractC1489o.v(c2082b.o()).y();
                f8 = new t.b(r.i(J7.f.a(y8, 0))).f(y8);
            }
            return f8.e();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f41140a = hashMap;
        hashMap.put(InterfaceC3593e.f36479X, new e());
        f41140a.put(InterfaceC3593e.f36480Y, new e());
        f41140a.put(InterfaceC3593e.f36498r, new f());
        f41140a.put(InterfaceC3593e.f36502v, new d());
        f41140a.put(InterfaceC3593e.f36503w, new h());
        f41140a.put(InterfaceC3593e.f36461F, new i());
        f41140a.put(Y6.a.f13145a, new h());
        f41140a.put(Y6.a.f13146b, new i());
        f41140a.put(InterfaceC1991a.f14952I0, new b());
        f41140a.put(InterfaceC3593e.f36494n, new C0939c());
    }

    public static AbstractC2981b a(C2082b c2082b) {
        return b(c2082b, null);
    }

    public static AbstractC2981b b(C2082b c2082b, Object obj) {
        C2081a l8 = c2082b.l();
        g gVar = (g) f41140a.get(l8.l());
        if (gVar != null) {
            return gVar.a(c2082b, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + l8.l());
    }
}
