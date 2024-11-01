package x7;

import J7.f;
import W6.AbstractC1472b;
import W6.AbstractC1489o;
import W6.C1488n;
import b7.C1992b;
import b7.InterfaceC1991a;
import i7.AbstractC2981b;
import java.io.IOException;
import p7.C3589a;
import p7.InterfaceC3593e;
import p7.h;
import p7.i;
import p7.j;
import p7.k;
import p7.m;
import q7.C3834c;
import q7.C3839h;
import r7.C3933b;
import s7.C3998a;
import t7.C4065a;
import w7.C4165b;
import y7.AbstractC4249A;
import y7.C4250a;
import y7.C4251b;
import y7.r;
import y7.s;
import y7.x;
import y7.y;

/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4232a {
    private static short[] a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i8 = 0; i8 != length; i8++) {
            sArr[i8] = f.h(bArr, i8 * 2);
        }
        return sArr;
    }

    public static AbstractC2981b b(C1992b c1992b) {
        C1488n l8 = c1992b.n().l();
        if (l8.F(X6.a.f11623W)) {
            return new C4065a(e.e(c1992b.n()), AbstractC1489o.v(c1992b.r()).y());
        }
        if (l8.o(X6.a.f11653s)) {
            return new C4165b(AbstractC1489o.v(c1992b.r()).y(), e.g(h.l(c1992b.n().n())));
        }
        if (l8.o(X6.a.f11638f0)) {
            return new C3998a(a(AbstractC1489o.v(c1992b.r()).y()));
        }
        if (l8.o(InterfaceC1991a.f14952I0)) {
            byte[] y8 = AbstractC1489o.v(c1992b.r()).y();
            AbstractC1472b o8 = c1992b.o();
            if (f.a(y8, 0) == 1) {
                if (o8 != null) {
                    byte[] y9 = o8.y();
                    return C3839h.f(J7.a.h(y8, 4, y8.length), J7.a.h(y9, 4, y9.length));
                }
                return C3839h.e(J7.a.h(y8, 4, y8.length));
            }
            if (o8 != null) {
                return C3834c.b(J7.a.h(y8, 4, y8.length), o8.y());
            }
            return C3834c.a(J7.a.h(y8, 4, y8.length));
        }
        if (l8.o(X6.a.f11657w)) {
            i m8 = i.m(c1992b.n().n());
            C1488n l9 = m8.n().l();
            m n8 = m.n(c1992b.r());
            try {
                y.b o9 = new y.b(new x(m8.l(), e.b(l9))).l(n8.m()).q(n8.t()).p(n8.s()).n(n8.q()).o(n8.r());
                if (n8.u() != 0) {
                    o9.m(n8.o());
                }
                if (n8.l() != null) {
                    o9.k(((C4250a) AbstractC4249A.f(n8.l(), C4250a.class)).h(l9));
                }
                return o9.j();
            } catch (ClassNotFoundException e8) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e8.getMessage());
            }
        }
        if (l8.o(InterfaceC3593e.f36461F)) {
            j m9 = j.m(c1992b.n().n());
            C1488n l10 = m9.o().l();
            try {
                k n9 = k.n(c1992b.r());
                s.b p8 = new s.b(new r(m9.l(), m9.n(), e.b(l10))).m(n9.m()).r(n9.t()).q(n9.s()).o(n9.q()).p(n9.r());
                if (n9.u() != 0) {
                    p8.n(n9.o());
                }
                if (n9.l() != null) {
                    p8.l(((C4251b) AbstractC4249A.f(n9.l(), C4251b.class)).f(l10));
                }
                return p8.k();
            } catch (ClassNotFoundException e9) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e9.getMessage());
            }
        }
        if (l8.o(InterfaceC3593e.f36494n)) {
            C3589a o10 = C3589a.o(c1992b.r());
            return new C3933b(o10.r(), o10.q(), o10.m(), o10.n(), o10.s(), e.c(o10.l().l()));
        }
        throw new RuntimeException("algorithm identifier in private key not recognised");
    }
}
