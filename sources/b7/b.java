package B7;

import c7.C2082b;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import s7.C3999b;
import x7.d;

/* loaded from: classes5.dex */
public class b implements Key, PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C3999b f619a;

    public b(C2082b c2082b) {
        a(c2082b);
    }

    private void a(C2082b c2082b) {
        this.f619a = (C3999b) x7.c.a(c2082b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            return J7.a.a(this.f619a.a(), ((b) obj).f619a.a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f619a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return J7.a.k(this.f619a.a());
    }
}
