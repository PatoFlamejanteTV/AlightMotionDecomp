package com.stripe.android.view;

import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.a;
import g3.C2895E;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n2.AbstractC3394E;
import o4.AbstractC3533g;
import z2.C4266a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ShippingInfoWidget extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f28832a;

    /* renamed from: b, reason: collision with root package name */
    private final G0 f28833b;

    /* renamed from: c, reason: collision with root package name */
    private List f28834c;

    /* renamed from: d, reason: collision with root package name */
    private List f28835d;

    /* renamed from: e, reason: collision with root package name */
    private final CountryTextInputLayout f28836e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout f28837f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout f28838g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f28839h;

    /* renamed from: i, reason: collision with root package name */
    private final TextInputLayout f28840i;

    /* renamed from: j, reason: collision with root package name */
    private final TextInputLayout f28841j;

    /* renamed from: k, reason: collision with root package name */
    private final TextInputLayout f28842k;

    /* renamed from: l, reason: collision with root package name */
    private final TextInputLayout f28843l;

    /* renamed from: m, reason: collision with root package name */
    private final StripeEditText f28844m;

    /* renamed from: n, reason: collision with root package name */
    private final StripeEditText f28845n;

    /* renamed from: o, reason: collision with root package name */
    private final StripeEditText f28846o;

    /* renamed from: p, reason: collision with root package name */
    private final StripeEditText f28847p;

    /* renamed from: q, reason: collision with root package name */
    private final StripeEditText f28848q;

    /* renamed from: r, reason: collision with root package name */
    private final StripeEditText f28849r;

    /* renamed from: s, reason: collision with root package name */
    private final StripeEditText f28850s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28851a = new a("Line1", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f28852b = new a("Line2", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f28853c = new a("City", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f28854d = new a("PostalCode", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f28855e = new a("State", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f28856f = new a("Phone", 5);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f28857g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ W5.a f28858h;

        static {
            a[] a9 = a();
            f28857g = a9;
            f28858h = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f28851a, f28852b, f28853c, f28854d, f28855e, f28856f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f28857g.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends C3289v implements Function1 {
        b(Object obj) {
            super(1, obj, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0);
        }

        public final void d(C4266a p02) {
            AbstractC3292y.i(p02, "p0");
            ((ShippingInfoWidget) this.receiver).o(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((C4266a) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f28859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShippingInfoWidget f28860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, ShippingInfoWidget shippingInfoWidget) {
            super(0);
            this.f28859a = context;
            this.f28860b = shippingInfoWidget;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L2.f invoke() {
            L2.f b9 = L2.f.b(LayoutInflater.from(this.f28859a), this.f28860b);
            AbstractC3292y.h(b9, "inflate(...)");
            return b9;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final void b() {
        if (d(a.f28851a)) {
            this.f28837f.setVisibility(8);
        }
        if (d(a.f28852b)) {
            this.f28838g.setVisibility(8);
        }
        if (d(a.f28855e)) {
            this.f28842k.setVisibility(8);
        }
        if (d(a.f28853c)) {
            this.f28839h.setVisibility(8);
        }
        if (d(a.f28854d)) {
            this.f28841j.setVisibility(8);
        }
        if (d(a.f28856f)) {
            this.f28843l.setVisibility(8);
        }
    }

    private final void c() {
        this.f28836e.setCountryChangeCallback$payments_core_release(new b(this));
        this.f28850s.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        n();
        l();
        C4266a selectedCountry$payments_core_release = this.f28836e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    private final boolean d(a aVar) {
        return this.f28835d.contains(aVar);
    }

    private final boolean e(a aVar) {
        return this.f28834c.contains(aVar);
    }

    private final boolean f(a aVar) {
        if (!e(aVar) && !d(aVar)) {
            return true;
        }
        return false;
    }

    private final void g(com.stripe.android.model.a aVar) {
        this.f28846o.setText(aVar.a());
        String b9 = aVar.b();
        if (b9 != null && b9.length() > 0) {
            this.f28836e.setCountrySelected$payments_core_release(b9);
        }
        this.f28844m.setText(aVar.f());
        this.f28845n.setText(aVar.h());
        this.f28848q.setText(aVar.i());
        this.f28849r.setText(aVar.l());
    }

    private final C2895E getRawShippingInformation() {
        z2.b bVar;
        a.C0496a b9 = new a.C0496a().b(this.f28846o.getFieldText$payments_core_release());
        C4266a selectedCountry$payments_core_release = this.f28836e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            bVar = selectedCountry$payments_core_release.b();
        } else {
            bVar = null;
        }
        return new C2895E(b9.d(bVar).e(this.f28844m.getFieldText$payments_core_release()).f(this.f28845n.getFieldText$payments_core_release()).g(this.f28848q.getFieldText$payments_core_release()).h(this.f28849r.getFieldText$payments_core_release()).a(), this.f28847p.getFieldText$payments_core_release(), this.f28850s.getFieldText$payments_core_release());
    }

    private final L2.f getViewBinding() {
        return (L2.f) this.f28832a.getValue();
    }

    private final void i() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f28837f;
        if (e(a.f28851a)) {
            string = getResources().getString(AbstractC3394E.f35242l);
        } else {
            string = getResources().getString(AbstractC3533g.f35957a);
        }
        textInputLayout.setHint(string);
        this.f28838g.setHint(getResources().getString(AbstractC3394E.f35244m));
        TextInputLayout textInputLayout2 = this.f28841j;
        if (e(a.f28854d)) {
            string2 = getResources().getString(AbstractC3394E.f35252q);
        } else {
            string2 = getResources().getString(v2.e.f40444g);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f28842k;
        if (e(a.f28855e)) {
            string3 = getResources().getString(AbstractC3394E.f35258t);
        } else {
            string3 = getResources().getString(v2.e.f40445h);
        }
        textInputLayout3.setHint(string3);
        this.f28848q.setErrorMessage(getResources().getString(AbstractC3394E.f35184C));
        this.f28849r.setErrorMessage(getResources().getString(AbstractC3394E.f35188E));
    }

    private final void j() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f28837f;
        if (e(a.f28851a)) {
            string = getResources().getString(AbstractC3394E.f35238j);
        } else {
            string = getResources().getString(v2.e.f40438a);
        }
        textInputLayout.setHint(string);
        this.f28838g.setHint(getResources().getString(AbstractC3394E.f35240k));
        TextInputLayout textInputLayout2 = this.f28841j;
        if (e(a.f28854d)) {
            string2 = getResources().getString(AbstractC3394E.f35256s);
        } else {
            string2 = getResources().getString(AbstractC3394E.f35254r);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f28842k;
        if (e(a.f28855e)) {
            string3 = getResources().getString(AbstractC3394E.f35248o);
        } else {
            string3 = getResources().getString(v2.e.f40441d);
        }
        textInputLayout3.setHint(string3);
        this.f28848q.setErrorMessage(getResources().getString(AbstractC3394E.f35186D));
        this.f28849r.setErrorMessage(getResources().getString(AbstractC3394E.f35236i));
    }

    private final void k() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f28837f;
        if (e(a.f28851a)) {
            string = getResources().getString(AbstractC3394E.f35238j);
        } else {
            string = getResources().getString(v2.e.f40438a);
        }
        textInputLayout.setHint(string);
        this.f28838g.setHint(getResources().getString(AbstractC3394E.f35240k));
        TextInputLayout textInputLayout2 = this.f28841j;
        if (e(a.f28854d)) {
            string2 = getResources().getString(AbstractC3394E.f35270z);
        } else {
            string2 = getResources().getString(AbstractC3394E.f35268y);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f28842k;
        if (e(a.f28855e)) {
            string3 = getResources().getString(AbstractC3394E.f35262v);
        } else {
            string3 = getResources().getString(AbstractC3394E.f35260u);
        }
        textInputLayout3.setHint(string3);
        this.f28848q.setErrorMessage(getResources().getString(AbstractC3533g.f35979w));
        this.f28849r.setErrorMessage(getResources().getString(AbstractC3394E.f35190F));
    }

    private final void l() {
        String string;
        String string2;
        this.f28840i.setHint(getResources().getString(v2.e.f40442e));
        TextInputLayout textInputLayout = this.f28839h;
        if (e(a.f28853c)) {
            string = getResources().getString(AbstractC3394E.f35246n);
        } else {
            string = getResources().getString(v2.e.f40439b);
        }
        textInputLayout.setHint(string);
        TextInputLayout textInputLayout2 = this.f28843l;
        if (e(a.f28856f)) {
            string2 = getResources().getString(AbstractC3394E.f35250p);
        } else {
            string2 = getResources().getString(v2.e.f40443f);
        }
        textInputLayout2.setHint(string2);
        b();
    }

    private final void m() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f28837f;
        if (e(a.f28851a)) {
            string = getResources().getString(AbstractC3394E.f35242l);
        } else {
            string = getResources().getString(AbstractC3533g.f35957a);
        }
        textInputLayout.setHint(string);
        this.f28838g.setHint(getResources().getString(AbstractC3394E.f35244m));
        TextInputLayout textInputLayout2 = this.f28841j;
        if (e(a.f28854d)) {
            string2 = getResources().getString(AbstractC3394E.f35266x);
        } else {
            string2 = getResources().getString(v2.e.f40447j);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f28842k;
        if (e(a.f28855e)) {
            string3 = getResources().getString(AbstractC3394E.f35264w);
        } else {
            string3 = getResources().getString(v2.e.f40446i);
        }
        textInputLayout3.setHint(string3);
        this.f28848q.setErrorMessage(getResources().getString(AbstractC3533g.f35978v));
        this.f28849r.setErrorMessage(getResources().getString(AbstractC3394E.f35194H));
    }

    private final void n() {
        this.f28844m.setErrorMessageListener(new C2643c0(this.f28837f));
        this.f28846o.setErrorMessageListener(new C2643c0(this.f28839h));
        this.f28847p.setErrorMessageListener(new C2643c0(this.f28840i));
        this.f28848q.setErrorMessageListener(new C2643c0(this.f28841j));
        this.f28849r.setErrorMessageListener(new C2643c0(this.f28842k));
        this.f28850s.setErrorMessageListener(new C2643c0(this.f28843l));
        this.f28844m.setErrorMessage(getResources().getString(AbstractC3394E.f35192G));
        this.f28846o.setErrorMessage(getResources().getString(AbstractC3394E.f35232g));
        this.f28847p.setErrorMessage(getResources().getString(AbstractC3394E.f35180A));
        this.f28850s.setErrorMessage(getResources().getString(AbstractC3394E.f35182B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(C4266a c4266a) {
        int i8;
        String b9 = c4266a.b().b();
        if (AbstractC3292y.d(b9, Locale.US.getCountry())) {
            m();
        } else if (AbstractC3292y.d(b9, Locale.UK.getCountry())) {
            j();
        } else if (AbstractC3292y.d(b9, Locale.CANADA.getCountry())) {
            i();
        } else {
            k();
        }
        p(c4266a);
        TextInputLayout textInputLayout = this.f28841j;
        if (z2.d.f41472a.b(c4266a.b()) && !d(a.f28854d)) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        textInputLayout.setVisibility(i8);
    }

    private final void p(C4266a c4266a) {
        InputFilter[] inputFilterArr;
        StripeEditText stripeEditText = this.f28848q;
        if (AbstractC3292y.d(c4266a.b().b(), Locale.CANADA.getCountry())) {
            inputFilterArr = new InputFilter[]{new InputFilter.AllCaps()};
        } else {
            inputFilterArr = new InputFilter[0];
        }
        stripeEditText.setFilters(inputFilterArr);
    }

    public final List<a> getHiddenFields() {
        return this.f28835d;
    }

    public final List<a> getOptionalFields() {
        return this.f28834c;
    }

    public final C2895E getShippingInformation() {
        if (!q()) {
            return null;
        }
        return getRawShippingInformation();
    }

    public final void h(C2895E c2895e) {
        if (c2895e == null) {
            return;
        }
        com.stripe.android.model.a a9 = c2895e.a();
        if (a9 != null) {
            g(a9);
        }
        this.f28847p.setText(c2895e.b());
        this.f28850s.setText(c2895e.f());
    }

    public final boolean q() {
        String obj;
        Editable text;
        String obj2;
        Editable text2;
        String obj3;
        Editable text3;
        String obj4;
        Editable text4;
        String obj5;
        Editable text5;
        String obj6;
        String str;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        z2.b b9;
        Editable text6 = this.f28844m.getText();
        if (text6 == null || (obj = text6.toString()) == null || (text = this.f28847p.getText()) == null || (obj2 = text.toString()) == null || (text2 = this.f28846o.getText()) == null || (obj3 = text2.toString()) == null || (text3 = this.f28849r.getText()) == null || (obj4 = text3.toString()) == null || (text4 = this.f28848q.getText()) == null || (obj5 = text4.toString()) == null || (text5 = this.f28850s.getText()) == null || (obj6 = text5.toString()) == null) {
            return false;
        }
        this.f28836e.p();
        C4266a selectedCountry$payments_core_release = this.f28836e.getSelectedCountry$payments_core_release();
        G0 g02 = this.f28833b;
        if (selectedCountry$payments_core_release != null && (b9 = selectedCountry$payments_core_release.b()) != null) {
            str = b9.b();
        } else {
            str = null;
        }
        boolean a9 = g02.a(obj5, str, this.f28834c, this.f28835d);
        this.f28848q.setShouldShowError(!a9);
        if (l6.n.T(obj) && f(a.f28851a)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f28844m.setShouldShowError(z8);
        if (l6.n.T(obj3) && f(a.f28853c)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f28846o.setShouldShowError(z9);
        boolean T8 = l6.n.T(obj2);
        this.f28847p.setShouldShowError(T8);
        if (l6.n.T(obj4) && f(a.f28855e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28849r.setShouldShowError(z10);
        if (l6.n.T(obj6) && f(a.f28856f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28850s.setShouldShowError(z11);
        if (!a9 || z8 || z9 || z10 || T8 || z11 || selectedCountry$payments_core_release == null) {
            return false;
        }
        return true;
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        AbstractC3292y.i(allowedCountryCodes, "allowedCountryCodes");
        this.f28836e.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final void setHiddenFields(List<? extends a> value) {
        AbstractC3292y.i(value, "value");
        this.f28835d = value;
        l();
        C4266a selectedCountry$payments_core_release = this.f28836e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    public final void setOptionalFields(List<? extends a> value) {
        AbstractC3292y.i(value, "value");
        this.f28834c = value;
        l();
        C4266a selectedCountry$payments_core_release = this.f28836e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28832a = Q5.l.b(new c(context, this));
        this.f28833b = new G0();
        this.f28834c = AbstractC1435t.m();
        this.f28835d = AbstractC1435t.m();
        CountryTextInputLayout countryAutocompleteAaw = getViewBinding().f5301b;
        AbstractC3292y.h(countryAutocompleteAaw, "countryAutocompleteAaw");
        this.f28836e = countryAutocompleteAaw;
        TextInputLayout tlAddressLine1Aaw = getViewBinding().f5309j;
        AbstractC3292y.h(tlAddressLine1Aaw, "tlAddressLine1Aaw");
        this.f28837f = tlAddressLine1Aaw;
        TextInputLayout tlAddressLine2Aaw = getViewBinding().f5310k;
        AbstractC3292y.h(tlAddressLine2Aaw, "tlAddressLine2Aaw");
        this.f28838g = tlAddressLine2Aaw;
        TextInputLayout tlCityAaw = getViewBinding().f5311l;
        AbstractC3292y.h(tlCityAaw, "tlCityAaw");
        this.f28839h = tlCityAaw;
        TextInputLayout tlNameAaw = getViewBinding().f5312m;
        AbstractC3292y.h(tlNameAaw, "tlNameAaw");
        this.f28840i = tlNameAaw;
        TextInputLayout tlPostalCodeAaw = getViewBinding().f5314o;
        AbstractC3292y.h(tlPostalCodeAaw, "tlPostalCodeAaw");
        this.f28841j = tlPostalCodeAaw;
        TextInputLayout tlStateAaw = getViewBinding().f5315p;
        AbstractC3292y.h(tlStateAaw, "tlStateAaw");
        this.f28842k = tlStateAaw;
        TextInputLayout tlPhoneNumberAaw = getViewBinding().f5313n;
        AbstractC3292y.h(tlPhoneNumberAaw, "tlPhoneNumberAaw");
        this.f28843l = tlPhoneNumberAaw;
        StripeEditText etAddressLineOneAaw = getViewBinding().f5302c;
        AbstractC3292y.h(etAddressLineOneAaw, "etAddressLineOneAaw");
        this.f28844m = etAddressLineOneAaw;
        StripeEditText etAddressLineTwoAaw = getViewBinding().f5303d;
        AbstractC3292y.h(etAddressLineTwoAaw, "etAddressLineTwoAaw");
        this.f28845n = etAddressLineTwoAaw;
        StripeEditText etCityAaw = getViewBinding().f5304e;
        AbstractC3292y.h(etCityAaw, "etCityAaw");
        this.f28846o = etCityAaw;
        StripeEditText etNameAaw = getViewBinding().f5305f;
        AbstractC3292y.h(etNameAaw, "etNameAaw");
        this.f28847p = etNameAaw;
        StripeEditText etPostalCodeAaw = getViewBinding().f5307h;
        AbstractC3292y.h(etPostalCodeAaw, "etPostalCodeAaw");
        this.f28848q = etPostalCodeAaw;
        StripeEditText etStateAaw = getViewBinding().f5308i;
        AbstractC3292y.h(etStateAaw, "etStateAaw");
        this.f28849r = etStateAaw;
        StripeEditText etPhoneNumberAaw = getViewBinding().f5306g;
        AbstractC3292y.h(etPhoneNumberAaw, "etPhoneNumberAaw");
        this.f28850s = etPhoneNumberAaw;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 26) {
            etNameAaw.setAutofillHints(new String[]{"name"});
            I0.a(tlAddressLine1Aaw, new String[]{HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS});
            etPostalCodeAaw.setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_POSTAL_CODE});
            etPhoneNumberAaw.setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_PHONE});
        }
        c();
    }
}
