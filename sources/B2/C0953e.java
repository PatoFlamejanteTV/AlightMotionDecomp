package B2;

import B2.y;
import Q5.s;
import R5.Q;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: B2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0953e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f420g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static volatile UUID f421h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f422i;

    /* renamed from: j, reason: collision with root package name */
    private static final N5.a f423j;

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f424a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f425b;

    /* renamed from: c, reason: collision with root package name */
    private final String f426c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f427d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f428e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f429f;

    /* renamed from: B2.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final UUID a() {
            return C0953e.f421h;
        }

        public final void b(UUID id) {
            AbstractC3292y.i(id, "id");
            C0953e.f421h = id;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        UUID randomUUID = UUID.randomUUID();
        AbstractC3292y.h(randomUUID, "randomUUID(...)");
        f421h = randomUUID;
        f422i = Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL;
        f423j = new N5.a() { // from class: B2.d
            @Override // N5.a
            public final Object get() {
                String b9;
                b9 = C0953e.b();
                return b9;
            }
        };
    }

    public C0953e(PackageManager packageManager, PackageInfo packageInfo, String packageName, N5.a publishableKeyProvider, N5.a networkTypeProvider, N5.a pluginTypeProvider) {
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(networkTypeProvider, "networkTypeProvider");
        AbstractC3292y.i(pluginTypeProvider, "pluginTypeProvider");
        this.f424a = packageManager;
        this.f425b = packageInfo;
        this.f426c = packageName;
        this.f427d = publishableKeyProvider;
        this.f428e = networkTypeProvider;
        this.f429f = pluginTypeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b() {
        return E2.e.f1559a.a();
    }

    private final Map f(InterfaceC0949a interfaceC0949a) {
        return Q.q(Q.q(l(), e()), j(interfaceC0949a));
    }

    private final CharSequence h(PackageInfo packageInfo, PackageManager packageManager) {
        CharSequence charSequence;
        ApplicationInfo applicationInfo;
        CharSequence charSequence2 = null;
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            charSequence = applicationInfo.loadLabel(packageManager);
        } else {
            charSequence = null;
        }
        if (charSequence != null && !l6.n.T(charSequence)) {
            charSequence2 = charSequence;
        }
        if (charSequence2 == null) {
            return this.f426c;
        }
        return charSequence2;
    }

    private final Map i() {
        String str = (String) this.f428e.get();
        if (str == null) {
            return Q.h();
        }
        return Q.e(Q5.x.a("network_type", str));
    }

    private final Map j(InterfaceC0949a interfaceC0949a) {
        return Q.e(Q5.x.a(NotificationCompat.CATEGORY_EVENT, interfaceC0949a.a()));
    }

    private final Map k() {
        Map e8;
        String str = (String) this.f429f.get();
        if (str == null || (e8 = Q.e(Q5.x.a("plugin_type", str))) == null) {
            return Q.h();
        }
        return e8;
    }

    private final Map l() {
        Object b9;
        Q5.r a9 = Q5.x.a("analytics_ua", "analytics.stripe_android-1.0");
        try {
            s.a aVar = Q5.s.f8810b;
            b9 = Q5.s.b((String) this.f427d.get());
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        if (Q5.s.g(b9)) {
            b9 = "pk_undefined";
        }
        return Q.q(Q.q(Q.k(a9, Q5.x.a("publishable_key", b9), Q5.x.a("os_name", Build.VERSION.CODENAME), Q5.x.a("os_release", Build.VERSION.RELEASE), Q5.x.a("os_version", Integer.valueOf(Build.VERSION.SDK_INT)), Q5.x.a("device_type", f422i), Q5.x.a("bindings_version", "20.51.0"), Q5.x.a("is_development", Boolean.FALSE), Q5.x.a("session_id", f421h), Q5.x.a("locale", Locale.getDefault().toString())), i()), k());
    }

    public final Map e() {
        PackageInfo packageInfo;
        PackageManager packageManager = this.f424a;
        if (packageManager != null && (packageInfo = this.f425b) != null) {
            return Q.k(Q5.x.a("app_name", h(packageInfo, packageManager)), Q5.x.a("app_version", Integer.valueOf(this.f425b.versionCode)));
        }
        return Q.h();
    }

    public final C0950b g(InterfaceC0949a event, Map additionalParams) {
        AbstractC3292y.i(event, "event");
        AbstractC3292y.i(additionalParams, "additionalParams");
        return new C0950b(Q.q(f(event), additionalParams), y.a.f539d.b());
    }

    public /* synthetic */ C0953e(PackageManager packageManager, PackageInfo packageInfo, String str, N5.a aVar, N5.a aVar2, N5.a aVar3, int i8, AbstractC3284p abstractC3284p) {
        this(packageManager, packageInfo, str, aVar, aVar2, (i8 & 32) != 0 ? f423j : aVar3);
    }
}
