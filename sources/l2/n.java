package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class n implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f5344a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f5345b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f5346c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f5347d;

    private n(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.f5344a = view;
        this.f5345b = appCompatImageView;
        this.f5346c = appCompatImageView2;
        this.f5347d = appCompatTextView;
    }

    public static n a(View view) {
        int i8 = AbstractC3390A.f35125f;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
        if (appCompatImageView != null) {
            i8 = AbstractC3390A.f35137l;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
            if (appCompatImageView2 != null) {
                i8 = AbstractC3390A.f35141p;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i8);
                if (appCompatTextView != null) {
                    return new n(view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static n b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3392C.f35169p, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f5344a;
    }
}
