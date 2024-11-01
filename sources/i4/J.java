package I4;

import I4.J;
import J4.j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import b5.InterfaceC1980d;
import c5.C2043h;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import t5.AbstractC4026h;

/* loaded from: classes5.dex */
public final class J extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1980d f3461a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1977a f3462b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3463c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3464d;

    /* loaded from: classes5.dex */
    public final class a extends AbstractC4026h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1980d f3465b;

        /* renamed from: c, reason: collision with root package name */
        private Context f3466c;

        /* renamed from: d, reason: collision with root package name */
        private final ImageView f3467d;

        /* renamed from: e, reason: collision with root package name */
        private final ProgressBar f3468e;

        /* renamed from: f, reason: collision with root package name */
        private final TextView f3469f;

        /* renamed from: g, reason: collision with root package name */
        private final TextView f3470g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f3471h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f3472i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f3473j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3474k;

        /* renamed from: l, reason: collision with root package name */
        private final LinearLayout f3475l;

        /* renamed from: m, reason: collision with root package name */
        private final RelativeLayout f3476m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ J f3477n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j8, View itemView, InterfaceC1980d listener, Context context) {
            super(itemView, context);
            AbstractC3292y.i(itemView, "itemView");
            AbstractC3292y.i(listener, "listener");
            AbstractC3292y.i(context, "context");
            this.f3477n = j8;
            this.f3465b = listener;
            this.f3466c = context;
            View findViewById = itemView.findViewById(R.id.iv_logo_card_top_download);
            AbstractC3292y.h(findViewById, "findViewById(...)");
            this.f3467d = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.pb_progress_card_top_download);
            AbstractC3292y.h(findViewById2, "findViewById(...)");
            this.f3468e = (ProgressBar) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.tv_titulo_card_top_download);
            AbstractC3292y.h(findViewById3, "findViewById(...)");
            TextView textView = (TextView) findViewById3;
            this.f3469f = textView;
            View findViewById4 = itemView.findViewById(R.id.tv_number_card_top_download);
            AbstractC3292y.h(findViewById4, "findViewById(...)");
            TextView textView2 = (TextView) findViewById4;
            this.f3470g = textView2;
            View findViewById5 = itemView.findViewById(R.id.tv_resumen_card_top_download);
            AbstractC3292y.h(findViewById5, "findViewById(...)");
            TextView textView3 = (TextView) findViewById5;
            this.f3471h = textView3;
            View findViewById6 = itemView.findViewById(R.id.tv_status_card_top_download);
            AbstractC3292y.h(findViewById6, "findViewById(...)");
            TextView textView4 = (TextView) findViewById6;
            this.f3472i = textView4;
            View findViewById7 = itemView.findViewById(R.id.tv_progress_card_top_download);
            AbstractC3292y.h(findViewById7, "findViewById(...)");
            TextView textView5 = (TextView) findViewById7;
            this.f3473j = textView5;
            View findViewById8 = itemView.findViewById(R.id.tv_verified_card_top_download);
            AbstractC3292y.h(findViewById8, "findViewById(...)");
            TextView textView6 = (TextView) findViewById8;
            this.f3474k = textView6;
            View findViewById9 = itemView.findViewById(R.id.ll_progress_card_top_download);
            AbstractC3292y.h(findViewById9, "findViewById(...)");
            this.f3475l = (LinearLayout) findViewById9;
            View findViewById10 = itemView.findViewById(R.id.rl_card_details_top_download);
            AbstractC3292y.h(findViewById10, "findViewById(...)");
            this.f3476m = (RelativeLayout) findViewById10;
            j.a aVar = J4.j.f4395g;
            textView2.setTypeface(aVar.u());
            textView.setTypeface(aVar.u());
            textView3.setTypeface(aVar.v());
            textView4.setTypeface(aVar.v());
            textView5.setTypeface(aVar.v());
            textView6.setTypeface(aVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(J j8, C2043h c2043h, int i8, View view) {
            j8.f3462b.a(c2043h, i8);
            return true;
        }

        public final void m(final C2043h app, int i8, final int i9) {
            AbstractC3292y.i(app, "app");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (i8 >= 10) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginStart((int) this.f3466c.getResources().getDimension(R.dimen.top_card_margin_index_ten));
                this.f3476m.setLayoutParams(layoutParams2);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.setMarginStart((int) this.f3466c.getResources().getDimension(R.dimen.top_download_horizontal_card_margin));
                this.f3476m.setLayoutParams(layoutParams3);
            }
            this.itemView.setLayoutParams(b(layoutParams, this.f3466c, i8, 20));
            this.f3470g.setText(String.valueOf(i8));
            View itemView = this.itemView;
            AbstractC3292y.h(itemView, "itemView");
            c(itemView, this.f3465b, app);
            View view = this.itemView;
            final J j8 = this.f3477n;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: I4.I
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean n8;
                    n8 = J.a.n(J.this, app, i9, view2);
                    return n8;
                }
            });
            i(app, this.f3469f, this.f3471h);
            h(this.f3467d, app.j0());
            e(app, this.f3468e, this.f3467d, this.f3471h, this.f3473j, this.f3472i, this.f3475l);
        }
    }

    public J(InterfaceC1980d listener, InterfaceC1977a actionsClickListener, Context context) {
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f3461a = listener;
        this.f3462b = actionsClickListener;
        this.f3463c = context;
        this.f3464d = new ArrayList();
    }

    public final ArrayList b() {
        return this.f3464d;
    }

    public final void c(ArrayList appList) {
        AbstractC3292y.i(appList, "appList");
        ArrayList arrayList = this.f3464d;
        arrayList.clear();
        arrayList.addAll(appList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3464d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3292y.i(holder, "holder");
        Object obj = this.f3464d.get(i8);
        AbstractC3292y.h(obj, "get(...)");
        ((a) holder).m((C2043h) obj, i8 + 1, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_top_download, parent, false);
        AbstractC3292y.f(inflate);
        return new a(this, inflate, this.f3461a, this.f3463c);
    }
}
