package J0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import q0.C3626l;

/* loaded from: classes3.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f3835a;

    /* renamed from: b, reason: collision with root package name */
    private final A0.f f3836b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3837c;

    /* renamed from: d, reason: collision with root package name */
    C3626l f3838d;

    /* renamed from: e, reason: collision with root package name */
    boolean f3839e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3840f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f3841g;

    /* renamed from: h, reason: collision with root package name */
    private final C3626l f3842h;

    public D(A0.f fVar) {
        Object obj = new Object();
        this.f3837c = obj;
        this.f3838d = new C3626l();
        this.f3839e = false;
        this.f3840f = false;
        this.f3842h = new C3626l();
        Context k8 = fVar.k();
        this.f3836b = fVar;
        this.f3835a = AbstractC1253j.q(k8);
        Boolean b9 = b();
        this.f3841g = b9 == null ? a(k8) : b9;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f3838d.e(null);
                    this.f3839e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean g8 = g(context);
        if (g8 == null) {
            this.f3840f = false;
            return null;
        }
        this.f3840f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g8));
    }

    private Boolean b() {
        if (this.f3835a.contains("firebase_crashlytics_collection_enabled")) {
            this.f3840f = false;
            return Boolean.valueOf(this.f3835a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    private boolean e() {
        try {
            return this.f3836b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z8) {
        String str;
        String str2;
        if (z8) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f3841g == null) {
            str2 = "global Firebase setting";
        } else if (this.f3840f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        G0.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            G0.g.f().e("Could not read data collection permission from manifest", e8);
            return null;
        }
    }

    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public void c(boolean z8) {
        if (z8) {
            this.f3842h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean e8;
        try {
            Boolean bool = this.f3841g;
            if (bool != null) {
                e8 = bool.booleanValue();
            } else {
                e8 = e();
            }
            f(e8);
        } catch (Throwable th) {
            throw th;
        }
        return e8;
    }

    public synchronized void h(Boolean bool) {
        Boolean a9;
        if (bool != null) {
            try {
                this.f3840f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a9 = bool;
        } else {
            a9 = a(this.f3836b.k());
        }
        this.f3841g = a9;
        i(this.f3835a, bool);
        synchronized (this.f3837c) {
            try {
                if (d()) {
                    if (!this.f3839e) {
                        this.f3838d.e(null);
                        this.f3839e = true;
                    }
                } else if (this.f3839e) {
                    this.f3838d = new C3626l();
                    this.f3839e = false;
                }
            } finally {
            }
        }
    }

    public Task j() {
        Task a9;
        synchronized (this.f3837c) {
            a9 = this.f3838d.a();
        }
        return a9;
    }

    public Task k() {
        return K0.b.c(this.f3842h.a(), j());
    }
}
