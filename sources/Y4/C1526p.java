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

/* renamed from: Y4.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1526p implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12886a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f12887b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12888c;

    private C1526p(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f12886a = linearLayout;
        this.f12887b = recyclerView;
        this.f12888c = textView;
    }

    public static C1526p a(View view) {
        int i8 = R.id.rv_path;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_path);
        if (recyclerView != null) {
            i8 = R.id.tv_ok;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok);
            if (textView != null) {
                return new C1526p((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1526p c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1526p d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_download_path, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12886a;
    }
}
