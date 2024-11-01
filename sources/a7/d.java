package A7;

import c7.C2081a;
import c7.C2082b;
import java.io.IOException;
import java.security.PublicKey;
import p7.C3592d;
import p7.InterfaceC3593e;

/* loaded from: classes5.dex */
public class d implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private r7.g f295a;

    public d(r7.g gVar) {
        this.f295a = gVar;
    }

    public I7.a a() {
        return this.f295a.a();
    }

    public int b() {
        return this.f295a.b();
    }

    public int c() {
        return this.f295a.c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f295a.b() != dVar.b() || this.f295a.c() != dVar.c() || !this.f295a.a().equals(dVar.a())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C2082b(new C2081a(InterfaceC3593e.f36493m), new C3592d(this.f295a.b(), this.f295a.c(), this.f295a.a())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f295a.b() + (this.f295a.c() * 37)) * 37) + this.f295a.a().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f295a.b() + "\n") + " error correction capability: " + this.f295a.c() + "\n") + " generator matrix           : " + this.f295a.a();
    }
}
