package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import g3.C2895E;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2648f extends AbstractC2658k {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2676u f28922a;

    /* renamed from: b, reason: collision with root package name */
    private final CardMultilineWidget f28923b;

    /* renamed from: c, reason: collision with root package name */
    private final ShippingInfoWidget f28924c;

    /* renamed from: com.stripe.android.view.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements TextView.OnEditorActionListener {

        /* renamed from: a, reason: collision with root package name */
        private final AddPaymentMethodActivity f28925a;

        /* renamed from: b, reason: collision with root package name */
        private final C2648f f28926b;

        /* renamed from: c, reason: collision with root package name */
        private final C2653h0 f28927c;

        public a(AddPaymentMethodActivity activity, C2648f addPaymentMethodCardView, C2653h0 keyboardController) {
            AbstractC3292y.i(activity, "activity");
            AbstractC3292y.i(addPaymentMethodCardView, "addPaymentMethodCardView");
            AbstractC3292y.i(keyboardController, "keyboardController");
            this.f28925a = activity;
            this.f28926b = addPaymentMethodCardView;
            this.f28927c = keyboardController;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            if (i8 == 6) {
                if (this.f28926b.getCreateParams() != null) {
                    this.f28927c.a();
                }
                this.f28925a.q();
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.stripe.android.view.f$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28928a;

        static {
            int[] iArr = new int[EnumC2676u.values().length];
            try {
                iArr[EnumC2676u.f29216c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2676u.f29214a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2676u.f29215b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28928a = iArr;
        }
    }

    public /* synthetic */ C2648f(Context context, AttributeSet attributeSet, int i8, EnumC2676u enumC2676u, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? EnumC2676u.f29215b : enumC2676u);
    }

    private final void a(AddPaymentMethodActivity addPaymentMethodActivity) {
        a aVar = new a(addPaymentMethodActivity, this, new C2653h0(addPaymentMethodActivity));
        this.f28923b.getCardNumberEditText().setOnEditorActionListener(aVar);
        this.f28923b.getExpiryDateEditText().setOnEditorActionListener(aVar);
        this.f28923b.getCvcEditText().setOnEditorActionListener(aVar);
        this.f28923b.getPostalCodeEditText$payments_core_release().setOnEditorActionListener(aVar);
    }

    private final o.e getBillingDetails() {
        C2895E shippingInformation;
        if (this.f28922a != EnumC2676u.f29216c || (shippingInformation = this.f28924c.getShippingInformation()) == null) {
            return null;
        }
        return o.e.f25669e.a(shippingInformation);
    }

    @Override // com.stripe.android.view.AbstractC2658k
    public com.stripe.android.model.p getCreateParams() {
        int i8 = b.f28928a[this.f28922a.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return this.f28923b.getPaymentMethodCreateParams();
                }
                throw new Q5.p();
            }
            return this.f28923b.getPaymentMethodCreateParams();
        }
        p.c paymentMethodCard = this.f28923b.getPaymentMethodCard();
        o.e billingDetails = getBillingDetails();
        if (paymentMethodCard != null && billingDetails != null) {
            return p.e.e(com.stripe.android.model.p.f25804u, paymentMethodCard, billingDetails, null, null, 12, null);
        }
        return null;
    }

    public final void setCardInputListener(A a9) {
        this.f28923b.setCardInputListener(a9);
    }

    @Override // com.stripe.android.view.AbstractC2658k
    public void setCommunicatingProgress(boolean z8) {
        this.f28923b.setEnabled(!z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2648f(Context context, AttributeSet attributeSet, int i8, EnumC2676u billingAddressFields) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(billingAddressFields, "billingAddressFields");
        this.f28922a = billingAddressFields;
        L2.d c8 = L2.d.c(LayoutInflater.from(context), this, true);
        AbstractC3292y.h(c8, "inflate(...)");
        CardMultilineWidget cardMultilineWidget = c8.f5297d;
        AbstractC3292y.h(cardMultilineWidget, "cardMultilineWidget");
        this.f28923b = cardMultilineWidget;
        cardMultilineWidget.setShouldShowPostalCode(billingAddressFields == EnumC2676u.f29215b);
        ShippingInfoWidget billingAddressWidget = c8.f5296c;
        AbstractC3292y.h(billingAddressWidget, "billingAddressWidget");
        this.f28924c = billingAddressWidget;
        if (billingAddressFields == EnumC2676u.f29216c) {
            billingAddressWidget.setVisibility(0);
        }
        AddPaymentMethodActivity addPaymentMethodActivity = context instanceof AddPaymentMethodActivity ? (AddPaymentMethodActivity) context : null;
        if (addPaymentMethodActivity != null) {
            a(addPaymentMethodActivity);
        }
    }
}
