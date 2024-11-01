package V1;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: q, reason: collision with root package name */
    public static final Set f10426q = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(V1.a.f10414d, V1.a.f10415e, V1.a.f10417g, V1.a.f10418h)));

    /* renamed from: l, reason: collision with root package name */
    private final V1.a f10427l;

    /* renamed from: m, reason: collision with root package name */
    private final d2.c f10428m;

    /* renamed from: n, reason: collision with root package name */
    private final d2.c f10429n;

    /* renamed from: o, reason: collision with root package name */
    private final d2.c f10430o;

    /* renamed from: p, reason: collision with root package name */
    private final PrivateKey f10431p;

    public b(V1.a aVar, d2.c cVar, d2.c cVar2, h hVar, Set set, O1.a aVar2, String str, URI uri, d2.c cVar3, d2.c cVar4, List list, KeyStore keyStore) {
        super(g.f10471c, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            this.f10427l = aVar;
            if (cVar != null) {
                this.f10428m = cVar;
                if (cVar2 != null) {
                    this.f10429n = cVar2;
                    r(aVar, cVar, cVar2);
                    q(f());
                    this.f10430o = null;
                    this.f10431p = null;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static d2.c p(int i8, BigInteger bigInteger) {
        byte[] a9 = d2.d.a(bigInteger);
        int i9 = (i8 + 7) / 8;
        if (a9.length >= i9) {
            return d2.c.e(a9);
        }
        byte[] bArr = new byte[i9];
        System.arraycopy(a9, 0, bArr, i9 - a9.length, a9.length);
        return d2.c.e(bArr);
    }

    private void q(List list) {
        if (list == null || w((X509Certificate) list.get(0))) {
        } else {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    private static void r(V1.a aVar, d2.c cVar, d2.c cVar2) {
        if (f10426q.contains(aVar)) {
            if (T1.b.a(cVar.b(), cVar2.b(), aVar.f())) {
                return;
            }
            throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + aVar + " curve");
        }
        throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
    }

    public static b x(String str) {
        return y(d2.k.m(str));
    }

    public static b y(Map map) {
        if (g.f10471c.equals(e.d(map))) {
            try {
                V1.a e8 = V1.a.e(d2.k.h(map, "crv"));
                d2.c a9 = d2.k.a(map, "x");
                d2.c a10 = d2.k.a(map, "y");
                d2.c a11 = d2.k.a(map, "d");
                try {
                    if (a11 == null) {
                        return new b(e8, a9, a10, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                    }
                    return new b(e8, a9, a10, a11, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), (KeyStore) null);
                } catch (IllegalArgumentException e9) {
                    throw new ParseException(e9.getMessage(), 0);
                }
            } catch (IllegalArgumentException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new ParseException("The key type \"kty\" must be EC", 0);
    }

    public ECPublicKey A(Provider provider) {
        KeyFactory keyFactory;
        ECParameterSpec f8 = this.f10427l.f();
        if (f8 != null) {
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(new ECPoint(this.f10428m.b(), this.f10429n.b()), f8);
            try {
                if (provider == null) {
                    keyFactory = KeyFactory.getInstance("EC");
                } else {
                    keyFactory = KeyFactory.getInstance("EC", provider);
                }
                return (ECPublicKey) keyFactory.generatePublic(eCPublicKeySpec);
            } catch (NoSuchAlgorithmException e8) {
                e = e8;
                throw new O1.f(e.getMessage(), e);
            } catch (InvalidKeySpecException e9) {
                e = e9;
                throw new O1.f(e.getMessage(), e);
            }
        }
        throw new O1.f("Couldn't get EC parameter spec for curve " + this.f10427l);
    }

    public b B() {
        return new b(t(), u(), v(), e(), c(), a(), b(), j(), i(), h(), g(), d());
    }

    @Override // V1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f10427l, bVar.f10427l) && Objects.equals(this.f10428m, bVar.f10428m) && Objects.equals(this.f10429n, bVar.f10429n) && Objects.equals(this.f10430o, bVar.f10430o) && Objects.equals(this.f10431p, bVar.f10431p)) {
            return true;
        }
        return false;
    }

    @Override // V1.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f10427l, this.f10428m, this.f10429n, this.f10430o, this.f10431p);
    }

    @Override // V1.d
    public boolean k() {
        if (this.f10430o == null && this.f10431p == null) {
            return false;
        }
        return true;
    }

    @Override // V1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("crv", this.f10427l.toString());
        n8.put("x", this.f10428m.toString());
        n8.put("y", this.f10429n.toString());
        d2.c cVar = this.f10430o;
        if (cVar != null) {
            n8.put("d", cVar.toString());
        }
        return n8;
    }

    public V1.a t() {
        return this.f10427l;
    }

    public d2.c u() {
        return this.f10428m;
    }

    public d2.c v() {
        return this.f10429n;
    }

    public boolean w(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) ((X509Certificate) f().get(0)).getPublicKey();
            if (!u().b().equals(eCPublicKey.getW().getAffineX())) {
                return false;
            }
            return v().b().equals(eCPublicKey.getW().getAffineY());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public ECPublicKey z() {
        return A(null);
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final V1.a f10432a;

        /* renamed from: b, reason: collision with root package name */
        private final d2.c f10433b;

        /* renamed from: c, reason: collision with root package name */
        private final d2.c f10434c;

        /* renamed from: d, reason: collision with root package name */
        private d2.c f10435d;

        /* renamed from: e, reason: collision with root package name */
        private PrivateKey f10436e;

        /* renamed from: f, reason: collision with root package name */
        private h f10437f;

        /* renamed from: g, reason: collision with root package name */
        private Set f10438g;

        /* renamed from: h, reason: collision with root package name */
        private O1.a f10439h;

        /* renamed from: i, reason: collision with root package name */
        private String f10440i;

        /* renamed from: j, reason: collision with root package name */
        private URI f10441j;

        /* renamed from: k, reason: collision with root package name */
        private d2.c f10442k;

        /* renamed from: l, reason: collision with root package name */
        private d2.c f10443l;

        /* renamed from: m, reason: collision with root package name */
        private List f10444m;

        /* renamed from: n, reason: collision with root package name */
        private KeyStore f10445n;

        public a(V1.a aVar, d2.c cVar, d2.c cVar2) {
            if (aVar != null) {
                this.f10432a = aVar;
                if (cVar != null) {
                    this.f10433b = cVar;
                    if (cVar2 != null) {
                        this.f10434c = cVar2;
                        return;
                    }
                    throw new IllegalArgumentException("The 'y' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'x' coordinate must not be null");
            }
            throw new IllegalArgumentException("The curve must not be null");
        }

        public b a() {
            try {
                if (this.f10435d == null && this.f10436e == null) {
                    return new b(this.f10432a, this.f10433b, this.f10434c, this.f10437f, this.f10438g, this.f10439h, this.f10440i, this.f10441j, this.f10442k, this.f10443l, this.f10444m, this.f10445n);
                }
                if (this.f10436e != null) {
                    return new b(this.f10432a, this.f10433b, this.f10434c, this.f10436e, this.f10437f, this.f10438g, this.f10439h, this.f10440i, this.f10441j, this.f10442k, this.f10443l, this.f10444m, this.f10445n);
                }
                return new b(this.f10432a, this.f10433b, this.f10434c, this.f10435d, this.f10437f, this.f10438g, this.f10439h, this.f10440i, this.f10441j, this.f10442k, this.f10443l, this.f10444m, this.f10445n);
            } catch (IllegalArgumentException e8) {
                throw new IllegalStateException(e8.getMessage(), e8);
            }
        }

        public a b(String str) {
            this.f10440i = str;
            return this;
        }

        public a c(h hVar) {
            this.f10437f = hVar;
            return this;
        }

        public a(V1.a aVar, ECPublicKey eCPublicKey) {
            this(aVar, b.p(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), b.p(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }
    }

    public b(V1.a aVar, d2.c cVar, d2.c cVar2, d2.c cVar3, h hVar, Set set, O1.a aVar2, String str, URI uri, d2.c cVar4, d2.c cVar5, List list, KeyStore keyStore) {
        super(g.f10471c, hVar, set, aVar2, str, uri, cVar4, cVar5, list, keyStore);
        if (aVar != null) {
            this.f10427l = aVar;
            if (cVar != null) {
                this.f10428m = cVar;
                if (cVar2 != null) {
                    this.f10429n = cVar2;
                    r(aVar, cVar, cVar2);
                    q(f());
                    if (cVar3 != null) {
                        this.f10430o = cVar3;
                        this.f10431p = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public b(V1.a aVar, d2.c cVar, d2.c cVar2, PrivateKey privateKey, h hVar, Set set, O1.a aVar2, String str, URI uri, d2.c cVar3, d2.c cVar4, List list, KeyStore keyStore) {
        super(g.f10471c, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            this.f10427l = aVar;
            if (cVar != null) {
                this.f10428m = cVar;
                if (cVar2 != null) {
                    this.f10429n = cVar2;
                    r(aVar, cVar, cVar2);
                    q(f());
                    this.f10430o = null;
                    this.f10431p = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
