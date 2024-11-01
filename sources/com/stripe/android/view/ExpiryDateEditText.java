package com.stripe.android.view;

import Q5.s;
import R5.AbstractC1435t;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mbridge.msdk.MBridgeConstans;
import f6.AbstractC2869b;
import f6.C2868a;
import f6.InterfaceC2872e;
import g3.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3391B;
import n2.AbstractC3394E;
import o4.AbstractC3533g;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExpiryDateEditText extends StripeEditText {

    /* renamed from: p, reason: collision with root package name */
    private /* synthetic */ Function0 f28622p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28623q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC2872e f28624r;

    /* renamed from: s, reason: collision with root package name */
    private final int f28625s;

    /* renamed from: t, reason: collision with root package name */
    private String f28626t;

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ j6.i[] f28620v = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0))};

    /* renamed from: u, reason: collision with root package name */
    private static final a f28619u = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f28621w = 8;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28627a = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5533invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5533invoke();
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private int f28628a;

        /* renamed from: b, reason: collision with root package name */
        private int f28629b;

        /* renamed from: c, reason: collision with root package name */
        private w.a f28630c = w.a.f32265f.b();

        /* renamed from: d, reason: collision with root package name */
        private Integer f28631d;

        /* renamed from: e, reason: collision with root package name */
        private String f28632e;

        c() {
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z8;
            int i8;
            String str = this.f28632e;
            boolean z9 = false;
            if (str != null) {
                ExpiryDateEditText.this.setTextSilent$payments_core_release(str);
                Integer num = this.f28631d;
                if (num != null) {
                    ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                    expiryDateEditText.setSelection(i6.m.k(num.intValue(), 0, expiryDateEditText.getFieldText$payments_core_release().length()));
                }
            }
            String b9 = this.f28630c.b();
            String c8 = this.f28630c.c();
            if (b9.length() == 2 && !this.f28630c.e()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (b9.length() != 2 || c8.length() != 2) {
                ExpiryDateEditText.this.f28623q = false;
            } else {
                boolean s8 = ExpiryDateEditText.this.s();
                ExpiryDateEditText expiryDateEditText2 = ExpiryDateEditText.this;
                expiryDateEditText2.f28623q = expiryDateEditText2.t(b9, c8);
                boolean z10 = !ExpiryDateEditText.this.s();
                if (!s8 && ExpiryDateEditText.this.s()) {
                    ExpiryDateEditText.this.getCompletionCallback$payments_core_release().invoke();
                }
                z8 = z10;
            }
            ExpiryDateEditText expiryDateEditText3 = ExpiryDateEditText.this;
            Resources resources = expiryDateEditText3.getResources();
            if (this.f28630c.f()) {
                i8 = AbstractC3533g.f35953F;
            } else if (!this.f28630c.e()) {
                i8 = AbstractC3533g.f35955H;
            } else {
                i8 = AbstractC3533g.f35956I;
            }
            expiryDateEditText3.setErrorMessage(resources.getString(i8));
            ExpiryDateEditText expiryDateEditText4 = ExpiryDateEditText.this;
            if (z8 && (this.f28630c.f() || this.f28630c.d())) {
                z9 = true;
            }
            expiryDateEditText4.setShouldShowError(z9);
            this.f28632e = null;
            this.f28631d = null;
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            this.f28628a = i8;
            this.f28629b = i10;
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            String str;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            if (sb2.length() == 1 && this.f28628a == 0 && this.f28629b == 1) {
                char charAt2 = sb2.charAt(0);
                if (charAt2 != '0' && charAt2 != '1') {
                    sb2 = MBridgeConstans.ENDCARD_URL_TYPE_PL + sb2;
                    this.f28629b++;
                }
            } else if (sb2.length() == 2 && this.f28628a == 2 && this.f28629b == 0) {
                sb2 = sb2.substring(0, 1);
                AbstractC3292y.h(sb2, "substring(...)");
            }
            w.a a9 = w.a.f32265f.a(sb2);
            this.f28630c = a9;
            boolean z8 = !a9.e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a9.b());
            if ((a9.b().length() == 2 && this.f28629b > 0 && !z8) || sb2.length() > 2) {
                sb3.append(ExpiryDateEditText.this.f28626t);
            }
            sb3.append(a9.c());
            String sb4 = sb3.toString();
            AbstractC3292y.h(sb4, "toString(...)");
            this.f28631d = Integer.valueOf(ExpiryDateEditText.this.u(sb4.length(), this.f28628a, this.f28629b, ExpiryDateEditText.this.f28625s + ExpiryDateEditText.this.f28626t.length()));
            this.f28632e = sb4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpiryDateEditText f28634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, ExpiryDateEditText expiryDateEditText) {
            super(obj);
            this.f28634b = expiryDateEditText;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.f28634b.v(booleanValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final void i() {
        addTextChangedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ExpiryDateEditText this$0, View view, boolean z8) {
        Editable text;
        AbstractC3292y.i(this$0, "this$0");
        if (!z8 && (text = this$0.getText()) != null && text.length() != 0 && !this$0.f28623q) {
            this$0.setShouldShowError(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(String str, String str2) {
        Object b9;
        int intValue;
        Object obj;
        int i8 = -1;
        Object obj2 = -1;
        if (str.length() != 2) {
            intValue = -1;
        } else {
            try {
                s.a aVar = Q5.s.f8810b;
                b9 = Q5.s.b(Integer.valueOf(Integer.parseInt(str)));
            } catch (Throwable th) {
                s.a aVar2 = Q5.s.f8810b;
                b9 = Q5.s.b(Q5.t.a(th));
            }
            if (Q5.s.g(b9)) {
                b9 = obj2;
            }
            intValue = ((Number) b9).intValue();
        }
        if (str2.length() == 2) {
            try {
                s.a aVar3 = Q5.s.f8810b;
                obj = Q5.s.b(Integer.valueOf(X.f28885a.a(Integer.parseInt(str2))));
            } catch (Throwable th2) {
                s.a aVar4 = Q5.s.f8810b;
                obj = Q5.s.b(Q5.t.a(th2));
            }
            if (!Q5.s.g(obj)) {
                obj2 = obj;
            }
            i8 = ((Number) obj2).intValue();
        }
        return X.c(intValue, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(boolean z8) {
        String str;
        if (z8) {
            str = " / ";
        } else {
            str = "/";
        }
        this.f28626t = str;
        setFilters((InputFilter[]) AbstractC1435t.e(new InputFilter.LengthFilter(this.f28625s + this.f28626t.length())).toArray(new InputFilter.LengthFilter[0]));
    }

    static /* synthetic */ void w(ExpiryDateEditText expiryDateEditText, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        expiryDateEditText.v(z8);
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(AbstractC3394E.f35228e, getText());
        AbstractC3292y.h(string, "getString(...)");
        return string;
    }

    public final Function0 getCompletionCallback$payments_core_release() {
        return this.f28622p;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.f28624r.getValue(this, f28620v[0])).booleanValue();
    }

    public final w.b getValidatedDate() {
        boolean z8 = this.f28623q;
        if (z8) {
            return w.a.f32265f.a(getFieldText$payments_core_release()).g();
        }
        if (!z8) {
            return null;
        }
        throw new Q5.p();
    }

    public final boolean s() {
        return this.f28623q;
    }

    public final void setCompletionCallback$payments_core_release(Function0 function0) {
        AbstractC3292y.i(function0, "<set-?>");
        this.f28622p = function0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setIncludeSeparatorGaps(boolean z8) {
        setIncludeSeparatorGaps$payments_core_release(z8);
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z8) {
        this.f28624r.setValue(this, f28620v[0], Boolean.valueOf(z8));
    }

    public final int u(int i8, int i9, int i10, int i11) {
        int i12;
        boolean z8;
        int i13 = 0;
        if (i9 <= 2 && i9 + i10 >= 2) {
            i12 = this.f28626t.length();
        } else {
            i12 = 0;
        }
        if (i10 == 0 && i9 == this.f28626t.length() + 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i14 = i9 + i10 + i12;
        if (z8 && i14 > 0) {
            i13 = this.f28626t.length();
        }
        return Math.min(i11, Math.min(i14 - i13, i8));
    }

    public /* synthetic */ ExpiryDateEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28622p = b.f28627a;
        C2868a c2868a = C2868a.f31918a;
        this.f28624r = new d(Boolean.FALSE, this);
        this.f28625s = context.getResources().getInteger(AbstractC3391B.f35152a);
        this.f28626t = "/";
        j();
        w(this, false, 1, null);
        i();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE});
        }
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.e0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                ExpiryDateEditText.m(ExpiryDateEditText.this, view, z8);
            }
        });
        setLayoutDirection(0);
    }
}
