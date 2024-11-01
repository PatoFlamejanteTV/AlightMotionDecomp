package Y4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class H0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12194a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f12195b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12196c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12197d;

    /* renamed from: e, reason: collision with root package name */
    public final View f12198e;

    private H0(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f12194a = relativeLayout;
        this.f12195b = textView;
        this.f12196c = textView2;
        this.f12197d = textView3;
        this.f12198e = view;
    }

    public static H0 a(View view) {
        int i8 = R.id.tv_read_more_whats_new;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_read_more_whats_new);
        if (textView != null) {
            i8 = R.id.tv_whats_new;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_whats_new);
            if (textView2 != null) {
                i8 = R.id.tv_whats_new_content;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_whats_new_content);
                if (textView3 != null) {
                    i8 = R.id.v_shadow_whats_new;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_shadow_whats_new);
                    if (findChildViewById != null) {
                        return new H0((RelativeLayout) view, textView, textView2, textView3, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12194a;
    }
}
