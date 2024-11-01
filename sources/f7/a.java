package F7;

import W6.InterfaceC1476d;
import c7.C2081a;
import c7.C2082b;

/* loaded from: classes5.dex */
public abstract class a {
    public static byte[] a(C2081a c2081a, InterfaceC1476d interfaceC1476d) {
        try {
            return b(new C2082b(c2081a, interfaceC1476d));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(C2082b c2082b) {
        try {
            return c2082b.k("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
