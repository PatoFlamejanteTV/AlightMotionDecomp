package K6;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final C f5061a;

    /* renamed from: b, reason: collision with root package name */
    private final g f5062b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5063c;

    /* renamed from: d, reason: collision with root package name */
    private final List f5064d;

    private p(C c8, g gVar, List list, List list2) {
        this.f5061a = c8;
        this.f5062b = gVar;
        this.f5063c = list;
        this.f5064d = list2;
    }

    public static p b(C c8, g gVar, List list, List list2) {
        if (c8 != null) {
            if (gVar != null) {
                return new p(c8, gVar, L6.c.q(list), L6.c.q(list2));
            }
            throw new NullPointerException("cipherSuite == null");
        }
        throw new NullPointerException("tlsVersion == null");
    }

    public static p c(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            g a9 = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                C a10 = C.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    emptyList = L6.c.r(certificateArr);
                } else {
                    emptyList = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    emptyList2 = L6.c.r(localCertificates);
                } else {
                    emptyList2 = Collections.emptyList();
                }
                return new p(a10, a9, emptyList, emptyList2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public g a() {
        return this.f5062b;
    }

    public List d() {
        return this.f5064d;
    }

    public List e() {
        return this.f5063c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f5061a.equals(pVar.f5061a) || !this.f5062b.equals(pVar.f5062b) || !this.f5063c.equals(pVar.f5063c) || !this.f5064d.equals(pVar.f5064d)) {
            return false;
        }
        return true;
    }

    public C f() {
        return this.f5061a;
    }

    public int hashCode() {
        return ((((((527 + this.f5061a.hashCode()) * 31) + this.f5062b.hashCode()) * 31) + this.f5063c.hashCode()) * 31) + this.f5064d.hashCode();
    }
}
