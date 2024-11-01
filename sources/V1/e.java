package V1;

import d2.n;
import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static O1.a a(Map map) {
        return O1.a.b(d2.k.h(map, "alg"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Map map) {
        return d2.k.h(map, "kid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set c(Map map) {
        return f.b(d2.k.j(map, "key_ops"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g d(Map map) {
        try {
            return g.b(d2.k.h(map, "kty"));
        } catch (IllegalArgumentException e8) {
            throw new ParseException(e8.getMessage(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h e(Map map) {
        return h.b(d2.k.h(map, "use"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List f(Map map) {
        List b9 = n.b(d2.k.e(map, "x5c"));
        if (b9 != null && b9.isEmpty()) {
            return null;
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.c g(Map map) {
        return d2.k.a(map, "x5t#S256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.c h(Map map) {
        return d2.k.a(map, "x5t");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static URI i(Map map) {
        return d2.k.k(map, "x5u");
    }
}
