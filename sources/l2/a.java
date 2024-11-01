package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FragmentContainerView f5286a;

    /* renamed from: b, reason: collision with root package name */
    public final FragmentContainerView f5287b;

    private a(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.f5286a = fragmentContainerView;
        this.f5287b = fragmentContainerView2;
    }

    public static a a(View view) {
        if (view != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
            return new a(fragmentContainerView, fragmentContainerView);
        }
        throw new NullPointerException("rootView");
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3392C.f35154a, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView getRoot() {
        return this.f5286a;
    }
}
