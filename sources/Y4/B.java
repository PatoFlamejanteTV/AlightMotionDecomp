package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class B implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12082a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12083b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f12084c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12085d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewPager f12086e;

    private B(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView, ViewPager viewPager) {
        this.f12082a = relativeLayout;
        this.f12083b = imageView;
        this.f12084c = relativeLayout2;
        this.f12085d = textView;
        this.f12086e = viewPager;
    }

    public static B a(View view) {
        int i8 = R.id.iv_back_gallery;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back_gallery);
        if (imageView != null) {
            i8 = R.id.toolbar_gallery;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar_gallery);
            if (relativeLayout != null) {
                i8 = R.id.tv_item_count_gallery;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_item_count_gallery);
                if (textView != null) {
                    i8 = R.id.vp_gallery;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.vp_gallery);
                    if (viewPager != null) {
                        return new B((RelativeLayout) view, imageView, relativeLayout, textView, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static B c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static B d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.gallery, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12082a;
    }
}
