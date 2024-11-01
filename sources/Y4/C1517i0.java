package Y4;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.views.InstantAutoCompleteTextView;

/* renamed from: Y4.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1517i0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12785a;

    /* renamed from: b, reason: collision with root package name */
    public final InstantAutoCompleteTextView f12786b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12787c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f12788d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f12789e;

    /* renamed from: f, reason: collision with root package name */
    public final ProgressBar f12790f;

    private C1517i0(RelativeLayout relativeLayout, InstantAutoCompleteTextView instantAutoCompleteTextView, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar) {
        this.f12785a = relativeLayout;
        this.f12786b = instantAutoCompleteTextView;
        this.f12787c = imageView;
        this.f12788d = imageView2;
        this.f12789e = imageView3;
        this.f12790f = progressBar;
    }

    public static C1517i0 a(View view) {
        int i8 = R.id.actv_search_bar;
        InstantAutoCompleteTextView instantAutoCompleteTextView = (InstantAutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.actv_search_bar);
        if (instantAutoCompleteTextView != null) {
            i8 = R.id.iv_back_search_bar;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back_search_bar);
            if (imageView != null) {
                i8 = R.id.iv_delete_search_bar;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_delete_search_bar);
                if (imageView2 != null) {
                    i8 = R.id.iv_voice_search_bar;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_voice_search_bar);
                    if (imageView3 != null) {
                        i8 = R.id.pb_search_bar;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_search_bar);
                        if (progressBar != null) {
                            return new C1517i0((RelativeLayout) view, instantAutoCompleteTextView, imageView, imageView2, imageView3, progressBar);
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
        return this.f12785a;
    }
}
