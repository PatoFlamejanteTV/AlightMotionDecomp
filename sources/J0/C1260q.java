package J0;

import J0.B;
import M0.F;
import M0.G;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.AbstractC3628n;
import q0.C3626l;
import q0.InterfaceC3625k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: J0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1260q {

    /* renamed from: t, reason: collision with root package name */
    static final FilenameFilter f3934t = new FilenameFilter() { // from class: J0.p
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean K8;
            K8 = C1260q.K(file, str);
            return K8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f3935a;

    /* renamed from: b, reason: collision with root package name */
    private final D f3936b;

    /* renamed from: c, reason: collision with root package name */
    private final C1267y f3937c;

    /* renamed from: d, reason: collision with root package name */
    private final L0.m f3938d;

    /* renamed from: e, reason: collision with root package name */
    private final K0.g f3939e;

    /* renamed from: f, reason: collision with root package name */
    private final I f3940f;

    /* renamed from: g, reason: collision with root package name */
    private final P0.g f3941g;

    /* renamed from: h, reason: collision with root package name */
    private final C1245b f3942h;

    /* renamed from: i, reason: collision with root package name */
    private final L0.e f3943i;

    /* renamed from: j, reason: collision with root package name */
    private final G0.a f3944j;

    /* renamed from: k, reason: collision with root package name */
    private final H0.a f3945k;

    /* renamed from: l, reason: collision with root package name */
    private final C1257n f3946l;

    /* renamed from: m, reason: collision with root package name */
    private final Z f3947m;

    /* renamed from: n, reason: collision with root package name */
    private B f3948n;

    /* renamed from: o, reason: collision with root package name */
    private R0.j f3949o = null;

    /* renamed from: p, reason: collision with root package name */
    final C3626l f3950p = new C3626l();

    /* renamed from: q, reason: collision with root package name */
    final C3626l f3951q = new C3626l();

    /* renamed from: r, reason: collision with root package name */
    final C3626l f3952r = new C3626l();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f3953s = new AtomicBoolean(false);

    /* renamed from: J0.q$a */
    /* loaded from: classes3.dex */
    class a implements B.a {
        a() {
        }

        @Override // J0.B.a
        public void a(R0.j jVar, Thread thread, Throwable th) {
            C1260q.this.G(jVar, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.q$b */
    /* loaded from: classes3.dex */
    public class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f3955a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f3956b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f3957c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ R0.j f3958d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f3959e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J0.q$b$a */
        /* loaded from: classes3.dex */
        public class a implements InterfaceC3625k {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f3961a;

            a(String str) {
                this.f3961a = str;
            }

            @Override // q0.InterfaceC3625k
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task a(R0.d dVar) {
                String str = null;
                if (dVar != null) {
                    Task N8 = C1260q.this.N();
                    Z z8 = C1260q.this.f3947m;
                    K0.e eVar = C1260q.this.f3939e.f4554a;
                    if (b.this.f3959e) {
                        str = this.f3961a;
                    }
                    return AbstractC3628n.g(N8, z8.z(eVar, str));
                }
                G0.g.f().k("Received null app settings, cannot send reports at crash time.");
                return AbstractC3628n.e(null);
            }
        }

        b(long j8, Throwable th, Thread thread, R0.j jVar, boolean z8) {
            this.f3955a = j8;
            this.f3956b = th;
            this.f3957c = thread;
            this.f3958d = jVar;
            this.f3959e = z8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            long E8 = C1260q.E(this.f3955a);
            String A8 = C1260q.this.A();
            if (A8 == null) {
                G0.g.f().d("Tried to write a fatal exception while no session was open.");
                return AbstractC3628n.e(null);
            }
            C1260q.this.f3937c.a();
            C1260q.this.f3947m.v(this.f3956b, this.f3957c, A8, E8);
            C1260q.this.v(this.f3955a);
            C1260q.this.s(this.f3958d);
            C1260q.this.u(new C1252i().c(), Boolean.valueOf(this.f3959e));
            if (!C1260q.this.f3936b.d()) {
                return AbstractC3628n.e(null);
            }
            return this.f3958d.a().o(C1260q.this.f3939e.f4554a, new a(A8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.q$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC3625k {
        c() {
        }

        @Override // q0.InterfaceC3625k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Void r12) {
            return AbstractC3628n.e(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.q$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC3625k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f3964a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J0.q$d$a */
        /* loaded from: classes3.dex */
        public class a implements InterfaceC3625k {
            a() {
            }

            @Override // q0.InterfaceC3625k
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task a(R0.d dVar) {
                if (dVar != null) {
                    C1260q.this.N();
                    C1260q.this.f3947m.y(C1260q.this.f3939e.f4554a);
                    C1260q.this.f3952r.e(null);
                    return AbstractC3628n.e(null);
                }
                G0.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                return AbstractC3628n.e(null);
            }
        }

        d(Task task) {
            this.f3964a = task;
        }

        @Override // q0.InterfaceC3625k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Boolean bool) {
            if (!bool.booleanValue()) {
                G0.g.f().i("Deleting cached crash reports...");
                C1260q.q(C1260q.this.L());
                C1260q.this.f3947m.x();
                C1260q.this.f3952r.e(null);
                return AbstractC3628n.e(null);
            }
            G0.g.f().b("Sending cached crash reports...");
            C1260q.this.f3936b.c(bool.booleanValue());
            return this.f3964a.o(C1260q.this.f3939e.f4554a, new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.q$e */
    /* loaded from: classes3.dex */
    public class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f3967a;

        e(long j8) {
            this.f3967a = j8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong(CampaignEx.JSON_KEY_TIMESTAMP, this.f3967a);
            C1260q.this.f3945k.a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1260q(Context context, I i8, D d8, P0.g gVar, C1267y c1267y, C1245b c1245b, L0.m mVar, L0.e eVar, Z z8, G0.a aVar, H0.a aVar2, C1257n c1257n, K0.g gVar2) {
        this.f3935a = context;
        this.f3940f = i8;
        this.f3936b = d8;
        this.f3941g = gVar;
        this.f3937c = c1267y;
        this.f3942h = c1245b;
        this.f3938d = mVar;
        this.f3943i = eVar;
        this.f3944j = aVar;
        this.f3945k = aVar2;
        this.f3946l = c1257n;
        this.f3947m = z8;
        this.f3939e = gVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A() {
        SortedSet r8 = this.f3947m.r();
        if (!r8.isEmpty()) {
            return (String) r8.first();
        }
        return null;
    }

    private static long B() {
        return E(System.currentTimeMillis());
    }

    static List C(G0.h hVar, String str, P0.g gVar, byte[] bArr) {
        File q8 = gVar.q(str, "user-data");
        File q9 = gVar.q(str, "keys");
        File q10 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1251h("logs_file", "logs", bArr));
        arrayList.add(new G("crash_meta_file", TtmlNode.TAG_METADATA, hVar.g()));
        arrayList.add(new G("session_meta_file", "session", hVar.f()));
        arrayList.add(new G("app_meta_file", MBridgeConstans.DYNAMIC_VIEW_WX_APP, hVar.a()));
        arrayList.add(new G("device_meta_file", "device", hVar.c()));
        arrayList.add(new G("os_meta_file", "os", hVar.b()));
        arrayList.add(P(hVar));
        arrayList.add(new G("user_meta_file", "user", q8));
        arrayList.add(new G("keys_file", "keys", q9));
        arrayList.add(new G("rollouts_file", "rollouts", q10));
        return arrayList;
    }

    private InputStream D(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            G0.g.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream == null) {
            G0.g.f().g("No version control information found");
            return null;
        }
        return resourceAsStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long E(long j8) {
        return j8 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str) {
        u(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean K(File file, String str) {
        return str.startsWith(".ae");
    }

    private Task M(long j8) {
        if (z()) {
            G0.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return AbstractC3628n.e(null);
        }
        G0.g.f().b("Logging app exception event to Firebase Analytics");
        return AbstractC3628n.c(new ScheduledThreadPoolExecutor(1), new e(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                G0.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return AbstractC3628n.f(arrayList);
    }

    private static boolean O(String str, File file, F.a aVar) {
        if (file == null || !file.exists()) {
            G0.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            G0.g.f().g("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && aVar == null) {
            return true;
        }
        return false;
    }

    private static L P(G0.h hVar) {
        File e8 = hVar.e();
        if (e8 != null && e8.exists()) {
            return new G("minidump_file", "minidump", e8);
        }
        return new C1251h("minidump_file", "minidump", new byte[]{0});
    }

    private static byte[] R(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private Task V() {
        if (this.f3936b.d()) {
            G0.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f3950p.e(Boolean.FALSE);
            return AbstractC3628n.e(Boolean.TRUE);
        }
        G0.g.f().b("Automatic data collection is disabled.");
        G0.g.f().i("Notifying that unsent reports are available.");
        this.f3950p.e(Boolean.TRUE);
        Task p8 = this.f3936b.j().p(new c());
        G0.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return K0.b.c(p8, this.f3951q.a());
    }

    private void W(String str) {
        List historicalProcessExitReasons;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.f3935a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f3947m.w(str, historicalProcessExitReasons, new L0.e(this.f3941g, str), L0.m.j(str, this.f3941g, this.f3939e));
                return;
            } else {
                G0.g.f().i("No ApplicationExitInfo available. Session: " + str);
                return;
            }
        }
        G0.g.f().i("ANR feature enabled, but device is API " + i8);
    }

    private static G.a n(I i8, C1245b c1245b) {
        return G.a.b(i8.f(), c1245b.f3890f, c1245b.f3891g, i8.a().c(), E.b(c1245b.f3888d).c(), c1245b.f3892h);
    }

    private static G.b o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return G.b.c(AbstractC1253j.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC1253j.b(context), statFs.getBlockCount() * statFs.getBlockSize(), AbstractC1253j.w(), AbstractC1253j.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static G.c p() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC1253j.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(boolean z8, R0.j jVar, boolean z9) {
        String str;
        K0.g.c();
        ArrayList arrayList = new ArrayList(this.f3947m.r());
        if (arrayList.size() <= z8) {
            G0.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z8 ? 1 : 0);
        if (z9 && jVar.b().f9113b.f9121b) {
            W(str2);
        } else {
            G0.g.f().i("ANR feature disabled.");
        }
        if (z9 && this.f3944j.d(str2)) {
            x(str2);
        }
        if (z8 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f3946l.e(null);
            str = null;
        }
        this.f3947m.l(B(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str, Boolean bool) {
        long B8 = B();
        G0.g.f().b("Opening a new session with ID " + str);
        this.f3944j.a(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C1266x.k()), B8, M0.G.b(n(this.f3940f, this.f3942h), p(), o(this.f3935a)));
        if (bool.booleanValue() && str != null) {
            this.f3938d.m(str);
        }
        this.f3943i.e(str);
        this.f3946l.e(str);
        this.f3947m.s(str, B8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j8) {
        try {
            if (!this.f3941g.g(".ae" + j8).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e8) {
            G0.g.f().l("Could not create app exception marker file.", e8);
        }
    }

    private void x(String str) {
        G0.g.f().i("Finalizing native report for session " + str);
        G0.h b9 = this.f3944j.b(str);
        File e8 = b9.e();
        F.a d8 = b9.d();
        if (O(str, e8, d8)) {
            G0.g.f().k("No native core present");
            return;
        }
        long lastModified = e8.lastModified();
        L0.e eVar = new L0.e(this.f3941g, str);
        File k8 = this.f3941g.k(str);
        if (!k8.isDirectory()) {
            G0.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        v(lastModified);
        List C8 = C(b9, str, this.f3941g, eVar.b());
        M.b(k8, C8);
        G0.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f3947m.k(str, C8, d8);
        eVar.a();
    }

    private static boolean z() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    String F() {
        InputStream D8 = D("META-INF/version-control-info.textproto");
        if (D8 == null) {
            return null;
        }
        G0.g.f().b("Read version control info");
        return Base64.encodeToString(R(D8), 0);
    }

    void G(R0.j jVar, Thread thread, Throwable th) {
        H(jVar, thread, th, false);
    }

    synchronized void H(R0.j jVar, Thread thread, Throwable th, boolean z8) {
        G0.g.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        Task g8 = this.f3939e.f4554a.g(new b(System.currentTimeMillis(), th, thread, jVar, z8));
        if (!z8) {
            try {
                try {
                    c0.b(g8);
                } catch (Exception e8) {
                    G0.g.f().e("Error handling uncaught exception", e8);
                }
            } catch (TimeoutException unused) {
                G0.g.f().d("Cannot send reports. Timed out while fetching settings.");
            }
        }
    }

    boolean I() {
        B b9 = this.f3948n;
        if (b9 != null && b9.a()) {
            return true;
        }
        return false;
    }

    List L() {
        return this.f3941g.h(f3934t);
    }

    void Q(final String str) {
        this.f3939e.f4554a.f(new Runnable() { // from class: J0.o
            @Override // java.lang.Runnable
            public final void run() {
                C1260q.this.J(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S() {
        try {
            String F8 = F();
            if (F8 != null) {
                T("com.crashlytics.version-control-info", F8);
                G0.g.f().g("Saved version control info");
            }
        } catch (IOException e8) {
            G0.g.f().l("Unable to save version control info", e8);
        }
    }

    void T(String str, String str2) {
        try {
            this.f3938d.l(str, str2);
        } catch (IllegalArgumentException e8) {
            Context context = this.f3935a;
            if (context != null && AbstractC1253j.u(context)) {
                throw e8;
            }
            G0.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(Task task) {
        if (!this.f3947m.o()) {
            G0.g.f().i("No crash reports are available to be sent.");
            this.f3950p.e(Boolean.FALSE);
        } else {
            G0.g.f().i("Crash reports are available to be sent.");
            V().o(this.f3939e.f4554a, new d(task));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(long j8, String str) {
        if (!I()) {
            this.f3943i.g(j8, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        K0.g.c();
        if (!this.f3937c.c()) {
            String A8 = A();
            if (A8 != null && this.f3944j.d(A8)) {
                return true;
            }
            return false;
        }
        G0.g.f().i("Found previous crash marker.");
        this.f3937c.d();
        return true;
    }

    void s(R0.j jVar) {
        t(false, jVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, R0.j jVar) {
        this.f3949o = jVar;
        Q(str);
        B b9 = new B(new a(), jVar, uncaughtExceptionHandler, this.f3944j);
        this.f3948n = b9;
        Thread.setDefaultUncaughtExceptionHandler(b9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(R0.j jVar) {
        K0.g.c();
        if (I()) {
            G0.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        G0.g.f().i("Finalizing previously open sessions.");
        try {
            t(true, jVar, true);
            G0.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e8) {
            G0.g.f().e("Unable to finalize previously open sessions.", e8);
            return false;
        }
    }
}
