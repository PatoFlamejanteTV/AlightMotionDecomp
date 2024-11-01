package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1530u implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f13003a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f13004b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f13005c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f13006d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f13007e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f13008f;

    private C1530u(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f13003a = relativeLayout;
        this.f13004b = imageView;
        this.f13005c = textView;
        this.f13006d = textView2;
        this.f13007e = textView3;
        this.f13008f = textView4;
    }

    public static C1530u a(View view) {
        int i8 = R.id.iv_close_dialog_pre_register;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_dialog_pre_register);
        if (imageView != null) {
            i8 = R.id.tv_cancel_dialog_pre_register;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel_dialog_pre_register);
            if (textView != null) {
                i8 = R.id.tv_description_dialog_pre_register;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_dialog_pre_register);
                if (textView2 != null) {
                    i8 = R.id.tv_ok_dialog_pre_register;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok_dialog_pre_register);
                    if (textView3 != null) {
                        i8 = R.id.tv_title_dialog_pre_register;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_pre_register);
                        if (textView4 != null) {
                            return new C1530u((RelativeLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1530u c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1530u d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_pre_register, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f13003a;
    }
}
