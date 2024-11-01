package x7;

import J7.f;
import W6.AbstractC1496w;
import W6.C1471a0;
import b7.C1992b;
import b7.InterfaceC1991a;
import c7.C2081a;
import i7.AbstractC2981b;
import java.io.IOException;
import p7.C3589a;
import p7.InterfaceC3593e;
import p7.h;
import p7.i;
import p7.j;
import p7.k;
import p7.m;
import q7.C3832a;
import q7.C3834c;
import q7.C3839h;
import r7.C3933b;
import s7.C3998a;
import t7.C4065a;
import w7.C4165b;
import y7.AbstractC4249A;
import y7.C4250a;
import y7.C4251b;
import y7.s;
import y7.y;

/* loaded from: classes5.dex */
public abstract class b {
    public static C1992b a(AbstractC2981b abstractC2981b, AbstractC1496w abstractC1496w) {
        if (abstractC2981b instanceof C4065a) {
            C4065a c4065a = (C4065a) abstractC2981b;
            return new C1992b(e.d(c4065a.b()), new C1471a0(c4065a.a()), abstractC1496w);
        }
        if (abstractC2981b instanceof C4165b) {
            C4165b c4165b = (C4165b) abstractC2981b;
            return new C1992b(new C2081a(InterfaceC3593e.f36498r, new h(e.f(c4165b.a()))), new C1471a0(c4165b.b()));
        }
        if (abstractC2981b instanceof C3998a) {
            C2081a c2081a = new C2081a(InterfaceC3593e.f36502v);
            short[] a9 = ((C3998a) abstractC2981b).a();
            byte[] bArr = new byte[a9.length * 2];
            for (int i8 = 0; i8 != a9.length; i8++) {
                f.n(a9[i8], bArr, i8 * 2);
            }
            return new C1992b(c2081a, new C1471a0(bArr));
        }
        if (abstractC2981b instanceof C3839h) {
            C3839h c3839h = (C3839h) abstractC2981b;
            byte[] b9 = C3832a.f().i(1).c(c3839h).b();
            return new C1992b(new C2081a(InterfaceC1991a.f14952I0), new C1471a0(b9), abstractC1496w, C3832a.f().i(1).c(c3839h.i()).b());
        }
        if (abstractC2981b instanceof C3834c) {
            C3834c c3834c = (C3834c) abstractC2981b;
            byte[] b10 = C3832a.f().i(c3834c.c()).c(c3834c).b();
            return new C1992b(new C2081a(InterfaceC1991a.f14952I0), new C1471a0(b10), abstractC1496w, C3832a.f().i(c3834c.c()).c(c3834c.d().c()).b());
        }
        if (abstractC2981b instanceof y) {
            y yVar = (y) abstractC2981b;
            return new C1992b(new C2081a(InterfaceC3593e.f36503w, new i(yVar.b().b(), e.h(yVar.a()))), b(yVar), abstractC1496w);
        }
        if (abstractC2981b instanceof s) {
            s sVar = (s) abstractC2981b;
            return new C1992b(new C2081a(InterfaceC3593e.f36461F, new j(sVar.b().a(), sVar.b().b(), e.h(sVar.a()))), c(sVar), abstractC1496w);
        }
        if (abstractC2981b instanceof C3933b) {
            C3933b c3933b = (C3933b) abstractC2981b;
            return new C1992b(new C2081a(InterfaceC3593e.f36494n), new C3589a(c3933b.f(), c3933b.e(), c3933b.b(), c3933b.c(), c3933b.g(), e.a(c3933b.a())));
        }
        throw new IOException("key parameters not recognized");
    }

    private static m b(y yVar) {
        byte[] encoded = yVar.getEncoded();
        int h8 = yVar.b().h();
        int b9 = yVar.b().b();
        int a9 = (int) AbstractC4249A.a(encoded, 0, 4);
        if (AbstractC4249A.l(b9, a9)) {
            byte[] g8 = AbstractC4249A.g(encoded, 4, h8);
            int i8 = 4 + h8;
            byte[] g9 = AbstractC4249A.g(encoded, i8, h8);
            int i9 = i8 + h8;
            byte[] g10 = AbstractC4249A.g(encoded, i9, h8);
            int i10 = i9 + h8;
            byte[] g11 = AbstractC4249A.g(encoded, i10, h8);
            int i11 = i10 + h8;
            byte[] g12 = AbstractC4249A.g(encoded, i11, encoded.length - i11);
            try {
                C4250a c4250a = (C4250a) AbstractC4249A.f(g12, C4250a.class);
                if (c4250a.c() != (1 << b9) - 1) {
                    return new m(a9, g8, g9, g10, g11, g12, c4250a.c());
                }
                return new m(a9, g8, g9, g10, g11, g12);
            } catch (ClassNotFoundException e8) {
                throw new IOException("cannot parse BDS: " + e8.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    private static k c(s sVar) {
        byte[] encoded = sVar.getEncoded();
        int f8 = sVar.b().f();
        int a9 = sVar.b().a();
        int i8 = (a9 + 7) / 8;
        long a10 = (int) AbstractC4249A.a(encoded, 0, i8);
        if (AbstractC4249A.l(a9, a10)) {
            byte[] g8 = AbstractC4249A.g(encoded, i8, f8);
            int i9 = i8 + f8;
            byte[] g9 = AbstractC4249A.g(encoded, i9, f8);
            int i10 = i9 + f8;
            byte[] g10 = AbstractC4249A.g(encoded, i10, f8);
            int i11 = i10 + f8;
            byte[] g11 = AbstractC4249A.g(encoded, i11, f8);
            int i12 = i11 + f8;
            byte[] g12 = AbstractC4249A.g(encoded, i12, encoded.length - i12);
            try {
                C4251b c4251b = (C4251b) AbstractC4249A.f(g12, C4251b.class);
                if (c4251b.b() != (1 << a9) - 1) {
                    return new k(a10, g8, g9, g10, g11, g12, c4251b.b());
                }
                return new k(a10, g8, g9, g10, g11, g12);
            } catch (ClassNotFoundException e8) {
                throw new IOException("cannot parse BDSStateMap: " + e8.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }
}
