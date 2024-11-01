package E7;

import W6.AbstractC1496w;
import W6.C1471a0;
import W6.C1488n;
import b7.C1992b;
import c7.C2081a;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import p7.InterfaceC3593e;
import p7.h;
import w7.C4165b;
import x7.AbstractC4232a;

/* loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient C1488n f2083a;

    /* renamed from: b, reason: collision with root package name */
    private transient C4165b f2084b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC1496w f2085c;

    public a(C1992b c1992b) {
        a(c1992b);
    }

    private void a(C1992b c1992b) {
        this.f2085c = c1992b.l();
        this.f2083a = h.l(c1992b.n().n()).m().l();
        this.f2084b = (C4165b) AbstractC4232a.b(c1992b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2083a.o(aVar.f2083a) && J7.a.a(this.f2084b.b(), aVar.f2084b.b())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C1992b c1992b;
        try {
            if (this.f2084b.a() != null) {
                c1992b = x7.b.a(this.f2084b, this.f2085c);
            } else {
                c1992b = new C1992b(new C2081a(InterfaceC3593e.f36498r, new h(new C2081a(this.f2083a))), new C1471a0(this.f2084b.b()), this.f2085c);
            }
            return c1992b.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f2083a.hashCode() + (J7.a.k(this.f2084b.b()) * 37);
    }
}
