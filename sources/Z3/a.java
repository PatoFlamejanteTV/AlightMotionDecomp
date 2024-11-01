package Z3;

import Q5.I;
import Q5.r;
import Q5.s;
import Q5.t;
import Q5.x;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.Q;
import U5.g;
import a6.AbstractC1677b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.browser.trusted.sharing.ShareTarget;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.stripe.android.stripe3ds2.transaction.o;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;
import n6.N;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a implements Z3.c {

    /* renamed from: i, reason: collision with root package name */
    private static final C0270a f13219i = new C0270a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final String f13220j = StandardCharsets.UTF_8.name();

    /* renamed from: a, reason: collision with root package name */
    private final Context f13221a;

    /* renamed from: b, reason: collision with root package name */
    private final b f13222b;

    /* renamed from: c, reason: collision with root package name */
    private final g f13223c;

    /* renamed from: d, reason: collision with root package name */
    private final o f13224d;

    /* renamed from: e, reason: collision with root package name */
    private final Z3.d f13225e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13226f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13227g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13228h;

    /* renamed from: Z3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0270a {
        private C0270a() {
        }

        public /* synthetic */ C0270a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        Map a();
    }

    /* loaded from: classes4.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f13229a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Map f13230b = Q.h();

        private c() {
        }

        @Override // Z3.a.b
        public Map a() {
            return f13230b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f13231a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(r rVar) {
            AbstractC3292y.i(rVar, "<name for destructuring parameter 0>");
            return ((String) rVar.a()) + "=" + ((String) rVar.b());
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13232a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f13233b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f13235d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Throwable th, U5.d dVar) {
            super(2, dVar);
            this.f13235d = th;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            e eVar = new e(this.f13235d, dVar);
            eVar.f13233b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            V5.b.e();
            if (this.f13232a == 0) {
                t.b(obj);
                a aVar = a.this;
                Throwable th = this.f13235d;
                try {
                    s.a aVar2 = s.f8810b;
                    aVar.k(aVar.d(th));
                    b9 = s.b(I.f8786a);
                } catch (Throwable th2) {
                    s.a aVar3 = s.f8810b;
                    b9 = s.b(t.a(th2));
                }
                a aVar4 = a.this;
                Throwable e8 = s.e(b9);
                if (e8 != null) {
                    aVar4.i(e8);
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public a(Context context, b config, g workContext, o logger, Z3.d sentryConfig, String environment, String localeCountry, int i8) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(sentryConfig, "sentryConfig");
        AbstractC3292y.i(environment, "environment");
        AbstractC3292y.i(localeCountry, "localeCountry");
        this.f13221a = context;
        this.f13222b = config;
        this.f13223c = workContext;
        this.f13224d = logger;
        this.f13225e = sentryConfig;
        this.f13226f = environment;
        this.f13227g = localeCountry;
        this.f13228h = i8;
    }

    private final HttpsURLConnection c() {
        HttpsURLConnection j8 = j();
        j8.setRequestMethod(ShareTarget.METHOD_POST);
        j8.setDoOutput(true);
        for (Map.Entry entry : Q.k(x.a("Content-Type", "application/json; charset=utf-8"), x.a(Command.HTTP_HEADER_USER_AGENT, "Android3ds2Sdk 6.1.8"), x.a("X-Sentry-Auth", g())).entrySet()) {
            j8.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Throwable th) {
        this.f13224d.a("Failed to send error report.", th);
    }

    private final HttpsURLConnection j() {
        URLConnection openConnection = new URL("https://errors.stripe.com/api/" + this.f13225e.a() + "/store/").openConnection();
        AbstractC3292y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        return (HttpsURLConnection) openConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(JSONObject jSONObject) {
        HttpsURLConnection c8 = c();
        OutputStream outputStream = c8.getOutputStream();
        try {
            AbstractC3292y.f(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC3292y.h(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.flush();
                I i8 = I.f8786a;
                AbstractC1677b.a(outputStreamWriter, null);
                AbstractC1677b.a(outputStream, null);
                c8.connect();
                h(c8, c8.getResponseCode());
                c8.disconnect();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1677b.a(outputStream, th);
                throw th2;
            }
        }
    }

    public final /* synthetic */ JSONObject d(Throwable t8) {
        AbstractC3292y.i(t8, "t");
        JSONObject put = new JSONObject().put("release", "com.stripe.android.stripe3ds2@6.1.8+25");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject put2 = new JSONObject().put("type", t8.getClass().getCanonicalName());
        String message = t8.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject put3 = put.put("exception", jSONObject.put("values", jSONArray.put(put2.put("value", message).put("stacktrace", f(t8)))));
        JSONObject put4 = new JSONObject().put("locale", this.f13227g).put("environment", this.f13226f).put("android_os_version", this.f13228h);
        for (Map.Entry entry : this.f13222b.a().entrySet()) {
            put4.put((String) entry.getKey(), (String) entry.getValue());
        }
        I i8 = I.f8786a;
        JSONObject put5 = put3.put("tags", put4).put("contexts", e());
        AbstractC3292y.h(put5, "put(...)");
        return put5;
    }

    public final /* synthetic */ JSONObject e() {
        Object b9;
        CharSequence charSequence;
        ApplicationInfo applicationInfo;
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(this.f13221a.getPackageManager().getPackageInfo(this.f13221a.getPackageName(), 0));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        String str = null;
        if (s.g(b9)) {
            b9 = null;
        }
        PackageInfo packageInfo = (PackageInfo) b9;
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            charSequence = applicationInfo.loadLabel(this.f13221a.getPackageManager());
        } else {
            charSequence = null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject put = new JSONObject().put("app_identifier", this.f13221a.getPackageName()).put("app_name", charSequence);
        if (packageInfo != null) {
            str = packageInfo.versionName;
        }
        if (str == null) {
            str = "";
        }
        JSONObject put2 = jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, put.put("app_version", str));
        JSONObject put3 = new JSONObject().put("name", "Android").put("version", Build.VERSION.RELEASE);
        String str2 = Build.TYPE;
        JSONObject put4 = put2.put("os", put3.put("type", str2).put("build", Build.DISPLAY));
        JSONObject put5 = new JSONObject().put("model_id", Build.ID).put("model", Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", str2);
        JSONArray jSONArray = new JSONArray();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        AbstractC3292y.h(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        for (String str3 : SUPPORTED_ABIS) {
            jSONArray.put(str3);
        }
        I i8 = I.f8786a;
        JSONObject put6 = put4.put("device", put5.put("archs", jSONArray));
        AbstractC3292y.h(put6, "put(...)");
        return put6;
    }

    public final /* synthetic */ JSONObject f(Throwable t8) {
        AbstractC3292y.i(t8, "t");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = t8.getStackTrace();
        AbstractC3292y.h(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : AbstractC1428l.I0(stackTrace)) {
            jSONArray.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        I i8 = I.f8786a;
        JSONObject put = jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS, jSONArray);
        AbstractC3292y.h(put, "put(...)");
        return put;
    }

    public final /* synthetic */ String g() {
        return AbstractC1435t.w0(AbstractC1435t.p("Sentry", AbstractC1435t.w0(AbstractC1435t.p(x.a("sentry_key", this.f13225e.getKey()), x.a("sentry_version", this.f13225e.getVersion()), x.a("sentry_timestamp", this.f13225e.c()), x.a("sentry_client", "Android3ds2Sdk 6.1.8"), x.a("sentry_secret", this.f13225e.b())), ", ", null, null, 0, null, d.f13231a, 30, null)), " ", null, null, 0, null, null, 62, null);
    }

    @Override // Z3.c
    public void l(Throwable t8) {
        AbstractC3292y.i(t8, "t");
        AbstractC3462k.d(N.a(this.f13223c), null, null, new e(t8, null), 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ a(android.content.Context r9, Z3.a.b r10, U5.g r11, com.stripe.android.stripe3ds2.transaction.o r12, Z3.d r13, java.lang.String r14, java.lang.String r15, int r16, int r17, kotlin.jvm.internal.AbstractC3284p r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 2
            if (r1 == 0) goto L9
            Z3.a$c r1 = Z3.a.c.f13229a
            goto La
        L9:
            r1 = r10
        La:
            r2 = r0 & 4
            if (r2 == 0) goto L13
            n6.I r2 = n6.C3445b0.b()
            goto L14
        L13:
            r2 = r11
        L14:
            r3 = r0 & 8
            if (r3 == 0) goto L1b
            com.stripe.android.stripe3ds2.transaction.o$b r3 = com.stripe.android.stripe3ds2.transaction.o.b.f28139b
            goto L1c
        L1b:
            r3 = r12
        L1c:
            r4 = r0 & 16
            if (r4 == 0) goto L23
            Z3.b r4 = Z3.b.f13236a
            goto L24
        L23:
            r4 = r13
        L24:
            r5 = r0 & 32
            if (r5 == 0) goto L2b
            java.lang.String r5 = "release"
            goto L2c
        L2b:
            r5 = r14
        L2c:
            r6 = r0 & 64
            if (r6 == 0) goto L3e
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getCountry()
            java.lang.String r7 = "getCountry(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r6, r7)
            goto L3f
        L3e:
            r6 = r15
        L3f:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L46
            int r0 = android.os.Build.VERSION.SDK_INT
            goto L48
        L46:
            r0 = r16
        L48:
            r10 = r8
            r11 = r9
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.a.<init>(android.content.Context, Z3.a$b, U5.g, com.stripe.android.stripe3ds2.transaction.o, Z3.d, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.p):void");
    }

    private final void h(HttpsURLConnection httpsURLConnection, int i8) {
    }
}
