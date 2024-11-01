package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1515h0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12774a;

    /* renamed from: b, reason: collision with root package name */
    public final C1517i0 f12775b;

    /* renamed from: c, reason: collision with root package name */
    public final K f12776c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f12777d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12778e;

    private C1515h0(RelativeLayout relativeLayout, C1517i0 c1517i0, K k8, RecyclerView recyclerView, TextView textView) {
        this.f12774a = relativeLayout;
        this.f12775b = c1517i0;
        this.f12776c = k8;
        this.f12777d = recyclerView;
        this.f12778e = textView;
    }

    public static C1515h0 a(View view) {
        int i8 = R.id.include_search_bar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_search_bar);
        if (findChildViewById != null) {
            C1517i0 a9 = C1517i0.a(findChildViewById);
            i8 = R.id.loading_view_search;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loading_view_search);
            if (findChildViewById2 != null) {
                K a10 = K.a(findChildViewById2);
                i8 = R.id.rv_search_activity;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_search_activity);
                if (recyclerView != null) {
                    i8 = R.id.tv_msg_search_activity;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg_search_activity);
                    if (textView != null) {
                        return new C1515h0((RelativeLayout) view, a9, a10, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1515h0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1515h0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.search_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12774a;
    }
}
