package V4;

import T4.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: w, reason: collision with root package name */
    private static b f10611w;

    /* renamed from: x, reason: collision with root package name */
    private static b f10612x;

    /* renamed from: y, reason: collision with root package name */
    private static b f10613y;

    /* renamed from: a, reason: collision with root package name */
    private int f10615a;

    /* renamed from: b, reason: collision with root package name */
    private e f10616b;

    /* renamed from: c, reason: collision with root package name */
    private d f10617c;

    /* renamed from: d, reason: collision with root package name */
    private String f10618d;

    /* renamed from: e, reason: collision with root package name */
    private final Process f10619e;

    /* renamed from: f, reason: collision with root package name */
    private final BufferedReader f10620f;

    /* renamed from: g, reason: collision with root package name */
    private final BufferedReader f10621g;

    /* renamed from: h, reason: collision with root package name */
    private final OutputStreamWriter f10622h;

    /* renamed from: i, reason: collision with root package name */
    private final List f10623i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10624j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f10625k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10626l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10627m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10628n;

    /* renamed from: o, reason: collision with root package name */
    private int f10629o;

    /* renamed from: p, reason: collision with root package name */
    private int f10630p;

    /* renamed from: q, reason: collision with root package name */
    private int f10631q;

    /* renamed from: r, reason: collision with root package name */
    private int f10632r;

    /* renamed from: s, reason: collision with root package name */
    private int f10633s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10634t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f10635u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f10636v;

    /* renamed from: z, reason: collision with root package name */
    private static String[] f10614z = {null, null};

    /* renamed from: A, reason: collision with root package name */
    public static d f10610A = d.NORMAL;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    try {
                        synchronized (b.this.f10623i) {
                            while (!b.this.f10624j && b.this.f10631q >= b.this.f10623i.size()) {
                                try {
                                    b bVar = b.this;
                                    bVar.f10626l = false;
                                    bVar.f10623i.wait();
                                } finally {
                                }
                            }
                        }
                        if (b.this.f10631q >= b.this.f10629o) {
                            while (b.this.f10630p != b.this.f10631q) {
                                T4.a.c("Waiting for read and write to catch up before cleanup.");
                            }
                            b.this.x();
                        }
                        if (b.this.f10631q < b.this.f10623i.size()) {
                            b bVar2 = b.this;
                            bVar2.f10626l = true;
                            V4.a aVar = (V4.a) bVar2.f10623i.get(b.this.f10631q);
                            aVar.l();
                            T4.a.c("Executing: " + aVar.g() + " with context: " + b.this.f10617c);
                            b.this.f10622h.write(aVar.g());
                            b.this.f10622h.flush();
                            b.this.f10622h.write("\necho F*D^W@#FGF " + b.this.f10632r + " $?\n");
                            b.this.f10622h.flush();
                            b.m(b.this);
                            b.v(b.this);
                        } else if (b.this.f10624j) {
                            b bVar3 = b.this;
                            bVar3.f10626l = false;
                            bVar3.f10622h.write("\nexit 0\n");
                            b.this.f10622h.flush();
                            T4.a.c("Closing shell");
                            b.this.f10631q = 0;
                            b bVar4 = b.this;
                            bVar4.C(bVar4.f10622h);
                            return;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        T4.a.d(e.getMessage(), a.c.ERROR, e);
                        b.this.f10631q = 0;
                        b bVar5 = b.this;
                        bVar5.C(bVar5.f10622h);
                        return;
                    } catch (InterruptedException e9) {
                        e = e9;
                        T4.a.d(e.getMessage(), a.c.ERROR, e);
                        b.this.f10631q = 0;
                        b bVar52 = b.this;
                        bVar52.C(bVar52.f10622h);
                        return;
                    }
                } finally {
                    b.this.f10631q = 0;
                    b bVar6 = b.this;
                    bVar6.C(bVar6.f10622h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V4.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0225b extends Thread {
        C0225b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (b.this.f10623i) {
                b.this.f10623i.notifyAll();
            }
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {
        c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:            r9.f10639a.f10619e.waitFor();        r9.f10639a.f10619e.destroy();     */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:            r9.f10639a.K(r1);        r4 = 0;     */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:            if (r1.f10594c <= r1.f10595d) goto L107;     */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0154, code lost:            if (r4 != 0) goto L86;     */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:            r4 = r4 + 1;        T4.a.c("Waiting for output to be processed. " + r1.f10595d + " Of " + r1.f10594c);     */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:            monitor-enter(r9);     */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x017b, code lost:            wait(com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);     */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:            monitor-exit(r9);     */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:            r5 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:            T4.a.c(r5.getMessage());     */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 470
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: V4.b.c.run():void");
        }
    }

    /* loaded from: classes5.dex */
    public enum d {
        NORMAL("normal"),
        SHELL("u:r:shell:s0"),
        SYSTEM_SERVER("u:r:system_server:s0"),
        SYSTEM_APP("u:r:system_app:s0"),
        PLATFORM_APP("u:r:platform_app:s0"),
        UNTRUSTED_APP("u:r:untrusted_app:s0"),
        RECOVERY("u:r:recovery:s0");


        /* renamed from: a, reason: collision with root package name */
        private String f10648a;

        d(String str) {
            this.f10648a = str;
        }

        public String b() {
            return this.f10648a;
        }
    }

    /* loaded from: classes5.dex */
    public enum e {
        NORMAL,
        ROOT,
        CUSTOM
    }

    /* loaded from: classes5.dex */
    protected static class f extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public int f10653a;

        /* renamed from: b, reason: collision with root package name */
        public b f10654b;

        /* synthetic */ f(b bVar, a aVar) {
            this(bVar);
        }

        private void a() {
            Field declaredField;
            try {
                Class<?> cls = this.f10654b.f10619e.getClass();
                try {
                    declaredField = cls.getDeclaredField("pid");
                } catch (NoSuchFieldException unused) {
                    declaredField = cls.getDeclaredField("id");
                }
                declaredField.setAccessible(true);
                int intValue = ((Integer) declaredField.get(this.f10654b.f10619e)).intValue();
                this.f10654b.f10622h.write("(echo -17 > /proc/" + intValue + "/oom_adj) &> /dev/null\n");
                this.f10654b.f10622h.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
                this.f10654b.f10622h.flush();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f10654b.f10622h.write("echo Started\n");
                this.f10654b.f10622h.flush();
                while (true) {
                    String readLine = this.f10654b.f10620f.readLine();
                    if (readLine != null) {
                        if (!"".equals(readLine)) {
                            if (!"Started".equals(readLine)) {
                                this.f10654b.f10618d = "unknown error occurred.";
                            } else {
                                this.f10653a = 1;
                                a();
                                return;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } catch (IOException e8) {
                this.f10653a = -42;
                if (e8.getMessage() == null) {
                    this.f10654b.f10618d = "RootAccess denied?.";
                } else {
                    this.f10654b.f10618d = e8.getMessage();
                }
            }
        }

        private f(b bVar) {
            this.f10653a = -911;
            this.f10654b = bVar;
        }
    }

    private b(String str, e eVar, d dVar, int i8) {
        this.f10615a = 25000;
        a aVar = null;
        this.f10616b = null;
        d dVar2 = d.NORMAL;
        this.f10617c = dVar2;
        this.f10618d = "";
        this.f10623i = new ArrayList();
        this.f10624j = false;
        this.f10625k = null;
        this.f10626l = false;
        this.f10627m = false;
        this.f10628n = false;
        this.f10629o = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
        this.f10630p = 0;
        this.f10631q = 0;
        this.f10632r = 0;
        this.f10633s = 0;
        this.f10634t = false;
        this.f10635u = new a();
        this.f10636v = new c();
        T4.a.c("Starting shell: " + str);
        T4.a.c("Context: " + dVar.b());
        T4.a.c("Timeout: " + i8);
        this.f10616b = eVar;
        this.f10615a = i8 <= 0 ? this.f10615a : i8;
        this.f10617c = dVar;
        if (dVar == dVar2) {
            this.f10619e = Runtime.getRuntime().exec(str);
        } else {
            String H8 = H(false);
            String H9 = H(true);
            if (I() && H8 != null && H9 != null && H8.endsWith("SUPERSU") && Integer.valueOf(H9).intValue() >= 190) {
                str = str + " --context " + this.f10617c.b();
            } else {
                T4.a.c("Su binary --context switch not supported!");
                T4.a.c("Su binary display version: " + H8);
                T4.a.c("Su binary internal version: " + H9);
                T4.a.c("SELinuxEnforcing: " + I());
            }
            this.f10619e = Runtime.getRuntime().exec(str);
        }
        this.f10620f = new BufferedReader(new InputStreamReader(this.f10619e.getInputStream(), C.UTF8_NAME));
        this.f10621g = new BufferedReader(new InputStreamReader(this.f10619e.getErrorStream(), C.UTF8_NAME));
        this.f10622h = new OutputStreamWriter(this.f10619e.getOutputStream(), C.UTF8_NAME);
        f fVar = new f(this, aVar);
        fVar.start();
        try {
            fVar.join(this.f10615a);
            int i9 = fVar.f10653a;
            if (i9 == -911) {
                try {
                    this.f10619e.destroy();
                } catch (Exception unused) {
                }
                B(this.f10620f);
                B(this.f10621g);
                C(this.f10622h);
                throw new TimeoutException(this.f10618d);
            }
            if (i9 != -42) {
                Thread thread = new Thread(this.f10635u, "Shell Input");
                thread.setPriority(5);
                thread.start();
                Thread thread2 = new Thread(this.f10636v, "Shell Output");
                thread2.setPriority(5);
                thread2.start();
                return;
            }
            try {
                this.f10619e.destroy();
            } catch (Exception unused2) {
            }
            B(this.f10620f);
            B(this.f10621g);
            C(this.f10622h);
            throw new U4.a("Root Access Denied");
        } catch (InterruptedException unused3) {
            fVar.interrupt();
            Thread.currentThread().interrupt();
            throw new TimeoutException();
        }
    }

    public static void A() {
        T4.a.c("Request to close custom shell!");
        b bVar = f10613y;
        if (bVar == null) {
            return;
        }
        bVar.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void D() {
        T4.a.c("Request to close root shell!");
        b bVar = f10611w;
        if (bVar == null) {
            return;
        }
        bVar.y();
    }

    public static void E() {
        T4.a.c("Request to close normal shell!");
        b bVar = f10612x;
        if (bVar == null) {
            return;
        }
        bVar.y();
    }

    private synchronized String H(boolean z8) {
        int i8;
        String str;
        i8 = !z8 ? 1 : 0;
        try {
            if (f10614z[i8] == null) {
                String str2 = null;
                try {
                    Runtime runtime = Runtime.getRuntime();
                    if (z8) {
                        str = "su -V";
                    } else {
                        str = "su -v";
                    }
                    Process exec = runtime.exec(str, (String[]) null);
                    exec.waitFor();
                    ArrayList<String> arrayList = new ArrayList();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                arrayList.add(readLine);
                            }
                        } catch (IOException unused) {
                        }
                        try {
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                    bufferedReader.close();
                    exec.destroy();
                    for (String str3 : arrayList) {
                        if (!z8) {
                            if (str3.contains(".")) {
                            }
                        } else {
                            try {
                            } catch (NumberFormatException unused3) {
                                continue;
                            }
                            if (Integer.parseInt(str3) > 0) {
                            }
                        }
                        str2 = str3;
                    }
                    f10614z[i8] = str2;
                } catch (IOException e8) {
                    e8.printStackTrace();
                    return null;
                } catch (InterruptedException e9) {
                    e9.printStackTrace();
                    return null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10614z[i8];
    }

    public static b L() {
        return M(0, 3);
    }

    public static b M(int i8, int i9) {
        return N(i8, f10610A, i9);
    }

    public static b N(int i8, d dVar, int i9) {
        int i10;
        b bVar = f10611w;
        if (bVar == null) {
            T4.a.c("Starting Root Shell!");
            int i11 = 0;
            while (f10611w == null) {
                try {
                    T4.a.c("Trying to open Root Shell, attempt #" + i11);
                    f10611w = new b(DownloadCommon.DOWNLOAD_REPORT_SUCCESS, e.ROOT, dVar, i8);
                } catch (U4.a e8) {
                    i10 = i11 + 1;
                    if (i11 >= i9) {
                        T4.a.c("RootDeniedException, could not start shell");
                        throw e8;
                    }
                    i11 = i10;
                } catch (IOException e9) {
                    i10 = i11 + 1;
                    if (i11 >= i9) {
                        T4.a.c("IOException, could not start shell");
                        throw e9;
                    }
                    i11 = i10;
                } catch (TimeoutException e10) {
                    i10 = i11 + 1;
                    if (i11 >= i9) {
                        T4.a.c("TimeoutException, could not start shell");
                        throw e10;
                    }
                    i11 = i10;
                }
            }
        } else if (bVar.f10617c != dVar) {
            try {
                T4.a.c("Context is different than open shell, switching context... " + f10611w.f10617c + " VS " + dVar);
                f10611w.O(dVar);
            } catch (U4.a e11) {
                if (i9 <= 0) {
                    T4.a.c("RootDeniedException, could not switch context!");
                    throw e11;
                }
            } catch (IOException e12) {
                if (i9 <= 0) {
                    T4.a.c("IOException, could not switch context!");
                    throw e12;
                }
            } catch (TimeoutException e13) {
                if (i9 <= 0) {
                    T4.a.c("TimeoutException, could not switch context!");
                    throw e13;
                }
            }
        } else {
            T4.a.c("Using Existing Root Shell!");
        }
        return f10611w;
    }

    static /* synthetic */ int e(b bVar) {
        int i8 = bVar.f10633s;
        bVar.f10633s = i8 + 1;
        return i8;
    }

    static /* synthetic */ int m(b bVar) {
        int i8 = bVar.f10631q;
        bVar.f10631q = i8 + 1;
        return i8;
    }

    static /* synthetic */ int q(b bVar) {
        int i8 = bVar.f10630p;
        bVar.f10630p = i8 + 1;
        return i8;
    }

    static /* synthetic */ int v(b bVar) {
        int i8 = bVar.f10632r;
        bVar.f10632r = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f10634t = true;
        int i8 = this.f10629o;
        int abs = Math.abs(i8 - (i8 / 4));
        T4.a.c("Cleaning up: " + abs);
        for (int i9 = 0; i9 < abs; i9++) {
            this.f10623i.remove(0);
        }
        this.f10630p = this.f10623i.size() - 1;
        this.f10631q = this.f10623i.size() - 1;
        this.f10634t = false;
    }

    public static void z() {
        T4.a.c("Request to close all shells!");
        E();
        D();
        A();
    }

    public int F(V4.a aVar) {
        return this.f10623i.indexOf(aVar);
    }

    public String G(V4.a aVar) {
        return "Command is in position " + F(aVar) + " currently executing command at position " + this.f10631q + " and the number of commands is " + this.f10623i.size();
    }

    public synchronized boolean I() {
        boolean z8;
        try {
            if (this.f10625k == null) {
                Boolean bool = null;
                if (new File("/sys/fs/selinux/enforce").exists()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream("/sys/fs/selinux/enforce");
                        try {
                            if (fileInputStream.read() == 49) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            bool = Boolean.valueOf(z8);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (Exception unused) {
                    }
                }
                if (bool == null) {
                    bool = true;
                }
                this.f10625k = bool;
            }
        } finally {
        }
        return this.f10625k.booleanValue();
    }

    protected void J() {
        new C0225b().start();
    }

    public void K(V4.a aVar) {
        String readLine;
        while (this.f10621g.ready() && aVar != null && (readLine = this.f10621g.readLine()) != null) {
            try {
                aVar.j(aVar.f10605n, readLine);
            } catch (Exception e8) {
                T4.a.d(e8.getMessage(), a.c.ERROR, e8);
                return;
            }
        }
    }

    public b O(d dVar) {
        if (this.f10616b == e.ROOT) {
            try {
                D();
            } catch (Exception unused) {
                T4.a.c("Problem closing shell while trying to switch context...");
            }
            return N(this.f10615a, dVar, 3);
        }
        T4.a.c("Can only switch context on a root shell!");
        return this;
    }

    public V4.a w(V4.a aVar) {
        if (!this.f10624j) {
            if (aVar.f10598g) {
                throw new IllegalStateException("This command has already been executed. (Don't re-use command instances.)");
            }
            do {
            } while (this.f10634t);
            this.f10623i.add(aVar);
            J();
            return aVar;
        }
        throw new IllegalStateException("Unable to add commands to a closed shell");
    }

    public void y() {
        T4.a.c("Request to close shell!");
        int i8 = 0;
        while (this.f10626l) {
            T4.a.c("Waiting on shell to finish executing before closing...");
            i8++;
            if (i8 > 10000) {
                break;
            }
        }
        synchronized (this.f10623i) {
            this.f10624j = true;
            J();
        }
        T4.a.c("Shell Closed!");
        if (this == f10611w) {
            f10611w = null;
        } else if (this == f10612x) {
            f10612x = null;
        } else if (this == f10613y) {
            f10613y = null;
        }
    }
}
