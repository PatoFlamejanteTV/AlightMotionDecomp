package i4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import g4.l;
import g4.m;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2971a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f32753a;

    /* renamed from: b, reason: collision with root package name */
    public final FragmentContainerView f32754b;

    private C2971a(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.f32753a = constraintLayout;
        this.f32754b = fragmentContainerView;
    }

    public static C2971a a(View view) {
        int i8 = l.f32358a;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i8);
        if (fragmentContainerView != null) {
            return new C2971a((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C2971a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C2971a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(m.f32359a, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f32753a;
    }
}
