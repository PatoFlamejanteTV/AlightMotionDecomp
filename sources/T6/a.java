package T6;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final e f9998a;

    public a(e eVar) {
        this.f9998a = eVar;
    }

    private boolean c(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // T6.c
    public List a(List list, String str) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z8 = false;
        for (int i8 = 0; i8 < 9; i8++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate findByIssuerAndSignature = this.f9998a.findByIssuerAndSignature(x509Certificate);
            if (findByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(findByIssuerAndSignature)) {
                    arrayList.add(findByIssuerAndSignature);
                }
                if (c(findByIssuerAndSignature, findByIssuerAndSignature)) {
                    return arrayList;
                }
                z8 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (c(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z8) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && ((a) obj).f9998a.equals(this.f9998a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9998a.hashCode();
    }
}
