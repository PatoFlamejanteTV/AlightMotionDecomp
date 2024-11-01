package E7;

import W6.C1488n;
import c7.C2081a;
import c7.C2082b;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import p7.InterfaceC3593e;
import p7.h;
import w7.C4166c;
import x7.d;

/* loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient C1488n f2086a;

    /* renamed from: b, reason: collision with root package name */
    private transient C4166c f2087b;

    public b(C2082b c2082b) {
        a(c2082b);
    }

    private void a(C2082b c2082b) {
        this.f2086a = h.l(c2082b.l().n()).m().l();
        this.f2087b = (C4166c) x7.c.a(c2082b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2086a.o(bVar.f2086a) && J7.a.a(this.f2087b.b(), bVar.f2087b.b())) {
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
        C2082b c2082b;
        try {
            if (this.f2087b.a() != null) {
                c2082b = d.a(this.f2087b);
            } else {
                c2082b = new C2082b(new C2081a(InterfaceC3593e.f36498r, new h(new C2081a(this.f2086a))), this.f2087b.b());
            }
            return c2082b.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f2086a.hashCode() + (J7.a.k(this.f2087b.b()) * 37);
    }
}
