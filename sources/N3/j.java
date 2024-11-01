package N3;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class j extends Throwable {

    /* loaded from: classes4.dex */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private final n.e f6586a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6587b;

        /* renamed from: c, reason: collision with root package name */
        private final String f6588c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n.e confirmationMethod) {
            super(null);
            AbstractC3292y.i(confirmationMethod, "confirmationMethod");
            this.f6586a = confirmationMethod;
            this.f6587b = "invalidConfirmationMethod";
            this.f6588c = l6.n.e("\n            PaymentIntent with confirmation_method='automatic' is required.\n            The current PaymentIntent has confirmation_method '" + confirmationMethod + "'.\n            See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n        ");
        }

        @Override // N3.j
        public String a() {
            return this.f6587b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f6586a == ((a) obj).f6586a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f6588c;
        }

        public int hashCode() {
            return this.f6586a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidConfirmationMethod(confirmationMethod=" + this.f6586a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6589a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final String f6590b = "missingAmountOrCurrency";

        /* renamed from: c, reason: collision with root package name */
        private static final String f6591c = "PaymentIntent must contain amount and currency.";

        private b() {
            super(null);
        }

        @Override // N3.j
        public String a() {
            return f6590b;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return f6591c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        private final String f6592a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String requested) {
            super(null);
            AbstractC3292y.i(requested, "requested");
            this.f6592a = requested;
            this.f6593b = "noPaymentMethodTypesAvailable";
        }

        @Override // N3.j
        public String a() {
            return this.f6593b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f6592a, ((c) obj).f6592a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "None of the requested payment methods (" + this.f6592a + ") are supported.";
        }

        public int hashCode() {
            return this.f6592a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NoPaymentMethodTypesAvailable(requested=" + this.f6592a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent.Status f6594a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6595b;

        public d(StripeIntent.Status status) {
            super(null);
            this.f6594a = status;
            this.f6595b = "paymentIntentInTerminalState";
        }

        @Override // N3.j
        public String a() {
            return this.f6595b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.f6594a == ((d) obj).f6594a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return l6.n.e("\n                PaymentSheet cannot set up a PaymentIntent in status '" + this.f6594a + "'.\n                See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.f6594a;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PaymentIntentInTerminalState(status=" + this.f6594a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends j {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent.Status f6596a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6597b;

        public e(StripeIntent.Status status) {
            super(null);
            this.f6596a = status;
            this.f6597b = "setupIntentInTerminalState";
        }

        @Override // N3.j
        public String a() {
            return this.f6597b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && this.f6596a == ((e) obj).f6596a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return l6.n.e("\n                PaymentSheet cannot set up a SetupIntent in status '" + this.f6596a + "'.\n                See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.f6596a;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "SetupIntentInTerminalState(status=" + this.f6596a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f6598a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6599b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable cause) {
            super(null);
            AbstractC3292y.i(cause, "cause");
            this.f6598a = cause;
            this.f6599b = getCause().getMessage();
        }

        @Override // N3.j
        public String a() {
            return x2.k.f40948e.b(getCause()).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && AbstractC3292y.d(this.f6598a, ((f) obj).f6598a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f6598a;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f6599b;
        }

        public int hashCode() {
            return this.f6598a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(cause=" + this.f6598a + ")";
        }
    }

    public /* synthetic */ j(AbstractC3284p abstractC3284p) {
        this();
    }

    public abstract String a();

    private j() {
    }
}
