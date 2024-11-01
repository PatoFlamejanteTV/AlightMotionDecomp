package G7;

import W6.AbstractC1496w;
import W6.C1488n;
import b7.C1992b;
import java.io.IOException;
import java.security.PrivateKey;
import p7.i;
import x7.AbstractC4232a;
import y7.y;

/* loaded from: classes5.dex */
public class c implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient y f3148a;

    /* renamed from: b, reason: collision with root package name */
    private transient C1488n f3149b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC1496w f3150c;

    public c(C1992b c1992b) {
        a(c1992b);
    }

    private void a(C1992b c1992b) {
        this.f3150c = c1992b.l();
        this.f3149b = i.m(c1992b.n().n()).n().l();
        this.f3148a = (y) AbstractC4232a.b(c1992b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3149b.o(cVar.f3149b) && J7.a.a(this.f3148a.c(), cVar.f3148a.c())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return x7.b.a(this.f3148a, this.f3150c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f3149b.hashCode() + (J7.a.k(this.f3148a.c()) * 37);
    }
}
