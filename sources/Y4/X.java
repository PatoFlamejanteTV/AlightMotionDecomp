package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class X implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12447a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f12448b;

    private X(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f12447a = linearLayout;
        this.f12448b = recyclerView;
    }

    public static X a(View view) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_top_downloads_organization);
        if (recyclerView != null) {
            return new X((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rv_top_downloads_organization)));
    }

    public static X c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.organization_top_download_rv, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12447a;
    }
}
