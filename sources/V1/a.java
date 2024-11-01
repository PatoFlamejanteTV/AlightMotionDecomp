package V1;

import O1.p;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f10414d = new a("P-256", "secp256r1", "1.2.840.10045.3.1.7");

    /* renamed from: e, reason: collision with root package name */
    public static final a f10415e = new a("secp256k1", "secp256k1", "1.3.132.0.10");

    /* renamed from: f, reason: collision with root package name */
    public static final a f10416f = new a("P-256K", "secp256k1", "1.3.132.0.10");

    /* renamed from: g, reason: collision with root package name */
    public static final a f10417g = new a("P-384", "secp384r1", "1.3.132.0.34");

    /* renamed from: h, reason: collision with root package name */
    public static final a f10418h = new a("P-521", "secp521r1", "1.3.132.0.35");

    /* renamed from: i, reason: collision with root package name */
    public static final a f10419i = new a("Ed25519", "Ed25519", null);

    /* renamed from: j, reason: collision with root package name */
    public static final a f10420j = new a("Ed448", "Ed448", null);

    /* renamed from: k, reason: collision with root package name */
    public static final a f10421k = new a("X25519", "X25519", null);

    /* renamed from: l, reason: collision with root package name */
    public static final a f10422l = new a("X448", "X448", null);

    /* renamed from: a, reason: collision with root package name */
    private final String f10423a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10424b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10425c;

    public a(String str) {
        this(str, null, null);
    }

    public static a a(ECParameterSpec eCParameterSpec) {
        return c.a(eCParameterSpec);
    }

    public static Set b(p pVar) {
        if (p.f7044j.equals(pVar)) {
            return Collections.singleton(f10414d);
        }
        if (p.f7045k.equals(pVar)) {
            return Collections.singleton(f10415e);
        }
        if (p.f7046l.equals(pVar)) {
            return Collections.singleton(f10417g);
        }
        if (p.f7047m.equals(pVar)) {
            return Collections.singleton(f10418h);
        }
        if (p.f7051q.equals(pVar)) {
            return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(f10419i, f10420j)));
        }
        return null;
    }

    public static a e(String str) {
        if (str != null && !str.trim().isEmpty()) {
            a aVar = f10414d;
            if (str.equals(aVar.c())) {
                return aVar;
            }
            a aVar2 = f10416f;
            if (str.equals(aVar2.c())) {
                return aVar2;
            }
            a aVar3 = f10415e;
            if (str.equals(aVar3.c())) {
                return aVar3;
            }
            a aVar4 = f10417g;
            if (str.equals(aVar4.c())) {
                return aVar4;
            }
            a aVar5 = f10418h;
            if (str.equals(aVar5.c())) {
                return aVar5;
            }
            a aVar6 = f10419i;
            if (str.equals(aVar6.c())) {
                return aVar6;
            }
            a aVar7 = f10420j;
            if (str.equals(aVar7.c())) {
                return aVar7;
            }
            a aVar8 = f10421k;
            if (str.equals(aVar8.c())) {
                return aVar8;
            }
            a aVar9 = f10422l;
            if (str.equals(aVar9.c())) {
                return aVar9;
            }
            return new a(str);
        }
        throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
    }

    public String c() {
        return this.f10423a;
    }

    public String d() {
        return this.f10424b;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof a) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public ECParameterSpec f() {
        return c.b(this);
    }

    public int hashCode() {
        return Objects.hash(c());
    }

    public String toString() {
        return c();
    }

    public a(String str, String str2, String str3) {
        if (str != null) {
            this.f10423a = str;
            this.f10424b = str2;
            this.f10425c = str3;
            return;
        }
        throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
    }
}
