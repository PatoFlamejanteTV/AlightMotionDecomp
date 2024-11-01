package z7;

import c7.C2082b;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import q7.AbstractC3838g;
import x7.d;

/* renamed from: z7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4275b implements PublicKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC3838g f41564a;

    public C4275b(C2082b c2082b) {
        a(c2082b);
    }

    private void a(C2082b c2082b) {
        this.f41564a = (AbstractC3838g) x7.c.a(c2082b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4275b) {
            try {
                return J7.a.a(this.f41564a.getEncoded(), ((C4275b) obj).f41564a.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f41564a).getEncoded();
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
            return J7.a.k(this.f41564a.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
