package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class Z implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12457a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f12458b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f12459c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f12460d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f12461e;

    /* renamed from: f, reason: collision with root package name */
    public final K f12462f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f12463g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12464h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12465i;

    private Z(RelativeLayout relativeLayout, EditText editText, EditText editText2, ImageView imageView, ImageView imageView2, K k8, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f12457a = relativeLayout;
        this.f12458b = editText;
        this.f12459c = editText2;
        this.f12460d = imageView;
        this.f12461e = imageView2;
        this.f12462f = k8;
        this.f12463g = toolbar;
        this.f12464h = textView;
        this.f12465i = textView2;
    }

    public static Z a(View view) {
        int i8 = R.id.et_confirm_password_edit;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_confirm_password_edit);
        if (editText != null) {
            i8 = R.id.et_password_edit;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.et_password_edit);
            if (editText2 != null) {
                i8 = R.id.iv_confirm_password_edit;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_confirm_password_edit);
                if (imageView != null) {
                    i8 = R.id.iv_password_edit;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_password_edit);
                    if (imageView2 != null) {
                        i8 = R.id.loading_view_password_edit;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_password_edit);
                        if (findChildViewById != null) {
                            K a9 = K.a(findChildViewById);
                            i8 = R.id.toolbar_password_edit;
                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_password_edit);
                            if (toolbar != null) {
                                i8 = R.id.tv_password_edit_change;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_password_edit_change);
                                if (textView != null) {
                                    i8 = R.id.tv_title_toolbar_password_edit;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_toolbar_password_edit);
                                    if (textView2 != null) {
                                        return new Z((RelativeLayout) view, editText, editText2, imageView, imageView2, a9, toolbar, textView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static Z c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static Z d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.password_edit, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12457a;
    }
}
