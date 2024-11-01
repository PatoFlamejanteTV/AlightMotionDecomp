package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class I0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12209a;

    /* renamed from: b, reason: collision with root package name */
    public final K f12210b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f12211c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f12212d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12213e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12214f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12215g;

    private I0(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f12209a = relativeLayout;
        this.f12210b = k8;
        this.f12211c = recyclerView;
        this.f12212d = toolbar;
        this.f12213e = textView;
        this.f12214f = textView2;
        this.f12215g = textView3;
    }

    public static I0 a(View view) {
        int i8 = R.id.loading_view_wishlist;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_wishlist);
        if (findChildViewById != null) {
            K a9 = K.a(findChildViewById);
            i8 = R.id.rv_wishlist;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_wishlist);
            if (recyclerView != null) {
                i8 = R.id.toolbar_wishlist;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_wishlist);
                if (toolbar != null) {
                    i8 = R.id.tv_explore_wishlist;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_explore_wishlist);
                    if (textView != null) {
                        i8 = R.id.tv_no_items_wishlist;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_items_wishlist);
                        if (textView2 != null) {
                            i8 = R.id.tv_title_wishlist;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_wishlist);
                            if (textView3 != null) {
                                return new I0((RelativeLayout) view, a9, recyclerView, toolbar, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static I0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static I0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.wishlist_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12209a;
    }
}
