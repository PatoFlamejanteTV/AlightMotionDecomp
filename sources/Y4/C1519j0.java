package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1519j0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12808a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f12809b;

    /* renamed from: c, reason: collision with root package name */
    public final K f12810c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f12811d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f12812e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f12813f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12814g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12815h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12816i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f12817j;

    private C1519j0(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, K k8, LinearLayout linearLayout, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f12808a = relativeLayout;
        this.f12809b = appCompatImageView;
        this.f12810c = k8;
        this.f12811d = linearLayout;
        this.f12812e = recyclerView;
        this.f12813f = toolbar;
        this.f12814g = textView;
        this.f12815h = textView2;
        this.f12816i = textView3;
        this.f12817j = textView4;
    }

    public static C1519j0 a(View view) {
        int i8 = R.id.iv_positives;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.iv_positives);
        if (appCompatImageView != null) {
            i8 = R.id.loading_view_security;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_security);
            if (findChildViewById != null) {
                K a9 = K.a(findChildViewById);
                i8 = R.id.rl_free_positives;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_free_positives);
                if (linearLayout != null) {
                    i8 = R.id.rv_positives;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_positives);
                    if (recyclerView != null) {
                        i8 = R.id.toolbar_positives;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_positives);
                        if (toolbar != null) {
                            i8 = R.id.tv_button_analysis_free_positives;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_button_analysis_free_positives);
                            if (textView != null) {
                                i8 = R.id.tv_last_analysis_free_positives;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_analysis_free_positives);
                                if (textView2 != null) {
                                    i8 = R.id.tv_title_free_positives;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_free_positives);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_toolbar_title_positives;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_positives);
                                        if (textView4 != null) {
                                            return new C1519j0((RelativeLayout) view, appCompatImageView, a9, linearLayout, recyclerView, toolbar, textView, textView2, textView3, textView4);
                                        }
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

    public static C1519j0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1519j0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.security_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12808a;
    }
}
