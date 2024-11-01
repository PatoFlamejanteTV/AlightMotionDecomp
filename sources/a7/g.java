package A7;

import W6.Y;
import a7.InterfaceC1685a;
import c7.C2081a;
import j7.AbstractC3220a;

/* loaded from: classes5.dex */
abstract class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2081a a(String str) {
        if (str.equals("SHA-1")) {
            return new C2081a(InterfaceC1685a.f14143i, Y.f10820a);
        }
        if (str.equals("SHA-224")) {
            return new C2081a(Z6.a.f13980f);
        }
        if (str.equals("SHA-256")) {
            return new C2081a(Z6.a.f13974c);
        }
        if (str.equals("SHA-384")) {
            return new C2081a(Z6.a.f13976d);
        }
        if (str.equals("SHA-512")) {
            return new C2081a(Z6.a.f13978e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d7.e b(C2081a c2081a) {
        if (c2081a.l().o(InterfaceC1685a.f14143i)) {
            return AbstractC3220a.b();
        }
        if (c2081a.l().o(Z6.a.f13980f)) {
            return AbstractC3220a.c();
        }
        if (c2081a.l().o(Z6.a.f13974c)) {
            return AbstractC3220a.d();
        }
        if (c2081a.l().o(Z6.a.f13976d)) {
            return AbstractC3220a.e();
        }
        if (c2081a.l().o(Z6.a.f13978e)) {
            return AbstractC3220a.j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + c2081a.l());
    }
}
