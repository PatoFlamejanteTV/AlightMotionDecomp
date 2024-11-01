package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1972A;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;
import q5.C3788m;

/* renamed from: t5.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4041o0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39965a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1972A f39966b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f39967c;

    /* renamed from: d, reason: collision with root package name */
    private final UsernameTextView f39968d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f39969e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f39970f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f39971g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f39972h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f39973i;

    /* renamed from: j, reason: collision with root package name */
    private final ImageView f39974j;

    /* renamed from: k, reason: collision with root package name */
    private final LinearLayout f39975k;

    /* renamed from: l, reason: collision with root package name */
    private final LinearLayout f39976l;

    /* renamed from: m, reason: collision with root package name */
    private final ImageView f39977m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f39978n;

    /* renamed from: o, reason: collision with root package name */
    private final ImageView f39979o;

    /* renamed from: p, reason: collision with root package name */
    private final ImageView f39980p;

    /* renamed from: q, reason: collision with root package name */
    private final ImageView f39981q;

    /* renamed from: r, reason: collision with root package name */
    private final ImageView f39982r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4041o0(View itemView, Context context, InterfaceC1972A listener) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f39965a = context;
        this.f39966b = listener;
        View findViewById = itemView.findViewById(R.id.iv_avatar_review);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39967c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_username_review);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        UsernameTextView usernameTextView = (UsernameTextView) findViewById2;
        this.f39968d = usernameTextView;
        View findViewById3 = itemView.findViewById(R.id.iv_author_verified_review);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39969e = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_date_review);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        TextView textView = (TextView) findViewById4;
        this.f39970f = textView;
        View findViewById5 = itemView.findViewById(R.id.tv_body_review);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        TextView textView2 = (TextView) findViewById5;
        this.f39971g = textView2;
        View findViewById6 = itemView.findViewById(R.id.tv_reviews_counter_review);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        TextView textView3 = (TextView) findViewById6;
        this.f39972h = textView3;
        View findViewById7 = itemView.findViewById(R.id.tv_likes_counter_review);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        TextView textView4 = (TextView) findViewById7;
        this.f39973i = textView4;
        View findViewById8 = itemView.findViewById(R.id.iv_likes_counter_review);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        this.f39974j = (ImageView) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.ll_reviews_counter_review);
        AbstractC3292y.h(findViewById9, "findViewById(...)");
        this.f39975k = (LinearLayout) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.ll_likes_review);
        AbstractC3292y.h(findViewById10, "findViewById(...)");
        this.f39976l = (LinearLayout) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.iv_star1_review);
        AbstractC3292y.h(findViewById11, "findViewById(...)");
        this.f39977m = (ImageView) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.iv_star2_review);
        AbstractC3292y.h(findViewById12, "findViewById(...)");
        this.f39978n = (ImageView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.iv_star3_review);
        AbstractC3292y.h(findViewById13, "findViewById(...)");
        this.f39979o = (ImageView) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.iv_star4_review);
        AbstractC3292y.h(findViewById14, "findViewById(...)");
        this.f39980p = (ImageView) findViewById14;
        View findViewById15 = itemView.findViewById(R.id.iv_star5_review);
        AbstractC3292y.h(findViewById15, "findViewById(...)");
        this.f39981q = (ImageView) findViewById15;
        View findViewById16 = itemView.findViewById(R.id.iv_turbo_mark_review);
        AbstractC3292y.h(findViewById16, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById16;
        this.f39982r = imageView;
        j.a aVar = J4.j.f4395g;
        usernameTextView.setTypeface(aVar.u());
        textView.setTypeface(aVar.v());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.v());
        textView4.setTypeface(aVar.v());
        imageView.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(final c5.M r8, final int r9) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C4041o0.h(c5.M, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C4041o0 c4041o0, int i8, View view) {
        c4041o0.f39966b.c(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C4041o0 c4041o0, int i8, View view) {
        c4041o0.f39966b.c(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(C4041o0 c4041o0, View view) {
        AbstractC3292y.i(view, "view");
        InterfaceC1972A interfaceC1972A = c4041o0.f39966b;
        Object tag = view.getTag();
        AbstractC3292y.g(tag, "null cannot be cast to non-null type kotlin.Int");
        interfaceC1972A.d(((Integer) tag).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(C4041o0 c4041o0, c5.M m8, View view) {
        AbstractC3292y.i(view, "view");
        s5.k.a(c4041o0.f39965a, c4041o0.f39974j);
        if (!C3770C.f37260a.h(m8.l())) {
            InterfaceC1972A interfaceC1972A = c4041o0.f39966b;
            Object tag = view.getTag();
            AbstractC3292y.g(tag, "null cannot be cast to non-null type kotlin.Int");
            interfaceC1972A.a(((Integer) tag).intValue());
            c4041o0.f39973i.setText(String.valueOf(m8.p() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(C4041o0 c4041o0, View view) {
        c4041o0.f39966b.b();
    }

    public final void f(c5.M item, int i8) {
        AbstractC3292y.i(item, "item");
        h(item, i8);
        this.f39977m.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on));
        this.f39978n.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_off));
        this.f39979o.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_off));
        this.f39980p.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_off));
        this.f39981q.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_off));
        if (item.s() >= 2) {
            this.f39978n.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on));
        }
        if (item.s() >= 3) {
            this.f39979o.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on));
        }
        if (item.s() >= 4) {
            this.f39980p.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on));
        }
        if (item.s() == 5) {
            this.f39981q.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on));
        }
    }

    public final void g(c5.M item, int i8) {
        AbstractC3292y.i(item, "item");
        h(item, i8);
        this.f39977m.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on_turbo));
        this.f39978n.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_off_turbo));
        this.f39979o.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_off_turbo));
        this.f39980p.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_off_turbo));
        this.f39981q.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_off_turbo));
        if (item.s() >= 2) {
            this.f39978n.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on_turbo));
        }
        if (item.s() >= 3) {
            this.f39979o.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on_turbo));
        }
        if (item.s() >= 4) {
            this.f39980p.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on_turbo));
        }
        if (item.s() == 5) {
            this.f39981q.setImageDrawable(ContextCompat.getDrawable(this.f39965a, R.drawable.vector_star_on_turbo));
        }
        this.f39982r.setVisibility(0);
        C3788m.f37279a.a(this.f39967c);
    }
}
