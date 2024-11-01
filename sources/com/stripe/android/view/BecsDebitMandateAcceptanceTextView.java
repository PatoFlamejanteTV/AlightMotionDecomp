package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import f6.AbstractC2869b;
import f6.C2868a;
import f6.InterfaceC2872e;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BecsDebitMandateAcceptanceTextView extends AppCompatTextView {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ j6.i[] f28408c = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(BecsDebitMandateAcceptanceTextView.class, "companyName", "getCompanyName()Ljava/lang/String;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final int f28409d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C2675t f28410a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2872e f28411b;

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BecsDebitMandateAcceptanceTextView f28412b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView) {
            super(obj);
            this.f28412b = becsDebitMandateAcceptanceTextView;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            CharSequence charSequence;
            AbstractC3292y.i(property, "property");
            String str = (String) obj2;
            BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = this.f28412b;
            if (!(!l6.n.T(str))) {
                str = null;
            }
            if (str == null || (charSequence = this.f28412b.f28410a.a(str)) == null) {
                charSequence = "";
            }
            becsDebitMandateAcceptanceTextView.setText(charSequence);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    public final String getCompanyName() {
        return (String) this.f28411b.getValue(this, f28408c[0]);
    }

    public final void setCompanyName(String str) {
        AbstractC3292y.i(str, "<set-?>");
        this.f28411b.setValue(this, f28408c[0], str);
    }

    public /* synthetic */ BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.textViewStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28410a = new C2675t(context);
        setMovementMethod(LinkMovementMethod.getInstance());
        C2868a c2868a = C2868a.f31918a;
        this.f28411b = new a("", this);
    }
}
