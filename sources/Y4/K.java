package Y4;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes5.dex */
public final class K implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12235a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f12236b;

    private K(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.f12235a = relativeLayout;
        this.f12236b = relativeLayout2;
    }

    public static K a(View view) {
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new K(relativeLayout, relativeLayout);
        }
        throw new NullPointerException("rootView");
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12235a;
    }
}
