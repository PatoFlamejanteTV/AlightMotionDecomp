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

/* loaded from: classes5.dex */
public final class E0 extends AbstractC4026h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1980d f39672b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1977a f39673c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f39674d;

    /* renamed from: e, reason: collision with root package name */
    private RelativeLayout f39675e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f39676f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f39677g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f39678h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f39679i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f39680j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f39681k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f39682l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f39683m;

    /* renamed from: n, reason: collision with root package name */
    private final LinearLayout f39684n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(View itemView, InterfaceC1980d listener, InterfaceC1977a interfaceC1977a, Context context) {
        super(itemView, context);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(context, "context");
        this.f39672b = listener;
        this.f39673c = interfaceC1977a;
        this.f39674d = context;
        View findViewById = itemView.findViewById(R.id.rl_app_info_top_by_cat_small_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39675e = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_top_by_cat_small_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39676f = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_app_info_top_by_cat_small_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39677g = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_name_app_info_top_by_cat_small_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f39678h = (TextView) findViewById4;
        this.f39679i = (TextView) itemView.findViewById(R.id.tv_number_app_info_top_by_cat_small_item);
        View findViewById5 = itemView.findViewById(R.id.tv_desc_app_info_top_by_cat_small_item);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f39680j = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_status_app_info_top_by_cat_small_item);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        this.f39681k = (TextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_progress_app_info_top_by_cat_small_item);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        TextView textView = (TextView) findViewById7;
        this.f39682l = textView;
        View findViewById8 = itemView.findViewById(R.id.tv_verified_app_info_top_by_cat_small_item);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        TextView textView2 = (TextView) findViewById8;
        this.f39683m = textView2;
        View findViewById9 = itemView.findViewById(R.id.ll_progress_app_info_top_by_cat_small_item);
        AbstractC3292y.h(findViewById9, "findViewById(...)");
        this.f39684n = (LinearLayout) findViewById9;
        TextView textView3 = this.f39678h;
        j.a aVar = J4.j.f4395g;
        textView3.setTypeface(aVar.u());
        TextView textView4 = this.f39679i;
        if (textView4 != null) {
            textView4.setTypeface(aVar.u());
        }
        this.f39680j.setTypeface(aVar.v());
        this.f39681k.setTypeface(aVar.v());
        textView.setTypeface(aVar.v());
        textView2.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(E0 e02, C2043h c2043h, View view) {
        InterfaceC1977a interfaceC1977a = e02.f39673c;
        if (interfaceC1977a != null) {
            interfaceC1977a.a(c2043h, e02.getPosition());
            return true;
        }
        return true;
    }

    public final void m(final C2043h app, int i8) {
        AbstractC3292y.i(app, "app");
        c(this.f39675e, this.f39672b, app);
        this.f39675e.setOnLongClickListener(new View.OnLongClickListener() { // from class: t5.D0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = E0.n(E0.this, app, view);
                return n8;
            }
        });
        if (i8 > 0) {
            TextView textView = this.f39679i;
            if (textView != null) {
                textView.setText(this.itemView.getContext().getResources().getString(R.string.top_index_format, String.valueOf(i8)));
            }
            TextView textView2 = this.f39679i;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            TextView textView3 = this.f39679i;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        i(app, this.f39678h, this.f39680j);
        h(this.f39676f, app.k0());
        e(app, this.f39677g, this.f39676f, this.f39680j, this.f39682l, this.f39681k, this.f39684n);
    }
}
