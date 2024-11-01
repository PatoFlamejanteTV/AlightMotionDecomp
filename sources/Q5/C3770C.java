package q5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import d5.ResultReceiverC2762e;
import d5.ResultReceiverC2763f;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3770C {

    /* renamed from: a, reason: collision with root package name */
    public static final C3770C f37260a = new C3770C();

    /* renamed from: b, reason: collision with root package name */
    private static ResultReceiverC2763f f37261b = new ResultReceiverC2763f(null);

    /* renamed from: c, reason: collision with root package name */
    private static ResultReceiverC2762e f37262c = new ResultReceiverC2762e(null);

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap f37263d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static ArrayList f37264e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private static ArrayList f37265f = new ArrayList();

    private C3770C() {
    }

    public final void a(long j8) {
        f37265f.add(Long.valueOf(j8));
    }

    public final void b(long j8) {
        f37264e.add(Long.valueOf(j8));
    }

    public final Spanned c(String str) {
        Spanned fromHtml;
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
            AbstractC3292y.h(fromHtml, "fromHtml(...)");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        AbstractC3292y.h(fromHtml2, "fromHtml(...)");
        return fromHtml2;
    }

    public final String d() {
        DateFormat timeInstance = DateFormat.getTimeInstance();
        timeInstance.setTimeZone(DesugarTimeZone.getTimeZone("gmt"));
        timeInstance.format(new Date(System.currentTimeMillis()));
        long timeInMillis = (timeInstance.getCalendar().getTimeInMillis() - (((r0.get(12) * MBridgeCommon.DEFAULT_LOAD_TIMEOUT) + (r0.get(13) * 1000)) + r0.get(14))) / 1000;
        return S4.d.f9430a.c("$(=a%·!45J&S" + timeInMillis);
    }

    public final ResultReceiverC2762e e() {
        return f37262c;
    }

    public final ResultReceiverC2763f f() {
        return f37261b;
    }

    public final boolean g(long j8) {
        return f37265f.contains(Long.valueOf(j8));
    }

    public final boolean h(long j8) {
        return f37264e.contains(Long.valueOf(j8));
    }

    public final Drawable i(Context context, String str) {
        AbstractC3292y.i(context, "context");
        return j(context, str, -1);
    }

    public final Drawable j(Context context, String str, int i8) {
        AbstractC3292y.i(context, "context");
        if (str != null) {
            Drawable drawable = (Drawable) f37263d.get(str);
            if (drawable == null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3292y.h(packageManager, "getPackageManager(...)");
                    drawable = S4.r.d(packageManager, str, 0).applicationInfo.loadIcon(context.getPackageManager());
                } catch (Exception unused) {
                    if (i8 != -1) {
                        drawable = ContextCompat.getDrawable(context, i8);
                    }
                }
                if (drawable != null) {
                    f37263d.put(str, drawable);
                    return drawable;
                }
                return drawable;
            }
            return drawable;
        }
        return null;
    }

    public final Drawable k(Context context, String pathFile, int i8) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(pathFile, "pathFile");
        Drawable drawable = (Drawable) f37263d.get(pathFile);
        if (drawable == null) {
            PackageManager packageManager = context.getPackageManager();
            try {
                AbstractC3292y.f(packageManager);
                PackageInfo c8 = S4.r.c(packageManager, pathFile, 128);
                if (c8 != null) {
                    ApplicationInfo applicationInfo = c8.applicationInfo;
                    applicationInfo.sourceDir = pathFile;
                    applicationInfo.publicSourceDir = pathFile;
                    drawable = applicationInfo.loadIcon(packageManager);
                } else {
                    drawable = ContextCompat.getDrawable(context, i8);
                }
            } catch (Exception unused) {
                if (i8 != -1) {
                    drawable = ContextCompat.getDrawable(context, i8);
                }
            }
            if (drawable != null) {
                f37263d.put(pathFile, drawable);
            }
        }
        return drawable;
    }

    public final void l(long j8) {
        f37264e.remove(Long.valueOf(j8));
    }

    public final void m(HttpsURLConnection mHttpsURLConnection) {
        AbstractC3292y.i(mHttpsURLConnection, "mHttpsURLConnection");
        mHttpsURLConnection.setRequestProperty("Identificador", "Uptodown_Android");
        mHttpsURLConnection.setRequestProperty("Identificador-Version", "633");
        mHttpsURLConnection.setRequestProperty("APIKEY", d());
        mHttpsURLConnection.setConnectTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        mHttpsURLConnection.setReadTimeout(90000);
    }
}
