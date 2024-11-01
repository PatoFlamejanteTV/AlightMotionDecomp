package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class x0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f13072a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f13073b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f13074c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f13075d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f13076e;

    private x0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2) {
        this.f13072a = relativeLayout;
        this.f13073b = imageView;
        this.f13074c = imageView2;
        this.f13075d = imageView3;
        this.f13076e = relativeLayout2;
    }

    public static x0 a(View view) {
        int i8 = R.id.iv_avatar_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_item);
        if (imageView != null) {
            i8 = R.id.iv_checked_user_avatar;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_checked_user_avatar);
            if (imageView2 != null) {
                i8 = R.id.iv_locked_item;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_locked_item);
                if (imageView3 != null) {
                    i8 = R.id.rl_shadow_avatar_item;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_shadow_avatar_item);
                    if (relativeLayout != null) {
                        return new x0((RelativeLayout) view, imageView, imageView2, imageView3, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static x0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.user_avatar_turbo, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f13072a;
    }
}
