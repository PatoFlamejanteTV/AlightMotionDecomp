package V3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.stripe3ds2.views.ThreeDS2HeaderTextView;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* loaded from: classes4.dex */
public final class h implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f10568a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f10569b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreeDS2HeaderTextView f10570c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreeDS2TextView f10571d;

    /* renamed from: e, reason: collision with root package name */
    public final ThreeDS2Button f10572e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreeDS2Button f10573f;

    /* renamed from: g, reason: collision with root package name */
    public final RadioButton f10574g;

    /* renamed from: h, reason: collision with root package name */
    public final RadioGroup f10575h;

    /* renamed from: i, reason: collision with root package name */
    public final RadioButton f10576i;

    /* renamed from: j, reason: collision with root package name */
    public final ThreeDS2TextView f10577j;

    private h(View view, FrameLayout frameLayout, ThreeDS2HeaderTextView threeDS2HeaderTextView, ThreeDS2TextView threeDS2TextView, ThreeDS2Button threeDS2Button, ThreeDS2Button threeDS2Button2, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, ThreeDS2TextView threeDS2TextView2) {
        this.f10568a = view;
        this.f10569b = frameLayout;
        this.f10570c = threeDS2HeaderTextView;
        this.f10571d = threeDS2TextView;
        this.f10572e = threeDS2Button;
        this.f10573f = threeDS2Button2;
        this.f10574g = radioButton;
        this.f10575h = radioGroup;
        this.f10576i = radioButton2;
        this.f10577j = threeDS2TextView2;
    }

    public static h a(View view) {
        int i8 = U3.d.f10099e;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
        if (frameLayout != null) {
            i8 = U3.d.f10100f;
            ThreeDS2HeaderTextView threeDS2HeaderTextView = (ThreeDS2HeaderTextView) ViewBindings.findChildViewById(view, i8);
            if (threeDS2HeaderTextView != null) {
                i8 = U3.d.f10101g;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                if (threeDS2TextView != null) {
                    i8 = U3.d.f10102h;
                    ThreeDS2Button threeDS2Button = (ThreeDS2Button) ViewBindings.findChildViewById(view, i8);
                    if (threeDS2Button != null) {
                        i8 = U3.d.f10103i;
                        ThreeDS2Button threeDS2Button2 = (ThreeDS2Button) ViewBindings.findChildViewById(view, i8);
                        if (threeDS2Button2 != null) {
                            i8 = U3.d.f10104j;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i8);
                            if (radioButton != null) {
                                i8 = U3.d.f10105k;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i8);
                                if (radioGroup != null) {
                                    i8 = U3.d.f10106l;
                                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i8);
                                    if (radioButton2 != null) {
                                        i8 = U3.d.f10107m;
                                        ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                                        if (threeDS2TextView2 != null) {
                                            return new h(view, frameLayout, threeDS2HeaderTextView, threeDS2TextView, threeDS2Button, threeDS2Button2, radioButton, radioGroup, radioButton2, threeDS2TextView2);
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

    public static h b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(U3.e.f10128h, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f10568a;
    }
}
