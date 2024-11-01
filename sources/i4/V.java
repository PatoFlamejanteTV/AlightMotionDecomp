package I4;

import I4.V;
import J4.j;
import Z4.C1606o1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import c5.C2043h;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import i2.AbstractC2967a;
import j2.C3149a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import s5.C3974h;
import t5.AbstractC4026h;
import u5.C4087g;

/* loaded from: classes5.dex */
public final class V extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private b5.s f3547a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1977a f3548b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3549c;

    /* renamed from: d, reason: collision with root package name */
    private String f3550d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f3551e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3552f;

    /* renamed from: g, reason: collision with root package name */
    private YouTubePlayerView f3553g;

    /* renamed from: h, reason: collision with root package name */
    private h2.e f3554h;

    /* renamed from: i, reason: collision with root package name */
    private String f3555i;

    /* renamed from: j, reason: collision with root package name */
    private int f3556j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3557k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3558l;

    /* renamed from: m, reason: collision with root package name */
    private C3974h f3559m;

    /* renamed from: n, reason: collision with root package name */
    private int f3560n;

    /* loaded from: classes5.dex */
    public final class a extends AbstractC4026h {

        /* renamed from: b, reason: collision with root package name */
        private b5.s f3561b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1977a f3562c;

        /* renamed from: d, reason: collision with root package name */
        private Context f3563d;

        /* renamed from: e, reason: collision with root package name */
        private String f3564e;

        /* renamed from: f, reason: collision with root package name */
        private final ImageView f3565f;

        /* renamed from: g, reason: collision with root package name */
        private final RelativeLayout f3566g;

        /* renamed from: h, reason: collision with root package name */
        private final ProgressBar f3567h;

        /* renamed from: i, reason: collision with root package name */
        private final ImageView f3568i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f3569j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3570k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f3571l;

        /* renamed from: m, reason: collision with root package name */
        private final TextView f3572m;

        /* renamed from: n, reason: collision with root package name */
        private final TextView f3573n;

        /* renamed from: o, reason: collision with root package name */
        private final LinearLayout f3574o;

        /* renamed from: p, reason: collision with root package name */
        private final CardView f3575p;

        /* renamed from: q, reason: collision with root package name */
        private final View f3576q;

        /* renamed from: r, reason: collision with root package name */
        private final int f3577r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ V f3578s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V v8, View itemView, b5.s listener, InterfaceC1977a actionsClickListener, Context context, String fragmentName) {
            super(itemView, context);
            AbstractC3292y.i(itemView, "itemView");
            AbstractC3292y.i(listener, "listener");
            AbstractC3292y.i(actionsClickListener, "actionsClickListener");
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(fragmentName, "fragmentName");
            this.f3578s = v8;
            this.f3561b = listener;
            this.f3562c = actionsClickListener;
            this.f3563d = context;
            this.f3564e = fragmentName;
            View findViewById = itemView.findViewById(R.id.iv_image_video_featured_item);
            AbstractC3292y.h(findViewById, "findViewById(...)");
            this.f3565f = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.rl_video_card_info);
            AbstractC3292y.h(findViewById2, "findViewById(...)");
            this.f3566g = (RelativeLayout) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.pb_progress_video_featured_item);
            AbstractC3292y.h(findViewById3, "findViewById(...)");
            this.f3567h = (ProgressBar) findViewById3;
            View findViewById4 = itemView.findViewById(R.id.iv_logo_video_featured_item);
            AbstractC3292y.h(findViewById4, "findViewById(...)");
            this.f3568i = (ImageView) findViewById4;
            View findViewById5 = itemView.findViewById(R.id.tv_name_video_featured_item);
            AbstractC3292y.h(findViewById5, "findViewById(...)");
            TextView textView = (TextView) findViewById5;
            this.f3569j = textView;
            View findViewById6 = itemView.findViewById(R.id.tv_desc_video_featured_item);
            AbstractC3292y.h(findViewById6, "findViewById(...)");
            TextView textView2 = (TextView) findViewById6;
            this.f3570k = textView2;
            View findViewById7 = itemView.findViewById(R.id.tv_status_video_featured_item);
            AbstractC3292y.h(findViewById7, "findViewById(...)");
            this.f3571l = (TextView) findViewById7;
            View findViewById8 = itemView.findViewById(R.id.tv_progress_video_featured_item);
            AbstractC3292y.h(findViewById8, "findViewById(...)");
            TextView textView3 = (TextView) findViewById8;
            this.f3572m = textView3;
            View findViewById9 = itemView.findViewById(R.id.tv_verified_video_featured_item);
            AbstractC3292y.h(findViewById9, "findViewById(...)");
            TextView textView4 = (TextView) findViewById9;
            this.f3573n = textView4;
            View findViewById10 = itemView.findViewById(R.id.ll_progress_video_featured_item);
            AbstractC3292y.h(findViewById10, "findViewById(...)");
            this.f3574o = (LinearLayout) findViewById10;
            View findViewById11 = itemView.findViewById(R.id.cv_youtube_player_view);
            AbstractC3292y.h(findViewById11, "findViewById(...)");
            this.f3575p = (CardView) findViewById11;
            View findViewById12 = itemView.findViewById(R.id.v_player_controller);
            AbstractC3292y.h(findViewById12, "findViewById(...)");
            this.f3576q = findViewById12;
            this.f3577r = UptodownApp.f29249C.H();
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            textView2.setTypeface(aVar.v());
            textView3.setTypeface(aVar.v());
            textView4.setTypeface(aVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a aVar, C2043h c2043h, int i8, View view) {
            aVar.f3562c.a(c2043h, i8);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(V v8, View view) {
            if (v8.q()) {
                h2.e eVar = v8.f3554h;
                if (eVar != null) {
                    eVar.pause();
                    return;
                }
                return;
            }
            h2.e eVar2 = v8.f3554h;
            if (eVar2 != null) {
                eVar2.play();
            }
        }

        private final void r(C2043h c2043h) {
            i(c2043h, this.f3569j, this.f3570k);
            c(this.f3566g, this.f3561b, c2043h);
            C4087g c4087g = new C4087g((int) this.f3563d.getResources().getDimension(R.dimen.border_radius_m), null, 2, null);
            String c02 = c2043h.c0();
            if (c02 != null && c02.length() != 0) {
                UptodownApp.a aVar = UptodownApp.f29249C;
                if (aVar.A() > 0) {
                    this.f3565f.setLayoutParams(new RelativeLayout.LayoutParams(-1, aVar.A()));
                    com.squareup.picasso.s.h().l(c2043h.a0()).m(aVar.B(), aVar.A()).n(c4087g).i(this.f3565f);
                } else {
                    this.f3565f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    com.squareup.picasso.s.h().l(c2043h.a0()).f().n(c4087g).i(this.f3565f);
                }
            } else {
                this.f3565f.setImageDrawable(ContextCompat.getDrawable(this.f3563d, R.drawable.shape_bg_placeholder));
            }
            h(this.f3568i, c2043h.k0());
        }

        public final void n(final C2043h app, final int i8) {
            AbstractC3292y.i(app, "app");
            this.f3575p.setVisibility(8);
            this.f3576q.setVisibility(8);
            this.f3565f.setVisibility(0);
            r(app);
            e(app, this.f3567h, this.f3568i, this.f3570k, this.f3572m, this.f3571l, this.f3574o);
            this.f3566g.setOnLongClickListener(new View.OnLongClickListener() { // from class: I4.U
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean o8;
                    o8 = V.a.o(V.a.this, app, i8, view);
                    return o8;
                }
            });
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(this.f3577r, -1), this.f3563d, i8, this.f3578s.f3560n));
            c(this.f3565f, this.f3561b, app);
        }

        public final void p(C2043h app, int i8) {
            ArrayList b12;
            AbstractC3292y.i(app, "app");
            if (this.f3578s.f3553g != null) {
                YouTubePlayerView youTubePlayerView = this.f3578s.f3553g;
                AbstractC3292y.f(youTubePlayerView);
                if (youTubePlayerView.getParent() != null) {
                    YouTubePlayerView youTubePlayerView2 = this.f3578s.f3553g;
                    AbstractC3292y.f(youTubePlayerView2);
                    ViewParent parent = youTubePlayerView2.getParent();
                    AbstractC3292y.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(this.f3578s.f3553g);
                }
                this.f3575p.addView(this.f3578s.f3553g);
                this.f3575p.setVisibility(0);
                this.f3576q.setVisibility(0);
                this.f3565f.setVisibility(8);
                r(app);
                View view = this.f3576q;
                final V v8 = this.f3578s;
                view.setOnClickListener(new View.OnClickListener() { // from class: I4.T
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        V.a.q(V.this, view2);
                    }
                });
                this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(this.f3577r, -1), this.f3563d, i8, this.f3578s.f3560n));
                if (this.f3578s.p() && this.f3578s.f3554h != null && (b12 = app.b1()) != null && !b12.isEmpty()) {
                    ArrayList b13 = app.b1();
                    AbstractC3292y.f(b13);
                    if (((c5.V) b13.get(0)).getId() != null) {
                        V v9 = this.f3578s;
                        StringBuilder sb = new StringBuilder();
                        String q02 = app.q0();
                        AbstractC3292y.f(q02);
                        sb.append(q02);
                        sb.append(this.f3564e);
                        v9.f3555i = sb.toString();
                        if (AbstractC3292y.d(this.f3564e, kotlin.jvm.internal.U.b(C1606o1.class).b())) {
                            UptodownApp.f29249C.o0(this.f3578s.f3554h);
                        } else {
                            UptodownApp.f29249C.p0(this.f3578s.f3554h);
                        }
                        UptodownApp.a aVar = UptodownApp.f29249C;
                        if (aVar.f(this.f3563d) && SettingsPreferences.f30529b.k(this.f3563d) > 0) {
                            if (aVar.J().containsKey(this.f3578s.f3555i)) {
                                h2.e eVar = this.f3578s.f3554h;
                                AbstractC3292y.f(eVar);
                                ArrayList b14 = app.b1();
                                AbstractC3292y.f(b14);
                                String id = ((c5.V) b14.get(0)).getId();
                                AbstractC3292y.f(id);
                                Object obj = aVar.J().get(this.f3578s.f3555i);
                                AbstractC3292y.f(obj);
                                eVar.d(id, ((Number) obj).floatValue());
                            } else {
                                h2.e eVar2 = this.f3578s.f3554h;
                                AbstractC3292y.f(eVar2);
                                ArrayList b15 = app.b1();
                                AbstractC3292y.f(b15);
                                String id2 = ((c5.V) b15.get(0)).getId();
                                AbstractC3292y.f(id2);
                                eVar2.d(id2, 0.0f);
                                aVar.J().put(this.f3578s.f3555i, Float.valueOf(0.0f));
                            }
                            if (this.f3578s.n()) {
                                h2.e eVar3 = this.f3578s.f3554h;
                                AbstractC3292y.f(eVar3);
                                eVar3.play();
                                return;
                            } else {
                                h2.e eVar4 = this.f3578s.f3554h;
                                AbstractC3292y.f(eVar4);
                                eVar4.pause();
                                return;
                            }
                        }
                        if (aVar.J().containsKey(this.f3578s.f3555i)) {
                            h2.e eVar5 = this.f3578s.f3554h;
                            AbstractC3292y.f(eVar5);
                            ArrayList b16 = app.b1();
                            AbstractC3292y.f(b16);
                            String id3 = ((c5.V) b16.get(0)).getId();
                            AbstractC3292y.f(id3);
                            Object obj2 = aVar.J().get(this.f3578s.f3555i);
                            AbstractC3292y.f(obj2);
                            eVar5.b(id3, ((Number) obj2).floatValue());
                        } else {
                            h2.e eVar6 = this.f3578s.f3554h;
                            AbstractC3292y.f(eVar6);
                            ArrayList b17 = app.b1();
                            AbstractC3292y.f(b17);
                            String id4 = ((c5.V) b17.get(0)).getId();
                            AbstractC3292y.f(id4);
                            eVar6.b(id4, 0.0f);
                            aVar.J().put(this.f3578s.f3555i, Float.valueOf(0.0f));
                        }
                        String c02 = app.c0();
                        if (c02 != null && c02.length() != 0) {
                            C3974h c3974h = this.f3578s.f3559m;
                            AbstractC3292y.f(c3974h);
                            c3974h.l().setVisibility(0);
                            return;
                        }
                        return;
                    }
                }
                ArrayList b18 = app.b1();
                if (b18 == null || b18.isEmpty()) {
                    n(app, i8);
                }
                if (this.f3578s.f3554h == null) {
                    this.f3578s.o();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC2967a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3580b;

        b(View view) {
            this.f3580b = view;
        }

        @Override // i2.AbstractC2967a, i2.InterfaceC2969c
        public void a(h2.e youTubePlayer) {
            AbstractC3292y.i(youTubePlayer, "youTubePlayer");
            super.a(youTubePlayer);
            UptodownApp.a aVar = UptodownApp.f29249C;
            if (aVar.A() == 0) {
                YouTubePlayerView youTubePlayerView = V.this.f3553g;
                AbstractC3292y.f(youTubePlayerView);
                if (youTubePlayerView.getHeight() != 0) {
                    YouTubePlayerView youTubePlayerView2 = V.this.f3553g;
                    AbstractC3292y.f(youTubePlayerView2);
                    aVar.E0(youTubePlayerView2.getHeight());
                    YouTubePlayerView youTubePlayerView3 = V.this.f3553g;
                    AbstractC3292y.f(youTubePlayerView3);
                    aVar.F0(youTubePlayerView3.getWidth());
                }
            }
            V v8 = V.this;
            v8.f3559m = new C3974h(this.f3580b, youTubePlayer, v8.f3549c);
            C3974h c3974h = V.this.f3559m;
            AbstractC3292y.f(c3974h);
            youTubePlayer.f(c3974h);
            youTubePlayer.e();
            V.this.f3554h = youTubePlayer;
            V.this.v(true);
            V.this.notifyItemChanged(0);
        }

        @Override // i2.AbstractC2967a, i2.InterfaceC2969c
        public void i(h2.e youTubePlayer, h2.d state) {
            AbstractC3292y.i(youTubePlayer, "youTubePlayer");
            AbstractC3292y.i(state, "state");
            super.i(youTubePlayer, state);
            h2.d dVar = h2.d.BUFFERING;
            if (state == dVar && V.this.n()) {
                youTubePlayer.play();
            }
            if (state == dVar && AbstractC3292y.d(V.this.f3550d, kotlin.jvm.internal.U.b(C1606o1.class).b())) {
                youTubePlayer.play();
            }
            if (state == h2.d.PAUSED) {
                V.this.x(false);
            }
            if (state == h2.d.PLAYING) {
                V.this.x(true);
            }
        }

        @Override // i2.AbstractC2967a, i2.InterfaceC2969c
        public void j(h2.e youTubePlayer, float f8) {
            AbstractC3292y.i(youTubePlayer, "youTubePlayer");
            super.j(youTubePlayer, f8);
            UptodownApp.f29249C.J().put(V.this.f3555i, Float.valueOf(f8));
        }
    }

    public V(b5.s listener, InterfaceC1977a actionsClickListener, Context context, String fragmentName) {
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(fragmentName, "fragmentName");
        this.f3547a = listener;
        this.f3548b = actionsClickListener;
        this.f3549c = context;
        this.f3550d = fragmentName;
        this.f3551e = new ArrayList();
        this.f3555i = "";
        this.f3558l = true;
        this.f3560n = 8;
        if (!SettingsPreferences.f30529b.K(this.f3549c)) {
            try {
                YouTubePlayerView youTubePlayerView = new YouTubePlayerView(this.f3549c);
                youTubePlayerView.setEnableAutomaticInitialization(false);
                this.f3553g = youTubePlayerView;
                o();
            } catch (Exception e8) {
                SettingsPreferences.f30529b.C0(this.f3549c, true);
                this.f3553g = null;
                e8.printStackTrace();
            } catch (UnsatisfiedLinkError e9) {
                SettingsPreferences.f30529b.C0(this.f3549c, true);
                this.f3553g = null;
                e9.printStackTrace();
            }
        }
        if (AbstractC3292y.d(this.f3550d, kotlin.jvm.internal.U.b(C1606o1.class).b())) {
            this.f3560n = 8;
        } else {
            this.f3560n = 20;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        YouTubePlayerView youTubePlayerView = this.f3553g;
        if (youTubePlayerView != null) {
            AbstractC3292y.f(youTubePlayerView);
            View d8 = youTubePlayerView.d(R.layout.home_youtube_player_layout);
            C3149a c8 = new C3149a.C0772a().e(0).h(0).g(3).d(1).c();
            YouTubePlayerView youTubePlayerView2 = this.f3553g;
            AbstractC3292y.f(youTubePlayerView2);
            youTubePlayerView2.e(new b(d8), c8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3551e.size();
    }

    public final ArrayList l() {
        return this.f3551e;
    }

    public final int m() {
        return this.f3556j;
    }

    public final boolean n() {
        return this.f3552f;
    }

    public final boolean p() {
        return this.f3557k;
    }

    public final boolean q() {
        return this.f3558l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i8) {
        AbstractC3292y.i(holder, "holder");
        int i9 = i8 + 1;
        if (!SettingsPreferences.f30529b.K(this.f3549c) && i8 == this.f3556j) {
            Object obj = this.f3551e.get(i8);
            AbstractC3292y.h(obj, "get(...)");
            holder.p((C2043h) obj, i9);
        } else {
            Object obj2 = this.f3551e.get(i8);
            AbstractC3292y.h(obj2, "get(...)");
            holder.n((C2043h) obj2, i9);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_video_featured_item, parent, false);
        AbstractC3292y.f(inflate);
        return new a(this, inflate, this.f3547a, this.f3548b, this.f3549c, this.f3550d);
    }

    public final void t(int i8) {
        this.f3556j = i8;
    }

    public final void u(ArrayList appList) {
        AbstractC3292y.i(appList, "appList");
        ArrayList arrayList = this.f3551e;
        arrayList.clear();
        arrayList.addAll(appList);
    }

    public final void v(boolean z8) {
        this.f3557k = z8;
    }

    public final void w(boolean z8) {
        this.f3552f = z8;
    }

    public final void x(boolean z8) {
        this.f3558l = z8;
    }
}
