package j3;

import Q5.r;
import Q5.x;
import R5.Q;
import android.os.Build;
import android.util.DisplayMetrics;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: j3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3157h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f33691g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f33692h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final DisplayMetrics f33693a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33694b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33695c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33696d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33697e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33698f;

    /* renamed from: j3.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b() {
            int convert = (int) TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS);
            if (convert % 60 == 0) {
                return String.valueOf(convert / 60);
            }
            String bigDecimal = new BigDecimal(convert).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
            AbstractC3292y.h(bigDecimal, "toString(...)");
            return bigDecimal;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3157h(DisplayMetrics displayMetrics, String packageName, String str, String timeZone) {
        AbstractC3292y.i(displayMetrics, "displayMetrics");
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(timeZone, "timeZone");
        this.f33693a = displayMetrics;
        this.f33694b = packageName;
        this.f33695c = str;
        this.f33696d = timeZone;
        this.f33697e = displayMetrics.widthPixels + "w_" + displayMetrics.heightPixels + "h_" + displayMetrics.densityDpi + "dpi";
        this.f33698f = "Android " + Build.VERSION.RELEASE + " " + Build.VERSION.CODENAME + " " + Build.VERSION.SDK_INT;
    }

    private final Map a() {
        String locale = Locale.getDefault().toString();
        AbstractC3292y.h(locale, "toString(...)");
        return Q.k(x.a("c", d(locale)), x.a("d", d(this.f33698f)), x.a("f", d(this.f33697e)), x.a("g", d(this.f33696d)));
    }

    private final Map c(C3153d c3153d) {
        String str;
        String str2;
        Map map = null;
        if (c3153d != null) {
            str = c3153d.b();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        r a9 = x.a("d", str);
        if (c3153d != null) {
            str2 = c3153d.h();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str3 = str2;
        }
        Map k8 = Q.k(a9, x.a("e", str3), x.a("k", this.f33694b), x.a("o", Build.VERSION.RELEASE), x.a(TtmlNode.TAG_P, Integer.valueOf(Build.VERSION.SDK_INT)), x.a(CampaignEx.JSON_KEY_AD_Q, Build.MANUFACTURER), x.a(CampaignEx.JSON_KEY_AD_R, Build.BRAND), x.a("s", Build.MODEL), x.a("t", Build.TAGS));
        String str4 = this.f33695c;
        if (str4 != null) {
            map = Q.e(x.a("l", str4));
        }
        if (map == null) {
            map = Q.h();
        }
        return Q.q(k8, map);
    }

    private final Map d(String str) {
        return Q.e(x.a("v", str));
    }

    public final /* synthetic */ Map b(C3153d c3153d) {
        return Q.k(x.a("v2", 1), x.a("tag", "20.51.0"), x.a("src", "android-sdk"), x.a("a", a()), x.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, c(c3153d)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3157h(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r1 = "getDisplayMetrics(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
            java.lang.String r1 = r4.getPackageName()
            if (r1 != 0) goto L1a
            java.lang.String r1 = ""
        L1a:
            E2.a r2 = E2.a.f1549a
            android.content.pm.PackageInfo r4 = r2.a(r4)
            if (r4 == 0) goto L25
            java.lang.String r4 = r4.versionName
            goto L26
        L25:
            r4 = 0
        L26:
            j3.h$a r2 = j3.C3157h.f33691g
            java.lang.String r2 = j3.C3157h.a.a(r2)
            r3.<init>(r0, r1, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C3157h.<init>(android.content.Context):void");
    }
}
