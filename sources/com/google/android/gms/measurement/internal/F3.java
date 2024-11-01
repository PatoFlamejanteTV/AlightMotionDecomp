package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.internal.measurement.C2148g6;
import com.google.android.gms.internal.measurement.C2176j7;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.measurement.internal.A3;
import com.google.android.gms.measurement.internal.F3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import l0.C3302b;
import z0.AbstractC4258b;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public final class F3 extends AbstractC2477y2 {

    /* renamed from: c, reason: collision with root package name */
    private C2403n4 f17202c;

    /* renamed from: d, reason: collision with root package name */
    private l0.u f17203d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f17204e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17205f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f17206g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f17207h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17208i;

    /* renamed from: j, reason: collision with root package name */
    private int f17209j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC2439t f17210k;

    /* renamed from: l, reason: collision with root package name */
    private PriorityQueue f17211l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17212m;

    /* renamed from: n, reason: collision with root package name */
    private A3 f17213n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicLong f17214o;

    /* renamed from: p, reason: collision with root package name */
    private long f17215p;

    /* renamed from: q, reason: collision with root package name */
    final i6 f17216q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17217r;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC2439t f17218s;

    /* renamed from: t, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f17219t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC2439t f17220u;

    /* renamed from: v, reason: collision with root package name */
    private final c6 f17221v;

    /* JADX INFO: Access modifiers changed from: protected */
    public F3(S2 s22) {
        super(s22);
        this.f17204e = new CopyOnWriteArraySet();
        this.f17207h = new Object();
        this.f17208i = false;
        this.f17209j = 1;
        this.f17217r = true;
        this.f17221v = new C2347f4(this);
        this.f17206g = new AtomicReference();
        this.f17213n = A3.f17125c;
        this.f17215p = -1L;
        this.f17214o = new AtomicLong(0L);
        this.f17216q = new i6(s22);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int C(F3 f32, Throwable th) {
        String message = th.getMessage();
        f32.f17212m = false;
        if (message != null) {
            if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    return 3;
                }
                return 2;
            }
            if (message.contains("Background")) {
                f32.f17212m = true;
            }
            return 1;
        }
        return 2;
    }

    public static int E(String str) {
        AbstractC1396p.f(str);
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0() {
        long j8;
        k();
        String a9 = e().f18156o.a();
        if (a9 != null) {
            if ("unset".equals(a9)) {
                i0(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", null, x().currentTimeMillis());
            } else {
                if ("true".equals(a9)) {
                    j8 = 1;
                } else {
                    j8 = 0;
                }
                i0(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", Long.valueOf(j8), x().currentTimeMillis());
            }
        }
        if (this.f18099a.m() && this.f17217r) {
            a().F().a("Recording app launch after enabling measurement for the first time (FE)");
            C0();
            r().f18014e.a();
            f().D(new S3(this));
            return;
        }
        a().F().a("Updating Scion state (FE)");
        q().f0();
    }

    private final void N(Bundle bundle, int i8, long j8) {
        String str;
        s();
        String h8 = A3.h(bundle);
        if (h8 != null) {
            a().M().b("Ignoring invalid consent setting", h8);
            a().M().a("Valid consent values are 'granted', 'denied'");
        }
        boolean J8 = f().J();
        A3 c8 = A3.c(bundle, i8);
        if (c8.A()) {
            S(c8, j8, J8);
        }
        C2453v b9 = C2453v.b(bundle, i8);
        if (b9.k()) {
            Q(b9, J8);
        }
        Boolean e8 = C2453v.e(bundle);
        if (e8 != null) {
            if (i8 == -30) {
                str = "tcf";
            } else {
                str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            }
            String str2 = str;
            if (b().q(G.f17269T0) && J8) {
                i0(str2, "allow_personalized_ads", e8.toString(), j8);
            } else {
                k0(str2, "allow_personalized_ads", e8.toString(), false, j8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void P0(F3 f32, int i8) {
        if (f32.f17210k == null) {
            f32.f17210k = new Q3(f32, f32.f18099a);
        }
        f32.f17210k.b(i8 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Q0(F3 f32, Bundle bundle) {
        f32.k();
        f32.s();
        AbstractC1396p.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(TtmlNode.ATTR_TTS_ORIGIN);
        AbstractC1396p.f(string);
        AbstractC1396p.f(string2);
        AbstractC1396p.l(bundle.get("value"));
        if (!f32.f18099a.m()) {
            f32.a().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        Y5 y52 = new Y5(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            E H8 = f32.g().H(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            f32.q().H(new C2335e(bundle.getString(MBridgeConstans.APP_ID), string2, y52, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), f32.g().H(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), H8, bundle.getLong("time_to_live"), f32.g().H(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void S0(String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        f().D(new X3(this, str, str2, j8, d6.D(bundle), z8, z9, z10, str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void U(F3 f32, Bundle bundle) {
        f32.k();
        f32.s();
        AbstractC1396p.l(bundle);
        String f8 = AbstractC1396p.f(bundle.getString("name"));
        if (!f32.f18099a.m()) {
            f32.a().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            f32.q().H(new C2335e(bundle.getString(MBridgeConstans.APP_ID), "", new Y5(f8, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), f32.g().H(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void V(F3 f32, A3 a32, long j8, boolean z8, boolean z9) {
        f32.k();
        f32.s();
        A3 M8 = f32.e().M();
        if (j8 <= f32.f17215p && A3.l(M8.b(), a32.b())) {
            f32.a().J().b("Dropped out-of-date consent setting, proposed settings", a32);
            return;
        }
        if (f32.e().B(a32)) {
            f32.a().K().b("Setting storage consent(FE)", a32);
            f32.f17215p = j8;
            if (f32.q().j0()) {
                f32.q().o0(z8);
            } else {
                f32.q().U(z8);
            }
            if (z9) {
                f32.q().O(new AtomicReference());
                return;
            }
            return;
        }
        f32.a().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(a32.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void W(F3 f32, A3 a32, A3 a33) {
        if (!C2148g6.a() || !f32.b().q(G.f17279Y0)) {
            A3.a aVar = A3.a.ANALYTICS_STORAGE;
            A3.a aVar2 = A3.a.AD_STORAGE;
            boolean n8 = a32.n(a33, aVar, aVar2);
            boolean s8 = a32.s(a33, aVar, aVar2);
            if (n8 || s8) {
                f32.m().I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(Boolean bool, boolean z8) {
        k();
        s();
        a().F().b("Setting app measurement enabled (FE)", bool);
        e().t(bool);
        if (z8) {
            e().E(bool);
        }
        if (this.f18099a.n() || (bool != null && !bool.booleanValue())) {
            K0();
        }
    }

    private final void e0(String str, String str2, long j8, Object obj) {
        f().D(new W3(this, str, str2, obj, j8));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2477y2
    protected final boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PriorityQueue A0() {
        if (this.f17211l == null) {
            l0.x.a();
            this.f17211l = l0.w.a(Comparator$CC.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.E3
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long valueOf;
                    valueOf = Long.valueOf(((B5) obj).f17159b);
                    return valueOf;
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.H3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                    return compare;
                }
            }));
        }
        return this.f17211l;
    }

    public final void B0() {
        k();
        s();
        if (b().q(G.f17296e1)) {
            F4 q8 = q();
            q8.k();
            q8.s();
            if (!q8.k0() || q8.g().I0() >= 242600) {
                q().X();
            }
        }
    }

    public final void C0() {
        k();
        s();
        if (!this.f18099a.p()) {
            return;
        }
        Boolean E8 = b().E("google_analytics_deferred_deep_link_enabled");
        if (E8 != null && E8.booleanValue()) {
            a().F().a("Deferred Deep Link feature enabled.");
            f().D(new Runnable() { // from class: l0.y
                @Override // java.lang.Runnable
                public final void run() {
                    F3.this.F0();
                }
            });
        }
        q().Y();
        this.f17217r = false;
        String Q8 = e().Q();
        if (!TextUtils.isEmpty(Q8)) {
            c().m();
            if (!Q8.equals(Build.VERSION.RELEASE)) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", Q8);
                b1("auto", "_ou", bundle);
            }
        }
    }

    public final void D0() {
        if ((w().getApplicationContext() instanceof Application) && this.f17202c != null) {
            ((Application) w().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f17202c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E0() {
        if (C2176j7.a() && b().q(G.f17249J0)) {
            if (f().J()) {
                a().G().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C2321c.a()) {
                a().G().a("Cannot get trigger URIs from main thread");
                return;
            }
            s();
            a().K().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            f().s(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.G3
                @Override // java.lang.Runnable
                public final void run() {
                    F3.this.m0(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                a().G().a("Timed out waiting for get trigger URIs");
            } else {
                f().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.J3
                    @Override // java.lang.Runnable
                    public final void run() {
                        F3.this.l0(list);
                    }
                });
            }
        }
    }

    public final void F0() {
        k();
        if (e().f18163v.b()) {
            a().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a9 = e().f18164w.a();
        e().f18164w.b(1 + a9);
        if (a9 >= 5) {
            a().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            e().f18163v.a(true);
        } else {
            if (this.f17218s == null) {
                this.f17218s = new C2312a4(this, this.f18099a);
            }
            this.f17218s.b(0L);
        }
    }

    public final ArrayList G(String str, String str2) {
        if (f().J()) {
            a().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C2321c.a()) {
            a().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f18099a.f().s(atomicReference, 5000L, "get conditional user properties", new RunnableC2340e4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            a().G().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return d6.t0(list);
    }

    public final void G0() {
        k();
        a().F().a("Handle tcf update.");
        C2487z5 c8 = C2487z5.c(e().H());
        a().K().b("Tcf preferences read", c8);
        if (e().C(c8)) {
            Bundle b9 = c8.b();
            a().K().b("Consent generated from Tcf", b9);
            if (b9 != Bundle.EMPTY) {
                N(b9, -30, x().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c8.e());
            b1("auto", "_tcf", bundle);
        }
    }

    public final Map H(String str, String str2, boolean z8) {
        if (f().J()) {
            a().G().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C2321c.a()) {
            a().G().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f18099a.f().s(atomicReference, 5000L, "get user properties", new RunnableC2333d4(this, atomicReference, null, str, str2, z8));
        List<Y5> list = (List) atomicReference.get();
        if (list == null) {
            a().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z8));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (Y5 y52 : list) {
            Object s8 = y52.s();
            if (s8 != null) {
                arrayMap.put(y52.f17650b, s8);
            }
        }
        return arrayMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H0() {
        B5 b52;
        MeasurementManagerFutures T02;
        k();
        this.f17212m = false;
        if (A0().isEmpty() || this.f17208i || (b52 = (B5) A0().poll()) == null || (T02 = g().T0()) == null) {
            return;
        }
        this.f17208i = true;
        a().K().b("Registering trigger URI", b52.f17158a);
        InterfaceFutureC4260d registerTriggerAsync = T02.registerTriggerAsync(Uri.parse(b52.f17158a));
        if (registerTriggerAsync == null) {
            this.f17208i = false;
            A0().add(b52);
            return;
        }
        if (!b().q(G.f17259O0)) {
            SparseArray K8 = e().K();
            K8.put(b52.f17160c, Long.valueOf(b52.f17159b));
            e().s(K8);
        }
        AbstractC4258b.a(registerTriggerAsync, new R3(this, b52), new N3(this));
    }

    public final void I(long j8) {
        a1(null);
        f().D(new Z3(this, j8));
    }

    public final void I0() {
        k();
        a().F().a("Register tcfPrefChangeListener.");
        if (this.f17219t == null) {
            this.f17220u = new U3(this, this.f18099a);
            this.f17219t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.M3
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    F3.this.L(sharedPreferences, str);
                }
            };
        }
        e().H().registerOnSharedPreferenceChangeListener(this.f17219t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(long j8, boolean z8) {
        k();
        s();
        a().F().a("Resetting analytics data (FE)");
        C2418p5 r8 = r();
        r8.k();
        r8.f18015f.b();
        m().I();
        boolean m8 = this.f18099a.m();
        C2484z2 e8 = e();
        e8.f18148g.b(j8);
        if (!TextUtils.isEmpty(e8.e().f18165x.a())) {
            e8.f18165x.b(null);
        }
        e8.f18159r.b(0L);
        e8.f18160s.b(0L);
        if (!e8.b().W()) {
            e8.G(!m8);
        }
        e8.f18166y.b(null);
        e8.f18167z.b(0L);
        e8.f18143A.b(null);
        if (z8) {
            q().d0();
        }
        r().f18014e.a();
        this.f17217r = !m8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J0() {
        return this.f17212m;
    }

    public final void K(Intent intent) {
        if (q7.a() && b().q(G.f17346z0)) {
            Uri data = intent.getData();
            if (data == null) {
                a().J().a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter != null && queryParameter.equals("1")) {
                String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    a().J().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
                    b().L(queryParameter2);
                    return;
                }
                return;
            }
            a().J().a("Preview Mode was not enabled.");
            b().L(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void L(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            a().K().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC2439t) AbstractC1396p.l(this.f17220u)).b(500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void M(Bundle bundle) {
        Bundle a9;
        if (bundle.isEmpty()) {
            a9 = bundle;
        } else {
            a9 = e().f18143A.a();
            if (b().q(G.f17308i1)) {
                a9 = new Bundle(a9);
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    g();
                    if (d6.h0(obj)) {
                        g();
                        d6.Y(this.f17221v, 27, null, null, 0);
                    }
                    a().M().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (d6.J0(str)) {
                    a().M().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a9.remove(str);
                } else if (g().l0("param", str, b().o(null, false), obj)) {
                    g().O(a9, str, obj);
                }
            }
            g();
            if (d6.g0(a9, b().v())) {
                g();
                d6.Y(this.f17221v, 26, null, null, 0);
                a().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        e().f18143A.b(a9);
        if (!bundle.isEmpty() || b().q(G.f17302g1)) {
            q().C(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M0(long j8) {
        J(j8, true);
    }

    public final void N0(Bundle bundle) {
        O0(bundle, x().currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void O(Bundle bundle, long j8) {
        if (TextUtils.isEmpty(m().G())) {
            N(bundle, 0, j8);
        } else {
            a().M().a("Using developer consent only; google app id found");
        }
    }

    public final void O0(Bundle bundle, long j8) {
        AbstractC1396p.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(MBridgeConstans.APP_ID))) {
            a().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(MBridgeConstans.APP_ID);
        AbstractC1396p.l(bundle2);
        l0.o.a(bundle2, MBridgeConstans.APP_ID, String.class, null);
        l0.o.a(bundle2, TtmlNode.ATTR_TTS_ORIGIN, String.class, null);
        l0.o.a(bundle2, "name", String.class, null);
        l0.o.a(bundle2, "value", Object.class, null);
        l0.o.a(bundle2, "trigger_event_name", String.class, null);
        l0.o.a(bundle2, "trigger_timeout", Long.class, 0L);
        l0.o.a(bundle2, "timed_out_event_name", String.class, null);
        l0.o.a(bundle2, "timed_out_event_params", Bundle.class, null);
        l0.o.a(bundle2, "triggered_event_name", String.class, null);
        l0.o.a(bundle2, "triggered_event_params", Bundle.class, null);
        l0.o.a(bundle2, "time_to_live", Long.class, 0L);
        l0.o.a(bundle2, "expired_event_name", String.class, null);
        l0.o.a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC1396p.f(bundle2.getString("name"));
        AbstractC1396p.f(bundle2.getString(TtmlNode.ATTR_TTS_ORIGIN));
        AbstractC1396p.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j8);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (g().r0(string) != 0) {
            a().G().b("Invalid conditional user property name", d().g(string));
            return;
        }
        if (g().t(string, obj) != 0) {
            a().G().c("Invalid conditional user property value", d().g(string), obj);
            return;
        }
        Object A02 = g().A0(string, obj);
        if (A02 == null) {
            a().G().c("Unable to normalize conditional user property value", d().g(string), obj);
            return;
        }
        l0.o.b(bundle2, A02);
        long j9 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j9 > 15552000000L || j9 < 1)) {
            a().G().c("Invalid conditional user property timeout", d().g(string), Long.valueOf(j9));
            return;
        }
        long j10 = bundle2.getLong("time_to_live");
        if (j10 <= 15552000000L && j10 >= 1) {
            f().D(new RunnableC2326c4(this, bundle2));
        } else {
            a().G().c("Invalid conditional user property time to live", d().g(string), Long.valueOf(j10));
        }
    }

    public final void P(com.google.android.gms.internal.measurement.U0 u02) {
        f().D(new RunnableC2354g4(this, u02));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(C2453v c2453v, boolean z8) {
        RunnableC2396m4 runnableC2396m4 = new RunnableC2396m4(this, c2453v);
        if (z8) {
            k();
            runnableC2396m4.run();
        } else {
            f().D(runnableC2396m4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(A3 a32) {
        boolean z8;
        k();
        if ((a32.z() && a32.y()) || q().i0()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 != this.f18099a.n()) {
            this.f18099a.t(z8);
            Boolean O8 = e().O();
            if (!z8 || O8 == null || O8.booleanValue()) {
                a0(Boolean.valueOf(z8), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void R0(String str) {
        if (m().K(str)) {
            m().I();
        }
    }

    public final void S(A3 a32, long j8, boolean z8) {
        A3 a33;
        boolean z9;
        boolean z10;
        boolean z11;
        A3 a34 = a32;
        s();
        int b9 = a32.b();
        if (b9 != -10) {
            l0.p t8 = a32.t();
            l0.p pVar = l0.p.UNINITIALIZED;
            if (t8 == pVar && a32.v() == pVar) {
                a().M().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f17207h) {
            try {
                a33 = this.f17213n;
                z9 = false;
                if (A3.l(b9, a33.b())) {
                    z10 = a32.u(this.f17213n);
                    if (a32.z() && !this.f17213n.z()) {
                        z9 = true;
                    }
                    a34 = a32.p(this.f17213n);
                    this.f17213n = a34;
                    z11 = z9;
                    z9 = true;
                } else {
                    z10 = false;
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z9) {
            a().J().b("Ignoring lower-priority consent settings, proposed settings", a34);
            return;
        }
        long andIncrement = this.f17214o.getAndIncrement();
        if (z10) {
            a1(null);
            RunnableC2389l4 runnableC2389l4 = new RunnableC2389l4(this, a34, j8, andIncrement, z11, a33);
            if (z8) {
                k();
                runnableC2389l4.run();
                return;
            } else {
                f().G(runnableC2389l4);
                return;
            }
        }
        RunnableC2417p4 runnableC2417p4 = new RunnableC2417p4(this, a34, andIncrement, z11, a33);
        if (z8) {
            k();
            runnableC2417p4.run();
        } else if (b9 != 30 && b9 != -10) {
            f().D(runnableC2417p4);
        } else {
            f().G(runnableC2417p4);
        }
    }

    public final void T0(String str, String str2, Bundle bundle) {
        h0(str, str2, bundle, true, true, x().currentTimeMillis());
    }

    public final void U0(l0.t tVar) {
        s();
        AbstractC1396p.l(tVar);
        if (!this.f17204e.remove(tVar)) {
            a().L().a("OnEventListener had not been registered");
        }
    }

    public final void V0(boolean z8) {
        if (w().getApplicationContext() instanceof Application) {
            Application application = (Application) w().getApplicationContext();
            if (this.f17202c == null) {
                this.f17202c = new C2403n4(this);
            }
            if (z8) {
                application.unregisterActivityLifecycleCallbacks(this.f17202c);
                application.registerActivityLifecycleCallbacks(this.f17202c);
                a().K().a("Registered activity lifecycle callback");
            }
        }
    }

    public final void W0(long j8) {
        f().D(new V3(this, j8));
    }

    public final void X0(Bundle bundle) {
        final Bundle bundle2;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        f().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.I3
            @Override // java.lang.Runnable
            public final void run() {
                F3.this.M(bundle2);
            }
        });
    }

    public final void Y0(final Bundle bundle, final long j8) {
        f().G(new Runnable() { // from class: com.google.android.gms.measurement.internal.K3
            @Override // java.lang.Runnable
            public final void run() {
                F3.this.O(bundle, j8);
            }
        });
    }

    public final void Z(Boolean bool) {
        s();
        f().D(new RunnableC2375j4(this, bool));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a1(String str) {
        this.f17206g.set(str);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    public final void b0(final String str, long j8) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.f18099a.a().L().a("User ID must be non-empty or null");
        } else {
            f().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.L3
                @Override // java.lang.Runnable
                public final void run() {
                    F3.this.R0(str);
                }
            });
            k0(null, "_id", str, true, j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b1(String str, String str2, Bundle bundle) {
        k();
        c0(str, str2, x().currentTimeMillis(), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c0(String str, String str2, long j8, Bundle bundle) {
        boolean z8;
        k();
        if (this.f17203d != null && !d6.J0(str2)) {
            z8 = false;
        } else {
            z8 = true;
        }
        d0(str, str2, j8, bundle, true, z8, true, null);
    }

    public final void c1(boolean z8) {
        s();
        f().D(new T3(this, z8));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d0(String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        boolean b9;
        String str4;
        long j9;
        int i8;
        int length;
        Class<?> cls;
        AbstractC1396p.f(str);
        AbstractC1396p.l(bundle);
        k();
        s();
        if (!this.f18099a.m()) {
            a().F().a("Event not sent since app measurement is disabled");
            return;
        }
        List H8 = m().H();
        if (H8 != null && !H8.contains(str2)) {
            a().F().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f17205f) {
            this.f17205f = true;
            try {
                if (!this.f18099a.q()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, w().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, w());
                } catch (Exception e8) {
                    a().L().b("Failed to invoke Tag Manager's initialize() method", e8);
                }
            } catch (ClassNotFoundException unused) {
                a().J().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            i0("auto", "_lgclid", bundle.getString("gclid"), x().currentTimeMillis());
        }
        if (z8 && d6.M0(str2)) {
            g().N(bundle, e().f18143A.a());
        }
        if (!z10 && !"_iap".equals(str2)) {
            d6 L8 = this.f18099a.L();
            int i9 = 2;
            if (L8.C0(NotificationCompat.CATEGORY_EVENT, str2)) {
                if (!L8.p0(NotificationCompat.CATEGORY_EVENT, l0.q.f34622a, l0.q.f34623b, str2)) {
                    i9 = 13;
                } else if (L8.j0(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                    i9 = 0;
                }
            }
            if (i9 != 0) {
                a().H().b("Invalid public event name. Event will not be logged (FE)", d().c(str2));
                this.f18099a.L();
                String J8 = d6.J(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f18099a.L();
                d6.Y(this.f17221v, i9, "_ev", J8, length);
                return;
            }
        }
        C2472x4 C8 = p().C(false);
        if (C8 != null && !bundle.containsKey("_sc")) {
            C8.f18123d = true;
        }
        d6.X(C8, bundle, z8 && !z10);
        boolean equals = "am".equals(str);
        boolean J02 = d6.J0(str2);
        if (z8 && this.f17203d != null && !J02 && !equals) {
            a().F().c("Passing event to registered event handler (FE)", d().c(str2), d().a(bundle));
            AbstractC1396p.l(this.f17203d);
            this.f17203d.a(str, str2, bundle, j8);
            return;
        }
        if (this.f18099a.p()) {
            int s8 = g().s(str2);
            if (s8 != 0) {
                a().H().b("Invalid event name. Event will not be logged (FE)", d().c(str2));
                g();
                String J9 = d6.J(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f18099a.L();
                d6.Z(this.f17221v, str3, s8, "_ev", J9, length);
                return;
            }
            Bundle F8 = g().F(str3, str2, bundle, V.e.b("_o", "_sn", "_sc", "_si"), z10);
            AbstractC1396p.l(F8);
            if (p().C(false) != null && "_ae".equals(str2)) {
                C2452u5 c2452u5 = r().f18015f;
                long elapsedRealtime = c2452u5.f18079d.x().elapsedRealtime();
                long j10 = elapsedRealtime - c2452u5.f18077b;
                c2452u5.f18077b = elapsedRealtime;
                if (j10 > 0) {
                    g().M(F8, j10);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                d6 g8 = g();
                String string = F8.getString("_ffr");
                if (V.n.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, g8.e().f18165x.a())) {
                    g8.a().F().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                g8.e().f18165x.b(string);
            } else if ("_ae".equals(str2)) {
                String a9 = g().e().f18165x.a();
                if (!TextUtils.isEmpty(a9)) {
                    F8.putString("_ffr", a9);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(F8);
            if (b().q(G.f17261P0)) {
                b9 = r().F();
            } else {
                b9 = e().f18162u.b();
            }
            if (e().f18159r.a() <= 0 || !e().z(j8) || !b9) {
                str4 = "_ae";
                j9 = 0;
            } else {
                a().K().a("Current session is expired, remove the session number, ID, and engagement time");
                j9 = 0;
                str4 = "_ae";
                i0("auto", "_sid", null, x().currentTimeMillis());
                i0("auto", "_sno", null, x().currentTimeMillis());
                i0("auto", "_se", null, x().currentTimeMillis());
                e().f18160s.b(0L);
            }
            if (F8.getLong("extend_session", j9) == 1) {
                a().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i8 = 1;
                this.f18099a.K().f18014e.b(j8, true);
            } else {
                i8 = 1;
            }
            ArrayList arrayList2 = new ArrayList(F8.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10 += i8;
                String str5 = (String) obj;
                if (str5 != null) {
                    g();
                    Bundle[] x02 = d6.x0(F8.get(str5));
                    if (x02 != null) {
                        F8.putParcelableArray(str5, x02);
                    }
                }
                i8 = 1;
            }
            int i11 = 0;
            while (i11 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i11);
                String str6 = i11 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str);
                if (z9) {
                    bundle2 = g().E(bundle2, null);
                }
                Bundle bundle3 = bundle2;
                q().I(new E(str6, new D(bundle3), str, j8), str3);
                if (!equals) {
                    Iterator it = this.f17204e.iterator();
                    while (it.hasNext()) {
                        ((l0.t) it.next()).a(str, str2, new Bundle(bundle3), j8);
                    }
                }
                i11++;
            }
            if (p().C(false) == null || !str4.equals(str2)) {
                return;
            }
            r().E(true, true, x().elapsedRealtime());
        }
    }

    public final void d1(Bundle bundle, long j8) {
        N(bundle, -20, j8);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    public final void f0(String str, String str2, Bundle bundle) {
        long currentTimeMillis = x().currentTimeMillis();
        AbstractC1396p.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        f().D(new RunnableC2319b4(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    public final void g0(String str, String str2, Bundle bundle, String str3) {
        j();
        S0(str, str2, x().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void h0(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8) {
        String str3;
        Bundle bundle2;
        boolean z10;
        if (str == null) {
            str3 = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (Objects.equals(str2, "screen_view")) {
            p().I(bundle2, j8);
            return;
        }
        if (z9 && this.f17203d != null && !d6.J0(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        S0(str3, str2, j8, bundle2, z9, z10, z8, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i0(String str, String str2, Object obj, long j8) {
        long j9;
        AbstractC1396p.f(str);
        AbstractC1396p.f(str2);
        k();
        s();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    if ("false".equals(str3.toLowerCase(Locale.ENGLISH))) {
                        j9 = 1;
                    } else {
                        j9 = 0;
                    }
                    Long valueOf = Long.valueOf(j9);
                    C2 c22 = e().f18156o;
                    if (valueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    c22.b(str4);
                    obj = valueOf;
                    str2 = "_npa";
                    a().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                e().f18156o.b("unset");
                str2 = "_npa";
            }
            a().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str5 = str2;
        Object obj2 = obj;
        if (!this.f18099a.m()) {
            a().K().a("User property not set since app measurement is disabled");
        } else {
            if (!this.f18099a.p()) {
                return;
            }
            q().M(new Y5(str5, j8, obj2, str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final void j0(String str, String str2, Object obj, boolean z8) {
        k0(str, str2, obj, z8, x().currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final void k0(String str, String str2, Object obj, boolean z8, long j8) {
        int i8;
        if (str == null) {
            str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        }
        String str3 = str;
        int i9 = 0;
        if (z8) {
            i8 = g().r0(str2);
        } else {
            d6 g8 = g();
            if (g8.C0("user property", str2)) {
                if (!g8.o0("user property", l0.r.f34626a, str2)) {
                    i8 = 15;
                } else if (g8.j0("user property", 24, str2)) {
                    i8 = 0;
                }
            }
            i8 = 6;
        }
        if (i8 != 0) {
            g();
            String J8 = d6.J(str2, 24, true);
            if (str2 != null) {
                i9 = str2.length();
            }
            this.f18099a.L();
            d6.Y(this.f17221v, i8, "_ev", J8, i9);
            return;
        }
        if (obj != null) {
            int t8 = g().t(str2, obj);
            if (t8 != 0) {
                g();
                String J9 = d6.J(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i9 = String.valueOf(obj).length();
                }
                this.f18099a.L();
                d6.Y(this.f17221v, t8, "_ev", J9, i9);
                return;
            }
            Object A02 = g().A0(str2, obj);
            if (A02 != null) {
                e0(str3, str2, j8, A02);
                return;
            }
            return;
        }
        e0(str3, str2, j8, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2474y l() {
        return super.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void l0(List list) {
        boolean contains;
        k();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray K8 = e().K();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                B5 b52 = (B5) it.next();
                contains = K8.contains(b52.f17160c);
                if (!contains || ((Long) K8.get(b52.f17160c)).longValue() < b52.f17159b) {
                    A0().add(b52);
                }
            }
            H0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2352g2 m() {
        return super.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m0(AtomicReference atomicReference) {
        Bundle a9 = e().f18157p.a();
        F4 q8 = q();
        if (a9 == null) {
            a9 = new Bundle();
        }
        q8.P(atomicReference, a9);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2345f2 n() {
        return super.n();
    }

    public final void n0(l0.t tVar) {
        s();
        AbstractC1396p.l(tVar);
        if (!this.f17204e.add(tVar)) {
            a().L().a("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ F3 o() {
        return super.o();
    }

    public final void o0(l0.u uVar) {
        l0.u uVar2;
        boolean z8;
        k();
        s();
        if (uVar != null && uVar != (uVar2 = this.f17203d)) {
            if (uVar2 == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC1396p.p(z8, "EventInterceptor already set.");
        }
        this.f17203d = uVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2465w4 p() {
        return super.p();
    }

    public final Application.ActivityLifecycleCallbacks p0() {
        return this.f17202c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ F4 q() {
        return super.q();
    }

    public final C3302b q0() {
        k();
        return q().V();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2418p5 r() {
        return super.r();
    }

    public final Boolean r0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) f().s(atomicReference, 15000L, "boolean test flag value", new P3(this, atomicReference));
    }

    public final Double s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) f().s(atomicReference, 15000L, "double test flag value", new RunnableC2382k4(this, atomicReference));
    }

    public final Integer t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) f().s(atomicReference, 15000L, "int test flag value", new RunnableC2361h4(this, atomicReference));
    }

    public final Long u0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) f().s(atomicReference, 15000L, "long test flag value", new RunnableC2368i4(this, atomicReference));
    }

    public final String v0() {
        return (String) this.f17206g.get();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    public final String w0() {
        C2472x4 P8 = this.f18099a.I().P();
        if (P8 != null) {
            return P8.f18121b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    public final String x0() {
        C2472x4 P8 = this.f18099a.I().P();
        if (P8 != null) {
            return P8.f18120a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2321c y() {
        return super.y();
    }

    public final String y0() {
        if (this.f18099a.M() != null) {
            return this.f18099a.M();
        }
        try {
            return new l0.n(w(), this.f18099a.P()).b("google_app_id");
        } catch (IllegalStateException e8) {
            this.f18099a.a().G().b("getGoogleAppId failed with exception", e8);
            return null;
        }
    }

    public final String z0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) f().s(atomicReference, 15000L, "String test flag value", new Y3(this, atomicReference));
    }
}
