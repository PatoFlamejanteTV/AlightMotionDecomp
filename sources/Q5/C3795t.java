package q5;

import Q5.I;
import android.content.Context;
import android.os.Bundle;
import c5.C2053s;
import c5.K;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3795t {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37308a;

    /* renamed from: b, reason: collision with root package name */
    private FirebaseAnalytics f37309b;

    /* renamed from: c, reason: collision with root package name */
    private M7.e f37310c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f37311d = new Object();

    public C3795t(Context context) {
        this.f37308a = context;
        if (context != null) {
            com.google.firebase.crashlytics.a b9 = com.google.firebase.crashlytics.a.b();
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            b9.e(aVar.P(context));
            if (aVar.L(context)) {
                this.f37309b = FirebaseAnalytics.getInstance(context);
                c(context);
            } else {
                this.f37309b = null;
                a();
            }
        }
    }

    private final void a() {
        synchronized (this.f37311d) {
            this.f37310c = null;
            I i8 = I.f8786a;
        }
    }

    private final M7.e c(Context context) {
        M7.e eVar;
        synchronized (this.f37311d) {
            try {
                if (this.f37310c == null) {
                    this.f37310c = M7.f.b("https://m.uptodown.net/matomo.php", 6).a(M7.b.f6239e.a(context));
                }
                eVar = this.f37310c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final void b() {
        if (this.f37310c != null && this.f37308a != null) {
            O7.f.c().a().a(this.f37310c);
        }
    }

    public final void d(String event) {
        AbstractC3292y.i(event, "event");
        FirebaseAnalytics firebaseAnalytics = this.f37309b;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(event, null);
        }
    }

    public final void e(String event, Bundle params) {
        AbstractC3292y.i(event, "event");
        AbstractC3292y.i(params, "params");
        FirebaseAnalytics firebaseAnalytics = this.f37309b;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(event, params);
        }
        C2053s.f15944d.g(event, params, this.f37308a);
    }

    public final void f(String eventName, K responseJson) {
        AbstractC3292y.i(eventName, "eventName");
        AbstractC3292y.i(responseJson, "responseJson");
        Bundle bundle = new Bundle();
        if (responseJson.e() > 0) {
            bundle.putString("responseCode", String.valueOf(responseJson.e()));
        }
        if (responseJson.c() != null) {
            bundle.putString("exception", responseJson.c());
        }
        e(eventName, bundle);
    }

    public final void g(String name) {
        AbstractC3292y.i(name, "name");
        if (this.f37310c != null) {
            O7.f.c().b(name).c(this.f37310c);
        }
    }

    public final void h(String type, Bundle bundle, K k8, String str) {
        AbstractC3292y.i(type, "type");
        Bundle bundle2 = new Bundle();
        if (bundle == null) {
            bundle = bundle2;
        }
        if (k8 != null) {
            if (k8.e() > 0) {
                bundle.putString("responseCode", String.valueOf(k8.e()));
            }
            if (k8.c() != null) {
                bundle.putString("exception", k8.c());
            }
        }
        if (str != null) {
            bundle.putString("workRequest", str);
        }
        bundle.putString("type", type);
        e("tracking", bundle);
    }
}
