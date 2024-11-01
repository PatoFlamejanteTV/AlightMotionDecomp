package G7;

import W6.C1488n;

/* loaded from: classes5.dex */
abstract class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1488n a(String str) {
        if (str.equals("SHA-256")) {
            return Z6.a.f13974c;
        }
        if (str.equals("SHA-512")) {
            return Z6.a.f13978e;
        }
        if (str.equals("SHAKE128")) {
            return Z6.a.f13994m;
        }
        if (str.equals("SHAKE256")) {
            return Z6.a.f13996n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
