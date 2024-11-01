package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class i implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f5322a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f5323b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f5324c;

    private i(View view, ImageView imageView, ImageView imageView2) {
        this.f5322a = view;
        this.f5323b = imageView;
        this.f5324c = imageView2;
    }

    public static i a(View view) {
        int i8 = AbstractC3390A.f35138m;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = AbstractC3390A.f35091C;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView2 != null) {
                return new i(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static i b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3392C.f35163j, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f5322a;
    }
}
