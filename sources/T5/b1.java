package t5;

import J4.j;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import c5.T;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;

/* loaded from: classes5.dex */
public final class b1 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final b5.G f39840a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f39841b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f39842c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f39843d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f39844e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f39845f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f39846g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f39847h;

    /* renamed from: i, reason: collision with root package name */
    private final LinearLayout f39848i;

    /* renamed from: j, reason: collision with root package name */
    private final LinearLayout f39849j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f39850k;

    /* renamed from: l, reason: collision with root package name */
    private final ImageView f39851l;

    /* renamed from: m, reason: collision with root package name */
    private final ImageView f39852m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f39853n;

    /* renamed from: o, reason: collision with root package name */
    private final ImageView f39854o;

    /* renamed from: p, reason: collision with root package name */
    private final ImageView f39855p;

    /* renamed from: q, reason: collision with root package name */
    private final ImageView f39856q;

    /* loaded from: classes5.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b1.this.f39845f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (s5.u.a(b1.this.f39845f)) {
                b1.this.f39846g.setVisibility(0);
                b1.this.f39846g.setTypeface(J4.j.f4395g.u());
                return true;
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(View itemView, b5.G listener, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(context, "context");
        this.f39840a = listener;
        this.f39841b = context;
        View findViewById = itemView.findViewById(R.id.tv_username_review);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.f39842c = textView;
        View findViewById2 = itemView.findViewById(R.id.iv_avatar_review);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39843d = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_date_review);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        TextView textView2 = (TextView) findViewById3;
        this.f39844e = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_body_review);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        TextView textView3 = (TextView) findViewById4;
        this.f39845f = textView3;
        View findViewById5 = itemView.findViewById(R.id.tv_show_more_review);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f39846g = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_likes_counter_review);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        TextView textView4 = (TextView) findViewById6;
        this.f39847h = textView4;
        View findViewById7 = itemView.findViewById(R.id.ll_likes_review);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        this.f39848i = (LinearLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.ll_reviews_counter_review);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        this.f39849j = (LinearLayout) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_reviews_counter_review);
        AbstractC3292y.h(findViewById9, "findViewById(...)");
        TextView textView5 = (TextView) findViewById9;
        this.f39850k = textView5;
        View findViewById10 = itemView.findViewById(R.id.iv_likes_counter_review);
        AbstractC3292y.h(findViewById10, "findViewById(...)");
        this.f39851l = (ImageView) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.iv_star1_review);
        AbstractC3292y.h(findViewById11, "findViewById(...)");
        this.f39852m = (ImageView) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.iv_star2_review);
        AbstractC3292y.h(findViewById12, "findViewById(...)");
        this.f39853n = (ImageView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.iv_star3_review);
        AbstractC3292y.h(findViewById13, "findViewById(...)");
        this.f39854o = (ImageView) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.iv_star4_review);
        AbstractC3292y.h(findViewById14, "findViewById(...)");
        this.f39855p = (ImageView) findViewById14;
        View findViewById15 = itemView.findViewById(R.id.iv_star5_review);
        AbstractC3292y.h(findViewById15, "findViewById(...)");
        this.f39856q = (ImageView) findViewById15;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.v());
        textView4.setTypeface(aVar.v());
        textView5.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(b1 b1Var, int i8, View view) {
        b1Var.f39840a.c(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(b1 b1Var, int i8, View view) {
        b1Var.f39840a.c(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(b1 b1Var, c5.M m8, int i8, View view) {
        s5.k.a(b1Var.f39841b, b1Var.f39851l);
        if (!C3770C.f37260a.h(m8.l())) {
            b1Var.f39840a.a(i8);
            b1Var.f39847h.setText(String.valueOf(m8.p() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(b1 b1Var, int i8, View view) {
        b1Var.f39840a.b(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b1 b1Var, View view) {
        if (b1Var.f39845f.getMaxLines() == Integer.MAX_VALUE) {
            b1Var.f39845f.setMaxLines(4);
            b1Var.f39846g.setText(b1Var.f39841b.getString(R.string.read_more_desc_app_detail));
        } else {
            b1Var.f39845f.setMaxLines(Integer.MAX_VALUE);
            b1Var.f39846g.setText(b1Var.f39841b.getString(R.string.read_less_desc_app_detail));
        }
    }

    public final void h(final c5.M item, final int i8) {
        CharSequence charSequence;
        AbstractC3292y.i(item, "item");
        String f8 = item.f();
        if (f8 != null && f8.length() != 0) {
            this.f39842c.setText(item.f());
        }
        T.b bVar = c5.T.f15689k;
        if (bVar.c(item.i()) != null) {
            com.squareup.picasso.s.h().l(bVar.c(item.i())).n(UptodownApp.f29249C.f0(this.f39841b)).i(this.f39843d);
        } else {
            com.squareup.picasso.s.h().j(R.drawable.vector_user_default).n(UptodownApp.f29249C.f0(this.f39841b)).i(this.f39843d);
        }
        if (item.w() != null) {
            this.f39844e.setText(item.w());
        }
        Spanned v8 = item.v();
        if (v8 != null && v8.length() != 0) {
            this.f39845f.setText(item.v());
            this.f39845f.setVisibility(0);
            this.f39848i.setVisibility(0);
            this.f39849j.setVisibility(0);
        } else {
            this.f39845f.setVisibility(8);
            this.f39848i.setVisibility(8);
            this.f39849j.setVisibility(8);
        }
        this.f39847h.setText(String.valueOf(item.p()));
        if (C3770C.f37260a.h(item.l())) {
            this.f39851l.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_heart_red));
        } else {
            this.f39851l.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_heart));
        }
        if (item.a() == 0) {
            this.f39850k.setText(this.f39841b.getString(R.string.reply));
        } else if (item.a() == 1) {
            TextView textView = this.f39850k;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
            String string = this.f39841b.getString(R.string.replies_counter_single);
            AbstractC3292y.h(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3292y.h(format, "format(...)");
            textView.setText(format);
        } else if (item.a() > 1) {
            TextView textView2 = this.f39850k;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34578a;
            String string2 = this.f39841b.getString(R.string.replies_counter_multiple);
            AbstractC3292y.h(string2, "getString(...)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(item.a())}, 1));
            AbstractC3292y.h(format2, "format(...)");
            textView2.setText(format2);
        }
        this.f39842c.setOnClickListener(new View.OnClickListener() { // from class: t5.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.i(b1.this, i8, view);
            }
        });
        this.f39843d.setOnClickListener(new View.OnClickListener() { // from class: t5.X0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.j(b1.this, i8, view);
            }
        });
        this.f39848i.setOnClickListener(new View.OnClickListener() { // from class: t5.Y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.k(b1.this, item, i8, view);
            }
        });
        this.f39849j.setOnClickListener(new View.OnClickListener() { // from class: t5.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.l(b1.this, i8, view);
            }
        });
        TextView textView3 = this.f39845f;
        Spanned v9 = item.v();
        if (v9 != null) {
            charSequence = l6.n.M0(v9);
        } else {
            charSequence = null;
        }
        textView3.setText(charSequence);
        this.f39845f.getViewTreeObserver().addOnPreDrawListener(new a());
        this.f39846g.setOnClickListener(new View.OnClickListener() { // from class: t5.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.m(b1.this, view);
            }
        });
        this.f39852m.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_star_on));
        this.f39853n.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_star_off));
        this.f39854o.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_star_off));
        this.f39855p.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_star_off));
        this.f39856q.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_star_off));
        if (item.s() >= 2) {
            this.f39853n.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_star_on));
        }
        if (item.s() >= 3) {
            this.f39854o.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_star_on));
        }
        if (item.s() >= 4) {
            this.f39855p.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_star_on));
        }
        if (item.s() == 5) {
            this.f39856q.setImageDrawable(ContextCompat.getDrawable(this.f39841b, R.drawable.vector_star_on));
        }
    }
}
