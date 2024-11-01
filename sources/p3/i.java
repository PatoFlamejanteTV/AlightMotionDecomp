package p3;

import B2.InterfaceC0949a;
import Q5.r;
import Q5.x;
import R5.Q;
import R5.a0;
import android.content.Context;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import p3.InterfaceC3574d;

/* loaded from: classes4.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36196a = a.f36197a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f36197a = new a();

        private a() {
        }

        public static /* synthetic */ i b(a aVar, Context context, Set set, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                set = a0.f();
            }
            return aVar.a(context, set);
        }

        public final i a(Context context, Set productUsage) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(productUsage, "productUsage");
            InterfaceC3574d.a a9 = AbstractC3572b.a();
            Context applicationContext = context.getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            return a9.a(applicationContext).b(productUsage).build().a();
        }

        public final Map c(Throwable error) {
            AbstractC3292y.i(error, "error");
            if (error instanceof x2.k) {
                return d((x2.k) error);
            }
            return d(x2.k.f40948e.b(error));
        }

        public final Map d(x2.k stripeException) {
            Integer valueOf;
            String str;
            String str2;
            AbstractC3292y.i(stripeException, "stripeException");
            String str3 = null;
            if (stripeException.c() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(stripeException.c());
            }
            r a9 = x.a("analytics_value", stripeException.a());
            if (valueOf != null) {
                str = valueOf.toString();
            } else {
                str = null;
            }
            r a10 = x.a("status_code", str);
            r a11 = x.a("request_id", stripeException.b());
            v2.f d8 = stripeException.d();
            if (d8 != null) {
                str2 = d8.getType();
            } else {
                str2 = null;
            }
            r a12 = x.a("error_type", str2);
            v2.f d9 = stripeException.d();
            if (d9 != null) {
                str3 = d9.o();
            }
            return B4.b.a(Q.k(a9, a10, a11, a12, x.a("error_code", str3)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public static /* synthetic */ void a(i iVar, c cVar, x2.k kVar, Map map, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 2) != 0) {
                    kVar = null;
                }
                if ((i8 & 4) != 0) {
                    map = Q.h();
                }
                iVar.a(cVar, kVar, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
        }
    }

    /* loaded from: classes4.dex */
    public interface c extends InterfaceC0949a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class d implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final d f36198b = new d("AUTH_WEB_VIEW_FAILURE", 0, "payments.auth_web_view.failure");

        /* renamed from: c, reason: collision with root package name */
        public static final d f36199c = new d("AUTH_WEB_VIEW_NULL_ARGS", 1, "payments.auth_web_view.null_args");

        /* renamed from: d, reason: collision with root package name */
        public static final d f36200d = new d("GET_SAVED_PAYMENT_METHODS_FAILURE", 2, "elements.customer_repository.get_saved_payment_methods_failure");

        /* renamed from: e, reason: collision with root package name */
        public static final d f36201e = new d("GOOGLE_PAY_IS_READY_API_CALL", 3, "elements.google_pay_repository.is_ready_request_api_call_failure");

        /* renamed from: f, reason: collision with root package name */
        public static final d f36202f = new d("CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE", 4, "elements.customer_sheet.elements_session.load_failure");

        /* renamed from: g, reason: collision with root package name */
        public static final d f36203g = new d("CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE", 5, "elements.customer_sheet.payment_methods.load_failure");

        /* renamed from: h, reason: collision with root package name */
        public static final d f36204h = new d("CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE", 6, "elements.customer_sheet.payment_methods.refresh_failure");

        /* renamed from: i, reason: collision with root package name */
        public static final d f36205i = new d("CUSTOMER_SHEET_ADAPTER_NOT_FOUND", 7, "elements.customer_sheet.customer_adapter.not_found");

        /* renamed from: j, reason: collision with root package name */
        public static final d f36206j = new d("PLACES_FIND_AUTOCOMPLETE_ERROR", 8, "address_element.find_autocomplete.error");

        /* renamed from: k, reason: collision with root package name */
        public static final d f36207k = new d("PLACES_FETCH_PLACE_ERROR", 9, "address_element.fetch_place.error");

        /* renamed from: l, reason: collision with root package name */
        public static final d f36208l = new d("LINK_CREATE_CARD_FAILURE", 10, "link.create_new_card.create_payment_details_failure");

        /* renamed from: m, reason: collision with root package name */
        public static final d f36209m = new d("LINK_SHARE_CARD_FAILURE", 11, "link.create_new_card.share_payment_details_failure");

        /* renamed from: n, reason: collision with root package name */
        public static final d f36210n = new d("LINK_LOG_OUT_FAILURE", 12, "link.log_out.failure");

        /* renamed from: o, reason: collision with root package name */
        public static final d f36211o = new d("PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS", 13, "payments.paymentlauncherconfirmation.null_args");

        /* renamed from: p, reason: collision with root package name */
        public static final d f36212p = new d("BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND", 14, "payments.browserlauncher.activity_not_found");

        /* renamed from: q, reason: collision with root package name */
        public static final d f36213q = new d("BROWSER_LAUNCHER_NULL_ARGS", 15, "payments.browserlauncher.null_args");

        /* renamed from: r, reason: collision with root package name */
        public static final d f36214r = new d("GOOGLE_PAY_FAILED", 16, "google_pay.confirm.error");

        /* renamed from: s, reason: collision with root package name */
        public static final d f36215s = new d("FRAUD_DETECTION_API_FAILURE", 17, "fraud_detection_data_repository.api_failure");

        /* renamed from: t, reason: collision with root package name */
        public static final d f36216t = new d("EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", 18, "paymentsheet.external_payment_method.confirm_handler_is_null");

        /* renamed from: u, reason: collision with root package name */
        public static final d f36217u = new d("EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL", 19, "paymentsheet.external_payment_method.launcher_is_null");

        /* renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ d[] f36218v;

        /* renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ W5.a f36219w;

        /* renamed from: a, reason: collision with root package name */
        private final String f36220a;

        static {
            d[] b9 = b();
            f36218v = b9;
            f36219w = W5.b.a(b9);
        }

        private d(String str, int i8, String str2) {
            this.f36220a = str2;
        }

        private static final /* synthetic */ d[] b() {
            return new d[]{f36198b, f36199c, f36200d, f36201e, f36202f, f36203g, f36204h, f36205i, f36206j, f36207k, f36208l, f36209m, f36210n, f36211o, f36212p, f36213q, f36214r, f36215s, f36216t, f36217u};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f36218v.clone();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f36220a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final e f36221b = new e("GET_SAVED_PAYMENT_METHODS_SUCCESS", 0, "elements.customer_repository.get_saved_payment_methods_success");

        /* renamed from: c, reason: collision with root package name */
        public static final e f36222c = new e("PLACES_FIND_AUTOCOMPLETE_SUCCESS", 1, "address_element.find_autocomplete.success");

        /* renamed from: d, reason: collision with root package name */
        public static final e f36223d = new e("PLACES_FETCH_PLACE_SUCCESS", 2, "address_element.fetch_place.success");

        /* renamed from: e, reason: collision with root package name */
        public static final e f36224e = new e("LINK_CREATE_CARD_SUCCESS", 3, "link.create_new_card.success");

        /* renamed from: f, reason: collision with root package name */
        public static final e f36225f = new e("LINK_LOG_OUT_SUCCESS", 4, "link.log_out.success");

        /* renamed from: g, reason: collision with root package name */
        public static final e f36226g = new e("CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS", 5, "elements.customer_sheet.payment_methods.refresh_success");

        /* renamed from: h, reason: collision with root package name */
        public static final e f36227h = new e("EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS", 6, "paymentsheet.external_payment_method.launch_success");

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ e[] f36228i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ W5.a f36229j;

        /* renamed from: a, reason: collision with root package name */
        private final String f36230a;

        static {
            e[] b9 = b();
            f36228i = b9;
            f36229j = W5.b.a(b9);
        }

        private e(String str, int i8, String str2) {
            this.f36230a = str2;
        }

        private static final /* synthetic */ e[] b() {
            return new e[]{f36221b, f36222c, f36223d, f36224e, f36225f, f36226g, f36227h};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f36228i.clone();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f36230a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class f implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final f f36231b = new f("AUTH_WEB_VIEW_BLANK_CLIENT_SECRET", 0, "payments.auth_web_view.blank_client_secret");

        /* renamed from: c, reason: collision with root package name */
        public static final f f36232c = new f("MISSING_CARDSCAN_DEPENDENCY", 1, "cardscan.missing_dependency");

        /* renamed from: d, reason: collision with root package name */
        public static final f f36233d = new f("MISSING_HOSTED_VOUCHER_URL", 2, "payments.missing_hosted_voucher_url");

        /* renamed from: e, reason: collision with root package name */
        public static final f f36234e = new f("MISSING_POLLING_AUTHENTICATOR", 3, "payments.missing_polling_authenticator");

        /* renamed from: f, reason: collision with root package name */
        public static final f f36235f = new f("LINK_INVALID_SESSION_STATE", 4, "link.signup.failure.invalidSessionState");

        /* renamed from: g, reason: collision with root package name */
        public static final f f36236g = new f("GOOGLE_PAY_JSON_REQUEST_PARSING", 5, "google_pay_repository.is_ready_request_json_parsing_failure");

        /* renamed from: h, reason: collision with root package name */
        public static final f f36237h = new f("GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT", 6, "google_pay.confirm.unexpected_result");

        /* renamed from: i, reason: collision with root package name */
        public static final f f36238i = new f("GOOGLE_PAY_MISSING_INTENT_DATA", 7, "google_pay.on_result.missing_data");

        /* renamed from: j, reason: collision with root package name */
        public static final f f36239j = new f("FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY", 8, "address_element.find_autocomplete.without_dependency");

        /* renamed from: k, reason: collision with root package name */
        public static final f f36240k = new f("FETCH_PLACE_WITHOUT_DEPENDENCY", 9, "address_element.fetch_place.without_dependency");

        /* renamed from: l, reason: collision with root package name */
        public static final f f36241l = new f("LINK_ATTACH_CARD_WITH_NULL_ACCOUNT", 10, "link.create_new_card.missing_link_account");

        /* renamed from: m, reason: collision with root package name */
        public static final f f36242m = new f("PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND", 11, "paymentsheet.authenticators.not_found");

        /* renamed from: n, reason: collision with root package name */
        public static final f f36243n = new f("PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND", 12, "paymentsheet.loader.elements_session.customer.not_found");

        /* renamed from: o, reason: collision with root package name */
        public static final f f36244o = new f("EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE", 13, "elements.external_payment_methods_serializer.error");

        /* renamed from: p, reason: collision with root package name */
        public static final f f36245p = new f("PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT", 14, "paymentsheet.no_payment_selection");

        /* renamed from: q, reason: collision with root package name */
        public static final f f36246q = new f("PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 15, "paymentsheet.invalid_payment_selection");

        /* renamed from: r, reason: collision with root package name */
        public static final f f36247r = new f("FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 16, "flow_controller.invalid_payment_selection");

        /* renamed from: s, reason: collision with root package name */
        public static final f f36248s = new f("INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION", 17, "intent_confirmation_handler.invalid_payment_confirmation_option");

        /* renamed from: t, reason: collision with root package name */
        public static final f f36249t = new f("EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE", 18, "paymentsheet.external_payment_method.unexpected_result_code");

        /* renamed from: u, reason: collision with root package name */
        public static final f f36250u = new f("CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION", 19, "payments.cvc_recollection_unexpected_payment_selection");

        /* renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ f[] f36251v;

        /* renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ W5.a f36252w;

        /* renamed from: a, reason: collision with root package name */
        private final String f36253a;

        static {
            f[] b9 = b();
            f36251v = b9;
            f36252w = W5.b.a(b9);
        }

        private f(String str, int i8, String str2) {
            this.f36253a = str2;
        }

        private static final /* synthetic */ f[] b() {
            return new f[]{f36231b, f36232c, f36233d, f36234e, f36235f, f36236g, f36237h, f36238i, f36239j, f36240k, f36241l, f36242m, f36243n, f36244o, f36245p, f36246q, f36247r, f36248s, f36249t, f36250u};
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f36251v.clone();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return "unexpected_error." + this.f36253a;
        }
    }

    void a(c cVar, x2.k kVar, Map map);
}
