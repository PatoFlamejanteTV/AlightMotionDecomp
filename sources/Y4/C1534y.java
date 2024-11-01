package Y4;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1534y implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f13077a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f13078b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f13079c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f13080d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f13081e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f13082f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f13083g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f13084h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f13085i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f13086j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f13087k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f13088l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f13089m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f13090n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f13091o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f13092p;

    private C1534y(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f13077a = relativeLayout;
        this.f13078b = imageView;
        this.f13079c = imageView2;
        this.f13080d = imageView3;
        this.f13081e = progressBar;
        this.f13082f = relativeLayout2;
        this.f13083g = relativeLayout3;
        this.f13084h = relativeLayout4;
        this.f13085i = relativeLayout5;
        this.f13086j = textView;
        this.f13087k = textView2;
        this.f13088l = textView3;
        this.f13089m = textView4;
        this.f13090n = textView5;
        this.f13091o = textView6;
        this.f13092p = textView7;
    }

    public static C1534y a(View view) {
        int i8 = R.id.iv_cancel_downloading;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_cancel_downloading);
        if (imageView != null) {
            i8 = R.id.iv_resume_downloading;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_resume_downloading);
            if (imageView2 != null) {
                i8 = R.id.iv_status_pre_register;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_status_pre_register);
                if (imageView3 != null) {
                    i8 = R.id.pb_download_button;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_download_button);
                    if (progressBar != null) {
                        i8 = R.id.rl_status_download;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_download);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_status_downloading;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_downloading);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_status_loading;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_loading);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.rl_status_pre_register;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_pre_register);
                                    if (relativeLayout4 != null) {
                                        i8 = R.id.tv_enqueue_download;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_enqueue_download);
                                        if (textView != null) {
                                            i8 = R.id.tv_open_download_button;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_download_button);
                                            if (textView2 != null) {
                                                i8 = R.id.tv_percentage_downloaded;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_percentage_downloaded);
                                                if (textView3 != null) {
                                                    i8 = R.id.tv_size_downloaded;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size_downloaded);
                                                    if (textView4 != null) {
                                                        i8 = R.id.tv_size_total;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size_total);
                                                        if (textView5 != null) {
                                                            i8 = R.id.tv_status_download;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_status_download);
                                                            if (textView6 != null) {
                                                                i8 = R.id.tv_status_pre_register;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_status_pre_register);
                                                                if (textView7 != null) {
                                                                    return new C1534y((RelativeLayout) view, imageView, imageView2, imageView3, progressBar, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
        return this.f13077a;
    }
}
