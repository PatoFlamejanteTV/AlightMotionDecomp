package V1;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import j$.util.Objects;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class l extends d {

    /* renamed from: l, reason: collision with root package name */
    private final d2.c f10488l;

    /* renamed from: m, reason: collision with root package name */
    private final d2.c f10489m;

    /* renamed from: n, reason: collision with root package name */
    private final d2.c f10490n;

    /* renamed from: o, reason: collision with root package name */
    private final d2.c f10491o;

    /* renamed from: p, reason: collision with root package name */
    private final d2.c f10492p;

    /* renamed from: q, reason: collision with root package name */
    private final d2.c f10493q;

    /* renamed from: r, reason: collision with root package name */
    private final d2.c f10494r;

    /* renamed from: s, reason: collision with root package name */
    private final d2.c f10495s;

    /* renamed from: t, reason: collision with root package name */
    private final List f10496t;

    /* renamed from: u, reason: collision with root package name */
    private final PrivateKey f10497u;

    /* loaded from: classes4.dex */
    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final d2.c f10498a;

        /* renamed from: b, reason: collision with root package name */
        private final d2.c f10499b;

        /* renamed from: c, reason: collision with root package name */
        private final d2.c f10500c;

        public a(d2.c cVar, d2.c cVar2, d2.c cVar3) {
            if (cVar != null) {
                this.f10498a = cVar;
                if (cVar2 != null) {
                    this.f10499b = cVar2;
                    if (cVar3 != null) {
                        this.f10500c = cVar3;
                        return;
                    }
                    throw new IllegalArgumentException("The factor CRT coefficient must not be null");
                }
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            throw new IllegalArgumentException("The prime factor must not be null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(d2.c r17, d2.c r18, d2.c r19, d2.c r20, d2.c r21, d2.c r22, d2.c r23, d2.c r24, java.util.List r25, java.security.PrivateKey r26, V1.h r27, java.util.Set r28, O1.a r29, java.lang.String r30, java.net.URI r31, d2.c r32, d2.c r33, java.util.List r34, java.security.KeyStore r35) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.l.<init>(d2.c, d2.c, d2.c, d2.c, d2.c, d2.c, d2.c, d2.c, java.util.List, java.security.PrivateKey, V1.h, java.util.Set, O1.a, java.lang.String, java.net.URI, d2.c, d2.c, java.util.List, java.security.KeyStore):void");
    }

    public static l q(Map map) {
        ArrayList arrayList;
        List e8;
        if (g.f10472d.equals(e.d(map))) {
            d2.c a9 = d2.k.a(map, "n");
            d2.c a10 = d2.k.a(map, "e");
            d2.c a11 = d2.k.a(map, "d");
            d2.c a12 = d2.k.a(map, TtmlNode.TAG_P);
            d2.c a13 = d2.k.a(map, CampaignEx.JSON_KEY_AD_Q);
            d2.c a14 = d2.k.a(map, "dp");
            d2.c a15 = d2.k.a(map, "dq");
            d2.c a16 = d2.k.a(map, "qi");
            if (map.containsKey("oth") && (e8 = d2.k.e(map, "oth")) != null) {
                arrayList = new ArrayList(e8.size());
                for (Object obj : e8) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        try {
                            arrayList.add(new a(d2.k.a(map2, CampaignEx.JSON_KEY_AD_R), d2.k.a(map2, "dq"), d2.k.a(map2, "t")));
                        } catch (IllegalArgumentException e9) {
                            throw new ParseException(e9.getMessage(), 0);
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            try {
                return new l(a9, a10, a11, a12, a13, a14, a15, a16, arrayList, null, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
            } catch (IllegalArgumentException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new ParseException("The key type \"kty\" must be RSA", 0);
    }

    @Override // V1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l) || !super.equals(obj)) {
            return false;
        }
        l lVar = (l) obj;
        if (Objects.equals(this.f10488l, lVar.f10488l) && Objects.equals(this.f10489m, lVar.f10489m) && Objects.equals(this.f10490n, lVar.f10490n) && Objects.equals(this.f10491o, lVar.f10491o) && Objects.equals(this.f10492p, lVar.f10492p) && Objects.equals(this.f10493q, lVar.f10493q) && Objects.equals(this.f10494r, lVar.f10494r) && Objects.equals(this.f10495s, lVar.f10495s) && Objects.equals(this.f10496t, lVar.f10496t) && Objects.equals(this.f10497u, lVar.f10497u)) {
            return true;
        }
        return false;
    }

    @Override // V1.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f10488l, this.f10489m, this.f10490n, this.f10491o, this.f10492p, this.f10493q, this.f10494r, this.f10495s, this.f10496t, this.f10497u);
    }

    @Override // V1.d
    public boolean k() {
        if (this.f10490n == null && this.f10491o == null && this.f10497u == null) {
            return false;
        }
        return true;
    }

    @Override // V1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("n", this.f10488l.toString());
        n8.put("e", this.f10489m.toString());
        d2.c cVar = this.f10490n;
        if (cVar != null) {
            n8.put("d", cVar.toString());
        }
        d2.c cVar2 = this.f10491o;
        if (cVar2 != null) {
            n8.put(TtmlNode.TAG_P, cVar2.toString());
        }
        d2.c cVar3 = this.f10492p;
        if (cVar3 != null) {
            n8.put(CampaignEx.JSON_KEY_AD_Q, cVar3.toString());
        }
        d2.c cVar4 = this.f10493q;
        if (cVar4 != null) {
            n8.put("dp", cVar4.toString());
        }
        d2.c cVar5 = this.f10494r;
        if (cVar5 != null) {
            n8.put("dq", cVar5.toString());
        }
        d2.c cVar6 = this.f10495s;
        if (cVar6 != null) {
            n8.put("qi", cVar6.toString());
        }
        List list = this.f10496t;
        if (list != null && !list.isEmpty()) {
            List a9 = d2.j.a();
            for (a aVar : this.f10496t) {
                Map l8 = d2.k.l();
                l8.put(CampaignEx.JSON_KEY_AD_R, aVar.f10498a.toString());
                l8.put("d", aVar.f10499b.toString());
                l8.put("t", aVar.f10500c.toString());
                a9.add(l8);
            }
            n8.put("oth", a9);
        }
        return n8;
    }

    public boolean p(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((X509Certificate) f().get(0)).getPublicKey();
            if (!this.f10489m.b().equals(rSAPublicKey.getPublicExponent())) {
                return false;
            }
            return this.f10488l.b().equals(rSAPublicKey.getModulus());
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
