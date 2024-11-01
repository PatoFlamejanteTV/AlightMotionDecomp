package Y4;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1506d implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12575a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f12576b;

    private C1506d(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.f12575a = relativeLayout;
        this.f12576b = relativeLayout2;
    }

    public static C1506d a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_iv_feature_app_detail);
        if (relativeLayout != null) {
            return new C1506d((RelativeLayout) view, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rl_iv_feature_app_detail)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12575a;
    }
}
