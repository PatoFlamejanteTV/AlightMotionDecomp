package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class V implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12428a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f12429b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12430c;

    private V(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f12428a = linearLayout;
        this.f12429b = recyclerView;
        this.f12430c = textView;
    }

    public static V a(View view) {
        int i8 = R.id.rv_most_popular_apps_organization;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_most_popular_apps_organization);
        if (recyclerView != null) {
            i8 = R.id.tv_most_popular_apps_organization;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_most_popular_apps_organization);
            if (textView != null) {
                return new V((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static V c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.organization_carousel_apps_rv, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12428a;
    }
}
