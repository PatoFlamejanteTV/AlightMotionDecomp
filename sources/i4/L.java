package I4;

import I4.L;
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
public final class L extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1980d f3481a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1977a f3482b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3483c;

    /* renamed from: d, reason: collision with root package name */
    private int f3484d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f3485e;

    /* loaded from: classes5.dex */
    public final class a extends AbstractC4026h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1980d f3486b;

        /* renamed from: c, reason: collision with root package name */
        private Context f3487c;

        /* renamed from: d, reason: collision with root package name */
        private final ImageView f3488d;

        /* renamed from: e, reason: collision with root package name */
        private final ProgressBar f3489e;

        /* renamed from: f, reason: collision with root package name */
        private final TextView f3490f;

        /* renamed from: g, reason: collision with root package name */
        private final TextView f3491g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f3492h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f3493i;

        /* renamed from: j, reason: collision with root package name */
        private final LinearLayout f3494j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3495k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ L f3496l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L l8, View itemView, InterfaceC1980d listener, Context context) {
            super(itemView, context);
            AbstractC3292y.i(itemView, "itemView");
            AbstractC3292y.i(listener, "listener");
            AbstractC3292y.i(context, "context");
            this.f3496l = l8;
            this.f3486b = listener;
            this.f3487c = context;
            View findViewById = itemView.findViewById(R.id.iv_logo_card);
            AbstractC3292y.h(findViewById, "findViewById(...)");
            this.f3488d = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.pb_progress_card);
            AbstractC3292y.h(findViewById2, "findViewById(...)");
            this.f3489e = (ProgressBar) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.tv_titulo_card);
            AbstractC3292y.h(findViewById3, "findViewById(...)");
            TextView textView = (TextView) findViewById3;
            this.f3490f = textView;
            View findViewById4 = itemView.findViewById(R.id.tv_resumen_card);
            AbstractC3292y.h(findViewById4, "findViewById(...)");
            TextView textView2 = (TextView) findViewById4;
            this.f3491g = textView2;
            View findViewById5 = itemView.findViewById(R.id.tv_progress_card);
            AbstractC3292y.h(findViewById5, "findViewById(...)");
            TextView textView3 = (TextView) findViewById5;
            this.f3492h = textView3;
            View findViewById6 = itemView.findViewById(R.id.tv_verified_card);
            AbstractC3292y.h(findViewById6, "findViewById(...)");
            TextView textView4 = (TextView) findViewById6;
            this.f3493i = textView4;
            View findViewById7 = itemView.findViewById(R.id.ll_progress_card);
            AbstractC3292y.h(findViewById7, "findViewById(...)");
            this.f3494j = (LinearLayout) findViewById7;
            View findViewById8 = itemView.findViewById(R.id.tv_status_card);
            AbstractC3292y.h(findViewById8, "findViewById(...)");
            TextView textView5 = (TextView) findViewById8;
            this.f3495k = textView5;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            textView2.setTypeface(aVar.v());
            textView5.setTypeface(aVar.v());
            textView3.setTypeface(aVar.v());
            textView4.setTypeface(aVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(L l8, C2043h c2043h, int i8, View view) {
            l8.f3482b.a(c2043h, i8);
            return true;
        }

        public final void m(final C2043h app, final int i8) {
            AbstractC3292y.i(app, "app");
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams((int) this.f3487c.getResources().getDimension(R.dimen.top_horizontal_card_width), -2), this.f3487c, i8, this.f3496l.f3484d));
            View itemView = this.itemView;
            AbstractC3292y.h(itemView, "itemView");
            c(itemView, this.f3486b, app);
            View view = this.itemView;
            final L l8 = this.f3496l;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: I4.K
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean n8;
                    n8 = L.a.n(L.this, app, i8, view2);
                    return n8;
                }
            });
            i(app, this.f3490f, this.f3491g);
            h(this.f3488d, app.j0());
            e(app, this.f3489e, this.f3488d, this.f3491g, this.f3492h, this.f3495k, this.f3494j);
        }
    }

    public L(InterfaceC1980d listener, InterfaceC1977a actionsClickListener, Context context, int i8) {
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f3481a = listener;
        this.f3482b = actionsClickListener;
        this.f3483c = context;
        this.f3484d = i8;
        this.f3485e = new ArrayList();
    }

    public final ArrayList c() {
        return this.f3485e;
    }

    public final void d(ArrayList appList) {
        AbstractC3292y.i(appList, "appList");
        ArrayList arrayList = this.f3485e;
        arrayList.clear();
        arrayList.addAll(appList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3485e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3292y.i(holder, "holder");
        Object obj = this.f3485e.get(i8);
        AbstractC3292y.h(obj, "get(...)");
        ((a) holder).m((C2043h) obj, i8 + 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        AbstractC3292y.f(inflate);
        return new a(this, inflate, this.f3481a, this.f3483c);
    }
}
