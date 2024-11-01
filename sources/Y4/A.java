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
public final class A implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12069a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f12070b;

    /* renamed from: c, reason: collision with root package name */
    public final K f12071c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f12072d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f12073e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12074f;

    private A(RelativeLayout relativeLayout, F0 f02, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.f12069a = relativeLayout;
        this.f12070b = f02;
        this.f12071c = k8;
        this.f12072d = recyclerView;
        this.f12073e = toolbar;
        this.f12074f = textView;
    }

    public static A a(View view) {
        int i8 = R.id.header_fus;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.header_fus);
        if (findChildViewById != null) {
            F0 a9 = F0.a(findChildViewById);
            i8 = R.id.loading_view_fus;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loading_view_fus);
            if (findChildViewById2 != null) {
                K a10 = K.a(findChildViewById2);
                i8 = R.id.rv_fus;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_fus);
                if (recyclerView != null) {
                    i8 = R.id.toolbar_fus;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_fus);
                    if (toolbar != null) {
                        i8 = R.id.tv_toolbar_title_fus;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_fus);
                        if (textView != null) {
                            return new A((RelativeLayout) view, a9, a10, recyclerView, toolbar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static A c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static A d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.free_up_space_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12069a;
    }
}
