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
public final class S implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12398a;

    /* renamed from: b, reason: collision with root package name */
    public final K f12399b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f12400c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f12401d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12402e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12403f;

    private S(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f12398a = relativeLayout;
        this.f12399b = k8;
        this.f12400c = recyclerView;
        this.f12401d = toolbar;
        this.f12402e = textView;
        this.f12403f = textView2;
    }

    public static S a(View view) {
        int i8 = R.id.loading_view_notification_registry;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_notification_registry);
        if (findChildViewById != null) {
            K a9 = K.a(findChildViewById);
            i8 = R.id.rv_notifications_registry;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_notifications_registry);
            if (recyclerView != null) {
                i8 = R.id.toolbar_notifications_registry;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_notifications_registry);
                if (toolbar != null) {
                    i8 = R.id.tv_no_data_notifications_registry;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_notifications_registry);
                    if (textView != null) {
                        i8 = R.id.tv_title_notifications_registry;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_notifications_registry);
                        if (textView2 != null) {
                            return new S((RelativeLayout) view, a9, recyclerView, toolbar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static S c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static S d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.notifications_registry_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12398a;
    }
}
