package S6;

import K6.u;
import K6.v;
import U6.C1449e;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final f f9776a = h();

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f9777b = Logger.getLogger(u.class.getName());

    public static List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            v vVar = (v) list.get(i8);
            if (vVar != v.HTTP_1_0) {
                arrayList.add(vVar.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] e(List list) {
        C1449e c1449e = new C1449e();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            v vVar = (v) list.get(i8);
            if (vVar != v.HTTP_1_0) {
                c1449e.writeByte(vVar.toString().length());
                c1449e.writeUtf8(vVar.toString());
            }
        }
        return c1449e.readByteArray();
    }

    private static f h() {
        f r8;
        f t8 = a.t();
        if (t8 != null) {
            return t8;
        }
        if (o() && (r8 = b.r()) != null) {
            return r8;
        }
        c r9 = c.r();
        if (r9 != null) {
            return r9;
        }
        f r10 = d.r();
        if (r10 != null) {
            return r10;
        }
        return new f();
    }

    public static f i() {
        return f9776a;
    }

    public static boolean o() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public T6.c c(X509TrustManager x509TrustManager) {
        return new T6.a(d(x509TrustManager));
    }

    public T6.e d(X509TrustManager x509TrustManager) {
        return new T6.b(x509TrustManager.getAcceptedIssuers());
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i8) {
        socket.connect(inetSocketAddress, i8);
    }

    public String j() {
        return "OkHttp";
    }

    public SSLContext k() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e8) {
            throw new IllegalStateException("No TLS provider", e8);
        }
    }

    public String l(SSLSocket sSLSocket) {
        return null;
    }

    public Object m(String str) {
        if (f9777b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean n(String str) {
        return true;
    }

    public void p(int i8, String str, Throwable th) {
        Level level;
        if (i8 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f9777b.log(level, str, th);
    }

    public void q(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        p(5, str, (Throwable) obj);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void f(SSLSocket sSLSocket, String str, List list) {
    }
}
