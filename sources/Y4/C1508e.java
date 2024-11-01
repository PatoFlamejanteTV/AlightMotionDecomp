package Y4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1508e implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12597a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12598b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f12599c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f12600d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f12601e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f12602f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f12603g;

    /* renamed from: h, reason: collision with root package name */
    public final ProgressBar f12604h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f12605i;

    /* renamed from: j, reason: collision with root package name */
    public final RelativeLayout f12606j;

    /* renamed from: k, reason: collision with root package name */
    public final RelativeLayout f12607k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f12608l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f12609m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f12610n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f12611o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f12612p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f12613q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f12614r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f12615s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f12616t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f12617u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f12618v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f12619w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f12620x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f12621y;

    /* renamed from: z, reason: collision with root package name */
    public final View f12622z;

    private C1508e(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, View view) {
        this.f12597a = relativeLayout;
        this.f12598b = imageView;
        this.f12599c = linearLayout;
        this.f12600d = linearLayout2;
        this.f12601e = linearLayout3;
        this.f12602f = linearLayout4;
        this.f12603g = linearLayout5;
        this.f12604h = progressBar;
        this.f12605i = relativeLayout2;
        this.f12606j = relativeLayout3;
        this.f12607k = relativeLayout4;
        this.f12608l = textView;
        this.f12609m = textView2;
        this.f12610n = textView3;
        this.f12611o = textView4;
        this.f12612p = textView5;
        this.f12613q = textView6;
        this.f12614r = textView7;
        this.f12615s = textView8;
        this.f12616t = textView9;
        this.f12617u = textView10;
        this.f12618v = textView11;
        this.f12619w = textView12;
        this.f12620x = textView13;
        this.f12621y = textView14;
        this.f12622z = view;
    }

    public static C1508e a(View view) {
        int i8 = R.id.iv_logo_app_detail;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_app_detail);
        if (imageView != null) {
            i8 = R.id.ll_download_info_app_detail;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_download_info_app_detail);
            if (linearLayout != null) {
                i8 = R.id.ll_downloads_counter_app_detail;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_downloads_counter_app_detail);
                if (linearLayout2 != null) {
                    i8 = R.id.ll_info_app_detail;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info_app_detail);
                    if (linearLayout3 != null) {
                        i8 = R.id.ll_last_update_app_detail;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_last_update_app_detail);
                        if (linearLayout4 != null) {
                            i8 = R.id.ll_valoration_app_detail;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_valoration_app_detail);
                            if (linearLayout5 != null) {
                                i8 = R.id.pb_progress_app_detail;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress_app_detail);
                                if (progressBar != null) {
                                    i8 = R.id.rl_head_main_info;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_head_main_info);
                                    if (relativeLayout != null) {
                                        i8 = R.id.rl_logo_app_detail;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_logo_app_detail);
                                        if (relativeLayout2 != null) {
                                            i8 = R.id.rl_valoration_app_detail;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_valoration_app_detail);
                                            if (relativeLayout3 != null) {
                                                i8 = R.id.tv_author_app_detail;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_author_app_detail);
                                                if (textView != null) {
                                                    i8 = R.id.tv_author_onboard_badge;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_author_onboard_badge);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_downloads_counter_app_detail;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_downloads_counter_app_detail);
                                                        if (textView3 != null) {
                                                            i8 = R.id.tv_downloads_label_app_detail;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_downloads_label_app_detail);
                                                            if (textView4 != null) {
                                                                i8 = R.id.tv_iaps_badge_app_detail;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_iaps_badge_app_detail);
                                                                if (textView5 != null) {
                                                                    i8 = R.id.tv_last_update_app_detail;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_update_app_detail);
                                                                    if (textView6 != null) {
                                                                        i8 = R.id.tv_last_update_label_app_detail;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_update_label_app_detail);
                                                                        if (textView7 != null) {
                                                                            i8 = R.id.tv_name_app_detail;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_app_detail);
                                                                            if (textView8 != null) {
                                                                                i8 = R.id.tv_phase_app_detail;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_phase_app_detail);
                                                                                if (textView9 != null) {
                                                                                    i8 = R.id.tv_progress_app_detail;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_app_detail);
                                                                                    if (textView10 != null) {
                                                                                        i8 = R.id.tv_reviews_counter_app_detail;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_app_detail);
                                                                                        if (textView11 != null) {
                                                                                            i8 = R.id.tv_valoration_app_detail;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_valoration_app_detail);
                                                                                            if (textView12 != null) {
                                                                                                i8 = R.id.tv_verified_app_detail;
                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_verified_app_detail);
                                                                                                if (textView13 != null) {
                                                                                                    i8 = R.id.tv_version_app_detail;
                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version_app_detail);
                                                                                                    if (textView14 != null) {
                                                                                                        i8 = R.id.v_separator_downloads_app_detail;
                                                                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_separator_downloads_app_detail);
                                                                                                        if (findChildViewById != null) {
                                                                                                            return new C1508e((RelativeLayout) view, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, progressBar, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, findChildViewById);
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

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12597a;
    }
}
