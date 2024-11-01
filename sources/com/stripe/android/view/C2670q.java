package com.stripe.android.view;

import android.text.Editable;
import com.stripe.android.view.StripeEditText;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2670q implements StripeEditText.b {

    /* renamed from: a, reason: collision with root package name */
    private final StripeEditText f29149a;

    public C2670q(StripeEditText backUpTarget) {
        AbstractC3292y.i(backUpTarget, "backUpTarget");
        this.f29149a = backUpTarget;
    }

    @Override // com.stripe.android.view.StripeEditText.b
    public void a() {
        String str;
        Editable text = this.f29149a.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() > 1) {
            StripeEditText stripeEditText = this.f29149a;
            String substring = str.substring(0, str.length() - 1);
            AbstractC3292y.h(substring, "substring(...)");
            stripeEditText.setText(substring);
        }
        this.f29149a.requestFocus();
        StripeEditText stripeEditText2 = this.f29149a;
        stripeEditText2.setSelection(stripeEditText2.length());
    }
}
