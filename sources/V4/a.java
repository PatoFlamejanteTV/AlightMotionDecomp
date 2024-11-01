package V4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: i, reason: collision with root package name */
    String[] f10600i;

    /* renamed from: n, reason: collision with root package name */
    int f10605n;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f10592a = false;

    /* renamed from: b, reason: collision with root package name */
    protected Context f10593b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f10594c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f10595d = 0;

    /* renamed from: e, reason: collision with root package name */
    c f10596e = null;

    /* renamed from: f, reason: collision with root package name */
    Handler f10597f = null;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f10598g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f10599h = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f10601j = false;

    /* renamed from: k, reason: collision with root package name */
    boolean f10602k = false;

    /* renamed from: l, reason: collision with root package name */
    boolean f10603l = true;

    /* renamed from: m, reason: collision with root package name */
    int f10604m = -1;

    /* renamed from: o, reason: collision with root package name */
    int f10606o = T4.a.f9990b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.getData().getInt("action");
            String string = message.getData().getString(MimeTypes.BASE_TYPE_TEXT);
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        a aVar = a.this;
                        aVar.d(aVar.f10605n, string);
                        return;
                    }
                    return;
                }
                a aVar2 = a.this;
                aVar2.a(aVar2.f10605n, aVar2.f10604m);
                return;
            }
            a aVar3 = a.this;
            aVar3.c(aVar3.f10605n, string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final a f10608a;

        public c(a aVar) {
            this.f10608a = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a aVar = this.f10608a;
            if (aVar.f10606o > 0) {
                synchronized (aVar) {
                    try {
                        T4.a.c("Command " + this.f10608a.f10605n + " is waiting for: " + this.f10608a.f10606o);
                        a aVar2 = this.f10608a;
                        aVar2.wait((long) aVar2.f10606o);
                    } catch (InterruptedException e8) {
                        T4.a.c("Exception: " + e8);
                    }
                    if (!this.f10608a.i()) {
                        T4.a.c("Timeout Exception has occurred for command: " + this.f10608a.f10605n + ".");
                        a.this.m("Timeout Exception");
                    }
                }
            }
        }
    }

    public a(int i8, boolean z8, String... strArr) {
        this.f10600i = new String[0];
        this.f10605n = 0;
        this.f10600i = strArr;
        this.f10605n = i8;
        e(z8);
    }

    private void e(boolean z8) {
        this.f10603l = z8;
        if (Looper.myLooper() != null && z8) {
            T4.a.c("CommandHandler created");
            this.f10597f = new b();
        } else {
            T4.a.c("CommandHandler not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        if (!this.f10602k) {
            synchronized (this) {
                try {
                    Handler handler = this.f10597f;
                    if (handler != null && this.f10603l) {
                        Message obtainMessage = handler.obtainMessage();
                        Bundle bundle = new Bundle();
                        bundle.putInt("action", 2);
                        obtainMessage.setData(bundle);
                        this.f10597f.sendMessage(obtainMessage);
                    } else {
                        a(this.f10605n, this.f10604m);
                    }
                    T4.a.c("Command " + this.f10605n + " finished.");
                    f();
                } finally {
                }
            }
        }
    }

    public void c(int i8, String str) {
        T4.a.e("Command", "ID: " + i8 + ", " + str);
        this.f10595d = this.f10595d + 1;
    }

    protected final void f() {
        this.f10599h = false;
        this.f10601j = true;
        notifyAll();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < this.f10600i.length; i8++) {
            if (i8 > 0) {
                sb.append('\n');
            }
            sb.append(this.f10600i[i8]);
        }
        return sb.toString();
    }

    public final boolean h() {
        return this.f10599h;
    }

    public final boolean i() {
        return this.f10601j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i8, String str) {
        this.f10594c++;
        Handler handler = this.f10597f;
        if (handler != null && this.f10603l) {
            Message obtainMessage = handler.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putInt("action", 1);
            bundle.putString(MimeTypes.BASE_TYPE_TEXT, str);
            obtainMessage.setData(bundle);
            this.f10597f.sendMessage(obtainMessage);
            return;
        }
        c(i8, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i8) {
        synchronized (this) {
            this.f10604m = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        this.f10598g = true;
        c cVar = new c(this);
        this.f10596e = cVar;
        cVar.setPriority(1);
        this.f10596e.start();
        this.f10599h = true;
    }

    protected final void m(String str) {
        try {
            V4.b.z();
            T4.a.c("Terminating all shells.");
            n(str);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(String str) {
        synchronized (this) {
            try {
                Handler handler = this.f10597f;
                if (handler != null && this.f10603l) {
                    Message obtainMessage = handler.obtainMessage();
                    Bundle bundle = new Bundle();
                    bundle.putInt("action", 3);
                    bundle.putString(MimeTypes.BASE_TYPE_TEXT, str);
                    obtainMessage.setData(bundle);
                    this.f10597f.sendMessage(obtainMessage);
                } else {
                    d(this.f10605n, str);
                }
                T4.a.c("Command " + this.f10605n + " did not finish because it was terminated. Termination reason: " + str);
                k(-1);
                this.f10602k = true;
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i8, int i9) {
    }

    public void d(int i8, String str) {
    }
}
