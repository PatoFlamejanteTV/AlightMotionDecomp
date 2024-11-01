package A7;

import c7.C2081a;
import c7.C2082b;
import d7.InterfaceC2773b;
import java.io.IOException;
import java.security.PublicKey;
import p7.C3590b;
import p7.InterfaceC3593e;

/* loaded from: classes5.dex */
public class b implements InterfaceC2773b, PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private r7.c f293a;

    public b(r7.c cVar) {
        this.f293a = cVar;
    }

    public I7.a a() {
        return this.f293a.b();
    }

    public int b() {
        return this.f293a.c();
    }

    public int c() {
        return this.f293a.d();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f293a.c() != bVar.b() || this.f293a.d() != bVar.c() || !this.f293a.b().equals(bVar.a())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C2082b(new C2081a(InterfaceC3593e.f36494n), new C3590b(this.f293a.c(), this.f293a.d(), this.f293a.b(), g.a(this.f293a.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f293a.c() + (this.f293a.d() * 37)) * 37) + this.f293a.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f293a.c() + "\n") + " error correction capability: " + this.f293a.d() + "\n") + " generator matrix           : " + this.f293a.b().toString();
    }
}
