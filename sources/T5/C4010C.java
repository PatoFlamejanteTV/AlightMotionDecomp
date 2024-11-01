package t5;

import I4.C1231j;
import I4.C1234m;
import R5.AbstractC1435t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import c5.C2046k;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import s5.C3972f;

/* renamed from: t5.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4010C extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private b5.s f39633a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1977a f39634b;

    /* renamed from: c, reason: collision with root package name */
    private Context f39635c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f39636d;

    /* renamed from: e, reason: collision with root package name */
    private C1234m f39637e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayoutManager f39638f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f39639g;

    /* renamed from: h, reason: collision with root package name */
    private final C3972f f39640h;

    /* renamed from: i, reason: collision with root package name */
    private int f39641i;

    /* renamed from: t5.C$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            AbstractC3292y.i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i8);
            C4010C c4010c = C4010C.this;
            c4010c.f39641i = c4010c.f39638f.findFirstCompletelyVisibleItemPosition();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4010C(View itemView, b5.s sVar, InterfaceC1977a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f39633a = sVar;
        this.f39634b = actionsClickListener;
        this.f39635c = context;
        View findViewById = itemView.findViewById(R.id.rv_home_features);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39636d = (RecyclerView) findViewById;
        this.f39637e = new C1234m(this.f39633a, actionsClickListener, this.f39635c);
        this.f39638f = new LinearLayoutManager(itemView.getContext(), 0, false);
        View findViewById2 = itemView.findViewById(R.id.ll_categories);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39639g = (LinearLayout) findViewById2;
        C3972f c3972f = new C3972f();
        this.f39640h = c3972f;
        this.f39641i = 102;
        c3972f.attachToRecyclerView(this.f39636d);
        this.f39636d.setLayoutManager(this.f39638f);
        this.f39636d.setAdapter(this.f39637e);
        this.f39636d.addOnScrollListener(new a());
    }

    private final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            final C2046k c2046k = (C2046k) next;
            View inflate = LayoutInflater.from(this.f39635c).inflate(R.layout.home_header_category, (ViewGroup) this.f39639g, false);
            AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setTypeface(J4.j.f4395g.u());
            textView.setText(c2046k.h());
            if (AbstractC3292y.d(c2046k, AbstractC1435t.y0(arrayList))) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins((int) this.f39635c.getResources().getDimension(R.dimen.margin_m), 0, (int) this.f39635c.getResources().getDimension(R.dimen.margin_m), 0);
                textView.setLayoutParams(layoutParams);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: t5.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4010C.f(C4010C.this, c2046k, view);
                }
            });
            this.f39639g.addView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C4010C c4010c, C2046k c2046k, View view) {
        b5.s sVar = c4010c.f39633a;
        if (sVar != null) {
            sVar.c(c2046k);
        }
    }

    public final void d(C1231j.b homeHeader) {
        AbstractC3292y.i(homeHeader, "homeHeader");
        if (!homeHeader.b().isEmpty()) {
            this.f39636d.scrollToPosition(this.f39641i);
            this.f39636d.smoothScrollBy(1, 0);
            this.f39637e.c(homeHeader.b());
        }
        if (this.f39639g.getChildCount() == 0) {
            e(homeHeader.a());
        }
    }
}
