package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: Y4.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1505c0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12561a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f12562b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12563c;

    /* renamed from: d, reason: collision with root package name */
    public final K f12564d;

    /* renamed from: e, reason: collision with root package name */
    public final View f12565e;

    /* renamed from: f, reason: collision with root package name */
    public final NestedScrollView f12566f;

    /* renamed from: g, reason: collision with root package name */
    public final C1507d0 f12567g;

    /* renamed from: h, reason: collision with root package name */
    public final C1509e0 f12568h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f12569i;

    /* renamed from: j, reason: collision with root package name */
    public final RecyclerView f12570j;

    /* renamed from: k, reason: collision with root package name */
    public final Toolbar f12571k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f12572l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f12573m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f12574n;

    private C1505c0(RelativeLayout relativeLayout, EditText editText, ImageView imageView, K k8, View view, NestedScrollView nestedScrollView, C1507d0 c1507d0, C1509e0 c1509e0, RelativeLayout relativeLayout2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f12561a = relativeLayout;
        this.f12562b = editText;
        this.f12563c = imageView;
        this.f12564d = k8;
        this.f12565e = view;
        this.f12566f = nestedScrollView;
        this.f12567g = c1507d0;
        this.f12568h = c1509e0;
        this.f12569i = relativeLayout2;
        this.f12570j = recyclerView;
        this.f12571k = toolbar;
        this.f12572l = textView;
        this.f12573m = textView2;
        this.f12574n = textView3;
    }

    public static C1505c0 a(View view) {
        int i8 = R.id.et_reply;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_reply);
        if (editText != null) {
            i8 = R.id.iv_user_avatar_reply;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_user_avatar_reply);
            if (imageView != null) {
                i8 = R.id.loading_view_replies;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_replies);
                if (findChildViewById != null) {
                    K a9 = K.a(findChildViewById);
                    i8 = R.id.login_wall;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.login_wall);
                    if (findChildViewById2 != null) {
                        i8 = R.id.nsv_replies;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nsv_replies);
                        if (nestedScrollView != null) {
                            i8 = R.id.review;
                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.review);
                            if (findChildViewById3 != null) {
                                C1507d0 a10 = C1507d0.a(findChildViewById3);
                                i8 = R.id.review_turbo;
                                View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.review_turbo);
                                if (findChildViewById4 != null) {
                                    C1509e0 a11 = C1509e0.a(findChildViewById4);
                                    i8 = R.id.rl_user_reply;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_user_reply);
                                    if (relativeLayout != null) {
                                        i8 = R.id.rv_reply;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_reply);
                                        if (recyclerView != null) {
                                            i8 = R.id.toolbar_reply;
                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_reply);
                                            if (toolbar != null) {
                                                i8 = R.id.tv_app_name_reply;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name_reply);
                                                if (textView != null) {
                                                    i8 = R.id.tv_no_answer;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_answer);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_send_reply;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_send_reply);
                                                        if (textView3 != null) {
                                                            return new C1505c0((RelativeLayout) view, editText, imageView, a9, findChildViewById2, nestedScrollView, a10, a11, relativeLayout, recyclerView, toolbar, textView, textView2, textView3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static C1505c0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1505c0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.replies_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12561a;
    }
}
