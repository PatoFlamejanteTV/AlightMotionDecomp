package T6;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes5.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f10000a = new d();

    private d() {
    }

    public static List a(X509Certificate x509Certificate) {
        List b9 = b(x509Certificate, 7);
        List b10 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b9.size() + b10.size());
        arrayList.addAll(b9);
        arrayList.addAll(b10);
        return arrayList;
    }

    private static List b(X509Certificate x509Certificate, int i8) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i8 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean e(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator it = b(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (d(lowerCase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean f(String str, X509Certificate x509Certificate) {
        List b9 = b(x509Certificate, 7);
        int size = b9.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (str.equalsIgnoreCase((String) b9.get(i8))) {
                return true;
            }
        }
        return false;
    }

    public boolean c(String str, X509Certificate x509Certificate) {
        if (L6.c.D(str)) {
            return f(str, x509Certificate);
        }
        return e(str, x509Certificate);
    }

    public boolean d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length > 0 && str.lastIndexOf(46, length - 1) != -1) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
