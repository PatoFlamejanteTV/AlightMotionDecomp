package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1535z implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f13105a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f13106b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f13107c;

    private C1535z(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f13105a = linearLayout;
        this.f13106b = textView;
        this.f13107c = textView2;
    }

    public static C1535z a(View view) {
        int i8 = R.id.tv_answer_faq;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_answer_faq);
        if (textView != null) {
            i8 = R.id.tv_question_faq;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_question_faq);
            if (textView2 != null) {
                return new C1535z((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1535z c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1535z d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.faq, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f13105a;
    }
}
