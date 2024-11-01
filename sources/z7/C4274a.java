package z7;

import W6.AbstractC1496w;
import b7.C1992b;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import q7.AbstractC3838g;
import x7.AbstractC4232a;

/* renamed from: z7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4274a implements PrivateKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC3838g f41562a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC1496w f41563b;

    public C4274a(C1992b c1992b) {
        a(c1992b);
    }

    private void a(C1992b c1992b) {
        this.f41563b = c1992b.l();
        this.f41562a = (AbstractC3838g) AbstractC4232a.b(c1992b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4274a) {
            try {
                return J7.a.a(this.f41562a.getEncoded(), ((C4274a) obj).f41562a.getEncoded());
            } catch (IOException unused) {
                throw new IllegalStateException("unable to perform equals");
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return x7.b.a(this.f41562a, this.f41563b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return J7.a.k(this.f41562a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
