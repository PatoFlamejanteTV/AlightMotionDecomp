package R1;

import O1.q;
import O1.s;
import P1.c;
import P1.d;
import P1.f;
import S1.r;
import S1.v;
import S1.z;
import U1.b;
import j$.util.DesugarCollections;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class a implements U1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f9151b;

    /* renamed from: a, reason: collision with root package name */
    private final b f9152a = new b();

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(v.f9396d);
        linkedHashSet.addAll(z.f9400c);
        linkedHashSet.addAll(r.f9391c);
        f9151b = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    @Override // U1.a
    public b d() {
        return this.f9152a;
    }

    public s g(q qVar, Key key) {
        s cVar;
        if (v.f9396d.contains(qVar.t())) {
            if (key instanceof SecretKey) {
                cVar = new d((SecretKey) key);
            } else {
                throw new O1.v(SecretKey.class);
            }
        } else if (z.f9400c.contains(qVar.t())) {
            if (key instanceof RSAPublicKey) {
                cVar = new f((RSAPublicKey) key);
            } else {
                throw new O1.v(RSAPublicKey.class);
            }
        } else if (r.f9391c.contains(qVar.t())) {
            if (key instanceof ECPublicKey) {
                cVar = new c((ECPublicKey) key);
            } else {
                throw new O1.v(ECPublicKey.class);
            }
        } else {
            throw new O1.f("Unsupported JWS algorithm: " + qVar.t());
        }
        cVar.d().c(this.f9152a.a());
        return cVar;
    }
}
