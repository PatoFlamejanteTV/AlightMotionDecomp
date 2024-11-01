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
public final class T implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12404a;

    /* renamed from: b, reason: collision with root package name */
    public final K f12405b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f12406c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f12407d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12408e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12409f;

    private T(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f12404a = relativeLayout;
        this.f12405b = k8;
        this.f12406c = recyclerView;
        this.f12407d = toolbar;
        this.f12408e = textView;
        this.f12409f = textView2;
    }

    public static T a(View view) {
        int i8 = R.id.loading_view_old_versions;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_old_versions);
        if (findChildViewById != null) {
            K a9 = K.a(findChildViewById);
            i8 = R.id.rv_old_versions;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_old_versions);
            if (recyclerView != null) {
                i8 = R.id.toolbar_old_versions;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_old_versions);
                if (toolbar != null) {
                    i8 = R.id.tv_no_data_old_version;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_old_version);
                    if (textView != null) {
                        i8 = R.id.tv_toolbar_old_versions;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_old_versions);
                        if (textView2 != null) {
                            return new T((RelativeLayout) view, a9, recyclerView, toolbar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static T c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static T d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.old_versions_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12404a;
    }
}
