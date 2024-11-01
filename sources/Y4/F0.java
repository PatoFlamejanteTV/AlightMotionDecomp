package Y4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class F0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12171a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f12172b;

    /* renamed from: c, reason: collision with root package name */
    public final ProgressBar f12173c;

    /* renamed from: d, reason: collision with root package name */
    public final ProgressBar f12174d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f12175e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12176f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12177g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12178h;

    private F0(RelativeLayout relativeLayout, LinearLayout linearLayout, ProgressBar progressBar, ProgressBar progressBar2, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.f12171a = relativeLayout;
        this.f12172b = linearLayout;
        this.f12173c = progressBar;
        this.f12174d = progressBar2;
        this.f12175e = relativeLayout2;
        this.f12176f = textView;
        this.f12177g = textView2;
        this.f12178h = textView3;
    }

    public static F0 a(View view) {
        int i8 = R.id.ll_pb_fus;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_pb_fus);
        if (linearLayout != null) {
            i8 = R.id.pb_enough_storage;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_enough_storage);
            if (progressBar != null) {
                i8 = R.id.pb_not_storage;
                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_not_storage);
                if (progressBar2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i8 = R.id.tv_no_storage_action;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_storage_action);
                    if (textView != null) {
                        i8 = R.id.tv_not_storage;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_storage);
                        if (textView2 != null) {
                            i8 = R.id.tv_not_storage_text;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_storage_text);
                            if (textView3 != null) {
                                return new F0(relativeLayout, linearLayout, progressBar, progressBar2, relativeLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12171a;
    }
}
