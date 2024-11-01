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

/* renamed from: Y4.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1532w implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f13047a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f13048b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f13049c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f13050d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f13051e;

    private C1532w(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f13047a = relativeLayout;
        this.f13048b = imageView;
        this.f13049c = textView;
        this.f13050d = textView2;
        this.f13051e = textView3;
    }

    public static C1532w a(View view) {
        int i8 = R.id.iv_close_dialog_turbo_positives_detected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_dialog_turbo_positives_detected);
        if (imageView != null) {
            i8 = R.id.tv_action_dialog_turbo_positives_detected;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_dialog_turbo_positives_detected);
            if (textView != null) {
                i8 = R.id.tv_description_dialog_turbo_positives_detected;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_dialog_turbo_positives_detected);
                if (textView2 != null) {
                    i8 = R.id.tv_title_dialog_turbo_positives_detected;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_turbo_positives_detected);
                    if (textView3 != null) {
                        return new C1532w((RelativeLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1532w c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1532w d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_turbo_positives_detected, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f13047a;
    }
}
