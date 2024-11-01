package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class e implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f5298a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f5299b;

    private e(LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.f5298a = linearLayout;
        this.f5299b = appCompatTextView;
    }

    public static e a(View view) {
        int i8 = AbstractC3390A.f35092D;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i8);
        if (appCompatTextView != null) {
            return new e((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static e c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3392C.f35158e, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f5298a;
    }
}
