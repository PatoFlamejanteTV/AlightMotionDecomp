package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import b5.InterfaceC1977a;
import b5.InterfaceC1980d;
import c5.C2043h;
import com.uptodown.R;
import com.uptodown.util.views.CropImageView;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4036m extends AbstractC4026h {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1980d f39948b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1977a f39949c;

    /* renamed from: d, reason: collision with root package name */
    private CropImageView f39950d;

    /* renamed from: e, reason: collision with root package name */
    private final ProgressBar f39951e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f39952f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f39953g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f39954h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f39955i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f39956j;

    /* renamed from: k, reason: collision with root package name */
    private final LinearLayout f39957k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f39958l;

    /* renamed from: m, reason: collision with root package name */
    private String f39959m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4036m(View itemView, InterfaceC1980d listener, InterfaceC1977a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f39948b = listener;
        this.f39949c = actionsClickListener;
        View findViewById = itemView.findViewById(R.id.iv_featured);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39950d = (CropImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.pb_progress_card);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39951e = (ProgressBar) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.iv_logo_card);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39952f = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_titulo_card);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f39953g = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_resumen_card);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f39954h = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_progress_card);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        TextView textView = (TextView) findViewById6;
        this.f39955i = textView;
        View findViewById7 = itemView.findViewById(R.id.tv_verified_card);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        TextView textView2 = (TextView) findViewById7;
        this.f39956j = textView2;
        View findViewById8 = itemView.findViewById(R.id.ll_progress_card);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        this.f39957k = (LinearLayout) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_status_card);
        AbstractC3292y.h(findViewById9, "findViewById(...)");
        this.f39958l = (TextView) findViewById9;
        TextView textView3 = this.f39953g;
        j.a aVar = J4.j.f4395g;
        textView3.setTypeface(aVar.u());
        this.f39954h.setTypeface(aVar.v());
        this.f39958l.setTypeface(aVar.v());
        textView.setTypeface(aVar.v());
        textView2.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C4036m c4036m, C2043h c2043h, View view) {
        c4036m.f39949c.a(c2043h, -1);
        return true;
    }

    public final void m(final C2043h app) {
        AbstractC3292y.i(app, "app");
        this.f39959m = app.v0();
        com.squareup.picasso.s.h().l(app.c0()).l(R.color.main_blue).i(this.f39950d);
        View itemView = this.itemView;
        AbstractC3292y.h(itemView, "itemView");
        c(itemView, this.f39948b, app);
        i(app, this.f39953g, this.f39954h);
        h(this.f39952f, app.j0());
        e(app, this.f39951e, this.f39952f, this.f39954h, this.f39955i, this.f39958l, this.f39957k);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: t5.l
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C4036m.n(C4036m.this, app, view);
                return n8;
            }
        });
    }

    public final String o() {
        return this.f39959m;
    }
}
