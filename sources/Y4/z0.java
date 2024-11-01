package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;

/* loaded from: classes5.dex */
public final class z0 implements ViewBinding {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f13108A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f13109B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f13110C;

    /* renamed from: D, reason: collision with root package name */
    public final UsernameTextView f13111D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f13112E;

    /* renamed from: F, reason: collision with root package name */
    public final A0 f13113F;

    /* renamed from: G, reason: collision with root package name */
    public final A0 f13114G;

    /* renamed from: H, reason: collision with root package name */
    public final r0 f13115H;

    /* renamed from: I, reason: collision with root package name */
    public final A0 f13116I;

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f13117a;

    /* renamed from: b, reason: collision with root package name */
    public final A0 f13118b;

    /* renamed from: c, reason: collision with root package name */
    public final GridLayout f13119c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f13120d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f13121e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f13122f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f13123g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f13124h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f13125i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f13126j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f13127k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f13128l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f13129m;

    /* renamed from: n, reason: collision with root package name */
    public final A0 f13130n;

    /* renamed from: o, reason: collision with root package name */
    public final RelativeLayout f13131o;

    /* renamed from: p, reason: collision with root package name */
    public final RelativeLayout f13132p;

    /* renamed from: q, reason: collision with root package name */
    public final RelativeLayout f13133q;

    /* renamed from: r, reason: collision with root package name */
    public final A0 f13134r;

    /* renamed from: s, reason: collision with root package name */
    public final ScrollView f13135s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f13136t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f13137u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f13138v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f13139w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f13140x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f13141y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f13142z;

    private z0(RelativeLayout relativeLayout, A0 a02, GridLayout gridLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, A0 a03, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, A0 a04, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, UsernameTextView usernameTextView, TextView textView11, A0 a05, A0 a06, r0 r0Var, A0 a07) {
        this.f13117a = relativeLayout;
        this.f13118b = a02;
        this.f13119c = gridLayout;
        this.f13120d = imageView;
        this.f13121e = imageView2;
        this.f13122f = imageView3;
        this.f13123g = linearLayout;
        this.f13124h = linearLayout2;
        this.f13125i = linearLayout3;
        this.f13126j = linearLayout4;
        this.f13127k = linearLayout5;
        this.f13128l = linearLayout6;
        this.f13129m = linearLayout7;
        this.f13130n = a03;
        this.f13131o = relativeLayout2;
        this.f13132p = relativeLayout3;
        this.f13133q = relativeLayout4;
        this.f13134r = a04;
        this.f13135s = scrollView;
        this.f13136t = textView;
        this.f13137u = textView2;
        this.f13138v = textView3;
        this.f13139w = textView4;
        this.f13140x = textView5;
        this.f13141y = textView6;
        this.f13142z = textView7;
        this.f13108A = textView8;
        this.f13109B = textView9;
        this.f13110C = textView10;
        this.f13111D = usernameTextView;
        this.f13112E = textView11;
        this.f13113F = a05;
        this.f13114G = a06;
        this.f13115H = r0Var;
        this.f13116I = a07;
    }

