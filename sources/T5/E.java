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
public final class E extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private b5.s f39665a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1977a f39666b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f39667c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f39668d;

    /* renamed from: e, reason: collision with root package name */
    private RecyclerView f39669e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayoutManager f39670f;

    /* renamed from: g, reason: collision with root package name */
    private final I4.J f39671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(View itemView, b5.s listener, InterfaceC1977a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f39665a = listener;
        this.f39666b = actionsClickListener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39667c = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39668d = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39669e = (RecyclerView) findViewById3;
        this.f39670f = new LinearLayoutManager(itemView.getContext(), 0, false);
        I4.J j8 = new I4.J(this.f39665a, actionsClickListener, context);
        this.f39671g = j8;
        this.f39668d.setTypeface(J4.j.f4395g.u());
        this.f39669e.setLayoutManager(this.f39670f);
        this.f39669e.setItemAnimator(null);
        this.f39669e.setAdapter(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(E e8, c5.P p8, View view) {
        e8.f39665a.b(p8);
    }

    public final void b(final c5.P topByCategory) {
        AbstractC3292y.i(topByCategory, "topByCategory");
        this.f39667c.setOnClickListener(new View.OnClickListener() { // from class: t5.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E.c(E.this, topByCategory, view);
            }
        });
        this.f39668d.setText(topByCategory.b().h());
        this.f39671g.c(topByCategory.a());
    }

    public final I4.J d() {
        return this.f39671g;
    }
}
