package V3;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes4.dex */
public final class k implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10589a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10590b;

    /* renamed from: c, reason: collision with root package name */
    public final CircularProgressIndicator f10591c;

    private k(LinearLayout linearLayout, ImageView imageView, CircularProgressIndicator circularProgressIndicator) {
        this.f10589a = linearLayout;
        this.f10590b = imageView;
        this.f10591c = circularProgressIndicator;
    }

    public static k a(View view) {
        int i8 = U3.d.f10095a;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = U3.d.f10116v;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
            if (circularProgressIndicator != null) {
                return new k((LinearLayout) view, imageView, circularProgressIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10589a;
    }
}
