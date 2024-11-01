package t5;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import c5.C2043h;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import s5.C3972f;

/* loaded from: classes5.dex */
public final class d1 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private b5.s f39881a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f39882b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f39883c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f39884d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayoutManager f39885e;

    /* renamed from: f, reason: collision with root package name */
    private final I4.V f39886f;

    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            AbstractC3292y.i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i8);
            if (!d1.this.e().n()) {
                d1.this.e().w(true);
            }
            if (i8 == 0) {
                int findFirstCompletelyVisibleItemPosition = d1.this.f39885e.findFirstCompletelyVisibleItemPosition();
                int findLastCompletelyVisibleItemPosition = d1.this.f39885e.findLastCompletelyVisibleItemPosition();
                int m8 = d1.this.e().m();
                if (findLastCompletelyVisibleItemPosition == d1.this.f39885e.getItemCount() - 1 && findLastCompletelyVisibleItemPosition != d1.this.e().m()) {
                    d1.this.e().t(findLastCompletelyVisibleItemPosition);
                    ArrayList b12 = ((C2043h) d1.this.e().l().get(m8)).b1();
                    if (b12 != null && !b12.isEmpty()) {
                        d1.this.e().notifyItemChanged(m8);
                    }
                    ArrayList b13 = ((C2043h) d1.this.e().l().get(findLastCompletelyVisibleItemPosition)).b1();
                    if (b13 != null && !b13.isEmpty()) {
                        d1.this.e().notifyItemChanged(findLastCompletelyVisibleItemPosition);
                        return;
                    }
                    return;
                }
                if (findFirstCompletelyVisibleItemPosition != -1 && findFirstCompletelyVisibleItemPosition != d1.this.e().m()) {
                    d1.this.e().t(findFirstCompletelyVisibleItemPosition);
                    ArrayList b14 = ((C2043h) d1.this.e().l().get(m8)).b1();
                    if (b14 != null && !b14.isEmpty()) {
                        d1.this.e().notifyItemChanged(m8);
                    }
                    ArrayList b15 = ((C2043h) d1.this.e().l().get(findFirstCompletelyVisibleItemPosition)).b1();
                    if (b15 != null && !b15.isEmpty()) {
                        d1.this.e().notifyItemChanged(findFirstCompletelyVisibleItemPosition);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(View itemView, b5.s listener, InterfaceC1977a actionsClickListener, Context context, String fragmentName) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(fragmentName, "fragmentName");
        this.f39881a = listener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39882b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39883c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39884d = (RecyclerView) findViewById3;
        this.f39885e = new LinearLayoutManager(itemView.getContext(), 0, false);
        I4.V v8 = new I4.V(this.f39881a, actionsClickListener, context, fragmentName);
        this.f39886f = v8;
        new C3972f().attachToRecyclerView(this.f39884d);
        this.f39883c.setTypeface(J4.j.f4395g.u());
        this.f39884d.setLayoutManager(this.f39885e);
        this.f39884d.setItemAnimator(null);
        this.f39884d.setAdapter(v8);
        if (!SettingsPreferences.f30529b.K(context)) {
            this.f39884d.addOnScrollListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d1 d1Var, c5.P p8, View view) {
        d1Var.f39881a.b(p8);
    }

    public final void c(final c5.P topByCategory) {
        AbstractC3292y.i(topByCategory, "topByCategory");
        this.f39882b.setOnClickListener(new View.OnClickListener() { // from class: t5.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d1.d(d1.this, topByCategory, view);
            }
        });
        this.f39883c.setText(topByCategory.b().h());
        this.f39886f.u(topByCategory.a());
    }

    public final I4.V e() {
        return this.f39886f;
    }
}
