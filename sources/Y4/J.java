package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class J implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12216a;

    /* renamed from: b, reason: collision with root package name */
    public final K f12217b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f12218c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f12219d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12220e;

    private J(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.f12216a = relativeLayout;
        this.f12217b = k8;
        this.f12218c = recyclerView;
        this.f12219d = toolbar;
        this.f12220e = textView;
    }

    public static J a(View view) {
        int i8 = R.id.loading_view_language_settings;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_language_settings);
        if (findChildViewById != null) {
            K a9 = K.a(findChildViewById);
            i8 = R.id.rv_languages;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_languages);
            if (recyclerView != null) {
                i8 = R.id.toolbar_lang_settings;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_lang_settings);
                if (toolbar != null) {
                    i8 = R.id.tv_title_lang_settings;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_lang_settings);
                    if (textView != null) {
                        return new J((RelativeLayout) view, a9, recyclerView, toolbar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static J c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static J d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.language_settings, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12216a;
    }
}
