package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.LocaleListCompat;
import com.google.android.material.textfield.TextInputLayout;
import f6.AbstractC2869b;
import f6.C2868a;
import f6.InterfaceC2872e;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3392C;
import n2.AbstractC3394E;
import n2.AbstractC3396G;
import z2.C4266a;
import z2.b;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CountryTextInputLayout extends TextInputLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f28572a;

    /* renamed from: b, reason: collision with root package name */
    private int f28573b;

    /* renamed from: c, reason: collision with root package name */
    private final AutoCompleteTextView f28574c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2872e f28575d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Function1 f28576e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Function1 f28577f;

    /* renamed from: g, reason: collision with root package name */
    private Q f28578g;

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ j6.i[] f28569i = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};

    /* renamed from: h, reason: collision with root package name */
    private static final c f28568h = new c(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f28570j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f28571k = AbstractC3392C.f35166m;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f28579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountryTextInputLayout f28580b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, CountryTextInputLayout countryTextInputLayout) {
            super(1);
            this.f28579a = context;
            this.f28580b = countryTextInputLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke(ViewGroup it) {
            AbstractC3292y.i(it, "it");
            View inflate = LayoutInflater.from(this.f28579a).inflate(this.f28580b.f28573b, it, false);
            AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) inflate;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28582b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f28582b = str;
        }

        public final void a(C4266a c4266a) {
            z2.b bVar;
            CountryTextInputLayout countryTextInputLayout = CountryTextInputLayout.this;
            if (c4266a != null) {
                bVar = c4266a.b();
            } else {
                bVar = null;
            }
            countryTextInputLayout.setSelectedCountryCode$payments_core_release(bVar);
            if (c4266a != null) {
                CountryTextInputLayout.this.j();
            } else {
                CountryTextInputLayout.this.setError(this.f28582b);
                CountryTextInputLayout.this.setErrorEnabled(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4266a) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    private static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final z2.b f28583a;

        /* renamed from: b, reason: collision with root package name */
        private final Parcelable f28584b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d((z2.b) parcel.readParcelable(d.class.getClassLoader()), parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(z2.b countryCode, Parcelable parcelable) {
            AbstractC3292y.i(countryCode, "countryCode");
            this.f28583a = countryCode;
            this.f28584b = parcelable;
        }

        public final z2.b a() {
            return this.f28583a;
        }

        public final Parcelable b() {
            return this.f28584b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3292y.d(this.f28583a, dVar.f28583a) && AbstractC3292y.d(this.f28584b, dVar.f28584b);
        }

        public int hashCode() {
            int hashCode = this.f28583a.hashCode() * 31;
            Parcelable parcelable = this.f28584b;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            return "SelectedCountryState(countryCode=" + this.f28583a + ", superState=" + this.f28584b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f28583a, i8);
            out.writeParcelable(this.f28584b, i8);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f28585a = new e();

        e() {
            super(1);
        }

        public final void a(C4266a it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4266a) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f28586a = new f();

        f() {
            super(1);
        }

        public final void a(z2.b it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z2.b) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28588b;

        public g(boolean z8) {
            this.f28588b = z8;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            view.removeOnLayoutChangeListener(this);
            CountryTextInputLayout.this.getCountryAutocomplete().setEnabled(this.f28588b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountryTextInputLayout f28589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, CountryTextInputLayout countryTextInputLayout) {
            super(obj);
            this.f28589b = countryTextInputLayout;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            z2.b bVar = (z2.b) obj2;
            if (bVar != null) {
                this.f28589b.getCountryCodeChangeCallback().invoke(bVar);
                C4266a d8 = z2.d.f41472a.d(bVar, this.f28589b.getLocale());
                if (d8 != null) {
                    this.f28589b.getCountryChangeCallback$payments_core_release().invoke(d8);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CountryTextInputLayout this$0, AdapterView adapterView, View view, int i8, long j8) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.o(this$0.f28578g.getItem(i8).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(CountryTextInputLayout this$0, View view, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        if (z8) {
            this$0.f28574c.showDropDown();
            return;
        }
        String obj = this$0.f28574c.getText().toString();
        z2.d dVar = z2.d.f41472a;
        z2.b e8 = dVar.e(obj, this$0.getLocale());
        if (e8 != null) {
            this$0.n(e8);
            return;
        }
        b.C0945b c0945b = z2.b.Companion;
        if (dVar.d(c0945b.a(obj), this$0.getLocale()) != null) {
            this$0.n(c0945b.a(obj));
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale() {
        Locale locale = LocaleListCompat.getAdjustedDefault().get(0);
        AbstractC3292y.f(locale);
        return locale;
    }

    @VisibleForTesting
    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        setError(null);
        setErrorEnabled(false);
    }

    private final AutoCompleteTextView k() {
        if (this.f28572a == 0) {
            return new AutoCompleteTextView(getContext(), null, R.attr.autoCompleteTextViewStyle);
        }
        return new AutoCompleteTextView(getContext(), null, 0, this.f28572a);
    }

    private final void m() {
        C4266a b9 = this.f28578g.b();
        this.f28574c.setText(b9.f());
        setSelectedCountryCode$payments_core_release(b9.b());
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.f28574c;
    }

    public final Function1 getCountryChangeCallback$payments_core_release() {
        return this.f28576e;
    }

    public final Function1 getCountryCodeChangeCallback() {
        return this.f28577f;
    }

    public final C4266a getSelectedCountry$payments_core_release() {
        z2.b selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release != null) {
            return z2.d.f41472a.d(selectedCountryCode$payments_core_release, getLocale());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final z2.b getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final z2.b getSelectedCountryCode$payments_core_release() {
        return (z2.b) this.f28575d.getValue(this, f28569i[0]);
    }

    public final void l(d state) {
        AbstractC3292y.i(state, "state");
        super.onRestoreInstanceState(state.b());
        z2.b a9 = state.a();
        o(a9);
        n(a9);
        requestLayout();
    }

    public final void n(z2.b countryCode) {
        String str;
        AbstractC3292y.i(countryCode, "countryCode");
        z2.d dVar = z2.d.f41472a;
        C4266a d8 = dVar.d(countryCode, getLocale());
        if (d8 != null) {
            o(countryCode);
        } else {
            d8 = dVar.d(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        AutoCompleteTextView autoCompleteTextView = this.f28574c;
        if (d8 != null) {
            str = d8.f();
        } else {
            str = null;
        }
        autoCompleteTextView.setText(str);
    }

    public final void o(z2.b countryCode) {
        AbstractC3292y.i(countryCode, "countryCode");
        j();
        if (!AbstractC3292y.d(getSelectedCountryCode$payments_core_release(), countryCode)) {
            setSelectedCountryCode$payments_core_release(countryCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            l((d) parcelable);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        C4266a selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            return new d(selectedCountry$payments_core_release.b(), super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    public final void p() {
        this.f28574c.performValidation();
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        AbstractC3292y.i(allowedCountryCodes, "allowedCountryCodes");
        if (this.f28578g.f(allowedCountryCodes)) {
            m();
        }
    }

    public final void setCountryChangeCallback$payments_core_release(Function1 function1) {
        AbstractC3292y.i(function1, "<set-?>");
        this.f28576e = function1;
    }

    public final void setCountryCodeChangeCallback(Function1 function1) {
        AbstractC3292y.i(function1, "<set-?>");
        this.f28577f = function1;
    }

    @VisibleForTesting
    public final void setCountrySelected$payments_core_release(z2.b countryCode) {
        AbstractC3292y.i(countryCode, "countryCode");
        n(countryCode);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        addOnLayoutChangeListener(new g(z8));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setSelectedCountryCode(z2.b bVar) {
        setSelectedCountryCode$payments_core_release(bVar);
    }

    public final void setSelectedCountryCode$payments_core_release(z2.b bVar) {
        this.f28575d.setValue(this, f28569i[0], bVar);
    }

    public /* synthetic */ CountryTextInputLayout(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? com.google.android.material.R.attr.textInputStyle : i8);
    }

    @VisibleForTesting
    public final void setCountrySelected$payments_core_release(String countryCode) {
        AbstractC3292y.i(countryCode, "countryCode");
        n(z2.b.Companion.a(countryCode));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        int i9 = f28571k;
        this.f28573b = i9;
        C2868a c2868a = C2868a.f31918a;
        this.f28575d = new h(null, this);
        this.f28576e = e.f28585a;
        this.f28577f = f.f28586a;
        int[] StripeCountryAutoCompleteTextInputLayout = AbstractC3396G.f35280h;
        AbstractC3292y.h(StripeCountryAutoCompleteTextInputLayout, "StripeCountryAutoCompleteTextInputLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCountryAutoCompleteTextInputLayout, 0, 0);
        this.f28572a = obtainStyledAttributes.getResourceId(AbstractC3396G.f35281i, 0);
        this.f28573b = obtainStyledAttributes.getResourceId(AbstractC3396G.f35282j, i9);
        obtainStyledAttributes.recycle();
        AutoCompleteTextView k8 = k();
        this.f28574c = k8;
        addView(k8, new LinearLayout.LayoutParams(-1, -2));
        this.f28578g = new Q(context, z2.d.f41472a.f(getLocale()), this.f28573b, new a(context, this));
        k8.setThreshold(0);
        k8.setAdapter(this.f28578g);
        k8.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.T
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j8) {
                CountryTextInputLayout.e(CountryTextInputLayout.this, adapterView, view, i10, j8);
            }
        });
        k8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.U
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CountryTextInputLayout.f(CountryTextInputLayout.this, view, z8);
            }
        });
        setSelectedCountryCode$payments_core_release(this.f28578g.b().b());
        m();
        String string = getResources().getString(AbstractC3394E.f35234h);
        AbstractC3292y.h(string, "getString(...)");
        k8.setValidator(new S(this.f28578g, new b(string)));
    }
}
