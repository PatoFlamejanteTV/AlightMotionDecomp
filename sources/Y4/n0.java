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
public final class n0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12864a;

    /* renamed from: b, reason: collision with root package name */
    public final C1512g f12865b;

    /* renamed from: c, reason: collision with root package name */
    public final K f12866c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f12867d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f12868e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12869f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12870g;

    private n0(RelativeLayout relativeLayout, C1512g c1512g, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f12864a = relativeLayout;
        this.f12865b = c1512g;
        this.f12866c = k8;
        this.f12867d = recyclerView;
        this.f12868e = toolbar;
        this.f12869f = textView;
        this.f12870g = textView2;
    }

    public static n0 a(View view) {
        int i8 = R.id.app_info_selected_popup;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.app_info_selected_popup);
        if (findChildViewById != null) {
            C1512g a9 = C1512g.a(findChildViewById);
            i8 = R.id.loading_view_top_by_cat_fragment;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loading_view_top_by_cat_fragment);
            if (findChildViewById2 != null) {
                K a10 = K.a(findChildViewById2);
                i8 = R.id.recyclerview_top_cat;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerview_top_cat);
                if (recyclerView != null) {
                    i8 = R.id.toolbar_top_by_cat;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_top_by_cat);
                    if (toolbar != null) {
                        i8 = R.id.tv_no_data_top_cat;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_top_cat);
                        if (textView != null) {
                            i8 = R.id.tv_toolbar_title_top_by_cat;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_top_by_cat);
                            if (textView2 != null) {
                                return new n0((RelativeLayout) view, a9, a10, recyclerView, toolbar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static n0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static n0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.top_by_category_fragment, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12864a;
    }
}
