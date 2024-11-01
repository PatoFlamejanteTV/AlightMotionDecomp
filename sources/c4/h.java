package c4;

import O1.q;
import R5.AbstractC1435t;
import d2.C2747a;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final a f15507d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15508a;

    /* renamed from: b, reason: collision with root package name */
    private final List f15509b;

    /* renamed from: c, reason: collision with root package name */
    private final Z3.c f15510c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(List list, List list2) {
            List a9 = d2.n.a(list);
            KeyStore b9 = b(list2);
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate((X509Certificate) a9.get(0));
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(b9, x509CertSelector);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(a9)));
            CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
        }

        public final KeyStore b(List rootCerts) {
            AbstractC3292y.i(rootCerts, "rootCerts");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            int i8 = 0;
            for (Object obj : rootCerts) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1435t.w();
                }
                Y y8 = Y.f34578a;
                String format = String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                AbstractC3292y.h(format, "format(locale, format, *args)");
                keyStore.setCertificateEntry(format, (Certificate) rootCerts.get(i8));
                i8 = i9;
            }
            AbstractC3292y.f(keyStore);
            return keyStore;
        }

        public final O1.q c(O1.q jwsHeader) {
            AbstractC3292y.i(jwsHeader, "jwsHeader");
            O1.q b9 = new q.a(jwsHeader).f(null).b();
            AbstractC3292y.h(b9, "build(...)");
            return b9;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public h(boolean z8, List rootCerts, Z3.c errorReporter) {
        AbstractC3292y.i(rootCerts, "rootCerts");
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f15508a = z8;
        this.f15509b = rootCerts;
        this.f15510c = errorReporter;
    }

    private final PublicKey b(O1.q qVar) {
        List n8 = qVar.n();
        AbstractC3292y.h(n8, "getX509CertChain(...)");
        PublicKey publicKey = d2.o.b(((C2747a) AbstractC1435t.m0(n8)).a()).getPublicKey();
        AbstractC3292y.h(publicKey, "getPublicKey(...)");
        return publicKey;
    }

    private final O1.s c(O1.q qVar) {
        R1.a aVar = new R1.a();
        aVar.d().c(Q1.a.a());
        O1.s g8 = aVar.g(qVar, b(qVar));
        AbstractC3292y.h(g8, "createJWSVerifier(...)");
        return g8;
    }

    private final boolean e(O1.r rVar, List list) {
        if (rVar.h().j() != null) {
            this.f15510c.l(new IllegalArgumentException("Encountered a JWK in " + rVar.h()));
        }
        a aVar = f15507d;
        O1.q h8 = rVar.h();
        AbstractC3292y.h(h8, "getHeader(...)");
        O1.q c8 = aVar.c(h8);
        if (!d(c8.n(), list)) {
            return false;
        }
        return rVar.o(c(c8));
    }

    @Override // c4.o
    public JSONObject a(String jws) {
        AbstractC3292y.i(jws, "jws");
        O1.r k8 = O1.r.k(jws);
        if (this.f15508a) {
            AbstractC3292y.f(k8);
            if (!e(k8, this.f15509b)) {
                throw new IllegalStateException("Could not validate JWS");
            }
        }
        return new JSONObject(k8.b().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0005, B:5:0x000d, B:9:0x0019, B:11:0x001c, B:13:0x0026, B:20:0x0032, B:21:0x003d, B:22:0x003e, B:23:0x0049), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0005, B:5:0x000d, B:9:0x0019, B:11:0x001c, B:13:0x0026, B:20:0x0032, B:21:0x003d, B:22:0x003e, B:23:0x0049), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.util.List r3, java.util.List r4) {
        /*
            r2 = this;
            java.lang.String r0 = "rootCerts"
            kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
            Q5.s$a r0 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L16
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L14
            goto L18
        L14:
            r0 = 0
            goto L19
        L16:
            r3 = move-exception
            goto L4a
        L18:
            r0 = 1
        L19:
            r0 = r0 ^ r1
            if (r0 == 0) goto L3e
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16
            r0 = r0 ^ r1
            if (r0 == 0) goto L32
            c4.h$a r0 = c4.h.f15507d     // Catch: java.lang.Throwable -> L16
            c4.h.a.a(r0, r3, r4)     // Catch: java.lang.Throwable -> L16
            Q5.I r3 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = Q5.s.b(r3)     // Catch: java.lang.Throwable -> L16
            goto L54
        L32:
            java.lang.String r3 = "Root certificates are empty"
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L16
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L16
            throw r4     // Catch: java.lang.Throwable -> L16
        L3e:
            java.lang.String r3 = "JWSHeader's X.509 certificate chain is null or empty"
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L16
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L16
            throw r4     // Catch: java.lang.Throwable -> L16
        L4a:
            Q5.s$a r4 = Q5.s.f8810b
            java.lang.Object r3 = Q5.t.a(r3)
            java.lang.Object r3 = Q5.s.b(r3)
        L54:
            java.lang.Throwable r4 = Q5.s.e(r3)
            if (r4 == 0) goto L5f
            Z3.c r0 = r2.f15510c
            r0.l(r4)
        L5f:
            boolean r3 = Q5.s.h(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.h.d(java.util.List, java.util.List):boolean");
    }
}
