package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class b implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f5288a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearProgressIndicator f5289b;

    /* renamed from: c, reason: collision with root package name */
    public final Toolbar f5290c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewStub f5291d;

    private b(RelativeLayout relativeLayout, LinearProgressIndicator linearProgressIndicator, Toolbar toolbar, ViewStub viewStub) {
        this.f5288a = relativeLayout;
        this.f5289b = linearProgressIndicator;
        this.f5290c = toolbar;
        this.f5291d = viewStub;
    }

    public static b a(View view) {
        int i8 = AbstractC3390A.f35096H;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) ViewBindings.findChildViewById(view, i8);
        if (linearProgressIndicator != null) {
            i8 = AbstractC3390A.f35130h0;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i8);
            if (toolbar != null) {
                i8 = AbstractC3390A.f35132i0;
                ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i8);
                if (viewStub != null) {
                    return new b((RelativeLayout) view, linearProgressIndicator, toolbar, viewStub);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3392C.f35155b, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f5288a;
    }
}
