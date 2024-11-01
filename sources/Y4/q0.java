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
public final class q0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12904a;

    /* renamed from: b, reason: collision with root package name */
    public final K f12905b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f12906c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f12907d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f12908e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12909f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12910g;

    private q0(RelativeLayout relativeLayout, K k8, RelativeLayout relativeLayout2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f12904a = relativeLayout;
        this.f12905b = k8;
        this.f12906c = relativeLayout2;
        this.f12907d = recyclerView;
        this.f12908e = toolbar;
        this.f12909f = textView;
        this.f12910g = textView2;
    }

    public static q0 a(View view) {
        int i8 = R.id.loading_view_updates;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_updates);
        if (findChildViewById != null) {
            K a9 = K.a(findChildViewById);
            i8 = R.id.rl_bottom_box_download_button_updates;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_bottom_box_download_button_updates);
            if (relativeLayout != null) {
                i8 = R.id.rv_updates;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_updates);
                if (recyclerView != null) {
                    i8 = R.id.toolbar_updates;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_updates);
                    if (toolbar != null) {
                        i8 = R.id.tv_download_all_update;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_download_all_update);
                        if (textView != null) {
                            i8 = R.id.tv_toolbar_title_updates;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_updates);
                            if (textView2 != null) {
                                return new q0((RelativeLayout) view, a9, relativeLayout, recyclerView, toolbar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static q0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static q0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.updates, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12904a;
    }
}
