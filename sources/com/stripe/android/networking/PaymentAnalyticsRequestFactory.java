package com.stripe.android.networking;

import B2.C0950b;
import B2.C0953e;
import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import g3.C2901K;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public final class PaymentAnalyticsRequestFactory extends C0953e {

    /* renamed from: l */
    public static final b f26098l = new b(null);

    /* renamed from: m */
    public static final int f26099m = 8;

    /* renamed from: k */
    private final Set f26100k;

    /* loaded from: classes4.dex */
    public static final class ThreeDS2UiType extends Enum<ThreeDS2UiType> {

        /* renamed from: c */
        public static final a f26101c;

        /* renamed from: d */
        public static final ThreeDS2UiType f26102d = new ThreeDS2UiType("None", 0, null, "none");

        /* renamed from: e */
        public static final ThreeDS2UiType f26103e = new ThreeDS2UiType("Text", 1, "01", MimeTypes.BASE_TYPE_TEXT);

        /* renamed from: f */
        public static final ThreeDS2UiType f26104f = new ThreeDS2UiType("SingleSelect", 2, "02", "single_select");

        /* renamed from: g */
        public static final ThreeDS2UiType f26105g = new ThreeDS2UiType("MultiSelect", 3, "03", "multi_select");

        /* renamed from: h */
        public static final ThreeDS2UiType f26106h = new ThreeDS2UiType("Oob", 4, "04", "oob");

        /* renamed from: i */
        public static final ThreeDS2UiType f26107i = new ThreeDS2UiType("Html", 5, "05", "html");

        /* renamed from: j */
        private static final /* synthetic */ ThreeDS2UiType[] f26108j;

        /* renamed from: k */
        private static final /* synthetic */ W5.a f26109k;

        /* renamed from: a */
        private final String f26110a;

        /* renamed from: b */
        private final String f26111b;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final ThreeDS2UiType a(String str) {
                Object obj;
                Iterator<E> it = ThreeDS2UiType.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((ThreeDS2UiType) obj).f26110a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ThreeDS2UiType threeDS2UiType = (ThreeDS2UiType) obj;
                if (threeDS2UiType == null) {
                    return ThreeDS2UiType.f26102d;
                }
                return threeDS2UiType;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            ThreeDS2UiType[] a9 = a();
            f26108j = a9;
            f26109k = W5.b.a(a9);
            f26101c = new a(null);
        }

        private ThreeDS2UiType(String str, int i8, String str2, String str3) {
            super(str, i8);
            this.f26110a = str2;
            this.f26111b = str3;
        }

        private static final /* synthetic */ ThreeDS2UiType[] a() {
            return new ThreeDS2UiType[]{f26102d, f26103e, f26104f, f26105g, f26106h, f26107i};
        }

        public static W5.a c() {
            return f26109k;
        }

        public static ThreeDS2UiType valueOf(String str) {
            return (ThreeDS2UiType) Enum.valueOf(ThreeDS2UiType.class, str);
        }

        public static ThreeDS2UiType[] values() {
            return (ThreeDS2UiType[]) f26108j.clone();
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f26111b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a */
        final /* synthetic */ String f26112a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f26112a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f26112a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, N5.a aVar, N5.a aVar2, Set set, int i8, AbstractC3284p abstractC3284p) {
        this(packageManager, packageInfo, str, aVar, aVar2, (i8 & 32) != 0 ? a0.f() : set);
    }

    public static final String n(Function0 tmp0) {
        AbstractC3292y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    private final Map o(Set set, String str, C2901K.c cVar, ThreeDS2UiType threeDS2UiType, String str2) {
        Map map;
        Map map2;
        Map map3;
        Set m8 = a0.m(this.f26100k, set);
        Map map4 = null;
        if (m8.isEmpty()) {
            m8 = null;
        }
        if (m8 != null) {
            map = Q.e(x.a("product_usage", AbstractC1435t.W0(m8)));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        if (str != null) {
            map2 = Q.e(x.a("source_type", str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q8 = Q.q(Q.q(map, map2), x(str, cVar));
        if (threeDS2UiType != null) {
            map3 = Q.e(x.a("3ds2_ui_type", threeDS2UiType.toString()));
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        Map q9 = Q.q(q8, map3);
        if (str2 != null) {
            map4 = Q.e(x.a("error_message", str2));
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        return Q.q(q9, map4);
    }

    public static /* synthetic */ C0950b v(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, PaymentAnalyticsEvent paymentAnalyticsEvent, Set set, String str, C2901K.c cVar, ThreeDS2UiType threeDS2UiType, String str2, int i8, Object obj) {
        String str3;
        C2901K.c cVar2;
        ThreeDS2UiType threeDS2UiType2;
        String str4;
        if ((i8 & 2) != 0) {
            set = a0.f();
        }
        Set set2 = set;
        if ((i8 & 4) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i8 & 8) != 0) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        if ((i8 & 16) != 0) {
            threeDS2UiType2 = null;
        } else {
            threeDS2UiType2 = threeDS2UiType;
        }
        if ((i8 & 32) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        return paymentAnalyticsRequestFactory.u(paymentAnalyticsEvent, set2, str3, cVar2, threeDS2UiType2, str4);
    }

    private final Map x(String str, C2901K.c cVar) {
        String str2;
        Map map = null;
        if (cVar != null) {
            str2 = cVar.b();
        } else if (str == null) {
            str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            map = Q.e(x.a("token_type", str2));
        }
        if (map == null) {
            return Q.h();
        }
        return map;
    }

    public final /* synthetic */ C0950b p(PaymentAnalyticsEvent event, String str) {
        AbstractC3292y.i(event, "event");
        return v(this, event, null, null, null, ThreeDS2UiType.f26101c.a(str), null, 46, null);
    }

    public final /* synthetic */ C0950b q(Set productUsageTokens) {
        AbstractC3292y.i(productUsageTokens, "productUsageTokens");
        return v(this, PaymentAnalyticsEvent.f26068i, productUsageTokens, null, null, null, null, 60, null);
    }

    public final /* synthetic */ C0950b r(String str, String str2) {
        return v(this, PaymentAnalyticsEvent.f26079r, null, str, null, null, str2, 26, null);
    }

    public final /* synthetic */ C0950b s(String paymentMethodCode, Set productUsageTokens) {
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3292y.i(productUsageTokens, "productUsageTokens");
        return v(this, PaymentAnalyticsEvent.f26063d, productUsageTokens, paymentMethodCode, null, null, null, 56, null);
    }

    public final /* synthetic */ C0950b t(String str, Set productUsageTokens) {
        AbstractC3292y.i(productUsageTokens, "productUsageTokens");
        return v(this, PaymentAnalyticsEvent.f26064e, productUsageTokens, str, null, null, null, 56, null);
    }

    public final /* synthetic */ C0950b u(PaymentAnalyticsEvent event, Set productUsageTokens, String str, C2901K.c cVar, ThreeDS2UiType threeDS2UiType, String str2) {
        AbstractC3292y.i(event, "event");
        AbstractC3292y.i(productUsageTokens, "productUsageTokens");
        return g(event, o(productUsageTokens, str, cVar, threeDS2UiType, str2));
    }

    public final /* synthetic */ C0950b w(String str, String str2) {
        return v(this, PaymentAnalyticsEvent.f26089w, null, str, null, null, str2, 26, null);
    }

    public final Set y() {
        return this.f26100k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String packageName, N5.a publishableKeyProvider, N5.a networkTypeProvider, Set defaultProductUsageTokens) {
        super(packageManager, packageInfo, packageName, publishableKeyProvider, networkTypeProvider, null, 32, null);
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(networkTypeProvider, "networkTypeProvider");
        AbstractC3292y.i(defaultProductUsageTokens, "defaultProductUsageTokens");
        this.f26100k = defaultProductUsageTokens;
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(Context context, String str, Set set, int i8, AbstractC3284p abstractC3284p) {
        this(context, str, (i8 & 4) != 0 ? a0.f() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(Context context, String publishableKey, Set defaultProductUsageTokens) {
        this(context, new a(publishableKey), defaultProductUsageTokens);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(defaultProductUsageTokens, "defaultProductUsageTokens");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentAnalyticsRequestFactory(android.content.Context r11, N5.a r12) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3292y.i(r11, r0)
            java.lang.String r0 = "publishableKeyProvider"
            kotlin.jvm.internal.AbstractC3292y.i(r12, r0)
            android.content.Context r0 = r11.getApplicationContext()
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            E2.a r0 = E2.a.f1549a
            android.content.Context r1 = r11.getApplicationContext()
            java.lang.String r3 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r1, r3)
            android.content.pm.PackageInfo r3 = r0.a(r1)
            android.content.Context r0 = r11.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            if (r0 != 0) goto L2d
            java.lang.String r0 = ""
        L2d:
            r4 = r0
            B2.u r0 = new B2.u
            r0.<init>(r11)
            I2.c r6 = new I2.c
            r6.<init>(r0)
            r8 = 32
            r9 = 0
            r7 = 0
            r1 = r10
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.PaymentAnalyticsRequestFactory.<init>(android.content.Context, N5.a):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentAnalyticsRequestFactory(android.content.Context r9, final kotlin.jvm.functions.Function0 r10, java.util.Set r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3292y.i(r9, r0)
            java.lang.String r0 = "publishableKeyProvider"
            kotlin.jvm.internal.AbstractC3292y.i(r10, r0)
            java.lang.String r0 = "defaultProductUsageTokens"
            kotlin.jvm.internal.AbstractC3292y.i(r11, r0)
            android.content.Context r0 = r9.getApplicationContext()
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            E2.a r0 = E2.a.f1549a
            android.content.Context r1 = r9.getApplicationContext()
            java.lang.String r3 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r1, r3)
            android.content.pm.PackageInfo r3 = r0.a(r1)
            android.content.Context r0 = r9.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            if (r0 != 0) goto L32
            java.lang.String r0 = ""
        L32:
            r4 = r0
            j3.i r5 = new j3.i
            r5.<init>()
            B2.u r10 = new B2.u
            r10.<init>(r9)
            I2.c r6 = new I2.c
            r6.<init>(r10)
            r1 = r8
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.PaymentAnalyticsRequestFactory.<init>(android.content.Context, kotlin.jvm.functions.Function0, java.util.Set):void");
    }
}
