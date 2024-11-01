package G7;

import W6.C1488n;
import c7.C2082b;
import java.io.IOException;
import java.security.PublicKey;
import y7.t;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C1488n f3146a;

    /* renamed from: b, reason: collision with root package name */
    private transient t f3147b;

    public b(C2082b c2082b) {
        a(c2082b);
    }

    private void a(C2082b c2082b) {
        t tVar = (t) x7.c.a(c2082b);
        this.f3147b = tVar;
        this.f3146a = e.a(tVar.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3146a.o(bVar.f3146a) && J7.a.a(this.f3147b.e(), bVar.f3147b.e())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return x7.d.a(this.f3147b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f3146a.hashCode() + (J7.a.k(this.f3147b.e()) * 37);
    }
}
