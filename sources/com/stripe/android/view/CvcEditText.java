package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.textfield.TextInputLayout;
import g3.EnumC2906e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;
import p2.AbstractC3566h;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CvcEditText extends StripeEditText {

    /* renamed from: p, reason: collision with root package name */
    private EnumC2906e f28590p;

    /* renamed from: q, reason: collision with root package name */
    private /* synthetic */ Function0 f28591q;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28592a;

        static {
            int[] iArr = new int[EnumC2906e.values().length];
            try {
                iArr[EnumC2906e.f32119q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f28592a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28593a = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5532invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5532invoke();
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CvcEditText.this.setShouldShowError(false);
            if (CvcEditText.this.f28590p.p(CvcEditText.this.getUnvalidatedCvc().a())) {
                CvcEditText.this.getCompletionCallback$payments_core_release().invoke();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC3566h.b getUnvalidatedCvc() {
        return new AbstractC3566h.b(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(CvcEditText this$0, View view, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        if (!z8 && this$0.getUnvalidatedCvc().c(this$0.f28590p.m())) {
            this$0.setShouldShowError(true);
        }
    }

    private final InputFilter[] p(EnumC2906e enumC2906e) {
        return new InputFilter[]{new InputFilter.LengthFilter(enumC2906e.m())};
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(AbstractC3394E.f35224c, getText());
        AbstractC3292y.h(string, "getString(...)");
        return string;
    }

    public final Function0 getCompletionCallback$payments_core_release() {
        return this.f28591q;
    }

    public final AbstractC3566h.c getCvc$payments_core_release() {
        return getUnvalidatedCvc().d(this.f28590p.m());
    }

    public final /* synthetic */ void q(EnumC2906e cardBrand, String str, String str2, TextInputLayout textInputLayout) {
        int i8;
        boolean z8;
        AbstractC3292y.i(cardBrand, "cardBrand");
        this.f28590p = cardBrand;
        setFilters(p(cardBrand));
        if (str == null) {
            if (cardBrand == EnumC2906e.f32119q) {
                str = getResources().getString(AbstractC3394E.f35223b0);
            } else {
                str = getResources().getString(AbstractC3394E.f35229e0);
            }
            AbstractC3292y.f(str);
        }
        if (getUnvalidatedCvc().a().length() > 0) {
            if (getUnvalidatedCvc().d(cardBrand.m()) == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            setShouldShowError(z8);
        }
        if (textInputLayout != null) {
            textInputLayout.setHint(str);
            if (str2 == null) {
                Resources resources = getResources();
                if (a.f28592a[cardBrand.ordinal()] == 1) {
                    i8 = AbstractC3394E.f35227d0;
                } else {
                    i8 = AbstractC3394E.f35225c0;
                }
                str2 = resources.getString(i8);
            }
            textInputLayout.setPlaceholderText(str2);
            return;
        }
        setHint(str);
    }

    public final void setCompletionCallback$payments_core_release(Function0 function0) {
        AbstractC3292y.i(function0, "<set-?>");
        this.f28591q = function0;
    }

    public /* synthetic */ CvcEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        EnumC2906e enumC2906e = EnumC2906e.f32125w;
        this.f28590p = enumC2906e;
        this.f28591q = b.f28593a;
        setErrorMessage(getResources().getString(AbstractC3394E.f35263v0));
        setHint(AbstractC3394E.f35229e0);
        setMaxLines(1);
        setFilters(p(enumC2906e));
        j();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE});
        }
        addTextChangedListener(new c());
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.W
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CvcEditText.m(CvcEditText.this, view, z8);
            }
        });
        setLayoutDirection(0);
    }
}
