package g5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import h5.AbstractC2952c;
import h5.C2954e;
import h5.k;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2919a {

    /* renamed from: i, reason: collision with root package name */
    public static final C0748a f32449i = new C0748a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f32450a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32451b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32452c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32453d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32454e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32455f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32456g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32457h;

    /* renamed from: g5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0748a {
        public C0748a(AbstractC3284p abstractC3284p) {
        }
    }

    /* renamed from: g5.a$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f32458a = Build.MODEL;

        /* renamed from: b, reason: collision with root package name */
        public final String f32459b = Build.MANUFACTURER;

        /* renamed from: c, reason: collision with root package name */
        public final String f32460c = Build.BRAND;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            String str = this.f32458a;
            if (str != null && str.length() != 0) {
                jSONObject.put("model", this.f32458a);
            }
            String str2 = this.f32459b;
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("manufacturer", this.f32459b);
            }
            String str3 = this.f32460c;
            if (str3 != null && str3.length() != 0) {
                jSONObject.put("brand", this.f32460c);
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        }
    }

    public C2919a(Context context, String token) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(token, "token");
        this.f32450a = token;
        this.f32451b = -1L;
        this.f32452c = -1L;
        this.f32451b = new C2954e(context).a();
        String country = Locale.getDefault().getCountry();
        this.f32453d = country;
        if (country == null || country.length() == 0) {
            Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            this.f32453d = ((TelephonyManager) systemService).getNetworkCountryIso();
        }
        k kVar = k.f32654a;
        String packageName = context.getPackageName();
        AbstractC3292y.h(packageName, "context.packageName");
        this.f32454e = kVar.a(context, packageName);
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3292y.h(packageManager, "context.packageManager");
            String packageName2 = context.getPackageName();
            AbstractC3292y.h(packageName2, "context.packageName");
            PackageInfo a9 = AbstractC2952c.a(packageManager, packageName2, 0);
            this.f32452c = kVar.e(a9);
            if (kVar.g(a9)) {
                this.f32456g = 1;
            } else {
                this.f32456g = 0;
            }
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
        }
        long j8 = this.f32452c;
        long j9 = this.f32451b;
        if (j8 > j9) {
            if (j9 == -1) {
                this.f32455f = 0;
            } else {
                this.f32455f = 1;
            }
        } else {
            this.f32455f = 0;
        }
        this.f32457h = Locale.getDefault().getLanguage();
    }

    public final JSONObject a(Context context) {
        boolean z8;
        AbstractC3292y.i(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f32450a);
        jSONObject.put("sdkVersion", Build.VERSION.SDK_INT);
        String str = this.f32453d;
        if (str != null && str.length() != 0) {
            String str2 = this.f32453d;
            AbstractC3292y.f(str2);
            String upperCase = str2.toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "toUpperCase(...)");
            jSONObject.put("countryCode", upperCase);
        }
        String str3 = this.f32454e;
        if (str3 != null && str3.length() != 0) {
            jSONObject.put("installer", this.f32454e);
        }
        jSONObject.put("update", this.f32455f);
        jSONObject.put("isSystemApp", this.f32456g);
        JSONObject a9 = new b().a();
        if (a9 != null) {
            jSONObject.put("device", a9);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            if (strArr.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                JSONArray jSONArray = new JSONArray();
                for (String str4 : strArr) {
                    jSONArray.put(str4);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("abis", jSONArray);
                }
            }
        }
        String str5 = this.f32457h;
        if (str5 != null && str5.length() != 0) {
            jSONObject.put("deviceLanguageCode", this.f32457h);
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            jSONObject.put("identifier", string);
        }
        return jSONObject;
    }
}
