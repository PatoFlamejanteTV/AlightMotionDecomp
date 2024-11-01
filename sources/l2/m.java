package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.view.MaskedCardView;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class m implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f5342a;

    /* renamed from: b, reason: collision with root package name */
    public final MaskedCardView f5343b;

    private m(FrameLayout frameLayout, MaskedCardView maskedCardView) {
        this.f5342a = frameLayout;
        this.f5343b = maskedCardView;
    }

    public static m a(View view) {
        int i8 = AbstractC3390A.f35093E;
        MaskedCardView maskedCardView = (MaskedCardView) ViewBindings.findChildViewById(view, i8);
        if (maskedCardView != null) {
            return new m((FrameLayout) view, maskedCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static m c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3392C.f35168o, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f5342a;
    }
}
