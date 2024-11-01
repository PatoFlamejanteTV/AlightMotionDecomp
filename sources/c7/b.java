package C7;

import c7.C2082b;
import java.io.IOException;
import java.security.PublicKey;
import t7.AbstractC4067c;
import t7.C4066b;
import x7.d;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C4066b f1139a;

    public b(C2082b c2082b) {
        a(c2082b);
    }

    private void a(C2082b c2082b) {
        this.f1139a = (C4066b) x7.c.a(c2082b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1139a.b() == bVar.f1139a.b() && J7.a.a(this.f1139a.a(), bVar.f1139a.a())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC4067c.a(this.f1139a.b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f1139a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f1139a.b() + (J7.a.k(this.f1139a.a()) * 37);
    }
}
