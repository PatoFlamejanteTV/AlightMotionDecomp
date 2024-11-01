package O1;

import java.text.ParseException;

/* loaded from: classes4.dex */
public class n extends g {

    /* renamed from: c, reason: collision with root package name */
    private m f7028c;

    /* renamed from: d, reason: collision with root package name */
    private d2.c f7029d;

    /* renamed from: e, reason: collision with root package name */
    private d2.c f7030e;

    /* renamed from: f, reason: collision with root package name */
    private d2.c f7031f;

    /* renamed from: g, reason: collision with root package name */
    private d2.c f7032g;

    /* renamed from: h, reason: collision with root package name */
    private a f7033h;

    /* loaded from: classes4.dex */
    public enum a {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public n(m mVar, w wVar) {
        if (mVar != null) {
            this.f7028c = mVar;
            if (wVar != null) {
                d(wVar);
                this.f7029d = null;
                this.f7031f = null;
                this.f7033h = a.UNENCRYPTED;
                return;
            }
            throw new IllegalArgumentException("The payload must not be null");
        }
        throw new IllegalArgumentException("The JWE header must not be null");
    }

    private void h() {
        a aVar = this.f7033h;
        if (aVar != a.ENCRYPTED && aVar != a.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void i() {
        if (this.f7033h == a.ENCRYPTED) {
        } else {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    private void j(l lVar) {
        if (lVar.f().contains(p().t())) {
            if (lVar.b().contains(p().v())) {
                return;
            }
            throw new f("The " + p().v() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + lVar.b());
        }
        throw new f("The " + p().t() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + lVar.f());
    }

    private void k() {
        if (this.f7033h == a.UNENCRYPTED) {
        } else {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public static n r(String str) {
        d2.c[] e8 = g.e(str);
        if (e8.length == 5) {
            return new n(e8[0], e8[1], e8[2], e8[3], e8[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    public synchronized void f(k kVar) {
        i();
        try {
            d(new w(kVar.e(p(), o(), q(), n(), m())));
            this.f7033h = a.DECRYPTED;
        } catch (f e8) {
            throw e8;
        } catch (Exception e9) {
            throw new f(e9.getMessage(), e9);
        }
    }

    public synchronized void g(l lVar) {
        try {
            k();
            j(lVar);
            try {
                try {
                    j a9 = lVar.a(p(), b().d());
                    if (a9.d() != null) {
                        this.f7028c = a9.d();
                    }
                    this.f7029d = a9.c();
                    this.f7030e = a9.e();
                    this.f7031f = a9.b();
                    this.f7032g = a9.a();
                    this.f7033h = a.ENCRYPTED;
                } catch (f e8) {
                    throw e8;
                }
            } catch (Exception e9) {
                throw new f(e9.getMessage(), e9);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public d2.c m() {
        return this.f7032g;
    }

    public d2.c n() {
        return this.f7031f;
    }

    public d2.c o() {
        return this.f7029d;
    }

    public m p() {
        return this.f7028c;
    }

    public d2.c q() {
        return this.f7030e;
    }

    public String t() {
        h();
        StringBuilder sb = new StringBuilder(this.f7028c.h().toString());
        sb.append('.');
        d2.c cVar = this.f7029d;
        if (cVar != null) {
            sb.append(cVar);
        }
        sb.append('.');
        d2.c cVar2 = this.f7030e;
        if (cVar2 != null) {
            sb.append(cVar2);
        }
        sb.append('.');
        sb.append(this.f7031f);
        sb.append('.');
        d2.c cVar3 = this.f7032g;
        if (cVar3 != null) {
            sb.append(cVar3);
        }
        return sb.toString();
    }

    public n(d2.c cVar, d2.c cVar2, d2.c cVar3, d2.c cVar4, d2.c cVar5) {
        if (cVar != null) {
            try {
                this.f7028c = m.x(cVar);
                if (cVar2 != null && !cVar2.toString().isEmpty()) {
                    this.f7029d = cVar2;
                } else {
                    this.f7029d = null;
                }
                if (cVar3 != null && !cVar3.toString().isEmpty()) {
                    this.f7030e = cVar3;
                } else {
                    this.f7030e = null;
                }
                if (cVar4 != null) {
                    this.f7031f = cVar4;
                    if (cVar5 != null && !cVar5.toString().isEmpty()) {
                        this.f7032g = cVar5;
                    } else {
                        this.f7032g = null;
                    }
                    this.f7033h = a.ENCRYPTED;
                    c(cVar, cVar2, cVar3, cVar4, cVar5);
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e8) {
                throw new ParseException("Invalid JWE header: " + e8.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
