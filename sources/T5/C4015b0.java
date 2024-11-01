package t5;

import J4.j;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import c5.C2033C;
import c5.C2041f;
import c5.C2043h;
import com.uptodown.R;
import com.uptodown.workers.DownloadApkWorker;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3791p;

/* renamed from: t5.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4015b0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final b5.w f39828a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f39829b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f39830c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f39831d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f39832e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f39833f;

    /* renamed from: g, reason: collision with root package name */
    private ProgressBar f39834g;

    /* renamed from: h, reason: collision with root package name */
    private RelativeLayout f39835h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f39836i;

    /* renamed from: j, reason: collision with root package name */
    private final float f39837j;

    /* renamed from: k, reason: collision with root package name */
    private final float f39838k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4015b0(View itemView, b5.w wVar) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        this.f39828a = wVar;
        View findViewById = itemView.findViewById(R.id.tv_version_old_version_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39829b = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_date_old_version_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39830c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_type_old_version_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39831d = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_min_sdk_old_version_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f39832e = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.iv_download_old_version_item);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f39833f = (ImageView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.pb_progress_old_version);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        this.f39834g = (ProgressBar) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.rl_download_old_version_item);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        this.f39835h = (RelativeLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.iv_virustotal_report);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        this.f39836i = (ImageView) findViewById8;
        this.f39837j = 1.0f;
        this.f39838k = 0.4f;
        this.f39835h.setOnClickListener(new View.OnClickListener() { // from class: t5.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4015b0.e(C4015b0.this, view);
            }
        });
        this.f39836i.setOnClickListener(new View.OnClickListener() { // from class: t5.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4015b0.f(C4015b0.this, view);
            }
        });
        TextView textView = this.f39829b;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        this.f39830c.setTypeface(aVar.v());
        this.f39831d.setTypeface(aVar.u());
        this.f39832e.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4015b0 c4015b0, View view) {
        int bindingAdapterPosition;
        if (c4015b0.f39828a != null && (bindingAdapterPosition = c4015b0.getBindingAdapterPosition()) != -1) {
            c4015b0.f39828a.d(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C4015b0 c4015b0, View view) {
        int bindingAdapterPosition;
        if (c4015b0.f39828a != null && (bindingAdapterPosition = c4015b0.getBindingAdapterPosition()) != -1) {
            c4015b0.f39828a.c(bindingAdapterPosition);
        }
    }

    private final void i() {
        this.f39833f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.core_vector_cross));
        this.f39835h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
        this.f39833f.setContentDescription(this.itemView.getContext().getString(R.string.option_button_cancel));
    }

    private final void j() {
        if (this.f39834g.getVisibility() == 0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39838k, this.f39837j);
            ofFloat.setStartDelay(200L);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t5.a0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C4015b0.k(C4015b0.this, valueAnimator);
                }
            });
            AbstractC3292y.f(ofFloat);
            ofFloat.addListener(new a());
            ofFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(C4015b0 c4015b0, ValueAnimator valueAnimator) {
        AbstractC3292y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3292y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        c4015b0.f39831d.setScaleX(floatValue);
        c4015b0.f39831d.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        c4015b0.f39831d.setPadding(i8, i8, i8, i8);
    }

    private final void l() {
        if (this.f39834g.getVisibility() == 8) {
            this.f39834g.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39837j, this.f39838k);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t5.Z
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C4015b0.m(C4015b0.this, valueAnimator);
                }
            });
            ofFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(C4015b0 c4015b0, ValueAnimator valueAnimator) {
        AbstractC3292y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3292y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        c4015b0.f39831d.setScaleX(floatValue);
        c4015b0.f39831d.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        c4015b0.f39831d.setPadding(i8, i8, i8, i8);
    }

    private final void n() {
        this.f39833f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_install));
        this.f39835h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_install_button));
        this.f39833f.setContentDescription(this.itemView.getContext().getString(R.string.action_update));
    }

    public final void h(C2043h appInfo, C2041f c2041f, int i8) {
        boolean z8;
        boolean z9;
        String str;
        AbstractC3292y.i(appInfo, "appInfo");
        C3791p.a aVar = C3791p.f37286s;
        Context context = this.itemView.getContext();
        AbstractC3292y.h(context, "getContext(...)");
        C3791p a9 = aVar.a(context);
        a9.a();
        ArrayList t02 = appInfo.t0();
        AbstractC3292y.f(t02);
        String a10 = ((C2033C) t02.get(i8)).a();
        AbstractC3292y.f(a10);
        c5.r Z8 = a9.Z(a10);
        if (Z8 != null && DownloadApkWorker.f31190k.d(Z8.h(), Z8.e0())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z8 != null && Z8.h0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z8 && !z9) {
            this.f39834g.setVisibility(8);
            this.f39831d.setScaleX(this.f39837j);
            this.f39831d.setScaleY(this.f39837j);
            this.f39831d.setPadding(10, 10, 10, 10);
        }
        ArrayList t03 = appInfo.t0();
        AbstractC3292y.f(t03);
        String b9 = ((C2033C) t03.get(i8)).b();
        TextView textView = this.f39831d;
        ArrayList t04 = appInfo.t0();
        AbstractC3292y.f(t04);
        textView.setText(((C2033C) t04.get(i8)).b());
        c5.Q q8 = null;
        if (l6.n.t(b9, "xapk", false, 2, null)) {
            this.f39831d.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_old_version_xapk_type));
        } else {
            this.f39831d.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_old_version_apk_type));
        }
        TextView textView2 = this.f39829b;
        ArrayList t05 = appInfo.t0();
        AbstractC3292y.f(t05);
        textView2.setText(((C2033C) t05.get(i8)).p());
        ArrayList t06 = appInfo.t0();
        AbstractC3292y.f(t06);
        if (((C2033C) t06.get(i8)).i() >= 650000000) {
            this.f39836i.setVisibility(4);
        } else {
            this.f39836i.setVisibility(0);
        }
        if (c2041f != null) {
            long f02 = c2041f.f0();
            ArrayList t07 = appInfo.t0();
            AbstractC3292y.f(t07);
            if (f02 == ((C2033C) t07.get(i8)).l()) {
                this.f39835h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_install_button));
                this.f39833f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_install));
                this.f39833f.setContentDescription(this.itemView.getContext().getString(R.string.option_button_install));
                this.f39832e.setVisibility(0);
                TextView textView3 = this.f39832e;
                ArrayList t08 = appInfo.t0();
                AbstractC3292y.f(t08);
                textView3.setText(((C2033C) t08.get(i8)).h());
                this.f39830c.setVisibility(0);
                TextView textView4 = this.f39830c;
                ArrayList t09 = appInfo.t0();
                AbstractC3292y.f(t09);
                textView4.setText(((C2033C) t09.get(i8)).f());
                j();
                a9.i();
            }
        }
        if (z8) {
            i();
            l();
            AbstractC3292y.f(Z8);
            if (Z8.Z() > 0) {
                this.f39834g.setIndeterminate(false);
                this.f39834g.setProgress(Z8.Z());
            } else {
                this.f39834g.setIndeterminate(true);
            }
            this.f39830c.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(Z8.Z()), new S4.g().c(Z8.a0())));
            this.f39832e.setText(this.itemView.getContext().getString(R.string.verified_by_uptodown));
            this.f39832e.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_myappsupdates_dialog_vt_report), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f39832e.setCompoundDrawablePadding((int) this.itemView.getContext().getResources().getDimension(R.dimen.margin_s));
        } else if (Z8 != null && Z8.Z() == 0) {
            l();
            i();
            this.f39834g.setIndeterminate(true);
            TextView textView5 = this.f39830c;
            ArrayList t010 = appInfo.t0();
            AbstractC3292y.f(t010);
            textView5.setText(((C2033C) t010.get(i8)).f());
            TextView textView6 = this.f39832e;
            ArrayList t011 = appInfo.t0();
            AbstractC3292y.f(t011);
            textView6.setText(((C2033C) t011.get(i8)).h());
            this.f39832e.setCompoundDrawables(null, null, null, null);
            this.f39832e.setCompoundDrawablePadding(0);
        } else {
            TextView textView7 = this.f39830c;
            ArrayList t012 = appInfo.t0();
            AbstractC3292y.f(t012);
            textView7.setText(((C2033C) t012.get(i8)).f());
            TextView textView8 = this.f39832e;
            ArrayList t013 = appInfo.t0();
            AbstractC3292y.f(t013);
            textView8.setText(((C2033C) t013.get(i8)).h());
            this.f39832e.setCompoundDrawables(null, null, null, null);
            this.f39832e.setCompoundDrawablePadding(0);
            j();
            P4.a h8 = J4.j.f4395g.h();
            if (h8 != null) {
                str = h8.b();
            } else {
                str = null;
            }
            if (l6.n.s(str, appInfo.v0(), true) && h8 != null) {
                long e8 = h8.e();
                ArrayList t014 = appInfo.t0();
                AbstractC3292y.f(t014);
                if (e8 == ((C2033C) t014.get(i8)).l()) {
                    l();
                    this.f39834g.setIndeterminate(true);
                    this.f39835h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_download_button_desactivated));
                    this.f39833f.setVisibility(4);
                    this.f39835h.setClickable(false);
                }
            }
            this.f39834g.setIndeterminate(false);
            this.f39834g.setVisibility(8);
            this.f39830c.setVisibility(0);
            this.f39832e.setVisibility(0);
            if (Z8 != null && Z8.Z() == 100) {
                if (c2041f == null) {
                    this.f39833f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_install));
                    this.f39835h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_install_button));
                    this.f39833f.setContentDescription(this.itemView.getContext().getString(R.string.option_button_install));
                } else {
                    n();
                }
            } else {
                if (appInfo.v0() != null) {
                    String v02 = appInfo.v0();
                    AbstractC3292y.f(v02);
                    q8 = a9.s0(v02);
                }
                if (q8 != null && q8.u() == 100) {
                    String x8 = q8.x();
                    ArrayList t015 = appInfo.t0();
                    AbstractC3292y.f(t015);
                    if (AbstractC3292y.d(x8, ((C2033C) t015.get(i8)).p())) {
                        n();
                    }
                }
                this.f39833f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_download));
                this.f39835h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_download_icon_button));
                this.f39833f.setContentDescription(this.itemView.getContext().getString(R.string.updates_button_download_app));
            }
        }
        a9.i();
    }

    /* renamed from: t5.b0$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4015b0.this.f39834g.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
