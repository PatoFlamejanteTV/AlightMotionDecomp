package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class h implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f5320a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f5321b;

    private h(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f5320a = linearLayout;
        this.f5321b = recyclerView;
    }

    public static h a(View view) {
        int i8 = AbstractC3390A.f35119c;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
        if (recyclerView != null) {
            return new h((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static h c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3392C.f35161h, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f5320a;
    }
}
