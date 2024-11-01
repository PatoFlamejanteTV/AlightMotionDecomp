package B7;

import W6.AbstractC1496w;
import b7.C1992b;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import s7.C3998a;
import x7.AbstractC4232a;

/* loaded from: classes5.dex */
public class a implements Key, PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C3998a f617a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC1496w f618b;

    public a(C1992b c1992b) {
        a(c1992b);
    }

    private void a(C1992b c1992b) {
        this.f618b = c1992b.l();
        this.f617a = (C3998a) AbstractC4232a.b(c1992b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return J7.a.c(this.f617a.a(), ((a) obj).f617a.a());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return x7.b.a(this.f617a, this.f618b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return J7.a.o(this.f617a.a());
    }
}
