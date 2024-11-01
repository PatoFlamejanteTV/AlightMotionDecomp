package L2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* loaded from: classes4.dex */
public final class t implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f5365a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f5366b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f5367c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f5368d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f5369e;

    private t(View view, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView) {
        this.f5365a = view;
        this.f5366b = textView;
        this.f5367c = textView2;
        this.f5368d = textView3;
        this.f5369e = appCompatImageView;
    }

    public static t a(View view) {
        int i8 = AbstractC3390A.f35140o;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
        if (textView != null) {
            i8 = AbstractC3390A.f35094F;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView2 != null) {
                i8 = AbstractC3390A.f35095G;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView3 != null) {
                    i8 = AbstractC3390A.f35101M;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
                    if (appCompatImageView != null) {
                        return new t(view, textView, textView2, textView3, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static t b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3392C.f35176w, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f5365a;
    }
}
