package p5;

import J4.j;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import androidx.recyclerview.widget.ItemTouchHelper;
import c5.C2043h;
import c5.N;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.activities.Gallery;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import o5.C3541b;

/* renamed from: p5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3585c extends Presenter.ViewHolder {

    /* renamed from: j, reason: collision with root package name */
    public static final a f36326j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final TextView f36327a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f36328b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f36329c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f36330d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f36331e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f36332f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f36333g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f36334h;

    /* renamed from: i, reason: collision with root package name */
    private final RelativeLayout f36335i;

    /* renamed from: p5.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3585c(View view) {
        super(view);
        AbstractC3292y.i(view, "view");
        View findViewById = view.findViewById(R.id.tv_name);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f36327a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_short_desc);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f36328b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_overview);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f36329c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tv_percent);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f36330d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tv_version);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f36331e = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.tv_autor);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        this.f36332f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.pb_download);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        this.f36333g = (ProgressBar) findViewById7;
        this.f36334h = (LinearLayout) view.findViewById(R.id.ll_screenshots);
        View findViewById8 = view.findViewById(R.id.rl_contaier_valoration_tv_app_detail);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        this.f36335i = (RelativeLayout) findViewById8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C2043h c2043h, View view) {
        Object tag = view.getTag();
        AbstractC3292y.g(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        Intent intent = new Intent(view.getContext(), (Class<?>) Gallery.class);
        intent.putParcelableArrayListExtra("imagenes", c2043h.L0());
        intent.putExtra("indice", intValue);
        view.getContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(int i8, View view, boolean z8) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i8);
        if (z8) {
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.main_light_grey));
            layoutParams.setMargins(12, 0, 12, 12);
        } else {
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.white));
            layoutParams.setMargins(12, 12, 12, 12);
        }
        view.setLayoutParams(layoutParams);
    }

    private final void g(Context context, C2043h c2043h) {
        if (c2043h.B0() == 0) {
            this.f36335i.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f36335i.findViewById(R.id.tv_valoration_value_tv_app_detail);
        j.a aVar = j.f4395g;
        textView.setTypeface(aVar.v());
        textView.setText(String.valueOf(c2043h.B0() / 10.0d));
        TextView textView2 = (TextView) this.f36335i.findViewById(R.id.tv_num_ratings);
        textView2.setTypeface(aVar.v());
        textView2.setText(String.valueOf(c2043h.C0()));
        View findViewById = this.f36335i.findViewById(R.id.iv_star1);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = this.f36335i.findViewById(R.id.iv_star2);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        ImageView imageView2 = (ImageView) findViewById2;
        View findViewById3 = this.f36335i.findViewById(R.id.iv_star3);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        ImageView imageView3 = (ImageView) findViewById3;
        View findViewById4 = this.f36335i.findViewById(R.id.iv_star4);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        ImageView imageView4 = (ImageView) findViewById4;
        View findViewById5 = this.f36335i.findViewById(R.id.iv_star5);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        ImageView imageView5 = (ImageView) findViewById5;
        imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        if (c2043h.B0() > 5) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c2043h.B0() > 15) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c2043h.B0() > 25) {
            imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c2043h.B0() > 35) {
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c2043h.B0() > 45) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
    }

    public final void c(Context context, C2043h appInfo, int i8) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(appInfo, "appInfo");
        this.f36327a.setText(appInfo.q0());
        this.f36328b.setText(appInfo.N0());
        this.f36329c.setText(appInfo.u());
        h(i8);
        this.f36331e.setText(appInfo.Z0());
        this.f36332f.setText(appInfo.l());
        g(context, appInfo);
    }

    public final void d(Context context, final C2043h c2043h) {
        ArrayList arrayList;
        LinearLayout linearLayout;
        AbstractC3292y.i(context, "context");
        if (c2043h != null) {
            arrayList = c2043h.L0();
        } else {
            arrayList = null;
        }
        if (arrayList != null && (linearLayout = this.f36334h) != null) {
            if (linearLayout.getChildCount() > 0) {
                this.f36334h.removeAllViews();
            }
            final int i8 = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            layoutParams.setMargins(12, 12, 12, 12);
            ArrayList L02 = c2043h.L0();
            AbstractC3292y.f(L02);
            int size = L02.size();
            for (int i9 = 0; i9 < size; i9++) {
                C3541b c3541b = new C3541b(context);
                s h8 = s.h();
                ArrayList L03 = c2043h.L0();
                AbstractC3292y.f(L03);
                h8.l(((N) L03.get(i9)).h()).i(c3541b);
                c3541b.setPadding(4, 4, 4, 4);
                c3541b.setLayoutParams(layoutParams);
                c3541b.setFocusable(true);
                c3541b.setTag(Integer.valueOf(i9));
                c3541b.setOnClickListener(new View.OnClickListener() { // from class: p5.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3585c.e(C2043h.this, view);
                    }
                });
                c3541b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: p5.b
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z8) {
                        C3585c.f(i8, view, z8);
                    }
                });
                this.f36334h.addView(c3541b);
            }
        }
    }

    public final void h(int i8) {
        if (i8 > 0) {
            this.f36333g.setVisibility(0);
            this.f36333g.setProgress(i8);
            this.f36330d.setVisibility(0);
            TextView textView = this.f36330d;
            Y y8 = Y.f34578a;
            String format = String.format("%s%%", Arrays.copyOf(new Object[]{String.valueOf(i8)}, 1));
            AbstractC3292y.h(format, "format(...)");
            textView.setText(format);
            return;
        }
        this.f36333g.setVisibility(8);
        this.f36330d.setVisibility(8);
    }

    public final void i(boolean z8) {
        this.f36333g.setIndeterminate(z8);
    }
}
