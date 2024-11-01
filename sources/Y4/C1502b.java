package Y4;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1502b implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12477a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12478b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f12479c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f12480d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12481e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12482f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12483g;

    private C1502b(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, TextView textView3) {
        this.f12477a = relativeLayout;
        this.f12478b = imageView;
        this.f12479c = relativeLayout2;
        this.f12480d = relativeLayout3;
        this.f12481e = textView;
        this.f12482f = textView2;
        this.f12483g = textView3;
    }

    public static C1502b a(View view) {
        int i8 = R.id.iv_icon_affiliated;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_affiliated);
        if (imageView != null) {
            i8 = R.id.rl_container_affiliated;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container_affiliated);
            if (relativeLayout != null) {
                i8 = R.id.rl_container_stroke_affiliated;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container_stroke_affiliated);
                if (relativeLayout2 != null) {
                    i8 = R.id.tv_button_affiliated;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_button_affiliated);
                    if (textView != null) {
                        i8 = R.id.tv_description_affiliated;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_affiliated);
                        if (textView2 != null) {
                            i8 = R.id.tv_title_affiliated;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_affiliated);
                            if (textView3 != null) {
                                return new C1502b((RelativeLayout) view, imageView, relativeLayout, relativeLayout2, textView, textView2, textView3);
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
        return this.f12477a;
    }
}
