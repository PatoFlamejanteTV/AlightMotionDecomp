package h3;

import R5.AbstractC1435t;
import R5.a0;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import com.stripe.android.model.Source;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2932A implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final b f32550b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Set f32551c = a0.i("card", "sepa_debit");

    /* renamed from: h3.A$a */
    /* loaded from: classes4.dex */
    public static final class a implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final C0749a f32552b = new C0749a(null);

        /* renamed from: h3.A$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0749a {
            private C0749a() {
            }

            public /* synthetic */ C0749a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.CodeVerification a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new Source.CodeVerification(json.optInt("attempts_remaining", -1), Source.CodeVerification.Status.f25252b.a(z2.e.l(json, NotificationCompat.CATEGORY_STATUS)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h3.A$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final String c(String str) {
            String str2;
            if (str == null) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            switch (str.hashCode()) {
                case -1920743119:
                    str2 = "bancontact";
                    if (!str.equals("bancontact")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -1414960566:
                    str2 = "alipay";
                    if (!str.equals("alipay")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -1128905083:
                    str2 = "klarna";
                    if (!str.equals("klarna")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -896955097:
                    str2 = "sofort";
                    if (!str.equals("sofort")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -825238221:
                    str2 = "three_d_secure";
                    if (!str.equals("three_d_secure")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -791770330:
                    str2 = "wechat";
                    if (!str.equals("wechat")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -284840886:
                    str.equals(EnvironmentCompat.MEDIA_UNKNOWN);
                    return EnvironmentCompat.MEDIA_UNKNOWN;
                case 100648:
                    str2 = "eps";
                    if (!str.equals("eps")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 109234:
                    str2 = "p24";
                    if (!str.equals("p24")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 3046160:
                    str2 = "card";
                    if (!str.equals("card")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 38358441:
                    str2 = "giropay";
                    if (!str.equals("giropay")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 100048981:
                    str2 = "ideal";
                    if (!str.equals("ideal")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 1251821346:
                    str2 = "multibanco";
                    if (!str.equals("multibanco")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 1636477296:
                    str2 = "sepa_debit";
                    if (!str.equals("sepa_debit")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                default:
                    return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Source d(JSONObject jSONObject) {
            return new Source(z2.e.l(jSONObject, "id"), null, null, null, null, null, null, null, null, null, null, null, null, new z().a(jSONObject), "card", "card", null, null, null, null, null, 2039806, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0121, code lost:            if ((r7 instanceof com.stripe.android.model.Source.CodeVerification) == false) goto L57;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.stripe.android.model.Source e(org.json.JSONObject r29) {
            /*
                Method dump skipped, instructions count: 614
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h3.C2932A.b.e(org.json.JSONObject):com.stripe.android.model.Source");
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: h3.A$c */
    /* loaded from: classes4.dex */
    public static final class c implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32553b = new a(null);

        /* renamed from: h3.A$c$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private final Set c(JSONObject jSONObject, String str) {
            Set set;
            List s02;
            String l8 = z2.e.l(jSONObject, str);
            if (l8 != null && (s02 = l6.n.s0(l8, new String[]{","}, false, 0, 6, null)) != null) {
                set = AbstractC1435t.b1(s02);
            } else {
                set = null;
            }
            if (set == null) {
                return a0.f();
            }
            return set;
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.c a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new Source.c(z2.e.l(json, "first_name"), z2.e.l(json, "last_name"), z2.e.l(json, "purchase_country"), z2.e.l(json, "client_token"), z2.e.l(json, "pay_now_asset_urls_descriptive"), z2.e.l(json, "pay_now_asset_urls_standard"), z2.e.l(json, "pay_now_name"), z2.e.l(json, "pay_now_redirect_url"), z2.e.l(json, "pay_later_asset_urls_descriptive"), z2.e.l(json, "pay_later_asset_urls_standard"), z2.e.l(json, "pay_later_name"), z2.e.l(json, "pay_later_redirect_url"), z2.e.l(json, "pay_over_time_asset_urls_descriptive"), z2.e.l(json, "pay_over_time_asset_urls_standard"), z2.e.l(json, "pay_over_time_name"), z2.e.l(json, "pay_over_time_redirect_url"), c(json, "payment_method_categories"), c(json, "custom_payment_methods"));
        }
    }

    /* renamed from: h3.A$d */
    /* loaded from: classes4.dex */
    public static final class d implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32554b = new a(null);

        /* renamed from: h3.A$d$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.d a(JSONObject json) {
            com.stripe.android.model.a aVar;
            AbstractC3292y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            com.stripe.android.model.a aVar2 = null;
            if (optJSONObject != null) {
                aVar = new C2940b().a(optJSONObject);
            } else {
                aVar = null;
            }
            String l8 = z2.e.l(json, NotificationCompat.CATEGORY_EMAIL);
            String l9 = z2.e.l(json, "name");
            String l10 = z2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE);
            JSONObject optJSONObject2 = json.optJSONObject("verified_address");
            if (optJSONObject2 != null) {
                aVar2 = new C2940b().a(optJSONObject2);
            }
            return new Source.d(aVar, l8, l9, l10, aVar2, z2.e.l(json, "verified_email"), z2.e.l(json, "verified_name"), z2.e.l(json, "verified_phone"));
        }
    }

    /* renamed from: h3.A$e */
    /* loaded from: classes4.dex */
    public static final class e implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32555b = new a(null);

        /* renamed from: h3.A$e$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.e a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new Source.e(z2.e.l(json, "address"), json.optLong("amount_charged"), json.optLong("amount_received"), json.optLong("amount_returned"));
        }
    }

    /* renamed from: h3.A$f */
    /* loaded from: classes4.dex */
    public static final class f implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f32556b = new a(null);

        /* renamed from: h3.A$f$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.Redirect a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new Source.Redirect(z2.e.l(json, "return_url"), Source.Redirect.Status.f25270b.a(z2.e.l(json, NotificationCompat.CATEGORY_STATUS)), z2.e.l(json, "url"));
        }
    }

    @Override // A2.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Source a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        String optString = json.optString("object");
        if (AbstractC3292y.d(optString, "card")) {
            return f32550b.d(json);
        }
        if (AbstractC3292y.d(optString, "source")) {
            return f32550b.e(json);
        }
        return null;
    }
}
