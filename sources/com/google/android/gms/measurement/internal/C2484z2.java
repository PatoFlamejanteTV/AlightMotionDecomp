package com.google.android.gms.measurement.internal;

import G.a;
import Q.AbstractC1396p;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.A3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2484z2 extends AbstractC2485z3 {

    /* renamed from: B, reason: collision with root package name */
    static final Pair f18142B = new Pair("", 0L);

    /* renamed from: A, reason: collision with root package name */
    public final B2 f18143A;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f18144c;

    /* renamed from: d, reason: collision with root package name */
    private Object f18145d;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f18146e;

    /* renamed from: f, reason: collision with root package name */
    public D2 f18147f;

    /* renamed from: g, reason: collision with root package name */
    public final A2 f18148g;

    /* renamed from: h, reason: collision with root package name */
    public final A2 f18149h;

    /* renamed from: i, reason: collision with root package name */
    public final C2 f18150i;

    /* renamed from: j, reason: collision with root package name */
    private String f18151j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18152k;

    /* renamed from: l, reason: collision with root package name */
    private long f18153l;

    /* renamed from: m, reason: collision with root package name */
    public final A2 f18154m;

    /* renamed from: n, reason: collision with root package name */
    public final C2470x2 f18155n;

    /* renamed from: o, reason: collision with root package name */
    public final C2 f18156o;

    /* renamed from: p, reason: collision with root package name */
    public final B2 f18157p;

    /* renamed from: q, reason: collision with root package name */
    public final C2470x2 f18158q;

    /* renamed from: r, reason: collision with root package name */
    public final A2 f18159r;

    /* renamed from: s, reason: collision with root package name */
    public final A2 f18160s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18161t;

    /* renamed from: u, reason: collision with root package name */
    public C2470x2 f18162u;

    /* renamed from: v, reason: collision with root package name */
    public C2470x2 f18163v;

    /* renamed from: w, reason: collision with root package name */
    public A2 f18164w;

    /* renamed from: x, reason: collision with root package name */
    public final C2 f18165x;

    /* renamed from: y, reason: collision with root package name */
    public final C2 f18166y;

    /* renamed from: z, reason: collision with root package name */
    public final A2 f18167z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2484z2(S2 s22) {
        super(s22);
        this.f18145d = new Object();
        this.f18154m = new A2(this, "session_timeout", 1800000L);
        this.f18155n = new C2470x2(this, "start_new_session", true);
        this.f18159r = new A2(this, "last_pause_time", 0L);
        this.f18160s = new A2(this, "session_id", 0L);
        this.f18156o = new C2(this, "non_personalized_ads", null);
        this.f18157p = new B2(this, "last_received_uri_timestamps_by_source", null);
        this.f18158q = new C2470x2(this, "allow_remote_dynamite", false);
        this.f18148g = new A2(this, "first_open_time", 0L);
        this.f18149h = new A2(this, "app_install_time", 0L);
        this.f18150i = new C2(this, "app_instance_id", null);
        this.f18162u = new C2470x2(this, "app_backgrounded", false);
        this.f18163v = new C2470x2(this, "deep_link_retrieval_complete", false);
        this.f18164w = new A2(this, "deep_link_retrieval_attempts", 0L);
        this.f18165x = new C2(this, "firebase_feature_rollouts", null);
        this.f18166y = new C2(this, "deferred_attribution_cache", null);
        this.f18167z = new A2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f18143A = new B2(this, "default_event_parameters", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A(C2453v c2453v) {
        k();
        if (A3.l(c2453v.a(), L().a())) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("dma_consent_settings", c2453v.j());
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B(A3 a32) {
        k();
        int b9 = a32.b();
        if (v(b9)) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("consent_settings", a32.x());
            edit.putInt("consent_source", b9);
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean C(C2487z5 c2487z5) {
        k();
        String string = J().getString("stored_tcf_param", "");
        String g8 = c2487z5.g();
        if (!g8.equals(string)) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("stored_tcf_param", g8);
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean D() {
        SharedPreferences sharedPreferences = this.f18144c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(Boolean bool) {
        k();
        SharedPreferences.Editor edit = J().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(String str) {
        k();
        SharedPreferences.Editor edit = J().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(boolean z8) {
        k();
        a().K().b("App measurement setting deferred collection", Boolean.valueOf(z8));
        SharedPreferences.Editor edit = J().edit();
        edit.putBoolean("deferred_analytics_collection", z8);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences H() {
        k();
        m();
        if (this.f18146e == null) {
            synchronized (this.f18145d) {
                try {
                    if (this.f18146e == null) {
                        String str = w().getPackageName() + "_preferences";
                        a().K().b("Default prefs file", str);
                        this.f18146e = w().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f18146e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(String str) {
        k();
        SharedPreferences.Editor edit = J().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences J() {
        k();
        m();
        AbstractC1396p.l(this.f18144c);
        return this.f18144c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SparseArray K() {
        Bundle a9 = this.f18157p.a();
        if (a9 == null) {
            return new SparseArray();
        }
        int[] intArray = a9.getIntArray("uriSources");
        long[] longArray = a9.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                a().G().a("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < intArray.length; i8++) {
                sparseArray.put(intArray[i8], Long.valueOf(longArray[i8]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2453v L() {
        k();
        return C2453v.c(J().getString("dma_consent_settings", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A3 M() {
        k();
        return A3.e(J().getString("consent_settings", "G1"), J().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean N() {
        k();
        if (!J().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(J().getBoolean("use_service", false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean O() {
        k();
        if (J().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(J().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean P() {
        k();
        if (J().contains("measurement_enabled")) {
            return Boolean.valueOf(J().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String Q() {
        k();
        String string = J().getString("previous_os_version", null);
        c().m();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String R() {
        k();
        return J().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String S() {
        k();
        return J().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T() {
        k();
        Boolean P8 = P();
        SharedPreferences.Editor edit = J().edit();
        edit.clear();
        edit.apply();
        if (P8 != null) {
            t(P8);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485z3
    protected final void l() {
        SharedPreferences sharedPreferences = w().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f18144c = sharedPreferences;
        boolean z8 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f18161t = z8;
        if (!z8) {
            SharedPreferences.Editor edit = this.f18144c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f18147f = new D2(this, "health_monitor", Math.max(0L, ((Long) G.f17291d.a(null)).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485z3
    protected final boolean q() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair r(String str) {
        k();
        if (!M().m(A3.a.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long elapsedRealtime = x().elapsedRealtime();
        if (this.f18151j != null && elapsedRealtime < this.f18153l) {
            return new Pair(this.f18151j, Boolean.valueOf(this.f18152k));
        }
        this.f18153l = elapsedRealtime + b().C(str);
        G.a.b(true);
        try {
            a.C0040a a9 = G.a.a(w());
            this.f18151j = "";
            String a10 = a9.a();
            if (a10 != null) {
                this.f18151j = a10;
            }
            this.f18152k = a9.b();
        } catch (Exception e8) {
            a().F().b("Unable to get advertising id", e8);
            this.f18151j = "";
        }
        G.a.b(false);
        return new Pair(this.f18151j, Boolean.valueOf(this.f18152k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(SparseArray sparseArray) {
        if (sparseArray == null) {
            this.f18157p.b(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            iArr[i8] = sparseArray.keyAt(i8);
            jArr[i8] = ((Long) sparseArray.valueAt(i8)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f18157p.b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(Boolean bool) {
        k();
        SharedPreferences.Editor edit = J().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(boolean z8) {
        k();
        SharedPreferences.Editor edit = J().edit();
        edit.putBoolean("use_service", z8);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v(int i8) {
        return A3.l(i8, J().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z(long j8) {
        if (j8 - this.f18154m.a() > this.f18159r.a()) {
            return true;
        }
        return false;
    }
}
