package Y4;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class D implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12118a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12119b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12120c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12121d;

    private D(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f12118a = relativeLayout;
        this.f12119b = imageView;
        this.f12120c = textView;
        this.f12121d = textView2;
    }

    public static D a(View view) {
        int i8 = R.id.iv_logo_app;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_app);
        if (imageView != null) {
            i8 = R.id.tv_app_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name);
            if (textView != null) {
                i8 = R.id.tv_app_version;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_version);
                if (textView2 != null) {
                    return new D((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12118a;
    }
}
