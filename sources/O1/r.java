package O1;

import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class r extends g {

    /* renamed from: c, reason: collision with root package name */
    private final q f7068c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7069d;

    /* renamed from: e, reason: collision with root package name */
    private d2.c f7070e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f7071f;

    /* loaded from: classes4.dex */
    public enum a {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public r(d2.c cVar, d2.c cVar2, d2.c cVar3) {
        this(cVar, new w(cVar2), cVar3);
    }

    private String f() {
        if (this.f7068c.v()) {
            return h().h().toString() + '.' + b().c().toString();
        }
        return h().h().toString() + '.' + b().toString();
    }

    private void g() {
        if (this.f7071f.get() != a.SIGNED && this.f7071f.get() != a.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    public static r k(String str) {
        d2.c[] e8 = g.e(str);
        if (e8.length == 3) {
            return new r(e8[0], e8[1], e8[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    public q h() {
        return this.f7068c;
    }

    public d2.c i() {
        return this.f7070e;
    }

    public byte[] j() {
        return this.f7069d.getBytes(d2.m.f31296a);
    }

    public String m() {
        return n(false);
    }

    public String n(boolean z8) {
        g();
        if (z8) {
            return this.f7068c.h().toString() + ".." + this.f7070e.toString();
        }
        return this.f7069d + '.' + this.f7070e.toString();
    }

    public synchronized boolean o(s sVar) {
        boolean c8;
        g();
        try {
            c8 = sVar.c(h(), j(), i());
            if (c8) {
                this.f7071f.set(a.VERIFIED);
            }
        } catch (f e8) {
            throw e8;
        } catch (Exception e9) {
            throw new f(e9.getMessage(), e9);
        }
        return c8;
    }

    public r(d2.c cVar, w wVar, d2.c cVar2) {
        AtomicReference atomicReference = new AtomicReference();
        this.f7071f = atomicReference;
        if (cVar != null) {
            try {
                this.f7068c = q.w(cVar);
                if (wVar != null) {
                    d(wVar);
                    this.f7069d = f();
                    if (cVar2 != null) {
                        this.f7070e = cVar2;
                        atomicReference.set(a.SIGNED);
                        if (h().v()) {
                            c(cVar, wVar.c(), cVar2);
                            return;
                        } else {
                            c(cVar, new d2.c(""), cVar2);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("The third part must not be null");
                }
                throw new IllegalArgumentException("The payload (second part) must not be null");
            } catch (ParseException e8) {
                throw new ParseException("Invalid JWS header: " + e8.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
