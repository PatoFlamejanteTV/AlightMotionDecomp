package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.work.WorkRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import k0.C3223a;

/* renamed from: com.google.android.gms.internal.measurement.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2125e1 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile C2125e1 f16692j;

    /* renamed from: a, reason: collision with root package name */
    private final String f16693a;

    /* renamed from: b, reason: collision with root package name */
    protected final V.d f16694b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f16695c;

    /* renamed from: d, reason: collision with root package name */
    private final C3223a f16696d;

    /* renamed from: e, reason: collision with root package name */
    private final List f16697e;

    /* renamed from: f, reason: collision with root package name */
    private int f16698f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16699g;

    /* renamed from: h, reason: collision with root package name */
    private String f16700h;

    /* renamed from: i, reason: collision with root package name */
    private volatile P0 f16701i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.measurement.e1$a */
    /* loaded from: classes3.dex */
    public abstract class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final long f16702a;

        /* renamed from: b, reason: collision with root package name */
        final long f16703b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16704c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(C2125e1 c2125e1) {
            this(true);
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2125e1.this.f16699g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e8) {
                C2125e1.this.p(e8, false, this.f16704c);
                b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(boolean z8) {
            this.f16702a = C2125e1.this.f16694b.currentTimeMillis();
            this.f16703b = C2125e1.this.f16694b.elapsedRealtime();
            this.f16704c = z8;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.e1$b */
    /* loaded from: classes3.dex */
    static class b extends Y0 {

        /* renamed from: a, reason: collision with root package name */
        private final l0.t f16706a;

        b(l0.t tVar) {
            this.f16706a = tVar;
        }

        @Override // com.google.android.gms.internal.measurement.V0
        public final void Z(String str, String str2, Bundle bundle, long j8) {
            this.f16706a.a(str, str2, bundle, j8);
        }

        @Override // com.google.android.gms.internal.measurement.V0
        public final int w() {
            return System.identityHashCode(this.f16706a);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.e1$c */
    /* loaded from: classes3.dex */
    class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C2125e1.this.l(new C2301z1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C2125e1.this.l(new E1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C2125e1.this.l(new D1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C2125e1.this.l(new A1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Q0 q02 = new Q0();
            C2125e1.this.l(new F1(this, activity, q02));
            Bundle i8 = q02.i(50L);
            if (i8 != null) {
                bundle.putAll(i8);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C2125e1.this.l(new B1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C2125e1.this.l(new C1(this, activity));
        }
    }

    private C2125e1(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z8;
        if (str != null && D(str2, str3)) {
            this.f16693a = str;
        } else {
            this.f16693a = "FA";
        }
        this.f16694b = V.g.b();
        this.f16695c = I0.a().a(new ThreadFactoryC2188l1(this), 1);
        this.f16696d = new C3223a(this);
        this.f16697e = new ArrayList();
        if (A(context) && !I()) {
            this.f16700h = null;
            this.f16699g = true;
            Log.w(this.f16693a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!D(str2, str3)) {
            this.f16700h = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.f16693a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            } else {
                if (str2 == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8 ^ (str3 == null)) {
                    Log.w(this.f16693a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.f16700h = str2;
        }
        l(new C2116d1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f16693a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
    }

    private static boolean A(Context context) {
        if (new l0.n(context, l0.n.a(context)).b("google_app_id") == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D(String str, String str2) {
        if (str2 != null && str != null && !I()) {
            return true;
        }
        return false;
    }

    private final boolean I() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static C2125e1 e(Context context) {
        return f(context, null, null, null, null);
    }

    public static C2125e1 f(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC1396p.l(context);
        if (f16692j == null) {
            synchronized (C2125e1.class) {
                try {
                    if (f16692j == null) {
                        f16692j = new C2125e1(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f16692j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(a aVar) {
        this.f16695c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Exception exc, boolean z8, boolean z9) {
        this.f16699g |= z8;
        if (z8) {
            Log.w(this.f16693a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z9) {
            i(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f16693a, "Error with data collection. Data lost.", exc);
    }

    private final void s(String str, String str2, Bundle bundle, boolean z8, boolean z9, Long l8) {
        l(new C2293y1(this, l8, str, str2, bundle, z8, z9));
    }

    public final void B(String str) {
        l(new C2197m1(this, str));
    }

    public final String E() {
        Q0 q02 = new Q0();
        l(new C2214o1(this, q02));
        return q02.t0(50L);
    }

    public final String F() {
        Q0 q02 = new Q0();
        l(new C2253t1(this, q02));
        return q02.t0(500L);
    }

    public final String G() {
        Q0 q02 = new Q0();
        l(new C2230q1(this, q02));
        return q02.t0(500L);
    }

    public final String H() {
        Q0 q02 = new Q0();
        l(new C2222p1(this, q02));
        return q02.t0(500L);
    }

    public final int a(String str) {
        Q0 q02 = new Q0();
        l(new C2269v1(this, str, q02));
        Integer num = (Integer) Q0.k(q02.i(WorkRequest.MIN_BACKOFF_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        Q0 q02 = new Q0();
        l(new C2237r1(this, q02));
        Long s02 = q02.s0(500L);
        if (s02 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f16694b.currentTimeMillis()).nextLong();
            int i8 = this.f16698f + 1;
            this.f16698f = i8;
            return nextLong + i8;
        }
        return s02.longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final P0 c(Context context, boolean z8) {
        try {
            return S0.asInterface(DynamiteModule.e(context, DynamiteModule.f16184e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e8) {
            p(e8, true, false);
            return null;
        }
    }

    public final List g(String str, String str2) {
        Q0 q02 = new Q0();
        l(new C2161i1(this, str, str2, q02));
        List list = (List) Q0.k(q02.i(5000L), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final Map h(String str, String str2, boolean z8) {
        Q0 q02 = new Q0();
        l(new C2245s1(this, str, str2, z8, q02));
        Bundle i8 = q02.i(5000L);
        if (i8 != null && i8.size() != 0) {
            HashMap hashMap = new HashMap(i8.size());
            for (String str3 : i8.keySet()) {
                Object obj = i8.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public final void i(int i8, String str, Object obj, Object obj2, Object obj3) {
        l(new C2261u1(this, false, 5, str, obj, null, null));
    }

    public final void j(Activity activity, String str, String str2) {
        l(new C2179k1(this, activity, str, str2));
    }

    public final void k(Bundle bundle) {
        l(new C2134f1(this, bundle));
    }

    public final void q(String str, Bundle bundle) {
        s(null, str, bundle, false, true, null);
    }

    public final void r(String str, String str2, Bundle bundle) {
        l(new C2170j1(this, str, str2, bundle));
    }

    public final void t(String str, String str2, Object obj, boolean z8) {
        l(new C2152h1(this, str, str2, obj, z8));
    }

    public final void u(l0.t tVar) {
        AbstractC1396p.l(tVar);
        synchronized (this.f16697e) {
            for (int i8 = 0; i8 < this.f16697e.size(); i8++) {
                try {
                    if (tVar.equals(((Pair) this.f16697e.get(i8)).first)) {
                        Log.w(this.f16693a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b bVar = new b(tVar);
            this.f16697e.add(new Pair(tVar, bVar));
            if (this.f16701i != null) {
                try {
                    this.f16701i.registerOnMeasurementEventListener(bVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f16693a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            l(new C2285x1(this, bVar));
        }
    }

    public final C3223a x() {
        return this.f16696d;
    }

    public final void y(String str) {
        l(new C2206n1(this, str));
    }

    public final void z(String str, String str2, Bundle bundle) {
        s(str, str2, bundle, true, true, null);
    }
}
