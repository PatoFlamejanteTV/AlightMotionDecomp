package Y7;

import J6.f;
import Q7.g;
import U7.j;
import U7.k;
import U7.m;
import U7.o;
import U7.q;
import U7.s;
import U7.u;
import U7.v;
import U7.w;
import U7.x;
import W7.l;
import android.app.Application;
import android.net.ConnectivityManager;
import androidx.core.os.ConfigurationCompat;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.data.model.ChoiceStyle;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import v1.C4119a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public static k f13150A;

    /* renamed from: B, reason: collision with root package name */
    public static s f13151B;

    /* renamed from: b, reason: collision with root package name */
    public static Application f13153b;

    /* renamed from: c, reason: collision with root package name */
    public static T7.a f13154c;

    /* renamed from: e, reason: collision with root package name */
    public static S7.b f13156e;

    /* renamed from: f, reason: collision with root package name */
    public static S7.c f13157f;

    /* renamed from: g, reason: collision with root package name */
    public static D5.s f13158g;

    /* renamed from: h, reason: collision with root package name */
    public static f f13159h;

    /* renamed from: i, reason: collision with root package name */
    public static SharedStorage f13160i;

    /* renamed from: j, reason: collision with root package name */
    public static T7.b f13161j;

    /* renamed from: k, reason: collision with root package name */
    public static g f13162k;

    /* renamed from: l, reason: collision with root package name */
    public static L5.c f13163l;

    /* renamed from: m, reason: collision with root package name */
    public static H6.a f13164m;

    /* renamed from: o, reason: collision with root package name */
    public static C4119a f13166o;

    /* renamed from: p, reason: collision with root package name */
    public static W7.c f13167p;

    /* renamed from: q, reason: collision with root package name */
    public static q f13168q;

    /* renamed from: r, reason: collision with root package name */
    public static U7.c f13169r;

    /* renamed from: s, reason: collision with root package name */
    public static U7.f f13170s;

    /* renamed from: t, reason: collision with root package name */
    public static j f13171t;

    /* renamed from: u, reason: collision with root package name */
    public static u f13172u;

    /* renamed from: v, reason: collision with root package name */
    public static w f13173v;

    /* renamed from: w, reason: collision with root package name */
    public static m f13174w;

    /* renamed from: x, reason: collision with root package name */
    public static o f13175x;

    /* renamed from: y, reason: collision with root package name */
    public static U7.g f13176y;

    /* renamed from: z, reason: collision with root package name */
    public static U7.a f13177z;

    /* renamed from: a, reason: collision with root package name */
    public static final d f13152a = new d();

    /* renamed from: d, reason: collision with root package name */
    public static ChoiceStyle f13155d = new ChoiceStyle();

    /* renamed from: n, reason: collision with root package name */
    public static String f13165n = "";

    public final Locale a() {
        if (f13153b != null) {
            Locale locale = ConfigurationCompat.getLocales(b().getResources().getConfiguration()).get(0);
            if (locale == null) {
                locale = Locale.US;
            }
            AbstractC3292y.h(locale, "{\n            Configurat…0] ?: Locale.US\n        }");
            return locale;
        }
        Locale locale2 = Locale.US;
        AbstractC3292y.h(locale2, "{\n            Locale.US\n        }");
        return locale2;
    }

    public final Application b() {
        Application application = f13153b;
        if (application != null) {
            return application;
        }
        AbstractC3292y.y(MimeTypes.BASE_TYPE_APPLICATION);
        return null;
    }

    public final U7.f c() {
        if (f13170s == null) {
            f13170s = new U7.f(m(), n(), ChoiceCmp.INSTANCE.getCallback());
        }
        U7.f fVar = f13170s;
        if (fVar == null) {
            AbstractC3292y.y("consentRepository_");
            return null;
        }
        return fVar;
    }

    public final W7.c d() {
        if (f13167p == null) {
            f13167p = new W7.c();
        }
        W7.c cVar = f13167p;
        if (cVar == null) {
            AbstractC3292y.y("coreUiLabelsResolver");
            return null;
        }
        return cVar;
    }

    public final L5.c e() {
        L5.c cVar = f13163l;
        if (cVar == null) {
            return new L5.c(null, null, null, 7);
        }
        return cVar;
    }

    public final j f() {
        if (f13171t == null) {
            f13171t = new j(m(), ChoiceCmp.INSTANCE.getCallback());
        }
        j jVar = f13171t;
        if (jVar == null) {
            AbstractC3292y.y("gbcConsentRepository_");
            return null;
        }
        return jVar;
    }

    public final C4119a g() {
        if (f13166o == null) {
            f13166o = new C4119a();
        }
        C4119a c4119a = f13166o;
        if (c4119a == null) {
            AbstractC3292y.y("gppModel");
            return null;
        }
        return c4119a;
    }

    public final H6.a h() {
        H6.a aVar = f13164m;
        if (aVar == null) {
            return new H6.a(null, null, null, null, 15);
        }
        return aVar;
    }

    public final T7.a i() {
        if (f13154c == null) {
            Object systemService = b().getSystemService("connectivity");
            if (systemService != null) {
                f13154c = new T7.a((ConnectivityManager) systemService);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
        }
        T7.a aVar = f13154c;
        if (aVar == null) {
            AbstractC3292y.y("networkUtil_");
            return null;
        }
        return aVar;
    }

    public final f j() {
        f fVar = f13159h;
        if (fVar == null) {
            return new f(null, null, null, null, null, null, 63);
        }
        return fVar;
    }

    public final u k() {
        if (f13172u == null) {
            T7.a i8 = i();
            SharedStorage m8 = m();
            T7.b l8 = l();
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            f13172u = new v(i8, m8, l8, new l(choiceCmp.getCallback(), d()), choiceCmp.getAppPackageId(), choiceCmp.getPCode());
        }
        u uVar = f13172u;
        if (uVar == null) {
            AbstractC3292y.y("portalConfigRepository_");
            return null;
        }
        return uVar;
    }

    public final T7.b l() {
        if (f13161j == null) {
            f13161j = new T7.c();
        }
        T7.b bVar = f13161j;
        if (bVar == null) {
            AbstractC3292y.y("requestApi_");
            return null;
        }
        return bVar;
    }

    public final SharedStorage m() {
        if (f13160i == null) {
            f13160i = new SharedStorage(b());
        }
        SharedStorage sharedStorage = f13160i;
        if (sharedStorage == null) {
            AbstractC3292y.y("storage_");
            return null;
        }
        return sharedStorage;
    }

    public final D5.s n() {
        if (f13158g == null) {
            f13158g = new D5.s(null);
        }
        D5.s sVar = f13158g;
        if (sVar == null) {
            AbstractC3292y.y("tcModel");
            return null;
        }
        return sVar;
    }

    public final g o() {
        J6.a aVar;
        if (f13162k == null) {
            D5.s n8 = n();
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            f portalConfig$app_release = choiceCmp.getPortalConfig$app_release();
            if (portalConfig$app_release == null) {
                aVar = null;
            } else {
                aVar = portalConfig$app_release.f4497b;
            }
            f13162k = new g(n8, aVar, i(), l(), choiceCmp.getCallback(), choiceCmp.getAppPackageId());
        }
        g gVar = f13162k;
        if (gVar == null) {
            AbstractC3292y.y("tracking");
            return null;
        }
        return gVar;
    }

    public final w p() {
        if (f13173v == null) {
            f13173v = new x(a(), i(), m(), l(), new W7.m(d()));
        }
        w wVar = f13173v;
        if (wVar == null) {
            AbstractC3292y.y("translationsTextRepository_");
            return null;
        }
        return wVar;
    }
}
