package L2;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import n2.AbstractC3390A;

/* loaded from: classes4.dex */
public final class c implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final ScrollView f5292a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f5293b;

    private c(ScrollView scrollView, LinearLayout linearLayout) {
        this.f5292a = scrollView;
        this.f5293b = linearLayout;
    }

    public static c a(View view) {
        int i8 = AbstractC3390A.f35098J;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
        if (linearLayout != null) {
            return new c((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f5292a;
    }
}
