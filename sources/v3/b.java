package V3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class b implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f10551a;

    /* renamed from: b, reason: collision with root package name */
    public final FragmentContainerView f10552b;

    private b(FrameLayout frameLayout, FragmentContainerView fragmentContainerView) {
        this.f10551a = frameLayout;
        this.f10552b = fragmentContainerView;
    }

    public static b a(View view) {
        int i8 = U3.d.f10112r;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i8);
        if (fragmentContainerView != null) {
            return new b((FrameLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(U3.e.f10122b, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f10551a;
    }
}
