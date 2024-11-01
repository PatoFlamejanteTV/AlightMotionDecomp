package A3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import v3.u;
import v3.v;

/* loaded from: classes4.dex */
public final class b implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f154a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f155b;

    /* renamed from: c, reason: collision with root package name */
    public final CircularProgressIndicator f156c;

    /* renamed from: d, reason: collision with root package name */
    public final ComposeView f157d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f158e;

    private b(View view, ImageView imageView, CircularProgressIndicator circularProgressIndicator, ComposeView composeView, ImageView imageView2) {
        this.f154a = view;
        this.f155b = imageView;
        this.f156c = circularProgressIndicator;
        this.f157d = composeView;
        this.f158e = imageView2;
    }

    public static b a(View view) {
        int i8 = u.f40570a;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = u.f40571b;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
            if (circularProgressIndicator != null) {
                i8 = u.f40572c;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i8);
                if (composeView != null) {
                    i8 = u.f40573d;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                    if (imageView2 != null) {
                        return new b(view, imageView, circularProgressIndicator, composeView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static b b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(v.f40576b, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f154a;
    }
}
