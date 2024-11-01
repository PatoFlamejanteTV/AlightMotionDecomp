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

/* loaded from: classes5.dex */
public final class r implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12911a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12912b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12913c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12914d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12915e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12916f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12917g;

    private r(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f12911a = relativeLayout;
        this.f12912b = imageView;
        this.f12913c = textView;
        this.f12914d = textView2;
        this.f12915e = textView3;
        this.f12916f = textView4;
        this.f12917g = textView5;
    }

    public static r a(View view) {
        int i8 = R.id.iv_close_dialog_no_wifi_connection;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_dialog_no_wifi_connection);
        if (imageView != null) {
            i8 = R.id.tv_cancel_dialog_no_wifi_connection;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel_dialog_no_wifi_connection);
            if (textView != null) {
                i8 = R.id.tv_description_dialog_no_wifi_connection;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_dialog_no_wifi_connection);
                if (textView2 != null) {
                    i8 = R.id.tv_ok_dialog_no_wifi_connection;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok_dialog_no_wifi_connection);
                    if (textView3 != null) {
                        i8 = R.id.tv_settings_dialog_no_wifi_connection;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_settings_dialog_no_wifi_connection);
                        if (textView4 != null) {
                            i8 = R.id.tv_title_dialog_no_wifi_connection;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_no_wifi_connection);
                            if (textView5 != null) {
                                return new r((RelativeLayout) view, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static r c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static r d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_no_wifi_connection, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12911a;
    }
}
