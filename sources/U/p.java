package u;

import android.util.Base64;
import u.d;

/* loaded from: classes3.dex */
public abstract class p {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(s.f fVar);
    }

    public static a a() {
        return new d.b().d(s.f.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract s.f d();

    public boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public p f(s.f fVar) {
        return a().b(b()).d(fVar).c(c()).a();
    }

    public final String toString() {
        String encodeToString;
        String b9 = b();
        s.f d8 = d();
        if (c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(c(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", b9, d8, encodeToString);
    }
}
