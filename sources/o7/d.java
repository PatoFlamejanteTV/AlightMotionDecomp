package O7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: h, reason: collision with root package name */
    protected static final String f7916h = M7.b.i(d.class);

    /* renamed from: a, reason: collision with root package name */
    private final M7.e f7917a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7918b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageManager f7919c;

    /* renamed from: d, reason: collision with root package name */
    private final SharedPreferences f7920d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7921e;

    /* renamed from: f, reason: collision with root package name */
    private String f7922f;

    /* renamed from: g, reason: collision with root package name */
    private final PackageInfo f7923g;

    /* loaded from: classes5.dex */
    public interface a {

        /* renamed from: O7.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0153a implements a {
            @Override // O7.d.a
            public boolean a() {
                return false;
            }

            @Override // O7.d.a
            public String b() {
                return null;
            }
        }

        boolean a();

        String b();
    }

    public d(M7.e eVar) {
        this(eVar, b(eVar.c().c()));
    }

    private static PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e8) {
            V7.a.b(f7916h).d(e8);
            throw new RuntimeException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z8, M7.d dVar, a aVar) {
        if (z8) {
            try {
                Thread.sleep(3000L);
            } catch (Exception e8) {
                V7.a.b("ContentValues").d(e8);
            }
        }
        g(dVar, aVar);
    }

    private void g(M7.d dVar, a aVar) {
        String string;
        String str = f7916h;
        V7.a.b(str).a("Tracking app download...", new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(this.f7923g.packageName);
        sb.append(":");
        sb.append(c());
        String b9 = aVar.b();
        if (b9 != null) {
            sb.append("/");
            sb.append(b9);
        }
        String installerPackageName = this.f7919c.getInstallerPackageName(this.f7923g.packageName);
        if (installerPackageName != null && installerPackageName.length() > 200) {
            installerPackageName = installerPackageName.substring(0, 200);
        }
        if (installerPackageName != null && installerPackageName.equals("com.android.vending") && (string = this.f7917a.c().g().getString("referrer.extras", null)) != null) {
            installerPackageName = installerPackageName + "/?" + string;
        }
        if (installerPackageName != null) {
            installerPackageName = "http://" + installerPackageName;
        }
        this.f7917a.k(dVar.c(M7.c.EVENT_CATEGORY, "Application").c(M7.c.EVENT_ACTION, "downloaded").c(M7.c.ACTION_NAME, "application/downloaded").c(M7.c.URL_PATH, "/application/downloaded").c(M7.c.DOWNLOAD, sb.toString()).c(M7.c.REFERRER, installerPackageName));
        V7.a.b(str).a("... app download tracked.", new Object[0]);
    }

    public String c() {
        String str = this.f7922f;
        if (str != null) {
            return str;
        }
        return Integer.toString(this.f7923g.versionCode);
    }

    public void e(String str) {
        this.f7922f = str;
    }

    public void f(final M7.d dVar, final a aVar) {
        final boolean z8;
        if (this.f7921e && "com.android.vending".equals(this.f7919c.getInstallerPackageName(this.f7923g.packageName))) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            V7.a.b(f7916h).a("Google Play is install source, deferring tracking.", new Object[0]);
        }
        Thread thread = new Thread(new Runnable() { // from class: O7.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.d(z8, dVar, aVar);
            }
        });
        if (!z8 && !aVar.a()) {
            thread.run();
        } else {
            thread.start();
        }
    }

    public void h(M7.d dVar, a aVar) {
        String str = "downloaded:" + this.f7923g.packageName + ":" + c();
        synchronized (this.f7918b) {
            try {
                if (!this.f7920d.getBoolean(str, false)) {
                    this.f7920d.edit().putBoolean(str, true).apply();
                    f(dVar, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public d(M7.e eVar, PackageInfo packageInfo) {
        this.f7918b = new Object();
        this.f7917a = eVar;
        Context c8 = eVar.c().c();
        this.f7920d = eVar.g();
        this.f7919c = eVar.c().c().getPackageManager();
        this.f7923g = packageInfo;
        this.f7921e = packageInfo.packageName.equals(c8.getPackageName());
    }
}
