package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class C implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12105a;

    /* renamed from: b, reason: collision with root package name */
    public final SubsamplingScaleImageView f12106b;

    /* renamed from: c, reason: collision with root package name */
    public final ProgressBar f12107c;

    private C(RelativeLayout relativeLayout, SubsamplingScaleImageView subsamplingScaleImageView, ProgressBar progressBar) {
        this.f12105a = relativeLayout;
        this.f12106b = subsamplingScaleImageView;
        this.f12107c = progressBar;
    }

    public static C a(View view) {
        int i8 = R.id.iv_imagen;
        SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) ViewBindings.findChildViewById(view, R.id.iv_imagen);
        if (subsamplingScaleImageView != null) {
            i8 = R.id.pb_gallery_item;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_gallery_item);
            if (progressBar != null) {
                return new C((RelativeLayout) view, subsamplingScaleImageView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.gallery_item, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12105a;
    }
}
