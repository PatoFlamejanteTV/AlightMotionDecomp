package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.StripeEditText;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2643c0 implements StripeEditText.c {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f28901a;

    public C2643c0(TextInputLayout textInputLayout) {
        AbstractC3292y.i(textInputLayout, "textInputLayout");
        this.f28901a = textInputLayout;
    }

    @Override // com.stripe.android.view.StripeEditText.c
    public void a(String str) {
        if (str == null) {
            this.f28901a.setError(null);
            this.f28901a.setErrorEnabled(false);
        } else {
            this.f28901a.setError(str);
        }
    }
}
