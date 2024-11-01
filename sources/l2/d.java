package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.ShippingInfoWidget;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class d implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f5294a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f5295b;

    /* renamed from: c, reason: collision with root package name */
    public final ShippingInfoWidget f5296c;

    /* renamed from: d, reason: collision with root package name */
    public final CardMultilineWidget f5297d;

    private d(LinearLayout linearLayout, LinearLayout linearLayout2, ShippingInfoWidget shippingInfoWidget, CardMultilineWidget cardMultilineWidget) {
        this.f5294a = linearLayout;
        this.f5295b = linearLayout2;
        this.f5296c = shippingInfoWidget;
        this.f5297d = cardMultilineWidget;
    }

    public static d a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = AbstractC3390A.f35121d;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) ViewBindings.findChildViewById(view, i8);
        if (shippingInfoWidget != null) {
            i8 = AbstractC3390A.f35133j;
            CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) ViewBindings.findChildViewById(view, i8);
            if (cardMultilineWidget != null) {
                return new d(linearLayout, linearLayout, shippingInfoWidget, cardMultilineWidget);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3392C.f35157d, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f5294a;
    }
}
