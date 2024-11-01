package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class p0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12889a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f12890b;

    /* renamed from: c, reason: collision with root package name */
    public final K f12891c;

    /* renamed from: d, reason: collision with root package name */
    public final RadioButton f12892d;

    /* renamed from: e, reason: collision with root package name */
    public final RadioButton f12893e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f12894f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f12895g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12896h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12897i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f12898j;

    private p0(RelativeLayout relativeLayout, LinearLayout linearLayout, K k8, RadioButton radioButton, RadioButton radioButton2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f12889a = relativeLayout;
        this.f12890b = linearLayout;
        this.f12891c = k8;
        this.f12892d = radioButton;
        this.f12893e = radioButton2;
        this.f12894f = recyclerView;
        this.f12895g = toolbar;
        this.f12896h = textView;
        this.f12897i = textView2;
        this.f12898j = textView3;
    }

    public static p0 a(View view) {
        int i8 = R.id.ll_order_by_upcoming_releases;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_order_by_upcoming_releases);
        if (linearLayout != null) {
            i8 = R.id.loading_view_upcoming_releases;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_upcoming_releases);
            if (findChildViewById != null) {
                K a9 = K.a(findChildViewById);
                i8 = R.id.rb_date_ur;
                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_date_ur);
                if (radioButton != null) {
                    i8 = R.id.rb_name_ur;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_name_ur);
                    if (radioButton2 != null) {
                        i8 = R.id.rv_upcoming_releases;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_upcoming_releases);
                        if (recyclerView != null) {
                            i8 = R.id.toolbar_upcoming_releases;
                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_upcoming_releases);
                            if (toolbar != null) {
                                i8 = R.id.tv_label_order_by_ur;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_order_by_ur);
                                if (textView != null) {
                                    i8 = R.id.tv_no_items_upcoming_releases;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_items_upcoming_releases);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_title_upcoming_releases;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_upcoming_releases);
                                        if (textView3 != null) {
                                            return new p0((RelativeLayout) view, linearLayout, a9, radioButton, radioButton2, recyclerView, toolbar, textView, textView2, textView3);
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

    public static p0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static p0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.upcoming_releases_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12889a;
    }
}
