package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class J0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12221a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12222b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12223c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f12224d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f12225e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f12226f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f12227g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f12228h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f12229i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f12230j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f12231k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f12232l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f12233m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f12234n;

    private J0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f12221a = relativeLayout;
        this.f12222b = imageView;
        this.f12223c = imageView2;
        this.f12224d = linearLayout;
        this.f12225e = progressBar;
        this.f12226f = relativeLayout2;
        this.f12227g = relativeLayout3;
        this.f12228h = relativeLayout4;
        this.f12229i = relativeLayout5;
        this.f12230j = textView;
        this.f12231k = textView2;
        this.f12232l = textView3;
        this.f12233m = textView4;
        this.f12234n = textView5;
    }

    public static J0 a(View view) {
        int i8 = R.id.iv_cancel_wishlist_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_cancel_wishlist_item);
        if (imageView != null) {
            i8 = R.id.iv_icon_wishlist_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_wishlist_item);
            if (imageView2 != null) {
                i8 = R.id.ll_info_wishlist_item;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info_wishlist_item);
                if (linearLayout != null) {
                    i8 = R.id.pb_progress_wishlist_item;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress_wishlist_item);
                    if (progressBar != null) {
                        i8 = R.id.rl_actions_wishlist_item;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_actions_wishlist_item);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_cancel_wishlist_item;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_cancel_wishlist_item);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_container_wishlist_item;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container_wishlist_item);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.rl_icon_progress_wishlist_item;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_icon_progress_wishlist_item);
                                    if (relativeLayout4 != null) {
                                        i8 = R.id.tv_action_wishlist_item;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_wishlist_item);
                                        if (textView != null) {
                                            i8 = R.id.tv_name_wishlist_item;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_wishlist_item);
                                            if (textView2 != null) {
                                                i8 = R.id.tv_pending_wishlist_item;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pending_wishlist_item);
                                                if (textView3 != null) {
                                                    i8 = R.id.tv_status_wishlist_item;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_status_wishlist_item);
                                                    if (textView4 != null) {
                                                        i8 = R.id.tv_version_wishlist_item;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version_wishlist_item);
                                                        if (textView5 != null) {
                                                            return new J0((RelativeLayout) view, imageView, imageView2, linearLayout, progressBar, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2, textView3, textView4, textView5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static J0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.wishlist_item, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12221a;
    }
}
