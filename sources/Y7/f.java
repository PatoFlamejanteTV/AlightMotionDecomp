package y7;

import W6.C1488n;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static Map f41208a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map f41209b = new HashMap();

    static {
        Map map = f41208a;
        C1488n c1488n = Z6.a.f13974c;
        map.put("SHA-256", c1488n);
        Map map2 = f41208a;
        C1488n c1488n2 = Z6.a.f13978e;
        map2.put("SHA-512", c1488n2);
        Map map3 = f41208a;
        C1488n c1488n3 = Z6.a.f13994m;
        map3.put("SHAKE128", c1488n3);
        Map map4 = f41208a;
        C1488n c1488n4 = Z6.a.f13996n;
        map4.put("SHAKE256", c1488n4);
        f41209b.put(c1488n, "SHA-256");
        f41209b.put(c1488n2, "SHA-512");
        f41209b.put(c1488n3, "SHAKE128");
        f41209b.put(c1488n4, "SHAKE256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d7.e a(C1488n c1488n) {
        if (c1488n.o(Z6.a.f13974c)) {
            return new e7.g();
        }
        if (c1488n.o(Z6.a.f13978e)) {
            return new e7.j();
        }
        if (c1488n.o(Z6.a.f13994m)) {
            return new e7.k(128);
        }
        if (c1488n.o(Z6.a.f13996n)) {
            return new e7.k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c1488n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(C1488n c1488n) {
        String str = (String) f41209b.get(c1488n);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + c1488n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1488n c(String str) {
        C1488n c1488n = (C1488n) f41208a.get(str);
        if (c1488n != null) {
            return c1488n;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}
