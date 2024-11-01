package S6;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

/* loaded from: classes5.dex */
public class b extends f {
    private b() {
    }

    public static f r() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Provider s() {
        return new OpenSSLProvider();
    }

    @Override // S6.f
    public void f(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) f.b(list).toArray(new String[0]));
            return;
        }
        super.f(sSLSocket, str, list);
    }

    @Override // S6.f
    public SSLContext k() {
        try {
            return SSLContext.getInstance("TLS", s());
        } catch (NoSuchAlgorithmException e8) {
            throw new IllegalStateException("No TLS provider", e8);
        }
    }

    @Override // S6.f
    public String l(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.l(sSLSocket);
    }
}
