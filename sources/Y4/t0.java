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
import com.uptodown.util.views.CropImageView;

/* loaded from: classes5.dex */
public final class t0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12997a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12998b;

    /* renamed from: c, reason: collision with root package name */
    public final CropImageView f12999c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f13000d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f13001e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f13002f;

    private t0(RelativeLayout relativeLayout, ImageView imageView, CropImageView cropImageView, TextView textView, TextView textView2, TextView textView3) {
        this.f12997a = relativeLayout;
        this.f12998b = imageView;
        this.f12999c = cropImageView;
        this.f13000d = textView;
        this.f13001e = textView2;
        this.f13002f = textView3;
    }

    public static t0 a(View view) {
        int i8 = R.id.iv_close_turbo_popup;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_turbo_popup);
        if (imageView != null) {
            i8 = R.id.iv_turbo_popup_bg;
            CropImageView cropImageView = (CropImageView) ViewBindings.findChildViewById(view, R.id.iv_turbo_popup_bg);
            if (cropImageView != null) {
                i8 = R.id.tv_line2_turbo_popup;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_line2_turbo_popup);
                if (textView != null) {
                    i8 = R.id.tv_turbo_popup;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_turbo_popup);
                    if (textView2 != null) {
                        i8 = R.id.tv_uptodown_turbo_popup;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_uptodown_turbo_popup);
                        if (textView3 != null) {
                            return new t0((RelativeLayout) view, imageView, cropImageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static t0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static t0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.uptodown_turbo_popup, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12997a;
    }
}
