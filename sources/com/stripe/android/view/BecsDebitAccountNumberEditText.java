package com.stripe.android.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BecsDebitAccountNumberEditText extends StripeEditText {

    /* renamed from: q, reason: collision with root package name */
    public static final a f28393q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f28394r = 8;

    /* renamed from: p, reason: collision with root package name */
    private int f28395p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            BecsDebitAccountNumberEditText.this.setShouldShowError(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    public final String getAccountNumber() {
        String str;
        if (l6.n.T(getFieldText$payments_core_release())) {
            str = getResources().getString(AbstractC3394E.f35209P);
        } else if (getFieldText$payments_core_release().length() < this.f28395p) {
            str = getResources().getString(AbstractC3394E.f35208O);
        } else {
            str = null;
        }
        setErrorMessage$payments_core_release(str);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (getErrorMessage$payments_core_release() != null) {
            return null;
        }
        return fieldText$payments_core_release;
    }

    public final int getMinLength() {
        return this.f28395p;
    }

    public final void setMinLength(int i8) {
        this.f28395p = i8;
    }

    public /* synthetic */ BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28395p = 5;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(9)});
        setInputType(2);
        addTextChangedListener(new b());
    }
}
