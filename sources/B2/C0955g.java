package B2;

import B2.G;
import C6.AbstractC1012d0;
import C6.AbstractC1034y;
import C6.C;
import C6.C1014e0;
import C6.C1029t;
import C6.K;
import C6.n0;
import C6.r0;
import R5.AbstractC1435t;
import R5.Q;
import androidx.annotation.RestrictTo;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import l6.C3338d;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;

@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: B2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0955g extends G {
    public static final b Companion = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final y6.b[] f430n;

    /* renamed from: c, reason: collision with root package name */
    private final String f431c;

    /* renamed from: d, reason: collision with root package name */
    private final String f432d;

    /* renamed from: e, reason: collision with root package name */
    private final String f433e;

    /* renamed from: f, reason: collision with root package name */
    private final double f434f;

    /* renamed from: g, reason: collision with root package name */
    private final D6.i f435g;

    /* renamed from: h, reason: collision with root package name */
    private final String f436h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f437i;

    /* renamed from: j, reason: collision with root package name */
    private final G.a f438j;

    /* renamed from: k, reason: collision with root package name */
    private final G.b f439k;

    /* renamed from: l, reason: collision with root package name */
    private final Iterable f440l;

    /* renamed from: m, reason: collision with root package name */
    private final String f441m;

    /* renamed from: B2.g$a */
    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f442a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f443b;

        static {
            a aVar = new a();
            f442a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.core.networking.AnalyticsRequestV2", aVar, 11);
            c1014e0.k("eventName", false);
            c1014e0.k("clientId", false);
            c1014e0.k(TtmlNode.ATTR_TTS_ORIGIN, false);
            c1014e0.k("created", false);
            c1014e0.k("params", false);
            c1014e0.k("postParameters", true);
            c1014e0.k("headers", true);
            c1014e0.k("method", true);
            c1014e0.k("mimeType", true);
            c1014e0.k("retryResponseCodes", true);
            c1014e0.k("url", true);
            f443b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f443b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            y6.b[] bVarArr = C0955g.f430n;
            y6.b bVar = bVarArr[6];
            y6.b bVar2 = bVarArr[7];
            y6.b bVar3 = bVarArr[8];
            y6.b bVar4 = bVarArr[9];
            r0 r0Var = r0.f1092a;
            return new y6.b[]{r0Var, r0Var, r0Var, C1029t.f1103a, D6.k.f1486a, r0Var, bVar, bVar2, bVar3, bVar4, r0Var};
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x009e. Please report as an issue. */
        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0955g d(B6.e decoder) {
            int i8;
            G.b bVar;
            Iterable iterable;
            G.a aVar;
            Map map;
            D6.i iVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            double d8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = C0955g.f430n;
            int i9 = 10;
            String str6 = null;
            if (c8.z()) {
                String o8 = c8.o(a9, 0);
                String o9 = c8.o(a9, 1);
                String o10 = c8.o(a9, 2);
                double e8 = c8.e(a9, 3);
                D6.i iVar2 = (D6.i) c8.p(a9, 4, D6.k.f1486a, null);
                String o11 = c8.o(a9, 5);
                Map map2 = (Map) c8.p(a9, 6, bVarArr[6], null);
                G.a aVar2 = (G.a) c8.p(a9, 7, bVarArr[7], null);
                G.b bVar2 = (G.b) c8.p(a9, 8, bVarArr[8], null);
                iterable = (Iterable) c8.p(a9, 9, bVarArr[9], null);
                str = o8;
                str5 = c8.o(a9, 10);
                str4 = o11;
                iVar = iVar2;
                map = map2;
                str3 = o10;
                aVar = aVar2;
                bVar = bVar2;
                str2 = o9;
                d8 = e8;
                i8 = 2047;
            } else {
                G.b bVar3 = null;
                Iterable iterable2 = null;
                G.a aVar3 = null;
                Map map3 = null;
                D6.i iVar3 = null;
                String str7 = null;
                String str8 = null;
                double d9 = 0.0d;
                int i10 = 0;
                boolean z8 = true;
                String str9 = null;
                String str10 = null;
                while (z8) {
                    int y8 = c8.y(a9);
                    switch (y8) {
                        case -1:
                            i9 = 10;
                            z8 = false;
                        case 0:
                            i10 |= 1;
                            str6 = c8.o(a9, 0);
                            i9 = 10;
                        case 1:
                            str9 = c8.o(a9, 1);
                            i10 |= 2;
                            i9 = 10;
                        case 2:
                            str10 = c8.o(a9, 2);
                            i10 |= 4;
                            i9 = 10;
                        case 3:
                            d9 = c8.e(a9, 3);
                            i10 |= 8;
                            i9 = 10;
                        case 4:
                            iVar3 = (D6.i) c8.p(a9, 4, D6.k.f1486a, iVar3);
                            i10 |= 16;
                            i9 = 10;
                        case 5:
                            str7 = c8.o(a9, 5);
                            i10 |= 32;
                        case 6:
                            map3 = (Map) c8.p(a9, 6, bVarArr[6], map3);
                            i10 |= 64;
                        case 7:
                            aVar3 = (G.a) c8.p(a9, 7, bVarArr[7], aVar3);
                            i10 |= 128;
                        case 8:
                            bVar3 = (G.b) c8.p(a9, 8, bVarArr[8], bVar3);
                            i10 |= 256;
                        case 9:
                            iterable2 = (Iterable) c8.p(a9, 9, bVarArr[9], iterable2);
                            i10 |= 512;
                        case 10:
                            str8 = c8.o(a9, i9);
                            i10 |= 1024;
                        default:
                            throw new y6.l(y8);
                    }
                }
                i8 = i10;
                bVar = bVar3;
                iterable = iterable2;
                aVar = aVar3;
                map = map3;
                iVar = iVar3;
                str = str6;
                str2 = str9;
                str3 = str10;
                str4 = str7;
                str5 = str8;
                d8 = d9;
            }
            c8.a(a9);
            return new C0955g(i8, str, str2, str3, d8, iVar, str4, map, aVar, bVar, iterable, str5, null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C0955g value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C0955g.u(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: B2.g$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f442a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B2.g$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f444a;

        /* renamed from: b, reason: collision with root package name */
        private final String f445b;

        public c(String key, String value) {
            AbstractC3292y.i(key, "key");
            AbstractC3292y.i(value, "value");
            this.f444a = key;
            this.f445b = value;
        }

        private final String a(String str) {
            String encode = URLEncoder.encode(str, C3338d.f34755b.name());
            AbstractC3292y.h(encode, "encode(...)");
            return encode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3292y.d(this.f444a, cVar.f444a) && AbstractC3292y.d(this.f445b, cVar.f445b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f444a.hashCode() * 31) + this.f445b.hashCode();
        }

        public String toString() {
            return a(this.f444a) + "=" + a(this.f445b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B2.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f446a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(c it) {
            AbstractC3292y.i(it, "it");
            return it.toString();
        }
    }

    static {
        r0 r0Var = r0.f1092a;
        f430n = new y6.b[]{null, null, null, null, null, null, new K(r0Var, r0Var), AbstractC1034y.b("com.stripe.android.core.networking.StripeRequest.Method", G.a.values()), AbstractC1034y.b("com.stripe.android.core.networking.StripeRequest.MimeType", G.b.values()), new y6.e(U.b(Iterable.class), new Annotation[0]), null};
    }

    public /* synthetic */ C0955g(int i8, String str, String str2, String str3, double d8, D6.i iVar, String str4, Map map, G.a aVar, G.b bVar, Iterable iterable, String str5, n0 n0Var) {
        if (31 != (i8 & 31)) {
            AbstractC1012d0.a(i8, 31, a.f442a.a());
        }
        this.f431c = str;
        this.f432d = str2;
        this.f433e = str3;
        this.f434f = d8;
        this.f435g = iVar;
        if ((i8 & 32) == 0) {
            this.f436h = m();
        } else {
            this.f436h = str4;
        }
        if ((i8 & 64) == 0) {
            this.f437i = Q.k(Q5.x.a("Content-Type", G.b.f398b.b() + "; charset=" + C3338d.f34755b.name()), Q5.x.a(TtmlNode.ATTR_TTS_ORIGIN, str3), Q5.x.a(Command.HTTP_HEADER_USER_AGENT, "Stripe/v1 android/20.51.0"));
        } else {
            this.f437i = map;
        }
        if ((i8 & 128) == 0) {
            this.f438j = G.a.f393c;
        } else {
            this.f438j = aVar;
        }
        if ((i8 & 256) == 0) {
            this.f439k = G.b.f398b;
        } else {
            this.f439k = bVar;
        }
        if ((i8 & 512) == 0) {
            this.f440l = new i6.i(429, 429);
        } else {
            this.f440l = iterable;
        }
        if ((i8 & 1024) == 0) {
            this.f441m = "https://r.stripe.com/0";
        } else {
            this.f441m = str5;
        }
    }

    private final Map j() {
        return Q.k(Q5.x.a("client_id", this.f432d), Q5.x.a("created", Double.valueOf(this.f434f)), Q5.x.a("event_name", this.f431c), Q5.x.a("event_id", UUID.randomUUID().toString()));
    }

    public static /* synthetic */ C0955g l(C0955g c0955g, String str, String str2, String str3, double d8, D6.i iVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c0955g.f431c;
        }
        if ((i8 & 2) != 0) {
            str2 = c0955g.f432d;
        }
        String str4 = str2;
        if ((i8 & 4) != 0) {
            str3 = c0955g.f433e;
        }
        String str5 = str3;
        if ((i8 & 8) != 0) {
            d8 = c0955g.f434f;
        }
        double d9 = d8;
        if ((i8 & 16) != 0) {
            iVar = c0955g.f435g;
        }
        return c0955g.k(str, str4, str5, d9, iVar);
    }

    private final String m() {
        Map q8 = Q.q(q.a(this.f435g), j());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : v.f517a.a(q8).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                arrayList.add(new c(str, p(this, (Map) value, 0, 2, null)));
            } else {
                arrayList.add(new c(str, value.toString()));
            }
        }
        return AbstractC1435t.w0(arrayList, "&", null, null, 0, null, d.f446a, 30, null);
    }

    private final Map n(int i8) {
        boolean z8;
        boolean z9;
        C3374a.C0804a c0804a = C3374a.f35036b;
        if (C3374a.K(AbstractC3376c.t(System.currentTimeMillis(), EnumC3377d.f35045d), EnumC3377d.f35046e) - this.f434f > 5.0d) {
            z8 = true;
        } else {
            z8 = false;
        }
        Q5.r a9 = Q5.x.a("uses_work_manager", Boolean.TRUE);
        if (i8 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Q.k(a9, Q5.x.a("is_retry", Boolean.valueOf(z9)), Q5.x.a("delayed", Boolean.valueOf(z8)));
    }

    private final String o(Map map, int i8) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        AbstractC3292y.h(sb, "append(...)");
        sb.append('\n');
        AbstractC3292y.h(sb, "append(...)");
        boolean z8 = true;
        for (Map.Entry entry : Q.g(map, new Comparator() { // from class: B2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int q8;
                q8 = C0955g.q(obj, obj2);
                return q8;
            }
        }).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                str = o((Map) value, i8 + 1);
            } else if (value == null) {
                str = "";
            } else {
                str = "\"" + value + "\"";
            }
            if (!l6.n.T(str)) {
                if (z8) {
                    sb.append(l6.n.v("  ", i8));
                    sb.append("  \"" + key + "\": " + str);
                    z8 = false;
                } else {
                    sb.append(",");
                    AbstractC3292y.h(sb, "append(...)");
                    sb.append('\n');
                    AbstractC3292y.h(sb, "append(...)");
                    sb.append(l6.n.v("  ", i8));
                    sb.append("  \"" + key + "\": " + str);
                }
            }
        }
        sb.append('\n');
        AbstractC3292y.h(sb, "append(...)");
        sb.append(l6.n.v("  ", i8));
        sb.append("}");
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    static /* synthetic */ String p(C0955g c0955g, Map map, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return c0955g.o(map, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(Object obj, Object obj2) {
        return String.valueOf(obj).compareTo(String.valueOf(obj2));
    }

    private final byte[] s() {
        byte[] bytes = this.f436h.getBytes(C3338d.f34755b);
        AbstractC3292y.h(bytes, "getBytes(...)");
        return bytes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008d, code lost:            if (kotlin.jvm.internal.AbstractC3292y.d(r11.a(), R5.Q.k(Q5.x.a("Content-Type", B2.G.b.f398b.b() + "; charset=" + l6.C3338d.f34755b.name()), Q5.x.a(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_ORIGIN, r11.f433e), Q5.x.a(com.mbridge.msdk.foundation.download.Command.HTTP_HEADER_USER_AGENT, "Stripe/v1 android/20.51.0"))) == false) goto L13;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void u(B2.C0955g r11, B6.d r12, A6.f r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C0955g.u(B2.g, B6.d, A6.f):void");
    }

    @Override // B2.G
    public Map a() {
        return this.f437i;
    }

    @Override // B2.G
    public G.a b() {
        return this.f438j;
    }

    @Override // B2.G
    public Iterable d() {
        return this.f440l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0955g)) {
            return false;
        }
        C0955g c0955g = (C0955g) obj;
        if (AbstractC3292y.d(this.f431c, c0955g.f431c) && AbstractC3292y.d(this.f432d, c0955g.f432d) && AbstractC3292y.d(this.f433e, c0955g.f433e) && Double.compare(this.f434f, c0955g.f434f) == 0 && AbstractC3292y.d(this.f435g, c0955g.f435g)) {
            return true;
        }
        return false;
    }

    @Override // B2.G
    public String f() {
        return this.f441m;
    }

    @Override // B2.G
    public void g(OutputStream outputStream) {
        AbstractC3292y.i(outputStream, "outputStream");
        outputStream.write(s());
        outputStream.flush();
    }

    public int hashCode() {
        return (((((((this.f431c.hashCode() * 31) + this.f432d.hashCode()) * 31) + this.f433e.hashCode()) * 31) + androidx.compose.animation.core.b.a(this.f434f)) * 31) + this.f435g.hashCode();
    }

    public final C0955g k(String eventName, String clientId, String origin, double d8, D6.i params) {
        AbstractC3292y.i(eventName, "eventName");
        AbstractC3292y.i(clientId, "clientId");
        AbstractC3292y.i(origin, "origin");
        AbstractC3292y.i(params, "params");
        return new C0955g(eventName, clientId, origin, d8, params);
    }

    public G.b r() {
        return this.f439k;
    }

    public final C0955g t(int i8) {
        D6.i c8;
        c8 = AbstractC0956h.c(Q.q(q.a(this.f435g), n(i8)));
        return l(this, null, null, null, 0.0d, c8, 15, null);
    }

    public String toString() {
        return "AnalyticsRequestV2(eventName=" + this.f431c + ", clientId=" + this.f432d + ", origin=" + this.f433e + ", created=" + this.f434f + ", params=" + this.f435g + ")";
    }

    private C0955g(String str, String str2, String str3, double d8, D6.i iVar) {
        this.f431c = str;
        this.f432d = str2;
        this.f433e = str3;
        this.f434f = d8;
        this.f435g = iVar;
        this.f436h = m();
        G.b bVar = G.b.f398b;
        this.f437i = Q.k(Q5.x.a("Content-Type", bVar.b() + "; charset=" + C3338d.f34755b.name()), Q5.x.a(TtmlNode.ATTR_TTS_ORIGIN, str3), Q5.x.a(Command.HTTP_HEADER_USER_AGENT, "Stripe/v1 android/20.51.0"));
        this.f438j = G.a.f393c;
        this.f439k = bVar;
        this.f440l = new i6.i(429, 429);
        this.f441m = "https://r.stripe.com/0";
    }
}
