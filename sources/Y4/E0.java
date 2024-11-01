package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class E0 implements ViewBinding {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f12139A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f12140B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f12141C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f12142D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f12143E;

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12144a;

    /* renamed from: b, reason: collision with root package name */
    public final D f12145b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12146c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f12147d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f12148e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f12149f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f12150g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f12151h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f12152i;

    /* renamed from: j, reason: collision with root package name */
    public final K f12153j;

    /* renamed from: k, reason: collision with root package name */
    public final RelativeLayout f12154k;

    /* renamed from: l, reason: collision with root package name */
    public final RelativeLayout f12155l;

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout f12156m;

    /* renamed from: n, reason: collision with root package name */
    public final RelativeLayout f12157n;

    /* renamed from: o, reason: collision with root package name */
    public final ScrollView f12158o;

    /* renamed from: p, reason: collision with root package name */
    public final Toolbar f12159p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f12160q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f12161r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f12162s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f12163t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f12164u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f12165v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f12166w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f12167x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f12168y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f12169z;

    private E0(RelativeLayout relativeLayout, D d8, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, K k8, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, ScrollView scrollView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.f12144a = relativeLayout;
        this.f12145b = d8;
        this.f12146c = imageView;
        this.f12147d = imageView2;
        this.f12148e = imageView3;
        this.f12149f = imageView4;
        this.f12150g = imageView5;
        this.f12151h = imageView6;
        this.f12152i = linearLayout;
        this.f12153j = k8;
        this.f12154k = relativeLayout2;
        this.f12155l = relativeLayout3;
        this.f12156m = relativeLayout4;
        this.f12157n = relativeLayout5;
        this.f12158o = scrollView;
        this.f12159p = toolbar;
        this.f12160q = textView;
        this.f12161r = textView2;
        this.f12162s = textView3;
        this.f12163t = textView4;
        this.f12164u = textView5;
        this.f12165v = textView6;
        this.f12166w = textView7;
        this.f12167x = textView8;
        this.f12168y = textView9;
        this.f12169z = textView10;
        this.f12139A = textView11;
        this.f12140B = textView12;
        this.f12141C = textView13;
        this.f12142D = textView14;
        this.f12143E = textView15;
    }

    public static E0 a(View view) {
        int i8 = R.id.header_installed_app;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.header_installed_app);
        if (findChildViewById != null) {
            D a9 = D.a(findChildViewById);
            i8 = R.id.iv_correct_malware;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_correct_malware);
            if (imageView != null) {
                i8 = R.id.iv_correct_spyware;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_correct_spyware);
                if (imageView2 != null) {
                    i8 = R.id.iv_correct_virus;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_correct_virus);
                    if (imageView3 != null) {
                        i8 = R.id.iv_logo_uptodown_vtr;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_uptodown_vtr);
                        if (imageView4 != null) {
                            i8 = R.id.iv_sha256_vtr;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sha256_vtr);
                            if (imageView5 != null) {
                                i8 = R.id.iv_signature_vtr;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_signature_vtr);
                                if (imageView6 != null) {
                                    i8 = R.id.ll_container_scans_vtr;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_container_scans_vtr);
                                    if (linearLayout != null) {
                                        i8 = R.id.loading_view_virus_total_report;
                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loading_view_virus_total_report);
                                        if (findChildViewById2 != null) {
                                            K a10 = K.a(findChildViewById2);
                                            i8 = R.id.rl_container_result_clean;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container_result_clean);
                                            if (relativeLayout != null) {
                                                i8 = R.id.rl_result_scan;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_result_scan);
                                                if (relativeLayout2 != null) {
                                                    i8 = R.id.rl_sha256_more_info;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_sha256_more_info);
                                                    if (relativeLayout3 != null) {
                                                        i8 = R.id.rl_signature_more_info;
                                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_signature_more_info);
                                                        if (relativeLayout4 != null) {
                                                            i8 = R.id.sv_report_vtr;
                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.sv_report_vtr);
                                                            if (scrollView != null) {
                                                                i8 = R.id.toolbar_vtr;
                                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_vtr);
                                                                if (toolbar != null) {
                                                                    i8 = R.id.tv_full_report_vtr;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_full_report_vtr);
                                                                    if (textView != null) {
                                                                        i8 = R.id.tv_label_full_report_vtr;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_full_report_vtr);
                                                                        if (textView2 != null) {
                                                                            i8 = R.id.tv_last_scan_results;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_scan_results);
                                                                            if (textView3 != null) {
                                                                                i8 = R.id.tv_msg_results;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg_results);
                                                                                if (textView4 != null) {
                                                                                    i8 = R.id.tv_no_data_vtr;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_vtr);
                                                                                    if (textView5 != null) {
                                                                                        i8 = R.id.tv_no_malware;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_malware);
                                                                                        if (textView6 != null) {
                                                                                            i8 = R.id.tv_no_spyware;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_spyware);
                                                                                            if (textView7 != null) {
                                                                                                i8 = R.id.tv_no_virus;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_virus);
                                                                                                if (textView8 != null) {
                                                                                                    i8 = R.id.tv_positives_results;
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_positives_results);
                                                                                                    if (textView9 != null) {
                                                                                                        i8 = R.id.tv_sha256_label_vtr;
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sha256_label_vtr);
                                                                                                        if (textView10 != null) {
                                                                                                            i8 = R.id.tv_sha256_value_vtr;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sha256_value_vtr);
                                                                                                            if (textView11 != null) {
                                                                                                                i8 = R.id.tv_signature_label_vtr;
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_signature_label_vtr);
                                                                                                                if (textView12 != null) {
                                                                                                                    i8 = R.id.tv_signature_value_vtr;
                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_signature_value_vtr);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i8 = R.id.tv_toolbar_vtr;
                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_vtr);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i8 = R.id.vt_report_certified_by_uptodown;
                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.vt_report_certified_by_uptodown);
                                                                                                                            if (textView15 != null) {
                                                                                                                                return new E0((RelativeLayout) view, a9, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, a10, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, scrollView, toolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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

    public static E0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static E0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.virus_total_report, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12144a;
    }
}
