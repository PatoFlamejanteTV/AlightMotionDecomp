package G7;

import W6.C1488n;
import c7.C2082b;
import java.io.IOException;
import java.security.PublicKey;
import y7.z;

/* loaded from: classes5.dex */
public class d implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient z f3151a;

    /* renamed from: b, reason: collision with root package name */
    private transient C1488n f3152b;

    public d(C2082b c2082b) {
        a(c2082b);
    }

    private void a(C2082b c2082b) {
        z zVar = (z) x7.c.a(c2082b);
        this.f3151a = zVar;
        this.f3152b = e.a(zVar.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            try {
                if (this.f3152b.o(dVar.f3152b)) {
                    if (J7.a.a(this.f3151a.getEncoded(), dVar.f3151a.getEncoded())) {
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return x7.d.a(this.f3151a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return this.f3152b.hashCode() + (J7.a.k(this.f3151a.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.f3152b.hashCode();
        }
    }
}
