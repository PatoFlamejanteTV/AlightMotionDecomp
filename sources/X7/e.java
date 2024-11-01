package x7;

import W6.C1488n;
import W6.Y;
import a7.InterfaceC1685a;
import c7.C2081a;
import e7.g;
import e7.j;
import e7.k;
import java.util.HashMap;
import java.util.Map;
import p7.InterfaceC3593e;
import p7.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final C2081a f41141a;

    /* renamed from: b, reason: collision with root package name */
    static final C2081a f41142b;

    /* renamed from: c, reason: collision with root package name */
    static final C2081a f41143c;

    /* renamed from: d, reason: collision with root package name */
    static final C2081a f41144d;

    /* renamed from: e, reason: collision with root package name */
    static final C2081a f41145e;

    /* renamed from: f, reason: collision with root package name */
    static final C2081a f41146f;

    /* renamed from: g, reason: collision with root package name */
    static final C2081a f41147g;

    /* renamed from: h, reason: collision with root package name */
    static final C2081a f41148h;

    /* renamed from: i, reason: collision with root package name */
    static final Map f41149i;

    static {
        C1488n c1488n = InterfaceC3593e.f36479X;
        f41141a = new C2081a(c1488n);
        C1488n c1488n2 = InterfaceC3593e.f36480Y;
        f41142b = new C2081a(c1488n2);
        f41143c = new C2081a(Z6.a.f13988j);
        f41144d = new C2081a(Z6.a.f13984h);
        f41145e = new C2081a(Z6.a.f13974c);
        f41146f = new C2081a(Z6.a.f13978e);
        f41147g = new C2081a(Z6.a.f13994m);
        f41148h = new C2081a(Z6.a.f13996n);
        HashMap hashMap = new HashMap();
        f41149i = hashMap;
        hashMap.put(c1488n, J7.d.a(5));
        hashMap.put(c1488n2, J7.d.a(6));
    }

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
    public static d7.e b(C1488n c1488n) {
        if (c1488n.o(Z6.a.f13974c)) {
            return new g();
        }
        if (c1488n.o(Z6.a.f13978e)) {
            return new j();
        }
        if (c1488n.o(Z6.a.f13994m)) {
            return new k(128);
        }
        if (c1488n.o(Z6.a.f13996n)) {
            return new k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c1488n);
    }

    public static String c(C1488n c1488n) {
        if (c1488n.o(InterfaceC1685a.f14143i)) {
            return "SHA-1";
        }
        if (c1488n.o(Z6.a.f13980f)) {
            return "SHA-224";
        }
        if (c1488n.o(Z6.a.f13974c)) {
            return "SHA-256";
        }
        if (c1488n.o(Z6.a.f13976d)) {
            return "SHA-384";
        }
        if (c1488n.o(Z6.a.f13978e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + c1488n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2081a d(int i8) {
        if (i8 != 5) {
            if (i8 == 6) {
                return f41142b;
            }
            throw new IllegalArgumentException("unknown security category: " + i8);
        }
        return f41141a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(C2081a c2081a) {
        return ((Integer) f41149i.get(c2081a.l())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2081a f(String str) {
        if (str.equals("SHA3-256")) {
            return f41143c;
        }
        if (str.equals("SHA-512/256")) {
            return f41144d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(h hVar) {
        C2081a m8 = hVar.m();
        if (m8.l().o(f41143c.l())) {
            return "SHA3-256";
        }
        if (m8.l().o(f41144d.l())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + m8.l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2081a h(String str) {
        if (str.equals("SHA-256")) {
            return f41145e;
        }
        if (str.equals("SHA-512")) {
            return f41146f;
        }
        if (str.equals("SHAKE128")) {
            return f41147g;
        }
        if (str.equals("SHAKE256")) {
            return f41148h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
