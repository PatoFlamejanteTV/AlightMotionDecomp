package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.view.PaymentMethodsRecyclerView;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class q implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f5355a;

    /* renamed from: b, reason: collision with root package name */
    public final CoordinatorLayout f5356b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f5357c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearProgressIndicator f5358d;

    /* renamed from: e, reason: collision with root package name */
    public final PaymentMethodsRecyclerView f5359e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f5360f;

    private q(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, PaymentMethodsRecyclerView paymentMethodsRecyclerView, Toolbar toolbar) {
        this.f5355a = coordinatorLayout;
        this.f5356b = coordinatorLayout2;
        this.f5357c = frameLayout;
        this.f5358d = linearProgressIndicator;
        this.f5359e = paymentMethodsRecyclerView;
        this.f5360f = toolbar;
    }

    public static q a(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i8 = AbstractC3390A.f35090B;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
        if (frameLayout != null) {
            i8 = AbstractC3390A.f35096H;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) ViewBindings.findChildViewById(view, i8);
            if (linearProgressIndicator != null) {
                i8 = AbstractC3390A.f35097I;
                PaymentMethodsRecyclerView paymentMethodsRecyclerView = (PaymentMethodsRecyclerView) ViewBindings.findChildViewById(view, i8);
                if (paymentMethodsRecyclerView != null) {
                    i8 = AbstractC3390A.f35130h0;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i8);
                    if (toolbar != null) {
                        return new q(coordinatorLayout, coordinatorLayout, frameLayout, linearProgressIndicator, paymentMethodsRecyclerView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static q c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static q d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3392C.f35172s, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f5355a;
    }
}
