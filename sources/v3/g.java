package V3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public final class g implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f10565a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f10566b;

    /* renamed from: c, reason: collision with root package name */
    public final TextInputEditText f10567c;

    private g(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputEditText textInputEditText) {
        this.f10565a = textInputLayout;
        this.f10566b = textInputLayout2;
        this.f10567c = textInputEditText;
    }

    public static g a(View view) {
        TextInputLayout textInputLayout = (TextInputLayout) view;
        int i8 = U3.d.f10119y;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i8);
        if (textInputEditText != null) {
            return new g(textInputLayout, textInputLayout, textInputEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static g c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(U3.e.f10127g, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextInputLayout getRoot() {
        return this.f10565a;
    }
}
