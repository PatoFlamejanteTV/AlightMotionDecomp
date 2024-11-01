package t5;

import I4.C1238q;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class I extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private b5.s f39706a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f39707b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f39708c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f39709d;

    /* renamed from: e, reason: collision with root package name */
    private GridLayoutManager f39710e;

    /* renamed from: f, reason: collision with root package name */
    private C1238q f39711f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(View itemView, b5.s listener, InterfaceC1977a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f39706a = listener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39707b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39708c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39709d = (RecyclerView) findViewById3;
        this.f39710e = new GridLayoutManager(itemView.getContext(), 3, 0, false);
        this.f39711f = new C1238q(this.f39706a, actionsClickListener, context);
        this.f39708c.setTypeface(J4.j.f4395g.u());
        this.f39709d.setLayoutManager(this.f39710e);
        this.f39709d.setAdapter(this.f39711f);
        this.f39709d.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(I i8, c5.P p8, View view) {
        i8.f39706a.b(p8);
    }

    public final void b(final c5.P topByCategory) {
        AbstractC3292y.i(topByCategory, "topByCategory");
        this.f39707b.setOnClickListener(new View.OnClickListener() { // from class: t5.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                I.c(I.this, topByCategory, view);
            }
        });
        this.f39708c.setText(topByCategory.b().h());
        this.f39711f.d(topByCategory.a());
    }

    public final C1238q d() {
        return this.f39711f;
    }
}
