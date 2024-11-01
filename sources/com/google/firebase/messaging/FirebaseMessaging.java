package com.google.firebase.messaging;

import M.C1323a;
import Q.AbstractC1396p;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b1.InterfaceC1962a;
import c1.InterfaceC2009b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.V;
import com.google.firebase.messaging.a0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q0.AbstractC3628n;
import q0.C3626l;
import q0.InterfaceC3622h;
import q0.InterfaceC3625k;

/* loaded from: classes4.dex */
public class FirebaseMessaging {

    /* renamed from: m, reason: collision with root package name */
    private static a0 f18530m;

    /* renamed from: o, reason: collision with root package name */
    static ScheduledExecutorService f18532o;

    /* renamed from: a, reason: collision with root package name */
    private final A0.f f18533a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18534b;

    /* renamed from: c, reason: collision with root package name */
    private final D f18535c;

    /* renamed from: d, reason: collision with root package name */
    private final V f18536d;

    /* renamed from: e, reason: collision with root package name */
    private final a f18537e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f18538f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f18539g;

    /* renamed from: h, reason: collision with root package name */
    private final Task f18540h;

    /* renamed from: i, reason: collision with root package name */
    private final I f18541i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18542j;

    /* renamed from: k, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f18543k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f18529l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n, reason: collision with root package name */
    static InterfaceC2009b f18531n = new InterfaceC2009b() { // from class: com.google.firebase.messaging.r
        @Override // c1.InterfaceC2009b
        public final Object get() {
            s.j F8;
            F8 = FirebaseMessaging.F();
            return F8;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private final Z0.d f18544a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f18545b;

        /* renamed from: c, reason: collision with root package name */
        private Z0.b f18546c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f18547d;

        a(Z0.d dVar) {
            this.f18544a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Z0.a aVar) {
            if (c()) {
                FirebaseMessaging.this.J();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context k8 = FirebaseMessaging.this.f18533a.k();
            SharedPreferences sharedPreferences = k8.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = k8.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(k8.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f18545b) {
                    return;
                }
                Boolean e8 = e();
                this.f18547d = e8;
                if (e8 == null) {
                    Z0.b bVar = new Z0.b() { // from class: com.google.firebase.messaging.A
                        @Override // Z0.b
                        public final void a(Z0.a aVar) {
                            FirebaseMessaging.a.this.d(aVar);
                        }
                    };
                    this.f18546c = bVar;
                    this.f18544a.b(A0.b.class, bVar);
                }
                this.f18545b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            boolean t8;
            try {
                b();
                Boolean bool = this.f18547d;
                if (bool != null) {
                    t8 = bool.booleanValue();
                } else {
                    t8 = FirebaseMessaging.this.f18533a.t();
                }
            } catch (Throwable th) {
                throw th;
            }
            return t8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(A0.f fVar, InterfaceC1962a interfaceC1962a, InterfaceC2009b interfaceC2009b, InterfaceC2009b interfaceC2009b2, d1.e eVar, InterfaceC2009b interfaceC2009b3, Z0.d dVar) {
        this(fVar, interfaceC1962a, interfaceC2009b, interfaceC2009b2, eVar, interfaceC2009b3, dVar, new I(fVar.k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(C3626l c3626l) {
        try {
            c3626l.c(k());
        } catch (Exception e8) {
            c3626l.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(C1323a c1323a) {
        if (c1323a != null) {
            H.y(c1323a.s());
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (w()) {
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(f0 f0Var) {
        if (w()) {
            f0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s.j F() {
        return null;
    }

    private boolean H() {
        O.c(this.f18534b);
        if (!O.d(this.f18534b)) {
            return false;
        }
        if (this.f18533a.j(B0.a.class) != null) {
            return true;
        }
        if (!H.a() || f18531n == null) {
            return false;
        }
        return true;
    }

    private synchronized void I() {
        if (!this.f18542j) {
            K(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (L(r())) {
            I();
        }
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull A0.f fVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) fVar.j(FirebaseMessaging.class);
            AbstractC1396p.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging n() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(A0.f.l());
        }
        return firebaseMessaging;
    }

    private static synchronized a0 o(Context context) {
        a0 a0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f18530m == null) {
                    f18530m = new a0(context);
                }
                a0Var = f18530m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a0Var;
    }

    private String p() {
        if ("[DEFAULT]".equals(this.f18533a.m())) {
            return "";
        }
        return this.f18533a.o();
    }

    public static s.j s() {
        return (s.j) f18531n.get();
    }

    private void t() {
        this.f18535c.e().f(this.f18538f, new InterfaceC3622h() { // from class: com.google.firebase.messaging.x
            @Override // q0.InterfaceC3622h
            public final void a(Object obj) {
                FirebaseMessaging.this.B((C1323a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void E() {
        O.c(this.f18534b);
        Q.g(this.f18534b, this.f18535c, H());
        if (H()) {
            t();
        }
    }

    private void v(String str) {
        if ("[DEFAULT]".equals(this.f18533a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f18533a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C2582n(this.f18534b).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task y(String str, a0.a aVar, String str2) {
        o(this.f18534b).f(p(), str, str2, this.f18541i.a());
        if (aVar == null || !str2.equals(aVar.f18632a)) {
            v(str2);
        }
        return AbstractC3628n.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task z(final String str, final a0.a aVar) {
        return this.f18535c.f().o(this.f18539g, new InterfaceC3625k() { // from class: com.google.firebase.messaging.z
            @Override // q0.InterfaceC3625k
            public final Task a(Object obj) {
                Task y8;
                y8 = FirebaseMessaging.this.y(str, aVar, (String) obj);
                return y8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void G(boolean z8) {
        this.f18542j = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void K(long j8) {
        l(new b0(this, Math.min(Math.max(30L, 2 * j8), f18529l)), j8);
        this.f18542j = true;
    }

    boolean L(a0.a aVar) {
        if (aVar != null && !aVar.b(this.f18541i.a())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        final a0.a r8 = r();
        if (!L(r8)) {
            return r8.f18632a;
        }
        final String c8 = I.c(this.f18533a);
        try {
            return (String) AbstractC3628n.a(this.f18536d.b(c8, new V.a() { // from class: com.google.firebase.messaging.y
                @Override // com.google.firebase.messaging.V.a
                public final Task start() {
                    Task z8;
                    z8 = FirebaseMessaging.this.z(c8, r8);
                    return z8;
                }
            }));
        } catch (InterruptedException | ExecutionException e8) {
            throw new IOException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Runnable runnable, long j8) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f18532o == null) {
                    f18532o = new ScheduledThreadPoolExecutor(1, new W.a("TAG"));
                }
                f18532o.schedule(runnable, j8, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context m() {
        return this.f18534b;
    }

    public Task q() {
        final C3626l c3626l = new C3626l();
        this.f18538f.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.A(c3626l);
            }
        });
        return c3626l.a();
    }

    a0.a r() {
        return o(this.f18534b).d(p(), I.c(this.f18533a));
    }

    public boolean w() {
        return this.f18537e.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f18541i.g();
    }

    FirebaseMessaging(A0.f fVar, InterfaceC1962a interfaceC1962a, InterfaceC2009b interfaceC2009b, InterfaceC2009b interfaceC2009b2, d1.e eVar, InterfaceC2009b interfaceC2009b3, Z0.d dVar, I i8) {
        this(fVar, interfaceC1962a, interfaceC2009b3, dVar, i8, new D(fVar, i8, interfaceC2009b, interfaceC2009b2, eVar), AbstractC2583o.f(), AbstractC2583o.c(), AbstractC2583o.b());
    }

    FirebaseMessaging(A0.f fVar, InterfaceC1962a interfaceC1962a, InterfaceC2009b interfaceC2009b, Z0.d dVar, I i8, D d8, Executor executor, Executor executor2, Executor executor3) {
        this.f18542j = false;
        f18531n = interfaceC2009b;
        this.f18533a = fVar;
        this.f18537e = new a(dVar);
        Context k8 = fVar.k();
        this.f18534b = k8;
        C2585q c2585q = new C2585q();
        this.f18543k = c2585q;
        this.f18541i = i8;
        this.f18535c = d8;
        this.f18536d = new V(executor);
        this.f18538f = executor2;
        this.f18539g = executor3;
        Context k9 = fVar.k();
        if (k9 instanceof Application) {
            ((Application) k9).registerActivityLifecycleCallbacks(c2585q);
        } else {
            Log.w("FirebaseMessaging", "Context " + k9 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC1962a != null) {
            interfaceC1962a.a(new InterfaceC1962a.InterfaceC0366a() { // from class: com.google.firebase.messaging.s
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.C();
            }
        });
        Task e8 = f0.e(this, i8, d8, k8, AbstractC2583o.g());
        this.f18540h = e8;
        e8.f(executor2, new InterfaceC3622h() { // from class: com.google.firebase.messaging.u
            @Override // q0.InterfaceC3622h
            public final void a(Object obj) {
                FirebaseMessaging.this.D((f0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.E();
            }
        });
    }
}
