package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class G0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12184a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f12185b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f12186c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12187d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12188e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12189f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12190g;

    private G0(LinearLayout linearLayout, ProgressBar progressBar, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f12184a = linearLayout;
        this.f12185b = progressBar;
        this.f12186c = linearLayout2;
        this.f12187d = textView;
        this.f12188e = textView2;
        this.f12189f = textView3;
        this.f12190g = textView4;
    }

    public static G0 a(View view) {
        int i8 = R.id.pb_not_storage;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_not_storage);
        if (progressBar != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.tv_no_storage_action;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_storage_action);
            if (textView != null) {
                i8 = R.id.tv_not_storage;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_storage);
                if (textView2 != null) {
                    i8 = R.id.tv_not_storage_text;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_storage_text);
                    if (textView3 != null) {
                        i8 = R.id.tv_not_storage_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_storage_title);
                        if (textView4 != null) {
                            return new G0(linearLayout, progressBar, linearLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static G0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static G0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.warning_not_space_available_dialog, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12184a;
    }
}
