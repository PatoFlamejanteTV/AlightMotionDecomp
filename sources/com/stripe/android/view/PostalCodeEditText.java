package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.textfield.TextInputLayout;
import f6.AbstractC2869b;
import f6.C2868a;
import f6.InterfaceC2872e;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PostalCodeEditText extends StripeEditText {

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC2872e f28806p;

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ j6.i[] f28803r = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(PostalCodeEditText.class, "config", "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;", 0))};

    /* renamed from: q, reason: collision with root package name */
    private static final a f28802q = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f28804s = 8;

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f28805t = Pattern.compile("^[0-9]{5}$");

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28807a = new b("Global", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f28808b = new b("US", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f28809c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ W5.a f28810d;

        static {
            b[] a9 = a();
            f28809c = a9;
            f28810d = W5.b.a(a9);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f28807a, f28808b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f28809c.clone();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28811a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f28807a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f28808b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28811a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            PostalCodeEditText.this.setShouldShowError(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostalCodeEditText f28813b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, PostalCodeEditText postalCodeEditText) {
            super(obj);
            this.f28813b = postalCodeEditText;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            int i8 = c.f28811a[((b) obj2).ordinal()];
            if (i8 == 1) {
                this.f28813b.n();
            } else if (i8 == 2) {
                this.f28813b.o();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        q(v2.e.f40444g);
        setKeyListener(TextKeyListener.getInstance());
        setInputType(112);
        setFilters(new InputFilter[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        q(v2.e.f40447j);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        setKeyListener(DigitsKeyListener.getInstance(false, true));
        j();
    }

    private final void q(int i8) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            if (textInputLayout.isHintEnabled()) {
                textInputLayout.setHint(getResources().getString(i8));
            } else {
                setHint(i8);
            }
        }
    }

    public final b getConfig$payments_core_release() {
        return (b) this.f28806p.getValue(this, f28803r[0]);
    }

    public final String getPostalCode$payments_core_release() {
        if (getConfig$payments_core_release() == b.f28808b) {
            String fieldText$payments_core_release = getFieldText$payments_core_release();
            if (!f28805t.matcher(getFieldText$payments_core_release()).matches()) {
                return null;
            }
            return fieldText$payments_core_release;
        }
        return getFieldText$payments_core_release();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        n();
    }

    public final boolean p() {
        if ((getConfig$payments_core_release() == b.f28808b && f28805t.matcher(getFieldText$payments_core_release()).matches()) || (getConfig$payments_core_release() == b.f28807a && getFieldText$payments_core_release().length() > 0)) {
            return true;
        }
        return false;
    }

    public final void setConfig$payments_core_release(b bVar) {
        AbstractC3292y.i(bVar, "<set-?>");
        this.f28806p.setValue(this, f28803r[0], bVar);
    }

    public /* synthetic */ PostalCodeEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        C2868a c2868a = C2868a.f31918a;
        this.f28806p = new e(b.f28807a, this);
        setErrorMessage(getResources().getString(AbstractC3394E.f35269y0));
        setMaxLines(1);
        addTextChangedListener(new d());
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_POSTAL_CODE});
        }
    }
}
