package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1974C;
import b5.InterfaceC1977a;
import c5.C2043h;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class P extends AbstractC4026h {

    /* renamed from: b, reason: collision with root package name */
    private b5.s f39743b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1977a f39744c;

    /* renamed from: d, reason: collision with root package name */
    private Context f39745d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f39746e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView f39747f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f39748g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f39749h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f39750i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f39751j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f39752k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f39753l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f39754m;

    /* renamed from: n, reason: collision with root package name */
    private final LinearLayout f39755n;

    /* renamed from: o, reason: collision with root package name */
    private I4.E f39756o;

    /* renamed from: p, reason: collision with root package name */
    private String f39757p;

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC1974C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2043h f39759b;

        a(C2043h c2043h) {
            this.f39759b = c2043h;
        }

        @Override // b5.InterfaceC1974C
        public void a(c5.N screenshot) {
            AbstractC3292y.i(screenshot, "screenshot");
            I4.E e8 = P.this.f39756o;
            if (e8 != null) {
                e8.c(screenshot);
            }
        }

        @Override // b5.InterfaceC1974C
        public void b(c5.N screenshot) {
            AbstractC3292y.i(screenshot, "screenshot");
            P.this.f39743b.a(this.f39759b);
        }

        @Override // b5.InterfaceC1974C
        public void c(c5.V video) {
            AbstractC3292y.i(video, "video");
        }

        @Override // b5.InterfaceC1974C
        public void d(c5.V video) {
            AbstractC3292y.i(video, "video");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(View itemView, b5.s listener, InterfaceC1977a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f39743b = listener;
        this.f39744c = actionsClickListener;
        this.f39745d = context;
        View findViewById = itemView.findViewById(R.id.tv_title_home_gallery_featured);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39746e = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.rv_screenshots_home_gallery_featured);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39747f = (RecyclerView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_gallery_featured_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39748g = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.iv_logo_gallery_featured_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f39749h = (ImageView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_name_gallery_featured_item);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f39750i = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_desc_gallery_featured_item);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        this.f39751j = (TextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_status_gallery_featured_item);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        TextView textView = (TextView) findViewById7;
        this.f39752k = textView;
        View findViewById8 = itemView.findViewById(R.id.tv_progress_gallery_featured_item);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        TextView textView2 = (TextView) findViewById8;
        this.f39753l = textView2;
        View findViewById9 = itemView.findViewById(R.id.tv_verified_gallery_featured_item);
        AbstractC3292y.h(findViewById9, "findViewById(...)");
        TextView textView3 = (TextView) findViewById9;
        this.f39754m = textView3;
        View findViewById10 = itemView.findViewById(R.id.ll_progress_gallery_featured_item);
        AbstractC3292y.h(findViewById10, "findViewById(...)");
        this.f39755n = (LinearLayout) findViewById10;
        TextView textView4 = this.f39746e;
        j.a aVar = J4.j.f4395g;
        textView4.setTypeface(aVar.u());
        this.f39750i.setTypeface(aVar.u());
        this.f39751j.setTypeface(aVar.v());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.v());
        textView.setTypeface(aVar.v());
        int dimension = (int) this.f39745d.getResources().getDimension(R.dimen.margin_m);
        this.f39747f.setLayoutManager(new LinearLayoutManager(this.f39745d, 0, false));
        this.f39747f.addItemDecoration(new s5.r(dimension));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(P p8, C2043h c2043h, View view) {
        p8.f39744c.a(c2043h, -1);
        return true;
    }

    private final void r(C2043h c2043h) {
        if (this.f39756o == null) {
            a aVar = new a(c2043h);
            ArrayList arrayList = new ArrayList();
            ArrayList L02 = c2043h.L0();
            AbstractC3292y.f(L02);
            arrayList.addAll(L02);
            I4.E e8 = new I4.E(arrayList, aVar);
            this.f39756o = e8;
            this.f39747f.setAdapter(e8);
        }
    }

    private final void t(View view, final C2043h c2043h) {
        view.setOnClickListener(new View.OnClickListener() { // from class: t5.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                P.u(P.this, c2043h, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(P p8, C2043h c2043h, View view) {
        p8.f39743b.a(c2043h);
    }

    public final void p(final C2043h app) {
        AbstractC3292y.i(app, "app");
        this.f39757p = app.v0();
        this.f39746e.setText(this.f39745d.getString(R.string.home_fragment_download_app_title, app.q0()));
        View itemView = this.itemView;
        AbstractC3292y.h(itemView, "itemView");
        t(itemView, app);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: t5.N
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean q8;
                q8 = P.q(P.this, app, view);
                return q8;
            }
        });
        ArrayList L02 = app.L0();
        if (L02 != null && !L02.isEmpty()) {
            r(app);
        }
        i(app, this.f39750i, this.f39751j);
        h(this.f39749h, app.k0());
        e(app, this.f39748g, this.f39749h, this.f39751j, this.f39753l, this.f39752k, this.f39755n);
    }

    public final String s() {
        return this.f39757p;
    }
}
