package L2;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.view.PaymentFlowViewPager;
import n2.AbstractC3390A;

/* loaded from: classes4.dex */
public final class p implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f5353a;

    /* renamed from: b, reason: collision with root package name */
    public final PaymentFlowViewPager f5354b;

    private p(FrameLayout frameLayout, PaymentFlowViewPager paymentFlowViewPager) {
        this.f5353a = frameLayout;
        this.f5354b = paymentFlowViewPager;
    }

    public static p a(View view) {
        int i8 = AbstractC3390A.f35102N;
        PaymentFlowViewPager paymentFlowViewPager = (PaymentFlowViewPager) ViewBindings.findChildViewById(view, i8);
        if (paymentFlowViewPager != null) {
            return new p((FrameLayout) view, paymentFlowViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f5353a;
    }
}
