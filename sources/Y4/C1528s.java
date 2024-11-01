package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1528s implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12927a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f12928b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12929c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12930d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12931e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12932f;

    private C1528s(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f12927a = linearLayout;
        this.f12928b = textView;
        this.f12929c = textView2;
        this.f12930d = textView3;
        this.f12931e = textView4;
        this.f12932f = textView5;
    }

    public static C1528s a(View view) {
        int i8 = R.id.tv_open_app_details_positive;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_app_details_positive);
        if (textView != null) {
            i8 = R.id.tv_positive_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_positive_title);
            if (textView2 != null) {
                i8 = R.id.tv_rollback_positive;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rollback_positive);
                if (textView3 != null) {
                    i8 = R.id.tv_uninstall_positive;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_uninstall_positive);
                    if (textView4 != null) {
                        i8 = R.id.tv_virus_report_positive;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_virus_report_positive);
                        if (textView5 != null) {
                            return new C1528s((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1528s c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1528s d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_positive_selected, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12927a;
    }
}
