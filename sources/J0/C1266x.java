package J0;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: J0.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1266x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3981a;

    /* renamed from: b, reason: collision with root package name */
    private final A0.f f3982b;

    /* renamed from: c, reason: collision with root package name */
    private final D f3983c;

    /* renamed from: f, reason: collision with root package name */
    private C1267y f3986f;

    /* renamed from: g, reason: collision with root package name */
    private C1267y f3987g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3988h;

    /* renamed from: i, reason: collision with root package name */
    private C1260q f3989i;

    /* renamed from: j, reason: collision with root package name */
    private final I f3990j;

    /* renamed from: k, reason: collision with root package name */
    private final P0.g f3991k;

    /* renamed from: l, reason: collision with root package name */
    public final I0.b f3992l;

    /* renamed from: m, reason: collision with root package name */
    private final H0.a f3993m;

    /* renamed from: n, reason: collision with root package name */
    private final C1257n f3994n;

    /* renamed from: o, reason: collision with root package name */
    private final G0.a f3995o;

    /* renamed from: p, reason: collision with root package name */
    private final G0.l f3996p;

    /* renamed from: q, reason: collision with root package name */
    private final K0.g f3997q;

    /* renamed from: e, reason: collision with root package name */
    private final long f3985e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final N f3984d = new N();

    public C1266x(A0.f fVar, I i8, G0.a aVar, D d8, I0.b bVar, H0.a aVar2, P0.g gVar, C1257n c1257n, G0.l lVar, K0.g gVar2) {
        this.f3982b = fVar;
        this.f3983c = d8;
        this.f3981a = fVar.k();
        this.f3990j = i8;
        this.f3995o = aVar;
        this.f3992l = bVar;
        this.f3993m = aVar2;
        this.f3991k = gVar;
        this.f3994n = c1257n;
        this.f3996p = lVar;
        this.f3997q = gVar2;
    }

    private void f() {
        try {
            this.f3988h = Boolean.TRUE.equals((Boolean) this.f3997q.f4554a.c().submit(new Callable() { // from class: J0.s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean m8;
                    m8 = C1266x.this.m();
                    return m8;
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f3988h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void o(R0.j jVar) {
        K0.g.c();
        t();
        try {
            try {
                this.f3992l.a(new I0.a() { // from class: J0.u
                    @Override // I0.a
                    public final void a(String str) {
                        C1266x.this.r(str);
                    }
                });
                this.f3989i.S();
            } catch (Exception e8) {
                G0.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e8);
            }
            if (jVar.b().f9113b.f9120a) {
                if (!this.f3989i.y(jVar)) {
                    G0.g.f().k("Previous sessions could not be finalized.");
                }
                this.f3989i.U(jVar.a());
                s();
                return;
            }
            G0.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        } catch (Throwable th) {
            s();
            throw th;
        }
    }

    private void j(final R0.j jVar) {
        Future<?> submit = this.f3997q.f4554a.c().submit(new Runnable() { // from class: J0.t
            @Override // java.lang.Runnable
            public final void run() {
                C1266x.this.o(jVar);
            }
        });
        G0.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            G0.g.f().e("Crashlytics was interrupted during initialization.", e8);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e9) {
            G0.g.f().e("Crashlytics encountered a problem during initialization.", e9);
        } catch (TimeoutException e10) {
            G0.g.f().e("Crashlytics timed out during initialization.", e10);
        }
    }

    public static String k() {
        return "19.2.0";
    }

    static boolean l(String str, boolean z8) {
        if (!z8) {
            G0.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean m() {
        return Boolean.valueOf(this.f3989i.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(long j8, String str) {
        this.f3989i.X(j8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(final long j8, final String str) {
        this.f3997q.f4555b.f(new Runnable() { // from class: J0.w
            @Override // java.lang.Runnable
            public final void run() {
                C1266x.this.p(j8, str);
            }
        });
    }

    boolean g() {
        return this.f3986f.c();
    }

    public Task i(final R0.j jVar) {
        return this.f3997q.f4554a.f(new Runnable() { // from class: J0.r
            @Override // java.lang.Runnable
            public final void run() {
                C1266x.this.n(jVar);
            }
        });
    }

    public void r(final String str) {
        final long currentTimeMillis = System.currentTimeMillis() - this.f3985e;
        this.f3997q.f4554a.f(new Runnable() { // from class: J0.v
            @Override // java.lang.Runnable
            public final void run() {
                C1266x.this.q(currentTimeMillis, str);
            }
        });
    }

    void s() {
        K0.g.c();
        try {
            if (!this.f3986f.d()) {
                G0.g.f().k("Initialization marker file was not properly removed.");
            }
        } catch (Exception e8) {
            G0.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e8);
        }
    }

    void t() {
        K0.g.c();
        this.f3986f.a();
        G0.g.f().i("Initialization marker file was created.");
    }

    public boolean u(C1245b c1245b, R0.j jVar) {
        if (l(c1245b.f3886b, AbstractC1253j.i(this.f3981a, "com.crashlytics.RequireBuildId", true))) {
            String c8 = new C1252i().c();
            try {
                this.f3987g = new C1267y("crash_marker", this.f3991k);
                this.f3986f = new C1267y("initialization_marker", this.f3991k);
                L0.m mVar = new L0.m(c8, this.f3991k, this.f3997q);
                L0.e eVar = new L0.e(this.f3991k);
                S0.a aVar = new S0.a(1024, new S0.c(10));
                this.f3996p.c(mVar);
                this.f3989i = new C1260q(this.f3981a, this.f3990j, this.f3983c, this.f3991k, this.f3987g, c1245b, mVar, eVar, Z.i(this.f3981a, this.f3990j, this.f3991k, c1245b, eVar, mVar, aVar, jVar, this.f3984d, this.f3994n, this.f3997q), this.f3995o, this.f3993m, this.f3994n, this.f3997q);
                boolean g8 = g();
                f();
                this.f3989i.w(c8, Thread.getDefaultUncaughtExceptionHandler(), jVar);
                if (g8 && AbstractC1253j.d(this.f3981a)) {
                    G0.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    j(jVar);
                    return false;
                }
                G0.g.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e8) {
                G0.g.f().e("Crashlytics was not started due to an exception during initialization", e8);
                this.f3989i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    public void v(Boolean bool) {
        this.f3983c.h(bool);
    }
}
