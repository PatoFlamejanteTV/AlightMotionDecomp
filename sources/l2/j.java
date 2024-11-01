package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardNumberTextInputLayout;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class j implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f5325a;

    /* renamed from: b, reason: collision with root package name */
    public final CardBrandView f5326b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f5327c;

    /* renamed from: d, reason: collision with root package name */
    public final CardNumberEditText f5328d;

    /* renamed from: e, reason: collision with root package name */
    public final CvcEditText f5329e;

    /* renamed from: f, reason: collision with root package name */
    public final ExpiryDateEditText f5330f;

    /* renamed from: g, reason: collision with root package name */
    public final PostalCodeEditText f5331g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f5332h;

    /* renamed from: i, reason: collision with root package name */
    public final CardNumberTextInputLayout f5333i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputLayout f5334j;

    /* renamed from: k, reason: collision with root package name */
    public final TextInputLayout f5335k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputLayout f5336l;

    private j(View view, CardBrandView cardBrandView, FrameLayout frameLayout, CardNumberEditText cardNumberEditText, CvcEditText cvcEditText, ExpiryDateEditText expiryDateEditText, PostalCodeEditText postalCodeEditText, LinearLayout linearLayout, CardNumberTextInputLayout cardNumberTextInputLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.f5325a = view;
        this.f5326b = cardBrandView;
        this.f5327c = frameLayout;
        this.f5328d = cardNumberEditText;
        this.f5329e = cvcEditText;
        this.f5330f = expiryDateEditText;
        this.f5331g = postalCodeEditText;
        this.f5332h = linearLayout;
        this.f5333i = cardNumberTextInputLayout;
        this.f5334j = textInputLayout;
        this.f5335k = textInputLayout2;
        this.f5336l = textInputLayout3;
    }

    public static j a(View view) {
        int i8 = AbstractC3390A.f35129h;
        CardBrandView cardBrandView = (CardBrandView) ViewBindings.findChildViewById(view, i8);
        if (cardBrandView != null) {
            i8 = AbstractC3390A.f35135k;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
            if (frameLayout != null) {
                i8 = AbstractC3390A.f35144s;
                CardNumberEditText cardNumberEditText = (CardNumberEditText) ViewBindings.findChildViewById(view, i8);
                if (cardNumberEditText != null) {
                    i8 = AbstractC3390A.f35146u;
                    CvcEditText cvcEditText = (CvcEditText) ViewBindings.findChildViewById(view, i8);
                    if (cvcEditText != null) {
                        i8 = AbstractC3390A.f35147v;
                        ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) ViewBindings.findChildViewById(view, i8);
                        if (expiryDateEditText != null) {
                            i8 = AbstractC3390A.f35150y;
                            PostalCodeEditText postalCodeEditText = (PostalCodeEditText) ViewBindings.findChildViewById(view, i8);
                            if (postalCodeEditText != null) {
                                i8 = AbstractC3390A.f35099K;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                                if (linearLayout != null) {
                                    i8 = AbstractC3390A.f35113Y;
                                    CardNumberTextInputLayout cardNumberTextInputLayout = (CardNumberTextInputLayout) ViewBindings.findChildViewById(view, i8);
                                    if (cardNumberTextInputLayout != null) {
                                        i8 = AbstractC3390A.f35116a0;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                        if (textInputLayout != null) {
                                            i8 = AbstractC3390A.f35118b0;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                            if (textInputLayout2 != null) {
                                                i8 = AbstractC3390A.f35124e0;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                if (textInputLayout3 != null) {
                                                    return new j(view, cardBrandView, frameLayout, cardNumberEditText, cvcEditText, expiryDateEditText, postalCodeEditText, linearLayout, cardNumberTextInputLayout, textInputLayout, textInputLayout2, textInputLayout3);
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

    public static j b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3392C.f35164k, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f5325a;
    }
}
