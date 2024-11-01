package r5;

import R5.AbstractC1428l;
import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3927a extends SSLSocketFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final C0872a f38779b = new C0872a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f38780a;

    /* renamed from: r5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0872a {
        private C0872a() {
        }

        public /* synthetic */ C0872a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3927a() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.f38780a = sSLContext.getSocketFactory();
    }

    private final ArrayList a(SSLSocket sSLSocket, String str, ArrayList arrayList) {
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC3292y.h(supportedCipherSuites, "getSupportedCipherSuites(...)");
        if (AbstractC1428l.W(supportedCipherSuites, str)) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private final Socket b(Socket socket) {
        if (socket instanceof SSLSocket) {
            c((SSLSocket) socket);
        }
        return socket;
    }

    private final void c(SSLSocket sSLSocket) {
        ArrayList a9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 != 25 && i8 != 24) {
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            AbstractC3292y.h(supportedProtocols, "getSupportedProtocols(...)");
            if (AbstractC1428l.W(supportedProtocols, "TLSv1.3")) {
                arrayList.add("TLSv1.3");
                a9 = a(sSLSocket, "TLS_AES_128_GCM_SHA256", a(sSLSocket, "TLS_CHACHA20_POLY1305_SHA256", a(sSLSocket, "TLS_AES_256_GCM_SHA384", arrayList2)));
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
                sSLSocket.setEnabledCipherSuites((String[]) a9.toArray(new String[0]));
            }
        }
        arrayList.add("TLSv1.2");
        a9 = a(sSLSocket, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", a(sSLSocket, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", a(sSLSocket, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", arrayList2)));
        sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        sSLSocket.setEnabledCipherSuites((String[]) a9.toArray(new String[0]));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        Socket createSocket = this.f38780a.createSocket();
        AbstractC3292y.h(createSocket, "createSocket(...)");
        return b(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f38780a.getDefaultCipherSuites();
        AbstractC3292y.h(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f38780a.getSupportedCipherSuites();
        AbstractC3292y.h(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket s8, String host, int i8, boolean z8) {
        AbstractC3292y.i(s8, "s");
        AbstractC3292y.i(host, "host");
        Socket createSocket = this.f38780a.createSocket(s8, host, i8, z8);
        AbstractC3292y.h(createSocket, "createSocket(...)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i8) {
        AbstractC3292y.i(host, "host");
        Socket createSocket = this.f38780a.createSocket(host, i8);
        AbstractC3292y.h(createSocket, "createSocket(...)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i8, InetAddress localHost, int i9) {
        AbstractC3292y.i(host, "host");
        AbstractC3292y.i(localHost, "localHost");
        Socket createSocket = this.f38780a.createSocket(host, i8, localHost, i9);
        AbstractC3292y.h(createSocket, "createSocket(...)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int i8) {
        AbstractC3292y.i(host, "host");
        Socket createSocket = this.f38780a.createSocket(host, i8);
        AbstractC3292y.h(createSocket, "createSocket(...)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int i8, InetAddress localAddress, int i9) {
        AbstractC3292y.i(address, "address");
        AbstractC3292y.i(localAddress, "localAddress");
        Socket createSocket = this.f38780a.createSocket(address, i8, localAddress, i9);
        AbstractC3292y.h(createSocket, "createSocket(...)");
        return b(createSocket);
    }
}
