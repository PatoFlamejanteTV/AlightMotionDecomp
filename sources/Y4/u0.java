package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class u0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f13009a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f13010b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f13011c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f13012d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f13013e;

    /* renamed from: f, reason: collision with root package name */
    public final NestedScrollView f13014f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f13015g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f13016h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f13017i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f13018j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f13019k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f13020l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f13021m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f13022n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f13023o;

    private u0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f13009a = relativeLayout;
        this.f13010b = imageView;
        this.f13011c = imageView2;
        this.f13012d = imageView3;
        this.f13013e = linearLayout;
        this.f13014f = nestedScrollView;
        this.f13015g = textView;
        this.f13016h = textView2;
        this.f13017i = textView3;
        this.f13018j = textView4;
        this.f13019k = textView5;
        this.f13020l = textView6;
        this.f13021m = textView7;
        this.f13022n = textView8;
        this.f13023o = textView9;
    }

    public static u0 a(View view) {
        int i8 = R.id.iv_customization_turbo_welcome_popup;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_customization_turbo_welcome_popup);
        if (imageView != null) {
            i8 = R.id.iv_highlighted_comments_turbo_welcome_popup;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_highlighted_comments_turbo_welcome_popup);
            if (imageView2 != null) {
                i8 = R.id.iv_no_ads_turbo_welcome_popup;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_no_ads_turbo_welcome_popup);
                if (imageView3 != null) {
                    i8 = R.id.ll_content_turbo;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content_turbo);
                    if (linearLayout != null) {
                        i8 = R.id.nsv_turbo_welcome_popup;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nsv_turbo_welcome_popup);
                        if (nestedScrollView != null) {
                            i8 = R.id.tv_customization_desc_turbo_welcome_popup;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_customization_desc_turbo_welcome_popup);
                            if (textView != null) {
                                i8 = R.id.tv_customization_turbo_welcome_popup;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_customization_turbo_welcome_popup);
                                if (textView2 != null) {
                                    i8 = R.id.tv_desc_turbo_welcome_popup;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_turbo_welcome_popup);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_highlighted_comments_desc_turbo_welcome_popup;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highlighted_comments_desc_turbo_welcome_popup);
                                        if (textView4 != null) {
                                            i8 = R.id.tv_highlighted_comments_turbo_welcome_popup;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highlighted_comments_turbo_welcome_popup);
                                            if (textView5 != null) {
                                                i8 = R.id.tv_no_ads_desc_turbo_welcome_popup;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_ads_desc_turbo_welcome_popup);
                                                if (textView6 != null) {
                                                    i8 = R.id.tv_no_ads_turbo_welcome_popup;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_ads_turbo_welcome_popup);
                                                    if (textView7 != null) {
                                                        i8 = R.id.tv_start_turbo_welcome_popup;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_turbo_welcome_popup);
                                                        if (textView8 != null) {
                                                            i8 = R.id.tv_title_turbo_welcome_popup;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_turbo_welcome_popup);
                                                            if (textView9 != null) {
                                                                return new u0((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, nestedScrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static u0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static u0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.uptodown_turbo_welcome_popup, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f13009a;
    }
}
