package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.StripeEditText;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class f implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f5300a;

    /* renamed from: b, reason: collision with root package name */
    public final CountryTextInputLayout f5301b;

    /* renamed from: c, reason: collision with root package name */
    public final StripeEditText f5302c;

    /* renamed from: d, reason: collision with root package name */
    public final StripeEditText f5303d;

    /* renamed from: e, reason: collision with root package name */
    public final StripeEditText f5304e;

    /* renamed from: f, reason: collision with root package name */
    public final StripeEditText f5305f;

    /* renamed from: g, reason: collision with root package name */
    public final StripeEditText f5306g;

    /* renamed from: h, reason: collision with root package name */
    public final StripeEditText f5307h;

    /* renamed from: i, reason: collision with root package name */
    public final StripeEditText f5308i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputLayout f5309j;

    /* renamed from: k, reason: collision with root package name */
    public final TextInputLayout f5310k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputLayout f5311l;

    /* renamed from: m, reason: collision with root package name */
    public final TextInputLayout f5312m;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f5313n;

    /* renamed from: o, reason: collision with root package name */
    public final TextInputLayout f5314o;

    /* renamed from: p, reason: collision with root package name */
    public final TextInputLayout f5315p;

    private f(View view, CountryTextInputLayout countryTextInputLayout, StripeEditText stripeEditText, StripeEditText stripeEditText2, StripeEditText stripeEditText3, StripeEditText stripeEditText4, StripeEditText stripeEditText5, StripeEditText stripeEditText6, StripeEditText stripeEditText7, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7) {
        this.f5300a = view;
        this.f5301b = countryTextInputLayout;
        this.f5302c = stripeEditText;
        this.f5303d = stripeEditText2;
        this.f5304e = stripeEditText3;
        this.f5305f = stripeEditText4;
        this.f5306g = stripeEditText5;
        this.f5307h = stripeEditText6;
        this.f5308i = stripeEditText7;
        this.f5309j = textInputLayout;
        this.f5310k = textInputLayout2;
        this.f5311l = textInputLayout3;
        this.f5312m = textInputLayout4;
        this.f5313n = textInputLayout5;
        this.f5314o = textInputLayout6;
        this.f5315p = textInputLayout7;
    }

    public static f a(View view) {
        int i8 = AbstractC3390A.f35139n;
        CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) ViewBindings.findChildViewById(view, i8);
        if (countryTextInputLayout != null) {
            i8 = AbstractC3390A.f35142q;
            StripeEditText stripeEditText = (StripeEditText) ViewBindings.findChildViewById(view, i8);
            if (stripeEditText != null) {
                i8 = AbstractC3390A.f35143r;
                StripeEditText stripeEditText2 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                if (stripeEditText2 != null) {
                    i8 = AbstractC3390A.f35145t;
                    StripeEditText stripeEditText3 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                    if (stripeEditText3 != null) {
                        i8 = AbstractC3390A.f35148w;
                        StripeEditText stripeEditText4 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                        if (stripeEditText4 != null) {
                            i8 = AbstractC3390A.f35149x;
                            StripeEditText stripeEditText5 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                            if (stripeEditText5 != null) {
                                i8 = AbstractC3390A.f35151z;
                                StripeEditText stripeEditText6 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                                if (stripeEditText6 != null) {
                                    i8 = AbstractC3390A.f35089A;
                                    StripeEditText stripeEditText7 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                                    if (stripeEditText7 != null) {
                                        i8 = AbstractC3390A.f35111W;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                        if (textInputLayout != null) {
                                            i8 = AbstractC3390A.f35112X;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                            if (textInputLayout2 != null) {
                                                i8 = AbstractC3390A.f35114Z;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                if (textInputLayout3 != null) {
                                                    i8 = AbstractC3390A.f35120c0;
                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                    if (textInputLayout4 != null) {
                                                        i8 = AbstractC3390A.f35122d0;
                                                        TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                        if (textInputLayout5 != null) {
                                                            i8 = AbstractC3390A.f35126f0;
                                                            TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                            if (textInputLayout6 != null) {
                                                                i8 = AbstractC3390A.f35128g0;
                                                                TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                                if (textInputLayout7 != null) {
                                                                    return new f(view, countryTextInputLayout, stripeEditText, stripeEditText2, stripeEditText3, stripeEditText4, stripeEditText5, stripeEditText6, stripeEditText7, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static f b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3392C.f35159f, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f5300a;
    }
}
