package S6;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class a extends f {

    /* renamed from: c, reason: collision with root package name */
    private final Class f9750c;

    /* renamed from: d, reason: collision with root package name */
    private final e f9751d;

    /* renamed from: e, reason: collision with root package name */
    private final e f9752e;

    /* renamed from: f, reason: collision with root package name */
    private final e f9753f;

    /* renamed from: g, reason: collision with root package name */
    private final e f9754g;

    /* renamed from: h, reason: collision with root package name */
    private final c f9755h = c.b();

    /* renamed from: S6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0210a extends T6.c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f9756a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f9757b;

        C0210a(Object obj, Method method) {
            this.f9756a = obj;
            this.f9757b = method;
        }

        @Override // T6.c
        public List a(List list, String str) {
            try {
                return (List) this.f9757b.invoke(this.f9756a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e9) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e9.getMessage());
                sSLPeerUnverifiedException.initCause(e9);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0210a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* loaded from: classes5.dex */
    static final class b implements T6.e {

        /* renamed from: a, reason: collision with root package name */
        private final X509TrustManager f9758a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f9759b;

        b(X509TrustManager x509TrustManager, Method method) {
            this.f9759b = method;
            this.f9758a = x509TrustManager;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f9758a.equals(bVar.f9758a) && this.f9759b.equals(bVar.f9759b)) {
                return true;
            }
            return false;
        }

        @Override // T6.e
        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f9759b.invoke(this.f9758a, x509Certificate);
                if (trustAnchor == null) {
                    return null;
                }
                return trustAnchor.getTrustedCert();
            } catch (IllegalAccessException e8) {
                throw L6.c.a("unable to get issues and signature", e8);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return this.f9758a.hashCode() + (this.f9759b.hashCode() * 31);
        }
    }

    /* loaded from: classes5.dex */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Method f9760a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f9761b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f9762c;

        c(Method method, Method method2, Method method3) {
            this.f9760a = method;
            this.f9761b = method2;
            this.f9762c = method3;
        }

        static c b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new c(method3, method2, method);
        }

        Object a(String str) {
            Method method = this.f9760a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, null);
                    this.f9761b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        boolean c(Object obj) {
            if (obj != null) {
                try {
                    this.f9762c.invoke(obj, null);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    a(Class cls, e eVar, e eVar2, e eVar3, e eVar4) {
        this.f9750c = cls;
        this.f9751d = eVar;
        this.f9752e = eVar2;
        this.f9753f = eVar3;
        this.f9754g = eVar4;
    }

    private boolean r(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.n(str);
        }
    }

    private boolean s(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return r(str, cls, obj);
        }
    }

    public static f t() {
        Class<?> cls;
        e eVar;
        e eVar2;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            e eVar3 = new e(null, "setUseSessionTickets", Boolean.TYPE);
            e eVar4 = new e(null, "setHostname", String.class);
            if (u()) {
                eVar = new e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                eVar2 = new e(null, "setAlpnProtocols", byte[].class);
            } else {
                eVar = null;
                eVar2 = null;
            }
            return new a(cls2, eVar3, eVar4, eVar, eVar2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    private static boolean u() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // S6.f
    public T6.c c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0210a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // S6.f
    public T6.e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // S6.f
    public void f(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f9751d.e(sSLSocket, Boolean.TRUE);
            this.f9752e.e(sSLSocket, str);
        }
        e eVar = this.f9754g;
        if (eVar != null && eVar.g(sSLSocket)) {
            this.f9754g.f(sSLSocket, f.e(list));
        }
    }

    @Override // S6.f
    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i8) {
        try {
            socket.connect(inetSocketAddress, i8);
        } catch (AssertionError e8) {
            if (L6.c.w(e8)) {
                throw new IOException(e8);
            }
            throw e8;
        } catch (ClassCastException e9) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e9);
                throw iOException;
            }
            throw e9;
        } catch (SecurityException e10) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e10);
            throw iOException2;
        }
    }

    @Override // S6.f
    public String l(SSLSocket sSLSocket) {
        byte[] bArr;
        e eVar = this.f9753f;
        if (eVar == null || !eVar.g(sSLSocket) || (bArr = (byte[]) this.f9753f.f(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, L6.c.f5419j);
    }

    @Override // S6.f
    public Object m(String str) {
        return this.f9755h.a(str);
    }

    @Override // S6.f
    public boolean n(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return s(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.n(str);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw L6.c.a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e9) {
            e = e9;
            throw L6.c.a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e10) {
            e = e10;
            throw L6.c.a("unable to determine cleartext support", e);
        }
    }

    @Override // S6.f
    public void p(int i8, String str, Throwable th) {
        int min;
        int i9 = 5;
        if (i8 != 5) {
            i9 = 3;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str.indexOf(10, i10);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i10 + 4000);
                Log.println(i9, "OkHttp", str.substring(i10, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i10 = min;
                }
            }
            i10 = min + 1;
        }
    }

    @Override // S6.f
    public void q(String str, Object obj) {
        if (!this.f9755h.c(obj)) {
            p(5, str, null);
        }
    }
}
