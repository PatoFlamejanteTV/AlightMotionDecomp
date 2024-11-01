package A3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import v3.u;
import v3.v;

/* loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f152a;

    /* renamed from: b, reason: collision with root package name */
    public final PrimaryButton f153b;

    private a(FrameLayout frameLayout, PrimaryButton primaryButton) {
        this.f152a = frameLayout;
        this.f153b = primaryButton;
    }

    public static a a(View view) {
        int i8 = u.f40574e;
        PrimaryButton primaryButton = (PrimaryButton) ViewBindings.findChildViewById(view, i8);
        if (primaryButton != null) {
            return new a((FrameLayout) view, primaryButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(v.f40575a, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f152a;
    }
}
