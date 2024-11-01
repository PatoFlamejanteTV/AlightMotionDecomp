package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1523m implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12847a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f12848b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12849c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12850d;

    private C1523m(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f12847a = linearLayout;
        this.f12848b = textView;
        this.f12849c = textView2;
        this.f12850d = textView3;
    }

    public static C1523m a(View view) {
        int i8 = R.id.tv_close_dialog_pre_register;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_close_dialog_pre_register);
        if (textView != null) {
            i8 = R.id.tv_description_dialog_pre_register;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_dialog_pre_register);
            if (textView2 != null) {
                i8 = R.id.tv_title_dialog_pre_register;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_pre_register);
                if (textView3 != null) {
                    return new C1523m((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1523m c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1523m d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_coming_soon, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12847a;
    }
}
