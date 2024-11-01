package Q4;

import J4.j;
import android.content.Context;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final a f8741g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final i f8742a;

    /* renamed from: b, reason: collision with root package name */
    private final d f8743b;

    /* renamed from: c, reason: collision with root package name */
    private final Q4.a f8744c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f8745d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f8746e;

    /* renamed from: f, reason: collision with root package name */
    private P4.c f8747f;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public c(i nsdListener, Context context) {
        AbstractC3292y.i(nsdListener, "nsdListener");
        AbstractC3292y.i(context, "context");
        this.f8742a = nsdListener;
        this.f8743b = new d(context, nsdListener, this);
        this.f8744c = new Q4.a(nsdListener, this);
    }

    private final void a() {
        try {
            Socket socket = this.f8745d;
            if (socket != null) {
                socket.close();
            }
            this.f8745d = null;
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    private final void b() {
        try {
            Socket socket = this.f8746e;
            if (socket != null) {
                socket.close();
            }
            this.f8746e = null;
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    private final void d(NsdServiceInfo nsdServiceInfo) {
        List hostAddresses;
        try {
            InetAddress host = nsdServiceInfo.getHost();
            if (Build.VERSION.SDK_INT >= 34) {
                hostAddresses = nsdServiceInfo.getHostAddresses();
                Iterator it = hostAddresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (inetAddress != null) {
                        host = inetAddress;
                        break;
                    }
                }
            }
            m(new Socket(host, nsdServiceInfo.getPort()));
            this.f8742a.z(nsdServiceInfo);
        } catch (ConnectException unused) {
            this.f8742a.c();
        } catch (IOException unused2) {
            this.f8742a.c();
        }
    }

    private final synchronized void n(Socket socket) {
        Socket socket2 = this.f8746e;
        if (socket2 != null && socket2.isConnected()) {
            try {
                Socket socket3 = this.f8746e;
                if (socket3 != null) {
                    socket3.close();
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        this.f8746e = socket;
    }

    public final void c() {
        NsdServiceInfo nsdServiceInfo;
        h m8 = j.f4395g.m();
        if (m8 != null) {
            nsdServiceInfo = m8.e();
        } else {
            nsdServiceInfo = null;
        }
        if (nsdServiceInfo != null) {
            d(nsdServiceInfo);
        }
    }

    public final P4.c e() {
        return this.f8747f;
    }

    public final Socket f() {
        return this.f8745d;
    }

    public final Socket g() {
        return this.f8746e;
    }

    public final Q4.a h() {
        return this.f8744c;
    }

    public final d i() {
        return this.f8743b;
    }

    public final boolean j() {
        Socket socket = this.f8745d;
        if (socket != null) {
            AbstractC3292y.f(socket);
            if (!socket.isClosed()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        Socket socket = this.f8746e;
        if (socket != null) {
            AbstractC3292y.f(socket);
            if (!socket.isClosed()) {
                return true;
            }
        }
        return false;
    }

    public final void l(P4.c cVar) {
        this.f8747f = cVar;
    }

    public final synchronized void m(Socket socket) {
        try {
            AbstractC3292y.i(socket, "socket");
            Socket socket2 = this.f8745d;
            if (socket2 != null) {
                AbstractC3292y.f(socket2);
                if (socket2.isConnected()) {
                    n(socket);
                }
            }
            this.f8745d = socket;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(boolean z8) {
        Socket socket = this.f8745d;
        if (socket != null) {
            AbstractC3292y.f(socket);
            if (!socket.isClosed()) {
                this.f8744c.g(z8);
                return;
            }
        }
        this.f8742a.r("Socket to write OK is null or closed");
    }

    public final void p() {
        Socket socket = this.f8745d;
        if (socket != null) {
            AbstractC3292y.f(socket);
            if (!socket.isClosed()) {
                this.f8744c.h(j.f4395g.n());
                return;
            }
        }
        this.f8742a.r("Socket to write ServiceName is null or closed");
    }

    public final void q(P4.c fti) {
        AbstractC3292y.i(fti, "fti");
        Socket socket = this.f8745d;
        if (socket != null) {
            AbstractC3292y.f(socket);
            if (!socket.isClosed()) {
                this.f8744c.i(fti);
                return;
            }
        }
        this.f8742a.r("Socket to write FTI is null or closed");
    }

    public final void r() {
        this.f8743b.p();
        b();
        a();
    }
}
