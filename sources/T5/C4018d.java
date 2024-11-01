package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b5.InterfaceC1977a;
import b5.InterfaceC1980d;
import c5.C2043h;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4018d extends AbstractC4026h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1980d f39864b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1977a f39865c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f39866d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f39867e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f39868f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f39869g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f39870h;

    /* renamed from: i, reason: collision with root package name */
    private final ProgressBar f39871i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f39872j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f39873k;

    /* renamed from: l, reason: collision with root package name */
    private final LinearLayout f39874l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4018d(View itemView, InterfaceC1980d listener, InterfaceC1977a interfaceC1977a, Context context) {
        super(itemView, context);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(context, "context");
        this.f39864b = listener;
        this.f39865c = interfaceC1977a;
        View findViewById = itemView.findViewById(R.id.rl_app_info_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39866d = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39867e = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_info_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39868f = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_desc_app_info_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f39869g = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_status_app_info_item);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f39870h = (TextView) findViewById5;
        this.f39871i = (ProgressBar) itemView.findViewById(R.id.pb_progress_app_info_item);
        TextView textView = (TextView) itemView.findViewById(R.id.tv_progress_app_info_item);
        this.f39872j = textView;
        TextView textView2 = (TextView) itemView.findViewById(R.id.tv_verified_app_info_item);
        this.f39873k = textView2;
        this.f39874l = (LinearLayout) itemView.findViewById(R.id.ll_progress_app_info_item);
        TextView textView3 = this.f39868f;
        j.a aVar = J4.j.f4395g;
        textView3.setTypeface(aVar.u());
        this.f39869g.setTypeface(aVar.v());
        this.f39870h.setTypeface(aVar.v());
        if (textView != null) {
            textView.setTypeface(aVar.v());
        }
        if (textView2 != null) {
            textView2.setTypeface(aVar.v());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C4018d c4018d, C2043h c2043h, int i8, View view) {
        InterfaceC1977a interfaceC1977a = c4018d.f39865c;
        if (interfaceC1977a != null) {
            interfaceC1977a.a(c2043h, i8);
            return true;
        }
        return true;
    }

    public final void m(final C2043h app, final int i8) {
        TextView textView;
        LinearLayout linearLayout;
        AbstractC3292y.i(app, "app");
        c(this.f39866d, this.f39864b, app);
        this.f39866d.setOnLongClickListener(new View.OnLongClickListener() { // from class: t5.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C4018d.n(C4018d.this, app, i8, view);
                return n8;
            }
        });
        i(app, this.f39868f, this.f39869g);
        h(this.f39867e, app.k0());
        ProgressBar progressBar = this.f39871i;
        if (progressBar != null && (textView = this.f39872j) != null && (linearLayout = this.f39874l) != null) {
            e(app, progressBar, this.f39867e, this.f39869g, textView, this.f39870h, linearLayout);
        } else {
            g(app.v0(), this.f39870h, this.f39869g);
        }
    }
}
