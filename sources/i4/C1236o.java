package I4;

import I4.C1236o;
import J4.j;
import R5.AbstractC1435t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import b5.InterfaceC1980d;
import c5.C2043h;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import t5.AbstractC4026h;

/* renamed from: I4.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1236o extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1980d f3668a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1977a f3669b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3670c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3671d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3672e;

    /* renamed from: I4.o$a */
    /* loaded from: classes5.dex */
    public final class a extends AbstractC4026h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1980d f3673b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1977a f3674c;

        /* renamed from: d, reason: collision with root package name */
        private Context f3675d;

        /* renamed from: e, reason: collision with root package name */
        private final ImageView f3676e;

        /* renamed from: f, reason: collision with root package name */
        private final ImageView f3677f;

        /* renamed from: g, reason: collision with root package name */
        private final ProgressBar f3678g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f3679h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f3680i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f3681j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3682k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f3683l;

        /* renamed from: m, reason: collision with root package name */
        private final LinearLayout f3684m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C1236o f3685n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1236o c1236o, View itemView, InterfaceC1980d listener, InterfaceC1977a actionsClickListener, Context context) {
            super(itemView, context);
            AbstractC3292y.i(itemView, "itemView");
            AbstractC3292y.i(listener, "listener");
            AbstractC3292y.i(actionsClickListener, "actionsClickListener");
            AbstractC3292y.i(context, "context");
            this.f3685n = c1236o;
            this.f3673b = listener;
            this.f3674c = actionsClickListener;
            this.f3675d = context;
            this.f3676e = (ImageView) itemView.findViewById(R.id.iv_home_card_featured_item);
            this.f3677f = (ImageView) itemView.findViewById(R.id.iv_logo_home_card_featured_item);
            View findViewById = itemView.findViewById(R.id.pb_progress_home_card_featured_item);
            AbstractC3292y.h(findViewById, "findViewById(...)");
            this.f3678g = (ProgressBar) findViewById;
            TextView textView = (TextView) itemView.findViewById(R.id.tv_name_home_card_featured_item);
            this.f3679h = textView;
            TextView textView2 = (TextView) itemView.findViewById(R.id.tv_desc_home_card_featured_item);
            this.f3680i = textView2;
            this.f3681j = (TextView) itemView.findViewById(R.id.tv_status_home_card_featured_item);
            View findViewById2 = itemView.findViewById(R.id.tv_progress_home_card_featured_item);
            AbstractC3292y.h(findViewById2, "findViewById(...)");
            TextView textView3 = (TextView) findViewById2;
            this.f3682k = textView3;
            View findViewById3 = itemView.findViewById(R.id.tv_verified_home_card_featured_item);
            AbstractC3292y.h(findViewById3, "findViewById(...)");
            TextView textView4 = (TextView) findViewById3;
            this.f3683l = textView4;
            View findViewById4 = itemView.findViewById(R.id.ll_progress_home_card_featured_item);
            AbstractC3292y.h(findViewById4, "findViewById(...)");
            this.f3684m = (LinearLayout) findViewById4;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            textView2.setTypeface(aVar.v());
            textView3.setTypeface(aVar.v());
            textView4.setTypeface(aVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(a aVar, C2043h c2043h, int i8, View view) {
            aVar.f3674c.a(c2043h, i8);
            return true;
        }

        public final void m(final C2043h app, int i8, final int i9) {
            AbstractC3292y.i(app, "app");
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(-2, -2), this.f3675d, i8, 20));
            String c02 = app.c0();
            if (c02 != null && c02.length() != 0) {
                com.squareup.picasso.s.h().l(app.g0()).n(UptodownApp.f29249C.e0(this.f3675d)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f3676e);
            } else {
                this.f3676e.setImageDrawable(ContextCompat.getDrawable(this.f3675d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3292y.h(itemView, "itemView");
            c(itemView, this.f3673b, app);
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: I4.n
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean n8;
                    n8 = C1236o.a.n(C1236o.a.this, app, i9, view);
                    return n8;
                }
            });
            TextView tvName = this.f3679h;
            AbstractC3292y.h(tvName, "tvName");
            TextView tvDesc = this.f3680i;
            AbstractC3292y.h(tvDesc, "tvDesc");
            i(app, tvName, tvDesc);
            ImageView ivIcon = this.f3677f;
            AbstractC3292y.h(ivIcon, "ivIcon");
            h(ivIcon, app.k0());
            ProgressBar progressBar = this.f3678g;
            ImageView ivIcon2 = this.f3677f;
            AbstractC3292y.h(ivIcon2, "ivIcon");
            TextView tvDesc2 = this.f3680i;
            AbstractC3292y.h(tvDesc2, "tvDesc");
            e(app, progressBar, ivIcon2, tvDesc2, this.f3682k, this.f3681j, this.f3684m);
        }
    }

    /* renamed from: I4.o$b */
    /* loaded from: classes5.dex */
    public final class b extends AbstractC4026h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1980d f3686b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1977a f3687c;

        /* renamed from: d, reason: collision with root package name */
        private Context f3688d;

        /* renamed from: e, reason: collision with root package name */
        private final ImageView f3689e;

        /* renamed from: f, reason: collision with root package name */
        private final ProgressBar f3690f;

        /* renamed from: g, reason: collision with root package name */
        private final ImageView f3691g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f3692h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f3693i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f3694j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3695k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f3696l;

        /* renamed from: m, reason: collision with root package name */
        private final LinearLayout f3697m;

        /* renamed from: n, reason: collision with root package name */
        private final TextView f3698n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C1236o f3699o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1236o c1236o, View itemView, InterfaceC1980d listener, InterfaceC1977a actionsClickListener, Context context) {
            super(itemView, context);
            AbstractC3292y.i(itemView, "itemView");
            AbstractC3292y.i(listener, "listener");
            AbstractC3292y.i(actionsClickListener, "actionsClickListener");
            AbstractC3292y.i(context, "context");
            this.f3699o = c1236o;
            this.f3686b = listener;
            this.f3687c = actionsClickListener;
            this.f3688d = context;
            this.f3689e = (ImageView) itemView.findViewById(R.id.iv_home_top_card_featured_item);
            View findViewById = itemView.findViewById(R.id.pb_progress_home_card_top_featured_item);
            AbstractC3292y.h(findViewById, "findViewById(...)");
            this.f3690f = (ProgressBar) findViewById;
            this.f3691g = (ImageView) itemView.findViewById(R.id.iv_logo_home_card_top_featured_item);
            TextView textView = (TextView) itemView.findViewById(R.id.tv_name_home_card_top_featured_item);
            this.f3692h = textView;
            TextView textView2 = (TextView) itemView.findViewById(R.id.tv_number_card_top_featured_download);
            this.f3693i = textView2;
            TextView textView3 = (TextView) itemView.findViewById(R.id.tv_desc_home_card_top_featured_item);
            this.f3694j = textView3;
            View findViewById2 = itemView.findViewById(R.id.tv_progress_home_card_top_featured_item);
            AbstractC3292y.h(findViewById2, "findViewById(...)");
            TextView textView4 = (TextView) findViewById2;
            this.f3695k = textView4;
            View findViewById3 = itemView.findViewById(R.id.tv_verified_home_card_top_featured_item);
            AbstractC3292y.h(findViewById3, "findViewById(...)");
            TextView textView5 = (TextView) findViewById3;
            this.f3696l = textView5;
            View findViewById4 = itemView.findViewById(R.id.ll_progress_home_card_top_featured_item);
            AbstractC3292y.h(findViewById4, "findViewById(...)");
            this.f3697m = (LinearLayout) findViewById4;
            this.f3698n = (TextView) itemView.findViewById(R.id.tv_status_home_card_top_featured_item);
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            textView2.setTypeface(aVar.u());
            textView3.setTypeface(aVar.v());
            textView4.setTypeface(aVar.v());
            textView5.setTypeface(aVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(b bVar, C2043h c2043h, int i8, View view) {
            bVar.f3687c.a(c2043h, i8);
            return true;
        }

        public final void m(final C2043h app, int i8, final int i9, boolean z8) {
            AbstractC3292y.i(app, "app");
            int dimension = (int) this.f3688d.getResources().getDimension(R.dimen.margin_m);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (z8) {
                layoutParams.setMargins(dimension, 0, dimension, dimension);
            } else {
                layoutParams.setMargins(dimension, 0, 0, dimension);
            }
            ViewGroup.LayoutParams layoutParams2 = this.f3689e.getLayoutParams();
            AbstractC3292y.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (i8 >= 10) {
                marginLayoutParams.setMarginStart((int) this.f3688d.getResources().getDimension(R.dimen.top_card_featured_margin_index_ten));
            } else {
                marginLayoutParams.setMarginStart(0);
            }
            this.f3689e.setLayoutParams(marginLayoutParams);
            this.itemView.setLayoutParams(layoutParams);
            this.f3693i.setText(String.valueOf(i8));
            String c02 = app.c0();
            if (c02 != null && c02.length() != 0) {
                com.squareup.picasso.s.h().l(app.g0()).n(UptodownApp.f29249C.e0(this.f3688d)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f3689e);
            } else {
                this.f3689e.setImageDrawable(ContextCompat.getDrawable(this.f3688d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3292y.h(itemView, "itemView");
            c(itemView, this.f3686b, app);
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: I4.p
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean n8;
                    n8 = C1236o.b.n(C1236o.b.this, app, i9, view);
                    return n8;
                }
            });
            TextView tvName = this.f3692h;
            AbstractC3292y.h(tvName, "tvName");
            TextView tvDesc = this.f3694j;
            AbstractC3292y.h(tvDesc, "tvDesc");
            i(app, tvName, tvDesc);
            ImageView ivIcon = this.f3691g;
            AbstractC3292y.h(ivIcon, "ivIcon");
            h(ivIcon, app.k0());
            ProgressBar progressBar = this.f3690f;
            ImageView ivIcon2 = this.f3691g;
            AbstractC3292y.h(ivIcon2, "ivIcon");
            TextView tvDesc2 = this.f3694j;
            AbstractC3292y.h(tvDesc2, "tvDesc");
            e(app, progressBar, ivIcon2, tvDesc2, this.f3695k, this.f3698n, this.f3697m);
        }
    }

    public C1236o(InterfaceC1980d listener, InterfaceC1977a actionsClickListener, Context context) {
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f3668a = listener;
        this.f3669b = actionsClickListener;
        this.f3670c = context;
        this.f3671d = new ArrayList();
    }

    public final ArrayList a() {
        return this.f3671d;
    }

    public final void b(ArrayList appList, boolean z8) {
        AbstractC3292y.i(appList, "appList");
        this.f3672e = z8;
        this.f3671d = appList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3671d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3292y.i(holder, "holder");
        if (holder instanceof a) {
            Object obj = this.f3671d.get(i8);
            AbstractC3292y.h(obj, "get(...)");
            ((a) holder).m((C2043h) obj, i8 + 1, i8);
        } else if (holder instanceof b) {
            int i9 = i8 + 1;
            if (AbstractC3292y.d(this.f3671d.get(i8), AbstractC1435t.y0(this.f3671d))) {
                Object obj2 = this.f3671d.get(i8);
                AbstractC3292y.h(obj2, "get(...)");
                ((b) holder).m((C2043h) obj2, i9, i8, true);
            } else {
                Object obj3 = this.f3671d.get(i8);
                AbstractC3292y.h(obj3, "get(...)");
                ((b) holder).m((C2043h) obj3, i9, i8, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        if (this.f3672e) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card_top_featured_item, parent, false);
            AbstractC3292y.f(inflate);
            return new b(this, inflate, this.f3668a, this.f3669b, this.f3670c);
        }
        View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card_featured_item, parent, false);
        AbstractC3292y.f(inflate2);
        return new a(this, inflate2, this.f3668a, this.f3669b, this.f3670c);
    }
}
