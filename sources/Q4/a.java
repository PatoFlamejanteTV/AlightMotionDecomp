package Q4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private i f8729a;

    /* renamed from: b, reason: collision with root package name */
    private final Q4.c f8730b;

    /* renamed from: c, reason: collision with root package name */
    private Thread f8731c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class RunnableC0182a implements Runnable {
        public RunnableC0182a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.d("FileReceived")) {
                a.this.c().w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final File f8733a;

        public b(File file) {
            this.f8733a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f8733a != null) {
                    a.this.c().v(this.f8733a);
                    byte[] bArr = new byte[8192];
                    FileInputStream fileInputStream = new FileInputStream(this.f8733a);
                    Socket g8 = a.this.f8730b.g();
                    AbstractC3292y.f(g8);
                    OutputStream outputStream = g8.getOutputStream();
                    int available = fileInputStream.available();
                    long j8 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 8192);
                        if (read > 0) {
                            outputStream.write(bArr, 0, read);
                            i8 += read;
                            if (available > 0) {
                                int i10 = (int) ((i8 * 100.0d) / available);
                                if (i10 <= i9 + 5) {
                                    if (System.currentTimeMillis() > 1000 + j8 && i10 > i9) {
                                    }
                                }
                                j8 = System.currentTimeMillis();
                                a.this.c().q(i10);
                                i9 = i10;
                            }
                        } else {
                            a.this.c().q(100);
                            fileInputStream.close();
                            outputStream.flush();
                            a.this.c().m();
                            return;
                        }
                    }
                }
            } catch (Exception e8) {
                if (e8.getMessage() != null) {
                    i c8 = a.this.c();
                    String message = e8.getMessage();
                    AbstractC3292y.f(message);
                    c8.x(message);
                    return;
                }
                a.this.c().x("Exception");
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f8735a;

        public c(boolean z8) {
            this.f8735a = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (this.f8735a) {
                str = "OK";
            } else {
                str = "KO";
            }
            if (a.this.d(str)) {
                if (this.f8735a) {
                    a.this.f8730b.i().n();
                } else {
                    a.this.f8730b.i().l();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f8737a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f8738b;

        public d(a aVar, String serviceName) {
            AbstractC3292y.i(serviceName, "serviceName");
            this.f8738b = aVar;
            this.f8737a = serviceName;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8738b.d("resolveService:" + this.f8737a)) {
                this.f8738b.f8730b.i().l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final P4.c f8739a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f8740b;

        public e(a aVar, P4.c ftiToSend) {
            AbstractC3292y.i(ftiToSend, "ftiToSend");
            this.f8740b = aVar;
            this.f8739a = ftiToSend;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8740b.d(this.f8739a.i())) {
                this.f8740b.c().n(this.f8739a);
            }
        }
    }

    public a(i nsdListener, Q4.c nsdConnectionManager) {
        AbstractC3292y.i(nsdListener, "nsdListener");
        AbstractC3292y.i(nsdConnectionManager, "nsdConnectionManager");
        this.f8729a = nsdListener;
        this.f8730b = nsdConnectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(String str) {
        try {
            if (this.f8730b.f() == null) {
                this.f8729a.r("Socket is closed");
                return false;
            }
            Socket f8 = this.f8730b.f();
            AbstractC3292y.f(f8);
            if (f8.isClosed()) {
                this.f8729a.r("Socket is closed");
                return false;
            }
            Socket f9 = this.f8730b.f();
            AbstractC3292y.f(f9);
            DataOutputStream dataOutputStream = new DataOutputStream(f9.getOutputStream());
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            return true;
        } catch (UnknownHostException e8) {
            e8.printStackTrace();
            this.f8729a.r("Unknown Host");
            return false;
        } catch (IOException e9) {
            e9.printStackTrace();
            this.f8729a.r("I/O Exception");
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f8729a.r("Error3");
            return false;
        }
    }

    public final i c() {
        return this.f8729a;
    }

    public final void e() {
        new Thread(new RunnableC0182a()).start();
    }

    public final void f(File file) {
        AbstractC3292y.i(file, "file");
        Thread thread = new Thread(new b(file));
        this.f8731c = thread;
        AbstractC3292y.f(thread);
        thread.start();
    }

    public final void g(boolean z8) {
        new Thread(new c(z8)).start();
    }

    public final void h(String serviceName) {
        AbstractC3292y.i(serviceName, "serviceName");
        new Thread(new d(this, serviceName)).start();
    }

    public final void i(P4.c ftiToSend) {
        AbstractC3292y.i(ftiToSend, "ftiToSend");
        new Thread(new e(this, ftiToSend)).start();
    }
}
