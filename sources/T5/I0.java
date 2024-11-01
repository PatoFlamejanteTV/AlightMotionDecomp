package t5;

import I4.C1236o;
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
public final class I0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private b5.s f39712a;

    /* renamed from: b, reason: collision with root package name */
    private Context f39713b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f39714c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f39715d;

    /* renamed from: e, reason: collision with root package name */
    private final C1236o f39716e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView f39717f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayoutManager f39718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(View itemView, b5.s listener, InterfaceC1977a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f39712a = listener;
        this.f39713b = context;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39714c = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39715d = (TextView) findViewById2;
        C1236o c1236o = new C1236o(this.f39712a, actionsClickListener, this.f39713b);
        this.f39716e = c1236o;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39717f = (RecyclerView) findViewById3;
        this.f39718g = new LinearLayoutManager(itemView.getContext(), 0, false);
        this.f39715d.setTypeface(J4.j.f4395g.u());
        this.f39717f.setLayoutManager(this.f39718g);
        this.f39717f.setItemAnimator(null);
        this.f39717f.setAdapter(c1236o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(I0 i02, c5.P p8, View view) {
        i02.f39712a.b(p8);
    }

    public final void b(final c5.P topByCategory) {
        AbstractC3292y.i(topByCategory, "topByCategory");
        this.f39714c.setOnClickListener(new View.OnClickListener() { // from class: t5.H0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                I0.c(I0.this, topByCategory, view);
            }
        });
        this.f39715d.setText(topByCategory.b().h());
        if (AbstractC3292y.d(topByCategory.b().h(), this.f39713b.getResources().getString(R.string.top_downloads_title))) {
            this.f39716e.b(topByCategory.a(), true);
        } else {
            this.f39716e.b(topByCategory.a(), false);
        }
    }

    public final C1236o d() {
        return this.f39716e;
    }
}
