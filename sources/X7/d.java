package x7;

import W6.C1471a0;
import b7.InterfaceC1991a;
import c7.C2081a;
import c7.C2082b;
import i7.AbstractC2981b;
import java.io.IOException;
import p7.C3590b;
import p7.InterfaceC3593e;
import p7.h;
import p7.i;
import p7.j;
import p7.l;
import p7.n;
import q7.C3832a;
import q7.C3835d;
import q7.C3840i;
import s7.C3999b;
import t7.C4066b;
import w7.C4166c;
import y7.t;
import y7.z;

/* loaded from: classes5.dex */
public abstract class d {
    public static C2082b a(AbstractC2981b abstractC2981b) {
        if (abstractC2981b instanceof C4066b) {
            C4066b c4066b = (C4066b) abstractC2981b;
            return new C2082b(e.d(c4066b.b()), c4066b.a());
        }
        if (abstractC2981b instanceof C4166c) {
            C4166c c4166c = (C4166c) abstractC2981b;
            return new C2082b(new C2081a(InterfaceC3593e.f36498r, new h(e.f(c4166c.a()))), c4166c.b());
        }
        if (abstractC2981b instanceof C3999b) {
            return new C2082b(new C2081a(InterfaceC3593e.f36502v), ((C3999b) abstractC2981b).a());
        }
        if (abstractC2981b instanceof C3840i) {
            return new C2082b(new C2081a(InterfaceC1991a.f14952I0), new C1471a0(C3832a.f().i(1).c((C3840i) abstractC2981b).b()));
        }
        if (abstractC2981b instanceof C3835d) {
            C3835d c3835d = (C3835d) abstractC2981b;
            return new C2082b(new C2081a(InterfaceC1991a.f14952I0), new C1471a0(C3832a.f().i(c3835d.b()).c(c3835d.c()).b()));
        }
        if (abstractC2981b instanceof z) {
            z zVar = (z) abstractC2981b;
            byte[] c8 = zVar.c();
            byte[] d8 = zVar.d();
            byte[] encoded = zVar.getEncoded();
            if (encoded.length > c8.length + d8.length) {
                return new C2082b(new C2081a(Y6.a.f13145a), new C1471a0(encoded));
            }
            return new C2082b(new C2081a(InterfaceC3593e.f36503w, new i(zVar.b().b(), e.h(zVar.a()))), new n(c8, d8));
        }
        if (abstractC2981b instanceof t) {
            t tVar = (t) abstractC2981b;
            byte[] c9 = tVar.c();
            byte[] d9 = tVar.d();
            byte[] encoded2 = tVar.getEncoded();
            if (encoded2.length > c9.length + d9.length) {
                return new C2082b(new C2081a(Y6.a.f13146b), new C1471a0(encoded2));
            }
            return new C2082b(new C2081a(InterfaceC3593e.f36461F, new j(tVar.b().a(), tVar.b().b(), e.h(tVar.a()))), new l(tVar.c(), tVar.d()));
        }
        if (abstractC2981b instanceof r7.c) {
            r7.c cVar = (r7.c) abstractC2981b;
            return new C2082b(new C2081a(InterfaceC3593e.f36494n), new C3590b(cVar.c(), cVar.d(), cVar.b(), e.a(cVar.a())));
        }
        throw new IOException("key parameters not recognized");
    }
}
