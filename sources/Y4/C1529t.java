package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1529t implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12988a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f12989b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12990c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12991d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12992e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12993f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12994g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12995h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12996i;

    private C1529t(LinearLayout linearLayout, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f12988a = linearLayout;
        this.f12989b = relativeLayout;
        this.f12990c = textView;
        this.f12991d = textView2;
        this.f12992e = textView3;
        this.f12993f = textView4;
        this.f12994g = textView5;
        this.f12995h = textView6;
        this.f12996i = textView7;
    }

    public static C1529t a(View view) {
        int i8 = R.id.rl_result_scan;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_result_scan);
        if (relativeLayout != null) {
            i8 = R.id.tv_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
            if (textView != null) {
                i8 = R.id.tv_install;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_install);
                if (textView2 != null) {
                    i8 = R.id.tv_last_scan_results;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_scan_results);
                    if (textView3 != null) {
                        i8 = R.id.tv_msg;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg);
                        if (textView4 != null) {
                            i8 = R.id.tv_msg_results;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg_results);
                            if (textView5 != null) {
                                i8 = R.id.tv_positives_results;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_positives_results);
                                if (textView6 != null) {
                                    i8 = R.id.tv_title_dialog_turbo_positives_detected;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_turbo_positives_detected);
                                    if (textView7 != null) {
                                        return new C1529t((LinearLayout) view, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    public static C1529t c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1529t d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_positives_detected, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12988a;
    }
}
