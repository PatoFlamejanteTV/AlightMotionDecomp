package t5;

import R5.AbstractC1435t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c5.C2046k;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4051u extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private b5.s f40015a;

    /* renamed from: b, reason: collision with root package name */
    private Context f40016b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f40017c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f40018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4051u(View itemView, b5.s listener, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(context, "context");
        this.f40015a = listener;
        this.f40016b = context;
        View findViewById = itemView.findViewById(R.id.tv_floating_categories);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f40017c = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.ll_floating_categories);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f40018d = (LinearLayout) findViewById2;
        this.f40017c.setTypeface(J4.j.f4395g.u());
    }

    private final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            final C2046k c2046k = (C2046k) next;
            View inflate = LayoutInflater.from(this.f40016b).inflate(R.layout.home_header_category, (ViewGroup) this.f40018d, false);
            AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setTypeface(J4.j.f4395g.u());
            textView.setText(c2046k.h());
            if (AbstractC3292y.d(c2046k, AbstractC1435t.y0(arrayList))) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins((int) this.f40016b.getResources().getDimension(R.dimen.margin_m), 0, (int) this.f40016b.getResources().getDimension(R.dimen.margin_m), 0);
                textView.setLayoutParams(layoutParams);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: t5.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4051u.d(C4051u.this, c2046k, view);
                }
            });
            this.f40018d.addView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4051u c4051u, C2046k c2046k, View view) {
        c4051u.f40015a.c(c2046k);
    }

    public final void b(ArrayList floatingCategories) {
        AbstractC3292y.i(floatingCategories, "floatingCategories");
        this.f40017c.setText(this.f40016b.getString(R.string.it_may_interest_you));
        if (this.f40018d.getChildCount() == 0) {
            c(floatingCategories);
        }
    }
}
