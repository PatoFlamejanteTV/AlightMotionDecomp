package B2;

import B2.G;
import B2.j;
import R5.AbstractC1435t;
import R5.Q;
import android.os.Build;
import android.system.Os;
import com.mbridge.msdk.foundation.download.Command;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.C3338d;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: b, reason: collision with root package name */
    public static final d f536b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f537c;

    /* renamed from: a, reason: collision with root package name */
    private Map f538a;

    /* loaded from: classes4.dex */
    public static final class a extends y {

        /* renamed from: d, reason: collision with root package name */
        public static final a f539d = new a();

        /* renamed from: e, reason: collision with root package name */
        private static final String f540e = y.f536b.b("AndroidBindings/20.51.0");

        /* renamed from: f, reason: collision with root package name */
        private static final Map f541f = Q.h();

        private a() {
            super(null);
        }

        @Override // B2.y
        protected Map e() {
            return f541f;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        @Override // B2.y
        protected String g() {
            return f540e;
        }

        @Override // B2.y
        protected String h() {
            Map d8 = d();
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1435t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }

        public int hashCode() {
            return -334358835;
        }

        public String toString() {
            return "Analytics";
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends y {

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f544d;

        /* renamed from: e, reason: collision with root package name */
        private final v2.c f545e;

        /* renamed from: f, reason: collision with root package name */
        private final Locale f546f;

        /* renamed from: g, reason: collision with root package name */
        private final String f547g;

        /* renamed from: h, reason: collision with root package name */
        private final String f548h;

        /* renamed from: i, reason: collision with root package name */
        private final D f549i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 optionsProvider, v2.c cVar, Locale locale, String apiVersion, String sdkVersion) {
            super(null);
            AbstractC3292y.i(optionsProvider, "optionsProvider");
            AbstractC3292y.i(locale, "locale");
            AbstractC3292y.i(apiVersion, "apiVersion");
            AbstractC3292y.i(sdkVersion, "sdkVersion");
            this.f544d = optionsProvider;
            this.f545e = cVar;
            this.f546f = locale;
            this.f547g = apiVersion;
            this.f548h = sdkVersion;
            this.f549i = new D(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        }

        private final String i() {
            String languageTag = this.f546f.toLanguageTag();
            AbstractC3292y.f(languageTag);
            if (!(!l6.n.T(languageTag)) || AbstractC3292y.d(languageTag, com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) {
                return null;
            }
            return languageTag;
        }

        @Override // B2.y
        protected Map e() {
            Map h8;
            Map map;
            Map map2;
            j.c cVar = (j.c) this.f544d.invoke();
            Map q8 = Q.q(Q.k(Q5.x.a("Accept", "application/json"), Q5.x.a("Stripe-Version", this.f547g), Q5.x.a("Authorization", "Bearer " + cVar.f())), this.f549i.a(this.f545e));
            if (cVar.h()) {
                h8 = Q.e(Q5.x.a("Stripe-Livemode", String.valueOf(true ^ AbstractC3292y.d(Os.getenv("Stripe-Livemode"), "false"))));
            } else {
                h8 = Q.h();
            }
            Map q9 = Q.q(q8, h8);
            String l8 = cVar.l();
            Map map3 = null;
            if (l8 != null) {
                map = Q.e(Q5.x.a("Stripe-Account", l8));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q10 = Q.q(q9, map);
            String i8 = cVar.i();
            if (i8 != null) {
                map2 = Q.e(Q5.x.a("Idempotency-Key", i8));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q11 = Q.q(q10, map2);
            String i9 = i();
            if (i9 != null) {
                map3 = Q.e(Q5.x.a("Accept-Language", i9));
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            return Q.q(q11, map3);
        }

        @Override // B2.y
        protected String g() {
            String str;
            String b9 = y.f536b.b(this.f548h);
            v2.c cVar = this.f545e;
            if (cVar != null) {
                str = cVar.f();
            } else {
                str = null;
            }
            return AbstractC1435t.w0(AbstractC1435t.r(b9, str), " ", null, null, 0, null, null, 62, null);
        }

        @Override // B2.y
        protected String h() {
            Map d8 = d();
            v2.c cVar = this.f545e;
            if (cVar != null) {
                d8.putAll(cVar.b());
            }
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1435t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public static /* synthetic */ String c(d dVar, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = "AndroidBindings/20.51.0";
            }
            return dVar.b(str);
        }

        public final String a() {
            return y.f537c;
        }

        public final String b(String sdkVersion) {
            AbstractC3292y.i(sdkVersion, "sdkVersion");
            return "Stripe/v1 " + sdkVersion;
        }

        public /* synthetic */ d(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends y {

        /* renamed from: g, reason: collision with root package name */
        public static final a f550g = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private final Map f551d;

        /* renamed from: e, reason: collision with root package name */
        private final String f552e;

        /* renamed from: f, reason: collision with root package name */
        private Map f553f;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String guid) {
            super(null);
            AbstractC3292y.i(guid, "guid");
            this.f551d = Q.e(Q5.x.a("Cookie", "m=" + guid));
            d dVar = y.f536b;
            this.f552e = dVar.b("AndroidBindings/20.51.0");
            this.f553f = Q.e(Q5.x.a("Content-Type", G.b.f400d.b() + "; charset=" + dVar.a()));
        }

        @Override // B2.y
        protected Map e() {
            return this.f551d;
        }

        @Override // B2.y
        protected Map f() {
            return this.f553f;
        }

        @Override // B2.y
        protected String g() {
            return this.f552e;
        }

        @Override // B2.y
        protected String h() {
            Map d8 = d();
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1435t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    static {
        String name = C3338d.f34755b.name();
        AbstractC3292y.h(name, "name(...)");
        f537c = name;
    }

    public /* synthetic */ y(AbstractC3284p abstractC3284p) {
        this();
    }

    public final Map b() {
        return Q.q(e(), Q.k(Q5.x.a(Command.HTTP_HEADER_USER_AGENT, g()), Q5.x.a("Accept-Charset", f537c), Q5.x.a("X-Stripe-User-Agent", h())));
    }

    public final Map c() {
        return f();
    }

    protected final Map d() {
        Q5.r a9 = Q5.x.a("lang", "kotlin");
        Q5.r a10 = Q5.x.a("bindings_version", "20.51.0");
        Q5.r a11 = Q5.x.a("os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        return Q.m(a9, a10, a11, Q5.x.a("type", str + "_" + str2 + "_" + str3), Q5.x.a("model", str3));
    }

    protected abstract Map e();

    protected Map f() {
        return this.f538a;
    }

    protected abstract String g();

    protected abstract String h();

    private y() {
        this.f538a = Q.h();
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: j, reason: collision with root package name */
        private Map f542j;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j.c f543a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j.c cVar) {
                super(0);
                this.f543a = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j.c invoke() {
                return this.f543a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ b(B2.j.c r7, v2.c r8, java.util.Locale r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.AbstractC3284p r13) {
            /*
                r6 = this;
                r13 = r12 & 2
                if (r13 == 0) goto L5
                r8 = 0
            L5:
                r2 = r8
                r8 = r12 & 4
                if (r8 == 0) goto L13
                java.util.Locale r9 = java.util.Locale.getDefault()
                java.lang.String r8 = "getDefault(...)"
                kotlin.jvm.internal.AbstractC3292y.h(r9, r8)
            L13:
                r3 = r9
                r8 = r12 & 8
                if (r8 == 0) goto L22
                v2.b$a r8 = v2.b.f40425c
                v2.b r8 = r8.a()
                java.lang.String r10 = r8.b()
            L22:
                r4 = r10
                r8 = r12 & 16
                if (r8 == 0) goto L29
                java.lang.String r11 = "AndroidBindings/20.51.0"
            L29:
                r5 = r11
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.y.b.<init>(B2.j$c, v2.c, java.util.Locale, java.lang.String, java.lang.String, int, kotlin.jvm.internal.p):void");
        }

        @Override // B2.y
        protected Map f() {
            return this.f542j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j.c options, v2.c cVar, Locale locale, String apiVersion, String sdkVersion) {
            super(new a(options), cVar, locale, apiVersion, sdkVersion);
            AbstractC3292y.i(options, "options");
            AbstractC3292y.i(locale, "locale");
            AbstractC3292y.i(apiVersion, "apiVersion");
            AbstractC3292y.i(sdkVersion, "sdkVersion");
            this.f542j = Q.e(Q5.x.a("Content-Type", G.b.f398b.b() + "; charset=" + y.f536b.a()));
        }
    }
}
