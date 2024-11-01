package G7;

import W6.AbstractC1496w;
import W6.C1488n;
import b7.C1992b;
import java.io.IOException;
import java.security.PrivateKey;
import p7.j;
import x7.AbstractC4232a;
import y7.s;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C1488n f3143a;

    /* renamed from: b, reason: collision with root package name */
    private transient s f3144b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC1496w f3145c;

    public a(C1992b c1992b) {
        a(c1992b);
    }

    private void a(C1992b c1992b) {
        this.f3145c = c1992b.l();
        this.f3143a = j.m(c1992b.n().n()).o().l();
        this.f3144b = (s) AbstractC4232a.b(c1992b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3143a.o(aVar.f3143a) && J7.a.a(this.f3144b.c(), aVar.f3144b.c())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return x7.b.a(this.f3144b, this.f3145c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f3143a.hashCode() + (J7.a.k(this.f3144b.c()) * 37);
    }
}
