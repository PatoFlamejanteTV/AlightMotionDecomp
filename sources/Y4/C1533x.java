package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1533x implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f13056a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f13057b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f13058c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f13059d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f13060e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f13061f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f13062g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f13063h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f13064i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f13065j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f13066k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f13067l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f13068m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f13069n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f13070o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f13071p;

    private C1533x(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.f13056a = linearLayout;
        this.f13057b = textView;
        this.f13058c = textView2;
        this.f13059d = textView3;
        this.f13060e = textView4;
        this.f13061f = textView5;
        this.f13062g = textView6;
        this.f13063h = textView7;
        this.f13064i = textView8;
        this.f13065j = textView9;
        this.f13066k = textView10;
        this.f13067l = textView11;
        this.f13068m = textView12;
        this.f13069n = textView13;
        this.f13070o = textView14;
        this.f13071p = textView15;
    }

    public static C1533x a(View view) {
        int i8 = R.id.tv_app_installed_details;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_installed_details);
        if (textView != null) {
            i8 = R.id.tv_backup;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_backup);
            if (textView2 != null) {
                i8 = R.id.tv_check_updates;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_check_updates);
                if (textView3 != null) {
                    i8 = R.id.tv_exclude;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_exclude);
                    if (textView4 != null) {
                        i8 = R.id.tv_ignore_version;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ignore_version);
                        if (textView5 != null) {
                            i8 = R.id.tv_nsd_send;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nsd_send);
                            if (textView6 != null) {
                                i8 = R.id.tv_old_versions;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_old_versions);
                                if (textView7 != null) {
                                    i8 = R.id.tv_open;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open);
                                    if (textView8 != null) {
                                        i8 = R.id.tv_see_on_uptodown;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_see_on_uptodown);
                                        if (textView9 != null) {
                                            i8 = R.id.tv_share;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_share);
                                            if (textView10 != null) {
                                                i8 = R.id.tv_title_das;
                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_das);
                                                if (textView11 != null) {
                                                    i8 = R.id.tv_uninstall;
                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_uninstall);
                                                    if (textView12 != null) {
                                                        i8 = R.id.tv_update;
                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_update);
                                                        if (textView13 != null) {
                                                            i8 = R.id.tv_version_details;
                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version_details);
                                                            if (textView14 != null) {
                                                                i8 = R.id.tv_virustotal_report;
                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_virustotal_report);
                                                                if (textView15 != null) {
                                                                    return new C1533x((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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

    public static C1533x c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1533x d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialogo_app_selected, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f13056a;
    }
}
