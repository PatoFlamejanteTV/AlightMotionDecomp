package Y4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class r0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12918a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12919b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12920c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f12921d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f12922e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f12923f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12924g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12925h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12926i;

    private r0(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.f12918a = linearLayout;
        this.f12919b = imageView;
        this.f12920c = imageView2;
        this.f12921d = linearLayout2;
        this.f12922e = relativeLayout;
        this.f12923f = relativeLayout2;
        this.f12924g = textView;
        this.f12925h = textView2;
        this.f12926i = textView3;
    }

    public static r0 a(View view) {
        int i8 = R.id.iv_reload;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_reload);
        if (imageView != null) {
            i8 = R.id.iv_shield;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_shield);
            if (imageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i8 = R.id.rl_msg;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_msg);
                if (relativeLayout != null) {
                    i8 = R.id.rl_reload;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reload);
                    if (relativeLayout2 != null) {
                        i8 = R.id.tv_msg;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg);
                        if (textView != null) {
                            i8 = R.id.tv_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                            if (textView2 != null) {
                                i8 = R.id.tv_uptodown_protect;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_uptodown_protect);
                                if (textView3 != null) {
                                    return new r0(linearLayout, imageView, imageView2, linearLayout, relativeLayout, relativeLayout2, textView, textView2, textView3);
                                }
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
    public LinearLayout getRoot() {
        return this.f12918a;
    }
}
