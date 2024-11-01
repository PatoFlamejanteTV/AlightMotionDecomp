package A7;

import I7.h;
import I7.i;
import b7.C1992b;
import c7.C2081a;
import d7.InterfaceC2773b;
import java.io.IOException;
import java.security.PrivateKey;
import p7.C3591c;
import p7.InterfaceC3593e;

/* loaded from: classes5.dex */
public class c implements InterfaceC2773b, PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private r7.f f294a;

    public c(r7.f fVar) {
        this.f294a = fVar;
    }

    public I7.b a() {
        return this.f294a.a();
    }

    public i b() {
        return this.f294a.b();
    }

    public int c() {
        return this.f294a.c();
    }

    public int d() {
        return this.f294a.d();
    }

    public h e() {
        return this.f294a.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (d() != cVar.d() || c() != cVar.c() || !a().equals(cVar.a()) || !b().equals(cVar.b()) || !g().equals(cVar.g()) || !e().equals(cVar.e()) || !f().equals(cVar.f())) {
            return false;
        }
        return true;
    }

    public h f() {
        return this.f294a.f();
    }

    public I7.a g() {
        return this.f294a.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C1992b(new C2081a(InterfaceC3593e.f36493m), new C3591c(this.f294a.d(), this.f294a.c(), this.f294a.a(), this.f294a.b(), this.f294a.e(), this.f294a.f(), this.f294a.g())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((((this.f294a.c() * 37) + this.f294a.d()) * 37) + this.f294a.a().hashCode()) * 37) + this.f294a.b().hashCode()) * 37) + this.f294a.e().hashCode()) * 37) + this.f294a.f().hashCode()) * 37) + this.f294a.g().hashCode();
    }
}
