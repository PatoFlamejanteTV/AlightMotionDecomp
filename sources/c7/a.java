package C7;

import W6.AbstractC1496w;
import b7.C1992b;
import java.io.IOException;
import java.security.PrivateKey;
import t7.AbstractC4067c;
import t7.C4065a;
import x7.AbstractC4232a;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C4065a f1137a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC1496w f1138b;

    public a(C1992b c1992b) {
        a(c1992b);
    }

    private void a(C1992b c1992b) {
        this.f1138b = c1992b.l();
        this.f1137a = (C4065a) AbstractC4232a.b(c1992b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1137a.b() == aVar.f1137a.b() && J7.a.a(this.f1137a.a(), aVar.f1137a.a())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC4067c.a(this.f1137a.b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return x7.b.a(this.f1137a, this.f1138b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f1137a.b() + (J7.a.k(this.f1137a.a()) * 37);
    }
}
