package V3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebView;

/* loaded from: classes4.dex */
public final class i implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f10578a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreeDS2WebView f10579b;

    private i(View view, ThreeDS2WebView threeDS2WebView) {
        this.f10578a = view;
        this.f10579b = threeDS2WebView;
    }

    public static i a(View view) {
        int i8 = U3.d.f10120z;
        ThreeDS2WebView threeDS2WebView = (ThreeDS2WebView) ViewBindings.findChildViewById(view, i8);
        if (threeDS2WebView != null) {
            return new i(view, threeDS2WebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static i b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(U3.e.f10129i, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f10578a;
    }
}
