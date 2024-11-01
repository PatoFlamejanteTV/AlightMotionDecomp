package a8;

import S7.p;
import a8.m;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class m extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public List f14207a;

    /* renamed from: b, reason: collision with root package name */
    public a f14208b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f14209c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f14210d;

    /* renamed from: e, reason: collision with root package name */
    public Typeface f14211e;

    /* loaded from: classes5.dex */
    public interface a {
        void f(p pVar);
    }

    /* loaded from: classes5.dex */
    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final a f14212a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f14213b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f14214c;

        /* renamed from: d, reason: collision with root package name */
        public Typeface f14215d;

        /* renamed from: e, reason: collision with root package name */
        public final ConstraintLayout f14216e;

        /* renamed from: f, reason: collision with root package name */
        public final ImageView f14217f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f14218g;

        /* renamed from: h, reason: collision with root package name */
        public final TextView f14219h;

        /* renamed from: i, reason: collision with root package name */
        public final View f14220i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View rootView, a listener, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3292y.i(rootView, "rootView");
            AbstractC3292y.i(listener, "listener");
            this.f14212a = listener;
            this.f14213b = num;
            this.f14214c = num2;
            this.f14215d = typeface;
            View findViewById = rootView.findViewById(M1.b.f6015o);
            AbstractC3292y.h(findViewById, "rootView.findViewById(R.id.cl_item_container)");
            this.f14216e = (ConstraintLayout) findViewById;
            View findViewById2 = rootView.findViewById(M1.b.f5929E);
            AbstractC3292y.h(findViewById2, "rootView.findViewById(R.id.iv_stack_more_info)");
            this.f14217f = (ImageView) findViewById2;
            View findViewById3 = rootView.findViewById(M1.b.f6011m1);
            AbstractC3292y.h(findViewById3, "rootView.findViewById(R.….tv_stack_selected_state)");
            this.f14218g = (TextView) findViewById3;
            View findViewById4 = rootView.findViewById(M1.b.f6008l1);
            AbstractC3292y.h(findViewById4, "rootView.findViewById(R.id.tv_stack_name)");
            this.f14219h = (TextView) findViewById4;
            View findViewById5 = rootView.findViewById(M1.b.f5937I);
            AbstractC3292y.h(findViewById5, "rootView.findViewById(R.id.line_item)");
            this.f14220i = findViewById5;
        }

        public static final void b(b this$0, p item, View view) {
            AbstractC3292y.i(this$0, "this$0");
            AbstractC3292y.i(item, "$item");
            this$0.f14212a.f(item);
        }

        public final void a(final p item) {
            AbstractC3292y.i(item, "item");
            this.f14219h.setText(item.f9945b);
            this.f14218g.setText(item.f9946c);
            Integer num = this.f14213b;
            if (num != null) {
                int intValue = num.intValue();
                this.f14219h.setTextColor(intValue);
                this.f14218g.setTextColor(intValue);
                this.f14217f.setColorFilter(intValue);
            }
            Integer num2 = this.f14214c;
            if (num2 != null) {
                this.f14220i.setBackgroundColor(num2.intValue());
            }
            Typeface typeface = this.f14215d;
            if (typeface != null) {
                this.f14219h.setTypeface(typeface);
                this.f14218g.setTypeface(typeface);
            }
            this.f14216e.setOnClickListener(new View.OnClickListener() { // from class: a8.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m.b.b(m.b.this, item, view);
                }
            });
        }
    }

    public m(List items, a listener, Integer num, Integer num2, Typeface typeface) {
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(listener, "listener");
        this.f14207a = items;
        this.f14208b = listener;
        this.f14209c = num;
        this.f14210d = num2;
        this.f14211e = typeface;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14207a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        b holder = (b) viewHolder;
        AbstractC3292y.i(holder, "holder");
        holder.a((p) this.f14207a.get(i8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(M1.c.f6059q, parent, false);
        AbstractC3292y.h(view, "view");
        return new b(view, this.f14208b, this.f14209c, this.f14210d, this.f14211e);
    }
}
