package com.stripe.android.networking;

import B2.InterfaceC0949a;
import W5.b;
import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PaymentAnalyticsEvent implements InterfaceC0949a {

    /* renamed from: E0, reason: collision with root package name */
    private static final /* synthetic */ PaymentAnalyticsEvent[] f26038E0;

    /* renamed from: F0, reason: collision with root package name */
    private static final /* synthetic */ W5.a f26040F0;

    /* renamed from: b, reason: collision with root package name */
    private static final a f26061b;

    /* renamed from: a, reason: collision with root package name */
    private final String f26097a;

    /* renamed from: c, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26062c = new PaymentAnalyticsEvent("TokenCreate", 0, "token_creation");

    /* renamed from: d, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26063d = new PaymentAnalyticsEvent("PaymentMethodCreate", 1, "payment_method_creation");

    /* renamed from: e, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26064e = new PaymentAnalyticsEvent("PaymentMethodUpdate", 2, "payment_method_update");

    /* renamed from: f, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26065f = new PaymentAnalyticsEvent("CustomerRetrieve", 3, "retrieve_customer");

    /* renamed from: g, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26066g = new PaymentAnalyticsEvent("CustomerRetrievePaymentMethods", 4, "retrieve_payment_methods");

    /* renamed from: h, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26067h = new PaymentAnalyticsEvent("CustomerAttachPaymentMethod", 5, "attach_payment_method");

    /* renamed from: i, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26068i = new PaymentAnalyticsEvent("CustomerDetachPaymentMethod", 6, "detach_payment_method");

    /* renamed from: j, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26069j = new PaymentAnalyticsEvent("CustomerDeleteSource", 7, "delete_source");

    /* renamed from: k, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26070k = new PaymentAnalyticsEvent("CustomerSetShippingInfo", 8, "set_shipping_info");

    /* renamed from: l, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26071l = new PaymentAnalyticsEvent("CustomerAddSource", 9, "add_source");

    /* renamed from: m, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26072m = new PaymentAnalyticsEvent("CustomerSetDefaultSource", 10, "default_source");

    /* renamed from: n, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26073n = new PaymentAnalyticsEvent("IssuingRetrievePin", 11, "issuing_retrieve_pin");

    /* renamed from: o, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26074o = new PaymentAnalyticsEvent("IssuingUpdatePin", 12, "issuing_update_pin");

    /* renamed from: p, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26075p = new PaymentAnalyticsEvent("SourceCreate", 13, "source_creation");

    /* renamed from: q, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26077q = new PaymentAnalyticsEvent("SourceRetrieve", 14, "retrieve_source");

    /* renamed from: r, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26079r = new PaymentAnalyticsEvent("PaymentIntentConfirm", 15, "payment_intent_confirmation");

    /* renamed from: s, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26081s = new PaymentAnalyticsEvent("PaymentIntentRetrieve", 16, "payment_intent_retrieval");

    /* renamed from: t, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26083t = new PaymentAnalyticsEvent("PaymentIntentRetrieveOrdered", 17, "payment_intent_retrieval_ordered");

    /* renamed from: u, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26085u = new PaymentAnalyticsEvent("PaymentIntentCancelSource", 18, "payment_intent_cancel_source");

    /* renamed from: v, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26087v = new PaymentAnalyticsEvent("PaymentIntentRefresh", 19, "payment_intent_refresh");

    /* renamed from: w, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26089w = new PaymentAnalyticsEvent("SetupIntentConfirm", 20, "setup_intent_confirmation");

    /* renamed from: x, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26091x = new PaymentAnalyticsEvent("SetupIntentRetrieve", 21, "setup_intent_retrieval");

    /* renamed from: y, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26093y = new PaymentAnalyticsEvent("SetupIntentRetrieveOrdered", 22, "setup_intent_retrieval_ordered");

    /* renamed from: z, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26095z = new PaymentAnalyticsEvent("SetupIntentCancelSource", 23, "setup_intent_cancel_source");

    /* renamed from: A, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26029A = new PaymentAnalyticsEvent("SetupIntentRefresh", 24, "setup_intent_refresh");

    /* renamed from: B, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26031B = new PaymentAnalyticsEvent("PaymentLauncherConfirmStarted", 25, "paymenthandler.confirm.started");

    /* renamed from: C, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26033C = new PaymentAnalyticsEvent("PaymentLauncherConfirmFinished", 26, "paymenthandler.confirm.finished");

    /* renamed from: D, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26035D = new PaymentAnalyticsEvent("PaymentLauncherNextActionStarted", 27, "paymenthandler.handle_next_action.started");

    /* renamed from: E, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26037E = new PaymentAnalyticsEvent("PaymentLauncherNextActionFinished", 28, "paymenthandler.handle_next_action.finished");

    /* renamed from: F, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26039F = new PaymentAnalyticsEvent("FileCreate", 29, "create_file");

    /* renamed from: G, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26041G = new PaymentAnalyticsEvent("Auth3ds1Sdk", 30, "3ds1_sdk");

    /* renamed from: H, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26042H = new PaymentAnalyticsEvent("Auth3ds1ChallengeStart", 31, "3ds1_challenge_start");

    /* renamed from: I, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26043I = new PaymentAnalyticsEvent("Auth3ds1ChallengeError", 32, "3ds1_challenge_error");

    /* renamed from: J, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26044J = new PaymentAnalyticsEvent("Auth3ds1ChallengeComplete", 33, "3ds1_challenge_complete");

    /* renamed from: K, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26045K = new PaymentAnalyticsEvent("AuthWithWebView", 34, "auth_with_webview");

    /* renamed from: L, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26046L = new PaymentAnalyticsEvent("AuthWithCustomTabs", 35, "auth_with_customtabs");

    /* renamed from: M, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26047M = new PaymentAnalyticsEvent("AuthWithDefaultBrowser", 36, "auth_with_defaultbrowser");

    /* renamed from: N, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26048N = new PaymentAnalyticsEvent("ConfirmReturnUrlNull", 37, "confirm_returnurl_null");

    /* renamed from: O, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26049O = new PaymentAnalyticsEvent("ConfirmReturnUrlDefault", 38, "confirm_returnurl_default");

    /* renamed from: P, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26050P = new PaymentAnalyticsEvent("ConfirmReturnUrlCustom", 39, "confirm_returnurl_custom");

    /* renamed from: Q, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26051Q = new PaymentAnalyticsEvent("FpxBankStatusesRetrieve", 40, "retrieve_fpx_bank_statuses");

    /* renamed from: R, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26052R = new PaymentAnalyticsEvent("StripeUrlRetrieve", 41, "retrieve_stripe_url");

    /* renamed from: S, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26053S = new PaymentAnalyticsEvent("Auth3ds2RequestParamsFailed", 42, "3ds2_authentication_request_params_failed");

    /* renamed from: T, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26054T = new PaymentAnalyticsEvent("Auth3ds2Fingerprint", 43, "3ds2_fingerprint");

    /* renamed from: U, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26055U = new PaymentAnalyticsEvent("Auth3ds2Start", 44, "3ds2_authenticate");

    /* renamed from: V, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26056V = new PaymentAnalyticsEvent("Auth3ds2Frictionless", 45, "3ds2_frictionless_flow");

    /* renamed from: W, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26057W = new PaymentAnalyticsEvent("Auth3ds2ChallengePresented", 46, "3ds2_challenge_flow_presented");

    /* renamed from: X, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26058X = new PaymentAnalyticsEvent("Auth3ds2ChallengeCanceled", 47, "3ds2_challenge_flow_canceled");

    /* renamed from: Y, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26059Y = new PaymentAnalyticsEvent("Auth3ds2ChallengeCompleted", 48, "3ds2_challenge_flow_completed");

    /* renamed from: Z, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26060Z = new PaymentAnalyticsEvent("Auth3ds2ChallengeErrored", 49, "3ds2_challenge_flow_errored");

    /* renamed from: p0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26076p0 = new PaymentAnalyticsEvent("Auth3ds2ChallengeTimedOut", 50, "3ds2_challenge_flow_timed_out");

    /* renamed from: q0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26078q0 = new PaymentAnalyticsEvent("Auth3ds2Fallback", 51, "3ds2_fallback");

    /* renamed from: r0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26080r0 = new PaymentAnalyticsEvent("AuthRedirect", 52, "url_redirect_next_action");

    /* renamed from: s0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26082s0 = new PaymentAnalyticsEvent("AuthError", 53, "auth_error");

    /* renamed from: t0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26084t0 = new PaymentAnalyticsEvent("AuthSourceStart", 54, "auth_source_start");

    /* renamed from: u0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26086u0 = new PaymentAnalyticsEvent("AuthSourceRedirect", 55, "auth_source_redirect");

    /* renamed from: v0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26088v0 = new PaymentAnalyticsEvent("AuthSourceResult", 56, "auth_source_result");

    /* renamed from: w0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26090w0 = new PaymentAnalyticsEvent("RadarSessionCreate", 57, "radar_session_create");

    /* renamed from: x0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26092x0 = new PaymentAnalyticsEvent("GooglePayLauncherInit", 58, "googlepaylauncher_init");

    /* renamed from: y0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26094y0 = new PaymentAnalyticsEvent("GooglePayPaymentMethodLauncherInit", 59, "googlepaypaymentmethodlauncher_init");

    /* renamed from: z0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26096z0 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyAvailable", 60, "card_metadata_pk_available");

    /* renamed from: A0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26030A0 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyUnavailable", 61, "card_metadata_pk_unavailable");

    /* renamed from: B0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26032B0 = new PaymentAnalyticsEvent("CardMetadataLoadedTooSlow", 62, "card_metadata_loaded_too_slow");

    /* renamed from: C0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26034C0 = new PaymentAnalyticsEvent("CardMetadataLoadFailure", 63, "card_metadata_load_failure");

    /* renamed from: D0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f26036D0 = new PaymentAnalyticsEvent("CardMetadataMissingRange", 64, "card_metadata_missing_range");

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        PaymentAnalyticsEvent[] b9 = b();
        f26038E0 = b9;
        f26040F0 = b.a(b9);
        f26061b = new a(null);
    }

    private PaymentAnalyticsEvent(String str, int i8, String str2) {
        this.f26097a = str2;
    }

    private static final /* synthetic */ PaymentAnalyticsEvent[] b() {
        return new PaymentAnalyticsEvent[]{f26062c, f26063d, f26064e, f26065f, f26066g, f26067h, f26068i, f26069j, f26070k, f26071l, f26072m, f26073n, f26074o, f26075p, f26077q, f26079r, f26081s, f26083t, f26085u, f26087v, f26089w, f26091x, f26093y, f26095z, f26029A, f26031B, f26033C, f26035D, f26037E, f26039F, f26041G, f26042H, f26043I, f26044J, f26045K, f26046L, f26047M, f26048N, f26049O, f26050P, f26051Q, f26052R, f26053S, f26054T, f26055U, f26056V, f26057W, f26058X, f26059Y, f26060Z, f26076p0, f26078q0, f26080r0, f26082s0, f26084t0, f26086u0, f26088v0, f26090w0, f26092x0, f26094y0, f26096z0, f26030A0, f26032B0, f26034C0, f26036D0};
    }

    public static PaymentAnalyticsEvent valueOf(String str) {
        return (PaymentAnalyticsEvent) Enum.valueOf(PaymentAnalyticsEvent.class, str);
    }

    public static PaymentAnalyticsEvent[] values() {
        return (PaymentAnalyticsEvent[]) f26038E0.clone();
    }

    @Override // B2.InterfaceC0949a
    public String a() {
        return toString();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return "stripe_android." + this.f26097a;
    }
}
