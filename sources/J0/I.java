package J0;

import J0.J;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class I implements J {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f3862g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f3863h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    private final K f3864a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3865b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3866c;

    /* renamed from: d, reason: collision with root package name */
    private final d1.e f3867d;

    /* renamed from: e, reason: collision with root package name */
    private final D f3868e;

    /* renamed from: f, reason: collision with root package name */
    private J.a f3869f;

    public I(Context context, String str, d1.e eVar, D d8) {
        if (context != null) {
            if (str != null) {
                this.f3865b = context;
                this.f3866c = str;
                this.f3867d = eVar;
                this.f3868e = d8;
                this.f3864a = new K();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e8;
        e8 = e(UUID.randomUUID().toString());
        G0.g.f().i("Created new Crashlytics installation ID: " + e8 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e8).putString("firebase.installation.id", str).apply();
        return e8;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f3862g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        if (str != null && str.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f3863h, "");
    }

    private boolean n() {
        J.a aVar = this.f3869f;
        if (aVar != null && (aVar.e() != null || !this.f3868e.d())) {
            return false;
        }
        return true;
    }

    @Override // J0.J
    public synchronized J.a a() {
        String str;
        if (!n()) {
            return this.f3869f;
        }
        G0.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences q8 = AbstractC1253j.q(this.f3865b);
        String string = q8.getString("firebase.installation.id", null);
        G0.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f3868e.d()) {
            H d8 = d(false);
            G0.g.f().i("Fetched Firebase Installation ID: " + d8.b());
            if (d8.b() == null) {
                if (string == null) {
                    str = c();
                } else {
                    str = string;
                }
                d8 = new H(str, null);
            }
            if (Objects.equals(d8.b(), string)) {
                this.f3869f = J.a.a(l(q8), d8);
            } else {
                this.f3869f = J.a.a(b(d8.b(), q8), d8);
            }
        } else if (k(string)) {
            this.f3869f = J.a.b(l(q8));
        } else {
            this.f3869f = J.a.b(b(c(), q8));
        }
        G0.g.f().i("Install IDs: " + this.f3869f);
        return this.f3869f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:            G0.g.f().l("Error getting Firebase installation id.", r0);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public J0.H d(boolean r6) {
        /*
            r5 = this;
            K0.g.e()
            r0 = 10000(0x2710, double:4.9407E-320)
            r2 = 0
            if (r6 == 0) goto L26
            d1.e r6 = r5.f3867d     // Catch: java.lang.Exception -> L1c
            r3 = 0
            com.google.android.gms.tasks.Task r6 = r6.a(r3)     // Catch: java.lang.Exception -> L1c
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L1c
            java.lang.Object r6 = q0.AbstractC3628n.b(r6, r0, r3)     // Catch: java.lang.Exception -> L1c
            com.google.firebase.installations.g r6 = (com.google.firebase.installations.g) r6     // Catch: java.lang.Exception -> L1c
            java.lang.String r6 = r6.b()     // Catch: java.lang.Exception -> L1c
            goto L27
        L1c:
            r6 = move-exception
            G0.g r3 = G0.g.f()
            java.lang.String r4 = "Error getting Firebase authentication token."
            r3.l(r4, r6)
        L26:
            r6 = r2
        L27:
            d1.e r3 = r5.f3867d     // Catch: java.lang.Exception -> L37
            com.google.android.gms.tasks.Task r3 = r3.getId()     // Catch: java.lang.Exception -> L37
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L37
            java.lang.Object r0 = q0.AbstractC3628n.b(r3, r0, r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L37
            r2 = r0
            goto L41
        L37:
            r0 = move-exception
            G0.g r1 = G0.g.f()
            java.lang.String r3 = "Error getting Firebase installation id."
            r1.l(r3, r0)
        L41:
            J0.H r0 = new J0.H
            r0.<init>(r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.I.d(boolean):J0.H");
    }

    public String f() {
        return this.f3866c;
    }

    public String g() {
        return this.f3864a.a(this.f3865b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
