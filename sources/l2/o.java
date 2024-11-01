package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.view.PaymentAuthWebView;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class o implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f5348a;

    /* renamed from: b, reason: collision with root package name */
    public final CircularProgressIndicator f5349b;

    /* renamed from: c, reason: collision with root package name */
    public final Toolbar f5350c;

    /* renamed from: d, reason: collision with root package name */
    public final PaymentAuthWebView f5351d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f5352e;

    private o(CoordinatorLayout coordinatorLayout, CircularProgressIndicator circularProgressIndicator, Toolbar toolbar, PaymentAuthWebView paymentAuthWebView, FrameLayout frameLayout) {
        this.f5348a = coordinatorLayout;
        this.f5349b = circularProgressIndicator;
        this.f5350c = toolbar;
        this.f5351d = paymentAuthWebView;
        this.f5352e = frameLayout;
    }

    public static o a(View view) {
        int i8 = AbstractC3390A.f35096H;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
        if (circularProgressIndicator != null) {
            i8 = AbstractC3390A.f35130h0;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i8);
            if (toolbar != null) {
                i8 = AbstractC3390A.f35134j0;
                PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) ViewBindings.findChildViewById(view, i8);
                if (paymentAuthWebView != null) {
                    i8 = AbstractC3390A.f35136k0;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
                    if (frameLayout != null) {
                        return new o((CoordinatorLayout) view, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static o c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3392C.f35170q, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f5348a;
    }
}