    public static z0 a(View view) {
        int i8 = R.id.downloads_user_fragment;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.downloads_user_fragment);
        if (findChildViewById != null) {
            A0 a9 = A0.a(findChildViewById);
            i8 = R.id.gl_user_fragment;
            GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(view, R.id.gl_user_fragment);
            if (gridLayout != null) {
                i8 = R.id.iv_dark_mode_user_fragment;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_dark_mode_user_fragment);
                if (imageView != null) {
                    i8 = R.id.iv_support_user_fragment;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_support_user_fragment);
                    if (imageView2 != null) {
                        i8 = R.id.iv_user_avatar_user_fragment;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_user_avatar_user_fragment);
                        if (imageView3 != null) {
                            i8 = R.id.ll_manage_subscription_user_fragment;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_manage_subscription_user_fragment);
                            if (linearLayout != null) {
                                i8 = R.id.ll_notifications_user_fragment;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_notifications_user_fragment);
                                if (linearLayout2 != null) {
                                    i8 = R.id.ll_security_user_fragment;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_security_user_fragment);
                                    if (linearLayout3 != null) {
                                        i8 = R.id.ll_settings_user_fragment;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_settings_user_fragment);
                                        if (linearLayout4 != null) {
                                            i8 = R.id.ll_support_user_fragment;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_support_user_fragment);
                                            if (linearLayout5 != null) {
                                                i8 = R.id.ll_turbo_promo_user_fragment;
                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_turbo_promo_user_fragment);
                                                if (linearLayout6 != null) {
                                                    i8 = R.id.ll_user_fragment;
                                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_user_fragment);
                                                    if (linearLayout7 != null) {
                                                        i8 = R.id.myapps_user_fragment;
                                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.myapps_user_fragment);
                                                        if (findChildViewById2 != null) {
                                                            A0 a10 = A0.a(findChildViewById2);
                                                            i8 = R.id.rl_toolbar_user_fragment;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_toolbar_user_fragment);
                                                            if (relativeLayout != null) {
                                                                i8 = R.id.rl_user_avatar_user_fragment;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_user_avatar_user_fragment);
                                                                if (relativeLayout2 != null) {
                                                                    i8 = R.id.rl_user_info_user_fragment;
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_user_info_user_fragment);
                                                                    if (relativeLayout3 != null) {
                                                                        i8 = R.id.rollback_user_fragment;
                                                                        View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.rollback_user_fragment);
                                                                        if (findChildViewById3 != null) {
                                                                            A0 a11 = A0.a(findChildViewById3);
                                                                            i8 = R.id.sv_user_fragment;
                                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.sv_user_fragment);
                                                                            if (scrollView != null) {
                                                                                i8 = R.id.tv_edit_profile_user_fragment;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit_profile_user_fragment);
                                                                                if (textView != null) {
                                                                                    i8 = R.id.tv_log_out_user_fragment;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_log_out_user_fragment);
                                                                                    if (textView2 != null) {
                                                                                        i8 = R.id.tv_manage_subscription_user_fragment;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_manage_subscription_user_fragment);
                                                                                        if (textView3 != null) {
                                                                                            i8 = R.id.tv_notifications_user_fragment;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_notifications_user_fragment);
                                                                                            if (textView4 != null) {
                                                                                                i8 = R.id.tv_registered_ago_user_fragment;
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_registered_ago_user_fragment);
                                                                                                if (textView5 != null) {
                                                                                                    i8 = R.id.tv_reviews_counter_user_fragment;
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_user_fragment);
                                                                                                    if (textView6 != null) {
                                                                                                        i8 = R.id.tv_security_user_fragment;
                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_security_user_fragment);
                                                                                                        if (textView7 != null) {
                                                                                                            i8 = R.id.tv_settings_user_fragment;
                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_settings_user_fragment);
                                                                                                            if (textView8 != null) {
                                                                                                                i8 = R.id.tv_support_user_fragment;
                                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_support_user_fragment);
                                                                                                                if (textView9 != null) {
                                                                                                                    i8 = R.id.tv_turbo_promo_user_fragment;
                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_turbo_promo_user_fragment);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i8 = R.id.tv_username_user_fragment;
                                                                                                                        UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_user_fragment);
                                                                                                                        if (usernameTextView != null) {
                                                                                                                            i8 = R.id.tv_web_user_fragment;
                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_web_user_fragment);
                                                                                                                            if (textView11 != null) {
                                                                                                                                i8 = R.id.upcoming_releases_user_fragment;
                                                                                                                                View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.upcoming_releases_user_fragment);
                                                                                                                                if (findChildViewById4 != null) {
                                                                                                                                    A0 a12 = A0.a(findChildViewById4);
                                                                                                                                    i8 = R.id.updates_user_fragment;
                                                                                                                                    View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.updates_user_fragment);
                                                                                                                                    if (findChildViewById5 != null) {
                                                                                                                                        A0 a13 = A0.a(findChildViewById5);
                                                                                                                                        i8 = R.id.uptodown_protect_user_fragment;
                                                                                                                                        View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.uptodown_protect_user_fragment);
                                                                                                                                        if (findChildViewById6 != null) {
                                                                                                                                            r0 a14 = r0.a(findChildViewById6);
                                                                                                                                            i8 = R.id.wishlist_user_fragment;
                                                                                                                                            View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.wishlist_user_fragment);
                                                                                                                                            if (findChildViewById7 != null) {
                                                                                                                                                return new z0((RelativeLayout) view, a9, gridLayout, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, a10, relativeLayout, relativeLayout2, relativeLayout3, a11, scrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, usernameTextView, textView11, a12, a13, a14, A0.a(findChildViewById7));
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static z0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.user_fragment, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f13117a;
    }
}
