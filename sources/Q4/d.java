package Q4;

import android.content.Context;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8748a;

    /* renamed from: b, reason: collision with root package name */
    private final i f8749b;

    /* renamed from: c, reason: collision with root package name */
    private final Q4.c f8750c;

    /* renamed from: d, reason: collision with root package name */
    private int f8751d;

    /* renamed from: e, reason: collision with root package name */
    private ServerSocket f8752e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f8753f;

    /* renamed from: g, reason: collision with root package name */
    private Thread f8754g;

    /* renamed from: h, reason: collision with root package name */
    private P4.c f8755h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f8750c.f() == null) {
                    d.this.f8749b.b();
                    return;
                }
                Socket f8 = d.this.f8750c.f();
                AbstractC3292y.f(f8);
                if (f8.isClosed()) {
                    d.this.f8749b.b();
                    return;
                }
                while (true) {
                    Socket f9 = d.this.f8750c.f();
                    AbstractC3292y.f(f9);
                    String readUTF = new DataInputStream(f9.getInputStream()).readUTF();
                    if (readUTF != null) {
                        if (n.s(readUTF, "OK", true)) {
                            if (d.this.f8750c.e() != null) {
                                i iVar = d.this.f8749b;
                                P4.c e8 = d.this.f8750c.e();
                                AbstractC3292y.f(e8);
                                iVar.l(e8);
                            }
                        } else if (n.s(readUTF, "KO", true)) {
                            d.this.f8749b.i();
                        } else if (n.s(readUTF, "FileReceived", true)) {
                            d.this.f8749b.s();
                        } else if (n.B(readUTF, "resolveService:", false, 2, null)) {
                            String substring = readUTF.substring(15);
                            AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
                            d.this.f8749b.t(substring);
                        } else {
                            d.this.f8755h = new P4.c();
                            P4.c cVar = d.this.f8755h;
                            AbstractC3292y.f(cVar);
                            cVar.c(readUTF);
                            i iVar2 = d.this.f8749b;
                            P4.c cVar2 = d.this.f8755h;
                            AbstractC3292y.f(cVar2);
                            iVar2.h(cVar2);
                        }
                    } else {
                        d.this.f8749b.b();
                    }
                }
            } catch (EOFException unused) {
                d.this.f8749b.k();
            } catch (IOException unused2) {
                d.this.f8749b.b();
            } catch (Exception unused3) {
                d.this.f8749b.b();
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.j();
        }
    }

    /* loaded from: classes5.dex */
    public final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d.this.f8752e = new ServerSocket(0);
                d dVar = d.this;
                ServerSocket serverSocket = dVar.f8752e;
                AbstractC3292y.f(serverSocket);
                dVar.k(serverSocket.getLocalPort());
                d.this.f8749b.f(d.this.i());
                while (true) {
                    Thread thread = d.this.f8753f;
                    AbstractC3292y.f(thread);
                    if (!thread.isInterrupted()) {
                        ServerSocket serverSocket2 = d.this.f8752e;
                        AbstractC3292y.f(serverSocket2);
                        Socket socketTmp = serverSocket2.accept();
                        Q4.c cVar = d.this.f8750c;
                        AbstractC3292y.h(socketTmp, "socketTmp");
                        cVar.m(socketTmp);
                        d.this.f8749b.d(socketTmp.getRemoteSocketAddress().toString());
                    } else {
                        return;
                    }
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public d(Context context, i nsdListener, Q4.c nsdConnectionManager) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(nsdListener, "nsdListener");
        AbstractC3292y.i(nsdConnectionManager, "nsdConnectionManager");
        this.f8748a = context;
        this.f8749b = nsdListener;
        this.f8750c = nsdConnectionManager;
        this.f8751d = -1;
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        int read;
        long j8;
        try {
            File f8 = new S4.f().f(this.f8748a);
            P4.c cVar = this.f8755h;
            AbstractC3292y.f(cVar);
            if (cVar.e() != null) {
                P4.c cVar2 = this.f8755h;
                AbstractC3292y.f(cVar2);
                String e8 = cVar2.e();
                AbstractC3292y.f(e8);
                File file = new File(f8, e8);
                Socket g8 = this.f8750c.g();
                AbstractC3292y.f(g8);
                InputStream inputStream = g8.getInputStream();
                if (inputStream != null) {
                    byte[] bArr = new byte[8192];
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    P4.c cVar3 = this.f8755h;
                    AbstractC3292y.f(cVar3);
                    long h8 = cVar3.h();
                    long j9 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    for (int i10 = 8192; i8 < h8 && (read = inputStream.read(bArr, 0, i10)) > 0; i10 = 8192) {
                        fileOutputStream.write(bArr, 0, read);
                        i8 += read;
                        byte[] bArr2 = bArr;
                        int i11 = (int) ((i8 * 100.0d) / h8);
                        if (i11 <= i9 + 5) {
                            j8 = h8;
                            if (System.currentTimeMillis() > 1000 + j9 && i11 > i9) {
                            }
                            bArr = bArr2;
                            h8 = j8;
                        } else {
                            j8 = h8;
                        }
                        j9 = System.currentTimeMillis();
                        this.f8749b.p(i11);
                        i9 = i11;
                        bArr = bArr2;
                        h8 = j8;
                    }
                    this.f8749b.p(100);
                    fileOutputStream.close();
                    String e9 = S4.d.f9430a.e(file.getAbsolutePath());
                    if (e9 != null) {
                        P4.c cVar4 = this.f8755h;
                        AbstractC3292y.f(cVar4);
                        if (n.s(e9, cVar4.g(), true)) {
                            i iVar = this.f8749b;
                            P4.c cVar5 = this.f8755h;
                            AbstractC3292y.f(cVar5);
                            String e10 = cVar5.e();
                            AbstractC3292y.f(e10);
                            iVar.y(e10, "File Transfer is correct!");
                            return;
                        }
                    }
                    this.f8749b.o("ERROR: File hashes do not macth!");
                    return;
                }
                this.f8749b.o("ERROR: cant create output file");
            }
        } catch (Exception e11) {
            if (e11.getMessage() != null) {
                i iVar2 = this.f8749b;
                String message = e11.getMessage();
                AbstractC3292y.f(message);
                iVar2.o(message);
                return;
            }
            this.f8749b.o("Exception");
        }
    }

    private final void o() {
        Thread thread = new Thread(new c());
        this.f8753f = thread;
        AbstractC3292y.f(thread);
        thread.start();
    }

    public final int i() {
        return this.f8751d;
    }

    public final void k(int i8) {
        this.f8751d = i8;
    }

    public final void l() {
        Thread thread = this.f8754g;
        if (thread != null) {
            AbstractC3292y.f(thread);
            if (thread.isAlive()) {
                return;
            }
        }
        Thread thread2 = new Thread(new a());
        this.f8754g = thread2;
        AbstractC3292y.f(thread2);
        thread2.start();
    }

    public final void m(P4.c cVar) {
        this.f8750c.l(cVar);
        l();
    }

    public final void n() {
        new Thread(new b()).start();
    }

    public final void p() {
        Thread thread = this.f8753f;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            ServerSocket serverSocket = this.f8752e;
            if (serverSocket != null) {
                serverSocket.close();
            }
            this.f8752e = null;
        } catch (IOException unused) {
        }
    }
}
