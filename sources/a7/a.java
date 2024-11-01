package A7;

import I7.h;
import I7.i;
import b7.C1992b;
import c7.C2081a;
import java.io.IOException;
import java.security.PrivateKey;
import p7.C3589a;
import p7.InterfaceC3593e;
import r7.C3933b;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private C3933b f292a;

    public a(C3933b c3933b) {
        this.f292a = c3933b;
    }

    public I7.b a() {
        return this.f292a.b();
    }

    public i b() {
        return this.f292a.c();
    }

    public I7.a c() {
        return this.f292a.d();
    }

    public int d() {
        return this.f292a.e();
    }

    public int e() {
        return this.f292a.f();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (e() != aVar.e() || d() != aVar.d() || !a().equals(aVar.a()) || !b().equals(aVar.b()) || !f().equals(aVar.f()) || !c().equals(aVar.c())) {
            return false;
        }
        return true;
    }

    public h f() {
        return this.f292a.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C1992b(new C2081a(InterfaceC3593e.f36494n), new C3589a(e(), d(), a(), b(), f(), g.a(this.f292a.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((this.f292a.e() * 37) + this.f292a.f()) * 37) + this.f292a.b().hashCode()) * 37) + this.f292a.c().hashCode()) * 37) + this.f292a.g().hashCode()) * 37) + this.f292a.d().hashCode();
    }
}
