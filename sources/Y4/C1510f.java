package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1510f implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12643a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12644b;

    /* renamed from: c, reason: collision with root package name */
    public final K f12645c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f12646d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f12647e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f12648f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12649g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12650h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12651i;

    private C1510f(RelativeLayout relativeLayout, ImageView imageView, K k8, RelativeLayout relativeLayout2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f12643a = relativeLayout;
        this.f12644b = imageView;
        this.f12645c = k8;
        this.f12646d = relativeLayout2;
        this.f12647e = recyclerView;
        this.f12648f = toolbar;
        this.f12649g = textView;
        this.f12650h = textView2;
        this.f12651i = textView3;
    }

    public static C1510f a(View view) {
        int i8 = R.id.iv_logo_afa;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_afa);
        if (imageView != null) {
            i8 = R.id.loading_view_app_files;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_app_files);
            if (findChildViewById != null) {
                K a9 = K.a(findChildViewById);
                i8 = R.id.rl_header_afa;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_header_afa);
                if (relativeLayout != null) {
                    i8 = R.id.rv_app_files;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_app_files);
                    if (recyclerView != null) {
                        i8 = R.id.toolbar_afa;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_afa);
                        if (toolbar != null) {
                            i8 = R.id.tv_app_name_afa;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name_afa);
                            if (textView != null) {
                                i8 = R.id.tv_date_afa;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_afa);
                                if (textView2 != null) {
                                    i8 = R.id.tv_no_data_afa;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_afa);
                                    if (textView3 != null) {
                                        return new C1510f((RelativeLayout) view, imageView, a9, relativeLayout, recyclerView, toolbar, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1510f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1510f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.app_files_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12643a;
    }
}
