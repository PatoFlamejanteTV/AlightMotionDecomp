package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class u implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f5370a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f5371b;

    private u(View view, RecyclerView recyclerView) {
        this.f5370a = view;
        this.f5371b = recyclerView;
    }

    public static u a(View view) {
        int i8 = AbstractC3390A.f35104P;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
        if (recyclerView != null) {
            return new u(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static u b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3392C.f35177x, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f5370a;
    }
}
