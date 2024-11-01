package c5;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c5.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2052q {

    /* renamed from: a, reason: collision with root package name */
    private String f15899a;

    /* renamed from: b, reason: collision with root package name */
    private String f15900b;

    /* renamed from: c, reason: collision with root package name */
    private String f15901c;

    /* renamed from: d, reason: collision with root package name */
    private String f15902d;

    /* renamed from: e, reason: collision with root package name */
    private String f15903e;

    /* renamed from: f, reason: collision with root package name */
    private String f15904f;

    /* renamed from: g, reason: collision with root package name */
    private String f15905g;

    /* renamed from: h, reason: collision with root package name */
    private int f15906h;

    /* renamed from: i, reason: collision with root package name */
    private int f15907i;

    /* renamed from: j, reason: collision with root package name */
    private int f15908j;

    /* renamed from: k, reason: collision with root package name */
    private float f15909k;

    /* renamed from: l, reason: collision with root package name */
    private String f15910l;

    /* renamed from: m, reason: collision with root package name */
    private long f15911m;

    /* renamed from: n, reason: collision with root package name */
    private String[] f15912n;

    /* renamed from: o, reason: collision with root package name */
    private String[] f15913o;

    /* renamed from: p, reason: collision with root package name */
    private String[] f15914p;

    /* renamed from: q, reason: collision with root package name */
    private String f15915q;

    /* renamed from: r, reason: collision with root package name */
    private int f15916r;

    /* renamed from: s, reason: collision with root package name */
    private String f15917s;

    /* renamed from: t, reason: collision with root package name */
    private int f15918t;

    public final String a() {
        String str = this.f15899a + this.f15906h;
        if (this.f15900b != null) {
            str = str + this.f15900b;
        }
        if (this.f15902d != null) {
            str = str + this.f15902d;
        }
        return S4.d.f9430a.c(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:            if (r0.equals(com.mbridge.msdk.MBridgeConstans.ENDCARD_URL_TYPE_PL) != false) goto L16;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r5)
            java.lang.String r5 = "success"
            boolean r1 = r0.isNull(r5)
            r2 = 0
            if (r1 != 0) goto L6f
            int r5 = r0.getInt(r5)
            r1 = 1
            if (r5 != r1) goto L6f
            java.lang.String r5 = "data"
            org.json.JSONObject r5 = r0.getJSONObject(r5)
            java.lang.String r0 = "sdk"
            boolean r3 = r5.isNull(r0)
            if (r3 != 0) goto L31
            int r3 = r4.f15906h
            int r0 = r5.getInt(r0)
            if (r3 != r0) goto L31
            r2 = 1
        L31:
            if (r2 == 0) goto L6f
            java.lang.String r0 = "userID"
            boolean r1 = r5.isNull(r0)
            r2 = 0
            if (r1 != 0) goto L48
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = "0"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L49
        L48:
            r0 = r2
        L49:
            q5.m r1 = new q5.m
            r1.<init>()
            java.lang.String r3 = r4.f15900b
            boolean r0 = r1.s(r0, r3)
            if (r0 == 0) goto L6e
            java.lang.String r0 = "language"
            boolean r1 = r5.isNull(r0)
            if (r1 != 0) goto L62
            java.lang.String r2 = r5.getString(r0)
        L62:
            q5.m r5 = new q5.m
            r5.<init>()
            java.lang.String r0 = r4.f15902d
            boolean r2 = r5.s(r2, r0)
            goto L6f
        L6e:
            r2 = r0
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.C2052q.b(java.lang.String):boolean");
    }

    public final String c() {
        return this.f15901c;
    }

    public final String d() {
        return this.f15899a;
    }

    public final boolean e(r download) {
        AbstractC3292y.i(download, "download");
        if (download.b0() == null || this.f15912n == null) {
            return true;
        }
        String b02 = download.b0();
        AbstractC3292y.f(b02);
        String[] strArr = (String[]) new l6.j(",").i(b02, 0).toArray(new String[0]);
        String[] strArr2 = this.f15912n;
        AbstractC3292y.f(strArr2);
        for (String str : strArr2) {
            for (String str2 : strArr) {
                if (l6.n.s(str2, "universal", true) || l6.n.s(str, str2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(r download) {
        AbstractC3292y.i(download, "download");
        if (download.c0() != null) {
            ArrayList c02 = download.c0();
            AbstractC3292y.f(c02);
            if (c02.size() > 0) {
                ArrayList c03 = download.c0();
                AbstractC3292y.f(c03);
                Iterator it = c03.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    String str = (String) next;
                    if (Integer.parseInt(str) == this.f15918t || Integer.parseInt(str) == 65534 || Integer.parseInt(str) == 65535) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean g(r download) {
        AbstractC3292y.i(download, "download");
        if (download.W() <= this.f15906h) {
            return true;
        }
        return false;
    }

    public final void h(Context context) {
        String str;
        AbstractC3292y.i(context, "context");
        this.f15899a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        T e8 = T.f15689k.e(context);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null) {
            this.f15900b = e8.getId();
        } else {
            this.f15900b = null;
        }
        this.f15906h = Build.VERSION.SDK_INT;
        if (new L4.a(context).l()) {
            this.f15916r = 1;
        }
    }

    public final void i(Context context) {
        AbstractC3292y.i(context, "context");
        h(context);
        this.f15907i = context.getResources().getDisplayMetrics().widthPixels;
        this.f15908j = context.getResources().getDisplayMetrics().heightPixels;
        this.f15909k = context.getResources().getDisplayMetrics().density;
        this.f15918t = context.getResources().getDisplayMetrics().densityDpi;
        this.f15901c = Locale.getDefault().getCountry();
        this.f15902d = Locale.getDefault().getLanguage();
        this.f15903e = Build.BRAND;
        this.f15905g = Build.MANUFACTURER;
        this.f15904f = Build.MODEL;
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        this.f15910l = telephonyManager.getNetworkOperatorName();
        String str = this.f15901c;
        if (str == null || str.length() == 0) {
            this.f15901c = telephonyManager.getNetworkCountryIso();
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService2 = context.getSystemService("activity");
            AbstractC3292y.g(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager) systemService2).getMemoryInfo(memoryInfo);
            this.f15911m = memoryInfo.totalMem;
        } catch (Error e8) {
            e8.getMessage();
        } catch (Exception e9) {
            e9.getMessage();
        }
        this.f15912n = Build.SUPPORTED_ABIS;
        this.f15913o = Build.SUPPORTED_32_BIT_ABIS;
        this.f15914p = Build.SUPPORTED_64_BIT_ABIS;
        this.f15915q = context.getString(R.string.version, context.getString(R.string.app_name), "6.33", "633");
        this.f15917s = Build.HARDWARE;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f15899a);
        jSONObject.put("userID", this.f15900b);
        jSONObject.put("country", this.f15901c);
        jSONObject.put("language", this.f15902d);
        jSONObject.put("brand", this.f15903e);
        jSONObject.put("model", this.f15904f);
        jSONObject.put("manufacturer", this.f15905g);
        int i8 = this.f15906h;
        if (i8 > 0) {
            jSONObject.put("sdk", i8);
        }
        int i9 = this.f15907i;
        if (i9 > 0) {
            jSONObject.put("displayWidth", i9);
        }
        int i10 = this.f15908j;
        if (i10 > 0) {
            jSONObject.put("displayHeight", i10);
        }
        float f8 = this.f15909k;
        if (f8 > 0.0f) {
            jSONObject.put("displayDensity", f8);
        }
        long j8 = this.f15911m;
        if (j8 > 0) {
            jSONObject.put("ram", j8);
        }
        jSONObject.put("operador", this.f15910l);
        String[] strArr = this.f15912n;
        if (strArr != null && strArr.length != 0) {
            JSONArray jSONArray = new JSONArray();
            Iterator a9 = AbstractC3274f.a(strArr);
            while (a9.hasNext()) {
                jSONArray.put((String) a9.next());
            }
            jSONObject.put("supportedABIs", jSONArray);
        }
        String[] strArr2 = this.f15913o;
        if (strArr2 != null && strArr2.length != 0) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator a10 = AbstractC3274f.a(strArr2);
            while (a10.hasNext()) {
                jSONArray2.put((String) a10.next());
            }
            jSONObject.put("supported32BitsABIs", jSONArray2);
        }
        String[] strArr3 = this.f15914p;
        if (strArr3 != null && strArr3.length != 0) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator a11 = AbstractC3274f.a(strArr3);
            while (a11.hasNext()) {
                jSONArray3.put((String) a11.next());
            }
            jSONObject.put("supported64BitsABIs", jSONArray3);
        }
        jSONObject.put("appVersion", this.f15915q);
        jSONObject.put("rooted", this.f15916r);
        return jSONObject;
    }

    public String toString() {
        return "DeviceInfo(identifier=" + this.f15899a + ", userId=" + this.f15900b + ", country=" + this.f15901c + ", language=" + this.f15902d + ", brand=" + this.f15903e + ", model=" + this.f15904f + ", manufacturer=" + this.f15905g + ", sdk=" + this.f15906h + ", displayWidth=" + this.f15907i + ", displayHeight=" + this.f15908j + ", displayDensity=" + this.f15909k + ", operador=" + this.f15910l + ", ram=" + this.f15911m + ", supportedAbis=" + Arrays.toString(this.f15912n) + ", supported32BitsAbis=" + Arrays.toString(this.f15913o) + ", supported64BitsAbis=" + Arrays.toString(this.f15914p) + ", appVersion=" + this.f15915q + ", rooted=" + this.f15916r + ", hardware=" + this.f15917s + ')';
    }
}
