package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class F implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f12170a;

    private F(TextView textView) {
        this.f12170a = textView;
    }

    public static F a(View view) {
        if (view != null) {
            return new F((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static F c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static F d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.home_header_category, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.f12170a;
    }
}
