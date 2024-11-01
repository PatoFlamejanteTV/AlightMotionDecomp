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

/* renamed from: Y4.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1500a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12466a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12467b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f12468c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12469d;

    private C1500a(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView) {
        this.f12466a = relativeLayout;
        this.f12467b = imageView;
        this.f12468c = relativeLayout2;
        this.f12469d = textView;
    }

    public static C1500a a(View view) {
        int i8 = R.id.iv_interstitial;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_interstitial);
        if (imageView != null) {
            i8 = R.id.rl_close_interstitial;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_close_interstitial);
            if (relativeLayout != null) {
                i8 = R.id.tv_download_interstitial;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_download_interstitial);
                if (textView != null) {
                    return new C1500a((RelativeLayout) view, imageView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1500a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1500a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.ad_interstitial, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12466a;
    }
}
