package V2;

import B2.C0953e;
import C6.AbstractC1012d0;
import C6.C;
import C6.C1013e;
import C6.C1014e0;
import C6.C1018h;
import C6.K;
import C6.Q;
import C6.n0;
import C6.r0;
import D6.o;
import P2.d;
import Q5.I;
import Q5.p;
import Q5.x;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import y6.l;
import z6.AbstractC4273a;

@StabilityInferred(parameters = 0)
@y6.g
/* loaded from: classes4.dex */
public final class a {
    public static final d Companion = new d(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f10501r = 8;

    /* renamed from: s, reason: collision with root package name */
    private static final y6.b[] f10502s;

    /* renamed from: t, reason: collision with root package name */
    private static final D6.a f10503t;

    /* renamed from: a, reason: collision with root package name */
    private final String f10504a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10505b;

    /* renamed from: c, reason: collision with root package name */
    private final g f10506c;

    /* renamed from: d, reason: collision with root package name */
    private final e f10507d;

    /* renamed from: e, reason: collision with root package name */
    private final h f10508e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10509f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10510g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10511h;

    /* renamed from: i, reason: collision with root package name */
    private final String f10512i;

    /* renamed from: j, reason: collision with root package name */
    private final String f10513j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f10514k;

    /* renamed from: l, reason: collision with root package name */
    private final b f10515l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f10516m;

    /* renamed from: n, reason: collision with root package name */
    private final String f10517n;

    /* renamed from: o, reason: collision with root package name */
    private final String f10518o;

    /* renamed from: p, reason: collision with root package name */
    private final Map f10519p;

    /* renamed from: q, reason: collision with root package name */
    private final Map f10520q;

    /* renamed from: V2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0217a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final C0217a f10521a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f10522b;

        static {
            C0217a c0217a = new C0217a();
            f10521a = c0217a;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.link.serialization.PopupPayload", c0217a, 17);
            c1014e0.k("publishableKey", false);
            c1014e0.k("stripeAccount", false);
            c1014e0.k("merchantInfo", false);
            c1014e0.k("customerInfo", false);
            c1014e0.k("paymentInfo", false);
            c1014e0.k("appId", false);
            c1014e0.k("locale", false);
            c1014e0.k("paymentUserAgent", false);
            c1014e0.k("paymentObject", false);
            c1014e0.k("intentMode", false);
            c1014e0.k("setupFutureUsage", false);
            c1014e0.k("cardBrandChoice", false);
            c1014e0.k("flags", false);
            c1014e0.k(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, true);
            c1014e0.k("integrationType", true);
            c1014e0.k("loggerMetadata", true);
            c1014e0.k("experiments", true);
            f10522b = c1014e0;
        }

        private C0217a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f10522b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            y6.b[] bVarArr = a.f10502s;
            r0 r0Var = r0.f1092a;
            return new y6.b[]{r0Var, AbstractC4273a.p(r0Var), g.C0222a.f10542a, e.C0221a.f10533a, AbstractC4273a.p(h.C0223a.f10546a), r0Var, r0Var, r0Var, r0Var, r0Var, C1018h.f1064a, AbstractC4273a.p(b.C0218a.f10527a), bVarArr[12], r0Var, r0Var, bVarArr[15], bVarArr[16]};
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00f4. Please report as an issue. */
        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a d(B6.e decoder) {
            String str;
            int i8;
            g gVar;
            Map map;
            Map map2;
            Map map3;
            h hVar;
            b bVar;
            e eVar;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            boolean z8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = a.f10502s;
            int i9 = 10;
            if (c8.z()) {
                String o8 = c8.o(a9, 0);
                String str10 = (String) c8.t(a9, 1, r0.f1092a, null);
                g gVar2 = (g) c8.p(a9, 2, g.C0222a.f10542a, null);
                e eVar2 = (e) c8.p(a9, 3, e.C0221a.f10533a, null);
                h hVar2 = (h) c8.t(a9, 4, h.C0223a.f10546a, null);
                String o9 = c8.o(a9, 5);
                String o10 = c8.o(a9, 6);
                String o11 = c8.o(a9, 7);
                String o12 = c8.o(a9, 8);
                String o13 = c8.o(a9, 9);
                boolean m8 = c8.m(a9, 10);
                b bVar2 = (b) c8.t(a9, 11, b.C0218a.f10527a, null);
                Map map4 = (Map) c8.p(a9, 12, bVarArr[12], null);
                String o14 = c8.o(a9, 13);
                String o15 = c8.o(a9, 14);
                Map map5 = (Map) c8.p(a9, 15, bVarArr[15], null);
                map3 = map4;
                map = (Map) c8.p(a9, 16, bVarArr[16], null);
                map2 = map5;
                str9 = o15;
                z8 = m8;
                str7 = o13;
                str5 = o11;
                str4 = o10;
                str3 = o9;
                eVar = eVar2;
                str6 = o12;
                hVar = hVar2;
                str8 = o14;
                str = str10;
                gVar = gVar2;
                bVar = bVar2;
                str2 = o8;
                i8 = 131071;
            } else {
                int i10 = 16;
                String str11 = null;
                g gVar3 = null;
                Map map6 = null;
                Map map7 = null;
                Map map8 = null;
                h hVar3 = null;
                b bVar3 = null;
                e eVar3 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                int i11 = 0;
                boolean z9 = false;
                boolean z10 = true;
                while (z10) {
                    int y8 = c8.y(a9);
                    switch (y8) {
                        case -1:
                            i10 = 16;
                            z10 = false;
                        case 0:
                            str12 = c8.o(a9, 0);
                            i11 |= 1;
                            i10 = 16;
                            i9 = 10;
                        case 1:
                            str11 = (String) c8.t(a9, 1, r0.f1092a, str11);
                            i11 |= 2;
                            i10 = 16;
                            i9 = 10;
                        case 2:
                            gVar3 = (g) c8.p(a9, 2, g.C0222a.f10542a, gVar3);
                            i11 |= 4;
                            i10 = 16;
                            i9 = 10;
                        case 3:
                            eVar3 = (e) c8.p(a9, 3, e.C0221a.f10533a, eVar3);
                            i11 |= 8;
                            i10 = 16;
                            i9 = 10;
                        case 4:
                            hVar3 = (h) c8.t(a9, 4, h.C0223a.f10546a, hVar3);
                            i11 |= 16;
                            i10 = 16;
                            i9 = 10;
                        case 5:
                            str13 = c8.o(a9, 5);
                            i11 |= 32;
                            i10 = 16;
                        case 6:
                            str14 = c8.o(a9, 6);
                            i11 |= 64;
                            i10 = 16;
                        case 7:
                            str15 = c8.o(a9, 7);
                            i11 |= 128;
                            i10 = 16;
                        case 8:
                            str16 = c8.o(a9, 8);
                            i11 |= 256;
                            i10 = 16;
                        case 9:
                            str17 = c8.o(a9, 9);
                            i11 |= 512;
                            i10 = 16;
                        case 10:
                            z9 = c8.m(a9, i9);
                            i11 |= 1024;
                            i10 = 16;
                        case 11:
                            bVar3 = (b) c8.t(a9, 11, b.C0218a.f10527a, bVar3);
                            i11 |= 2048;
                            i10 = 16;
                        case 12:
                            map8 = (Map) c8.p(a9, 12, bVarArr[12], map8);
                            i11 |= 4096;
                            i10 = 16;
                        case 13:
                            str18 = c8.o(a9, 13);
                            i11 |= 8192;
                            i10 = 16;
                        case 14:
                            str19 = c8.o(a9, 14);
                            i11 |= 16384;
                            i10 = 16;
                        case 15:
                            map7 = (Map) c8.p(a9, 15, bVarArr[15], map7);
                            i11 |= 32768;
                            i10 = 16;
                        case 16:
                            map6 = (Map) c8.p(a9, i10, bVarArr[i10], map6);
                            i11 |= 65536;
                        default:
                            throw new l(y8);
                    }
                }
                str = str11;
                i8 = i11;
                gVar = gVar3;
                map = map6;
                map2 = map7;
                map3 = map8;
                hVar = hVar3;
                bVar = bVar3;
                eVar = eVar3;
                str2 = str12;
                str3 = str13;
                str4 = str14;
                str5 = str15;
                str6 = str16;
                str7 = str17;
                str8 = str18;
                str9 = str19;
                z8 = z9;
            }
            c8.a(a9);
            return new a(i8, str2, str, gVar, eVar, hVar, str3, str4, str5, str6, str7, z8, bVar, map3, str8, str9, map2, map, null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, a value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            a.c(value, c8, a9);
            c8.a(a9);
        }
    }

    @StabilityInferred(parameters = 0)
    @y6.g
    /* loaded from: classes4.dex */
    public static final class b {
        public static final C0219b Companion = new C0219b(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f10523c = 8;

        /* renamed from: d, reason: collision with root package name */
        private static final y6.b[] f10524d = {null, new C1013e(r0.f1092a)};

        /* renamed from: a, reason: collision with root package name */
        private final boolean f10525a;

        /* renamed from: b, reason: collision with root package name */
        private final List f10526b;

        /* renamed from: V2.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0218a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0218a f10527a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C1014e0 f10528b;

            static {
                C0218a c0218a = new C0218a();
                f10527a = c0218a;
                C1014e0 c1014e0 = new C1014e0("com.stripe.android.link.serialization.PopupPayload.CardBrandChoice", c0218a, 2);
                c1014e0.k("isMerchantEligibleForCBC", false);
                c1014e0.k("stripePreferredNetworks", false);
                f10528b = c1014e0;
            }

            private C0218a() {
            }

            @Override // y6.b, y6.i, y6.InterfaceC4248a
            public A6.f a() {
                return f10528b;
            }

            @Override // C6.C
            public y6.b[] b() {
                return C.a.a(this);
            }

            @Override // C6.C
            public y6.b[] c() {
                return new y6.b[]{C1018h.f1064a, b.f10524d[1]};
            }

            @Override // y6.InterfaceC4248a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public b d(B6.e decoder) {
                List list;
                boolean z8;
                int i8;
                AbstractC3292y.i(decoder, "decoder");
                A6.f a9 = a();
                B6.c c8 = decoder.c(a9);
                y6.b[] bVarArr = b.f10524d;
                n0 n0Var = null;
                if (c8.z()) {
                    z8 = c8.m(a9, 0);
                    list = (List) c8.p(a9, 1, bVarArr[1], null);
                    i8 = 3;
                } else {
                    List list2 = null;
                    boolean z9 = false;
                    int i9 = 0;
                    boolean z10 = true;
                    while (z10) {
                        int y8 = c8.y(a9);
                        if (y8 != -1) {
                            if (y8 != 0) {
                                if (y8 == 1) {
                                    list2 = (List) c8.p(a9, 1, bVarArr[1], list2);
                                    i9 |= 2;
                                } else {
                                    throw new l(y8);
                                }
                            } else {
                                z9 = c8.m(a9, 0);
                                i9 |= 1;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    list = list2;
                    z8 = z9;
                    i8 = i9;
                }
                c8.a(a9);
                return new b(i8, z8, list, n0Var);
            }

            @Override // y6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(B6.f encoder, b value) {
                AbstractC3292y.i(encoder, "encoder");
                AbstractC3292y.i(value, "value");
                A6.f a9 = a();
                B6.d c8 = encoder.c(a9);
                b.b(value, c8, a9);
                c8.a(a9);
            }
        }

        /* renamed from: V2.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0219b {
            private C0219b() {
            }

            public final y6.b serializer() {
                return C0218a.f10527a;
            }

            public /* synthetic */ C0219b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ b(int i8, boolean z8, List list, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC1012d0.a(i8, 3, C0218a.f10527a.a());
            }
            this.f10525a = z8;
            this.f10526b = list;
        }

        public static final /* synthetic */ void b(b bVar, B6.d dVar, A6.f fVar) {
            y6.b[] bVarArr = f10524d;
            dVar.o(fVar, 0, bVar.f10525a);
            dVar.n(fVar, 1, bVarArr[1], bVar.f10526b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f10525a == bVar.f10525a && AbstractC3292y.d(this.f10526b, bVar.f10526b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f10525a) * 31) + this.f10526b.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.f10525a + ", preferredNetworks=" + this.f10526b + ")";
        }

        public b(boolean z8, List preferredNetworks) {
            AbstractC3292y.i(preferredNetworks, "preferredNetworks");
            this.f10525a = z8;
            this.f10526b = preferredNetworks;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f10529a = new c();

        c() {
            super(1);
        }

        public final void a(D6.d Json) {
            AbstractC3292y.i(Json, "$this$Json");
            Json.e(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D6.d) obj);
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: V2.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0220a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10530a;

            static {
                int[] iArr = new int[StripeIntent.Usage.values().length];
                try {
                    iArr[StripeIntent.Usage.f25382e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StripeIntent.Usage.f25381d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StripeIntent.Usage.f25380c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f10530a = iArr;
            }
        }

        private d() {
        }

        private final String b(Context context) {
            Locale locale;
            LocaleList locales;
            if (Build.VERSION.SDK_INT >= 24) {
                locales = context.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            String country = locale.getCountry();
            AbstractC3292y.h(country, "getCountry(...)");
            return country;
        }

        private final boolean c(StripeIntent.Usage usage) {
            int i8;
            if (usage == null) {
                i8 = -1;
            } else {
                i8 = C0220a.f10530a[usage.ordinal()];
            }
            if (i8 != -1 && i8 != 1) {
                if (i8 == 2 || i8 == 3) {
                    return true;
                }
                throw new p();
            }
            return false;
        }

        private final boolean d(StripeIntent stripeIntent) {
            if (stripeIntent instanceof n) {
                return c(((n) stripeIntent).G());
            }
            if (stripeIntent instanceof u) {
                return true;
            }
            throw new p();
        }

        private final String e(P2.d dVar) {
            if (dVar.l()) {
                return "card_payment_method";
            }
            return "link_payment_method";
        }

        private final f f(StripeIntent stripeIntent) {
            if (stripeIntent instanceof n) {
                return f.f10535b;
            }
            if (stripeIntent instanceof u) {
                return f.f10536c;
            }
            throw new p();
        }

        private final h g(StripeIntent stripeIntent) {
            if (stripeIntent instanceof n) {
                n nVar = (n) stripeIntent;
                String L8 = nVar.L();
                Long f8 = nVar.f();
                if (L8 == null || f8 == null) {
                    return null;
                }
                return new h(L8, f8.longValue());
            }
            if (stripeIntent instanceof u) {
                return null;
            }
            throw new p();
        }

        private final a h(P2.d dVar, Context context, String str, String str2, String str3) {
            b bVar;
            g gVar = new g(dVar.i(), dVar.h());
            String b9 = dVar.b().b();
            String a9 = dVar.b().a();
            if (a9 == null) {
                a9 = b(context);
            }
            e eVar = new e(b9, a9);
            d.a a10 = dVar.a();
            if (a10 != null) {
                bVar = new b(a10.a(), a10.b());
            } else {
                bVar = null;
            }
            h g8 = g(dVar.p());
            String str4 = context.getApplicationInfo().packageName;
            String b10 = b(context);
            String e8 = e(dVar);
            String b11 = f(dVar.p()).b();
            boolean d8 = d(dVar.p());
            Map f8 = dVar.f();
            AbstractC3292y.f(str4);
            return new a(str, str2, gVar, eVar, g8, str4, b10, str3, e8, b11, d8, bVar, f8);
        }

        public final a a(P2.d configuration, Context context, String publishableKey, String str, String paymentUserAgent) {
            AbstractC3292y.i(configuration, "configuration");
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(publishableKey, "publishableKey");
            AbstractC3292y.i(paymentUserAgent, "paymentUserAgent");
            return h(configuration, context, publishableKey, str, paymentUserAgent);
        }

        public final y6.b serializer() {
            return C0217a.f10521a;
        }

        public /* synthetic */ d(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @StabilityInferred(parameters = 1)
    @y6.g
    /* loaded from: classes4.dex */
    public static final class e {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f10531a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10532b;

        /* renamed from: V2.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0221a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0221a f10533a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C1014e0 f10534b;

            static {
                C0221a c0221a = new C0221a();
                f10533a = c0221a;
                C1014e0 c1014e0 = new C1014e0("com.stripe.android.link.serialization.PopupPayload.CustomerInfo", c0221a, 2);
                c1014e0.k(NotificationCompat.CATEGORY_EMAIL, false);
                c1014e0.k("country", false);
                f10534b = c1014e0;
            }

            private C0221a() {
            }

            @Override // y6.b, y6.i, y6.InterfaceC4248a
            public A6.f a() {
                return f10534b;
            }

            @Override // C6.C
            public y6.b[] b() {
                return C.a.a(this);
            }

            @Override // C6.C
            public y6.b[] c() {
                r0 r0Var = r0.f1092a;
                return new y6.b[]{AbstractC4273a.p(r0Var), AbstractC4273a.p(r0Var)};
            }

            @Override // y6.InterfaceC4248a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public e d(B6.e decoder) {
                String str;
                int i8;
                String str2;
                AbstractC3292y.i(decoder, "decoder");
                A6.f a9 = a();
                B6.c c8 = decoder.c(a9);
                n0 n0Var = null;
                if (c8.z()) {
                    r0 r0Var = r0.f1092a;
                    str2 = (String) c8.t(a9, 0, r0Var, null);
                    str = (String) c8.t(a9, 1, r0Var, null);
                    i8 = 3;
                } else {
                    str = null;
                    String str3 = null;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int y8 = c8.y(a9);
                        if (y8 != -1) {
                            if (y8 != 0) {
                                if (y8 == 1) {
                                    str = (String) c8.t(a9, 1, r0.f1092a, str);
                                    i9 |= 2;
                                } else {
                                    throw new l(y8);
                                }
                            } else {
                                str3 = (String) c8.t(a9, 0, r0.f1092a, str3);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    i8 = i9;
                    str2 = str3;
                }
                c8.a(a9);
                return new e(i8, str2, str, n0Var);
            }

            @Override // y6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(B6.f encoder, e value) {
                AbstractC3292y.i(encoder, "encoder");
                AbstractC3292y.i(value, "value");
                A6.f a9 = a();
                B6.d c8 = encoder.c(a9);
                e.a(value, c8, a9);
                c8.a(a9);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final y6.b serializer() {
                return C0221a.f10533a;
            }

            public /* synthetic */ b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ e(int i8, String str, String str2, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC1012d0.a(i8, 3, C0221a.f10533a.a());
            }
            this.f10531a = str;
            this.f10532b = str2;
        }

        public static final /* synthetic */ void a(e eVar, B6.d dVar, A6.f fVar) {
            r0 r0Var = r0.f1092a;
            dVar.D(fVar, 0, r0Var, eVar.f10531a);
            dVar.D(fVar, 1, r0Var, eVar.f10532b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (AbstractC3292y.d(this.f10531a, eVar.f10531a) && AbstractC3292y.d(this.f10532b, eVar.f10532b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f10531a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f10532b;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "CustomerInfo(email=" + this.f10531a + ", country=" + this.f10532b + ")";
        }

        public e(String str, String str2) {
            this.f10531a = str;
            this.f10532b = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class f {

        /* renamed from: b, reason: collision with root package name */
        public static final f f10535b = new f("Payment", 0, "payment");

        /* renamed from: c, reason: collision with root package name */
        public static final f f10536c = new f("Setup", 1, "setup");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ f[] f10537d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f10538e;

        /* renamed from: a, reason: collision with root package name */
        private final String f10539a;

        static {
            f[] a9 = a();
            f10537d = a9;
            f10538e = W5.b.a(a9);
        }

        private f(String str, int i8, String str2) {
            this.f10539a = str2;
        }

        private static final /* synthetic */ f[] a() {
            return new f[]{f10535b, f10536c};
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f10537d.clone();
        }

        public final String b() {
            return this.f10539a;
        }
    }

    @StabilityInferred(parameters = 1)
    @y6.g
    /* loaded from: classes4.dex */
    public static final class g {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f10540a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10541b;

        /* renamed from: V2.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0222a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0222a f10542a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C1014e0 f10543b;

            static {
                C0222a c0222a = new C0222a();
                f10542a = c0222a;
                C1014e0 c1014e0 = new C1014e0("com.stripe.android.link.serialization.PopupPayload.MerchantInfo", c0222a, 2);
                c1014e0.k("businessName", false);
                c1014e0.k("country", false);
                f10543b = c1014e0;
            }

            private C0222a() {
            }

            @Override // y6.b, y6.i, y6.InterfaceC4248a
            public A6.f a() {
                return f10543b;
            }

            @Override // C6.C
            public y6.b[] b() {
                return C.a.a(this);
            }

            @Override // C6.C
            public y6.b[] c() {
                r0 r0Var = r0.f1092a;
                return new y6.b[]{r0Var, AbstractC4273a.p(r0Var)};
            }

            @Override // y6.InterfaceC4248a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public g d(B6.e decoder) {
                String str;
                String str2;
                int i8;
                AbstractC3292y.i(decoder, "decoder");
                A6.f a9 = a();
                B6.c c8 = decoder.c(a9);
                n0 n0Var = null;
                if (c8.z()) {
                    str = c8.o(a9, 0);
                    str2 = (String) c8.t(a9, 1, r0.f1092a, null);
                    i8 = 3;
                } else {
                    str = null;
                    String str3 = null;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int y8 = c8.y(a9);
                        if (y8 != -1) {
                            if (y8 != 0) {
                                if (y8 == 1) {
                                    str3 = (String) c8.t(a9, 1, r0.f1092a, str3);
                                    i9 |= 2;
                                } else {
                                    throw new l(y8);
                                }
                            } else {
                                str = c8.o(a9, 0);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    str2 = str3;
                    i8 = i9;
                }
                c8.a(a9);
                return new g(i8, str, str2, n0Var);
            }

            @Override // y6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(B6.f encoder, g value) {
                AbstractC3292y.i(encoder, "encoder");
                AbstractC3292y.i(value, "value");
                A6.f a9 = a();
                B6.d c8 = encoder.c(a9);
                g.a(value, c8, a9);
                c8.a(a9);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final y6.b serializer() {
                return C0222a.f10542a;
            }

            public /* synthetic */ b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ g(int i8, String str, String str2, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC1012d0.a(i8, 3, C0222a.f10542a.a());
            }
            this.f10540a = str;
            this.f10541b = str2;
        }

        public static final /* synthetic */ void a(g gVar, B6.d dVar, A6.f fVar) {
            dVar.q(fVar, 0, gVar.f10540a);
            dVar.D(fVar, 1, r0.f1092a, gVar.f10541b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (AbstractC3292y.d(this.f10540a, gVar.f10540a) && AbstractC3292y.d(this.f10541b, gVar.f10541b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f10540a.hashCode() * 31;
            String str = this.f10541b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "MerchantInfo(businessName=" + this.f10540a + ", country=" + this.f10541b + ")";
        }

        public g(String businessName, String str) {
            AbstractC3292y.i(businessName, "businessName");
            this.f10540a = businessName;
            this.f10541b = str;
        }
    }

    @StabilityInferred(parameters = 1)
    @y6.g
    /* loaded from: classes4.dex */
    public static final class h {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f10544a;

        /* renamed from: b, reason: collision with root package name */
        private final long f10545b;

        /* renamed from: V2.a$h$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0223a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0223a f10546a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C1014e0 f10547b;

            static {
                C0223a c0223a = new C0223a();
                f10546a = c0223a;
                C1014e0 c1014e0 = new C1014e0("com.stripe.android.link.serialization.PopupPayload.PaymentInfo", c0223a, 2);
                c1014e0.k("currency", false);
                c1014e0.k(RewardPlus.AMOUNT, false);
                f10547b = c1014e0;
            }

            private C0223a() {
            }

            @Override // y6.b, y6.i, y6.InterfaceC4248a
            public A6.f a() {
                return f10547b;
            }

            @Override // C6.C
            public y6.b[] b() {
                return C.a.a(this);
            }

            @Override // C6.C
            public y6.b[] c() {
                return new y6.b[]{r0.f1092a, Q.f1019a};
            }

            @Override // y6.InterfaceC4248a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public h d(B6.e decoder) {
                String str;
                long j8;
                int i8;
                AbstractC3292y.i(decoder, "decoder");
                A6.f a9 = a();
                B6.c c8 = decoder.c(a9);
                if (c8.z()) {
                    str = c8.o(a9, 0);
                    j8 = c8.k(a9, 1);
                    i8 = 3;
                } else {
                    String str2 = null;
                    long j9 = 0;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int y8 = c8.y(a9);
                        if (y8 != -1) {
                            if (y8 != 0) {
                                if (y8 == 1) {
                                    j9 = c8.k(a9, 1);
                                    i9 |= 2;
                                } else {
                                    throw new l(y8);
                                }
                            } else {
                                str2 = c8.o(a9, 0);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    str = str2;
                    j8 = j9;
                    i8 = i9;
                }
                c8.a(a9);
                return new h(i8, str, j8, null);
            }

            @Override // y6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(B6.f encoder, h value) {
                AbstractC3292y.i(encoder, "encoder");
                AbstractC3292y.i(value, "value");
                A6.f a9 = a();
                B6.d c8 = encoder.c(a9);
                h.a(value, c8, a9);
                c8.a(a9);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final y6.b serializer() {
                return C0223a.f10546a;
            }

            public /* synthetic */ b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ h(int i8, String str, long j8, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC1012d0.a(i8, 3, C0223a.f10546a.a());
            }
            this.f10544a = str;
            this.f10545b = j8;
        }

        public static final /* synthetic */ void a(h hVar, B6.d dVar, A6.f fVar) {
            dVar.q(fVar, 0, hVar.f10544a);
            dVar.w(fVar, 1, hVar.f10545b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (AbstractC3292y.d(this.f10544a, hVar.f10544a) && this.f10545b == hVar.f10545b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f10544a.hashCode() * 31) + androidx.collection.a.a(this.f10545b);
        }

        public String toString() {
            return "PaymentInfo(currency=" + this.f10544a + ", amount=" + this.f10545b + ")";
        }

        public h(String currency, long j8) {
            AbstractC3292y.i(currency, "currency");
            this.f10544a = currency;
            this.f10545b = j8;
        }
    }

    static {
        r0 r0Var = r0.f1092a;
        f10502s = new y6.b[]{null, null, null, null, null, null, null, null, null, null, null, null, new K(r0Var, C1018h.f1064a), null, null, new K(r0Var, r0Var), new K(r0Var, r0Var)};
        f10503t = o.b(null, c.f10529a, 1, null);
    }

    public /* synthetic */ a(int i8, String str, String str2, g gVar, e eVar, h hVar, String str3, String str4, String str5, String str6, String str7, boolean z8, b bVar, Map map, String str8, String str9, Map map2, Map map3, n0 n0Var) {
        if (8191 != (i8 & 8191)) {
            AbstractC1012d0.a(i8, 8191, C0217a.f10521a.a());
        }
        this.f10504a = str;
        this.f10505b = str2;
        this.f10506c = gVar;
        this.f10507d = eVar;
        this.f10508e = hVar;
        this.f10509f = str3;
        this.f10510g = str4;
        this.f10511h = str5;
        this.f10512i = str6;
        this.f10513j = str7;
        this.f10514k = z8;
        this.f10515l = bVar;
        this.f10516m = map;
        this.f10517n = (i8 & 8192) == 0 ? "mobile_pay" : str8;
        this.f10518o = (i8 & 16384) == 0 ? "mobile" : str9;
        this.f10519p = (32768 & i8) == 0 ? R5.Q.e(x.a("mobile_session_id", C0953e.f420g.a().toString())) : map2;
        this.f10520q = (i8 & 65536) == 0 ? R5.Q.h() : map3;
    }

    public static final /* synthetic */ void c(a aVar, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f10502s;
        dVar.q(fVar, 0, aVar.f10504a);
        dVar.D(fVar, 1, r0.f1092a, aVar.f10505b);
        dVar.n(fVar, 2, g.C0222a.f10542a, aVar.f10506c);
        dVar.n(fVar, 3, e.C0221a.f10533a, aVar.f10507d);
        dVar.D(fVar, 4, h.C0223a.f10546a, aVar.f10508e);
        dVar.q(fVar, 5, aVar.f10509f);
        dVar.q(fVar, 6, aVar.f10510g);
        dVar.q(fVar, 7, aVar.f10511h);
        dVar.q(fVar, 8, aVar.f10512i);
        dVar.q(fVar, 9, aVar.f10513j);
        dVar.o(fVar, 10, aVar.f10514k);
        dVar.D(fVar, 11, b.C0218a.f10527a, aVar.f10515l);
        dVar.n(fVar, 12, bVarArr[12], aVar.f10516m);
        if (dVar.x(fVar, 13) || !AbstractC3292y.d(aVar.f10517n, "mobile_pay")) {
            dVar.q(fVar, 13, aVar.f10517n);
        }
        if (dVar.x(fVar, 14) || !AbstractC3292y.d(aVar.f10518o, "mobile")) {
            dVar.q(fVar, 14, aVar.f10518o);
        }
        if (dVar.x(fVar, 15) || !AbstractC3292y.d(aVar.f10519p, R5.Q.e(x.a("mobile_session_id", C0953e.f420g.a().toString())))) {
            dVar.n(fVar, 15, bVarArr[15], aVar.f10519p);
        }
        if (dVar.x(fVar, 16) || !AbstractC3292y.d(aVar.f10520q, R5.Q.h())) {
            dVar.n(fVar, 16, bVarArr[16], aVar.f10520q);
        }
    }

    public final String b() {
        return "https://checkout.link.com/#" + Base64.encodeToString(l6.n.p(f10503t.c(Companion.serializer(), this)), 2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3292y.d(this.f10504a, aVar.f10504a) && AbstractC3292y.d(this.f10505b, aVar.f10505b) && AbstractC3292y.d(this.f10506c, aVar.f10506c) && AbstractC3292y.d(this.f10507d, aVar.f10507d) && AbstractC3292y.d(this.f10508e, aVar.f10508e) && AbstractC3292y.d(this.f10509f, aVar.f10509f) && AbstractC3292y.d(this.f10510g, aVar.f10510g) && AbstractC3292y.d(this.f10511h, aVar.f10511h) && AbstractC3292y.d(this.f10512i, aVar.f10512i) && AbstractC3292y.d(this.f10513j, aVar.f10513j) && this.f10514k == aVar.f10514k && AbstractC3292y.d(this.f10515l, aVar.f10515l) && AbstractC3292y.d(this.f10516m, aVar.f10516m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f10504a.hashCode() * 31;
        String str = this.f10505b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.f10506c.hashCode()) * 31) + this.f10507d.hashCode()) * 31;
        h hVar = this.f10508e;
        if (hVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hVar.hashCode();
        }
        int hashCode5 = (((((((((((((hashCode4 + hashCode2) * 31) + this.f10509f.hashCode()) * 31) + this.f10510g.hashCode()) * 31) + this.f10511h.hashCode()) * 31) + this.f10512i.hashCode()) * 31) + this.f10513j.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f10514k)) * 31;
        b bVar = this.f10515l;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((hashCode5 + i8) * 31) + this.f10516m.hashCode();
    }

    public String toString() {
        return "PopupPayload(publishableKey=" + this.f10504a + ", stripeAccount=" + this.f10505b + ", merchantInfo=" + this.f10506c + ", customerInfo=" + this.f10507d + ", paymentInfo=" + this.f10508e + ", appId=" + this.f10509f + ", locale=" + this.f10510g + ", paymentUserAgent=" + this.f10511h + ", paymentObject=" + this.f10512i + ", intentMode=" + this.f10513j + ", setupFutureUsage=" + this.f10514k + ", cardBrandChoice=" + this.f10515l + ", flags=" + this.f10516m + ")";
    }

    public a(String publishableKey, String str, g merchantInfo, e customerInfo, h hVar, String appId, String locale, String paymentUserAgent, String paymentObject, String intentMode, boolean z8, b bVar, Map flags) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(merchantInfo, "merchantInfo");
        AbstractC3292y.i(customerInfo, "customerInfo");
        AbstractC3292y.i(appId, "appId");
        AbstractC3292y.i(locale, "locale");
        AbstractC3292y.i(paymentUserAgent, "paymentUserAgent");
        AbstractC3292y.i(paymentObject, "paymentObject");
        AbstractC3292y.i(intentMode, "intentMode");
        AbstractC3292y.i(flags, "flags");
        this.f10504a = publishableKey;
        this.f10505b = str;
        this.f10506c = merchantInfo;
        this.f10507d = customerInfo;
        this.f10508e = hVar;
        this.f10509f = appId;
        this.f10510g = locale;
        this.f10511h = paymentUserAgent;
        this.f10512i = paymentObject;
        this.f10513j = intentMode;
        this.f10514k = z8;
        this.f10515l = bVar;
        this.f10516m = flags;
        this.f10517n = "mobile_pay";
        this.f10518o = "mobile";
        this.f10519p = R5.Q.e(x.a("mobile_session_id", C0953e.f420g.a().toString()));
        this.f10520q = R5.Q.h();
    }
}
