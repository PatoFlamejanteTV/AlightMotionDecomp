package t5;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class G extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private b5.s f39692a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f39693b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f39694c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f39695d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayoutManager f39696e;

    /* renamed from: f, reason: collision with root package name */
    private final I4.L f39697f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(View itemView, b5.s listener, InterfaceC1977a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f39692a = listener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39693b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39694c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39695d = (RecyclerView) findViewById3;
        this.f39696e = new LinearLayoutManager(itemView.getContext(), 0, false);
        I4.L l8 = new I4.L(this.f39692a, actionsClickListener, context, 20);
        this.f39697f = l8;
        this.f39694c.setTypeface(J4.j.f4395g.u());
        this.f39695d.setItemAnimator(null);
        this.f39695d.setLayoutManager(this.f39696e);
        this.f39695d.setAdapter(l8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(G g8, c5.P p8, View view) {
        g8.f39692a.b(p8);
    }

    public final void b(final c5.P topByCategory) {
        AbstractC3292y.i(topByCategory, "topByCategory");
        if (!topByCategory.a().isEmpty()) {
            this.f39693b.setOnClickListener(new View.OnClickListener() { // from class: t5.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    G.c(G.this, topByCategory, view);
                }
            });
            this.f39694c.setText(topByCategory.b().h());
            this.f39697f.d(topByCategory.a());
            return;
        }
        this.itemView.setVisibility(8);
    }

    public final I4.L d() {
        return this.f39697f;
    }
}
