package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class V0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final b5.F f39789a;

    /* renamed from: b, reason: collision with root package name */
    private final LinearLayout f39790b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f39791c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f39792d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f39793e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f39794f;

    /* renamed from: g, reason: collision with root package name */
    private final RelativeLayout f39795g;

    /* renamed from: h, reason: collision with root package name */
    private final ImageView f39796h;

    /* renamed from: i, reason: collision with root package name */
    private final int f39797i;

    /* renamed from: j, reason: collision with root package name */
    private long f39798j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(View itemView, b5.F listener) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        this.f39789a = listener;
        View findViewById = itemView.findViewById(R.id.ll_uptodown_protect);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39790b = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_uptodown_protect);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        this.f39791c = textView;
        View findViewById3 = itemView.findViewById(R.id.iv_shield);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39792d = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_title);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        TextView textView2 = (TextView) findViewById4;
        this.f39793e = textView2;
        View findViewById5 = itemView.findViewById(R.id.tv_msg);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        TextView textView3 = (TextView) findViewById5;
        this.f39794f = textView3;
        View findViewById6 = itemView.findViewById(R.id.rl_reload);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        this.f39795g = (RelativeLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.iv_reload);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        this.f39796h = (ImageView) findViewById7;
        this.f39797i = 600;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(V0 v02, Context context, View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - v02.f39798j > v02.f39797i) {
            v02.f39798j = currentTimeMillis;
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.rotate);
            loadAnimation.setRepeatCount(-1);
            v02.f39796h.startAnimation(loadAnimation);
            v02.f39789a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(V0 v02, View view) {
        v02.f39789a.a();
    }

    public final void d(ArrayList arrayList, final Context context) {
        AbstractC3292y.i(context, "context");
        this.f39790b.setVisibility(0);
        this.f39795g.setOnClickListener(new View.OnClickListener() { // from class: t5.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.e(V0.this, context, view);
            }
        });
        if (arrayList != null && arrayList.size() > 0) {
            this.f39792d.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_shield_protect_bad));
            this.f39793e.setText(R.string.positives_title_security_badge);
            this.f39794f.setText(R.string.positives_msg_security_badge);
            this.f39795g.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_cancel_button));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: t5.T0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V0.f(V0.this, view);
                }
            });
        } else {
            this.f39792d.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_shield_protect_ok));
            this.f39793e.setText(R.string.no_positives_title_security_badge);
            this.f39794f.setText(R.string.no_positives_msg_security_badge);
            this.f39795g.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_blue_primary_button));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: t5.U0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V0.g(view);
                }
            });
        }
        if (this.f39796h.getAnimation() != null && this.f39796h.getAnimation().getRepeatCount() != 0) {
            this.f39796h.getAnimation().setRepeatCount(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View view) {
    }
}
